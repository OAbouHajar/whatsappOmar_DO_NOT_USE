package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.InputStream;
import java.util.Locale;

/* renamed from: X.1q7  reason: invalid class name and case insensitive filesystem */
public class C38021q7 extends InputStream {
    public long A00;
    public final long A01;
    public final InputStream A02;

    public C38021q7(InputStream inputStream, long j2) {
        StringBuilder sb = new StringBuilder("bounded-input-stream/construct/");
        sb.append(j2);
        Log.i(sb.toString());
        TextUtils.join(", ", Thread.currentThread().getStackTrace());
        this.A02 = inputStream;
        this.A01 = j2;
    }

    public int available() {
        long j2 = this.A00;
        long j3 = this.A01;
        if (j2 < j3) {
            return this.A02.available();
        }
        Log.i(String.format(Locale.ENGLISH, "bounded-input-stream/available size-limit:%d already-read:%d, returning 0", new Object[]{Long.valueOf(j3), Long.valueOf(j2)}));
        return 0;
    }

    public void close() {
        this.A02.close();
    }

    public void mark(int i2) {
        this.A02.mark(i2);
    }

    public boolean markSupported() {
        return this.A02.markSupported();
    }

    public int read() {
        long j2 = this.A00;
        long j3 = this.A01;
        if (j2 >= j3) {
            Log.i(String.format(Locale.ENGLISH, "bounded-input-stream/read size-limit:%d already-read:%d, returning -1", new Object[]{Long.valueOf(j3), Long.valueOf(j2)}));
            return -1;
        }
        int read = this.A02.read();
        if (read < 0) {
            return read;
        }
        this.A00++;
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i2, int i3) {
        long j2 = this.A00;
        long j3 = this.A01;
        if (((long) i3) + j2 > j3) {
            i3 = (int) (j3 - j2);
        }
        if (i3 <= 0) {
            return -1;
        }
        int read = this.A02.read(bArr, i2, i3);
        if (read <= 0) {
            return read;
        }
        this.A00 += (long) read;
        return read;
    }

    public void reset() {
        this.A02.reset();
    }

    public long skip(long j2) {
        long j3 = this.A00;
        long j4 = this.A01;
        if (j3 + j2 > j4) {
            Log.i(String.format(Locale.ENGLISH, "bounded-input-stream/skip/bytes-truncated-from-%d-to-%d", new Object[]{Long.valueOf(j2), Long.valueOf(j4 - j3)}));
            j2 = Math.max(j4 - this.A00, 0);
        }
        return super.skip(j2);
    }
}
