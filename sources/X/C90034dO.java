package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.4dO  reason: invalid class name and case insensitive filesystem */
public class C90034dO {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C90034dO.class, "_handled");
    public final Throwable A00;
    public volatile /* synthetic */ int _handled;

    public /* synthetic */ C90034dO(Throwable th) {
        this(th, false);
    }

    public C90034dO(Throwable th, boolean z2) {
        this.A00 = th;
        this._handled = z2 ? 1 : 0;
    }

    public final boolean A00() {
        return A01.compareAndSet(this, 0, 1);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(AnonymousClass000.A0c(this));
        A0o.append('[');
        A0o.append(this.A00);
        return AnonymousClass3K2.A0m(A0o);
    }
}
