import java.util.Scanner;
public class PlayerSelection {
    public static void main(String[] args) {
        //collecting user input
        String name;
        int age;
        double height;
        double weight;
        int jersey_number;
        String selection;
        String position;
        String status;
        String decision;
        String lineup;
        String f_decision;


        Scanner sc=new Scanner(System.in);
        System.out.println("Name:");
        name=sc.nextLine();
        System.out.println("Age: ");
        age=sc.nextInt();
        System.out.println("Height(in meters): ");
        height=sc.nextDouble();
        System.out.println("Weight(in pounds): ");
        weight=sc.nextDouble();
        System.out.println("Jersey number:");
        jersey_number=sc.nextInt();

        final double pound=0.45359237;
        final int meter=100;
        //Covertion of weight
        double weight_in_kg=weight*pound;
        //Covertion of height
        double height_in_cm=height*meter;

        //Checking Eligibility
        Boolean eligibility =(18<=age && age<=35)&&( weight<90);
        if(eligibility){
            status="Eligible";
        }
        else{
            status="Not Eligible";
        }


        //Positions according to Jersey numbers
        switch (jersey_number){
            case 1:
                position="Goalkeeper";
                break;
            case 2:
            case 5:
                position="defender";
                break;
            case 6:
               
            case 8:
                position="Midfielder";
                break;
            case 7:               
            case 11:
                position="Winger";
                break;
            case 9:
                position="Striker";
                break;
            case 10:
                position="Playmaker";
                break;
            default:
                position="Not known";
        }    
        

        //Attacker jersey holders
        if(jersey_number==7 || jersey_number==9 || jersey_number==10 || jersey_number==11){
            decision="Yes";
        }
        else{
            decision="No";
        }


        //Lineup decision
        if(age<20){
            selection="Rising Star";
        }
        else if(age>=20 && age<=30){
            selection="Prime Player";
        }
        else {
            selection="Veteran";
        }
                
        if(selection.equals("Prime Player")){
            if(weight_in_kg<80){
            lineup="Starting lineup";
            } else{
                lineup="bench";
            }
        }    
        else{
            lineup="bench";            
        }  
        
        
        //Final Decision
        String test=eligibility?"Play":"Rest";
        f_decision=test;


        //Player Report
        System.out.println("Player Report");
        System.out.println("Player: "+name);
        System.out.println("Age: "+age+", "+selection);
        System.out.println("Height: "+height_in_cm+" cm");
        System.out.println("Weight: "+weight_in_kg+" kg");  
        System.out.println("Jersey number: "+jersey_number);
        System.out.println("Position: "+position);
        System.out.println("Attacker jersey: "+decision);
        System.out.println("Eligibility: "+status);
        System.out.println("Lineup: "+lineup);
        System.out.println("Final Decision: "+f_decision);
    }
}
