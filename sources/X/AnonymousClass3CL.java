package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3CL  reason: invalid class name */
public class AnonymousClass3CL implements Handler.Callback {
    public static AnonymousClass3CL A0F;
    public static final Status A0G = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status A0H = new Status(4, "The user must be signed in to make this API call.");
    public static final Object A0I = C13690nt.A0Y();
    public long A00 = 10000;
    public C57922sC A01 = null;
    public AnonymousClass3X5 A02;
    public AnonymousClass5UV A03;
    public boolean A04 = false;
    public final Context A05;
    public final Handler A06;
    public final C57892s9 A07;
    public final C88594al A08;
    public final Map A09 = new ConcurrentHashMap(5, 0.75f, 1);
    public final Set A0A = new C003001i(0);
    public final Set A0B = new C003001i(0);
    public final AtomicInteger A0C = new AtomicInteger(1);
    public final AtomicInteger A0D = new AtomicInteger(0);
    public volatile boolean A0E = true;

    public AnonymousClass3CL(Context context, Looper looper, C57892s9 r8) {
        this.A05 = context;
        AnonymousClass3M2 r3 = new AnonymousClass3M2(looper, this);
        this.A06 = r3;
        this.A07 = r8;
        this.A08 = new C88594al(r8);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = C89794cv.A03;
        if (bool == null) {
            boolean z2 = false;
            if (C14320oy.A03() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z2 = true;
            }
            bool = Boolean.valueOf(z2);
            C89794cv.A03 = bool;
        }
        if (bool.booleanValue()) {
            this.A0E = false;
        }
        r3.sendMessage(r3.obtainMessage(6));
    }

    public static Status A00(C15700rh r6, C86834Ui r7) {
        String str = r7.A02.A02;
        String valueOf = String.valueOf(r6);
        StringBuilder A0g = C13690nt.A0g(C13680ns.A06(str) + 63 + valueOf.length());
        A0g.append("API: ");
        A0g.append(str);
        A0g.append(" is not available on this device. Connection failed with: ");
        String A0h = AnonymousClass000.A0h(valueOf, A0g);
        return new Status(r6.A02, r6, A0h, 1, 17);
    }

    public static AnonymousClass3CL A01(Context context) {
        AnonymousClass3CL r3;
        HandlerThread handlerThread;
        synchronized (A0I) {
            r3 = A0F;
            if (r3 == null) {
                synchronized (C90074dS.A07) {
                    handlerThread = C90074dS.A05;
                    if (handlerThread == null) {
                        HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                        C90074dS.A05 = handlerThread2;
                        handlerThread2.start();
                        handlerThread = C90074dS.A05;
                    }
                }
                r3 = new AnonymousClass3CL(context.getApplicationContext(), handlerThread.getLooper(), C57892s9.A00);
                A0F = r3;
            }
        }
        return r3;
    }

    public final C15730rl A02(AnonymousClass2f2 r4) {
        C86834Ui r2 = r4.A06;
        Map map = this.A09;
        C15730rl r1 = (C15730rl) map.get(r2);
        if (r1 == null) {
            r1 = new C15730rl(r4, this);
            map.put(r2, r1);
        }
        if (r1.A04.AcM()) {
            this.A0B.add(r2);
        }
        r1.A03();
        return r1;
    }

    public final void A03() {
        AnonymousClass3X5 r3 = this.A02;
        if (r3 != null) {
            if (r3.A01 > 0 || A06()) {
                AnonymousClass5UV r2 = this.A03;
                if (r2 == null) {
                    r2 = new C57902sA(this.A05, C97834qe.A00);
                    this.A03 = r2;
                }
                r2.AKH(r3);
            }
            this.A02 = null;
        }
    }

    public final void A04(C15700rh r4, int i2) {
        if (!A07(r4, i2)) {
            Handler handler = this.A06;
            handler.sendMessage(handler.obtainMessage(5, i2, 0, r4));
        }
    }

