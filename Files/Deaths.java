public class Deaths extends Game
{
//: ENEMY DEATH ///////////////////////////////

	static void enemyDeath()
	{
		if(enemyStatus == "BOSS")
		{
			boss++;
			enemyStatus = "";
			BossDefeated = 0;
		}
		healingCooldown = 0;
		hp += random.nextInt(hpMax/10)+(hpMax/20);
		Church.excess();
		xp += xpDrop;
		gold += goldDrop;
		goldEarned += goldDrop;
		enemiesKilled++;
		extra = 0;
		Display.Line();
		String a = "You have killed ";
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

		for (int i = 0; i< enemy.length(); i++)
		{
			try
			{
				Thread.sleep(40);
				System.out.print(enemy.charAt(i));
			}
			catch (Exception e)
			{
				System.out.println(". . .");
			}
		}
		a = "! You gained\n";
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
		System.out.print(xpDrop);
		a = " EXP";
		for (int i = 0; i < a.length(); i++)
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
		if (goldDrop>0)
		{
			a = " and ";
			for (int i = 0; i < a.length(); i++)
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
			System.out.print(goldDrop);
			a = " gold…\n";
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
		}
		int lootChance = random.nextInt(50)+1;
		if (lootChance<=(10+extraLoot))
		{
			System.out.println();
			Loots.loot();
			SaveState.Save();
		}
		if (xp>=xpMax)
		{
			LevelUP.lvlup();
		} else 
		{
			SaveState.Save();
			Generator.Encounter();
		}
	}	



// Self-explanatory? ////////////////////////
	static void Death()
	{
		if (ankh <= 0)
		{
			savedGame = 0;
			SaveState.Save();
		}
		Display.Line();
		System.out.println("\nYou have been killed! Game Over!");

		System.out.println("High Score: " +highScore+ "\tName: " +playerHighScore+ "Level " +lvlHighScore);

		Score = (enemiesKilled*100) + (level*100) + (goldEarned*100) + (str*10) + (vit*10) + (def*10) + (dex*10) +(agi*10);
		System.out.println("\n" +player+ "\nHighest level achieved:\nLevel " +level+ " × 100 \t\t\t\t\t= " +level*100);
		System.out.println("Enemies killed: " +enemiesKilled+ "× 100 \t\t\t= " +enemiesKilled*100);
		System.out.println("\t\t\tStr: " +str+ " x 10 \t\t= " +str*10+ "\n\t\t\tVit: " +vit+ " x 10 \t\t= " +vit*10+ "\n\t\t\tDef: " +def+ " x 10 \t\t= " +def*10+ "\n\t\t\tDex: " +dex+ " x 10 \t\t= " +dex*10+ "\n\t\t\tAgi: " +agi+ " x 10 \t\t= " +agi*10);
		System.out.println("Total Gold Earned: " +goldEarned+ " × 100 \t= " +goldEarned*100);
		System.out.println("Final Score\t\t\t\t\t\t= " +Score);

		if (Score>highScore)
		{
			System.out.println("\nYou have set a new High Score!");
			highScore=Score;
			playerHighScore=player;
		}

		System.out.println("\n1.) Restart\n\t2.) Revive(Ankh " +ankh+ "×)\n\t\t3.) Quit");
		choice= sc.next();

		switch(choice)
		{
			case "1":
				savedGame = 0;
				SaveState.Save();
				Generator.Create();
				break;
			case "2":
				if (ankh>0)
				{
					Consume.Ankh();
				}
				else
				{
					Display.Line();	
					System.out.println("You have no ankhs left!\n1.) Restart");
					choice = sc.next();

					switch(choice)
					{
						case "1":
							savedGame = 0;
							SaveState.Save();
							Generator.Create();
							break;
						default:
							Death();
							break;
					}
				}
				break;
			case "3":
				savedGame = 0;
				SaveState.Save();
				System.exit(0);
				break;
			default:
				Death();
				break;
		}
	}


}
