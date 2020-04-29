import java.util.Scanner;
import java.util.Vector;

public class CarSales {

    public static void main(String[] args){
        // added all the needed vectors to save the inputted information in
        Scanner scan = new Scanner(System.in);

        Vector<Part> partsVec= new Vector<>(50);// vector to hold all part objects
        Vector<Car> carVec= new Vector<>(50);// vector to hold all car objects
        Vector<Integer> numberOfParts= new Vector<>(50);// will store how many parts eatch car has

        int numOfTermination=0;// number will be set to 3 if user choses to end the program
        int index=0;// will increase when a new cars info is added
        int indexPart=0;// will be used to count the index parts for the vector
        while(numOfTermination!=3){//loop works till user choses nuber 3 and while loop will terminate
            System.out.println("1- Add new car "+"\n"+"2- Print all available  cars"+"\n"+"3- Exit");
            System.out.println("enter number for the wanted action ");
            int choice=scan.nextInt();

            switch (choice){

                case 1:
                    Car cars = new Car();
                    System.out.println("Enter car ID  ");
                    cars.setID(scan.nextInt());

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
                    cars.setManufacturingYear( year );

                    System.out.println("enter cars model  ");
                    cars.setModel( scan.next() );


                    System.out.println("Enter car price  ");
                    cars.setPrice( scan.nextFloat() );


                    System.out.println("enter car vendor ");
                    cars.setVendor( scan.next() );

                    System.out.println("how many car parts does this car have max is 3  ");
                    int numOfParts=scan.nextInt();
                    numberOfParts.add( index,numOfParts );
                    if(numOfParts>0){// making three possible part objects to be able to add them to the vector
                        loop:
                        for(int i=1;i<=numOfParts;i++){
                            if(numOfParts==1){
                                Part numOne= new Part();// part number one
                                System.out.println("part number "+i);

                                System.out.println("Enter part ID");
                                numOne.setPartID( scan.nextInt() );

                                System.out.println("Enter model ");
                                numOne.setPartModel(scan.next() );

                                partsVec.add(indexPart,numOne);
                                indexPart++;
                                continue loop;

                            }else if(numOfParts==2){// part number two
                                System.out.println("part number "+i);
                                Part numTwo= new Part();

                                System.out.println("Enter part ID");
                                numTwo.setPartID( scan.nextInt() );

                                System.out.println("enter part model  ");
                                numTwo.setPartModel( scan.next() );

                                System.out.println("enter part vendor ");
                                numTwo.setPartVendor( scan.next() );

                                partsVec.add(indexPart,numTwo);
                                indexPart++;
                                continue loop;

                            }else if(numOfParts==3){// part number 3
                                System.out.println("part number "+i);
                                Part numThree= new Part();

                                System.out.println("Enter part ID");
                                numThree.setPartID( scan.nextInt() );

                                System.out.println("enter part model ");
                                numThree.setPartModel( scan.next() );

                                System.out.println("enter part vendor ");
                                numThree.setPartVendor(scan.next());


                                partsVec.add(indexPart ,numThree);
                                indexPart++;
                                continue loop;
                            }
                        }

                    }else{
                        Part none = new Part(0,"none","none");
                        partsVec.add(index,none);
                    }

                    cars.setParts(partsVec);

                    System.out.println("is the car new ? ");
                    String use= scan.next();
                    cars.setVendor(use);

                    carVec.add(cars);
                    index++;// after all car parts have been added increment  counter
                    continue;

                case 2:

                    for(int i=0;i<carVec.size();i++ ){

                        carVec.elementAt( i ).getParts(numberOfParts.elementAt( i ));
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
