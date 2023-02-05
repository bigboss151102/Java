package dev.lpa;

import java.util.ArrayList;

record orderItem(int qty, ProductForSale product){}

public class Store {
    private static ArrayList<ProductForSale> storeProduct = new ArrayList<>();
    public static void main(String[] args) {
        storeProduct.add(new ArtObject("Oil Painting", 1350,
                "Impressionistic work by ABF painted in 2010"));
        storeProduct.add(new ArtObject("Sculpture", 2000,
                "Bronze work by JKF, produced in 1950"));

        storeProduct.add(new Furniture("Desk", 200,
                "Mahogany"));
        storeProduct.add(new Furniture("Lamp",200,
                "Tiffany Lamp with Hummingbirds"));
        listProduct();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<orderItem>();
        addItemToOrder(order1, 0, 2);
        addItemToOrder(order1, 1, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<orderItem>();
        addItemToOrder(order2, 2, 5);
        addItemToOrder(order2, 3, 1);
        printOrder(order2);

    }
    public static void listProduct()
    {
        for (var item : storeProduct)
        {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
    public static void addItemToOrder(ArrayList<orderItem> order, int orderIndex, int qty)
    {
        order.add(new orderItem(qty, storeProduct.get(orderIndex)));
    }

    public static void printOrder(ArrayList<orderItem> order)
    {
        double salesTotal = 0;
        for (var item : order)
        {
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $ %6.2f %n", salesTotal);
    }
}
