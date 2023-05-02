package X;

import com.facebook.redex.IDxRCallbackShape13S0300000_2_I0;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1L5  reason: invalid class name */
public class AnonymousClass1L5 {
    public final C16300so A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C17230uk A03;
    public final C15810rt A04;
    public final C16070sO A05;
    public final C217115d A06;
    public final AnonymousClass18R A07;
    public final C17190ug A08;
    public final C16320sq A09;

    public AnonymousClass1L5(C16300so r1, C14870pt r2, C16040sK r3, C17230uk r4, C15810rt r5, C16070sO r6, C217115d r7, AnonymousClass18R r8, C17190ug r9, C16320sq r10) {
        this.A01 = r2;
        this.A09 = r10;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
        this.A08 = r9;
        this.A03 = r4;
        this.A05 = r6;
        this.A07 = r8;
        this.A06 = r7;
    }

    public Map A00(C16050sL r9) {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        C16070sO r6 = this.A05;
        if (r6.A0A(r9)) {
            C217115d r3 = this.A06;
            synchronized (r3) {
                List A002 = r3.A00(r9);
                arrayList = A002.size() == 0 ? new ArrayList() : new ArrayList(r3.A00.A09(UserJid.class, A002).values());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                UserJid userJid = (UserJid) it.next();
                hashMap.put(userJid, new C30661ck(userJid, new HashSet(), 0, false));
            }
        }
        C30361cE A042 = r6.A07.A04(r9);
        C95014lq r7 = new C95014lq();
        C30361cE r5 = new C30361cE(A042.A06);
        HashSet hashSet = new HashSet();
        C28031Ub it2 = A042.A04().iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (r7.test(next)) {
                hashSet.add(next);
            }
        }
        r5.A0J(hashSet);
        C28031Ub it3 = r5.A04().iterator();
        while (it3.hasNext()) {
            C30661ck r1 = (C30661ck) it3.next();
            hashMap.put(r1.A03, r1);
        }
        if (r6.A0A(r9)) {
            return hashMap;
        }
        C16040sK r62 = this.A02;
        r62.A0B();
        AnonymousClass1ZT r32 = r62.A05;
        if (r32 != null && !hashMap.containsKey(r32)) {
            hashMap.put(r32, new C30661ck(r32, new HashSet(), 0, false));
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            Object key = entry.getKey();
            C30661ck r2 = (C30661ck) entry.getValue();
            if (r2 != null) {
                boolean z2 = false;
                if (r2.A01 != 0) {
                    z2 = true;
                }
                if (z2 || r62.A0I(r2.A03)) {
                    hashMap2.put(key, r2);
                }
            }
        }
        return hashMap2;
    }

    public Set A01(C16050sL r4) {
        C39461sW A012;
        C16050sL A032;
        HashSet hashSet = new HashSet();
        if (this.A04.A02(r4) == 1) {
            hashSet.add(r4);
            if (!(!this.A05.A0A(r4) || (A012 = this.A03.A01(r4)) == null || (A032 = C16050sL.A03(A012.A02)) == null)) {
                hashSet.add(A032);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public void A02(C16050sL r12) {
        if (this.A05.A0A(r12)) {
            C87964Zj r3 = new C87964Zj(this.A00, this.A08);
            AnonymousClass4HV r2 = new AnonymousClass4HV(this, r12);
            C18450wi.A0H(r12, 0);
            C17190ug r4 = r3.A01;
            String A022 = r4.A02();
            C18450wi.A0B(A022);
            C83054Fe r1 = new C83054Fe(new AnonymousClass2BK(r12, new AnonymousClass2BJ(A022)));
            r4.A0A(new IDxRCallbackShape13S0300000_2_I0(r3, r1, r2, 1), r1.A00, A022, 349, C87964Zj.A02);
        }
    }
}
