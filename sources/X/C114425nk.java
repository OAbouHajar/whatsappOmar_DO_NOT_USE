package X;

import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape1S0300000_I0_1;

/* renamed from: X.5nk  reason: invalid class name and case insensitive filesystem */
public class C114425nk extends C16690tT {
    public final /* synthetic */ C35361lo A00;
    public final /* synthetic */ C109935Ui A01;
    public final /* synthetic */ C209712h A02;

    public C114425nk(C35361lo r1, C109935Ui r2, C209712h r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A02.A04.A01(this.A00.A0F);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C35361lo r7 = (C35361lo) obj;
        if (r7 != null) {
            C35361lo r1 = this.A00;
            if (!TextUtils.isEmpty(r7.A05)) {
                r1.A05 = r7.A05;
            }
            if (!TextUtils.isEmpty(r7.A06)) {
                r1.A01 = r7.A01;
                r1.A06 = r7.A06;
            }
        }
        C209712h r5 = this.A02;
        C35361lo r4 = this.A00;
        C109935Ui r3 = this.A01;
        if (TextUtils.isEmpty(r4.A05)) {
            r5.A09.A00(new C101964yB(r4, r3, r5), r4.A0F);
            return;
        }
        r5.A0D.Acl(new RunnableRunnableShape1S0300000_I0_1(r5, r4, r3, 35));
    }
}
