package Model;


public class Customer //Changes for GIT Repository//
{
	public String name;
	public String address;
	public String city;
	public String state;
	public String zipCode;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	
	public String printNameAndAddress()
	{
		return "Name of the customer: " +this.name +"\n"
				+"Address of the customer: " +this.address;
	}
	
	

}
