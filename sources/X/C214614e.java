package X;

import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.14e  reason: invalid class name and case insensitive filesystem */
public abstract class C214614e implements C17870vm, C17880vn {
    public C214614e(C214414c r4) {
        r4.A01.A02(this);
        C19870z8 r2 = r4.A00;
        synchronized (r2) {
            r2.A00.add(new WeakReference(this));
        }
    }

    public String AGG() {
        StringBuilder sb;
        C34731km r1;
        int i2;
        String obj;
        int i3;
        int i4;
        String obj2;
        int i5;
        int i6;
        String obj3;
        if (this instanceof C25791Ld) {
            sb = new StringBuilder("mtc=");
            i2 = ((C25791Ld) this).A05.size();
        } else if (this instanceof AnonymousClass1RM) {
            AnonymousClass1RM r3 = (AnonymousClass1RM) this;
            synchronized (r3) {
                StringBuilder sb2 = new StringBuilder("sc=");
                AnonymousClass03L r12 = r3.A00;
                if (r12 == null) {
                    sb2.append("null");
                } else {
                    synchronized (r12) {
                        i5 = r12.A05;
                    }
                    sb2.append(i5);
                    sb2.append("/");
                    AnonymousClass03L r13 = r3.A00;
                    synchronized (r13) {
                        i6 = r13.A02;
                    }
                    sb2.append(i6);
                }
                obj3 = sb2.toString();
            }
            return obj3;
        } else if (this instanceof C214514d) {
            C214514d r5 = (C214514d) this;
            synchronized (r5) {
                StringBuilder sb3 = new StringBuilder("fpspc/");
                int i7 = 0;
                int i8 = 0;
                for (WeakReference weakReference : r5.A00.values()) {
                    List list = (List) weakReference.get();
                    if (list != null) {
                        i7++;
                        i8 += list.size();
                    }
                }
                sb3.append("s=");
                sb3.append(i7);
                sb3.append("/el=");
                sb3.append(i8);
                obj2 = sb3.toString();
            }
            return obj2;
        } else {
            if (this instanceof C37661pW) {
                C37661pW r14 = (C37661pW) this;
                sb = new StringBuilder();
                sb.append(r14.A08);
                sb.append(":");
                r1 = r14.A06.A02;
                synchronized (r1) {
                    i4 = r1.A05;
                }
                sb.append(i4);
                sb.append("/");
                synchronized (r1) {
                    i2 = r1.A02;
                }
            } else if (this instanceof C218215o) {
                C218215o r15 = (C218215o) this;
                sb = new StringBuilder("state a=");
                synchronized (r15) {
                    i2 = r15.A01.size();
                }
            } else if (this instanceof C34711kk) {
                C34711kk r16 = (C34711kk) this;
                sb = new StringBuilder();
                sb.append(r16.A04);
                sb.append(":");
                r1 = r16.A02;
                synchronized (r1) {
                    i3 = r1.A05;
                }
                sb.append(i3);
                sb.append("/");
                synchronized (r1) {
                    i2 = r1.A02;
                }
            } else {
                AnonymousClass1P1 r2 = (AnonymousClass1P1) this;
                synchronized (r2) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("LinkedAccountMediaCacheManager=");
                    sb4.append(r2.A00.size());
                    sb4.append(r2.A01);
                    obj = sb4.toString();
                }
                return obj;
            }
        }
        sb.append(i2);
        return sb.toString();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void AZG(boolean r9) {
        /*
            r8 = this;
            r7 = r8
            boolean r0 = r8 instanceof X.C25791Ld
            if (r0 == 0) goto L_0x0010
            r0 = r8
            X.1Ld r0 = (X.C25791Ld) r0
            monitor-enter(r7)
            java.util.HashMap r0 = r0.A05     // Catch:{ all -> 0x0094 }
            r0.clear()     // Catch:{ all -> 0x0094 }
            goto L_0x0092
        L_0x0010:
            boolean r0 = r8 instanceof X.AnonymousClass1RM
            if (r0 == 0) goto L_0x0021
            r0 = r8
            X.1RM r0 = (X.AnonymousClass1RM) r0
            monitor-enter(r7)
            X.03L r1 = r0.A00     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x0092
            r0 = -1
            r1.A05(r0)     // Catch:{ all -> 0x0094 }
            goto L_0x0092
        L_0x0021:
            boolean r0 = r8 instanceof X.C214514d
            if (r0 == 0) goto L_0x0052
            r0 = r8
            X.14d r0 = (X.C214514d) r0
            monitor-enter(r7)
            java.util.Map r3 = r0.A00     // Catch:{ all -> 0x0094 }
            java.util.Collection r0 = r3.values()     // Catch:{ all -> 0x0094 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0094 }
        L_0x0033:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x004e
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0094 }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x0094 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0094 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x004a
            r0.clear()     // Catch:{ all -> 0x0094 }
        L_0x004a:
            r1.clear()     // Catch:{ all -> 0x0094 }
            goto L_0x0033
        L_0x004e:
            r3.clear()     // Catch:{ all -> 0x0094 }
            goto L_0x0092
        L_0x0052:
            boolean r0 = r8 instanceof X.C37661pW
            if (r0 == 0) goto L_0x0085
            r6 = r8
            X.1pW r6 = (X.C37661pW) r6
            monitor-enter(r7)
            if (r9 == 0) goto L_0x0070
            X.1pX r0 = r6.A06     // Catch:{ all -> 0x0094 }
            java.util.concurrent.atomic.AtomicLong r0 = r0.A01     // Catch:{ all -> 0x0094 }
            long r4 = r0.get()     // Catch:{ all -> 0x0094 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0094 }
            r0 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0092
        L_0x0070:
            X.1pX r2 = r6.A06     // Catch:{ all -> 0x0094 }
            r0 = 0
            r2.A02(r0)     // Catch:{ all -> 0x0094 }
            X.1km r1 = r2.A02     // Catch:{ all -> 0x0094 }
            r0 = -1
            r1.A05(r0)     // Catch:{ all -> 0x0094 }
            r0 = 0
            r6.A09 = r0     // Catch:{ all -> 0x0094 }
            X.1pY r0 = r6.A03     // Catch:{ all -> 0x0094 }
            r2.A02(r0)     // Catch:{ all -> 0x0094 }
            goto L_0x0092
        L_0x0085:
            boolean r0 = r8 instanceof X.C218215o
            if (r0 == 0) goto L_0x0097
            r0 = r8
            X.15o r0 = (X.C218215o) r0
            monitor-enter(r7)
            android.util.SparseArray r0 = r0.A01     // Catch:{ all -> 0x0094 }
            r0.clear()     // Catch:{ all -> 0x0094 }
        L_0x0092:
            monitor-exit(r7)
            return
        L_0x0094:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0097:
            boolean r0 = r8 instanceof X.C34711kk
            if (r0 == 0) goto L_0x00ac
            r1 = r8
            X.1kk r1 = (X.C34711kk) r1
            if (r9 == 0) goto L_0x00aa
            java.util.concurrent.atomic.AtomicInteger r0 = r1.A00
            int r0 = r0.get()
        L_0x00a6:
            r1.A01(r0)
            return
        L_0x00aa:
            r0 = 0
            goto L_0x00a6
        L_0x00ac:
            r1 = r8
            X.1P1 r1 = (X.AnonymousClass1P1) r1
            monitor-enter(r7)
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x00bc }
            r0.clear()     // Catch:{ all -> 0x00bc }
            java.util.Map r0 = r1.A01     // Catch:{ all -> 0x00bc }
            r0.clear()     // Catch:{ all -> 0x00bc }
            monitor-exit(r7)     // Catch:{ all -> 0x00bc }
            return
        L_0x00bc:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00bc }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214614e.AZG(boolean):void");
    }
}
