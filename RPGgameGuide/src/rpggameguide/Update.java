import java.io.*;
import java.util.*;
public class Update extends Game
{
	// UPDATE INFO :////////////////////////////////
	static void updateLog()
	{

		int code=0;	
		code = random.nextInt(9999);
		gift = code;
		Display.Line();
		
		try
		{
		File UL = new File(path + "/UpdateNotes.txt");
		Scanner s = new Scanner(UL);
		while (s.hasNext())
		{
			String a = s.nextLine();
			System.out.println(a);
		}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Err");
		}
		
		System.out.println("\t\t" + code + " )");
		
		try
		{
		File UL2 = new File(path + "/UpdateNotes2.txt");
		Scanner s = new Scanner(UL2);
		while (s.hasNext())
		{
			String a = s.nextLine();
			System.out.println(a);
		}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Err");
		}
			
		System.out.println("1.) Go back");
		choice = sc.next();	
		choice = choice.toLowerCase();

		switch(choice)
		{
			case "1":
				Display.home();
				break; 
			case "code": 
				eCode();
				break;
			case "yay":
				eCode2();
				break;
			default:		
				updateLog();
				break;
		}
	}

	static void eCode2()
	{
		if (fc2<1)
		{
			Display.Line();
			poxp++;
			System.out.println("You recieved Potion of Experience!");				
			fc2++;
		} else System.out.println("\nYou already claimed this!");
		sc.next();
		updateLog();
	}

	static void eCode()
	{
		System.out.print("Enter code: ");
		try
		{
			choiceI = sc.nextInt();
			if (choiceI== gift)
			{
				if (fc<1)
				{
					Display.Line();
					Loots.loot();
					fc++;
				} else System.out.println("\nYou already claimed this!");
				sc.next();
				updateLog();
			} else updateLog();
		}
		catch (Exception e)
		{
			System.out.println(e);
			eCode();
		}
	}
	
	static void reset()
	{
		mshp = 0;
		mmhp = 0;
		mlhp = 0;
		mpos = 0;
		mpov = 0;
		mpod = 0;
		mpodex = 0;
		mpoa = 0;
		mpox = 0;
		mpor = 0;
		mgp = 0;
		mankh = 0;
		ud();
	}
	static void ud()
	{
		mItemQty[0] = mshp;
		mItemQty[1] = mmhp;
		mItemQty[2] = mlhp;
		mItemQty[3] = mpos;
		mItemQty[4] = mpov;
		mItemQty[5] = mpod;
		mItemQty[6] = mpodex;
		mItemQty[7] = mpoa;
		mItemQty[8] = mpox;
		mItemQty[9] = mpor;
		mItemQty[10] = mgp;
		mItemQty[11] = mankh;

	}
}
