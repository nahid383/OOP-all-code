
import java.util.Scanner;
class productFilter{
    void filterProducts(String Category){
        System.out.println("Searching Products in Category  " + Category);
    }
    void filterProducts(double minPrice, double maxPrice){
        System.out.println("Searching Products with Price between $ " + minPrice + " and $" + maxPrice);
    }
    void filterProductsbyBrand(String brand){
        System.out.println("Searching Products by Brand "+ brand);
    }
    void filterProducts(String Category, double minPrice, double maxPrice){
        System.out.print("Searching Products in category " + Category);
        System.out.println(" with Price between $ " + minPrice + " and $" +  maxPrice);
    }
    void filterProducts(String Category, double minPrice, double maxPrice, String brand){
        System.out.print("Searching Products in category " + Category);
        System.out.print(" with Price between $ " + minPrice + " and $" + maxPrice);
        System.out.println(" of brand "+ brand);
    }

}

public class ProductFiltering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        productFilter pf = new productFilter();
        pf.filterProducts("Electronics");
        pf.filterProducts(100, 500);
        pf.filterProductsbyBrand("Apple");
        pf.filterProducts("Fashion", 100, 300);
        pf.filterProducts("Fashion", 400, 900, "bazeline");


    }

}
