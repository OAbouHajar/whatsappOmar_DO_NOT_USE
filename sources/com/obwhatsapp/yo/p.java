package com.obwhatsapp.yo;

import X.C005402i;
import android.app.ProgressDialog;
import android.text.format.Formatter;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Toast;
import com.google.gson.internal.i;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.youbasha.backuprestore.Controller;
import com.obwhatsapp.youbasha.ui.YoSettings.BackupRestore;
import com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView;
import com.obwhatsapp.youbasha.ui.themeserver.OnThemesActivity;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import m.s;
import q.d;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final int f839a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f840b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f841c;

    public /* synthetic */ p(Object obj, Object obj2, int i2) {
        this.f839a = i2;
        this.f841c = obj;
        this.f840b = obj2;
    }

    public final void run() {
        String str;
        int i2 = this.f839a;
        Object obj = this.f840b;
        Object obj2 = this.f841c;
        switch (i2) {
            case 0:
                int i3 = Conversation.f512a;
                ((C005402i) obj2).A0D(shp.getGradientDrawable((String) obj));
                return;
            case 1:
                Toast.makeText(((w0) obj2).f901d, (String) obj, 0).show();
                return;
            case 2:
                String str2 = yo.mpack;
                ((View) obj2).startAnimation((Animation) obj);
                return;
            case 3:
                BackupRestore backupRestore = (BackupRestore) obj2;
                ExecutorService executorService = (ExecutorService) obj;
                int i4 = BackupRestore.f1141c;
                backupRestore.getClass();
                try {
                    str = Formatter.formatFileSize(yo.getCtx(), (long) (Controller.getWACryptDBsSize() + Controller.getFMWABackupSize()));
                } catch (Exception e2) {
                    str = "";
                }
                backupRestore.runOnUiThread(new p(backupRestore, str, 4));
                executorService.shutdown();
                return;
            case 4:
                ((BackupRestore) obj2).f1142b.setText(yo.getString("google_drive_backup_size", new String[]{String.valueOf((String) obj)}));
                return;
            case 5:
                BackupRestore backupRestore2 = (BackupRestore) obj2;
                int i5 = BackupRestore.f1141c;
                backupRestore2.getClass();
                ((ProgressDialog) obj).dismiss();
                Toast.makeText(backupRestore2, yo.getString("done"), 0).show();
                backupRestore2.f1142b.setText(yo.getString("calculating"));
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                newSingleThreadExecutor.execute(new p(backupRestore2, newSingleThreadExecutor, 3));
                return;
            case 6:
                ((s) obj2).f1846f.setProgress(((Integer[]) obj)[0].intValue() / 1024);
                return;
            case 7:
                s sVar = (s) obj2;
                Toast.makeText(sVar.f1847g, (String) obj, 0).show();
                sVar.f1846f.dismiss();
                return;
            case 8:
                PatternLockView patternLockView = (PatternLockView) obj2;
                patternLockView.j((float) patternLockView.f1309l, (float) patternLockView.f1308k, (long) patternLockView.f1310m, patternLockView.F, (PatternLockView.DotState) obj, (p) null);
                return;
            case 9:
                OnThemesActivity onThemesActivity = (OnThemesActivity) ((i) obj2).f409c;
                ArrayList arrayList = (ArrayList) ((i) obj).f409c;
                String str3 = "ۖۨۢۜ۠ۙۢۥۘۧۘ۫ۚۛۧۙۤۘۘ۠۟۫ۚۖۜ";
                while (true) {
                    switch (str3.hashCode() ^ -2001101505) {
                        case -233523321:
                            str3 = "ۢۜۡۢ۟ۡۘۛۢۥۘۦۡۧۤۤۦ۠ۘ۬ۖۢۖۘۢ۠ۧۙ۟۫";
                            break;
                        case -61780944:
                            onThemesActivity.getClass();
                            return;
                        case 593063588:
                            if (arrayList != null) {
                                str3 = "ۙ۟۬۠ۖۖۘ۠ۖۦۜۙۛۚۜۧۘ۫ۤۥۘ";
                                break;
                            } else {
                                str3 = "۫ۦۤۡ۟ۥۘۘ۫ۧ۬۠ۧۧۚۜ۫ۡ۬ۨۧۥۘ";
                                break;
                            }
                        case 1423849588:
                            ArrayList arrayList2 = onThemesActivity.f1338b;
                            arrayList2.addAll(arrayList);
                            d dVar = onThemesActivity.f1337a;
                            dVar.f2396b = arrayList2;
                            dVar.notifyDataSetChanged();
                            onThemesActivity.b();
                            return;
                    }
                }
                break;
            default:
                Conversation conversation = (Conversation) obj2;
                String str4 = (String) obj;
                String str5 = "ۛۦۡۘۗۜۜۘۧۖ۠ۛۥۘۢۚۡۘ";
                while (true) {
                    switch (str5.hashCode() ^ -868698907) {
                        case -986311446:
                            if (conversation.getMentionableEntry() == null) {
                                str5 = "ۛۥۚۨۦ۫۟ۜۘۗ۬ۤۧۛۙۜ۠۟ۡۡۡۘۧۡ۫ۦۙۜۘ";
                                break;
                            } else {
                                str5 = "ۨ۟۟ۜ۬ۘۘۦۥۘۘۤۖۨ۠۫ۙۤۗۧۚۗۘۘ۬ۙۨ";
                                break;
                            }
                        case 588615806:
                            conversation.getMentionableEntry().setText(str4);
                            return;
                        case 825355868:
                            str5 = "ۧۡۤۚۨۘۘۦۘۢۛۗۘۘۤۡۨۤۤۖۛ۠۟";
                            break;
                        case 1499738855:
                            return;
                    }
                }
                break;
        }
    }
}
