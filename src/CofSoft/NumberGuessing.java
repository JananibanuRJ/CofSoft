package CofSoft;
import java.util.Scanner;
public class NumberGuessing {
		
			  public static void main(String[] args) {
			    int randomNum = (int)(Math.random() * 101);
			    int n=(100-randomNum)*2;
			    
			    for(int i=0;i<5;i++){
			    Scanner sc=new Scanner(System.in);
			    System.out.println("Enter a number within 1 to 100:");
			    int choice=sc.nextInt();
			    
			    if(randomNum!=choice){
			    	System.out.println("Just divide the given number by twice of one and subtract with century...And the number is "+n);
			        if(choice<randomNum){
			            System.out.println("your guess is less than the generated number");
			            
			            
			        }
			        else if(choice>randomNum){
			            System.out.println("your choice is greater than than the generated number");
			        }   
			    }
			    else if(randomNum==choice){
			        System.out.println(" your guess is correct");
			        System.out.println("You did it!!!");
			        break;
			        
			     
			        }
			   
			        
			  }
			  }

}
