package X;

import java.util.List;
import org.apache.commons.io.FileUtils;

/* renamed from: X.4Uy  reason: invalid class name and case insensitive filesystem */
public final class C86994Uy {
    public final C16050sL A00;
    public final C28371Vv A01;
    public final String A02;
    public final String A03;
    public final List A04;

    /* JADX WARNING: type inference failed for: r16v0, types: [boolean] */
    public C86994Uy(C16300so r26, C28371Vv r27, C83094Fi r28) {
        C28371Vv r10 = r27;
        AnonymousClass3K3.A1G(r10);
        C28371Vv r4 = r28.A00;
        String[] strArr = new String[1];
        ? A1C = AnonymousClass3K4.A1C(strArr);
        Class<String> cls = String.class;
        Long A0X = AnonymousClass3K2.A0X();
        Long A0Y = AnonymousClass3K2.A0Y();
        C32271fx.A01((C16300so) null, r10, cls, A0X, A0Y, "result", strArr, A1C);
        String[] strArr2 = new String[2];
        strArr2[A1C] = "remove";
        strArr2[1] = "linked_groups";
        this.A03 = (String) C32271fx.A00((C16300so) null, r10, cls, A0X, A0Y, "true", strArr2, A1C);
        String[] strArr3 = new String[1];
        strArr3[A1C] = "from";
        Class<C16050sL> cls2 = C16050sL.class;
        String[] strArr4 = new String[1];
        strArr4[A1C] = "to";
        C16300so r3 = r26;
        Long l2 = A0X;
        Long l3 = A0Y;
        C16300so r17 = r3;
        this.A00 = (C16050sL) C32271fx.A01(r17, r10, cls2, l2, l3, C32271fx.A01(r17, r4, cls2, l2, l3, (Object) null, strArr4, A1C), strArr3, true);
        String[] strArr5 = new String[1];
        strArr5[A1C] = "id";
        String[] strArr6 = new String[1];
        strArr6[A1C] = "id";
        Class<String> cls3 = cls;
        this.A02 = (String) C32271fx.A01((C16300so) null, r10, cls3, l2, l3, C32271fx.A01((C16300so) null, r4, cls3, l2, l3, (Object) null, strArr6, A1C), strArr5, true);
        String[] strArr7 = new String[2];
        strArr7[A1C] = "remove";
        strArr7[1] = "participant";
        this.A04 = C32271fx.A07(r10, AnonymousClass3K3.A0X(r3, 137), strArr7, 1, FileUtils.ONE_KB);
        this.A01 = r10;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C86994Uy.class != obj.getClass()) {
                return false;
            }
            C86994Uy r5 = (C86994Uy) obj;
            if (!this.A00.equals(r5.A00) || !this.A02.equals(r5.A02) || !C34901l3.A00(this.A03, r5.A03) || !this.A04.equals(r5.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A00;
        objArr[1] = this.A02;
        objArr[2] = this.A03;
        return AnonymousClass000.A0F(this.A04, objArr, 3);
    }
}
