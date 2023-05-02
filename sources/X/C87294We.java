package X;

import android.content.ContentValues;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: X.4We  reason: invalid class name and case insensitive filesystem */
public class C87294We {
    public ContentValues A00 = new ContentValues();
    public String A01 = "";
    public String A02 = "";
    public List A03 = AnonymousClass000.A0u();
    public Set A04 = C13680ns.A0o();
    public Set A05 = C13680ns.A0o();
    public byte[] A06;

    public boolean equals(Object obj) {
        if (!(obj instanceof C87294We)) {
            return false;
        }
        C87294We r6 = (C87294We) obj;
        String str = this.A01;
        if (str == null || !str.equals(r6.A01) || !this.A00.equals(r6.A00) || !this.A04.equals(r6.A04) || !this.A05.equals(r6.A05)) {
            return false;
        }
        byte[] bArr = this.A06;
        if (bArr != null && Arrays.equals(bArr, r6.A06)) {
            return true;
        }
        if (!this.A02.equals(r6.A02)) {
            return false;
        }
        List list = this.A03;
        List list2 = r6.A03;
        return list.equals(list2) || list.size() == 1 || list2.size() == 1;
    }

    public int hashCode() {
        Object obj = this.A06;
        Object[] objArr = new Object[5];
        objArr[0] = this.A01;
        objArr[1] = this.A00;
        objArr[2] = this.A04;
        objArr[3] = this.A05;
        if (obj == null) {
            return AnonymousClass000.A0F(this.A02, objArr, 4);
        }
        objArr[4] = obj;
        return Arrays.deepHashCode(objArr);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("propName: ");
        A0r.append(this.A01);
        A0r.append(", paramMap: ");
        AnonymousClass000.A1I(this.A00, A0r);
        A0r.append(", propmMap_TYPE: ");
        AnonymousClass000.A1I(this.A04, A0r);
        A0r.append(", propGroupSet: ");
        AnonymousClass000.A1I(this.A05, A0r);
        List list = this.A03;
        if (list.size() > 1) {
            A0r.append(", propValue_vector size: ");
            A0r.append(list.size());
        }
        byte[] bArr = this.A06;
        if (bArr != null) {
            A0r.append(", propValue_bytes size: ");
            A0r.append(bArr.length);
        }
        A0r.append(", propValue: ");
        return AnonymousClass000.A0h(this.A02, A0r);
    }
}
