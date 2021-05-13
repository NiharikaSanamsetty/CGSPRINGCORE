package address.customer;

public class Add {
	private String str;
	private String city;
	private String state;
	private int zip;
	private String country;
	public String getStreet() {
		return str;
	}
	public void setStreet(String street) {
		this.str = str;
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
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void add()
	{
		System.out.println("street is :"+this.str+", "+"city is :"+this.city+", "+ "state is:"+this.state+", "+" zipcode is :"+this.zip+", "+" country is :"+this.country);
	}
}
