package ntt.bai;

public class Taozi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int last = 1;
		while (true) {
			sum = last * 5 + 1;
			int flg = 1;
			for (int i = 0; i < 4; i++) {
				if (sum % 4 == 0) {
					sum = sum / 4 * 5 + 1;
					++flg;
				} else {
					break;
				}
			}
			if (flg == 5){
				break;
			}
			++last;
		}
		System.out.println("���һֻ���ӵõ����ӣ�" + last);
		System.out.println("ԭ�������ӣ� " + sum);
		
	}

}
