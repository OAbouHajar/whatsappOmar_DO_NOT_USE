package com.google.protobuf;

import X.AnonymousClass1Wo;
import X.AnonymousClass40O;
import X.AnonymousClass444;
import X.AnonymousClass4YV;
import X.C28601Wt;
import X.C28611Wu;
import X.C28631Ww;
import X.C446224u;
import X.C446324w;
import X.C58142sx;
import android.support.v4.view.MotionEventCompat;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends C446324w {
    public static final long A00 = UnsafeUtil.A00;
    public static final Logger A01 = Logger.getLogger(CodedOutputStream.class.getName());
    public static final boolean A02 = UnsafeUtil.A02;

    public static int A00(int i2, int i3) {
        int i4;
        int i5 = i2 << 3;
        if ((i5 & -128) == 0) {
            i4 = 1;
        } else if ((i5 & -16384) == 0) {
            i4 = 2;
        } else if ((-2097152 & i5) == 0) {
            i4 = 3;
        } else {
            i4 = 5;
            if ((i5 & -268435456) == 0) {
                i4 = 4;
            }
        }
        int i6 = 10;
        if (i3 >= 0) {
            i6 = 1;
            if ((i3 & -128) != 0) {
                i6 = 2;
                if ((i3 & -16384) != 0) {
                    i6 = 3;
                    if ((-2097152 & i3) != 0) {
                        i6 = 5;
                        if ((i3 & -268435456) == 0) {
                            i6 = 4;
                        }
                    }
                }
            }
        }
        return i4 + i6;
    }

    public static int A01(int i2, int i3) {
        int i4;
        int i5 = i2 << 3;
        if ((i5 & -128) == 0) {
            i4 = 1;
        } else if ((i5 & -16384) == 0) {
            i4 = 2;
        } else if ((-2097152 & i5) == 0) {
            i4 = 3;
        } else {
            i4 = 5;
            if ((i5 & -268435456) == 0) {
                i4 = 4;
            }
        }
        int i6 = 10;
        if (i3 >= 0) {
            i6 = 1;
            if ((i3 & -128) != 0) {
                i6 = 2;
                if ((i3 & -16384) != 0) {
                    i6 = 3;
                    if ((-2097152 & i3) != 0) {
                        i6 = 5;
                        if ((i3 & -268435456) == 0) {
                            i6 = 4;
                        }
                    }
                }
            }
        }
        return i4 + i6;
    }

    public static int A02(int i2, int i3) {
        int i4;
        int i5 = i2 << 3;
        if ((i5 & -128) == 0) {
            i4 = 1;
        } else if ((i5 & -16384) == 0) {
            i4 = 2;
        } else if ((-2097152 & i5) == 0) {
            i4 = 3;
        } else {
            i4 = 5;
            if ((i5 & -268435456) == 0) {
                i4 = 4;
            }
        }
        int i6 = 1;
        if ((i3 & -128) != 0) {
            i6 = 2;
            if ((i3 & -16384) != 0) {
                i6 = 3;
                if ((-2097152 & i3) != 0) {
                    i6 = 5;
                    if ((i3 & -268435456) == 0) {
                        i6 = 4;
                    }
                }
            }
        }
        return i4 + i6;
    }

    public static int A03(long j2) {
        if ((-128 & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        int i2 = 2;
        if ((-34359738368L & j2) != 0) {
            i2 = 6;
            j2 >>>= 28;
        }
        if ((-2097152 & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & -16384) != 0 ? i2 + 1 : i2;
    }

    public static int A04(C28631Ww r2, int i2) {
        int i3;
        int i4 = i2 << 3;
        if ((i4 & -128) == 0) {
            i3 = 1;
        } else if ((i4 & -16384) == 0) {
            i3 = 2;
        } else if ((-2097152 & i4) == 0) {
            i3 = 3;
        } else {
            i3 = 5;
            if ((i4 & -268435456) == 0) {
                i3 = 4;
            }
        }
        int A03 = r2.A03();
        int i5 = 1;
        if ((A03 & -128) != 0) {
            i5 = 2;
            if ((A03 & -16384) != 0) {
                i5 = 3;
                if ((-2097152 & A03) != 0) {
                    i5 = 5;
                    if ((-268435456 & A03) == 0) {
                        i5 = 4;
                    }
                }
            }
        }
        return i3 + i5 + A03;
    }

    public static int A05(AnonymousClass1Wo r2, int i2) {
        int i3;
        int i4 = i2 << 3;
        if ((i4 & -128) == 0) {
            i3 = 1;
        } else if ((i4 & -16384) == 0) {
            i3 = 2;
        } else if ((-2097152 & i4) == 0) {
            i3 = 3;
        } else {
            i3 = 5;
            if ((i4 & -268435456) == 0) {
                i3 = 4;
            }
        }
        int AFw = r2.AFw();
        int i5 = 1;
        if ((AFw & -128) != 0) {
            i5 = 2;
            if ((AFw & -16384) != 0) {
                i5 = 3;
                if ((-2097152 & AFw) != 0) {
                    i5 = 5;
                    if ((-268435456 & AFw) == 0) {
                        i5 = 4;
                    }
                }
            }
        }
        return i3 + i5 + AFw;
    }

    public static int A06(String str) {
        int i2;
        String str2;
        try {
            str2 = str;
            int A002 = AnonymousClass4YV.A00(str);
            str2 = A002;
            i2 = A002;
        } catch (AnonymousClass444 unused) {
            i2 = str2.getBytes(C28601Wt.A03).length;
        }
        int i3 = 1;
        if ((i2 & -128) != 0) {
            i3 = 2;
            if ((i2 & -16384) != 0) {
                i3 = 3;
                if ((-2097152 & i2) != 0) {
                    i3 = 5;
                    if ((-268435456 & i2) == 0) {
                        i3 = 4;
                    }
                }
            }
        }
        return i3 + i2;
    }

    public void A07(int i2) {
        if (this instanceof C446224u) {
            C446224u r1 = (C446224u) this;
            r1.A0L(10);
            r1.A0K(i2);
            return;
        }
        C58142sx r4 = (C58142sx) this;
        if (A02) {
            int i3 = r4.A01;
            int i4 = r4.A00;
            if (i3 - i4 >= 10) {
                long j2 = A00 + ((long) i4);
                while (true) {
                    int i5 = i2 & -128;
                    byte[] bArr = r4.A02;
                    if (i5 == 0) {
                        UnsafeUtil.A00(bArr, (byte) i2, j2);
                        r4.A00++;
                        return;
                    }
                    UnsafeUtil.A00(bArr, (byte) ((i2 & 127) | 128), j2);
                    r4.A00++;
                    i2 >>>= 7;
                    j2 = 1 + j2;
                }
            }
        }
        while ((i2 & -128) != 0) {
            try {
                byte[] bArr2 = r4.A02;
                int i6 = r4.A00;
                r4.A00 = i6 + 1;
                bArr2[i6] = (byte) ((i2 & 127) | 128);
                i2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new AnonymousClass40O(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(r4.A00), Integer.valueOf(r4.A01), 1}), e2);
            }
        }
        byte[] bArr3 = r4.A02;
        int i7 = r4.A00;
        r4.A00 = i7 + 1;
        bArr3[i7] = (byte) i2;
    }

    public void A08(int i2, int i3) {
        if (this instanceof C446224u) {
            C446224u r2 = (C446224u) this;
            r2.A0L(14);
            r2.A0K((i2 << 3) | 5);
            byte[] bArr = r2.A04;
            int i4 = r2.A00;
            int i5 = i4 + 1;
            r2.A00 = i5;
            bArr[i4] = (byte) (i3 & MotionEventCompat.ACTION_MASK);
            int i6 = i5 + 1;
            r2.A00 = i6;
            bArr[i5] = (byte) ((i3 >> 8) & MotionEventCompat.ACTION_MASK);
            int i7 = i6 + 1;
            r2.A00 = i7;
            bArr[i6] = (byte) ((i3 >> 16) & MotionEventCompat.ACTION_MASK);
            r2.A00 = i7 + 1;
            bArr[i7] = (byte) ((i3 >> 24) & MotionEventCompat.ACTION_MASK);
            r2.A01 += 4;
            return;
        }
        C58142sx r4 = (C58142sx) this;
        r4.A07((i2 << 3) | 5);
        try {
            byte[] bArr2 = r4.A02;
            int i8 = r4.A00;
            int i9 = i8 + 1;
            r4.A00 = i9;
            bArr2[i8] = (byte) (i3 & MotionEventCompat.ACTION_MASK);
            int i10 = i9 + 1;
            r4.A00 = i10;
            bArr2[i9] = (byte) ((i3 >> 8) & MotionEventCompat.ACTION_MASK);
            int i11 = i10 + 1;
            r4.A00 = i11;
            bArr2[i10] = (byte) ((i3 >> 16) & MotionEventCompat.ACTION_MASK);
            r4.A00 = i11 + 1;
            bArr2[i11] = (byte) ((i3 >> 24) & MotionEventCompat.ACTION_MASK);
        } catch (IndexOutOfBoundsException e2) {
            throw new AnonymousClass40O(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(r4.A00), Integer.valueOf(r4.A01), 1}), e2);
        }
    }

    public void A09(int i2, int i3) {
        if (this instanceof C446224u) {
            C446224u r2 = (C446224u) this;
            r2.A0L(20);
            r2.A0K(i2 << 3);
            if (i3 >= 0) {
                r2.A0K(i3);
            } else {
                r2.A0M((long) i3);
            }
        } else {
            C58142sx r22 = (C58142sx) this;
            r22.A07(i2 << 3);
            if (i3 >= 0) {
                r22.A07(i3);
            } else {
                r22.A0J((long) i3);
            }
        }
    }

    public void A0A(int i2, int i3) {
        if (this instanceof C446224u) {
            C446224u r1 = (C446224u) this;
            r1.A0L(20);
            r1.A0K(i2 << 3);
            r1.A0K(i3);
            return;
        }
        A07(i2 << 3);
        A07(i3);
    }

    public void A0B(int i2, long j2) {
        if (this instanceof C446224u) {
            C446224u r1 = (C446224u) this;
            r1.A0L(18);
            r1.A0K((i2 << 3) | 1);
            byte[] bArr = r1.A04;
            int i3 = r1.A00;
            int i4 = i3 + 1;
            r1.A00 = i4;
            bArr[i3] = (byte) ((int) (j2 & 255));
            int i5 = i4 + 1;
            r1.A00 = i5;
            bArr[i4] = (byte) ((int) ((j2 >> 8) & 255));
            int i6 = i5 + 1;
            r1.A00 = i6;
            bArr[i5] = (byte) ((int) ((j2 >> 16) & 255));
            int i7 = i6 + 1;
            r1.A00 = i7;
            bArr[i6] = (byte) ((int) (255 & (j2 >> 24)));
            int i8 = i7 + 1;
            r1.A00 = i8;
            bArr[i7] = (byte) (((int) (j2 >> 32)) & MotionEventCompat.ACTION_MASK);
            int i9 = i8 + 1;
            r1.A00 = i9;
            bArr[i8] = (byte) (((int) (j2 >> 40)) & MotionEventCompat.ACTION_MASK);
            int i10 = i9 + 1;
            r1.A00 = i10;
            bArr[i9] = (byte) (((int) (j2 >> 48)) & MotionEventCompat.ACTION_MASK);
            r1.A00 = i10 + 1;
            bArr[i10] = (byte) (((int) (j2 >> 56)) & MotionEventCompat.ACTION_MASK);
            r1.A01 += 8;
            return;
        }
        C58142sx r4 = (C58142sx) this;
        r4.A07((i2 << 3) | 1);
        try {
            byte[] bArr2 = r4.A02;
            int i11 = r4.A00;
            int i12 = i11 + 1;
            r4.A00 = i12;
            bArr2[i11] = (byte) (((int) j2) & MotionEventCompat.ACTION_MASK);
            int i13 = i12 + 1;
            r4.A00 = i13;
            bArr2[i12] = (byte) (((int) (j2 >> 8)) & MotionEventCompat.ACTION_MASK);
            int i14 = i13 + 1;
            r4.A00 = i14;
            bArr2[i13] = (byte) (((int) (j2 >> 16)) & MotionEventCompat.ACTION_MASK);
            int i15 = i14 + 1;
            r4.A00 = i15;
            bArr2[i14] = (byte) (((int) (j2 >> 24)) & MotionEventCompat.ACTION_MASK);
            int i16 = i15 + 1;
            r4.A00 = i16;
            bArr2[i15] = (byte) (((int) (j2 >> 32)) & MotionEventCompat.ACTION_MASK);
            int i17 = i16 + 1;
            r4.A00 = i17;
            bArr2[i16] = (byte) (((int) (j2 >> 40)) & MotionEventCompat.ACTION_MASK);
            int i18 = i17 + 1;
            r4.A00 = i18;
            bArr2[i17] = (byte) (((int) (j2 >> 48)) & MotionEventCompat.ACTION_MASK);
            r4.A00 = i18 + 1;
            bArr2[i18] = (byte) (((int) (j2 >> 56)) & MotionEventCompat.ACTION_MASK);
        } catch (IndexOutOfBoundsException e2) {
            throw new AnonymousClass40O(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(r4.A00), Integer.valueOf(r4.A01), 1}), e2);
        }
    }

    public void A0C(int i2, long j2) {
        if (this instanceof C446224u) {
            C446224u r1 = (C446224u) this;
            r1.A0L(20);
            r1.A0K(i2 << 3);
            r1.A0M(j2);
            return;
        }
        C58142sx r12 = (C58142sx) this;
        r12.A07(i2 << 3);
        r12.A0J(j2);
    }

    public void A0D(int i2, String str) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this instanceof C446224u) {
            C446224u r4 = (C446224u) this;
            r4.A07((i2 << 3) | 2);
            try {
                int length = str.length();
                int i11 = length * 3;
                if ((i11 & -128) == 0) {
                    i6 = 1;
                } else if ((i11 & -16384) == 0) {
                    i6 = 2;
                } else if ((-2097152 & i11) == 0) {
                    i6 = 3;
                } else {
                    i6 = 5;
                    if ((-268435456 & i11) == 0) {
                        i6 = 4;
                    }
                }
                int i12 = i6 + i11;
                int i13 = r4.A02;
                if (i12 > i13) {
                    byte[] bArr = new byte[i11];
                    int A002 = AnonymousClass4YV.A00.A00(str, bArr, 0, i11);
                    r4.A07(A002);
                    r4.A0I(bArr, 0, A002);
                    return;
                }
                if (i12 > i13 - r4.A00) {
                    r4.A0J();
                }
                if ((length & -128) == 0) {
                    i7 = 1;
                } else if ((length & -16384) == 0) {
                    i7 = 2;
                } else if ((-2097152 & length) == 0) {
                    i7 = 3;
                } else {
                    i7 = 5;
                    if ((length & -268435456) == 0) {
                        i7 = 4;
                    }
                }
                i8 = r4.A00;
                if (i7 == i6) {
                    int i14 = i8 + i7;
                    r4.A00 = i14;
                    i10 = AnonymousClass4YV.A00.A00(str, r4.A04, i14, i13 - i14);
                    r4.A00 = i8;
                    i9 = (i10 - i8) - i7;
                    r4.A0K(i9);
                } else {
                    i9 = AnonymousClass4YV.A00(str);
                    r4.A0K(i9);
                    i10 = AnonymousClass4YV.A00.A00(str, r4.A04, r4.A00, i9);
                }
                r4.A00 = i10;
                r4.A01 += i9;
            } catch (AnonymousClass444 e2) {
                r4.A01 -= r4.A00 - i8;
                r4.A00 = i8;
                throw e2;
            } catch (ArrayIndexOutOfBoundsException e3) {
                throw new AnonymousClass40O(e3);
            } catch (AnonymousClass444 e4) {
                r4.A0H(e4, str);
            }
        } else {
            C58142sx r42 = (C58142sx) this;
            r42.A07((i2 << 3) | 2);
            int i15 = r42.A00;
            try {
                int length2 = str.length();
                int i16 = length2 * 3;
                if ((i16 & -128) == 0) {
                    i3 = 1;
                } else if ((i16 & -16384) == 0) {
                    i3 = 2;
                } else if ((-2097152 & i16) == 0) {
                    i3 = 3;
                } else {
                    i3 = 5;
                    if ((i16 & -268435456) == 0) {
                        i3 = 4;
                    }
                }
                if ((length2 & -128) == 0) {
                    i4 = 1;
                } else if ((length2 & -16384) == 0) {
                    i4 = 2;
                } else if ((-2097152 & length2) == 0) {
                    i4 = 3;
                } else {
                    i4 = 5;
                    if ((length2 & -268435456) == 0) {
                        i4 = 4;
                    }
                }
                if (i4 == i3) {
                    int i17 = i15 + i4;
                    r42.A00 = i17;
                    i5 = AnonymousClass4YV.A00.A00(str, r42.A02, i17, r42.A01 - i17);
                    r42.A00 = i15;
                    r42.A07((i5 - i15) - i4);
                } else {
                    r42.A07(AnonymousClass4YV.A00(str));
                    byte[] bArr2 = r42.A02;
                    int i18 = r42.A00;
                    i5 = AnonymousClass4YV.A00.A00(str, bArr2, i18, r42.A01 - i18);
                }
                r42.A00 = i5;
            } catch (AnonymousClass444 e5) {
                r42.A00 = i15;
                r42.A0H(e5, str);
            } catch (IndexOutOfBoundsException e6) {
                throw new AnonymousClass40O(e6);
            }
        }
    }

    public void A0E(int i2, boolean z2) {
        if (this instanceof C446224u) {
            C446224u r4 = (C446224u) this;
            r4.A0L(11);
            r4.A0K(i2 << 3);
            byte b2 = z2 ? (byte) 1 : 0;
            byte[] bArr = r4.A04;
            int i3 = r4.A00;
            r4.A00 = i3 + 1;
            bArr[i3] = b2;
            r4.A01++;
            return;
        }
        C58142sx r42 = (C58142sx) this;
        r42.A07(i2 << 3);
        byte b3 = z2 ? (byte) 1 : 0;
        try {
            byte[] bArr2 = r42.A02;
            int i4 = r42.A00;
            r42.A00 = i4 + 1;
            bArr2[i4] = b3;
        } catch (IndexOutOfBoundsException e2) {
            throw new AnonymousClass40O(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(r42.A00), Integer.valueOf(r42.A01), 1}), e2);
        }
    }

    public void A0F(C28631Ww r4, int i2) {
        A07((i2 << 3) | 2);
        A07(r4.A03());
        C28611Wu r42 = (C28611Wu) r4;
        A0I(r42.bytes, r42.A05(), r42.A03());
    }

    public void A0G(AnonymousClass1Wo r2, int i2) {
        A07((i2 << 3) | 2);
        A07(r2.AFw());
        r2.AiJ(this);
    }

    public final void A0H(AnonymousClass444 r4, String str) {
        A01.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", r4);
        byte[] bytes = str.getBytes(C28601Wt.A03);
        try {
            int length = bytes.length;
            A07(length);
            A0I(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new AnonymousClass40O(e2);
        } catch (AnonymousClass40O e3) {
            throw e3;
        }
    }

    public void A0I(byte[] bArr, int i2, int i3) {
        if (this instanceof C446224u) {
            C446224u r5 = (C446224u) this;
            int i4 = r5.A02;
            int i5 = r5.A00;
            int i6 = i4 - i5;
            if (i6 >= i3) {
                System.arraycopy(bArr, i2, r5.A04, i5, i3);
                r5.A00 += i3;
            } else {
                byte[] bArr2 = r5.A04;
                System.arraycopy(bArr, i2, bArr2, i5, i6);
                int i7 = i2 + i6;
                i3 -= i6;
                r5.A00 = i4;
                r5.A01 += i6;
                r5.A0J();
                if (i3 <= i4) {
                    System.arraycopy(bArr, i7, bArr2, 0, i3);
                    r5.A00 = i3;
                } else {
                    r5.A03.write(bArr, i7, i3);
                }
            }
            r5.A01 += i3;
            return;
        }
        C58142sx r4 = (C58142sx) this;
        try {
            System.arraycopy(bArr, i2, r4.A02, r4.A00, i3);
            r4.A00 += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new AnonymousClass40O(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(r4.A00), Integer.valueOf(r4.A01), Integer.valueOf(i3)}), e2);
        }
    }
}
