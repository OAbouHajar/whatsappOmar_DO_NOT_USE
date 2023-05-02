package X;

import com.facebook.profilo.writer.NativeTraceWriterCallbacks;

/* renamed from: X.4nG  reason: invalid class name and case insensitive filesystem */
public class C95774nG implements NativeTraceWriterCallbacks {
    public int A00;
    public long A01;
    public Throwable A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final NativeTraceWriterCallbacks A06;
    public final boolean A07;

    public C95774nG(NativeTraceWriterCallbacks nativeTraceWriterCallbacks, boolean z2) {
        this.A07 = z2;
        this.A06 = nativeTraceWriterCallbacks;
    }

    public void A00() {
        if (!this.A07) {
            return;
        }
        if (this.A05) {
            this.A06.onTraceWriteException(this.A01, this.A02);
        } else if (this.A04) {
            this.A06.onTraceWriteEnd(this.A01);
        } else if (this.A03) {
            this.A06.onTraceWriteAbort(this.A01, this.A00);
        }
    }

    public void onTraceWriteAbort(long j2, int i2) {
        if (this.A07) {
            this.A03 = true;
            this.A00 = i2;
            this.A01 = j2;
            return;
        }
        this.A06.onTraceWriteAbort(j2, i2);
    }

    public void onTraceWriteEnd(long j2) {
        if (this.A07) {
            this.A04 = true;
            this.A01 = j2;
            return;
        }
        this.A06.onTraceWriteEnd(j2);
    }

    public void onTraceWriteException(long j2, Throwable th) {
        if (this.A07) {
            this.A05 = true;
            this.A02 = th;
            this.A01 = j2;
            return;
        }
        this.A06.onTraceWriteException(j2, th);
    }

    public void onTraceWriteStart(long j2, int i2) {
        this.A06.onTraceWriteStart(j2, i2);
    }
}
