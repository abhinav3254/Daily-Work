class Date {
	private int year;
	private int month;
	private int date;
	
	public Date (int year,int month,int date) {
		this.year = year;
		this.month = month;
		this.date = date;
		
		validateDate();
	}
	
	public void validateDate () {
		if (date>31) {
			while (date<=31) {
				this.date = date - 31;
				incrementMonth();
			}
		}
		if (month>12) {
			while (month<=12) {
				this.month = month-12;
				incrementYear();
			}
		}
	}
	
	
	public boolean isThirty() {
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return true;
		else return false;
	}
	
	
	public void incrementYear () {
		this.year = year+1;
	}
	
	public void incrementMonth () {
		this.month = month+1;
	}
	
	
	public void incrementDay() {
		this.date = date +1;
	}
	
	public void printDate () {
		System.out.println(date+" / "+month+" / "+year);
	}
	
}

class Eight {
	public static void main (String[] args) {
		Date date = new Date(1986,7,32);
		date.printDate();
	}
}