package X;

import java.security.Provider;
import java.security.Security;

/* renamed from: X.5AA  reason: invalid class name */
public class AnonymousClass5AA implements AnonymousClass5NQ {
    public static volatile Provider A01;
    public final Provider A00;

    public AnonymousClass5AA() {
        Provider provider;
        synchronized (AnonymousClass5AA.class) {
            provider = Security.getProvider("SC");
            if (!(provider instanceof AnonymousClass1UN)) {
                if (A01 != null) {
                    provider = A01;
                } else {
                    A01 = new AnonymousClass1UN();
                    provider = A01;
                }
            }
        }
        this.A00 = provider;
    }
}
