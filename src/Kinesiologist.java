class Kinesiologist extends FitnessExpert{
    private int experianceYears;

    Kinesiologist(String Name, String Nationality, int Year, int Month, int Day, char Gender, String Phone, String Address, boolean onLeave, int experianceYears) {
        super(Name, Nationality, Year, Month, Day, Gender, Phone, Address, onLeave);
        this.experianceYears = experianceYears;
    }

//*****************Geter and Seter Methods*****************    
    public int getExperianceYears() {
        return experianceYears;
    }
///////////////////////////////////////////////////////////
    public void setExperianceYears(int experianceYears) {
        this.experianceYears = experianceYears;
    }
}
