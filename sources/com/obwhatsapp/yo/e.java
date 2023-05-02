package com.obwhatsapp.yo;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import c.d;
import com.joom.paranoid.Deobfuscator$app$Custom;

public final class e extends AsyncTask {

    /* renamed from: c  reason: collision with root package name */
    public static final int f752c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ProgressDialog f753a;

    /* renamed from: b  reason: collision with root package name */
    public final ChatGenSingle f754b;

    public e(ChatGenSingle chatGenSingle) {
        this.f754b = chatGenSingle;
        ProgressDialog progressDialog = new ProgressDialog(chatGenSingle);
        this.f753a = progressDialog;
        progressDialog.setTitle(yo.getString(Deobfuscator$app$Custom.getString(-2640674241L)));
        progressDialog.setMessage(yo.getString(Deobfuscator$app$Custom.getString(-105719889345L)));
        progressDialog.setProgressStyle(0);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.setButton(-2, chatGenSingle.getString(17039360), new d(this, 1));
        progressDialog.show();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doInBackground(java.lang.Object[] r9) {
        /*
            r8 = this;
            r1 = 0
            java.lang.Void[] r9 = (java.lang.Void[]) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.obwhatsapp.yo.ChatGenSingle r0 = r8.f754b
            r0.f476a = r2
            java.lang.String r3 = r0.f481f
            java.lang.String r4 = r0.f482g
            android.database.sqlite.SQLiteOpenHelper r0 = com.obwhatsapp.yo.yo.sql     // Catch:{ Exception -> 0x0040 }
            android.database.sqlite.SQLiteDatabase r5 = r0.getReadableDatabase()     // Catch:{ Exception -> 0x0040 }
            r6 = -1995916255(0xffffffff8908bc21, float:-1.6458862E-33)
            java.lang.String r0 = "ۡۘ۠ۧۥۦۘۙۙۚۜۨۗۜۡۢ۟ۦۘۢۢ۟ۚ۫ۦ۬ۚۘ"
        L_0x001b:
            int r7 = r0.hashCode()     // Catch:{ Exception -> 0x0040 }
            r7 = r7 ^ r6
            switch(r7) {
                case -1124655464: goto L_0x003b;
                case -841198633: goto L_0x0024;
                case 897082551: goto L_0x0030;
                case 1000300564: goto L_0x0033;
                default: goto L_0x0023;
            }     // Catch:{ Exception -> 0x0040 }
        L_0x0023:
            goto L_0x001b
        L_0x0024:
            boolean r0 = z.j.g(r5)     // Catch:{ Exception -> 0x0040 }
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "ۢۘۜۙۡۛ۟ۙۦۘۨۧۜۘ۬۫ۗۢۡۙ"
            goto L_0x001b
        L_0x002d:
            java.lang.String r0 = "ۘۚ۫ۨۙۡۘ۟ۤۗۡ۟۟ۙۡۘۙۖۘۧۙۨۘۛۜۧ"
            goto L_0x001b
        L_0x0030:
            java.lang.String r0 = "ۢ۬ۙۚۨۢ۠۬ۘ۬۟ۢۛۙۙۘۘۨ"
            goto L_0x001b
        L_0x0033:
            java.util.ArrayList r0 = z.j.k(r5, r3, r4)     // Catch:{ Exception -> 0x0040 }
        L_0x0037:
            r2.addAll(r0)
            return r1
        L_0x003b:
            java.util.ArrayList r0 = z.j.j(r5, r3, r4)     // Catch:{ Exception -> 0x0040 }
            goto L_0x0037
        L_0x0040:
            r0 = move-exception
            r0 = r1
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.e.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public final void onPostExecute(Object obj) {
        d dVar = null;
        String str = "ۗۘۚۙۗۡۚ۠ۡۘۖۥ۫ۡۖۖ۠ۘۘ";
        while (true) {
            switch ((str.hashCode() ^ 751) ^ -891526329) {
                case -1844025029:
                    dVar = new d(this, 0);
                    str = "ۧۛۦ۬ۜۧۘۚ۫ۚۨۘۧۘ۠ۛ۬ۖۘ۟ۛۛ";
                    break;
                case -1370197824:
                    Void voidR = (Void) obj;
                    str = "ۧۗۨۘ۬ۡۧۘۜۡ۫ۙۤۖۘۗۨۥۢۤۜۘۙ۫ۡۘۙ۫ۥۘ";
                    break;
                case 321736874:
                    str = "ۡۢۚۡ۫ۡۘ۫ۢ۫ۙۜۨۚۦ۟";
                    break;
                case 766551686:
                    return;
                case 1452801579:
                    this.f754b.runOnUiThread(dVar);
                    str = "۟ۜۖۘۡ۟ۥ۟ۗۜ۬ۡۜۘۨۦ۠ۙۥۜۘۗۦۖۘ";
                    break;
                case 1586163132:
                    str = "ۡۨ۫ۢۧۦ۠ۦۡۘۗ۬ۙۘ۠ۜۙۚۤۥۛۨۘ۫ۖ۬";
                    break;
            }
        }
    }
}
