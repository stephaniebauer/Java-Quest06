package quest;

public class Classroom {

	public static void main(String[] args) {
		
		//New Wilder Marcel
		Wilder Marcel = new Wilder ("Marcel", true);
		Marcel.whoAmI();

		//New Wilder Martin
		Wilder Martin = new Wilder ("Martin", false);
		Martin.whoAmI();

		//New Wilder Steffi
		Wilder Steffi = new Wilder ("Steffi", false);
		Steffi.whoAmI();
	}

}