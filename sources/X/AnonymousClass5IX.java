package X;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/* renamed from: X.5IX  reason: invalid class name */
public class AnonymousClass5IX extends C32051fZ {
    public byte[] A00;

    public AnonymousClass5IX(String str) {
        this.A00 = C32941ha.A03(str);
        try {
            AnonymousClass4Z8.A00(new SimpleDateFormat("yyMMddHHmmssz").parse(A0A()));
        } catch (ParseException e2) {
            throw AnonymousClass000.A0T(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("invalid date string: ")));
        }
    }

    public AnonymousClass5IX(byte[] bArr) {
        String str;
        byte b2;
        if (bArr.length >= 2) {
            this.A00 = bArr;
            byte b3 = bArr[0];
            if (b3 < 48 || b3 > 57 || (b2 = bArr[1]) < 48 || b2 > 57) {
                str = "illegal characters in UTCTime string";
            } else {
                return;
            }
        } else {
            str = "UTCTime string too short";
        }
        throw AnonymousClass000.A0T(str);
    }

    public int A03() {
        int length = this.A00.length;
        return C32551gZ.A00(length) + 1 + length;
    }

    public void A07(C33061hs r3, boolean z2) {
        r3.A06(this.A00, 23, z2);
    }

    public boolean A08() {
        return false;
    }

    public boolean A09(C32051fZ r3) {
        if (!(r3 instanceof AnonymousClass5IX)) {
            return false;
        }
        return Arrays.equals(this.A00, ((AnonymousClass5IX) r3).A00);
    }

    public String A0A() {
        StringBuilder A0o;
        String substring;
        String A02 = C32941ha.A02(this.A00);
        int indexOf = A02.indexOf(45);
        if (indexOf >= 0 || (indexOf = A02.indexOf(43)) >= 0) {
            if (indexOf == A02.length() - 3) {
                A02 = AnonymousClass000.A0h("00", AnonymousClass000.A0q(A02));
            }
            A0o = AnonymousClass000.A0o();
            if (indexOf == 10) {
                AnonymousClass3K3.A1M(A02, A0o, 0, 10);
                A0o.append("00GMT");
                AnonymousClass3K3.A1M(A02, A0o, 10, 13);
                A0o.append(":");
                substring = A02.substring(13, 15);
            } else {
                AnonymousClass3K3.A1M(A02, A0o, 0, 12);
                A0o.append("GMT");
                AnonymousClass3K3.A1M(A02, A0o, 12, 15);
                A0o.append(":");
                substring = A02.substring(15, 17);
            }
        } else {
            int length = A02.length();
            A0o = AnonymousClass000.A0o();
            if (length == 11) {
                AnonymousClass3K3.A1M(A02, A0o, 0, 10);
                substring = "00GMT+00:00";
            } else {
                AnonymousClass3K3.A1M(A02, A0o, 0, 12);
                substring = "GMT+00:00";
            }
        }
        return AnonymousClass000.A0h(substring, A0o);
    }

    public int hashCode() {
        return C33111hx.A00(this.A00);
    }

    public String toString() {
        return C32941ha.A02(this.A00);
    }
}
