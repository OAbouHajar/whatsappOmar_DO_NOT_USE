package X;

import com.whatsapp.util.Log;

/* renamed from: X.1iN  reason: invalid class name and case insensitive filesystem */
public class C33311iN implements C33321iO {
    public final /* synthetic */ C19360yJ A00;

    public C33311iN(C19360yJ r1) {
        this.A00 = r1;
    }

    public void AQr(boolean z2) {
        C28421Wa r4;
        C19360yJ r2 = this.A00;
        synchronized (r2) {
            r4 = r2.A00;
        }
        if (r4 != null) {
            int i2 = r2.A06.A01().getInt("syncd_bootstrap_state", 0);
            StringBuilder sb = new StringBuilder("SyncdBootstrapManager/criticalBootstrapFailed currentState: ");
            sb.append(i2);
            Log.i(sb.toString());
            int i3 = 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    i3 = 2;
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                Log.e("SyncdBootstrapManager/criticalBootstrapFailed should never reach here");
                            }
                            r2.A02((C28421Wa) null);
                        }
                    }
                }
                r2.A05.A0B(r4.A02, i3, 0, 0, false);
                r2.A02((C28421Wa) null);
            }
            r2.A05.A0D(r4.A02, i3, false);
            r2.A02((C28421Wa) null);
        }
    }

    public void onSuccess() {
    }
}
