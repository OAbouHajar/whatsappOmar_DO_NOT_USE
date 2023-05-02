package com.whatsapp.stickers;

public class WebpInfo {
    public final int height;
    public final int minFrameDurationMS;
    public final int numFrames;
    public final long totalAnimationDurationMS;
    public final int width;

    public WebpInfo(int i2, int i3, int i4, int i5, long j2) {
        this.numFrames = i2;
        this.width = i3;
        this.height = i4;
        this.minFrameDurationMS = i5;
        this.totalAnimationDurationMS = j2;
    }
}
