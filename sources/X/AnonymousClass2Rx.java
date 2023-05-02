package X;

import android.os.SystemClock;
import com.obwhatsapp.accountsync.ProfileActivity;

/* renamed from: X.2Rx  reason: invalid class name */
public class AnonymousClass2Rx extends C16690tT {
    public final /* synthetic */ ProfileActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Rx(ProfileActivity profileActivity) {
        super(profileActivity, true);
        this.A00 = profileActivity;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ProfileActivity profileActivity;
        int i2 = 0;
        while (true) {
            profileActivity = this.A00;
            if (profileActivity.A05.A13) {
                if (i2 >= 45000) {
                    break;
                }
                i2 += 200;
                SystemClock.sleep(200);
            } else if (i2 < 45000) {
                return null;
            }
        }
        if (!profileActivity.A05.A13) {
            return null;
        }
        profileActivity.A05.A0C(3);
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        ProfileActivity profileActivity = this.A00;
        AnonymousClass29T.A00(profileActivity, 104);
        profileActivity.A39();
    }
}
