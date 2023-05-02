package X;

import android.content.Context;
import com.facebook.redex.IDxCListenerShape33S0200000_3_I1;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.66l  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1216866l implements Runnable {
    public final /* synthetic */ C35441lw A00;
    public final /* synthetic */ C110655eb A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;

    public /* synthetic */ C1216866l(C35441lw r1, C110655eb r2, List list, List list2) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = list;
        this.A03 = list2;
    }

    public final void run() {
        C113965mu r6;
        int i2;
        C110655eb r4 = this.A01;
        C35441lw r5 = this.A00;
        List list = this.A02;
        List list2 = this.A03;
        r4.A01 = r5;
        r4.A05 = list;
        r4.A06 = list2;
        AnonymousClass027 r3 = r4.A00;
        ArrayList A0u = AnonymousClass000.A0u();
        C39931tI r52 = (C39931tI) r5.A08;
        if (r52 != null) {
            if (r52.A0C()) {
                r6 = new C113965mu();
                r6.A00 = R.drawable.ic_verify;
                r6.A01 = R.color.color05ed;
                Context context = r4.A0E.A00;
                r6.A04 = context.getString(R.string.str0d1e);
                r6.A03 = context.getString(R.string.str0d16);
                i2 = 23;
            } else if ("EXTERNALLY_DISABLED".equals(r52.A06)) {
                r6 = new C113965mu();
                r6.A00 = R.drawable.ic_alert;
                r6.A01 = R.color.color05ec;
                Context context2 = r4.A0E.A00;
                r6.A04 = context2.getString(R.string.str0d1a);
                r6.A03 = context2.getString(R.string.str0d1b);
                i2 = 22;
            }
            r6.A02 = new IDxCListenerShape33S0200000_3_I1(r52, i2, r4);
            A0u.add(r6);
        }
        List list3 = r4.A05;
        if (list3 != null && !list3.isEmpty()) {
            Context context3 = r4.A0E.A00;
            A0u.add(new C113785mc(context3.getString(R.string.str0f70)));
            Iterator it = r4.A05.iterator();
            while (it.hasNext()) {
                C30671cl A0F = C110115dX.A0F(it);
                if (A0F instanceof C35521m4) {
                    C111795hQ r53 = (C111795hQ) A0F.A08;
                    C113995mx r1 = new C113995mx();
                    if (r53 != null) {
                        r1.A09 = r53.A09;
                        r1.A03 = r53.A01;
                        int i3 = r53.A00;
                        if (i3 == 1) {
                            r1.A08 = true;
                            r1.A07 = false;
                            r1.A04 = context3.getString(R.string.str0d20);
                            r1.A00 = R.drawable.ic_history;
                            r1.A01 = R.color.color0846;
                            r1.A06 = context3.getString(R.string.str0d21);
                        } else if (i3 == 2) {
                            C39931tI r62 = (C39931tI) r4.A01.A08;
                            boolean A1Q = AnonymousClass000.A1Q(r62.A00 & 4);
                            r1.A08 = true;
                            r1.A07 = true;
                            if (A1Q) {
                                r1.A04 = context3.getString(R.string.str0d1c);
                                r1.A00 = R.drawable.ic_verify;
                                r1.A01 = R.color.color05ed;
                                r1.A06 = context3.getString(R.string.str0d1d);
                                r1.A05 = context3.getString(R.string.str0d1f);
                                r1.A02 = new IDxCListenerShape33S0200000_3_I1(r62, 24, r4);
                            } else {
                                r1.A04 = context3.getString(R.string.str0d19);
                                r1.A00 = R.drawable.ic_alert;
                                r1.A01 = R.color.color05ec;
                                r1.A06 = context3.getString(R.string.str0d1a);
                                r1.A05 = context3.getString(R.string.str0d1b);
                                r1.A02 = C110115dX.A06(r4, 120);
                            }
                        }
                    }
                    A0u.add(r1);
                } else if (A0F instanceof C35391lr) {
                    C113805me r7 = new C113805me();
                    r7.A00 = C13680ns.A0d(context3, C119405xi.A06(A0F), C13680ns.A1b(), 0, R.string.str0f71);
                    A0u.add(r7);
                }
            }
        }
        List list4 = r4.A05;
        if (list4 != null && !list4.isEmpty()) {
            A0u.add(new C113735mX(103));
        }
        Context context4 = r4.A0E.A00;
        A0u.add(new C113785mc(context4.getString(R.string.str0f72)));
        C113945ms r63 = new C113945ms();
        r63.A02 = context4.getString(R.string.str10ed);
        r63.A01 = context4.getString(R.string.str1070);
        r63.A00 = C110115dX.A06(r4, 121);
        r63.A03.addAll(r4.A06);
        A0u.add(r63);
        A0u.add(new C113735mX(103));
        C113935mr r12 = new C113935mr();
        r12.A00 = R.drawable.ic_partner_dashboard;
        r12.A03 = context4.getString(R.string.str028e);
        r12.A02 = C110115dX.A06(r4, 119);
        A0u.add(r12);
        C113935mr r13 = new C113935mr();
        r13.A00 = R.drawable.ic_help;
        r13.A01 = R.color.color0846;
        r13.A03 = context4.getString(R.string.str1d95);
        r13.A02 = C110115dX.A06(r4, 118);
        A0u.add(r13);
        r3.A0B(A0u);
    }
}
