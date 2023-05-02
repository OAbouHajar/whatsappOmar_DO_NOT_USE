package X;

import java.util.ArrayList;

/* renamed from: X.4bX  reason: invalid class name and case insensitive filesystem */
public final class C89064bX {
    public static final ArrayList A0A;
    public static final ArrayList A0B;
    public static final ArrayList A0C;
    public static final ArrayList A0D;
    public static final ArrayList A0E;
    public static final ArrayList A0F;
    public static final ArrayList A0G;
    public static final ArrayList A0H;
    public static final ArrayList A0I;
    public final C28371Vv A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    static {
        String[] strArr = new String[2];
        strArr[0] = "0";
        A0D = AnonymousClass3K2.A0q("1", strArr, 1);
        String[] strArr2 = new String[2];
        strArr2[0] = "0";
        A0I = AnonymousClass3K2.A0q("1", strArr2, 1);
        String[] strArr3 = new String[2];
        strArr3[0] = "0";
        A0C = AnonymousClass3K2.A0q("1", strArr3, 1);
        String[] strArr4 = new String[2];
        strArr4[0] = "0";
        A0B = AnonymousClass3K2.A0q("1", strArr4, 1);
        String[] strArr5 = new String[2];
        strArr5[0] = "0";
        A0A = AnonymousClass3K2.A0q("1", strArr5, 1);
        String[] strArr6 = new String[3];
        strArr6[0] = "DISABLED";
        strArr6[1] = "ENABLED";
        A0H = AnonymousClass3K2.A0q("REQUIRES_VERIFICATION", strArr6, 2);
        String[] strArr7 = new String[3];
        strArr7[0] = "DISABLED";
        strArr7[1] = "ENABLED";
        A0G = AnonymousClass3K2.A0q("REQUIRES_VERIFICATION", strArr7, 2);
        String[] strArr8 = new String[3];
        strArr8[0] = "DISABLED";
        strArr8[1] = "ENABLED";
        A0F = AnonymousClass3K2.A0q("REQUIRES_VERIFICATION", strArr8, 2);
        String[] strArr9 = new String[3];
        strArr9[0] = "DISABLED";
        strArr9[1] = "ENABLED";
        A0E = AnonymousClass3K2.A0q("REQUIRES_VERIFICATION", strArr9, 2);
    }

    public C89064bX(C28371Vv r8) {
        C28371Vv.A06(r8, "card");
        this.A04 = C32271fx.A06(r8, A0D, new String[]{"capabilities", "editable"});
        this.A09 = C32271fx.A06(r8, A0I, new String[]{"capabilities", "verifiable"});
        this.A01 = C32271fx.A06(r8, A0C, new String[]{"capabilities", "default-eligible"});
        this.A03 = C32271fx.A05(r8, A0B, new String[]{"capabilities", "default-eligible-p2p"});
        this.A02 = C32271fx.A05(r8, A0A, new String[]{"capabilities", "default-eligible-p2m"});
        this.A08 = C32271fx.A06(r8, A0H, new String[]{"capabilities", "p2p-send"});
        this.A07 = C32271fx.A06(r8, A0G, new String[]{"capabilities", "p2p-receive"});
        this.A06 = C32271fx.A06(r8, A0F, new String[]{"capabilities", "p2m-send"});
        this.A05 = C32271fx.A06(r8, A0E, new String[]{"capabilities", "p2m-receive"});
        this.A00 = r8;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C89064bX.class != obj.getClass()) {
                return false;
            }
            C89064bX r5 = (C89064bX) obj;
            if (!this.A04.equals(r5.A04) || !this.A09.equals(r5.A09) || !this.A01.equals(r5.A01) || !C34901l3.A00(this.A03, r5.A03) || !C34901l3.A00(this.A02, r5.A02) || !this.A08.equals(r5.A08) || !this.A07.equals(r5.A07) || !this.A06.equals(r5.A06) || !this.A05.equals(r5.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        objArr[0] = this.A04;
        objArr[1] = this.A09;
        objArr[2] = this.A01;
        objArr[3] = this.A03;
        objArr[4] = this.A02;
        objArr[5] = this.A08;
        objArr[6] = this.A07;
        objArr[7] = this.A06;
        return AnonymousClass000.A0F(this.A05, objArr, 8);
    }
}
