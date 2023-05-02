package X;

import java.util.List;

/* renamed from: X.0eb  reason: invalid class name and case insensitive filesystem */
public class C08910eb implements AnonymousClass5TP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass3BJ A04;
    public final List A05;

    public C08910eb(AnonymousClass3BJ r1, List list, int i2, int i3, int i4, int i5) {
        this.A05 = list;
        this.A04 = r1;
        this.A02 = i2;
        this.A00 = i3;
        this.A03 = i4;
        this.A01 = i5;
    }

    public AnonymousClass5TP AAY(int i2) {
        return (AnonymousClass5TP) this.A05.get(i2);
    }

    public int AAd() {
        return this.A05.size();
    }

    public int ACb() {
        return this.A01;
    }

    public Object AD4() {
        return null;
    }

    public int AEB() {
        return 0;
    }

    public int AEC() {
        return 0;
    }

    public int AED() {
        return 0;
    }

    public int AEE() {
        return 0;
    }

    public AnonymousClass3BJ AFR() {
        return this.A04;
    }

    public int AH7() {
        return this.A03;
    }

    public int AHD(int i2) {
        return 0;
    }

    public int AHE(int i2) {
        return 0;
    }

    public int getHeight() {
        return this.A00;
    }

    public int getWidth() {
        return this.A02;
    }
}
