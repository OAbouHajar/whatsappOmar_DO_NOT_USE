package X;

import com.facebook.redex.RunnableRunnableShape19S0100000_I1_2;
import com.whatsapp.util.Log;

/* renamed from: X.51L  reason: invalid class name */
public class AnonymousClass51L implements C19550yc {
    public AnonymousClass4F2 A00;
    public final C16300so A01;
    public final C14870pt A02;
    public final C16040sK A03;
    public final C18260wP A04;
    public final C17190ug A05;

    public AnonymousClass51L(C16300so r1, C14870pt r2, C16040sK r3, C18260wP r4, C17190ug r5) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = r4;
    }

    public void APb(String str) {
        Log.e("DeleteBusinessActivityReportProtocolHelper/delivery-error");
        if (this.A00 != null) {
            this.A02.Acq(new RunnableRunnableShape19S0100000_I1_2(this, 35));
        }
    }

    public void AQe(C28371Vv r5, String str) {
        Log.e("DeleteBusinessActivityReport/onError");
        if (this.A00 != null) {
            this.A02.Acq(new RunnableRunnableShape19S0100000_I1_2(this, 34));
        }
        this.A01.AcB("DeleteBusinessActivityReport/delete business activity error", AnonymousClass000.A0l(AnonymousClass000.A0r("error_code="), C34451kH.A00(r5)), true);
    }

    public void AYG(C28371Vv r4, String str) {
        if (this.A00 != null) {
            this.A02.Acq(new RunnableRunnableShape19S0100000_I1_2(this, 36));
        }
    }
}
