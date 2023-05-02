package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1U5  reason: invalid class name */
public class AnonymousClass1U5 implements C18000vz, C003801r {
    public final AtomicReference A00 = new AtomicReference("D");

    public AnonymousClass1U5(C18260wP r3) {
        r3.A02(this);
    }

    public String A9a() {
        return (String) this.A00.get();
    }

    public void AP4(AnonymousClass1UX r3) {
        String str = "D";
        if (r3.A01) {
            if (r3.A03) {
                str = "M";
            } else if (r3.A04) {
                str = "W";
            }
        }
        this.A00.set(str);
    }
}
