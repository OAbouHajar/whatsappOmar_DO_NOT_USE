package X;

import android.view.View;
import com.obwhatsapp.R;

/* renamed from: X.3Eg  reason: invalid class name and case insensitive filesystem */
public class C62613Eg implements AnonymousClass5SS {
    public View A00;
    public String A01;
    public final C19980zJ A02;
    public final AnonymousClass1VI A03;
    public final C15860rz A04;
    public final C16490t9 A05;
    public final AnonymousClass01J A06;

    public C62613Eg(C19980zJ r1, AnonymousClass1VI r2, C15860rz r3, C16490t9 r4, AnonymousClass01J r5) {
        this.A05 = r4;
        this.A02 = r1;
        this.A03 = r2;
        this.A04 = r3;
        this.A06 = r5;
    }

    public void AHm() {
        C13680ns.A13(this.A00);
    }

    public boolean AfA() {
        AnonymousClass1VJ r0 = (AnonymousClass1VJ) this.A06.get();
        if (r0 == null) {
            return false;
        }
        long j2 = r0.A01;
        long j3 = r0.A00;
        C15860rz r8 = this.A04;
        int i2 = (j3 > (j2 > 5000000000L ? 500000000 : (long) (((float) (j2 * ((long) ((int) ((((float) 500000000) * 100.0f) / 5.0E9f))))) / 100.0f)) ? 1 : (j3 == (j2 > 5000000000L ? 500000000 : (long) (((float) (j2 * ((long) ((int) ((((float) 500000000) * 100.0f) / 5.0E9f))))) / 100.0f)) ? 0 : -1));
        boolean z2 = false;
        if (i2 <= 0) {
            z2 = true;
        }
        AnonymousClass01D r3 = r8.A01;
        if (C13680ns.A0C(r3).getBoolean("storage_usage_banner_dismissed", false)) {
            if (!z2) {
                C13680ns.A0z(r8.A0K(), "storage_usage_banner_dismissed", false);
                return false;
            }
        } else if (!z2) {
            return false;
        }
        return !C13680ns.A0C(r3).getBoolean("storage_usage_banner_dismissed", false);
    }

    public void AhG() {
        if (this.A01 == null) {
            this.A01 = AnonymousClass4Y3.A00(this.A05, 3);
        }
        if (this.A00 == null) {
            AnonymousClass1VI r2 = this.A03;
            View A0H = C13680ns.A0H(C13680ns.A0G(r2), r2, R.layout.layout0591);
            this.A00 = A0H;
            C13680ns.A1A(A0H, this, 37);
            C13680ns.A1A(C004601z.A0E(this.A00, R.id.storage_usage_full_close_container), this, 38);
            r2.addView(this.A00);
        }
        View view = this.A00;
        AnonymousClass00B.A04(view);
        view.setVisibility(0);
        this.A00.setBackgroundResource(R.color.color0845);
    }
}
