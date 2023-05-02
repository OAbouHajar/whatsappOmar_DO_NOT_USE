package X;

import android.graphics.Rect;
import android.media.Image;
import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;

/* renamed from: X.5va  reason: invalid class name and case insensitive filesystem */
public class C118895va {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public Rect A04;
    public Pair A05;
    public Float A06;
    public Long A07;
    public Long A08;
    public boolean A09;
    public byte[] A0A;
    public float[] A0B;
    public C118125uB[] A0C;

    public void A00(int i2, byte[] bArr, int i3, int i4) {
        this.A0A = bArr;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A03 = Build.VERSION.SDK_INT >= 17 ? SystemClock.elapsedRealtimeNanos() : System.nanoTime();
    }

    public void A01(Image image, Pair pair, Float f2, Long l2, Long l3, float[] fArr, boolean z2, boolean z3) {
        int i2;
        this.A09 = z2;
        Image.Plane[] planes = image.getPlanes();
        C118125uB[] r0 = this.A0C;
        if (r0 == null || r0.length != (i2 = planes.length)) {
            i2 = planes.length;
            this.A0C = new C118125uB[i2];
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C118125uB[] r1 = this.A0C;
            if (r1[i3] == null) {
                r1[i3] = new C118125uB();
            }
            C118125uB r5 = r1[i3];
            ByteBuffer buffer = planes[i3].getBuffer();
            if (z3) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(buffer.capacity());
                buffer.rewind();
                allocateDirect.put(buffer);
                buffer.rewind();
                allocateDirect.flip();
                buffer = allocateDirect;
            }
            r5.A02 = buffer;
            this.A0C[i3].A00 = planes[i3].getPixelStride();
            this.A0C[i3].A01 = planes[i3].getRowStride();
        }
        this.A0B = fArr;
        this.A05 = pair;
        this.A08 = l2;
        this.A06 = f2;
        this.A07 = l3;
        this.A01 = image.getFormat();
        this.A03 = image.getTimestamp();
        this.A02 = image.getWidth();
        this.A00 = image.getHeight();
        if (Build.VERSION.SDK_INT >= 21) {
            this.A04 = image.getCropRect();
        }
    }

    public void A02(Image image, boolean z2, boolean z3) {
        A01(image, (Pair) null, (Float) null, (Long) null, (Long) null, (float[]) null, z2, z3);
    }
}
