package X;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;

/* renamed from: X.1PD  reason: invalid class name */
public class AnonymousClass1PD {
    public final C14870pt A00;
    public final C15900s5 A01;
    public final C16260sj A02;
    public final AnonymousClass013 A03;
    public final C14730pf A04;

    public AnonymousClass1PD(C14870pt r1, C15900s5 r2, C16260sj r3, AnonymousClass013 r4, C14730pf r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }

    public void A00() {
        int A022 = this.A01.A02(C15910s6.A1y);
        this.A00.A0H(this.A03.A0J(new Object[]{Integer.valueOf(A022)}, R.plurals.plurals0181, (long) A022), 1);
    }

    public void A01(C14550pN r5) {
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
            boolean A002 = C14730pf.A00();
            int i2 = R.string.str0dc1;
            if (A002) {
                i2 = R.string.str0dc0;
            }
            r5.Afg(i2);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            C16260sj r2 = this.A02;
            Context applicationContext = r5.getApplicationContext();
            C18450wi.A0H(applicationContext, 0);
            if (r2.A04(C28971Zm.A00(applicationContext, false, false)) == -1) {
                int i4 = R.string.str1216;
                if (i3 >= 30) {
                    i4 = R.string.str1262;
                    if (i3 < 33) {
                        i4 = R.string.str1261;
                    }
                }
                RequestPermissionActivity.A0K(r5, R.string.str1260, i4);
                return;
            }
        }
        boolean A003 = C14730pf.A00();
        int i5 = R.string.str092f;
        if (A003) {
            i5 = R.string.str092e;
        }
        r5.Afg(i5);
    }

    public void A02(C14550pN r6) {
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
            C14870pt r2 = this.A00;
            boolean A002 = C14730pf.A00();
            int i2 = R.string.str0dc1;
            if (A002) {
                i2 = R.string.str0dc0;
            }
            r2.A09(i2, 1);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            C16260sj r22 = this.A02;
            Context applicationContext = r6.getApplicationContext();
            C18450wi.A0H(applicationContext, 0);
            if (r22.A04(C28971Zm.A00(applicationContext, false, false)) == -1) {
                int i4 = R.string.str1216;
                if (i3 >= 30) {
                    i4 = R.string.str1262;
                    if (i3 < 33) {
                        i4 = R.string.str1261;
                    }
                }
                RequestPermissionActivity.A0K(r6, R.string.str1260, i4);
                return;
            }
        }
        C14870pt r23 = this.A00;
        boolean A003 = C14730pf.A00();
        int i5 = R.string.str092f;
        if (A003) {
            i5 = R.string.str092e;
        }
        r23.A09(i5, 1);
    }
}
