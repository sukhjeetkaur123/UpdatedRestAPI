package comJson_parsing_getSet;



public class Person {
	private String email;
	private String firstName;
	private String lastName;
	private Address address;
	private String state;
	private ABC abc;


	public ABC getAbc(){
		return abc;
	}

	public void setAbc(ABC abc){ this.abc = abc;}
	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAdress()
	{
		return address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


}
