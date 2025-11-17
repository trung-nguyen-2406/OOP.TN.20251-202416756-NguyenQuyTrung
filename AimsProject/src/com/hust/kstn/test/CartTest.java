package com.hust.kstn.test;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvdList[] = new DigitalVideoDisc[21];
        for (int i = 0; i < 21; i++) {
            dvdList[i] = new DigitalVideoDisc("Title " + (i + 1), "Category", "Director", 1, 19.5, 1.5);
            cart.addDVD(dvdList[i]);
        }
        cart.print();
        cart.addDVD(new DigitalVideoDisc("extra", "Category", "Director", 1, 19.5, 1.5), new DigitalVideoDisc("extra2", "Category", "Director", 1, 19.5, 1.5));
        cart.print();
        cart.removeDVD(new DigitalVideoDisc("none existence", "Category", "Director", 1, 19.5, 1.5));
        cart.print();
        for (DigitalVideoDisc dvd : dvdList) {
            cart.removeDVD(dvd);
        }
        cart.print();
    }
}
