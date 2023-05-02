package X;

import android.database.Cursor;
import com.facebook.redex.IDxIAdapterShape37S0100000_I1;
import com.facebook.redex.IDxLStatementShape38S0100000_I1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0dC  reason: invalid class name and case insensitive filesystem */
public final class C08170dC implements C13360lu {
    public final C02860Fx A00;
    public final AnonymousClass0SM A01;
    public final C05450Rm A02;
    public final C05450Rm A03;
    public final C05450Rm A04;
    public final C05450Rm A05;
    public final C05450Rm A06;
    public final C05450Rm A07;
    public final C05450Rm A08;
    public final C05450Rm A09;
    public final C05450Rm A0A;
    public final C05450Rm A0B;
    public final C05450Rm A0C;
    public final IDxLStatementShape38S0100000_I1 A0D;

    public C08170dC(AnonymousClass0SM r4) {
        this.A01 = r4;
        this.A00 = new IDxIAdapterShape37S0100000_I1(r4, this, 5);
        this.A0D = new IDxLStatementShape38S0100000_I1(r4, this, 8);
        this.A02 = new IDxLStatementShape38S0100000_I1(r4, this, 9);
        this.A0C = new IDxLStatementShape38S0100000_I1(r4, this, 10);
        this.A04 = new IDxLStatementShape38S0100000_I1(r4, this, 11);
        this.A0B = new IDxLStatementShape38S0100000_I1(r4, this, 12);
        this.A0A = new IDxLStatementShape38S0100000_I1(r4, this, 13);
        this.A05 = new IDxLStatementShape38S0100000_I1(r4, this, 14);
        this.A09 = new IDxLStatementShape38S0100000_I1(r4, this, 15);
        this.A06 = new IDxLStatementShape38S0100000_I1(r4, this, 4);
        this.A08 = new IDxLStatementShape38S0100000_I1(r4, this, 5);
        this.A07 = new IDxLStatementShape38S0100000_I1(r4, this, 6);
        this.A03 = new IDxLStatementShape38S0100000_I1(r4, this, 7);
    }

