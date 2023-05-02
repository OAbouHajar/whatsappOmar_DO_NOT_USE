package X;

import java.util.List;

/* renamed from: X.0dX  reason: invalid class name */
public final class AnonymousClass0dX implements C13310lp {
    public float A00 = -1.0f;
    public final C06520Wl A01;

    public AnonymousClass0dX(List list) {
        this.A01 = AnonymousClass000.A0R(list, 0);
    }

    public C06520Wl ABM() {
        return this.A01;
    }

    public float ABz() {
        return this.A01.A01();
    }

    public float AGE() {
        return this.A01.A02();
    }

    public boolean AIe(float f2) {
        if (this.A00 == f2) {
            return true;
        }
        this.A00 = f2;
        return false;
    }

    public boolean AJu(float f2) {
        return !this.A01.A03();
    }

    public boolean isEmpty() {
        return false;
    }
}
