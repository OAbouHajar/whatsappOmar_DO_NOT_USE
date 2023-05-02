package X;

import android.os.CountDownTimer;
import com.obwhatsapp.R;
import com.obwhatsapp.authentication.FingerprintBottomSheet;
import com.obwhatsapp.authentication.FingerprintView;

/* renamed from: X.3Lf  reason: invalid class name and case insensitive filesystem */
public class C63713Lf extends CountDownTimer {
    public final /* synthetic */ long A00;
    public final /* synthetic */ FingerprintBottomSheet A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63713Lf(FingerprintBottomSheet fingerprintBottomSheet, long j2, long j3) {
        super(j2, 1000);
        this.A01 = fingerprintBottomSheet;
        this.A00 = j3;
    }

    public void onFinish() {
        FingerprintBottomSheet fingerprintBottomSheet = this.A01;
        fingerprintBottomSheet.A01 = null;
        if (this.A00 <= fingerprintBottomSheet.A07.A00() && !fingerprintBottomSheet.A09) {
            FingerprintView fingerprintView = fingerprintBottomSheet.A06;
            if (fingerprintView != null) {
                fingerprintView.A02(fingerprintView.A06);
            }
            fingerprintBottomSheet.A1K();
        }
    }

    public void onTick(long j2) {
        FingerprintBottomSheet fingerprintBottomSheet = this.A01;
        FingerprintView fingerprintView = fingerprintBottomSheet.A06;
        if (fingerprintView != null) {
            fingerprintView.A03(C13690nt.A0c(fingerprintBottomSheet, C28961Zl.A04(fingerprintBottomSheet.A08, C13690nt.A09(j2)), C13680ns.A1b(), 0, R.string.str0f8f));
        }
    }
}
