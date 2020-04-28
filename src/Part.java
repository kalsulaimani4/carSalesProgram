public class Part {
    private int ID;
    private String model;
    private String vendor;

    public Part(int ID,String model,String vendor){
        this.ID=ID;
        this.model=model;
        this.vendor=vendor;
    }

    public Part(){
        this(0,"null","null");
    }
    // setter methods
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    // getter methods
    public int getID() {
        return ID;
    }

    public String getModel() {
        return model;
    }

    public String getVendor() {
        return vendor;
    }
}
