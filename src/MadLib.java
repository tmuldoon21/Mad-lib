/**
 * Tyler Muldoon
 */
import java.util.Scanner;
public class MadLib 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner (System.in);
		System.out.print("Enter your name:   ");
		String name = user.nextLine();
		System.out.print("Enter a adjective:   ");
		String adjective1 = user.nextLine();
		System.out.print("Enter a color:   ");
		String color1 = user.nextLine();
		System.out.print("Enter a color:   ");
		String color2 = user.nextLine();
		System.out.print("Enter a adjective:   ");
		String adjective2 = user.nextLine();
		System.out.print("Enter an animal:   ");
		String animal = user.nextLine();
		System.out.print("Enter a verb:   ");
		String verb1 = user.nextLine();
		System.out.print("Enter a noun:   ");
		String noun = user.nextLine();
		System.out.print("Enter a verb ending in -ing:   ");
		String verb2 = user.nextLine();
		System.out.print("Enter a plural noun:   ");
		String pluralnoun1 = user.nextLine();
		System.out.print("Enter a plural noun:   ");
		String pluralnoun2 = user.nextLine();
		System.out.print("Enter a plural noun:   ");
		String pluralnoun3 = user.nextLine();
		
		System.out.print(" The Grinch is a(n) " + adjective1 + (" ") + color1);
		System.out.print(" creature with " + color2 + "\n  eyes who does not like Christmas cheer.");
		System.out.print(" When he sees people celebrating Christmas, it makes him " + adjective2);
		System.out.print("\n  He and his " + animal + " Max try to " + verb1 + " Christmas for people in the town of " + noun + "-ville ");
		System.out.print("\n  by " + verb2 + " their Christmas " + pluralnoun1 + ". When the people still have Christmas cheer, even without " + pluralnoun2);
		System.out.print("\n  ,the Grinch decides to return the " + pluralnoun3 + " and celebrates Christmas after all.");
		
		
		
		
		
		
		
		
		

	}

}
