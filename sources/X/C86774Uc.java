package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.4Uc  reason: invalid class name and case insensitive filesystem */
public final class C86774Uc {
    public final Jid A00;
    public final C28371Vv A01;
    public final String A02;

    /* JADX WARNING: type inference failed for: r12v0, types: [boolean] */
    public C86774Uc(C16300so r24, C28371Vv r25, C28371Vv r26) {
        C28371Vv r6 = r25;
        AnonymousClass3K3.A1G(r6);
        String[] strArr = new String[1];
        ? A1C = AnonymousClass3K4.A1C(strArr);
        Class<String> cls = String.class;
        Long A0X = AnonymousClass3K2.A0X();
        Long A0Y = AnonymousClass3K2.A0Y();
        C32271fx.A01((C16300so) null, r6, cls, A0X, A0Y, "result", strArr, A1C);
        String[] strArr2 = new String[1];
        strArr2[A1C] = "id";
        String[] strArr3 = new String[1];
        strArr3[A1C] = "id";
        C28371Vv r14 = r26;
        this.A02 = (String) C32271fx.A01((C16300so) null, r6, cls, A0X, A0Y, C32271fx.A01((C16300so) null, r14, cls, A0X, A0Y, (Object) null, strArr3, A1C), strArr2, true);
        String[] strArr4 = new String[1];
        strArr4[A1C] = "from";
        Class<Jid> cls2 = Jid.class;
        String[] strArr5 = new String[1];
        strArr5[A1C] = "to";
        C16300so r13 = r24;
        Long l2 = A0X;
        Long l3 = A0Y;
        this.A00 = (Jid) C32271fx.A01(r13, r6, cls2, l2, l3, C32271fx.A01(r13, r14, cls2, l2, l3, (Object) null, strArr5, A1C), strArr4, true);
        this.A01 = r6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C86774Uc.class != obj.getClass()) {
                return false;
            }
            C86774Uc r5 = (C86774Uc) obj;
            if (!this.A02.equals(r5.A02) || !this.A00.equals(r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A02;
        return AnonymousClass3K2.A08(this.A00, A1Z);
    }
}
