	
import java.util.Scanner;
import java.util.Random;
public class exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
   Random random = new  Random();
   System.out.println("How much do you want to spend money?");
   Scanner i = new Scanner(System.in);
			
   int money  = i.nextInt();
  	

		do {
			int ra1 =random.nextInt(10)+1;
			int ra2 =random.nextInt(10)+1;
			int ra3 =random.nextInt(10)+1;
				System.out.println(ra1);
				System.out.println(ra2);
				System.out.println(ra3);
				//this code should be in the "do while"loop,as it needs changed in every loop.
				
					if((ra1 == 7&&ra2 == 7 &&ra3 !=7)||(ra1 != 7&& ra2 == 7&& ra3 ==7)||(ra1 == 7&& ra2 != 7&& ra3 ==7)) {
			        money += 5;
			        System.out.println("You win");
					}
					else if ((ra1 == 7 && ra2 == 7 && ra3 ==7)) {
						money += 10;
						System.out.println("You win");
					}
					else if((ra1 != 7&&ra2 != 7 &&ra3 !=7))
					{
						money -= 1;
					}
					else {
						money +=3;
						System.out.println("You win");
					}
					
					System.out.println(money);
					System.out.println("Do you want to play again(yes/no)?");
			    	Scanner a = new Scanner(System.in);
			    	String answer = a.nextLine();
			    	if (answer.equals("no")){
			    		break;
			    		}
			    	else if (answer.equals("yes")){
			    		System.out.println();
			    	 }
				
				}while(money>0)	;
		
			if (money <= 0) {
				System.out.println("You lost");			
			 }		
	}

}
