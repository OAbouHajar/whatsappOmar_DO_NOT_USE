package X;

import java.util.List;

/* renamed from: X.0Qr  reason: invalid class name and case insensitive filesystem */
public final class C05370Qr {
    public final List A00;

    public C05370Qr(List list) {
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C05370Qr.class.equals(obj.getClass())) {
            return false;
        }
        return C18450wi.A0R(this.A00, ((C05370Qr) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return C003101j.A08(", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", this.A00, 56);
    }
}
