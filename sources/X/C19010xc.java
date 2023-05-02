package X;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Environment;
import androidx.preference.PreferenceScreen;
import com.facebook.redex.RunnableRunnableShape0S0000000_I0;
import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.facebook.redex.RunnableRunnableShape2S0200000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.companionmode.CompanionStateHolder$CompanionLogoutStateReceiver;
import com.obwhatsapp.service.MDSyncService;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0xc  reason: invalid class name and case insensitive filesystem */
public class C19010xc {
    public final C16300so A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C211212w A03;
    public final C19740yv A04;
    public final C16200sd A05;
    public final C19670yo A06;
    public final AnonymousClass12U A07;
    public final AnonymousClass12N A08;
    public final C207211i A09;
    public final C18640x1 A0A;
    public final AnonymousClass01Y A0B;
    public final AnonymousClass1RG A0C;
    public final AnonymousClass1RF A0D;
    public final C19590yg A0E;
    public final C18930xU A0F;
    public final AnonymousClass1RE A0G;
    public final AnonymousClass15I A0H;
    public final C23411Bw A0I;
    public final AnonymousClass01V A0J;
    public final C16980tz A0K;
    public final C16260sj A0L;
    public final C15860rz A0M;
    public final C208211s A0N;
    public final C16250si A0O;
    public final C19650ym A0P;
    public final C16900tq A0Q;
    public final AnonymousClass131 A0R;
    public final C210212m A0S;
    public final AnonymousClass19N A0T;
    public final AnonymousClass160 A0U;
    public final C207011g A0V;
    public final AnonymousClass10J A0W;
    public final C14710pd A0X;
    public final C19430yQ A0Y;
    public final AnonymousClass1OJ A0Z;
    public final C209212c A0a;
    public final C19090xk A0b;
    public final AnonymousClass124 A0c;
    public final C14770pj A0d;
    public final C18320wV A0e;
    public final C19220xx A0f;
    public final C211913d A0g;
    public final C17330uu A0h;
    public final C19760yx A0i;
    public final C211312x A0j;
    public final C16220sf A0k;
    public final AnonymousClass130 A0l;
    public final AnonymousClass1RD A0m;
    public final AnonymousClass11Z A0n;
    public final AnonymousClass14X A0o;
    public final C226918x A0p;
    public final AnonymousClass135 A0q;
    public final C16320sq A0r;
    public final AnonymousClass11Y A0s;
    public final C18980xZ A0t;
    public final AnonymousClass12P A0u;
    public final AnonymousClass01D A0v;
    public final AnonymousClass01D A0w;
    public final CopyOnWriteArrayList A0x = new CopyOnWriteArrayList();

    public C19010xc(C16300so r2, C14870pt r3, C16040sK r4, C211212w r5, C19740yv r6, C16200sd r7, C19670yo r8, AnonymousClass12U r9, AnonymousClass12N r10, C207211i r11, C18640x1 r12, AnonymousClass01Y r13, AnonymousClass1RG r14, AnonymousClass1RF r15, C19590yg r16, C18930xU r17, AnonymousClass1RE r18, AnonymousClass15I r19, C23411Bw r20, AnonymousClass01V r21, C16980tz r22, C16260sj r23, C15860rz r24, C208211s r25, C16250si r26, C19650ym r27, C16900tq r28, AnonymousClass131 r29, C210212m r30, AnonymousClass19N r31, AnonymousClass160 r32, C207011g r33, AnonymousClass10J r34, C14710pd r35, C19430yQ r36, AnonymousClass1OJ r37, C209212c r38, C19090xk r39, AnonymousClass124 r40, C14770pj r41, C18320wV r42, C19220xx r43, C211913d r44, C17330uu r45, C19760yx r46, C211312x r47, C16220sf r48, AnonymousClass130 r49, AnonymousClass1RD r50, AnonymousClass11Z r51, AnonymousClass14X r52, C226918x r53, AnonymousClass135 r54, C16320sq r55, AnonymousClass11Y r56, C18980xZ r57, AnonymousClass12P r58, AnonymousClass01D r59, AnonymousClass01D r60) {
        this.A0X = r35;
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r2;
        this.A02 = r4;
        this.A0K = r22;
        this.A0r = r55;
        this.A0j = r47;
        this.A0c = r40;
        this.A0w = r59;
        this.A0F = r17;
        this.A0t = r57;
        this.A0U = r32;
        this.A0m = r50;
        this.A0b = r39;
        this.A0J = r21;
        this.A0W = r34;
        this.A0u = r58;
        this.A0B = r13;
        this.A05 = r7;
        this.A0o = r52;
        this.A0H = r19;
        this.A0k = r48;
        this.A0S = r30;
        this.A09 = r11;
        this.A0Z = r37;
        this.A0N = r25;
        this.A0f = r43;
        this.A04 = r6;
        this.A0O = r26;
        this.A0q = r54;
        this.A0A = r12;
        this.A07 = r9;
        this.A0d = r41;
        this.A0Q = r28;
        this.A0i = r46;
        this.A0p = r53;
        this.A0L = r23;
        this.A0M = r24;
        this.A0T = r31;
        this.A0I = r20;
        this.A0G = r18;
        this.A0V = r33;
        this.A0a = r38;
        this.A0n = r51;
        this.A0s = r56;
        this.A0Y = r36;
        this.A0l = r49;
        this.A0D = r15;
        this.A0e = r42;
        this.A0R = r29;
        this.A0g = r44;
        this.A0h = r45;
        this.A0E = r16;
        this.A06 = r8;
        this.A0P = r27;
        this.A08 = r10;
        this.A0C = r14;
        this.A0v = r60;
    }

