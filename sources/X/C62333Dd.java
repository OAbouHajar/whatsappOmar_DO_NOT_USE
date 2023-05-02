package X;

import com.obwhatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity;
import com.obwhatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel;

/* renamed from: X.3Dd  reason: invalid class name and case insensitive filesystem */
public class C62333Dd implements AnonymousClass04o {
    public final /* synthetic */ DeviceConfirmationRegistrationActivity A00;

    public C62333Dd(DeviceConfirmationRegistrationActivity deviceConfirmationRegistrationActivity) {
        this.A00 = deviceConfirmationRegistrationActivity;
    }

    public C003401n A6s(Class cls) {
        DeviceConfirmationRegistrationActivity deviceConfirmationRegistrationActivity = this.A00;
        C51062au r0 = deviceConfirmationRegistrationActivity.A01;
        C19950zG r13 = deviceConfirmationRegistrationActivity.A0D;
        AnonymousClass013 r11 = deviceConfirmationRegistrationActivity.A01;
        C16150sX r02 = r0.A00.A03;
        C16440t3 A0U = C16150sX.A0U(r02);
        C16980tz A0V = C16150sX.A0V(r02);
        C16320sq A1B = C16150sX.A1B(r02);
        C17220uj A18 = C16150sX.A18(r02);
        AnonymousClass1KQ r12 = (AnonymousClass1KQ) r02.AAL.get();
        C15860rz A0Y = C16150sX.A0Y(r02);
        C19380yL r9 = (C19380yL) r02.AQd.get();
        C26841Pl r18 = (C26841Pl) r02.A0G.get();
        AnonymousClass12L r17 = (AnonymousClass12L) r02.APo.get();
        NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel = new NewDeviceConfirmationRegistrationViewModel(C16150sX.A05(r02), A0U, A0V, r9, A0Y, r11, r12, r13, (C18990xa) r02.ADh.get(), (C19760yx) r02.AKx.get(), (C15960sC) r02.AKz.get(), r17, r18, (AnonymousClass1BN) r02.AAp.get(), (AnonymousClass130) r02.AMn.get(), A18, A1B);
        C15860rz r1 = newDeviceConfirmationRegistrationViewModel.A08;
        newDeviceConfirmationRegistrationViewModel.A00 = r1.A0O();
        newDeviceConfirmationRegistrationViewModel.A01 = r1.A0Q();
        return newDeviceConfirmationRegistrationViewModel;
    }

    public /* synthetic */ C003401n A73(C013806q r2, Class cls) {
        return C013906r.A00(this, cls);
    }
}
