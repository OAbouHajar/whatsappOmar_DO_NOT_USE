package X;

import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: X.54S  reason: invalid class name */
public class AnonymousClass54S implements Closeable, AnonymousClass5TH {
    public SharedMemory A00;
    public ByteBuffer A01;
    public final long A02;

    public AnonymousClass54S() {
        this.A00 = null;
        this.A01 = null;
        this.A02 = (long) System.identityHashCode(this);
    }

    public AnonymousClass54S(int i2) {
        AnonymousClass0T3.A00(AnonymousClass000.A1Q(i2));
        try {
            SharedMemory create = SharedMemory.create("AshmemMemoryChunk", i2);
            this.A00 = create;
            this.A01 = create.mapReadWrite();
            this.A02 = (long) System.identityHashCode(this);
        } catch (ErrnoException e2) {
            throw new RuntimeException("Fail to create AshmemMemory", e2);
        }
    }

    public final void A00(AnonymousClass5TH r4, int i2) {
        if (r4 instanceof AnonymousClass54S) {
            AnonymousClass0T3.A01(!isClosed());
            AnonymousClass0T3.A01(!r4.isClosed());
            C805644j.A00(0, r4.AG6(), 0, i2, AG6());
            this.A01.position(0);
            r4.AAH().position(0);
            byte[] bArr = new byte[i2];
            this.A01.get(bArr, 0, i2);
            r4.AAH().put(bArr, 0, i2);
            return;
        }
        throw AnonymousClass000.A0T("Cannot copy two incompatible MemoryChunks");
    }

    public void A6n(AnonymousClass5TH r9, int i2, int i3, int i4) {
        long AGl = r9.AGl();
        long j2 = this.A02;
        if (AGl == j2) {
            StringBuilder A0r = AnonymousClass000.A0r("Copying from AshmemMemoryChunk ");
            A0r.append(Long.toHexString(j2));
            A0r.append(" to AshmemMemoryChunk ");
            A0r.append(Long.toHexString(AGl));
            Log.w("AshmemMemoryChunk", AnonymousClass000.A0h(" which are the same ", A0r));
            AnonymousClass0T3.A00(false);
        }
        if (AGl < j2) {
            synchronized (r9) {
                synchronized (this) {
                    A00(r9, i4);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (r9) {
                A00(r9, i4);
            }
        }
    }

    public ByteBuffer AAH() {
        return this.A01;
    }

    public int AG6() {
        AnonymousClass0T3.A01(!isClosed());
        return this.A00.getSize();
    }

    public long AGl() {
        return this.A02;
    }

    public synchronized byte AbM(int i2) {
        boolean z2 = true;
        AnonymousClass0T3.A01(AnonymousClass000.A1P(isClosed() ? 1 : 0));
        AnonymousClass0T3.A00(C13700nu.A0f(i2));
        if (i2 >= AG6()) {
            z2 = false;
        }
        AnonymousClass0T3.A00(z2);
        return this.A01.get(i2);
    }

    public synchronized int AbS(byte[] bArr, int i2, int i3, int i4) {
        int min;
        AnonymousClass0T3.A01(AnonymousClass000.A1P(isClosed() ? 1 : 0));
        min = Math.min(Math.max(0, AG6() - i2), i4);
        C805644j.A00(i2, bArr.length, i3, min, AG6());
        this.A01.position(i2);
        this.A01.get(bArr, i3, min);
        return min;
    }

    public synchronized int AiD(byte[] bArr, int i2, int i3, int i4) {
        int min;
        AnonymousClass0T3.A01(AnonymousClass000.A1P(isClosed() ? 1 : 0));
        min = Math.min(Math.max(0, AG6() - i2), i4);
        C805644j.A00(i2, bArr.length, i3, min, AG6());
        this.A01.position(i2);
        this.A01.put(bArr, i3, min);
        return min;
    }

    public synchronized void close() {
        if (!isClosed()) {
            SharedMemory.unmap(this.A01);
            this.A00.close();
            this.A01 = null;
            this.A00 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r2.A00 == null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isClosed() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.nio.ByteBuffer r0 = r2.A01     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x000a
            android.os.SharedMemory r1 = r2.A00     // Catch:{ all -> 0x000d }
            r0 = 0
            if (r1 != 0) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            monitor-exit(r2)
            return r0
        L_0x000d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54S.isClosed():boolean");
    }
}
