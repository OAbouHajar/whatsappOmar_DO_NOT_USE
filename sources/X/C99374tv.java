package X;

/* renamed from: X.4tv  reason: invalid class name and case insensitive filesystem */
public final class C99374tv implements AnonymousClass5OQ {
    public final AnonymousClass5OQ A00;

    public C99374tv(AnonymousClass5OQ r1) {
        this.A00 = r1;
    }

    public boolean A54(C84634Lh r2) {
        return this.A00.A54(r2);
    }

    public String toString() {
        StringBuilder A0r;
        String str;
        String obj = this.A00.toString();
        if (obj.startsWith("(")) {
            A0r = AnonymousClass000.A0r("[?");
            A0r.append(obj);
            str = "]";
        } else {
            A0r = AnonymousClass000.A0r("[?(");
            A0r.append(obj);
            str = ")]";
        }
        return AnonymousClass000.A0h(str, A0r);
    }
}
