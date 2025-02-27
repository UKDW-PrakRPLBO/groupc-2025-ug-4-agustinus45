package org.example;

public class HDMI extends Colokan{
    public HDMI(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    @Override
    public double getRealBandwidth() {
        double ratio = (double) harga / 50000;
        return ratio < 1 ? promisedBandwidth * ratio : promisedBandwidth;
    }
}
