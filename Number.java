package Exception;

public class Number {
	public static void main(String[] args) {
		String val="ram";
		int val1=Integer.parseInt(val);
		try {
			System.out.println(val1);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
