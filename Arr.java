package Exception;

public class Arr {
	public static void main(String[] args) {
		int num=5;
		int num1=0;
		try {
			int num2=num/num1;
			System.out.println(num2);
		} catch(Exception e) {
			System.out.println(e+"we can't divide 0 by any num");
			e.printStackTrace();
		}
	}

}
