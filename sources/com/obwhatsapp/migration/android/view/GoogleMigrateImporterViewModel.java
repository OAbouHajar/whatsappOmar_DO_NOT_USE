package com.obwhatsapp.migration.android.view;

import X.AnonymousClass027;
import X.AnonymousClass116;
import X.AnonymousClass19Y;
import X.AnonymousClass1BN;
import X.AnonymousClass1NL;
import X.AnonymousClass1NM;
import X.AnonymousClass1NO;
import X.AnonymousClass5TF;
import X.C003401n;
import X.C102944zm;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C16260sj;
import X.C16980tz;
import X.C18260wP;
import X.C19760yx;
import android.content.Context;
import com.obwhatsapp.migration.android.integration.service.GoogleMigrateService;
import com.whatsapp.util.Log;

public class GoogleMigrateImporterViewModel extends C003401n {
    public AnonymousClass027 A00 = C13690nt.A0O();
    public AnonymousClass027 A01 = C13690nt.A0O();
    public AnonymousClass027 A02 = C13690nt.A0O();
    public AnonymousClass027 A03 = C13690nt.A0O();
    public AnonymousClass027 A04 = C13690nt.A0O();
    public final C18260wP A05;
    public final AnonymousClass19Y A06;
    public final C16980tz A07;
    public final C16260sj A08;
    public final AnonymousClass1NO A09;
    public final AnonymousClass5TF A0A;
    public final AnonymousClass1NL A0B;
    public final C19760yx A0C;
    public final AnonymousClass1BN A0D;
    public final AnonymousClass1NM A0E;
    public final AnonymousClass116 A0F;

    public GoogleMigrateImporterViewModel(C18260wP r3, AnonymousClass19Y r4, C16980tz r5, C16260sj r6, AnonymousClass1NO r7, AnonymousClass1NL r8, C19760yx r9, AnonymousClass1BN r10, AnonymousClass1NM r11, AnonymousClass116 r12) {
        C102944zm r0 = new C102944zm(this);
        this.A0A = r0;
        this.A07 = r5;
        this.A0D = r10;
        this.A0F = r12;
        this.A06 = r4;
        this.A08 = r6;
        this.A0C = r9;
        this.A0B = r8;
        this.A0E = r11;
        this.A05 = r3;
        this.A09 = r7;
        r8.A02(r0);
        int A062 = r7.A06();
        if (A062 == 0) {
            Log.i("GoogleMigrateImporterViewModel/onCreate/REQUEST_FOR_PERMISSION state");
            A07(0);
            return;
        }
        Log.i(C13680ns.A0c(A062, "GoogleMigrateImporterViewModel/onCreate/already has state. Current screen = "));
        A07(A062);
        if (A062 == 2) {
            A08(2);
        } else if (A062 == 3) {
            C13680ns.A1P(this.A03, r7.A05());
            A06();
        } else if (A062 == 18) {
            A05();
        }
    }

    public void A04() {
        this.A0B.A03(this.A0A);
    }

    public void A05() {
        this.A0C.A01();
        A07(18);
        this.A00.A09(C13680ns.A0a());
        this.A09.A0C();
        Context context = this.A07.A00;
        AnonymousClass116 r1 = this.A0F;
        Log.i("GoogleMigrateService/stopImport()");
        r1.A01(context, GoogleMigrateService.class);
    }

