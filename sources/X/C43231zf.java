package X;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import org.apache.commons.io.IOUtils;

/* renamed from: X.1zf  reason: invalid class name and case insensitive filesystem */
public final class C43231zf {
    public AnonymousClass03L A00;
    public HashMap A01;
    public HashMap A02;
    public TreeSet A03;
    public final Bitmap.Config A04 = Bitmap.Config.ARGB_8888;

    public C43231zf(AnonymousClass03L r4) {
        HashMap hashMap;
        this.A00 = r4;
        if (Build.VERSION.SDK_INT >= 19) {
            this.A02 = hashMap;
            this.A03 = new TreeSet();
            return;
        }
        hashMap = new HashMap();
        this.A01 = hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r2 == 3) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(android.graphics.Bitmap.Config r2, int r3, int r4) {
        /*
            int r3 = r3 * r4
            int[] r1 = X.AnonymousClass49J.A00
            int r0 = r2.ordinal()
            r2 = r1[r0]
            r0 = 1
            r1 = 4
            if (r2 == r0) goto L_0x0015
            r0 = 2
            if (r2 == r0) goto L_0x0014
            r0 = 3
            r1 = 1
            if (r2 != r0) goto L_0x0015
        L_0x0014:
            r1 = 2
        L_0x0015:
            int r3 = r3 * r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43231zf.A00(android.graphics.Bitmap$Config, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r2.isEmpty() != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C25401Jq A01(int r6, int r7) {
        /*
            r5 = this;
            X.03L r3 = r5.A00
            monitor-enter(r3)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0066 }
            r0 = 19
            if (r1 < r0) goto L_0x0018
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0066 }
            int r0 = A00(r0, r6, r7)     // Catch:{ all -> 0x0066 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0066 }
            X.1Jq r4 = r5.A02(r0)     // Catch:{ all -> 0x0066 }
            goto L_0x0064
        L_0x0018:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r1.<init>()     // Catch:{ all -> 0x0066 }
            r1.append(r6)     // Catch:{ all -> 0x0066 }
            r0 = 47
            r1.append(r0)     // Catch:{ all -> 0x0066 }
            r1.append(r7)     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0066 }
            java.util.HashMap r0 = r5.A01     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "idPoolBeforeKitkat"
            X.C18450wi.A0O(r0)     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0066 }
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x003d:
            java.lang.Object r2 = r0.get(r1)     // Catch:{ all -> 0x0066 }
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2     // Catch:{ all -> 0x0066 }
            if (r2 == 0) goto L_0x004c
            boolean r1 = r2.isEmpty()     // Catch:{ all -> 0x0066 }
            r0 = 0
            if (r1 == 0) goto L_0x004d
        L_0x004c:
            r0 = 1
        L_0x004d:
            r4 = 0
            if (r0 != 0) goto L_0x0064
            java.lang.Object r1 = X.C003101j.A02(r2)     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0064
            r2.remove(r1)     // Catch:{ all -> 0x0066 }
            java.lang.Object r0 = r3.A03(r1)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0064
            X.1Jq r4 = new X.1Jq     // Catch:{ all -> 0x0066 }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x0066 }
        L_0x0064:
            monitor-exit(r3)
            return r4
        L_0x0066:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43231zf.A01(int, int):X.1Jq");
    }

    public final C25401Jq A02(Integer num) {
        Object A022;
        TreeSet treeSet = this.A03;
        if (treeSet == null) {
            C18450wi.A0O("sortedByteCountSet");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        boolean A0I = C003101j.A0I(treeSet, num);
        Number number = num;
        if (!A0I) {
            number = (Number) treeSet.ceiling(num);
        }
        if (number != null) {
            int intValue = number.intValue();
            HashMap hashMap = this.A02;
            if (hashMap == null) {
                C18450wi.A0O("idPoolWithKitkat");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(Integer.valueOf(intValue));
            if (!(linkedHashSet == null || linkedHashSet.isEmpty() || (A022 = C003101j.A02(linkedHashSet)) == null)) {
                linkedHashSet.remove(A022);
                A05(linkedHashSet, intValue);
                Object A032 = this.A00.A03(A022);
                if (A032 != null) {
                    return new C25401Jq(A032, A022);
                }
            }
        }
        return null;
    }

    public final void A03(int i2, String str, int i3) {
        RuntimeException runtimeException;
        synchronized (this.A00) {
            if (Build.VERSION.SDK_INT >= 19) {
                int A002 = A00(this.A04, i2, i3);
                HashMap hashMap = this.A02;
                if (hashMap == null) {
                    C18450wi.A0O("idPoolWithKitkat");
                    runtimeException = new RuntimeException("Redex: Unreachable code after no-return invoke");
                } else {
                    Integer valueOf = Integer.valueOf(A002);
                    if (hashMap.get(valueOf) == null) {
                        hashMap.put(valueOf, new LinkedHashSet());
                    }
                    LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(valueOf);
                    if (linkedHashSet != null) {
                        linkedHashSet.add(str);
                    }
                    TreeSet treeSet = this.A03;
                    if (treeSet == null) {
                        C18450wi.A0O("sortedByteCountSet");
                        runtimeException = new RuntimeException("Redex: Unreachable code after no-return invoke");
                    } else if (!treeSet.contains(valueOf)) {
                        treeSet.add(valueOf);
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                sb.append(i3);
                String obj = sb.toString();
                HashMap hashMap2 = this.A01;
                if (hashMap2 == null) {
                    C18450wi.A0O("idPoolBeforeKitkat");
                    runtimeException = new RuntimeException("Redex: Unreachable code after no-return invoke");
                } else {
                    if (hashMap2.get(obj) == null) {
                        hashMap2.put(obj, new LinkedHashSet());
                    }
                    Object obj2 = hashMap2.get(obj);
                    C18450wi.A0F(obj2);
                    ((LinkedHashSet) obj2).add(str);
                }
            }
            throw runtimeException;
        }
    }

    public final void A04(int i2, String str, int i3) {
        RuntimeException runtimeException;
        C18450wi.A0H(str, 2);
        synchronized (this.A00) {
            if (Build.VERSION.SDK_INT >= 19) {
                int A002 = A00(this.A04, i2, i3);
                HashMap hashMap = this.A02;
                if (hashMap == null) {
                    C18450wi.A0O("idPoolWithKitkat");
                    runtimeException = new RuntimeException("Redex: Unreachable code after no-return invoke");
                } else {
                    LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(Integer.valueOf(A002));
                    if (linkedHashSet != null) {
                        linkedHashSet.remove(str);
                        A05(linkedHashSet, A002);
                    }
                }
            } else {
                HashMap hashMap2 = this.A01;
                if (hashMap2 == null) {
                    C18450wi.A0O("idPoolBeforeKitkat");
                    runtimeException = new RuntimeException("Redex: Unreachable code after no-return invoke");
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i2);
                    sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                    sb.append(i3);
                    LinkedHashSet linkedHashSet2 = (LinkedHashSet) hashMap2.get(sb.toString());
                    if (linkedHashSet2 != null) {
                        linkedHashSet2.remove(str);
                    }
                }
            }
            throw runtimeException;
        }
    }

    public final void A05(LinkedHashSet linkedHashSet, int i2) {
        if (linkedHashSet.isEmpty()) {
            TreeSet treeSet = this.A03;
            if (treeSet == null) {
                C18450wi.A0O("sortedByteCountSet");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } else {
                treeSet.remove(Integer.valueOf(i2));
            }
        }
    }
}
