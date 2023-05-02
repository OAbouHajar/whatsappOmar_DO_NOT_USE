package X;

import com.whatsapp.util.Log;

/* renamed from: X.51E  reason: invalid class name */
public class AnonymousClass51E implements C19550yc {
    public AnonymousClass4QI A00;
    public final C17190ug A01;

    public AnonymousClass51E(C17190ug r1) {
        this.A01 = r1;
    }

    public void APb(String str) {
        Log.e("delivery failure when setting member add mode");
        AnonymousClass4QI r1 = this.A00;
        if (r1 != null) {
            r1.A00(500);
        }
    }

    public void AQe(C28371Vv r4, String str) {
        C28371Vv A0J = r4.A0J("error");
        if (A0J != null && this.A00 != null) {
            this.A00.A00(A0J.A0A("code", 0));
        }
    }

    public void AYG(C28371Vv r2, String str) {
        Log.i("successfully set member add mode");
    }
}
