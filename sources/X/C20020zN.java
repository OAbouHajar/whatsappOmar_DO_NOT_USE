package X;

import android.content.SharedPreferences;
import com.facebook.redex.RunnableRunnableShape8S0100000_I0_7;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.0zN  reason: invalid class name and case insensitive filesystem */
public class C20020zN implements C19400yN {
    public final C16570tH A00;
    public final C16300so A01;
    public final C18900xR A02;
    public final C15900s5 A03;
    public final AnonymousClass01V A04;
    public final C16980tz A05;
    public final C15860rz A06;
    public final C14710pd A07;
    public final C17020u3 A08;
    public final C16320sq A09;
    public volatile C19870z8 A0A;

    public C20020zN(C16570tH r1, C16300so r2, C18900xR r3, C15900s5 r4, AnonymousClass01V r5, C16980tz r6, C15860rz r7, C14710pd r8, C17020u3 r9, C16320sq r10) {
        this.A07 = r8;
        this.A05 = r6;
        this.A09 = r10;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = r7;
        this.A08 = r9;
        this.A00 = r1;
    }

    public File A00() {
        File file = new File(this.A05.A00.getFilesDir(), "crash_in_video_sentinel");
        if (!file.createNewFile()) {
            StringBuilder sb = new StringBuilder("mediatranscodequeue/failed-to-create/");
            sb.append(file.getAbsolutePath());
            Log.w(sb.toString());
        }
        return file;
    }

    public void A01() {
        File file = new File(this.A05.A00.getFilesDir(), "crash_in_video_sentinel");
        if (file.exists() && !file.delete()) {
            Log.w("crashlogs/failed-delete-crash-sentinel-file");
        }
    }

