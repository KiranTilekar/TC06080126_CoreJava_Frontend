package My_Car;

class Car {
    private String brand;

    // Constructor to initialize the "brand" field with "Ford"
    public Car() {
        brand = "Ford";
    }

    // Getter method to access the "brand" field
    public String getBrand() {
        return brand;
    }
}

class Sample {
    public static void main(String[] args) {
        Car myCar = new Car();

        // Call the getBrand() method to retrieve the brand
        String carBrand = myCar.getBrand();

        // Print the value of the brand
        System.out.println("Car Brand: " + carBrand);  // This will print "Car Brand: Ford"
    }
}
