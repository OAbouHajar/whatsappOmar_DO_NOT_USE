package com.obwhatsapp.yo.autoschedreply;

import X.C15830rv;
import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;
import com.obwhatsapp.yo.dep;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.u1;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.backuprestore.Controller;
import com.obwhatsapp.youbasha.task.utils;
import com.obwhatsapp.youbasha.ui.YoSettings.BackupRestore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final int f728a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f729b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f730c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f731d;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i2) {
        this.f728a = i2;
        this.f729b = obj;
        this.f730c = obj2;
        this.f731d = obj3;
    }

    public final void run() {
        String str;
        String arrays;
        String[] strArr;
        int i2 = 0;
        int i3 = this.f728a;
        Object obj = this.f731d;
        Object obj2 = this.f730c;
        Object obj3 = this.f729b;
        switch (i3) {
            case 0:
                Receiver receiver = (Receiver) obj3;
                object_alert object_alert = (object_alert) obj2;
                Context context = (Context) obj;
                receiver.f671a.open();
                receiver.f671a.delete(object_alert.get_id());
                receiver.f671a.close();
                ArrayList arrayList = new ArrayList(Arrays.asList(object_alert.getE_e().split(",")));
                while (true) {
                    String str2 = "۬ۙۤ۫ۚۘ۬۟ۦۘۚۥۖۤۘۡ۫ۨۘۚۡۡ";
                    while (true) {
                        switch (str2.hashCode() ^ -553945917) {
                            case -1831783458:
                                str2 = "ۘۜۜۘۥۗۡۘۚۤۡۘۙ۟ۘۥۦۨۘۨۧ";
                                break;
                            case -1467204869:
                                dep.sendAMsg((String) null, dep.gen_b((String) arrayList.get(i2)), object_alert.getF_f());
                                i2++;
                            case -417851845:
                                if (i2 >= arrayList.size()) {
                                    str2 = "۬ۛۡۘۗ۬ۚۦ۠ۥۗۛ۠ۡۧۥۘ۬ۦۥۘۤۡ";
                                    break;
                                } else {
                                    str2 = "۫ۧۨۘ۟ۨۧۦ۟ۖۘۗۡۚ۟ۚۘۙۧۨۦۤۢۡۦۖۧۢۥ";
                                    break;
                                }
                            case 302355696:
                                String str3 = "ۢۘۥۘۥۗۦۘۗۚۥۗۡۥۘۘ۬۟ۖ۟ۖ۟ۙۡ";
                                while (true) {
                                    switch (str3.hashCode() ^ 2071702062) {
                                        case -838575607:
                                            str = "Scheduled Message sent";
                                            break;
                                        case 7905853:
                                            if (utils.isArabic()) {
                                                str3 = "ۨ۫ۘۢۜۨۘۚۧۤۘۙۘۘۙۨۘۛۢۘ۫ۦ۬ۛۡۦۘ";
                                                break;
                                            } else {
                                                str3 = "ۚۡۨۡۗۨۥۚۚۨۧۥۘ۟ۛۗۛۚۛ";
                                                continue;
                                            }
                                        case 1424085905:
                                            str = "تم إرسال الرسالة المجدولة";
                                            break;
                                        case 1737307750:
                                            str3 = "ۛۢ۫ۡۖۦۗۙۘ۫ۚ۫ۦۘۦۘۤ۬ۘۘ";
                                            continue;
                                    }
                                }
                                Toast.makeText(context, str, 1).show();
                                return;
                        }
                    }
                }
                break;
            case 1:
                String str4 = (String) obj2;
                String str5 = (String) obj;
                String[] f2 = dep.f((String) obj3);
                String str6 = "ۧۙۗۙ۟ۜۘۗۚۘۖ۫۬ۜۗۚۗۥۚۨۧۧ۫ۦ۫";
                while (true) {
                    switch (str6.hashCode() ^ 613314148) {
                        case -418287096:
                            str6 = "۬ۗۦۘۖۚۦۥ۫ۛۗۚۥۘ۬ۦۖۘۨۘ۟";
                            continue;
                        case 93614259:
                            arrays = "[" + str4 + "]";
                            break;
                        case 139195194:
                            if (f2 != null) {
                                str6 = "ۗۨۤۤ۟ۖۗۦۜۨۛۡۘ۫۫ۤۗۚۧۢۛۨ۬";
                                break;
                            } else {
                                str6 = "ۨ۠ۙۦۦۖۘۜۡ۫ۛۤۦۧۤ";
                                continue;
                            }
                        case 631969001:
                            HashSet hashSet = new HashSet();
                            Collections.addAll(hashSet, f2);
                            hashSet.addAll(Collections.singletonList(str4));
                            arrays = Arrays.toString(hashSet.toArray());
                            break;
                    }
                }
                String str7 = "ۚ۫ۨۘ۫ۖۚۢۧۘۘ۟ۡۚ۬ۗۤ۬ۨۧۗۧۦ";
                while (true) {
                    switch (str7.hashCode() ^ -235322319) {
                        case -1796632113:
                            str7 = "ۜۚۤۘ۟ۢ۟ۦۜۘۧۨۘۘۨ۟۠۫ۙۙۦۙۖ۟ۨۧ";
                            break;
                        case -337407481:
                            shp.setStringPriv(yo.stripJID(str5) + "_revoked", arrays);
                            return;
                        case 67371328:
                            return;
                        case 1855516398:
                            if (arrays == null) {
                                str7 = "ۦۖ۬۟۠ۢۖۗۜۘ۟ۢۖۘۤۜۦۘ";
                                break;
                            } else {
                                str7 = "ۡ۟ۖۗۙ۠ۢۛۤۖ۫ۚۚۧ۫";
                                break;
                            }
                    }
                }
                break;
            case 2:
                String str8 = (String) obj2;
                String[] strArr2 = (String[]) obj;
                String[] g2 = dep.g((String) obj3);
                String str9 = "۬ۗۧ۠۫ۖۘۧ۟ۘۘۗۢ۫ۡ۟ۢ";
                while (true) {
                    switch (str9.hashCode() ^ 277573149) {
                        case -792000297:
                            str9 = "ۤۧۘۘۨۤۤۡۘۙۗۨۘۗۙۘۘۘۘ۠۟ۖۖۡۚۙ";
                            break;
                        case -632648520:
                            if (g2 == null) {
                                str9 = "ۖ۫ۨ۬ۧۛۥۧۘ۠ۗۨ۟۠ۨۥۨۧۘۥ۠ۛۗ۠ۢۖۙۖۘ";
                                break;
                            } else {
                                str9 = "۬ۚ۬ۦۚۘۚۗۧ۬۫ۘۘۦ۟ۦ";
                                break;
                            }
                        case -139259316:
                            dep.i(str8, strArr2);
                            return;
                        case 1636609384:
                            try {
                                String stringPriv = shp.getStringPriv(str8 + "_bluedmsgs");
                                String str10 = "ۨۦۧ۫ۙۦ۬۠ۛۨۜۡۘۗۘ۟";
                                while (true) {
                                    switch (str10.hashCode() ^ 1123599928) {
                                        case -1218415938:
                                            str10 = "ۤۛ۟ۧۙۖۘۜۦ۟ۤ۬ۚۙۛۙۜۚۗۤۨۧ";
                                            continue;
                                        case 644103811:
                                            if (!stringPriv.equals("")) {
                                                str10 = "ۦۛۜۘ۠ۥۨۘۜۤۖ۠ۙۛۧۙۢۘۨۘۘ";
                                                break;
                                            } else {
                                                str10 = "ۦۘۚۧۨۘۘۢ۫۫ۡۡ۫ۦۖۘۨۦۢ۫ۢۛ۟ۥۙۜ۬ۖ";
                                                continue;
                                            }
                                        case 1589558320:
                                            HashSet<String> StringToHashSet = utils.StringToHashSet(stringPriv);
                                            HashSet hashSet2 = new HashSet();
                                            Collections.addAll(hashSet2, g2);
                                            hashSet2.removeAll(StringToHashSet);
                                            shp.setStringPriv(str8 + "_bluedmsgs", "");
                                            strArr = (String[]) hashSet2.toArray(new String[0]);
                                            break;
                                        case 1831505905:
                                            strArr = g2;
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                            } catch (Exception e2) {
                                strArr = g2;
                            }
                            HashSet hashSet3 = new HashSet();
                            Collections.addAll(hashSet3, strArr);
                            Collections.addAll(hashSet3, strArr2);
                            dep.i(str8, hashSet3.toArray());
                            return;
                    }
                }
                break;
            case 3:
                String str11 = u1.f889l;
                dep.sendAMsg((String) obj3, (C15830rv) obj2, (String) obj);
                return;
            default:
                BackupRestore backupRestore = (BackupRestore) obj3;
                int i4 = BackupRestore.f1141c;
                backupRestore.getClass();
                Controller.cleanWACryptDBs();
                Controller.cleanFMWABackup();
                backupRestore.runOnUiThread(new com.obwhatsapp.yo.p(backupRestore, (ProgressDialog) obj2, 5));
                ((ExecutorService) obj).shutdown();
                return;
        }
    }
}
