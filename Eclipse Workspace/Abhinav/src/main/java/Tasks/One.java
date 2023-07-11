package Tasks;

public class One {
	public static void main (String[] args) {
		Date date = new Date(1986,7,32);
		date.printDate();
	}
}

class Date {
	
	// instance variable
	
	private int year;
	private int month;
	private int date;
	
	// constructor
	
	public Date (int year,int month,int date) {
		this.year = year;
		this.month = month;
		this.date = date;
		
		validateDate();
	}
	
	// utility method
	
//	private void utilityMethod () {
//		if (isLeapYear()) {
//			
//		}
//	}
	
	// check for leap year
	
//	private boolean isLeapYear () {
//		if (year%4 == 0) 
//			return true;
//		else 
//			return false;
//	}
	
	// If leap year then change feb to 29 else 28
	
//	private boolean checkFeb () {
//		if (isLeapYear()) {
//			return true;
//		}
//		else
//			return false;
//	}
	
	// validate date
	
	private void validateDate () {
		if (date>31) {
			while (date>31) {
				this.date = date - 31;
				incrementMonth();
			}
		}
		if (month>12) {
			while (month>12) {
				this.month = month-12;
				incrementYear();
			}
		}
	}
	
	// check for months which has 30 days
	
//	private boolean isThirty() {
//		if (month == 4 || month == 6 || month == 9 || month == 11)
//			return true;
//		else return false;
//	}
	
	// increment the year
	
	private void incrementYear () {
		this.year = year+1;
	}
	
	// increment the month
	
	private void incrementMonth () {
		this.month = month+1;
	}
	
	// increment the day
	
//	private void incrementDay () {
//		this.date = date +1;
//	}
	
	// print the date in the format
	
	public void printDate () {
		System.out.println(date+" / "+month+" / "+year);
	}
	
}
