package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.5io  reason: invalid class name and case insensitive filesystem */
public final class C112635io extends AnonymousClass1II {
    public final AnonymousClass174 A00;
    public final C1203561i A01;
    public final C1202861b A02 = new C1202861b();
    public final C1203061d A03 = new C1203061d();
    public final C1203161e A04 = new C1203161e();
    public final C1203261f A05 = new C1203261f();
    public final C1203661j A06;
    public final C1203461h A07;
    public final C1203761k A08;
    public final Map A09;
    public final Map A0A;

    public C112635io(C16000sG r16, C16080sP r17, AnonymousClass152 r18, C16980tz r19, AnonymousClass013 r20, C17630vO r21, C1204661t r22, C18300wT r23, AnonymousClass174 r24, C18290wS r25, C18280wR r26, Map map, Map map2) {
        C16000sG r5 = r16;
        C16980tz r10 = r19;
        AnonymousClass013 r11 = r20;
        C18280wR r9 = r26;
        C16080sP r2 = r17;
        C18450wi.A0L(r10, r5, r2, r11, r9);
        C18290wS r8 = r25;
        C18450wi.A0H(r8, 6);
        C18300wT r12 = r23;
        C18450wi.A0H(r12, 7);
        C1204661t r7 = r22;
        C18450wi.A0H(r7, 9);
        AnonymousClass174 r13 = r24;
        C18450wi.A0H(r13, 10);
        AnonymousClass152 r1 = r18;
        C18450wi.A0H(r1, 11);
        Map map3 = map;
        C18450wi.A0H(map3, 12);
        Map map4 = map2;
        C18450wi.A0H(map4, 13);
        this.A00 = r13;
        this.A0A = map3;
        this.A09 = map4;
        this.A08 = new C1203761k(r5, r21, r7, r8, r9);
        this.A06 = new C1203661j(r10, r11, r12, r13, r8);
        this.A07 = new C1203461h(r11);
        this.A01 = new C1203561i(r2, r1, r10, r8);
    }

    public /* bridge */ /* synthetic */ AnonymousClass1IH A00() {
        return this.A08;
    }

    public Object A01(C88114Zy r4, Object obj, Map map) {
        C88114Zy[] r0;
        String str;
        AnonymousClass1IH r02;
        if (r4 == null || (r0 = r4.A02) == null || r0.length == 0) {
            return obj;
        }
        if (obj instanceof C30671cl) {
            r02 = this.A06;
        } else if (obj instanceof C35431lv) {
            r02 = this.A07;
        } else if (obj instanceof AnonymousClass175) {
            r02 = this.A04;
        } else {
            if (obj instanceof C39901tF) {
                Map map2 = this.A0A;
                C30681cm A012 = this.A00.A01();
                r02 = (AnonymousClass1IH) map2.get(A012 == null ? null : A012.A03);
                if (r02 == null) {
                    str = "PaymentClientDaslQueryResolverRegistry/resolveObject PaymentMethodCountryData country not supported";
                }
            } else if (obj instanceof C16010sH) {
                r02 = this.A01;
            } else if (obj instanceof C16830ti) {
                r02 = this.A03;
            } else if (obj instanceof C35511m3) {
                Map map3 = this.A09;
                C30681cm A013 = this.A00.A01();
                r02 = (AnonymousClass1IH) map3.get(A013 == null ? null : A013.A03);
                if (r02 == null) {
                    str = "PaymentClientDaslQueryResolverRegistry/resolveObject PaymentContactInfoCountryData country not supported";
                }
            } else if (obj instanceof C118865vN) {
                r02 = this.A02;
            } else if (obj instanceof C117015sJ) {
                r02 = this.A05;
            } else {
                str = "PaymentClientDaslQueryResolverRegistry/resolveObject Object type not supported";
            }
            Log.e(str);
            return null;
        }
        return A02(r4, r02, obj, map);
    }
}
