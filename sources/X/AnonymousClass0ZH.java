package X;

import android.view.Menu;
import android.view.MenuItem;
import com.facebook.redex.IDxLAdapterShape24S0100000_I1;

/* renamed from: X.0ZH  reason: invalid class name */
public class AnonymousClass0ZH implements C009804r {
    public C009804r A00;
    public final /* synthetic */ AnonymousClass06G A01;

    public AnonymousClass0ZH(AnonymousClass06G r1, C009804r r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public boolean AM1(MenuItem menuItem, AnonymousClass05J r3) {
        return this.A00.AM1(menuItem, r3);
    }

    public boolean APA(Menu menu, AnonymousClass05J r3) {
        return this.A00.APA(menu, r3);
    }

    public void APd(AnonymousClass05J r5) {
        this.A00.APd(r5);
        AnonymousClass06G r3 = this.A01;
        if (r3.A09 != null) {
            r3.A08.getDecorView().removeCallbacks(r3.A0P);
        }
        if (r3.A0L != null) {
            AnonymousClass0SH r0 = r3.A0N;
            if (r0 != null) {
                r0.A01();
            }
            AnonymousClass0SH A0H = C004601z.A0H(r3.A0L);
            A0H.A03(0.0f);
            r3.A0N = A0H;
            A0H.A0A(new IDxLAdapterShape24S0100000_I1(this, 1));
        }
        C002300y r1 = r3.A0k;
        if (r1 != null) {
            r1.AYX(r3.A0K);
        }
        r3.A0K = null;
        C004601z.A0T(r3.A07);
    }

    public boolean AV8(Menu menu, AnonymousClass05J r3) {
        C004601z.A0T(this.A01.A07);
        return this.A00.AV8(menu, r3);
    }
}
