package X;

import android.view.animation.Interpolator;
import com.facebook.redex.IDxLAdapterShape0S0111000_I1;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0QX  reason: invalid class name */
public class AnonymousClass0QX {
    public long A00 = -1;
    public Interpolator A01;
    public C13190lc A02;
    public boolean A03;
    public final C07360bC A04 = new IDxLAdapterShape0S0111000_I1(this);
    public final ArrayList A05 = AnonymousClass000.A0u();

    public void A00() {
        if (this.A03) {
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                ((AnonymousClass0SH) it.next()).A01();
            }
            this.A03 = false;
        }
    }

    public void A01() {
        if (!this.A03) {
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                AnonymousClass0SH r5 = (AnonymousClass0SH) it.next();
                long j2 = this.A00;
                if (j2 >= 0) {
                    r5.A08(j2);
                }
                Interpolator interpolator = this.A01;
                if (interpolator != null) {
                    r5.A09(interpolator);
                }
                if (this.A02 != null) {
                    r5.A0A(this.A04);
                }
                r5.A02();
            }
            this.A03 = true;
        }
    }
}
