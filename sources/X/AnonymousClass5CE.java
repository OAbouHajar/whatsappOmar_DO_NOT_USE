package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.5CE  reason: invalid class name */
public class AnonymousClass5CE extends HashMap<String, Object> implements AnonymousClass5VI, AnonymousClass5VJ {
    public static final long serialVersionUID = -503443796854799292L;

    public String Agq() {
        C89984dJ r2 = C89774ct.A00;
        StringBuilder A0o = AnonymousClass000.A0o();
        try {
            C90044dP.A06.AiI(A0o, this, r2);
        } catch (IOException unused) {
        }
        return A0o.toString();
    }

    public String Agr(C89984dJ r3) {
        StringBuilder A0o = AnonymousClass000.A0o();
        try {
            C90044dP.A06.AiI(A0o, this, r3);
        } catch (IOException unused) {
        }
        return A0o.toString();
    }

    public void AiG(Appendable appendable) {
        C90044dP.A06.AiI(appendable, this, C89774ct.A00);
    }

    public void AiH(Appendable appendable, C89984dJ r3) {
        C90044dP.A06.AiI(appendable, this, r3);
    }

    public String toString() {
        C89984dJ r2 = C89774ct.A00;
        StringBuilder A0o = AnonymousClass000.A0o();
        try {
            C90044dP.A06.AiI(A0o, this, r2);
        } catch (IOException unused) {
        }
        return A0o.toString();
    }
}
