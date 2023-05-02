package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;

/* renamed from: X.036  reason: invalid class name */
public final class AnonymousClass036 {
    public final ComponentName A00;
    public final ComponentName A01;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0052, code lost:
        if (X.C008603x.A00(r2) == (r1 - 1)) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        if (X.C008603x.A00(r10) == (r8 - 1)) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass036(android.content.ComponentName r12, android.content.ComponentName r13) {
        /*
            r11 = this;
            r0 = 1
            X.C18450wi.A0H(r12, r0)
            r0 = 2
            X.C18450wi.A0H(r13, r0)
            r11.<init>()
            r11.A00 = r12
            r11.A01 = r13
            java.lang.String r2 = r12.getPackageName()
            X.C18450wi.A0B(r2)
            java.lang.String r10 = r12.getClassName()
            X.C18450wi.A0B(r10)
            java.lang.String r6 = r13.getPackageName()
            X.C18450wi.A0B(r6)
            java.lang.String r4 = r13.getClassName()
            X.C18450wi.A0B(r4)
            int r1 = r2.length()
            if (r1 == 0) goto L_0x00aa
            int r9 = r6.length()
            if (r9 == 0) goto L_0x00aa
            int r8 = r10.length()
            if (r8 == 0) goto L_0x00a2
            int r7 = r4.length()
            if (r7 == 0) goto L_0x00a2
            java.lang.String r5 = "*"
            boolean r0 = X.C008603x.A0F(r2, r5)
            if (r0 == 0) goto L_0x0054
            int r2 = X.C008603x.A03(r2, "*", 0)
            int r1 = r1 + -1
            r0 = 0
            if (r2 != r1) goto L_0x0055
        L_0x0054:
            r0 = 1
        L_0x0055:
            java.lang.String r3 = "Wildcard in package name is only allowed at the end."
            if (r0 == 0) goto L_0x009c
            boolean r0 = X.C008603x.A0F(r10, r5)
            if (r0 == 0) goto L_0x0068
            int r2 = X.C008603x.A03(r10, "*", 0)
            int r1 = r8 + -1
            r0 = 0
            if (r2 != r1) goto L_0x0069
        L_0x0068:
            r0 = 1
        L_0x0069:
            java.lang.String r2 = "Wildcard in class name is only allowed at the end."
            if (r0 == 0) goto L_0x0096
            boolean r0 = X.C008603x.A0F(r6, r5)
            if (r0 == 0) goto L_0x0081
            int r1 = X.C008603x.A03(r6, "*", 0)
            int r0 = r9 + -1
            if (r1 == r0) goto L_0x0081
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L_0x0081:
            boolean r0 = X.C008603x.A0F(r4, r5)
            if (r0 == 0) goto L_0x0095
            int r1 = X.C008603x.A03(r4, "*", 0)
            int r0 = r7 + -1
            if (r1 == r0) goto L_0x0095
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x0095:
            return
        L_0x0096:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x009c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L_0x00a2:
            java.lang.String r1 = "Activity class name must not be empty."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00aa:
            java.lang.String r1 = "Package name must not be empty"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass036.<init>(android.content.ComponentName, android.content.ComponentName):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r3.A01(r6.getComponentName(), r4.A01) == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(android.app.Activity r5, android.app.Activity r6) {
        /*
            r4 = this;
            r0 = 0
            X.C18450wi.A0H(r5, r0)
            r0 = 1
            X.C18450wi.A0H(r6, r0)
            X.0W3 r3 = X.AnonymousClass0W3.A00
            android.content.ComponentName r1 = r5.getComponentName()
            android.content.ComponentName r0 = r4.A00
            boolean r0 = r3.A01(r1, r0)
            r2 = 1
            if (r0 == 0) goto L_0x0024
            android.content.ComponentName r1 = r6.getComponentName()
            android.content.ComponentName r0 = r4.A01
            boolean r0 = r3.A01(r1, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            android.content.Intent r0 = r6.getIntent()
            if (r0 == 0) goto L_0x003d
            if (r1 == 0) goto L_0x003b
            android.content.Intent r0 = r6.getIntent()
            X.C18450wi.A0B(r0)
            boolean r0 = r4.A01(r5, r0)
            if (r0 == 0) goto L_0x003b
            return r2
        L_0x003b:
            r2 = 0
            return r2
        L_0x003d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass036.A00(android.app.Activity, android.app.Activity):boolean");
    }

    public final boolean A01(Activity activity, Intent intent) {
        C18450wi.A0H(activity, 0);
        C18450wi.A0H(intent, 1);
        ComponentName componentName = activity.getComponentName();
        AnonymousClass0W3 r3 = AnonymousClass0W3.A00;
        return r3.A01(componentName, this.A00) && r3.A01(intent.getComponent(), this.A01);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass036) {
                AnonymousClass036 r5 = (AnonymousClass036) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SplitPairFilter{primaryActivityName=");
        sb.append(this.A00);
        sb.append(", secondaryActivityName=");
        sb.append(this.A01);
        sb.append(", secondaryActivityAction=");
        sb.append((Object) null);
        sb.append('}');
        return sb.toString();
    }
}
