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
    public void setPartID(int ID) {
        this.ID = ID;
    }

    public void setPartModel(String model) {
        this.model = model;
    }

    public void setPartVendor(String vendor) {
        this.vendor = vendor;
    }

    // getter methods
    public int getPartID() {
        return ID;
    }

    public String getPartModel() {
        return model;
    }

    public String getPartVendor() {
        return vendor;
    }
}
