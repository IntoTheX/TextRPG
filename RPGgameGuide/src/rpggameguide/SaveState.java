import java.util.*;
import java.io.*;

public class SaveState extends Game
{
	static void Save()
	{	
		try
		{
			Formatter a = new Formatter(path + "/savedGame.txt");
			a.format("%d", savedGame);

			Formatter b = new Formatter(path + "/goldEarned.txt");
			b.format("%d", goldEarned);

			Formatter c = new Formatter(path + "/sp.txt");
			c.format("%d", sp);

			Formatter d = new Formatter(path + "/xp.txt");
			d.format("%d", xpInt);

			Formatter e = new Formatter(path + "/xpMax.txt");
			e.format("%d", xpMaxInt);

			Formatter f = new Formatter(path + "/str.txt");
			f.format("%d", str);

			Formatter g = new Formatter(path + "/vit.txt");
			g.format("%d", vit);

			Formatter h = new Formatter(path + "/def.txt");
			h.format("%d", def);

			Formatter i = new Formatter(path + "/dex.txt");
			i.format("%d", dex);

			Formatter j = new Formatter(path + "/agi.txt");
			j.format("%d", agi);

			Formatter k = new Formatter(path + "/gold.txt");
			k.format("%d", gold);

			Formatter l = new Formatter(path + "/hp.txt");
			l.format("%d", hp);

			Formatter m = new Formatter(path + "/shp.txt");
			m.format("%d", shp);

			Formatter n = new Formatter(path + "/mhp.txt");
			n.format("%d", mhp);

			Formatter o = new Formatter(path + "/lhp.txt");
			o.format("%d", lhp);

			Formatter p = new Formatter(path + "/pos.txt");
			p.format("%d", pos);

			Formatter q = new Formatter(path + "/pov.txt");
			q.format("%d", pov);

			Formatter r = new Formatter(path + "/pod.txt");
			r.format("%d", pod);

			Formatter s = new Formatter(path + "/podex.txt");
			s.format("%d", podex);

			Formatter t = new Formatter(path + "/poa.txt");
			t.format("%d", poa);

			Formatter u = new Formatter(path + "/poxp.txt");
			u.format("%d", poxp);

			Formatter v = new Formatter(path + "/ankh.txt");
			v.format("%d", ankh);

			Formatter w = new Formatter(path + "/ankhPrice.txt");
			w.format("%d", ankhPrice);

			Formatter x = new Formatter(path + "/boss.txt");
			x.format("%d", boss);

			Formatter y = new Formatter(path + "/level.txt");
			y.format("%d", level);

			Formatter z = new Formatter(path + "/player.txt");
			z.format("%s", player);	

			Formatter aa = new Formatter(path + "/bossDefeated.txt");
			aa.format("%d", BossDefeated);

			Formatter ab = new Formatter(path + "/fc.txt");
			ab.format("%d", fc);

			Formatter ac = new Formatter(path + "/fc2.txt");
			ac.format("%d", fc2);

			Formatter ad = new Formatter(path + "/lvlHighscore.txt");
			ad.format("%d", lvlHighScore);

			Formatter ae = new Formatter(path + "/highscore.txt");
			ae.format("%d", highScore);

			Formatter af = new Formatter(path + "/playerHighscore.txt");
			af.format("%s", playerHighScore);

			Formatter ag = new Formatter(path + "/enemiesKilled.txt");
			ag.format("%d", enemiesKilled);
			
			Formatter ah = new Formatter(path + "/kd.txt");
			ah.format("%d", kd);
			
			Formatter ai = new Formatter(path + "/d.txt");
			ai.format("%d", dg);
			
			Formatter aj = new Formatter(path + "/ss.txt");
			aj.format("%d", ss);
			
			Formatter ak = new Formatter(path + "/rs.txt");
			ak.format("%d", rs);
			
			Formatter al = new Formatter(path + "/equip.txt");
			al.format("%d", equip);

			Formatter am = new Formatter(path+ "/path.txt");
			am.format("%s", path);
			
			Formatter an = new Formatter(path + "/por.txt");
			al.format("%d", por);
			
			Formatter ao = new Formatter(path + "/gp.txt");
			al.format("%d", gp);
			a.close();
			b.close();
			c.close();
			d.close();
			e.close();
			f.close();
			g.close();
			h.close();
			i.close();
			j.close();
			k.close();
			l.close();
			m.close();
			n.close();
			o.close();
			p.close();
			q.close();
			r.close();
			s.close();
			t.close();
			u.close();
			v.close();
			w.close();
			x.close();
			y.close();
			z.close();
			aa.close();
			ab.close();
			ac.close();
			ad.close();
			ae.close();
			af.close();
			ag.close();
			ah.close();
			ai.close();
			aj.close();
			ak.close();
			al.close();
			am.close();
			an.close();
			ao.close();
		}
		catch (Exception e)
		{
			System.out.println("Nope!");
		}
	}

