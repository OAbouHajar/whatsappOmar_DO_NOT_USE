package X;

import android.text.Layout;

/* renamed from: X.4SK  reason: invalid class name */
public final class AnonymousClass4SK {
    public float A00;
    public float A01 = Float.MAX_VALUE;
    public int A02;
    public int A03 = -1;
    public int A04;
    public int A05 = -1;
    public int A06 = -1;
    public int A07 = -1;
    public int A08 = -1;
    public int A09 = -1;
    public int A0A = -1;
    public int A0B = -1;
    public Layout.Alignment A0C;
    public C88134a0 A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;

    public void A00(AnonymousClass4SK r4) {
        int i2;
        Layout.Alignment alignment;
        String str;
        if (r4 != null) {
            if (!this.A0H && r4.A0H) {
                this.A04 = r4.A04;
                this.A0H = true;
            }
            if (this.A03 == -1) {
                this.A03 = r4.A03;
            }
            if (this.A06 == -1) {
                this.A06 = r4.A06;
            }
            if (this.A0E == null && (str = r4.A0E) != null) {
                this.A0E = str;
            }
            if (this.A07 == -1) {
                this.A07 = r4.A07;
            }
            if (this.A0B == -1) {
                this.A0B = r4.A0B;
            }
            if (this.A08 == -1) {
                this.A08 = r4.A08;
            }
            if (this.A0C == null && (alignment = r4.A0C) != null) {
                this.A0C = alignment;
            }
            if (this.A0A == -1) {
                this.A0A = r4.A0A;
            }
            if (this.A05 == -1) {
                this.A05 = r4.A05;
                this.A00 = r4.A00;
            }
            if (this.A0D == null) {
                this.A0D = r4.A0D;
            }
            if (this.A01 == Float.MAX_VALUE) {
                this.A01 = r4.A01;
            }
            if (!this.A0G && r4.A0G) {
                this.A02 = r4.A02;
                this.A0G = true;
            }
            if (this.A09 == -1 && (i2 = r4.A09) != -1) {
                this.A09 = i2;
            }
        }
    }
}
