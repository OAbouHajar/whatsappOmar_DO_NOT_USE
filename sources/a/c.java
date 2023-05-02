package a;

import android.support.v4.view.MotionEventCompat;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* compiled from: XFMFile */
public final class c extends FilterOutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f162a;

    /* renamed from: b  reason: collision with root package name */
    public ByteOrder f163b;

    public c(FileOutputStream fileOutputStream, ByteOrder byteOrder) {
        super(fileOutputStream);
        this.f162a = fileOutputStream;
        this.f163b = byteOrder;
    }

    public final void a(int i2) {
        this.f162a.write(i2);
    }

    public final void b(int i2) {
        int i3;
        ByteOrder byteOrder = this.f163b;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f162a;
        if (byteOrder == byteOrder2) {
            outputStream.write((i2 >>> 0) & MotionEventCompat.ACTION_MASK);
            outputStream.write((i2 >>> 8) & MotionEventCompat.ACTION_MASK);
            outputStream.write((i2 >>> 16) & MotionEventCompat.ACTION_MASK);
            i3 = i2 >>> 24;
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((i2 >>> 24) & MotionEventCompat.ACTION_MASK);
            outputStream.write((i2 >>> 16) & MotionEventCompat.ACTION_MASK);
            outputStream.write((i2 >>> 8) & MotionEventCompat.ACTION_MASK);
            i3 = i2 >>> 0;
        } else {
            return;
        }
        outputStream.write(i3 & MotionEventCompat.ACTION_MASK);
    }

    public final void c(short s2) {
        int i2;
        ByteOrder byteOrder = this.f163b;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f162a;
        if (byteOrder == byteOrder2) {
            outputStream.write((s2 >>> 0) & MotionEventCompat.ACTION_MASK);
            i2 = s2 >>> 8;
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((s2 >>> 8) & MotionEventCompat.ACTION_MASK);
            i2 = s2 >>> 0;
        } else {
            return;
        }
        outputStream.write(i2 & MotionEventCompat.ACTION_MASK);
    }

    public final void write(byte[] bArr) {
        this.f162a.write(bArr);
    }

    public final void write(byte[] bArr, int i2, int i3) {
        this.f162a.write(bArr, i2, i3);
    }
}
