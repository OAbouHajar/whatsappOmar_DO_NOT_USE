package X;

import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;

/* renamed from: X.3Bs  reason: invalid class name and case insensitive filesystem */
public class C62123Bs {
    public static final SecureRandom A04 = new SecureRandom();
    public byte[] A00;
    public final AnonymousClass4P2 A01;
    public final C85184Nl[] A02;
    public final AnonymousClass4ME[] A03;

    public C62123Bs(AnonymousClass4P2 r1, C85184Nl[] r2, AnonymousClass4ME[] r3) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
    }

    public static C62123Bs A00(byte[] bArr) {
        byte[] bArr2 = bArr;
        if (bArr != null) {
            int length = bArr2.length;
            if (length >= 12) {
                short A022 = A02(bArr2, 0);
                byte b2 = bArr[2];
                boolean A1O = AnonymousClass000.A1O(b2 & 128);
                byte b3 = (byte) ((b2 >> 3) & 15);
                boolean A1O2 = AnonymousClass000.A1O(b2 & 4);
                boolean A1O3 = AnonymousClass000.A1O(b2 & 2);
                boolean A1O4 = AnonymousClass000.A1O(b2 & 1);
                byte b4 = bArr[3];
                short s2 = (short) ((byte) (b4 & 15));
                AnonymousClass4P2 r3 = new AnonymousClass4P2(b3, A022, s2, A02(bArr2, 4), A02(bArr2, 6), A02(bArr2, 8), A02(bArr2, 10), A1O, A1O2, A1O3, A1O4, AnonymousClass000.A1O(b4 & 128));
                int i2 = 12;
                int i3 = r3.A05;
                AnonymousClass4ME[] r10 = new AnonymousClass4ME[i3];
                int i4 = 0;
                int i5 = 0;
                while (i5 < i3) {
                    AnonymousClass3B6 A002 = AnonymousClass3B6.A00(bArr2, i2);
                    int i6 = A002.A00;
                    int i7 = i2 + i6;
                    if (length >= i7 + 4) {
                        r10[i5] = new AnonymousClass4ME(A002, i6 + 4, A02(bArr2, i7), A02(bArr2, i7 + 2));
                        i2 += r10[i5].A00;
                        i5++;
                    } else {
                        throw AnonymousClass000.A0T("insufficient data");
                    }
                }
                int i8 = r3.A03;
                C85184Nl[] r7 = new C85184Nl[i8];
                while (i4 < i8) {
                    AnonymousClass3B6 A003 = AnonymousClass3B6.A00(bArr2, i2);
                    int i9 = A003.A00;
                    int i10 = i2 + i9;
                    int i11 = i10 + 10;
                    if (length >= i11) {
                        short A023 = A02(bArr2, i10);
                        short A024 = A02(bArr2, i10 + 2);
                        int i12 = i10 + 4;
                        byte b5 = ((bArr2[i12] << 24) & -16777216) | ((bArr2[i12 + 1] << 16) & 16711680) | ((bArr2[i12 + 2] << 8) & 65280) | (bArr2[i12 + 3] & 255);
                        int A025 = A02(bArr2, i10 + 8);
                        if (length >= i11 + A025) {
                            byte[] bArr3 = new byte[A025];
                            System.arraycopy(bArr2, i11, bArr3, 0, A025);
                            r7[i4] = new C85184Nl(A003, bArr3, b5, A025 + i9 + 10, A023, A024);
                            i2 += r7[i4].A00;
                            i4++;
                        } else {
                            throw AnonymousClass000.A0T("insufficient data");
                        }
                    } else {
                        throw AnonymousClass000.A0T("insufficient data");
                    }
                }
                C62123Bs r0 = new C62123Bs(r3, r7, r10);
                r0.A00 = bArr2;
                return r0;
            }
            throw AnonymousClass000.A0T("bytes does not contain enough data");
        }
        throw AnonymousClass000.A0W("bytes may not be null");
    }

    public static C62123Bs A01(AnonymousClass4ME[] r15) {
        return new C62123Bs(new AnonymousClass4P2((byte) 0, (short) A04.nextInt(AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED), 0, 1, 0, 0, 0, false, false, false, true, false), new C85184Nl[0], r15);
    }

    public static short A02(byte[] bArr, int i2) {
        return (short) (((bArr[i2] << 8) & 65280) | (bArr[i2 + 1] & 255));
    }

    public static void A03(OutputStream outputStream, short s2) {
        outputStream.write((byte) ((65280 & s2) >>> 8));
        outputStream.write((byte) (s2 & 255));
    }

    public static void A04(byte[] bArr, int i2, short s2) {
        bArr[i2] = (byte) ((65280 & s2) >>> 8);
        bArr[i2 + 1] = (byte) (s2 & 255);
    }

    public byte[] A05() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            AnonymousClass4P2 r3 = this.A01;
            byte[] bArr = new byte[12];
            A04(bArr, 0, r3.A01);
            int i2 = 0;
            bArr[2] = 0;
            int i3 = 0;
            if (r3.A0A) {
                i3 = 128;
            }
            byte b2 = (byte) i3;
            bArr[2] = b2;
            byte b3 = (byte) (b2 | ((byte) ((r3.A00 & 15) << 3)));
            bArr[2] = b3;
            byte b4 = 0;
            if (r3.A07) {
                b4 = 4;
            }
            byte b5 = (byte) (b3 | b4);
            bArr[2] = b5;
            byte b6 = 0;
            if (r3.A0B) {
                b6 = 2;
            }
            byte b7 = (byte) (b5 | b6);
            bArr[2] = b7;
            bArr[2] = b7 | r3.A09 ? (byte) 1 : 0;
            bArr[3] = 0;
            if (r3.A08) {
                i2 = 128;
            }
            byte b8 = (byte) i2;
            bArr[3] = b8;
            bArr[3] = (byte) (b8 | ((byte) (r3.A06 & 15)));
            A04(bArr, 4, r3.A05);
            A04(bArr, 6, r3.A03);
            A04(bArr, 8, r3.A04);
            A04(bArr, 10, r3.A02);
            byteArrayOutputStream.write(bArr);
            for (AnonymousClass4ME r1 : this.A03) {
                r1.A01.A02(byteArrayOutputStream);
                A03(byteArrayOutputStream, r1.A03);
                A03(byteArrayOutputStream, r1.A02);
            }
            for (C85184Nl r6 : this.A02) {
                r6.A02.A02(byteArrayOutputStream);
                A03(byteArrayOutputStream, r6.A04);
                A03(byteArrayOutputStream, r6.A03);
                int i4 = r6.A01;
                byteArrayOutputStream.write((i4 >>> 24) & MotionEventCompat.ACTION_MASK);
                byteArrayOutputStream.write((i4 >>> 16) & MotionEventCompat.ACTION_MASK);
                byteArrayOutputStream.write((i4 >>> 8) & MotionEventCompat.ACTION_MASK);
                byteArrayOutputStream.write(i4 & MotionEventCompat.ACTION_MASK);
                byte[] bArr2 = r6.A05;
                A03(byteArrayOutputStream, (short) bArr2.length);
                byteArrayOutputStream.write(bArr2);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }
}
