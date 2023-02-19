public class Phone {

    //    4.1
    long number;
    String model;

    double weight;
//    4.2

    public Phone(long number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight; 

    }
//4.3
    public Phone(long number, String model){
        this.number = number;
        this.model = model;
    }

    public void getModel() {
        System.out.println("This phone's model is" + model);

    }
    public void callNumber() {
        System.out.println("Call to this number" + number);
    }


}