    public final void A00(AnonymousClass00N r9) {
        int i2;
        Set keySet = r9.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (r9.size() > 999) {
            AnonymousClass00N r6 = new AnonymousClass00N(999);
            int size = r9.size();
            int i3 = 0;
            loop0:
            while (true) {
                i2 = 0;
                while (i3 < size) {
                    Object[] objArr = r9.A02;
                    int i4 = i3 << 1;
                    r6.put(objArr[i4], objArr[i4 + 1]);
                    i3++;
                    i2++;
                    if (i2 == 999) {
                        A00(r6);
                        r6 = new AnonymousClass00N(999);
                    }
                }
                break loop0;
            }
            if (i2 > 0) {
                A00(r6);
                return;
            }
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        for (int i5 = 0; i5 < size2; i5++) {
            A0r.append("?");
            if (i5 < size2 - 1) {
                A0r.append(",");
            }
        }
        C07770cR A002 = AnonymousClass0M4.A00(AnonymousClass000.A0h(")", A0r), size2);
        Iterator it = keySet.iterator();
        int i6 = 1;
        while (it.hasNext()) {
            String A0m = AnonymousClass000.A0m(it);
            if (A0m == null) {
                A002.A5R(i6);
            } else {
                A002.A5S(i6, A0m);
            }
            i6++;
        }
        Cursor A003 = AnonymousClass0M5.A00(this.A01, A002, false);
        try {
            int A012 = AnonymousClass0WY.A01(A003, "work_spec_id");
            if (A012 != -1) {
                while (A003.moveToNext()) {
                    ArrayList arrayList = (ArrayList) r9.get(A003.getString(A012));
                    if (arrayList != null) {
                        arrayList.add(C007203h.A00(A003.isNull(0) ? null : A003.getBlob(0)));
                    }
                }
            }
        } finally {
            A003.close();
        }
    }

    public final void A01(AnonymousClass00N r9) {
        int i2;
        Set keySet = r9.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (r9.size() > 999) {
            AnonymousClass00N r6 = new AnonymousClass00N(999);
            int size = r9.size();
            int i3 = 0;
            loop0:
            while (true) {
                i2 = 0;
                while (i3 < size) {
                    Object[] objArr = r9.A02;
                    int i4 = i3 << 1;
                    r6.put(objArr[i4], objArr[i4 + 1]);
                    i3++;
                    i2++;
                    if (i2 == 999) {
                        A01(r6);
                        r6 = new AnonymousClass00N(999);
                    }
                }
                break loop0;
            }
            if (i2 > 0) {
                A01(r6);
                return;
            }
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        for (int i5 = 0; i5 < size2; i5++) {
            A0r.append("?");
            if (i5 < size2 - 1) {
                A0r.append(",");
            }
        }
        C07770cR A002 = AnonymousClass0M4.A00(AnonymousClass000.A0h(")", A0r), size2);
        Iterator it = keySet.iterator();
        int i6 = 1;
        while (it.hasNext()) {
            String A0m = AnonymousClass000.A0m(it);
            if (A0m == null) {
                A002.A5R(i6);
            } else {
                A002.A5S(i6, A0m);
            }
            i6++;
        }
        Cursor A003 = AnonymousClass0M5.A00(this.A01, A002, false);
        try {
            int A012 = AnonymousClass0WY.A01(A003, "work_spec_id");
            if (A012 != -1) {
                while (A003.moveToNext()) {
                    ArrayList arrayList = (ArrayList) r9.get(A003.getString(A012));
                    if (arrayList != null) {
                        arrayList.add(A003.isNull(0) ? null : A003.getString(0));
                    }
                }
            }
        } finally {
            A003.close();
        }
    }

    public List A9r(int i2) {
        C07770cR A002 = AnonymousClass0M4.A00("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        A002.A5Q(1, (long) 200);
        AnonymousClass0SM r1 = this.A01;
        r1.A09();
        Cursor A003 = AnonymousClass0M5.A00(r1, A002, false);
        try {
            int A022 = AnonymousClass0WY.A02(A003, "id");
            int A023 = AnonymousClass0WY.A02(A003, "state");
            int A024 = AnonymousClass0WY.A02(A003, "worker_class_name");
            int A025 = AnonymousClass0WY.A02(A003, "input_merger_class_name");
            int A026 = AnonymousClass0WY.A02(A003, "input");
            int A027 = AnonymousClass0WY.A02(A003, "output");
            int A028 = AnonymousClass0WY.A02(A003, "initial_delay");
            int A029 = AnonymousClass0WY.A02(A003, "interval_duration");
            int A0210 = AnonymousClass0WY.A02(A003, "flex_duration");
            int A0211 = AnonymousClass0WY.A02(A003, "run_attempt_count");
            int A0212 = AnonymousClass0WY.A02(A003, "backoff_policy");
            int A0213 = AnonymousClass0WY.A02(A003, "backoff_delay_duration");
            int A0214 = AnonymousClass0WY.A02(A003, "last_enqueue_time");
            int A0215 = AnonymousClass0WY.A02(A003, "minimum_retention_duration");
            int A0216 = AnonymousClass0WY.A02(A003, "schedule_requested_at");
            int A0217 = AnonymousClass0WY.A02(A003, "run_in_foreground");
            int A0218 = AnonymousClass0WY.A02(A003, "out_of_quota_policy");
            int A0219 = AnonymousClass0WY.A02(A003, "period_count");
            int A0220 = AnonymousClass0WY.A02(A003, "generation");
            int A0221 = AnonymousClass0WY.A02(A003, "required_network_type");
            int A0222 = AnonymousClass0WY.A02(A003, "requires_charging");
            int A0223 = AnonymousClass0WY.A02(A003, "requires_device_idle");
            int A0224 = AnonymousClass0WY.A02(A003, "requires_battery_not_low");
            int A0225 = AnonymousClass0WY.A02(A003, "requires_storage_not_low");
            int A0226 = AnonymousClass0WY.A02(A003, "trigger_content_update_delay");
            int A0227 = AnonymousClass0WY.A02(A003, "trigger_max_content_delay");
            int A0228 = AnonymousClass0WY.A02(A003, "content_uri_triggers");
            ArrayList A0v = AnonymousClass000.A0v(A003);
            while (A003.moveToNext()) {
                String string = A003.isNull(A022) ? null : A003.getString(A022);
                AnonymousClass0KV A082 = AnonymousClass0XK.A08(A003, A023);
                String string2 = A003.isNull(A024) ? null : A003.getString(A024);
                String string3 = A003.isNull(A025) ? null : A003.getString(A025);
                C007203h A004 = C007203h.A00(A003.isNull(A026) ? null : A003.getBlob(A026));
                C007203h A005 = C007203h.A00(A003.isNull(A027) ? null : A003.getBlob(A027));
                long j2 = A003.getLong(A028);
                long j3 = A003.getLong(A029);
                long j4 = A003.getLong(A0210);
                int i3 = A003.getInt(A0211);
                AnonymousClass04P A042 = AnonymousClass0XK.A04(A003.getInt(A0212));
                long j5 = A003.getLong(A0213);
                long j6 = A003.getLong(A0214);
                long j7 = A003.getLong(A0215);
                long j8 = A003.getLong(A0216);
                boolean A1O = AnonymousClass000.A1O(A003.getInt(A0217));
                A0v.add(new C007303i(A042, new AnonymousClass042(AnonymousClass0XK.A05(A003.getInt(A0221)), AnonymousClass0XK.A09(A003.isNull(A0228) ? null : A003.getBlob(A0228)), A003.getLong(A0226), A003.getLong(A0227), AnonymousClass000.A1O(A003.getInt(A0222)), AnonymousClass000.A1O(A003.getInt(A0223)), AnonymousClass000.A1O(A003.getInt(A0224)), AnonymousClass000.A1O(A003.getInt(A0225))), A004, A005, AnonymousClass0XK.A06(A003.getInt(A0218)), A082, string, string2, string3, i3, A003.getInt(A0219), A003.getInt(A0220), j2, j3, j4, j5, j6, j7, j8, A1O));
            }
            return A0v;
        } finally {
            A003.close();
            A002.A01();
        }
    }

    public List AFe() {
        C07770cR A002 = AnonymousClass0M4.A00("SELECT * FROM workspec WHERE state=1", 0);
        AnonymousClass0SM r1 = this.A01;
        r1.A09();
        Cursor A003 = AnonymousClass0M5.A00(r1, A002, false);
        try {
            int A022 = AnonymousClass0WY.A02(A003, "id");
            int A023 = AnonymousClass0WY.A02(A003, "state");
            int A024 = AnonymousClass0WY.A02(A003, "worker_class_name");
            int A025 = AnonymousClass0WY.A02(A003, "input_merger_class_name");
            int A026 = AnonymousClass0WY.A02(A003, "input");
            int A027 = AnonymousClass0WY.A02(A003, "output");
            int A028 = AnonymousClass0WY.A02(A003, "initial_delay");
            int A029 = AnonymousClass0WY.A02(A003, "interval_duration");
            int A0210 = AnonymousClass0WY.A02(A003, "flex_duration");
            int A0211 = AnonymousClass0WY.A02(A003, "run_attempt_count");
            int A0212 = AnonymousClass0WY.A02(A003, "backoff_policy");
            int A0213 = AnonymousClass0WY.A02(A003, "backoff_delay_duration");
            int A0214 = AnonymousClass0WY.A02(A003, "last_enqueue_time");
            int A0215 = AnonymousClass0WY.A02(A003, "minimum_retention_duration");
            int A0216 = AnonymousClass0WY.A02(A003, "schedule_requested_at");
            int A0217 = AnonymousClass0WY.A02(A003, "run_in_foreground");
            int A0218 = AnonymousClass0WY.A02(A003, "out_of_quota_policy");
            int A0219 = AnonymousClass0WY.A02(A003, "period_count");
            int A0220 = AnonymousClass0WY.A02(A003, "generation");
            int A0221 = AnonymousClass0WY.A02(A003, "required_network_type");
            int A0222 = AnonymousClass0WY.A02(A003, "requires_charging");
            int A0223 = AnonymousClass0WY.A02(A003, "requires_device_idle");
            int A0224 = AnonymousClass0WY.A02(A003, "requires_battery_not_low");
            int A0225 = AnonymousClass0WY.A02(A003, "requires_storage_not_low");
            int A0226 = AnonymousClass0WY.A02(A003, "trigger_content_update_delay");
            int A0227 = AnonymousClass0WY.A02(A003, "trigger_max_content_delay");
            int A0228 = AnonymousClass0WY.A02(A003, "content_uri_triggers");
            ArrayList A0v = AnonymousClass000.A0v(A003);
            while (A003.moveToNext()) {
                String string = A003.isNull(A022) ? null : A003.getString(A022);
                AnonymousClass0KV A082 = AnonymousClass0XK.A08(A003, A023);
                String string2 = A003.isNull(A024) ? null : A003.getString(A024);
                String string3 = A003.isNull(A025) ? null : A003.getString(A025);
                C007203h A004 = C007203h.A00(A003.isNull(A026) ? null : A003.getBlob(A026));
                C007203h A005 = C007203h.A00(A003.isNull(A027) ? null : A003.getBlob(A027));
                long j2 = A003.getLong(A028);
                long j3 = A003.getLong(A029);
                long j4 = A003.getLong(A0210);
                int i2 = A003.getInt(A0211);
                AnonymousClass04P A042 = AnonymousClass0XK.A04(A003.getInt(A0212));
                long j5 = A003.getLong(A0213);
                long j6 = A003.getLong(A0214);
                long j7 = A003.getLong(A0215);
                long j8 = A003.getLong(A0216);
                boolean A1O = AnonymousClass000.A1O(A003.getInt(A0217));
                A0v.add(new C007303i(A042, new AnonymousClass042(AnonymousClass0XK.A05(A003.getInt(A0221)), AnonymousClass0XK.A09(A003.isNull(A0228) ? null : A003.getBlob(A0228)), A003.getLong(A0226), A003.getLong(A0227), AnonymousClass000.A1O(A003.getInt(A0222)), AnonymousClass000.A1O(A003.getInt(A0223)), AnonymousClass000.A1O(A003.getInt(A0224)), AnonymousClass000.A1O(A003.getInt(A0225))), A004, A005, AnonymousClass0XK.A06(A003.getInt(A0218)), A082, string, string2, string3, i2, A003.getInt(A0219), A003.getInt(A0220), j2, j3, j4, j5, j6, j7, j8, A1O));
            }
            return A0v;
        } finally {
            A003.close();
            A002.A01();
        }
    }

    public List AFj() {
        C07770cR A002 = AnonymousClass0M4.A00("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        AnonymousClass0SM r1 = this.A01;
        r1.A09();
        Cursor A003 = AnonymousClass0M5.A00(r1, A002, false);
        try {
            int A022 = AnonymousClass0WY.A02(A003, "id");
            int A023 = AnonymousClass0WY.A02(A003, "state");
            int A024 = AnonymousClass0WY.A02(A003, "worker_class_name");
            int A025 = AnonymousClass0WY.A02(A003, "input_merger_class_name");
            int A026 = AnonymousClass0WY.A02(A003, "input");
            int A027 = AnonymousClass0WY.A02(A003, "output");
            int A028 = AnonymousClass0WY.A02(A003, "initial_delay");
            int A029 = AnonymousClass0WY.A02(A003, "interval_duration");
            int A0210 = AnonymousClass0WY.A02(A003, "flex_duration");
            int A0211 = AnonymousClass0WY.A02(A003, "run_attempt_count");
            int A0212 = AnonymousClass0WY.A02(A003, "backoff_policy");
            int A0213 = AnonymousClass0WY.A02(A003, "backoff_delay_duration");
            int A0214 = AnonymousClass0WY.A02(A003, "last_enqueue_time");
            int A0215 = AnonymousClass0WY.A02(A003, "minimum_retention_duration");
            int A0216 = AnonymousClass0WY.A02(A003, "schedule_requested_at");
            int A0217 = AnonymousClass0WY.A02(A003, "run_in_foreground");
            int A0218 = AnonymousClass0WY.A02(A003, "out_of_quota_policy");
            int A0219 = AnonymousClass0WY.A02(A003, "period_count");
            int A0220 = AnonymousClass0WY.A02(A003, "generation");
            int A0221 = AnonymousClass0WY.A02(A003, "required_network_type");
            int A0222 = AnonymousClass0WY.A02(A003, "requires_charging");
            int A0223 = AnonymousClass0WY.A02(A003, "requires_device_idle");
            int A0224 = AnonymousClass0WY.A02(A003, "requires_battery_not_low");
            int A0225 = AnonymousClass0WY.A02(A003, "requires_storage_not_low");
            int A0226 = AnonymousClass0WY.A02(A003, "trigger_content_update_delay");
            int A0227 = AnonymousClass0WY.A02(A003, "trigger_max_content_delay");
            int A0228 = AnonymousClass0WY.A02(A003, "content_uri_triggers");
            ArrayList A0v = AnonymousClass000.A0v(A003);
            while (A003.moveToNext()) {
                String string = A003.isNull(A022) ? null : A003.getString(A022);
                AnonymousClass0KV A082 = AnonymousClass0XK.A08(A003, A023);
                String string2 = A003.isNull(A024) ? null : A003.getString(A024);
                String string3 = A003.isNull(A025) ? null : A003.getString(A025);
                C007203h A004 = C007203h.A00(A003.isNull(A026) ? null : A003.getBlob(A026));
                C007203h A005 = C007203h.A00(A003.isNull(A027) ? null : A003.getBlob(A027));
                long j2 = A003.getLong(A028);
                long j3 = A003.getLong(A029);
                long j4 = A003.getLong(A0210);
                int i2 = A003.getInt(A0211);
                AnonymousClass04P A042 = AnonymousClass0XK.A04(A003.getInt(A0212));
                long j5 = A003.getLong(A0213);
                long j6 = A003.getLong(A0214);
                long j7 = A003.getLong(A0215);
                long j8 = A003.getLong(A0216);
                boolean A1O = AnonymousClass000.A1O(A003.getInt(A0217));
                A0v.add(new C007303i(A042, new AnonymousClass042(AnonymousClass0XK.A05(A003.getInt(A0221)), AnonymousClass0XK.A09(A003.isNull(A0228) ? null : A003.getBlob(A0228)), A003.getLong(A0226), A003.getLong(A0227), AnonymousClass000.A1O(A003.getInt(A0222)), AnonymousClass000.A1O(A003.getInt(A0223)), AnonymousClass000.A1O(A003.getInt(A0224)), AnonymousClass000.A1O(A003.getInt(A0225))), A004, A005, AnonymousClass0XK.A06(A003.getInt(A0218)), A082, string, string2, string3, i2, A003.getInt(A0219), A003.getInt(A0220), j2, j3, j4, j5, j6, j7, j8, A1O));
            }
            return A0v;
        } finally {
            A003.close();
            A002.A01();
        }
    }

    public AnonymousClass0KV AGF(String str) {
        C07770cR A012 = AnonymousClass0M4.A01("SELECT state FROM workspec WHERE id=?", str);
        AnonymousClass0SM r0 = this.A01;
        r0.A09();
        AnonymousClass0KV r2 = null;
        Cursor A002 = AnonymousClass0M5.A00(r0, A012, false);
        try {
            if (A002.moveToFirst() && !A002.isNull(0)) {
                r2 = AnonymousClass0XK.A08(A002, 0);
            }
            return r2;
        } finally {
            A002.close();
            A012.A01();
        }
    }

    public C007303i AH8(String str) {
        C007303i r30;
        C07770cR A012 = AnonymousClass0M4.A01("SELECT * FROM workspec WHERE id=?", str);
        AnonymousClass0SM r2 = this.A01;
        r2.A09();
        Cursor A002 = AnonymousClass0M5.A00(r2, A012, false);
        try {
            int A022 = AnonymousClass0WY.A02(A002, "id");
            int A023 = AnonymousClass0WY.A02(A002, "state");
            int A024 = AnonymousClass0WY.A02(A002, "worker_class_name");
            int A025 = AnonymousClass0WY.A02(A002, "input_merger_class_name");
            int A026 = AnonymousClass0WY.A02(A002, "input");
            int A027 = AnonymousClass0WY.A02(A002, "output");
            int A028 = AnonymousClass0WY.A02(A002, "initial_delay");
            int A029 = AnonymousClass0WY.A02(A002, "interval_duration");
            int A0210 = AnonymousClass0WY.A02(A002, "flex_duration");
            int A0211 = AnonymousClass0WY.A02(A002, "run_attempt_count");
            int A0212 = AnonymousClass0WY.A02(A002, "backoff_policy");
            int A0213 = AnonymousClass0WY.A02(A002, "backoff_delay_duration");
            int A0214 = AnonymousClass0WY.A02(A002, "last_enqueue_time");
            int A0215 = AnonymousClass0WY.A02(A002, "minimum_retention_duration");
            int A0216 = AnonymousClass0WY.A02(A002, "schedule_requested_at");
            int A0217 = AnonymousClass0WY.A02(A002, "run_in_foreground");
            int A0218 = AnonymousClass0WY.A02(A002, "out_of_quota_policy");
            int A0219 = AnonymousClass0WY.A02(A002, "period_count");
            int A0220 = AnonymousClass0WY.A02(A002, "generation");
            int A0221 = AnonymousClass0WY.A02(A002, "required_network_type");
            int A0222 = AnonymousClass0WY.A02(A002, "requires_charging");
            int A0223 = AnonymousClass0WY.A02(A002, "requires_device_idle");
            int A0224 = AnonymousClass0WY.A02(A002, "requires_battery_not_low");
            int A0225 = AnonymousClass0WY.A02(A002, "requires_storage_not_low");
            int A0226 = AnonymousClass0WY.A02(A002, "trigger_content_update_delay");
            int A0227 = AnonymousClass0WY.A02(A002, "trigger_max_content_delay");
            int A0228 = AnonymousClass0WY.A02(A002, "content_uri_triggers");
            if (A002.moveToFirst()) {
                String string = A002.isNull(A022) ? null : A002.getString(A022);
                AnonymousClass0KV A082 = AnonymousClass0XK.A08(A002, A023);
                String string2 = A002.isNull(A024) ? null : A002.getString(A024);
                String string3 = A002.isNull(A025) ? null : A002.getString(A025);
                C007203h A003 = C007203h.A00(A002.isNull(A026) ? null : A002.getBlob(A026));
                C007203h A004 = C007203h.A00(A002.isNull(A027) ? null : A002.getBlob(A027));
                long j2 = A002.getLong(A028);
                long j3 = A002.getLong(A029);
                long j4 = A002.getLong(A0210);
                int i2 = A002.getInt(A0211);
                AnonymousClass04P A042 = AnonymousClass0XK.A04(A002.getInt(A0212));
                long j5 = A002.getLong(A0213);
                long j6 = A002.getLong(A0214);
                long j7 = A002.getLong(A0215);
                long j8 = A002.getLong(A0216);
                boolean A1O = AnonymousClass000.A1O(A002.getInt(A0217));
                r30 = new C007303i(A042, new AnonymousClass042(AnonymousClass0XK.A05(A002.getInt(A0221)), AnonymousClass0XK.A09(A002.isNull(A0228) ? null : A002.getBlob(A0228)), A002.getLong(A0226), A002.getLong(A0227), AnonymousClass000.A1O(A002.getInt(A0222)), AnonymousClass000.A1O(A002.getInt(A0223)), AnonymousClass000.A1O(A002.getInt(A0224)), AnonymousClass000.A1O(A002.getInt(A0225))), A003, A004, AnonymousClass0XK.A06(A002.getInt(A0218)), A082, string, string2, string3, i2, A002.getInt(A0219), A002.getInt(A0220), j2, j3, j4, j5, j6, j7, j8, A1O);
            } else {
                r30 = null;
            }
            return r30;
        } finally {
            A002.close();
            A012.A01();
        }
    }

    public int AKf(String str, long j2) {
        AnonymousClass0SM r3 = this.A01;
        r3.A09();
        C05450Rm r2 = this.A06;
        C13500mT A002 = r2.A00();
        AnonymousClass000.A16(A002, str, j2);
        r3.A0A();
        try {
            int executeUpdateDelete = ((AnonymousClass0GC) A002).A00.executeUpdateDelete();
            r3.A0C();
            return executeUpdateDelete;
        } finally {
            r3.A0B();
            r2.A03(A002);
        }
    }

    public void AeF(C007203h r6, String str) {
        AnonymousClass0SM r4 = this.A01;
        r4.A09();
        C05450Rm r3 = this.A0B;
        C13500mT A002 = r3.A00();
        byte[] A012 = C007203h.A01(r6);
        if (A012 == null) {
            A002.A5R(1);
        } else {
            A002.A5N(1, A012);
        }
        A002.A5S(2, str);
        r4.A0A();
        try {
            AnonymousClass0GC.A00(r4, A002);
        } finally {
            r4.A0B();
            r3.A03(A002);
        }
    }

    public int Aeh(AnonymousClass0KV r6, String str) {
        AnonymousClass0SM r4 = this.A01;
        r4.A09();
        C05450Rm r3 = this.A0C;
        C13500mT A002 = r3.A00();
        AnonymousClass000.A16(A002, str, (long) AnonymousClass0XK.A03(r6));
        r4.A0A();
        try {
            int executeUpdateDelete = ((AnonymousClass0GC) A002).A00.executeUpdateDelete();
            r4.A0C();
            return executeUpdateDelete;
        } finally {
            r4.A0B();
            r3.A03(A002);
        }
    }
}
