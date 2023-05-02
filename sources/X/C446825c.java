package X;

import android.graphics.BitmapFactory;

/* renamed from: X.25c  reason: invalid class name and case insensitive filesystem */
public class C446825c {
    public final int A00;
    public final int A01;
    public final BitmapFactory.Options A02;
    public final Long A03;
    public final boolean A04;

    public C446825c(int i2, int i3) {
        this((BitmapFactory.Options) null, (Long) null, i2, i3, false);
    }

    public C446825c(BitmapFactory.Options options, Long l2, int i2, int i3, boolean z2) {
        boolean z3 = i2 >= 2 && i3 >= 2 && (l2 == null || l2.longValue() > 0) && (!z2 || i2 == i3);
        StringBuilder sb = new StringBuilder("bitmaputils/bitmapspec/wrong/ ");
        sb.append(i2);
        sb.append(",");
        sb.append(i3);
        sb.append(",");
        sb.append(l2);
        sb.append(",");
        sb.append(z2);
        AnonymousClass00B.A0B(sb.toString(), z3);
        if (!z3) {
            this.A01 = Integer.MAX_VALUE;
            this.A00 = Integer.MAX_VALUE;
            this.A03 = null;
            this.A04 = false;
        } else {
            this.A01 = i2;
            this.A00 = i3;
            this.A03 = l2;
            this.A04 = z2;
        }
        this.A02 = options == null ? new BitmapFactory.Options() : options;
    }
}
