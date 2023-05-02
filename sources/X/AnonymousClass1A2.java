package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1A2  reason: invalid class name */
public class AnonymousClass1A2 implements AnonymousClass1A0 {
    public final C15860rz A00;
    public final C19760yx A01;

    public AnonymousClass1A2(C15860rz r1, C19760yx r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void AHM(String str) {
        C19760yx r5 = this.A01;
        Log.i("registrationmanager/post-registration-notification/");
        r5.A0N.A03(20, (String) null);
        C15860rz r4 = r5.A0O;
        r4.A0K().putLong("post_reg_notification_time", r5.A0L.A00()).apply();
        SharedPreferences.Editor A0K = r4.A0K();
        A0K.putBoolean("show_post_reg_logged_out_dialog", true);
        A0K.apply();
        SharedPreferences.Editor A0K2 = r4.A0K();
        A0K2.remove("show_pre_reg_do_not_share_code_warning");
        A0K2.apply();
        r5.A05();
    }

    public boolean AfF(Long l2, String str) {
        boolean equals = "PostRegSMBTakeover".equals(str);
        boolean equals2 = "PostRegistration".equals(str);
        AnonymousClass01D r3 = this.A00.A01;
        if ((((SharedPreferences) r3.get()).getInt("migration_state_on_provider_side", 0) != 1 || !equals) && equals2) {
            if (l2 == null || TimeUnit.MILLISECONDS.toSeconds(l2.longValue()) >= ((SharedPreferences) r3.get()).getLong("last_login_time", -1) + 60) {
                return true;
            }
            Log.i("registrationmanager/post-registration-notification/notification-delayed");
        }
        return false;
    }
}
