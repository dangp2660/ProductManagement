
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager manager = new ProductManager();
        int opt = -1;
        do {
            System.out.println("1. Add a product");
            System.out.println("2. Add an electric product");
            System.out.println("3. Display all electric product");
            System.out.println("4. Sort by power");
            System.out.println("5. Sort by price");
            System.out.println("6. quit");
            System.out.println("Option: ");
            opt = sc.nextInt();
            switch (opt){
                case 1:
                    manager.addProduct();
                    break;
                case 2:
                    manager.addElectric();
                    break;
                case 3:
                    manager.displayAllElectric();
                    break;
                case 4:
                    for (Electric e : manager.sortBypower()) {
                        e.output();                       
                    }
                    break;
                case 5:
                    manager.sortByPrice();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }while (opt != 6);
    }
}
