package X;

import com.facebook.redex.IDxCListenerShape227S0100000_2_I0;
import com.facebook.redex.IDxCObserverShape426S0100000_2_I0;
import com.facebook.redex.IDxRCallbackShape13S0300000_2_I0;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.2AF  reason: invalid class name */
public class AnonymousClass2AF extends C003401n {
    public AnonymousClass2OJ A00;
    public final AnonymousClass027 A01;
    public final C16040sK A02;
    public final C33391iV A03;
    public final C211212w A04;
    public final AnonymousClass1L5 A05;
    public final C85914Qm A06;
    public final C18260wP A07;
    public final C16000sG A08;
    public final C33481ie A09;
    public final C17140ub A0A;
    public final C16080sP A0B;
    public final C16070sO A0C;
    public final AnonymousClass28S A0D;
    public final AnonymousClass18O A0E;
    public final AnonymousClass1VD A0F;
    public final AnonymousClass18R A0G;
    public final C16050sL A0H;
    public final AnonymousClass2OJ A0I;
    public final AnonymousClass2OJ A0J;
    public final AnonymousClass1WA A0K;
    public final HashMap A0L = new HashMap();
    public final List A0M;

    public AnonymousClass2AF(C16040sK r3, C211212w r4, AnonymousClass1L5 r5, C85914Qm r6, C18260wP r7, C16000sG r8, C17140ub r9, C16080sP r10, C16070sO r11, AnonymousClass18O r12, AnonymousClass18R r13, C16050sL r14, C16320sq r15) {
        ArrayList arrayList = new ArrayList();
        this.A0M = arrayList;
        this.A0I = new AnonymousClass2OJ(C34641kb.copyOf((Collection) arrayList));
        this.A01 = new AnonymousClass027();
        this.A0J = new AnonymousClass2OJ(C73483oC.A00);
        this.A09 = new IDxCObserverShape68S0100000_2_I0(this, 7);
        this.A0F = new IDxPObserverShape81S0100000_2_I0(this, 6);
        this.A0D = new IDxCListenerShape227S0100000_2_I0(this, 1);
        this.A03 = new IDxCObserverShape426S0100000_2_I0(this, 0);
        this.A04 = r4;
        this.A02 = r3;
        this.A0B = r10;
        this.A08 = r8;
        this.A0A = r9;
        this.A0E = r12;
        this.A0C = r11;
        this.A07 = r7;
        this.A05 = r5;
        this.A0G = r13;
        this.A06 = r6;
        this.A0H = r14;
        this.A0K = new AnonymousClass1WA(r15, false);
    }

    public static /* synthetic */ void A01(AnonymousClass2AF r4) {
        List list = r4.A0M;
        Collections.sort(list, new AnonymousClass2Uq(r4.A02, r4.A0B));
        r4.A0I.A09(C34641kb.copyOf((Collection) list));
    }

    public static /* synthetic */ boolean A02(AnonymousClass2AF r14, C15830rv r15) {
        C16050sL A032;
        C30661ck A052;
        UserJid of = UserJid.of(r15);
        if (r15 == null || of == null) {
            return false;
        }
        HashMap hashMap = r14.A0L;
        C86954Uu r4 = (C86954Uu) hashMap.get(r15.getRawString());
        if (r4 == null) {
            return false;
        }
        AnonymousClass1L5 r8 = r14.A05;
        C16050sL r1 = r14.A0H;
        C30661ck r7 = (C30661ck) r8.A00(r1).get(of);
        if (r7 != null) {
            try {
                hashMap.remove(of.getRawString());
                List list = r14.A0M;
                list.remove(r4);
                C16010sH A082 = r14.A08.A08(of);
                C16040sK r2 = r14.A02;
                String A002 = r2.A0I(of) ? r14.A04.A00() : A082 == null ? null : A082.A0T;
                C39461sW A012 = r8.A03.A01(r1);
                Integer valueOf = (A012 == null || (A032 = C16050sL.A03(A012.A02)) == null || (A052 = r8.A05.A07.A04(A032).A05(of)) == null) ? null : Integer.valueOf(A052.A01);
                if (valueOf == null) {
                    valueOf = -1;
                }
                C86954Uu r82 = new C86954Uu(A082, of, A002, r7.A01, valueOf.intValue());
                C86954Uu r3 = r82;
                list.add(r82);
                hashMap.put(r15.getRawString(), r82);
                if (!r2.A0I(r4.A03)) {
                    return true;
                }
                r14.A01.A09(r82);
                return true;
            } catch (Throwable th) {
                if (r14.A02.A0I(r4.A03)) {
                    r14.A01.A09((Object) null);
                }
                throw th;
            }
        } else if (!r14.A02.A0I(r4.A03)) {
            return false;
        } else {
            r14.A01.A09((Object) null);
            return false;
        }
    }

