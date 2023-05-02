package X;

/* renamed from: X.5hc  reason: invalid class name and case insensitive filesystem */
public final class C111905hc extends C16470t7 {
    public final String A00;
    public final C117195sb[] A01;

    public C111905hc(AnonymousClass00F r2, String str, C117195sb[] r4, int i2, int i3) {
        super(i2, r2, i3, -1);
        this.A00 = str;
        this.A01 = r4;
    }

    public void serialize(C29081Zz r6) {
        for (C117195sb r0 : this.A01) {
            r6.AdT(r0.A00, r0.A02);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(256);
        sb.append(this.A00);
        sb.append(" {");
        for (C117195sb r1 : this.A01) {
            Object obj = r1.A01;
            if (obj != null) {
                C16470t7.appendFieldToStringBuilder(sb, r1.A03, String.valueOf(obj));
            }
        }
        return AnonymousClass000.A0h("}", sb);
    }
}
