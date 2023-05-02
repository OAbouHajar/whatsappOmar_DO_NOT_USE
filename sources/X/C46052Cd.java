package X;

import android.widget.Button;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import com.obwhatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment;
import com.obwhatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment;
import com.obwhatsapp.DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment;

/* renamed from: X.2Cd  reason: invalid class name and case insensitive filesystem */
public class C46052Cd {
    public static boolean A00(C14600pS r3) {
        if (r3.AIm() || !(r3 instanceof C14550pN)) {
            return false;
        }
        if (r3 instanceof AnonymousClass5MP) {
            ((C14550pN) ((AnonymousClass5MP) r3)).Ac1();
        }
        C14550pN r2 = (C14550pN) r3;
        DialogFragment A2C = r2.A2C(DeviceConfirmationRegAlertDialogFragment.class);
        if (A2C instanceof DeviceConfirmationRegAlertDialogFragment) {
            A2C.A1C();
        }
        r2.A2e("DoNotShareCodeDialogTag");
        r3.Afc(new DisplayExceptionDialogFactory$LoginFailedDialogFragment());
        return true;
    }

    public static boolean A01(C14600pS r5, C28951Zk r6) {
        if (r5 == null || r5.AIm() || !(r5 instanceof C14550pN) || !(!(r5 instanceof AnonymousClass2FK))) {
            return false;
        }
        DialogFragment A2C = ((C14550pN) r5).A2C(DeviceConfirmationRegAlertDialogFragment.class);
        if (A2C instanceof DeviceConfirmationRegAlertDialogFragment) {
            DeviceConfirmationRegAlertDialogFragment deviceConfirmationRegAlertDialogFragment = (DeviceConfirmationRegAlertDialogFragment) A2C;
            Button button = deviceConfirmationRegAlertDialogFragment.A02;
            if (button != null) {
                button.setVisibility(4);
            }
            Button button2 = deviceConfirmationRegAlertDialogFragment.A01;
            if (button2 != null) {
                button2.setVisibility(4);
            }
            C004601z.A0E(deviceConfirmationRegAlertDialogFragment.A00, R.id.move_device_alert_info_and_buttons).setVisibility(4);
            C004601z.A0E(deviceConfirmationRegAlertDialogFragment.A00, R.id.loading_icon_and_message_layout).setVisibility(0);
            deviceConfirmationRegAlertDialogFragment.A00.postDelayed(new RunnableRunnableShape10S0200000_I0_8(deviceConfirmationRegAlertDialogFragment, 22, r6), 1000);
            return true;
        }
        r5.Afc(new DeviceConfirmationRegAlertDialogFragment(r6));
        return true;
    }

    public static boolean A02(C14600pS r2, C19090xk r3, C14770pj r4) {
        if (r2.AIm() || !(r2 instanceof C14550pN)) {
            return false;
        }
        r4.A03 = true;
        r3.A0D(true);
        r2.Afc(new DisplayExceptionDialogFactory$ClockWrongDialogFragment());
        return true;
    }

    public static boolean A03(C14600pS r2, C19090xk r3, C14770pj r4) {
        if (r2.AIm() || !(r2 instanceof C14550pN)) {
            return false;
        }
        r4.A03 = true;
        r3.A0D(true);
        r2.Afc(new DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment());
        return true;
    }
}
