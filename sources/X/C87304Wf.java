package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.IDxCallbackShape188S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape1S0201000_I1;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4Wf  reason: invalid class name and case insensitive filesystem */
public final class C87304Wf {
    public boolean A00;
    public final AnonymousClass5TU A01;
    public final C107695La A02;
    public final C108375Ns A03;
    public final AnonymousClass5OI A04;
    public final ArrayDeque A05 = new ArrayDeque();
    public final ArrayDeque A06 = new ArrayDeque();
    public final CopyOnWriteArraySet A07;

    public C87304Wf(Looper looper, AnonymousClass5TU r4, C108375Ns r5, AnonymousClass5OI r6, CopyOnWriteArraySet copyOnWriteArraySet) {
        this.A01 = r4;
        this.A07 = copyOnWriteArraySet;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = new C97684qO(new Handler(looper, new IDxCallbackShape188S0100000_2_I1(this, 0)));
    }

    public void A00() {
        ArrayDeque arrayDeque = this.A06;
        if (!arrayDeque.isEmpty()) {
            Handler handler = ((C97684qO) this.A02).A00;
            if (!handler.hasMessages(0)) {
                handler.obtainMessage(0).sendToTarget();
            }
            ArrayDeque arrayDeque2 = this.A05;
            boolean z2 = !arrayDeque2.isEmpty();
            arrayDeque2.addAll(arrayDeque);
            arrayDeque.clear();
            if (!z2) {
                while (!arrayDeque2.isEmpty()) {
                    ((Runnable) arrayDeque2.peekFirst()).run();
                    arrayDeque2.removeFirst();
                }
            }
        }
    }

    public void A01() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A07;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            AnonymousClass0QU r3 = (AnonymousClass0QU) it.next();
            C108375Ns r2 = this.A03;
            r3.A02 = true;
            if (r3.A01) {
                r2.AIY(r3.A00, r3.A03);
            }
        }
        copyOnWriteArraySet.clear();
        this.A00 = true;
    }

    public void A02(C108365Nr r5, int i2) {
        this.A06.add(new RunnableRunnableShape1S0201000_I1(r5, i2, new CopyOnWriteArraySet(this.A07), 0));
    }
}
