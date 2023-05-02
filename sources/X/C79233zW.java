package X;

/* renamed from: X.3zW  reason: invalid class name and case insensitive filesystem */
public final class C79233zW extends C812947p {
    public final AnonymousClass2WZ A00;

    public C79233zW(AnonymousClass2WZ r1) {
        this.A00 = r1;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C79233zW) && C18450wi.A0R(this.A00, ((C79233zW) obj).A00);
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("BloksLayoutDataError(layoutData=");
        A0r.append(this.A00);
        return AnonymousClass000.A0h(")", A0r);
    }
}
