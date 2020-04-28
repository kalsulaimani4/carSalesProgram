import java.util.Scanner;
import java.util.Vector;

public class CarSales {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Vector<Integer> idVec= new Vector<>(50);
        Vector<String> modelVec= new Vector<>(50);
        Vector<String> vendorVec= new Vector<>(50);
        Vector<Integer> yearVec= new Vector<>(50);
        Vector<Float> priceVec= new Vector<>(50);
        Vector<Part> partsVec= new Vector<>(50);
        Vector<Boolean> usageVec= new Vector<>(50);


        int numOfTermination=0;
        int index=0;
        while(numOfTermination!=3){
            System.out.println("1- Add new car "+"\n"+"2- Print all available  cars"+"\n"+"3- Exit");
            System.out.println("enter number for the wanted action ");
            int choice=scan.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter  ");

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
