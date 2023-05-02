package X;

import com.facebook.flexlayout.layoutoutput.LayoutOutput;

/* renamed from: X.4nK  reason: invalid class name and case insensitive filesystem */
public class C95814nK implements AnonymousClass5TP {
    public final int A00;
    public final int A01;
    public final LayoutOutput A02;
    public final AnonymousClass3BJ A03;

    public C95814nK(LayoutOutput layoutOutput, AnonymousClass3BJ r2, int i2, int i3) {
        this.A02 = layoutOutput;
        this.A03 = r2;
        this.A01 = i2;
        this.A00 = i3;
    }

    public AnonymousClass5TP AAY(int i2) {
        return (AnonymousClass5TP) this.A02.measureResults[i2];
    }

    public int AAd() {
        return this.A02.measureResults.length;
    }

    public int ACb() {
        return this.A00;
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
        return this.A03;
    }

    public int AH7() {
        return this.A01;
    }

    public int AHD(int i2) {
        return (int) this.A02.arr[AnonymousClass0JH.values().length + (i2 * AnonymousClass0JG.values().length)];
    }

    public int AHE(int i2) {
        return (int) this.A02.arr[AnonymousClass0JH.values().length + (i2 * AnonymousClass0JG.values().length) + 1];
    }

    public int getHeight() {
        return (int) this.A02.arr[1];
    }

    public int getWidth() {
        return (int) this.A02.arr[0];
    }
}
