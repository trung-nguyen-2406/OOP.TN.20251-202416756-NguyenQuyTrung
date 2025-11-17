package com.hust.kstn.test;

import com.hust.kstn.models.Track;
import com.hust.kstn.models.CompactDisc;

public class CompactDiscTest {
    public static void main(String[] args) {
        Track track1 = new Track("My Old Man", 210);
        Track track2 = new Track("Carey", 180);
        System.out.println(track1);
        CompactDisc cd = new CompactDisc("Blue", "Folk", 15.99,new String[]{"EMI"}, new String[]{"Joni Mitchell"}, new Track[]{track1, track2});
        System.out.println(cd);
    }
}
