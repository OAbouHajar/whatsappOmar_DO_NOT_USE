package X;

import android.graphics.Rect;

/* renamed from: X.0Qs  reason: invalid class name and case insensitive filesystem */
public final class C05380Qs {
    public final AnonymousClass0RQ A00;

    public C05380Qs(Rect rect) {
        this.A00 = new AnonymousClass0RQ(rect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C05380Qs.class.equals(obj.getClass())) {
            return false;
        }
        return C18450wi.A0R(this.A00, ((C05380Qs) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WindowMetrics { bounds: ");
        AnonymousClass0RQ r0 = this.A00;
        A0r.append(new Rect(r0.A01, r0.A03, r0.A02, r0.A00));
        return AnonymousClass000.A0h(" }", A0r);
    }
}
