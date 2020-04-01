public class Generator extends Game
{
	// Random playepr stat Generator ////////////
	static void Create()
	{
		int limit =20;
		System.out.println("What should I call you, adventurer?");
		player= sc.nextLine();

		if (!player.equals("") && !player.equals(" "))
		{
			shp = 2;
			mhp = 0; lhp = 0; pos = 0; pov = 0; pod = 0; podex = 0; poa = 0; poxp = 0; ankh = 0; fc = 0; fc2 = 0;
			knuckleduster = false; dagger = false; shortSword = false;
			level = 1;
			xp = 0;
			xpMax = 10;
			xpInt = (int) xp;
			xpMaxInt = (int) xpMax;
			gold= 30;
			goldEarned= gold;
			Score=0;
			str= random.nextInt(4)+3;
			vit= random.nextInt(4)+3;
			def= random.nextInt(4)+2;
			dex= random.nextInt(3)+1;
			agi= random.nextInt(3)+1;

			limit -= ((str+vit)+(def+dex))+agi;

			if (limit>0)
			{
				choiceI = random.nextInt(4);
				switch(choiceI)
				{
					case 0:
						str += limit;
						break;
					case 1:
						vit +=limit;
						break;
					case 2:
						def += limit;
						break;
					case 3:
						dex += limit;
						break;
					case 4:
						agi += limit;
						break;
				}
			}

			hpMax= vit*10;
			hp=hpMax;
			d = str*0.8;
			dmg = (str + (int) d);
			dmgMin = dmg*0.8;
			dmgMinI = (int) dmgMin;
			acc = dex+accMinI;
			eva = agi+evaMinI;	

			critChance = 1 + (dex/2);
			accMin = dex*0.8;
			accMinI = (int) accMin;
			evaMin = agi*0.8;
			evaMinI = (int) evaMin;		

			savedGame = 1;
			SaveState.Save();
			Tutorial.TutOpt();

		}
		else Create();

	}



	// Random enemy stats generator ///////////	
	static void Encounter()
	{	
		LevelUP.update();
		from = 0;
		int limit = 20 + level;
		enemy = enemyList[(random.nextInt(enemyList.length-1))];

		choiceI = random.nextInt(20)+1;
		if (choiceI == 0)
		{
			SHOP.merch();
		}
		if (choiceI > 0 && choiceI <= 2 )
		{
			Display.Line();
			String a ="You found a Treasure Chest!";
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
			System.out.println("\n1.) Open Chest\t2.) Continue");
			choice = sc.next();

			switch(choice)
			{
				case "1":
					choiceI = random.nextInt(10)+1;
					if (choiceI < (3 + (level/3))  ) 
					{
						int b = random.nextInt(hpMax/(5-(level/10)));
						hp -= b;
						a = "The chest is trapped!\nYou took ";
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
						System.out.print(b);
						a = " damage!";
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
						Encounter();
					}
					else
					{
						int b = random.nextInt(level+1)+1;
						for (int i = 0; i<b; i++)
						{
							Display.Line();
							Loots.loot();
						}
						Encounter();
					}
			}
		}
		if (choiceI < 6 )
		{
			enemyStatus = "";
			Display.Line();
			String a = "You've encountered an Elite monster!";
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
			mobLvl = level+(random.nextInt(4)+2);
			extraLoot = mobLvl*(3/2);
			mobHealingAbility = 5;
		}

		else if (BossDefeated == 1)
		{
			mobLvl = bossEnc[boss];
			limit += 15;
			extraLoot = mobLvl*2;
			if (bossEnc[boss] == 100)
			{
				enemy = "Rudolph Agpoon";
				mobLvl = 100;
				extraLoot = mobLvl*3;
			} else
			{
				String pre = prefix[random.nextInt(prefix.length-1)];
				enemy = pre + enemy;
				enemyStatus = "BOSS";
				mobHealingAbility = 10;
				Display.Line();
				String a = "Boss Encountered!";
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

			}
		}
		else 
		{
			Display.Line();
			String a = "You have encountered an enemy!";
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
			enemyStatus = "";
			mobLvl= level+(random.nextInt(2));
			extraLoot = 0;
			mobHealingAbility = 3;
		}

		if (mobLvl>1)

		{
			limit += (mobLvl-1)*5;
		}

		mobMaxHp= mobLvl*10+(mobLvl*random.nextInt(10));
		mobHp=mobMaxHp;
		mobDef=mobLvl+(mobLvl*random.nextInt(1)+(random.nextInt(mobLvl*2)));
		mobDmg=mobLvl+(mobLvl*random.nextInt(4)+random.nextInt(mobLvl));
		mobDex=mobLvl+(mobLvl*random.nextInt(1)+random.nextInt(mobLvl));
		mobAgi=mobLvl+mobLvl*random.nextInt(1)+random.nextInt(mobLvl);
		xpDrop=mobLvl+random.nextInt(mobLvl+(mobLvl+(mobLvl*2)))*((random.nextInt(mobLvl)));
		goldDrop=random.nextInt(9);
		if (goldDrop<3)
		{
			goldDrop=(mobLvl+(random.nextInt(mobLvl*2))+(random.nextInt(mobMaxHp/10)));
		}
		else goldDrop = 0;

		limit -= ((mobMaxHp/10) +mobDef)+ (mobDmg+ mobDex) + mobAgi;

		if (limit>0)
		{
			choiceI = random.nextInt(4);
			if (choiceI == 0)
			{
				mobMaxHp += limit*10;
				mobHp =mobMaxHp;
			}
			else if (choiceI == 1 )
			{
				mobDmg +=limit;
			}
			else if (choiceI == 2 )
			{
				mobDef += limit;
			}
			else if (choiceI == 3 )
			{
				mobDex += limit;
			}
			else if (choiceI == 4 )
			{
				mobAgi += limit;
			}
		}

		mobCrit = 1 + (mobDex/2);
		mobDmgMin = (mobDmg*0.8);
		mobDmgMinI = (int) mobDmgMin;
		mobAccMin = (mobDex*0.8);
		mobAccMinI = (int) mobAccMin;
		mobEvaMin = (mobAgi*0.8);
		mobEvaMinI = (int) mobEvaMin;
		mobAcc= mobDex+mobAccMinI;
		mobEva= mobAgi+mobEvaMinI;

		if(goldDrop== 0)
		{
			Display.Line();
			System.out.println("\t\t\t" +enemy+ " Level " +mobLvl);
			System.out.println("\t\t\tHP: " +mobHp+ "/" +mobMaxHp+ "\n\t\t\tDMG: " +mobDmgMinI+ "-" +mobDmg+  "\tDEF: " +mobDef+ "\n\t\t\tDEX: " +mobDex+ "\t\tAGI: " +mobAgi+ "\n\t\t\tExp Gain: " +xpDrop);
		} else Display.enemyInfo();


		System.out.println("\n" +player+ " Level " +level);
		System.out.println("HP: " +hp+ "/" +hpMax+ "\nEXP: " +xpInt+ "/" +xpMaxInt+ "\nDMG: " +(dmgMinI+wpnDmgMin)+ "-" +(dmg+wpnDmg)+ "\tDEF: " +def+ "\nDEX: " +dex+ "\t\tAGI: " +agi); 	
		System.out.println("\n1.) Fight\t2.) Go back");
		choice = sc.next();

		switch(choice)
		{
			case "1":
				Fight.Fight();
				break;
			case "2":
				Display.home();
				break;
			default:
				failSafe();
				break;
		}
	}

// FailSafe ://////////////////////////////////
	static void failSafe()
	{
		String sEnemy = enemy;
		int sMobLvl = mobLvl;
		int sMobMaxHp = mobMaxHp;
		int sMobHp = mobHp;
		int sMobDmg = mobDmg;
		int sMobDmgMin = mobDmgMinI;
		int sMobDef = mobDef;
		int sMobDex = mobDex;
		int sMobAgi = mobAgi;
		int sXpDrop = xpDrop;
		int sGoldDrop = goldDrop;


		if(sGoldDrop == 0)
		{
			Display.Line();
			System.out.println("\t\t\t" +sEnemy+ " Level " +sMobLvl);
			System.out.println("\t\t\tHP: " +sMobHp+ "/" +sMobMaxHp+ "\n\t\t\tDMG: " +sMobDmgMin+ "-" +sMobDmg+ "\tDEF: " +sMobDef+ "\n\t\t\tDEX: " +sMobDex+ "\t\tAGI: " +sMobAgi+ "\n\t\t\tExp Gain: " +sXpDrop);		
		}
		else
		{
			Display.Line();
			System.out.println("\t\t\t" +sEnemy+ " Level " +sMobLvl);
			System.out.println("\t\t\tHP: " +sMobHp+ "/" +sMobMaxHp+ "\n\t\t\tDMG: " +sMobDmgMin+ "-" +sMobDmg+ "\tDEF: " +sMobDef+ "\n\t\t\tDEX: " +sMobDex+ "\t\tAGI: " +sMobAgi+ "\n\t\t\tExp Gain: " +sXpDrop+ "\n\t\t\tGold Drop: " +sGoldDrop);
		}

		System.out.println("\n" +player+ " Level " +level);
		System.out.println("HP: " +hp+ "/" +hpMax+ "\nEXP: " +xpInt+ "/" +xpMaxInt+ "\nDMG: " +(dmgMinI+wpnDmgMin)+ "-" +(dmg)+ "\tDEF: " +def+ "\nDEX: " +dex+ "\t\tAGI: " +agi); 	
		System.out.println("\n1.) Fight\t2.) Go back");
		choice = sc.next();

		switch(choice)
		{
			case "1":
				Fight.Fight();
				break;
			case "2":
				Display.home();
				break;
			default:
				failSafe();
				break;
		}
	}

	static void fs2()
	{
	Display.Line();
	String a = "As you go on a hunt, you\nsuddenly heard hooves striking\nthe earth...";
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
		System.out.println("\nYou found a merchant...");

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

	case "2":
		Encounter();
		break;
	}
	}
}
