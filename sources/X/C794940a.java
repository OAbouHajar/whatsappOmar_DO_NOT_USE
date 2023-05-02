package X;

import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

/* renamed from: X.40a  reason: invalid class name and case insensitive filesystem */
public class C794940a extends OutputStream {
    public Signature A00;

    public C794940a(Signature signature) {
        this.A00 = signature;
    }

    public void write(int i2) {
        try {
            this.A00.update((byte) i2);
        } catch (SignatureException e2) {
            throw AnonymousClass3K3.A0e(e2.getMessage());
        }
    }

    public void write(byte[] bArr) {
        try {
            this.A00.update(bArr);
        } catch (SignatureException e2) {
            throw AnonymousClass3K3.A0e(e2.getMessage());
        }
    }

    public void write(byte[] bArr, int i2, int i3) {
        try {
            this.A00.update(bArr, i2, i3);
        } catch (SignatureException e2) {
            throw AnonymousClass3K3.A0e(e2.getMessage());
        }
    }
}
