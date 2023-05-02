package X;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.0hc  reason: invalid class name and case insensitive filesystem */
public final class C10740hc implements Iterator, Map.Entry {
    public int A00;
    public int A01;
    public boolean A02 = false;
    public final /* synthetic */ AnonymousClass05D A03;

    public C10740hc(AnonymousClass05D r2) {
        this.A03 = r2;
        this.A00 = r2.A01() - 1;
        this.A01 = -1;
    }

    public boolean equals(Object obj) {
        if (!this.A02) {
            throw AnonymousClass000.A0V("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Map.Entry)) {
            return false;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            AnonymousClass05D r3 = this.A03;
            Object A032 = r3.A03(this.A01, 0);
            if (key != A032 && (key == null || !key.equals(A032))) {
                return false;
            }
            Object value = entry.getValue();
            Object A033 = r3.A03(this.A01, 1);
            return value == A033 || (value != null && value.equals(A033));
        }
    }

    public Object getKey() {
        if (this.A02) {
            return this.A03.A03(this.A01, 0);
        }
        throw AnonymousClass000.A0V("This container does not support retaining Map.Entry objects");
    }

    public Object getValue() {
        if (this.A02) {
            return this.A03.A03(this.A01, 1);
        }
        throw AnonymousClass000.A0V("This container does not support retaining Map.Entry objects");
    }

    public boolean hasNext() {
        return this.A01 < this.A00;
    }

    public int hashCode() {
        if (this.A02) {
            AnonymousClass05D r4 = this.A03;
            int i2 = this.A01;
            int i3 = 0;
            Object A032 = r4.A03(i2, 0);
            Object A033 = r4.A03(i2, 1);
            int A0C = AnonymousClass000.A0C(A032);
            if (A033 != null) {
                i3 = A033.hashCode();
            }
            return A0C ^ i3;
        }
        throw AnonymousClass000.A0V("This container does not support retaining Map.Entry objects");
    }

    public /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            this.A01++;
            this.A02 = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        if (this.A02) {
            this.A03.A07(this.A01);
            this.A01--;
            this.A00--;
            this.A02 = false;
            return;
        }
        throw new IllegalStateException();
    }

    public Object setValue(Object obj) {
        if (this.A02) {
            return this.A03.A04(this.A01, obj);
        }
        throw AnonymousClass000.A0V("This container does not support retaining Map.Entry objects");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(getKey());
        A0o.append("=");
        return AnonymousClass000.A0f(getValue(), A0o);
    }
}
