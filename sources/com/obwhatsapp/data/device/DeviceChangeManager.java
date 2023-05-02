package com.obwhatsapp.data.device;

import X.AnonymousClass00B;
import X.AnonymousClass122;
import X.AnonymousClass137;
import X.AnonymousClass16P;
import X.AnonymousClass1WU;
import X.AnonymousClass1ZT;
import X.C14710pd;
import X.C15800rs;
import X.C15830rv;
import X.C15860rz;
import X.C16030sJ;
import X.C16040sK;
import X.C16060sN;
import X.C16070sO;
import X.C16440t3;
import X.C16460t6;
import X.C16620tM;
import X.C17380uz;
import X.C18020w1;
import X.C18920xT;
import X.C19810z2;
import X.C208211s;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Set;

public class DeviceChangeManager {
    public final C16040sK A00;
    public final C18020w1 A01;
    public final C15800rs A02;
    public final C16440t3 A03;
    public final C15860rz A04;
    public final C208211s A05;
    public final AnonymousClass16P A06;
    public final C18920xT A07;
    public final C16460t6 A08;
    public final C16070sO A09;
    public final AnonymousClass137 A0A;
    public final C19810z2 A0B;
    public final C14710pd A0C;
    public final AnonymousClass122 A0D;

    public DeviceChangeManager(C16040sK r1, C18020w1 r2, C15800rs r3, C16440t3 r4, C15860rz r5, C208211s r6, AnonymousClass16P r7, C18920xT r8, C16460t6 r9, C16070sO r10, AnonymousClass137 r11, C19810z2 r12, C14710pd r13, AnonymousClass122 r14) {
        this.A03 = r4;
        this.A0C = r13;
        this.A00 = r1;
        this.A07 = r8;
        this.A01 = r2;
        this.A06 = r7;
        this.A08 = r9;
        this.A05 = r6;
        this.A0B = r12;
        this.A04 = r5;
        this.A0A = r11;
        this.A02 = r3;
        this.A0D = r14;
        this.A09 = r10;
    }

    public final Set A00(UserJid userJid) {
        HashSet hashSet = new HashSet();
        C16040sK r4 = this.A00;
        r4.A0B();
        AnonymousClass1ZT r0 = r4.A05;
        AnonymousClass00B.A06(r0);
        Set A012 = A01(r0);
        for (C16060sN r2 : A01(userJid)) {
            if (A012.contains(r2)) {
                C17380uz A022 = this.A09.A07.A04(r2).A02();
                if (A022.contains(userJid)) {
                    r4.A0B();
                    if (A022.contains(r4.A05) || A022.contains(r4.A03()) || C16030sJ.A0G(r2)) {
                        hashSet.add(r2);
                    }
                }
            }
        }
        return hashSet;
    }

    public final Set A01(UserJid userJid) {
        return this.A00.A0I(userJid) ? new HashSet(this.A02.A07()) : this.A09.A07.A07(userJid);
    }

    public void A02(C17380uz r15, C17380uz r16, C17380uz r17, UserJid userJid, boolean z2) {
        AnonymousClass1WU A032;
        AnonymousClass1WU A033;
        boolean A1Y = this.A04.A1Y();
        boolean z3 = true;
        boolean z4 = !this.A0A.A0E.A0E(C16620tM.A02, 903);
        if (!z4 && !z2) {
            z3 = false;
        }
        if (A1Y && z3) {
            r16.toString();
            r17.toString();
            C16040sK r4 = this.A00;
            UserJid userJid2 = userJid;
            if (r4.A0I(userJid2)) {
                for (C15830rv r8 : this.A02.A05()) {
                    if (!r4.A0I(r8) && z4) {
                        this.A08.A0u(this.A0D.A02(r8, userJid2, r16.size(), r17.size(), this.A03.A00()));
                    }
                }
            } else if (!r15.isEmpty()) {
                if (this.A02.A0C(userJid2)) {
                    C16460t6 r42 = this.A08;
                    if (z4) {
                        A033 = this.A0D.A02(userJid2, userJid2, r16.size(), r17.size(), this.A03.A00());
                    } else {
                        A033 = this.A0D.A03(userJid2, userJid2, this.A03.A00());
                    }
                    r42.A0u(A033);
                }
                for (C15830rv r82 : A00(userJid2)) {
                    C16460t6 r43 = this.A08;
                    if (z4) {
                        A032 = this.A0D.A02(r82, userJid2, r16.size(), r17.size(), this.A03.A00());
                    } else {
                        A032 = this.A0D.A03(r82, userJid2, this.A03.A00());
                    }
                    r43.A0u(A032);
                }
            }
        }
    }
}
