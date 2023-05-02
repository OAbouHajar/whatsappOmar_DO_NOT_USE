package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.5oK  reason: invalid class name and case insensitive filesystem */
public class C114685oK extends C20150za {
    public C17120uZ A00;
    public final AnonymousClass1IZ A01;
    public final AnonymousClass14L A02;
    public final C16320sq A03;
    public final C20140zZ A04;
    public final C116355rF A05;
    public final C118285uR A06;
    public final AnonymousClass5wM A07;

    public C114685oK(AnonymousClass1IZ r1, AnonymousClass14L r2, C16320sq r3, C20140zZ r4, C116355rF r5, C118285uR r6, AnonymousClass5wM r7, Set set) {
        super(set);
        this.A04 = r4;
        this.A03 = r3;
        this.A01 = r1;
        this.A07 = r7;
        this.A02 = r2;
        this.A05 = r5;
        this.A06 = r6;
    }

    public static /* synthetic */ void A00(C114685oK r4, int i2) {
        HashMap A0x = AnonymousClass000.A0x();
        A0x.put("error_code", "-1");
        r4.A07.A01(A0x, AnonymousClass5wM.A00(Integer.valueOf(i2)), "prefetchResponse");
    }

    public void A02(AnonymousClass2WZ r3, AnonymousClass5SD r4, String str) {
        if (r3.A00 != 5) {
            r4.AWO(r3);
            return;
        }
        throw AnonymousClass000.A0V("Successful responses should not be processed as errors");
    }

    public void A03(C35001lD r13, AnonymousClass5SD r14, Boolean bool, String str, String str2, String str3, boolean z2) {
        String str4 = str;
        AnonymousClass00B.A06(str4);
        AnonymousClass2WZ r3 = new AnonymousClass2WZ();
        Iterator A0y = AnonymousClass000.A0y(this.A05.A00);
        while (true) {
            C35001lD r4 = r13;
            AnonymousClass5SD r5 = r14;
            String str5 = str2;
            String str6 = str3;
            boolean z3 = z2;
            if (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                if (((Pattern) A0z.getKey()).matcher(str4).matches() && ((C116875s5) A0z.getValue()).A01.AIl(str4, str5)) {
                    this.A03.Acl(new C1217766u(r3, r4, r5, this, ((C116875s5) A0z.getValue()).A00, str4, str5, str6, z3));
                    return;
                }
            } else {
                A04(new AnonymousClass4UI(), r3, r13, r14, bool, str4, str5, str6, z3);
                return;
            }
        }
    }

    public final void A04(AnonymousClass4UI r19, AnonymousClass2WZ r20, C35001lD r21, AnonymousClass5SD r22, Boolean bool, String str, String str2, String str3, boolean z2) {
        AnonymousClass1KD A6y;
        C118285uR r0 = this.A06;
        String str4 = str;
        C116895s7 A002 = r0.A00(str4);
        C116885s6 r1 = A002.A01;
        AnonymousClass144 r2 = r1.A01;
        String str5 = str2;
        if (r2 == null) {
            C116365rG r02 = A002.A00;
            A6y = r02.A00.A7Y((String) null, str4, str5, (Map) null, r1.A00);
        } else {
            A6y = r0.A00.A6y(r2, new AnonymousClass60I(A002, str4, str5));
        }
        this.A03.Acl(new C1217966w(r19, A6y, r20, r21, r22, this, bool, str4, str5, str3, A6y.hashCode(), z2));
    }
}