    public void A00() {
        this.A0i.A0A(6);
        A02();
        ConditionVariable conditionVariable = new ConditionVariable(false);
        C47152Hu r5 = new C47152Hu(conditionVariable, this);
        ConditionVariable conditionVariable2 = new ConditionVariable(false);
        C47172Hw r2 = new C47172Hw(conditionVariable2, this, r5);
        Context context = this.A0K.A00;
        context.bindService(C14750ph.A0d(context, (String) null), r2, 1);
        C16040sK r22 = this.A02;
        r22.A0B();
        if (r22.A00 != null) {
            Intent A0d2 = C14750ph.A0d(context, "action_delete");
            A0d2.putExtra("account_name", this.A0M.A0M());
            r22.A0B();
            AnonymousClass1ZT r0 = r22.A05;
            AnonymousClass00B.A06(r0);
            A0d2.putExtra("jid_user", r0.user);
            this.A0r.Acl(new RunnableRunnableShape0S0300000_I0(conditionVariable2, context, A0d2, 12));
        } else {
            Log.i("deleteacctconfirm/app.me is null/no google drive backup deletion");
        }
        this.A0c.A00();
        this.A0b.A0D(false);
        this.A0r.Ack(new C47182Hx(conditionVariable2, conditionVariable, this, r5), new Void[0]);
        A04(context);
        if (Build.VERSION.SDK_INT >= 26) {
            C41041v8.A00(context, this.A0J);
        }
    }

    public void A01() {
        Context context = this.A0K.A00;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append("_preferences");
        String obj = sb.toString();
        SharedPreferences sharedPreferences = context.getSharedPreferences("_has_set_default_values", 0);
        C009104e r1 = new C009104e(context);
        r1.A08 = obj;
        r1.A03 = null;
        r1.A03 = null;
        r1.A02(context, (PreferenceScreen) null, R.xml.xml0007);
        sharedPreferences.edit().putBoolean("_has_set_default_values", true).apply();
    }

    public final void A02() {
        Iterator it = this.A0x.iterator();
        while (it.hasNext()) {
            ((C19480yV) it.next()).AT0();
        }
    }

