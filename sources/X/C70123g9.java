package X;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3g9  reason: invalid class name and case insensitive filesystem */
public class C70123g9 extends C89494cI {
    public final AnonymousClass4TN A00;
    public final boolean A01;
    public final boolean A02;

    public C70123g9(AnonymousClass4TN r1, boolean z2, boolean z3) {
        this.A00 = r1;
        this.A01 = z2;
        this.A02 = z3;
    }

    public C89494cI A07(C84634Lh r7) {
        Object A002;
        if (this.A01) {
            try {
                AnonymousClass4RU r4 = new AnonymousClass4RU();
                r4.A00 = r7.A00.A00;
                r4.A03.addAll(Arrays.asList(new AnonymousClass420[]{AnonymousClass420.REQUIRE_PROPERTIES}));
                return this.A00.A00(r4.A00(), r7.A01, r7.A02).A00() == C109755Tl.A00 ? AnonymousClass5TX.A00 : AnonymousClass5TX.A01;
            } catch (C69963ft unused) {
                return AnonymousClass5TX.A00;
            }
        } else {
            try {
                AnonymousClass4TN r5 = this.A00;
                if (r5.A01) {
                    HashMap hashMap = r7.A03;
                    if (hashMap.containsKey(r5)) {
                        r5.toString();
                        A002 = hashMap.get(r5);
                    } else {
                        Object obj = r7.A02;
                        A002 = r5.A00(r7.A00, obj, obj).A00();
                        hashMap.put(r5, A002);
                    }
                } else {
                    A002 = r5.A00(r7.A00, r7.A01, r7.A02).A00();
                }
                AnonymousClass4RV r1 = r7.A00;
                if (A002 instanceof Number) {
                    return new C70173gE((CharSequence) A002.toString());
                }
                if (A002 instanceof String) {
                    return new C70133gA(A002.toString(), false);
                }
                if (A002 instanceof Boolean) {
                    return Boolean.parseBoolean(A002.toString().toString()) ? AnonymousClass5TX.A01 : AnonymousClass5TX.A00;
                }
                if (A002 instanceof OffsetDateTime) {
                    return new C70143gB(A002.toString());
                }
                if (A002 == null) {
                    return AnonymousClass5TX.A02;
                }
                if (A002 instanceof List) {
                    return new C70163gD(r1.A01.A01(List.class, A002));
                }
                if (A002 instanceof Map) {
                    return new C70163gD(r1.A01.A01(Map.class, A002));
                }
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("Could not convert ");
                AnonymousClass000.A1I(A002.getClass(), A0o);
                A0o.append(":");
                AnonymousClass000.A1I(A002, A0o);
                throw new AnonymousClass5Ar(AnonymousClass000.A0h(" to a ValueNode", A0o));
            } catch (C69963ft unused2) {
                return AnonymousClass5TX.A03;
            }
        }
    }

    public String toString() {
        if (!this.A01 || this.A02) {
            return this.A00.toString();
        }
        return C90264dr.A02("!", this.A00.toString());
    }
}
