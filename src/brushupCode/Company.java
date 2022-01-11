package brushupCode;

public class Company {
	
	public String name;
	public String logo;
	public int totalEmployee;
	private String information;
	private int tenderamount;
	
	public Company() {
		
	}
	
	
	public Company(String name, String logo, int totalEmployee, String information, int tenderamount) {
		this.name = name;
		this.logo = logo;
		this.totalEmployee = totalEmployee;
		this.information = information;
		this.tenderamount = tenderamount;
	}

//getters and setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLogo() {
		return logo;
	}


	public void setLogo(String logo) {
		this.logo = logo;
	}


	public int getTotalEmployee() {
		return totalEmployee;
	}


	public void setTotalEmployee(int totalEmployee) {
		this.totalEmployee = totalEmployee;
	}


	public String getInformation() {
		return information;
	}


	public void setInformation(String information) {
		this.information = information;
	}


	public int getTenderamount() {
		return tenderamount;
	}


	public void setTenderamount(int tenderamount) {
		this.tenderamount = tenderamount;
	}
	
	

}
