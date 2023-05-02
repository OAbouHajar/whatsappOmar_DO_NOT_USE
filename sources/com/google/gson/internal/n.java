package com.google.gson.internal;

import java.util.Map;

/* compiled from: XFMFile */
public final class n implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    public n f418a;

    /* renamed from: b  reason: collision with root package name */
    public n f419b;

    /* renamed from: c  reason: collision with root package name */
    public n f420c;

    /* renamed from: d  reason: collision with root package name */
    public n f421d;

    /* renamed from: e  reason: collision with root package name */
    public n f422e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f423f;

    /* renamed from: g  reason: collision with root package name */
    public Object f424g;

    /* renamed from: h  reason: collision with root package name */
    public int f425h;

    public n() {
        this.f423f = null;
        this.f422e = this;
        this.f421d = this;
    }

    public n(n nVar, Object obj, n nVar2, n nVar3) {
        this.f418a = nVar;
        this.f423f = obj;
        this.f425h = 1;
        this.f421d = nVar2;
        this.f422e = nVar3;
        nVar3.f421d = this;
        nVar2.f422e = this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L_0x002e
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r3.f423f
            if (r0 != 0) goto L_0x0012
            java.lang.Object r0 = r4.getKey()
            if (r0 != 0) goto L_0x002e
            goto L_0x001c
        L_0x0012:
            java.lang.Object r2 = r4.getKey()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001c:
            java.lang.Object r0 = r3.f424g
            java.lang.Object r4 = r4.getValue()
            if (r0 != 0) goto L_0x0027
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0027:
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.n.equals(java.lang.Object):boolean");
    }

    public final Object getKey() {
        return this.f423f;
    }

    public final Object getValue() {
        return this.f424g;
    }

    public final int hashCode() {
        int i2 = 0;
        Object obj = this.f423f;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f424g;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i2 ^ hashCode;
    }

    public final Object setValue(Object obj) {
        Object obj2 = this.f424g;
        this.f424g = obj;
        return obj2;
    }

    public final String toString() {
        return this.f423f + "=" + this.f424g;
    }
}
