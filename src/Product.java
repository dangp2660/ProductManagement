
import java.util.Scanner;


public class Product {
    private String name;
    private String code;
    private int price;

    public Product() {
    }

    public Product(String name, String code, int price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public  void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter code:");
        this.code = sc.nextLine();
        System.out.println("Enter name:");
        this.name = sc.nextLine();
        System.out.println("Enter price:");
        this.price = sc.nextInt();
        sc.nextLine();
    }
    
    public void output() {
        System.out.format("%5s|%10s|%10d|\n",this.code, this.name, this.price);
    }
}
