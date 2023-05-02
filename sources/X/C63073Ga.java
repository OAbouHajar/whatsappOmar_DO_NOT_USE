package X;

import com.facebook.redex.RunnableRunnableShape19S0100000_I1_2;
import com.facebook.redex.RunnableRunnableShape1S0100100_I1;
import com.facebook.redex.RunnableRunnableShape1S0101000_I1;
import com.whatsapp.util.Log;

/* renamed from: X.3Ga  reason: invalid class name and case insensitive filesystem */
public class C63073Ga implements C19550yc {
    public AnonymousClass4F0 A00;
    public final C16300so A01;
    public final C14870pt A02;
    public final C16040sK A03;
    public final C18260wP A04;
    public final AnonymousClass013 A05;
    public final C17190ug A06;

    public C63073Ga(C16300so r1, C14870pt r2, C16040sK r3, C18260wP r4, AnonymousClass013 r5, C17190ug r6) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A06 = r6;
        this.A05 = r5;
        this.A04 = r4;
    }

    public void APb(String str) {
        Log.e("RequestBusinessActivityReportProtocolHelper/delivery-error");
        if (this.A00 != null) {
            this.A02.Acq(new RunnableRunnableShape19S0100000_I1_2(this, 40));
        }
    }

    public void AQe(C28371Vv r6, String str) {
        Log.e("RequestBusinessActivityReportProtocolHelper/onError");
        int A002 = C34451kH.A00(r6);
        if (this.A00 != null) {
            this.A02.Acq(new RunnableRunnableShape1S0101000_I1((Object) this, A002, 16));
        }
        this.A01.AcB("RequestBusinessActivityReportProtocolHelper/get business activity error", C13680ns.A0c(A002, "error_code="), true);
    }

    public void AYG(C28371Vv r6, String str) {
        C28371Vv A0J = r6.A0J("p2b");
        if (A0J != null) {
            long A0D = A0J.A0D("timestamp", 0) * 1000;
            if (this.A00 != null) {
                this.A02.Acq(new RunnableRunnableShape1S0100100_I1(this, A0D, 5));
            }
        } else if (this.A00 != null) {
            this.A02.Acq(new RunnableRunnableShape19S0100000_I1_2(this, 39));
        }
    }
}
