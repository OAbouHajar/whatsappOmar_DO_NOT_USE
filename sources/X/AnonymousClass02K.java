package X;

import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* renamed from: X.02K  reason: invalid class name */
public class AnonymousClass02K {
    public int A00 = -1;
    public int A01;
    public final AnonymousClass2P6 A02 = new AnonymousClass2P6();

    public static int A00(AnonymousClass2P6 r5, double d2) {
        long j2 = (long) d2;
        if (((double) j2) == d2) {
            return A01(r5, j2);
        }
        long doubleToRawLongBits = Double.doubleToRawLongBits(d2);
        r5.write((byte) ((int) doubleToRawLongBits));
        r5.write((byte) ((int) (doubleToRawLongBits >> 8)));
        r5.write((byte) ((int) (doubleToRawLongBits >> 16)));
        r5.write((byte) ((int) (doubleToRawLongBits >> 24)));
        r5.write((byte) ((int) (doubleToRawLongBits >> 32)));
        r5.write((byte) ((int) (doubleToRawLongBits >> 40)));
        r5.write((byte) ((int) (doubleToRawLongBits >> 48)));
        r5.write((byte) ((int) (doubleToRawLongBits >> 56)));
        return 7;
    }

    public static int A01(AnonymousClass2P6 r4, long j2) {
        if (j2 == 0) {
            return 1;
        }
        if (j2 == 1) {
            return 2;
        }
        r4.write((byte) ((int) j2));
        if (-128 <= j2 && j2 <= 127) {
            return 3;
        }
        r4.write((byte) ((int) (j2 >> 8)));
        if (-32768 <= j2 && j2 <= 32767) {
            return 4;
        }
        r4.write((byte) ((int) (j2 >> 16)));
        r4.write((byte) ((int) (j2 >> 24)));
        if (-2147483648L <= j2 && j2 <= 2147483647L) {
            return 5;
        }
        r4.write((byte) ((int) (j2 >> 32)));
        r4.write((byte) ((int) (j2 >> 40)));
        r4.write((byte) ((int) (j2 >> 48)));
        r4.write((byte) ((int) (j2 >> 56)));
        return 6;
    }

    public static int A02(AnonymousClass2P6 r3, long j2) {
        if (j2 < 0 || j2 > 4294967295L) {
            throw new IllegalArgumentException("Value is not an unsigned integer");
        }
        r3.write((byte) ((int) j2));
        if (j2 <= 255) {
            return 1;
        }
        r3.write((byte) ((int) (j2 >> 8)));
        if (j2 <= 65535) {
            return 2;
        }
        r3.write((byte) ((int) (j2 >> 16)));
        r3.write((byte) ((int) (j2 >> 24)));
        return 4;
    }

