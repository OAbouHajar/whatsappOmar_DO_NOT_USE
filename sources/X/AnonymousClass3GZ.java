package X;

import com.facebook.redex.RunnableRunnableShape15S0200000_I1_3;
import com.facebook.redex.RunnableRunnableShape19S0100000_I1_2;
import com.facebook.redex.RunnableRunnableShape1S0100100_I1;
import com.facebook.redex.RunnableRunnableShape1S0101000_I1;
import com.whatsapp.util.Log;

/* renamed from: X.3GZ  reason: invalid class name */
public class AnonymousClass3GZ implements C19550yc {
    public AnonymousClass4F1 A00;
    public final C16300so A01;
    public final C14870pt A02;
    public final C16040sK A03;
    public final C18260wP A04;
    public final C16440t3 A05;
    public final C17190ug A06;

    public AnonymousClass3GZ(C16300so r1, C14870pt r2, C16040sK r3, C18260wP r4, C16440t3 r5, C17190ug r6) {
        this.A05 = r5;
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A06 = r6;
        this.A04 = r4;
    }

    public void APb(String str) {
        Log.e("GetBusinessActivityReportProtocolHelper/delivery-error");
    }

    public void AQe(C28371Vv r6, String str) {
        Log.e("GetBusinessActivityReportProtocolHelper/onError");
        int A002 = C34451kH.A00(r6);
        if (this.A00 != null) {
            this.A02.Acq(new RunnableRunnableShape1S0101000_I1((Object) this, A002, 15));
        }
        this.A01.AcB("GetBusinessActivityReportProtocolHelper/get business activity error", C13680ns.A0c(A002, "error_code="), true);
    }

    public void AYG(C28371Vv r28, String str) {
        C14870pt r3;
        int i2;
        C28371Vv A0J = r28.A0J("p2b");
        if (A0J != null) {
            C28371Vv A0J2 = A0J.A0J("report");
            if (A0J2 != null && this.A00 != null) {
                C28371Vv A0J3 = A0J2.A0J("url");
                C28371Vv A0J4 = A0J2.A0J("direct_path");
                C28371Vv A0J5 = A0J2.A0J("file_name");
                C28371Vv A0J6 = A0J2.A0J("file_length");
                C28371Vv A0J7 = A0J2.A0J("media_key");
                C28371Vv A0J8 = A0J2.A0J("file_sha256");
                C28371Vv A0J9 = A0J2.A0J("file_enc_sha256");
                if (A0J3 == null || A0J5 == null || A0J6 == null || A0J8 == null || A0J9 == null || A0J7 == null || A0J4 == null) {
                    r3 = this.A02;
                    i2 = 38;
                } else {
                    long A012 = C29501aj.A01(A0J6.A0L(), 0);
                    String A0L = A0J3.A0L();
                    String A0L2 = A0J4.A0L();
                    AnonymousClass00B.A06(A0L2);
                    String A0L3 = A0J5.A0L();
                    AnonymousClass00B.A06(A0L3);
                    String A0L4 = A0J7.A0L();
                    AnonymousClass00B.A06(A0L4);
                    String A0L5 = A0J8.A0L();
                    AnonymousClass00B.A06(A0L5);
                    String A0L6 = A0J9.A0L();
                    AnonymousClass00B.A06(A0L6);
                    this.A02.Acq(new RunnableRunnableShape15S0200000_I1_3(this, 10, new C35051lI(A0L, A0L2, A0L3, A0L4, A0L5, A0L6, A012, A0J2.A0D("creation", 0) * 1000, A0J2.A0D("expiration", (this.A05.A00() + 2592000000L) / 1000) * 1000)));
                    return;
                }
            } else if (this.A00 != null) {
                this.A02.Acq(new RunnableRunnableShape1S0100100_I1(this, A0J.A0D("timestamp", 0) * 1000, 4));
                return;
            } else {
                return;
            }
        } else if (this.A00 != null) {
            r3 = this.A02;
            i2 = 37;
        } else {
            return;
        }
        r3.Acq(new RunnableRunnableShape19S0100000_I1_2(this, i2));
    }
}
