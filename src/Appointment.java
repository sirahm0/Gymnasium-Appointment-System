/*
Name: Ahmed Alhuthaify
Id: 2137574
Section: F4
Assignment No.: 2
*/
public class Appointment {
    
    private Gimnasium gimnasium;
    private int Year;
    private int Month;
    private int Day;
    private int Appointment;
    private boolean Available = true;
    
    Appointment(){
        
    }

    Appointment(Gimnasium gimnasium, int Year, int Month, int Day, int Appointment) {
        this.gimnasium = gimnasium;
        this.Year = Year;
        this.Month = Month;
        this.Day = Day;
        this.Appointment = Appointment;
    }

//*****************Geter and Seter Methods*****************    
    public Gimnasium getGimnasium() {
        return gimnasium;
    }
///////////////////////////////////////////////////////////
    public void setGimnasium(Gimnasium gimnasium) {
        this.gimnasium = gimnasium;
    }
///////////////////////////////////////////////////////////
    public int getYear() {
        return Year;
    }
///////////////////////////////////////////////////////////
    public void setYear(int Year) {
        this.Year = Year;
    }
///////////////////////////////////////////////////////////
    public int getMonth() {
        return Month;
    }
///////////////////////////////////////////////////////////
    public void setMonth(int Month) {
        this.Month = Month;
    }
///////////////////////////////////////////////////////////
    public int getDay() {
        return Day;
    }
///////////////////////////////////////////////////////////
    public void setDay(int Day) {
        this.Day = Day;
    }
///////////////////////////////////////////////////////////
    public int getAppointmentTime() {
        return Appointment;
    }
///////////////////////////////////////////////////////////
    public void setAppointmentTime(int Appointment) {
        this.Appointment = Appointment;
    }
///////////////////////////////////////////////////////////
    public boolean getAvailable() {
        return Available;
    }
///////////////////////////////////////////////////////////
    public void setAvailable(boolean Available) {
        this.Available = Available;
    }

//*****************Print Method*****************    
    @Override
    public String toString() {
        return gimnasium.toString() + " Date: " + Day + "/" + Month + "/" + Year + " Time: " + Appointment+":00" ;
    }

    
    
}
