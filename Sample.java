package Exception;

public class Sample {
	public static void main(String[] args) {
		int[] nums= {2,3,4};
		try {
			System.out.println(nums[5]);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
