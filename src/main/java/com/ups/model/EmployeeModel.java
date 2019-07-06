package com.ups.model;



public class EmployeeModel {
	
	protected EmployeeModel.Department department;
    protected String fName;
    protected byte idd;
    protected String lName;
    
    public EmployeeModel.Department getDepartment() {
		return department;
	}

	public void setDepartment(EmployeeModel.Department department) {
		this.department = department;
	}

	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public byte getIdd() {
		return idd;
	}

	public void setIdd(byte idd) {
		this.idd = idd;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}


	public static class Department {

        protected byte did;
        protected String dname;
		public byte getDid() {
			return did;
		}
		public void setDid(byte did) {
			this.did = did;
		}
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
		
        
        
    }
    
    
}
