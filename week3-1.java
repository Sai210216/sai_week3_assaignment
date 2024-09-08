 class Vehicle {
     
    public void start() {
        System.out.println("The vehicle is starting");
    }
}

 
class Car extends Vehicle {
    
    public void start() {
        System.out.println("The car is starting");
    }
}

 
class Bike extends Vehicle {
    
    public void start() {
        System.out.println("The bike is starting");
    }

}
 
  class Test{
    public static void main(String[] args) {
         
        Vehicle obj = new Vehicle();   
        Vehicle obj1 = new Car();           
        Vehicle obj2 = new Bike(); 
		obj.start();  
        obj1.start();       
        obj2.start();      
    
}

}