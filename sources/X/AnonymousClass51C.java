package X;

import com.whatsapp.util.Log;

/* renamed from: X.51C  reason: invalid class name */
public class AnonymousClass51C implements C19550yc {
    public final AnonymousClass2Dh A00;
    public final C17190ug A01;

    public AnonymousClass51C(AnonymousClass2Dh r1, C17190ug r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void APb(String str) {
        Log.e("error delivering blocking chat psa");
        this.A00.APY();
    }

    public void AQe(C28371Vv r3, String str) {
        int A002 = C34451kH.A00(r3);
        Log.e(C13680ns.A0c(A002, "error blocking chat psa "));
        this.A00.AQR(A002);
    }

    public void AYG(C28371Vv r2, String str) {
        Log.i("success setting block status for chat psa");
        this.A00.AY9(r2);
    }
}
