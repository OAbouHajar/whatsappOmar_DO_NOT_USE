package X;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;

/* renamed from: X.4ax  reason: invalid class name and case insensitive filesystem */
public final class C88704ax {
    public static C88704ax A03;
    public GoogleSignInAccount A00;
    public GoogleSignInOptions A01;
    public final C90484eD A02;

    public C88704ax(Context context) {
        C90484eD A002 = C90484eD.A00(context);
        this.A02 = A002;
        this.A00 = A002.A02();
        this.A01 = A002.A03();
    }

    public static synchronized C88704ax A00(Context context) {
        C88704ax r0;
        synchronized (C88704ax.class) {
            Context applicationContext = context.getApplicationContext();
            r0 = A03;
            if (r0 == null) {
                r0 = new C88704ax(applicationContext);
                A03 = r0;
            }
        }
        return r0;
    }

    /* JADX INFO: finally extract failed */
    public final synchronized void A01() {
        C90484eD r0 = this.A02;
        Lock lock = r0.A01;
        lock.lock();
        try {
            r0.A00.edit().clear().apply();
            lock.unlock();
            this.A00 = null;
            this.A01 = null;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }
}
