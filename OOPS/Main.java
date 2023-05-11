package OOPS;

public class Main {
    
    public static void main(String[] args) {
        DerivedInterface obj = new DerivedInterface("testingclass");
        obj.BaseInterfaceFeature1();
        obj.BaseInterfaceFeature2();
        obj.BaseAbstractFeature1();
        obj.BaseAbstractFeature2();
    }
}
