package com.hust.kstn.test;

import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvdList[] = new DigitalVideoDisc[101];
        for (int i = 0; i < 101; i++) {
            dvdList[i] = new DigitalVideoDisc("Title " + i, "Category", "Director", 1, 19.5, 1.5);
            store.addDVD(dvdList[i]);
        }
        store.removeDVD(new DigitalVideoDisc("non existence", "Category", "Director", 1, 19.5, 1.5));
        for (DigitalVideoDisc dvd : dvdList) {
            store.removeDVD(dvd);
        }
    }
}
