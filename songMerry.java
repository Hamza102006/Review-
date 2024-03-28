
import javax.swing.JOptionPane;

/**
 *
 * Hamza Khan 
 * Date: Sept 11, 2023
 * Description; Displays Merry Christmas from calling from methods
 * 
 */
public class songMerry {

	/**
	 * sayMerry 
	 */
	public static void sayMerry(String name) {
		System.out.println("We Wish " + name + " a Merry Christmas");
		System.out.println("We Wish " + name + " a Merry Christmas");
		System.out.println("We Wish " + name + " a Merry Christmas");
		System.out.println("And a Happy New Year!");
		
	}
	
	/**
	 * sayTidings  
	 */
	public static void sayTidings(String name) {
		System.out.println("Glad Tidings We Brings");
		System.out.println("To " + name + " and Your Kin;");
		System.out.println("Glad Tidings for Christmas");
		System.out.println("And a Happy New Year!");
		
	}
	
	/**
	 * sayFiggy  
	 */
	public static void sayFiggy() {
		System.out.println("We Want Some Figgy Pudding");
		System.out.println("We Want Some Figgy Pudding");
		System.out.println("We Want Some Figgy Pudding");
		System.out.println("Please Bring it Right Here!");
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare variables for name
		
		String name;
		
		//ask user for thier name 
		name = JOptionPane.showInputDialog(null, "Please Enter Name");
		
		
		//call methods in correct order based on song
		
		sayMerry(name);
		sayTidings(name);
		sayFiggy();
		sayTidings(name);
		sayFiggy();
		sayTidings(name);
		sayMerry(name);
		sayTidings(name);
		

		
		
	}

}
