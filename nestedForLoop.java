import java.util.Scanner;
class oop {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   
    int months = 2, weeks = 4;

    for(int mctr = 1; mctr <= months; mctr++){
        System.out.println("Month: "+mctr);

        for(int wctr = 1; wctr <= weeks; wctr++){
            System.out.println("Weeks: " + wctr);
        }
    }
    
    input.close();
    }
}


      
    
