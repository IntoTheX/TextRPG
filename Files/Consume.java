public class Consume extends Game
{
	// POTS //////////////////////////////
	static void smallHpPot()
	{
		hp += 20;
		Church.excess();
	}

	static void medHpPot()
	{
		hp += 50;
		Church.excess();
	}

	static void largeHpPot()
	{
		hp +=100;
		Church.excess();
	}

	static void potOfStr()
	{
		str++;
	}

	static void potOfVit()
	{
		vit++;
	}

	static void potOfDef()
	{
		def++;
	}

	static void potOfDex()
	{
		dex++;
	}

	static void potOfAgi()
	{
		agi++;
	}

	static void potOfExp()
	{
		xp += xpMaxInt;
		LevelUP.lvlup();
	}
	
	static void potOfRand()
	{
		choiceI = random.nextInt(4);
		switch(choiceI)
		{
		case 0:
			vit++;
			System.out.println("Vitality UP!");
			break;
		case 1:
			str++;
			System.out.println("Strength UP!");
			break;
		case 2:
			def++;
			System.out.println("Defence UP!");
			break;
		case 3:
			dex++;
			System.out.println("Dexterity UP!");
			break;
		case 4:
			agi++;
			System.out.println("Agility UP!");
			break;
		}
	}
	
	static void GodlyPot()
	{
		vit++;
		str++;
		def++;
		agi++;
		dex++;
		System.out.println("All stats incresed!");
	}
	
	// Revival item ////////////////////////
	static void Ankh()
	{
		hp = hpMax;
		ankh -=1;
		Display.Line();		
		System.out.println("You have been revived by the power\nof the ankh");
		SaveState.Save();
		Generator.failSafe();
	}
	
}
