package UseCase2;

public class Implemented extends Blueprint{

	@Override
	void Car() {
		System.out.println("This is a Car");
		
	}
	public static void main(String[] args) {
		Blueprint i = new Implemented();
		i.Car();
	}
}
