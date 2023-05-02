package com.obwhatsapp.youbasha.ui.YoSettings;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import c.d;
import com.obwhatsapp.yo.CustomAlertDialogBuilder;
import com.obwhatsapp.yo.autoschedreply.p;
import com.obwhatsapp.yo.c1;
import com.obwhatsapp.yo.x;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.backuprestore.Controller;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BackupRestore extends BaseSettingsActivity {

    /* renamed from: c  reason: collision with root package name */
    public static final int f1141c = 0;

    /* renamed from: b  reason: collision with root package name */
    public TextView f1142b;

    public void MakeFullBackup(View view) {
        String str = "ۨ۫ۢۡۡۚۧ۠ۨۜۛۦۧۖۧۧۗ۟";
        while (true) {
            switch ((str.hashCode() ^ 714) ^ -1386567373) {
                case -1978439791:
                    str = "۫ۜۥۘ۠۠ۤۤ۬ۗ۠ۙ۫ۧۦ۟ۖۜ۫ۜۗۙۧۡۤۜۘ";
                    break;
                case -294283885:
                    str = "ۢ۬ۤۨ۫ۨۧۖ۟ۗ۬ۜۜ۬۫ۥۘۧۘۗۜۥۤۙۨۘ";
                    break;
                case 753253821:
                    return;
                case 1976186313:
                    Controller.makeBackup(this, false);
                    str = "۟ۦۥ۫ۦۚ۟۬ۤ۠ۥۘۥۦۢ";
                    break;
            }
        }
    }

    public void RestoreFullBackup(View view) {
        String str = "ۗ۫ۗۜۘۘۛۡۗۥۙۡۘۨۛۦۘۡ۫ۗۜۢۨۢ۟ۢۨۖ۠";
        StringBuilder sb = null;
        AlertDialog.Builder builder = null;
        while (true) {
            switch ((str.hashCode() ^ 427) ^ 375396081) {
                case -2147003168:
                    sb.append(yo.getString("activity_google_drive_restore_title"));
                    str = "ۨۖۨۘۧۤۨۖۨۦۘۘۨۡۘ۬۠ۘۘۥۘ۠ۖۜۘۛۜۘۧۜۖۘ";
                    break;
                case -1840260079:
                    str = "ۖۛۤۚۛۨ۠ۧۤۥۥۜۘ۫ۗۜ";
                    builder = new CustomAlertDialogBuilder(this).setTitle((CharSequence) yo.getString("msg_store_confirm"));
                    break;
                case -742550404:
                    return;
                case -65998608:
                    str = "ۧۦۙۧۙۦۘۦۘ۟ۚ۫ۜۘۡۤۥۗۖۜۘ۠ۤۙ۠ۗۡ";
                    break;
                case -17810205:
                    builder.setMessage(sb.toString()).setPositiveButton(yo.getString("gdrive_restore_now"), new d(this, 12)).setNegativeButton(17039369, new x(17)).create().show();
                    str = "ۧۗۙۥۨۤ۬ۖۢۗۗۙۤ۫ۚۧۨۥۘۤۤۡۘۢۘۡ";
                    break;
                case 216585445:
                    sb = new StringBuilder();
                    str = "ۢۢۛۤۥۥۘ۠ۚۡۘۗۡ۟ۤۙۤ";
                    break;
                case 309716652:
                    str = "ۢۨۖۜۘۥ۬ۖۘ۬ۦۛۢۤۙۖۥۦۘۢ۟ۘۘۤۜ۬";
                    break;
                case 1622727495:
                    sb.append("?");
                    str = "ۦۦۘۘۡۘ۬ۚۥۘۘۘۥۜۖ۟ۖۛۦۢ";
                    break;
            }
        }
    }

    public void cleanAllBackups(View view) {
        String str = "ۘۙۗۥۨۦۦ۟۬ۦۥۛۚۚۖۘۜۨۥ۟ۗۜۚ۬۟ۗۡۘ";
        ProgressDialog progressDialog = null;
        ExecutorService executorService = null;
        while (true) {
            switch ((str.hashCode() ^ 737) ^ -41759758) {
                case -2126434597:
                    Toast.makeText(this, yo.getString("msg_store_migrate_message"), 0).show();
                    str = "ۚ۫ۖۘۧ۬ۛۚ۠ۦۤ۠ۡ۬ۧۙۧ۟";
                    break;
                case -1476557013:
                    this.f1142b.setText(yo.getString("delete_items_wait_progress"));
                    str = "ۧۙۜۘۨۤۖۨۦۘۘۜۛۘۘۢۨ۟ۥ۟۫ۡۨ";
                    break;
                case -1179289362:
                    progressDialog = new ProgressDialog(this);
                    str = "ۨۖۢۥۚۡۘ۬۫ۨۘۦۗۨۖۤۜ۠ۖۥۘۨۤۘ";
                    break;
                case -1113471633:
                    progressDialog.setMessage(yo.getString("settings_backup_db_now_message"));
                    str = "ۥۢۗۢ۫ۥۚۦۨۜۘ۬ۦۘۢۜۙۛ۫ۖۖۗۚۖۘ";
                    break;
                case -864901537:
                    progressDialog.setProgressStyle(0);
                    str = "۫ۙۖۛۢۡۘۜۘۨۙۙۥۘۢۤۛ";
                    break;
                case -820707472:
                    progressDialog.setCancelable(false);
                    str = "ۘۙۛۗۨۦ۟ۗۢۨۧۢ۠ۨۨۘۙۚۨ";
                    break;
                case 173790835:
                    progressDialog.setIndeterminate(true);
                    str = "ۛۥۡۨۤۨۧۜۥۘۘۚ۬ۧۜۗۘۙۙ";
                    break;
                case 348811088:
                    progressDialog.show();
                    str = "۠ۡۜۡ۟ۡ۠۠ۤ۠۫ۢۘ۠ۜۘۡۢۜۘ";
                    break;
                case 437053519:
                    executorService.execute(new p(this, progressDialog, executorService, 4));
                    str = "ۛۥۥۘۙۜۘۥۥۙۖۙۙۧۨ۬ۖۖۘۙ";
                    break;
                case 593727652:
                    return;
                case 1012534167:
                    str = "ۜۨۥۘ۠ۢۡۦۦۖۡۡۚۨۨۘ";
                    break;
                case 1118935390:
                    progressDialog.setTitle(yo.getString("delete_items_wait_progress"));
                    str = "ۚۜۡۘۧۛۖۘۛ۫ۗ۠۬ۖۢۥۨۘ۬۫۠";
                    break;
                case 1144880456:
                    progressDialog.setButton(-2, getString(17039360), new c1(executorService, progressDialog, 2));
                    str = "ۙۙۢۡ۬ۙۘۜۨۚۖۥۚۙ۟ۨۢۘۘۘۚۥۘۨۢۛ";
                    break;
                case 1279996359:
                    str = "۬ۢۨۘ۬ۜۖۘۖۤۦۘۢۥۢ۟ۜ۠ۛۨۘۥۤۜۥۗۘ";
                    break;
                case 2059239165:
                    str = "ۦۚۛۙۥ۟ۡ۠ۢ۟ۗۨۤۛۜۚۜۘۨۥۘۧۚۡ";
                    executorService = Executors.newSingleThreadExecutor();
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ab A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ca A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            java.lang.String r0 = "yo_settings_backuprestore"
            java.lang.String r1 = "layout"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            r5.setContentView(r0)
            java.lang.String r0 = "storage_usage_detail_size"
            java.lang.String r1 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.f1142b = r0
            java.lang.String r1 = "calculating"
            java.lang.String r1 = com.obwhatsapp.yo.yo.getString((java.lang.String) r1)
            r0.setText(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            com.obwhatsapp.yo.p r1 = new com.obwhatsapp.yo.p
            r2 = 3
            r1.<init>(r5, r0, r2)
            r0.execute(r1)
            java.lang.String r0 = "div2"
            java.lang.String r1 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)     // Catch:{ Exception -> 0x00cb }
            android.view.View r0 = r5.findViewById(r0)     // Catch:{ Exception -> 0x00cb }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x00cb }
            r2 = -816735844(0xffffffffcf51999c, float:-3.51650509E9)
            java.lang.String r1 = "ۦ۠ۖۘۦۦۤۧۢۖۘۢۤۨۧۜۦۘۤۢۢ"
        L_0x0047:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x00cb }
            r3 = r3 ^ r2
            switch(r3) {
                case -486439808: goto L_0x0056;
                case 1059688225: goto L_0x005b;
                case 1351291503: goto L_0x0084;
                case 1895678594: goto L_0x0050;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x0047
        L_0x0050:
            java.lang.String r1 = "ۤۚۡۦۧۛۗۛۡۘ۟ۚۨۖۖ۠"
            goto L_0x0047
        L_0x0053:
            java.lang.String r1 = "ۙۙۖۘۖۦۖ۠ۥۦۘ۟ۚۘۘۛ۠ۥۘۢۘۜ۠ۛ"
            goto L_0x0047
        L_0x0056:
            if (r0 == 0) goto L_0x0053
            java.lang.String r1 = "ۛۤۜۤۧۡۖۡۦۘۚۘۨۘ۫۟ۨ"
            goto L_0x0047
        L_0x005b:
            java.lang.String r1 = "email_location_message"
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x00cb }
            r3 = 0
            java.lang.String r4 = com.obwhatsapp.youbasha.backuprestore.Constants.FMWA_CURRENT_BACKUP_PATH     // Catch:{ Exception -> 0x00cb }
            r2[r3] = r4     // Catch:{ Exception -> 0x00cb }
            java.lang.String r1 = com.obwhatsapp.yo.yo.getString(r1, r2)     // Catch:{ Exception -> 0x00cb }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cb }
            java.lang.String r3 = "🔹 "
            r2.<init>(r3)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r3 = com.obwhatsapp.yo.yo.pname     // Catch:{ Exception -> 0x00cb }
            r2.append(r3)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r3 = " "
            r2.append(r3)     // Catch:{ Exception -> 0x00cb }
            r2.append(r1)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x00cb }
            r0.setText(r1)     // Catch:{ Exception -> 0x00cb }
        L_0x0084:
            java.lang.String r0 = "div"
            java.lang.String r1 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)     // Catch:{ Exception -> 0x00cb }
            android.view.View r0 = r5.findViewById(r0)     // Catch:{ Exception -> 0x00cb }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x00cb }
            r2 = -1543945504(0xffffffffa3f942e0, float:-2.7024957E-17)
            java.lang.String r1 = "ۙ۫ۥۛ۫ۙۖۤۘۘۦۖۜۘۤۚۖۘۤۧۢۢ۬ۥۘ"
        L_0x0097:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x00cb }
            r3 = r3 ^ r2
            switch(r3) {
                case -1685832652: goto L_0x00a6;
                case -782122120: goto L_0x00ca;
                case 97884983: goto L_0x00a0;
                case 1371221830: goto L_0x00ab;
                default: goto L_0x009f;
            }
        L_0x009f:
            goto L_0x0097
        L_0x00a0:
            java.lang.String r1 = "ۜ۬ۗۗۜۧۘۤۛۧۘۜۘ۟ۨ۬ۡۚۡ"
            goto L_0x0097
        L_0x00a3:
            java.lang.String r1 = "ۦۡۥۘۛۘۤۘ۟ۤ۟ۥۨۡۛ"
            goto L_0x0097
        L_0x00a6:
            if (r0 == 0) goto L_0x00a3
            java.lang.String r1 = "ۚ۠ۡۛۙۛۜ۟ۡۡ۟ۗۖۡۘۜۖۡ"
            goto L_0x0097
        L_0x00ab:
            java.lang.String r1 = "email_location_message"
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x00cb }
            r3 = 0
            java.lang.String r4 = com.obwhatsapp.youbasha.backuprestore.Constants.WA_DATABASES_PATH     // Catch:{ Exception -> 0x00cb }
            r2[r3] = r4     // Catch:{ Exception -> 0x00cb }
            java.lang.String r1 = com.obwhatsapp.yo.yo.getString(r1, r2)     // Catch:{ Exception -> 0x00cb }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cb }
            java.lang.String r3 = "🔹 Stock "
            r2.<init>(r3)     // Catch:{ Exception -> 0x00cb }
            r2.append(r1)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x00cb }
            r0.setText(r1)     // Catch:{ Exception -> 0x00cb }
        L_0x00ca:
            return
        L_0x00cb:
            r0 = move-exception
            goto L_0x00ca
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.YoSettings.BackupRestore.onCreate(android.os.Bundle):void");
    }
}
