package X;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3pV  reason: invalid class name */
public class AnonymousClass3pV extends C43081zJ {
    public int A00;
    public final List A01;

    public AnonymousClass3pV(C43061zH r3, InputStream inputStream, int[] iArr) {
        super(r3, inputStream);
        ArrayList A0u = AnonymousClass000.A0u();
        this.A01 = A0u;
        A0u.addAll(C809446f.A00((Long) null, iArr));
    }

    public int A00() {
        return AnonymousClass000.A0D(this.A01.get(this.A00));
    }

    public void A01() {
        this.A00++;
    }

    public boolean A02() {
        return this.A00 == this.A01.size() - 1;
    }
}
