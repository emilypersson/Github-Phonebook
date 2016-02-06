public class PhoneBookEntry {

	private String fname;
	private String lname;
	private String email;
	private String zip;
	private String phone;
	
	public PhoneBookEntry() {
		
	}
	public PhoneBookEntry (String f, String l, String e, String z, String p) {
		fname = f;
		lname = l;
		email = e;
		zip = z;
		phone = p;
	}
	
	public PhoneBookEntry(String f, String p) {
		fname = f;
		phone = p;
	}
	//getters and setters
	public String getZip() {
		return zip;
	}
	
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	//printing information
	public void printBookEntry() {
		System.out.println("fname = " + fname);
		System.out.println("lname = " + lname);
		System.out.println("email = " + email);
		System.out.println("zip = " + zip);
		System.out.println("phone = " + phone);

	}
	
}
