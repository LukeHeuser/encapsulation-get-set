public class Main {
    public static void main(String[] args) {

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
