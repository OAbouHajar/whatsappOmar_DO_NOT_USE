package X;

import java.util.Map;

/* renamed from: X.57o  reason: invalid class name and case insensitive filesystem */
public abstract class C1049557o implements Map.Entry {
    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AnonymousClass45Q.A00(getKey(), entry.getKey()) && AnonymousClass45Q.A00(getValue(), entry.getValue());
    }

    public abstract Object getKey();

    public abstract Object getValue();

    public int hashCode() {
        Object key = getKey();
        Object value = getValue();
        int i2 = 0;
        int A0C = AnonymousClass000.A0C(key);
        if (value != null) {
            i2 = value.hashCode();
        }
        return A0C ^ i2;
    }

    public abstract Object setValue(Object obj);

    public String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder A0g = C13690nt.A0g(valueOf.length() + 1 + valueOf2.length());
        A0g.append(valueOf);
        A0g.append("=");
        return AnonymousClass000.A0h(valueOf2, A0g);
    }
}
