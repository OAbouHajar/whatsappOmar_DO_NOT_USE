package X;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.04m  reason: invalid class name */
public class AnonymousClass04m {
    public final Signature A00;
    public final Cipher A01;
    public final Mac A02;

    public AnonymousClass04m(Signature signature) {
        this.A00 = signature;
        this.A01 = null;
        this.A02 = null;
    }

    public AnonymousClass04m(Cipher cipher) {
        this.A01 = cipher;
        this.A00 = null;
        this.A02 = null;
    }

    public AnonymousClass04m(Mac mac) {
        this.A02 = mac;
        this.A01 = null;
        this.A00 = null;
    }
}
