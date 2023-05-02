package X;

import android.os.Message;
import java.io.OutputStream;

/* renamed from: X.1pm  reason: invalid class name and case insensitive filesystem */
public class C37811pm extends OutputStream {
    public final C17130ua A00;
    public final OutputStream A01;
    public final Integer A02;
    public final Integer A03;

    public C37811pm(C17130ua r1, OutputStream outputStream, Integer num, Integer num2) {
        this.A01 = outputStream;
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
            if (i2 >= 0) {
                Message.obtain(r12, 2, intValue, i2).sendToTarget();
                r3.A02();
            }
        }
        C17130ua r13 = this.A00;
        int intValue2 = this.A03.intValue();
        AnonymousClass11O r5 = r13.A05;
        if (((long) i2) >= 0 && (r1 = r5.A00) != null) {
            AnonymousClass00B.A0G(true);
            Message.obtain(r1, 2, intValue2, i2).sendToTarget();
            r5.A00();
        }
    }

    public void close() {
        this.A01.close();
    }

    public void flush() {
        this.A01.flush();
    }

    public void write(int i2) {
        this.A01.write(i2);
        A00(1);
    }

    public void write(byte[] bArr) {
        this.A01.write(bArr);
        A00(bArr.length);
    }

    public void write(byte[] bArr, int i2, int i3) {
        this.A01.write(bArr, i2, i3);
        A00(i3);
    }
}
