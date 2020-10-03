package geo;
public class Geometrics {
	
// 	If the variables below are not meant to be changed they could be declared FINAL ...?
	
    private static double x = 10.0;
    private static double y = 5.0;
    private static double z = 3.0;
    private static int x1 = 8;
    private static int y1 = 7;
//    private static int z1 = 10;	never used
    private static int x2 = 100;
    private static int y2 = 57;
//    private static int z2 = 129;	never used
    private static int x3 = 45;
    private static int y3 = 89;
//    private static int z3 = 69;	never used

    public static void main(String[] args) {
        // area ... Fläche
        System.out.println("Square area");
        System.out.println("x * x = " + square(x));
        System.out.println("x1 * x1 = " + square(x1));
        System.out.println("x2 * x2 = " + square(x2));
        System.out.println("y * y = " + square(y));
        System.out.println();	// Output formatted with some blank lines
        
        // perimeter ... Umfang
        System.out.println("Square perimeter");
        System.out.println("4 * x = " + multiply(4, x));
        System.out.println("4 * x1 = " + multiply(4, x1));
        System.out.println("4 * x2 = " + multiply(4, x2));
        System.out.println("4 * y = " + multiply(4, y));
        System.out.println();	// Output formatted with some blank lines

        System.out.println("Rectangle area");
        System.out.println("x * y = " + multiply(x, y));
        System.out.println("x1 * y1 = " + multiply(x1, y1));
        System.out.println("x2 * y2 = " + multiply(x2, y2));
        System.out.println("x3 * y3 = " + multiply(x3, y3));
        System.out.println();	// Output formatted with some blank lines

        System.out.println("Rectangle perimeter");
        System.out.println("x + y = " + add(x, y));
        System.out.println("x1 + y1 = " + add(x1, y1));
        System.out.println("x2 + y2 = " + add(x2, y2));
        System.out.println("x3 + y3 = " + add(x3, y3));
        System.out.println();	// Output formatted with some blank lines

        System.out.println("We can also calculate some volumes");
        /*
            z is our height
            y is our radius
         */
        System.out.println("Zone of a sphere: ");
        System.out.println(calculateSphere(y));
        System.out.println();	// Output formatted with some blank lines

        System.out.println("Sphere with cylinder: ");
        System.out.println(calculateSphereWithCylinder(z));
        System.out.println();	// Output formatted with some blank lines

        System.out.println("Ungula: ");
        System.out.println(calculateUngula(y, z));
        System.out.println();	// Output formatted with some blank lines
    }
    
    
    
    public static int add(int x, int y) {
    	return x + y;
    }
    
    public static double add(double x, double y) {
    	return x + y;
    }
    
    public static int multiply(int x, int y) {
    	return x * y;
    }
    
    public static double multiply(double x, double y) {
    	return x * y;
    }
    
    public static int square(int x) {
    	return x * x;
    }
   
    public static double square(double x) {
    	return x * x;
    }
    
    
    public static double calculateSphere(double radius) {
    	// return (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;  ==> wrong calculation formula
    	return (Math.PI * Math.pow((radius*2), 3)) / 6;
    }
    
    public static double calculateSphereWithCylinder(double height) {
    	return (Math.PI * Math.pow(height, 3) / 6);
    }
    
    public static double calculateUngula(double radius, double height) {
    	return (2 * Math.pow(radius, 2) * height) / 3;
    }
    
    
   
}
