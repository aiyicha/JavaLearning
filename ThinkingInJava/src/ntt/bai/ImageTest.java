package ntt.bai;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.imageio.ImageIO;

public class ImageTest {

	public static void getImagePixel(String image) throws Exception{
		int[] rgb = new int[3];
		File file = new File(image);
		BufferedImage bi = null;
		try{
			bi = ImageIO.read(file);
		}catch(Exception e){
			e.printStackTrace();
		}
		int width = bi.getWidth();
		int height = bi.getHeight();
		int minx = bi.getMinX();
		int miny = bi.getMinY();
		System.out.println("width="+width+", height="+height+".");
		System.out.println("minx="+minx+", miny="+miny+".");
		
		File outputFile = new File("C:\\Users\\Õñ»ª\\Desktop\\testRGB.txt");
		//outputFile.mkdirs();
		if (outputFile.exists()){
			outputFile.delete();
		}
		outputFile.createNewFile();
		//String line = System.getProperty("line.seperator");
		FileWriter fo = new FileWriter(outputFile);
		BufferedWriter bw = new BufferedWriter(fo);
		PrintWriter pw = new PrintWriter(bw);
		//bw.write("("+height+","+width+")");
		pw.println("("+width+","+height+")");
		//bw.println("("+height+","+width+")\n");
		
		for(int i = minx; i < width; i++){
			for(int j = miny; j < height; j++){
				int pixel = bi.getRGB(i, j);
				rgb[0] = (pixel&0xff0000)>>16;
				rgb[1] = (pixel&0xff00)>>8;
				rgb[2] = (pixel&0xff);
				StringBuilder sb = new StringBuilder();
				sb.append("(").append(rgb[0]).append(",").append(rgb[1]).
					append(",").append(rgb[2]).append(")");
				System.out.println(sb.toString());

				//bw.write(sb.toString());
				pw.println(sb);
				
			}
		}
		bw.close();
	}
	
	public static int getScreenPixel(int x, int y) throws AWTException{
		
		Robot rb = null;
		rb = new Robot();
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension di = tk.getScreenSize();
		System.out.println(di.width);
		System.out.println(di.height);
		Rectangle rec = new Rectangle(0,0,di.width,di.height);
		BufferedImage bi = rb.createScreenCapture(rec);
		int pixelColor = bi.getRGB(x, y);
		return 16777216+pixelColor;
	}
	
	public static void main(String[] args) throws Exception {
		
		int x = 0;
		x = getScreenPixel(100,345);
		System.out.println(x+"-");
		getImagePixel("E:\\pic\\_Z201603081700565421.jpg");
	}

}
