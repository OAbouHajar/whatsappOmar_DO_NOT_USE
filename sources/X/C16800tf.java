package X;

import android.database.sqlite.SQLiteTransactionListener;
import com.facebook.redex.IDxTListenerShape94S0200000_2_I0;
import com.whatsapp.util.Log;
import java.io.Closeable;
import java.util.AbstractMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0tf  reason: invalid class name and case insensitive filesystem */
public class C16800tf implements Closeable {
    public boolean A00 = false;
    public final C33921jP A01;
    public final C16810tg A02;
    public final ReentrantReadWriteLock.ReadLock A03;

    public C16800tf(C16790te r3, ReentrantReadWriteLock.ReadLock readLock, boolean z2) {
        this.A03 = readLock;
        this.A01 = r3.AE6();
        if (readLock != null) {
            readLock.lock();
            Thread.currentThread().getId();
        }
        if (z2) {
            try {
                this.A02 = r3.AHC();
            } catch (Exception e2) {
                Log.e("DatabaseSession/failed to get database", e2);
                close();
                throw e2;
            }
        } else {
            this.A02 = r3.AFO();
        }
    }

    public C30651cj A00() {
        AnonymousClass00B.A00();
        return new C30651cj((SQLiteTransactionListener) null, this.A01, this.A02);
    }

    @Deprecated
    public C30651cj A01() {
        return new C30651cj((SQLiteTransactionListener) null, this.A01, this.A02);
    }

    public C16810tg A02() {
        return this.A02;
    }

    public void A03(Runnable runnable) {
        AnonymousClass00B.A0G(this.A02.A00.inTransaction());
        C33921jP r3 = this.A01;
        Object obj = new Object();
        IDxTListenerShape94S0200000_2_I0 iDxTListenerShape94S0200000_2_I0 = new IDxTListenerShape94S0200000_2_I0(r3, 0, runnable);
        Object obj2 = r3.A02.get();
        AnonymousClass00B.A06(obj2);
        ((AbstractMap) obj2).put(obj, iDxTListenerShape94S0200000_2_I0);
    }

    public void close() {
        if (!this.A00) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03;
            if (readLock != null) {
                Thread.currentThread().getId();
                readLock.unlock();
            }
            this.A00 = true;
        }
    }
}
