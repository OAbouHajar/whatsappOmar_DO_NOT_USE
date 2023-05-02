package X;

import com.facebook.redex.IDxComparatorShape183S0100000_2_I0;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.22i  reason: invalid class name and case insensitive filesystem */
public final class C439922i {
    public String A00;
    public final long A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;

    public C439922i(Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, long j2) {
        C18450wi.A0H(str, 1);
        C18450wi.A0H(str2, 2);
        C18450wi.A0H(str3, 3);
        C18450wi.A0H(str5, 6);
        this.A0A = str;
        this.A06 = str2;
        this.A03 = str3;
        this.A01 = j2;
        this.A00 = str4;
        this.A08 = str5;
        this.A04 = str6;
        this.A02 = l2;
        this.A09 = str7;
        this.A07 = str8;
        this.A05 = str9;
        this.A0B = list;
    }

    public static /* synthetic */ C439922i A00(C439922i r4) {
        List A0D;
        Object obj;
        AnonymousClass223 A012 = A01("2.23.1.76");
        List list = r4.A0B;
        if (!(list == null || (A0D = C003101j.A0D(list, new IDxComparatorShape183S0100000_2_I0(r4, 1))) == null)) {
            Iterator it = A0D.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (A01(((C439922i) obj).A07).A01(A012) <= 0) {
                    break;
                }
            }
            C439922i r1 = (C439922i) obj;
            return r1 == null ? r4 : r1;
        }
    }

    public static final AnonymousClass223 A01(String str) {
        AnonymousClass223 A002 = AnonymousClass223.A00(str);
        return A002 == null ? new AnonymousClass223(1, 0, 0, 0, 0) : A002;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C439922i) {
                C439922i r8 = (C439922i) obj;
                if (!C18450wi.A0R(this.A0A, r8.A0A) || !C18450wi.A0R(this.A06, r8.A06) || !C18450wi.A0R(this.A03, r8.A03) || this.A01 != r8.A01 || !C18450wi.A0R(this.A00, r8.A00) || !C18450wi.A0R(this.A08, r8.A08) || !C18450wi.A0R(this.A04, r8.A04) || !C18450wi.A0R(this.A02, r8.A02) || !C18450wi.A0R(this.A09, r8.A09) || !C18450wi.A0R(this.A07, r8.A07) || !C18450wi.A0R(this.A05, r8.A05) || !C18450wi.A0R(this.A0B, r8.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j2 = this.A01;
        int hashCode = ((((((this.A0A.hashCode() * 31) + this.A06.hashCode()) * 31) + this.A03.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.A00;
        int i2 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.A08.hashCode()) * 31;
        String str2 = this.A04;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.A02;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.A09;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A07;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A05;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.A0B;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode7 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BloksLinks(url=");
        sb.append(this.A0A);
        sb.append(", locale=");
        sb.append(this.A06);
        sb.append(", appId=");
        sb.append(this.A03);
        sb.append(", expiresData=");
        sb.append(this.A01);
        sb.append(", version=");
        sb.append(this.A00);
        sb.append(", platform=");
        sb.append(this.A08);
        sb.append(", bizJid=");
        sb.append(this.A04);
        sb.append(", flowVersionId=");
        sb.append(this.A02);
        sb.append(", signature=");
        sb.append(this.A09);
        sb.append(", minAppVersion=");
        sb.append(this.A07);
        sb.append(", bloksVersionId=");
        sb.append(this.A05);
        sb.append(", extraVersions=");
        sb.append(this.A0B);
        sb.append(')');
        return sb.toString();
    }
}
