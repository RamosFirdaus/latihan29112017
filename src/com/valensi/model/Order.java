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
public class Order {

    private OrderItem[] orderItem;
    private double PPN = 0.1;

    public double calculateTotalOrder() {
        double totalOrder = 0.0;
        for (OrderItem orderitem : orderItems) {
            totalOrder += orderitem.calculateItemTotalPrice();
        }
        return totalOrder;
    }

    public double calculateTotalOrderWithDiscount() {
        double totalOrder = 0.0;
        for (OrderItem orderitem : orderItems) {
            totalOrder += orderItem.calculateTotalPriceAfterDiscount();

        }
        return totalOrder;
    }

    public double calculatePPN() {
        double totalPPN = calculateTotalOrderWithDiscount() * this.PPN;
        return total PPN;
    }


    public OrderItem[] getOrderItem() {
        return orderItem;
    }

    /**
     * @param orderItem the orderItem to set
     */
    public void setOrderItem(OrderItem[] orderItem) {
        this.orderItem = orderItem;
    }
    void setOrderItems(ArrayList<OrderItem>items){
        throw new UnsupportedOperationExeption("Not supported yet");
    }

}
