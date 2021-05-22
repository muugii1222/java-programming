package day46_encapsulation;

public class Car {

    //    private is access modifier
    private String model;
    private int year;
    private int mileage;

    //setter method for model
    public void setModel(String carModel){
        model = carModel;
    }

    //getter method for model
    public String getModel(){
        return model;
    }

    //setter model for year
    public void setYear(int year){
        this.year = year;
    }

    //getter method for year
    public int getYear(){
        return year;
    }

    //setter model for year
    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    //getter method for year
    public int getMileage(){
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
