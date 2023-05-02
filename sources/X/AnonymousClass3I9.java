package X;

import android.util.Pair;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.obwhatsapp.support.ReportSpamDialogFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3I9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3I9 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C16010sH A01;
    public final /* synthetic */ C16010sH A02;
    public final /* synthetic */ AnonymousClass1Y6 A03;
    public final /* synthetic */ ReportSpamDialogFragment A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ AnonymousClass3I9(C16010sH r1, C16010sH r2, AnonymousClass1Y6 r3, ReportSpamDialogFragment reportSpamDialogFragment, String str, int i2, boolean z2, boolean z3) {
        this.A04 = reportSpamDialogFragment;
        this.A01 = r1;
        this.A05 = str;
        this.A06 = z2;
        this.A00 = i2;
        this.A02 = r2;
        this.A07 = z3;
        this.A03 = r3;
    }

    public final void run() {
        ReportSpamDialogFragment reportSpamDialogFragment = this.A04;
        C16010sH r7 = this.A01;
        String str = this.A05;
        boolean z2 = this.A06;
        int i2 = this.A00;
        C16010sH r14 = this.A02;
        boolean z3 = this.A07;
        AnonymousClass1Y6 r6 = this.A03;
        Class<C16050sL> cls = C16050sL.class;
        if (r7.A08(cls) != null && reportSpamDialogFragment.A09.A02((GroupJid) r7.A08(cls)) == 1) {
            Log.e(AnonymousClass000.A0f(r7.A0E, AnonymousClass000.A0r("reportSpamDialogFragment/sendingParent/")));
            reportSpamDialogFragment.A00.AcB("reportSpamDialogFragment/sendingParent", str, true);
        }
        ArrayList arrayList = null;
        C16740tZ r1 = reportSpamDialogFragment.A0C;
        if (r1 != null) {
            arrayList = AnonymousClass000.A0u();
            arrayList.add(Pair.create(reportSpamDialogFragment.A0C, Boolean.valueOf(reportSpamDialogFragment.A08.A04(r1))));
        }
        if (!z2) {
            reportSpamDialogFragment.A06.A01(r7, str, arrayList);
            reportSpamDialogFragment.A01.A05();
            reportSpamDialogFragment.A01.A0K(new RunnableRunnableShape15S0100000_I0_14(reportSpamDialogFragment, 28));
        } else if (i2 != 0 || r14 == null) {
            C25931Lr r4 = reportSpamDialogFragment.A06;
            C001000l A0C = reportSpamDialogFragment.A0C();
            r4.A01(r7, str, arrayList);
            r4.A00(A0C, r6, r7, (String) null, (String) null, str, z3);
        } else {
            C25931Lr r0 = reportSpamDialogFragment.A06;
            C001000l A0C2 = reportSpamDialogFragment.A0C();
            r0.A01(r7, str, arrayList);
            Jid A032 = C16010sH.A03(r14);
            AnonymousClass00B.A06(A032);
            UserJid userJid = (UserJid) A032;
            r0.A02.A0I(A0C2, r14, userJid, (String) null, (String) null, str);
            if (z3) {
                r0.A01.A0I(userJid, true);
            }
            r6.AZU(r14);
        }
        C001000l A0C3 = reportSpamDialogFragment.A0C();
        if (reportSpamDialogFragment.A0D != null && A0C3 != null) {
            A0C3.runOnUiThread(new RunnableRunnableShape15S0100000_I0_14(reportSpamDialogFragment, 27));
        }
    }
}
