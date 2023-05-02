package X;

import java.util.Map;

/* renamed from: X.57p  reason: invalid class name and case insensitive filesystem */
public final class C1049657p implements Map.Entry, C23861Dq {
    public final int A00;
    public final AnonymousClass28m A01;

    public C1049657p(AnonymousClass28m r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return C18450wi.A0R(entry.getKey(), getKey()) && C18450wi.A0R(entry.getValue(), getValue());
        }
    }

    public Object getKey() {
        return this.A01.keysArray[this.A00];
    }

    public Object getValue() {
        Object[] objArr = this.A01.valuesArray;
        C18450wi.A0F(objArr);
        return objArr[this.A00];
    }

    public int hashCode() {
        int i2 = 0;
        int A0C = AnonymousClass000.A0C(getKey());
        Object value = getValue();
        if (value != null) {
            i2 = value.hashCode();
        }
        return A0C ^ i2;
    }

    public Object setValue(Object obj) {
        AnonymousClass28m r1 = this.A01;
        r1.A02();
        Object[] objArr = r1.valuesArray;
        if (objArr == null) {
            objArr = new Object[r1.keysArray.length];
            r1.valuesArray = objArr;
        }
        int i2 = this.A00;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(getKey());
        A0o.append('=');
        return AnonymousClass000.A0f(getValue(), A0o);
    }
}
