package X;

import android.support.v4.view.MotionEventCompat;
import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1nL  reason: invalid class name and case insensitive filesystem */
public class C36311nL implements C36091mz {
    public final int A00;
    public final int A01;
    public final C36251nF A02;
    public final byte[] A03;
    public final byte[] A04;

    public C36311nL(SecretKeySpec secretKeySpec, C36341nO r10, C36341nO r11, C36251nF r12, byte[] bArr, int i2, int i3, int i4) {
        byte[] bArr2 = {(byte) (((i2 << 4) | 3) & MotionEventCompat.ACTION_MASK)};
        C28581Wr A0U = AnonymousClass2LP.A05.A0U();
        byte[] A002 = r12.A00();
        C28631Ww A012 = C28631Ww.A01(A002, 0, A002.length);
        A0U.A03();
        AnonymousClass2LP r1 = (AnonymousClass2LP) A0U.A00;
        r1.A00 |= 1;
        r1.A04 = A012;
        A0U.A03();
        AnonymousClass2LP r13 = (AnonymousClass2LP) A0U.A00;
        r13.A00 |= 2;
        r13.A01 = i3;
        A0U.A03();
        AnonymousClass2LP r14 = (AnonymousClass2LP) A0U.A00;
        r14.A00 |= 4;
        r14.A02 = i4;
        C28631Ww A013 = C28631Ww.A01(bArr, 0, bArr.length);
        A0U.A03();
        AnonymousClass2LP r15 = (AnonymousClass2LP) A0U.A00;
        r15.A00 |= 8;
        r15.A03 = A013;
        byte[] A022 = A0U.A02().A02();
        this.A04 = C36581nm.A00(bArr2, A022, A00(secretKeySpec, r10, r11, C36581nm.A00(bArr2, A022), i2));
        this.A02 = r12;
        this.A00 = i3;
        this.A03 = bArr;
        this.A01 = i2;
    }

    public C36311nL(byte[] bArr) {
        try {
            byte[][] A022 = C36581nm.A02(bArr, 1, (bArr.length - 1) - 8, 8);
            byte b2 = A022[0][0];
            byte[] bArr2 = A022[1];
            int i2 = (b2 & 255) >> 4;
            if (i2 <= 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Legacy message: ");
                sb.append(i2);
                throw new C36171n7(sb.toString());
            } else if (i2 <= 3) {
                AnonymousClass2LP r3 = (AnonymousClass2LP) C28541Wm.A0E(AnonymousClass2LP.A05, bArr2);
                int i3 = r3.A00;
                if ((i3 & 8) == 8 && (i3 & 2) == 2 && (i3 & 1) == 1) {
                    this.A04 = bArr;
                    this.A02 = C36241nE.A00(r3.A04.A04());
                    this.A01 = (b2 & 255) >> 4;
                    this.A00 = r3.A01;
                    this.A03 = r3.A03.A04();
                    return;
                }
                throw new C36161n6("Incomplete message.");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown version: ");
                sb2.append(i2);
                throw new C36161n6(sb2.toString());
            }
        } catch (C29791bD | C36291nJ | ParseException e2) {
            throw new C36161n6(e2);
        }
    }

    public static final byte[] A00(SecretKeySpec secretKeySpec, C36341nO r3, C36341nO r4, byte[] bArr, int i2) {
        try {
            Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
            instance.init(secretKeySpec);
            if (i2 >= 3) {
                instance.update(r3.A00.A00());
                instance.update(r4.A00.A00());
            }
            byte[] doFinal = instance.doFinal(bArr);
            byte[] bArr2 = new byte[8];
            System.arraycopy(doFinal, 0, bArr2, 0, 8);
            return bArr2;
        } catch (InvalidKeyException | NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public byte[] AdU() {
        return this.A04;
    }

    public int getType() {
        return 2;
    }
}
