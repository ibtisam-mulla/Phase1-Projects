package virtualkey;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainOperations {
	private static final int GET_NAMES = 1;
	private static final int BUSSINESS_OPERATIONS = 2;
	private static final int CLOSE_APP = 3;

	
	public static void performOperations(Scanner sc) {
		while(true) {
			Welcome.displayMainSelectionOptions();

			int opr = UserInputs.getMainOperationSelection(sc);
			
			switch (opr) {
			case GET_NAMES: {
				getFilesInAcsendingOrder();
				break;
			}
			case BUSSINESS_OPERATIONS: {
				do {
				Welcome.displayBussinessOperationOptions();
				int selection = UserInputs.getBussinessOperationSelection(sc);
				BussinessOperations.performBussinessOperations(selection, sc);
				}while(true);
				
			}
			case CLOSE_APP: {
				System.out.println("Closing your application... \r\n"
						+ "Thank you!");
				System.exit(0);
				break;
			}
			default:
				System.out.println("kindly provide correct options");
				break;
			}
			
		}
	}

	private static void getFilesInAcsendingOrder() {
		List<String> existingFiles =  BussinessOperations.getFilesInRepo();
		Collections.sort(existingFiles);
		System.out.println("Files in ascending order: ");
		for(String i:existingFiles) {
			System.out.println(i);
		}
	}
	public static void getFiles() {
		List<String> existingFiles =  BussinessOperations.getFilesInRepo();
		System.out.println("Files are present After performing above operation: ");
		for(String i:existingFiles) {
			System.out.println(i);
		}
	}
}

