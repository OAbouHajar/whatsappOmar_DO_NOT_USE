package X;

import android.content.SharedPreferences;

/* renamed from: X.20D  reason: invalid class name */
public class AnonymousClass20D {
    public static boolean A00(C16440t3 r10, C15860rz r11, C14710pd r12, C16740tZ r13) {
        C16620tM r1 = C16620tM.A02;
        if (!r12.A0E(r1, 249)) {
            return false;
        }
        if ((!(r13 instanceof C38681rF) && !(r13 instanceof C38721rJ)) || !C16030sJ.A0Q(r13.A11.A00) || r12.A0E(r1, 1116)) {
            return false;
        }
        AnonymousClass01D r8 = r11.A01;
        return (((SharedPreferences) r8.get()).getLong("status_tab_last_opened_time", 0) != 0 && r10.A00() - ((SharedPreferences) r8.get()).getLong("status_tab_last_opened_time", 0) <= 1209600000) || (((SharedPreferences) r8.get()).getLong("registration_initialized_time", 0) > 0 && System.currentTimeMillis() - ((SharedPreferences) r8.get()).getLong("registration_initialized_time", 0) <= 1209600000);
    }
}
