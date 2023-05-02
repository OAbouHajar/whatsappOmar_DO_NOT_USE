package X;

import com.obwhatsapp.mediaview.MediaViewFragment;
import com.whatsapp.util.Log;

/* renamed from: X.36Y  reason: invalid class name */
public class AnonymousClass36Y extends C16690tT {
    public final int A00;
    public final long A01;
    public final C16460t6 A02;
    public final C16480t8 A03;
    public final C14710pd A04;
    public final C15830rv A05;
    public final C49122Rd A06;
    public final boolean A07;

    public AnonymousClass36Y(C16460t6 r1, C16480t8 r2, C14710pd r3, C15830rv r4, C49122Rd r5, int i2, long j2, boolean z2) {
        this.A04 = r3;
        this.A06 = r5;
        this.A02 = r1;
        this.A03 = r2;
        this.A05 = r4;
        this.A01 = j2;
        this.A07 = z2;
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C16460t6 r6 = this.A02;
        C15830rv r5 = this.A05;
        boolean z2 = this.A07;
        C16480t8 r2 = this.A03;
        long j2 = this.A01;
        C16930tt r1 = new C16930tt(z2 ? r2.A03(r5, 0, j2) : r2.A04(r5, 0, j2), r6, this.A04, r5);
        if (C16690tT.A02(this)) {
            r1.close();
            return null;
        }
        r1.getCount();
        r1.moveToPosition(this.A00);
        return r1;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C16930tt r2;
        C16930tt r1;
        C16930tt r5 = (C16930tt) obj;
        if (r5 != null) {
            boolean z2 = this.A07;
            r5.getCount();
            r5.getPosition();
            C49122Rd r3 = this.A06;
            MediaViewFragment mediaViewFragment = r3.A0G;
            if (mediaViewFragment.A0C() != null && !((C14550pN) mediaViewFragment.A0D()).AIm()) {
                if (z2) {
                    r2 = r3.A02;
                    r3.A08 = true;
                    r3.A02 = r5;
                    int count = r5.getCount();
                    r3.A00 = count;
                    Log.i(C13680ns.A0c(count, "MediaMessagesNavigator/navigator/upgrade-head-cursor/ count:"));
                    r1 = r3.A02;
                } else {
                    r2 = r3.A03;
                    r3.A09 = true;
                    r3.A03 = r5;
                    int count2 = r5.getCount();
                    r3.A01 = count2;
                    Log.i(C13680ns.A0c(count2, "MediaMessagesNavigator/navigator/upgrade-tail-cursor/ count:"));
                    r1 = r3.A03;
                }
                r1.registerContentObserver(r3.A0A);
                Runnable runnable = r3.A07;
                if (runnable != null) {
                    runnable.run();
                }
                if (r2 != null) {
                    r2.close();
                }
            }
        }
    }
}
