class Time {
	private int hours;
	private int minutes;
	private int seconds;
	
	Time (int hours,int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		
		validateTime();
	}
	
	private void validateTime () {
		if (this.hours>24) this.hours = this.hours%24;
		 if (this.minutes>60) {
			this.minutes = this.minutes%60;
			incrementHours();
			};
		 if (this.seconds>60) {
			this.seconds = this.seconds%60;
			incrementMinutes();
			}
	}
	
	public void incrementHours () {
		if (hours == 25)
			this.hours = 0;
		else hours = hours+1;
	}
	
	public void incrementMinutes () {
		if (minutes == 60) {
			this.minutes = 0;
			incrementHours();
		}
		 else 
			 minutes = minutes + 1;
	}
	
	public void incrementSeconds () {
		if (seconds == 60) {
			this.seconds = 0;
			incrementMinutes();
		}
		 else 
			 seconds = seconds + 1;
	}
	
	public void printTime () {
		System.out.println(this.hours+" : "+this.minutes+" : "+this.seconds);
	}
	
}

class Seven {
	public static void main (String[] args) {
		Time time = new Time(100,65,90);
		
		time.printTime();
	}
}