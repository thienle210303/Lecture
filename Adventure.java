/*
 * Nguyen Le csce 145-010
 */
import java.util.Scanner;
public class Adventure {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Are you ready for new adventure!?\nEnter \"Yes\" or \"Nooo\"");
		
		String play = keyboard.nextLine();//string input
		if (play.equalsIgnoreCase("Yes"))//use equal to comparing string
		{
			System.out.println("Let's start!");
		}
		else
		{
			System.out.println("Ok then... Bye....");
			System.exit(0);
		}
		
		System.out.println("We have 4 direction ahead.\nChoose which way you want by entering number 1,2,3 or 4\n(Type \"give up\" to quit)");
		
		String quit = keyboard.nextLine();//new input
		
		
		if (quit.equalsIgnoreCase("give up"))
		{
			System.out.println("What!");
			System.exit(0);
		}

		int input= Integer.parseInt(quit); //change string to int
		if (input == 1)
		{
			System.out.println("You choose first way and luckily you get FIRE element\nDo you want to countinue?\"Yes\" or \"No\"");
			play = keyboard.nextLine();
			if (play.equalsIgnoreCase("Yes"))
			{
				System.out.println("Let's countinue!");
			} else
			{
				System.out.println("Good job, you got fire element. See ya!");
				System.exit(0);
			}
		}
		if (input==2)
		{
			System.out.println("You choose first way and luckily you get WATER element\nDo you want to countinue?\"Yes\" or \"No\"");
			play = keyboard.nextLine();
			if (play.equalsIgnoreCase("Yes"))
				{
					System.out.println("Let's countinue!");
				} else
				{
					System.out.println("Good jobm, you got water element. See ya!");
					System.exit(0);
				}
		}
		if (input==3)
		{
			System.out.println("You choose first way and luckily you get EARTH element\nDo you want to countinue?\"Yes\" or \"No\"");
			play = keyboard.nextLine();
			if (play.equalsIgnoreCase("Yes"))
				{
					System.out.println("Let's countinue!");
				} else
				{
					System.out.println("Good job, you got earth element. See ya!");
					System.exit(0);
				}
		}
		if (input==4)
		{
			System.out.println("You choose first way and luckily you get AIR element\nDo you want to countinue?\"Yes\" or \"No\"");
			play = keyboard.nextLine();
			if (play.equalsIgnoreCase("Yes"))
				{
					System.out.println("Let's countinue!");
				} else
				{
					System.out.println("Good job, you got air element. See ya!");
					System.exit(0);
				}
		}
		
		System.out.println("Wait....... something is happen and you are teleport back to where you started.\nPlease choose different direction that you pick.\nEnter 1,2,3,4.");
		int input1 = keyboard.nextInt();
		keyboard.nextLine();
		
		if (input1 == input)//if user enter the same way on the previous step
		{
			System.out.println("You are going to the old way and got trapped by a monster. You're DEAD...");
			System.exit(0);
		}
		
		
		if (input1 == 1 || input1 ==2 || input1 == 3 || input1 ==4)
		{
			System.out.println("ROOOOAAAAAARRRR!\nYou are seeing a real BOSS at the end of the way! Do you want to use your element to fight against that monster????");
			play = keyboard.nextLine();
			if (play.equalsIgnoreCase("Yes"))
			{
				System.out.println("You are too WEAK!\nGAME OVER!");
				System.exit(0);

			}
			else
			{
				System.out.println("You are go back and got trapped by monster.\nGAME OVER!");
				System.exit(0);
			}
		}	
	keyboard.close();	//close scanner
	}
}
			
			
			
		
		
		




	
