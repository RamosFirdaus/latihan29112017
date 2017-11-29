/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.model;

/**
 *
 * @author user
 */
public class TestOrder {
    Product iceCream = new Product("magnum", 8000.0);
        Product indomie = new Product("indomie goreng", 2500.0);
        Product cocaCola = new Product("coca cola", 4500.0);

        OrderItem icItem = new OrderItem(iceCream, 5);
        OrderItem indomieItem = new OrderItem(indomie, 20);
        OrderItem ccItem = new OrderItem(cocaCola, 4);
        //kasir menghitung dan menginput barang yang dibeli
        // disimpan dalam order

        OrderItem[] items = {icItem, indomieItem, ccItem};
        //seluruh item di proses dalam mesin kasir
        Order order = new Order();
        order.setOrderItems(items);

        double totalBelanja = order.calculateTotalOrder();
        System.out.println("total belanja : %,.2f \n", totalBelanja);
        double
    
}
