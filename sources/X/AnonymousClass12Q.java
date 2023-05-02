package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.IDxBReceiverShape6S0100000_1_I0;
import com.facebook.redex.IDxBReceiverShape7S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape3S0100000_I0_2;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.12Q  reason: invalid class name */
public final class AnonymousClass12Q implements AnonymousClass12R, AnonymousClass12S, C18000vz {
    public int A00;
    public int A01 = 0;
    public int A02;
    public long A03;
    public long A04;
    public BroadcastReceiver A05;
    public BroadcastReceiver A06;
    public BroadcastReceiver A07;
    public BroadcastReceiver A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D = new Handler(Looper.getMainLooper());
    public final C16300so A0E;
    public final AnonymousClass12O A0F;
    public final C19670yo A0G;
    public final AnonymousClass12N A0H;
    public final C18260wP A0I;
    public final C16980tz A0J;
    public final C19380yL A0K;
    public final C15860rz A0L;
    public final AnonymousClass013 A0M;
    public final C14710pd A0N;
    public final C16320sq A0O;
    public final AnonymousClass12P A0P;
    public final AtomicReference A0Q = new AtomicReference(10);
    public volatile Notification A0R;

    public AnonymousClass12Q(C16300so r3, AnonymousClass12O r4, C19670yo r5, AnonymousClass12N r6, C18260wP r7, C16980tz r8, C19380yL r9, C15860rz r10, AnonymousClass013 r11, C14710pd r12, C16320sq r13, AnonymousClass12P r14) {
        this.A0J = r8;
        this.A0N = r12;
        this.A0E = r3;
        this.A0O = r13;
        this.A0M = r11;
        this.A0P = r14;
        this.A0L = r10;
        this.A0K = r9;
        this.A0F = r4;
        this.A0I = r7;
        this.A0G = r5;
        this.A0H = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r0 == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r1 != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Notification A00(android.content.res.Resources r5, java.lang.String r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.C008804a
            if (r0 == 0) goto L_0x0008
            X.04a r5 = (X.C008804a) r5
            android.content.res.Resources r5 = r5.A00
        L_0x0008:
            X.03l r2 = r4.A02()
            java.lang.String r0 = "action_restore"
            boolean r3 = r0.equals(r6)
            if (r3 != 0) goto L_0x001f
            java.lang.String r0 = "action_restore_media"
            boolean r1 = r0.equals(r6)
            r0 = 2131893464(0x7f121cd8, float:1.9421705E38)
            if (r1 == 0) goto L_0x0022
        L_0x001f:
            r0 = 2131893466(0x7f121cda, float:1.942171E38)
        L_0x0022:
            java.lang.String r0 = r5.getString(r0)
            r2.A0A(r0)
            java.lang.String r0 = "action_backup"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x004e
            if (r3 != 0) goto L_0x005d
            java.lang.String r0 = "action_restore_media"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = "action_change_number"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x004e
            java.lang.String r0 = "action_delete"
            boolean r0 = r0.equals(r6)
            r1 = 2131893325(0x7f121c4d, float:1.9421423E38)
            if (r0 != 0) goto L_0x0051
        L_0x004e:
            r1 = 2131893463(0x7f121cd7, float:1.9421703E38)
        L_0x0051:
            java.lang.String r0 = r5.getString(r1)
            r2.A09(r0)
            android.app.Notification r0 = r2.A01()
            return r0
        L_0x005d:
            r1 = 2131893465(0x7f121cd9, float:1.9421707E38)
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12Q.A00(android.content.res.Resources, java.lang.String):android.app.Notification");
    }

    public final PendingIntent A01(String str) {
        Intent intent = new Intent(str);
        intent.setPackage("com.obwhatsapp");
        return C42341xd.A01(this.A0J.A00, 0, intent, 0);
    }

    public final C007503l A02() {
        Context context = this.A0J.A00;
        C007503l A002 = C218415q.A00(context);
        A002.A0J = "chat_history_backup@1";
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.backup.google.SettingsGoogleDrive");
        A002.A09 = C42341xd.A00(context, 0, intent, 0);
        A002.A07.icon = yo.getNIcon(R.drawable.notifybar);
        if (Build.VERSION.SDK_INT >= 21) {
            A002.A06 = 1;
        }
        return A002;
    }

    public void A03() {
        this.A0R = null;
        C19380yL r2 = this.A0K;
        r2.A03(5, (String) null);
        r2.A03(46, (String) null);
    }

    public synchronized void A04() {
        int i2 = this.A01 + 1;
        this.A01 = i2;
        if (i2 <= 1) {
            Log.i("gdrive-notification-manager/register");
            this.A0Q.set(10);
            this.A0C = false;
            this.A0B = false;
            this.A0A = false;
            this.A00 = 0;
            this.A02 = 0;
            this.A03 = 0;
            this.A04 = 0;
            this.A09 = null;
            if (this.A0R != null) {
                C16300so r3 = this.A0E;
                StringBuilder sb = new StringBuilder();
                sb.append("numOfClientsRegistered=");
                sb.append(this.A01);
                r3.AcB("gdrive-notification-manager/register called with non-null last notification", sb.toString(), false);
            }
            this.A0R = null;
            this.A0D.post(new RunnableRunnableShape3S0100000_I0_2(this, 13));
            this.A0H.A02(this);
            AnonymousClass12O r1 = this.A0F;
            r1.A00.A02(this);
            C19670yo r12 = r1.A01;
            if (r12.A0Z.get() || !r12.A0a.get()) {
                ANG();
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0062 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0078 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[SYNTHETIC, Splitter:B:21:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071 A[SYNTHETIC, Splitter:B:26:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c A[SYNTHETIC, Splitter:B:31:0x007c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A05() {
        /*
            r3 = this;
            monitor-enter(r3)
            android.app.Notification r2 = r3.A0R     // Catch:{ all -> 0x0085 }
            java.util.concurrent.atomic.AtomicReference r0 = r3.A0Q     // Catch:{ all -> 0x0085 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0085 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0085 }
            if (r2 == 0) goto L_0x0032
            if (r0 == 0) goto L_0x0032
            r3.A03()     // Catch:{ all -> 0x0085 }
            int r1 = r0.intValue()     // Catch:{ all -> 0x0085 }
            r0 = 15
            if (r1 == r0) goto L_0x001e
            r0 = 27
            if (r1 != r0) goto L_0x0032
        L_0x001e:
            boolean r0 = r3.A0C     // Catch:{ all -> 0x0085 }
            boolean r0 = r3.A07(r0)     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = "gdrive-notification-manager/re-posting important notification"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0085 }
            X.0yL r1 = r3.A0K     // Catch:{ all -> 0x0085 }
            r0 = 46
            r1.A02(r0, r2)     // Catch:{ all -> 0x0085 }
        L_0x0032:
            int r0 = r3.A01     // Catch:{ all -> 0x0085 }
            int r0 = r0 + -1
            r3.A01 = r0     // Catch:{ all -> 0x0085 }
            if (r0 > 0) goto L_0x0083
            java.lang.String r0 = "gdrive-notification-manager/unregister"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0085 }
            android.os.Handler r2 = r3.A0D     // Catch:{ all -> 0x0085 }
            r1 = 14
            com.facebook.redex.RunnableRunnableShape3S0100000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape3S0100000_I0_2     // Catch:{ all -> 0x0085 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0085 }
            r2.post(r0)     // Catch:{ all -> 0x0085 }
            X.12N r0 = r3.A0H     // Catch:{ all -> 0x0085 }
            r0.A03(r3)     // Catch:{ all -> 0x0085 }
            X.12O r0 = r3.A0F     // Catch:{ all -> 0x0085 }
            X.2GP r0 = r0.A00     // Catch:{ all -> 0x0085 }
            r0.A03(r3)     // Catch:{ all -> 0x0085 }
            android.content.BroadcastReceiver r1 = r3.A05     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x0062
            X.0tz r0 = r3.A0J     // Catch:{ IllegalArgumentException -> 0x0062 }
            android.content.Context r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x0062 }
            r0.unregisterReceiver(r1)     // Catch:{ IllegalArgumentException -> 0x0062 }
        L_0x0062:
            android.content.BroadcastReceiver r1 = r3.A07     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x006d
            X.0tz r0 = r3.A0J     // Catch:{ IllegalArgumentException -> 0x006d }
            android.content.Context r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x006d }
            r0.unregisterReceiver(r1)     // Catch:{ IllegalArgumentException -> 0x006d }
        L_0x006d:
            android.content.BroadcastReceiver r1 = r3.A06     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x0078
            X.0tz r0 = r3.A0J     // Catch:{ IllegalArgumentException -> 0x0078 }
            android.content.Context r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x0078 }
            r0.unregisterReceiver(r1)     // Catch:{ IllegalArgumentException -> 0x0078 }
        L_0x0078:
            android.content.BroadcastReceiver r1 = r3.A08     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x0083
            X.0tz r0 = r3.A0J     // Catch:{ IllegalArgumentException -> 0x0083 }
            android.content.Context r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x0083 }
            r0.unregisterReceiver(r1)     // Catch:{ IllegalArgumentException -> 0x0083 }
        L_0x0083:
            monitor-exit(r3)
            return
        L_0x0085:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12Q.A05():void");
    }

    public final void A06(AnonymousClass04E r6, String str, String str2, int i2, int i3, boolean z2, boolean z3) {
        this.A09 = str2;
        if (this.A0A) {
            A03();
        }
        C007503l A022 = A02();
        boolean z4 = true;
        if (i2 == 1) {
            A022.A03(0, 0, false);
        } else if (i2 != 2) {
            A022.A03(100, i3, false);
        } else {
            A022.A03(100, i3, true);
        }
        A022.A0D(z3);
        A022.A0E(z2);
        A022.A0A(str);
        A022.A09(str2);
        this.A0B = z2;
        if (r6 == null) {
            z4 = false;
        }
        this.A0A = z4;
        if (r6 != null) {
            A022.A0N.add(r6);
        }
        Notification A012 = A022.A01();
        this.A0R = A012;
        this.A0K.A02(5, A012);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A07(boolean r11) {
        /*
            r10 = this;
            r7 = 1
            if (r11 == 0) goto L_0x0009
            java.lang.String r0 = "gdrive-notification-manager/backup-error/backup-user-initiated/true"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r7
        L_0x0009:
            X.0rz r3 = r10.A0L
            int r6 = r3.A06()
            r8 = 5184000000(0x134fd9000, double:2.561236308E-314)
            r2 = 2
            if (r6 == 0) goto L_0x0087
            if (r6 == r7) goto L_0x0082
            if (r6 == r2) goto L_0x007e
            r0 = 3
            if (r6 == r0) goto L_0x0032
            r0 = 4
            if (r6 == r0) goto L_0x0087
            java.lang.String r1 = "gdrive-notification-manager/backup-error/unexpected-frequency/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0032:
            int r5 = r3.A0D()
            int r0 = r5 + 1
            int r0 = r0 % r2
            r2 = 1
            if (r0 == 0) goto L_0x0052
            r2 = 0
            java.lang.String r0 = r3.A0M()
            if (r0 == 0) goto L_0x0078
            long r3 = r3.A0H(r0)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r3
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0051
            r7 = 0
        L_0x0051:
            r2 = r7
        L_0x0052:
            java.lang.String r0 = "gdrive-notification-manager/backup-error/frequency="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = X.AnonymousClass2GK.A05(r6)
            r1.append(r0)
            java.lang.String r0 = "/success-backup-fail-count="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "/show-notification="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        L_0x0078:
            java.lang.String r0 = "gdrive-notification-manager/backup-error/google-account-is-null/unexpected"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0052
        L_0x007e:
            r8 = 1209600000(0x48190800, double:5.97621805E-315)
            goto L_0x0032
        L_0x0082:
            r2 = 5
            r8 = 432000000(0x19bfcc00, double:2.13436359E-315)
            goto L_0x0032
        L_0x0087:
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            r2 = 1
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12Q.A07(boolean):boolean");
    }

    public void ALz(boolean z2) {
    }

    public void AND() {
        A03();
    }

    public synchronized void ANE(boolean z2) {
        AnonymousClass04E r6;
        synchronized (this) {
            AtomicReference atomicReference = this.A0Q;
            int intValue = ((Integer) atomicReference.get()).intValue();
            if (intValue != 23) {
                if (z2 || intValue != 15 || !A07(this.A0C)) {
                    atomicReference.set(23);
                }
                Log.i("gdrive-notification-manager/backup-end");
                this.A00 = 0;
                Context context = this.A0J.A00;
                int i2 = R.string.str095a;
                if (z2) {
                    i2 = R.string.str095b;
                }
                String string = context.getString(i2);
                String string2 = context.getString(R.string.str0958);
                if (AnonymousClass2GK.A0K(this.A0N)) {
                    context.registerReceiver(new IDxBReceiverShape6S0100000_1_I0(this, 0), new IntentFilter("clear_backup_worker"));
                    r6 = new AnonymousClass04E(R.drawable.ic_action_cancel, context.getString(R.string.str09e2), A01("clear_backup_worker"));
                } else {
                    r6 = null;
                }
                A06(r6, string, string2, 1, -1, false, true);
            }
        }
    }

    public void ANF() {
    }

    public void ANG() {
    }

    public synchronized void ANH(long j2, long j3) {
    }

    public void ANI(long j2) {
    }

    public synchronized void ANJ(boolean z2) {
    }

    public void ANK(long j2, long j3) {
        Log.i("gdrive-notification-manager/backup-paused-for-data-connection");
        if (((Number) this.A0Q.getAndSet(17)).intValue() != 17) {
            int i2 = j3 > 0 ? (int) ((j2 * 100) / j3) : -1;
            Context context = this.A0J.A00;
            A06((AnonymousClass04E) null, context.getString(R.string.str0965), context.getString(R.string.str097a), 3, i2, false, false);
        }
    }

    public void ANL(long j2, long j3) {
        Log.i("gdrive-notification-manager/backup-paused-for-low-battery");
        if (((Number) this.A0Q.getAndSet(18)).intValue() != 18) {
            if (this.A06 == null) {
                IDxBReceiverShape7S0100000_2_I0 iDxBReceiverShape7S0100000_2_I0 = new IDxBReceiverShape7S0100000_2_I0(this, 2);
                this.A06 = iDxBReceiverShape7S0100000_2_I0;
                this.A0J.A00.registerReceiver(iDxBReceiverShape7S0100000_2_I0, new IntentFilter("enable_backup_over_low_battery"));
            }
            Context context = this.A0J.A00;
            A06(new AnonymousClass04E(R.drawable.ic_action_refresh, context.getString(R.string.str0976), A01("enable_backup_over_low_battery")), context.getString(R.string.str0965), context.getString(R.string.str0979), 3, j3 > 0 ? (int) ((100 * j2) / j3) : -1, false, false);
        }
    }

    public void ANM(long j2, long j3) {
        if (((Number) this.A0Q.getAndSet(20)).intValue() != 20) {
            Log.i("gdrive-notification-manager/backup-paused-for-sdcard-missing");
            int i2 = j3 > 0 ? (int) ((j2 * 100) / j3) : -1;
            Context context = this.A0J.A00;
            A06((AnonymousClass04E) null, context.getString(R.string.str0965), context.getString(R.string.str0d8b), 3, i2, false, false);
        }
    }

    public void ANN(long j2, long j3) {
        if (((Number) this.A0Q.getAndSet(19)).intValue() != 19) {
            Log.i("gdrive-notification-manager/backup-paused-for-sdcard-unmounted");
            int i2 = j3 > 0 ? (int) ((j2 * 100) / j3) : -1;
            Context context = this.A0J.A00;
            A06((AnonymousClass04E) null, context.getString(R.string.str0965), context.getString(R.string.str0d8d), 3, i2, false, false);
        }
    }

    public void ANO(long j2, long j3) {
        if (((Number) this.A0Q.getAndSet(16)).intValue() != 16) {
            Log.i("gdrive-notification-manager/backup-paused-wifi-unavailable");
            if (this.A05 == null) {
                IDxBReceiverShape7S0100000_2_I0 iDxBReceiverShape7S0100000_2_I0 = new IDxBReceiverShape7S0100000_2_I0(this, 1);
                this.A05 = iDxBReceiverShape7S0100000_2_I0;
                this.A0J.A00.registerReceiver(iDxBReceiverShape7S0100000_2_I0, new IntentFilter("enable_backup_over_cellular"));
            }
            AnonymousClass04E r5 = null;
            if (this.A0I.A04(true) == 2) {
                r5 = new AnonymousClass04E(R.drawable.ic_action_refresh, this.A0J.A00.getString(R.string.str0976), A01("enable_backup_over_cellular"));
            }
            int i2 = j3 > 0 ? (int) ((100 * j2) / j3) : -1;
            Context context = this.A0J.A00;
            A06(r5, context.getString(R.string.str0965), context.getString(R.string.str097b), 3, i2, false, false);
        }
    }

    public void ANP(int i2) {
        AtomicReference atomicReference = this.A0Q;
        boolean z2 = false;
        if (((Number) atomicReference.get()).intValue() != 12) {
            z2 = true;
        }
        if (((Number) atomicReference.getAndSet(12)).intValue() != 12 || System.currentTimeMillis() - this.A04 >= 200) {
            this.A04 = System.currentTimeMillis();
            Context context = this.A0J.A00;
            String string = context.getString(R.string.str1cd8);
            int i3 = i2;
            if (i2 >= 0 || z2) {
                A06((AnonymousClass04E) null, string, context.getString(R.string.str0959, new Object[]{this.A0M.A0L().format(((double) i3) / 100.0d)}), 2, -1, true, false);
            }
        }
    }

    public void ANQ() {
        if (((Number) this.A0Q.getAndSet(11)).intValue() != 11) {
            Log.i("gdrive-notification-manager/backup-prep-start");
            Context context = this.A0J.A00;
            A06((AnonymousClass04E) null, context.getString(R.string.str1cd8), context.getString(R.string.str1cd7), 2, -1, true, false);
        }
    }

    public synchronized void ANR(long j2, long j3) {
        synchronized (this) {
            AtomicReference atomicReference = this.A0Q;
            boolean z2 = false;
            if (((Integer) atomicReference.get()).intValue() != 14) {
                z2 = true;
            }
            if (((Integer) atomicReference.getAndSet(14)).intValue() != 14 || System.currentTimeMillis() - this.A04 >= 200) {
                this.A04 = System.currentTimeMillis();
                long j4 = j3;
                long j5 = j2;
                int i2 = j3 > 0 ? (int) ((100 * j2) / j3) : 0;
                if (i2 - this.A00 > 0 || z2) {
                    Log.i(String.format(Locale.ENGLISH, "gdrive-notification-manager/backup-progress %d/%d (%d)", new Object[]{Long.valueOf(j5), Long.valueOf(j4), Integer.valueOf(i2)}));
                    this.A00 = i2;
                    Context context = this.A0J.A00;
                    String string = context.getString(R.string.str1cd8);
                    AnonymousClass013 r7 = this.A0M;
                    String string2 = context.getString(R.string.str1569, new Object[]{AnonymousClass2GQ.A03(r7, j5), AnonymousClass2GQ.A03(r7, j4), r7.A0L().format(((double) i2) / 100.0d)});
                    if (!string2.equals(this.A09)) {
                        A06((AnonymousClass04E) null, string, string2, 3, i2, true, false);
                    }
                }
            }
        }
    }

    public void ANS() {
        this.A0Q.getAndSet(13);
    }

    public void AP4(AnonymousClass1UX r4) {
        this.A0O.Acl(new RunnableRunnableShape3S0100000_I0_2(this, 15));
    }

    public void AQL() {
    }

    public synchronized void AQh(int i2, Bundle bundle) {
        synchronized (this) {
            if (i2 != 10) {
                if (((Integer) this.A0Q.getAndSet(15)).intValue() != 15) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("gdrive-notification-manager/backup-error/");
                    sb.append(AnonymousClass2GK.A04(i2));
                    Log.i(sb.toString());
                    if (A07(this.A0C)) {
                        Context context = this.A0J.A00;
                        A06((AnonymousClass04E) null, context.getString(R.string.str095a), context.getString(R.string.str0958), 1, -1, false, true);
                    }
                }
            }
        }
    }

    public void AQi(int i2, Bundle bundle) {
        if (i2 != 10) {
            if (((Number) this.A0Q.getAndSet(27)).intValue() != 27) {
                StringBuilder sb = new StringBuilder("gdrive-notification-manager/media-restore-error/");
                sb.append(AnonymousClass2GK.A04(i2));
                Log.i(sb.toString());
                Context context = this.A0J.A00;
                A06((AnonymousClass04E) null, context.getString(R.string.str097d), context.getString(R.string.str0958), 1, -1, false, true);
            }
        }
    }

    public void AQj(int i2, Bundle bundle) {
        StringBuilder sb = new StringBuilder("gdrive-notification-manager/msgstore-restore-error/");
        sb.append(AnonymousClass2GK.A04(i2));
        Log.i(sb.toString());
    }

    public void ATQ() {
        A03();
    }

    public void ATR(long j2, boolean z2) {
        if (((Number) this.A0Q.getAndSet(33)).intValue() != 33) {
            StringBuilder sb = new StringBuilder("gdrive-notification-manager/restore-end/");
            sb.append(z2 ? "success" : "failed");
            sb.append(" restored: ");
            sb.append(j2);
            Log.i(sb.toString());
        }
        if (!z2 || j2 != 0) {
            Context context = this.A0J.A00;
            A06((AnonymousClass04E) null, context.getString(R.string.str097e), context.getString(R.string.str0977, new Object[]{AnonymousClass2GQ.A03(this.A0M, j2)}), 1, -1, false, true);
            return;
        }
        A03();
    }

    public void ATS(long j2, long j3) {
        if (((Number) this.A0Q.getAndSet(29)).intValue() != 29) {
            Log.i("gdrive-notification-manager/restore-paused-data-unavailable");
            Context context = this.A0J.A00;
            A06((AnonymousClass04E) null, context.getString(R.string.str097f), context.getString(R.string.str097a), 3, j3 > 0 ? (int) ((j2 * 100) / j3) : -1, false, true);
        }
    }

    public void ATT(long j2, long j3) {
        if (((Number) this.A0Q.getAndSet(30)).intValue() != 30) {
            Log.i("gdrive-notification-manager/restore-paused-for-battery");
            if (this.A08 == null) {
                IDxBReceiverShape7S0100000_2_I0 iDxBReceiverShape7S0100000_2_I0 = new IDxBReceiverShape7S0100000_2_I0(this, 4);
                this.A08 = iDxBReceiverShape7S0100000_2_I0;
                this.A0J.A00.registerReceiver(iDxBReceiverShape7S0100000_2_I0, new IntentFilter("enable_restore_over_low_battery"));
            }
            Context context = this.A0J.A00;
            A06(new AnonymousClass04E(R.drawable.ic_action_refresh, context.getString(R.string.str0976), A01("enable_restore_over_low_battery")), context.getString(R.string.str097f), context.getString(R.string.str0979), 3, j3 > 0 ? (int) ((100 * j2) / j3) : -1, false, true);
        }
    }

    public void ATU(long j2, long j3) {
        if (((Number) this.A0Q.getAndSet(32)).intValue() != 32) {
            Log.i("gdrive-notification-manager/restore-paused-sdcard-missing");
            Context context = this.A0J.A00;
            A06((AnonymousClass04E) null, context.getString(R.string.str097f), context.getString(R.string.str0d8b), 3, j3 > 0 ? (int) ((j2 * 100) / j3) : -1, false, true);
        }
    }

    public void ATV(long j2, long j3) {
        if (((Number) this.A0Q.getAndSet(31)).intValue() != 31) {
            Log.i("gdrive-notification-manager/restore-paused-sdcard-unmounted");
            A03();
            Context context = this.A0J.A00;
            A06((AnonymousClass04E) null, context.getString(R.string.str097f), context.getString(R.string.str0d8d), 3, j3 > 0 ? (int) ((j2 * 100) / j3) : -1, false, true);
        }
    }

    public void ATW(long j2, long j3) {
        if (((Number) this.A0Q.getAndSet(28)).intValue() != 28) {
            Log.i("gdrive-notification-manager/restore-paused-wifi-unavailable");
            if (this.A07 == null) {
                IDxBReceiverShape7S0100000_2_I0 iDxBReceiverShape7S0100000_2_I0 = new IDxBReceiverShape7S0100000_2_I0(this, 3);
                this.A07 = iDxBReceiverShape7S0100000_2_I0;
                this.A0J.A00.registerReceiver(iDxBReceiverShape7S0100000_2_I0, new IntentFilter("enable_restore_over_cellular"));
            }
            AnonymousClass04E r5 = null;
            if (this.A0I.A04(true) == 2) {
                r5 = new AnonymousClass04E(R.drawable.ic_action_refresh, this.A0J.A00.getString(R.string.str0976), A01("enable_restore_over_cellular"));
            }
            Context context = this.A0J.A00;
            A06(r5, context.getString(R.string.str097f), context.getString(R.string.str097b), 3, j3 > 0 ? (int) ((100 * j2) / j3) : -1, false, true);
        }
    }

    public synchronized void ATX(int i2) {
        synchronized (this) {
            Context context = this.A0J.A00;
            String string = context.getString(R.string.str1cda);
            AtomicReference atomicReference = this.A0Q;
            if (((Integer) atomicReference.get()).intValue() != 25 || System.currentTimeMillis() - this.A03 >= 200) {
                this.A03 = System.currentTimeMillis();
                boolean z2 = false;
                if (((Integer) atomicReference.getAndSet(25)).intValue() != 25) {
                    z2 = true;
                }
                int i3 = i2;
                if (i2 > 0 || z2) {
                    A06((AnonymousClass04E) null, string, context.getString(R.string.str097c, new Object[]{this.A0M.A0L().format(((double) i3) / 100.0d)}), 2, i3, true, false);
                }
            }
        }
    }

    public void ATY() {
        Context context = this.A0J.A00;
        String string = context.getString(R.string.str1cda);
        if (((Number) this.A0Q.getAndSet(24)).intValue() != 24) {
            Log.i("gdrive-notification-manager/restore-prep-start");
        }
        A06((AnonymousClass04E) null, string, context.getString(R.string.str1cd9), 2, -1, true, false);
    }

    public synchronized void ATZ(long j2, long j3) {
        synchronized (this) {
            Context context = this.A0J.A00;
            String string = context.getString(R.string.str1cda);
            AtomicReference atomicReference = this.A0Q;
            if (((Integer) atomicReference.get()).intValue() != 26 || System.currentTimeMillis() - this.A04 >= 200) {
                this.A04 = System.currentTimeMillis();
                long j4 = j2;
                long j5 = j3;
                if (((Integer) atomicReference.getAndSet(26)).intValue() != 26) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("gdrive-notification-manager/restore-progress ");
                    sb.append(j4);
                    sb.append("/");
                    sb.append(j5);
                    sb.append(" bytes.");
                    Log.i(sb.toString());
                }
                this.A02 = j3 > 0 ? (int) ((100 * j2) / j3) : -1;
                AnonymousClass013 r4 = this.A0M;
                String string2 = context.getString(R.string.str0978, new Object[]{AnonymousClass2GQ.A03(r4, j4), AnonymousClass2GQ.A03(r4, j5), r4.A0L().format(((double) this.A02) / 100.0d)});
                if (!string2.equals(this.A09)) {
                    A06((AnonymousClass04E) null, string, string2, 3, this.A02, true, false);
                }
            }
        }
    }

    public void ATi(boolean z2) {
    }

    public void ATj(long j2, long j3) {
    }

    public void ATk() {
    }

    public void AWm() {
        if (((Number) this.A0Q.getAndSet(21)).intValue() != 21) {
            Log.i("gdrive-notification-manager/backup-scrub-start");
            Context context = this.A0J.A00;
            A06((AnonymousClass04E) null, context.getString(R.string.str1cd8), context.getString(R.string.str1554), 2, -1, true, false);
        }
    }

    public void AZP() {
    }
}
