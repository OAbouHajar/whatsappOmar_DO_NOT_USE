package com.facebook.redex;

import X.AnonymousClass36W;
import X.AnonymousClass378;
import X.C16050sL;
import X.C30371cF;
import X.C40871up;
import X.C85534Ov;
import com.whatsapp.jid.UserJid;
import java.util.Map;

public class IDxIResponseShape359S0100000_2_I1 implements C40871up {
    public Object A00;
    public final int A01;

    public IDxIResponseShape359S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AQR(int i2) {
        int i3 = this.A01;
        Object obj = this.A00;
        if (i3 != 0) {
            ((AnonymousClass378) obj).A00 = i2;
        } else {
            ((AnonymousClass36W) obj).A00 = i2;
        }
    }

    public void ARw(C16050sL r28, C16050sL r29, UserJid userJid, C30371cF r31, String str, String str2, String str3, Map map, int i2, int i3, int i4, long j2, long j3) {
        C16050sL r4 = r28;
        UserJid userJid2 = userJid;
        C30371cF r6 = r31;
        String str4 = str;
        String str5 = str3;
        Map map2 = map;
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        long j4 = j2;
        if (this.A01 != 0) {
            ((AnonymousClass378) this.A00).A0B(r4, userJid2, r6, str4, str5, map2.keySet(), i5, i6, i7, j4);
            return;
        }
        AnonymousClass36W r1 = (AnonymousClass36W) this.A00;
        r1.A01 = new C85534Ov(r4, userJid2, r6, str4, str5, r1.A03.A0B(map2), i5, i6, i7, j4);
    }
}
