package X;

import android.os.Message;
import com.whatsapp.util.Log;
import java.io.InputStream;

/* renamed from: X.1qW  reason: invalid class name and case insensitive filesystem */
public class C38271qW extends InputStream {
    public final C17130ua A00;
    public final InputStream A01;
    public final Integer A02;
    public final Integer A03;

    public C38271qW(C17130ua r1, InputStream inputStream, Integer num, Integer num2) {
        this.A01 = inputStream;
        this.A02 = num;
        this.A00 = r1;
        this.A03 = num2;
    }

    public final void A00(int i2) {
        AnonymousClass1Zn r1;
        Integer num = this.A02;
        if (num != null) {
            C17130ua r3 = this.A00;
            int intValue = num.intValue();
            C28981Zo r12 = r3.A00;
            boolean z2 = false;
            if (r12 != null) {
                z2 = true;
            }
            AnonymousClass00B.A0G(z2);
            Message.obtain(r12, 3, intValue, i2).sendToTarget();
            r3.A02();
        }
        C17130ua r13 = this.A00;
        int intValue2 = this.A03.intValue();
        AnonymousClass11O r5 = r13.A05;
        if (((long) i2) >= 0 && (r1 = r5.A00) != null) {
            AnonymousClass00B.A0G(true);
            Message.obtain(r1, 3, intValue2, i2).sendToTarget();
            r5.A00();
        }
    }

    public int available() {
        return this.A01.available();
    }

    public void close() {
        this.A01.close();
    }

    public void mark(int i2) {
        Log.w("mark called in MessageInputStream");
    }

    public int read() {
        int read = this.A01.read();
        if (read != -1) {
            A00(1);
        }
        return read;
    }

    public int read(byte[] bArr) {
        int read = this.A01.read(bArr);
        if (read > 0) {
            A00(read);
        }
        return read;
    }

    public int read(byte[] bArr, int i2, int i3) {
        int read = this.A01.read(bArr, i2, i3);
        if (read > 0) {
            A00(read);
        }
        return read;
    }

    public synchronized void reset() {
        Log.w("reset called in MessageInputStream");
    }

    public long skip(long j2) {
        long skip = this.A01.skip(j2);
        Integer num = this.A02;
        if (num != null) {
            this.A00.A03(skip, num.intValue());
        }
        C17130ua r4 = this.A00;
        r4.A05.A02(skip, this.A03.intValue());
        return skip;
    }
}