    public void A04() {
        C211212w r0 = this.A04;
        r0.A05.A03(this.A03);
        this.A0A.A03(this.A09);
        this.A0G.A03(this.A0F);
        AnonymousClass18O r02 = this.A0E;
        r02.A00.remove(this.A0D);
    }

    public final AnonymousClass22M A05(UserJid userJid) {
        this.A0J.A0B(C73493oD.A00);
        C85914Qm r4 = this.A06;
        C16050sL r3 = this.A0H;
        C63433Id r2 = new C63433Id(this, userJid);
        C18450wi.A0H(r3, 0);
        C18450wi.A0H(userJid, 1);
        C17190ug r5 = r4.A01;
        String A022 = r5.A02();
        C18450wi.A0B(A022);
        List singletonList = Collections.singletonList(userJid);
        C18450wi.A0B(singletonList);
        AnonymousClass4WK r1 = new AnonymousClass4WK(r3, A022, singletonList);
        r5.A0A(new IDxRCallbackShape13S0300000_2_I0(r4, r1, r2, 0), ((C83094Fi) r1.A03.getValue()).A00, A022, 347, 32000);
        return null;
    }

    public final void A06(Map map) {
        C16050sL A032;
        HashMap hashMap = this.A0L;
        hashMap.clear();
        AnonymousClass1L5 r6 = this.A05;
        C16050sL r4 = this.A0H;
        Collection<C30661ck> values = map.values();
        HashMap hashMap2 = new HashMap();
        C39461sW A012 = r6.A03.A01(r4);
        if (!(A012 == null || (A032 = C16050sL.A03(A012.A02)) == null)) {
            C30361cE A042 = r6.A05.A07.A04(A032);
            for (C30661ck r0 : values) {
                UserJid userJid = r0.A03;
                C30661ck A052 = A042.A05(userJid);
                if (A052 != null) {
                    hashMap2.put(userJid, Integer.valueOf(A052.A01));
                }
            }
        }
        HashSet hashSet = new HashSet(map.size());
        for (C30661ck r62 : map.values()) {
            C16000sG r02 = this.A08;
            UserJid userJid2 = r62.A03;
            C16010sH A082 = r02.A08(userJid2);
            String A002 = this.A02.A0I(userJid2) ? this.A04.A00() : A082 == null ? "" : A082.A0T;
            Object obj = hashMap2.get(userJid2);
            if (obj == null) {
                obj = -1;
            }
            C86954Uu r8 = new C86954Uu(A082, userJid2, A002, r62.A01, ((Number) obj).intValue());
            hashMap.put(userJid2.getRawString(), r8);
            hashSet.add(r8);
        }
        List list = this.A0M;
        list.retainAll(hashSet);
        hashSet.removeAll(list);
        list.addAll(hashSet);
        C16040sK r03 = this.A02;
        r03.A0B();
        AnonymousClass1ZT r04 = r03.A05;
        this.A01.A09(hashMap.get(r04 != null ? r04.getRawString() : null));
        this.A00.A09(new AnonymousClass4KN(this, this.A0C.A0A(r4) ? Integer.valueOf(list.size()) : null, 1));
    }
}
