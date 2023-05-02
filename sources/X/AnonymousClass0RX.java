package X;

/* renamed from: X.0RX  reason: invalid class name */
public final class AnonymousClass0RX {
    public final AnonymousClass020 A00;
    public final AnonymousClass020 A01;
    public final AnonymousClass020 A02;
    public final AnonymousClass020 A03;
    public final AnonymousClass0YH A04;

    public AnonymousClass0RX(AnonymousClass020 r1, AnonymousClass020 r2, AnonymousClass020 r3, AnonymousClass020 r4, AnonymousClass0YH r5) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A04 = r5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0RX)) {
            return false;
        }
        AnonymousClass0RX r4 = (AnonymousClass0RX) obj;
        return this.A02.equals(r4.A02) && this.A03.equals(r4.A03) && this.A00.equals(r4.A00) && this.A01.equals(r4.A01) && this.A04.equals(r4.A04);
    }

    public int hashCode() {
        return AnonymousClass000.A0E(this.A01, AnonymousClass000.A0E(this.A00, AnonymousClass000.A0E(this.A03, (527 + this.A02.hashCode()) * 31))) + this.A04.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("VisibleRegion");
        A0r.append("{nearLeft=");
        A0r.append(this.A02);
        A0r.append(", nearRight=");
        A0r.append(this.A03);
        A0r.append(", farLeft=");
        A0r.append(this.A00);
        A0r.append(", farRight=");
        A0r.append(this.A01);
        A0r.append(", latLngBounds=");
        A0r.append(this.A04);
        return AnonymousClass000.A0h("}", A0r);
    }
}
