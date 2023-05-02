package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.0cz  reason: invalid class name and case insensitive filesystem */
public class C08070cz implements C12580kd, C13110lU {
    public static final String A0A = C06530Wm.A01("SystemFgDispatcher");
    public Context A00;
    public AnonymousClass022 A01;
    public C12590ke A02;
    public AnonymousClass0R5 A03;
    public final C13120lV A04;
    public final AnonymousClass04d A05;
    public final Object A06 = new Object();
    public final Map A07;
    public final Map A08;
    public final Set A09;

    public C08070cz(Context context) {
        this.A00 = context;
        AnonymousClass022 A012 = AnonymousClass022.A01(context);
        this.A01 = A012;
        this.A05 = A012.A06;
        this.A03 = null;
        this.A07 = new LinkedHashMap();
        this.A09 = new HashSet();
        this.A08 = AnonymousClass000.A0x();
        this.A04 = new AnonymousClass0d6(this, A012.A09);
        A012.A03.A02(this);
    }

    public void A00() {
        this.A02 = null;
        synchronized (this.A06) {
            this.A04.reset();
        }
        this.A01.A03.A03(this);
    }

    public void A01(Intent intent) {
        Handler handler;
        C10440h8 r4;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            C06530Wm.A00();
            Log.i(A0A, AnonymousClass000.A0g("Started foreground service ", intent));
            this.A05.A8p(new C10010gR(this, intent.getStringExtra("KEY_WORKSPEC_ID")));
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                C06530Wm.A00();
                Log.i(A0A, AnonymousClass000.A0g("Stopping foreground work for ", intent));
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    AnonymousClass022 r2 = this.A01;
                    r2.A06.A8p(new AnonymousClass0H4(r2, UUID.fromString(stringExtra)));
                    return;
                }
                return;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                C06530Wm.A00();
                Log.i(A0A, "Stopping foreground service");
                C12590ke r0 = this.A02;
                if (r0 != null) {
                    r0.stop();
                    return;
                }
                return;
            } else {
                return;
            }
        }
        int i2 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        AnonymousClass0R5 r22 = new AnonymousClass0R5(stringExtra2, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C06530Wm A002 = C06530Wm.A00();
        String str = A0A;
        StringBuilder A0r = AnonymousClass000.A0r("Notifying with (id:");
        A0r.append(intExtra);
        A0r.append(", workSpecId: ");
        A0r.append(stringExtra2);
        A0r.append(", notificationType :");
        A0r.append(intExtra2);
        A002.A02(str, AnonymousClass000.A0h(")", A0r));
        if (notification != null && this.A02 != null) {
            AnonymousClass0RE r02 = new AnonymousClass0RE(intExtra, notification, intExtra2);
            Map map = this.A07;
            map.put(r22, r02);
            if (this.A03 == null) {
                this.A03 = r22;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.A02;
                handler = systemForegroundService.A01;
                r4 = new C10440h8(notification, systemForegroundService, intExtra, intExtra2);
            } else {
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.A02;
                systemForegroundService2.A01.post(new C10340gy(notification, systemForegroundService2, intExtra));
                if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                    Iterator A0y = AnonymousClass000.A0y(map);
                    while (A0y.hasNext()) {
                        i2 |= ((AnonymousClass0RE) AnonymousClass000.A0z(A0y).getValue()).A00;
                    }
                    AnonymousClass0RE r03 = (AnonymousClass0RE) map.get(this.A03);
                    if (r03 != null) {
                        C12590ke r23 = this.A02;
                        int i3 = r03.A01;
                        Notification notification2 = r03.A02;
                        SystemForegroundService systemForegroundService3 = (SystemForegroundService) r23;
                        handler = systemForegroundService3.A01;
                        r4 = new C10440h8(notification2, systemForegroundService3, i3, i2);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            handler.post(r4);
        }
    }

    public void AMN(List list) {
    }

    public void AMO(List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C007303i r5 = (C007303i) it.next();
                C06530Wm.A00().A02(A0A, AnonymousClass000.A0h(r5.A0J, AnonymousClass000.A0r("Constraints unmet for WorkSpec ")));
                AnonymousClass022 r4 = this.A01;
                r4.A06.A8p(new C10580hM(new AnonymousClass0NV(AnonymousClass0MO.A00(r5)), r4, true));
            }
        }
    }

    public void AQm(AnonymousClass0R5 r8, boolean z2) {
        Map.Entry A0z;
        synchronized (this.A06) {
            C007303i r0 = (C007303i) this.A08.remove(r8);
            if (r0 != null) {
                Set set = this.A09;
                if (set.remove(r0)) {
                    this.A04.Ac9(set);
                }
            }
        }
        Map map = this.A07;
        AnonymousClass0RE r6 = (AnonymousClass0RE) map.remove(r8);
        if (r8.equals(this.A03) && map.size() > 0) {
            Iterator A0y = AnonymousClass000.A0y(map);
            do {
                A0z = AnonymousClass000.A0z(A0y);
            } while (A0y.hasNext());
            this.A03 = (AnonymousClass0R5) A0z.getKey();
            if (this.A02 != null) {
                AnonymousClass0RE r02 = (AnonymousClass0RE) A0z.getValue();
                C12590ke r5 = this.A02;
                int i2 = r02.A01;
                int i3 = r02.A00;
                SystemForegroundService systemForegroundService = (SystemForegroundService) r5;
                systemForegroundService.A01.post(new C10440h8(r02.A02, systemForegroundService, i2, i3));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.A02;
                systemForegroundService2.A01.post(new C10020gS(systemForegroundService2, i2));
            }
        }
        C12590ke r52 = this.A02;
        if (r6 != null && r52 != null) {
            C06530Wm A002 = C06530Wm.A00();
            String str = A0A;
            StringBuilder A0r = AnonymousClass000.A0r("Removing Notification (id: ");
            int i4 = r6.A01;
            A0r.append(i4);
            A0r.append(", workSpecId: ");
            A0r.append(r8);
            A0r.append(", notificationType: ");
            A002.A02(str, AnonymousClass000.A0l(A0r, r6.A00));
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) r52;
            systemForegroundService3.A01.post(new C10020gS(systemForegroundService3, i4));
        }
    }
}
