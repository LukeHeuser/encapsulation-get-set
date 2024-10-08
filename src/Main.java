public class Main {
    public static void main(String[] args) {

        // Unsightly code, but serves to make the point/ premise of creating an object.
        // By using getters and setters to access the private fields of the class/ blueprint.
        // We can instantiate an object of type Motorcycle and add value to the fields.

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setMake("Honda");
        motorcycle.setModel("CBR600 RR");
        motorcycle.setHorsePower(125);
        motorcycle.setColor("Black");
        motorcycle.setSuperSport(true);
        System.out.println("Make = " + motorcycle.getMake());
        System.out.println("Model = " + motorcycle.getModel());
        motorcycle.describeMotorcycle();


        Motorcycle suzuki = new Motorcycle();
        suzuki.setMake("Suzuki");
        suzuki.setModel("GSXR 600");
        suzuki.setHorsePower(126);
        suzuki.setColor("Blue and white");
        suzuki.setSuperSport(true);

        suzuki.describeMotorcycle();
    }



}
