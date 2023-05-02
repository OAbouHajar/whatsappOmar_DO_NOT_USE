package X;

import com.facebook.redex.RunnableRunnableShape1S1201000_I1;
import java.util.Set;

/* renamed from: X.34a  reason: invalid class name and case insensitive filesystem */
public abstract class C605634a extends C28311Vk {
    public int A00 = -1;
    public C16300so A01;
    public C16320sq A02;
    public final C109985Uo A03 = AnonymousClass3cE.create();
    public final String A04 = "xpm-msg-exporter-svc";
    public final Set A05 = C13680ns.A0o();

    public final void A00() {
        synchronized (this) {
            if (this.A03.isEmpty() && this.A05.isEmpty()) {
                stopSelf(this.A00);
            }
        }
    }

    public void A01(Runnable runnable, String str, int i2) {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A04);
        A0o.append("/");
        A0o.append(str);
        A0o.append("; async task scheduled (foreground), start_id=");
        A0o.append(i2);
        C13680ns.A1V(A0o);
        this.A02.Aco(new RunnableRunnableShape1S1201000_I1(this, runnable, str, i2, 3));
        synchronized (this) {
            this.A03.add(Integer.valueOf(i2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r5.A01 != null) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int onStartCommand(android.content.Intent r9, int r10, int r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.A00     // Catch:{ all -> 0x00e3 }
            if (r11 <= r0) goto L_0x0007
            r8.A00 = r11     // Catch:{ all -> 0x00e3 }
        L_0x0007:
            java.util.Set r4 = r8.A05     // Catch:{ all -> 0x00e3 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00e3 }
            r4.add(r3)     // Catch:{ all -> 0x00e3 }
            monitor-exit(r8)     // Catch:{ all -> 0x00e3 }
            r2 = r8
            com.obwhatsapp.migration.export.service.MessagesExporterService r2 = (com.obwhatsapp.migration.export.service.MessagesExporterService) r2
            if (r9 != 0) goto L_0x0020
            java.lang.String r0 = "xpm-export-service-onStartCommand()/intent is null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x001c:
            r0 = 2
            monitor-enter(r8)
            goto L_0x00d5
        L_0x0020:
            java.lang.String r0 = r9.getAction()
            java.lang.String r7 = "ACTION_START_EXPORT"
            boolean r0 = r7.equals(r0)
            r6 = 0
            if (r0 == 0) goto L_0x0054
            X.0sr r5 = r2.A00
            monitor-enter(r5)
            android.os.CancellationSignal r0 = r5.A00     // Catch:{ all -> 0x00e0 }
            if (r0 != 0) goto L_0x0039
            java.util.concurrent.CountDownLatch r1 = r5.A01     // Catch:{ all -> 0x00e0 }
            r0 = 0
            if (r1 == 0) goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            monitor-exit(r5)
            if (r0 != 0) goto L_0x0045
            X.0sr r0 = r2.A00
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0054
        L_0x0045:
            java.lang.String r0 = "xpm-export-service-onStartCommand()/export in progress"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0so r2 = r2.A01
            java.lang.String r1 = "xpm-export-service-export-duplicated-start"
            java.lang.String r0 = "xpm-export-service-onStartCommand: duplicated call with ACTION_START_EXPORT event - there is another task running export or cancellation"
            goto L_0x0078
        L_0x0054:
            java.lang.String r1 = r9.getAction()
            java.lang.String r0 = "ACTION_CANCEL_EXPORT"
            boolean r0 = r0.equals(r1)
            r5 = 31
            if (r0 == 0) goto L_0x00ae
            X.0sr r0 = r2.A00
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = "xpm-export-service-onStartCommand()/cancellation in already in progress"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0so r2 = r2.A01
            java.lang.String r1 = "xpm-export-service-cancel-duplicated-start"
            java.lang.String r0 = "xpm-export-service-onStartCommand: duplicated call with ACTION_CANCEL_EXPORT event - there is another task running cancellation"
        L_0x0078:
            r2.AcB(r1, r0, r6)
            goto L_0x001c
        L_0x007c:
            java.lang.String r0 = "xpm-export-service-onStartCommand()/action_cancel_export"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.39e r0 = r2.A01
            X.03l r6 = r0.A01()
            X.0tz r0 = r0.A00
            android.content.res.Resources r1 = X.C16980tz.A00(r0)
            r0 = 2131893433(0x7f121cb9, float:1.9421642E38)
            java.lang.String r0 = r1.getString(r0)
            r6.A0A(r0)
            android.app.Notification r0 = r6.A01()
            r2.startForeground(r5, r0)
            X.0sr r5 = r2.A00
            r0 = 4
            com.facebook.redex.RunnableRunnableShape19S0100000_I1_2 r1 = new com.facebook.redex.RunnableRunnableShape19S0100000_I1_2
            r1.<init>(r5, r0)
            java.lang.String r0 = "cancel-export"
            r2.A01(r1, r0, r11)
            goto L_0x001c
        L_0x00ae:
            java.lang.String r0 = r9.getAction()
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = "xpm-export-service-onStartCommand()/action_start_export"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.39e r0 = r2.A01
            android.app.Notification r0 = r0.A00()
            r2.startForeground(r5, r0)
            r0 = 33
            com.facebook.redex.RunnableRunnableShape14S0200000_I1_2 r1 = new com.facebook.redex.RunnableRunnableShape14S0200000_I1_2
            r1.<init>(r2, r0, r9)
            java.lang.String r0 = "export-data"
            r2.A01(r1, r0, r11)
            goto L_0x001c
        L_0x00d5:
            r4.remove(r3)     // Catch:{ all -> 0x00dd }
            r8.A00()     // Catch:{ all -> 0x00dd }
            monitor-exit(r8)     // Catch:{ all -> 0x00dd }
            return r0
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00dd }
            throw r0
        L_0x00e0:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x00e3:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00e3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C605634a.onStartCommand(android.content.Intent, int, int):int");
    }
}
