package Exception;

public class Name {
	public static void main(String[] args) {
		String name=null;
	try {
		System.out.println(name.length());
	} catch(Exception e) {
		System.out.println(e);
		e.printStackTrace();
	}
	}
}
