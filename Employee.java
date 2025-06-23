package EMP;

public class Employee {
	int empid;
	String ename;
	int esal;
	public int getId() {
		return empid;
	}
	public void setId(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return ename;
	}
	public void setName(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public Employee(int empid, String ename, int esal) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Student [id=" + empid + ", name=" + ename + ", Sal=" + esal + "]";
	}
	
}

