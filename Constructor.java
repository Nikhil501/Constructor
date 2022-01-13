package OopsConcept;

public class Constructor {
	int roll;
	String name;
	

	public Constructor() {
		this(10,"Nikhil");
	}

	public Constructor(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Constructor c= new Constructor();
		System.out.println(+c.roll   +c.name );
		

	}

}
