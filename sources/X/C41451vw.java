package X;

import java.util.List;

/* renamed from: X.1vw  reason: invalid class name and case insensitive filesystem */
public class C41451vw {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass135 A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;

    public C41451vw(AnonymousClass135 r1, List list, int i2, boolean z2) {
        this.A01 = r1;
        this.A03 = z2;
        this.A00 = i2;
        this.A02 = list;
    }

    public void A00(int i2) {
        AnonymousClass135 r5 = this.A01;
        List<String> list = this.A02;
        if (i2 != -1) {
            if (i2 == 0 || i2 == 400) {
                for (String str : list) {
                    AnonymousClass18I r2 = r5.A08;
                    r2.A01(str, 3);
                    r2.A02(str, System.currentTimeMillis());
                }
            } else if (i2 == 500) {
                C40761ue r6 = r5.A09;
                Long A002 = r6.A00();
                if (A002 != null) {
                    r5.A0B.Ad4(r5.A0C, "ToSGatingRepository/requestRefresh", A002.longValue());
                    return;
                }
                for (String A022 : list) {
                    r5.A08.A02(A022, System.currentTimeMillis());
                }
                r6.A01();
                return;
            } else {
                return;
            }
        }
        r5.A09.A01();
    }
}
