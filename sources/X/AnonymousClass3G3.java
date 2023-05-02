package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.3G3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3G3 implements AnonymousClass2A2 {
    public final /* synthetic */ C456729z A00;
    public final /* synthetic */ AnonymousClass2A0 A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AnonymousClass3G3(C456729z r1, AnonymousClass2A0 r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    public final C90774em Acg(C29561ap r12) {
        C456729z r6 = this.A00;
        String str = this.A02;
        AnonymousClass2A0 r5 = this.A01;
        AnonymousClass4NN r2 = new AnonymousClass4NN();
        boolean z2 = r5.A05;
        AnonymousClass00B.A0B("Should only set final hash for streaming uploads", z2);
        r5.A00 = AnonymousClass1ZW.A0C(str);
        AnonymousClass00B.A0B("Should only finalize for streaming uploads", z2);
        AnonymousClass00B.A0B("Must set final hash before finalizing streaming upload", AnonymousClass000.A1V(r5.A00));
        Uri.Builder A022 = r5.A02(r12);
        A022.appendQueryParameter("final_hash", r5.A00);
        C29551ao A002 = r6.A00.A00(new C63043Fx(r2, r6, r12, r5), C13700nu.A0G(A022), 0);
        try {
            int A023 = A002.A02(r12);
            r2.A01 = new AnonymousClass21J(A002.A02, A002.A00, A002.A01, (long) A023);
            r2.A00 = A023;
            if (A023 == 200) {
                r2.A04 = true;
            }
        } catch (IOException e2) {
            Log.e("Error while finalizing upload", e2);
        }
        return r2.A04 ? C90774em.A02(r2) : C90774em.A03(r2, r2.A00);
    }
}
