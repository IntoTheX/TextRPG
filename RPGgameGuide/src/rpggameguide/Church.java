public class Church extends Game
{
	// A place to heal ////////////////////////	
	static void Church()
	{
		Display.Line();		
		System.out.println("PRIEST: Welcome to the church,\nhow can I be of service?");
		Display.goldDisplay();
		System.out.println("1.) Heal \n2.) Go back");
		choice = sc.next();

		switch(choice)
		{
			case "1":
				Heal();
				break;
			case "2":
				Display.home();
				break;
			default:
				Church();
				break;
		}
	}

// Healing magic ////////////////////////////
	static void Heal()
	{
		int fullfee= ((hpMax-hp)/10)*2, halffee= fullfee/2;

		Display.Line();
		System.out.println("PRIEST: I can completely heal you for\nonly " +fullfee+ " Gold or I can heal you by 50% for\nonly " +halffee+ " Gold.");
		Display.goldDisplay();
		System.out.println("1.) Full Heal\n2.) Half Heal\n3.) Go back");
		choice = sc.next();

		switch(choice)
		{
			case "1":
				if (gold>=fullfee)
				{
					if (hp==hpMax)
					{
						Display.Line();
						System.out.println("You are already at full health!");
						Heal();
					} 
					else
					{
						healed= hpMax-hp;
						hp = hpMax;
						gold -= fullfee;
						Display.Line();
						System.out.println("You've been completely healed!");
						dynamicHealing();
						Display.home();
					}
				} 
				else
				{
					Display.Line();
					System.out.println("Insufficient gold!");
					Heal();
				}			
				break;
			case "2":
				if (gold>=halffee)
				{
					if (hp==hpMax)
					{
						Display.Line();
						System.out.println("You are already at full health!");
						Heal();
					} 
					else
					{
						healed = (hpMax-hp)/2;
						hp += (hpMax-hp)/2;
						gold -= halffee;
						Display.Line();
						System.out.println("You've been healed by half of\nyour health points!");
						dynamicHealing();
						excess();
						Display.home();
					}
				} 
				else
				{
					Display.Line();
					System.out.println("Insufficient gold!");
					Heal();
				}	
				SaveState.Save();
				break;
			case "3":
				Church();
				break;
			default:
				Heal();
				break;
		}
	} 
	
	// For excess hp //////////////////////////
	static void excess()
	{
		if (hp>hpMax)
		{
			exc = hp%hpMax;
			hp = hp-exc;
		}
	}

// dynamic HP dialogues //////////////
	static void	dynamicHealing()
	{
		Display.Line();
		System.out.println("You have recovered " +healed+ " HP!");
		exc=0;
		healed = 0;
	}	
	
}
