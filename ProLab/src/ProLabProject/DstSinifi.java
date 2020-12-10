package ProLabProject;

public class DstSinifi extends Sporcu {
	private int can;
	private int akilsagligi;
	private int aclik;
	private String resimdst;
	Boolean kartkullanildimi;
	
	public DstSinifi(String sporcuIsim, String sporcuTakim) {
			super("KarakterDst","Dst");
	}
	public DstSinifi(int can, int akilsagligi, int aclik,String resimdst) {
		super();
		this.can = can;
		this.akilsagligi = akilsagligi;
		this.aclik = aclik;
		this.resimdst=resimdst;
		
	}
	
	
	public int getCan() {
		return can;
	}
	public void setCan(int can) {
		this.can = can;
	}
	public int getAkilsagligi() {
		return akilsagligi;
	}
	public void setAkilsagligi(int akilsagligi) {
		this.akilsagligi = akilsagligi;
	}
	public int getAclik() {
		return aclik;
	}
	public void setAclik(int aclik) {
		this.aclik = aclik;
	}
	
	public String getResimdst() {
		return resimdst;
	}
	public void setResimdst(String resimdst) {
		this.resimdst = resimdst;
	}
	public DstSinifi(Boolean kartkullanildimi) {
		super();
		this.kartkullanildimi = kartkullanildimi;
	}
	
	
	@Override
	void SporcuPuaniGoster() {
		
		super.SporcuPuaniGoster();
	}
	
	
	
	

}
