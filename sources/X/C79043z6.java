package X;

import java.util.List;
import java.util.Locale;

/* renamed from: X.3z6  reason: invalid class name and case insensitive filesystem */
public abstract class C79043z6 extends C16690tT {
    public CharSequence A00;
    public String A01;
    public final /* synthetic */ C25861Lk A02;

    public C79043z6(C25861Lk r1, CharSequence charSequence, String str) {
        this.A02 = r1;
        this.A00 = charSequence;
        this.A01 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Object obj;
        C25861Lk r4 = this.A02;
        Locale A002 = r4.A08.A00();
        AnonymousClass01Q A0B = A0B(A0C(this.A00, this.A01, A002));
        if (A0B != null && ((obj = A0B.A01) == null || ((List) obj).isEmpty())) {
            C74893rH r1 = new C74893rH();
            r1.A00 = Integer.valueOf(r4.A00());
            if (A002 != null) {
                r1.A01 = A002.getLanguage();
            }
            r1.A02 = r4.A04.A06();
            r4.A06.A05(r1);
        }
        return A0B;
    }

    public abstract AnonymousClass01Q A0B(String str);

    public abstract String A0C(CharSequence charSequence, String str, Locale locale);
}
