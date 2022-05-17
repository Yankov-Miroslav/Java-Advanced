public class Car {
    private String brand;
    private String model;
    int horsePower;


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        if (horsePower < 0) {
            horsePower = 0;
        }
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }
    public Car (String brand, String model){
        this(brand,model, -1);
    }

    public Car(String brand, int horsePower){
        this(brand, "unknown",horsePower);
    }
    public Car (String brand) {
        this(brand, "unknown", -1);
    }

    public String toString(){
        return  String.format( "The car is: %s %s - %d HP.%n", this.getBrand(), this.getModel(), this.horsePower);
    }
}

