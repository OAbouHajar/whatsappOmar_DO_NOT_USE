package com.facebook.redex;

import X.AnonymousClass0SM;
import X.C02860Fx;

public class IDxIAdapterShape37S0100000_I1 extends C02860Fx {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxIAdapterShape37S0100000_I1(AnonymousClass0SM r1, Object obj, int i2) {
        super(r1);
        this.A01 = i2;
        this.A00 = obj;
    }

    public String A02() {
        switch (this.A01) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x014d, code lost:
        r12.A5Q(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0150, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x016a, code lost:
        r12.A5R(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x016d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r12.A5S(2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A04(X.C13500mT r12, java.lang.Object r13) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x001f;
                case 1: goto L_0x013a;
                case 2: goto L_0x0126;
                case 3: goto L_0x0014;
                case 4: goto L_0x016e;
                case 5: goto L_0x002a;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.0O6 r13 = (X.AnonymousClass0O6) r13
            java.lang.String r1 = r13.A00
            r0 = 1
            r12.A5S(r0, r1)
            java.lang.String r1 = r13.A01
        L_0x000f:
            r0 = 2
            r12.A5S(r0, r1)
            return
        L_0x0014:
            X.0O5 r13 = (X.AnonymousClass0O5) r13
            java.lang.String r1 = r13.A00
            r0 = 1
            r12.A5S(r0, r1)
            java.lang.String r1 = r13.A01
            goto L_0x000f
        L_0x001f:
            X.0O4 r13 = (X.AnonymousClass0O4) r13
            java.lang.String r1 = r13.A01
            r0 = 1
            r12.A5S(r0, r1)
            java.lang.String r1 = r13.A00
            goto L_0x000f
        L_0x002a:
            X.03i r13 = (X.C007303i) r13
            java.lang.String r1 = r13.A0J
            r0 = 1
            r12.A5S(r0, r1)
            X.0KV r0 = r13.A0E
            int r0 = X.AnonymousClass0XK.A03(r0)
            r2 = 2
            long r0 = (long) r0
            r12.A5Q(r2, r0)
            java.lang.String r1 = r13.A0G
            r0 = 3
            r12.A5S(r0, r1)
            java.lang.String r1 = r13.A0F
            r0 = 4
            if (r1 != 0) goto L_0x0121
            r12.A5R(r0)
        L_0x004b:
            X.03h r0 = r13.A0B
            byte[] r1 = X.C007203h.A01(r0)
            r0 = 5
            if (r1 != 0) goto L_0x011c
            r12.A5R(r0)
        L_0x0057:
            X.03h r0 = r13.A0C
            byte[] r1 = X.C007203h.A01(r0)
            r0 = 6
            if (r1 != 0) goto L_0x0117
            r12.A5R(r0)
        L_0x0063:
            r2 = 7
            long r0 = r13.A04
            r12.A5Q(r2, r0)
            r2 = 8
            long r0 = r13.A05
            r12.A5Q(r2, r0)
            r2 = 9
            long r0 = r13.A03
            r12.A5Q(r2, r0)
            r2 = 10
            int r0 = r13.A01
            long r0 = (long) r0
            r12.A5Q(r2, r0)
            X.04P r0 = r13.A09
            int r0 = X.AnonymousClass0XK.A00(r0)
            r2 = 11
            long r0 = (long) r0
            r12.A5Q(r2, r0)
            r2 = 12
            long r0 = r13.A02
            r12.A5Q(r2, r0)
            r2 = 13
            long r0 = r13.A06
            r12.A5Q(r2, r0)
            r2 = 14
            long r0 = r13.A07
            r12.A5Q(r2, r0)
            r2 = 15
            long r0 = r13.A08
            r12.A5Q(r2, r0)
            boolean r0 = r13.A0H
            r2 = 16
            long r0 = (long) r0
            r12.A5Q(r2, r0)
            X.03j r0 = r13.A0D
            int r0 = X.AnonymousClass0XK.A02(r0)
            r2 = 17
            long r0 = (long) r0
            r12.A5Q(r2, r0)
            r2 = 18
            int r0 = r13.A00
            long r0 = (long) r0
            r12.A5Q(r2, r0)
            r2 = 19
            int r0 = r13.A0I
            long r0 = (long) r0
            r12.A5Q(r2, r0)
            X.042 r3 = r13.A0A
            r6 = 26
            r4 = 25
            r5 = 24
            r7 = 23
            r8 = 22
            r9 = 21
            r10 = 20
            r2 = 27
            if (r3 == 0) goto L_0x0155
            X.041 r0 = r3.A02
            int r0 = X.AnonymousClass0XK.A01(r0)
            long r0 = (long) r0
            r12.A5Q(r10, r0)
            boolean r0 = r3.A05
            long r0 = (long) r0
            r12.A5Q(r9, r0)
            boolean r0 = r3.A00()
            long r0 = (long) r0
            r12.A5Q(r8, r0)
            boolean r0 = r3.A04
            long r0 = (long) r0
            r12.A5Q(r7, r0)
            boolean r0 = r3.A07
            long r0 = (long) r0
            r12.A5Q(r5, r0)
            long r0 = r3.A01
            r12.A5Q(r4, r0)
            long r0 = r3.A00
            r12.A5Q(r6, r0)
            java.util.Set r0 = r3.A03
            byte[] r0 = X.AnonymousClass0XK.A0A(r0)
            r12.A5N(r2, r0)
            return
        L_0x0117:
            r12.A5N(r0, r1)
            goto L_0x0063
        L_0x011c:
            r12.A5N(r0, r1)
            goto L_0x0057
        L_0x0121:
            r12.A5S(r0, r1)
            goto L_0x004b
        L_0x0126:
            X.0RF r13 = (X.AnonymousClass0RF) r13
            java.lang.String r1 = r13.A02
            r0 = 1
            r12.A5S(r0, r1)
            r2 = 2
            int r0 = r13.A00
            long r0 = (long) r0
            r12.A5Q(r2, r0)
            r2 = 3
            int r0 = r13.A01
            long r0 = (long) r0
            goto L_0x014d
        L_0x013a:
            X.0R4 r13 = (X.AnonymousClass0R4) r13
            java.lang.String r1 = r13.A01
            r0 = 1
            if (r1 != 0) goto L_0x0151
            r12.A5R(r0)
        L_0x0144:
            java.lang.Long r0 = r13.A00
            r2 = 2
            if (r0 == 0) goto L_0x016a
            long r0 = r0.longValue()
        L_0x014d:
            r12.A5Q(r2, r0)
            return
        L_0x0151:
            r12.A5S(r0, r1)
            goto L_0x0144
        L_0x0155:
            r12.A5R(r10)
            r12.A5R(r9)
            r12.A5R(r8)
            r12.A5R(r7)
            r12.A5R(r5)
            r12.A5R(r4)
            r12.A5R(r6)
        L_0x016a:
            r12.A5R(r2)
            return
        L_0x016e:
            java.lang.String r0 = "getWorkSpecId"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxIAdapterShape37S0100000_I1.A04(X.0mT, java.lang.Object):void");
    }
}
