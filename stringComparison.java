// string comparison
public class Main {
    public static void main(String[] args){
    String str1 = "strawberry";
    String str2 = "strawberry";

    //content comparison
    System.out.println(str1.equals(str2)); // output: true
    // lexicographic comparison
    System.out.println(str1.compareTo(str2)); // output" 0

    String fruit1 = "apple";
    String fruit2 = "strawberries";
    System.out.println(fruit1.equals(fruit2)); // output: false
    System.out.println(fruit1.compareTo(fruit2)); // output: -1

    }

}
