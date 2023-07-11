package oops;

public class Company {
	
		private String companyName;
		private String companyLocation;
		private Department[] department;
		
		public Company() {
			// TODO Auto-generated constructor stub
		}

		public Company(String companyName, String companyLocation, Department[] department) {
			super();
			this.companyName = companyName;
			this.companyLocation = companyLocation;
			this.department = department;
		}

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getCompanyLocation() {
			return companyLocation;
		}

		public void setCompanyLocation(String companyLocation) {
			this.companyLocation = companyLocation;
		}

		public Department[] getDepartment() {
			return department;
		}

		public void setDepartment(Department[] department) {
			this.department = department;
		}
}
