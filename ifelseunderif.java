import java.util.Scanner;
class oop {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number: ");
    int num = input.nextInt();

    if(num >= 0){
        int value = num % 2;
        if(value == 0){
            System.out.print(num + " is an even number");
        }
        else{
            System.out.print(num + " is an odd number");
        }
    }
    else{
            System.out.print(num + "is an negetive number");
        }
        input.close();
    }
   }


      
    
