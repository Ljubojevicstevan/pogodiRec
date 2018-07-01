package clasess;

import java.util.*;

import enums.Enums;
import interrfaces.ioperations;

public class klasa implements ioperations{

	public String nizReci[]= {"autobus","skolarina","oblakoid","sunce","mastati"};
	@SuppressWarnings("serial")
	/*ArrayList<?> nizReci = new ArrayList<Object>(){{
		add("autobus");
		add("skolarina");
		add("oblakoid");
		add("sunce");
		add("mastati");
		}};*/
		Enums stanje;//Stanje enumeracije koje moze biti Pogodjenja, NijePogodjenja, PodRec
		Random rand=new Random();//random broj
		public String seq;//rec koju mi unosimo posle u main projektu
		public int randomBroj=rand.nextInt(nizReci.length);//random broj ide do broja onoliko koliko ima elemenata u listi
		public int brojDozvoljenihGreski=nizReci[randomBroj].length()+5;//broj dozvoljenih greski

//GETERI I SETERI
	public int getBrojDozvoljenihGreski() {
			return brojDozvoljenihGreski;
		}

		public void setBrojDozvoljenihGreski(int brojDozvoljenihGreski) {
			this.brojDozvoljenihGreski = brojDozvoljenihGreski;
		}

	public String[] getNizReci() {
			return nizReci;
		}

		public void setNizReci(String[] nizReci) {
			this.nizReci = nizReci;
		}

		public int getRandomBroj() {
			return randomBroj;
		}

		public void setRandomBroj(int randomBroj) {
			this.randomBroj = randomBroj;
		}

	public Enums getStanje() {
		return stanje;
	}

	public void setStanje(Enums stanje) {
		this.stanje = stanje;
	}

	public Random getRand() {
		return rand;
	}

	public void setRand(Random rand) {
		this.rand = rand;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

		
		//funkcija proveri rec koja je u sutini i cela logika programa
	@SuppressWarnings("static-access")
	@Override
	public void proveriRec() {
		
		if(nizReci[randomBroj].contains(seq)==false)
		{
			brojDozvoljenihGreski--;
			this.stanje=stanje.NijePogodjenja;
			if(brojDozvoljenihGreski==0)
			{
				System.exit(0);
			}
		}
		if(nizReci[randomBroj].contains(seq)==true)
		{
			brojDozvoljenihGreski--;
			this.stanje=stanje.PodRec;
			if(brojDozvoljenihGreski==0)
			{
				System.exit(0);
			}
		}
		if(nizReci[randomBroj].equals(seq))
		{	
			this.stanje=stanje.Pogodjenja;
		}	
	}

}
