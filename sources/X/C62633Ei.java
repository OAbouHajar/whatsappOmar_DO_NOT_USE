package X;

import android.view.View;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3Ei  reason: invalid class name and case insensitive filesystem */
public class C62633Ei implements AnonymousClass5SS {
    public static int A07 = 1;
    public static int A08 = 2;
    public static int A09 = 3;
    public static int A0A = -1;
    public static int A0B = -1;
    public View A00;
    public final AnonymousClass1VI A01;
    public final C15800rs A02;
    public final C16440t3 A03;
    public final C15860rz A04;
    public final C16490t9 A05;
    public final C50272Yr A06;

    public C62633Ei(AnonymousClass1VI r3, C15800rs r4, C16440t3 r5, C15860rz r6, C14710pd r7, C16490t9 r8, C50272Yr r9) {
        this.A03 = r5;
        this.A05 = r8;
        this.A06 = r9;
        this.A01 = r3;
        this.A04 = r6;
        this.A02 = r4;
        C16620tM r1 = C16620tM.A02;
        A07 = r7.A03(r1, 354);
        A08 = r7.A03(r1, 351);
        A09 = r7.A03(r1, 350);
        A0B = r7.A03(r1, 352);
        A0A = r7.A03(r1, 353);
    }

    public void AHm() {
        C13680ns.A13(this.A00);
    }

    public boolean AfA() {
        C15860rz r3 = this.A04;
        AnonymousClass01D r8 = r3.A01;
        int A012 = C13690nt.A01(C13680ns.A0C(r8), "create_group_tip_count");
        long A082 = C13680ns.A08(C13680ns.A0C(r8), "create_group_tip_time");
        C15800rs r5 = this.A02;
        if ((A0B <= 0 || C13680ns.A0C(r8).getInt("groups_banner_total_day_count", 0) <= A0B) && (A0A <= 0 || C13680ns.A0C(r8).getInt("groups_banner_click_count", 0) < A0A)) {
            r5.A00.A0C();
            ArrayList arrayList = r5.A01;
            synchronized (arrayList) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C16030sJ.A0L(((C15820ru) it.next()).A01)) {
                            break;
                        }
                    } else {
                        return r5.A01() >= A09 && A012 < A07 && A082 + 2592000000L < this.A03.A00() && AnonymousClass1VI.A00(r3);
                    }
                }
            }
        }
    }

    public void AhG() {
        if (this.A00 == null) {
            AnonymousClass1VI r2 = this.A01;
            View A0H = C13680ns.A0H(C13680ns.A0G(r2), r2, R.layout.layout02f0);
            this.A00 = A0H;
            r2.addView(A0H);
        }
        View view = this.A00;
        if (view == null) {
            AnonymousClass1VI r22 = this.A01;
            view = C13680ns.A0H(C13680ns.A0G(r22), r22, R.layout.layout02f0);
            this.A00 = view;
        }
        AnonymousClass1VI r4 = this.A01;
        r4.setBackgroundResource(R.color.color0081);
        C13680ns.A1A(r4, this, 30);
        C13680ns.A1A(C004601z.A0E(view, R.id.dismiss_groups_banner_container), this, 29);
        r4.A01(1, 1);
        C15860rz r6 = this.A04;
        if (r6.A1n("education_banner_timestamp", 86400000)) {
            AnonymousClass01D r3 = r6.A01;
            C13680ns.A1S(r6, "education_banner_count", C13680ns.A0C(r3).getInt("education_banner_count", 0) + 1);
            C13680ns.A1S(r6, "groups_banner_total_day_count", C13680ns.A0C(r3).getInt("groups_banner_total_day_count", 0) + 1);
            r6.A0x("education_banner_timestamp");
        }
        View view2 = this.A00;
        if (view2 == null) {
            view2 = C13680ns.A0H(C13680ns.A0G(r4), r4, R.layout.layout02f0);
            this.A00 = view2;
        }
        view2.setVisibility(0);
    }
}
