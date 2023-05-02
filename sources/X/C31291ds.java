package X;

/* renamed from: X.1ds  reason: invalid class name and case insensitive filesystem */
public final class C31291ds extends C31301dt {
    public final C31261dp A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31291ds(C31261dp r2, String str) {
        super(AnonymousClass428.A0W);
        C18450wi.A0H(str, 1);
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C31291ds) {
            C31291ds r3 = (C31291ds) obj;
            return this.A00 == r3.A00 && C18450wi.A0R(this.A01, r3.A01);
        }
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SearchContextChipViewItem(category=");
        sb.append(this.A01);
        sb.append(", searchContextChipItemClickListener=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
