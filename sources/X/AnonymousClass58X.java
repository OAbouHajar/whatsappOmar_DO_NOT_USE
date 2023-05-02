package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import javax.security.auth.Destroyable;

/* renamed from: X.58X  reason: invalid class name */
public class AnonymousClass58X implements PBEKey, Destroyable {
    public String algorithm;
    public int digest;
    public final AtomicBoolean hasBeenDestroyed = new AtomicBoolean(false);
    public final int iterationCount;
    public int ivSize;
    public int keySize;
    public C32041fY oid;
    public final C46932Gv param;
    public final char[] password;
    public final byte[] salt;
    public boolean tryWrong = false;
    public int type;

    public AnonymousClass58X(String str, PBEKeySpec pBEKeySpec, C32041fY r5, C46932Gv r6, int i2, int i3, int i4, int i5) {
        this.algorithm = str;
        this.oid = r5;
        this.type = i2;
        this.digest = i3;
        this.keySize = i4;
        this.ivSize = i5;
        this.password = pBEKeySpec.getPassword();
        this.iterationCount = pBEKeySpec.getIterationCount();
        this.salt = pBEKeySpec.getSalt();
        this.param = r6;
    }

    public static void A00(Destroyable destroyable) {
        if (destroyable.isDestroyed()) {
            throw AnonymousClass000.A0V("key has been destroyed");
        }
    }

    public void destroy() {
        if (!this.hasBeenDestroyed.getAndSet(true)) {
            char[] cArr = this.password;
            if (cArr != null) {
                Arrays.fill(cArr, 0);
            }
            byte[] bArr = this.salt;
            if (bArr != null) {
                Arrays.fill(bArr, (byte) 0);
            }
        }
    }

    public String getAlgorithm() {
        A00(this);
        return this.algorithm;
    }

    public byte[] getEncoded() {
        A00(this);
        C46932Gv r1 = this.param;
        if (r1 != null) {
            if (r1 instanceof C1054259l) {
                r1 = ((C1054259l) r1).A00;
            }
            return ((C46922Gu) r1).A00;
        }
        int i2 = this.type;
        if (i2 == 2) {
            return C89194bk.A00(this.password);
        }
        char[] cArr = this.password;
        if (i2 == 5) {
            return cArr != null ? C32941ha.A04(cArr) : new byte[0];
        }
        if (cArr == null) {
            return new byte[0];
        }
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 != length; i3 = AnonymousClass3K4.A0C(bArr, cArr[i3], i3)) {
        }
        return bArr;
    }

    public String getFormat() {
        return "RAW";
    }

    public int getIterationCount() {
        A00(this);
        return this.iterationCount;
    }

    public char[] getPassword() {
        A00(this);
        char[] cArr = this.password;
        if (cArr != null) {
            return C33111hx.A03(cArr);
        }
        throw AnonymousClass000.A0V("no password available");
    }

    public byte[] getSalt() {
        A00(this);
        return C33111hx.A02(this.salt);
    }

    public boolean isDestroyed() {
        return this.hasBeenDestroyed.get();
    }
}
