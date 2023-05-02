package X;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;

/* renamed from: X.5Kp  reason: invalid class name */
public class AnonymousClass5Kp extends C106025Cf implements AnonymousClass5NP {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;

    public AnonymousClass5Kp(String str, C32041fY r2, int i2, int i3, int i4, int i5, boolean z2) {
        super(str, r2);
        this.A04 = z2;
        this.A03 = i2;
        this.A00 = i3;
        this.A02 = i4;
        this.A01 = i5;
    }

    public SecretKey engineGenerateSecret(KeySpec keySpec) {
        int i2;
        int i3;
        int i4;
        C46932Gv r7;
        String str;
        C32041fY r6;
        int i5;
        KeySpec keySpec2 = keySpec;
        if (keySpec instanceof PBEKeySpec) {
            PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec2;
            if (pBEKeySpec.getSalt() == null) {
                str = this.A00;
                r6 = this.A01;
                i2 = this.A03;
                i3 = this.A00;
                i4 = this.A02;
                i5 = this.A01;
                r7 = null;
            } else {
                boolean z2 = this.A04;
                i2 = this.A03;
                i3 = this.A00;
                i4 = this.A02;
                if (z2) {
                    int i6 = this.A01;
                    C89194bk A012 = C90294du.A01(i2, i3);
                    byte[] A022 = C90294du.A02(pBEKeySpec, i2);
                    byte[] salt = pBEKeySpec.getSalt();
                    int iterationCount = pBEKeySpec.getIterationCount();
                    A012.A01 = A022;
                    A012.A02 = salt;
                    A012.A00 = iterationCount;
                    r7 = i6 != 0 ? A012.A03(i4, i6) : A012.A02(i4);
                    for (int i7 = 0; i7 != A022.length; i7++) {
                        A022[i7] = 0;
                    }
                } else {
                    C89194bk A013 = C90294du.A01(i2, i3);
                    byte[] A023 = C90294du.A02(pBEKeySpec, i2);
                    byte[] salt2 = pBEKeySpec.getSalt();
                    int iterationCount2 = pBEKeySpec.getIterationCount();
                    A013.A01 = A023;
                    A013.A02 = salt2;
                    A013.A00 = iterationCount2;
                    r7 = A013.A01(i4);
                    for (int i8 = 0; i8 != A023.length; i8++) {
                        A023[i8] = 0;
                    }
                }
                str = this.A00;
                r6 = this.A01;
                i5 = this.A01;
            }
            return new AnonymousClass58X(str, pBEKeySpec, r6, r7, i2, i3, i4, i5);
        }
        throw new InvalidKeySpecException("Invalid KeySpec");
    }
}
