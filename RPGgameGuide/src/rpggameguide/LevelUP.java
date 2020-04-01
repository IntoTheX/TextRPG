public class LevelUP extends Game
{
	// Level up Field ////////////////////////
	static void lvlup()
	{	
		savedGame = 1;
		level++;
		sp += 5;
		hp += (vit*10)*0.3;
		Church.excess();

		str += random.nextInt(9)%2;
		vit += random.nextInt(9)%2;
		def += random.nextInt(9)%2;
		dex += random.nextInt(9)%2;
		Display.Line();
		String a = "\nLevel UP! You are now Level ";
		for (int i = 0; i < a.length(); i++)
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
		System.out.print(level);
		a = ".\nYou have ";
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
		System.out.print(sp);
		a = " stat points...\n";
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
		xp -= xpMax;
		xpMax += xpMax*0.5;
		xpInt = (int) xp;
		xpMaxInt = (int) xpMax;

		if (xp < 0)
		{
			xp = 0;
		}

		dmgMin = (dmg*0.8);
		dmgMinI = (int) dmgMin;
		critChance = 1 + (dex/2);

		SaveState.Save();

		if (level == bossEnc[boss])
		{
			BossDefeated = 1;
		}

		if (from == 1)
		{
			Display.statWindow();
			System.out.println("\n1.) Increase stats\n2.) Go back");
			choice=sc.next();

			switch(choice)
			{
				case "1":
					statIncrease();
					from = 4;
					break;
				case "2":
					Display.home();
					break;
			}
		}
		else
		{
			System.out.println("\n1.) Continue hunting\n2.) Increase Stats\n3.) Go back to town");
			choice=sc.next();
			update();

			switch(choice)
			{	
				case "1":
					if (from == 2)
					{
						Generator.failSafe();
					}
					else Generator.Encounter();
					break;
				case "2":
					statIncrease();
					from = 3;
					break;
				case "3":
					Display.home();	
					break;
				default:
					lvlup();
					break;
			}
		}
	}

	// For a dynamic leveling up stuff /////////////
	static void statIncrease()
	{
		Display.statWindow();
		Display.Line();
		System.out.println("\nYou have " +sp+ " stat points left…");
		System.out.println("Increase which stat?\n1.) STR\t2.) VIT\n3.) DEF\t4.) DEX\n5.) AGI\t6.) Go back");
		choice = sc.next();

		switch(choice)
		{
			case "1":
				Display.Line();
				System.out.println("\nRaise STR by how many points?");
				choiceI = sc.nextInt();

				if (choiceI>sp)
				{
					Display.Line();
					System.out.println("Insufficient Stat points!");
					statIncrease();
				}
				else
				{
					str += choiceI;
					sp -= choiceI;
					savedGame = 1;
					SaveState.Save();
					update();
				}

				if (sp>0)
				{
					statIncrease();
				} else Display.home();
				break;
			case "2":
				Display.Line();
				System.out.println("\nRaise VIT by how many points?");
				choiceI = sc.nextInt();

				if (choiceI>sp)
				{
					Display.Line();
					System.out.println("Insufficient Stat points!");
					statIncrease();
				}
				else
				{
					vit += choiceI;
					sp -= choiceI;
					savedGame = 1;
					SaveState.Save();
					update();
				}
				if (sp>0)
				{
					statIncrease();
				} else Display.home();
				break;
			case "3":
				Display.Line();
				System.out.println("\nRaise DEF by how many points?");
				choiceI = sc.nextInt();

				if (choiceI>sp)
				{
					Display.Line();
					System.out.println("Insufficient Stat points!");
					statIncrease();
				}
				else
				{
					def += choiceI;
					sp -= choiceI;
					savedGame = 1;
					SaveState.Save();
					update();
				}
				if (sp>0)
				{
					statIncrease();
				} else Display.home();
				break;
			case "4":
				Display.Line();
				System.out.println("\nRaise DEX by how many points?");
				choiceI = sc.nextInt();

				if (choiceI>sp)
				{
					Display.Line();
					System.out.println("Insufficient Stat points!");
					statIncrease();
				}
				else
				{
					dex += choiceI;
					sp -= choiceI;
					statIncrease();
					savedGame = 1;
					SaveState.Save();
					update();
				}
				if (sp>0)
				{
					statIncrease();
				}
				else Display.home();
				break;
			case "5":
				Display.Line();
				System.out.println("\nRaise AGI by how many points?");
				choiceI = sc.nextInt();

				if (choiceI>sp)
				{
					Display.Line();
					System.out.println("Insufficient Stat points!");
					statIncrease();
				}
				else
				{
					agi += choiceI;
					sp -= choiceI;
					savedGame = 1;
					SaveState.Save();
					update();
				}
				if (sp>0)
				{
					statIncrease();
				} else Display.home();
				break;
			case "6":
				switch(from)
				{
					case 3:
						savedGame = 1;
						SaveState.Save();
						Generator.Encounter();
						break;
					case 4:
						savedGame = 1;
						SaveState.Save();
						Display.home();
						break;
				}
				break;
			default:
				statIncrease();
				break;
		}
	}

	// Usefull when it comes to stats increase /////
	static void update()
	{
		d = str*0.8;
		hpMax= vit*10;
		dmg=str+ (int) d;
		dmgMin=	dmg*0.8;
		dmgMinI = (int) dmgMin;

		acc = dex+accMinI;
		eva = agi+evaMinI;	

		critChance = 1 + (dex/2);
		accMin = dex*0.8;
		accMinI = (int) accMin;
		evaMin = agi*0.8;
		evaMinI = (int) evaMin;	

		xpInt = (int) xp;
		xpMaxInt = (int) xpMax;
	}

	static void ItemUpdate()
	{
		ItemQty[0] = shp;
		ItemQty[1] = mhp;
		ItemQty[2] = lhp;
		ItemQty[3] = pos;
		ItemQty[4] = pov;
		ItemQty[5] = pod;
		ItemQty[6] = podex;
		ItemQty[7] = poa;
		ItemQty[8] = poxp;
		ItemQty[9] = por;
		ItemQty[10] = gp;
		ItemQty[11] = ankh;
		
		WpnQty[0] = kd;
		WpnQty[1] = dg;
		WpnQty[2] = ss;
		WpnQty[3] = rs;
		
		ifEquipped[0] = knuckleduster;
		ifEquipped[1] = dagger;
		ifEquipped[2] = shortSword;
		SaveState.Save();
	}
}
