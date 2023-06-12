/*
Name: Ahmed Alhuthaify
Id: 2137574
Section: F4
Assignment No.: 2
*/
import java.util.ArrayList;
import java.util.Arrays;

class Trainee  extends Person{
    private String service;
    private  Appointment appointment[];
    private int numberofAppoinment;
    public static int numberOfTrainee;

    Trainee() {
        
    }

    Trainee(String Name, String Nationality, int Year, int Month, int Day, char Gender, String Phone, String Address , String service) {
        super(Name, Nationality, Year, Month, Day, Gender, Phone, Address);
        this.service = service;
    }

//*****************Geter and Seter Methods*****************    
    public String getService() {
        return service;
    }
///////////////////////////////////////////////////////////
    public void setService(String service) {
        this.service = service;
    }
///////////////////////////////////////////////////////////    
    public void setNumberofAppoinment(int numberofAppoinment) {
        this.numberofAppoinment = numberofAppoinment;
    }
///////////////////////////////////////////////////////////    
    public int getNumberofAppoinment() {
        return this.numberofAppoinment;
    }
    
//*****************Service Methods*****************      
    public String getappoinmentAT(int index){
       return this.appointment[index].toString();
    }
    
///////////////////////////////////////////////////////////    
    public boolean Addappointment(Gimnasium gimnasium , int year , int month , int day , int appointment){
       if (this.appointment == null) {
            this.appointment = new Appointment[0];
        }
        Appointment newAppointment = new Appointment(gimnasium ,  year ,  month , day ,  appointment);
        ArrayList<Appointment> list = new ArrayList<Appointment>(Arrays.asList(this.appointment));
        list.add(newAppointment);
        this.appointment = list.toArray((new Appointment[0]));
        return true;
        
    }
///////////////////////////////////////////////////////////    
    public void DellappoinmentAT(int index){
        Appointment[] newArr = new Appointment[this.appointment.length - 1];
         for (int i = 0, j = 0; i < this.appointment.length; i++) {
            if (i != index) {
                newArr[j++] = this.appointment[i];
                }
            }  
        System.arraycopy(newArr, 0, this.appointment, 0, newArr.length);
        this.numberofAppoinment--;
               
    }
///////////////////////////////////////////////////////////    
    public int SearchappoinmentAT(int year , int month , int day , int time){
        int index = -1;
        for (int i = 0; i < this.appointment.length; i++) {
            if(appointment[i].getYear() == year && appointment[i].getMonth() == month && 
                appointment[i].getDay() == day && appointment[i].getAppointmentTime() == time){
            index = i;
            }
        }    
                    
        return index;
        
    }    
    
///////////////////////////////////////////////////////////    
    public String appoinmentAt(int i){
        return this.appointment[i].toString();
    }

//*****************Print Method*****************     
    @Override
    public String toString() {
        return "service = " + service + ", numberofAppoinment = " + numberofAppoinment;
    }

}
