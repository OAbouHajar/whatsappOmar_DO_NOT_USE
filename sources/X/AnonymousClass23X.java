package X;

/* renamed from: X.23X  reason: invalid class name */
public class AnonymousClass23X {
    public final C15830rv A00;
    public final C28381Vw A01;

    public AnonymousClass23X(C15830rv r1, C28381Vw r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass23X) {
            AnonymousClass23X r4 = (AnonymousClass23X) obj;
            if (this.A01.equals(r4.A01)) {
                C15830rv r1 = this.A00;
                C15830rv r0 = r4.A00;
                if (r1 == null) {
                    return r0 == null;
                }
                if (r1.equals(r0)) {
                    return true;
                }
            }
        }
    }

    public int hashCode() {
        int hashCode = (this.A01.hashCode() + 31) * 31;
        C15830rv r0 = this.A00;
        return hashCode + (r0 == null ? 0 : r0.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01.toString());
        sb.append(". [sender_jid=");
        sb.append(this.A00);
        sb.append("]");
        return sb.toString();
    }
}
