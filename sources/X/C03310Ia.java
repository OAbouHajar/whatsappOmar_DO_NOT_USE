package X;

import android.content.Context;

/* renamed from: X.0Ia  reason: invalid class name and case insensitive filesystem */
public class C03310Ia extends C03440In {
    public String A00 = "";
    public String A01;
    public final int A02;
    public final AnonymousClass0P5 A03;
    public final boolean A04;

    public C03310Ia(Context context, AnonymousClass0P5 r4, int i2) {
        super(context, i2);
        this.A04 = r4.A04;
        int i3 = AnonymousClass000.A0M(context).densityDpi;
        int i4 = 320;
        if (i3 <= 320) {
            i4 = 250;
            if (i3 <= 250) {
                i4 = 72;
            }
        }
        this.A02 = i4;
        this.A03 = r4;
    }
}
