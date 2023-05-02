package androidx.work.impl.workers;

import X.AnonymousClass000;
import X.AnonymousClass022;
import X.AnonymousClass02Q;
import X.AnonymousClass042;
import X.AnonymousClass04P;
import X.AnonymousClass0KV;
import X.AnonymousClass0M4;
import X.AnonymousClass0M5;
import X.AnonymousClass0SM;
import X.AnonymousClass0TD;
import X.AnonymousClass0WY;
import X.AnonymousClass0XK;
import X.C007203h;
import X.C007303i;
import X.C02900Gd;
import X.C06530Wm;
import X.C07770cR;
import X.C08170dC;
import X.C12100jq;
import X.C12610kg;
import X.C13140lX;
import X.C13360lu;
import X.C18450wi;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class DiagnosticsWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18450wi.A0H(context, 1);
        C18450wi.A0H(workerParameters, 2);
    }

    /* JADX INFO: finally extract failed */
    public AnonymousClass02Q A04() {
        AnonymousClass022 A01 = AnonymousClass022.A01(this.A00);
        C18450wi.A0B(A01);
        WorkDatabase workDatabase = A01.A04;
        C18450wi.A0B(workDatabase);
        C13360lu A0J = workDatabase.A0J();
        C12100jq A0H = workDatabase.A0H();
        C12610kg A0K = workDatabase.A0K();
        C13140lX A0G = workDatabase.A0G();
        C07770cR A00 = AnonymousClass0M4.A00("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        A00.A5Q(1, System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        AnonymousClass0SM r1 = ((C08170dC) A0J).A01;
        r1.A09();
        Cursor A002 = AnonymousClass0M5.A00(r1, A00, false);
        try {
            int A02 = AnonymousClass0WY.A02(A002, "id");
            int A022 = AnonymousClass0WY.A02(A002, "state");
            int A023 = AnonymousClass0WY.A02(A002, "worker_class_name");
            int A024 = AnonymousClass0WY.A02(A002, "input_merger_class_name");
            int A025 = AnonymousClass0WY.A02(A002, "input");
            int A026 = AnonymousClass0WY.A02(A002, "output");
            int A027 = AnonymousClass0WY.A02(A002, "initial_delay");
            int A028 = AnonymousClass0WY.A02(A002, "interval_duration");
            int A029 = AnonymousClass0WY.A02(A002, "flex_duration");
            int A0210 = AnonymousClass0WY.A02(A002, "run_attempt_count");
            int A0211 = AnonymousClass0WY.A02(A002, "backoff_policy");
            int A0212 = AnonymousClass0WY.A02(A002, "backoff_delay_duration");
            int A0213 = AnonymousClass0WY.A02(A002, "last_enqueue_time");
            int A0214 = AnonymousClass0WY.A02(A002, "minimum_retention_duration");
            int A0215 = AnonymousClass0WY.A02(A002, "schedule_requested_at");
            int A0216 = AnonymousClass0WY.A02(A002, "run_in_foreground");
            int A0217 = AnonymousClass0WY.A02(A002, "out_of_quota_policy");
            int A0218 = AnonymousClass0WY.A02(A002, "period_count");
            int A0219 = AnonymousClass0WY.A02(A002, "generation");
            int A0220 = AnonymousClass0WY.A02(A002, "required_network_type");
            int A0221 = AnonymousClass0WY.A02(A002, "requires_charging");
            int A0222 = AnonymousClass0WY.A02(A002, "requires_device_idle");
            int A0223 = AnonymousClass0WY.A02(A002, "requires_battery_not_low");
            int A0224 = AnonymousClass0WY.A02(A002, "requires_storage_not_low");
            int A0225 = AnonymousClass0WY.A02(A002, "trigger_content_update_delay");
            int A0226 = AnonymousClass0WY.A02(A002, "trigger_max_content_delay");
            int A0227 = AnonymousClass0WY.A02(A002, "content_uri_triggers");
            ArrayList A0v = AnonymousClass000.A0v(A002);
            while (A002.moveToNext()) {
                String string = A002.isNull(A02) ? null : A002.getString(A02);
                AnonymousClass0KV A08 = AnonymousClass0XK.A08(A002, A022);
                String string2 = A002.isNull(A023) ? null : A002.getString(A023);
                String string3 = A002.isNull(A024) ? null : A002.getString(A024);
                C007203h A003 = C007203h.A00(A002.isNull(A025) ? null : A002.getBlob(A025));
                C007203h A004 = C007203h.A00(A002.isNull(A026) ? null : A002.getBlob(A026));
                long j2 = A002.getLong(A027);
                long j3 = A002.getLong(A028);
                long j4 = A002.getLong(A029);
                int i2 = A002.getInt(A0210);
                AnonymousClass04P A04 = AnonymousClass0XK.A04(A002.getInt(A0211));
                long j5 = A002.getLong(A0212);
                long j6 = A002.getLong(A0213);
                long j7 = A002.getLong(A0214);
                long j8 = A002.getLong(A0215);
                boolean A1O = AnonymousClass000.A1O(A002.getInt(A0216));
                A0v.add(new C007303i(A04, new AnonymousClass042(AnonymousClass0XK.A05(A002.getInt(A0220)), AnonymousClass0XK.A09(A002.isNull(A0227) ? null : A002.getBlob(A0227)), A002.getLong(A0225), A002.getLong(A0226), AnonymousClass000.A1O(A002.getInt(A0221)), AnonymousClass000.A1O(A002.getInt(A0222)), AnonymousClass000.A1O(A002.getInt(A0223)), AnonymousClass000.A1O(A002.getInt(A0224))), A003, A004, AnonymousClass0XK.A06(A002.getInt(A0217)), A08, string, string2, string3, i2, A002.getInt(A0218), A002.getInt(A0219), j2, j3, j4, j5, j6, j7, j8, A1O));
            }
            A002.close();
            A00.A01();
            List AFe = A0J.AFe();
            List A9r = A0J.A9r(200);
            if (!A0v.isEmpty()) {
                C06530Wm.A00();
                String str = AnonymousClass0TD.A00;
                Log.i(str, "Recently completed work:\n\n");
                C06530Wm.A00();
                Log.i(str, AnonymousClass0TD.A00(A0G, A0H, A0K, A0v));
            }
            if (!AFe.isEmpty()) {
                C06530Wm.A00();
                String str2 = AnonymousClass0TD.A00;
                Log.i(str2, "Running work:\n\n");
                C06530Wm.A00();
                Log.i(str2, AnonymousClass0TD.A00(A0G, A0H, A0K, AFe));
            }
            if (!A9r.isEmpty()) {
                C06530Wm.A00();
                String str3 = AnonymousClass0TD.A00;
                Log.i(str3, "Enqueued work:\n\n");
                C06530Wm.A00();
                Log.i(str3, AnonymousClass0TD.A00(A0G, A0H, A0K, A9r));
            }
            return new C02900Gd(C007203h.A01);
        } catch (Throwable th) {
            A002.close();
            A00.A01();
            throw th;
        }
    }
}
