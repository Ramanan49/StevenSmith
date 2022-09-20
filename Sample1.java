package Exception;

public class Sample1 {
	public static void main(String[] args) {
		String val2="smith";
		try {
			System.out.println(val2.charAt(5));
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
