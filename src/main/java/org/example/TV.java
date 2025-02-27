package org.example;

public class TV {
    private int maxResolusi;
    private Colokan colokan;

    public TV(int maxResolusi) {
        this.maxResolusi = maxResolusi;
    }
    public int getResolution() {
        return maxResolusi;
    }

    public void connect(Colokan colokan) {
        this.colokan = colokan;
        System.out.println("Berhasil Connect ke - " + colokan.getMerk());
    }
}
