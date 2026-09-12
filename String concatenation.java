// concatenate string using 2 methods
public class Main {
    public static void main(String[] args){
      String name = "Gian" , secondName = "Carlo";
      // using the + operator
      System.out.println(name + " " + secondName);
      // using the concat method
      System.out.println(name.concat(" ").concat(secondName));

    }

}
