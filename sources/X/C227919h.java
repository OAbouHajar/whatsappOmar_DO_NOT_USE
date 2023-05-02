package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.obwhatsapp.R;

/* renamed from: X.19h  reason: invalid class name and case insensitive filesystem */
public class C227919h implements C17100uX {
    public final C19980zJ A00;
    public final C14870pt A01;
    public final C17090uW A02;
    public final AnonymousClass013 A03;
    public final C18030w2 A04;
    public final AnonymousClass175 A05;
    public final AnonymousClass174 A06;
    public final C18290wS A07;
    public final AnonymousClass1Vo A08 = AnonymousClass1Vo.A00("PaymentActivityLauncher", "infra", "COMMON");

    public C227919h(C19980zJ r4, C14870pt r5, C17090uW r6, AnonymousClass013 r7, C18030w2 r8, AnonymousClass175 r9, AnonymousClass174 r10, C18290wS r11) {
        this.A01 = r5;
        this.A02 = r6;
        this.A00 = r4;
        this.A03 = r7;
        this.A04 = r8;
        this.A07 = r11;
        this.A05 = r9;
        this.A06 = r10;
    }

    public Intent A00(Context context) {
        Class AER;
        C228919r A042 = this.A07.A04("P2M_LITE");
        if (A042 == null || (AER = A042.AER()) == null) {
            return null;
        }
        return new Intent(context, AER);
    }

    public Intent A01(Context context) {
        Class AER = this.A07.A03().AER();
        if (AER == null) {
            return null;
        }
        return new Intent(context, AER);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r4.A07.A0E.A00.A05(X.C15910s6.A0m) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Intent A02(android.content.Context r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            r2 = 1
            if (r7 != 0) goto L_0x0015
            if (r6 != 0) goto L_0x0014
            X.0wS r0 = r4.A07
            X.0w8 r0 = r0.A0E
            X.0s5 r1 = r0.A00
            X.0s8 r0 = X.C15910s6.A0m
            boolean r0 = r1.A05(r0)
            r6 = 0
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r6 = 1
        L_0x0015:
            java.lang.String r3 = "extra_setup_mode"
            X.175 r1 = r4.A05
            boolean r0 = r1.A0B()
            if (r6 != 0) goto L_0x004a
            if (r0 != 0) goto L_0x006f
            boolean r0 = r1.A0E()
            if (r0 != 0) goto L_0x006f
            X.0wS r1 = r4.A07
            X.19r r0 = r1.A03()
            boolean r0 = r0.A5z()
            if (r0 != 0) goto L_0x006f
            X.19r r0 = r1.A03()
            java.lang.Class r0 = r0.A9g()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r5, r0)
            r0 = 2
            r1.putExtra(r3, r0)
        L_0x0044:
            java.lang.String r0 = "extra_is_pay_money_only"
            r1.putExtra(r0, r6)
            return r1
        L_0x004a:
            if (r0 != 0) goto L_0x006f
            boolean r0 = r1.A0D()
            if (r0 != 0) goto L_0x006f
            X.0wS r1 = r4.A07
            X.19r r0 = r1.A03()
            boolean r0 = r0.A5z()
            if (r0 != 0) goto L_0x006f
            X.19r r0 = r1.A03()
            java.lang.Class r0 = r0.A9g()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r5, r0)
            r1.putExtra(r3, r2)
            goto L_0x0044
        L_0x006f:
            X.0wS r0 = r4.A07
            X.19r r0 = r0.A03()
            java.lang.Class r0 = r0.AFu()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r5, r0)
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227919h.A02(android.content.Context, boolean, boolean):android.content.Intent");
    }

    public void Act(Context context, Uri uri) {
        Intent intent;
        if (uri == null) {
            this.A08.A05("start-activity/uri-is-null");
            return;
        }
        C35301lh r3 = new C35301lh(new C53852gP(), String.class, uri.getLastPathSegment(), "paymentHandle");
        if ("wapay".equals(uri.getScheme()) && !C39841t9.A03(r3)) {
            intent = A02(context, false, true);
            intent.putExtra("extra_payment_handle", r3);
            intent.putExtra("verify-vpa-in-background", true);
            intent.putExtra("referral_screen", "vpa_handle_chat");
        } else if ("upi".equals(uri.getScheme())) {
            this.A02.Act(context, uri);
            return;
        } else if (this.A04.A08(uri) == 21) {
            Class AEw = this.A07.A03().AEw();
            if (AEw != null) {
                intent = new Intent();
                intent.setClassName(context.getPackageName(), AEw.getName());
                intent.setData(uri);
            } else {
                return;
            }
        } else {
            this.A08.A05("start-activity/uri-is-not-wapay-compatible");
            this.A01.A09(R.string.str00a0, 0);
            return;
        }
        this.A00.A06(context, intent);
    }

    public void Acu(Context context, Uri uri, int i2) {
    }

    public void Acv(Context context, Uri uri, int i2, int i3) {
    }
}
