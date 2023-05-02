package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AccessController;
import org.apache.commons.io.IOUtils;

/* renamed from: X.1ha  reason: invalid class name and case insensitive filesystem */
public final class C32941ha {
    public static String A00;

    static {
        try {
            A00 = (String) AccessController.doPrivileged(new C32951hb());
        } catch (Exception unused) {
            try {
                A00 = String.format("%n", new Object[0]);
            } catch (Exception unused2) {
                A00 = IOUtils.LINE_SEPARATOR_UNIX;
            }
        }
    }

    public static String A00(String str) {
        char[] charArray = str.toCharArray();
        boolean z2 = false;
        for (int i2 = 0; i2 != charArray.length; i2++) {
            char c2 = charArray[i2];
            if ('A' <= c2 && 'Z' >= c2) {
                charArray[i2] = (char) ((c2 - 'A') + 97);
                z2 = true;
            }
        }
        return z2 ? new String(charArray) : str;
    }

    public static String A01(String str) {
        char[] charArray = str.toCharArray();
        boolean z2 = false;
        for (int i2 = 0; i2 != charArray.length; i2++) {
            char c2 = charArray[i2];
            if ('a' <= c2 && 'z' >= c2) {
                charArray[i2] = (char) ((c2 - 'a') + 65);
                z2 = true;
            }
        }
        return z2 ? new String(charArray) : str;
    }

    public static String A02(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 != length; i2++) {
            cArr[i2] = (char) (bArr[i2] & 255);
        }
        return new String(cArr);
    }

    public static byte[] A03(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 != length; i2++) {
            bArr[i2] = (byte) str.charAt(i2);
        }
        return bArr;
    }

    public static byte[] A04(char[] cArr) {
        char c2;
        int i2;
        int i3;
        IllegalStateException illegalStateException;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i4 = 0;
        while (true) {
            try {
                int length = cArr.length;
                if (i4 >= length) {
                    return byteArrayOutputStream.toByteArray();
                }
                char c3 = cArr[i4];
                if (c3 >= 128) {
                    int i5 = (c3 >> 6) | 192;
                    char c4 = c3;
                    if (c3 >= 2048) {
                        if (c3 >= 55296 && c3 <= 57343) {
                            i4++;
                            if (i4 >= length) {
                                illegalStateException = new IllegalStateException("invalid UTF-16 codepoint");
                                break;
                            }
                            char c5 = cArr[i4];
                            if (c3 > 56319) {
                                illegalStateException = new IllegalStateException("invalid UTF-16 codepoint");
                                break;
                            }
                            i2 = (((c3 & 1023) << 10) | (c5 & 1023)) + AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
                            byteArrayOutputStream.write((i2 >> 18) | 240);
                            i3 = ((i2 >> 12) & 63) | 128;
                        } else {
                            i3 = (c3 >> 12) | 224;
                            i2 = c3;
                        }
                        byteArrayOutputStream.write(i3);
                        i5 = ((i2 >> 6) & 63) | 128;
                        c4 = i2;
                    }
                    byteArrayOutputStream.write(i5);
                    c2 = (c4 & true) | true;
                } else {
                    c2 = c3;
                }
                byteArrayOutputStream.write(c2);
                i4++;
            } catch (IOException unused) {
                throw new IllegalStateException("cannot encode string to byte array!");
            }
        }
        throw illegalStateException;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.String[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] A05(java.lang.String r6) {
        /*
            r5 = 46
            java.util.Vector r4 = new java.util.Vector
            r4.<init>()
            r2 = 1
        L_0x0008:
            r3 = 0
            if (r2 == 0) goto L_0x0024
            int r1 = r6.indexOf(r5)
            if (r1 <= 0) goto L_0x001f
            java.lang.String r0 = r6.substring(r3, r1)
            r4.addElement(r0)
            int r0 = r1 + 1
            java.lang.String r6 = r6.substring(r0)
            goto L_0x0008
        L_0x001f:
            r4.addElement(r6)
            r2 = 0
            goto L_0x0008
        L_0x0024:
            int r2 = r4.size()
            java.lang.String[] r1 = new java.lang.String[r2]
        L_0x002a:
            if (r3 == r2) goto L_0x0035
            java.lang.Object r0 = r4.elementAt(r3)
            r1[r3] = r0
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32941ha.A05(java.lang.String):java.lang.String[]");
    }
}
