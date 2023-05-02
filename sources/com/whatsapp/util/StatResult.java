package com.whatsapp.util;

public final class StatResult {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final boolean A05;

    public StatResult(int i2, int i3, int i4, int i5, long j2, long j3, boolean z2) {
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i5;
        this.A04 = j2;
        this.A03 = j3;
        this.A05 = z2;
    }

    public static native StatResult lstatOpenFile(String str);

    public static native StatResult statOpenFile(int i2);
}
