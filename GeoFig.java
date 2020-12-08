class GeoFig {
	public static void main(String args[]){
		
		//Square
		int a = 25;
		int square_perimeter = a*4;
		int square_area = a*a;
		char c = 99;
		char m = 109;
		char two = 50;
		
		System.out.println("--------------------");
		System.out.println("Square");
		System.out.println();
		System.out.println("Side length: "+a+c+m);
		System.out.println("Perimeter: "+square_perimeter+c+m);
		System.out.println("Area: "+square_area+c+m+two);
		System.out.println("--------------------\n");
		
		//Rectangle
		int d = 25;
		int e = 50;
		int rectangle_circumference = d*2+e*2;
		int rectangle_area = d*e;
		
		System.out.println("--------------------");
		System.out.println("Rectangle");
		System.out.println();
		System.out.println("Short side length: "+d+c+m);
		System.out.println("Long side length: "+e+c+m);
		System.out.println("Circumference: "+rectangle_circumference+c+m);
		System.out.println("Area: "+rectangle_area+c+m+two);
		System.out.println("--------------------\n");
		
		//Circle
		int r = 25;
		double pi = 3.14;
		double circle_circumference = 2*pi*r;
		double circle_area = pi*r*r;
		
		System.out.println("--------------------");
		System.out.println("Circle");
		System.out.println();
		System.out.println("Radius: "+r+c+m);
		System.out.println("Circumference: "+circle_circumference+c+m);
		System.out.println("Area: "+circle_area+c+m+two);
		System.out.println("--------------------\n");
	}
}