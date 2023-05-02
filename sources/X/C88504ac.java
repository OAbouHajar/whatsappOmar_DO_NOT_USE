package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.4ac  reason: invalid class name and case insensitive filesystem */
public class C88504ac {
    public final AnonymousClass4LH[] A00;

    public C88504ac(String str) {
        this.A00 = new AnonymousClass4LH[]{new AnonymousClass4LH(str, this), new AnonymousClass4LH(AnonymousClass000.A0h(str, AnonymousClass000.A0r("X509 ")), this), new AnonymousClass4LH("PKCS7", this)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r0 > 0) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(java.io.InputStream r5) {
        /*
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
        L_0x0005:
            int r3 = r5.read()
            r2 = 10
            r1 = 13
            if (r3 == r1) goto L_0x0020
            if (r3 == r2) goto L_0x0020
            if (r3 < 0) goto L_0x0018
            char r0 = (char) r3
            r4.append(r0)
            goto L_0x0005
        L_0x0018:
            int r0 = r4.length()
            if (r0 != 0) goto L_0x0038
            r0 = 0
            return r0
        L_0x0020:
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0005
            if (r3 != r1) goto L_0x0038
            r1 = 1
            r5.mark(r1)
            int r0 = r5.read()
            if (r0 != r2) goto L_0x003d
            r5.mark(r1)
        L_0x0035:
            r5.reset()
        L_0x0038:
            java.lang.String r0 = r4.toString()
            return r0
        L_0x003d:
            if (r0 <= 0) goto L_0x0038
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88504ac.A00(java.io.InputStream):java.lang.String");
    }

    public C32411gJ A01(InputStream inputStream) {
        String A002;
        String str;
        AnonymousClass4LH[] r7;
        int length;
        AnonymousClass4LH r5;
        String A003;
        IOException A0e;
        StringBuffer stringBuffer = new StringBuffer();
        loop0:
        while (true) {
            A002 = A00(inputStream);
            if (A002 == null) {
                str = "malformed PEM data: no header found";
                break;
            }
            int i2 = 0;
            while (true) {
                r7 = this.A00;
                length = r7.length;
                if (i2 != length) {
                    r5 = r7[i2];
                    if (!A002.startsWith(r5.A01) && !A002.startsWith(r5.A00)) {
                        i2++;
                    }
                }
            }
        }
        if (!A002.startsWith(r5.A01)) {
            str = "malformed PEM data: found footer where header was expected";
        } else {
            loop2:
            while (true) {
                A003 = A00(inputStream);
                if (A003 == null) {
                    str = "malformed PEM data: no footer found";
                    break;
                }
                int i3 = 0;
                while (i3 != length) {
                    AnonymousClass4LH r1 = r7[i3];
                    if (!A003.startsWith(r1.A01) && !A003.startsWith(r1.A00)) {
                        i3++;
                    }
                }
                stringBuffer.append(A003);
            }
            if (!A003.startsWith(r5.A00)) {
                str = "malformed PEM data: header/footer mismatch";
            } else if (stringBuffer.length() == 0) {
                return null;
            } else {
                try {
                    String obj = stringBuffer.toString();
                    int length2 = obj.length();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((length2 >> 2) * 3);
                    AnonymousClass5AM r4 = (AnonymousClass5AM) AnonymousClass4AI.A00;
                    byte[] bArr = new byte[54];
                    while (length2 > 0) {
                        char charAt = obj.charAt(length2 - 1);
                        if (charAt != 10 && charAt != 13 && charAt != 9 && charAt != ' ') {
                            break;
                        }
                        length2--;
                    }
                    if (length2 != 0) {
                        int i4 = length2;
                        int i5 = 0;
                        while (i4 > 0 && i5 != 4) {
                            char charAt2 = obj.charAt(i4 - 1);
                            if (!(charAt2 == 10 || charAt2 == 13 || charAt2 == 9 || charAt2 == ' ')) {
                                i5++;
                            }
                            i4--;
                        }
                        int A004 = r4.A00(obj, 0, i4);
                        int i6 = 0;
                        while (true) {
                            if (A004 < i4) {
                                byte[] bArr2 = r4.A00;
                                byte b2 = bArr2[obj.charAt(A004)];
                                int A005 = r4.A00(obj, A004 + 1, i4);
                                byte b3 = bArr2[obj.charAt(A005)];
                                int A006 = r4.A00(obj, A005 + 1, i4);
                                byte b4 = bArr2[obj.charAt(A006)];
                                int A007 = r4.A00(obj, A006 + 1, i4);
                                int i7 = A007 + 1;
                                byte b5 = bArr2[obj.charAt(A007)];
                                if ((b2 | b3 | b4 | b5) < 0) {
                                    A0e = AnonymousClass3K3.A0e("invalid characters encountered in base64 data");
                                    break;
                                }
                                int i8 = i6 + 1;
                                AnonymousClass3K4.A0i(b2 << 2, bArr, b3 >> 4, i6);
                                int i9 = i8 + 1;
                                AnonymousClass3K4.A0i(b3 << 4, bArr, b4 >> 2, i8);
                                i6 = i9 + 1;
                                AnonymousClass3K4.A0i(b4 << 6, bArr, b5, i9);
                                if (i6 == 54) {
                                    byteArrayOutputStream.write(bArr);
                                    i6 = 0;
                                }
                                A004 = r4.A00(obj, i7, i4);
                            } else {
                                if (i6 > 0) {
                                    byteArrayOutputStream.write(bArr, 0, i6);
                                }
                                int A008 = r4.A00(obj, A004, length2);
                                int A009 = r4.A00(obj, A008 + 1, length2);
                                int A0010 = r4.A00(obj, A009 + 1, length2);
                                int A0011 = r4.A00(obj, A0010 + 1, length2);
                                char charAt3 = obj.charAt(A008);
                                char charAt4 = obj.charAt(A009);
                                char charAt5 = obj.charAt(A0010);
                                char charAt6 = obj.charAt(A0011);
                                if (charAt5 == '=') {
                                    if (charAt6 == '=') {
                                        byte[] bArr3 = r4.A00;
                                        byte b6 = bArr3[charAt3];
                                        byte b7 = bArr3[charAt4];
                                        if ((b6 | b7) >= 0) {
                                            byteArrayOutputStream.write((b6 << 2) | (b7 >> 4));
                                        } else {
                                            A0e = AnonymousClass3K3.A0e("invalid characters encountered at end of base64 data");
                                        }
                                    } else {
                                        A0e = AnonymousClass3K3.A0e("invalid characters encountered at end of base64 data");
                                    }
                                } else if (charAt6 == '=') {
                                    byte[] bArr4 = r4.A00;
                                    byte b8 = bArr4[charAt3];
                                    byte b9 = bArr4[charAt4];
                                    byte b10 = bArr4[charAt5];
                                    if ((b8 | b9 | b10) >= 0) {
                                        byteArrayOutputStream.write((b8 << 2) | (b9 >> 4));
                                        byteArrayOutputStream.write((b9 << 4) | (b10 >> 2));
                                    } else {
                                        A0e = AnonymousClass3K3.A0e("invalid characters encountered at end of base64 data");
                                    }
                                } else {
                                    byte[] bArr5 = r4.A00;
                                    byte b11 = bArr5[charAt3];
                                    byte b12 = bArr5[charAt4];
                                    byte b13 = bArr5[charAt5];
                                    byte b14 = bArr5[charAt6];
                                    if ((b11 | b12 | b13 | b14) >= 0) {
                                        byteArrayOutputStream.write((b11 << 2) | (b12 >> 4));
                                        byteArrayOutputStream.write((b12 << 4) | (b13 >> 2));
                                        byteArrayOutputStream.write((b13 << 6) | b14);
                                    } else {
                                        A0e = AnonymousClass3K3.A0e("invalid characters encountered at end of base64 data");
                                    }
                                }
                            }
                        }
                        throw A0e;
                    }
                    return C32411gJ.A00(byteArrayOutputStream.toByteArray());
                } catch (Exception e2) {
                    throw new AnonymousClass449(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("unable to decode base64 string: ")), e2);
                } catch (Exception unused) {
                    throw AnonymousClass3K3.A0e("malformed PEM data encountered");
                }
            }
        }
        throw AnonymousClass3K3.A0e(str);
    }
}
