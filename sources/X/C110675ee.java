package X;

import android.os.Build;
import com.obwhatsapp.R;
import com.obwhatsapp.authentication.FingerprintBottomSheet;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.5ee  reason: invalid class name and case insensitive filesystem */
public abstract class C110675ee extends C003401n {
    public final AnonymousClass027 A00 = C13690nt.A0O();
    public final AnonymousClass027 A01 = C13690nt.A0O();
    public final AnonymousClass027 A02 = C13690nt.A0O();
    public final AnonymousClass027 A03 = C13690nt.A0O();
    public final C16440t3 A04;
    public final C119285wq A05;
    public final AnonymousClass5xG A06;
    public final AnonymousClass5wV A07;
    public final C118915vc A08;

    public C110675ee(C16440t3 r2, C119285wq r3, AnonymousClass5xG r4, AnonymousClass5wV r5, C118915vc r6) {
        this.A04 = r2;
        this.A07 = r5;
        this.A08 = r6;
        this.A06 = r4;
        this.A05 = r3;
    }

    public void A05(C14530pL r13, FingerprintBottomSheet fingerprintBottomSheet, C118385ub r15, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, String str, String str2, String str3) {
        C16440t3 r8 = this.A04;
        C118915vc r11 = this.A08;
        C14530pL r6 = r13;
        FingerprintBottomSheet fingerprintBottomSheet2 = fingerprintBottomSheet;
        fingerprintBottomSheet.A05 = new C111575gb(r6, fingerprintBottomSheet2, r8, r15, new C1204861v(r13, fingerprintBottomSheet, pinBottomSheetDialogFragment, this, str, str2, str3), r11);
        r13.Afc(fingerprintBottomSheet);
    }

    public void A06(C14530pL r18, FingerprintBottomSheet fingerprintBottomSheet, C118385ub r20, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, String str, String str2, String str3) {
        C14530pL r3 = r18;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment2 = pinBottomSheetDialogFragment;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (Build.VERSION.SDK_INT >= 23) {
            AnonymousClass5xG r1 = this.A06;
            if (r1.A05() && r1.A01() == 1) {
                A05(r3, fingerprintBottomSheet, r20, pinBottomSheetDialogFragment2, str4, str5, str6);
                return;
            }
        }
        pinBottomSheetDialogFragment2.A0C = new C1205161y(r3, pinBottomSheetDialogFragment2, this, str5, str6, str4);
        r3.Afc(pinBottomSheetDialogFragment2);
    }

    public boolean A07(AnonymousClass2HJ r8, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, String str) {
        int i2 = r8.A00;
        if (i2 != 1440 && i2 != 444 && i2 != 478 && i2 != 1441 && i2 != 445 && i2 != 1448 && i2 != 10718) {
            return false;
        }
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A1N();
        }
        int i3 = r8.A00;
        if (i3 != 1440) {
            if (i3 != 1441) {
                if (i3 == 1448) {
                    this.A05.A03(r8, str, "PIN");
                } else if (i3 == 478 || i3 == 444) {
                    this.A05.A01.A01(str, "PIN");
                }
                if (pinBottomSheetDialogFragment != null) {
                    pinBottomSheetDialogFragment.A1D();
                }
                this.A03.A09(r8);
                return true;
            }
            C118915vc r2 = this.A08;
            long j2 = r8.A02;
            r2.A02(j2);
            if (pinBottomSheetDialogFragment == null) {
                return true;
            }
            C110115dX.A12(pinBottomSheetDialogFragment, j2);
            return true;
        } else if (pinBottomSheetDialogFragment == null) {
            return true;
        } else {
            pinBottomSheetDialogFragment.A1P(r8.A01, R.plurals.plurals0102);
            return true;
        }
    }
}
