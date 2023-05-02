package X;

import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.List;

/* renamed from: X.53c  reason: invalid class name and case insensitive filesystem */
public final class C1038853c implements AnonymousClass5NA {
    public final C28371Vv A00;
    public final AnonymousClass4V4 A01;
    public final String A02;
    public final List A03;

    /* JADX WARNING: type inference failed for: r11v0, types: [int, boolean] */
    public C1038853c(C16300so r21, C28371Vv r22) {
        C28371Vv r5 = r22;
        C28371Vv.A06(r5, "state");
        String[] strArr = new String[1];
        ? A1C = AnonymousClass3K4.A1C(strArr);
        Class<String> cls = String.class;
        Long A0X = AnonymousClass3K2.A0X();
        Long A0Y = AnonymousClass3K2.A0Y();
        C32271fx.A01((C16300so) null, r5, cls, A0X, A0Y, "choice", strArr, A1C);
        String[] strArr2 = new String[1];
        strArr2[A1C] = CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID;
        this.A02 = (String) C32271fx.A01((C16300so) null, r5, cls, A0X, A0Y, (Object) null, strArr2, A1C);
        C16300so r2 = r21;
        this.A01 = (AnonymousClass4V4) AnonymousClass3K2.A0d(r2, r5, 17, A1C);
        String[] strArr3 = new String[1];
        strArr3[A1C] = "choice";
        this.A03 = C32271fx.A07(r5, AnonymousClass3K3.A0X(r2, 18), strArr3, 0, Long.MAX_VALUE);
        this.A00 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C1038853c.class != obj.getClass()) {
                return false;
            }
            C1038853c r5 = (C1038853c) obj;
            if (!this.A02.equals(r5.A02) || !this.A03.equals(r5.A03) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.A02;
        objArr[1] = this.A03;
        return AnonymousClass000.A0F(this.A01, objArr, 2);
    }
}
