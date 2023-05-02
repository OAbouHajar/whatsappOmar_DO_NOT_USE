package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.4bd  reason: invalid class name and case insensitive filesystem */
public class C89124bd {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(C89124bd.class, Object.class, "_cur");
    public volatile /* synthetic */ Object _cur = new C89404c6(8, false);

    public final int A00() {
        long j2 = ((C89404c6) this._cur)._state;
        return 1073741823 & (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j2) >> 0)));
    }

    public final Object A01() {
        while (true) {
            C89404c6 r2 = (C89404c6) this._cur;
            Object A01 = r2.A01();
            if (A01 != C89404c6.A04) {
                return A01;
            }
            AnonymousClass0LG.A00(this, r2, r2.A02(), A00);
        }
    }

    public final boolean A02(Object obj) {
        while (true) {
            C89404c6 r2 = (C89404c6) this._cur;
            int A002 = r2.A00(obj);
            if (A002 == 0) {
                return true;
            }
            if (A002 != 1) {
                return false;
            }
            AnonymousClass0LG.A00(this, r2, r2.A02(), A00);
        }
    }
}
