package X;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.IDxCallableShape150S0100000_3_I1;
import com.facebook.redex.IDxCallbackShape189S0100000_3_I1;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.5yJ  reason: invalid class name */
public class AnonymousClass5yJ implements Camera.OnZoomChangeListener {
    public int A00;
    public int A01;
    public int A02;
    public Camera A03;
    public final Handler A04 = new Handler(Looper.getMainLooper(), new IDxCallbackShape189S0100000_3_I1(this, 0));
    public final C118855vM A05 = new C118855vM();
    public final AnonymousClass5vU A06;
    public final C119355wx A07;
    public final Callable A08 = new IDxCallableShape150S0100000_3_I1(this, 7);
    public volatile int A09;
    public volatile List A0A;
    public volatile boolean A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;

    public AnonymousClass5yJ(AnonymousClass5vU r4, C119355wx r5) {
        this.A06 = r4;
        this.A07 = r5;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public void A00(int r5) {
        /*
            r4 = this;
            r3 = r4
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x0073
            int r0 = r4.A09
            if (r5 == r0) goto L_0x0073
            int r0 = r4.A01
            if (r5 > r0) goto L_0x0073
            if (r5 < 0) goto L_0x0073
            boolean r0 = X.AnonymousClass5xT.A02()
            if (r0 != 0) goto L_0x006c
            boolean r0 = r4.A0E
            if (r0 == 0) goto L_0x0035
            monitor-enter(r3)
            r4.A02 = r5     // Catch:{ all -> 0x0069 }
            boolean r0 = r4.A0C     // Catch:{ all -> 0x0069 }
            r1 = 1
            if (r0 == 0) goto L_0x002d
            boolean r0 = r4.A0D     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x0067
            r4.A0D = r1     // Catch:{ all -> 0x0069 }
            android.hardware.Camera r0 = r4.A03     // Catch:{ all -> 0x0069 }
            r0.stopSmoothZoom()     // Catch:{ all -> 0x0069 }
            goto L_0x0067
        L_0x002d:
            r4.A0C = r1     // Catch:{ all -> 0x0069 }
            android.hardware.Camera r0 = r4.A03     // Catch:{ all -> 0x0069 }
            r0.startSmoothZoom(r5)     // Catch:{ all -> 0x0069 }
            goto L_0x0067
        L_0x0035:
            X.5vU r1 = r4.A06     // Catch:{ Exception -> 0x0050 }
            int r0 = r4.A00     // Catch:{ Exception -> 0x0050 }
            X.5fV r2 = r1.A00(r0)     // Catch:{ Exception -> 0x0050 }
            X.5qO r1 = X.AnonymousClass5wI.A0v     // Catch:{ Exception -> 0x0050 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0050 }
            X.C115845qP.A02(r1, r2, r0)     // Catch:{ Exception -> 0x0050 }
            r2.A02()     // Catch:{ Exception -> 0x0050 }
            r1 = 1
            android.hardware.Camera r0 = r4.A03     // Catch:{ Exception -> 0x0050 }
            r4.onZoomChange(r5, r1, r0)     // Catch:{ Exception -> 0x0050 }
            return
        L_0x0050:
            r1 = move-exception
            java.lang.String r0 = "Failed to set zoom level to: "
            java.lang.String r0 = X.C13680ns.A0c(r5, r0)
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0, r1)
            monitor-enter(r3)
            android.os.Handler r1 = r4.A04     // Catch:{ all -> 0x0069 }
            r0 = 2
            android.os.Message r0 = r1.obtainMessage(r0, r2)     // Catch:{ all -> 0x0069 }
            r1.sendMessage(r0)     // Catch:{ all -> 0x0069 }
        L_0x0067:
            monitor-exit(r3)
            return
        L_0x0069:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x006c:
            java.lang.String r0 = "Attempting to zoom on the UI thread!"
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)
            throw r0
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5yJ.A00(int):void");
    }

    public synchronized void onZoomChange(int i2, boolean z2, Camera camera) {
        this.A09 = i2;
        int i3 = 0;
        if (this.A0E) {
            this.A0C = AnonymousClass000.A1P(z2 ? 1 : 0);
            if (z2) {
                this.A0D = false;
                if (this.A0B && this.A02 != i2) {
                    this.A07.A07("update_zoom_level", this.A08);
                }
            }
        }
        Handler handler = this.A04;
        if (z2) {
            i3 = 1;
        }
        handler.sendMessage(handler.obtainMessage(1, i2, i3));
    }
}
