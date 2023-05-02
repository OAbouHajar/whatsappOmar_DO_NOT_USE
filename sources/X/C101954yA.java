package X;

import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.whatsapp.util.Log;

/* renamed from: X.4yA  reason: invalid class name and case insensitive filesystem */
public final class C101954yA implements C440622p {
    public final AnonymousClass262 A00;
    public final /* synthetic */ C25541Ke A01;

    public C101954yA(AnonymousClass262 r1, C25541Ke r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void ALw() {
        Log.e("DirectoryValueModelConfigDownloader/FetchConfigCallback/onAbort!");
        AnonymousClass262 r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void AQQ() {
        AnonymousClass262 r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        Log.e("DirectoryValueModelConfigDownloader/FetchConfigCallback/onError!");
        this.A01.A03.A0D(500, (Integer) null, (Integer) null, "wa_static_client_value_model_config", "Fetching client value model config failed", (String) null);
    }

    public void AYu() {
        AnonymousClass262 r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        Log.e("DirectoryValueModelConfigDownloader/FetchConfigCallback/onTimeout!");
        this.A01.A03.A0D(408, (Integer) null, (Integer) null, "wa_static_client_value_model_config", "Fetching client value model config failed due to timeout", (String) null);
    }

    public void onSuccess() {
        C25541Ke r4 = this.A01;
        r4.A06.Acl(new RunnableRunnableShape3S0200000_I0_1(r4, 33, this.A00));
    }
}
