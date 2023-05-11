package OOPS;

public abstract class BaseAbstract {
     String name="default";
     abstract void BaseAbstractFeature1();

     void BaseAbstractFeature2(){
        System.out.println("name " + this.name);
     }
    
}
