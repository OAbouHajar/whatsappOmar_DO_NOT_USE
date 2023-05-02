package X;

import com.obwhatsapp.group.GroupSettingsActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4QI  reason: invalid class name */
public class AnonymousClass4QI {
    public final /* synthetic */ GroupSettingsActivity A00;

    public AnonymousClass4QI(GroupSettingsActivity groupSettingsActivity) {
        this.A00 = groupSettingsActivity;
    }

    public void A00(int i2) {
        String str;
        try {
            GroupSettingsActivity groupSettingsActivity = this.A00;
            groupSettingsActivity.A0B.Adz(4, C810546q.A00(groupSettingsActivity.A06, groupSettingsActivity.A0C));
        } catch (Exception e2) {
            Log.e("error setting member add mode", e2);
        }
        if (i2 != 0) {
            int i3 = 3024;
            if (i2 != 403) {
                i3 = 3025;
                if (i2 != 423) {
                    if (i2 == 429 || i2 == 500) {
                        i3 = 3012;
                    } else if (i2 == 400) {
                        str = "bad request when setting member add mode";
                    } else if (i2 == 401) {
                        i3 = 3023;
                    } else {
                        return;
                    }
                }
            }
            C17240ul.A01(i3, (Object) null);
            return;
        }
        str = "unknown error when setting member add mode";
        Log.e(str);
    }
}
