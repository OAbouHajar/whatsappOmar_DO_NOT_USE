package X;

import android.content.Context;
import com.facebook.redex.IDxFunctionShape361S0100000_2_I0;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.12i  reason: invalid class name and case insensitive filesystem */
public class C209812i implements C16240sh {
    public final C16180sb A00;
    public final C16040sK A01;
    public final C16200sd A02;
    public final C16190sc A03;
    public final AnonymousClass12W A04;
    public final C16980tz A05;
    public final C16260sj A06;
    public final C18790xG A07;
    public final C18250wO A08;
    public final C14710pd A09;
    public final AnonymousClass12X A0A;
    public final C209712h A0B;
    public final C16990u0 A0C;
    public final AnonymousClass12V A0D;

    public C209812i(C16180sb r1, C16040sK r2, C16200sd r3, C16190sc r4, AnonymousClass12W r5, C16980tz r6, C16260sj r7, C18790xG r8, C18250wO r9, C14710pd r10, AnonymousClass12X r11, C209712h r12, C16990u0 r13, AnonymousClass12V r14) {
        this.A09 = r10;
        this.A0D = r14;
        this.A01 = r2;
        this.A05 = r6;
        this.A00 = r1;
        this.A03 = r4;
        this.A07 = r8;
        this.A02 = r3;
        this.A04 = r5;
        this.A06 = r7;
        this.A08 = r9;
        this.A0C = r13;
        this.A0B = r12;
        this.A0A = r11;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0166 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A5J() {
        /*
            r14 = this;
            X.0sd r6 = r14.A02
            X.0tx r11 = X.C40691uX.A06(r6)
            X.0pd r2 = r14.A09
            r1 = 1084(0x43c, float:1.519E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "PaymentBackgroundsBackup/backup/encrypted backgrounds not enabled"
        L_0x0014:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0017:
            r0 = 1
            return r0
        L_0x0019:
            X.0sj r1 = r14.A06
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            boolean r0 = r1.A0F(r0)
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "PaymentBackgroundsBackup/backup/sdcard_unavailable "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0037:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x003a:
            r0 = 0
            return r0
        L_0x003c:
            X.0wO r1 = r14.A08
            java.lang.String r0 = "PAY: PaymentBackgroundStore/getStoredPaymentBackgrounds"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "SELECT payment_background.background_id, file_size, width, height, mime_type, placeholder_color, text_color, subtext_color, media_key, media_key_timestamp, file_sha256, file_enc_sha256, direct_path, fullsize_url, description, lg FROM payment_background"
            java.util.List r5 = r1.A02(r0)
            java.lang.String r0 = "PAY: PaymentBackgroundStore/getStoredPaymentBackgrounds/result size="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r5.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = "PaymentBackgroundsBackup/backup no backgrounds to backup"
            goto L_0x0014
        L_0x0067:
            int r0 = r5.size()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r0)
            r4 = 0
        L_0x0071:
            int r0 = r5.size()
            if (r4 >= r0) goto L_0x00a9
            java.lang.Object r2 = r5.get(r4)
            X.1lo r2 = (X.C35361lo) r2
            X.12h r0 = r14.A0B
            X.0sb r0 = r0.A00
            java.io.File r0 = r0.A0A()
            java.io.File r1 = r2.A02(r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "PaymentBackgroundsBackup/backup/file_not_found for:  "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.A0F
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00a2:
            int r4 = r4 + 1
            goto L_0x0071
        L_0x00a5:
            r3.add(r1)
            goto L_0x00a2
        L_0x00a9:
            X.0tx r0 = X.C16960tx.A08
            if (r11 != r0) goto L_0x00c2
            X.12X r0 = r14.A0A     // Catch:{ IOException -> 0x00b8 }
            X.1XH r1 = r0.A00     // Catch:{ IOException -> 0x00b8 }
            java.lang.String r0 = ""
            java.io.File r13 = r1.A00(r0)     // Catch:{ IOException -> 0x00b8 }
            goto L_0x00dd
        L_0x00b8:
            r1 = move-exception
            java.lang.String r0 = "PaymentBackgroundsBackup/getBackupFile/make temp file failed"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "PaymentBackgroundsBackup/backup/no background backup file"
            goto L_0x0037
        L_0x00c2:
            X.0sc r0 = r14.A03
            java.io.File r2 = r0.A02()
            java.lang.String r0 = "payment_backgrounds.backup.crypt"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r11.version
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r13 = new java.io.File
            r13.<init>(r2, r0)
        L_0x00dd:
            X.0tx r1 = X.C16960tx.A06
            X.0tx r0 = X.C16960tx.A00()
            java.util.List r4 = X.C40691uX.A08(r1, r0)
            X.0sc r0 = r14.A03
            java.io.File r2 = r0.A02()
            java.lang.String r0 = "payment_backgrounds.backup"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            java.util.ArrayList r0 = X.C40691uX.A07(r1, r4)
            X.C40691uX.A0D(r1, r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x00ff:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x011b
            java.lang.Object r1 = r2.next()
            java.io.File r1 = (java.io.File) r1
            boolean r0 = r1.equals(r13)
            if (r0 != 0) goto L_0x00ff
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x00ff
            r1.delete()
            goto L_0x00ff
        L_0x011b:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0125
            java.lang.String r0 = "PaymentBackgroundsBackup/backup no background files found to backup"
            goto L_0x0014
        L_0x0125:
            X.12V r12 = r14.A0D     // Catch:{ Exception -> 0x0167 }
            X.0sK r4 = r14.A01     // Catch:{ Exception -> 0x0167 }
            X.0xG r8 = r14.A07     // Catch:{ Exception -> 0x0167 }
            X.12W r7 = r14.A04     // Catch:{ Exception -> 0x0167 }
            X.0u0 r10 = r14.A0C     // Catch:{ Exception -> 0x0167 }
            X.12X r9 = r14.A0A     // Catch:{ Exception -> 0x0167 }
            r5 = 0
            X.1uz r1 = X.C40951ux.A01(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0167 }
            X.0tz r0 = r14.A05     // Catch:{ Exception -> 0x0167 }
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x0167 }
            X.5Uj r2 = r1.A02(r0)     // Catch:{ Exception -> 0x0167 }
            if (r2 != 0) goto L_0x0147
            java.lang.String r0 = "PaymentBackgroundsBackup/backup failed to create writer"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0160 }
            goto L_0x003a
        L_0x0147:
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x0160 }
        L_0x014b:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0160 }
            if (r0 == 0) goto L_0x015b
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0160 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0160 }
            r2.AiC(r0)     // Catch:{ all -> 0x0160 }
            goto L_0x014b
        L_0x015b:
            r2.close()     // Catch:{ Exception -> 0x0167 }
            goto L_0x0017
        L_0x0160:
            r0 = move-exception
            if (r2 == 0) goto L_0x0166
            r2.close()     // Catch:{ all -> 0x0166 }
        L_0x0166:
            throw r0     // Catch:{ Exception -> 0x0167 }
        L_0x0167:
            r1 = move-exception
            java.lang.String r0 = "sticker-db-storage/backup failed"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209812i.A5J():boolean");
    }

    public String AA3() {
        return "payment-backgrounds";
    }

    public boolean Aca(Context context) {
        boolean z2;
        if (!this.A09.A0E(C16620tM.A02, 1084)) {
            Log.i("PaymentBackgroundsBackup/restore/encrypted backgrounds not enabled");
            return true;
        }
        C16960tx r14 = C16960tx.A06;
        List A082 = C40691uX.A08(r14, C16960tx.A00());
        File file = new File(this.A03.A02(), "payment_backgrounds.backup");
        ArrayList A072 = C40691uX.A07(file, A082);
        C40691uX.A0D(file, A072);
        if (A072.isEmpty()) {
            Log.i("PaymentBackgroundsBackup/restore no backup found");
            return false;
        }
        File file2 = (File) A072.get(0);
        synchronized (this) {
            z2 = true;
            if (!file2.exists()) {
                StringBuilder sb = new StringBuilder();
                sb.append("PaymentBackgroundsBackup/restore/backup-file-not-found ");
                sb.append(file2);
                Log.i(sb.toString());
            } else {
                File A0A2 = this.A00.A0A();
                if (!A0A2.exists()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("PaymentBackgroundsBackup/restore/failed to get internal payment backgrounds folder ");
                    sb2.append(A0A2);
                    Log.e(sb2.toString());
                } else {
                    z2 = false;
                    try {
                        int A012 = C40691uX.A01(file2.getName(), "payment_backgrounds.backup");
                        if (A012 <= 0 || (A012 >= r14.version && (r14 = C16960tx.A02(A012)) == null)) {
                            r14 = C16960tx.A08;
                        }
                        AnonymousClass12V r15 = this.A0D;
                        C16040sK r7 = this.A01;
                        C18790xG r11 = this.A07;
                        z2 = C40951ux.A01(r7, (C40961uy) null, this.A02, this.A04, r11, this.A0A, this.A0C, r14, r15, file2).A05(new IDxFunctionShape361S0100000_2_I0(A0A2, 1), false);
                    } catch (Exception e2) {
                        Log.e("PaymentBackgroundsBackup/restore failed", e2);
                    }
                }
            }
        }
        return z2;
    }
}
