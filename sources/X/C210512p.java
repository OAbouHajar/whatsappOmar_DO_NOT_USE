package X;

import android.content.Context;
import com.facebook.redex.IDxUCallbackShape360S0100000_2_I0;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.12p  reason: invalid class name and case insensitive filesystem */
public final class C210512p implements C16240sh {
    public final C16040sK A00;
    public final C16200sd A01;
    public final C16190sc A02;
    public final AnonymousClass12W A03;
    public final C16980tz A04;
    public final C18790xG A05;
    public final AnonymousClass12X A06;
    public final C17330uu A07;
    public final C16990u0 A08;
    public final AnonymousClass12V A09;

    public C210512p(C16040sK r2, C16200sd r3, C16190sc r4, AnonymousClass12W r5, C16980tz r6, C18790xG r7, AnonymousClass12X r8, C17330uu r9, C16990u0 r10, AnonymousClass12V r11) {
        C18450wi.A0H(r6, 1);
        C18450wi.A0H(r11, 2);
        C18450wi.A0H(r2, 3);
        C18450wi.A0H(r4, 4);
        C18450wi.A0H(r7, 5);
        C18450wi.A0H(r3, 6);
        C18450wi.A0H(r5, 7);
        C18450wi.A0H(r10, 8);
        C18450wi.A0H(r9, 9);
        C18450wi.A0H(r8, 10);
        this.A04 = r6;
        this.A09 = r11;
        this.A00 = r2;
        this.A02 = r4;
        this.A05 = r7;
        this.A01 = r3;
        this.A03 = r5;
        this.A08 = r10;
        this.A07 = r9;
        this.A06 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.C41191vO.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.C41191vO.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A5J() {
        /*
            r15 = this;
            X.0sd r7 = r15.A01
            X.0tx r12 = X.C40691uX.A06(r7)
            X.C18450wi.A0B(r12)
            X.0uu r0 = r15.A07
            X.28T r1 = r0.A00()
            if (r1 == 0) goto L_0x00b9
            X.1lh r0 = r1.A04
            java.lang.Object r6 = r0.A00
            X.AnonymousClass00B.A06(r6)
            X.C18450wi.A0B(r6)
            X.1lh r0 = r1.A03
            java.lang.Object r0 = r0.A00
            X.AnonymousClass00B.A06(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.String r5 = java.lang.String.valueOf(r0)
            X.12X r10 = r15.A06
            java.lang.String r1 = "avatar_password.json"
            X.1XH r0 = r10.A00
            r0.A01()
            java.io.File r0 = r0.A03
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00b1 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x00b1 }
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ all -> 0x00aa }
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00aa }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x00aa }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x00a3 }
            r1.<init>()     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = "avatar_password"
            r1.put(r0, r6)     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = "avatar_fbid"
            r1.put(r0, r5)     // Catch:{ all -> 0x00a3 }
            r0 = 2
            java.lang.String r0 = r1.toString(r0)     // Catch:{ all -> 0x00a3 }
            r4.write(r0)     // Catch:{ all -> 0x00a3 }
            r6 = 0
            r4.close()     // Catch:{ all -> 0x00aa }
            r3.close()     // Catch:{ IOException -> 0x00b1 }
            X.0sc r0 = r15.A02     // Catch:{ IOException -> 0x009f }
            java.io.File r3 = r0.A02()     // Catch:{ IOException -> 0x009f }
            int r0 = r12.version     // Catch:{ IOException -> 0x009f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x009f }
            java.lang.String r0 = "avatar-password.bkup.crypt"
            java.lang.String r0 = X.C18450wi.A06(r0, r1)     // Catch:{ IOException -> 0x009f }
            java.io.File r14 = new java.io.File     // Catch:{ IOException -> 0x009f }
            r14.<init>(r3, r0)     // Catch:{ IOException -> 0x009f }
            X.12V r13 = r15.A09     // Catch:{ IOException -> 0x009f }
            X.0sK r5 = r15.A00     // Catch:{ IOException -> 0x009f }
            X.0xG r9 = r15.A05     // Catch:{ IOException -> 0x009f }
            X.12W r8 = r15.A03     // Catch:{ IOException -> 0x009f }
            X.0u0 r11 = r15.A08     // Catch:{ IOException -> 0x009f }
            X.1uz r1 = X.C40951ux.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x009f }
            X.0tz r0 = r15.A04     // Catch:{ IOException -> 0x009f }
            android.content.Context r0 = r0.A00     // Catch:{ IOException -> 0x009f }
            boolean r0 = r1.A04(r0)     // Catch:{ IOException -> 0x009f }
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "AvatarBackup/backup prepare for backup failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x009f }
            goto L_0x00b7
        L_0x009b:
            r1.A03(r6, r2)     // Catch:{ IOException -> 0x009f }
            goto L_0x00b9
        L_0x009f:
            r1 = move-exception
            java.lang.String r0 = "AvatarBackup/backup backup failed"
            goto L_0x00b4
        L_0x00a3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r0 = move-exception
            X.C41191vO.A00(r4, r1)     // Catch:{ all -> 0x00aa }
            throw r0     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r0 = move-exception
            X.C41191vO.A00(r3, r1)     // Catch:{ IOException -> 0x00b1 }
            throw r0     // Catch:{ IOException -> 0x00b1 }
        L_0x00b1:
            r1 = move-exception
            java.lang.String r0 = "AvatarBackup/backup exception while writing to temp file"
        L_0x00b4:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00b7:
            r0 = 0
            return r0
        L_0x00b9:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C210512p.A5J():boolean");
    }

    public String AA3() {
        return "avatar-token";
    }

    public boolean Aca(Context context) {
        C16960tx r17;
        Object obj;
        List A082 = C40691uX.A08(C16960tx.A06, C16960tx.A00());
        File file = new File(this.A02.A02(), "avatar-password.bkup");
        ArrayList A072 = C40691uX.A07(file, A082);
        C40691uX.A0D(file, A072);
        if (A072.isEmpty()) {
            return false;
        }
        Object obj2 = A072.get(0);
        C18450wi.A0F(obj2);
        C18450wi.A0B(obj2);
        File file2 = (File) obj2;
        C18450wi.A0H(file2, 0);
        try {
            AnonymousClass12X r15 = this.A06;
            AnonymousClass1XH r0 = r15.A00;
            r0.A01();
            File file3 = new File(r0.A03, "avatar_password.json");
            int A012 = C40691uX.A01(file2.getName(), "avatar_password.json");
            if (A012 <= 0 || (r17 = C16960tx.A02(A012)) == null) {
                r17 = C16960tx.A08;
            }
            C40951ux.A01(this.A00, (C40961uy) null, this.A01, this.A03, this.A05, r15, this.A08, r17, this.A09, file2).A01((C41011v3) null, this.A04, file3, 0, 0, false);
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file3));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            if (sb.length() > 0) {
                JSONObject jSONObject = new JSONObject(sb.toString());
                Boolean bool = null;
                String string = jSONObject.has("avatar_fbid") ? jSONObject.getString("avatar_fbid") : null;
                String string2 = jSONObject.has("avatar_password") ? jSONObject.getString("avatar_password") : null;
                if (!(string == null || string.length() == 0 || string2 == null || string2.length() == 0)) {
                    AnonymousClass2HX r4 = new AnonymousClass2HX(new C35301lh(new C53852gP(), Long.TYPE, Long.valueOf(Long.parseLong(string)), "WaFbid"), new C35301lh(new C53852gP(), String.class, string2, "WaFbPassword"));
                    try {
                        C34421kE r3 = new C34421kE();
                        this.A07.A02(r4, new IDxUCallbackShape360S0100000_2_I0(r3, 1));
                        obj = (Boolean) r3.get();
                    } catch (Throwable th) {
                        obj = new C41211vQ(th);
                    }
                    Throwable A002 = C41201vP.A00(obj);
                    if (A002 != null) {
                        Log.e(A002);
                    }
                    if (!(obj instanceof C41211vQ)) {
                        bool = obj;
                    }
                    Boolean bool2 = bool;
                    if (bool2 != null) {
                        return bool2.booleanValue();
                    }
                }
                return false;
            }
            Log.w("AvatarBackup/restore could not read JSON metadata from backup file");
            return false;
        } catch (IOException e2) {
            Log.e("AvatarBackup/restore failed", e2);
        }
    }
}
