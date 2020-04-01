import java.util.*;
import java.io.*;

//import org.apache.http.conn.util.*;

import java.util.zip.*;
import javax.crypto.*;
public class Game
{	protected static int extra, BossDefeated, savedGame = 0, shopCount, gift, choiceI, equip=0, count= 0, fc=0, fc2=0, str, vit, def, dex, agi, cDmg, dmg, dmgMinI, totalDmg,totalDmgMin, critChance = 1, wpnDmg=0, wpnDmgMin=0, acc, accMinI, eva, evaMinI, hp, hpMax, level=1, xpInt, xpMaxInt, sp=0, mobLvl, mobHp, mobMaxHp, mobDmg, mobDmgMinI, mobCrit = 1, mobDef,  mobDex, mobAgi, mobAcc, mobAccMinI, mobEva, mobEvaMinI, mobHealingAbility, healingCooldown, boss = 0, gold, goldDrop, xpDrop, shp, mhp, lhp, pos, pov, pod, podex, poa, poxp, por, gp, mshp, mmhp, mlhp, mpos,mpov,mpod, mpodex, mpoa, mpox, mpor, mgp, mankh, kd, dg, ss, rs, healed, exc=0, ankh, ankhPrice=100, enemiesKilled=0, Score=0, highScore=245520, lvlHighScore= 8, goldEarned, from=0, extraLoot, effect = 0, randDmg, randMobDef, mobFDmg;
	protected static double d, dmgMin, accMin, evaMin, mobDmgMin, mobAccMin, mobEvaMin, xp=0, xpMax=10;	
	protected static String path, choice, atkstt, player= "", playerHighScore= "[]", enemy, enemyStatus = "";
	protected static boolean knuckleduster, dagger, shortSword, roundShield;
	protected static Random random= new Random();
	protected static Scanner sc = new Scanner(System.in);	
	protected static String[] enemyList = {"Rat", "Gnoll", "Bat", "Crab", "Gnoll Shaman", "Skeleton", "Wraith", "Thief", "Trickster", "Robot", "Ogre", "Cyclops", "Monk", "Warlock", "Imp", "Succubus", "Flies", "Bees", "Scorpion", "Gnoll Brute", "Fire Elemental", "Earth Golem", "Water Spirit", "Wisp", "Air Elemental"};
	protected static String[] prefix = {"Dreadful ", "Alpha ", "King ", "Wild ", "Viscous ", "Poisonous ", "Fiery ", "Mourning ", "Terrifying "};
	protected static String[] ItemNames = {"Small Health Potion", "Medium Health Potion", "Large Health Potion", "Potion of Strength", "Potion of Vitality", "Potion of Defense", "Potion of Dexterity", "Potion of Agility", "Potion of Experience", "Potion of Randomness", "Godly Potion", "Ankh"};
	protected static int[] mItemQty = {mshp, mmhp, mlhp, mpos, mpov, mpod, mpodex, mpoa, mpox, mpor, mgp, mankh};
	protected static String[] mItemNames = {"Small Health Potion", "Medium Health Potion", "Large Health Potion", "Potion of Strength", "Potion of Vitality", "Potion of Defense", "Potion of Dexterity", "Potion of Agility", "Potion of Experience", "Potion of Randomness", "Godly Potion", "Ankh"};
	protected static int[] ItemQty = {shp, mhp, lhp, pos, pov, pod, podex, poa, poxp, por, gp, ankh};
	protected static int[] mPrice = {15, 20, 30, 50, 50, 50, 50, 50, 100, 75, 300, 500};
	protected static int[] WpnQty = {kd, dg, ss, rs};
	protected static String[] WpnNames = {"Knuckleduster 'kd'", "Dagger 'd'", "Short Sword 'ss'", "Round Shield 'rs'"};
	protected static int[] bossEnc = {5, 10, 30, 50, 100};
	protected static String[] ItemCode = {"shp", "mhp", "lhp", "pos", "pov", "pod", "podex", "poa", "pox", "por", "gp", "ankh"};
	protected static boolean[] ifEquipped = {knuckleduster, dagger, shortSword, roundShield};
	public static void main(String[] args)
	{
		try
		{
			
			//THIS!//////////
			//>>Replace the path you copied from "storage" to "data" 
			File PATH = new File("C:\\Users\\kev\\Documents\\GitHub\\TextRPG\\RPGgameGuide\\path.txt");
			
			
			Scanner fileSC = new Scanner(PATH);
			while(fileSC.hasNext())
			{
				path = fileSC.next();
			}
			fileSC.close();
			
			File SAVECHECK = new File(path + "/savedGame.txt");
			fileSC = new Scanner(SAVECHECK);
			while(fileSC.hasNextInt())
			{
				savedGame = fileSC.nextInt();
			}
			fileSC.close();
			
			
		}
		catch (FileNotFoundException e)
		{
			System.out.println("err...");
			e.printStackTrace();
		}
		SaveState.Load();
		front();
	}

//: Save checker ///////////////////////////////////
	static void front()
	{
		Display.Line();
		System.out.println("1.) New Game ");
		if (savedGame == 1)
		{
			System.out.println("2.) Load Game (" +player+ "Level " +level+ ")\n3.) Specify Path\n4.) Quit");
		} else System.out.println("2.) Load Game\n3.) Specify Path\n4.) Quit");

		choice = sc.next();

		switch(choice)
		{
			case "1":
				if (savedGame == 1)
				{
					System.out.println("All progress will be lost.\nAre you sure?\n\n1.) Yes\t2.) No");
					choice = sc.next();
					switch(choice)
					{
						case "1":
							savedGame = 0;
							SaveState.Save();
							Storyline.Start();
							break;
						case "2":
							front();
							break;
						default:
							front();
							break;
					} 
				} else SaveState.Save(); Storyline.Start();
				break;
			case "2":
				if (savedGame == 0)
				{
					Display.Line();
					System.out.println("No saved game available!\nStart a new game!");
					try
					{
						Thread.sleep(1000);
						front();
					}
					catch (Exception e)
					{
						System.out.println("uuh");
					}
				}
				else
				{
					LevelUP.update();
					Display.home();
				}
				break;
			case "3":
				Display.Line();
				System.out.println("This is important for the game.\nThis is where your game file will go.\n\nGo to the Game folder \"PracticeRPGLogic\"\nthen to \"src\" then to \"data\"\nclick the path bar which should highlight\nthen paste it here.\n\nExample \"C://Desktop//PracticeRPGLogic//src//data\"\n\nPath: ");
				path = sc.next();
				SaveState.Save();
				System.out.println("Note: If after starting and restarting\nyou still get a prompt \"Err...\" or\n\"Error!\" then the path may\nbe incorrect...\nCheck Instructions.txt");
				sc.next();
				
				front();
				break;
			case "4":
				System.out.println("Are you sure you want to exit?\n1.) Yes\t2.) Go Back");
				choice = sc.next();
				switch(choice)
				{
					case "1":
						System.exit(0);
						break;
					case "2":
						front();
						break;
					default:
						front();
						break;
				}
				break;
			default:
				front();
				break;
		}
	}
	

// Equip ://///////////////////////
	static void equipped()
	{
		
		switch(equip)
		{
			case 1:
				//: Knuckleduster //////////////
				wpnDmg = 5 + (agi/5);
				wpnDmgMin = 3 + (agi/5);
				effect = 1;
				break;			
			case 2:
				//: Dagger ///////////////////
				wpnDmg = 7 + (dex/5);
				wpnDmgMin = 5 + (dex/5);
				effect = 2;
				break;
			case 3:
				//: Short Sword ///////////////////
				wpnDmg = 10 + (str/5);
				wpnDmgMin = 8 + (str/5);
				effect = 0;
				break;
			case 4:
				//: Round Shield ////////////////////
				wpnDmg = 4 + (def/3);
				wpnDmgMin = 3 + (def/3);
				effect = 3;
				break;
			default:
				wpnDmg = 0;
				wpnDmgMin = 0;
				effect = 0;
				break;
		}
		Effect();
	}

// IDENTIFIER ////////////////////////	

	static void Effect()
	{
		switch(effect)
		{
			case 1:
				dex = (dex + 5);
				break;
			case 2:
				critChance = critChance + 5;
				break;
			case 3:
				def = def + 5;
				break;
			default: 
				break;
		}
	}
}
