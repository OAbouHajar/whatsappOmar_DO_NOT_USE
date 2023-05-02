package X;

import java.util.UUID;

/* renamed from: X.1L4  reason: invalid class name */
public class AnonymousClass1L4 {
    public int A00 = 0;
    public int A01 = 0;
    public String A02 = null;
    public boolean A03 = false;

    public String A00() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        String obj = UUID.randomUUID().toString();
        this.A02 = obj;
        this.A02 = obj;
        return obj;
    }
}
