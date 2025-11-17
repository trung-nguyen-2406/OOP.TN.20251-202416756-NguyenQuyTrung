package com.hust.kstn.test;

import com.hust.kstn.models.Track;
import com.hust.kstn.models.CompactDisc;

public class CompactDiscTest {
    public static void main(String[] args) {
        Track track1 = new Track("My Old Man", 210);
        Track track2 = new Track("Carey", 180);
        Track track3 = new Track("Blue", 240);
        Track track4 = new Track("California", 200);
        Track track5 = new Track("A Case of You", 230);
        Track track6 = new Track("River", 190);
        Track track7 = new Track("The Last Time I Saw Richard", 220);
        System.out.println(track1);
        System.out.println(track2);
        System.out.println(track3);
        System.out.println(track4);
        System.out.println(track5);
        System.out.println(track6);
        System.out.println(track7);
        CompactDisc cd = new CompactDisc("Blue", "Folk", 15.99,new String[]{"EMI"}, new String[]{"Joni Mitchell"}, new Track[]{track1, track2});
        cd.addTrack(track3);
        cd.addTrack(track4);
        cd.addTrack(track5);
        cd.addTrack(track6);
        System.out.println(cd);
        cd.removeTrack(track4);
        cd.removeTrack(track7);
        System.out.println("Total length: " + cd.totalLength() + " s");
    }
}
