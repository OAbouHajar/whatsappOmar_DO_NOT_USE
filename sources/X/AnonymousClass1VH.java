package X;

import android.os.SystemClock;

/* renamed from: X.1VH  reason: invalid class name */
public class AnonymousClass1VH implements AnonymousClass01J, AnonymousClass01D {
    public Object A00 = null;
    public AnonymousClass01J A01;

    public AnonymousClass1VH(AnonymousClass01J r2) {
        this.A01 = r2;
    }

    public Object get() {
        Object obj = this.A00;
        if (obj == null) {
            AnonymousClass01J r1 = this.A01;
            AnonymousClass00B.A0G(true);
            SystemClock.uptimeMillis();
            try {
                obj = r1.get();
                AnonymousClass00B.A06(obj);
                this.A00 = obj;
            } finally {
                SystemClock.uptimeMillis();
            }
        }
        return obj;
    }
}
