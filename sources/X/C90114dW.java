package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.List;

/* renamed from: X.4dW  reason: invalid class name and case insensitive filesystem */
public final class C90114dW {
    public static final int A0M;
    public static final int A0N = A00(2, 2, 2, 0);
    public static final int[] A0O;
    public static final int[] A0P;
    public static final int[] A0Q = {0, 0, 0, 0, 0, 2, 0};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final SpannableStringBuilder A0K = new SpannableStringBuilder();
    public final List A0L = AnonymousClass000.A0u();

    static {
        int A002 = A00(0, 0, 0, 0);
        A0M = A002;
        int A003 = A00(0, 0, 0, 3);
        A0P = new int[]{A002, A003, A002, A002, A003, A002, A002};
        A0O = new int[]{A002, A002, A002, A002, A002, A003, A003};
    }

    public C90114dW() {
        A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r8 != 3) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(int r5, int r6, int r7, int r8) {
        /*
            r4 = 0
            r0 = 4
            X.C90524eJ.A00(r5, r0)
            X.C90524eJ.A00(r6, r0)
            X.C90524eJ.A00(r7, r0)
            X.C90524eJ.A00(r8, r0)
            r3 = 1
            if (r8 == 0) goto L_0x001a
            if (r8 == r3) goto L_0x001a
            r0 = 2
            if (r8 == r0) goto L_0x002f
            r0 = 3
            r2 = 0
            if (r8 == r0) goto L_0x001c
        L_0x001a:
            r2 = 255(0xff, float:3.57E-43)
        L_0x001c:
            r1 = 0
            if (r5 <= r3) goto L_0x0021
            r1 = 255(0xff, float:3.57E-43)
        L_0x0021:
            r0 = 0
            if (r6 <= r3) goto L_0x0026
            r0 = 255(0xff, float:3.57E-43)
        L_0x0026:
            if (r7 <= r3) goto L_0x002a
            r4 = 255(0xff, float:3.57E-43)
        L_0x002a:
            int r0 = android.graphics.Color.argb(r2, r1, r0, r4)
            return r0
        L_0x002f:
            r2 = 127(0x7f, float:1.78E-43)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90114dW.A00(int, int, int, int):int");
    }

    public SpannableString A01() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0K);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.A06 != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.A06, length, 33);
            }
            if (this.A0C != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.A0C, length, 33);
            }
            if (this.A04 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.A03), this.A04, length, 33);
            }
            if (this.A02 != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.A01), this.A02, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public void A02() {
        this.A0L.clear();
        this.A0K.clear();
        this.A06 = -1;
        this.A0C = -1;
        this.A04 = -1;
        this.A02 = -1;
        this.A0A = 0;
        this.A0G = false;
        this.A0J = false;
        this.A09 = 4;
        this.A0H = false;
        this.A0D = 0;
        this.A05 = 0;
        this.A00 = 0;
        this.A0B = 15;
        this.A0I = true;
        this.A07 = 0;
        this.A0F = 0;
        this.A08 = 0;
        int i2 = A0M;
        this.A0E = i2;
        this.A03 = A0N;
        this.A01 = i2;
    }

    public void A03(char c2) {
        if (c2 == 10) {
            List list = this.A0L;
            list.add(A01());
            this.A0K.clear();
            if (this.A06 != -1) {
                this.A06 = 0;
            }
            if (this.A0C != -1) {
                this.A0C = 0;
            }
            if (this.A04 != -1) {
                this.A04 = 0;
            }
            if (this.A02 != -1) {
                this.A02 = 0;
            }
            while (true) {
                if ((this.A0I && list.size() >= this.A0B) || list.size() >= 15) {
                    list.remove(0);
                } else {
                    return;
                }
            }
        } else {
            this.A0K.append(c2);
        }
    }

    public void A04(int i2, int i3) {
        int i4;
        int i5;
        if (!(this.A04 == -1 || (i5 = this.A03) == i2)) {
            SpannableStringBuilder spannableStringBuilder = this.A0K;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), this.A04, spannableStringBuilder.length(), 33);
        }
        if (i2 != A0N) {
            this.A04 = this.A0K.length();
            this.A03 = i2;
        }
        if (!(this.A02 == -1 || (i4 = this.A01) == i3)) {
            SpannableStringBuilder spannableStringBuilder2 = this.A0K;
            spannableStringBuilder2.setSpan(new BackgroundColorSpan(i4), this.A02, spannableStringBuilder2.length(), 33);
        }
        if (i3 != A0M) {
            this.A02 = this.A0K.length();
            this.A01 = i3;
        }
    }
}
