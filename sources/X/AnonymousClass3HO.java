package X;

import android.net.Uri;
import com.facebook.redex.IDxNConsumerShape18S0300000_2_I1;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3HO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3HO implements C30221by {
    public final /* synthetic */ AnonymousClass1ZK A00;

    public /* synthetic */ AnonymousClass3HO(AnonymousClass1ZK r1) {
        this.A00 = r1;
    }

    public final void A5q(Object obj) {
        AnonymousClass1ZK r3 = this.A00;
        File file = (File) obj;
        AnonymousClass1HE r6 = r3.A15;
        C15830rv r5 = r3.A0J;
        Log.i("app/mediajobmanager/enqueuevoicenoteupload enqueuing file ");
        AnonymousClass1XL A002 = AnonymousClass1XL.A00(Uri.fromFile(file), (AnonymousClass1XM) null, (AnonymousClass1XN) null, new AnonymousClass1XJ(true, false, true), AnonymousClass1XK.A0I, (AnonymousClass1XO) null, (String) null, 1, false, false, true);
        C18220wL r9 = r6.A0D;
        AnonymousClass1XP A03 = r9.A03(A002, true);
        C43251zh r1 = A03.A0K;
        AnonymousClass00B.A06(r1);
        r1.A04(2);
        AnonymousClass00B.A06(r1);
        r1.A02();
        A03.A0U = "mms";
        A03.A08.A04(new AnonymousClass21L(file, false));
        A03.A0A.A03(new IDxNConsumerShape18S0300000_2_I1(r6, A03, r5, 1), r6.A0S);
        C43171zS r0 = new C43171zS(A03, A03.A00());
        r9.A09(A03, r0);
        r3.A0K = r0;
    }
}
