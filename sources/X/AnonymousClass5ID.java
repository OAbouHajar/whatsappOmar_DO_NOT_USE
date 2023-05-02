package X;

import java.math.BigInteger;
import java.util.Hashtable;

/* renamed from: X.5ID  reason: invalid class name */
public class AnonymousClass5ID extends C32061fa {
    public static final Hashtable A01 = new Hashtable();
    public static final String[] A02 = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    public AnonymousClass5IZ A00;

    public AnonymousClass5ID(int i2) {
        this.A00 = new AnonymousClass5IZ(i2);
    }

    public static AnonymousClass5ID A00(Object obj) {
        if (!(obj instanceof AnonymousClass5ID)) {
            if (obj == null) {
                return null;
            }
            int A0A = AnonymousClass5IZ.A00(obj).A0A();
            Integer valueOf = Integer.valueOf(A0A);
            Hashtable hashtable = A01;
            if (!hashtable.containsKey(valueOf)) {
                hashtable.put(valueOf, new AnonymousClass5ID(A0A));
            }
            obj = hashtable.get(valueOf);
        }
        return (AnonymousClass5ID) obj;
    }

    public C32051fZ Agm() {
        return this.A00;
    }

    public String toString() {
        int intValue = new BigInteger(this.A00.A01).intValue();
        return AnonymousClass000.A0h((intValue < 0 || intValue > 10) ? "invalid" : A02[intValue], AnonymousClass000.A0r("CRLReason: "));
    }
}
