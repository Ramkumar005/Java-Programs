package week1_Day1.ClassRoom;

public class BicycleIsPuncture{ 

	public String getCycleColour() {
		
		return "RED";
	}
	public void isPunctured(boolean condition) {
		if (condition) {
			System.out.println("The wheel is punctured");
		}else {
			System.out.println("The wheel is not punctured");
		}
	}
	public static void main(String[] args) {
		
		BicycleIsPuncture cycle = new BicycleIsPuncture();
		
		cycle.isPunctured(false);
		String colour = cycle.getCycleColour();
		
		System.out.println(colour);

	}

}
