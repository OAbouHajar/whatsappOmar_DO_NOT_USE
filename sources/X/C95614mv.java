package X;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.4mv  reason: invalid class name and case insensitive filesystem */
public abstract class C95614mv implements C13570mb {
    public final SparseArray A00;
    public final C12190jz A01;
    public final C85804Qa A02;
    public final C85804Qa A03;
    public final C88144a1 A04;
    public final AnonymousClass5Kx A05;
    public final Class A06 = getClass();
    public final Set A07;

    public C95614mv(C12190jz r11, C88144a1 r12, AnonymousClass5Kx r13) {
        this.A01 = r11;
        this.A04 = r12;
        this.A05 = r13;
        this.A00 = new SparseArray();
        SparseIntArray sparseIntArray = new SparseIntArray(0);
        synchronized (this) {
            SparseArray sparseArray = this.A00;
            sparseArray.clear();
            SparseIntArray sparseIntArray2 = this.A04.A03;
            for (int i2 = 0; i2 < sparseIntArray2.size(); i2++) {
                int keyAt = sparseIntArray2.keyAt(i2);
                sparseArray.put(keyAt, new AnonymousClass4LL(keyAt, sparseIntArray2.valueAt(i2), sparseIntArray.get(keyAt, 0)));
            }
        }
        this.A07 = Collections.newSetFromMap(new IdentityHashMap());
        this.A02 = new C85804Qa();
        this.A03 = new C85804Qa();
    }

    public static void A00(Class cls, Object obj, String str, int i2) {
        AnonymousClass0X1.A01(cls, Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(i2), str);
    }

    public int A01(int i2) {
        int i3;
        if (this instanceof C65143Tc) {
            C65143Tc r0 = (C65143Tc) this;
            if (i2 > 0) {
                int[] iArr = r0.A00;
                int length = iArr.length;
                int i4 = 0;
                while (i4 < length) {
                    i3 = iArr[i4];
                    if (i3 < i2) {
                        i4++;
                    }
                }
                return i2;
            }
            throw new AnonymousClass5AV(Integer.valueOf(i2));
        }
        C65163Te r02 = (C65163Te) this;
        if (i2 > 0) {
            int[] iArr2 = r02.A00;
            int length2 = iArr2.length;
            int i5 = 0;
            while (i5 < length2) {
                i3 = iArr2[i5];
                if (i3 < i2) {
                    i5++;
                }
            }
            return i2;
        }
        throw new AnonymousClass5AV(Integer.valueOf(i2));
        return i3;
    }

    public int A02(Object obj) {
        return this instanceof C65143Tc ? ((AnonymousClass5TH) obj).AG6() : ((byte[]) obj).length;
    }

    public Object A03(int i2) {
        return this instanceof C65163Te ? new byte[i2] : new AnonymousClass54R(i2);
    }

    public synchronized Object A04(AnonymousClass4LL r3) {
        Object poll;
        poll = r3.A03.poll();
        if (poll != null) {
            r3.A00++;
        }
        return poll;
    }

    public final void A05() {
        C13370lv r7 = AnonymousClass0X1.A00;
        if (r7.AJ7(2)) {
            Class cls = this.A06;
            C85804Qa r1 = this.A03;
            Integer valueOf = Integer.valueOf(r1.A00);
            Integer valueOf2 = Integer.valueOf(r1.A01);
            C85804Qa r12 = this.A02;
            Integer valueOf3 = Integer.valueOf(r12.A00);
            Integer valueOf4 = Integer.valueOf(r12.A01);
            String simpleName = cls.getSimpleName();
            Object[] objArr = new Object[4];
            AnonymousClass000.A1E(valueOf, valueOf2, objArr);
            AnonymousClass3K4.A11(valueOf3, valueOf4, objArr);
            r7.Ahh(simpleName, String.format((Locale) null, "Used = (%d, %d); Free = (%d, %d)", objArr));
        }
    }

