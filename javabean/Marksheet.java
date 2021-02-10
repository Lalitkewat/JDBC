package javabean;

/**
 * @author Lalit.
 * 
 *         Write a program to create javabean marksheet in jdbc.
 *
 */
public class Marksheet {

	private int STD_ID;
	private int ROLLNo;
	private String Fname;
	private String Lname;
	private int CHE;
	private int PHY;
	private int MATHS;

	public Marksheet() {
	};

	public int getSTD_ID() {
		return STD_ID;
	}

	public void setSTD_ID(int sTD_ID) {
		STD_ID = sTD_ID;
	}

	public int getROLLNo() {
		return ROLLNo;
	}

	public void setROLLNo(int rOLLNo) {
		ROLLNo = rOLLNo;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public int getCHE() {
		return CHE;
	}

	public void setCHE(int cHE) {
		CHE = cHE;
	}

	public int getPHY() {
		return PHY;
	}

	public void setPHY(int pHY) {
		PHY = pHY;
	}

	public int getMATHS() {
		return MATHS;
	}

	public void setMATHS(int mATHS) {
		MATHS = mATHS;
	}

}
