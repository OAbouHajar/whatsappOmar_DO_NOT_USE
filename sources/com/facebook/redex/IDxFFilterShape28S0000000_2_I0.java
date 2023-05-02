package com.facebook.redex;

import java.io.FilenameFilter;

public class IDxFFilterShape28S0000000_2_I0 implements FilenameFilter {
    public final int A00;

    public IDxFFilterShape28S0000000_2_I0(int i2) {
        this.A00 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r3.endsWith(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        return r3.endsWith(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean accept(java.io.File r2, java.lang.String r3) {
        /*
            r1 = this;
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x000f;
                case 1: goto L_0x002a;
                case 2: goto L_0x003e;
                case 3: goto L_0x000c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = ".log"
        L_0x0007:
            boolean r0 = r3.endsWith(r0)
            return r0
        L_0x000c:
            java.lang.String r0 = ".pack"
            goto L_0x0007
        L_0x000f:
            java.lang.String r0 = "override-"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = ".log"
            boolean r0 = r3.endsWith(r0)
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = ".zip"
            boolean r0 = r3.endsWith(r0)
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = ".tmp"
            goto L_0x0034
        L_0x002a:
            java.lang.String r0 = "override-"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = ".log"
        L_0x0034:
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L_0x003c
        L_0x003a:
            r0 = 1
            return r0
        L_0x003c:
            r0 = 0
            return r0
        L_0x003e:
            java.lang.String r0 = "HIST_SYNC"
            boolean r0 = r3.startsWith(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFFilterShape28S0000000_2_I0.accept(java.io.File, java.lang.String):boolean");
    }
}
