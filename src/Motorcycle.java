public class Motorcycle {

    // The below are instance fields or attributes
    private String make = "Honda";
    private String model = "CBR600RR";
    private String color = "Red";
    private int horsePower = 125;
    private boolean bike = true;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public boolean isBike() {
        return bike;
    }

    public void setMake(String make) {
        // this.make = make; // Tells java it wants to update the field 'private String make'
                          // with the contents of the parameter `make` that was passed to the method

        if (make == null) make = "unknown"; // Allows the information to be tested before returned to the user
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "honda", "suzuki", "yamaha", "kawasaki" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setSuperSport(boolean bike) {
        this.bike = bike;
    }

    public void describeMotorcycle() { // this method is not static because
                                // it is accessing instance fields on the class

        System.out.println(horsePower + ": Horsepower " +
                color + " " +
                make + " " +
                model + " " +
                (bike ? "Super Sport" : ""));

    }

}
