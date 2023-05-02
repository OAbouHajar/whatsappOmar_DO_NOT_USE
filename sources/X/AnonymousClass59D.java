package X;

/* renamed from: X.59D  reason: invalid class name */
public class AnonymousClass59D implements AnonymousClass5R0 {
    public void AiI(Appendable appendable, Object obj, C89984dJ r7) {
        appendable.append('[');
        boolean z2 = false;
        for (Object A00 : (Object[]) obj) {
            z2 = AnonymousClass3K3.A1S(appendable, z2);
            C89774ct.A00(appendable, A00, r7);
        }
        appendable.append(']');
    }
}
