package me.relex.widget.waveform;

import java.util.List;

public class WaveFormInfo {

    private int sample_rate;

    private int samples_per_pixel;
    private int bits;

    private int length;

    private List<Integer> data;

    public int getSample_rate() {
        return sample_rate;
    }

    public void setSample_rate(int sample_rate) {
        this.sample_rate = sample_rate;
    }

    public int getSamples_per_pixel() {
        return samples_per_pixel;
    }

    public void setSamples_per_pixel(int samples_per_pixel) {
        this.samples_per_pixel = samples_per_pixel;
    }

    public int getBits() {
        return bits;
    }

    public void setBits(int bits) {
        this.bits = bits;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }
}
