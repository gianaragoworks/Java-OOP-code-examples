class oop{

    static class Passport{
        String firstName;
        String secondName;

        Passport(){
            this.firstName = "Gian";
            this.secondName = "Carlo";
        }
    }
    public static void main(String[] args){
        Passport mypass = new Passport();
        System.out.println("my first name is " + mypass.firstName);

        
    }
}
