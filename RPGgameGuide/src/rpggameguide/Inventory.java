public class Inventory extends Game
{
	// Inventory /////////////////////////////	
	static void Inventory()
	{
		LevelUP.ItemUpdate();
		int[] Items = ItemQty;
		Display.Line();
		System.out.println("Enter the codes enclosed with '' to\nconsume item or enter 'b' to go back\n");
		for (int i = 0; i<ItemNames.length; i++)
		{ 
			if (Items[i]>0)
			{
				System.out.print((shopCount+1)+ ".) " +ItemNames[i]+ " " +ItemQty[i]+ "x '" +ItemCode[i]+ "'\n");
				shopCount++;
			}

		}
		System.out.println((shopCount+1)+ ".) Equipments 'e'");
		System.out.println((shopCount+2)+ ".) Go back 'b'");
		choice = sc.next();

		switch(choice)
		{
			case "shp":
				if (shp>0)
				{
					if (hp==hpMax)
					{
						Display.Line();
						System.out.println("You are already at full health!");
						shopCount = 0;
						Inventory();
					} else
					{
						shp--;
						Consume.smallHpPot();
						Church.excess();
						if(exc>0)
						{
							healed = 20-exc;
							Church.dynamicHealing();
							healed = 0;
							shopCount = 0;
							Inventory();
						}
						else
						{
							Display.Line();
							System.out.println("Consumed Small HP Potion, you recovered 20 HP.");
							shopCount = 0;
							Inventory();
						}
					}
				}
				else 
				{
					Display.Line();
					System.out.println("You have no Small HP Potion!");
					shopCount = 0;
					Inventory();
				}
				break;
			case "mhp":
				if (mhp>0)
				{
					if (hp==hpMax)
					{
						Display.Line();
						System.out.println("You are already at full health!");
						shopCount = 0;
						Inventory();
					}
					else
					{
						mhp--;
						Consume.medHpPot();
						Church.excess();
						if(exc>0)
						{
							healed= 50-exc;
							Church.dynamicHealing();
							healed = 0;
							shopCount = 0;
							Inventory();
						}
						else
						{
							Display.Line();
							System.out.println("Consumed Medium HP Potion, you recovered 50 HP.");	
							shopCount = 0;
							Inventory();
						}
					}
				}
				else 
				{
					Display.Line();
					System.out.println("You have no Medium HP Potion!");
					shopCount = 0;
					Inventory();
				}
				break;
			case "lhp":
				if (lhp>0)
				{
					if (hp==hpMax)
					{
						Display.Line();
						System.out.println("You are already at full health!");
						shopCount = 0;
						Inventory();
					}
					else
					{
						lhp--;
						Consume.largeHpPot();
						Church.excess();
						if(exc>0)
						{
							healed= 100-exc;
							Church.dynamicHealing();
							healed = 0;
							shopCount = 0;
							Inventory();
						}
						else
						{
							Display.Line();
							System.out.println("Consumed Large HP Potion, you recovered 100 HP.");
							shopCount = 0;
							Inventory();
						}
					}
				}
				else 
				{
					Display.Line();
					System.out.println("You have no Large HP Potion!");
					shopCount = 0;
					Inventory();
				}
				break;
			case "pos":
				if (pos>0)
				{			
					pos--;
					Consume.potOfStr();
					Display.Line();
					System.out.println("Consumed Potion of Strength, you gained 1 STR.");
					shopCount = 0;
					Inventory();
				}				
				else 
				{
					Display.Line();
					System.out.println("You have no Potion of Strength!");
					shopCount = 0;
					Inventory();
				}
				break;
			case "pov":
				if (pov>0)
				{
					pov--;
					Consume.potOfVit();
					Display.Line();
					System.out.println("Consumed Potion of Vitality, you gained 1 VIT.");
					shopCount = 0;
					Inventory();
				}
				else 
				{
					Display.Line();
					System.out.println("You have no Potion of Vitality!");
					shopCount = 0;
					Inventory();
				}
				break;
			case "pod":
				if (pod>0)
				{
					pod--;
					Consume.potOfDef();
					Display.Line();
					System.out.println("Consumed Potion of Defense, you gained 1 DEF.");
					shopCount = 0;
					Inventory();
				}
				else 
				{
					Display.Line();
					System.out.println("You have no Potion of Defense!");
					shopCount = 0;
					Inventory();
				}
				break;
			case "podex":
				if (podex>0)
				{
					podex--;
					Consume.potOfDex();
					Display.Line();
					System.out.println("Consumed Potion of Dexterity, you gained 1 DEX.");
					shopCount = 0;
					Inventory();
				}
				else 
				{
					Display.Line();
					System.out.println("You have no Potion of Dexterity!");
					shopCount = 0;
					Inventory();
				}
				break;
			case "poa":
				if (poa>0)
				{
					poa--;
					Consume.potOfAgi();
					Display.Line();
					System.out.println("Consumed Potion of Agility, you gained 1 AGI.");
					shopCount = 0;
					Inventory();
				}
				else 
				{
					Display.Line();
					System.out.println("You have no Potion of Agility!");
					shopCount = 0;
					Inventory();
				}
				break;
			case "pox":
				if (poxp>0)
				{
					poxp--;
					Display.Line();
					System.out.println("Consumed Potion of Experience!");
					Consume.potOfExp();
					shopCount = 0;
					Inventory();
				}
				else 
				{
					Display.Line();
					System.out.println("You have no Potion of Experience!");
					shopCount = 0;
					Inventory();
				}
				break;
			case "por":
				if (por>0)
				{
					por--;
					Display.Line();
					System.out.println("Consumed Potion of Randomness!");
					Consume.potOfRand();
					shopCount = 0;
					Inventory();
				}
				else 
				{
					Display.Line();
					System.out.println("You have no Potion of Randomness!");
					shopCount = 0;
					Inventory();
				}
				break;
			case "gp":
				if (gp>0)
				{
					gp--;
					Display.Line();
					System.out.println("Consumed Godly Potion!");
					Consume.GodlyPot();
					shopCount = 0;
					Inventory();
				}
				else 
				{
					Display.Line();
					System.out.println("You have no Godly Potion!");
					shopCount = 0;
					Inventory();
				}
				break;
			case "ankh":
				Display.Line();
				System.out.println("Ankh " +ankh+ "x\n-(Passive)Resurrects you after death.\nThe ankh shatters after revival.");
				System.out.println("1.) Go back");
				choiceI =sc.nextInt();
				if (choiceI == 1 )
				{
					shopCount = 0;
					Inventory();
				}
				break;
			case "b":
				if (from == 1 )
				{
					from = 0;
					shopCount = 0;
					Display.home();	
				}
				else if (from == 2 )
				{
					from = 0;
					shopCount = 0;
					Fight.Fight();	
				}
				SaveState.Save();
				break;
			case "e":
				shopCount = 0;
				Equipment();
				break;
			default:
				shopCount = 0;
				Inventory();
				break;		
		}
	}
	
	static void Equipment()
	{
		LevelUP.ItemUpdate();
		int[] wpns = WpnQty;
		Display.Line();	
		for (int i = 0; i < WpnQty.length; i++)
		{
			if (wpns[i]>0)
			{
				System.out.println((shopCount+1)+ ") " +WpnNames[i]);
				shopCount++;
			}
		}
			System.out.println((shopCount+1)+ ") Go back 'b'");
			choice = sc.next();

			switch(choice)
			{
				//: knuckleduster//////////////////
				case "kd":
					Display.Line();
					System.out.println(" -deals 3-5 damage and 5 extra DEX\n -this weapon scales with agility");
					if (equip == 0)
					{
						System.out.println("1.) Equip\t2.) Go back");
						choice = sc.next();
						
						switch(choice)
						{
							case "1":
								if (equip == 2)
								{
									dex = dex - 5;
									critChance = critChance - 5;
								}
								else if ( equip == 4)
								{
									def = def - 5;
								}
								equip = 1;
								knuckleduster = true;
								dagger = false;
								shortSword = false;
								roundShield = false;
								equipped();
								System.out.println("Equipped "+WpnNames[0]);
								Display.home();
								break;
							case "2":
								Equipment();
								break;
							default:
								Equipment();
								break;
						}
					}
					else
					{
						System.out.println("1.) Unequip\t2.) Go back");
						choice = sc.next();

						switch(choice)
						{
							case "1":
								equip = 0;
								knuckleduster = false;
								dagger = false;
								shortSword = false;
								roundShield = false;
								dex = dex - 5;
								equipped();
								System.out.println("Unequipped "+WpnNames[0]);
								Display.home();
								break;
							case "2":
								Equipment();
								break;
							default:
								Equipment();
								break;
						}
					}
					break;
				//: dagger ///////////////////////
				case "d":
					Display.Line();
					System.out.println(" -deals 5-7 dmg and 5% +\n(dex*0.2) chance to deal 150%-300%\ncritical hit\n -this weapon scales with dexterity");
					if (equip == 0)
					{
						System.out.println("1.) Equip\t2.) Go back");
						choice = sc.next();

						switch(choice)
						{
							case "1":
								equip = 2;
								knuckleduster = false;
								dagger = true;
								shortSword = false;
								roundShield = false;
								equipped();
								System.out.println("Equipped "+WpnNames[1]);
								Display.home();
								break;
							case "2":
								Equipment();
								break;
							default:
								Equipment();
								break;
						}
					}
					else
					{
						System.out.println("1.) Unequip\t2.) Go back");
						choice = sc.next();

						switch(choice)
						{
							case "1":
								if (equip == 2)
								{
									dex = dex - 5;
									critChance = critChance - 5;
								}
								else if ( equip == 4)
								{
									def = def - 5;
								}
								equip = 0;
								knuckleduster = false;
								dagger = false;
								shortSword = false;
								roundShield = false;
								equipped();
								System.out.println("Unequipped "+WpnNames[1]);
								Display.home();
								break;
							case "2":
								Equipment();
								break;
							default:
								Equipment();
								break;
						}
					}
					break;
				//: short sword////////////////////
				case "ss":
					Display.Line();
					System.out.println(" -deals 8-10 damage\n -this weapon scales with strength");
					if (equip == 0)
					{
						System.out.println("1.) Equip\t2.) Go back");
						choice = sc.next();

						switch(choice)
						{
							case "1":
								if (equip == 2)
								{
									dex = dex - 5;
									critChance = critChance - 5;
								}
								else if ( equip == 4)
								{
									def = def - 5;
								}
								equip = 3;
								knuckleduster = false;
								dagger = false;
								shortSword = true;
								roundShield = false;
								equipped();
								System.out.println("Equipped "+WpnNames[2]);
								Display.home();
								break;
							case "2":
								Equipment();
								break;
							default:
								Equipment();
								break;
						}
					}
					else
					{
						System.out.println("1.) Unequip\t2.) Go back");
						choice = sc.next();

						switch(choice)
						{
							case "1":
								equip = 0;
								knuckleduster = false;
								dagger = false;
								shortSword = false;
								roundShield =false;
								equipped();
								System.out.println("Unequipped "+WpnNames[2]);
								Display.home();
								break;
							case "2":
								Equipment();
								break;
							default:
								Equipment();
								break;
						}
					}
					break;
				case "rs":
					Display.Line();
					System.out.println(" -deals 3-4 damage\n -this weapon scales 'faster' with\ndefense");
					if (equip == 0)
					{
						System.out.println("1.) Equip\t2.) Go back");
						choice = sc.next();

						switch(choice)
						{
							case "1":
								if (equip == 2)
								{
									dex = dex - 5;
									critChance = critChance - 5;
								}
								else if ( equip == 4)
								{
									def = def - 5;
								}
								equip = 4;
								knuckleduster = false;
								dagger = false;
								shortSword = false;
								roundShield = true;
								equipped();
								System.out.println("Equipped "+WpnNames[2]);
								Display.home();
								break;
							case "2":
								Equipment();
								break;
							default:
								Equipment();
								break;
						}
					}
					else
					{
						System.out.println("1.) Unequip\t2.) Go back");
						choice = sc.next();

						switch(choice)
						{
							case "1":
								if (equip == 2)
								{
									dex = dex - 5;
									critChance = critChance - 5;
								}
								else if ( equip == 4)
								{
									def = def - 5;
								}
								equip = 0;
								knuckleduster = false;
								dagger = false;
								shortSword = false;
								roundShield =false;
								equipped();
								System.out.println("Unequipped "+WpnNames[2]);
								Display.home();
								break;
							case "2":
								Equipment();
								break;
							default:
								Equipment();
								break;
						}
					}
					break;
				case "b":
					if (from == 1 )
				{
						from = 0;
						shopCount = 0;
						Display.home();	
					}
					else if (from == 2 )
					{
						from = 0;
						shopCount = 0;
						Fight.Fight();	
					}
					SaveState.Save();
					break;
				default:
					shopCount = 0;
					Equipment();
					break;
			}
	}
}
