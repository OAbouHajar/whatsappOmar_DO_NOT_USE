package X;

import java.util.ArrayList;

/* renamed from: X.53Z  reason: invalid class name */
public final class AnonymousClass53Z implements AnonymousClass5N9 {
    public static final ArrayList A09;
    public static final ArrayList A0A;
    public static final ArrayList A0B;
    public static final ArrayList A0C;
    public final C28371Vv A00;
    public final C89044bV A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    static {
        String[] strArr = new String[2];
        strArr[0] = "NONE";
        A0A = AnonymousClass3K2.A0q("VISA", strArr, 1);
        String[] strArr2 = new String[2];
        strArr2[0] = "0";
        A0B = AnonymousClass3K2.A0q("1", strArr2, 1);
        String[] strArr3 = new String[4];
        strArr3[0] = "ACTIVE";
        strArr3[1] = "DELETED";
        strArr3[2] = "INACTIVE";
        A0C = AnonymousClass3K2.A0q("SUSPENDED", strArr3, 3);
        String[] strArr4 = new String[2];
        strArr4[0] = "0";
        A09 = AnonymousClass3K2.A0q("1", strArr4, 1);
    }

    public AnonymousClass53Z(C16300so r12, C28371Vv r13) {
        C28371Vv r4 = r13;
        C28371Vv.A06(r13, "card");
        Class<String> cls = String.class;
        Long A0a = AnonymousClass3K2.A0a();
        this.A06 = (String) C32271fx.A01((C16300so) null, r4, cls, A0a, 1000L, (Object) null, new String[]{"image-content-id"}, false);
        this.A03 = (String) C32271fx.A00((C16300so) null, r4, cls, A0a, 100L, (Object) null, new String[]{"bank-name"}, false);
        this.A04 = (String) C32271fx.A00((C16300so) null, r4, cls, A0a, 20L, (Object) null, new String[]{"bank-phone-number"}, false);
        this.A05 = (String) C32271fx.A01((C16300so) null, r4, cls, AnonymousClass3K2.A0X(), AnonymousClass3K2.A0Y(), (Object) null, new String[]{"binding-type"}, false);
        this.A07 = C32271fx.A06(r13, A0B, new String[]{"needs-device-binding"});
        this.A08 = C32271fx.A05(r13, A0C, new String[]{"state"});
        this.A02 = C32271fx.A05(r13, A09, new String[]{"automatic-binding"});
        this.A01 = (C89044bV) AnonymousClass3K2.A0d(r12, r13, 4, 0);
        this.A00 = r13;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass53Z.class != obj.getClass()) {
                return false;
            }
            AnonymousClass53Z r5 = (AnonymousClass53Z) obj;
            if (!this.A05.equals(r5.A05) || !this.A07.equals(r5.A07) || !C34901l3.A00(this.A08, r5.A08) || !C34901l3.A00(this.A02, r5.A02) || !this.A06.equals(r5.A06) || !C34901l3.A00(this.A03, r5.A03) || !C34901l3.A00(this.A04, r5.A04) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        objArr[0] = this.A05;
        objArr[1] = this.A07;
        objArr[2] = this.A08;
        objArr[3] = this.A02;
        objArr[4] = this.A06;
        objArr[5] = this.A03;
        objArr[6] = this.A04;
        return AnonymousClass000.A0F(this.A01, objArr, 7);
    }
}
