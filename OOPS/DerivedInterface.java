package OOPS;

public class DerivedInterface  extends BaseAbstract implements BaseInterface{
      String name;    

    public DerivedInterface(String name){
        this.name = name;
    }

    @Override
    public void BaseInterfaceFeature1() {
        System.out.println("method 'DerivedInterfaceFeature1'");
    }

    @Override
    public void BaseInterfaceFeature2() {
        System.out.println("method 'DerivedInterfaceFeature2'");
    }

    @Override
    public void BaseInterfaceFeature3() {
        System.out.println("method 'DerivedInterfaceFeature3'");
    }

    @Override
    void BaseAbstractFeature1() {
        System.out.println("method 'DerivedAbstractFeature1'");
    }

  
}
