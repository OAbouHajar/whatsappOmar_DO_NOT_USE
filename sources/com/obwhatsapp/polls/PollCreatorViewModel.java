package com.obwhatsapp.polls;

import X.AnonymousClass000;
import X.AnonymousClass027;
import X.AnonymousClass1N9;
import X.C003401n;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C16440t3;
import X.C16620tM;
import X.C16760tb;
import X.C30801cy;
import X.C77743wT;
import X.C77753wU;
import X.C77763wV;
import X.C82904Ep;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class PollCreatorViewModel extends C003401n {
    public int A00 = -1;
    public int A01 = -1;
    public int A02;
    public final AnonymousClass027 A03 = C13690nt.A0O();
    public final AnonymousClass027 A04 = C13690nt.A0O();
    public final C16760tb A05;
    public final C16440t3 A06;
    public final C14710pd A07;
    public final C77743wT A08 = new C77743wT();
    public final C77763wV A09 = new C77763wV();
    public final AnonymousClass1N9 A0A;
    public final C30801cy A0B = C30801cy.A01();
    public final C30801cy A0C = C30801cy.A01();
    public final C30801cy A0D = C30801cy.A01();
    public final C30801cy A0E = C30801cy.A01();
    public final List A0F = AnonymousClass000.A0u();
    public final List A0G = AnonymousClass000.A0u();

    public PollCreatorViewModel(C16760tb r4, C16440t3 r5, C14710pd r6, AnonymousClass1N9 r7) {
        this.A06 = r5;
        this.A07 = r6;
        this.A05 = r4;
        this.A0A = r7;
        List list = this.A0G;
        list.add(new C77753wU(0));
        list.add(new C77753wU(1));
        this.A02 = 2;
        A05();
    }

    public final void A05() {
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add(this.A09);
        A0u.add(this.A08);
        A0u.addAll(this.A0G);
        this.A04.A0B(A0u);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r3 = r4 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(int r7) {
        /*
            r6 = this;
            java.util.List r5 = r6.A0G
            int r4 = r5.size()
            if (r4 <= 0) goto L_0x0027
            int r3 = r4 + -1
            if (r7 != r3) goto L_0x0027
            X.0pd r2 = r6.A07
            r1 = 1408(0x580, float:1.973E-42)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r2.A03(r0, r1)
            if (r4 != r0) goto L_0x0027
            java.lang.Object r0 = r5.get(r3)
            X.3wU r0 = (X.C77753wU) r0
            java.lang.String r0 = r0.A00
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 != 0) goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.polls.PollCreatorViewModel.A06(int):boolean");
    }

    public boolean A07(String str, int i2) {
        List list = this.A0G;
        C77753wU r1 = (C77753wU) list.get(i2);
        if (TextUtils.equals(r1.A00, str)) {
            return false;
        }
        r1.A00 = str;
        if (list.size() < this.A07.A03(C16620tM.A02, 1408)) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C77753wU) it.next()).A00.isEmpty()) {
                        break;
                    }
                } else {
                    int i3 = this.A02;
                    this.A02 = i3 + 1;
                    list.add(new C77753wU(i3));
                    break;
                }
            }
        }
        A05();
        return true;
    }

    public boolean A08(boolean z2) {
        List list;
        HashSet A0o = C13680ns.A0o();
        Stack stack = new Stack();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            list = this.A0G;
            if (i2 >= list.size()) {
                break;
            }
            String trim = ((C77753wU) list.get(i2)).A00.trim();
            if (!trim.isEmpty()) {
                i3++;
                if (!A0o.contains(trim)) {
                    A0o.add(trim);
                } else {
                    stack.push(Integer.valueOf(i2));
                }
            }
            i2++;
        }
        if (stack.isEmpty()) {
            this.A0B.A09(C13690nt.A0I(-1, Boolean.FALSE));
            this.A00 = -1;
            return i3 > 1;
        }
        Number number = (Number) stack.pop();
        int intValue = number.intValue();
        this.A0B.A09(C13690nt.A0I(number, Boolean.valueOf(z2)));
        this.A00 = ((C82904Ep) list.get(intValue)).A00;
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r8 == false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A09(boolean r8) {
        /*
            r7 = this;
            java.util.HashSet r3 = X.C13680ns.A0o()
            java.util.List r5 = r7.A0F
            r5.clear()
            r6 = 0
            r2 = 0
            r4 = 0
        L_0x000c:
            java.util.List r1 = r7.A0G
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x003c
            java.lang.Object r0 = r1.get(r2)
            X.3wU r0 = (X.C77753wU) r0
            java.lang.String r0 = r0.A00
            java.lang.String r1 = r0.trim()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0031
            int r4 = r4 + 1
            boolean r0 = r3.contains(r1)
            if (r0 != 0) goto L_0x0034
            r3.add(r1)
        L_0x0031:
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0034:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5.add(r0)
            goto L_0x0031
        L_0x003c:
            X.1cy r3 = r7.A0C
            java.util.ArrayList r2 = X.C13680ns.A0n(r5)
            boolean r0 = r5.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x004c
            r0 = 1
            if (r8 != 0) goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            android.util.Pair r0 = X.C13690nt.A0I(r2, r0)
            r3.A09(r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0061
            if (r4 <= r1) goto L_0x0061
            r6 = 1
        L_0x0061:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.polls.PollCreatorViewModel.A09(boolean):boolean");
    }
}
