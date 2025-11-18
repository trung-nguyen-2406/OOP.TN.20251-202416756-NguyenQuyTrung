package com.hust.kstn.models;

public class CompactDisc extends Disc {
    private String[] artists = new String[10];
    private Track[] tracks = new Track[20]; 
    private int trackCount = 0;

    public CompactDisc(String title, String category, double cost, String[] directors, String[] artists, Track[] tracks) {
        super(title, category, cost, directors);
        this.artists = artists;
        if (tracks.length <= 20) {
            for (int i = 0; i < tracks.length; i++) {
                this.tracks[i] = tracks[i];
            }
            trackCount = tracks.length;
        } else {
            System.out.println("The number of tracks exceeds the limit of 20");
        }
    }

    public CompactDisc(String title, String category, double cost, String directors, String[] artists, Track[] tracks) {
        super(title, category, cost, new String[] {directors});
        this.artists = artists;
        if (tracks.length <= 20) {
            for (int i = 0; i < tracks.length; i++) {
                this.tracks[i] = tracks[i];
            }
            trackCount = tracks.length;
        } else {
            System.out.println("The number of tracks exceeds the limit of 20");
        }
    }

    public int totalLength() {
        int total = 0;
        if (tracks == null) {
            System.out.println("This CD has no tracks");
            return total;
        }
        for (int i = 0; i < trackCount; i++) {
            total += tracks[i].getLength();
        }
        return total;
    }
    public boolean addTrack(Track track) {
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] == null) {
                tracks[i] = track;
                System.out.println("Track added");
                trackCount++;
                return true;
            }
        }
        System.out.println("The track list is full");
        return false;
    }
    public boolean removeTrack(Track track) {
        if (tracks == null) {
            System.out.println("This CD has no tracks");
            return false;
        }
        for (int i = 0; i < trackCount; i++) {
            if (tracks[i] == track) {
                for (int j = i; j < trackCount - 1; j++) {
                    tracks[j] = tracks[j + 1];
                }                
                tracks[trackCount - 1] = null;
                trackCount--;
                System.out.println("Track removed");
                return true;
            }
        }
        System.out.println("Track not found");
        return false;
    }

    public String[] getArtists() {
        return artists;
    }
    public Track[] getTracks() {
        return tracks;
    }

    @Override
    public String toString() {
        return super.toString()
            + "\nArtists: " + java.util.Arrays.toString(this.artists)
            + "\nTracks: " + java.util.Arrays.toString(java.util.Arrays.copyOf(this.tracks, trackCount));
    }
}
