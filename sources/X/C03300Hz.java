package X;

import android.graphics.Matrix;
import java.util.List;

/* renamed from: X.0Hz  reason: invalid class name and case insensitive filesystem */
public abstract class C03300Hz extends AnonymousClass0IL implements C13170la {
    public Matrix A00;
    public C03610Je A01;
    public Boolean A02;
    public String A03;
    public List A04 = AnonymousClass000.A0u();

    public void A4Y(AnonymousClass0PV r3) {
        if (r3 instanceof AnonymousClass0I1) {
            this.A04.add(r3);
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Gradient elements cannot contain ");
        A0r.append(r3);
        throw C11550ix.A00(AnonymousClass000.A0h(" elements.", A0r));
    }

    public List AAc() {
        return this.A04;
    }
}
