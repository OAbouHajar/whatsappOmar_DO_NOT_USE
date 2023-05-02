package X;

/* renamed from: X.3v1  reason: invalid class name and case insensitive filesystem */
public class C76973v1 extends C30831d2 {
    public final int A00;

    public C76973v1(C16300so r14, C16440t3 r15, C16490t9 r16, C207811o r17, Integer num, String str, String str2, long j2, long j3) {
        super(r14, r15, r16, r17, num, str, 3, j2, j3);
        this.A00 = A00(str2);
    }

    public static int A00(String str) {
        if ("offer".equals(str)) {
            return 0;
        }
        if ("accept".equals(str)) {
            return 1;
        }
        if ("reject".equals(str)) {
            return 2;
        }
        if ("video".equals(str)) {
            return 3;
        }
        if ("terminate".equals(str)) {
            return 4;
        }
        if ("enc_rekey".equals(str)) {
            return 5;
        }
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(str, AnonymousClass000.A0r("CallStanza/getCallStanzaType not expected type ")));
    }

    public C16470t7 A02(int i2, long j2) {
        C75013rT r2 = new C75013rT();
        r2.A02 = Long.valueOf(j2);
        r2.A00 = Integer.valueOf(i2);
        Integer num = this.A0A;
        if (num != null) {
            r2.A03 = Long.valueOf((long) num.intValue());
        }
        r2.A01 = Integer.valueOf(this.A00);
        return r2;
    }

    public String A03() {
        return "CallStanza";
    }

    public void A04(C75843so r2) {
        r2.A03 = C13680ns.A0a();
        r2.A00 = Integer.valueOf(this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(super.toString());
        A0o.append("; type = ");
        return AnonymousClass000.A0l(A0o, this.A00);
    }
}
