package X;

import android.support.v4.view.MotionEventCompat;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* renamed from: X.4ak  reason: invalid class name and case insensitive filesystem */
public final class C88584ak {
    public final ByteArrayOutputStream A00;
    public final DataOutputStream A01;

    public C88584ak() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.A00 = byteArrayOutputStream;
        this.A01 = new DataOutputStream(byteArrayOutputStream);
    }

    public static void A00(DataOutputStream dataOutputStream, long j2) {
        dataOutputStream.writeByte(((int) (j2 >>> 24)) & MotionEventCompat.ACTION_MASK);
        dataOutputStream.writeByte(((int) (j2 >>> 16)) & MotionEventCompat.ACTION_MASK);
        dataOutputStream.writeByte(((int) (j2 >>> 8)) & MotionEventCompat.ACTION_MASK);
        dataOutputStream.writeByte(((int) j2) & MotionEventCompat.ACTION_MASK);
    }
}
