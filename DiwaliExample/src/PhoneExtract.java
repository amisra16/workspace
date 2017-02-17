public class PhoneExtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phn1 = "+1 4137771983";
		String phn2 = "4137771983";
		System.out.println(changePhone(phn1));
		System.out.println(changePhone(phn2));

	}

	private static String changePhone(String phone) {
		String changedPhone = phone.replace("+1 ", "");
		return changedPhone;
	}

}
