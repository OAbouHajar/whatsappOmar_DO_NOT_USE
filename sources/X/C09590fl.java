package X;

import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0fl  reason: invalid class name and case insensitive filesystem */
public class C09590fl implements Runnable {
    public final C08060cy A00;

    public C09590fl(C08060cy r1) {
        this.A00 = r1;
    }

    public void run() {
        boolean A1P;
        boolean A1P2;
        C08060cy r2 = this.A00;
        C06530Wm A002 = C06530Wm.A00();
        String str = C08060cy.A0A;
        A002.A02(str, "Checking if commands are complete.");
        C08060cy.A00();
        List list = r2.A09;
        synchronized (list) {
            if (r2.A00 != null) {
                C06530Wm A003 = C06530Wm.A00();
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("Removing command ");
                A003.A02(str, AnonymousClass000.A0f(r2.A00, A0o));
                if (((Intent) list.remove(0)).equals(r2.A00)) {
                    r2.A00 = null;
                } else {
                    th = AnonymousClass000.A0V("Dequeue-d command is not the first.");
                    throw th;
                }
            }
            C10880hq r5 = ((C08190dE) r2.A08).A01;
            C08050cx r0 = r2.A06;
            synchronized (r0.A02) {
                try {
                    A1P = AnonymousClass000.A1P(r0.A03.isEmpty() ? 1 : 0);
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                        break;
                    }
                }
            }
            if (!A1P) {
                if (list.isEmpty()) {
                    synchronized (r5.A01) {
                        try {
                            A1P2 = AnonymousClass000.A1P(r5.A02.isEmpty() ? 1 : 0);
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                                break;
                            }
                        }
                    }
                    if (!A1P2) {
                        C06530Wm.A00().A02(str, "No more commands & intents.");
                        C12050jl r52 = r2.A02;
                        if (r52 != null) {
                            SystemAlarmService systemAlarmService = (SystemAlarmService) r52;
                            systemAlarmService.A01 = true;
                            C06530Wm.A00().A02(SystemAlarmService.A02, "All commands completed in dispatcher");
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            synchronized (AnonymousClass0TW.A00) {
                                try {
                                    linkedHashMap.putAll(AnonymousClass0TW.A01);
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            Iterator A0y = AnonymousClass000.A0y(linkedHashMap);
                            while (A0y.hasNext()) {
                                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) A0z.getKey();
                                String str2 = (String) A0z.getValue();
                                if (wakeLock != null && wakeLock.isHeld()) {
                                    C06530Wm.A00();
                                    Log.w(AnonymousClass0TC.A00, AnonymousClass000.A0h(str2, AnonymousClass000.A0r("WakeLock held for ")));
                                }
                            }
                            systemAlarmService.stopSelf();
                        }
                    }
                }
            }
            if (!list.isEmpty()) {
                r2.A01();
            }
        }
    }
}