    public void A02() {
        C14710pd r1 = this.A07;
        C19870z8 r2 = this.A0A;
        r1.A02(1360);
        StringBuilder sb = new StringBuilder("OOM/WhatsAppWorkers state: ");
        sb.append(C23291Bk.A05.toString());
        Log.i(sb.toString());
        if (r2 != null) {
            r2.A00();
        }
        Log.i("OOMHandler/hprof dump not allowed");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0076 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00fe */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r12 = this;
            X.0s5 r7 = r12.A03
            X.0s8 r0 = X.C15910s6.A0C
            boolean r0 = r7.A05(r0)
            if (r0 == 0) goto L_0x019c
            X.0tz r0 = r12.A05
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "crash_counter"
            java.io.File r9 = new java.io.File
            r9.<init>(r1, r0)
            java.lang.String r6 = " Crashes count background: "
            java.lang.String r4 = "ab-props-backup"
            r0 = 2
            int[] r5 = new int[r0]
            r11 = 1
            r3 = 0
            boolean r0 = r9.exists()     // Catch:{ Exception -> 0x00ff }
            java.lang.String r2 = ","
            if (r0 != 0) goto L_0x004b
            r9.createNewFile()     // Catch:{ Exception -> 0x00ff }
        L_0x002d:
            X.0tH r0 = r12.A00     // Catch:{ Exception -> 0x00ff }
            boolean r0 = r0.A00     // Catch:{ Exception -> 0x00ff }
            if (r0 == 0) goto L_0x0044
            r0 = r5[r3]     // Catch:{ Exception -> 0x00ff }
            int r0 = r0 + 1
            r5[r3] = r0     // Catch:{ Exception -> 0x00ff }
        L_0x0039:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00ff }
            r0.<init>(r9)     // Catch:{ Exception -> 0x00ff }
            java.io.ObjectOutputStream r8 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x00ff }
            r8.<init>(r0)     // Catch:{ Exception -> 0x00ff }
            goto L_0x007e
        L_0x0044:
            r0 = r5[r11]     // Catch:{ Exception -> 0x00ff }
            int r0 = r0 + 1
            r5[r11] = r0     // Catch:{ Exception -> 0x00ff }
            goto L_0x0039
        L_0x004b:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0077 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x0077 }
            java.io.ObjectInputStream r10 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0077 }
            r10.<init>(r0)     // Catch:{ Exception -> 0x0077 }
            java.lang.Object r0 = r10.readObject()     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0072 }
            java.lang.String[] r8 = r0.split(r2)     // Catch:{ all -> 0x0072 }
            r1 = 0
        L_0x0060:
            int r0 = r8.length     // Catch:{ all -> 0x0072 }
            if (r1 >= r0) goto L_0x006e
            r0 = r8[r1]     // Catch:{ all -> 0x0072 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0072 }
            r5[r1] = r0     // Catch:{ all -> 0x0072 }
            int r1 = r1 + 1
            goto L_0x0060
        L_0x006e:
            r10.close()     // Catch:{ Exception -> 0x0077 }
            goto L_0x002d
        L_0x0072:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0076 }
        L_0x0076:
            throw r0     // Catch:{ Exception -> 0x0077 }
        L_0x0077:
            r1 = move-exception
            java.lang.String r0 = "Unable to read from crash counter file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x00ff }
            goto L_0x002d
        L_0x007e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            r1.<init>()     // Catch:{ all -> 0x00fa }
            r0 = r5[r3]     // Catch:{ all -> 0x00fa }
            r1.append(r0)     // Catch:{ all -> 0x00fa }
            r1.append(r2)     // Catch:{ all -> 0x00fa }
            r0 = r5[r11]     // Catch:{ all -> 0x00fa }
            r1.append(r0)     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00fa }
            r8.writeObject(r0)     // Catch:{ all -> 0x00fa }
            r8.close()     // Catch:{ Exception -> 0x00ff }
            X.0u3 r0 = r12.A08     // Catch:{ Exception -> 0x00ff }
            boolean r0 = r0.A01()     // Catch:{ Exception -> 0x00ff }
            if (r0 == 0) goto L_0x0105
            r1 = r5[r3]     // Catch:{ Exception -> 0x00ff }
            X.0tC r0 = X.C15910s6.A17     // Catch:{ Exception -> 0x00ff }
            int r0 = r7.A02(r0)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r9 = "Crashes count foreground: "
            if (r1 < r0) goto L_0x00cf
            X.0so r8 = r12.A01     // Catch:{ Exception -> 0x00ff }
            java.lang.String r2 = "ForegroundAppCrashLoop"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ff }
            r1.<init>()     // Catch:{ Exception -> 0x00ff }
            r1.append(r9)     // Catch:{ Exception -> 0x00ff }
            r0 = r5[r3]     // Catch:{ Exception -> 0x00ff }
            r1.append(r0)     // Catch:{ Exception -> 0x00ff }
            r1.append(r6)     // Catch:{ Exception -> 0x00ff }
            r0 = r5[r11]     // Catch:{ Exception -> 0x00ff }
            r1.append(r0)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00ff }
            r8.AcB(r2, r0, r3)     // Catch:{ Exception -> 0x00ff }
            goto L_0x0105
        L_0x00cf:
            r1 = r5[r11]     // Catch:{ Exception -> 0x00ff }
            X.0tC r0 = X.C15910s6.A16     // Catch:{ Exception -> 0x00ff }
            int r0 = r7.A02(r0)     // Catch:{ Exception -> 0x00ff }
            if (r1 < r0) goto L_0x0105
            X.0so r8 = r12.A01     // Catch:{ Exception -> 0x00ff }
            java.lang.String r2 = "BackgroundAppCrashLoop"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ff }
            r1.<init>()     // Catch:{ Exception -> 0x00ff }
            r1.append(r9)     // Catch:{ Exception -> 0x00ff }
            r0 = r5[r3]     // Catch:{ Exception -> 0x00ff }
            r1.append(r0)     // Catch:{ Exception -> 0x00ff }
            r1.append(r6)     // Catch:{ Exception -> 0x00ff }
            r0 = r5[r11]     // Catch:{ Exception -> 0x00ff }
            r1.append(r0)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00ff }
            r8.AcB(r2, r0, r3)     // Catch:{ Exception -> 0x00ff }
            goto L_0x0105
        L_0x00fa:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x00fe }
        L_0x00fe:
            throw r0     // Catch:{ Exception -> 0x00ff }
        L_0x00ff:
            r1 = move-exception
            java.lang.String r0 = "Unable to use crash counter file"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0105:
            X.0s8 r0 = X.C15910s6.A0B
            boolean r0 = r7.A05(r0)
            if (r0 == 0) goto L_0x019c
            X.0u3 r2 = r12.A08
            boolean r0 = r2.A01()
            if (r0 == 0) goto L_0x019c
            r1 = r5[r3]
            X.0tC r0 = X.C15910s6.A17
            int r0 = r7.A02(r0)
            if (r1 >= r0) goto L_0x0129
            r1 = r5[r11]
            X.0tC r0 = X.C15910s6.A16
            int r0 = r7.A02(r0)
            if (r1 < r0) goto L_0x019c
        L_0x0129:
            java.lang.String r8 = "ab-props"
            android.content.Context r9 = r2.A00
            java.io.File r0 = r9.getFilesDir()
            java.lang.String r0 = r0.getParent()
            java.lang.String r7 = "shared_prefs"
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = ".xml"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.File r4 = new java.io.File
            r4.<init>(r2, r0)
            java.io.File r0 = r9.getFilesDir()
            java.lang.String r0 = r0.getParent()
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x017d
            r4.renameTo(r1)
        L_0x017d:
            X.0so r2 = r12.A01
            java.lang.String r0 = "Crashes count foreground:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = r5[r3]
            r1.append(r0)
            r1.append(r6)
            r0 = r5[r11]
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "RevertToPreviousStableABPropsCopy"
            r2.AcB(r0, r1, r3)
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20020zN.A03():void");
    }

    public void A04(C19870z8 r1) {
        this.A0A = r1;
    }

    public void A05(String str) {
        SharedPreferences.Editor edit = ((SharedPreferences) this.A06.A01.get()).edit();
        edit.putString("crash_state_manager:system_exit", str);
        if (!edit.commit()) {
            Log.w("reportSystemExit/failed-to-save-preferences");
        }
        System.exit(0);
    }

    public String AGT() {
        return "CrashStateManager";
    }

    public void AMc() {
        this.A09.Ad4(new RunnableRunnableShape8S0100000_I0_7(this, 27), "AppAsyncInit/clear-crash-count", 10000);
    }
}
