
class FitnessExpert extends Person{
    private boolean onLeave;

    FitnessExpert() {
        
    }

    FitnessExpert(String Name, String Nationality, int Year, int Month, int Day, char Gender, String Phone, String Address , boolean onLeave) {
        super(Name, Nationality, Year, Month, Day, Gender, Phone, Address);
        this.onLeave = onLeave;
    }

//*****************Geter and Seter Methods*****************    
    public boolean getOnLeave() {
        return onLeave;
    }
///////////////////////////////////////////////////////////
    public void setOnLeave(boolean onLeave) {
        this.onLeave = onLeave;
    }

//*****************Print Method*****************      
    @Override
    public String toString() {
        return  "onLeave :" + onLeave;
    }

    
    
}
