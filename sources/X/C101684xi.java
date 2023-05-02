package X;

import android.os.Build;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;

/* renamed from: X.4xi  reason: invalid class name and case insensitive filesystem */
public class C101684xi implements C32301g2 {
    public final /* synthetic */ C001000l A00;
    public final /* synthetic */ AnonymousClass1MV A01;

    public C101684xi(C001000l r1, AnonymousClass1MV r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void AVg(String str) {
        C101704xk.A00(this.A00);
    }

    public void AVh() {
        C001000l r4 = this.A00;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = R.string.str1238;
        if (i2 >= 30) {
            i3 = R.string.str123e;
            if (i2 < 33) {
                i3 = R.string.str123d;
            }
        }
        RequestPermissionActivity.A0K(r4, R.string.str123c, i3);
    }

    public void AZJ(String str) {
        C101704xk.A00(this.A00);
    }

    public void AZK() {
        C001000l r4 = this.A00;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = R.string.str1238;
        if (i2 >= 30) {
            i3 = R.string.str123e;
            if (i2 < 33) {
                i3 = R.string.str123d;
            }
        }
        RequestPermissionActivity.A0K(r4, R.string.str123c, i3);
    }
}
