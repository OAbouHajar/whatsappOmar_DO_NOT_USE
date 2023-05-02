package com.obwhatsapp.picker.searchexpressions;

import X.AnonymousClass000;
import X.AnonymousClass027;
import X.AnonymousClass028;
import X.AnonymousClass1BQ;
import X.AnonymousClass2VG;
import X.AnonymousClass2X4;
import X.AnonymousClass3AQ;
import X.AnonymousClass4IS;
import X.C003401n;
import X.C05730St;
import X.C13690nt;
import X.C16490t9;
import X.C25851Lj;
import X.C25861Lk;
import X.C25921Lq;
import X.C34151jm;
import X.C82874Em;
import X.C82884En;
import X.C82894Eo;
import X.C87924Ze;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.redex.IDxFunctionShape207S0100000_2_I1;
import com.obwhatsapp.gifsearch.IDxResultShape16S0200000_2_I0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ExpressionSearchViewModel extends C003401n implements AnonymousClass2VG {
    public Handler A00 = AnonymousClass000.A0L();
    public AnonymousClass028 A01;
    public AnonymousClass028 A02;
    public AnonymousClass027 A03 = C13690nt.A0O();
    public AnonymousClass1BQ A04;
    public C16490t9 A05;
    public C25861Lk A06;
    public Runnable A07;
    public final AnonymousClass027 A08;
    public final AnonymousClass027 A09;
    public final AnonymousClass027 A0A;
    public final AnonymousClass027 A0B;
    public final AnonymousClass027 A0C;
    public final AnonymousClass3AQ A0D = new AnonymousClass3AQ();
    public final C82894Eo A0E = new C82894Eo();

    public ExpressionSearchViewModel() {
        AnonymousClass027 A0O = C13690nt.A0O();
        this.A0A = A0O;
        AnonymousClass027 A0O2 = C13690nt.A0O();
        this.A09 = A0O2;
        AnonymousClass027 A0O3 = C13690nt.A0O();
        this.A0C = A0O3;
        AnonymousClass027 A0O4 = C13690nt.A0O();
        this.A08 = A0O4;
        AnonymousClass027 A0O5 = C13690nt.A0O();
        this.A0B = A0O5;
        this.A02 = C05730St.A00(new IDxFunctionShape207S0100000_2_I1(this, 3), A0O5);
        this.A01 = C05730St.A00(new IDxFunctionShape207S0100000_2_I1(this, 2), A0O5);
        A0O5.A0B(new C87924Ze());
        A0O.A0B(new AnonymousClass4IS(0, ""));
        A0O2.A0B(new C82874Em(2));
        A0O3.A0B(new C82884En(0));
        A0O4.A0B(new C82884En(0));
        this.A03.A0B((Object) null);
    }

    public void A04() {
        Handler handler;
        Runnable runnable = this.A07;
        if (!(runnable == null || (handler = this.A00) == null)) {
            handler.removeCallbacks(runnable);
        }
        this.A00 = null;
    }

    public HashSet A05() {
        AnonymousClass027 r1 = this.A0B;
        if (r1.A01() != null) {
            return ((C87924Ze) r1.A01()).A00;
        }
        return null;
    }

    public List A06() {
        AnonymousClass027 r1 = this.A0B;
        if (r1.A01() != null) {
            return ((C87924Ze) r1.A01()).A01;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A07(int r15) {
        /*
            r14 = this;
            java.util.List r0 = r14.A06()
            r13 = 0
            if (r0 != 0) goto L_0x000c
            java.util.ArrayList r0 = X.C13690nt.A0i(r13)
            return r0
        L_0x000c:
            X.4Eo r10 = r14.A0E
            switch(r15) {
                case 1: goto L_0x002d;
                case 2: goto L_0x002f;
                case 3: goto L_0x0031;
                case 4: goto L_0x0033;
                case 5: goto L_0x0035;
                case 6: goto L_0x0037;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.util.ArrayList r3 = X.C13690nt.A0i(r13)
            java.util.Iterator r2 = r0.iterator()
        L_0x0019:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0089
            java.lang.Object r1 = r2.next()
            X.1jm r1 = (X.C34151jm) r1
            boolean r0 = r1.A0H
            if (r0 == 0) goto L_0x0019
            r3.add(r1)
            goto L_0x0019
        L_0x002d:
            r11 = 1
            goto L_0x0038
        L_0x002f:
            r11 = 2
            goto L_0x0038
        L_0x0031:
            r11 = 3
            goto L_0x0038
        L_0x0033:
            r11 = 4
            goto L_0x0038
        L_0x0035:
            r11 = 5
            goto L_0x0038
        L_0x0037:
            r11 = 6
        L_0x0038:
            java.util.ArrayList r9 = X.C13690nt.A0i(r13)
            java.util.Iterator r12 = r0.iterator()
        L_0x0040:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0082
            java.lang.Object r8 = r12.next()
            X.1jm r8 = (X.C34151jm) r8
            if (r8 == 0) goto L_0x0040
            X.1XO r0 = r8.A04
            if (r0 == 0) goto L_0x0040
            X.1pj[] r7 = r0.A09
            if (r7 == 0) goto L_0x0040
            X.4ai r6 = r10.A00
            java.util.HashSet r5 = X.C13680ns.A0o()
            int r4 = r7.length
            r3 = 0
        L_0x005e:
            if (r3 >= r4) goto L_0x0078
            r2 = r7[r3]
            int r3 = r3 + 1
            java.util.HashMap r1 = r6.A00
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r1.get(r2)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x005e
            r5.addAll(r0)
            goto L_0x005e
        L_0x0078:
            boolean r0 = X.C13690nt.A1V(r5, r11)
            if (r0 == 0) goto L_0x0040
            r9.add(r8)
            goto L_0x0040
        L_0x0082:
            r0 = 22
            X.C13690nt.A1P(r9, r0)
            r0 = r9
            goto L_0x0011
        L_0x0089:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.picker.searchexpressions.ExpressionSearchViewModel.A07(int):java.util.List");
    }

    public List A08(int i2) {
        List A062 = A06();
        if (A062 == null) {
            return C13690nt.A0i(0);
        }
        List<C34151jm> A002 = this.A0D.A00(A062, i2);
        ArrayList A0i = C13690nt.A0i(0);
        for (C34151jm r1 : A002) {
            if (!r1.A0H) {
                A0i.add(r1);
            }
        }
        return A0i;
    }

    public void A09(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A03.A0B(this.A06.A01());
            return;
        }
        AnonymousClass027 r2 = this.A03;
        C25861Lk r1 = this.A06;
        r2.A0B(r1 instanceof C25921Lq ? new IDxResultShape16S0200000_2_I0((C25921Lq) r1, (CharSequence) str) : new IDxResultShape16S0200000_2_I0((C25851Lj) r1, (CharSequence) str));
    }

    public void AWX(AnonymousClass2X4 r5) {
        List list = r5.A01;
        HashSet hashSet = new HashSet(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            hashSet.add(list.get(i2));
        }
        AnonymousClass027 r2 = this.A0B;
        r2.A0B(new C87924Ze(hashSet, r2.A01() != null ? ((C87924Ze) r2.A01()).A01 : C13690nt.A0i(0)));
    }
}
