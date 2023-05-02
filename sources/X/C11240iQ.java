package X;

import java.security.Provider;

/* renamed from: X.0iQ  reason: invalid class name and case insensitive filesystem */
public final class C11240iQ extends Provider {
    public C11240iQ() {
        super("LinuxPRNG", 1.0d, "A Linux-specific random number provider that uses /dev/urandom");
        put("SecureRandom.SHA1PRNG", C11250iR.class.getName());
        put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
    }
}
