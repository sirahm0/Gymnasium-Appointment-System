
class Therapist extends FitnessExpert {
    private String Speciality;

    Therapist() {
        
    }

    Therapist(String Name, String Nationality, int Year, int Month, int Day, char Gender, String Phone, String Address, boolean onLeave, String Speciality) {
        super(Name, Nationality, Year, Month, Day, Gender, Phone, Address, onLeave);
        this.Speciality = Speciality;
    }

//*****************Geter and Seter Methods*****************    
    public String getSpeciality() {
        return Speciality;
    }
///////////////////////////////////////////////////////////
    public void setSpeciality(String Speciality) {
        this.Speciality = Speciality;
    }

    
    
}
