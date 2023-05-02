package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.13S  reason: invalid class name */
public class AnonymousClass13S {
    public C35051lI A00;
    public final C16180sb A01;
    public final C16440t3 A02;
    public final C15860rz A03;
    public final C18230wM A04;

    public AnonymousClass13S(C16180sb r1, C16440t3 r2, C15860rz r3, C18230wM r4) {
        this.A02 = r2;
        this.A01 = r1;
        this.A04 = r4;
        this.A03 = r3;
    }

    public synchronized int A00() {
        return ((SharedPreferences) this.A03.A01.get()).getInt("business_activity_report_state", 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0085, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.C35051lI A01() {
        /*
            r19 = this;
            r0 = r19
            monitor-enter(r0)
            X.1lI r6 = r0.A00     // Catch:{ all -> 0x0086 }
            if (r6 != 0) goto L_0x0084
            X.0rz r6 = r0.A03     // Catch:{ all -> 0x0086 }
            X.01D r4 = r6.A01     // Catch:{ all -> 0x0086 }
            java.lang.Object r3 = r4.get()     // Catch:{ all -> 0x0086 }
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "business_activity_report_url"
            r2 = 0
            java.lang.String r7 = r3.getString(r1, r2)     // Catch:{ all -> 0x0086 }
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0020
            monitor-exit(r0)
            return r2
        L_0x0020:
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x0086 }
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5     // Catch:{ all -> 0x0086 }
            java.lang.String r3 = "business_activity_report_size"
            r1 = 0
            long r13 = r5.getLong(r3, r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r3 = "business_activity_report_timestamp"
            long r15 = r6.A0J(r3)     // Catch:{ all -> 0x0086 }
            java.lang.Object r5 = r4.get()     // Catch:{ all -> 0x0086 }
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5     // Catch:{ all -> 0x0086 }
            java.lang.String r3 = "business_activity_report_expiration_timestamp"
            long r17 = r5.getLong(r3, r1)     // Catch:{ all -> 0x0086 }
            java.lang.Object r2 = r4.get()     // Catch:{ all -> 0x0086 }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "business_activity_report_direct_url"
            r3 = 0
            java.lang.String r8 = r2.getString(r1, r3)     // Catch:{ all -> 0x0086 }
            java.lang.Object r2 = r4.get()     // Catch:{ all -> 0x0086 }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "business_activity_report_name"
            java.lang.String r9 = r2.getString(r1, r3)     // Catch:{ all -> 0x0086 }
            java.lang.Object r2 = r4.get()     // Catch:{ all -> 0x0086 }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "business_activity_report_media_key"
            java.lang.String r10 = r2.getString(r1, r3)     // Catch:{ all -> 0x0086 }
            java.lang.Object r2 = r4.get()     // Catch:{ all -> 0x0086 }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "business_activity_report_file_sha"
            java.lang.String r11 = r2.getString(r1, r3)     // Catch:{ all -> 0x0086 }
            java.lang.Object r2 = r4.get()     // Catch:{ all -> 0x0086 }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "business_activity_report_file_enc_sha"
            java.lang.String r12 = r2.getString(r1, r3)     // Catch:{ all -> 0x0086 }
            X.1lI r6 = new X.1lI     // Catch:{ all -> 0x0086 }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15, r17)     // Catch:{ all -> 0x0086 }
            r0.A00 = r6     // Catch:{ all -> 0x0086 }
        L_0x0084:
            monitor-exit(r0)
            return r6
        L_0x0086:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass13S.A01():X.1lI");
    }

    public synchronized void A02() {
        Log.i("BusinessActivityReportManager/reset");
        this.A00 = null;
        C16180sb r2 = this.A01;
        File A06 = r2.A06();
        if (A06.exists() && !A06.delete()) {
            Log.e("BusinessActivityReportManager/reset/failed-delete-report-file");
        }
        AnonymousClass1XI.A0E(r2.A08(), 0);
        this.A03.A0Z();
    }

    public synchronized void A03(C35051lI r6) {
        this.A00 = r6;
        C15860rz r3 = this.A03;
        r3.A0K().putString("business_activity_report_url", r6.A08).apply();
        r3.A0K().putString("business_activity_report_name", r6.A06).apply();
        r3.A0K().putLong("business_activity_report_size", r6.A02).apply();
        r3.A0K().putLong("business_activity_report_expiration_timestamp", r6.A01).apply();
        r3.A0K().putString("business_activity_report_direct_url", r6.A03).apply();
        r3.A0K().putString("business_activity_report_media_key", r6.A07).apply();
        r3.A0K().putString("business_activity_report_file_sha", r6.A05).apply();
        r3.A0K().putString("business_activity_report_file_enc_sha", r6.A04).apply();
        r3.A14("business_activity_report_timestamp", r6.A00);
        r3.A0f(2);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0041 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A04(X.AnonymousClass2F9 r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            X.0sb r3 = r4.A01     // Catch:{ all -> 0x0052 }
            java.io.File r2 = r3.A08()     // Catch:{ all -> 0x0052 }
            r0 = 0
            X.AnonymousClass1XI.A0E(r2, r0)     // Catch:{ all -> 0x0052 }
            java.io.File r0 = r3.A06()     // Catch:{ all -> 0x0052 }
            java.io.File r3 = r3.A0J(r6)     // Catch:{ all -> 0x0052 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0047 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0047 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0042 }
            r1.<init>(r3)     // Catch:{ all -> 0x0042 }
            X.AnonymousClass1XI.A0H(r2, r1)     // Catch:{ all -> 0x003d }
            r1.close()     // Catch:{ all -> 0x0042 }
            r2.close()     // Catch:{ IOException -> 0x0047 }
            X.0t3 r0 = r4.A02     // Catch:{ all -> 0x0052 }
            long r0 = r0.A00()     // Catch:{ all -> 0x0052 }
            boolean r0 = r3.setLastModified(r0)     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "BusinessActivityReportManager/prepare-report-for-export/failed to update report file"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0052 }
            goto L_0x004d
        L_0x0039:
            r5.AVj(r6)     // Catch:{ all -> 0x0052 }
            goto L_0x0050
        L_0x003d:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r0     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            r1 = move-exception
            java.lang.String r0 = "BusinessActivityReportManager/prepare-report-for-export/can't prepare report file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0052 }
        L_0x004d:
            r5.AQQ()     // Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r4)
            return
        L_0x0052:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass13S.A04(X.2F9, java.lang.String):void");
    }
}
