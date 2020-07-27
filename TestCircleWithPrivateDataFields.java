public class TestCircleWithPrivateDataFields {
//** Main method */
	public static void main(String[] args) {
//Create a circle with a radius 5.0
		 CircleWithPrivateDataFields myCircle =
				 new  CircleWithPrivateDataFields(5.0);
		 System.out.println("The area of the circle of a radius " 
				 + myCircle.getRadius() + " is " + myCircle.getArea());

		 // Increase myCircle's radius by 10%
		 myCircle.setRadius(myCircle.getRadius() * 1.1);
		 System.out.println("The area of the circle of radius "
				 + myCircle.get.Radius() +" is " + myCircle.getArea());
		 
		 System.out.println("The number of obejcts created is "
				+ CircleWithPrivateDataFields.getNumberOfObjects*());
	}
}