package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.2Zh  reason: invalid class name and case insensitive filesystem */
public class C50392Zh implements C49592Tx {
    public static final AnonymousClass028 A03 = new AnonymousClass027();
    public final Activity A00;
    public final C50372Zf A01;
    public final C50362Ze A02;

    public C50392Zh(Activity activity, C50372Zf r2, C50362Ze r3) {
        this.A00 = activity;
        this.A02 = r3;
        this.A01 = r2;
    }

    public AnonymousClass028 AAL() {
        return A03;
    }

    public AnonymousClass028 AAM() {
        return A03;
    }

    public void AUG() {
    }

    public void AUk() {
    }

    public void AXR(View view) {
        C50362Ze r1 = this.A02;
        r1.A01(this.A00);
        r1.A02(this.A01);
    }

    public void AXv() {
        C50362Ze r2 = this.A02;
        r2.A01.remove(this.A01);
        r2.A00();
    }

    public void Add(View view) {
    }

    public void Adu(boolean z2) {
    }

    public void onGlobalLayout() {
    }
}
