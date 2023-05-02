package X;

/* renamed from: X.2gT  reason: invalid class name and case insensitive filesystem */
public final class C53892gT {
    public final String A00;

    public C53892gT() {
        this("");
    }

    public C53892gT(String str) {
        C18450wi.A0H(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C53892gT) && C18450wi.A0R(this.A00, ((C53892gT) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PhoenixFlowInfo(config=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
