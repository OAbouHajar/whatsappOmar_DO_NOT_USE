package X;

import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.5Cd  reason: invalid class name and case insensitive filesystem */
public class C106005Cd extends KeyGeneratorSpi {
    public int A00;
    public String A01;
    public AnonymousClass4U8 A02;
    public boolean A03 = true;

    public C106005Cd(String str, AnonymousClass4U8 r3, int i2) {
        this.A01 = str;
        this.A00 = i2;
        this.A02 = r3;
    }

    public SecretKey engineGenerateKey() {
        if (this.A03) {
            this.A02.A00(new AnonymousClass4JE(this.A00, C90614eS.A00()));
            this.A03 = false;
        }
        return new SecretKeySpec(this.A02.A01(), this.A01);
    }

    public void engineInit(int i2, SecureRandom secureRandom) {
        if (secureRandom == null) {
            try {
                secureRandom = C90614eS.A00();
            } catch (IllegalArgumentException e2) {
                throw new InvalidParameterException(e2.getMessage());
            }
        }
        this.A02.A00(new AnonymousClass4JE(i2, secureRandom));
        this.A03 = false;
    }

    public void engineInit(SecureRandom secureRandom) {
        if (secureRandom != null) {
            this.A02.A00(new AnonymousClass4JE(this.A00, secureRandom));
            this.A03 = false;
        }
    }

    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        throw AnonymousClass3K4.A0d("Not Implemented");
    }
}
