package X;

import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.net.ssl.SSLException;

/* renamed from: X.4SU  reason: invalid class name */
public abstract class AnonymousClass4SU {
    public void A00(byte[] bArr, int i2, int i3, byte b2) {
        short s2;
        byte b3 = b2;
        if (this instanceof C77503vs) {
            C77503vs r5 = (C77503vs) this;
            try {
                ByteBuffer allocate = ByteBuffer.allocate(i3 + 5);
                allocate.put(b3);
                if (b3 != 22 || r5.A01) {
                    s2 = 771;
                } else {
                    r5.A01 = true;
                    s2 = 769;
                }
                allocate.putShort(s2);
                AnonymousClass3K3.A1O(allocate, i3);
                allocate.put(bArr, i2, i3);
                r5.A00.write(allocate.array());
            } catch (SocketException | SocketTimeoutException e2) {
                throw new C29351aU(new SSLException(e2), (byte) 80, true);
            } catch (IOException e3) {
                throw AnonymousClass3K2.A0T(e3);
            }
        } else {
            C77513vt r1 = (C77513vt) this;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i2, i3 + i2);
            ByteBuffer allocate2 = ByteBuffer.allocate(copyOfRange.length + 1);
            allocate2.put(copyOfRange);
            allocate2.put(b3);
            allocate2.put(new byte[0]);
            byte[] array = allocate2.array();
            ByteBuffer allocate3 = ByteBuffer.allocate(5);
            allocate3.put((byte) 23);
            allocate3.putShort(771);
            int length = array.length;
            C29371aW r52 = r1.A01;
            C220216i.A00();
            AnonymousClass3K3.A1O(allocate3, length + 16);
            byte[] A8Q = r52.A8Q(allocate3.array(), array, 0, length, r1.A00);
            r1.A00++;
            try {
                ByteBuffer allocate4 = ByteBuffer.allocate(A8Q.length + 5);
                allocate4.put(allocate3.array());
                allocate4.put(A8Q);
                r1.A02.write(allocate4.array());
            } catch (SocketException | SocketTimeoutException e4) {
                throw new C29351aU(new SSLException(e4), (byte) 80, true);
            } catch (IOException e5) {
                throw AnonymousClass3K2.A0T(e5);
            }
        }
    }

    public synchronized void A01(byte[] bArr, int i2, int i3, byte b2) {
        C29351aU r0;
        if (bArr == null) {
            r0 = AnonymousClass3K2.A0S("Data cannot be null", (byte) 80);
        } else if (C817049k.A00.contains(Byte.valueOf(b2))) {
            while (i3 > 16384) {
                A00(bArr, i2, 16384, b2);
                i2 += 16384;
                i3 -= 16384;
            }
            if (i3 > 0) {
                A00(bArr, i2, i3, b2);
            }
        } else {
            r0 = AnonymousClass3K2.A0S("Invalid content type", (byte) 80);
        }
        throw r0;
    }
}
