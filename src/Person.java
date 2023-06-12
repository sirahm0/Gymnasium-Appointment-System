
class Person {
    private int id;
    private String Name;
    private String Nationality;
    private int Year;
    private int Month;
    private int Day;
    private char Gender;
    private String Phone;
    private String Address;
    public static int IdGenerator;
    
    Person(){
        
    }

    Person(String Name, String Nationality, int Year, int Month, int Day, char Gender, String Phone, String Address) {
        this.Name = Name;
        this.Nationality = Nationality;
        this.Year = Year;
        this.Month = Month;
        this.Day = Day;
        this.Gender = Gender;
        this.Phone = Phone;
        this.Address = Address;
    }
//*****************Geter and Seter Methods*****************
    public int getId(){
        return id;
    }
///////////////////////////////////////////////////////////    
    public String getName() {
        return Name;
    }
///////////////////////////////////////////////////////////
    public void setName(String Name) {
        this.Name = Name;
    }
///////////////////////////////////////////////////////////
    public String getNationality() {
        return Nationality;
    }
///////////////////////////////////////////////////////////
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
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
    public char getGender() {
        return Gender;
    }
///////////////////////////////////////////////////////////
    public void setGender(char Gender) {
        this.Gender = Gender;
    }
///////////////////////////////////////////////////////////
    public String getPhone() {
        return Phone;
    }
///////////////////////////////////////////////////////////
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
///////////////////////////////////////////////////////////
    public String getAddress() {
        return Address;
    }
///////////////////////////////////////////////////////////
    public void setAddress(String Address) {
        this.Address = Address;
    }

//*****************Print Method*****************
    @Override
    public String toString() {
        return "ID :" + id + " Name :" + Name + " Nationality :" + Nationality + " Year :" + Year + " Month :" + Month + " Day :" + Day + " Gender :" + Gender + " Phone :" + Phone + " Address :" + Address;
    }

}
