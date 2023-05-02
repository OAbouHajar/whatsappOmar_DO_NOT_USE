package X;

import java.util.ArrayList;

/* renamed from: X.53s  reason: invalid class name and case insensitive filesystem */
public final class C1040453s implements AnonymousClass5ND {
    public static final ArrayList A03;
    public final C28371Vv A00;
    public final AnonymousClass5NC A01;
    public final String A02;

    static {
        String[] strArr = new String[2];
        strArr[0] = "admin";
        A03 = AnonymousClass3K2.A0q("superadmin", strArr, 1);
    }

    public C1040453s(C16300so r5, C28371Vv r6) {
        C28371Vv.A06(r6, "participant");
        ArrayList arrayList = A03;
        String[] strArr = new String[1];
        int A1C = AnonymousClass3K4.A1C(strArr);
        this.A02 = C32271fx.A06(r6, arrayList, strArr);
        C32261fw[] r2 = new C32261fw[3];
        r2[A1C] = AnonymousClass3K3.A0X(r5, 88);
        r2[1] = AnonymousClass3K3.A0X(r5, 87);
        this.A01 = (AnonymousClass5NC) C32271fx.A04(r6, "ParticipantWithJidLidAndDisplayName|ParticipantWithJidAndLid|ParticipantWithJid", AnonymousClass3K2.A0q(AnonymousClass3K3.A0X(r5, 89), r2, 2), new String[A1C]);
        this.A00 = r6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C1040453s.class != obj.getClass()) {
                return false;
            }
            C1040453s r5 = (C1040453s) obj;
            if (!this.A02.equals(r5.A02) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A02;
        return AnonymousClass3K2.A08(this.A01, A1Z);
    }
}
