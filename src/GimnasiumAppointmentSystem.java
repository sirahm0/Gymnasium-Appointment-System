import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

 class GimnasiumAppointmentSystem {
    static File file = new File("input.txt");
    static File out = new File("output.txt");
    static PrintWriter output;
    static int countTrainee = 0;
    static int countCancel = 0;
    static int countPrint = 0;
    
    public static void main(String[] args) throws FileNotFoundException {
            if(!file.exists()){
                System.out.println("The File Not Exists");
                System.exit(0);
            }
            
            
            Scanner input = new Scanner(file);
            output = new PrintWriter(out);
            
            output.println("Welcome to the Gymnasium Appointment System! \n");
            
            ArrayList<Person> physician = new ArrayList<>();
            ArrayList<Person> kinesiologist = new ArrayList<>();
            ArrayList<Trainee> trainee = new ArrayList<>();
            int Physician_num = 0;
            int kinesiologist_num = 0;
            int trainee_num = 0;
            int gimnasium_num = 0;
            int appointment_num = 0;
            Gimnasium[] gimnasium = new Gimnasium[2];
            Appointment[] appointment = new Appointment[24];
            
            //assign the value
            SET_Therapist(physician, Physician_num, input, output);
            SET_Kinesiologist(kinesiologist, kinesiologist_num, input, output);
            SET_Trainee(trainee, trainee_num, input, output);
            SET_Gimnasium(gimnasium, gimnasium_num, input, output);
            SET_Appointment(appointment, appointment_num, input, output);
            
            //Call the methods
            String line = input.next();
             while(input.hasNext()){
                line = input.next();
                switch (line) {
                    case "RSRVAppointment":
                        SET_MakeAppointment(appointment, appointment_num , trainee , input, output);
                        break;
                    case "CancelAppointment":
                        SET_CancelAppointment(appointment, appointment_num , trainee , input, output);
                        break;
                    case "PrintTraineeRecord":
                        PrintTraineeRecord(trainee , input , output);
                        break;
                 }
                
            }       
            
            
            output.println("Thank you for using the Gymnasium appointment System, Good Bye!");
            
            output.close();
            input.close();
            
    }

    public static void SET_Therapist(ArrayList<Person> physician, int Physician_num, Scanner input, PrintWriter output) throws FileNotFoundException{
        
            input = new Scanner(file);
            
            Physician_num  = input.nextInt();
            
            String line;
            boolean found = false;
            
            //read the command
            while(input.hasNext()){
                line = input.nextLine();
               
                if(line.contains("SET_Therapist")){
                    output.println("COMMAND: " + splitName(line)+ "\n");
                    found = true;
                    break;
                }   
            }           
            
            String name;
            String nationality;
            int year;
            int month;
            int day;
            char gender;
            String phone;
            String address;
            boolean onLeave;
            String Speciality;
            
            int i = 0;
            //assign the values    
            while(found && i != Physician_num){
                    name = input.next();
                    nationality = input.next();
                    year = input.nextInt();
                    month = input.nextInt();
                    day = input.nextInt();
                    gender = input.next().charAt(0);
                    phone = input.next();
                    address = input.next();
                    onLeave = input.nextBoolean();
                    Speciality = input.next();
                    
                    Therapist p1 = new Therapist(splitName(name) , nationality , year , month , day , gender , phone , address , onLeave , Speciality);
                    physician.add(p1);
                    output.println("Name: " + splitName(name) + " Added!");
                    i++;
            }
                output.println();
                output.println("------------------------------------------------------------------------------------------------------\n");
                
                input.close();
                
    }

    public static void SET_Kinesiologist(ArrayList<Person> kinesiologist , int Kinesiologist_num , Scanner input, PrintWriter output) throws FileNotFoundException{
            
            input = new Scanner(file);
           
            
             for(int i = 0 ; i < 2 ; i++)
                Kinesiologist_num  = input.nextInt();
            
             
            String line ;
            boolean found = false;
            
            //read the command
            while(input.hasNext()){
                line = input.nextLine();
               
                if(line.contains("SET_Kinesiologist")){
                    output.println("COMMAND: " + splitName(line) + "\n");
                    found = true;
                    break;
                }   
            }   
            
            
            String name;
            String nationality;
            int year;
            int month;
            int day;
            char gender;
            String phone;
            String address;
            boolean onLeave;
            int experianceYears;
            
            int i = 0;
            
            //assign the values
            while(found && i != Kinesiologist_num){
                    name = input.next();
                    nationality = input.next();
                    year = input.nextInt();
                    month = input.nextInt();
                    day = input.nextInt();
                    gender = input.next().charAt(0);
                    phone = input.next();
                    address = input.next();
                    onLeave = input.nextBoolean();
                    experianceYears = input.nextInt();
                    
                    Kinesiologist k1 = new Kinesiologist(splitName(name) , nationality , year , month , day , gender , phone , address , onLeave , experianceYears);
                    kinesiologist.add(k1);
                    output.println("Name: " + splitName(name) + " Added!");
                    i++;
            }
                output.println();
                output.println("------------------------------------------------------------------------------------------------------\n");
                
                input.close();
    }

    static void SET_Trainee(ArrayList<Trainee> trainee , int Trainee_num , Scanner input, PrintWriter output) throws FileNotFoundException{
        
            input = new Scanner(file);
            
            
            for(int i = 0 ; i < 3 ; i++)
                Trainee_num = input.nextInt();
               
            
            String line ;
            String name;
            String nationality;
            int year;
            int month;
            int day;
            char gen;
            String phone;
            String address;
            String service;
            boolean found = false;
            
            //read the command
            while(input.hasNext()){
                line = input.nextLine();
               
                if(line.contains("SET_Trainee")){
                    output.println("COMMAND: " + splitName(line) + "\n");
                    found = true;
                    break;
                }   
            }   
            int i = 0;    
            
            //assign the values
            while(found && i != Trainee_num){
                
                name = input.next();
                nationality = input.next();
                year = input.nextInt();
                month = input.nextInt();
                day = input.nextInt();
                gen =  input.next().charAt(0);
                phone = input.next();
                address = input.next();
                service = input.next();
                    
                    
                    Trainee T1 = new Trainee(splitName(name) , nationality , year , month , day , gen , phone , address , service);
                    trainee.add(T1);
                    output.println("Name: " + splitName(name) + " Added!");
                    i++;
            }
                
                output.println();
                output.println("------------------------------------------------------------------------------------------------------\n");
                
                input.close();
    }
    
    static void SET_Gimnasium(Gimnasium[] gimnasium , int gimnasium_num , Scanner input, PrintWriter output) throws FileNotFoundException{
        
            input = new Scanner(file);
            
            
            for(int i = 0 ; i < 4 ; i++)
                gimnasium_num  = input.nextInt();
            
            String line;
            boolean found = false;
            
            //read the command
            while(input.hasNext()){
                line = input.nextLine();
               
                if(line.contains("SET_Gimnasium")){
                    output.println("COMMAND: " + splitName(line) + "\n");
                    found = true;
                    break;
                }   
            } 
            
            
            
            int i = 0;
            int number;
            int floor;
            Gimnasium g;
            
            //assign the values
            while(found && i != gimnasium_num){
                number = input.nextInt();
                floor = input.nextInt();
                g = new Gimnasium(number , floor);
                gimnasium[i] = g;
                i++;
            }
            
            for (int x = 0; x < gimnasium.length; x++) {
                output.println(gimnasium[x].toString());
            }   
            
            output.println();
            output.println("------------------------------------------------------------------------------------------------------\n");
            
            input.close();
            
    }
    
    static void SET_Appointment(Appointment[] appointment , int appointment_num , Scanner input, PrintWriter output) throws FileNotFoundException{
        
            input = new Scanner(file);
            
            
            for(int i = 0 ; i < 5 ; i++)
                appointment_num  = input.nextInt();
            
            String line;
            boolean found = false;
            
            //read the command
            while(input.hasNext()){
                line = input.nextLine();
               
                if(line.contains("SET_Appointment")){
                    output.println("COMMAND: " + splitName(line) + "\n");
                    found = true;
                    break;
                }   
            }
            
            
            
            int number;
            int floor;
            int year;
            int month;
            int day;
            int appoin;
            Gimnasium g;
            Appointment a;
            int i = 0;
            
            //assign the values
            while(found && i != appointment_num){
                number = input.nextInt();
                floor = input.nextInt();
                year = input.nextInt();
                month = input.nextInt();
                day = input.nextInt();
                appoin = input.nextInt();
                
                g = new Gimnasium(number , floor);
                a = new Appointment(g , year , month , day , appoin);
                appointment[i] = a;
                i++;
            }
            
            for (int x = 0; x < appointment.length; x++) {
                output.println(appointment[x].toString());
            }   
            
            output.println();
            output.println("------------------------------------------------------------------------------------------------------\n");
            
            input.close();
            
   }
    
    static void SET_MakeAppointment(Appointment[] appointment , int appointment_num , ArrayList<Trainee> trainee, Scanner input, PrintWriter output) throws FileNotFoundException {
        
        
        input = new Scanner(file);
        
        
        String line = input.next();
        
        String name = null ;
        int number = 0;
        int floor = 0;
        int year = 0;
        int month = 0;
        int day = 0;
        int start = 0;
        Gimnasium g;
        
        //skip the read values
        if(countTrainee >= 7)
            countTrainee+=2;
        
        skipLines(input , 52 + countTrainee);
        
        //read the command And assign the values
        while(input.hasNext()){
             line = input.next();
                if(line.contains("RSRVAppointment")){
                output.println("COMMAND: RESERVE APPOINTMENT\n");
                
                name = splitName(input.next());
                number = input.nextInt();   
                floor = input.nextInt();
                year = input.nextInt();
                month = input.nextInt();
                day = input.nextInt();
                start = input.nextInt();
                
                g = new Gimnasium(number , floor);
                boolean check = false;
                
                int foundAppo = SerachForAppointment(appointment , name , number , floor , year , month , day , start);
                int foundName = SerachForTrainee(trainee , name);
                
                Appointment appo = new Appointment(g , year , month , day , start);
                
                //print the output
                if(foundName == -1)
                         output.println("Trainee " + name +" is not registered");
                else if(foundAppo == -1)
                         output.println("Appointment not found in the Gimnasium appointment list");
                
                else if(foundName >= 0 && foundAppo == 0 ){
                    for (int i = 0; i < appointment.length; i++){
                        if(appointment[i].toString().equals(appo.toString())){ 
                            if(appointment[i].getAvailable() == false){
                                output.println("Appointment is taken by other Trainee");
                                check = true;
                            }
                        }
                    }
                     
                    if(trainee.get(foundName).getNumberofAppoinment() >= 2 && check != true){
                        output.println("Appointment for Trainee " + name + " can not be added as he has 2 appointment registered");
                        check = true;
                    }
                    
                    else if(check == false){
                    boolean addappoi = trainee.get(foundName).Addappointment(g, year, month, day, start);
                    trainee.get(foundName).setNumberofAppoinment(trainee.get(foundName).getNumberofAppoinment() + 1);
                     for (int i = 0; i < appointment.length; i++) {
                         if(appointment[i].toString().equals(appo.toString()))
                             appointment[i].setAvailable(false);
                     }
                    output.println("Appointment for Trainee "+ name +" is done");
                    }
                 }
                countTrainee++;
                output.println();
                output.println("------------------------------------------------------------------------------------------------------\n");
                break;                    
            }
            
        }
        input.close();
        
    }
    
    static void SET_CancelAppointment(Appointment[] appointment , int appointment_num , ArrayList<Trainee> trainee, Scanner input, PrintWriter output) throws FileNotFoundException{
        
        input = new Scanner(file);
        
        
        String line = input.next();
        
        String name = null ;
        int number = 0;
        int floor = 0;
        int year = 0;
        int month = 0;
        int day = 0;
        int start = 0;
        
        Gimnasium g;
                            
        //skip the read values
        if(countCancel == 1)
            countCancel=2;
        else if(countCancel == 2)
            countCancel=3;
        
        skipLines(input , 68 +countCancel);
        
        //read the command And assign the values
        while(input.hasNext()){
                line = input.next();
                if(line.contains("CancelAppointment")){
                output.println("COMMAND: CANCEL APPOINTMENT\n");
                
                name = splitName(input.next());
                number = input.nextInt();   
                floor = input.nextInt();
                year = input.nextInt();
                month = input.nextInt();
                day = input.nextInt();
                start = input.nextInt();
                
                g = new Gimnasium(number , floor);
                Appointment appo = new Appointment(g , year , month , day , start);
                int foundName = SerachForTrainee(trainee , name);
                
                int foundAppo = 0;
                //print the output
                if(foundName != -1)
                    foundAppo = trainee.get(foundName).SearchappoinmentAT(year , month , day , start);
                
                if(foundName == -1)
                         output.println("Trainee: " + name +" is not registered");
                
                else if(foundAppo == -1)
                         output.println("Appointment not found in Trainee "+ name +" records");
                
                else if(foundName >= 0 && trainee.get(foundName).getNumberofAppoinment() == 0){
                    output.println("Appointment not found in Trainee "+ name +" records"); 
                }
                
                else{
                    for (int i = 0; i < appointment.length; i++) {
                         if(appointment[i].toString().equals(appo.toString())){
                             appointment[i].setAvailable(true);
                             for (int x = 0 ; x < trainee.get(foundName).getNumberofAppoinment() ; x++){
                                if(trainee.get(foundName).getappoinmentAT(x).equals(appo.toString())){
                                    trainee.get(foundName).DellappoinmentAT(x);
                                    break;
                                    }
                                    
                                }
                             
                         }
                    }
                    output.println("Appointment for Trainee "+ name + " is Canceled");
                    output.println("Appointment is Canceled from the Gymnasium appointment list and available for other Trainee.");     
                }
                countCancel++;
                output.println();
                output.println("------------------------------------------------------------------------------------------------------\n");
                break;
            }
        
        }
        input.close();
        
    }

    static int SerachForAppointment(Appointment[] appointment , String name , int gimnasium_num , int gimnasium_floor , int year , int month , int day , int time){
        
        //serach for the appointment from the appointment array
        int appo = -1;
        Gimnasium g = new Gimnasium(gimnasium_num , gimnasium_floor );
        String search = (g.toString() + " Date: " + day + "/" + month + "/" + year + " Time: " + time+":00" );
        
        for (int i = 0; i < appointment.length; i++) {
        if(appointment[i].toString().equals(search))
            appo = 0;
        }
            
        return appo; 
    } 
    
    static int SerachForTrainee(ArrayList<Trainee> trainee , String name){ 
        
        //serach for the appointment from the trainee array
        int index = -1;
        for(int x = 0 ; x < trainee.size() ; x++)
            if(trainee.get(x).getName().contains(name)){
                index = x;
            }
        
        return index;
            
        
    }
    
    static void PrintTraineeRecord(ArrayList<Trainee> trainee , Scanner input, PrintWriter output) throws FileNotFoundException{
        
        input = new Scanner(file);
        
        
        
        String line = input.next();
        String name = null ;
         
        ////skip the read values
        if(countPrint == 1)
            countPrint++;
        else if(countPrint == 2)
            countPrint=5;
        else if(countPrint == 3)
            countPrint=8;
        else if(countPrint == 4)
            countPrint =14;
        else if(countPrint == 10 )
            countPrint = 15;
        else if(countPrint >= 16 )
            countPrint = 18;
        
        skipLines(input , 61 + countPrint);
        
        //print the output
        while(input.hasNext()){
                line = input.next();
                if(line.contains("PrintTraineeRecord")){
                output.println("COMMAND: Print Trainee APPOINTMENTS Record\n");
                
                name = splitName(input.next());
    
                int foundName = SerachForTrainee(trainee , name);
                
                if(foundName == -1)
                         output.println("Trainee: " + name +" is not registered");
                
                else if(trainee.get(foundName).getNumberofAppoinment() == 0){
                    output.println("Appointment for "+ name +" are:");
                    output.println("Trainee "+ name +" has no appointent");
                }
                
                else{
                    output.println("Appointment for "+  name +" are: ");
                    for(int i = 0 ; i < trainee.get(foundName).getNumberofAppoinment() ; i++){
                        int x=i+1;
                        output.println("Appointment number: " + x + " "+ trainee.get(foundName).getappoinmentAT(i));
                    }
                    
                }
                countPrint++;
                output.println();
                output.println("------------------------------------------------------------------------------------------------------\n");
                break;
                
            }
        }
        
        input.close();
        
    }
 
    public static String splitName (String string){
        return string.replace("_" , " ");
    }
    
    static void skipLines(Scanner input, int x) {
        for (int i = 0; i < x; i++) {
            if (input.hasNextLine());
            input.nextLine();
        }
    }
    
}