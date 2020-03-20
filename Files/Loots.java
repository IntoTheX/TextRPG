public class Loots extends Game
{
	// LOOTS! ://////////////////////////////	
	static void loot()
	{
		String looted = "";
		int lootChoice=random.nextInt(49);
		if (lootChoice==0)
		{
			ankh +=1;
			looted = "Ankh";
		}
		if (lootChoice < 3 && lootChoice > 0)
		{
			poxp++;
			looted = "Potion of Experience";
		}
		if (lootChoice == 3)
		{
			gp++;
			looted = "Godly Potion";
		}
		else
		{
			lootChoice =random.nextInt(4);
			if (lootChoice < 1 )
			{
				choiceI = random.nextInt(5);
				if (choiceI == 0)
				{
					pos++;
					looted ="Potion of Strength";
				}
				else if (choiceI == 1)
				{
					pov++;
					looted ="Potion of Vitality";
				}
				else if (choiceI == 2)
				{
					pod++;
					looted ="Potion of Defense";
				}
				else if (choiceI == 3)
				{
					podex++;
					looted ="Potion of Dexterity";
				}
				else if (choiceI == 4)
				{
					poa++;
					looted ="Potion of Agility";
				}
				else if (choiceI == 5)
				{
					por++;
					looted = "Potion of Randomness";
				}
			}
			else
			{
				choiceI = random.nextInt(6);
				if (choiceI < 3)
				{
					shp++;
					looted ="Small Health Potion";
				}
				else if (choiceI < 5)
				{
					mhp++;
					looted ="Medium Health Potion";
				}
				else if (choiceI >= 5)
				{
					lhp++;
					looted ="Large Health Potion";
				}
			}
		}
		String a = "You recieved ";
		for (int i =0; i<a.length(); i++)
		{


			try
			{
				Thread.sleep(40);
				System.out.print(a.charAt(i));
			}
			catch (Exception e)
			{
				System.out.println("Error!");
			}
		}
		for (int i = 0; i< looted.length(); i++)
		{
			try
			{
				Thread.sleep(40);
				System.out.print(looted.charAt(i));
			}
			catch (Exception e)
			{
				System.out.println(". . .");
			}
		}
		savedGame = 1;
		SaveState.Save();
	}

	
}
