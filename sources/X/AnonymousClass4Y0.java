package X;

import androidx.core.view.ViewCompat;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import javax.net.ssl.SSLException;

/* renamed from: X.4Y0  reason: invalid class name */
public class AnonymousClass4Y0 {
    public static byte[] A00(byte[] bArr) {
        if (bArr != null) {
            try {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                byte b2 = wrap.get();
                byte[] bArr2 = new byte[3];
                wrap.get(bArr2);
                int A00 = C32311g7.A00(bArr2);
                byte[] bArr3 = new byte[A00];
                wrap.get(bArr3);
                if (C817149l.A00.contains(Byte.valueOf(b2)) && A00 <= 16777215) {
                    return bArr3;
                }
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("Received an invalid handshake - type ");
                A0o.append(b2);
                throw AnonymousClass3K2.A0S(C13680ns.A0i(" len ", A0o, A00), (byte) 80);
            } catch (BufferUnderflowException e2) {
                throw new C29351aU(new SSLException("Invalid handshake message", e2), (byte) 80);
            }
        } else {
            throw AnonymousClass3K2.A0S("Illegal argument - handshake is null", (byte) 80);
        }
    }

    public static byte[] A01(byte[] bArr, byte b2) {
        int length;
        if (!C817149l.A00.contains(Byte.valueOf(b2)) || bArr == null || (length = bArr.length) > 16777215) {
            StringBuilder A0r = AnonymousClass000.A0r("Illegal arguments -  type ");
            A0r.append(b2);
            throw AnonymousClass3K2.A0S(C13680ns.A0i(" msg is null or bigger than", A0r, ViewCompat.MEASURED_SIZE_MASK), (byte) 80);
        }
        ByteBuffer allocate = ByteBuffer.allocate(length + 4);
        allocate.put(b2);
        allocate.put(C32311g7.A05(length));
        allocate.put(bArr);
        return allocate.array();
    }
}
