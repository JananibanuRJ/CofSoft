package CofSoft;
import java.util.Scanner;

public class StudentCalci {
		
			  public static void main(String[] args) {
				  
			      Scanner sc=new Scanner(System.in);
			      System.out.println("Enter the number of subjects:");
			      int num=sc.nextInt();
			      int sum=0,perce;
			      for(int i=1;i<=num;i++) {
			    	
				      Scanner se=new Scanner(System.in);
				      System.out.println("Enter mark of sub: "+i);
				      int marks=se.nextInt();
				      sum=sum+marks;
				      
				      
			}     
			      System.out.println(sum);
			      perce=sum/num;
			      System.out.println(perce+"%");
			    

			      if (perce <= 100 && perce >= 90) {
			          System.out.println("Grade O \nOUTSTANDING PERFORMANCE");
			          
			      } else if (perce < 90 && perce >= 80) {
			          System.out.println("Grade A\nEXCELLENT PERFORMANCE");
			      } else if (perce <80 && perce >=70) {
			    	  System.out.println("Grade B\nVERY GOOD");
			      }else if (perce < 70 && perce >=60) {
			    	  System.out.println("Grade C\nGOOD");
			      }else if (perce < 60 && perce >=50) {
			    	   System.out.println("Grade D\nGOOD,WORK HARD");
			      }else if (perce < 50 && perce >=40) {
			    	  System.out.println("Grade E\nGOOD,KEEP TRYING");
			      }else if (perce <40) {
			    	  System.out.println("Reapper,Better luck next time");
			      }else {
			          // Handle other cases if needed
			          System.out.println("Grade not in the specified range");
			      }

			

		}


}
