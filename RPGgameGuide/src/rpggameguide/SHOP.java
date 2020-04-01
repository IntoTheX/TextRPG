public class SHOP extends Game
{
	// SHOP /////////////////////////////
	static void Shop()
	{
		Display.Line();
		System.out.println("\nGood day, " +player+ ". How can I help you?");
		Display.goldDisplay();
		System.out.println("1.) Buy\t2.) Sell\n3.) Go back");
		choice = sc.next();

		switch(choice)
		{
			case "1":
				Buy();
				break;
			case "2":
				Sell();
				break;
			case "3":
				Display.home();
				break;
			default:
				Shop();
				break;
		}
	}

// Buy section ////////////////////////
	static void Buy()
	{
		Display.Line();
		System.out.println("What will you buy?");
		Display.goldDisplay();
		System.out.println("1.) Weapons\t2.) Armors\n3.) Consumables\t 4.) Go back");
		choice = sc.next();

		switch(choice)
		{
			case "1":
				Weapons();
				break;
			case "2":

				Armors();
				break;
			case "3":
				Potions();
				break;
			case "4":
				Display.home();
				break;
			default:
				Buy();
				break;
		}
	}

// Weapons section ////////////////////
	static void Weapons()
	{
		/*
		Display.Line();
		System.out.println("Still in development :>");
		System.out.println("1.) Go back");
		choice = sc.next();

		switch(choice)
		{
			case "1":
				Display.home();
				break;
			default:
				Weapons();
				break;
		}
		*/
		Display.Line();
		Display.goldDisplay();
		System.out.println("1.) Knuckleduster 20 Gold\n -deals 3-5 damage and 5 extra DEX\n(scales with AGI)\n\n2.) Dagger 25 Gold\n -deals 5-7 dmg and 5% +\n(dex*0.2) chance to deal 150%-300%\ncritical hit\n(scales with DEX)\n\n3.) Short Sword 25 Gold\n -deals 8-10 damage(scales with STR)\n\n4.) Round Shield 20 Gold\n -deals 3-4 damage and 5 extra DEF\n(scales 'faster' with DEF\n\n5). Go back");
		choice = sc.next();

		switch(choice)
		{
			case "1":
				if (kd < 1)
				{
				if (gold >= 20)
				{
					kd++;
					gold -= 20;
					Display.Line();
					System.out.println("Purchased Knuckleduster!");
					Weapons();
				}
				else 
				{
					Display.Line();
					System.out.println("Insufficent Gold!");
					Weapons();
				}
				}
				else
				{
					Display.Line();
					System.out.println("You already have this!");
					Weapons();
				}
				
				break;

			case "2":
				if (dg < 1)
				{
				if (gold >= 25)
				{
					dg++;
					gold -= 25;
					Display.Line();
					System.out.println("Purchased Dagger!");
					Weapons();
				}
				else 
				{
					Display.Line();
					System.out.println("Insufficent Gold!");
					Weapons();
				}
				}
				else
				{
					Display.Line();
					System.out.println("You already have this!");
					Weapons();
				}
				break;
			case "3":
				if (ss < 1)
				{
				if (gold >= 25)
				{
					ss++;
					gold -= 25;
					Display.Line();
					System.out.println("Purchased Short Sword!");
					Weapons();
				}
				else 
				{
					Display.Line();
					System.out.println("Insufficent Gold!");
					Weapons();
				}
				}
				else
				{
					Display.Line();
					System.out.println("You already have this!");
					Weapons();
				}
				break;
			case "4":
				if (rs < 1)
				{
					if (gold >= 20)
					{
						rs++;
						gold -= 20;
						Display.Line();
						System.out.println("Purchased Round Shield!");
						Weapons();
					}
					else 
					{
						Display.Line();
						System.out.println("Insufficent Gold!");
						Weapons();
					}
				}
				else
				{
					Display.Line();
					System.out.println("You already have this!");
					Weapons();
				}

				break;
				
			case "5":
				Display.home();
				break;
			default:
				Weapons();
				break;
		}

	}

// Armors //////////////////////////////
	static void Armors()
	{
		Display.Line();
		System.out.println("Still in development :>");
		System.out.println("1.) Go back");
		choice = sc.next();

		switch(choice)
		{
			case "1":
				Display.home();
				break;
			default:
				Armors();
				break;
		}

	}

// Pots section /////////////////////

	static void Potions()
	{
		Display.Line();
		Display.goldDisplay();
		System.out.println("1.)Small HP Potion 10 Gold\n -heals 20 of your missing health.\n\n2.) Medium HP Potion 15 Gold\n -heals 50 of your missing health\n\n3.) Large HP Potion 25 Gold\n -heals 100 of your missing health\n\n" + /*4.) Potion of Strength 50 Gold\n -Increases strength by 1 point.\n\n 5.) Potion of Vitality 50 Gold\n -Increases Vitality by 1 point.\n\n6.) Potion of Defense 50 Gold\n -Increases defense by 1 point.\n\n7.) Potion of Dexterity 50 Gold\n -Increases dexterity by 1 point.\n\n8.) Potion of Agility 50 Gold\n -Increases agility by 1 point.\n\n*/"4.) Ankh " +ankhPrice+" Gold\n -Gives you a chance to resurrect\n\n5.)Go back");
		choice = sc.next();

		switch(choice)
		{
			case "1":
				if (gold>=10)
				{
					gold -= 10;
					shp++;
					Display.Line();
					System.out.println("Purchased Small HP Potion");
					Potions();
				}
				else 
				{
					Display.Line();
					System.out.println("Insufficent Gold!");
					Potions();
				}
				break;
			case "2":
				if (gold>=15)
				{
					gold -= 15;
					mhp++;
					Display.Line();
					System.out.println("Purchased Medium HP Potion");
					Potions();
				}
				else 
				{
					Display.Line();
					System.out.println("Insufficent Gold!");
					Potions();
				}
				break;
			case "3":
				if (gold>=25)
				{
					gold -= 25;
					lhp++;
					Display.Line();
					System.out.println("Purchased Large HP Potion");
					Potions();
				}
				else 
				{
					Display.Line();
					System.out.println("Insufficent Gold!");
					Potions();
				}
				break;
			case "4":
				if (gold>=ankhPrice)
				{
					gold -= ankhPrice;
					ankh++;
					Display.Line();
					ankhPrice += ankhPrice/2;	
					System.out.println("Purchased Ankh");
					Potions();
				}
				else 
				{
					Display.Line();
					System.out.println("Insufficent Gold!");
					Potions();
				}
				SaveState.Save();
				break;
			case "5":
				Shop();
				break;
			default:
				Potions();
				break;
		}
	}

// Sell section //////////////////////////
	static void Sell()
	{
		Display.Line();
		System.out.println("Still in development :>");
		System.out.println("1.) Go back");
		choice = sc.next();

		switch(choice)
		{
			case "1":	
				Display.home();
				break;
			default:
				Sell();
		}		
	}
	
	static void merch()
	{
	mshp = 2;
	int mItem = random.nextInt(6)+2;
	for (int i = 0; i<mItem;i++)
	{
		int lootChoice=random.nextInt(49);
		if (lootChoice==0)
		{
			mankh++;
		}
		if (lootChoice < 3 && lootChoice > 0)
		{
			mpox++;
		}
		if (lootChoice == 3)
		{
			mgp++;
		}
		else
		{
			lootChoice =random.nextInt(4);
			if (lootChoice < 1 )
			{
				choiceI = random.nextInt(5);
				if (choiceI == 0)
				{
					mpos++;
				}
				else if (choiceI == 1)
				{
					mpov++;
				}
				else if (choiceI == 2)
				{
					mpod++;
				}
				else if (choiceI == 3)
				{
					mpodex++;
				}
				else if (choiceI == 4)
				{
					mpoa++;
				}
				else if (choiceI == 5)
				{
					mpor++;
				}
			}
			else
			{
				choiceI = random.nextInt(6);
				if (choiceI < 3)
				{
					mshp++;
				}
				else if (choiceI < 5)
				{
					mmhp++;

				}
				else if (choiceI >= 5)
				{
					mlhp++;
				}
			}
		}
	}

	
	String a = "As you go on a hunt, you\nsuddenly hear hooves striking\nthe earth...";
	for (int i = 0; i< a.length(); i++)
	{
		try
		{
			Thread.sleep(40);
			System.out.print(a.charAt(i));
		}
		catch (Exception e)
		{
			System.out.println(". . .");
		}
	}
	try
	{
		Thread.sleep(1000);
		System.out.println("\n\nYou found a merchant...");

		Thread.sleep(1000);
		System.out.println("1.) Show me your stuff\n2.) Wish him a safe travel");
	}
	catch(Exception e)
	{
		System.out.println("Err...");
	}
	choice = sc.next();
	switch(choice)
	{
	case "1":
		SHOP.mShop();
		break;
	case "2":
		Update.reset();
		Generator.Encounter();
		break;
	default:
		merch();
		break;
	}
	}
	
	static void mShop()
	{
		Update.ud();
		int scount = 0;
		int[] Items = mItemQty;
		Display.Line();
		System.out.println("What will you buy? You have " +gold+ "G\n\nEnter the codes enclosed with '' to\nconsume item or enter 'b' to go back\n");
		for (int i = 0; i<mItemNames.length; i++)
		{ 
			if (Items[i]>0)
			{
				System.out.print((scount+1)+ ".) " +mItemNames[i]+ " " +mItemQty[i]+ "x " +mPrice[i]+ "G '" +ItemCode[i]+ "'\n");
				scount++;
			}

		}
		System.out.println((scount+1)+ ".) Go back 'b'");

		choice = sc.next();

		switch(choice)
		{
			case "shp":
				if (mshp <= 0)
				{
					Display.Line();
					System.out.println("We are out of stocks...");
					mShop();
				}
				else if (gold>=15)
				{
					gold -= 15;
					shp++;
					mshp--;
					Display.Line();
					System.out.println("Purchased Small HP Potion");
					mShop();
				}
				else 
				{
					Display.Line();
					System.out.println("Insufficent Gold!");
					mShop();
				}
				break;
			case "mhp":
				if (mmhp <= 0)
				{
					Display.Line();
					System.out.println("We are out of stocks...");
					mShop();
				}
				else if (gold>=15)
				{
					gold -= 15;
					mhp++;
					mmhp--;
					Display.Line();
					System.out.println("Purchased Medium HP Potion");
					mShop();
				}
				else 
				{
					Display.Line();
					System.out.println("Insufficent Gold!");
					mShop();
				}
				break;
			case "lhp":
				if (mlhp <= 0)
				{
					Display.Line();
					System.out.println("We are out of stocks...");
					mShop();
				}
				else if (gold>=25)
				{
					gold -= 25;
					lhp++;
					mlhp--;
					Display.Line();
					System.out.println("Purchased Large HP Potion");
					mShop();
				}
				else 
				{
					Display.Line();
					System.out.println("Insufficent Gold!");
					mShop();
				}
				break;
			case "pos":
				if (mpos <= 0)
				{
					Display.Line();
					System.out.println("We are out of stocks...");
					mShop();
				}
				else if (gold>=50)
				{
					gold -= 50;
					pos++;
					mpos--;
					Display.Line();
					System.out.println("Purchased Potion of Strength");
					mShop();
				}
				else 
				{
					Display.Line();
					System.out.println("Insufficent Gold!");
					mShop();
				}
				break;

			case "pov":
				if (mpov <= 0)
				{
					Display.Line();
					System.out.println("We are out of stocks...");
					mShop();
				}
				else if (gold>=50)
				{
					gold -= 50;
					pov++;
					mpov--;
					Display.Line();
					System.out.println("Purchased Potion of Vitality");
					mShop();
				}
				else 
				{
					Display.Line();
					System.out.println("Insufficent Gold!");
					mShop();
				}
				break;
			case "pod":
				if (mpod <= 0)
				{
					Display.Line();
					System.out.println("We are out of stocks...");
					mShop();
				}
				else if (gold>=50)
				{
					gold -= 50;
					pod++;
					mpod--;
					Display.Line();
					System.out.println("Purchased Potion of Defense");
					mShop();
				}
				else 
				{
					Display.Line();
					System.out.println("Insufficent Gold!");
					mShop();
				}
				break;
			case "podex":
				if (mpodex <= 0)
				{
					Display.Line();
					System.out.println("We are out of stocks...");
					mShop();
				}
				else if (gold>=50)
				{
					gold -= 50;
					podex++;
					mpodex--;
					Display.Line();
					System.out.println("Purchased Potion of Dexterity");
					mShop();
				}
				else 
				{
					Display.Line();
					System.out.println("Insufficent Gold!");
					mShop();
				}
				break;
			case "poa":
				if (mpoa <= 0)
				{
					Display.Line();
					System.out.println("We are out of stocks...");
					mShop();
				}
				else if (gold>=50)
				{
					gold -= 50;
					poa++;
					mpoa--;
					Display.Line();
					System.out.println("Purchased Potion of Agility");
					mShop();
				}
				else 
				{
					Display.Line();
					System.out.println("Insufficent Gold!");
					mShop();
				}
				break;
			case "pox":
				if (mpox <= 0)
				{
					Display.Line();
					System.out.println("We are out of stocks...");
					mShop();
				}
				else if (gold>=100)
				{
					gold -= 100;
					poa++;
					mpox--;
					Display.Line();
					System.out.println("Purchased Potion of Experience");
					mShop();
				}
				else 
				{
					Display.Line();
					System.out.println("Insufficent Gold!");
					mShop();
				}
				break;
			case "por":
				if (mpor <= 0)
				{
					Display.Line();
					System.out.println("We are out of stocks...");
					mShop();
				}
				else if (gold>=75)
				{
					gold -= 75;
					por++;
					mpor--;
					Display.Line();
					System.out.println("Purchased Potion of Randomness");
					mShop();
				}
				else 
				{
					Display.Line();
					System.out.println("Insufficent Gold!");
					mShop();
				}
				break;
			case "gp":
				if (mgp <= 0)
				{
					Display.Line();
					System.out.println("We are out of stocks...");
					mShop();
				}
				else if (gold>=300)
				{
					gold -= 300;
					gp++;
					mgp--;
					Display.Line();
					System.out.println("Purchased Godly Potion");
					mShop();
				}
				else 
				{
					Display.Line();
					System.out.println("Insufficent Gold!");
					mShop();
				}
				break;
			case "ankh":
				if (mankh <= 0)
				{
					Display.Line();
					System.out.println("We are out of stocks...");
					mShop();
				}
				else if (gold>=500)
				{
					gold -= 500;
					ankh++;
					mankh--;
					Display.Line();
					System.out.println("Purchased Ankh");
					mShop();
				}
				else 
				{
					Display.Line();
					System.out.println("Insufficent Gold!");
					mShop();
				}
				break;
			case "b":
				Update.reset();
				Generator.Encounter();
				break;
		}
		SaveState.Save();

	}
	
	
	
}
