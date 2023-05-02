package com.obwhatsapp.polls;

import X.AnonymousClass1RU;
import X.C003401n;
import X.C16000sG;
import X.C16080sP;
import X.C16460t6;
import X.C16980tz;
import X.C18940xV;
import X.C19150xq;
import X.C30801cy;
import X.C39171s2;
import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PollResultsViewModel extends C003401n {
    public int A00 = 0;
    public long A01 = -1;
    public C39171s2 A02;
    public List A03 = new ArrayList();
    public List A04;
    public final C16000sG A05;
    public final C16080sP A06;
    public final C16980tz A07;
    public final C16460t6 A08;
    public final C18940xV A09 = new IDxMObserverShape74S0100000_2_I0(this, 10);
    public final C19150xq A0A;
    public final AnonymousClass1RU A0B;
    public final C30801cy A0C = new C30801cy();
    public final C30801cy A0D = new C30801cy();
    public final Map A0E = new HashMap();

    public PollResultsViewModel(C16000sG r3, C16080sP r4, C16980tz r5, C16460t6 r6, C19150xq r7, AnonymousClass1RU r8) {
        this.A05 = r3;
        this.A06 = r4;
        this.A08 = r6;
        this.A0A = r7;
        this.A0B = r8;
        this.A07 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00af, code lost:
        if (r13 <= 0) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05() {
        /*
            r19 = this;
            r4 = r19
            X.1s2 r11 = r4.A02
            if (r11 == 0) goto L_0x00ff
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.A03 = r0
            java.util.List r0 = r4.A04
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r0 != 0) goto L_0x002a
            java.util.List r0 = r11.A05
            java.util.Iterator r1 = r0.iterator()
        L_0x001c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r1.next()
            r3.add(r0)
            goto L_0x001c
        L_0x002a:
            java.util.Iterator r10 = r0.iterator()
        L_0x002e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0061
            java.lang.Object r9 = r10.next()
            X.1sn r9 = (X.C39631sn) r9
            java.util.List r0 = r11.A05
            java.util.Iterator r8 = r0.iterator()
        L_0x0040:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r7 = r8.next()
            X.1sn r7 = (X.C39631sn) r7
            long r5 = r7.A01
            long r1 = r9.A01
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r3.add(r7)
            goto L_0x002e
        L_0x0058:
            r1 = 3
            com.facebook.redex.IDxComparatorShape183S0100000_2_I0 r0 = new com.facebook.redex.IDxComparatorShape183S0100000_2_I0
            r0.<init>(r4, r1)
            java.util.Collections.sort(r3, r0)
        L_0x0061:
            r4.A04 = r3
            java.util.List r2 = r4.A03
            X.1s2 r0 = r4.A02
            java.lang.String r1 = r0.A03
            X.515 r0 = new X.515
            r0.<init>(r1)
            r2.add(r0)
            X.1s2 r0 = r4.A02
            java.util.List r0 = r0.A05
            java.util.Iterator r2 = r0.iterator()
            r1 = 0
        L_0x007a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r0 = r2.next()
            X.1sn r0 = (X.C39631sn) r0
            int r0 = r0.A00
            if (r0 <= r1) goto L_0x007a
            r1 = r0
            goto L_0x007a
        L_0x008c:
            long r0 = (long) r1
            java.util.Iterator r10 = r3.iterator()
        L_0x0091:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00f8
            java.lang.Object r6 = r10.next()
            X.1sn r6 = (X.C39631sn) r6
            java.util.List r7 = r4.A03
            long r15 = r6.A01
            java.lang.String r12 = r6.A03
            int r13 = r6.A00
            int r14 = r4.A00
            long r2 = (long) r13
            r5 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x00b1
            r17 = 1
            if (r13 > 0) goto L_0x00b3
        L_0x00b1:
            r17 = 0
        L_0x00b3:
            r18 = 0
            X.517 r11 = new X.517
            r11.<init>(r12, r13, r14, r15, r17, r18)
            r7.add(r11)
            java.util.Map r7 = r4.A0E
            long r2 = r6.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r9 = r7.get(r2)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L_0x0091
            java.util.Iterator r7 = r9.iterator()
        L_0x00d1:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0091
            java.lang.Object r3 = r7.next()
            r2 = 5
            if (r5 < r2) goto L_0x00f0
            java.util.List r8 = r4.A03
            long r6 = r6.A01
            int r3 = r9.size()
            int r3 = r3 - r5
            X.516 r2 = new X.516
            r2.<init>(r6, r3)
            r8.add(r2)
            goto L_0x0091
        L_0x00f0:
            java.util.List r2 = r4.A03
            r2.add(r3)
            int r5 = r5 + 1
            goto L_0x00d1
        L_0x00f8:
            X.1cy r1 = r4.A0D
            java.util.List r0 = r4.A03
            r1.A0B(r0)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.polls.PollResultsViewModel.A05():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r11 <= 0) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(long r18) {
        /*
            r17 = this;
            r5 = r17
            X.1s2 r1 = r5.A02
            if (r1 == 0) goto L_0x0087
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.A03 = r0
            java.util.List r0 = r1.A05
            java.util.Iterator r2 = r0.iterator()
            r1 = 0
        L_0x0014:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r2.next()
            X.1sn r0 = (X.C39631sn) r0
            int r0 = r0.A00
            if (r0 <= r1) goto L_0x0014
            r1 = r0
            goto L_0x0014
        L_0x0026:
            long r2 = (long) r1
            X.1s2 r0 = r5.A02
            java.util.List r0 = r0.A05
            java.util.Iterator r8 = r0.iterator()
        L_0x002f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r6 = r8.next()
            X.1sn r6 = (X.C39631sn) r6
            long r13 = r6.A01
            int r0 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x002f
            java.util.List r4 = r5.A03
            java.lang.String r10 = r6.A03
            int r11 = r6.A00
            int r12 = r5.A00
            long r0 = (long) r11
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x0051
            r15 = 1
            if (r11 > 0) goto L_0x0052
        L_0x0051:
            r15 = 0
        L_0x0052:
            r16 = 1
            X.517 r9 = new X.517
            r9.<init>(r10, r11, r12, r13, r15, r16)
            r4.add(r9)
            java.util.Map r4 = r5.A0E
            long r0 = r6.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0087
            java.util.Iterator r4 = r0.iterator()
        L_0x0070:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r1 = r4.next()
            java.util.List r0 = r5.A03
            r0.add(r1)
            goto L_0x0070
        L_0x0080:
            X.1cy r1 = r5.A0D
            java.util.List r0 = r5.A03
            r1.A0B(r0)
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.polls.PollResultsViewModel.A06(long):void");
    }

    public void A07(C39171s2 r5) {
        RunnableRunnableShape9S0200000_I0_7 runnableRunnableShape9S0200000_I0_7 = new RunnableRunnableShape9S0200000_I0_7(this, 27, r5);
        AnonymousClass1RU r2 = this.A0B;
        if (!AnonymousClass1RU.A00(r5, (byte) 67)) {
            runnableRunnableShape9S0200000_I0_7.run();
        } else {
            r2.A02(r5, runnableRunnableShape9S0200000_I0_7, (byte) 67);
        }
    }
}
