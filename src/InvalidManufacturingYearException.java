public class InvalidManufacturingYearException extends  Exception{

    public InvalidManufacturingYearException(String s){
        super(s);
    }

    public static void test(int year)throws InvalidManufacturingYearException{
        if(year>2020 || year<1900){
            throw new InvalidManufacturingYearException( "Manufacturing Year should be older than or equal to this year" );
        }
    }

}
