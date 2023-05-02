package X;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Vf  reason: invalid class name and case insensitive filesystem */
public class C06310Vf {
    public static final String A00 = C06530Wm.A01("Schedulers");

    public static C13220lf A00(Context context, AnonymousClass022 r7) {
        String str;
        if (Build.VERSION.SDK_INT >= 23) {
            AnonymousClass0d2 r2 = new AnonymousClass0d2(context, r7);
            AnonymousClass0TB.A00(context, SystemJobService.class, true);
            C06530Wm.A00().A02(A00, "Created SystemJobScheduler and enabled SystemJobService");
            return r2;
        }
        try {
            C13220lf r22 = (C13220lf) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            C06530Wm A002 = C06530Wm.A00();
            str = A00;
            A002.A02(str, "Created androidx.work.impl.background.gcm.GcmScheduler");
            if (r22 != null) {
                return r22;
            }
        } catch (Throwable th) {
            C06530Wm A003 = C06530Wm.A00();
            str = A00;
            if (A003.A00 <= 3) {
                Log.d(str, "Unable to create GCM Scheduler", th);
            }
        }
        C08090d1 r23 = new C08090d1(context);
        AnonymousClass0TB.A00(context, SystemAlarmService.class, true);
        C06530Wm.A00().A02(str, "Created SystemAlarmScheduler");
        return r23;
    }

    public static void A01(AnonymousClass0Pz r70, WorkDatabase workDatabase, List list) {
        C07770cR A002;
        Cursor A003;
        if (list != null && list.size() != 0) {
            C13360lu A0J = workDatabase.A0J();
            workDatabase.A0A();
            try {
                int A004 = r70.A00();
                A002 = AnonymousClass0M4.A00("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
                A002.A5Q(1, (long) A004);
                AnonymousClass0SM r1 = ((C08170dC) A0J).A01;
                r1.A09();
                A003 = AnonymousClass0M5.A00(r1, A002, false);
                int A02 = AnonymousClass0WY.A02(A003, "id");
                int A022 = AnonymousClass0WY.A02(A003, "state");
                int A023 = AnonymousClass0WY.A02(A003, "worker_class_name");
                int A024 = AnonymousClass0WY.A02(A003, "input_merger_class_name");
                int A025 = AnonymousClass0WY.A02(A003, "input");
                int A026 = AnonymousClass0WY.A02(A003, "output");
                int A027 = AnonymousClass0WY.A02(A003, "initial_delay");
                int A028 = AnonymousClass0WY.A02(A003, "interval_duration");
                int A029 = AnonymousClass0WY.A02(A003, "flex_duration");
                int A0210 = AnonymousClass0WY.A02(A003, "run_attempt_count");
                int A0211 = AnonymousClass0WY.A02(A003, "backoff_policy");
                int A0212 = AnonymousClass0WY.A02(A003, "backoff_delay_duration");
                int A0213 = AnonymousClass0WY.A02(A003, "last_enqueue_time");
                int A0214 = AnonymousClass0WY.A02(A003, "minimum_retention_duration");
                int A0215 = AnonymousClass0WY.A02(A003, "schedule_requested_at");
                int A0216 = AnonymousClass0WY.A02(A003, "run_in_foreground");
                int A0217 = AnonymousClass0WY.A02(A003, "out_of_quota_policy");
                int A0218 = AnonymousClass0WY.A02(A003, "period_count");
                int A0219 = AnonymousClass0WY.A02(A003, "generation");
                int A0220 = AnonymousClass0WY.A02(A003, "required_network_type");
                int A0221 = AnonymousClass0WY.A02(A003, "requires_charging");
                int A0222 = AnonymousClass0WY.A02(A003, "requires_device_idle");
                int A0223 = AnonymousClass0WY.A02(A003, "requires_battery_not_low");
                int A0224 = AnonymousClass0WY.A02(A003, "requires_storage_not_low");
                int A0225 = AnonymousClass0WY.A02(A003, "trigger_content_update_delay");
                int A0226 = AnonymousClass0WY.A02(A003, "trigger_max_content_delay");
                int A0227 = AnonymousClass0WY.A02(A003, "content_uri_triggers");
                ArrayList A0v = AnonymousClass000.A0v(A003);
                while (A003.moveToNext()) {
                    String string = A003.isNull(A02) ? null : A003.getString(A02);
                    AnonymousClass0KV A08 = AnonymousClass0XK.A08(A003, A022);
                    String string2 = A003.isNull(A023) ? null : A003.getString(A023);
                    String string3 = A003.isNull(A024) ? null : A003.getString(A024);
                    C007203h A005 = C007203h.A00(A003.isNull(A025) ? null : A003.getBlob(A025));
                    C007203h A006 = C007203h.A00(A003.isNull(A026) ? null : A003.getBlob(A026));
                    long j2 = A003.getLong(A027);
                    long j3 = A003.getLong(A028);
                    long j4 = A003.getLong(A029);
                    int i2 = A003.getInt(A0210);
                    AnonymousClass04P A04 = AnonymousClass0XK.A04(A003.getInt(A0211));
                    long j5 = A003.getLong(A0212);
                    long j6 = A003.getLong(A0213);
                    long j7 = A003.getLong(A0214);
                    long j8 = A003.getLong(A0215);
                    boolean A1O = AnonymousClass000.A1O(A003.getInt(A0216));
                    A0v.add(new C007303i(A04, new AnonymousClass042(AnonymousClass0XK.A05(A003.getInt(A0220)), AnonymousClass0XK.A09(A003.isNull(A0227) ? null : A003.getBlob(A0227)), A003.getLong(A0225), A003.getLong(A0226), AnonymousClass000.A1O(A003.getInt(A0221)), AnonymousClass000.A1O(A003.getInt(A0222)), AnonymousClass000.A1O(A003.getInt(A0223)), AnonymousClass000.A1O(A003.getInt(A0224))), A005, A006, AnonymousClass0XK.A06(A003.getInt(A0217)), A08, string, string2, string3, i2, A003.getInt(A0218), A003.getInt(A0219), j2, j3, j4, j5, j6, j7, j8, A1O));
                }
                A003.close();
                A002.A01();
                List A9r = A0J.A9r(200);
                if (A0v.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = A0v.iterator();
                    while (it.hasNext()) {
                        A0J.AKf(((C007303i) it.next()).A0J, currentTimeMillis);
                    }
                }
                workDatabase.A0C();
                workDatabase.A0B();
                if (A0v.size() > 0) {
                    C007303i[] r3 = (C007303i[]) A0v.toArray(new C007303i[A0v.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C13220lf r12 = (C13220lf) it2.next();
                        if (r12.AHZ()) {
                            r12.Ad3(r3);
                        }
                    }
                }
                if (A9r.size() > 0) {
                    C007303i[] r32 = (C007303i[]) A9r.toArray(new C007303i[A9r.size()]);
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        C13220lf r13 = (C13220lf) it3.next();
                        if (!r13.AHZ()) {
                            r13.Ad3(r32);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.A0B();
                throw th;
            }
        }
    }
}
