package model;

import Comparator.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {

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

    private final ArrayList<Product> productList = new ArrayList<>();

    public ProductManager() {
        productList.add(new Product(11111,"Omo", 50, 1000));
        productList.add(new Product(11112,"H&S", 22, 323200));
        productList.add(new Product(22223,"M&M", 10, 2320));
        productList.add(new Product(33332,"Wew", 3, 450000));
        productList.add(new Product(15000,"Tesla", 88, 9500000));
    }

    public void renderProduct() {
        System.out.printf("%-20s %-20s %-20s %-20s \n", "ID", "Product", "Quantity", "Price");
        System.out.println("------------------------------------------------------------------------------");
        for (Product product : productList) {
            System.out.printf("%-20s %-20s %-20s %-20s \n", product.getId(), product.getName(), product.getQuantity(), product.getPrice() + "đ");
        }
        System.out.println();
    }

    public void displayProduct() {
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
            switch (choice) {
                case 1:
                    productList.sort(Comparator.comparing(Product::getId));
                    break;
                case 2:
                    productList.sort(Comparator.comparing(Product::getId).reversed());
                    break;
                case 3:
                    productList.sort(new ComparatorNameASC());
                    break;
                case 4:
                    productList.sort(new ComparatorNameDSC());
                    break;
                case 5:
                    productList.sort(new ComparatorQuantityASC());
                    break;
                case 6:
                    productList.sort(new ComparatorQuantityDSC());
                    break;
                case 7:
                    productList.sort(new ComparatorPriceASC());
                    break;
                case 8:
                    productList.sort(new ComparatorPriceDSC());
                    break;
                case 9:
                    break;
            }
        } while (choice != 9);
    }

    public void addProduct() {
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Quantity: ");
        int quantity = Integer.parseInt(input.nextLine());
        System.out.print("Price: ");
        double price = Double.parseDouble(input.nextLine());

        productList.add(0, new Product(name, quantity, price));
        System.out.println("Item added successfully.");
    }

    public void removeProduct() {
        renderProduct();
        System.out.print("Delete by ID: ");
        int id = Integer.parseInt(input.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.remove(i);
                break;
            }
        }
        System.out.println("Item removed successfully.");
    }

    public void editProduct() {
        renderProduct();
        System.out.println("Search by ID: ");
        int id = Integer.parseInt(input.nextLine());

        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                System.out.print("New name: ");
                String newName = input.nextLine();
                System.out.print("New quantity: ");
                int newQuantity = Integer.parseInt(input.nextLine());
                System.out.print("New price: ");
                double newPrice = Double.parseDouble(input.nextLine());

                productList.set(i, new Product(productList.get(i).getId(), newName, newQuantity, newPrice));
                break;
            }
        }
        System.out.println("Item edited successfully");
    }

    public void searchProduct() {
        renderProduct();
        System.out.println("Search by name: ");
        String name = input.nextLine();
    }
}
