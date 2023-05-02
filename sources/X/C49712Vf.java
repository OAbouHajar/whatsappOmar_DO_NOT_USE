package X;

import android.app.ProgressDialog;
import com.facebook.redex.IDxAListenerShape289S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel;
import com.obwhatsapp.deviceauth.BiometricAuthPlugin;

/* renamed from: X.2Vf  reason: invalid class name and case insensitive filesystem */
public class C49712Vf {
    public ProgressDialog A00;
    public final C16300so A01;
    public final C14870pt A02;
    public final C14530pL A03;
    public final AnonymousClass2UN A04;
    public final LinkedDevicesSharedViewModel A05;
    public final AnonymousClass01V A06;
    public final AnonymousClass15X A07;
    public final BiometricAuthPlugin A08;
    public final C14710pd A09;
    public final AnonymousClass15V A0A;
    public final C226918x A0B;

    public C49712Vf(C16300so r11, C14870pt r12, C14530pL r13, AnonymousClass2UN r14, AnonymousClass01V r15, AnonymousClass15X r16, C14710pd r17, AnonymousClass15V r18, C226918x r19) {
        C14710pd r7 = r17;
        this.A09 = r7;
        this.A02 = r12;
        this.A01 = r11;
        this.A0A = r18;
        this.A06 = r15;
        this.A07 = r16;
        this.A0B = r19;
        C14530pL r2 = r13;
        this.A03 = r13;
        this.A05 = (LinkedDevicesSharedViewModel) new C006602z(r13).A01(LinkedDevicesSharedViewModel.class);
        this.A08 = new BiometricAuthPlugin(r2, r11, r12, r15, new IDxAListenerShape289S0100000_2_I0(this, 0), r7, R.string.str0c47, 0);
        this.A04 = r14;
    }

    public void A00(int i2) {
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = this.A05;
        if (i2 == -1 || i2 == 4) {
            ((linkedDevicesSharedViewModel.A00 != 1 || !linkedDevicesSharedViewModel.A0I.A0E(C16620tM.A02, 2734)) ? linkedDevicesSharedViewModel.A0S : linkedDevicesSharedViewModel.A0R).A0B((Object) null);
        }
    }
}
