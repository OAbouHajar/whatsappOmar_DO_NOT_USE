package X;

import com.obwhatsapp.R;

/* renamed from: X.3zq  reason: invalid class name and case insensitive filesystem */
public final class C79393zq extends AnonymousClass4QW {
    public final float A00;

    public C79393zq(float f2) {
        super(R.dimen.dimen088e);
        this.A00 = f2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C79393zq) && C18450wi.A0R(Float.valueOf(this.A00), Float.valueOf(((C79393zq) obj).A00)));
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Large(strokeWidth=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
