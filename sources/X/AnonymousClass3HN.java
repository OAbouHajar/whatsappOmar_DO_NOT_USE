package X;

import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7;
import com.obwhatsapp.R;
import java.io.File;

/* renamed from: X.3HN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3HN implements C108995Qh {
    public final /* synthetic */ C42821yj A00;

    public /* synthetic */ AnonymousClass3HN(C42821yj r1) {
        this.A00 = r1;
    }

    public final void AWN(AnonymousClass4J3 r13) {
        C42821yj r5 = this.A00;
        AnonymousClass4LA r3 = r13.A01;
        if (r3 != null) {
            r5.A0E();
            C16740tZ r2 = r13.A00;
            if (r2 != null) {
                if (!C16030sJ.A0Q(r2.A11.A00)) {
                    r5.A2C.A0J(r2);
                } else {
                    return;
                }
            }
            if (r5.A4F != null) {
                r5.A0j(r2, false);
                AnonymousClass1ZK r0 = r5.A4F;
                File file = r3.A02;
                File file2 = r3.A00;
                r0.A0M(file, file2, true, false);
                AnonymousClass1ZK r7 = r5.A4F;
                AnonymousClass1ZL r6 = r7.A1G;
                r6.A0D.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I0_7(r7.A1N, 16));
                r6.A00();
                r6.A01(R.drawable.ic_resume_draft_preview);
                r7.A1D.Acl(new RunnableRunnableShape0S0400000_I0(r7, file, (Object) null, file2, 37));
            }
            r5.A0S.setEnabled(true);
        }
    }
}
