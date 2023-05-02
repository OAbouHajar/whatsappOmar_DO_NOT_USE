package X;

import android.app.Activity;
import android.os.Build;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;

/* renamed from: X.2Jz  reason: invalid class name and case insensitive filesystem */
public class C47692Jz implements C32301g2 {
    public final Activity A00;
    public final C14730pf A01;

    public C47692Jz(Activity activity, C14730pf r2) {
        this.A00 = activity;
        this.A01 = r2;
    }

    public void AVg(String str) {
        Activity activity = this.A00;
        if (!activity.isFinishing()) {
            AnonymousClass00B.A06(activity);
            C14600pS r3 = (C14600pS) activity;
            boolean A002 = C14730pf.A00();
            int i2 = R.string.str05bb;
            if (A002) {
                i2 = R.string.str05ba;
            }
            r3.Afj(new Object[0], R.string.str073d, i2);
        }
    }

    public void AVh() {
        Activity activity = this.A00;
        AnonymousClass00B.A06(activity);
        int i2 = Build.VERSION.SDK_INT;
        int i3 = R.string.str122c;
        if (i2 >= 30) {
            i3 = R.string.str122f;
            if (i2 < 33) {
                i3 = R.string.str122e;
            }
        }
        RequestPermissionActivity.A0K(activity, R.string.str122d, i3);
    }

    public void AZJ(String str) {
        Activity activity = this.A00;
        if (!activity.isFinishing()) {
            AnonymousClass00B.A06(activity);
            C14600pS r3 = (C14600pS) activity;
            boolean A002 = C14730pf.A00();
            int i2 = R.string.str05b9;
            if (A002) {
                i2 = R.string.str05b8;
            }
            r3.Afj(new Object[0], R.string.str073d, i2);
        }
    }

    public void AZK() {
        Activity activity = this.A00;
        AnonymousClass00B.A06(activity);
        int i2 = Build.VERSION.SDK_INT;
        int i3 = R.string.str122c;
        if (i2 >= 30) {
            i3 = R.string.str122f;
            if (i2 < 33) {
                i3 = R.string.str122e;
            }
        }
        RequestPermissionActivity.A0K(activity, R.string.str122d, i3);
    }
}