    public final void A03() {
        Context context = this.A0K.A00;
        C19760yx r4 = this.A0i;
        r4.A07();
        C211212w r2 = this.A03;
        r2.A01 = false;
        r2.A00 = null;
        r2.A08.A17((String) null, (String) null);
        this.A0B.A0A();
        C210212m r3 = this.A0S;
        synchronized (r3) {
            r3.A01();
            File databasePath = r3.A02.A00.getDatabasePath("commerce.db");
            boolean delete = databasePath.delete();
            C33931jQ.A04(databasePath, "CommerceDBStorage/removeDatabase");
            StringBuilder sb = new StringBuilder();
            sb.append("CommerceDBStorage/removeDatabase/deleted");
            sb.append(delete);
            Log.i(sb.toString());
        }
        this.A0N.A0O();
        C16040sK r1 = this.A02;
        r1.A09();
        Log.i("memanager/deleteoldme");
        r1.A0B();
        new File(r1.A09.A00.getFilesDir(), "me").delete();
        C004101u.A08(context);
        Log.i("DeleteAccount/deleteBackupToken");
        this.A0r.Acl(new RunnableRunnableShape2S0200000_I0(context, 42, this));
        r4.A0C((String) null, (String) null, (String) null);
        this.A0e.A01(true, true);
        C19430yQ r22 = this.A0Y;
        synchronized (r22) {
            synchronized (r22.A0R) {
                try {
                    Map map = r22.A06;
                    if (map != null) {
                        map.clear();
                    }
                    r22.A0c.clear();
                    r22.A0a.clear();
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                    throw th;
                }
            }
            synchronized (r22.A0S) {
                try {
                    Map map2 = r22.A07;
                    if (map2 != null) {
                        map2.clear();
                    }
                    r22.A0Z.clear();
                    r22.A0b.clear();
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                        break;
                    }
                }
            }
            Map map3 = r22.A0Y;
            synchronized (map3) {
                try {
                    map3.clear();
                } catch (Throwable th3) {
                    while (true) {
                        th = th3;
                        break;
                    }
                }
            }
            r22.A0N.A00.A04();
        }
        this.A0R.A00();
        C16900tq r0 = this.A0P.A02;
        r0.A04();
        r0.A05();
        try {
            this.A0s.A00.A04();
        } catch (IllegalArgumentException e2) {
            AnonymousClass00B.A09("contact-mgr-db/unable to remove database ", e2);
        }
        AnonymousClass14X r32 = this.A0o;
        synchronized (r32) {
            r32.A02.close();
            File databasePath2 = r32.A01.A00.getDatabasePath("stickers.db");
            boolean delete2 = databasePath2.delete();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(databasePath2.getPath());
            sb2.append("-journal");
            boolean delete3 = delete2 | new File(sb2.toString()).delete();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(databasePath2.getPath());
            sb3.append("-shm");
            boolean delete4 = delete3 | new File(sb3.toString()).delete();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(databasePath2.getPath());
            sb4.append("-wal");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("StickerDbStorage/removeDatabase/deleted");
            sb5.append(new File(sb4.toString()).delete() | delete4);
            Log.i(sb5.toString());
        }
        this.A0k.A0C();
        C207011g r12 = this.A0V;
        Log.i("emojidictionarystore/deletedatabase");
        r12.A03.A04();
        C207211i r13 = this.A09;
        Log.i("language-pack-store/deletedatabase");
        r13.A01.A04();
        AnonymousClass160 r14 = this.A0U;
        synchronized (r14) {
            C39861tB r02 = r14.A00;
            if (r02 != null) {
                r02.A04();
            }
            r14.A08 = false;
        }
        AnonymousClass19N r15 = this.A0T;
        synchronized (r15) {
            r15.A02.A04();
            r15.A00 = null;
        }
        AnonymousClass1OJ r16 = this.A0Z;
        Log.i("mediajob/deletedatabases");
        r16.A02.A04();
        this.A0Q.A00 = false;
        this.A0t.A00();
        C40691uX.A09(context);
        this.A05.A02();
        this.A0j.A05();
        C18930xU r6 = this.A0F;
        AnonymousClass19I r17 = r6.A0U;
        synchronized (r17) {
            Set set = r17.A00;
            if (set != null) {
                set.clear();
            }
        }
        C23461Cb r7 = r6.A0J;
        boolean A032 = r7.A03();
        StringBuilder sb6 = new StringBuilder("HistorySyncWorkManager/stopHistorySync shouldUseWorkManager: ");
        sb6.append(A032);
        Log.i(sb6.toString());
        if (A032) {
            ((AnonymousClass022) r7.A04.get()).A0A("HISTORY_SYNC_WORK_UNIQUE_NAME");
        } else {
            r7.A03.A01(r7.A01.A00, MDSyncService.class);
        }
        r6.A0b.A04();
        r6.A0P.A01().edit().clear().apply();
        this.A0f.A03();
        this.A0q.A01();
        AnonymousClass1I3 r23 = (AnonymousClass1I3) ((C16150sX) ((AnonymousClass01F) C004501y.A00(AnonymousClass01F.class, context))).A2v.get();
        Log.i("BusinessDirectoryStorageManager/onAccountDeleted");
        AnonymousClass1I2 r18 = r23.A00;
        Log.i("BusinessDirectorySharedPrefManager/clear");
        r18.A00().edit().clear().apply();
        r23.A00().delete();
        File file = new File(r23.A01.A00.getFilesDir(), "biz_directory");
        if (!file.exists()) {
            file.mkdirs();
        }
        file.delete();
        this.A0M.A0K().putBoolean("is_eula_loaded_once", false).apply();
        r4.A0A(0);
        return;
        throw th;
    }

    public final void A04(Context context) {
        this.A0a.A05();
        this.A0d.A0E(false);
        this.A0A.A09();
        this.A01.A0K(new RunnableRunnableShape2S0100000_I0_1(this.A0g, 27));
        this.A0h.A01();
        A03();
        A05(context);
        this.A04.A01();
        A06(context);
        C23411Bw r1 = this.A0I;
        r1.A00.A00().edit().clear().commit();
        SharedPreferences sharedPreferences = r1.A01.A00;
        sharedPreferences.edit().putInt("registration_device_id", 0).commit();
        sharedPreferences.edit().putInt("companion_registration_state", 0).commit();
    }

    public final void A05(Context context) {
        File filesDir = context.getFilesDir();
        filesDir.toString();
        for (int i2 = 0; i2 < context.fileList().length; i2++) {
        }
        AnonymousClass1XI.A0D(filesDir);
        this.A0r.Acl(new RunnableRunnableShape0S0000000_I0(1));
        AnonymousClass15I r2 = this.A0H;
        synchronized (r2) {
            r2.A05().edit().clear().commit();
            AnonymousClass158 r1 = r2.A07;
            r1.A02().edit().clear().commit();
            r1.A01().edit().clear().commit();
        }
        String externalStorageState = Environment.getExternalStorageState();
        StringBuilder sb = new StringBuilder("deleteacctconfirm/externalmedia-state ");
        sb.append(externalStorageState);
        Log.i(sb.toString());
        if (this.A0L.A0F(externalStorageState)) {
            this.A0O.A0G();
        }
    }

    public final void A06(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append("_preferences");
        SharedPreferences sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
        if (!sharedPreferences.edit().clear().commit()) {
            Log.e("deleteacctconfirm/cleanup/clear failed");
        }
        A01();
        if (!sharedPreferences.edit().putString("version", "2.23.1.76").commit()) {
            Log.e("deleteacctconfirm/cleanup/setversion failed");
        }
        C15860rz r0 = this.A0M;
        String A0M2 = r0.A0M();
        SharedPreferences.Editor A0K2 = r0.A0K();
        StringBuilder sb2 = new StringBuilder("gdrive_last_successful_backup_timestamp:");
        sb2.append(A0M2);
        SharedPreferences.Editor remove = A0K2.remove(sb2.toString());
        StringBuilder sb3 = new StringBuilder("gdrive_last_successful_backup_total_size:");
        sb3.append(A0M2);
        SharedPreferences.Editor remove2 = remove.remove(sb3.toString());
        StringBuilder sb4 = new StringBuilder("gdrive_last_successful_backup_media_size:");
        sb4.append(A0M2);
        SharedPreferences.Editor remove3 = remove2.remove(sb4.toString());
        StringBuilder sb5 = new StringBuilder("gdrive_last_successful_backup_video_size:");
        sb5.append(A0M2);
        SharedPreferences.Editor remove4 = remove3.remove(sb5.toString());
        StringBuilder sb6 = new StringBuilder("gdrive_last_successful_backup_encrypted:");
        sb6.append(A0M2);
        remove4.remove(sb6.toString()).remove("gdrive_restore_start_timestamp").remove("gdrive_backup_start_timestamp").remove("gdrive_next_prompt_for_setup_timestamp").remove("gdrive_error_code").remove("interface_gdrive_backup_frequency").remove("gdrive_already_downloaded_bytes").remove("gdrive_restore_overwrite_local_files").remove("gdrive_media_restore_network_setting").remove("gdrive_old_media_encryption_status").remove("gdrive_old_media_encryption_start_time").remove("gdrive_last_restore_file_is_encrypted").remove("gdrive_successive_backup_failed_count").remove("gdrive_already_uploaded_bytes").remove("gdrive_user_initiated_backup").remove("gdrive_state").remove("gdrive_activity_state").remove("gdrive_activity_msgstore_init_key").remove("interface_gdrive_backup_network_setting").remove("gdrive_include_videos_in_backup").remove("gdrive_backup_filters").remove("gdrive_approx_media_download_size").remove("gdrive_account_name").remove("gdrive_setup_user_prompted_count").commit();
    }

    public void A07(boolean z2) {
        this.A0I.A01.A00.edit().putInt("companion_registration_state", 9).commit();
        A02();
        AnonymousClass022 r0 = (AnonymousClass022) this.A0u.get();
        r0.A06.A8p(new C008904b(r0));
        Context context = this.A0K.A00;
        this.A0c.A00();
        this.A0b.A0D(false);
        if (this.A0X.A0E(C16620tM.A02, 2489)) {
            if (z2) {
                AnonymousClass1RE r6 = this.A0G;
                Context context2 = r6.A03.A00;
                PackageManager packageManager = context2.getPackageManager();
                ComponentName componentName = r6.A01;
                if (componentName == null) {
                    componentName = new ComponentName(context2, CompanionStateHolder$CompanionLogoutStateReceiver.class);
                    r6.A01 = componentName;
                }
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
            }
            try {
                ActivityManager A032 = this.A0J.A03();
                if (!C15450qv.A02() || A032 == null) {
                    String packageName = context.getPackageName();
                    Runtime runtime = Runtime.getRuntime();
                    StringBuilder sb = new StringBuilder();
                    sb.append("pm clear ");
                    sb.append(packageName);
                    runtime.exec(sb.toString());
                    return;
                } else if (A032.clearApplicationUserData()) {
                    return;
                }
            } catch (IOException | SecurityException e2) {
                this.A00.A03("DeleteAccount/clearApplicationUserData/failed to clear, falling back to old cleanup flow", e2.getMessage(), e2);
            }
        }
        A04(context);
    }
}
