package com.obwhatsapp.payments.ui;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass01Y;
import X.AnonymousClass160;
import X.AnonymousClass173;
import X.AnonymousClass175;
import X.AnonymousClass1GO;
import X.AnonymousClass1MA;
import X.AnonymousClass1N8;
import X.AnonymousClass1Vt;
import X.AnonymousClass2St;
import X.AnonymousClass33Y;
import X.AnonymousClass5wT;
import X.C110755em;
import X.C112995l6;
import X.C1204661t;
import X.C1222969a;
import X.C13680ns;
import X.C13690nt;
import X.C14870pt;
import X.C16000sG;
import X.C16040sK;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16980tz;
import X.C17150uc;
import X.C17630vO;
import X.C18090w8;
import X.C18290wS;
import X.C18300wT;
import X.C18450wi;
import X.C218315p;
import X.C221116r;
import X.C228719p;
import X.C228919r;
import android.os.Bundle;
import android.view.MenuItem;

public final class P2mLitePaymentTransactionDetailActivity extends C112995l6 {
    public C16980tz A00;
    public C228719p A01;
    public AnonymousClass1N8 A02;

    public C228919r A36() {
        C228919r A04 = this.A0M.A04("P2M_LITE");
        AnonymousClass00B.A06(A04);
        C18450wi.A0B(A04);
        return A04;
    }

    public C110755em A37(Bundle bundle) {
        Bundle bundle2 = bundle;
        AnonymousClass1N8 r0 = this.A02;
        if (r0 != null) {
            if (bundle == null) {
                bundle2 = C13690nt.A0E(this);
            }
            C16440t3 r46 = r0.A07;
            C14870pt r45 = r0.A00;
            C16040sK r28 = r0.A01;
            C16980tz r25 = r0.A08;
            C16320sq r24 = r0.A0U;
            AnonymousClass160 r19 = r0.A0E;
            C218315p r18 = r0.A0T;
            C16000sG r22 = r0.A05;
            AnonymousClass01V r23 = r0.A06;
            AnonymousClass013 r26 = r0.A09;
            C18290wS r17 = r0.A0N;
            AnonymousClass01Y r21 = r0.A04;
            C16460t6 r27 = r0.A0A;
            C18300wT r15 = r0.A0K;
            AnonymousClass5wT r13 = r0.A0S;
            AnonymousClass175 r12 = r0.A0J;
            C17630vO r11 = r0.A0B;
            C18090w8 r10 = r0.A0M;
            AnonymousClass173 r9 = r0.A0D;
            C17150uc r8 = r0.A02;
            C1204661t r7 = r0.A0H;
            C1222969a r6 = r0.A0Q;
            AnonymousClass1GO r5 = r0.A0R;
            C221116r r4 = r0.A0C;
            AnonymousClass1MA r3 = r0.A0O;
            C218315p r43 = r18;
            C16320sq r44 = r24;
            C14870pt r172 = r45;
            C16040sK r182 = r28;
            C17150uc r192 = r8;
            C16440t3 r242 = r46;
            C17630vO r282 = r11;
            AnonymousClass33Y r152 = new AnonymousClass33Y(bundle2, r172, r182, r192, r0.A03, r21, r22, r23, r242, r25, r26, r27, r282, r4, r9, r19, r7, r0.A0I, r12, r15, r0.A0L, r10, r17, r3, r6, r5, r13, r43, r44);
            this.A0O = r152;
            return r152;
        }
        throw C18450wi.A03("viewModelCreationDelegate");
    }

    public void A38(AnonymousClass1Vt r3, AnonymousClass2St r4) {
        r4.A01("transaction_status_name", this.A0R.A0K(r3));
    }

    public boolean A3B() {
        return this.A0L.A07();
    }

    public void onBackPressed() {
        super.onBackPressed();
        Integer A0Y = C13680ns.A0Y();
        A3A(A0Y, A0Y);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r0 = (r0 = r1.A00).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (X.AnonymousClass5wT.A00(r0) == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            X.5em r0 = r11.A0O
            X.5sx r0 = r0.A07
            r8 = 0
            if (r0 != 0) goto L_0x0049
            r1 = r8
            r0 = r8
        L_0x000c:
            X.19p r2 = r11.A01
            if (r2 == 0) goto L_0x004e
            r9 = 0
            r3 = 0
            java.lang.String r6 = r11.A0Y
            if (r0 == 0) goto L_0x001d
            boolean r0 = X.AnonymousClass5wT.A00(r0)
            r10 = 1
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            r10 = 0
        L_0x001e:
            if (r1 == 0) goto L_0x0047
            X.0tn r0 = r1.A00
            if (r0 == 0) goto L_0x0047
            X.1lc r0 = r0.A01
            if (r0 == 0) goto L_0x0047
            int r0 = r0.A01()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0030:
            java.lang.String r7 = X.C49382Ss.A01(r0)
            if (r1 == 0) goto L_0x0040
            X.0tn r0 = r1.A00
            if (r0 == 0) goto L_0x0040
            X.1lc r0 = r0.A01
            if (r0 == 0) goto L_0x0040
            java.lang.String r8 = r0.A07
        L_0x0040:
            java.lang.String r5 = "payment_transaction_details"
            r4 = r3
            r2.A01(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0047:
            r0 = r8
            goto L_0x0030
        L_0x0049:
            X.0ti r1 = r0.A03
            X.1Vt r0 = r0.A01
            goto L_0x000c
        L_0x004e:
            java.lang.String r0 = "paymentFieldStatsLogger"
            java.lang.RuntimeException r0 = X.C18450wi.A03(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.P2mLitePaymentTransactionDetailActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C18450wi.A0H(menuItem, 0);
        if (menuItem.getItemId() == 16908332) {
            Integer A0Y = C13680ns.A0Y();
            A3A(A0Y, A0Y);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18450wi.A0H(bundle, 0);
        if (C13690nt.A0E(this) != null) {
            bundle.putAll(C13690nt.A0E(this));
        }
        super.onSaveInstanceState(bundle);
    }
}
