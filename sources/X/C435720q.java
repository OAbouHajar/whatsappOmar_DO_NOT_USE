package X;

/* renamed from: X.20q  reason: invalid class name and case insensitive filesystem */
public class C435720q extends AnonymousClass1ZS {
    public final C435620o A00;
    public volatile boolean A01;
    public final /* synthetic */ AnonymousClass1MF A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C435720q(C435620o r2, AnonymousClass1MF r3) {
        super("StickerImageFileLoader");
        this.A02 = r3;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r7 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            r5 = 0
            r6 = r5
        L_0x0007:
            boolean r0 = r7.A01     // Catch:{ InterruptedException -> 0x00a6 }
            if (r0 != 0) goto L_0x00a6
            X.20o r3 = r7.A00     // Catch:{ InterruptedException -> 0x00a6 }
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x00a6 }
            java.util.PriorityQueue r2 = r3.A00     // Catch:{ all -> 0x00a3 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x001b
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.wait(r0)     // Catch:{ all -> 0x00a3 }
        L_0x001b:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x00a3 }
            if (r0 != 0) goto L_0x0028
            java.lang.Object r4 = r2.remove()     // Catch:{ all -> 0x00a3 }
            X.20s r4 = (X.C435920s) r4     // Catch:{ all -> 0x00a3 }
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            monitor-exit(r3)     // Catch:{ InterruptedException -> 0x00a6 }
            boolean r0 = r7.A01     // Catch:{ InterruptedException -> 0x00a6 }
            if (r0 == 0) goto L_0x002f
            goto L_0x00a2
        L_0x002f:
            if (r4 == 0) goto L_0x0096
            boolean r0 = r4.A05     // Catch:{ InterruptedException -> 0x00a6 }
            if (r0 != 0) goto L_0x003f
            X.1MF r2 = r7.A02     // Catch:{ InterruptedException -> 0x00a6 }
            X.0pt r1 = r2.A02     // Catch:{ InterruptedException -> 0x00a6 }
            java.util.concurrent.ConcurrentHashMap r0 = r2.A09     // Catch:{ InterruptedException -> 0x00a6 }
            r2.A05(r1, r4, r0)     // Catch:{ InterruptedException -> 0x00a6 }
            goto L_0x009f
        L_0x003f:
            boolean r2 = r4 instanceof X.C436220v     // Catch:{ InterruptedException -> 0x00a6 }
            if (r2 == 0) goto L_0x0054
            r0 = r4
            X.20v r0 = (X.C436220v) r0     // Catch:{ InterruptedException -> 0x00a6 }
            java.lang.String r1 = r0.A04     // Catch:{ InterruptedException -> 0x00a6 }
            android.widget.ImageView r0 = r0.A00     // Catch:{ InterruptedException -> 0x00a6 }
            java.lang.Object r0 = r0.getTag()     // Catch:{ InterruptedException -> 0x00a6 }
            boolean r0 = r1.equals(r0)     // Catch:{ InterruptedException -> 0x00a6 }
            if (r0 == 0) goto L_0x009f
        L_0x0054:
            X.1MF r6 = r7.A02     // Catch:{ InterruptedException -> 0x00a6 }
            java.util.concurrent.ConcurrentHashMap r1 = r6.A09     // Catch:{ InterruptedException -> 0x00a6 }
            java.lang.String r0 = r4.A04     // Catch:{ InterruptedException -> 0x00a6 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ InterruptedException -> 0x00a6 }
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0     // Catch:{ InterruptedException -> 0x00a6 }
            if (r0 == 0) goto L_0x006b
            java.lang.Object r3 = r0.get()     // Catch:{ InterruptedException -> 0x00a6 }
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3     // Catch:{ InterruptedException -> 0x00a6 }
            if (r3 != 0) goto L_0x0090
            goto L_0x006c
        L_0x006b:
            r3 = r5
        L_0x006c:
            if (r2 == 0) goto L_0x0078
            r0 = r4
            X.20v r0 = (X.C436220v) r0     // Catch:{ InterruptedException -> 0x00a6 }
            android.widget.ImageView r0 = r0.A00     // Catch:{ InterruptedException -> 0x00a6 }
            android.content.Context r1 = r0.getContext()     // Catch:{ InterruptedException -> 0x00a6 }
            goto L_0x007d
        L_0x0078:
            r0 = r4
            X.20w r0 = (X.C436320w) r0     // Catch:{ InterruptedException -> 0x00a6 }
            android.content.Context r1 = r0.A00     // Catch:{ InterruptedException -> 0x00a6 }
        L_0x007d:
            X.1jm r2 = r4.A03     // Catch:{ InterruptedException -> 0x00a6 }
            X.0sb r0 = r6.A01     // Catch:{ InterruptedException -> 0x00a6 }
            byte[] r1 = X.AnonymousClass1MF.A01(r1, r0, r2)     // Catch:{ InterruptedException -> 0x00a6 }
            if (r1 == 0) goto L_0x0090
            java.lang.String r0 = r2.A0D     // Catch:{ InterruptedException -> 0x00a6 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ InterruptedException -> 0x00a6 }
            android.graphics.drawable.Drawable r3 = r6.A02(r4, r0, r1)     // Catch:{ InterruptedException -> 0x00a6 }
        L_0x0090:
            X.0pt r0 = r6.A02     // Catch:{ InterruptedException -> 0x00a6 }
            r4.A00(r3, r0)     // Catch:{ InterruptedException -> 0x00a6 }
            goto L_0x009f
        L_0x0096:
            if (r6 != 0) goto L_0x009f
            X.1MF r0 = r7.A02     // Catch:{ InterruptedException -> 0x00a6 }
            r0.A00 = r5     // Catch:{ InterruptedException -> 0x00a6 }
            r7.interrupt()     // Catch:{ InterruptedException -> 0x00a6 }
        L_0x009f:
            r6 = r4
            goto L_0x0007
        L_0x00a2:
            return
        L_0x00a3:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ InterruptedException -> 0x00a6 }
            throw r0     // Catch:{ InterruptedException -> 0x00a6 }
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C435720q.run():void");
    }
}
