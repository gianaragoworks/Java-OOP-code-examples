import java.util.Scanner;
class oop {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a digit: ");
    char digit = input.next().charAt(0);

    if(digit >= 48 || digit <= 57){
        System.out.print(digit + " is a digit");
    }
    else{
        System.out.print(digit + " is not a digit");
    }
    input.close();
    }
}


      
    
