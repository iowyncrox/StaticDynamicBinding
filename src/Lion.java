class Animal {

	public String name = "Animal";

	public void getName() {
		System.out.println("Print Animal");
	}
}

public class Lion extends Animal {

	public String name = "Lion";

	@Override
	public void getName() {
		System.out.println("Print Lion");
	}

	public static void main(String[] args) {

		Animal A = new Animal();
		Animal L = new Lion();

		System.out.println(A.name);
		System.out.println(L.name);

		A.getName();
		L.getName();

	}
}