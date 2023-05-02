package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.1J2  reason: invalid class name */
public class AnonymousClass1J2 implements C1221268j {
    public Map A00;
    public final C14870pt A01;
    public final AnonymousClass16I A02;
    public final AnonymousClass013 A03;
    public final C16320sq A04;
    public final C20140zZ A05;
    public final C18440wh A06;
    public final C19960zH A07;

    public AnonymousClass1J2(C14870pt r2, AnonymousClass16I r3, AnonymousClass013 r4, C16320sq r5, C20140zZ r6, C18440wh r7, C19960zH r8) {
        C18450wi.A0H(r6, 1);
        C18450wi.A0H(r2, 2);
        C18450wi.A0H(r5, 3);
        C18450wi.A0H(r4, 4);
        C18450wi.A0H(r3, 5);
        C18450wi.A0H(r7, 6);
        this.A05 = r6;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A06 = r7;
        this.A07 = r8;
    }

    public static /* synthetic */ void A00(C439922i r4, C35001lD r5, AnonymousClass1J2 r6, C118755vC r7, String str) {
        String A002 = C440422n.A00(r4, r6.A06);
        r6.A07.A0B(new C101974yC(r5, r6, r7, str), r4.A0A, A002);
    }

    public C439922i A01(String str) {
        List list;
        if (!(this instanceof AnonymousClass1J3)) {
            return this.A02.A01(str);
        }
        Map map = this.A00;
        if (map != null) {
            Object obj = map.get("flow_version_id");
            if (obj != null) {
                long parseLong = Long.parseLong((String) obj);
                AnonymousClass16I r7 = this.A02;
                C440322m A032 = r7.A03();
                if (A032 == null) {
                    list = C440222l.A00;
                } else {
                    List list2 = A032.A00;
                    ArrayList arrayList = new ArrayList();
                    for (Object next : list2) {
                        C439922i r3 = (C439922i) next;
                        Long l2 = r3.A02;
                        if (l2 != null && l2.longValue() == parseLong && C18450wi.A0R(r3.A08, "android")) {
                            arrayList.add(next);
                        }
                    }
                    list = arrayList;
                }
                return r7.A02(list);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        C18450wi.A0O("paramsMap");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final C16320sq A02() {
        return this.A04;
    }

    public final C20140zZ A03() {
        return this.A05;
    }

    public final C19960zH A04() {
        return this.A07;
    }

    public String A05() {
        return this instanceof AnonymousClass1J3 ? "Extensions bloks layout was not loaded" : "Commerce bloks layout was not loaded";
    }

    public String A06(String str) {
        StringBuilder sb;
        if (this instanceof AnonymousClass1J3) {
            Map map = this.A00;
            if (map != null) {
                Object obj = map.get("flow_version_id");
                if (obj != null) {
                    long parseLong = Long.parseLong((String) obj);
                    sb = new StringBuilder();
                    sb.append(parseLong);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                C18450wi.A0O("paramsMap");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
        } else {
            sb = new StringBuilder();
            sb.append(str);
        }
        sb.append(":046877784a36a1a3e5fbca72104f0172b903681b904c7b907b2e2fab4cad66cf:");
        sb.append(AnonymousClass013.A00(this.A03.A00));
        return sb.toString();
    }

    public void Aai(C35001lD r11, C118755vC r12, String str, String str2, String str3) {
        String A0A;
        String str4 = str;
        C18450wi.A0H(str, 0);
        this.A00 = C438921y.A01(str2);
        C35001lD r6 = r11;
        C118755vC r8 = r12;
        if (r11 != null) {
            String str5 = (String) this.A05.A01(r11.A01, A06(str));
            if (str5 != null) {
                r12.A01(str5);
                return;
            }
        }
        C439922i A012 = A01(str);
        if (A012 != null) {
            C19960zH r4 = this.A07;
            C18440wh r2 = this.A06;
            String A002 = C440422n.A00(A012, r2);
            C18450wi.A0H(A002, 0);
            File A003 = r4.A00(C18450wi.A06("commerce_flow_", A002));
            if (A003 != null) {
                File[] listFiles = A003.listFiles();
                if (listFiles == null) {
                    listFiles = new File[0];
                }
                if (!(listFiles.length == 0 || (A0A = r4.A0A(C440422n.A00(A012, r2))) == null)) {
                    r12.A01(A0A);
                    if (r11 != null) {
                        this.A05.A03(A0A, r11.A01, A06(str), r11.A00, r11.A02);
                        return;
                    }
                    return;
                }
            }
            this.A01.Acq(new AnonymousClass56D(A012, r6, this, r8, str4));
            return;
        }
        AnonymousClass16I r1 = this.A02;
        r1.A01 = new C440122k(r11, this, r12, str);
        r1.A04();
    }
}