    public void A06() {
        AnonymousClass1BN r3 = this.A0D;
        AnonymousClass1NM r2 = this.A0E;
        r3.A05("google_migrate_import_started", (String) null, r2.A00().getString("google_migrate_ios_funnel_id", (String) null), r2.A00().getString("google_migrate_ios_export_duration", (String) null), 0);
        Context context = this.A07.A00;
        AnonymousClass116 r22 = this.A0F;
        Log.i("GoogleMigrateService/startImport()");
        r22.A03(context, C13700nu.A02("com.obwhatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_START_IMPORT"), GoogleMigrateService.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r2 = java.lang.Integer.valueOf(r11);
        r1 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (X.C34901l3.A00(r2, r1.A01()) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
        com.whatsapp.util.Log.i("GoogleMigrateImporterViewModel/currentScreen/post");
        r1.A09(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(int r11) {
        /*
            r10 = this;
            java.lang.String r0 = "GoogleMigrateImporterViewModel/currentScreen/setCurrentScreen: "
            java.lang.String r0 = X.C13680ns.A0c(r11, r0)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "google_migrate_recoverable_error"
            java.lang.String r4 = "unknown"
            r5 = 0
            switch(r11) {
                case 0: goto L_0x004b;
                case 1: goto L_0x0048;
                case 2: goto L_0x0012;
                case 3: goto L_0x0012;
                case 4: goto L_0x004e;
                case 5: goto L_0x0045;
                case 6: goto L_0x0040;
                case 7: goto L_0x0012;
                case 8: goto L_0x0012;
                case 9: goto L_0x0040;
                case 10: goto L_0x003d;
                case 11: goto L_0x003a;
                case 12: goto L_0x0037;
                case 13: goto L_0x0034;
                case 14: goto L_0x0031;
                case 15: goto L_0x002e;
                case 16: goto L_0x002b;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            X.027 r1 = r10.A01
            java.lang.Object r0 = r1.A01()
            boolean r0 = X.C34901l3.A00(r2, r0)
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = "GoogleMigrateImporterViewModel/currentScreen/post"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A09(r2)
        L_0x002a:
            return
        L_0x002b:
            java.lang.String r5 = "encryption_no_connection"
            goto L_0x004d
        L_0x002e:
            java.lang.String r5 = "encryption_timed_out"
            goto L_0x004d
        L_0x0031:
            java.lang.String r5 = "encryption_key_not_found"
            goto L_0x004d
        L_0x0034:
            java.lang.String r5 = "encryption_key_mismatch"
            goto L_0x004d
        L_0x0037:
            java.lang.String r5 = "generic_recoverable"
            goto L_0x004d
        L_0x003a:
            java.lang.String r5 = "jabber_id_not_found"
            goto L_0x004d
        L_0x003d:
            java.lang.String r0 = "google_migrate_cancel_import_dialog"
            goto L_0x004d
        L_0x0040:
            java.lang.String r0 = "google_migrate_unrecoverable_error"
            java.lang.String r5 = "generic_unrecoverable"
            goto L_0x004d
        L_0x0045:
            java.lang.String r0 = "google_migrate_import_complete"
            goto L_0x004d
        L_0x0048:
            java.lang.String r0 = "google_migrate_rejected_permission"
            goto L_0x004d
        L_0x004b:
            java.lang.String r0 = "google_migrate_permission"
        L_0x004d:
            r4 = r0
        L_0x004e:
            X.1NM r3 = r10.A0E
            android.content.SharedPreferences r1 = r3.A00()
            java.lang.String r0 = "google_migrate_ios_funnel_id"
            r2 = 0
            java.lang.String r6 = r1.getString(r0, r2)
            android.content.SharedPreferences r1 = r3.A00()
            java.lang.String r0 = "google_migrate_ios_export_duration"
            java.lang.String r7 = r1.getString(r0, r2)
            X.1BN r3 = r10.A0D
            r8 = 0
            r3.A05(r4, r5, r6, r7, r8)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.migration.android.view.GoogleMigrateImporterViewModel.A07(int):void");
    }

    public void A08(Integer num) {
        int i2 = 2;
        if (num.intValue() != 2) {
            this.A0D.A04("google_migrate_import_complete", "google_migrate_import_complete_next");
            i2 = 8;
        }
        A07(i2);
        this.A00.A09(num);
        this.A09.A0C();
        Context context = this.A07.A00;
        AnonymousClass116 r1 = this.A0F;
        Log.i("GoogleMigrateService/stopImport()");
        r1.A01(context, GoogleMigrateService.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        if (r5.A06.A00() == false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(boolean r6) {
        /*
            r5 = this;
            java.lang.String r2 = "google_migrate_confirm_continue_import"
            X.1BN r1 = r5.A0D
            if (r6 == 0) goto L_0x0057
            java.lang.String r0 = "google_migrate_recoverable_error"
            r1.A03(r0, r2)
            X.027 r1 = r5.A01
            java.lang.Object r0 = r1.A01()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r1.A01()
            int r1 = X.AnonymousClass000.A0D(r0)
            r0 = 6
            if (r1 == r0) goto L_0x0029
            r0 = 9
            if (r1 == r0) goto L_0x0055
            r0 = 11
            if (r1 == r0) goto L_0x0052
            switch(r1) {
                case 13: goto L_0x004f;
                case 14: goto L_0x004c;
                case 15: goto L_0x0049;
                case 16: goto L_0x0046;
                default: goto L_0x0029;
            }
        L_0x0029:
            r4 = 1
        L_0x002a:
            X.0tz r0 = r5.A07
            android.content.Context r3 = r0.A00
            X.116 r2 = r5.A0F
            java.lang.String r0 = "GoogleMigrateService/prepareBeforeRetry()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "com.obwhatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_PREPARE_BEFORE_RETRY"
            android.content.Intent r1 = X.C13700nu.A02(r0)
            java.lang.String r0 = "migration_error_code"
            r1.putExtra(r0, r4)
            java.lang.Class<com.obwhatsapp.migration.android.integration.service.GoogleMigrateService> r0 = com.obwhatsapp.migration.android.integration.service.GoogleMigrateService.class
            r2.A03(r3, r1, r0)
            return
        L_0x0046:
            r4 = 102(0x66, float:1.43E-43)
            goto L_0x002a
        L_0x0049:
            r4 = 103(0x67, float:1.44E-43)
            goto L_0x002a
        L_0x004c:
            r4 = 101(0x65, float:1.42E-43)
            goto L_0x002a
        L_0x004f:
            r4 = 104(0x68, float:1.46E-43)
            goto L_0x002a
        L_0x0052:
            r4 = 301(0x12d, float:4.22E-43)
            goto L_0x002a
        L_0x0055:
            r4 = 2
            goto L_0x002a
        L_0x0057:
            java.lang.String r0 = "google_migrate_cancel_import_dialog"
            r1.A03(r0, r2)
            X.0sj r0 = r5.A08
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x006d
            X.19Y r0 = r5.A06
            boolean r1 = r0.A00()
            r0 = 3
            if (r1 != 0) goto L_0x006e
        L_0x006d:
            r0 = 1
        L_0x006e:
            r5.A07(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.migration.android.view.GoogleMigrateImporterViewModel.A09(boolean):void");
    }
}
