package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.facebook.redex.RunnableRunnableShape0S1200000_I0;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0pz  reason: invalid class name and case insensitive filesystem */
public class C14910pz {
    public static final Handler A0L = new Handler(Looper.getMainLooper());
    public int A00;
    public AnonymousClass4RS A01;
    public AnonymousClass4O3 A02;
    public AnonymousClass5OL A03;
    public C88964bN A04 = new C88964bN();
    public C31201dg A05;
    public Object A06 = new Object();
    public WeakReference A07 = new WeakReference((Object) null);
    public Map A08 = Collections.emptyMap();
    public boolean A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public final C88184a5 A0C;
    public final AnonymousClass228 A0D;
    public final AnonymousClass5MN A0E;
    public final Runnable A0F = new RunnableRunnableShape1S0100000_I0((Object) this, 23);
    public final List A0G = new ArrayList();
    public final List A0H = new ArrayList();
    public final List A0I = new ArrayList();
    public final List A0J = new ArrayList();
    public final Map A0K = new HashMap();

    public C14910pz(C88184a5 r3, C31201dg r4, AnonymousClass228 r5, AnonymousClass5MN r6) {
        this.A05 = r4;
        this.A0C = r3;
        this.A0D = r5;
        this.A0E = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0153, code lost:
        if (r8 != null) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0155, code lost:
        r3 = r3;
        r8 = r2.A03;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair A00(java.util.List r24) {
        /*
            r23 = this;
            java.lang.String r0 = "Bloks ProcessResources"
            X.C89644cb.A01(r0)
            java.util.LinkedList r6 = new java.util.LinkedList     // Catch:{ all -> 0x01a4 }
            r0 = r24
            r6.<init>(r0)     // Catch:{ all -> 0x01a4 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x01a4 }
            r4.<init>()     // Catch:{ all -> 0x01a4 }
            r5 = r23
            java.lang.ref.WeakReference r0 = r5.A07     // Catch:{ all -> 0x01a4 }
            java.lang.Object r15 = r0.get()     // Catch:{ all -> 0x01a4 }
            X.0q7 r15 = (X.C14990q7) r15     // Catch:{ all -> 0x01a4 }
            if (r15 != 0) goto L_0x002b
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01a4 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01a4 }
            r0.<init>()     // Catch:{ all -> 0x01a4 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x01a4 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x01a4 }
            goto L_0x01a0
        L_0x002b:
            X.4bN r2 = r5.A04     // Catch:{ all -> 0x01a4 }
            X.22A r0 = r15.A02     // Catch:{ all -> 0x01a4 }
            r20 = 0
            X.4CE r0 = r0.A01     // Catch:{ all -> 0x01a4 }
            X.4K0 r17 = X.C90154da.A01(r0)     // Catch:{ all -> 0x01a4 }
            X.1Jc r18 = X.C62183Bz.A04(r15)     // Catch:{ all -> 0x01a4 }
            r1 = 2131362235(0x7f0a01bb, float:1.8344245E38)
            android.util.SparseArray r0 = r15.A01     // Catch:{ all -> 0x01a4 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x01a4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01a4 }
            X.4YH r14 = X.AnonymousClass4YH.A00     // Catch:{ all -> 0x01a4 }
            r22 = r20
            X.0q4 r13 = new X.0q4     // Catch:{ all -> 0x01a4 }
            r19 = r0
            r21 = r20
            r16 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x01a4 }
            X.4bN r7 = r5.A04     // Catch:{ all -> 0x01a4 }
        L_0x0057:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x0191
            java.lang.Object r8 = r6.poll()     // Catch:{ all -> 0x01a4 }
            X.4a5 r8 = (X.C88184a5) r8     // Catch:{ all -> 0x01a4 }
            X.4bN r9 = r5.A04     // Catch:{ all -> 0x01a4 }
            java.util.Map r1 = r8.A03     // Catch:{ all -> 0x01a4 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x0082
            java.util.Map r0 = r9.A01     // Catch:{ all -> 0x01a4 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x01a4 }
            r3.<init>(r0)     // Catch:{ all -> 0x01a4 }
            r3.putAll(r1)     // Catch:{ all -> 0x01a4 }
            java.util.Map r2 = r9.A02     // Catch:{ all -> 0x01a4 }
            java.util.Map r1 = r9.A03     // Catch:{ all -> 0x01a4 }
            java.util.Map r0 = r9.A00     // Catch:{ all -> 0x01a4 }
            X.4bN r9 = new X.4bN     // Catch:{ all -> 0x01a4 }
            r9.<init>(r2, r3, r1, r0)     // Catch:{ all -> 0x01a4 }
        L_0x0082:
            r5.A04 = r9     // Catch:{ all -> 0x01a4 }
            java.util.List r0 = r8.A00     // Catch:{ all -> 0x01a4 }
            if (r0 == 0) goto L_0x0095
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x0095
            java.lang.String r0 = "Initialize BloksComponentQueryManager"
            X.C89644cb.A01(r0)     // Catch:{ all -> 0x01a4 }
            goto L_0x0164
        L_0x0095:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01a4 }
            r0.<init>()     // Catch:{ all -> 0x01a4 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x01a4 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01a4 }
            if (r0 == 0) goto L_0x00b0
            r1.next()     // Catch:{ all -> 0x01a4 }
            java.lang.String r0 = "getVariableUpdate"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x01a4 }
            r1.<init>(r0)     // Catch:{ all -> 0x01a4 }
            goto L_0x0190
        L_0x00b0:
            java.util.List r0 = r8.A02     // Catch:{ all -> 0x01a4 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x01a4 }
            r3 = 0
            r8 = r3
        L_0x00b8:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x01a4 }
            if (r0 == 0) goto L_0x014a
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x01a4 }
            X.229 r10 = (X.AnonymousClass229) r10     // Catch:{ all -> 0x01a4 }
            java.lang.String r2 = r10.A00     // Catch:{ all -> 0x01a4 }
            if (r3 == 0) goto L_0x00ca
            r0 = r3
            goto L_0x00ce
        L_0x00ca:
            X.4bN r0 = r5.A04     // Catch:{ all -> 0x01a4 }
            java.util.Map r0 = r0.A02     // Catch:{ all -> 0x01a4 }
        L_0x00ce:
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x00e2
            if (r3 != 0) goto L_0x00df
            X.4bN r0 = r5.A04     // Catch:{ all -> 0x01a4 }
            java.util.Map r0 = r0.A02     // Catch:{ all -> 0x01a4 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x01a4 }
            r3.<init>(r0)     // Catch:{ all -> 0x01a4 }
        L_0x00df:
            r3.put(r2, r10)     // Catch:{ all -> 0x01a4 }
        L_0x00e2:
            if (r8 == 0) goto L_0x00e6
            r0 = r8
            goto L_0x00ea
        L_0x00e6:
            X.4bN r0 = r5.A04     // Catch:{ all -> 0x01a4 }
            java.util.Map r0 = r0.A03     // Catch:{ all -> 0x01a4 }
        L_0x00ea:
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x00b8
            java.lang.String r9 = r10.A01     // Catch:{ all -> 0x01a4 }
            r0 = 2131362229(0x7f0a01b5, float:1.8344233E38)
            java.lang.Object r0 = r15.A02(r0)     // Catch:{ all -> 0x01a4 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x00fe
            goto L_0x0105
        L_0x00fe:
            java.lang.Object r1 = r0.get(r9)     // Catch:{ all -> 0x01a4 }
            X.0ux r1 = (X.C17360ux) r1     // Catch:{ all -> 0x01a4 }
            goto L_0x0106
        L_0x0105:
            r1 = 0
        L_0x0106:
            if (r1 == 0) goto L_0x0175
            X.228 r0 = r5.A0D     // Catch:{ all -> 0x01a4 }
            r14 = r1
            r16 = r5
            r17 = r0
            r18 = r10
            r19 = r13
            X.22B r9 = r14.Aew(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01a4 }
            X.4RS r0 = r5.A01     // Catch:{ all -> 0x01a4 }
            java.lang.Runnable r11 = r9.A01     // Catch:{ all -> 0x01a4 }
            if (r11 == 0) goto L_0x0138
            java.util.List r10 = r0.A02     // Catch:{ all -> 0x01a4 }
            monitor-enter(r10)     // Catch:{ all -> 0x01a4 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x0172 }
            if (r0 == 0) goto L_0x012d
            java.lang.String r1 = "BloksContextBindManager"
            java.lang.String r0 = "Subsctiption added after destroy"
            X.C29691b2.A00(r1, r0)     // Catch:{ all -> 0x0172 }
        L_0x012b:
            monitor-exit(r10)     // Catch:{ all -> 0x0172 }
            goto L_0x0133
        L_0x012d:
            r10.add(r11)     // Catch:{ all -> 0x0172 }
            r11 = r20
            goto L_0x012b
        L_0x0133:
            if (r11 == 0) goto L_0x0138
            r11.run()     // Catch:{ all -> 0x01a4 }
        L_0x0138:
            if (r8 != 0) goto L_0x0143
            X.4bN r0 = r5.A04     // Catch:{ all -> 0x01a4 }
            java.util.Map r0 = r0.A03     // Catch:{ all -> 0x01a4 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x01a4 }
            r8.<init>(r0)     // Catch:{ all -> 0x01a4 }
        L_0x0143:
            java.lang.Object r0 = r9.A00     // Catch:{ all -> 0x01a4 }
            r8.put(r2, r0)     // Catch:{ all -> 0x01a4 }
            goto L_0x00b8
        L_0x014a:
            X.4bN r2 = r5.A04     // Catch:{ all -> 0x01a4 }
            if (r3 != 0) goto L_0x0153
            if (r8 == 0) goto L_0x0160
            java.util.Map r3 = r2.A02     // Catch:{ all -> 0x01a4 }
            goto L_0x0157
        L_0x0153:
            if (r8 != 0) goto L_0x0157
            java.util.Map r8 = r2.A03     // Catch:{ all -> 0x01a4 }
        L_0x0157:
            java.util.Map r1 = r2.A01     // Catch:{ all -> 0x01a4 }
            java.util.Map r0 = r2.A00     // Catch:{ all -> 0x01a4 }
            X.4bN r2 = new X.4bN     // Catch:{ all -> 0x01a4 }
            r2.<init>(r3, r1, r8, r0)     // Catch:{ all -> 0x01a4 }
        L_0x0160:
            r5.A04 = r2     // Catch:{ all -> 0x01a4 }
            goto L_0x0057
        L_0x0164:
            r0 = 2131362222(0x7f0a01ae, float:1.8344218E38)
            r15.A02(r0)     // Catch:{ all -> 0x018c }
            java.lang.String r1 = "Attempting to process async components but missing component query store"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x018c }
            r0.<init>(r1)     // Catch:{ all -> 0x018c }
            throw r0     // Catch:{ all -> 0x018c }
        L_0x0172:
            r1 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0172 }
            goto L_0x0190
        L_0x0175:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a4 }
            r1.<init>()     // Catch:{ all -> 0x01a4 }
            java.lang.String r0 = "Missing variable module with type: "
            r1.append(r0)     // Catch:{ all -> 0x01a4 }
            r1.append(r9)     // Catch:{ all -> 0x01a4 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01a4 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x01a4 }
            r1.<init>(r0)     // Catch:{ all -> 0x01a4 }
            goto L_0x0190
        L_0x018c:
            r1 = move-exception
            X.C89644cb.A00()     // Catch:{ all -> 0x01a4 }
        L_0x0190:
            throw r1     // Catch:{ all -> 0x01a4 }
        L_0x0191:
            X.4bN r1 = r5.A04     // Catch:{ all -> 0x01a4 }
            r0 = 0
            if (r1 == r7) goto L_0x0197
            r0 = 1
        L_0x0197:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x01a4 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x01a4 }
            r1.<init>(r0, r4)     // Catch:{ all -> 0x01a4 }
        L_0x01a0:
            X.C89644cb.A00()
            return r1
        L_0x01a4:
            r0 = move-exception
            X.C89644cb.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14910pz.A00(java.util.List):android.util.Pair");
    }

    public AnonymousClass4TL A01(C14990q7 r5, AnonymousClass5OL r6, Map map) {
        C88964bN r3 = this.A04;
        if (!map.isEmpty() || !r3.A00.isEmpty()) {
            r3 = new C88964bN(r3.A02, r3.A01, r3.A03, map);
        }
        this.A04 = r3;
        this.A01 = new AnonymousClass4RS(r5.A00);
        this.A07 = new WeakReference(r5);
        this.A03 = r6;
        Pair A002 = A00(Collections.singletonList(this.A0C));
        if (!((List) A002.second).isEmpty()) {
            this.A05 = A03((List) A002.second);
        }
        synchronized (this.A06) {
            this.A0B = true;
            if (this.A0A) {
                Handler handler = A0L;
                Runnable runnable = this.A0F;
                handler.removeCallbacks(runnable);
                handler.post(runnable);
            }
        }
        return new AnonymousClass4TL(this.A04, this.A05);
    }

    public C31201dg A02() {
        if (this.A09) {
            C29691b2.A00("BloksTreeManager", "Trying to access a tree on a destroyed BloksTreeManager");
        }
        C62003Bg.A02("Tree operations are only supported from the UI Thread");
        return A03(this.A0I);
    }

    public final C31201dg A03(List list) {
        C89644cb.A01("Bloks SnapshotComponent");
        C31201dg r1 = this.A05;
        try {
            if (!list.isEmpty()) {
                r1 = AnonymousClass382.A00(new C99164ta(list), r1);
            }
            return r1;
        } finally {
            C89644cb.A00();
        }
    }

    public void A04() {
        if (!this.A09) {
            C62003Bg.A02("Tree operations are only supported from the UI Thread");
            List list = this.A0J;
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList(list);
                list.clear();
                this.A0I.addAll((Collection) A00(new ArrayList(arrayList)).second);
            }
            C89644cb.A01("Bloks ModelMutation");
            List list2 = this.A0I;
            C31201dg A032 = A03(list2);
            boolean z2 = true;
            boolean z3 = false;
            if (this.A05 != A032) {
                z3 = true;
            }
            this.A05 = A032;
            list2.clear();
            C89644cb.A00();
            Map map = this.A0K;
            if (!map.isEmpty()) {
                C88964bN r1 = this.A04;
                HashMap hashMap = new HashMap(r1.A03);
                hashMap.putAll(map);
                this.A04 = new C88964bN(r1.A02, r1.A01, hashMap, r1.A00);
                map.clear();
            } else {
                z2 = z3;
            }
            AnonymousClass5OL r3 = this.A03;
            if (r3 != null && z2) {
                r3.AU0(new AnonymousClass4TL(this.A04, this.A05));
            }
        }
    }

    public void A05(AnonymousClass5OP r3, AnonymousClass4SR r4) {
        if (this.A09) {
            C29691b2.A00("BloksTreeManager", "Trying to enqueue update operation on a destroyed BloksTreeManager");
            return;
        }
        C62003Bg.A02("Tree operations are only supported from the UI Thread");
        this.A0I.add(new Pair(r3, r4));
    }

    public void A06(AnonymousClass4SR r2, long j2) {
        A05(new C99304to(j2), r2);
        A04();
    }

    public void A07(String str, Object obj) {
        RunnableRunnableShape0S1200000_I0 runnableRunnableShape0S1200000_I0 = new RunnableRunnableShape0S1200000_I0(obj, str, this, 1);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnableRunnableShape0S1200000_I0.run();
        } else {
            A0L.post(runnableRunnableShape0S1200000_I0);
        }
    }

    public void A08(String str, Object obj) {
        if (this.A09) {
            C29691b2.A00("BloksTreeManager", "Trying to enqueue variable update on a destroyed BloksTreeManager");
            return;
        }
        C62003Bg.A02("Tree operations are only supported from the UI Thread");
        AnonymousClass4BI.A05.incrementAndGet();
        this.A0K.put(str, obj);
        synchronized (this.A06) {
            if (!this.A0B) {
                this.A0A = true;
                return;
            }
            Handler handler = A0L;
            Runnable runnable = this.A0F;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }
}
