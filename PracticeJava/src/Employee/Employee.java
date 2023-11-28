package Employee;

import java.util.Date;
import java.util.Objects;

public class Employee {

	
	 private int empNo;
	    private String eName;
	    private String job;
	    private int mgr;
	    private Date hiredate;
	    private int sal;
	    private int comm;
	    private int deptNo;

	    public  Employee() {
		
	    }

	    public Employee(int empNo, String eName, String job, int mgr, Date hiredate, int sal, int comm, int deptNo) {
	        this.empNo = empNo;
	        this.eName = eName;
	        this.job = job;
	        this.mgr = mgr;
	        this.hiredate = hiredate;
	        this.sal = sal;
	        this.comm = comm;
	        this.deptNo = deptNo;
	    }

	    public int getEmpNo() {
	        return empNo;
	    }

	    public void setEmpNo(int empNo) {
	        this.empNo = empNo;
	    }

	    public String geteName() {
	        return eName;
	    }

	    public void seteName(String eName) {
	        this.eName = eName;
	    }

	    public String getJob() {
	        return job;
	    }

	    public void setJob(String job) {
	        this.job = job;
	    }

	    public int getMgr() {
	        return mgr;
	    }

	    public void setMgr(int mgr) {
	        this.mgr = mgr;
	    }

	    public Date getHiredate() {
	        return hiredate;
	    }

	    public void setHiredate(Date hiredate) {
	        this.hiredate = hiredate;
	    }

	    public int getSal() {
	        return sal;
	    }

	    public void setSal(int sal) {
	        this.sal = sal;
	    }

	    public int getComm() {
	        return comm;
	    }

	    public void setComm(int comm) {
	        this.comm = comm;
	    }

	    public int getDeptNo() {
	        return deptNo;
	    }

	    public void setDeptNo(int deptNo) {
	        this.deptNo = deptNo;
	    }

	    @Override
	    public String toString() {
	        return "EmpTable{" +
	                "empNo=" + empNo +
	                ", eName='" + eName + '\'' +
	                ", job='" + job + '\'' +
	                ", mgr=" + mgr +
	                ", hiredate=" + hiredate +
	                ", sal=" + sal +
	                ", comm=" + comm +
	                ", deptNo=" + deptNo +
	                '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Employee empTable = (Employee) o;
	        return empNo == empTable.empNo && mgr == empTable.mgr && sal == empTable.sal && comm == empTable.comm && deptNo == empTable.deptNo && Objects.equals(eName, empTable.eName) && Objects.equals(job, empTable.job) && Objects.equals(hiredate, empTable.hiredate);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(empNo, eName, job, mgr, hiredate, sal, comm, deptNo);
	    }
	
}
