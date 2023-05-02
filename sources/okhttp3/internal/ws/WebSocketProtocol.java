package okhttp3.internal.ws;

import okio.Buffer;
import okio.ByteString;

/* compiled from: XFMFile */
public final class WebSocketProtocol {
    public static String a(int i2) {
        StringBuilder sb;
        if (i2 < 1000 || i2 >= 5000) {
            sb = new StringBuilder("Code must be in range [1000,5000): ");
            sb.append(i2);
        } else if ((i2 < 1004 || i2 > 1006) && (i2 < 1012 || i2 > 2999)) {
            return null;
        } else {
            sb = new StringBuilder("Code ");
            sb.append(i2);
            sb.append(" is reserved and may not be used.");
        }
        return sb.toString();
    }

    public static String acceptHeader(String str) {
        return ByteString.encodeUtf8(str + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
    }

    public static void b(Buffer.UnsafeCursor unsafeCursor, byte[] bArr) {
        int length = bArr.length;
        int i2 = 0;
        do {
            byte[] bArr2 = unsafeCursor.data;
            int i3 = unsafeCursor.start;
            int i4 = unsafeCursor.end;
            while (i3 < i4) {
                int i5 = i2 % length;
                bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i5]);
                i3++;
                i2 = i5 + 1;
            }
        } while (unsafeCursor.next() != -1);
    }
}
