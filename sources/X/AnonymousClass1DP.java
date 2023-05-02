package X;

import com.whatsapp.util.Log;

/* renamed from: X.1DP  reason: invalid class name */
public class AnonymousClass1DP {
    public final AnonymousClass1DO A00;
    public final C18260wP A01;
    public final C15860rz A02;
    public final AnonymousClass16S A03;

    public AnonymousClass1DP(AnonymousClass1DO r1, C18260wP r2, C15860rz r3, AnonymousClass16S r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final synchronized void A00() {
        Log.i("MDOptInInitializer/Opting In");
        this.A02.A0K().putBoolean("md_opt_in_show_forced_dialog", true).apply();
        C15860rz r1 = this.A00.A01;
        if (!r1.A1d()) {
            r1.A0K().putBoolean("companion_reg_opt_in_enabled", true).apply();
        }
    }
}
