package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.obwhatsapp.R;
import com.obwhatsapp.registration.PreRegNotificationLearnMoreReceiver;
import com.whatsapp.util.Log;

/* renamed from: X.1A1  reason: invalid class name */
public class AnonymousClass1A1 implements AnonymousClass1A0 {
    public final C19760yx A00;

    public AnonymousClass1A1(C19760yx r1) {
        this.A00 = r1;
    }

    public void AHM(String str) {
        C19760yx r5 = this.A00;
        if (!r5.A0j.A01()) {
            Log.i("registrationmanager/pre-registration-notification/not-verified");
            return;
        }
        Log.i("registrationmanager/pre-registration-notification");
        Context context = r5.A0M.A00;
        String string = context.getString(R.string.str1cf7);
        SharedPreferences.Editor A0K = r5.A0O.A0K();
        A0K.putBoolean("show_pre_reg_do_not_share_code_warning", true);
        A0K.apply();
        C007503l A02 = r5.A02(string, context.getString(R.string.str0e54), context.getString(R.string.str0e55, new Object[]{string}));
        A02.A0N.add(new AnonymousClass04E(R.drawable.ic_link, context.getString(R.string.str1cf6), C42341xd.A01(context, 0, new Intent(context, PreRegNotificationLearnMoreReceiver.class), 268435456)));
        r5.A0N.A02(20, A02.A01());
    }

    public boolean AfF(Long l2, String str) {
        return "PreRegistration".equalsIgnoreCase(str);
    }
}
