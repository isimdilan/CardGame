package ProLabProject;

public class BsSinifi extends Sporcu {
	private int can;
	private int guc;
	private int yildizpuan;
	private String resimbs;
	public String getResimbs() {
		return resimbs;
	}

	public void setResimbs(String resimbs) {
		this.resimbs = resimbs;
	}

	Boolean kartkullanildimi;
	
	public BsSinifi(String sporcuIsim,String SporcuTakim) {
		super("KarakterBs","BS");
	}

	public BsSinifi(int can, int guc, int yildizpuan) {
		super();
		this.can = can;
		this.guc = guc;
		this.yildizpuan = yildizpuan;
	}

	public int getCan() {
		return can;
	}

	public void setCan(int can) {
		this.can = can;
	}

	public int getGuc() {
		return guc;
	}

	public void setGuc(int guc) {
		this.guc = guc;
	}

	public int getYildizpuan() {
		return yildizpuan;
	}

	public void setYildizpuan(int yildizpuan) {
		this.yildizpuan = yildizpuan;
	}

	public BsSinifi(Boolean kartkullanildimi) {
		super();
		this.kartkullanildimi = kartkullanildimi;
	}

	@Override
	void SporcuPuaniGoster() {
		
		super.SporcuPuaniGoster();
	}
	
	
	

}
