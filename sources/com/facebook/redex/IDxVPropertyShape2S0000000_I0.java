package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass0S0;
import X.AnonymousClass0X7;
import X.C05630Si;
import android.view.View;

public class IDxVPropertyShape2S0000000_I0 extends AnonymousClass0S0 {
    public final int A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        super(r3, r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IDxVPropertyShape2S0000000_I0(int r5) {
        /*
            r4 = this;
            r4.A00 = r5
            switch(r5) {
                case 0: goto L_0x0011;
                case 1: goto L_0x0017;
                case 2: goto L_0x001f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            r2 = 2131366561(0x7f0a12a1, float:1.835302E38)
        L_0x000a:
            r1 = 0
        L_0x000b:
            r0 = 28
        L_0x000d:
            r4.<init>(r3, r2, r1, r0)
            return
        L_0x0011:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            r2 = 2131366566(0x7f0a12a6, float:1.835303E38)
            goto L_0x000a
        L_0x0017:
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            r2 = 2131366562(0x7f0a12a2, float:1.8353021E38)
            r1 = 8
            goto L_0x000b
        L_0x001f:
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            r2 = 2131366568(0x7f0a12a8, float:1.8353033E38)
            r1 = 64
            r0 = 30
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxVPropertyShape2S0000000_I0.<init>(int):void");
    }

    public /* bridge */ /* synthetic */ Object A03(View view) {
        boolean A06;
        switch (this.A00) {
            case 0:
                A06 = AnonymousClass0X7.A06(view);
                break;
            case 1:
                return AnonymousClass0X7.A00(view);
            case 2:
                return C05630Si.A00(view);
            default:
                A06 = AnonymousClass0X7.A05(view);
                break;
        }
        return Boolean.valueOf(A06);
    }

    public /* bridge */ /* synthetic */ void A04(View view, Object obj) {
        switch (this.A00) {
            case 0:
                AnonymousClass0X7.A04(view, AnonymousClass000.A1X(obj));
                return;
            case 1:
                AnonymousClass0X7.A02(view, (CharSequence) obj);
                return;
            case 2:
                C05630Si.A01(view, (CharSequence) obj);
                return;
            default:
                AnonymousClass0X7.A03(view, AnonymousClass000.A1X(obj));
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r5.booleanValue() == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r6.booleanValue() == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ boolean A05(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 1: goto L_0x0024;
                case 2: goto L_0x0024;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r3 = 1
            if (r5 == 0) goto L_0x0013
            boolean r0 = r5.booleanValue()
            r2 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            if (r6 == 0) goto L_0x001d
            boolean r1 = r6.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r2 == r0) goto L_0x0021
            r3 = 0
        L_0x0021:
            r0 = r3 ^ 1
            return r0
        L_0x0024:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r0 = android.text.TextUtils.equals(r5, r6)
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxVPropertyShape2S0000000_I0.A05(java.lang.Object, java.lang.Object):boolean");
    }
}
