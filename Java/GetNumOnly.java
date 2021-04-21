package week1_Day2.ClassRoom;

public class GetNumOnly {

	public static void main(String[] args) {
	
		String employee = "Tesla plans to make 100000 cars in a month";
		
		String Number = employee.replaceAll("[^0-9]", "");
		System.out.println(Number);
	}
}
