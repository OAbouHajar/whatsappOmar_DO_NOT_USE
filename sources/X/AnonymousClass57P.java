package X;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* renamed from: X.57P  reason: invalid class name */
public class AnonymousClass57P implements Enumeration {
    public Object A00;
    public C33011hn A01;

    public AnonymousClass57P(byte[] bArr) {
        C33011hn r0 = new C33011hn(bArr, true);
        this.A01 = r0;
        try {
            this.A00 = r0.A05();
        } catch (IOException e2) {
            throw new AnonymousClass44B(AnonymousClass000.A0g("malformed DER construction: ", e2), e2);
        }
    }

    public boolean hasMoreElements() {
        return AnonymousClass000.A1V(this.A00);
    }

    public Object nextElement() {
        Object obj = this.A00;
        if (obj != null) {
            try {
                this.A00 = this.A01.A05();
                return obj;
            } catch (IOException e2) {
                throw new AnonymousClass44B(AnonymousClass000.A0g("malformed DER construction: ", e2), e2);
            }
        } else {
            throw new NoSuchElementException();
        }
    }
}
