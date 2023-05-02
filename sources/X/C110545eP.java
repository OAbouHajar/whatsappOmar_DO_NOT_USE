package X;

import android.view.View;
import com.obwhatsapp.PagerSlidingTabStrip;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiMyQrFragment;
import com.obwhatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.obwhatsapp.payments.ui.IndiaUpiScanQrCodeFragment;

/* renamed from: X.5eP  reason: invalid class name and case insensitive filesystem */
public class C110545eP extends AnonymousClass011 implements C14830pp {
    public C83824Ie[] A00;
    public final /* synthetic */ IndiaUpiQrTabActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110545eP(AnonymousClass02C r2, IndiaUpiQrTabActivity indiaUpiQrTabActivity, int i2) {
        super(r2, 0);
        this.A01 = indiaUpiQrTabActivity;
        this.A00 = new C83824Ie[i2];
    }

    public int A01() {
        return this.A00.length;
    }

    public CharSequence A04(int i2) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = this.A01;
        int i3 = R.string.str0581;
        if (i2 != 0) {
            if (i2 != 1) {
                throw AnonymousClass000.A0T("The item position is not defined");
            }
            i3 = R.string.str0577;
        }
        return indiaUpiQrTabActivity.getString(i3);
    }

    public AnonymousClass01A A0G(int i2) {
        if (i2 == 0) {
            return new IndiaUpiScanQrCodeFragment();
        }
        if (i2 == 1) {
            return IndiaUpiMyQrFragment.A01(IndiaUpiQrTabActivity.A0G);
        }
        throw AnonymousClass000.A0T("The item position is not defined");
    }

    public View AEF(int i2) {
        C83824Ie[] r3 = this.A00;
        if (r3[i2] == null) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.A01.A01;
            C83824Ie r2 = new C83824Ie(C13680ns.A0H(C13680ns.A0G(pagerSlidingTabStrip), pagerSlidingTabStrip, R.layout.layout04e2));
            CharSequence A04 = A04(i2);
            AnonymousClass00B.A06(A04);
            r2.A01.setText(A04);
            r3[i2] = r2;
        }
        return r3[i2].A00;
    }
}
