package X;

import com.facebook.redex.RunnableRunnableShape1S1100000_I1;
import com.whatsapp.util.Log;

/* renamed from: X.51B  reason: invalid class name */
public final class AnonymousClass51B implements C19550yc {
    public final /* synthetic */ C85964Qr A00;

    public AnonymousClass51B(C85964Qr r1) {
        this.A00 = r1;
    }

    public void APb(String str) {
        Log.e("ReportBugProtocolHelper/onDeliveryFailure: Network Failure");
        C85964Qr r1 = this.A00;
        AnonymousClass3K3.A1E(r1.A01.A00, r1.A00, 41);
    }

    public void AQe(C28371Vv r4, String str) {
        C18450wi.A0H(r4, 1);
        StringBuilder A0r = AnonymousClass000.A0r("ReportBugProtocolHelper/onError: ");
        A0r.append(r4);
        Log.e(AnonymousClass000.A0h(".toString()", A0r));
        C85964Qr r1 = this.A00;
        AnonymousClass3K3.A1E(r1.A01.A00, r1.A00, 41);
    }

    public void AYG(C28371Vv r6, String str) {
        String str2;
        C18450wi.A0H(r6, 1);
        C28371Vv A0J = r6.A0J("task_id");
        if (A0J == null) {
            str2 = "ReportBugProtocolHelper/onSuccess called with empty taskIdNode";
        } else {
            String A0L = A0J.A0L();
            if (A0L == null || A0L.length() == 0) {
                str2 = "ReportBugProtocolHelper/onSuccess called with null task id";
            } else {
                C85964Qr r1 = this.A00;
                r1.A01.A00.A0K(new RunnableRunnableShape1S1100000_I1(7, A0L, r1.A00));
                return;
            }
        }
        Log.e(str2);
        C85964Qr r12 = this.A00;
        AnonymousClass3K3.A1E(r12.A01.A00, r12.A00, 41);
    }
}
