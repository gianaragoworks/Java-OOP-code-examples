import java.util.Scanner;
class oop {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int up_bound = 0, sum = 0;
    System.out.print("Enter upper bound value: ");
    up_bound = input.nextInt();

    for(int ctr = 1; ctr <= up_bound; ctr++){
        sum+=ctr;
    }
    System.out.print("The sum of all number is: " + sum);
    input.close();
    }
}


      
    
