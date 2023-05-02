package X;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.5wb  reason: invalid class name and case insensitive filesystem */
public final class C119135wb {
    public static final ArrayList A06 = C110105dW.A0h();
    public final C28371Vv A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C119135wb(C28371Vv r22) {
        C28371Vv r6 = r22;
        C28371Vv.A06(r6, "bank");
        Class<String> cls = String.class;
        C32271fx.A01((C16300so) null, r6, cls, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), "BR", new String[]{"country"}, false);
        Long A0a = AnonymousClass3K2.A0a();
        C28371Vv r14 = r6;
        this.A01 = (Long) C32271fx.A01((C16300so) null, r14, Long.class, A0a, 100L, (Object) null, new String[]{"bank-code"}, false);
        Long l2 = A0a;
        this.A03 = (String) C32271fx.A01((C16300so) null, r6, cls, l2, 1000L, (Object) null, new String[]{"bank-name"}, false);
        this.A05 = (String) C32271fx.A01((C16300so) null, r6, cls, l2, 1000L, (Object) null, new String[]{"short-name"}, false);
        this.A04 = (String) C32271fx.A01((C16300so) null, r6, cls, l2, Long.valueOf(AnonymousClass1NO.A0L), (Object) null, new String[]{"image"}, false);
        this.A02 = C32271fx.A06(r6, A06, new String[]{"accept-savings"});
        this.A00 = r6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C119135wb.class != obj.getClass()) {
                return false;
            }
            C119135wb r5 = (C119135wb) obj;
            if (!this.A02.equals(r5.A02) || !this.A01.equals(r5.A01) || !this.A03.equals(r5.A03) || !this.A05.equals(r5.A05) || !this.A04.equals(r5.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A01, this.A03, this.A05, this.A04});
    }
}
