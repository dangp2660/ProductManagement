
import java.util.Scanner;

public class Electric extends Product{
    private int warranty;
    private int voltage;
    private double pow;

    public Electric() {
    }

    public Electric(int warranty, int voltage, double pow) {
        this.warranty = warranty;
        this.voltage = voltage;
        this.pow = pow;
    }

    public Electric(int warranty, int voltage, double pow, String name, String code, int price) {
        super(name, code, price);
        this.warranty = warranty;
        this.voltage = voltage;
        this.pow = pow;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public double getPow() {
        return pow;
    }

    public void setPow(double pow) {
        this.pow = pow;
    }

    @Override
    public void output() {
        System.out.format("%5s|%10s|%10d|%10d|%10d|%10.2f\n",this.getCode(), this.getName(), this.getPrice(), 
                this.warranty, this.voltage, this.pow);   
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter warranty:");
        this.warranty = sc.nextInt();
        System.out.println("Enter voltage:");
        this.voltage = sc.nextInt();
        System.out.println("Enter pow:");
        this.pow = sc.nextDouble();
    }
    
    
}
