package X;

import android.content.SharedPreferences;
import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: X.4mi  reason: invalid class name and case insensitive filesystem */
public class C95484mi implements C12680kn {
    public final /* synthetic */ C06240Uy A00;
    public final /* synthetic */ C15860rz A01;

    public C95484mi(C06240Uy r1, C15860rz r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void ASH(int i2) {
        long A002;
        try {
            AnonymousClass0QB A012 = this.A00.A01();
            String A013 = A012.A01();
            String substring = (A013 == null || A013.indexOf("invite_code=") != 0) ? null : A013.substring(12);
            if (!TextUtils.isEmpty(substring)) {
                C15860rz r6 = this.A01;
                AnonymousClass01D r2 = r6.A01;
                if (((SharedPreferences) r2.get()).getString("invite_code_from_referrer", (String) null) == null) {
                    A002 = A012.A00();
                } else if (((SharedPreferences) r2.get()).getLong("referrer_clicked_time", 0) <= A012.A00()) {
                    A002 = A012.A00();
                }
                r6.A0K().putString("invite_code_from_referrer", substring).apply();
                r6.A0K().putLong("referrer_clicked_time", A002).apply();
            }
            C15860rz r1 = this.A01;
            TextUtils.isEmpty(A012.A01());
            r1.A0K().putString("smb_app_install_source", "unknown|unknown").apply();
        } catch (RemoteException unused) {
        } catch (Throwable th) {
            this.A00.A02();
            throw th;
        }
        this.A00.A02();
    }
}
