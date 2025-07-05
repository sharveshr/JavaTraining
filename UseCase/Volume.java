package UseCase;
import java.util.Scanner;
public class Volume {
public float vol(float a) {
	float res = a*a*a*(4/3)*3.14f;
	return res;
}
public float vol(float a,float b, float c) {
	float res = a*b*c;
	return res;
}
public float vol(int a) {
	int res = a*a*a;
	return res;
}
public static void main(String[] args) {
	//(1) Write a java program to find the volume of cube, cuboid and sphere.
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1 for sphere 2 for cuboid and 3 for sphere");
	int cases = sc.nextInt();
	Volume v = new Volume();
	switch(cases) {
	case 2:
		System.out.println("Enter three float values: ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		System.out.println(v.vol(a,b,c));
		break;
	case 1:
		System.out.println("Enter one float value");
		float ac = sc.nextFloat();
		System.out.println(v.vol(ac));
		break;
	case 3:
		System.out.println("Enter an integer value");
		int ab = sc.nextInt();
		System.out.println(v.vol(ab));
		break;
	default:
		System.out.println("Error!");
		break;
	
	}sc.close();}
		

}
