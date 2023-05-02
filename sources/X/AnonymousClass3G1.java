package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.3G1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3G1 implements AnonymousClass2A2 {
    public final /* synthetic */ C614438x A00;

    public /* synthetic */ AnonymousClass3G1(C614438x r1) {
        this.A00 = r1;
    }

    public final C90774em Acg(C29561ap r10) {
        C614438x r3 = this.A00;
        Uri.Builder A03 = r3.A06.A03(r10);
        A03.appendQueryParameter("resume", "1");
        String A0G = C13700nu.A0G(A03);
        C17680vT r4 = r3.A01;
        C63053Fy r5 = new C63053Fy(r3.A00, r4, r3.A04, A0G);
        r5.A00 = new C87264Wb();
        C17690vU r1 = r5.A01;
        String str = r5.A04;
        C29551ao A002 = r1.A00(r5, str, 10);
        try {
            int A02 = A002.A02(r10);
            AnonymousClass4MS r8 = r5.A03;
            r8.A00 = A002.A00;
            r8.A02 = A002.A01;
            r8.A01 = (long) A02;
            r8.A03 = A002.A02;
            if (A02 < 0 || A02 >= 400) {
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("mediaupload/MMS upload resume form post failed/error=");
                A0o.append(A02);
                A0o.append("; url=");
                Log.w(AnonymousClass000.A0h(str, A0o));
                C87264Wb r12 = r5.A00;
                r12.A00 = A02;
                r12.A02 = C798841s.FAILURE;
            }
        } catch (IOException e2) {
            Log.w(C13680ns.A0h("mediaupload/MMS upload resume form post failed; url=", str), e2);
            boolean A022 = r5.A02.A02(e2);
            r5.A00.A02 = A022 ? C798841s.WATLS_ERROR : C798841s.FAILURE;
            AnonymousClass4MS r2 = r5.A03;
            r2.A00 = A002.A00;
            r2.A02 = A002.A01;
            r2.A03 = A002.A02;
        }
        C87264Wb r22 = r5.A00;
        r22.A03 = r3.A02.A00(r22.A03);
        C798841s r13 = r22.A02;
        if (r13 == null) {
            r13 = C798841s.FAILURE;
            r22.A02 = r13;
        }
        if (r13 == C798841s.WATLS_ERROR) {
            Log.i("resumecheck/attempting fallback MMS upload form post - watls error");
            r4.A00();
        } else if (r13 == C798841s.FAILURE) {
            Log.i("resumecheck/attempting fallback MMS upload form post");
        } else {
            if (r13 == C798841s.RESUME) {
                r3.A05.A02 = C13690nt.A0W(r22.A01);
            }
            return C90774em.A02(r22);
        }
        return C90774em.A03(r22, r22.A00);
    }
}
