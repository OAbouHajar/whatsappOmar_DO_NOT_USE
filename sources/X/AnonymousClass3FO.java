package X;

import com.obwhatsapp.CircularProgressBar;
import com.obwhatsapp.R;
import com.obwhatsapp.audiopicker.AudioPickerActivity;

/* renamed from: X.3FO  reason: invalid class name */
public class AnonymousClass3FO implements C52032cr {
    public final /* synthetic */ C14550pN A00;
    public final /* synthetic */ C615739l A01;
    public final /* synthetic */ AnonymousClass2DT A02;
    public final /* synthetic */ C38701rH A03;

    public AnonymousClass3FO(C14550pN r1, C615739l r2, AnonymousClass2DT r3, C38701rH r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }

    public C38701rH AC8() {
        return this.A03;
    }

    public void AQF(boolean z2) {
    }

    public void AUS(int i2) {
        this.A01.A01(this.A00, false);
    }

    public void AVL(int i2) {
        C615739l r0 = this.A01;
        CircularProgressBar circularProgressBar = r0.A0A;
        circularProgressBar.setProgress(i2);
        AudioPickerActivity audioPickerActivity = r0.A0C;
        circularProgressBar.setContentDescription(C13680ns.A0d(audioPickerActivity, C28961Zl.A06(audioPickerActivity.A01, (long) i2), C13680ns.A1b(), 0, R.string.str1a50));
    }

    public void AWY() {
        this.A01.A00(this.A00);
    }

    public void AXQ(int i2) {
        this.A02.A0A(0);
        C615739l r1 = this.A01;
        r1.A00(this.A00);
        r1.A0A.setMax(i2);
    }

    public void AXw(int i2, boolean z2) {
        C615739l r2 = this.A01;
        r2.A01(this.A00, true);
        if (z2) {
            r2.A0A.setProgress(0);
        }
        r2.A0C.A0G.A08((AnonymousClass2DT) null);
    }
}
