package java03_student;
//dto
//db테이블과 필드명 같게 
public class Student {
	private String sno;
	private String sname;
	private String mcode;
	private int score;
	public Student() {
		super();
	}
	public Student(String sno, String sname, String mcode, int score) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.mcode = mcode;
		this.score = score;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getMcode() {
		return mcode;
	}
	public void setMcode(String mcode) {
		this.mcode = mcode;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", mcode=" + mcode + ", score=" + score + "]";
	}
	
}
