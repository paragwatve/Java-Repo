package JUNIT;

public class Lab1_Date {
	int Day, Month, Year;
	// Constructor
	Lab1_Date(int Day, int intMonth, int intYear) {
	this.Day = Day;
	this.Month = intMonth;
	this.Year = intYear;
	}
	public int getDay() {
		return Day;
	}
	public void setDay(int day) {
		Day = day;
	}
	public int getMonth() {
		return Month;
	}
	public void setMonth(int month) {
		Month = month;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	@Override
	public String toString() {
		return "Date [Day=" + Day + ", Month=" + Month + ", Year=" + Year + "]";
	}	
	
}//Date Class

	

	
