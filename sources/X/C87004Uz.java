package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.4Uz  reason: invalid class name and case insensitive filesystem */
public final class C87004Uz {
    public final Jid A00;
    public final C28371Vv A01;
    public final Long A02;
    public final String A03;
    public final String A04;

    /* JADX WARNING: type inference failed for: r12v0, types: [boolean] */
    public C87004Uz(C16300so r25, C28371Vv r26, C28371Vv r27) {
        C28371Vv r6 = r26;
        AnonymousClass3K3.A1G(r6);
        String[] strArr = new String[1];
        ? A1C = AnonymousClass3K4.A1C(strArr);
        Class<String> cls = String.class;
        Long A0X = AnonymousClass3K2.A0X();
        Long A0Y = AnonymousClass3K2.A0Y();
        C32271fx.A01((C16300so) null, r6, cls, A0X, A0Y, "error", strArr, A1C);
        String[] strArr2 = new String[1];
        strArr2[A1C] = "from";
        Class<Jid> cls2 = Jid.class;
        String[] strArr3 = new String[1];
        strArr3[A1C] = "to";
        C16300so r13 = r25;
        C28371Vv r14 = r27;
        this.A00 = (Jid) C32271fx.A01(r13, r6, cls2, A0X, A0Y, C32271fx.A01(r13, r14, cls2, A0X, A0Y, (Object) null, strArr3, A1C), strArr2, true);
        String[] strArr4 = new String[1];
        strArr4[A1C] = "id";
        String[] strArr5 = new String[1];
        strArr5[A1C] = "id";
        Class<String> cls3 = cls;
        Long l2 = A0X;
        Long l3 = A0Y;
        Object A012 = C32271fx.A01((C16300so) null, r14, cls3, l2, l3, (Object) null, strArr5, A1C);
        C28371Vv r142 = r6;
        this.A04 = (String) C32271fx.A01((C16300so) null, r142, cls3, l2, l3, A012, strArr4, true);
        String[] strArr6 = new String[2];
        strArr6[A1C] = "error";
        strArr6[1] = "text";
        Long A0a = AnonymousClass3K2.A0a();
        this.A03 = (String) C32271fx.A01((C16300so) null, r142, cls3, A0a, l3, (Object) null, strArr6, A1C);
        String[] strArr7 = new String[2];
        strArr7[A1C] = "error";
        strArr7[1] = "code";
        this.A02 = (Long) C32271fx.A01((C16300so) null, r6, Long.class, A0a, A0Y, (Object) null, strArr7, A1C);
        this.A01 = r6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C87004Uz.class != obj.getClass()) {
                return false;
            }
            C87004Uz r5 = (C87004Uz) obj;
            if (!this.A00.equals(r5.A00) || !this.A04.equals(r5.A04) || !this.A03.equals(r5.A03) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A00;
        objArr[1] = this.A04;
        objArr[2] = this.A03;
        return AnonymousClass000.A0F(this.A02, objArr, 3);
    }
}
