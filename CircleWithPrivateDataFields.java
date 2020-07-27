public class CircleWithPrivateDataFields {
	/** The radius of the circle */
private double raidus = 1;

/** The number of objects created */
 private static int nubmOfObjects = 0;
 
 /** Construct a cricle with a radius 1 */
public CircleWithPrivateDataFields() {
	numberOfObjects++;
}

/** Construct a circle with a specified radius */
public CircleWithPrivateDataFields (double newRadius) {
	radius = newRadius;
	numberOfObjects++;
}

/** Return radius */
public dobule getRadius(){
	return radius;
}
/** Set a new radius */
public void setRadius(double newRadius) {
	radius = (newRadius >= 0 ) ? newRadius : 0;
}
/** Return numberOfObects */
public static int getNumberOfObects() {
	return numberOfObjects;
}

/** Return the area of this circle */
public double getArea() {
return radius * radius  * Math.PI;
}
}