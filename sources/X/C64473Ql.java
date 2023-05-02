package X;

import android.content.Context;

/* renamed from: X.3Ql  reason: invalid class name and case insensitive filesystem */
public class C64473Ql extends AnonymousClass0Fo {
    public int A00 = 0;

    public C64473Ql(Context context) {
        super(context);
    }

    public int A05() {
        return this.A00;
    }

    public int A06() {
        return this.A00;
    }

    public int A08(int i2, int i3, int i4, int i5, int i6) {
        return this.A00 == Integer.MIN_VALUE ? (i4 + ((i5 - i4) >> 1)) - (i2 + ((i3 - i2) >> 1)) : super.A08(i2, i3, i4, i5, i6);
    }

    public void A09(String str) {
        int i2 = 0;
        if (str != null) {
            switch (str.hashCode()) {
                case -1364013995:
                    if (str.equals("center")) {
                        i2 = Integer.MIN_VALUE;
                        break;
                    } else {
                        return;
                    }
                case 100571:
                    if (str.equals("end")) {
                        this.A00 = 1;
                        return;
                    }
                    return;
                case 109757538:
                    if (str.equals("start")) {
                        this.A00 = -1;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        this.A00 = i2;
    }
}
