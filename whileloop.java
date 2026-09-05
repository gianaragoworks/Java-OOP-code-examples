import java.util.Scanner;
class oop {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int up_bound = 0, ctr = 1, sum = 0;
    System.out.print("Enter upper bound value: ");
    up_bound = input.nextInt();

    while(ctr<=up_bound){
        sum+=ctr;
        ctr++;
    }
    System.out.print("the sum of all number is: " + sum);
  
    input.close();
    }
}


      
    
