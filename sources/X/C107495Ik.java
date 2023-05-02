package X;

import java.util.Arrays;

/* renamed from: X.5Ik  reason: invalid class name and case insensitive filesystem */
public class C107495Ik extends C32051fZ implements C33031hp {
    public final byte[] A00;

    public C107495Ik(String str) {
        this.A00 = C32941ha.A04(str.toCharArray());
    }

    public C107495Ik(byte[] bArr) {
        this.A00 = bArr;
    }

    public int A03() {
        return AnonymousClass3K3.A0J(this.A00);
    }

    public void A07(C33061hs r3, boolean z2) {
        r3.A06(this.A00, 12, z2);
    }

    public boolean A08() {
        return false;
    }

    public boolean A09(C32051fZ r3) {
        if (!(r3 instanceof C107495Ik)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C107495Ik) r3).A00);
    }

    public String AGJ() {
        byte[] bArr = this.A00;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i2 = 0;
        int i3 = 0;
        loop0:
        while (true) {
            if (i2 < length) {
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    if (i3 >= length) {
                        break;
                    }
                    cArr[i3] = (char) b2;
                    i2 = i4;
                    i3++;
                } else {
                    short s2 = C82014Ar.A01[b2 & Byte.MAX_VALUE];
                    int i5 = s2 >>> 8;
                    byte b3 = (byte) s2;
                    while (true) {
                        if (b3 >= 0) {
                            if (i4 >= length) {
                                break loop0;
                            }
                            byte b4 = bArr[i4];
                            i5 = (i5 << 6) | (b4 & 63);
                            b3 = C82014Ar.A00[b3 + ((b4 & 255) >>> 4)];
                            i4++;
                        } else if (b3 == -2) {
                            break;
                        } else {
                            if (i5 > 65535) {
                                if (i3 >= length - 1) {
                                    break;
                                }
                                int i6 = i3 + 1;
                                cArr[i3] = (char) ((i5 >>> 10) + 55232);
                                i3 = i6 + 1;
                                cArr[i6] = (char) (56320 | (i5 & 1023));
                            } else if (i3 >= length) {
                                break;
                            } else {
                                cArr[i3] = (char) i5;
                                i3++;
                            }
                            i2 = i4;
                        }
                    }
                }
            } else if (i3 >= 0) {
                return new String(cArr, 0, i3);
            }
        }
        throw AnonymousClass000.A0T("Invalid UTF-8 input");
    }

    public int hashCode() {
        return C33111hx.A00(this.A00);
    }

    public String toString() {
        return AGJ();
    }
}
