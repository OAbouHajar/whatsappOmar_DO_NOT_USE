package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1cf  reason: invalid class name and case insensitive filesystem */
public class C30611cf {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public C30611cf(Long l2, String str, String str2, String str3, String str4, List list) {
        this.A02 = str;
        this.A03 = str2;
        this.A05 = list;
        this.A04 = str3;
        this.A00 = l2;
        this.A01 = str4;
    }

    public C30611cf A00() {
        String str = this.A02;
        String str2 = this.A03;
        List list = this.A05;
        return new C30611cf(this.A00, str, str2, this.A04, this.A01, list != null ? new ArrayList(list) : null);
    }
}
