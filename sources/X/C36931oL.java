package X;

import android.util.Base64;

/* renamed from: X.1oL  reason: invalid class name and case insensitive filesystem */
public class C36931oL extends AnonymousClass1WJ {
    public int A00;
    public final C36921oK A01;
    public final boolean A02;

    public C36931oL(C36921oK r11, AnonymousClass1WK r12, String str, int i2, long j2, boolean z2, boolean z3) {
        super(C28481Wg.A03, r12, str, "regular_low", 7, j2, z3);
        this.A02 = z2;
        this.A00 = i2;
        this.A01 = r11;
    }

    public C48232Mj A01() {
        C28581Wr A0U = C36911oJ.A0B.A0U();
        C36921oK r3 = this.A01;
        String str = r3.A08;
        if (str != null) {
            A0U.A03();
            C36911oJ r1 = (C36911oJ) A0U.A00;
            r1.A00 |= 1;
            r1.A09 = str;
        }
        String str2 = r3.A04;
        if (str2 != null) {
            byte[] decode = Base64.decode(str2, 0);
            C28631Ww A012 = C28631Ww.A01(decode, 0, decode.length);
            A0U.A03();
            C36911oJ r12 = (C36911oJ) A0U.A00;
            r12.A00 |= 2;
            r12.A05 = A012;
        }
        String str3 = r3.A05;
        if (str3 != null) {
            byte[] decode2 = Base64.decode(str3, 1);
            C28631Ww A013 = C28631Ww.A01(decode2, 0, decode2.length);
            A0U.A03();
            C36911oJ r13 = (C36911oJ) A0U.A00;
            r13.A00 |= 4;
            r13.A06 = A013;
        }
        String str4 = r3.A06;
        if (str4 != null) {
            A0U.A03();
            C36911oJ r14 = (C36911oJ) A0U.A00;
            r14.A00 |= 8;
            r14.A08 = str4;
        }
        int i2 = r3.A00;
        A0U.A03();
        C36911oJ r15 = (C36911oJ) A0U.A00;
        r15.A00 |= 16;
        r15.A02 = i2;
        int i3 = r3.A01;
        A0U.A03();
        C36911oJ r16 = (C36911oJ) A0U.A00;
        r16.A00 |= 32;
        r16.A03 = i3;
        String str5 = r3.A03;
        if (str5 != null) {
            A0U.A03();
            C36911oJ r17 = (C36911oJ) A0U.A00;
            r17.A00 |= 64;
            r17.A07 = str5;
        }
        long j2 = r3.A02;
        A0U.A03();
        C36911oJ r18 = (C36911oJ) A0U.A00;
        r18.A00 |= 128;
        r18.A04 = j2;
        boolean z2 = this.A02;
        A0U.A03();
        C36911oJ r19 = (C36911oJ) A0U.A00;
        r19.A00 |= 256;
        r19.A0A = z2;
        int i4 = this.A00;
        if (i4 >= 0) {
            A0U.A03();
            C36911oJ r110 = (C36911oJ) A0U.A00;
            r110.A00 |= 512;
            r110.A01 = i4;
        }
        C48232Mj A014 = super.A01();
        AnonymousClass00B.A06(A014);
        A014.A03();
        C28531Wl r2 = (C28531Wl) A014.A00;
        r2.A0S = (C36911oJ) A0U.A02();
        r2.A00 |= 134217728;
        return A014;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FavoriteStickerMutation{isFavorite=");
        sb.append(this.A02);
        sb.append(", setterId=");
        sb.append(this.A00);
        sb.append(", metadata=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }
}
