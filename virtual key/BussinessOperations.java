package virtualkey;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BussinessOperations {

	private static final int ADD = 1;
	private static final int DELETE = 2;
	private static final int SEARCH = 3;
	private static final int BACK = 4;

	public static void performBussinessOperations(int opr, Scanner sc) {

		switch (opr) {
		case ADD:
			creatNewFile(sc);
			MainOperations.getFiles();
			break;
			
		case DELETE:
			deleteExistingFile(sc);
			MainOperations.getFiles();
			break;
			
		case SEARCH:
			try {
			searchFile(sc);
			}
			catch(IOException ioe) {
				System.out.println("Error:"+ioe.getMessage());
			}
			break;
			
		case BACK:
			MainOperations.performOperations(sc);
			break;

		default:
			System.out.println("Kindly provide correct options");
			break;
		}

	}
	
	private static void searchFile(Scanner sc) throws IOException {
		String fileName = UserInputs.getFileNameFromUser(sc);
		List<String> results = getFilesInRepo();
		String result = "\nFile not found in directory!";
		for (String item : results) {
			if(item.equalsIgnoreCase(fileName)) {
				throw new IOException(result="\nfile found successfully!");
			}
		}
		
		System.out.println(result);
	}

	public static List<String> getFilesInRepo() {
		List<String> results = new ArrayList<String>();
		String dir = "D:/sample/";
		
		//If this pathname does not denote a directory, then listFiles() returns null. 
		File[] files = new File(dir).listFiles();

		for (File file : files) {
		    if (file.isFile()) {
		        results.add(file.getName());
		    }
		}
		return results;
	}

	private static void deleteExistingFile(Scanner sc) {
		String fileName = UserInputs.getFileNameFromUser(sc);
		
		Path file = Paths.get("D:/sample/" + fileName);
	
		try {
			if(Files.deleteIfExists(file)) {
				System.out.println("\nFile deleted successfully ");
			}else {
				System.out.println("\nFile not found ");

			}
		} catch (IOException e) {
			System.out.println(" Exception occurred...! Unable to delete a file ");
			e.printStackTrace();
		}
	}

	private static void creatNewFile(Scanner sc) {
		String fileName = UserInputs.getFileNameFromUser(sc);
		File file = new File("D:/sample/" + fileName + ".txt");
		try {
			if (file.createNewFile()) {
				System.out.println("\nFile created successfully");
			} else {
				System.out.println("\nExisting file");
			}
		} catch (IOException e) {
			System.out.println("Failed to create new file\n");
			e.printStackTrace();
		}

	}

}

