package X;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.03B  reason: invalid class name */
public final class AnonymousClass03B implements AnonymousClass03A {
    public static final AnonymousClass0UI A04 = new AnonymousClass0UI();
    public static final ReentrantLock A05 = new ReentrantLock();
    public static volatile AnonymousClass03B A06;
    public AnonymousClass03C A00;
    public final C07890cf A01;
    public final CopyOnWriteArrayList A02 = new CopyOnWriteArrayList();
    public final CopyOnWriteArraySet A03;

    public AnonymousClass03B(AnonymousClass03C r3) {
        this.A00 = r3;
        C07890cf r1 = new C07890cf(this);
        this.A01 = r1;
        AnonymousClass03C r0 = this.A00;
        if (r0 != null) {
            r0.Adt(r1);
        }
        this.A03 = new CopyOnWriteArraySet();
    }
}
