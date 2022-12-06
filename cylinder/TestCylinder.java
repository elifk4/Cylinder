
package cylinder;

public class TestCylinder {
    
public static void main(String[] args ){
    
    System.out.println("Before creating objects: "+ Cylinder.getNoOfCylinder());
    Cylinder c1=new Cylinder();
    System.out.println("Radius: "+ c1.r + "Height: "+ c1.h);
    System.out.println("After creating first object: "+ c1.getNoOfCylinder());
    
    Cylinder c2=new Cylinder(2,5);
    System.out.println("Base area:" + c2.calculateBaseArea());
    System.out.println("Surface area:" + c2.calculateSurfaceArea());
    System.out.println("Volume:" + c2.calculateVolume());
    System.out.println("Mass:" + c2.calculateMass(1.34));
    
    
    System.out.println("Before creating second object:"+ c1.getNoOfCylinder());
    System.out.println("After creating second object:"+ c2.getNoOfCylinder());

    



    
    

}    
    
}
