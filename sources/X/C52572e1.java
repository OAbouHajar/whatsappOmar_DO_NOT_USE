package X;

/* renamed from: X.2e1  reason: invalid class name and case insensitive filesystem */
public class C52572e1 implements C40921uu {
    public final C15810rt A00;

    public C52572e1(C15810rt r1) {
        this.A00 = r1;
    }

    public boolean A90(C15830rv r3) {
        boolean z2;
        Boolean bool = Boolean.TRUE;
        Object obj = this.A00.A0C().get(r3);
        if (obj == null) {
            z2 = null;
        } else {
            synchronized (obj) {
            }
            z2 = false;
        }
        return bool.equals(z2);
    }
}
