package X;

import android.content.Context;
import android.text.TextUtils;
import com.obwhatsapp.R;

/* renamed from: X.5hw  reason: invalid class name and case insensitive filesystem */
public class C112095hw extends AnonymousClass2KG {
    public final C16040sK A00;
    public final AnonymousClass1GN A01;

    public C112095hw(Context context, C16040sK r2, C18290wS r3, AnonymousClass1GN r4) {
        super(context, r3);
        this.A00 = r2;
        this.A01 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        if ((2 - r0) == 0) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0051, code lost:
        r1 = X.C110105dW.A04(r7, com.obwhatsapp.payments.ui.BusinessHubActivity.class);
        r1.addFlags(335544320);
        r1.putExtra("extra_force_get_methods", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        return X.C42341xd.A00(r7, 0, r1, 268435456);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        r1 = X.C110105dW.A04(r7, com.obwhatsapp.payments.ui.BrazilPaymentCardDetailsActivity.class);
        X.C110115dX.A0o(r1, r8);
        r1.addFlags(268435456);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.PendingIntent A00(android.content.Context r7, X.C30671cl r8, java.lang.String r9) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x000f
            X.1tF r0 = r8.A08
            if (r0 == 0) goto L_0x000f
            int r0 = r9.hashCode()
            r5 = 1
            r4 = 0
            switch(r0) {
                case -1573204880: goto L_0x0014;
                case -945151213: goto L_0x0022;
                case -863506419: goto L_0x002c;
                case -188177059: goto L_0x0036;
                case 1084491615: goto L_0x0040;
                default: goto L_0x000f;
            }
        L_0x000f:
            android.app.PendingIntent r0 = super.A00(r7, r8, r9)
            return r0
        L_0x0014:
            java.lang.String r0 = "MERCHANT_LINKED"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x0022:
            java.lang.String r0 = "MERCHANT_DISABLED"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000f
            r0 = 1
            goto L_0x0049
        L_0x002c:
            java.lang.String r0 = "PAYMENT_METHOD_VERIFIED"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000f
            r0 = 2
            goto L_0x0049
        L_0x0036:
            java.lang.String r0 = "MERCHANT_VERIFICATION_FAILURE"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000f
            r0 = 3
            goto L_0x0049
        L_0x0040:
            java.lang.String r0 = "MERCHANT_VERIFIED"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x000f
            r0 = 4
        L_0x0049:
            r3 = 335544320(0x14000000, float:6.4623485E-27)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            int r0 = 2 - r0
            if (r0 == 0) goto L_0x0064
            java.lang.Class<com.obwhatsapp.payments.ui.BusinessHubActivity> r0 = com.obwhatsapp.payments.ui.BusinessHubActivity.class
            android.content.Intent r1 = X.C110105dW.A04(r7, r0)
            r1.addFlags(r3)
            java.lang.String r0 = "extra_force_get_methods"
            r1.putExtra(r0, r5)
        L_0x005f:
            android.app.PendingIntent r0 = X.C42341xd.A00(r7, r4, r1, r2)
            return r0
        L_0x0064:
            java.lang.Class<com.obwhatsapp.payments.ui.BrazilPaymentCardDetailsActivity> r0 = com.obwhatsapp.payments.ui.BrazilPaymentCardDetailsActivity.class
            android.content.Intent r1 = X.C110105dW.A04(r7, r0)
            X.C110115dX.A0o(r1, r8)
            r1.addFlags(r2)
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112095hw.A00(android.content.Context, X.1cl, java.lang.String):android.app.PendingIntent");
    }

    public String A01(C30671cl r3, C28371Vv r4) {
        int A04 = r3.A04();
        if (!(A04 == 1 || A04 == 4)) {
            if (A04 == 5) {
                C111825hT r0 = (C111825hT) r3.A08;
                if (r0 != null) {
                    return r0.A03;
                }
                return null;
            } else if (!(A04 == 6 || A04 == 7)) {
                return null;
            }
        }
        C111815hS r02 = (C111815hS) r3.A08;
        if (r02 != null) {
            return r02.A05;
        }
        return null;
    }

    public String A02(C30671cl r2, String str) {
        if (str == null) {
            return super.A02(r2, str);
        }
        return null;
    }

    public String A03(C30671cl r8, String str) {
        String str2;
        Context context;
        int i2;
        Object[] objArr;
        Object obj = null;
        switch (str.hashCode()) {
            case -1573204880:
                if (str.equals("MERCHANT_LINKED") && (r8 instanceof C35441lw)) {
                    C35301lh r3 = r8.A09;
                    Context context2 = this.A00;
                    Object[] objArr2 = new Object[1];
                    if (r3 != null) {
                        obj = r3.A00;
                    }
                    return C13680ns.A0d(context2, obj, objArr2, 0, R.string.str0290);
                }
            case -945151213:
                str2 = "MERCHANT_DISABLED";
                break;
            case -863506419:
                if (str.equals("PAYMENT_METHOD_VERIFIED") && (r8 instanceof C35391lr)) {
                    Context context3 = this.A00;
                    return C13680ns.A0d(context3, C119405xi.A02(context3, (C35391lr) r8), new Object[1], 0, R.string.str0293);
                }
            case -188177059:
                str2 = "MERCHANT_VERIFICATION_FAILURE";
                break;
            case 1084491615:
                str2 = "MERCHANT_VERIFIED";
                break;
        }
        if (str.equals(str2) && (r8 instanceof C35441lw)) {
            C39931tI r0 = (C39931tI) r8.A08;
            String str3 = r0 != null ? r0.A02 : "";
            if (TextUtils.isEmpty(str3)) {
                str3 = this.A00.A07();
            }
            C35301lh r02 = r8.A09;
            if (r02 != null) {
                obj = r02.A00;
            }
            if ("MERCHANT_VERIFIED".equals(str)) {
                context = this.A00;
                i2 = R.string.str0292;
            } else if ("MERCHANT_VERIFICATION_FAILURE".equals(str)) {
                context = this.A00;
                i2 = R.string.str0291;
            } else if (!"MERCHANT_DISABLED".equals(str)) {
                return "";
            } else {
                context = this.A00;
                i2 = R.string.str028f;
                objArr = new Object[]{str3};
                return context.getString(i2, objArr);
            }
            objArr = new Object[]{obj};
            return context.getString(i2, objArr);
        }
        return super.A03(r8, str);
    }
}
