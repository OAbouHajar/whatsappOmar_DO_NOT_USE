package X;

import android.app.Activity;
import android.content.SharedPreferences;
import com.facebook.redex.RunnableRunnableShape19S0100000_I1_2;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.3AS  reason: invalid class name */
public class AnonymousClass3AS {
    public final C14870pt A00;
    public final C16440t3 A01;
    public final C26841Pl A02;

    public AnonymousClass3AS(C14870pt r1, C16440t3 r2, C26841Pl r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public static boolean A00(int i2) {
        return i2 == 13 || i2 == 14;
    }

    public CharSequence A01(Activity activity, String str, int i2) {
        int i3;
        String A0d;
        Log.i(C13680ns.A0c(i2, "AccountDefenceVerificationHelper/getAccountDefenceTopDescription for state:"));
        if (i2 == 1 || i2 == 2) {
            i3 = R.string.str0050;
            A0d = C13680ns.A0d(activity, str, new Object[1], 0, i3);
        } else if (i2 != 3) {
            A0d = activity.getString(R.string.str006f);
        } else {
            i3 = R.string.str004f;
            A0d = C13680ns.A0d(activity, str, new Object[1], 0, i3);
        }
        return AnonymousClass2JN.A08(new RunnableRunnableShape19S0100000_I1_2(activity, 29), A0d, "learn-more");
    }

    public void A02(long j2, long j3) {
        C26831Pk r2 = this.A02.A06;
        StringBuilder A0r = AnonymousClass000.A0r("AccountDefenceLocalDataRepository/save-original-wait-time-diffs ");
        A0r.append(j2);
        A0r.append(", ");
        A0r.append(j3);
        C13680ns.A1V(A0r);
        SharedPreferences.Editor edit = r2.A01.A00("AccountDefenceLocalDataRepository_prefs").edit();
        edit.putLong("com.obwhatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_sms_wait_time", j2);
        edit.putLong("com.obwhatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_voice_wait_time", j3);
        if (!edit.commit()) {
            Log.e("AccountDefenceLocalDataRepository/save-original-wait-time-diffs/error");
        }
    }
}
