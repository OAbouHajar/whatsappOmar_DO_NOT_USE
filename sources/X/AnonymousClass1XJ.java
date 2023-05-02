package X;

/* renamed from: X.1XJ  reason: invalid class name */
public final class AnonymousClass1XJ {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public AnonymousClass1XJ(Integer num, boolean z2, boolean z3, boolean z4) {
        this.A02 = z2;
        this.A01 = z3;
        this.A00 = z4;
    }

    public AnonymousClass1XJ(boolean z2, boolean z3, boolean z4) {
        this((Integer) null, z2, z3, z4);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[interactive=");
        sb.append(this.A02);
        sb.append(", has_status=");
        sb.append(this.A01);
        sb.append(", has_nonstatus=");
        sb.append(this.A00);
        sb.append(", media_quality=");
        sb.append((Object) null);
        sb.append("]");
        return sb.toString();
    }
}
