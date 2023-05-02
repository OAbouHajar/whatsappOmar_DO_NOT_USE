package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.61k  reason: invalid class name and case insensitive filesystem */
public final class C1203761k implements AnonymousClass1IH {
    public final C16000sG A00;
    public final C17630vO A01;
    public final C1204661t A02;
    public final C18290wS A03;
    public final C18280wR A04;

    public C1203761k(C16000sG r1, C17630vO r2, C1204661t r3, C18290wS r4, C18280wR r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public Class A8z() {
        return C114995ow.class;
    }

    public /* bridge */ /* synthetic */ Object AcV(Enum enumR, Object obj, Map map) {
        Number number;
        long A012;
        C28411Vz r3;
        String obj2;
        String str;
        String str2;
        C30671cl r4;
        C114995ow r7 = (C114995ow) enumR;
        C18450wi.A0H(r7, 1);
        switch (C110115dX.A01(r7, C115465pn.A00)) {
            case 1:
                Object obj3 = map == null ? null : map.get("scenario");
                if (!(obj3 instanceof String)) {
                    obj3 = null;
                }
                Object obj4 = map == null ? null : map.get("is_debit");
                Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
                if (obj3 == null || bool == null) {
                    return null;
                }
                boolean equals = "P2P".equals(obj3);
                if (equals && bool.booleanValue()) {
                    return C110115dX.A0H(this.A03).A06();
                }
                if (!equals || bool.booleanValue()) {
                    boolean equals2 = "P2M".equals(obj3);
                    if (equals2 && bool.booleanValue()) {
                        Iterator it = C110105dW.A0i(this.A03).iterator();
                        while (it.hasNext()) {
                            C30671cl A0F = C110115dX.A0F(it);
                            if (A0F.A03 == 2) {
                                return A0F;
                            }
                        }
                        return null;
                    } else if (!equals2 || bool.booleanValue()) {
                        return null;
                    } else {
                        AnonymousClass160 A0H = C110115dX.A0H(this.A03);
                        synchronized (A0H) {
                            Iterator it2 = A0H.A0B().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    r4 = C110115dX.A0F(it2);
                                    if (r4.A02 == 2) {
                                    }
                                } else {
                                    r4 = null;
                                }
                            }
                        }
                        return r4;
                    }
                } else {
                    Iterator it3 = C110105dW.A0i(this.A03).iterator();
                    while (it3.hasNext()) {
                        C30671cl A0F2 = C110115dX.A0F(it3);
                        if (A0F2.A00 == 2) {
                            return A0F2;
                        }
                    }
                    return null;
                }
            case 2:
                Object obj5 = map == null ? null : map.get("credential_id");
                if (!(obj5 instanceof String) || (str2 = (String) obj5) == null) {
                    return null;
                }
                return AnonymousClass160.A00(str2, C110105dW.A0i(this.A03));
            case 3:
                return C110105dW.A0i(this.A03);
            case 4:
                Object obj6 = map == null ? null : map.get("jid");
                UserJid nullable = UserJid.getNullable(obj6 instanceof String ? (String) obj6 : null);
                if (nullable != null) {
                    return this.A00.A0A(nullable);
                }
                return null;
            case 5:
                Object obj7 = map == null ? null : map.get("message_id");
                if (!(obj7 instanceof String) || (str = (String) obj7) == null) {
                    return null;
                }
                return this.A01.A00(str);
            case 6:
                String A013 = this.A04.A01();
                C18450wi.A0B(A013);
                return new C118865vN(A013);
            case 7:
                C18290wS r0 = this.A03;
                r0.A06();
                return r0.A0A;
            case 8:
                Object obj8 = map == null ? null : map.get("code");
                if (!(obj8 instanceof Integer) || obj8 == null || (obj2 = obj8.toString()) == null) {
                    return null;
                }
                C1204661t r1 = this.A02;
                if (r1.A02()) {
                    return r1.A00.get(obj2);
                }
                return null;
            case 9:
                Object obj9 = map == null ? null : map.get("currency_code");
                if (!(obj9 instanceof String)) {
                    obj9 = null;
                }
                Object obj10 = map == null ? null : map.get("offset");
                if (!(obj10 instanceof Integer) || (number = (Number) obj10) == null) {
                    return null;
                }
                int intValue = number.intValue();
                Object obj11 = map == null ? null : map.get("value");
                if (obj11 instanceof Integer) {
                    A012 = (long) AnonymousClass000.A0D(obj11);
                } else if (!(obj11 instanceof Long)) {
                    return null;
                } else {
                    A012 = C13700nu.A01(obj11);
                }
                if (C18450wi.A0R(obj9, "INR")) {
                    r3 = C35481m0.A05;
                } else if (!C18450wi.A0R(obj9, "BRL")) {
                    return null;
                } else {
                    r3 = C35481m0.A04;
                }
                return intValue <= 0 ? new C35431lv(r3, 1, A012) : new C35431lv(r3, intValue, A012);
            default:
                throw new AnonymousClass2Xe();
        }
    }
}