    public final void A05(C57922sC r4) {
        synchronized (A0I) {
            if (this.A01 != r4) {
                this.A01 = r4;
                this.A0A.clear();
            }
            this.A0A.addAll(r4.A01);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = X.C89874d5.A00().A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = r4.A08.A01.get(203400000, -1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A06() {
        /*
            r4 = this;
            boolean r0 = r4.A04
            r3 = 0
            if (r0 != 0) goto L_0x0023
            X.4d5 r0 = X.C89874d5.A00()
            X.3Xd r0 = r0.A00
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0023
        L_0x0011:
            X.4al r0 = r4.A08
            r2 = 203400000(0xc1fa340, float:1.2298041E-31)
            android.util.SparseIntArray r0 = r0.A01
            r1 = -1
            int r0 = r0.get(r2, r1)
            if (r0 == r1) goto L_0x0021
            if (r0 != 0) goto L_0x0023
        L_0x0021:
            r0 = 1
            return r0
        L_0x0023:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CL.A06():boolean");
    }

    public final boolean A07(C15700rh r9, int i2) {
        PendingIntent activity;
        C57892s9 r4 = this.A07;
        Context context = this.A05;
        if (C87844Yw.A00(context)) {
            return false;
        }
        if (r9.A00()) {
            activity = r9.A02;
        } else {
            Intent A012 = r4.A01(context, (String) null, r9.A01);
            if (A012 == null) {
                return false;
            }
            activity = PendingIntent.getActivity(context, 0, A012, C815748w.A00 | 134217728);
        }
        if (activity == null) {
            return false;
        }
        int i3 = r9.A01;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i2);
        intent.putExtra("notify_manager", true);
        r4.A02(PendingIntent.getActivity(context, 0, intent, C815348s.A00 | 134217728), context, i3);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0351, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0394, code lost:
        throw X.AnonymousClass000.A0W(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0169, code lost:
        if (r1.A02 != false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016b, code lost:
        r1.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016e, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r10) {
        /*
            r9 = this;
            int r2 = r10.what
            r8 = 13
            r0 = 300000(0x493e0, double:1.482197E-318)
            java.lang.String r7 = "GoogleApiManager"
            r6 = 17
            r3 = 0
            r4 = 1
            switch(r2) {
                case 1: goto L_0x0322;
                case 2: goto L_0x038d;
                case 3: goto L_0x0302;
                case 4: goto L_0x0352;
                case 5: goto L_0x028e;
                case 6: goto L_0x023e;
                case 7: goto L_0x0236;
                case 8: goto L_0x0352;
                case 9: goto L_0x014e;
                case 10: goto L_0x0214;
                case 11: goto L_0x01bd;
                case 12: goto L_0x0174;
                case 13: goto L_0x0352;
                case 14: goto L_0x016f;
                case 15: goto L_0x0120;
                case 16: goto L_0x00a6;
                case 17: goto L_0x00a2;
                case 18: goto L_0x0020;
                case 19: goto L_0x034f;
                default: goto L_0x0010;
            }
        L_0x0010:
            r0 = 31
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Unknown message id: "
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r2)
            android.util.Log.w(r7, r0)
            return r3
        L_0x0020:
            java.lang.Object r5 = r10.obj
            X.4Lc r5 = (X.C84584Lc) r5
            long r1 = r5.A02
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0050
            int r2 = r5.A00
            X.3Xg[] r1 = new X.C65963Xg[r4]
            X.3Xg r0 = r5.A03
            r1[r3] = r0
            java.util.List r0 = java.util.Arrays.asList(r1)
            X.3X5 r3 = new X.3X5
            r3.<init>(r0, r2)
            X.5UV r2 = r9.A03
            if (r2 != 0) goto L_0x004c
            android.content.Context r1 = r9.A05
            X.4qe r0 = X.C97834qe.A00
            X.2sA r2 = new X.2sA
            r2.<init>(r1, r0)
            r9.A03 = r2
        L_0x004c:
            r2.AKH(r3)
            return r4
        L_0x0050:
            X.3X5 r0 = r9.A02
            if (r0 == 0) goto L_0x006e
            java.util.List r2 = r0.A00
            int r1 = r0.A01
            int r0 = r5.A00
            if (r1 != r0) goto L_0x0066
            if (r2 == 0) goto L_0x0090
            int r1 = r2.size()
            int r0 = r5.A01
            if (r1 < r0) goto L_0x0090
        L_0x0066:
            android.os.Handler r0 = r9.A06
            r0.removeMessages(r6)
            r9.A03()
        L_0x006e:
            X.3X5 r0 = r9.A02
            if (r0 != 0) goto L_0x0351
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            X.3Xg r0 = r5.A03
            r2.add(r0)
            int r1 = r5.A00
            X.3X5 r0 = new X.3X5
            r0.<init>(r2, r1)
            r9.A02 = r0
            android.os.Handler r3 = r9.A06
            android.os.Message r2 = r3.obtainMessage(r6)
            long r0 = r5.A02
            r3.sendMessageDelayed(r2, r0)
            return r4
        L_0x0090:
            X.3X5 r2 = r9.A02
            X.3Xg r1 = r5.A03
            java.util.List r0 = r2.A00
            if (r0 != 0) goto L_0x009e
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()
            r2.A00 = r0
        L_0x009e:
            r0.add(r1)
            goto L_0x006e
        L_0x00a2:
            r9.A03()
            return r4
        L_0x00a6:
            java.lang.Object r2 = r10.obj
            X.4VW r2 = (X.AnonymousClass4VW) r2
            java.util.Map r1 = r9.A09
            X.4Ui r0 = r2.A01
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0351
            X.4Ui r0 = r2.A01
            java.lang.Object r3 = r1.get(r0)
            X.0rl r3 = (X.C15730rl) r3
            java.util.List r0 = r3.A08
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L_0x0351
            X.3CL r0 = r3.A0C
            android.os.Handler r1 = r0.A06
            r0 = 15
            r1.removeMessages(r0, r2)
            r0 = 16
            r1.removeMessages(r0, r2)
            X.3Y2 r7 = r2.A00
            java.util.Queue r6 = r3.A0A
            int r0 = r6.size()
            java.util.ArrayList r5 = X.C13690nt.A0i(r0)
            java.util.Iterator r2 = r6.iterator()
        L_0x00e2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.Object r1 = r2.next()
            X.4bz r1 = (X.C89334bz) r1
            boolean r0 = r1 instanceof X.C65743Wk
            if (r0 == 0) goto L_0x00e2
            r0 = r1
            X.3Wk r0 = (X.C65743Wk) r0
            X.3Y2[] r0 = r0.A06(r3)
            if (r0 == 0) goto L_0x00e2
            boolean r0 = X.AnonymousClass45B.A00(r7, r0)
            if (r0 == 0) goto L_0x00e2
            r5.add(r1)
            goto L_0x00e2
        L_0x0105:
            int r3 = r5.size()
            r2 = 0
        L_0x010a:
            if (r2 >= r3) goto L_0x0351
            java.lang.Object r1 = r5.get(r2)
            X.4bz r1 = (X.C89334bz) r1
            r6.remove(r1)
            X.5BB r0 = new X.5BB
            r0.<init>(r7)
            r1.A04(r0)
            int r2 = r2 + 1
            goto L_0x010a
        L_0x0120:
            java.lang.Object r2 = r10.obj
            X.4VW r2 = (X.AnonymousClass4VW) r2
            java.util.Map r1 = r9.A09
            X.4Ui r0 = r2.A01
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0351
            X.4Ui r0 = r2.A01
            java.lang.Object r1 = r1.get(r0)
            X.0rl r1 = (X.C15730rl) r1
            java.util.List r0 = r1.A08
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0351
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0351
            X.0rn r0 = r1.A04
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x016b
            r1.A00()
            return r4
        L_0x014e:
            java.util.Map r1 = r9.A09
            java.lang.Object r0 = r10.obj
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0351
            java.lang.Object r0 = r10.obj
            java.lang.Object r1 = r1.get(r0)
            X.0rl r1 = (X.C15730rl) r1
            X.3CL r0 = r1.A0C
            android.os.Handler r0 = r0.A06
            X.C13710nw.A00(r0)
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0351
        L_0x016b:
            r1.A03()
            return r4
        L_0x016f:
            java.lang.String r0 = "zaa"
            goto L_0x0390
        L_0x0174:
            java.util.Map r1 = r9.A09
            java.lang.Object r0 = r10.obj
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0351
            java.lang.Object r0 = r10.obj
            java.lang.Object r3 = r1.get(r0)
            X.0rl r3 = (X.C15730rl) r3
            X.3CL r0 = r3.A0C
            android.os.Handler r0 = r0.A06
            X.C13710nw.A00(r0)
            X.0rn r2 = r3.A04
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x0351
            java.util.Map r0 = r3.A09
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0351
            X.38c r1 = r3.A06
            java.util.Map r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01b9
            java.util.Map r0 = r1.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01b9
            java.lang.String r0 = "Timing out service connection."
            X.0rp r2 = (X.C15770rp) r2
            r2.A0S = r0
            r2.A80()
            return r4
        L_0x01b9:
            r3.A02()
            return r4
        L_0x01bd:
            java.util.Map r1 = r9.A09
            java.lang.Object r0 = r10.obj
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0351
            java.lang.Object r0 = r10.obj
            java.lang.Object r5 = r1.get(r0)
            X.0rl r5 = (X.C15730rl) r5
            X.3CL r6 = r5.A0C
            android.os.Handler r2 = r6.A06
            X.C13710nw.A00(r2)
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0351
            r0 = 11
            X.4Ui r1 = r5.A05
            r2.removeMessages(r0, r1)
            r0 = 9
            r2.removeMessages(r0, r1)
            r5.A02 = r3
            X.2s9 r2 = r6.A07
            android.content.Context r1 = r6.A05
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r1 = r2.A00(r1, r0)
            r0 = 18
            if (r1 != r0) goto L_0x020f
            r2 = 21
            java.lang.String r1 = "Connection timed out waiting for Google Play services update to complete."
        L_0x01fb:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r2, r1)
            r5.A08(r0)
            X.0rn r1 = r5.A04
            java.lang.String r0 = "Timing out connection while resuming."
            X.0rp r1 = (X.C15770rp) r1
            r1.A0S = r0
            r1.A80()
            return r4
        L_0x020f:
            r2 = 22
            java.lang.String r1 = "API failed to connect while resuming due to an unknown error."
            goto L_0x01fb
        L_0x0214:
            java.util.Set r3 = r9.A0B
            java.util.Iterator r2 = r3.iterator()
        L_0x021a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0232
            java.lang.Object r1 = r2.next()
            java.util.Map r0 = r9.A09
            java.lang.Object r0 = r0.remove(r1)
            X.0rl r0 = (X.C15730rl) r0
            if (r0 == 0) goto L_0x021a
            r0.A04()
            goto L_0x021a
        L_0x0232:
            r3.clear()
            return r4
        L_0x0236:
            java.lang.Object r0 = r10.obj
            X.2f2 r0 = (X.AnonymousClass2f2) r0
            r9.A02(r0)
            return r4
        L_0x023e:
            android.content.Context r3 = r9.A05
            android.content.Context r2 = r3.getApplicationContext()
            boolean r2 = r2 instanceof android.app.Application
            if (r2 == 0) goto L_0x0351
            android.content.Context r2 = r3.getApplicationContext()
            android.app.Application r2 = (android.app.Application) r2
            X.C13890oF.A00(r2)
            X.0oF r6 = X.C13890oF.A04
            X.4qm r3 = new X.4qm
            r3.<init>(r9)
            monitor-enter(r6)
            java.util.ArrayList r2 = r6.A01     // Catch:{ all -> 0x028b }
            r2.add(r3)     // Catch:{ all -> 0x028b }
            monitor-exit(r6)     // Catch:{ all -> 0x028b }
            java.util.concurrent.atomic.AtomicBoolean r5 = r6.A03
            boolean r2 = r5.get()
            if (r2 != 0) goto L_0x0280
            android.app.ActivityManager$RunningAppProcessInfo r3 = new android.app.ActivityManager$RunningAppProcessInfo
            r3.<init>()
            android.app.ActivityManager.getMyMemoryState(r3)
            boolean r2 = r5.getAndSet(r4)
            if (r2 != 0) goto L_0x0280
            int r3 = r3.importance
            r2 = 100
            if (r3 <= r2) goto L_0x0280
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.A02
            r2.set(r4)
        L_0x0280:
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.A02
            boolean r2 = r2.get()
            if (r2 != 0) goto L_0x0351
            r9.A00 = r0
            return r4
        L_0x028b:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x028b }
            throw r0
        L_0x028e:
            int r3 = r10.arg1
            java.lang.Object r2 = r10.obj
            X.0rh r2 = (X.C15700rh) r2
            java.util.Map r0 = r9.A09
            java.util.Iterator r1 = X.C13680ns.A0q(r0)
        L_0x029a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02e2
            java.lang.Object r5 = r1.next()
            X.0rl r5 = (X.C15730rl) r5
            int r0 = r5.A03
            if (r0 != r3) goto L_0x029a
            int r0 = r2.A01
            if (r0 != r8) goto L_0x02db
            java.lang.String r3 = "CANCELED"
            java.lang.String r2 = r2.A03
            int r0 = X.C13680ns.A06(r3)
            int r1 = X.C13680ns.A06(r2)
            int r0 = r0 + 69
            int r0 = r0 + r1
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Error resolution was canceled by the user, original error message: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ": "
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r6, r1)
        L_0x02d7:
            r5.A08(r0)
            return r4
        L_0x02db:
            X.4Ui r0 = r5.A05
            com.google.android.gms.common.api.Status r0 = A00(r2, r0)
            goto L_0x02d7
        L_0x02e2:
            r0 = 76
            java.lang.StringBuilder r2 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Could not find API instance "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = " while trying to fail enqueued calls."
            r2.append(r0)
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.String r0 = r2.toString()
            android.util.Log.wtf(r7, r0, r1)
            return r4
        L_0x0302:
            java.util.Map r0 = r9.A09
            java.util.Iterator r2 = X.C13680ns.A0q(r0)
        L_0x0308:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0351
            java.lang.Object r1 = r2.next()
            X.0rl r1 = (X.C15730rl) r1
            X.3CL r0 = r1.A0C
            android.os.Handler r0 = r0.A06
            X.C13710nw.A00(r0)
            r0 = 0
            r1.A01 = r0
            r1.A03()
            goto L_0x0308
        L_0x0322:
            java.lang.Object r2 = r10.obj
            boolean r2 = X.AnonymousClass000.A1X(r2)
            if (r4 != r2) goto L_0x032c
            r0 = 10000(0x2710, double:4.9407E-320)
        L_0x032c:
            r9.A00 = r0
            android.os.Handler r6 = r9.A06
            r5 = 12
            r6.removeMessages(r5)
            java.util.Map r0 = r9.A09
            java.util.Iterator r3 = X.C13700nu.A0I(r0)
        L_0x033b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0351
            java.lang.Object r0 = r3.next()
            android.os.Message r2 = r6.obtainMessage(r5, r0)
            long r0 = r9.A00
            r6.sendMessageDelayed(r2, r0)
            goto L_0x033b
        L_0x034f:
            r9.A04 = r3
        L_0x0351:
            return r4
        L_0x0352:
            java.lang.Object r3 = r10.obj
            X.4Ji r3 = (X.C84124Ji) r3
            java.util.Map r1 = r9.A09
            X.2f2 r0 = r3.A01
            X.4Ui r0 = r0.A06
            java.lang.Object r2 = r1.get(r0)
            X.0rl r2 = (X.C15730rl) r2
            if (r2 != 0) goto L_0x036a
            X.2f2 r0 = r3.A01
            X.0rl r2 = r9.A02(r0)
        L_0x036a:
            X.0rn r0 = r2.A04
            boolean r0 = r0.AcM()
            if (r0 == 0) goto L_0x0387
            java.util.concurrent.atomic.AtomicInteger r0 = r9.A0D
            int r1 = r0.get()
            int r0 = r3.A00
            if (r1 == r0) goto L_0x0387
            X.4bz r1 = r3.A02
            com.google.android.gms.common.api.Status r0 = A0G
            r1.A01(r0)
            r2.A04()
            return r4
        L_0x0387:
            X.4bz r0 = r3.A02
            r2.A0A(r0)
            return r4
        L_0x038d:
            java.lang.String r0 = "zab"
        L_0x0390:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CL.handleMessage(android.os.Message):boolean");
    }
}
