package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* compiled from: XFMFile */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final j f295h = new j(0);

    /* renamed from: a  reason: collision with root package name */
    public final Comparator f296a;

    /* renamed from: b  reason: collision with root package name */
    public n f297b;

    /* renamed from: c  reason: collision with root package name */
    public int f298c;

    /* renamed from: d  reason: collision with root package name */
    public int f299d;

    /* renamed from: e  reason: collision with root package name */
    public final n f300e;

    /* renamed from: f  reason: collision with root package name */
    public l f301f;

    /* renamed from: g  reason: collision with root package name */
    public l f302g;

    public LinkedTreeMap() {
        this(f295h);
    }

    public LinkedTreeMap(Comparator<? super K> comparator) {
        this.f298c = 0;
        this.f299d = 0;
        this.f300e = new n();
        this.f296a = comparator == null ? f295h : comparator;
    }

    public final n a(boolean z2, Object obj) {
        int i2;
        n nVar;
        n nVar2 = this.f297b;
        j jVar = f295h;
        Comparator comparator = this.f296a;
        if (nVar2 != null) {
            Comparable comparable = comparator == jVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = nVar2.f423f;
                i2 = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i2 == 0) {
                    return nVar2;
                }
                n nVar3 = i2 < 0 ? nVar2.f419b : nVar2.f420c;
                if (nVar3 == null) {
                    break;
                }
                nVar2 = nVar3;
            }
        } else {
            i2 = 0;
        }
        if (!z2) {
            return null;
        }
        n nVar4 = this.f300e;
        if (nVar2 != null) {
            nVar = new n(nVar2, obj, nVar4, nVar4.f422e);
            if (i2 < 0) {
                nVar2.f419b = nVar;
            } else {
                nVar2.f420c = nVar;
            }
            c(nVar2, true);
        } else if (comparator != jVar || (obj instanceof Comparable)) {
            nVar = new n(nVar2, obj, nVar4, nVar4.f422e);
            this.f297b = nVar;
        } else {
            throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
        }
        this.f298c++;
        this.f299d++;
        return nVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.gson.internal.n b(java.util.Map.Entry r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x000d
            com.google.gson.internal.n r0 = r5.a(r2, r0)     // Catch:{ ClassCastException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            if (r0 == 0) goto L_0x0028
            java.lang.Object r3 = r0.f424g
            java.lang.Object r6 = r6.getValue()
            r4 = 1
            if (r3 == r6) goto L_0x0024
            if (r3 == 0) goto L_0x0022
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r6 = 0
            goto L_0x0025
        L_0x0024:
            r6 = 1
        L_0x0025:
            if (r6 == 0) goto L_0x0028
            r2 = 1
        L_0x0028:
            if (r2 == 0) goto L_0x002b
            r1 = r0
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.b(java.util.Map$Entry):com.google.gson.internal.n");
    }

    public final void c(n nVar, boolean z2) {
        while (nVar != null) {
            n nVar2 = nVar.f419b;
            n nVar3 = nVar.f420c;
            int i2 = 0;
            int i3 = nVar2 != null ? nVar2.f425h : 0;
            int i4 = nVar3 != null ? nVar3.f425h : 0;
            int i5 = i3 - i4;
            if (i5 == -2) {
                n nVar4 = nVar3.f419b;
                n nVar5 = nVar3.f420c;
                int i6 = nVar5 != null ? nVar5.f425h : 0;
                if (nVar4 != null) {
                    i2 = nVar4.f425h;
                }
                int i7 = i2 - i6;
                if (i7 != -1 && (i7 != 0 || z2)) {
                    g(nVar3);
                }
                f(nVar);
                if (z2) {
                    return;
                }
            } else if (i5 == 2) {
                n nVar6 = nVar2.f419b;
                n nVar7 = nVar2.f420c;
                int i8 = nVar7 != null ? nVar7.f425h : 0;
                if (nVar6 != null) {
                    i2 = nVar6.f425h;
                }
                int i9 = i2 - i8;
                if (i9 != 1 && (i9 != 0 || z2)) {
                    f(nVar2);
                }
                g(nVar);
                if (z2) {
                    return;
                }
            } else if (i5 == 0) {
                nVar.f425h = i3 + 1;
                if (z2) {
                    return;
                }
            } else {
                nVar.f425h = Math.max(i3, i4) + 1;
                if (!z2) {
                    return;
                }
            }
            nVar = nVar.f418a;
        }
    }

    public void clear() {
        this.f297b = null;
        this.f298c = 0;
        this.f299d++;
        n nVar = this.f300e;
        nVar.f422e = nVar;
        nVar.f421d = nVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x000b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean containsKey(java.lang.Object r2) {
        /*
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L_0x0008
            com.google.gson.internal.n r2 = r1.a(r0, r2)     // Catch:{ ClassCastException -> 0x0008 }
            goto L_0x0009
        L_0x0008:
            r2 = 0
        L_0x0009:
            if (r2 == 0) goto L_0x000c
            r0 = 1
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.containsKey(java.lang.Object):boolean");
    }

    public final void d(n nVar, boolean z2) {
        n nVar2;
        int i2;
        n nVar3;
        if (z2) {
            n nVar4 = nVar.f422e;
            nVar4.f421d = nVar.f421d;
            nVar.f421d.f422e = nVar4;
        }
        n nVar5 = nVar.f419b;
        n nVar6 = nVar.f420c;
        n nVar7 = nVar.f418a;
        int i3 = 0;
        if (nVar5 == null || nVar6 == null) {
            if (nVar5 != null) {
                e(nVar, nVar5);
                nVar.f419b = null;
            } else if (nVar6 != null) {
                e(nVar, nVar6);
                nVar.f420c = null;
            } else {
                e(nVar, (n) null);
            }
            c(nVar7, false);
            this.f298c--;
            this.f299d++;
            return;
        }
        if (nVar5.f425h > nVar6.f425h) {
            do {
                nVar2 = nVar5;
                nVar5 = nVar5.f420c;
            } while (nVar5 != null);
        } else {
            do {
                n nVar8 = nVar6;
                nVar6 = nVar6.f419b;
                nVar3 = nVar8;
            } while (nVar6 != null);
            nVar2 = nVar3;
        }
        d(nVar2, false);
        n nVar9 = nVar.f419b;
        if (nVar9 != null) {
            i2 = nVar9.f425h;
            nVar2.f419b = nVar9;
            nVar9.f418a = nVar2;
            nVar.f419b = null;
        } else {
            i2 = 0;
        }
        n nVar10 = nVar.f420c;
        if (nVar10 != null) {
            i3 = nVar10.f425h;
            nVar2.f420c = nVar10;
            nVar10.f418a = nVar2;
            nVar.f420c = null;
        }
        nVar2.f425h = Math.max(i2, i3) + 1;
        e(nVar, nVar2);
    }

    public final void e(n nVar, n nVar2) {
        n nVar3 = nVar.f418a;
        nVar.f418a = null;
        if (nVar2 != null) {
            nVar2.f418a = nVar3;
        }
        if (nVar3 == null) {
            this.f297b = nVar2;
        } else if (nVar3.f419b == nVar) {
            nVar3.f419b = nVar2;
        } else {
            nVar3.f420c = nVar2;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        l lVar = this.f301f;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, 0);
        this.f301f = lVar2;
        return lVar2;
    }

    public final void f(n nVar) {
        n nVar2 = nVar.f419b;
        n nVar3 = nVar.f420c;
        n nVar4 = nVar3.f419b;
        n nVar5 = nVar3.f420c;
        nVar.f420c = nVar4;
        if (nVar4 != null) {
            nVar4.f418a = nVar;
        }
        e(nVar, nVar3);
        nVar3.f419b = nVar;
        nVar.f418a = nVar3;
        int i2 = 0;
        int max = Math.max(nVar2 != null ? nVar2.f425h : 0, nVar4 != null ? nVar4.f425h : 0) + 1;
        nVar.f425h = max;
        if (nVar5 != null) {
            i2 = nVar5.f425h;
        }
        nVar3.f425h = Math.max(max, i2) + 1;
    }

    public final void g(n nVar) {
        n nVar2 = nVar.f419b;
        n nVar3 = nVar.f420c;
        n nVar4 = nVar2.f419b;
        n nVar5 = nVar2.f420c;
        nVar.f419b = nVar5;
        if (nVar5 != null) {
            nVar5.f418a = nVar;
        }
        e(nVar, nVar2);
        nVar2.f420c = nVar;
        nVar.f418a = nVar2;
        int i2 = 0;
        int max = Math.max(nVar3 != null ? nVar3.f425h : 0, nVar5 != null ? nVar5.f425h : 0) + 1;
        nVar.f425h = max;
        if (nVar4 != null) {
            i2 = nVar4.f425h;
        }
        nVar2.f425h = Math.max(max, i2) + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 0
            com.google.gson.internal.n r3 = r2.a(r1, r3)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x000e
            java.lang.Object r0 = r3.f424g
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.get(java.lang.Object):java.lang.Object");
    }

    public Set<K> keySet() {
        l lVar = this.f302g;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, 1);
        this.f302g = lVar2;
        return lVar2;
    }

    public V put(K k2, V v2) {
        if (k2 != null) {
            n a2 = a(true, k2);
            V v3 = a2.f424g;
            a2.f424g = v2;
            return v3;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x000a
            r1 = 0
            com.google.gson.internal.n r3 = r2.a(r1, r3)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000b
        L_0x0009:
        L_0x000a:
            r3 = r0
        L_0x000b:
            if (r3 == 0) goto L_0x0011
            r1 = 1
            r2.d(r3, r1)
        L_0x0011:
            if (r3 == 0) goto L_0x0015
            java.lang.Object r0 = r3.f424g
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.remove(java.lang.Object):java.lang.Object");
    }

    public int size() {
        return this.f298c;
    }
}
