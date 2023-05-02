package X;

import android.view.View;
import com.obwhatsapp.PagerSlidingTabStrip;
import com.obwhatsapp.R;

/* renamed from: X.2qN  reason: invalid class name and case insensitive filesystem */
public class C57162qN extends AnonymousClass011 implements C14830pp {
    public final C83824Ie[] A00 = new C83824Ie[2];
    public final /* synthetic */ AnonymousClass342 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57162qN(AnonymousClass02C r2, AnonymousClass342 r3) {
        super(r2, 0);
        this.A01 = r3;
    }

    public int A01() {
        return 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r5 != 1) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence A04(int r5) {
        /*
            r4 = this;
            X.342 r3 = r4.A01
            X.013 r0 = r3.A0I
            boolean r2 = X.C13680ns.A1Z(r0)
            r1 = 1
            if (r5 == 0) goto L_0x0014
            if (r5 == r1) goto L_0x0016
        L_0x000d:
            java.lang.String r0 = "The item position should be less than: 2"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x0014:
            r2 = r2 ^ 1
        L_0x0016:
            r0 = 2131887479(0x7f120577, float:1.9409566E38)
            if (r2 == 0) goto L_0x0020
            if (r2 != r1) goto L_0x000d
            r0 = 2131887489(0x7f120581, float:1.9409587E38)
        L_0x0020:
            java.lang.String r0 = r3.getString(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57162qN.A04(int):java.lang.CharSequence");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r3 != 1) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass01A A0G(int r3) {
        /*
            r2 = this;
            X.342 r0 = r2.A01
            X.013 r0 = r0.A0I
            boolean r1 = X.C13680ns.A1Z(r0)
            r0 = 1
            if (r3 == 0) goto L_0x0014
            if (r3 == r0) goto L_0x0016
        L_0x000d:
            java.lang.String r0 = "The item position should be less than: 2"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x0014:
            r1 = r1 ^ 1
        L_0x0016:
            if (r1 == 0) goto L_0x0020
            if (r1 != r0) goto L_0x000d
            com.obwhatsapp.qrcode.contactqr.QrScanCodeFragment r0 = new com.obwhatsapp.qrcode.contactqr.QrScanCodeFragment
            r0.<init>()
            return r0
        L_0x0020:
            com.obwhatsapp.qrcode.contactqr.ContactQrMyCodeFragment r0 = new com.obwhatsapp.qrcode.contactqr.ContactQrMyCodeFragment
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57162qN.A0G(int):X.01A");
    }

    public View AEF(int i2) {
        C83824Ie[] r3 = this.A00;
        if (r3[i2] == null) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.A01.A07;
            C83824Ie r2 = new C83824Ie(C13680ns.A0H(C13680ns.A0G(pagerSlidingTabStrip), pagerSlidingTabStrip, R.layout.layout04e2));
            CharSequence A04 = A04(i2);
            AnonymousClass00B.A06(A04);
            r2.A01.setText(A04);
            r3[i2] = r2;
        }
        return r3[i2].A00;
    }
}
