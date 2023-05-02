package com.whatsapp.voipcalling;

public class H26xSupportResult {
    public final boolean isH264HwSupported;
    public final boolean isH264SwSupported;
    public final boolean isH265HwSupported;
    public final boolean isH265SwSupported;

    public H26xSupportResult(boolean z2, boolean z3, boolean z4, boolean z5) {
        this.isH264HwSupported = z2;
        this.isH264SwSupported = z3;
        this.isH265HwSupported = z4;
        this.isH265SwSupported = z5;
    }
}