    public synchronized void A06(int i2) {
        C85804Qa r6 = this.A03;
        int i3 = r6.A01;
        C85804Qa r5 = this.A02;
        int i4 = r5.A01;
        int i5 = i3 + i4;
        int min = Math.min(i5 - i2, i4);
        if (min > 0) {
            if (AnonymousClass0X1.A00.AJ7(2)) {
                AnonymousClass0X1.A00(this.A06, Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(min), "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d");
            }
            A05();
            int i6 = 0;
            while (true) {
                SparseArray sparseArray = this.A00;
                if (i6 >= sparseArray.size() || min <= 0) {
                    A05();
                } else {
                    AnonymousClass4LL r1 = (AnonymousClass4LL) sparseArray.valueAt(i6);
                    while (true) {
                        Object poll = r1.A03.poll();
                        if (poll == null) {
                            break;
                        }
                        A07(poll);
                        int i7 = r1.A01;
                        min -= i7;
                        r5.A00(i7);
                        if (min <= 0) {
                            break;
                        }
                    }
                    i6++;
                }
            }
            A05();
            if (AnonymousClass0X1.A00.AJ7(2)) {
                AnonymousClass0X1.A01(this.A06, Integer.valueOf(i2), Integer.valueOf(r6.A01 + r5.A01), "trimToSize: TargetSize = %d; Final Size = %d");
            }
        }
    }

    public void A07(Object obj) {
        if (this instanceof C65143Tc) {
            ((AnonymousClass5TH) obj).close();
        }
    }

    public synchronized boolean A08() {
        return C13700nu.A0g(this.A03.A01 + this.A02.A01, this.A04.A02);
    }

    public boolean A09(Object obj) {
        if (this instanceof C65143Tc) {
            return !((AnonymousClass5TH) obj).isClosed();
        }
        return true;
    }

