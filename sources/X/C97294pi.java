package X;

import android.os.Looper;
import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4pi  reason: invalid class name and case insensitive filesystem */
public abstract class C97294pi implements AnonymousClass2PW {
    public Looper A00;
    public Timeline A01;
    public final AnonymousClass4JT A02 = new AnonymousClass4JT((C30271c3) null, new CopyOnWriteArrayList(), 0);
    public final C30231bz A03 = new C30231bz((C30271c3) null, new CopyOnWriteArrayList(), 0);
    public final ArrayList A04 = C13690nt.A0i(1);
    public final HashSet A05 = new HashSet(1);

    public void A00() {
        if (this instanceof AnonymousClass3VO) {
            for (AnonymousClass4JY r0 : ((AnonymousClass3VO) this).A02.values()) {
                AnonymousClass2PW r3 = r0.A01;
                C108315Nm r2 = r0.A00;
                C97294pi r32 = (C97294pi) r3;
                HashSet hashSet = r32.A05;
                boolean isEmpty = hashSet.isEmpty();
                hashSet.add(r2);
                if (isEmpty) {
                    r32.A00();
                }
            }
        }
    }

    public abstract void A01();

    public final void A02(Timeline timeline) {
        this.A01 = timeline;
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((C108315Nm) it.next()).AXM(timeline, this);
        }
    }

    public abstract void A03(AnonymousClass5LZ r1);

    public final void A7x(C108315Nm r4) {
        HashSet hashSet = this.A05;
        boolean z2 = !hashSet.isEmpty();
        hashSet.remove(r4);
        if (z2 && hashSet.isEmpty()) {
            if (this instanceof AnonymousClass3VO) {
                for (AnonymousClass4JY r0 : ((AnonymousClass3VO) this).A02.values()) {
                    r0.A01.A7x(r0.A00);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == r3) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Aan(X.C108315Nm r5, X.AnonymousClass5LZ r6) {
        /*
            r4 = this;
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Looper r1 = r4.A00
            if (r1 == 0) goto L_0x000b
            r0 = 0
            if (r1 != r3) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            X.C90524eJ.A03(r0)
            com.google.android.exoplayer2.Timeline r2 = r4.A01
            java.util.ArrayList r0 = r4.A04
            r0.add(r5)
            android.os.Looper r0 = r4.A00
            if (r0 != 0) goto L_0x0025
            r4.A00 = r3
            java.util.HashSet r0 = r4.A05
            r0.add(r5)
            r4.A03(r6)
        L_0x0024:
            return
        L_0x0025:
            if (r2 == 0) goto L_0x0024
            java.util.HashSet r1 = r4.A05
            boolean r0 = r1.isEmpty()
            r1.add(r5)
            if (r0 == 0) goto L_0x0035
            r4.A00()
        L_0x0035:
            r5.AXM(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97294pi.Aan(X.5Nm, X.5LZ):void");
    }

    public final void Abm(C108315Nm r2) {
        ArrayList arrayList = this.A04;
        arrayList.remove(r2);
        if (arrayList.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A05.clear();
            A01();
            return;
        }
        A7x(r2);
    }

    public final void Abw(C30241c0 r5) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A03.A02;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass4GG r1 = (AnonymousClass4GG) it.next();
            if (r1.A01 == r5) {
                copyOnWriteArrayList.remove(r1);
            }
        }
    }
}
