package UseCase2;

public class AIOBException {
public static void main(String[] args) {
	try {
		int[] aioobe = {1,2,3,4,5,6};
		System.out.println(aioobe[6]);
		
	}
	catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println("Array Index Out of Bounds Exception" + ae.getMessage());
	}
}
}
