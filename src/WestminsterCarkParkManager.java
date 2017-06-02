
import java.util.ArrayList;
import java.util.Scanner;


public class   WestminsterCarkParkManager implements CarParkManager{

    
    private ArrayList<Vehicle> vehicleList;
    private int no;
    
   
    public WestminsterCarkParkManager(int listLength){
        
        this.no = listLength;
        vehicleList = new ArrayList<Vehicle>();
    }
    
   

    
    @Override
    public void addNewVehicle(Vehicle type) {
        
        Scanner sc= new Scanner(System.in);
        
        if(vehicleList.size() < no){

            vehicleList.add(type);
        
        }else{
    
           System.out.println("Sorry!!!!!!");
           System.out.println("No parking space available.Please wait until a vacancy comes");
}
    
}
    
    public static void main(String [] args){
        

        String input = "H";

         Scanner sc = new Scanner(System.in);
         
         
         
        while(!input.equals("ex")){
            
            System.out.println(
                    " \n   Westminster Car Park Management System \n"
                    + "\n\n"
                    + "\n         Main Menu                       \n"
                    + "\nA - Add New Vehicle \n"
                    + "D - Delete Vehicle from Car Park \n"
                    + "P - Print Details \n"
                    + "X - Exit system \n");

            System.out.print("Enter a process : ");
            
            
            try{
                input = sc.next().toUpperCase();
                
                
                switch (input) {
                    case "A":
                       
                     System.out.println(" --------------------------------");
                     System.out.println(" Select the Type Of Your Vehicle ");
                     System.out.println("---------------------------------\n"
                                         + "C - Car \n"
                                         + "V - Van \n"
                                         + "M - MotorBike \n");
             
                        
                       try{
                
                input = sc.next().toUpperCase();
                
                switch(input){
                    
                    case "C":
//                        car.getBrandName();
//                        car.getIdPlate();
//                        car.getNoOfDoors();
//                        car.getColor();
//                                
//                        arraylist.add(car);
//                        System.out.println(car.arraylist);
//                        break;
//                         
                       break;
                       case "X":
                        System.out.print("Thank you for visiting Westminster CarPark "
                                + " Management System  \n Good bye!!!!!!\n\n\n\n");
                        break;
                     default:
                        System.out.println("Please Try again Invalid Procedure!"
                                + "\n Enter a correct "
                                + "procedure to view details of Westminster CarPark Management System ");
                        break;
            }
            }
            
            catch(Exception e){
            System.out.println("Invalid Input!. Please enter again. ");
            sc.nextLine();
    }
            
            
        }
        
              
               
        }
            
              catch(Exception e){
            System.out.println("Invalid Input!. Please enter again. ");
            sc.nextLine();
    }
       

        }
        
        sc.close();
    }
    
    
        
      
}