package X;

import com.whatsapp.util.Log;
import java.io.EOFException;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2Oh  reason: invalid class name and case insensitive filesystem */
public class C48642Oh {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public C616639u A07;
    public File A08;
    public Long A09;
    public boolean A0A;
    public boolean A0B = false;
    public boolean A0C;
    public boolean A0D;
    public final AnonymousClass4L7 A0E = new AnonymousClass4L7();
    public final List A0F = new CopyOnWriteArrayList();
    public volatile File A0G;

    public synchronized int A00() {
        return this.A01;
    }

    public synchronized long A01() {
        long j2;
        j2 = this.A04;
        if (j2 == 0) {
            j2 = this.A03;
        }
        return j2;
    }

    public synchronized File A02() {
        return this.A0G;
    }

    public synchronized void A03() {
        File file = this.A08;
        if (file != null) {
            if (!file.delete()) {
                Log.w("DownloadContext/unable to delete chunkstore file");
            }
            this.A08 = null;
        }
    }

    public synchronized void A04(int i2) {
        if (this.A00 != i2) {
            this.A00 = i2;
            for (C48632Og AQ5 : this.A0F) {
                AQ5.AQ5(i2);
            }
        }
    }

    public synchronized void A05(int i2) {
        if (this.A01 != i2) {
            this.A01 = i2;
            for (C48632Og AQ6 : this.A0F) {
                AQ6.AQ6(this);
            }
        }
    }

    public synchronized void A06(long j2, long j3) {
        this.A06 = j2;
        for (C48632Og ANs : this.A0F) {
            ANs.ANs(this, j3);
        }
    }

    public synchronized void A07(File file) {
        this.A0G = file;
        for (C48632Og ARH : this.A0F) {
            ARH.ARH(this);
        }
    }

    public synchronized boolean A08() {
        return this.A0B;
    }

    public synchronized boolean A09(long j2) {
        boolean z2;
        if (this.A01 == 3) {
            z2 = true;
        } else if (this.A07 == null) {
            z2 = false;
        } else if (j2 <= A01()) {
            z2 = this.A07.A08(this.A07.A01(j2));
        } else {
            throw new EOFException();
        }
        return z2;
    }
}
