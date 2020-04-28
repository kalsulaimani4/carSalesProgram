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
    
}
