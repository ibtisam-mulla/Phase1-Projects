package virtualkey;

public class Welcome {

	public static void showWelcomeMessage() {
		System.out.println("*********************** WELCOME to Lockedme.com ***********************");
		System.out.println("");
		System.out.println("\t\tAPPLICATION NAME: Virtual Key Repository");
		System.out.println("");

		System.out.println("************************* DEVELOPER DETAILS ***************************");
		System.out.println("");
		System.out.println("\tName: Ibtisam");
		System.out.println("\temail-Id: ibtisam.mulla97@gmail.com");
		System.out.println("");
		System.out.println("=======================================================================");

	}

	
	
	public static void displayBussinessOperationOptions() {
		System.out.println("\nYou are in option 2\n");
		System.out.println("\n******************************** SUB MENU *****************************\n");
	
		System.out.println("");

		String[] arr = { "1. Add a file to the existing directory list",
				"2. Delete a file from the existing directory list", 
				"3. Search a file from the main directory",
				"4. Back to the main menu" };
		int[] arr1 = { 1, 2, 3, 4};
		int slen = arr1.length;
		for (int i = 0; i < slen; i++) {
			System.out.println(arr[i]);
			// display the all the Strings mentioned in the String array
		}
	}

	public static void displayMainSelectionOptions() {
		// TODO Auto-generated method stub
		System.out.println("\n****************************** MAIN MENU ******************************");
		
		System.out.println("");

		String[] arr = { "1. To get file names in ascending order",
				"2. To perform Business Level Operation", "3. Close the application" };
		int[] arr1 = { 1, 2, 3 };
		int slen = arr1.length;
		for (int i = 0; i < slen; i++) {
			System.out.println(arr[i]);
			// display the all the Strings mentioned in the String array
		}
		
	}
	
}

