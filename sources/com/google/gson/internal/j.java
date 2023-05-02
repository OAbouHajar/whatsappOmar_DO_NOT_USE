package com.google.gson.internal;

import java.util.Comparator;

/* compiled from: XFMFile */
public final class j implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f410a;

    public /* synthetic */ j(int i2) {
        this.f410a = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            int r0 = r4.f410a
            switch(r0) {
                case 1: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0037
        L_0x0006:
            int r0 = r5.length()
            int r1 = r6.length()
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 4
        L_0x0013:
            if (r1 >= r0) goto L_0x0025
            char r2 = r5.charAt(r1)
            char r3 = r6.charAt(r1)
            if (r2 == r3) goto L_0x0022
            if (r2 >= r3) goto L_0x0033
            goto L_0x0031
        L_0x0022:
            int r1 = r1 + 1
            goto L_0x0013
        L_0x0025:
            int r5 = r5.length()
            int r6 = r6.length()
            if (r5 == r6) goto L_0x0035
            if (r5 >= r6) goto L_0x0033
        L_0x0031:
            r5 = -1
            goto L_0x0036
        L_0x0033:
            r5 = 1
            goto L_0x0036
        L_0x0035:
            r5 = 0
        L_0x0036:
            return r5
        L_0x0037:
            int r5 = r5.compareTo(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.j.a(java.lang.String, java.lang.String):int");
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f410a) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 1:
                return a((String) obj, (String) obj2);
            default:
                return a((String) obj, (String) obj2);
        }
    }
}
