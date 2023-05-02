package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass025;
import X.AnonymousClass167;
import X.AnonymousClass283;
import X.AnonymousClass284;
import X.AnonymousClass287;
import X.AnonymousClass288;
import X.AnonymousClass28P;
import X.C13680ns;
import X.C14710pd;
import X.C16010sH;
import X.C16620tM;
import X.C19810z2;
import X.C220516l;
import X.C34861kz;
import X.C38531qw;
import X.C42481xs;
import X.C451027b;
import X.C52462dq;
import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IDxFunctionShape0S0571000_1_I0 implements AnonymousClass025 {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;

    public IDxFunctionShape0S0571000_1_I0(C42481xs r1, C34861kz r2, C451027b r3, List list, List list2, int i2, int i3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A0D = i3;
        this.A01 = r1;
        this.A02 = r2;
        this.A08 = z2;
        this.A09 = z3;
        this.A0A = z4;
        this.A0B = z5;
        this.A0C = z6;
        this.A06 = z7;
        this.A07 = z8;
        this.A00 = i2;
        this.A03 = list;
        this.A04 = list2;
        this.A05 = r3;
    }

    public final Object apply(Object obj) {
        Object obj2 = obj;
        if (this.A0D != 0) {
            C42481xs r10 = (C42481xs) this.A01;
            C34861kz r14 = (C34861kz) this.A02;
            boolean z2 = this.A08;
            boolean z3 = this.A09;
            boolean z4 = this.A0A;
            boolean z5 = this.A0B;
            boolean z6 = this.A0C;
            boolean z7 = this.A06;
            boolean z8 = this.A07;
            int i2 = this.A00;
            List list = (List) this.A03;
            C451027b r7 = (C451027b) this.A05;
            String str = (String) obj2;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AnonymousClass00B.A0A("", list);
            ArrayList A0u = AnonymousClass000.A0u();
            AnonymousClass287 A012 = r10.A0A.A01("sync/sync_notification/", (List) this.A04, list);
            if (A012 != null) {
                List list2 = A012.A02;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    C16010sH A0U = C13680ns.A0U(it);
                    if (!AnonymousClass288.A03(A0U, false)) {
                        C38531qw r4 = new C38531qw(A0U);
                        r4.A09 = true;
                        r4.A0I = z2;
                        r4.A0G = z3;
                        r4.A08 = z4;
                        r4.A0B = z5;
                        r4.A00 = C16010sH.A00(A0U, r14);
                        r4.A0F = z6;
                        r4.A0C = z7;
                        r4.A0E = z8;
                        if (z5) {
                            r4.A01 = C19810z2.A00(r4, r10.A0G, r4.A0K);
                        }
                        C13680ns.A1R(r10, r4, z6 ? 1 : 0);
                        C38531qw.A00(r10, r4, r4.A0K, r10.A0M);
                        C38531qw.A01(r4, A0u);
                    }
                }
                A0u.size();
                if (!C451027b.A00(r7, A0u)) {
                    if (r10.A03(r7, str, r10.A01().A04(new C52462dq(r14, A0u, i2, false), AnonymousClass288.A00("sync_sid_notification_contact"), 64000))) {
                        ArrayList A0u2 = AnonymousClass000.A0u();
                        r10.A02(A0u2, list2, r10.A0P);
                        C220516l r9 = r10.A06;
                        C14710pd r13 = r9.A04;
                        C16620tM r11 = C16620tM.A02;
                        if (r13.A0E(r11, 1665)) {
                            r9.A06.Acl(new RunnableRunnableShape5S0200000_I0_3(r9, 1, A0u2));
                        }
                        if (r13.A0E(r11, 1666)) {
                            long size = (long) A0u2.size();
                            if (size > 0) {
                                AnonymousClass28P r8 = new AnonymousClass28P();
                                r8.A00 = Long.valueOf(size);
                                r9.A05.A06(r8);
                            }
                        }
                        if (!list2.isEmpty()) {
                            r10.A04.A0T(list2, false);
                        }
                        AnonymousClass167.A00(r10, r7, A0u, elapsedRealtime);
                        return AnonymousClass284.A07;
                    }
                }
                return AnonymousClass284.A08;
            }
        } else {
            C42481xs r142 = (C42481xs) this.A01;
            C34861kz r132 = (C34861kz) this.A02;
            boolean z9 = this.A08;
            boolean z10 = this.A09;
            boolean z11 = this.A0A;
            boolean z12 = this.A0B;
            boolean z13 = this.A0C;
            boolean z14 = this.A06;
            boolean z15 = this.A07;
            int i3 = this.A00;
            List list3 = (List) this.A03;
            List list4 = (List) this.A04;
            C451027b r72 = (C451027b) this.A05;
            String str2 = (String) obj2;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            AnonymousClass00B.A0A("", list3);
            ArrayList A0u3 = AnonymousClass000.A0u();
            try {
                List A013 = AnonymousClass288.A01(MessageDigest.getInstance("MD5"), list3, list4);
                HashSet hashSet = new HashSet(A013.size());
                Iterator it2 = A013.iterator();
                while (it2.hasNext()) {
                    C16010sH A0U2 = C13680ns.A0U(it2);
                    C38531qw r2 = new C38531qw(A0U2);
                    r2.A0I = z9;
                    r2.A0G = z10;
                    r2.A08 = z11;
                    r2.A0D = true;
                    r2.A0B = z12;
                    r2.A00 = C16010sH.A00(A0U2, r132);
                    r2.A0F = z13;
                    r2.A0C = z14;
                    r2.A0E = z15;
                    if (z12) {
                        r2.A01 = C19810z2.A00(r2, r142.A0G, r2.A0K);
                    }
                    C13680ns.A1R(r142, r2, z13 ? 1 : 0);
                    Map map = r142.A0M;
                    UserJid userJid = r2.A0K;
                    C38531qw.A00(r142, r2, userJid, map);
                    C38531qw.A01(r2, A0u3);
                    if (userJid != null) {
                        hashSet.add(userJid);
                    }
                }
                A0u3.size();
                if (!C451027b.A00(r72, A0u3)) {
                    if (r142.A03(r72, str2, AnonymousClass283.A03(r132, r142.A01(), "sync_sid_notification_sidelist", A0u3, i3))) {
                        AnonymousClass167.A00(r142, r72, A0u3, elapsedRealtime2);
                        return new AnonymousClass284(hashSet, 3);
                    }
                }
                return AnonymousClass284.A08;
            } catch (NoSuchAlgorithmException e2) {
                throw new AssertionError(e2);
            }
        }
        return AnonymousClass284.A03;
    }
}
