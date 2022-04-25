package views;

import model.Product;
import services.ProductService;

import java.util.Scanner;

public class ProductView {
    ProductService productService = new ProductService();
    static Scanner input = new Scanner(System.in);

    public void run() {
        int choice;
        do {
            Menu.showMenu();
            System.out.print("Select: ");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showEditOption();
                    break;
                case 3:
                    sortProduct();
                    break;
                case 4:
                    searchProduct();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public void renderProduct() {
        System.out.printf("%-20s %-20s %-20s %-20s \n", "ID", "Product", "Quantity", "Price");
        System.out.println("------------------------------------------------------------------------------");
        for (Product product : productService.getProducts()) {
            System.out.printf("%-20s %-20s %-20s %-20s \n", product.getId(), product.getName(), product.getQuantity(), product.getPrice() + "đ");
        }
        System.out.println();
    }

    public void showSortOptions() {
        System.out.println("1. Sort by ID (Ascending).");
        System.out.println("2. Sort by ID (Descending)");
        System.out.println("3. Sort by Name (Ascending).");
        System.out.println("4. Sort by Name (Descending)");
        System.out.println("5. Sort by Quantity (Ascending).");
        System.out.println("6. Sort by Quantity (Descending)");
        System.out.println("7. Sort by Price (Ascending).");
        System.out.println("8. Sort by Price (Descending)");
        System.out.println("9. Return.");
    }

    public void sortProduct() {
        int choice;
        do {
            renderProduct();
            showSortOptions();
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    productService.sortByIDASC();
                    break;
                case 2:
                    productService.sortByIDDESC();
                    break;
                case 3:
                    productService.sortByNameASC();
                    break;
                case 4:
                    productService.sortByNameDESC();
                    break;
                case 5:
                    productService.sortByQuantityASC();
                    break;
                case 6:
                    productService.sortByQuantityDESC();
                    break;
                case 7:
                    productService.sortByPriceASC();
                    break;
                case 8:
                    productService.sortByPriceDESC();
                    break;
                case 9:
                    break;
            }
        } while (choice != 9);
    }

    public void showEditOption() {
        int choice;
        do {
            renderProduct();
            System.out.println("1. Edit");
            System.out.println("2. Remove");
            System.out.println("3. Return");
            System.out.print("Select: ");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    editProduct();
                    break;
                case 2:
                    removeProduct();
                case 3:
                    break;
            }
        } while (choice != 3);
    }

    public void editProduct() {
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(input.nextLine());
        if (!productService.existById(id)) {
            System.out.println("Product unavailable.");
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

    public void removeProduct() {
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(input.nextLine());
        if (!productService.existById(id)) {
            System.out.println("Product unavailable.");
            return;
        }

        productService.removeById(id);
        System.out.println("Item removed successfully.");
    }

    public void addProduct() {
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Quantity: ");
        int quantity = Integer.parseInt(input.nextLine());
        System.out.print("Price: ");
        double price = Double.parseDouble(input.nextLine());
        Product newProduct = new Product(name, quantity, price);

        productService.add(newProduct);
        System.out.println("Item added successfully.");
    }

    public void searchProduct() {
        renderProduct();
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(input.nextLine());
        if (!productService.existById(id)) {
            System.out.println("Product unavailable.");
            return;
        }

        Product foundProduct = productService.getById(id);
        System.out.printf("%-20s %-20s %-20s %-20s \n", "ID", "Product", "Quantity", "Price");
        System.out.println("------------------------------------------------------------------------------");
        System.out.printf("%-20s %-20s %-20s %-20s \n", foundProduct.getId(), foundProduct.getName(), foundProduct.getQuantity(), foundProduct.getPrice() + "đ");
        System.out.println();

        System.out.println("1. Return");
        System.out.println("Select: ");
        int choice;
        do {
            choice = Integer.parseInt(input.nextLine());
            if (choice == 1) {
                return;
            }
        } while (true);
    }
}
