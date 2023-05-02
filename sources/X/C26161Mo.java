package X;

import com.facebook.redex.IDxRCallbackShape440S0100000_2_I0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Mo  reason: invalid class name and case insensitive filesystem */
public class C26161Mo extends C003401n {
    public AnonymousClass2VG A00;
    public String A01 = "";
    public boolean A02;
    public final AnonymousClass027 A03 = new AnonymousClass027();
    public final AnonymousClass1M7 A04;

    public C26161Mo(AnonymousClass1M7 r2) {
        this.A04 = r2;
    }

    public void A05() {
        AnonymousClass027 r1 = this.A03;
        if (r1.A01() != null && !((List) r1.A01()).isEmpty()) {
            A06(this.A01, true);
        }
    }

    public final void A06(String str, boolean z2) {
        this.A02 = z2;
        if (str.length() <= 20) {
            String replaceAll = new AnonymousClass22P("[\\p{Punct}¥%，。？；：（）【】「」《》—¡!«»¿?{}]").nativePattern.matcher(str).replaceAll("");
            C18450wi.A0B(replaceAll);
            if (replaceAll.equals(this.A01) && !z2) {
                return;
            }
            if (!replaceAll.isEmpty()) {
                this.A01 = replaceAll;
                AnonymousClass1M7 r6 = this.A04;
                AnonymousClass00B.A01();
                AnonymousClass2X4 r4 = new AnonymousClass2X4();
                if (r6.A01.A02) {
                    AnonymousClass36G r1 = r6.A00;
                    if (r1 != null) {
                        r1.A06(true);
                        r6.A00 = null;
                    }
                    AnonymousClass36G r3 = new AnonymousClass36G(new IDxRCallbackShape440S0100000_2_I0(r4, 1), r6, r6.A02);
                    r6.A00 = r3;
                    r6.A03.Ack(r3, replaceAll);
                }
                AnonymousClass2VG r0 = this.A00;
                if (r0 == null) {
                    r0 = new C102314yk(this);
                    this.A00 = r0;
                }
                r4.A00(r0);
                return;
            }
        }
        this.A03.A0B(new ArrayList(0));
        this.A01 = "";
        AnonymousClass1M7 r2 = this.A04;
        AnonymousClass36G r12 = r2.A00;
        if (r12 != null) {
            r12.A06(true);
            r2.A00 = null;
        }
    }
}