    public void Abg(Object obj) {
        int A022 = A02(obj);
        synchronized (this) {
            AnonymousClass4LL r4 = (AnonymousClass4LL) this.A00.get(A022);
            if (!this.A07.remove(obj)) {
                Class cls = this.A06;
                Object[] objArr = new Object[2];
                AnonymousClass000.A1M(objArr, System.identityHashCode(obj), 0);
                AnonymousClass000.A1M(objArr, A022, 1);
                C13370lv r2 = AnonymousClass0X1.A00;
                if (r2.AJ7(6)) {
                    r2.A8J(cls.getSimpleName(), String.format((Locale) null, "release (free, value unrecognized) (object, size) = (%x, %s)", objArr));
                }
                A07(obj);
            } else {
                if (r4 != null) {
                    int i2 = r4.A00;
                    Queue queue = r4.A03;
                    if (i2 + queue.size() > r4.A02 || A08() || !A09(obj)) {
                        int i3 = r4.A00;
                        AnonymousClass0T3.A01(AnonymousClass000.A1Q(i3));
                        r4.A00 = i3 - 1;
                    } else {
                        int i4 = r4.A00;
                        if (i4 > 0) {
                            r4.A00 = i4 - 1;
                            queue.add(obj);
                        } else {
                            Object[] objArr2 = {obj};
                            C13370lv r1 = AnonymousClass0X1.A00;
                            if (r1.AJ7(6)) {
                                r1.A8J("BUCKET", String.format((Locale) null, "Tried to release value %s from an empty bucket!", objArr2));
                            }
                        }
                        C85804Qa r12 = this.A02;
                        r12.A00++;
                        r12.A01 += A022;
                        this.A03.A00(A022);
                        if (AnonymousClass0X1.A00.AJ7(2)) {
                            A00(this.A06, obj, "release (reuse) (object, size) = (%x, %s)", A022);
                        }
                    }
                }
                if (AnonymousClass0X1.A00.AJ7(2)) {
                    A00(this.A06, obj, "release (free) (object, size) = (%x, %s)", A022);
                }
                A07(obj);
                this.A03.A00(A022);
            }
            A05();
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public java.lang.Object get(int r12) {
        /*
            r11 = this;
            r10 = r11
            monitor-enter(r10)
            boolean r0 = r11.A08()     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x000f
            X.4Qa r0 = r11.A02     // Catch:{ all -> 0x0124 }
            int r1 = r0.A01     // Catch:{ all -> 0x0124 }
            r0 = 0
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            X.AnonymousClass0T3.A01(r0)     // Catch:{ all -> 0x0124 }
            monitor-exit(r10)
            int r3 = r11.A01(r12)
            monitor-enter(r10)
            monitor-enter(r10)     // Catch:{ all -> 0x0121 }
            android.util.SparseArray r5 = r11.A00     // Catch:{ all -> 0x011e }
            java.lang.Object r2 = r5.get(r3)     // Catch:{ all -> 0x011e }
            X.4LL r2 = (X.AnonymousClass4LL) r2     // Catch:{ all -> 0x011e }
            monitor-exit(r10)     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x005f
            java.lang.Object r4 = r11.A04(r2)     // Catch:{ all -> 0x0121 }
            if (r4 == 0) goto L_0x005f
            java.util.Set r0 = r11.A07     // Catch:{ all -> 0x0121 }
            boolean r0 = r0.add(r4)     // Catch:{ all -> 0x0121 }
            X.AnonymousClass0T3.A01(r0)     // Catch:{ all -> 0x0121 }
            int r2 = r11.A02(r4)     // Catch:{ all -> 0x0121 }
            X.4Qa r1 = r11.A03     // Catch:{ all -> 0x0121 }
            int r0 = r1.A00     // Catch:{ all -> 0x0121 }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x0121 }
            int r0 = r1.A01     // Catch:{ all -> 0x0121 }
            int r0 = r0 + r2
            r1.A01 = r0     // Catch:{ all -> 0x0121 }
            X.4Qa r0 = r11.A02     // Catch:{ all -> 0x0121 }
            r0.A00(r2)     // Catch:{ all -> 0x0121 }
            r11.A05()     // Catch:{ all -> 0x0121 }
            r1 = 2
            X.0lv r0 = X.AnonymousClass0X1.A00     // Catch:{ all -> 0x0121 }
            boolean r0 = r0.AJ7(r1)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x005d
            java.lang.Class r1 = r11.A06     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "get (reuse) (object, size) = (%x, %s)"
            A00(r1, r4, r0, r2)     // Catch:{ all -> 0x0121 }
        L_0x005d:
            monitor-exit(r10)     // Catch:{ all -> 0x0121 }
            return r4
        L_0x005f:
            monitor-enter(r10)     // Catch:{ all -> 0x0121 }
            X.4a1 r7 = r11.A04     // Catch:{ all -> 0x011e }
            int r6 = r7.A01     // Catch:{ all -> 0x011e }
            X.4Qa r4 = r11.A03     // Catch:{ all -> 0x011e }
            int r9 = r4.A01     // Catch:{ all -> 0x011e }
            int r0 = r6 - r9
            if (r3 > r0) goto L_0x0086
            int r1 = r7.A02     // Catch:{ all -> 0x011e }
            X.4Qa r8 = r11.A02     // Catch:{ all -> 0x011e }
            int r0 = r8.A01     // Catch:{ all -> 0x011e }
            int r9 = r9 + r0
            int r0 = r1 - r9
            if (r3 <= r0) goto L_0x007b
            int r1 = r1 - r3
            r11.A06(r1)     // Catch:{ all -> 0x011e }
        L_0x007b:
            int r1 = r4.A01     // Catch:{ all -> 0x011e }
            int r0 = r8.A01     // Catch:{ all -> 0x011e }
            int r1 = r1 + r0
            int r0 = r6 - r1
            if (r3 > r0) goto L_0x0086
            monitor-exit(r10)     // Catch:{ all -> 0x0121 }
            goto L_0x0089
        L_0x0086:
            monitor-exit(r10)     // Catch:{ all -> 0x0121 }
            r0 = 0
            goto L_0x008a
        L_0x0089:
            r0 = 1
        L_0x008a:
            if (r0 == 0) goto L_0x0112
            int r0 = r4.A00     // Catch:{ all -> 0x0121 }
            int r0 = r0 + 1
            r4.A00 = r0     // Catch:{ all -> 0x0121 }
            int r0 = r4.A01     // Catch:{ all -> 0x0121 }
            int r0 = r0 + r3
            r4.A01 = r0     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x009f
            int r0 = r2.A00     // Catch:{ all -> 0x0121 }
            int r0 = r0 + 1
            r2.A00 = r0     // Catch:{ all -> 0x0121 }
        L_0x009f:
            monitor-exit(r10)     // Catch:{ all -> 0x0121 }
            r2 = 0
            java.lang.Object r2 = r11.A03(r3)     // Catch:{ all -> 0x00a6 }
            goto L_0x00d3
        L_0x00a6:
            r6 = move-exception
            monitor-enter(r10)
            r4.A00(r3)     // Catch:{ all -> 0x010f }
            monitor-enter(r10)     // Catch:{ all -> 0x010f }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x010c }
            X.4LL r5 = (X.AnonymousClass4LL) r5     // Catch:{ all -> 0x010c }
            monitor-exit(r10)     // Catch:{ all -> 0x010f }
            if (r5 == 0) goto L_0x00c2
            int r4 = r5.A00     // Catch:{ all -> 0x010f }
            r1 = 1
            boolean r0 = X.AnonymousClass000.A1Q(r4)
            X.AnonymousClass0T3.A01(r0)     // Catch:{ all -> 0x010f }
            int r4 = r4 - r1
            r5.A00 = r4     // Catch:{ all -> 0x010f }
        L_0x00c2:
            monitor-exit(r10)     // Catch:{ all -> 0x010f }
            java.lang.Class<java.lang.Error> r1 = java.lang.Error.class
            boolean r0 = r1.isInstance(r6)
            if (r0 != 0) goto L_0x0105
            java.lang.Class<java.lang.RuntimeException> r1 = java.lang.RuntimeException.class
            boolean r0 = r1.isInstance(r6)
            if (r0 != 0) goto L_0x0105
        L_0x00d3:
            monitor-enter(r10)
            java.util.Set r0 = r11.A07     // Catch:{ all -> 0x0102 }
            boolean r0 = r0.add(r2)     // Catch:{ all -> 0x0102 }
            X.AnonymousClass0T3.A01(r0)     // Catch:{ all -> 0x0102 }
            monitor-enter(r10)     // Catch:{ all -> 0x0102 }
            boolean r0 = r11.A08()     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x00e9
            int r0 = r7.A02     // Catch:{ all -> 0x00ff }
            r11.A06(r0)     // Catch:{ all -> 0x00ff }
        L_0x00e9:
            monitor-exit(r10)     // Catch:{ all -> 0x0102 }
            r11.A05()     // Catch:{ all -> 0x0102 }
            r1 = 2
            X.0lv r0 = X.AnonymousClass0X1.A00     // Catch:{ all -> 0x0102 }
            boolean r0 = r0.AJ7(r1)     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x00fd
            java.lang.Class r1 = r11.A06     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = "get (alloc) (object, size) = (%x, %s)"
            A00(r1, r2, r0, r3)     // Catch:{ all -> 0x0102 }
        L_0x00fd:
            monitor-exit(r10)     // Catch:{ all -> 0x0102 }
            return r2
        L_0x00ff:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0102 }
            throw r0     // Catch:{ all -> 0x0102 }
        L_0x0102:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0102 }
            throw r0
        L_0x0105:
            java.lang.Object r0 = r1.cast(r6)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x010c:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x010f }
            throw r0     // Catch:{ all -> 0x010f }
        L_0x010f:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x010f }
            throw r0
        L_0x0112:
            int r1 = r4.A01     // Catch:{ all -> 0x0121 }
            X.4Qa r0 = r11.A02     // Catch:{ all -> 0x0121 }
            int r0 = r0.A01     // Catch:{ all -> 0x0121 }
            X.5AW r2 = new X.5AW     // Catch:{ all -> 0x0121 }
            r2.<init>(r6, r1, r0, r3)     // Catch:{ all -> 0x0121 }
            goto L_0x0120
        L_0x011e:
            r2 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0121 }
        L_0x0120:
            throw r2     // Catch:{ all -> 0x0121 }
        L_0x0121:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0121 }
            throw r0
        L_0x0124:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95614mv.get(int):java.lang.Object");
    }
}
