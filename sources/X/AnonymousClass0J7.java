package X;

import android.support.v4.view.MotionEventCompat;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* renamed from: X.0J7  reason: invalid class name */
public class AnonymousClass0J7 extends FilterOutputStream {
    public ByteOrder A00;
    public final OutputStream A01;

    public AnonymousClass0J7(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.A01 = outputStream;
        this.A00 = byteOrder;
    }

    public void A00(int i2) {
        OutputStream outputStream;
        int i3;
        ByteOrder byteOrder = this.A00;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            outputStream = this.A01;
            outputStream.write((i2 >>> 0) & MotionEventCompat.ACTION_MASK);
            outputStream.write((i2 >>> 8) & MotionEventCompat.ACTION_MASK);
            outputStream.write((i2 >>> 16) & MotionEventCompat.ACTION_MASK);
            i3 = i2 >>> 24;
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream = this.A01;
            outputStream.write((i2 >>> 24) & MotionEventCompat.ACTION_MASK);
            outputStream.write((i2 >>> 16) & MotionEventCompat.ACTION_MASK);
            outputStream.write((i2 >>> 8) & MotionEventCompat.ACTION_MASK);
            i3 = i2 >>> 0;
        } else {
            return;
        }
        outputStream.write(i3 & MotionEventCompat.ACTION_MASK);
    }

    public void A01(short s2) {
        OutputStream outputStream;
        int i2;
        ByteOrder byteOrder = this.A00;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            outputStream = this.A01;
            outputStream.write((s2 >>> 0) & MotionEventCompat.ACTION_MASK);
            i2 = s2 >>> 8;
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream = this.A01;
            outputStream.write((s2 >>> 8) & MotionEventCompat.ACTION_MASK);
            i2 = s2 >>> 0;
        } else {
            return;
        }
        outputStream.write(i2 & MotionEventCompat.ACTION_MASK);
    }

    public void write(byte[] bArr) {
        this.A01.write(bArr);
    }

    public void write(byte[] bArr, int i2, int i3) {
        this.A01.write(bArr, i2, i3);
    }
}
