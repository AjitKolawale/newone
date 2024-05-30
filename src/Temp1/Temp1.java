package Temp1;

import java.util.Scanner;

public class Temp1 {
public static void main(String[] args) {
	int Count =0;
	char somechar= 'a';
	
	Scanner Sc =new Scanner(System.in);
	System.out.print("Pls put your string value--");
	String getdata=Sc.nextLine();
	 for(int i=0;i<=getdata.length()-1;i++) 
	 {
		char Nsc= getdata.charAt(i);  
		 
	if(Nsc==somechar)
		 {
			 Count++;
		 }
	

	 }
	System.out.println(Count);
	 
}

}
