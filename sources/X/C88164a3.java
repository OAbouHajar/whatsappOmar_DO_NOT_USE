package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: X.4a3  reason: invalid class name and case insensitive filesystem */
public class C88164a3 {
    public int A00;
    public int A01;
    public Canvas A02;
    public final /* synthetic */ C49832Wc A03;

    public C88164a3(C49832Wc r1) {
        this.A03 = r1;
    }

    public static /* synthetic */ void A00(C88164a3 r6) {
        int i2;
        if (r6.A02 != null) {
            int i3 = r6.A00;
            C49832Wc r4 = r6.A03;
            AnonymousClass4LN[] r0 = r4.A07;
            int length = r0 == null ? 0 : r0.length;
            while (true) {
                if (i3 >= length) {
                    i2 = r6.A01;
                    break;
                }
                AnonymousClass4LN r2 = r4.A07[i3];
                if (r2 != null) {
                    if (r2.A01.A07.A04 == AnonymousClass416.VIEW) {
                        i2 = i3 + 1;
                        break;
                    } else if (r2.A03) {
                        ((Drawable) r2.A02).draw(r6.A02);
                    }
                }
                i3++;
            }
            r6.A00 = i2;
        }
    }
}
