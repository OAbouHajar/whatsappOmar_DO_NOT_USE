package X;

import com.obwhatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel;

/* renamed from: X.51c  reason: invalid class name and case insensitive filesystem */
public class C1033651c implements AnonymousClass5S6 {
    public final /* synthetic */ NewDeviceConfirmationRegistrationViewModel A00;

    public C1033651c(NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel) {
        this.A00 = newDeviceConfirmationRegistrationViewModel;
    }

    public /* bridge */ /* synthetic */ void AOt(Object obj) {
        C30801cy r1;
        int i2;
        int i3;
        C84834Mb r7 = (C84834Mb) obj;
        int i4 = r7.A00;
        if (i4 == 2) {
            NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel = this.A00;
            String str = newDeviceConfirmationRegistrationViewModel.A00;
            AnonymousClass00B.A06(str);
            String str2 = newDeviceConfirmationRegistrationViewModel.A01;
            AnonymousClass00B.A06(str2);
            newDeviceConfirmationRegistrationViewModel.A07(str, str2, r7.A01, r7.A03);
            return;
        }
        if (i4 == 1) {
            r1 = this.A00.A0H;
            i3 = 3;
        } else if (i4 == 11) {
            r1 = this.A00.A0H;
            i3 = 5;
        } else {
            if (i4 == 12) {
                if (AnonymousClass2JN.A02(r7.A02, -1) > 0) {
                    r1 = this.A00.A0H;
                    i3 = 6;
                }
            } else if (i4 == 10) {
                this.A00.A06();
                return;
            } else if (i4 == 14) {
                r1 = this.A00.A0H;
                i3 = 7;
            }
            r1 = this.A00.A0H;
            i2 = 4;
            r1.A09(i2);
        }
        i2 = Integer.valueOf(i3);
        r1.A09(i2);
    }

    public void AQR(int i2) {
        C13680ns.A1P(this.A00.A0H, 4);
    }
}
