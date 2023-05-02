package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4gB  reason: invalid class name and case insensitive filesystem */
public final class C91594gB implements ServiceConnection, C107805Lm {
    public int A00 = 2;
    public ComponentName A01;
    public IBinder A02;
    public boolean A03;
    public final AnonymousClass3BI A04;
    public final Map A05 = AnonymousClass000.A0x();
    public final /* synthetic */ C90074dS A06;

    public C91594gB(AnonymousClass3BI r2, C90074dS r3) {
        this.A06 = r3;
        this.A04 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r2.charAt(0) <= 'Z') goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055 A[Catch:{ all -> 0x006e }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064 A[Catch:{ all -> 0x006e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 3
            r8 = r11
            r11.A00 = r0
            android.os.StrictMode$VmPolicy r4 = android.os.StrictMode.getVmPolicy()
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 1
            r0 = 31
            if (r1 >= r0) goto L_0x002e
            boolean r0 = X.C14320oy.A04()
            r5 = 0
            if (r0 == 0) goto L_0x003e
            java.lang.String r2 = android.os.Build.VERSION.CODENAME
            int r0 = r2.length()
            if (r0 != r3) goto L_0x003e
            char r1 = r2.charAt(r5)
            r0 = 83
            if (r1 < r0) goto L_0x003e
            char r1 = r2.charAt(r5)
            r0 = 90
            if (r1 > r0) goto L_0x003e
        L_0x002e:
            android.os.StrictMode$VmPolicy$Builder r0 = new android.os.StrictMode$VmPolicy$Builder
            r0.<init>(r4)
            android.os.StrictMode$VmPolicy$Builder r0 = r0.permitUnsafeIntentLaunch()
            android.os.StrictMode$VmPolicy r0 = r0.build()
            android.os.StrictMode.setVmPolicy(r0)
        L_0x003e:
            X.4dS r2 = r11.A06     // Catch:{ all -> 0x006e }
            X.3BF r5 = r2.A02     // Catch:{ all -> 0x006e }
            android.content.Context r6 = r2.A00     // Catch:{ all -> 0x006e }
            X.3BI r1 = r11.A04     // Catch:{ all -> 0x006e }
            android.content.Intent r7 = r1.A00(r6)     // Catch:{ all -> 0x006e }
            r10 = 4225(0x1081, float:5.92E-42)
            r9 = r12
            boolean r0 = r5.A02(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x006e }
            r11.A03 = r0     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0064
            android.os.Handler r0 = r2.A04     // Catch:{ all -> 0x006e }
            android.os.Message r3 = r0.obtainMessage(r3, r1)     // Catch:{ all -> 0x006e }
            android.os.Handler r2 = r2.A04     // Catch:{ all -> 0x006e }
            r0 = 300000(0x493e0, double:1.482197E-318)
            r2.sendMessageDelayed(r3, r0)     // Catch:{ all -> 0x006e }
            goto L_0x006a
        L_0x0064:
            r0 = 2
            r11.A00 = r0     // Catch:{ all -> 0x006e }
            r5.A01(r6, r11)     // Catch:{ IllegalArgumentException -> 0x006a }
        L_0x006a:
            android.os.StrictMode.setVmPolicy(r4)
            return
        L_0x006e:
            r0 = move-exception
            android.os.StrictMode.setVmPolicy(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91594gB.A00(java.lang.String):void");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C90074dS r0 = this.A06;
        synchronized (r0.A03) {
            r0.A04.removeMessages(1, this.A04);
            this.A02 = iBinder;
            this.A01 = componentName;
            Iterator A0q = C13680ns.A0q(this.A05);
            while (A0q.hasNext()) {
                ((ServiceConnection) A0q.next()).onServiceConnected(componentName, iBinder);
            }
            this.A00 = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C90074dS r0 = this.A06;
        synchronized (r0.A03) {
            r0.A04.removeMessages(1, this.A04);
            this.A02 = null;
            this.A01 = componentName;
            Iterator A0q = C13680ns.A0q(this.A05);
            while (A0q.hasNext()) {
                ((ServiceConnection) A0q.next()).onServiceDisconnected(componentName);
            }
            this.A00 = 2;
        }
    }
}
