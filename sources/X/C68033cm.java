package X;

import java.io.Serializable;

/* renamed from: X.3cm  reason: invalid class name and case insensitive filesystem */
public final class C68033cm extends AnonymousClass57I implements Serializable {
    public static final long serialVersionUID = 0;
    public final AnonymousClass57I forwardOrder;

    public C68033cm(AnonymousClass57I r1) {
        this.forwardOrder = r1;
    }

    public int compare(Object obj, Object obj2) {
        return this.forwardOrder.compare(obj2, obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C68033cm) {
            return this.forwardOrder.equals(((C68033cm) obj).forwardOrder);
        }
        return false;
    }

    public int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    public AnonymousClass57I reverse() {
        return this.forwardOrder;
    }

    public String toString() {
        String valueOf = String.valueOf(this.forwardOrder);
        StringBuilder A0g = C13690nt.A0g(valueOf.length() + 10);
        A0g.append(valueOf);
        return AnonymousClass000.A0h(".reverse()", A0g);
    }
}
