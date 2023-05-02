package X;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* renamed from: X.57N  reason: invalid class name */
public class AnonymousClass57N implements Enumeration {
    public int A00 = 0;
    public final /* synthetic */ C32411gJ A01;

    public AnonymousClass57N(C32411gJ r2) {
        this.A01 = r2;
    }

    public boolean hasMoreElements() {
        return AnonymousClass3K3.A1Q(this.A00, this.A01.A00.length);
    }

    public Object nextElement() {
        int i2 = this.A00;
        C32071fb[] r1 = this.A01.A00;
        if (i2 < r1.length) {
            this.A00 = i2 + 1;
            return r1[i2];
        }
        throw new NoSuchElementException();
    }
}
