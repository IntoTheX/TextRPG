public class Storyline extends Game
{
	public static int txtSpeed, txtSpeedDefault;
	public static String choice;
	public static String[] story = {"-----------------------------------", "The land was once peaceful and\nevery creature lived in harmony.", "The Goddess of Light appears to be\necstatic as her little creation\npleases her as they worshipped her\nfor such a beautiful world they are\nat.", "Everything seems to be in order...", "until a single man harboured a hint\nof malicious intent, he has been\ndevoured by greed.", "He gained too much wisdom, he was\nblinded by the power he could get,\nthe desire to be worshipped like\na god.", "He journeyed throughout the land\nin pursuit for power. He has\ntraversed the continent, everywhere\nhe go... chaos and destruction\nfollows. Everytime he senses that\nsomeone is growing strong in power,\nhe delivers death before they could\neven grow stronger.", "Over the years of never ending\nonslaught, he started to leak the\naura of death itself. His death aura\ninfluenced other creatures, small\nharmless beings turned it aggressive\nones, wild animals turn into\nferocious monsters ready to\nslaughter any human in sight.", "The once peaceful land was no\nlonger...", "Chaos, War, Destruction,\nImmorality, Greed...", "Alas, he has grown so powerful\nto even challenge the Goddess of\nLight.", "The Goddess of Light tried to fend\noff the darkness within the man...", "But his heart turned into stone,\nhis gaze giving off a cold\nemotionless response as SHE tried\nto purify his tainted soul.", "The words of the Goddess seem to\nmake no effect to the man. Sensing\nthe Goddess having no plan to attack,\nhe grew impatient. He started to\nbombard the Goddess with thousands\nof attack where each of the blow\nwould deal terrifying amount of\nforce that could even wipe a whole\ncity out.", "The Goddess wouldn't even think of\ncounter attacking, SHE couldn't\nhurt her own creation. SHE was\nleft with no choice but to defend.", "They've fought for eons...",
		"The Goddess of Light's life force,\nreceiving countless barrage of\nattacks, soon came to a fall. SHE\ncouldn't hold any longer...", "The Goddess knew the SHE must stop\nhim for SHE knew that HER creation\nis now faced with a great danger.", "Sensing HER life force depleting\nwith only sliver of essence\nremaining, SHE used all HER might\nto seal the man's power restricting\nhim to grow even stronger...", "This was HER only choice...", "With the Goddess slain, the whole\nworld felt a massive earthquake\nfollowed by countless lightnings\nthat can annihilate a whole\ncontinent with a single strike.\nEvery creature felt that\ndisturbance, the Heavens are angry.", "Moments later a voice echoed\nthroughout the world, 'Your Goddess\nis no longer, for I, Rudolph Agpoon,\nhas slain HER. Bow down or feel the\nwrath of my might!'", ". . .",
		"Little did he know that before the\nGoddess died, SHE removed his\nability to sense the people who\nare growing strong in power. With\nso little energy left, SHE used\nHER Divine Sense to leave a message\nto the Humans.", 
		"'Today I fall, darkness has won but\ndon't let this darkness devour you\nforever. Spread the Light, Fight\nfor the Light. Slay the abomination,\nfree this land from evil.'", "------------------------------------", ""};

	static void Start()
	{
		String a = "Do you want to view the storyline?\n1.) Yes\t2.) No";
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
		System.out.println();
		choice = sc.next();
		switch(choice)
		{
			case "1":
				storySpeed();
				Story();
				Generator.Create();
				break;
			case "2":
				Generator.Create();
				break;
			default:
				Start();
				break;
		}

	}
	static void storySpeed()
	{
		System.out.println("Choose the speed of the text\n1.) Normal\t2.) Fast");
		choice = sc.next();
		switch(choice)
		{
			case "1":
				txtSpeed = 70;
				txtSpeedDefault = txtSpeed;
				break;
			case "2":
				txtSpeed = 40;
				txtSpeedDefault = txtSpeed;
				break;
			default:
				storySpeed();
		}
	}
	static void Story()
	{
		for (int i = 0; i < Storyline.story.length; i++)
		{
			for (int j = 0; j < Storyline.story[i].length(); j++)
			{
				try
				{
					Thread.sleep(txtSpeed);
					System.out.print(Storyline.story[i].charAt(j));
					txtSpeed = txtSpeedDefault;
				}
				catch ( Exception e)
				{
					System.out.println("Error!");
				}
				if (Storyline.story[i].charAt(j) == '.')
				{
					txtSpeed = 1000;
				}
				else if (Storyline.story[i].charAt(j) == ',')
				{
					txtSpeed = 500;
				}
				else txtSpeed = txtSpeedDefault;

			}
			System.out.println();
			System.out.println();
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e)
			{
				System.out.println(". . .");
			}
		}

	}

}
