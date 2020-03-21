public class Fight extends Game
{
	// The Arena //////////////////////////////////
	static void Fight()
	{	
		Display.enemyInfo();
		Church.excess();
		System.out.println(player+ " Level " +level);
		System.out.println("HP: " +hp+ "/" +hpMax+ "\nEXP: " +xpInt+ "/" +xpMaxInt+ "\nDMG: " +(dmgMinI+wpnDmgMin)+ "-" +(dmg+wpnDmg)+ "\tDEF: " +def+ "\nDEX: " +dex+ "\t\tAGI: " +agi);


		System.out.println("\n1.) Attack\t2.) Items\n3.) Run");
		choice = sc.next();	

		switch(choice)
		{
			case "1":
				Attack();
				break;
			case "2":
				from = 2;
				Inventory.Inventory();
				break;
			case "3":
				int chance;
				chance= random.nextInt(10)+1;

				if (chance>3)
				{
					Display.Line();
					String a = "You have successfully escaped!";
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
					Display.home();
				}
				else
				{
					Display.Line();
					String b = "Failed to escape!\n";
					for (int i = 0; i < b.length(); i++)
					{
						try
						{
							Thread.sleep(40);
							System.out.print(b.charAt(i));
						}
						catch (Exception e)
						{
							System.out.println(". . .");
						}
					}
					int hit = random.nextInt(mobDmg);

					hp -= hit;
					System.out.println(enemy+ " hits " +player+ " for " +hit);

					if (hp<=0)
					{
						Deaths.Death();
					}

					Fight();


				}
				break;
			default:
				Fight();
				break;
		}

	}

	// blah ://///////////////////////////
	static void action()
	{
		double defMin = (def*0.8), mobDefMin = (mobDef*0.8);
		int mobFDmg=0, fDmg=0, randDef=0, randMobDef=0, turn=0, mobTurn=0, defMinI = (int) defMin, mobDefMinI = (int) mobDefMin, randDmg=0, randMobDmg;
		if (dex>mobDex)
		{
			turn = dex/mobDex;
			extra = dex%mobDex;

			if (extra >= mobDex)
			{
				turn++;
				extra -= mobDex;
			}
			mobTurn =1;
		}
		else
		{
			mobTurn = mobDex/dex;
			extra = mobDex%dex;

			if (extra >= dex)
			{
				mobTurn++;
				extra -= dex;
			}
			turn =1;

		}


		for (int i=turn; i>0; i--)
		{
			totalDmg = dmg + wpnDmg;
			totalDmgMin = dmgMinI + wpnDmgMin;
			randDmg = random.nextInt(totalDmg) + totalDmgMin;
			while (randDmg > dmg && randDmg < dmgMinI )
			{
				randDmg = random.nextInt(totalDmg) + totalDmgMin;
			}
			randMobDef = (random.nextInt(mobDef)+mobDefMinI);

			choiceI = random.nextInt(100);
			if (choiceI <= critChance)
			{
				choiceI = random.nextInt(9);
				if (choiceI < 5)
				{
					randDmg = randDmg + (randDmg/2);
				}
				else if (choiceI > 5 && choiceI < 8)
				{
					randDmg *= 2;
				}
				else if (choiceI > 7)
				{
					randDmg *= 3;
				}
				atkstt = "crit";
			} else atkstt = "";

			if (randDmg<randMobDef)
			{
				System.out.println(enemy+ " blocked " +player+ "'s attack!");
			}
			else if (randMobDef<randDmg)
			{
				mobFDmg = randDmg-randMobDef;
				mobHp -= mobFDmg;

				if (atkstt == "crit")
				{
					try
					{
					Thread.sleep(500);
					System.out.println(player+ " CRITICALLY hits " +enemy+ " for " +mobFDmg);
					}
					catch(Exception e)
					{
						System.out.println("Err...");
					}
				} else
					try
					{
					Thread.sleep(400);
					System.out.println(player+ " hits " +enemy+ " for " +mobFDmg);
					}
					catch(Exception e)
					{
						System.out.println("Uhmm...");
					}
			}
		}

		if (mobHp<(mobMaxHp/3))
		{
			if (mobHealingAbility>0)
			{
				if(healingCooldown == 0)
				{
					mobHealingAbility--;
					healed = random.nextInt(mobMaxHp/3)+(mobMaxHp/5);
					mobHp += healed;
					try
					{
						Thread.sleep(400);
					System.out.println(enemy+ " healed for " +healed);
					}
					catch(Exception e)
					{
						System.out.println("Err...");
					}
					healingCooldown = 5;
				}
				else
				{
					for (int i=mobTurn; i>0; i--)
					{
						try
						{
							Thread.sleep(500);
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
						randMobDmg = random.nextInt(mobDmg)+mobDmgMinI;
						randDef= (random.nextInt(def)+defMinI);
						choiceI = random.nextInt(100);
						if (choiceI <= mobCrit)
						{
							choiceI = random.nextInt(9);
							if (choiceI < 5)
							{
								randMobDmg = randMobDmg + (randMobDmg/2);
							}
							else if (choiceI > 5 && choiceI < 8)
							{
								randMobDmg *= 2;
							}
							else if (choiceI > 7)
							{
								randMobDmg *= 3;
							}
							atkstt = "crit";
						} else atkstt = "";
						if (randMobDmg<randDef)
						{
							System.out.println(player+ " blocked " +enemy+ "'s attack");
						}
						else if (randDef<mobDmg)
						{
							fDmg = mobDmg-randDef;
							hp -= fDmg;

							if (atkstt == "crit")
							{
								try
								{
									Thread.sleep(600);
								System.out.println(enemy+ " CRITICALLY hits " +player+ " for " +fDmg);
								}
								catch(Exception e)
								{
									System.out.println("Err...");
								}
							} else 
							try
							{
								Thread.sleep(400);
							System.out.println(enemy+ " hits " +player+ " for " +fDmg);
							}
							catch (Exception e)
							{
								System.out.println("Uhmm...");
							}
						}
					}
				}
			}
			else
			{
				for (int i=mobTurn; i>0; i--)
				{
					try
					{
						Thread.sleep(500);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					randMobDmg = random.nextInt(mobDmg)+mobDmgMinI;
					randDef= (random.nextInt(def)+defMinI);
					choiceI = random.nextInt(100);
					if (choiceI <= mobCrit)
					{
						choiceI = random.nextInt(9);
						if (choiceI < 5)
						{
							randMobDmg = randMobDmg + (randMobDmg/2);
						}
						else if (choiceI > 5 && choiceI < 8)
						{
							randMobDmg *= 2;
						}
						else if (choiceI > 7)
						{
							randMobDmg *= 3;
						}
						atkstt = "crit";
					} else atkstt = "";
					if (randMobDmg<randDef)
					{
						System.out.println(player+ " blocked " +enemy+ "'s attack");
					}
					else if (randDef<mobDmg)
					{
						fDmg = mobDmg-randDef;
						hp -= fDmg;

						if (atkstt == "crit")
						{
							try
							{
								Thread.sleep(400);
								System.out.println(enemy+ " hits " +player+ " for " +fDmg);
							}
							catch (Exception e)
							{
								System.out.println("Uhmm...");
							}
						}	
					}		
				}
			}
		}
		else
		{
			for (int i=mobTurn; i>0; i--)
			{
				randMobDmg = random.nextInt(mobDmg)+mobDmgMinI;
				randDef= (random.nextInt(def)+defMinI);
				choiceI = random.nextInt(100);
				if (choiceI <= mobCrit)
				{
					choiceI = random.nextInt(9);
					if (choiceI < 5)
					{
						randMobDmg = randMobDmg + (randMobDmg/2);
					}
					else if (choiceI > 5 && choiceI < 8)
					{
						randMobDmg *= 2;
					}
					else if (choiceI > 7)
					{
						randMobDmg *= 3;
					}
					atkstt = "crit";
				} else atkstt = "";
				if (randMobDmg<randDef)
				{
					System.out.println(player+ " blocked " +enemy+ "'s attack");
				}
				else if (randDef<mobDmg)
				{
					fDmg = mobDmg-randDef;
					hp -= fDmg;

					if (atkstt == "crit")
					{
						try
						{
							Thread.sleep(400);
							System.out.println(enemy+ " hits " +player+ " for " +fDmg);
						}
						catch (Exception e)
						{
							System.out.println("Uhmm...");
						}
					}
				}

				if (healingCooldown>0)
				{
					healingCooldown--;
				}
			}
		}
	}
// The Action ////////////////////////////
	static void Attack()
	{
		LevelUP.update();
		int randEva, randAcc, randMobAcc, randMobEva;
		randEva = random.nextInt(eva)+evaMinI;
		randAcc = random.nextInt(acc)+accMinI;
		randMobEva = random.nextInt(mobEva)+mobEvaMinI;
		randMobAcc =  random.nextInt(mobAcc)+mobAccMinI;
		Display.Line();
		if (randAcc < randMobEva)
		{
			choiceI = random.nextInt(1);
			if (choiceI == 0)
			{
				System.out.println(enemy+ " evaded " +player+ "'s attack!");
			} else 
			{
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				System.out.println(enemy+ " dodged " +player+ "'s attack!");
			}
		} else if (randMobAcc<randEva)
		{
			choiceI = random.nextInt(1);
			if (choiceI == 0)
			{
				System.out.println(player+ " evaded " +enemy+ "'s attack!");
			} else
			{		
				System.out.println(player+ " dodged " +enemy+ "'s attack!");
			}
		}
		action();


		if (hp<=0)
		{
			Deaths.Death();
		}
		else if (mobHp<=0)
		{
			Deaths.enemyDeath();
		}
		else Fight();
	}

}
