package ProLabProject;

import java.util.ArrayList;
import java.util.Collections;

public class Bilgisayar extends OyuncuSinifi {
	public Bilgisayar() {
		super(1,"Bilgisayar",0);
	}

	
	/*public Bilgisayar(int oyuncuID, String oyuncuAdi, int Skor)
	{
		super(oyuncuID, oyuncuAdi, Skor);
	}
	*/
	
	@Override
	public void kartsecBs(ArrayList kartlarlisteBs) {
		//super.kartsecBs(kartlarlisteBs);
		//Collections.shuffle(kartlarlisteBs);
		
	}


	@Override
	public void kartsecDst(ArrayList kartlarlisteDst) {
		super.kartsecDst(kartlarlisteDst);
		Collections.shuffle(kartlarlisteDst);
	
	}
	
	
	
	

	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	 
	
	 
	

}
