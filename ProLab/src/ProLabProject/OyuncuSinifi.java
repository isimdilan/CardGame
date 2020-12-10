package ProLabProject;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class OyuncuSinifi {
	private Integer OyuncuID;
	private String OyuncuAdi;
	private Integer Skor;
	public ArrayList<Sporcu> kartlarlisteDst=new ArrayList<>(8);	
	public ArrayList<Sporcu> kartlarlisteBs=new ArrayList<>(8);	
 	public OyuncuSinifi() {
 		this.setOyuncuID(-1);
 		this.setOyuncuAdi("null");
 		this.setSkor(0);
 		
	}
	public OyuncuSinifi(Integer oyuncuID, String oyuncuAdi, Integer skor) {
		
		OyuncuID = oyuncuID;
		OyuncuAdi = oyuncuAdi;
		Skor=skor;
	}
	

	public Integer getOyuncuID() {
		return OyuncuID;
	}
	public void setOyuncuID(Integer oyuncuID) {
		OyuncuID = oyuncuID;
	}
	public String getOyuncuAdi() {
		return OyuncuAdi;
	}
	public void setOyuncuAdi(String oyuncuAdi) {
		OyuncuAdi = oyuncuAdi;
	}
	
	public Integer getSkor() {
		return Skor;
	}

	public void setSkor(Integer skor) {
		Skor = skor;
	}
	
	public void kartsecDst(ArrayList kartlarlisteDst) {
		this.kartlarlisteDst=kartlarlisteDst;
		
	}
	public void kartsecBs(ArrayList kartlarlisteBs) {
	
		this.kartlarlisteBs=kartlarlisteBs;
	}
	
public void SkorGoster() {
		
	}

	

	
	
	
	
	
	

}
