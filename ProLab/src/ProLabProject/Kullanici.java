package ProLabProject;

import java.util.ArrayList;
import java.util.Collections;

public class Kullanici extends OyuncuSinifi {
	public Kullanici() {
		super(0,"Kullanici",0);
	}
	
	/*public Kullanici(int oyuncuID, String oyuncuAdi, int Skor)
	{
		super(oyuncuID, oyuncuAdi, Skor);
	}*/

	@Override
	public void kartsecBs(ArrayList kartlarlisteBs) {
		//super.kartsecBs(kartlarlisteBs);
		Collections.shuffle(kartlarlisteBs);
		
	}

	@Override
	public void kartsecDst(ArrayList kartlarlisteDst) {
		//super.kartsecDst(kartlarlisteDst);
		Collections.shuffle(kartlarlisteDst);
		
	}
	
	
	
	
	
	
	
	
	
	

}
