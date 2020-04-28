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
        int indexPart=0;// will be used to count the index parts for the vector
        while(numOfTermination!=3){//loop works till user choses nuber 3 and while loop will terminate
            System.out.println("1- Add new car "+"\n"+"2- Print all available  cars"+"\n"+"3- Exit");
            System.out.println("enter number for the wanted action ");
            int choice=scan.nextInt();

            switch (choice){
                case 1:

                    System.out.println("Enter car ID  ");
                    int id=scan.nextInt();
                    idVec.add(index,id);

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

                    System.out.println("enter cars model  ");
                    String model= scan.next();
                    modelVec.add( index,model );


                    System.out.println("Enter car price  ");
                    float price=scan.nextFloat();
                    priceVec.add( index,price );


                    System.out.println("enter car vendor ");
                    String vendor= scan.next();
                    vendorVec.add(index,vendor);

                    System.out.println("how many car parts does this car have max is 3  ");
                    int numOfParts=scan.nextInt();
                    if(numOfParts>0){// making three possible part objects to be able to add them to the vector
                        loop:
                        for(int i=1;i<=numOfParts;i++){
                            if(numOfParts==1){
                                Part numOne= new Part();// part number one
                                System.out.println("part number "+i);

                                System.out.println("Enter part ID");
                                numOne.setID( scan.nextInt() );

                                System.out.println("Enter model ");
                                numOne.setModel(scan.next() );

                                partsVec.add(indexPart,numOne);
                                indexPart++;
                                continue loop;

                            }else if(numOfParts==2){// part number two
                                System.out.println("part number "+i);
                                Part numTwo= new Part();

                                System.out.println("Enter part ID");
                                numTwo.setID( scan.nextInt() );

                                System.out.println("enter part model  ");
                                numTwo.setModel( scan.next() );

                                System.out.println("enter part vendor ");
                                numTwo.setVendor( scan.next() );

                                partsVec.add(indexPart,numTwo);
                                indexPart++;
                                continue loop;

                            }else if(numOfParts==3){// part number 3
                                System.out.println("part number "+i);
                                Part numThree= new Part();

                                System.out.println("Enter part ID");
                                numThree.setID( scan.nextInt() );

                                System.out.println("enter part model ");
                                numThree.setModel( scan.next() );

                                System.out.println("enter part vendor ");
                                numThree.setVendor(scan.next());


                                partsVec.add(indexPart ,numThree);
                                indexPart++;
                                continue loop;
                            }
                        }

                    }else{
                        Part none = new Part(0,"none","none");
                        partsVec.add(index,none);
                    }

                    System.out.println("is the car new ? ");
                    String use= scan.next();
                    if(use.equalsIgnoreCase( "yes" )){
                        usageVec.add(index,false );
                    }else{
                        usageVec.add( true );
                    }

                    index++;// after all car parts have been added increment  counter
                    continue;

                case 2:

                    for(int i=0;i<indexPart;i++ ){
                        System.out.println(partsVec.elementAt( i ).getID());
                        System.out.println(partsVec.elementAt( i ).getModel());
                        System.out.println(partsVec.elementAt( i ).getVendor());
                    }

                    continue;

                case 3:
                    numOfTermination=3;
                    System.out.println("Program terminated ");
                    continue;
                default:
                    System.out.println("invalid option ");
                    continue;
            }
        }
    }
}
