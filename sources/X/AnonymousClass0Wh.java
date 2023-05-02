package X;

import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.0Wh  reason: invalid class name */
public class AnonymousClass0Wh {
    public final IdentityCredential A00;
    public final Signature A01;
    public final Cipher A02;
    public final Mac A03;

    public AnonymousClass0Wh(IdentityCredential identityCredential) {
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A00 = identityCredential;
    }

    public AnonymousClass0Wh(Signature signature) {
        this.A01 = signature;
        this.A02 = null;
        this.A03 = null;
        this.A00 = null;
    }

    public AnonymousClass0Wh(Cipher cipher) {
        this.A01 = null;
        this.A02 = cipher;
        this.A03 = null;
        this.A00 = null;
    }

    public AnonymousClass0Wh(Mac mac) {
        this.A01 = null;
        this.A02 = null;
        this.A03 = mac;
        this.A00 = null;
    }

    public IdentityCredential A00() {
        return this.A00;
    }
}
