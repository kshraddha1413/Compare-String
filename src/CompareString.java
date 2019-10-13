
public class CompareString {

	public static void main(String[] args) {
		String str1="jhon";
		String str2="jhon";
		String str3=new String("jhon");
		String str4=new String("jhon");
		String str5="tom";
		
		System.out.println("Comparing Strings with equals method: "
				+ "equals method always compares value and return boolean");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str5));
		
		System.out.println("Comparing Strings with ==:"
				+ "== always compares object refrence");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1==str5);
		
		System.out.println("Comparing Strings with compareto method: "
				+ "compareto method always compares value and "
				+ "return 0 if value is same "
				+ "return +ve value if str1>str2"
				+ "returns-ve value if str1<str2");
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareTo(str5));
		
	}

}
