package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5C3  reason: invalid class name */
public class AnonymousClass5C3 extends ArrayList<Object> implements List<Object>, AnonymousClass5VI, AnonymousClass5VJ {
    public static final long serialVersionUID = 9106884089231309568L;

    public String Agq() {
        C89984dJ r2 = C89774ct.A00;
        StringBuilder A0o = AnonymousClass000.A0o();
        try {
            C90044dP.A03.AiI(A0o, this, r2);
        } catch (IOException unused) {
        }
        return A0o.toString();
    }

    public String Agr(C89984dJ r3) {
        StringBuilder A0o = AnonymousClass000.A0o();
        try {
            C90044dP.A03.AiI(A0o, this, r3);
        } catch (IOException unused) {
        }
        return A0o.toString();
    }

    public void AiG(Appendable appendable) {
        C90044dP.A03.AiI(appendable, this, C89774ct.A00);
    }

    public void AiH(Appendable appendable, C89984dJ r3) {
        C90044dP.A03.AiI(appendable, this, r3);
    }

    public String toString() {
        return Agq();
    }
}
