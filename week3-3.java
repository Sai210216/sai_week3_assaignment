abstract class Vehicle {     
    public abstract void start();
}

interface Electric {
    void charge();  
}
 
    class Car extends Vehicle implements Electric {
     
    public void start() {
        System.out.println("Car is starting.");
    }
 
    public void charge() {
        System.out.println("Car is charging.");
    }
}
  class Bike extends Vehicle implements Electric {
     
    public void start() {
        System.out.println("Bike is starting.");
    }
 
    public void charge() {
        System.out.println("Bike is charging.");
    }
}
 
class Test {
    public static void main(String[] args) {
        
         Car obj = new Car();
        obj.start();     
        obj.charge();   
       
   	    Bike obj1 = new Bike();
        obj1.start();    
        obj1.charge();  
    }
}
