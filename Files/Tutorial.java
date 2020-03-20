public class Tutorial extends Game
{
	static void TutOpt()
	{
		switch(count)
		{
			case 0:
				Display.Line();
				System.out.println("Welcome " +player+ ", would you like to have a\ntutorial?");
				System.out.println("\nANNOUNCEMENT!\nWe are now at alpha 0.1.0!\nSave and Load function, bug fixes,\n and tweaks.\nCheck Update Log for full\ndetails.");
				System.out.println("\n1.) Yes please!\t2.) Skip Tutorial");
				choice = sc.next();

				switch(choice)
				{
					case "1":
						Tutorial();
						break;
					case "2":
						Display.home();
						break;
					default:
						TutOpt();
						break;
				}
				break;
			default:
				Display.home();
				break;
		}
	}

	// TUTORIAL //////////////////////	
	static void Tutorial()
	{
		int code = random.nextInt(9999);
		Display.Line();
		System.out.println("Welcome to the Tutorial! This text-based\nRPG is still under development, expect\ncrashes and bugs(a lot).");
		System.out.println("\n\tThe main objective(for now) is to\nbeat the developer's personal High Score\nwhich is 57175, pretty easy right? WRONG!\nThis game features a rogue-like genre,\nrandomly generated starting stat points,\nenemy generation that scales with player's\nlevel, and Perma-death. Yes, you die\npermanently. You will die a lot, but you\nshould learn from it. Use Potions, Invest\non a revival item, Fight or Run, discover\nyour own build.\n\n\tTo navigate the game, you will press\na lot of number keys(I'm serious). Try to\nbe careful not to input any letters or\nsigns when being asked for a number input,\nit will crash the game and you might end\nup losing all your progress.\n\n\tI'm still working on a lot if things\nlike DEX(implemented), Weapons, Armors,\nSave System and A LOT. Stay tuned.\n\nP.S. If you want a copy of this game you\ncan just ask me. *winks*");
		System.out.println("\nSTR will determine your damage output,\nVIT will specify the Maximum Health Points\nyou will have, DEF will reduce the\ndamage you will get from the enemy, \nDEX indicates how many times you can\nattack per turn and it also determines\nyour accuracy, and AGI is important in\nincreasing you evasion. Enter 'code' then\ntype " +code+ " and I will give you a free\nankh. *winks*");
		System.out.println("\n\n\tOne of my testers has beaten my\nScore, the current High Score holder is\nnamed '[]' who reached level 8 with a\nfinal score of 245520. Unfortunately, he\nforgot or maybe he wasn't aware in the\nexistense of Ankhs and never had a chance\nto use it.");
		System.out.println("1.) Continue");

		choice = sc.next().toLowerCase();

		count++;

		switch(choice)
		{
			case "1":
				Display.home();
				break;
			case "code":
				System.out.print("\nEnter code: ");
				try
				{
					choiceI = sc.nextInt();

					if (choiceI == code)
					{
						ankh +=1;
						Display.Line();
						System.out.println("Looks like you're reading this huh? Free\nankh for you, your patience pays off.");
						System.out.println("Enter any key to continue...");
						sc.next();
						Display.home();
					} else Tutorial();
				}
				catch(Exception e)
				{
					System.out.println(e);
					Tutorial();
				}
				break;
			default:
				Tutorial();
				break;
		}
	}


}
