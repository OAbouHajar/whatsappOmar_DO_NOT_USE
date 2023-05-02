package X;

/* renamed from: X.1gu  reason: invalid class name and case insensitive filesystem */
public class C32651gu extends AnonymousClass1ZS {
    public boolean A00;
    public boolean A01;
    public final long A02;
    public final AnonymousClass01V A03;
    public final Object A04 = new Object();
    public volatile C32641gt A05;
    public final /* synthetic */ C32631gs A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32651gu(C32631gs r2, C32641gt r3, AnonymousClass01V r4, long j2) {
        super("ProcessAnrErrorMonitorThread");
        this.A06 = r2;
        this.A05 = r3;
        this.A02 = j2;
        this.A00 = true;
        this.A03 = r4;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:33|34|35|36|37) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00d4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r10 = this;
            r6 = 0
            r4 = 0
        L_0x0002:
            X.1gs r3 = r10.A06     // Catch:{ RuntimeException -> 0x00d8 }
            X.01V r0 = r10.A03     // Catch:{ RuntimeException -> 0x00d8 }
            android.app.ActivityManager r0 = r0.A03()     // Catch:{ RuntimeException -> 0x00d8 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ RuntimeException -> 0x00d8 }
            java.util.List r0 = r0.getProcessesInErrorState()     // Catch:{ RuntimeException -> 0x00d8 }
            java.util.LinkedList r2 = new java.util.LinkedList     // Catch:{ RuntimeException -> 0x00d8 }
            r2.<init>()     // Catch:{ RuntimeException -> 0x00d8 }
            int r8 = android.os.Process.myUid()     // Catch:{ RuntimeException -> 0x00d8 }
            int r7 = android.os.Process.myPid()     // Catch:{ RuntimeException -> 0x00d8 }
            if (r0 == 0) goto L_0x0054
            java.util.Iterator r9 = r0.iterator()     // Catch:{ RuntimeException -> 0x00d8 }
        L_0x0024:
            boolean r0 = r9.hasNext()     // Catch:{ RuntimeException -> 0x00d8 }
            if (r0 == 0) goto L_0x0054
            java.lang.Object r5 = r9.next()     // Catch:{ RuntimeException -> 0x00d8 }
            android.app.ActivityManager$ProcessErrorStateInfo r5 = (android.app.ActivityManager.ProcessErrorStateInfo) r5     // Catch:{ RuntimeException -> 0x00d8 }
            int r1 = r5.condition     // Catch:{ RuntimeException -> 0x00d8 }
            r0 = 2
            if (r1 != r0) goto L_0x0024
            int r0 = r5.uid     // Catch:{ RuntimeException -> 0x00d8 }
            if (r0 != r8) goto L_0x0024
            X.4K3 r1 = new X.4K3     // Catch:{ RuntimeException -> 0x00d8 }
            r1.<init>()     // Catch:{ RuntimeException -> 0x00d8 }
            java.lang.String r0 = r5.shortMsg     // Catch:{ RuntimeException -> 0x00d8 }
            r1.A01 = r0     // Catch:{ RuntimeException -> 0x00d8 }
            java.lang.String r0 = r5.tag     // Catch:{ RuntimeException -> 0x00d8 }
            r1.A02 = r0     // Catch:{ RuntimeException -> 0x00d8 }
            int r0 = r5.pid     // Catch:{ RuntimeException -> 0x00d8 }
            r1.A00 = r0     // Catch:{ RuntimeException -> 0x00d8 }
            if (r0 != r7) goto L_0x0050
            r2.addFirst(r1)     // Catch:{ RuntimeException -> 0x00d8 }
            goto L_0x0024
        L_0x0050:
            r2.addLast(r1)     // Catch:{ RuntimeException -> 0x00d8 }
            goto L_0x0024
        L_0x0054:
            boolean r0 = r10.A00     // Catch:{ RuntimeException -> 0x00d8 }
            if (r0 == 0) goto L_0x0078
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x00d8 }
            r1.<init>()     // Catch:{ RuntimeException -> 0x00d8 }
            java.lang.String r0 = "ProcessANRErrorMonitor/Starting process monitor checks for process "
            r1.append(r0)     // Catch:{ RuntimeException -> 0x00d8 }
            int r0 = android.os.Process.myPid()     // Catch:{ RuntimeException -> 0x00d8 }
            r1.append(r0)     // Catch:{ RuntimeException -> 0x00d8 }
            java.lang.String r0 = r1.toString()     // Catch:{ RuntimeException -> 0x00d8 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x00d8 }
            r10.A00 = r4     // Catch:{ RuntimeException -> 0x00d8 }
            X.1gt r1 = r10.A05     // Catch:{ RuntimeException -> 0x00d8 }
            r0 = 0
            r3.A00(r1, r0, r0, r4)     // Catch:{ RuntimeException -> 0x00d8 }
        L_0x0078:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00b4
            java.lang.Object r5 = r2.getFirst()
            X.4K3 r5 = (X.AnonymousClass4K3) r5
            int r1 = r5.A00
            int r0 = android.os.Process.myPid()
            if (r1 != r0) goto L_0x00b4
            java.lang.String r0 = "ProcessANRErrorMonitor/ANR detected Short msg: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r5.A01
            r1.append(r0)
            java.lang.String r0 = " Tag: "
            r1.append(r0)
            java.lang.String r0 = r5.A02
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1gt r4 = r10.A05
            java.lang.String r2 = r5.A01
            java.lang.String r1 = r5.A02
            r0 = 1
            r3.A00(r4, r2, r1, r0)
            return
        L_0x00b4:
            int r6 = r6 + 1
            r0 = 120(0x78, float:1.68E-43)
            if (r6 < r0) goto L_0x00c7
            X.1gt r2 = r10.A05
            r1 = 2
            r0 = 0
            r3.A00(r2, r0, r0, r1)
            java.lang.String r0 = "ProcessANRErrorMonitor/Stopping checks because of MAX_NUMBER_BEFORE_ERROR"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x00c7:
            java.lang.Object r2 = r10.A04
            monitor-enter(r2)
            boolean r0 = r10.A01     // Catch:{ all -> 0x00f4 }
            if (r0 != 0) goto L_0x00d6
            r0 = 500(0x1f4, float:7.0E-43)
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x00d4 }
            r2.wait(r0)     // Catch:{ InterruptedException -> 0x00d4 }
        L_0x00d4:
            boolean r0 = r10.A01     // Catch:{ all -> 0x00f4 }
        L_0x00d6:
            monitor-exit(r2)     // Catch:{ all -> 0x00f4 }
            goto L_0x00ea
        L_0x00d8:
            r1 = move-exception
            r1.printStackTrace()
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L_0x00f7
            X.1gs r3 = r10.A06
            X.1gt r2 = r10.A05
            r1 = 4
            goto L_0x00ef
        L_0x00ea:
            if (r0 == 0) goto L_0x0002
            X.1gt r2 = r10.A05
            r1 = 3
        L_0x00ef:
            r0 = 0
            r3.A00(r2, r0, r0, r1)
            return
        L_0x00f4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00f4 }
            throw r0
        L_0x00f7:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32651gu.run():void");
    }
}
