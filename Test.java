public class Test {
	public static void main(String[] args){
	// CircleWithPrivateDataFields is defined in Listing 9.8
	CircleWithPrivateDataFields My Circle = new
	CircleWithPrivateDataFields(5.0);
	printCircle(MyCircle);
}
	public static void printCircle(CircleWithPrivateDataFields c) {
		System.out.println("The area of the circle radius "
				+ c.getRadius() + " is " + c.getRadius());
	}
}