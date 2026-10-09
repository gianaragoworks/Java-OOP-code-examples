class oop{

    static class Passport{
        String firstName;
        String secondName;

        Passport(String firsName, String secondName){
            this.firstName = firsName;
            this.secondName = secondName;
        }
    }
    public static void main(String[] args){
        Passport mypass = new Passport("Gian", "Carlo");
        System.out.println("my name is: " + mypass.firstName);
        System.out.println("my second name is: " + mypass.secondName);
        
    }
}

// class using void
class oop{
    void honkHorn(){
        System.out.println("beep beep");
    }
    public static void main(String[] args){
        oop myoop = new oop();
        myoop.honkHorn();
    }
}
