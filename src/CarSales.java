import java.util.Scanner;
import java.util.Vector;

public class CarSales {

    public static void main(String[] args){
        // added all the needed vectors to save the inputted information in
        Scanner scan = new Scanner(System.in);
        Vector<Integer> idVec= new Vector<>(50);
        Vector<String> modelVec= new Vector<>(50);
        Vector<String> vendorVec= new Vector<>(50);
        Vector<Integer> yearVec= new Vector<>(50);
        Vector<Float> priceVec= new Vector<>(50);
        Vector<Part> partsVec= new Vector<>(50);
        Vector<Boolean> usageVec= new Vector<>(50);


        int numOfTermination=0;// number will be set to 3 if user choses to end the program
        int index=0;// will increase when a new cars info is added
        while(numOfTermination!=3){//loop works till user choses nuber 3 and while loop will terminate
            System.out.println("1- Add new car "+"\n"+"2- Print all available  cars"+"\n"+"3- Exit");
            System.out.println("enter number for the wanted action ");
            int choice=scan.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter car ID  ");
                    int id=scan.nextInt();
                    idVec.add(index,id);

                    System.out.println("Enter car model ");
                    String model= scan.nextLine();
                    modelVec.add(index,model);

                    System.out.println("Enter car Vendor ");
                    String vendor=scan.nextLine();
                    int year=0;
                    while(true) {
                        System.out.println( "Enter car manufacture year   " );
                         year = scan.nextInt();
                        try {// try the method if the ectption is thrown keep asking till it is not
                            InvalidManufacturingYearException.test( year );
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            continue;
                        }
                        break;
                    }
                    yearVec.add(index,year);

                    System.out.println("Enter car price  ");
                    float price=scan.nextFloat();
                    priceVec.add( index,price );

                    System.out.println("how many car parts does this car have max is 3  ");
                    int numOfParts=scan.nextInt();
                    
                    continue;

                case 2:
                    continue;

                case 3:
                    numOfTermination=3;
                    System.out.println("Program terminated ");
                    continue;
            }
        }
    }
}
