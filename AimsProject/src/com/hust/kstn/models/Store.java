package com.hust.kstn.models;

public class Store {
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[100];
    private final int MAX_NUMBER_ITEMS = 100;
    public boolean addDVD(DigitalVideoDisc disc) {
        for (int i = 0; i < MAX_NUMBER_ITEMS; i++) {
            if (itemsInStore[i] == null) {
                itemsInStore[i] = disc;
                System.out.println("The disc has been added successfully");
                return true;
            }
        }
        System.out.println("The store is full");
        return false;
    }

    public boolean removeDVD(DigitalVideoDisc disc) {
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] == disc) {
                itemsInStore[i] = null;
                System.out.println("The disc has been removed successfully");
                return true;
            }
        }
        System.out.println("The disc is not found");
        return false;
    }
}
