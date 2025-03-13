
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class ProductManager {
    private ArrayList<Product> list = new ArrayList<>();
    
    public void addProduct() {
        Product a = null;
        a = new Product();
        a.input();
        list.add(a);   
    }
    
    public void addElectric() {
        Product a = new Electric();
        a.input();
        list.add(a);   
    }
   
    public void displayAllElectric() {
//        for (Product product : list) {
//            if (product instanceof Eletric) {
//                Eletric eletric = (Eletric) product;
//                product.output();
//            }
//        }
//cach 2
//        for (Product product : list.stream().filter(a -> a instanceof Eletric).collect(Collectors.toList())) {
//            product.output();
//        }
    //cach 3
        list.stream().filter(a -> a instanceof Electric).forEach(Product :: output);
    }
    
    public ArrayList<Electric> sortBypower() {
       ArrayList<Electric> e = list.stream().filter(p -> p instanceof Electric)
               .map(p -> (Electric) p)
               .collect( Collectors.toCollection(ArrayList :: new));
        Collections.sort(e, new Comparator<Electric>() {
           @Override
           public int compare(Electric o1, Electric o2) {
               if (o1.getPow() > o2.getPow())
                   return 1;
               else if(o1.getPow() < o2.getPow())
                   return -1;
               else
                   return 0;
           }
       });
        return e;
    }
    
    public void sortByPrice() {
        list.sort(Comparator.comparing(Product :: getPrice));
    }
    
}
