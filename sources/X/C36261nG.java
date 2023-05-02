package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1nG  reason: invalid class name and case insensitive filesystem */
public class C36261nG {
    public final int A00;
    public final byte[][] A01;

    public C36261nG(List list) {
        int i2;
        if (list.isEmpty() || 32 % list.size() != 0) {
            StringBuilder sb = new StringBuilder("Invalid number of chain keys: ");
            sb.append(list.size());
            throw new IllegalArgumentException(sb.toString());
        }
        int size = list.size();
        int[] iArr = new int[size];
        this.A01 = new byte[size][];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = ((AnonymousClass2LF) list.get(i3)).A01;
            this.A01[i3] = ((AnonymousClass2LF) list.get(i3)).A02.A04();
        }
        int[] iArr2 = new int[size];
        int i4 = 0;
        while (true) {
            i2 = size - 1;
            if (i4 >= i2) {
                break;
            }
            iArr2[i4] = iArr[i4] - 1;
            i4++;
        }
        iArr2[i2] = iArr[i2];
        int i5 = 32 / size;
        int i6 = (int) ((1 << i5) - 1);
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += (iArr2[(size - i8) - 1] & i6) << (i5 * i8);
        }
        this.A00 = i7;
        A00(this.A01, i7);
    }

    public C36261nG(byte[] bArr) {
        int i2 = 1 << 3;
        this.A00 = 0;
        byte[][] bArr2 = new byte[i2][];
        this.A01 = bArr2;
        bArr2[0] = bArr;
        for (int i3 = 1; i3 < i2; i3++) {
            bArr2[i3] = new byte[0];
        }
    }

    public C36261nG(byte[][] bArr, int i2) {
        int length = bArr.length;
        if (length == 0 || 32 % length != 0) {
            StringBuilder sb = new StringBuilder("Invalid number of chain keys: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        A00(bArr, i2);
        this.A00 = i2;
        this.A01 = bArr;
    }

    public static void A00(byte[][] bArr, int i2) {
        int length;
        if (i2 == 0 && (length = bArr.length) > 1) {
            int i3 = 2;
            if (bArr[1].length == 0) {
                while (i3 < length) {
                    if (bArr[i3].length <= 0) {
                        i3++;
                    } else {
                        throw new IllegalArgumentException("Invalid chain key values for starting iteration");
                    }
                }
                return;
            }
        }
        int i4 = 0;
        while (i4 < bArr.length) {
            if (bArr[i4].length != 0) {
                i4++;
            } else {
                throw new IllegalArgumentException("Invalid chain key values");
            }
        }
    }

    public static final byte[] A01(byte[] bArr, byte b2) {
        try {
            Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
            instance.init(new SecretKeySpec(bArr, DefaultCrypto.HMAC_SHA256));
            instance.update(b2);
            return instance.doFinal();
        } catch (InvalidKeyException | NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public C36261nG A02(int i2) {
        if (i2 > 0) {
            int i3 = this.A00;
            int i4 = i2 + i3;
            int length = this.A01.length;
            int[] A002 = AnonymousClass48Z.A00(i3, length);
            int[] A003 = AnonymousClass48Z.A00(i4, length);
            byte[][] A03 = A03();
            int i5 = 0;
            while (true) {
                int length2 = A03.length;
                if (i5 >= length2) {
                    return new C36261nG(A03, i4);
                }
                while (A003[i5] > A002[i5]) {
                    if (i5 < length2 - 1 && A003[i5] - 1 == A002[i5]) {
                        int i6 = i5 + 1;
                        A03[i6] = A01(A03[i5], (byte) (i5 + 2 + 1));
                        A002[i6] = 0;
                    }
                    A03[i5] = A01(A03[i5], (byte) (i5 + 2));
                    A002[i5] = A002[i5] + 1;
                }
                i5++;
            }
        } else {
            StringBuilder sb = new StringBuilder("count must be a positive number: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public byte[][] A03() {
        byte[][] bArr = this.A01;
        int length = bArr.length;
        byte[][] bArr2 = new byte[length][];
        if (this.A00 == 0 && length > 1 && bArr[1].length == 0) {
            int i2 = 0;
            while (i2 < length - 1) {
                byte[] bArr3 = i2 == 0 ? bArr[0] : bArr2[i2];
                int i3 = i2 + 1;
                int i4 = i2 + 2;
                bArr2[i3] = A01(bArr3, (byte) (i4 + 1));
                bArr2[i2] = A01(bArr3, (byte) i4);
                i2 = i3;
            }
        } else {
            for (int i5 = 0; i5 < length; i5++) {
                bArr2[i5] = new byte[bArr[i5].length];
                byte[] bArr4 = bArr[i5];
                System.arraycopy(bArr4, 0, bArr2[i5], 0, bArr4.length);
            }
        }
        return bArr2;
    }
}
