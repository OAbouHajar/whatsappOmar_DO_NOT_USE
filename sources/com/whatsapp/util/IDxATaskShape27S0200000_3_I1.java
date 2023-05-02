package com.whatsapp.util;

import X.AnonymousClass160;
import X.AnonymousClass2HJ;
import X.C112795jR;
import X.C112825ja;
import X.C117735tT;
import X.C119175wf;
import X.C1213465d;
import X.C1222768y;
import X.C13680ns;
import X.C16690tT;
import android.app.Activity;
import android.text.Html;
import android.widget.TextSwitcher;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.actions.IDxNCallbackShape95S0100000_3_I1;
import com.obwhatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import java.util.ArrayList;
import java.util.List;

public class IDxATaskShape27S0200000_3_I1 extends C16690tT {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxATaskShape27S0200000_3_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:46|47|48|49|50) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00c8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00d6 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x00c0=Splitter:B:34:0x00c0, B:39:0x00c8=Splitter:B:39:0x00c8} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:49:0x00d6=Splitter:B:49:0x00d6, B:41:0x00c9=Splitter:B:41:0x00c9} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r17) {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A02
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x007d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            X.5jH r0 = (X.C112765jH) r0
            X.0wS r0 = r0.A0P
            java.util.List r8 = X.C110105dW.A0i(r0)
        L_0x0011:
            return r8
        L_0x0012:
            java.util.ArrayList r8 = X.AnonymousClass000.A0u()
            java.lang.Object r0 = r1.A01
            X.1Vv r0 = (X.C28371Vv) r0
            X.1Vv r0 = X.C110115dX.A0X(r0)
            if (r0 == 0) goto L_0x0011
            X.1Vv[] r7 = r0.A03
            if (r7 == 0) goto L_0x0011
            java.util.HashSet r6 = X.C13680ns.A0o()
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.payments.actions.IDxNCallbackShape95S0100000_3_I1 r0 = (com.obwhatsapp.payments.actions.IDxNCallbackShape95S0100000_3_I1) r0
            java.lang.Object r5 = r0.A00
            X.5wf r5 = (X.C119175wf) r5
            X.0wS r0 = r5.A0F
            java.util.List r0 = X.C110105dW.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x003a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004a
            X.1cl r0 = X.C110115dX.A0F(r1)
            java.lang.String r0 = r0.A0A
            r6.add(r0)
            goto L_0x003a
        L_0x004a:
            int r4 = r7.length
            r3 = 0
        L_0x004c:
            if (r3 >= r4) goto L_0x0011
            r9 = r7[r3]
            if (r9 == 0) goto L_0x007a
            java.lang.String r1 = r9.A00
            java.lang.String r0 = "upi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007a
            X.5hR r2 = new X.5hR
            r2.<init>()
            X.173 r1 = r5.A08
            r0 = 3
            r2.A01(r1, r9, r0)
            java.lang.String r0 = r2.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = r2.A06
            boolean r0 = r6.contains(r0)
            r2.A0H = r0
        L_0x0077:
            r8.add(r2)
        L_0x007a:
            int r3 = r3 + 1
            goto L_0x004c
        L_0x007d:
            java.lang.Object r0 = r1.A00
            X.5jH r0 = (X.C112765jH) r0
            X.0wS r0 = r0.A0P
            X.160 r3 = X.C110115dX.A0H(r0)
            r0 = 1
            int[] r7 = new int[r0]
            r6 = 0
            r1 = 3
            r7[r6] = r1
            monitor-enter(r3)
            r4 = 0
            X.1tB r0 = r3.A00     // Catch:{ all -> 0x00d7 }
            X.0tf r2 = r0.get()     // Catch:{ all -> 0x00d7 }
            X.0tg r8 = r2.A02     // Catch:{ all -> 0x00d2 }
            java.lang.String r9 = "contacts"
            r0 = 1
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "count(*) as count"
            r10[r6] = r0     // Catch:{ all -> 0x00d2 }
            java.lang.String r11 = X.AnonymousClass160.A02(r7, r1)     // Catch:{ all -> 0x00d2 }
            r12 = 0
            r14 = r12
            r15 = r12
            r13 = r12
            android.database.Cursor r1 = r8.A09(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x00c9
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = "count"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c4 }
            long r4 = r1.getLong(r0)     // Catch:{ all -> 0x00c4 }
        L_0x00c0:
            r1.close()     // Catch:{ all -> 0x00d2 }
            goto L_0x00c9
        L_0x00c4:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            throw r0     // Catch:{ all -> 0x00d2 }
        L_0x00c9:
            r2.close()     // Catch:{ all -> 0x00d7 }
            monitor-exit(r3)
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            return r8
        L_0x00d2:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00d6 }
        L_0x00d6:
            throw r0     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.IDxATaskShape27S0200000_3_I1.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        switch (this.A02) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                C1222768y r1 = ((C119175wf) ((IDxNCallbackShape95S0100000_3_I1) this.A00).A00).A02;
                if (r1 != null) {
                    r1.ANT((AnonymousClass2HJ) null, arrayList);
                    return;
                }
                return;
            case 1:
                Long l2 = (Long) obj;
                if (l2.longValue() >= 10) {
                    Activity activity = (Activity) this.A00;
                    if (!activity.isFinishing()) {
                        ((TextSwitcher) this.A01).setText(Html.fromHtml(C13680ns.A0d(activity, l2.toString(), C13680ns.A1b(), 0, R.string.str1182)));
                    }
                }
                ((C112795jR) this.A00).A3W(l2);
                return;
            default:
                List list = (List) obj;
                if (list != null && list.size() > 0) {
                    ((C112825ja) this.A00).A0B = AnonymousClass160.A01(list);
                }
                C117735tT r3 = (C117735tT) this.A01;
                String str = r3.A0G;
                if (str == null) {
                    ((IndiaUpiCheckOrderDetailsActivity) this.A00).AX1(r3.A04);
                    return;
                } else {
                    ((IndiaUpiCheckOrderDetailsActivity) this.A00).A05.A03.A00(new C1213465d(r3, this), str);
                    return;
                }
        }
    }
}
