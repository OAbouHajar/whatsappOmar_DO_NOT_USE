package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: XFMFile */
public final class l extends AbstractSet {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f412a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LinkedTreeMap f413b;

    public /* synthetic */ l(LinkedTreeMap linkedTreeMap, int i2) {
        this.f412a = i2;
        this.f413b = linkedTreeMap;
    }

    public final void clear() {
        int i2 = this.f412a;
        LinkedTreeMap linkedTreeMap = this.f413b;
        switch (i2) {
            case 0:
                linkedTreeMap.clear();
                return;
            default:
                linkedTreeMap.clear();
                return;
        }
    }

    public final boolean contains(Object obj) {
        int i2 = this.f412a;
        LinkedTreeMap linkedTreeMap = this.f413b;
        switch (i2) {
            case 0:
                return (obj instanceof Map.Entry) && linkedTreeMap.b((Map.Entry) obj) != null;
            default:
                return linkedTreeMap.containsKey(obj);
        }
    }

    public final Iterator iterator() {
        switch (this.f412a) {
            case 0:
                return new k(this);
            default:
                return new k(this, 0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            int r1 = r4.f412a
            r2 = 1
            com.google.gson.internal.LinkedTreeMap r3 = r4.f413b
            switch(r1) {
                case 0: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x001d
        L_0x000a:
            boolean r1 = r5 instanceof java.util.Map.Entry
            if (r1 != 0) goto L_0x000f
            goto L_0x001c
        L_0x000f:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            com.google.gson.internal.n r5 = r3.b(r5)
            if (r5 != 0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            r3.d(r5, r2)
            r0 = 1
        L_0x001c:
            return r0
        L_0x001d:
            r3.getClass()
            if (r5 == 0) goto L_0x0027
            com.google.gson.internal.n r5 = r3.a(r0, r5)     // Catch:{ ClassCastException -> 0x0027 }
            goto L_0x0028
        L_0x0027:
            r5 = 0
        L_0x0028:
            if (r5 == 0) goto L_0x002d
            r3.d(r5, r2)
        L_0x002d:
            if (r5 == 0) goto L_0x0030
            r0 = 1
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.l.remove(java.lang.Object):boolean");
    }

    public final int size() {
        int i2 = this.f412a;
        LinkedTreeMap linkedTreeMap = this.f413b;
        switch (i2) {
            case 0:
                return linkedTreeMap.f298c;
            default:
                return linkedTreeMap.f298c;
        }
    }
}
