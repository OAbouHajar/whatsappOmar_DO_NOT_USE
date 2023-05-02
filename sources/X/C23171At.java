package X;

import android.app.Activity;
import com.obwhatsapp.RequestPermissionActivity;

/* renamed from: X.1At  reason: invalid class name and case insensitive filesystem */
public class C23171At {
    public final C15900s5 A00;
    public final AnonymousClass12W A01;
    public final C16260sj A02;
    public final C14730pf A03;
    public final C16490t9 A04;

    public C23171At(C15900s5 r1, AnonymousClass12W r2, C16260sj r3, C14730pf r4, C16490t9 r5) {
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public boolean A00(Activity activity, C14600pS r8, C32301g2 r9, int i2) {
        if (!RequestPermissionActivity.A0T(activity, this.A02, i2) || !this.A01.A04(r9)) {
            return false;
        }
        int i3 = (this.A03.A01() > ((long) ((this.A00.A02(C15910s6.A1f) << 10) << 10)) ? 1 : (this.A03.A01() == ((long) ((this.A00.A02(C15910s6.A1f) << 10) << 10)) ? 0 : -1));
        return true;
    }
}
