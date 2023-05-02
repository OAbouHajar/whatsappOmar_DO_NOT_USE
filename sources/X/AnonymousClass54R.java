package X;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: X.54R  reason: invalid class name */
public class AnonymousClass54R implements Closeable, AnonymousClass5TH {
    public ByteBuffer A00;
    public final int A01;
    public final long A02 = ((long) System.identityHashCode(this));

    public AnonymousClass54R(int i2) {
        this.A00 = ByteBuffer.allocateDirect(i2);
        this.A01 = i2;
    }

    public final void A00(AnonymousClass5TH r4, int i2) {
        if (r4 instanceof AnonymousClass54R) {
            AnonymousClass0T3.A01(!isClosed());
            AnonymousClass0T3.A01(!r4.isClosed());
            C805644j.A00(0, r4.AG6(), 0, i2, this.A01);
            this.A00.position(0);
            r4.AAH().position(0);
            byte[] bArr = new byte[i2];
            this.A00.get(bArr, 0, i2);
            r4.AAH().put(bArr, 0, i2);
            return;
        }
        throw AnonymousClass000.A0T("Cannot copy two incompatible MemoryChunks");
    }

    public void A6n(AnonymousClass5TH r9, int i2, int i3, int i4) {
        long AGl = r9.AGl();
        long j2 = this.A02;
        if (AGl == j2) {
            StringBuilder A0r = AnonymousClass000.A0r("Copying from BufferMemoryChunk ");
            A0r.append(Long.toHexString(j2));
            A0r.append(" to BufferMemoryChunk ");
            A0r.append(Long.toHexString(AGl));
            Log.w("BufferMemoryChunk", AnonymousClass000.A0h(" which are the same ", A0r));
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

    public synchronized ByteBuffer AAH() {
        return this.A00;
    }

    public int AG6() {
        return this.A01;
    }

    public long AGl() {
        return this.A02;
    }

    public synchronized byte AbM(int i2) {
        boolean z2 = true;
        AnonymousClass0T3.A01(AnonymousClass000.A1P(isClosed() ? 1 : 0));
        AnonymousClass0T3.A00(C13700nu.A0f(i2));
        if (i2 >= this.A01) {
            z2 = false;
        }
        AnonymousClass0T3.A00(z2);
        return this.A00.get(i2);
    }

    public synchronized int AbS(byte[] bArr, int i2, int i3, int i4) {
        int min;
        AnonymousClass0T3.A01(AnonymousClass000.A1P(isClosed() ? 1 : 0));
        int i5 = this.A01;
        min = Math.min(Math.max(0, i5 - i2), i4);
        C805644j.A00(i2, bArr.length, i3, min, i5);
        this.A00.position(i2);
        this.A00.get(bArr, i3, min);
        return min;
    }

    public synchronized int AiD(byte[] bArr, int i2, int i3, int i4) {
        int min;
        AnonymousClass0T3.A01(AnonymousClass000.A1P(isClosed() ? 1 : 0));
        int i5 = this.A01;
        min = Math.min(Math.max(0, i5 - i2), i4);
        C805644j.A00(i2, bArr.length, i3, min, i5);
        this.A00.position(i2);
        this.A00.put(bArr, i3, min);
        return min;
    }

    public synchronized void close() {
        this.A00 = null;
    }

    public synchronized boolean isClosed() {
        return AnonymousClass000.A1W(this.A00);
    }
}
