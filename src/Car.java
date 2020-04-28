import java.util.Vector;

public class Car {
    private int ID;
    private String model;
    private String vendor;
    private String manufacturingYear;
    private float price;
    private Vector<Part> parts;
    private boolean usedStatus;

    public Car(int ID,String model,String manufacturingYear,float price,Vector<Part> parts,boolean usedStatus){
        this.ID=ID;
        this.model=model;
        this.manufacturingYear=manufacturingYear;
        this.price=price;
    }
    public Car(){
        this(0,"null","null",0,null,false);
    }


}
