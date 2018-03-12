
public class teglalap {

	private int a_oldal;
	private int b_oldal;
	
	
	public teglalap(int a_oldal, int b_oldal) {
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}
	
	
	public teglalap(int oldalhossz) {
		//this.a_oldal = this.b_oldal = oldalhossz;
		this.a_oldal = oldalhossz;
		this.b_oldal = oldalhossz;	
	}
	
	
	public int terulet(){
		return a_oldal*b_oldal;	
	}

	
	
	
	public String toString() {
		return  + a_oldal + ", " + b_oldal + ":" + terulet();
	}

	
	

	/* public int getA_oldal() {
		return a_oldal;
	}


	public void setA_oldal(int a_oldal) {
		this.a_oldal = a_oldal;
	}


	public int getB_oldal() {
		return b_oldal;
	}


	public void setB_oldal(int b_oldal) {
		this.b_oldal = b_oldal;
	} */

	// 2paraméteres
	 public void SetOldalak(int a_oldal, int b_oldal){
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}
	
	 //1 paraméteres
	public void SetOldalak(int oldalhossz){
		//this.a_oldal = this.b_oldal = oldalhossz;
		this.a_oldal = oldalhossz;
		this.b_oldal = oldalhossz;
	}
	
	public boolean TeruletNagyobbMint(teglalap MasikTeglalap){
		return terulet() > MasikTeglalap.terulet();
	}
	
	
	public boolean EgyezikE(teglalap MasikTeglalap){
		return a_oldal== MasikTeglalap.a_oldal && b_oldal==MasikTeglalap.b_oldal;
	}



}






















