package X;

import java.util.List;

/* renamed from: X.0dY  reason: invalid class name and case insensitive filesystem */
public final class C08380dY implements C13310lp {
    public float A00 = -1.0f;
    public C06520Wl A01 = null;
    public C06520Wl A02;
    public final List A03;

    public C08380dY(List list) {
        this.A03 = list;
        this.A02 = A00(0.0f);
    }

    public final C06520Wl A00(float f2) {
        List list = this.A03;
        C06520Wl A0R = AnonymousClass000.A0R(list, list.size() - 1);
        if (f2 < A0R.A02()) {
            int size = list.size() - 2;
            while (size >= 1) {
                A0R = AnonymousClass000.A0R(list, size);
                if (this.A02 == A0R || f2 < A0R.A02() || f2 >= A0R.A01()) {
                    size--;
                }
            }
            return AnonymousClass000.A0R(list, 0);
        }
        return A0R;
    }

    public C06520Wl ABM() {
        return this.A02;
    }

    public float ABz() {
        List list = this.A03;
        return AnonymousClass000.A0R(list, list.size() - 1).A01();
    }

    public float AGE() {
        return AnonymousClass000.A0R(this.A03, 0).A02();
    }

    public boolean AIe(float f2) {
        C06520Wl r0 = this.A01;
        C06520Wl r1 = this.A02;
        if (r0 == r1 && this.A00 == f2) {
            return true;
        }
        this.A01 = r1;
        this.A00 = f2;
        return false;
    }

    public boolean AJu(float f2) {
        C06520Wl r1 = this.A02;
        if (f2 >= r1.A02() && f2 < r1.A01()) {
            return !r1.A03();
        }
        this.A02 = A00(f2);
        return true;
    }

    public boolean isEmpty() {
        return false;
    }
}
