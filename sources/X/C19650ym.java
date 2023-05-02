package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0ym  reason: invalid class name and case insensitive filesystem */
public class C19650ym {
    public final C16980tz A00;
    public final C20020zN A01;
    public final C16900tq A02;

    public C19650ym(C16980tz r1, C20020zN r2, C16900tq r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public C34121jj A00() {
        C34121jj r1;
        C16900tq r3 = this.A02;
        r3.A04();
        ReentrantReadWriteLock.WriteLock writeLock = r3.A07;
        writeLock.lock();
        try {
            Log.i("msgstore-manager/initialize");
            synchronized (r3) {
                if (!r3.A01) {
                    r3.A05();
                    r3.A06();
                    r1 = new C34121jj(2);
                } else {
                    r1 = new C34121jj(0);
                }
            }
            writeLock.unlock();
            return r1;
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    public void A01() {
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore-manager/finish/db-is-ready ");
            C16900tq r1 = this.A02;
            r1.A04();
            sb.append(r1.A01);
            Log.i(sb.toString());
            r1.A04();
            if (!r1.A01) {
                Log.w("msgstore-manager/finish/db is not ready yet", new Throwable());
            } else {
                r1.A00 = true;
            }
        }
    }

    public void A02() {
        C16900tq r2 = this.A02;
        r2.A04();
        r2.A04.A02 = true;
        r2.A04();
        r2.A05();
        try {
            Context context = this.A00.A00;
            Intent intent = new Intent(context, Class.forName("com.obwhatsapp.Main"));
            intent.setFlags(268468224);
            context.startActivity(intent);
            this.A01.A05("MessageStoreLifecycleManager");
        } catch (ClassNotFoundException e2) {
            Log.e((Throwable) e2);
        }
    }
}
