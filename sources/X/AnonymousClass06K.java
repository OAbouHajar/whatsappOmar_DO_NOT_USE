package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.06K  reason: invalid class name */
public final class AnonymousClass06K {
    public static AnonymousClass06K A01;
    public static final PorterDuff.Mode A02 = PorterDuff.Mode.SRC_IN;
    public AnonymousClass06L A00;

    public static synchronized PorterDuffColorFilter A00(PorterDuff.Mode mode, int i2) {
        PorterDuffColorFilter A002;
        synchronized (AnonymousClass06K.class) {
            A002 = AnonymousClass06L.A00(mode, i2);
        }
        return A002;
    }

    public static synchronized AnonymousClass06K A01() {
        AnonymousClass06K r0;
        synchronized (AnonymousClass06K.class) {
            if (A01 == null) {
                A02();
            }
            r0 = A01;
        }
        return r0;
    }

    public static synchronized void A02() {
        synchronized (AnonymousClass06K.class) {
            if (A01 == null) {
                AnonymousClass06K r1 = new AnonymousClass06K();
                A01 = r1;
                r1.A00 = AnonymousClass06L.A02();
                AnonymousClass06L r12 = A01.A00;
                AnonymousClass06S r0 = new AnonymousClass06S();
                synchronized (r12) {
                    r12.A01 = r0;
                }
            }
        }
    }

    public synchronized Drawable A03(Context context, int i2) {
        return this.A00.A05(context, i2);
    }
}