	static void Load()
	{
		try
		{				
			File STR = new File(path + "/str.txt");
			Scanner fileSC = new Scanner(STR);
			while(fileSC.hasNextInt())
			{
				str = fileSC.nextInt();
			}
			fileSC.close();

			File VIT = new File(path + "/vit.txt");
			fileSC = new Scanner(VIT);
			while(fileSC.hasNextInt())
			{
				vit = fileSC.nextInt();
			}
			fileSC.close();

			File DEF = new File(path + "/def.txt");
			fileSC = new Scanner(DEF);
			while(fileSC.hasNextInt())
			{
				def = fileSC.nextInt();
			}
			fileSC.close();

			File DEX = new File(path + "/dex.txt");
			fileSC = new Scanner(DEX);
			while(fileSC.hasNextInt())
			{
				dex = fileSC.nextInt();
			}
			fileSC.close();

			File AGI = new File(path + "/agi.txt");
			fileSC = new Scanner(AGI);
			while(fileSC.hasNextInt())
			{
				agi = fileSC.nextInt();
			}
			fileSC.close();

			File HP = new File(path + "/hp.txt");
			fileSC = new Scanner(HP);
			while(fileSC.hasNextInt())
			{
				hp = fileSC.nextInt();
			}
			fileSC.close();

			File XP = new File(path + "/xp.txt");
			fileSC = new Scanner(XP);
			while(fileSC.hasNextInt())
			{
				xp = fileSC.nextInt();
			}
			fileSC.close();

			File XPMAX = new File(path + "/xpMax.txt");
			fileSC = new Scanner(XPMAX);
			while(fileSC.hasNextInt())
			{
				xpMax = fileSC.nextInt();
			}
			fileSC.close();

			File GOLD = new File(path + "/gold.txt");
			fileSC = new Scanner(GOLD);
			while(fileSC.hasNextInt())
			{
				gold = fileSC.nextInt();
			}
			fileSC.close();

			File GOLDEARNED = new File(path + "/goldEarned.txt");
			fileSC = new Scanner(GOLDEARNED);
			while(fileSC.hasNextInt())
			{
				goldEarned = fileSC.nextInt();
			}
			fileSC.close();

			File PLAYER = new File(path + "/player.txt");
			fileSC = new Scanner(PLAYER);
			while(fileSC.hasNext())
			{
				player = player + fileSC.next() + " ";
			}
			fileSC.close();

			File LEVEL = new File(path + "/level.txt");
			fileSC = new Scanner(LEVEL);
			while(fileSC.hasNextInt())
			{
				level = fileSC.nextInt();
			}
			fileSC.close();

			File BOSS = new File(path + "/boss.txt");
			fileSC = new Scanner(BOSS);
			while(fileSC.hasNextInt())
			{
				boss = fileSC.nextInt();
			}
			fileSC.close();

			File SHP = new File(path + "/shp.txt");
			fileSC = new Scanner(SHP);
			while(fileSC.hasNextInt())
			{
				shp = fileSC.nextInt();
			}
			fileSC.close();

			File MHP = new File(path + "/mhp.txt");
			fileSC = new Scanner(MHP);
			while(fileSC.hasNextInt())
			{
				mhp = fileSC.nextInt();
			}
			fileSC.close();

			File LHP = new File(path + "/lhp.txt");
			fileSC = new Scanner(LHP);
			while(fileSC.hasNextInt())
			{
				lhp = fileSC.nextInt();
			}
			fileSC.close();

			File POS = new File(path + "/pos.txt");
			fileSC = new Scanner(POS);
			while(fileSC.hasNextInt())
			{
				pos = fileSC.nextInt();
			}
			fileSC.close();

			File POV = new File(path + "/pov.txt");
			fileSC = new Scanner(POV);
			while(fileSC.hasNextInt())
			{
				pov = fileSC.nextInt();
			}
			fileSC.close();

			File POD = new File(path + "/pod.txt");
			fileSC = new Scanner(POD);
			while(fileSC.hasNextInt())
			{
				pod = fileSC.nextInt();
			}
			fileSC.close();

			File PODEX = new File(path + "/podex.txt");
			fileSC = new Scanner(PODEX);
			while(fileSC.hasNextInt())
			{
				podex = fileSC.nextInt();
			}
			fileSC.close();

			File POA = new File(path + "/poa.txt");
			fileSC = new Scanner(POA);
			while(fileSC.hasNextInt())
			{
				poa = fileSC.nextInt();
			}
			fileSC.close();

			File POXP = new File(path + "/poxp.txt");
			fileSC = new Scanner(POXP);
			while(fileSC.hasNextInt())
			{
				poxp = fileSC.nextInt();
			}
			fileSC.close();

			File ANKH = new File(path + "/ankh.txt");
			fileSC = new Scanner(ANKH);
			while(fileSC.hasNextInt())
			{
				ankh = fileSC.nextInt();
			}
			fileSC.close();

			File ANKHPRICE = new File(path + "/ankhPrice.txt");
			fileSC = new Scanner(ANKHPRICE);
			while(fileSC.hasNextInt())
			{
				ankhPrice = fileSC.nextInt();
			}
			fileSC.close();

			File SP = new File(path + "/sp.txt");
			fileSC = new Scanner(SP);
			while(fileSC.hasNextInt())
			{
				sp = fileSC.nextInt();
			}
			fileSC.close();

			File BOSSDEFEATED = new File(path + "/bossDefeated.txt");
			fileSC = new Scanner(BOSSDEFEATED);
			while(fileSC.hasNextInt())
			{
				BossDefeated = fileSC.nextInt();
			}
			fileSC.close();

			File FC = new File(path + "/fc.txt");
			fileSC = new Scanner(FC);
			while(fileSC.hasNextInt())
			{
				fc = fileSC.nextInt();
			}
			fileSC.close();

			File FC2 = new File(path + "/fc2.txt");
			fileSC = new Scanner(FC2);
			while(fileSC.hasNextInt())
			{
				fc2 = fileSC.nextInt();
			}
			fileSC.close();

			File LVLHIGHSCORE = new File(path + "/lvlHighscore.txt");
			fileSC = new Scanner(LVLHIGHSCORE);
			while(fileSC.hasNextInt())
			{
				lvlHighScore = fileSC.nextInt();
			}
			fileSC.close();

			File HIGHSCORE = new File(path + "/highscore.txt");
			fileSC = new Scanner(HIGHSCORE);
			while(fileSC.hasNextInt())
			{
				highScore = fileSC.nextInt();
			}
			fileSC.close();

			File PLAYERHIGHSCORE = new File(path + "/playerHighScore.txt");
			fileSC = new Scanner(PLAYERHIGHSCORE);
			while(fileSC.hasNextInt())
			{
				playerHighScore = fileSC.next();
			}
			fileSC.close();

			File ENEMIESKILLED = new File(path + "/enemiesKilled.txt");
			fileSC = new Scanner(ENEMIESKILLED);
			while(fileSC.hasNextInt())
			{
				enemiesKilled = fileSC.nextInt();
			}
			fileSC.close();
			
			File KNUCKLEDUSTER = new File(path + "/kd.txt");
			fileSC = new Scanner(KNUCKLEDUSTER);
			while(fileSC.hasNextInt())
			{
				kd = fileSC.nextInt();
			}
			fileSC.close();
			
			File DAGGER = new File(path + "/d.txt");
			fileSC = new Scanner(DAGGER);
			while(fileSC.hasNextInt())
			{
				dg = fileSC.nextInt();
			}
			fileSC.close();

			File SHORTSWORD = new File(path + "/ss.txt");
			fileSC = new Scanner(SHORTSWORD);
			while(fileSC.hasNextInt())
			{
				ss = fileSC.nextInt();
			}
			fileSC.close();
			
			File ROUNDSHIELD = new File(path + "/rs.txt");
			fileSC = new Scanner(ROUNDSHIELD);
			while(fileSC.hasNextInt())
			{
				rs = fileSC.nextInt();
			}
			fileSC.close();
			
			File EQUIP = new File(path +"/equip.txt");
			fileSC = new Scanner(EQUIP);
			while(fileSC.hasNextInt())
			{
				equip = fileSC.nextInt();
			}
			fileSC.close();
			
			File PATH = new File(path + "/path.txt");
			fileSC = new Scanner(PATH);
			while(fileSC.hasNextInt())
			{
				path = fileSC.next();
			}
			fileSC.close();
			
			File POR = new File(path + "/por.txt");
			fileSC = new Scanner(POR);
			while(fileSC.hasNextInt())
			{
				por = fileSC.nextInt();
			}
			fileSC.close();
			
			File GP = new File(path + "/gp.txt");
			fileSC = new Scanner(GP);
			while(fileSC.hasNextInt())
			{
				gp = fileSC.nextInt();
			}
			fileSC.close();

			LevelUP.update();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error!");
		}
	}
	
}
