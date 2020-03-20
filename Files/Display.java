public class Display extends Game
{
	//main base ://///////////////////////////
	static void home()
	{
		savedGame = 1;
		SaveState.Save();
		from = 0;
		LevelUP.update();
		statWindow();
		System.out.println("\n1.) Hunt \t\t2.) Shop \n3.) Church\t\t4.) Stats\n5.) Inventory\t6.) Update Log\n7.) Quit");
		choice = sc.next();

		switch(choice)
		{
			case "1":
				Generator.Encounter();
				break;
			case "2":
				SHOP.Shop();	
				break;
			case "3":	
				Church.Church();
				break;
			case "4":
				statWindow();
				System.out.println("\n1.) Increase stats\n2.) Go back");
				choice=sc.next();

				switch(choice)
				{
					case "1":
						from = 4;
						LevelUP.statIncrease();
						break;
					case "2":
						home();
						break;
				}
				break;
			case "5":
				from = 1;
				Inventory.Inventory();
				break;
			case "6":
				Update.updateLog();
				break;
			case "7":
				Line();
				System.out.println("Are you sure you want to exit?\nY/N");
				choice = sc.next().toUpperCase();
				switch(choice)
				{
					case "Y":
						SaveState.Save();
						System.exit(0);
						break;
					case "N":
						home();
						break;
					default:
						home();
						break;
				}
				break;				
			default:
				home();
				break;
		}
	}





// Because I'm lazy typing it over and over ///////
	static void statWindow()
	{
		Church.excess();
		LevelUP.update();
		Line();
		System.out.println(player+ " Level " +level+ "\t" +gold+ " Gold");
		System.out.println("\nHP: " +hp+ "/" +hpMax);
		System.out.println("STR: " +str+ "\t\tVIT: " +vit);
		System.out.println("DMG: " +(dmgMinI+wpnDmgMin)+ "-" +(dmg+wpnDmg)+ "\tDEF: " +def);
		System.out.println("DEX: " +dex+ "\t\tAGI: " +agi);		
	}
// Same reason as statWindow ///////////////
	static void enemyInfo()
	{	
		Line();
		System.out.println("\t\t\t" +enemy+ " Level " +mobLvl);
		System.out.println("\t\t\tHP: " +mobHp+ "/" +mobMaxHp+ "\n\t\t\tDMG: " +mobDmgMinI+ "-" +mobDmg+  "\tDEF: " +mobDef+ "\n\t\t\tDEX: " +mobDex+ "\t\tAGI: " +mobAgi+ "\n\t\t\tExp Gain: " +xpDrop+ "\n\t\t\tGold Drop: " +goldDrop);
	}

	// GOLD DISPLAY ///////////////////////
	static void goldDisplay()
	{
		System.out.println("You have " +gold+ " Gold");
	}

	// Because I always use it /////////// 
	static void Line()
	{
		System.out.println("\n------------------------------------------");
	}

}
