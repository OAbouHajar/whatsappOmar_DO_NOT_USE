package okhttp3.internal.http2;

import a.a;
import java.io.IOException;
import okhttp3.internal.Util;
import okio.ByteString;

/* compiled from: XFMFile */
public final class Http2 {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteString f2228a = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f2229b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f2230c = new String[64];

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f2231d = new String[256];

    static {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = f2231d;
            if (i3 >= strArr.length) {
                break;
            }
            strArr[i3] = Util.format("%8s", Integer.toBinaryString(i3)).replace(' ', '0');
            i3++;
        }
        String[] strArr2 = f2230c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[1 | 8] = a.f(new StringBuilder(), strArr2[1], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            String[] strArr3 = f2230c;
            int i7 = i6 | i5;
            strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i6]);
            sb.append('|');
            strArr3[i7 | 8] = a.f(sb, strArr3[i5], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f2230c;
            if (i2 < strArr4.length) {
                if (strArr4[i2] == null) {
                    strArr4[i2] = f2231d[i2];
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public static String a(boolean z2, int i2, int i3, byte b2, byte b3) {
        String str;
        String str2;
        String str3;
        String[] strArr = f2229b;
        String format = b2 < strArr.length ? strArr[b2] : Util.format("0x%02x", Byte.valueOf(b2));
        if (b3 == 0) {
            str = "";
        } else {
            String[] strArr2 = f2231d;
            if (!(b2 == 2 || b2 == 3)) {
                if (b2 == 4 || b2 == 6) {
                    str = b3 == 1 ? "ACK" : strArr2[b3];
                } else if (!(b2 == 7 || b2 == 8)) {
                    String[] strArr3 = f2230c;
                    String str4 = b3 < strArr3.length ? strArr3[b3] : strArr2[b3];
                    if (b2 == 5 && (b3 & 4) != 0) {
                        str3 = "HEADERS";
                        str2 = "PUSH_PROMISE";
                    } else if (b2 != 0 || (b3 & 32) == 0) {
                        str = str4;
                    } else {
                        str3 = "PRIORITY";
                        str2 = "COMPRESSED";
                    }
                    str = str4.replace(str3, str2);
                }
            }
            str = strArr2[b3];
        }
        Object[] objArr = new Object[5];
        objArr[0] = z2 ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        objArr[3] = format;
        objArr[4] = str;
        return Util.format("%s 0x%08x %5d %-13s %s", objArr);
    }

    public static void b(String str, Object... objArr) {
        throw new IOException(Util.format(str, objArr));
    }
}
