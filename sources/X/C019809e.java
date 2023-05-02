package X;

import java.util.Map;

/* renamed from: X.09e  reason: invalid class name and case insensitive filesystem */
public final class C019809e extends AnonymousClass027 {
    public C016407u A00;
    public String A01;

    public C019809e(C016407u r1, Object obj, String str) {
        super(obj);
        this.A01 = str;
        this.A00 = r1;
    }

    public C019809e(C016407u r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public void A0B(Object obj) {
        C016407u r2 = this.A00;
        if (r2 != null) {
            Map map = r2.A03;
            String str = this.A01;
            map.put(str, obj);
            r2.A01.get(str);
        }
        super.A0B(obj);
    }
}
