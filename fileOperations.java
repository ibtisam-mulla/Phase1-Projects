package mypackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileOperations {
	static String pt="D:/simplilearn/Phase1_ProjectsData/sample.txt";
	public static void fileread(String s) throws Exception{
   	 File file = new File(s);
        Scanner sc1 = new Scanner(file);
        while (sc1.hasNextLine())
       	 System.out.println(sc1.nextLine());
    }
 

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
        String strLine = "";
       try {             
             BufferedReader br = new BufferedReader(new FileReader(pt));
             //read the file content
             System.out.println("*********read operation************");
             while (strLine != null)
             {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();
       }
       catch(IOException ioe) {
    	   System.out.println("error:" +ioe.getMessage());
       }
       
       try {
    	         
           
           FileWriter fw = new FileWriter(pt,true); 
           System.out.println("**********write operation**************");
           //appends the string to the file
           fw.write("java is platform independent\n");
           System.out.println("**********append operation*************");
           fw.write("java is object oriented language\n");
           fw.close();
       }
       catch(IOException ioe) {
    	   System.out.println("error:" +ioe.getMessage());
    	   
       }
       fileread(pt);
	}
}
         
         
          
         
	


