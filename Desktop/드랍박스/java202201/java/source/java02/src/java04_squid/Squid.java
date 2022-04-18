package java04_squid;

import java.util.Date;
//dto
public class Squid {
	private int no;
	private String name;
	private int debt;
	private String fail;
	private Date regidate;
	public Squid() {
	}
	public Squid(int no, String name, int debt) {
		this.no = no;
		this.name = name;
		this.debt = debt;
	}

	public Squid(int no, String name, int debt, String fail, Date regidate) {
		this.no = no;
		this.name = name;
		this.debt = debt;
		this.fail = fail;
		this.regidate = regidate;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDebt() {
		return debt;
	}
	public void setDebt(int debt) {
		this.debt = debt;
	}
	public String getFail() {
		return fail;
	}
	public void setFail(String fail) {
		this.fail = fail;
	}
	public Date getRegidate() {
		return regidate;
	}
	public void setRegidate(Date regidate) {
		this.regidate = regidate;
	}
	@Override
	public String toString() {
		return "Squid [no=" + no + ", name=" + name + ", debt=" + debt + ", fail=" + fail + ", regidate=" + regidate
				+ "]";
	}
	
}
