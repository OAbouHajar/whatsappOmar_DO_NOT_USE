package X;

import javax.net.ssl.SSLException;

/* renamed from: X.1aU  reason: invalid class name and case insensitive filesystem */
public class C29351aU extends Exception {
    public final byte description;
    public final boolean errorTransient = false;
    public final SSLException ex;

    public C29351aU(SSLException sSLException, byte b2) {
        this.description = b2;
        this.ex = sSLException;
    }

    public C29351aU(SSLException sSLException, byte b2, boolean z2) {
        this.description = b2;
        this.ex = sSLException;
    }
}
