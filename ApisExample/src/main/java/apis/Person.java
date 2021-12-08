package apis;

public class Person {
	private String name;
	private String gender;

	public Person(String name, int height, int mass, String gender) {
		this.name = name;

		this.gender = gender;
	}

	public String getName() {
		return name;
	}



	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}

}
