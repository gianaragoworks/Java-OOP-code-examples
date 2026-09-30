public class Addfunction{ // function that have parameters and return value
    public static int getAdd(int num1, int num2){
        int answer = num1 + num2;
        return answer;
    }
    public static void main(String[] args){
        int answer = getAdd(1,3);
        System.out.println(answer);
    }
}
 // --------NO RETURN FUNCTION (with parameters but without return value)---------------------
public class Addfunction{ 
    public static void getAdd(int x, int y){
        int answer = x + y;
        System.out.println("The answer  is: " + answer);
    }
    public static void main(String[] args){
        getAdd(1, 2);
    }
}

// ------PASSING VALUE FUNCTION----------
public class Passvalue{
    public static void getValue(int num){
        num = 100; // original value of num
    }
    public static void main(String[] args){
        int num = 98; // change the value of num
        getValue(num); // call the method and inside is the new num
        System.out.println("Value of now after method call: " + num);
    }
}

// ------- NO PARAMETERS AND RETURN VALUES ------
public class Showmessage{
    public static void message(){
        System.out.print("java is fun! tara kape?");
    }
    public static void main(String[] args){
        message();
    }
}

// ---- NO PARAMETERS BUT WITH RETURN VALUE ----
public class NoparameterButwithReturn{
    public static String words(){
        String word = "java is fun! tara kape?";
        return word;
    }
    public static void main(String[] args){
        String contca = words();
        System.out.println("The quote is: " + contca);
    }
}

// example no. 2
public class getNumber{
    public static int number(){
        return 10;
    }
    public static void main(String[] args){
        int value = number();
        System.out.println(value);
    }
}
