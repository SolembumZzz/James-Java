package views;

import model.Product;
import model.ProductManager;
import services.IProductService;
import services.ProductService;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    static IProductService productService = new ProductService();
    static Scanner input = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("------------Product-Manager------------");
        System.out.println("          1. Add product.              ");
        System.out.println("          2. Edit product.             ");
        System.out.println("          3. Remove product.           ");
        System.out.println("          4. Display products.         ");
        System.out.println("          5. Search products.          ");
        System.out.println("          6. Quit.                     ");
        System.out.println("---------------------------------------");
    }

    public static void renderProduct() {
        System.out.printf("%-20s %-20s %-20s %-20s \n", "ID", "Product", "Quantity", "Price");
        System.out.println("------------------------------------------------------------------------------");
        for (Product product : productService.getProducts()) {
            System.out.printf("%-20s %-20s %-20s %-20s \n", product.getId(), product.getName(), product.getQuantity(), product.getPrice() + "đ");
        }
        System.out.println();
    }

    public static void searchProduct() {
        renderProduct();
        System.out.println("Search by name: ");
        String name = input.nextLine();
    }

    public static void displayProduct() {
        int choice;
        do {
            renderProduct();
            System.out.println("1. Sort by ID (Ascending).");
            System.out.println("2. Sort by ID (Descending)");
            System.out.println("3. Sort by Name (Ascending).");
            System.out.println("4. Sort by Name (Descending)");
            System.out.println("5. Sort by Quantity (Ascending).");
            System.out.println("6. Sort by Quantity (Descending)");
            System.out.println("7. Sort by Price (Ascending).");
            System.out.println("8. Sort by Price (Descending)");
            System.out.println("9. Return.");
            choice = Integer.parseInt(input.nextLine());
        } while (choice != 9);
    }

    public void editProduct() {
        renderProduct();
        System.out.println("Search by ID: ");
        int id = Integer.parseInt(input.nextLine());
        if (!productService.existById(id)) {
            System.out.println("San pham ko ton tai");
            return;
        }

        System.out.print("New name: ");
        String newName = input.nextLine();
        System.out.print("New quantity: ");
        int newQuantity = Integer.parseInt(input.nextLine());
        System.out.print("New price: ");
        double newPrice = Double.parseDouble(input.nextLine());

        Product newProduct = new Product(id, newName, newQuantity, newPrice);
        productService.update(newProduct);
        System.out.println("Item edited successfully");
    }

    public static void addProduct() {
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Quantity: ");
        int quantity = Integer.parseInt(input.nextLine());
        System.out.print("Price: ");
        double price = Double.parseDouble(input.nextLine());

        productService.add(new Product(name, quantity, price));
        System.out.println("Item added successfully.");
    }

    public static void removeProduct() {
        renderProduct();
        System.out.print("Delete by ID: ");
        int id = Integer.parseInt(input.nextLine());
        List<Product> productList = productService.getProducts();
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.remove(i);
                break;
            }
        }
        System.out.println("Item removed successfully.");
    }


    public static void run() {
        int choice;
        do {
            showMenu();
            System.out.println("Select: ");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 4:
                    renderProduct();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (choice != 0);
    }

}
