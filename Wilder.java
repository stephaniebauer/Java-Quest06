package quest;
public class Wilder {
	private String firstname;
	private boolean present;
	
	//Constructor
	public Wilder(String name, boolean status){
		this.firstname = name;
		this.present = status;
	}
	
	//Getter and Setter for firstname
	public String getFirstname () {
		return this.firstname;
	}
	
	public void setFirstname(String name) {
		this.firstname = name;
	}
	
	//Getter and Setter for present
	public boolean isPresent () {
		return this.present;
	}
	
	public void setPresent(boolean status) {
		this.present = status;
	}
	
	//WhoAmI Method
	public void whoAmI() {
		if (present) {
		    
			System.out.println("My name is "+ this.firstname + " and I am present");
	    }
		else {
			System.out.println("My name is "+ this.firstname + " and I am not present");
		}
	}


}
