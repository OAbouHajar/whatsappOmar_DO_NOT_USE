package X;

import android.util.Base64;
import java.util.List;

/* renamed from: X.0Pn  reason: invalid class name and case insensitive filesystem */
public final class C05160Pn {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C05160Pn(String str, String str2, String str3, List list) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = list;
        StringBuilder A0r = AnonymousClass000.A0r(str);
        A0r.append("-");
        A0r.append(str2);
        A0r.append("-");
        this.A00 = AnonymousClass000.A0h(str3, A0r);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        StringBuilder A0r = AnonymousClass000.A0r("FontRequest {mProviderAuthority: ");
        A0r.append(this.A01);
        A0r.append(", mProviderPackage: ");
        A0r.append(this.A02);
        A0r.append(", mQuery: ");
        A0r.append(this.A03);
        A0o.append(AnonymousClass000.A0h(", mCertificates:", A0r));
        int i2 = 0;
        while (true) {
            List list = this.A04;
            if (i2 < list.size()) {
                A0o.append(" [");
                List list2 = (List) list.get(i2);
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    A0o.append(" \"");
                    A0o.append(Base64.encodeToString((byte[]) list2.get(i3), 0));
                    A0o.append("\"");
                }
                A0o.append(" ]");
                i2++;
            } else {
                A0o.append("}");
                return AnonymousClass000.A0h(AnonymousClass000.A0l(AnonymousClass000.A0r("mCertificatesArray: "), 0), A0o);
            }
        }
    }
}
