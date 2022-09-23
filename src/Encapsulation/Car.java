package Encapsulation;

public class Car {
    private String make;    //All variables here are private, meaning they cannot be directly accessed from outside this class.
    private String model;
    private int year;

    Car(String make, String model, int year){
        this.setMake(make);     //here within our constructor method, we can insert our setter method rather than standard assignment.
        this.setModel(model);
        this.setYear(year);
    }

    public String getMake() {   //simple getter method to retrieve contents of variables.
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    public void setMake(String make) {  //Simple setters allowing us to assign values from outside the class.
        this.make = make;
    }
    public void setModel(String model) {  //note the 'void' - we are not returning a value here.
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
