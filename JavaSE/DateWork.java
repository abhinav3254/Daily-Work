import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
// How to use date in Java

class Test {
	
	public static void main(String[] args) {
		
		// Working with Date
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld.getDayOfMonth()+"/"+ld.getMonthValue()+"/"+ld.getYear());
		
		LocalDate dob = LocalDate.of(2000,10,2);
		System.out.println(dob.getDayOfMonth()+"/"+dob.getMonthValue()+"/"+dob.getYear());
		
		// Working with Time
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt.getHour()+":"+lt.getMinute()+":"+lt.getSecond());
		LocalTime tob = LocalTime.of(18,30,45);
		System.out.println(tob.getHour()+"hr:"+tob.getMinute()+"min:"+tob.getSecond()+"sec");
		
		
		// LocalDateTime
		
		System.out.println("************Local Date Time ***********************");
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.getHour()+":"+ldt.getMinute()+":"+ldt.getSecond());
		System.out.println(ldt.getDayOfMonth()+"/"+ldt.getMonthValue()+"/"+ldt.getYear());
		
		System.out.println("************New Line***********************");
										  // <-------  ------->
		LocalDateTime ldt1 = LocalDateTime.of(2000,10,2,18,30,45);
		System.out.println(ldt1.getHour()+":"+ldt1.getMinute()+":"+ldt1.getSecond());
		System.out.println(ldt1.getDayOfMonth()+"/"+ldt1.getMonthValue()+"/"+ldt1.getYear());
		
	}
	
}