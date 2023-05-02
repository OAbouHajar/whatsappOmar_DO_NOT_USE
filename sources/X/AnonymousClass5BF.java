package X;

import java.security.AlgorithmParameterGeneratorSpi;
import java.security.SecureRandom;

/* renamed from: X.5BF  reason: invalid class name */
public abstract class AnonymousClass5BF extends AlgorithmParameterGeneratorSpi {
    public SecureRandom A00;
    public final AnonymousClass5NQ A01 = new AnonymousClass5AA();

    public void engineInit(int i2, SecureRandom secureRandom) {
        this.A00 = secureRandom;
    }
}
