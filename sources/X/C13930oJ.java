package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0oJ  reason: invalid class name and case insensitive filesystem */
public final class C13930oJ {
    public final Object A00;
    public final List A01 = new ArrayList();

    public /* synthetic */ C13930oJ(Object obj) {
        this.A00 = obj;
    }

    public void A00(Object obj, String str) {
        List list = this.A01;
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(str.length() + 1 + valueOf.length());
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        list.add(sb.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.A00.getClass().getSimpleName());
        sb.append('{');
        List list = this.A01;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append((String) list.get(i2));
            if (i2 < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