    public static int A03(AnonymousClass2P6 r2, Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Boolean) {
            return A01(r2, ((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Long) {
            return A01(r2, ((Number) obj).longValue());
        } else {
            if (obj instanceof Number) {
                return A00(r2, ((Number) obj).doubleValue());
            }
            if (obj instanceof String) {
                return A04(r2, (String) obj);
            }
            StringBuilder sb = new StringBuilder("Expected class Boolean, Number, or String, got ");
            sb.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static int A04(AnonymousClass2P6 r8, String str) {
        try {
            byte[] bytes = str.getBytes(AnonymousClass01S.A08);
            int length = bytes.length;
            if (length > 1024) {
                Log.w(String.format(Locale.US, "wam/serialize: string length is limited to %d UTF-8 bytes", new Object[]{1024}));
            }
            int min = Math.min(length, 1024);
            int A022 = A02(r8, (long) min);
            r8.write(bytes, 0, min);
            if (A022 == 1) {
                return 8;
            }
            if (A022 == 2) {
                return 9;
            }
            if (A022 == 4) {
                return 10;
            }
            throw new Error("Impossible");
        } catch (UnsupportedEncodingException e2) {
            throw new Error(e2);
        }
    }

    public static long A05(ByteBuffer byteBuffer, int i2) {
        long j2 = 0;
        int i3 = 0;
        do {
            j2 |= (((long) byteBuffer.get()) & 255) << (i3 << 3);
            i3++;
        } while (i3 < i2);
        return j2;
    }

    public static AnonymousClass056 A06(ByteBuffer byteBuffer) {
        int i2;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int position = byteBuffer.position();
        byte b2 = byteBuffer.get();
        byte b3 = b2 & 3;
        if (b3 <= 2) {
            int A05 = (int) ((b2 & 8) == 0 ? A05(byteBuffer, 1) : A05(byteBuffer, 2));
            int i3 = (b2 >> 4) & 15;
            if (i3 <= 10) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                switch (i3) {
                    case 0:
                        i2 = null;
                        break;
                    case 1:
                        i2 = 0;
                        break;
                    case 2:
                        i2 = 1;
                        break;
                    case 3:
                        i2 = Byte.valueOf(byteBuffer.get());
                        break;
                    case 4:
                        i2 = Short.valueOf(byteBuffer.getShort());
                        break;
                    case 5:
                        i2 = Integer.valueOf(byteBuffer.getInt());
                        break;
                    case 6:
                        i2 = Long.valueOf(byteBuffer.getLong());
                        break;
                    case 7:
                        i2 = Double.valueOf(byteBuffer.getDouble());
                        break;
                    case 8:
                        i2 = A07(byteBuffer, (int) A05(byteBuffer, 1));
                        break;
                    case 9:
                        i2 = A07(byteBuffer, (int) A05(byteBuffer, 2));
                        break;
                    case 10:
                        i2 = A07(byteBuffer, (int) A05(byteBuffer, 4));
                        break;
                    default:
                        throw new Error("Invalid value type");
                }
                return new AnonymousClass056(i2, b3, A05);
            }
            try {
                StringBuilder sb = new StringBuilder("Invalid value type ");
                sb.append(i3);
                throw new IllegalArgumentException(sb.toString());
            } catch (IllegalArgumentException e2) {
                String format = String.format(Locale.US, "%02X ", new Object[]{Byte.valueOf(b2)});
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e2);
                sb2.append(" at ");
                sb2.append(position);
                sb2.append(", tag: ");
                sb2.append(format);
                throw new AnonymousClass2PY(sb2.toString());
            }
        } else {
            try {
                throw new IllegalArgumentException("Invalid record type");
            } catch (IllegalArgumentException e3) {
                String format2 = String.format(Locale.US, "%02X ", new Object[]{Byte.valueOf(b2)});
                StringBuilder sb3 = new StringBuilder();
                sb3.append(e3);
                sb3.append(" at ");
                sb3.append(position);
                sb3.append(", tag: ");
                sb3.append(format2);
                throw new AnonymousClass2PY(sb3.toString());
            }
        }
    }

    public static String A07(ByteBuffer byteBuffer, int i2) {
        byte[] bArr = new byte[i2];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, AnonymousClass01S.A08);
        } catch (UnsupportedEncodingException e2) {
            StringBuilder sb = new StringBuilder("UnsupportedEncoding: ");
            sb.append(e2);
            throw new AnonymousClass2PY(sb.toString());
        }
    }

    public void A08() {
        this.A02.reset();
        this.A00 = -1;
        this.A01 = 0;
    }

    public final void A09(byte b2) {
        this.A02.A01()[this.A00] = b2;
    }

    public final void A0A(Object obj, int i2, int i3) {
        int i4;
        AnonymousClass2P6 r3 = this.A02;
        this.A00 = r3.size();
        r3.write(0);
        int A022 = A02(r3, (long) i3);
        if (A022 == 1) {
            i4 = 0;
        } else if (A022 == 2) {
            i4 = 1;
        } else {
            throw new Error("Id too big to fit in 2 bytes");
        }
        A09((byte) (i2 | (i4 << 3) | (A03(r3, obj) << 4)));
        this.A01++;
    }
}
