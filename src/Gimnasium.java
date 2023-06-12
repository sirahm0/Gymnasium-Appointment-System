/*
Name: Ahmed Alhuthaify
Id: 2137574
Section: F4
Assignment No.: 2
*/
class Gimnasium {
    private int gimnasium_Number;
    private int gimnasium_Floor;
    
    Gimnasium(){
        
    }
    
    Gimnasium(int number, int floor) {
        this.gimnasium_Number = number;
        this.gimnasium_Floor = floor;
    }

//*****************Geter and Seter Methods*****************    
    public int getGimnasium_Number() {
        return gimnasium_Number;
    }
///////////////////////////////////////////////////////////
    public void setGimnasium_Number(int gimnasium_Number) {
        this.gimnasium_Number = gimnasium_Number;
    }
///////////////////////////////////////////////////////////
    public int getGimnasium_Floor() {
        return gimnasium_Floor;
    }
///////////////////////////////////////////////////////////
    public void setGimnasium_Floor(int gimnasium_Floor) {
        this.gimnasium_Floor = gimnasium_Floor;
    }

//*****************Print Method*****************    
    @Override
    public String toString() {
        return "Gimnasium: " + "Number : " + gimnasium_Number + " Floor : " + gimnasium_Floor;
    }
    
    
}
