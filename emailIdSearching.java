package mypackage;

import java.util.*;

public class emailIdSearching {
	
	public static void search(List a, String s){
		//searching element through indexOf()
	      int index=a.indexOf(s);
	      if(index==-1) {
	    	  System.out.println("email id not found");
	      }
	      else {
	    	  System.out.println("email id found successfully at index of "+index);
	      }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***************** Searching email-id's *****************");
		ArrayList <String> list = new ArrayList<String>();
	      //Instantiating an ArrayList object
	      list.add("abc@gmail.com");
	      list.add("xyz@yahoo.com");
	      list.add("company@ac.in");
	      list.add("jsmith@example.com.");
	      list.add("example123@gmail.com");
	      list.add("ibtisam@yahoo.com");
	      list.add("mulla.123@outlook.com");
	      System.out.println("List of email-ID's: ");
	      for(String i:list) {
	    	  System.out.println(i);
	      }
	      //Taking input from user
	      System.out.println("enter email-ID for searching");
	      Scanner sc=new Scanner(System.in);
	      String str=sc.nextLine();
	      //calling search method
	      search(list,str);
	      
	      
	}

}
