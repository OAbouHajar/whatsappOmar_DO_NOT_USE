package X;

import android.util.Pair;

/* renamed from: X.5wd  reason: invalid class name and case insensitive filesystem */
public class C119155wd {
    public static final C115855qQ A0F = new C115855qQ(7);
    public static final C115855qQ A0G = new C115855qQ(8);
    public static final C115855qQ A0H = new C115855qQ(10);
    public static final C115855qQ A0I = new C115855qQ(11);
    public static final C115855qQ A0J = new C115855qQ(13);
    public static final C115855qQ A0K = new C115855qQ(4);
    public static final C115855qQ A0L = new C115855qQ(14);
    public static final C115855qQ A0M = new C115855qQ(3);
    public static final C115855qQ A0N = new C115855qQ(1);
    public static final C115855qQ A0O = new C115855qQ(2);
    public static final C115855qQ A0P = new C115855qQ(5);
    public static final C115855qQ A0Q = new C115855qQ(0);
    public static final C115855qQ A0R = new C115855qQ(6);
    public static final C115855qQ A0S = new C115855qQ(12);
    public static final C115855qQ A0T = new C115855qQ(9);
    public Pair A00;
    public Boolean A01;
    public Float A02;
    public Float A03;
    public Float A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public float[] A0C;
    public float[] A0D;
    public int[] A0E;

    public Object A00(C115855qQ r2) {
        switch (r2.A00) {
            case 0:
                return this.A0D;
            case 1:
                return this.A00;
            case 2:
                return this.A0A;
            case 3:
                return this.A03;
            case 4:
                return this.A09;
            case 5:
                return this.A0B;
            case 6:
                return this.A07;
            case 7:
                return this.A02;
            case 8:
                return this.A05;
            case 9:
                return this.A08;
            case 10:
                return this.A0C;
            case 11:
                return this.A0E;
            case 12:
                return this.A04;
            case 13:
                return this.A01;
            default:
                return this.A06;
        }
    }

    public void A01(C115855qQ r4, Object obj) {
        String str;
        switch (r4.A00) {
            case 0:
                this.A0D = (float[]) obj;
                return;
            case 1:
                this.A00 = (Pair) obj;
                return;
            case 2:
                this.A0A = (Long) obj;
                return;
            case 3:
                this.A03 = (Float) obj;
                return;
            case 4:
                this.A09 = (Long) obj;
                return;
            case 5:
                this.A0B = (Long) obj;
                return;
            case 6:
                this.A07 = (Integer) obj;
                return;
            case 7:
                this.A02 = (Float) obj;
                return;
            case 8:
                this.A05 = (Integer) obj;
                return;
            case 9:
                this.A08 = (Integer) obj;
                return;
            case 10:
                if (obj != null) {
                    float[] fArr = (float[]) obj;
                    if (fArr.length != 4) {
                        str = "Colour correction gain must be represented in a float array of length 4";
                        break;
                    } else {
                        float[] fArr2 = this.A0C;
                        if (fArr2 == null) {
                            fArr2 = new float[4];
                            this.A0C = fArr2;
                        }
                        System.arraycopy(fArr, 0, fArr2, 0, 4);
                        return;
                    }
                } else {
                    this.A0C = null;
                    return;
                }
            case 11:
                if (obj != null) {
                    int[] iArr = (int[]) obj;
                    if (iArr.length != 18) {
                        str = "Colour correction transform must be represented in a int array of length 18";
                        break;
                    } else {
                        int[] iArr2 = this.A0E;
                        if (iArr2 == null) {
                            iArr2 = new int[18];
                            this.A0E = iArr2;
                        }
                        System.arraycopy(iArr, 0, iArr2, 0, 18);
                        return;
                    }
                } else {
                    this.A0E = null;
                    return;
                }
            case 12:
                this.A04 = (Float) obj;
                return;
            case 13:
                this.A01 = (Boolean) obj;
                return;
            default:
                this.A06 = (Integer) obj;
                return;
        }
        throw AnonymousClass000.A0T(str);
    }
}
