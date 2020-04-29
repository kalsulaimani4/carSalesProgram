import com.sun.org.glassfish.external.statistics.StringStatistic;

import java.security.InvalidParameterException;
import java.util.Vector;

public class Car {
    private int ID;
    private String model;
    private String vendor;
    private int manufacturingYear;
    private float price;
    private Vector<Part> parts;
    private boolean usedStatus;

    public Car(int ID,String model,int manufacturingYear,float price,Vector<Part> parts,boolean usedStatus){
        this.ID=ID;
        this.model=model;
        this.manufacturingYear=manufacturingYear;
        this.price=price;
    }
    public Car(){
        this(0,"null",2000,0,null,false);
    }
    // setter methods
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setParts(Vector<Part> parts) {
        this.parts = parts;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setUsedStatus(String use ) throws InvalidParameterException {
        if(use.equalsIgnoreCase( "yes" )){
            usedStatus=true;
        }else if (use.equalsIgnoreCase( "no" )){
            usedStatus=false;
        }else{
            throw new InvalidParameterException("invalid answer ");
        }
    }

    // getter methods
    public int getID() {
        return ID;
    }

    public String getModel() {
        return model;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public float getPrice() {
        return price;
    }

    public void  getParts(int amount) {
        if(amount>0){
        for(int i=0;i<amount;i++) {
            System.out.println( "Part ID :" + parts.elementAt( i ).getPartID() );
            System.out.println( "Part Model :" + parts.elementAt( i ).getPartModel() );
            System.out.println( "Part vendor : " + parts.elementAt( i ).getPartVendor() );
        }
        }else{
            System.out.println("no parts ");
        }
    }

    public String getVendor() {
        return vendor;
    }

    public boolean getUsedStatus() {
        return usedStatus;
    }

}
