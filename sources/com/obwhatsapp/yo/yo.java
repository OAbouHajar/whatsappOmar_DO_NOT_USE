package com.obwhatsapp.yo;

import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.C15830rv;
import X.C16010sH;
import X.C16150sX;
import X.C16740tZ;
import a.a;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.MediaStore;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.AssemMods.accounts.AccountsManager;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.R;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.obwhatsapp.conversationslist.HiddenConversationsActivity;
import com.obwhatsapp.gallerypicker.GalleryPicker;
import com.obwhatsapp.group.GroupChatInfoActivity;
import com.obwhatsapp.service.YoHiddenService;
import com.obwhatsapp.status.StatusesFragment;
import com.obwhatsapp.youbasha.app;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.task.utils;
import com.obwhatsapp.youbasha.ui.lockV2.LockOptions;
import com.obwhatsapp.youbasha.ui.lockV2.LockUtils;
import com.obwhatsapp.youbasha.ui.views.IGStatusesView;
import com.whatsapp.jid.Jid;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class yo extends u1 {
    public static Activity A = null;
    public static String APP_DATA = null;
    public static boolean B = false;
    public static Vibrator C = null;
    public static Ringtone D = null;
    public static MenuItem E = null;
    public static boolean F = false;
    public static LinkedHashSet G = null;
    public static HomeActivity Homeac = null;
    public static ConversationsFragment conversationsFragment = null;
    public static String datafolder = null;
    public static String emojifolder = null;
    public static String hideJidCode = "hidech";
    public static TextView homeActionbarTitle = null;
    public static boolean isCommunityEnabled = false;
    private static AccountsManager mAccountsManager = null;
    public static IGStatusesView mIGStatusesView = null;
    public static StatusesFragment mInnerStatusesFragment = null;
    public static C16150sX mSingletonC = null;
    public static String mpack = "com.obwhatsapp";
    public static String pname = "OBWhatsApp";

    /* renamed from: q  reason: collision with root package name */
    public static Context f125q = null;

    /* renamed from: r  reason: collision with root package name */
    public static a f126r = null;

    /* renamed from: s  reason: collision with root package name */
    public static SQLiteOpenHelper f127s = null;
    public static SQLiteOpenHelper sql = null;

    /* renamed from: t  reason: collision with root package name */
    public static LinkedHashSet f128t = null;

    /* renamed from: u  reason: collision with root package name */
    public static ArrayList f129u = null;

    /* renamed from: v  reason: collision with root package name */
    public static int f130v = -1;

    /* renamed from: w  reason: collision with root package name */
    public static boolean f131w = false;

    /* renamed from: x  reason: collision with root package name */
    public static int f132x = -1;

    /* renamed from: y  reason: collision with root package name */
    public static AnonymousClass013 f133y;

    /* renamed from: z  reason: collision with root package name */
    public static final HashMap f134z = new HashMap();

    static {
        String str = "ۦ۬ۧۨۗۤۡ۫ۜ۬ۗۜۖۜ۟ۢۘۘ۫ۙۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 263) ^ 1667181538) {
                case -1810602380:
                    return;
                case -978985147:
                    str = "ۚۗۧ۠ۢۦ۟ۨۡۨۥۨۘۧۙۥۘ۬ۜۨۖ۠ۨۤ";
                    break;
                case -550746538:
                    str = "ۘۚۜۘۧۚۙۤ۠ۗۘۖ۠ۨۦۡ۠ۥۘ۠ۦۜۛۤ";
                    break;
                case 477831944:
                    str = "ۨۡۦۘۧۚ۬ۖۛۖ۫ۖۘۖۢۨۘۙۢۖۦۧۡۚ۫ۗۧۧۘ";
                    break;
                case 864496523:
                    str = "۫ۧۦۜۛۘۘ۠ۖۘۘۤۖۦۧۘۧۙۦۘۜۤ۟";
                    break;
                case 890352206:
                    str = "ۜ۫ۡۘۨ۟ۨۘۜۥۨۘۗۗۢۤۢۡۘ";
                    break;
                case 1824031765:
                    str = "ۥ۫ۡۧ۟ۢۧۢ۟۟ۖۛۨۜۖۘۤ۬ۧۜۢۥۘ";
                    break;
                case 2000645123:
                    str = "ۖ۟۠ۜۨۨۘۛۖۨۘۘۦ۠ۚۡۨۘۙ۬ۦۚۨۘۘ۬ۦ";
                    break;
            }
        }
    }

    public static void ArchiH(View view) {
        view.setVisibility(shp.getBoolean("Archv_chats") ? 8 : 0);
    }

    public static boolean ArchiTop(boolean z2) {
        if (shp.getBoolean("arch_chats_top")) {
            return z2;
        }
        return true;
    }

    public static void ArchivedChats(Activity activity) {
        try {
            others.MainBKC(activity.findViewById(getID("container", "id")));
            activity.setTitle(u1.k(activity.getTitle()));
        } catch (Exception e2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean AttBt() {
        /*
            java.lang.String r0 = "ۜۚۚۢۙۨۘۡۨۡ۠ۖۚۢۢۛۜۤۢۙۜ۟"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 790(0x316, float:1.107E-42)
            r3 = 737555765(0x2bf63535, float:1.7494119E-12)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -947291565: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "AttBt"
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.AttBt():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean Audio_ears() {
        /*
            java.lang.String r0 = "ۡ۟ۥ۠ۚۨ۫ۥۦۘۦۛۜۘ۫ۜۛۡۘۡۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 519(0x207, float:7.27E-43)
            r3 = 735702271(0x2bd9ecff, float:1.5484557E-12)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -38699476: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "Audio_ears"
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.Audio_ears():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean Audio_sensor() {
        /*
            java.lang.String r0 = "ۡ۫ۢۛۨۖۘۚ۠ۜۦۥۜۘۨۧۤۘۨۥۘۧۛۧ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 759(0x2f7, float:1.064E-42)
            r3 = -762846467(0xffffffffd287e2fd, float:-2.91814408E11)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1243495743: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "Audio_sensor"
            r1 = 1
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.Audio_sensor():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0102, code lost:
        r1 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean BlueTi(com.obwhatsapp.jobqueue.job.SendReadReceiptJob r10) {
        /*
            r1 = 1
            r2 = 0
            java.lang.String r0 = "yoBlueOnReply"
            boolean r4 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            java.lang.String r0 = r10.jid
            boolean r3 = isGroupJid(r0)
            r5 = -275045740(0xffffffffef9b2294, float:-9.602396E28)
            java.lang.String r0 = "ۥۨ۬۫ۜ۠ۙۗۢ۟ۦۘۥۘۥۨۢ۬ۘۘ"
        L_0x0013:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -2040480153: goto L_0x0045;
                case -2023573730: goto L_0x004a;
                case -308721718: goto L_0x001c;
                case 1107712367: goto L_0x004d;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x0013
        L_0x001c:
            r0 = r2
        L_0x001d:
            r5 = -123924358(0xfffffffff89d107a, float:-2.548515E34)
            java.lang.String r3 = "ۘۢۛۖۛ۠ۖۚۨۘۛۥ۬ۦۦ۬ۙ۫ۘۘۤۨۡۘۛۦ۬"
        L_0x0022:
            int r6 = r3.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -360426355: goto L_0x002b;
                case 155681142: goto L_0x006d;
                case 1412633738: goto L_0x0072;
                case 1644299296: goto L_0x0075;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0022
        L_0x002b:
            java.lang.String r1 = r10.jid
            java.lang.String r2 = stripJID(r1)
            r3 = -920240118(0xffffffffc926400a, float:-680960.6)
            java.lang.String r0 = "ۛۡۙۢ۟ۛۘۜۘۥۘۦۘۢۘۧۚ۟ۗ۬ۧ۠"
        L_0x0036:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1416924263: goto L_0x003f;
                case 227241084: goto L_0x018c;
                case 491998699: goto L_0x01a9;
                case 967169616: goto L_0x0196;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0036
        L_0x003f:
            java.lang.String r0 = "ۜۨۖۘۡۡۧۘۦۧۙۨۦۦۢۧۘۥۢۚۖۢۤۡۜ"
            goto L_0x0036
        L_0x0042:
            java.lang.String r0 = "ۚۗۥۘۧۦۦۘۢۙ۫ۖ۬ۙۨۦ۬"
            goto L_0x0013
        L_0x0045:
            if (r3 == 0) goto L_0x0042
            java.lang.String r0 = "ۜ۫ۥۘۧۨۡۡۙ۟ۦۘ۬۫ۨ۬۬ۥۡ"
            goto L_0x0013
        L_0x004a:
            java.lang.String r0 = "ۚۧۡۘۧۙۢ۫ۙۦۘۛ۠۫ۚۢۛۡ۬ۤۙ۠۬ۙۘۡۘ"
            goto L_0x0013
        L_0x004d:
            r3 = -414389177(0xffffffffe74cec47, float:-9.677213E23)
            java.lang.String r0 = "ۧۥۖ۬ۡۜ۠ۖۙۖ۟ۚۛۧۦ"
        L_0x0052:
            int r5 = r0.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case 178022596: goto L_0x005b;
                case 664015394: goto L_0x0068;
                case 708830343: goto L_0x001c;
                case 724755290: goto L_0x0061;
                default: goto L_0x005a;
            }
        L_0x005a:
            goto L_0x0052
        L_0x005b:
            java.lang.String r0 = "ۢۥ۟ۧ۬ۡۘۗۧۜۘۨۡ۬ۦ۬۠ۜ۟ۡۘ"
            goto L_0x0052
        L_0x005e:
            java.lang.String r0 = "۟ۤ۠ۛ۫ۢۛ۫ۖۘۚۜۡۘۡۘۨۘۤۤۡۤۘۙۖۘۘۛۛۡۘ"
            goto L_0x0052
        L_0x0061:
            java.lang.String r0 = r10.participant
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "ۛ۬۫۠ۛۧۖۛ۫۟۫ۜ۠ۘۜ۫ۨۦۘ۬ۦۦۘ"
            goto L_0x0052
        L_0x0068:
            r0 = r1
            goto L_0x001d
        L_0x006a:
            java.lang.String r3 = "۫ۡۤ۬۫ۨۘۦۚۡۗۨۛۜۧۦۘ"
            goto L_0x0022
        L_0x006d:
            if (r4 == 0) goto L_0x006a
            java.lang.String r3 = "ۗۘۢۦۚۦۤۗۜ۬ۦۘۖۦۦ"
            goto L_0x0022
        L_0x0072:
            java.lang.String r3 = "ۗۢۥۘۚ۠ۛۦۜ۟ۜۥۥۘ۟ۥۡۘۨ۫ۘۘ۫ۡۦۘۗ۫ۤ"
            goto L_0x0022
        L_0x0075:
            java.lang.String[] r4 = r10.messageIds
            r5 = 534183954(0x1fd70012, float:9.105616E-20)
            java.lang.String r3 = "ۤۚۚۗۦ۟۬ۗۜۘۛ۠ۥۨۤۙ"
        L_0x007c:
            int r6 = r3.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -772796126: goto L_0x002b;
                case -545450686: goto L_0x008b;
                case 250754735: goto L_0x0085;
                case 619967502: goto L_0x0090;
                default: goto L_0x0084;
            }
        L_0x0084:
            goto L_0x007c
        L_0x0085:
            java.lang.String r3 = "ۢۡۜۥۚ۬ۛ۫۠۫ۙۥۘۤۛۥۤۥۡۢۚۘۨۚۥۘ"
            goto L_0x007c
        L_0x0088:
            java.lang.String r3 = "ۡۦ۟ۚۨۗۙۦۥۘۨۙۖۨۥۡ۫ۥۘ"
            goto L_0x007c
        L_0x008b:
            if (r4 == 0) goto L_0x0088
            java.lang.String r3 = "ۤۤۧ۫ۘۢۜۦۘ۟ۗۛۜۤۨۡۡ"
            goto L_0x007c
        L_0x0090:
            r5 = 1253984478(0x4abe48de, float:6235247.0)
            java.lang.String r3 = "ۤۥۜۘۜۥ۟ۗۗۦ۟ۥۤۗ۠ۗۢۢۤ"
        L_0x0095:
            int r6 = r3.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1225721770: goto L_0x009e;
                case -514286535: goto L_0x00d0;
                case 829250823: goto L_0x00d5;
                case 1114873537: goto L_0x0124;
                default: goto L_0x009d;
            }
        L_0x009d:
            goto L_0x0095
        L_0x009e:
            java.lang.String r3 = java.util.Arrays.toString(r4)     // Catch:{ Exception -> 0x016c }
            com.obwhatsapp.yo.a r4 = f126r     // Catch:{ Exception -> 0x016c }
            java.lang.String r5 = r10.jid     // Catch:{ Exception -> 0x016c }
            r4.getClass()     // Catch:{ Exception -> 0x016c }
            long r6 = com.obwhatsapp.yo.a.a(r5, r3)     // Catch:{ Exception -> 0x016c }
            r4 = 1298495774(0x4d65791e, float:2.4062E8)
            java.lang.String r3 = "ۙۡۙۙ۠ۥۘ۠۠۬ۚۛۥۘ۠ۧۗۛ۬۫۬ۘۖۙ۟ۤۗۧ"
        L_0x00b2:
            int r5 = r3.hashCode()     // Catch:{ Exception -> 0x016c }
            r5 = r5 ^ r4
            switch(r5) {
                case -1966230017: goto L_0x00e4;
                case -172872323: goto L_0x00db;
                case 157169406: goto L_0x00bb;
                case 883153798: goto L_0x00e7;
                default: goto L_0x00ba;
            }
        L_0x00ba:
            goto L_0x00b2
        L_0x00bb:
            r3 = r2
        L_0x00bc:
            r5 = 34640844(0x21093cc, float:1.0621865E-37)
            java.lang.String r4 = "ۧۢۜۦۘۥۚۤۢۦ۬ۗۘ۫ۧۛۘ"
        L_0x00c1:
            int r8 = r4.hashCode()
            r8 = r8 ^ r5
            switch(r8) {
                case -1755904440: goto L_0x0103;
                case -223051446: goto L_0x00ec;
                case 1217372863: goto L_0x00f1;
                case 1781115737: goto L_0x00ca;
                default: goto L_0x00c9;
            }
        L_0x00c9:
            goto L_0x00c1
        L_0x00ca:
            java.lang.String r4 = "ۚۗۦۘ۫ۧۨۘۖۡۥۧ۟ۨۜۢۙۢۤۚۢۤ۫ۦ۫۫"
            goto L_0x00c1
        L_0x00cd:
            java.lang.String r3 = "ۗۗۡۘۤ۫ۖۘ۫ۘۚۛۤۧۢۥ۫ۖۘ۬ۜۨۥۘ۠۠ۧۢ۬"
            goto L_0x0095
        L_0x00d0:
            if (r0 == 0) goto L_0x00cd
            java.lang.String r3 = "ۢۚۧۙۗۨۘۙۖ۫ۢۖۢۦۤۘۘۜۘۡۘ۬۫ۢۥۚۚۖ۟"
            goto L_0x0095
        L_0x00d5:
            java.lang.String r3 = "ۖ۠ۘۘۖۖۘۥ۟ۖۘۛ۬ۡۘۜۜۘۦۜۖۘۦۢۢ"
            goto L_0x0095
        L_0x00d8:
            java.lang.String r3 = "ۦۧۘۘۜۛۘ۠۫ۙۥ۟ۡۘۨۥۤ"
            goto L_0x00b2
        L_0x00db:
            r8 = -1
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x00d8
            java.lang.String r3 = "ۙۥۤۘ۟ۖۡۗ۟۠۟ۘۦ۫ۥۘۜۢ۟ۡ۟ۙ"
            goto L_0x00b2
        L_0x00e4:
            java.lang.String r3 = "۬ۥ۟۠ۢ۫ۙۚۨۘ۟ۢۨۘۚۧ۬"
            goto L_0x00b2
        L_0x00e7:
            r3 = r1
            goto L_0x00bc
        L_0x00e9:
            java.lang.String r4 = "ۦۜۖۘۚۢۥۘۜۛۦۘ۬ۖۖۢۦۧ۟"
            goto L_0x00c1
        L_0x00ec:
            if (r3 == 0) goto L_0x00e9
            java.lang.String r4 = "ۙ۟ۘۤۦۧۘۛۘۥۘۘۗۦۜۡۖۦۤۥۘ۫ۚ۠ۤۖۡۥ۬"
            goto L_0x00c1
        L_0x00f1:
            android.os.Handler r3 = new android.os.Handler     // Catch:{ Exception -> 0x016c }
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x016c }
            r3.<init>(r4)     // Catch:{ Exception -> 0x016c }
            com.obwhatsapp.yo.s1 r4 = new com.obwhatsapp.yo.s1     // Catch:{ Exception -> 0x016c }
            r4.<init>(r6)     // Catch:{ Exception -> 0x016c }
            r3.post(r4)     // Catch:{ Exception -> 0x016c }
        L_0x0102:
            r1 = r2
        L_0x0103:
            r4 = -950692983(0xffffffffc7559389, float:-54675.535)
            java.lang.String r3 = "ۢۦۢۤ۬ۚ۟ۖۘۘۗ۟ۦۘۜ۬ۙۜۡۨۘۜ۟ۚ۟ۚ"
        L_0x0108:
            int r5 = r3.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1431156060: goto L_0x01a8;
                case -1384234865: goto L_0x0111;
                case 1282114608: goto L_0x0180;
                case 2129628780: goto L_0x0185;
                default: goto L_0x0110;
            }
        L_0x0110:
            goto L_0x0108
        L_0x0111:
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            com.obwhatsapp.yo.p1 r2 = new com.obwhatsapp.yo.p1
            r2.<init>((com.obwhatsapp.jobqueue.job.SendReadReceiptJob) r10, (boolean) r0)
            r1.post(r2)
            goto L_0x002b
        L_0x0124:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016c }
            r3.<init>()     // Catch:{ Exception -> 0x016c }
            java.lang.String[] r4 = r10.messageIds     // Catch:{ Exception -> 0x016c }
            r5 = 0
            r4 = r4[r5]     // Catch:{ Exception -> 0x016c }
            r3.append(r4)     // Catch:{ Exception -> 0x016c }
            java.lang.String r4 = "rpass"
            r3.append(r4)     // Catch:{ Exception -> 0x016c }
            java.lang.String r4 = r3.toString()     // Catch:{ Exception -> 0x016c }
            r5 = 1088807010(0x40e5e062, float:7.1836405)
            java.lang.String r3 = "۬ۡۖۘۗۛ۫ۢۧۡۙ۫۟ۤۗۨۘ"
        L_0x013f:
            int r6 = r3.hashCode()     // Catch:{ Exception -> 0x016c }
            r6 = r6 ^ r5
            switch(r6) {
                case -1086032922: goto L_0x0171;
                case -532756879: goto L_0x017a;
                case -212949996: goto L_0x0103;
                case 66360735: goto L_0x0148;
                default: goto L_0x0147;
            }     // Catch:{ Exception -> 0x016c }
        L_0x0147:
            goto L_0x013f
        L_0x0148:
            com.obwhatsapp.yo.shp.removePrivKey(r4)     // Catch:{ Exception -> 0x016c }
            java.lang.String r3 = r10.jid     // Catch:{ Exception -> 0x016c }
            java.lang.String[] r4 = r10.messageIds     // Catch:{ Exception -> 0x016c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016c }
            r5.<init>()     // Catch:{ Exception -> 0x016c }
            java.lang.String r3 = stripJID(r3)     // Catch:{ Exception -> 0x016c }
            r5.append(r3)     // Catch:{ Exception -> 0x016c }
            java.lang.String r3 = "_bluedmsgs"
            r5.append(r3)     // Catch:{ Exception -> 0x016c }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x016c }
            java.lang.String r4 = java.util.Arrays.toString(r4)     // Catch:{ Exception -> 0x016c }
            com.obwhatsapp.yo.shp.setStringPriv(r3, r4)     // Catch:{ Exception -> 0x016c }
            goto L_0x0102
        L_0x016c:
            r3 = move-exception
            goto L_0x0103
        L_0x016e:
            java.lang.String r3 = "۬ۘۜۘ۫ۥۤ۬ۚۜۘۚۖۢ۬۟ۜۜۙۢ"
            goto L_0x013f
        L_0x0171:
            boolean r3 = com.obwhatsapp.yo.shp.getBooleanPriv(r4)     // Catch:{ Exception -> 0x016c }
            if (r3 == 0) goto L_0x016e
            java.lang.String r3 = "ۨ۬ۢۚۨۘۘۛۥ۫ۖۡ۬۫ۛۜ۟۠ۦۘ"
            goto L_0x013f
        L_0x017a:
            java.lang.String r3 = "ۙۦۘۢۛۡۘ۫ۖۥۙۤۘ۫۠ۧۤۜۖۘ۠ۗۘۘۥۤۘ۟ۡۡۘ"
            goto L_0x013f
        L_0x017d:
            java.lang.String r3 = "ۜۙۡۘ۠ۢ۟ۥۛۤۘۦۢ۫ۚۘۘۦۗۜ"
            goto L_0x0108
        L_0x0180:
            if (r1 == 0) goto L_0x017d
            java.lang.String r3 = "ۨۘۦۘ۬۬ۖۘۗۥۘۥۧۡۘ۫ۜۡۘ۟۫ۨۦ۬ۢۘۦۧۘۗۢۖ"
            goto L_0x0108
        L_0x0185:
            java.lang.String r3 = "ۨۨۜۘۜ۟ۦۧ۬ۜۧۙۖۤۛۧ۠ۤۜۘۢ۟۟ۡۗۛ۬۠ۥۘ"
            goto L_0x0108
        L_0x0188:
            java.lang.String r0 = "۟ۡۢۚ۟ۧۜۨۢۚۙۘۘ۠ۗۡۘ"
            goto L_0x0036
        L_0x018c:
            boolean r0 = wantsSpecific(r2)
            if (r0 == 0) goto L_0x0188
            java.lang.String r0 = "ۤ۟۟ۛ۬۫۠۬ۚ۠۟ۡۘ۠ۘۙ"
            goto L_0x0036
        L_0x0196:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "yoHideRead_"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
        L_0x01a4:
            boolean r2 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
        L_0x01a8:
            return r2
        L_0x01a9:
            java.lang.String r1 = r1.toString()
            r2 = 1409278901(0x53ffe3b5, float:2.1980739E12)
            java.lang.String r0 = "ۗۙۦۘ۬ۗۤ۟ۜۥۜۛۨۘۤ۬ۧۡۖۡۘۧۘۘۘۡ۬ۥۘ"
        L_0x01b2:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -269480608: goto L_0x01cc;
                case -136865672: goto L_0x01d5;
                case 523191709: goto L_0x01bb;
                case 1118954837: goto L_0x01c9;
                default: goto L_0x01ba;
            }
        L_0x01ba:
            goto L_0x01b2
        L_0x01bb:
            java.lang.String r0 = "@g.us"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x01c6
            java.lang.String r0 = "ۙۨۙۨۛۥ۠ۘۡۨۖۗۡۢۘۧۚۦۘۢۜۡۘۧۗۨۘۥ۟۟"
            goto L_0x01b2
        L_0x01c6:
            java.lang.String r0 = "ۤ۟۠ۥ۠ۜۜۦۘۦۧۤۛۢۨۘۛۖ۠ۡۦۦۘۡۨ۠ۙۡ"
            goto L_0x01b2
        L_0x01c9:
            java.lang.String r0 = "۫ۖۦۖۜۧۘ۠ۢۡۗۗۢ۬ۘۡۡۨۢۖۚۖۘۚۤ۠"
            goto L_0x01b2
        L_0x01cc:
            java.lang.String r0 = "G"
        L_0x01ce:
            java.lang.String r1 = "yoHideRead"
            java.lang.String r0 = r1.concat(r0)
            goto L_0x01a4
        L_0x01d5:
            r2 = 1759317503(0x68dd0dff, float:8.3512094E24)
            java.lang.String r0 = "ۧۚۘۡۨۥۘ۬۟ۨۘۨۨۘ۟۫ۥ"
        L_0x01da:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1826810938: goto L_0x01f7;
                case -1613317163: goto L_0x01f4;
                case -368733988: goto L_0x01e9;
                case -89776870: goto L_0x01e3;
                default: goto L_0x01e2;
            }
        L_0x01e2:
            goto L_0x01da
        L_0x01e3:
            java.lang.String r0 = "۠ۜۦۗۗ۬ۗۥۥۘۡۜۦۘۤۜۖۘ"
            goto L_0x01da
        L_0x01e6:
            java.lang.String r0 = "ۗ۬ۜ۠ۘۖۘۢۙۜۘۖ۠ۗۧۧ"
            goto L_0x01da
        L_0x01e9:
            java.lang.String r0 = "@s.whatsapp.net"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x01e6
            java.lang.String r0 = "ۥۙ۠ۢۤۦۘ۟ۙ۠ۗۛۡۘۡ۟ۤ"
            goto L_0x01da
        L_0x01f4:
            java.lang.String r0 = "C"
            goto L_0x01ce
        L_0x01f7:
            r2 = -1864607502(0xffffffff90dc58f2, float:-8.691174E-29)
            java.lang.String r0 = "ۢۥۗۘ۟ۖۘۨۘۘۗ۫ۘۧۖۥۤۥ۫"
        L_0x01fc:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1618959693: goto L_0x0216;
                case 518633492: goto L_0x0205;
                case 1658262591: goto L_0x020b;
                case 1796710795: goto L_0x0219;
                default: goto L_0x0204;
            }
        L_0x0204:
            goto L_0x01fc
        L_0x0205:
            java.lang.String r0 = "ۨۘ۟ۧۦۨۘۥۗۖۨۧۥۘۘۙ۬ۧۡۘۘۡۤۢۜ۫"
            goto L_0x01fc
        L_0x0208:
            java.lang.String r0 = "ۥ۠ۗ۠۟ۜۜ۬ۦۜۤۥۨۚۨۘۦ۟ۜ"
            goto L_0x01fc
        L_0x020b:
            java.lang.String r0 = "status@broadcast"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0208
            java.lang.String r0 = "ۢۡۥ۫ۧۜۤۦۧۙۖۧۤۜۢۖۡۥۚۛۖ"
            goto L_0x01fc
        L_0x0216:
            java.lang.String r0 = "SB"
            goto L_0x01ce
        L_0x0219:
            java.lang.String r0 = "B"
            goto L_0x01ce
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.BlueTi(com.obwhatsapp.jobqueue.job.SendReadReceiptJob):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r0 = X.AnonymousClass00T.A04(getCtx(), r13);
        com.obwhatsapp.yo.Conversation.a(true, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r0 = X.AnonymousClass00T.A04(getCtx(), r13);
        com.obwhatsapp.yo.Conversation.a(false, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable BubbleStyle(android.content.Context r12, int r13, int r14) {
        /*
            r7 = 4
            r5 = 0
            r8 = 3
            r6 = 2
            r9 = 1
            java.lang.String r0 = "bubble_style"
            java.lang.String r1 = "yousef"
            java.lang.String r0 = com.obwhatsapp.yo.shp.getPrefString(r0, r1)     // Catch:{ Exception -> 0x017c }
            r2 = -183639312(0xfffffffff50de2f0, float:-1.7986247E32)
            java.lang.String r1 = "ۨۖۥۧۜۘۘۗۨۢۡۙۥۨۧۘۦ۟ۘۦۜۗ"
        L_0x0012:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x017c }
            r3 = r3 ^ r2
            switch(r3) {
                case 487921586: goto L_0x0029;
                case 490856867: goto L_0x001b;
                case 2040414564: goto L_0x002c;
                case 2133195579: goto L_0x002e;
                default: goto L_0x001a;
            }     // Catch:{ Exception -> 0x017c }
        L_0x001a:
            goto L_0x0012
        L_0x001b:
            java.lang.String r1 = "3d"
            boolean r1 = r0.equals(r1)     // Catch:{ Exception -> 0x017c }
            if (r1 == 0) goto L_0x0026
            java.lang.String r1 = "۟ۨۥۖۙ۬ۢ۫ۧ۠ۗۦۤۙۤۡ۟۫۬ۜۗۗۦۘۘۢۥ۟"
            goto L_0x0012
        L_0x0026:
            java.lang.String r1 = "ۦۢۤۦۢ۠ۧۡۥۘۖۤۜۘۘۘۢۤ۠ۘۘ"
            goto L_0x0012
        L_0x0029:
            java.lang.String r1 = "ۦۗۚ۠ۨ۬ۡ۟ۧۖۘۖۘۖۖۜۦ۠ۡۡۗۛ۫ۤۖ۫ۦۤ"
            goto L_0x0012
        L_0x002c:
            java.lang.String r0 = "d3"
        L_0x002e:
            r2 = 1208730863(0x480bc4ef, float:143123.73)
            java.lang.String r1 = "ۦۡۢۧۖۜۤۛۥۘۢۙۚۘ۬ۜۘۨۢ۫ۚۡۡۨۛۚ"
        L_0x0033:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x017c }
            r3 = r3 ^ r2
            switch(r3) {
                case -1092393567: goto L_0x0052;
                case -494904465: goto L_0x003c;
                case -269301108: goto L_0x01b5;
                case 1771114484: goto L_0x0042;
                default: goto L_0x003b;
            }     // Catch:{ Exception -> 0x017c }
        L_0x003b:
            goto L_0x0033
        L_0x003c:
            java.lang.String r1 = "۠ۢۙۛ۬ۡۙ۬ۧۨۖۡۥ۟۠ۗ۠ۛۘۢۜ"
            goto L_0x0033
        L_0x003f:
            java.lang.String r1 = "۬ۛ۠ۥۘۨۡۨۜۥۛۦۚۤ۬"
            goto L_0x0033
        L_0x0042:
            java.lang.String r1 = "_balloon_incoming_normal"
            java.lang.String r1 = r0.concat(r1)     // Catch:{ Exception -> 0x017c }
            int r1 = com.obwhatsapp.yo.ids.getId(r1)     // Catch:{ Exception -> 0x017c }
            r3 = -1
            if (r1 != r3) goto L_0x003f
            java.lang.String r1 = "ۧۦۧۛ۟ۥۧۢۥۘۖۘ۟ۤۖۜ۟۠ۢۡۙۘۘۦۡ"
            goto L_0x0033
        L_0x0052:
            java.lang.String r0 = "yousef"
            r4 = r0
        L_0x0055:
            r1 = 2009437351(0x77c594a7, float:8.014824E33)
            java.lang.String r0 = "ۗۜ۫ۦۗ۟۬۟۟ۛۘۛۦ۟ۜۘۡۚۖۘۧۖۦۢۗۗ"
        L_0x005a:
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x017c }
            r2 = r2 ^ r1
            switch(r2) {
                case -800754916: goto L_0x00bd;
                case 414887058: goto L_0x00af;
                case 1575755727: goto L_0x00ba;
                case 1586824816: goto L_0x0063;
                default: goto L_0x0062;
            }     // Catch:{ Exception -> 0x017c }
        L_0x0062:
            goto L_0x005a
        L_0x0063:
            java.lang.String r0 = "_balloon_incoming_normal"
            java.lang.String r0 = r4.concat(r0)     // Catch:{ Exception -> 0x017c }
            int r3 = com.obwhatsapp.yo.ids.getId(r0)     // Catch:{ Exception -> 0x017c }
            java.lang.String r0 = "_balloon_outgoing_normal"
            java.lang.String r0 = r4.concat(r0)     // Catch:{ Exception -> 0x017c }
            int r2 = com.obwhatsapp.yo.ids.getId(r0)     // Catch:{ Exception -> 0x017c }
            java.lang.String r0 = "_balloon_outgoing_normal_ext"
            java.lang.String r0 = r4.concat(r0)     // Catch:{ Exception -> 0x017c }
            int r1 = com.obwhatsapp.yo.ids.getId(r0)     // Catch:{ Exception -> 0x017c }
            java.lang.String r0 = "_balloon_incoming_normal_ext"
            java.lang.String r0 = r4.concat(r0)     // Catch:{ Exception -> 0x017c }
            int r0 = com.obwhatsapp.yo.ids.getId(r0)     // Catch:{ Exception -> 0x017c }
        L_0x008b:
            r10 = 679862954(0x2885e2aa, float:1.4864266E-14)
            java.lang.String r4 = "ۗۖۙۚۛ۠ۨۦۢ۟ۧۦۘ۟ۗۦۥ۠ۤۚ۬۬"
        L_0x0090:
            int r11 = r4.hashCode()
            r11 = r11 ^ r10
            switch(r11) {
                case -1715904378: goto L_0x00ca;
                case -912268575: goto L_0x0099;
                case 522901740: goto L_0x00c5;
                case 1348496664: goto L_0x0138;
                default: goto L_0x0098;
            }
        L_0x0098:
            goto L_0x0090
        L_0x0099:
            r4 = -1876005297(0xffffffff902e6e4f, float:-3.4400428E-29)
            java.lang.String r3 = "ۛۨۛۧۧ۫ۛۨۜۡۢۡۦۚۜۘۧۜ۟۠ۖۖ۫ۧۢ"
        L_0x009e:
            int r10 = r3.hashCode()
            r10 = r10 ^ r4
            switch(r10) {
                case 72141949: goto L_0x00a7;
                case 328111022: goto L_0x0135;
                case 630884688: goto L_0x00d3;
                case 2027342694: goto L_0x00d0;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            goto L_0x009e
        L_0x00a7:
            if (r13 == r9) goto L_0x00cd
            java.lang.String r3 = "ۧۧۙۢ۬ۨ۟۫ۡۘۨۨۧۘۙۢۥۘۖۚۧۦۡ"
            goto L_0x009e
        L_0x00ac:
            java.lang.String r0 = "ۙۡۛۙۘۦۡ۬ۜۘۦۨ۫ۗۨۚ"
            goto L_0x005a
        L_0x00af:
            java.lang.String r0 = "yousef"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x017c }
            if (r0 != 0) goto L_0x00ac
            java.lang.String r0 = "ۧۖۦ۠ۥۦۘۡۨۘۧۜۜۡۖۢۗۗۨۘۜۙۤۗۡ۠"
            goto L_0x005a
        L_0x00ba:
            java.lang.String r0 = "ۧ۠ۖۗۜۧۛۤ۬ۗۨ۬ۖۖۘۘۢ۠ۥۘۛۧۢۘۥ۟ۖۚۥ"
            goto L_0x005a
        L_0x00bd:
            r0 = r14
            r1 = r14
            r2 = r14
            r3 = r14
            goto L_0x008b
        L_0x00c2:
            java.lang.String r4 = "۫۟ۖۥۥۥۡۧۤ۫ۗۘۧۜ۫۬ۙ"
            goto L_0x0090
        L_0x00c5:
            if (r13 == 0) goto L_0x00c2
            java.lang.String r4 = "ۖۥ۬ۚۘ۫ۙۗۜۘۥۦۧۘۖۗ۬ۘ۫ۦۘ۠ۗۨ۠ۗۥۢۜۗ"
            goto L_0x0090
        L_0x00ca:
            java.lang.String r4 = "ۖۙۧ۠ۙۢۢۥ۠۬ۧۚۧۖۖۥۥ۫ۥۥۥۘۘۚ۟۬ۥۥۘ"
            goto L_0x0090
        L_0x00cd:
            java.lang.String r3 = "ۤۙۡۡۗ۫۠ۤۡۖۗۥ۠ۘۥۡۘۦۘۗۨۘ"
            goto L_0x009e
        L_0x00d0:
            java.lang.String r3 = "ۧ۟ۚۡۨۡۘ۠ۗۢۘۜۥۘۨۡۜ۟ۨۧۘۘۧۜۘ۫۫ۥ"
            goto L_0x009e
        L_0x00d3:
            r3 = 1507697384(0x59dda2e8, float:7.7981359E15)
            java.lang.String r2 = "ۧۗۘۤ۠ۛۨۚۛۨۗۢ۟۫ۥ۫ۗ۠ۖۢۥۖۡ۫"
        L_0x00d8:
            int r4 = r2.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1626607227: goto L_0x00ec;
                case -809655093: goto L_0x00e7;
                case -105495770: goto L_0x0132;
                case 2114628120: goto L_0x00e1;
                default: goto L_0x00e0;
            }
        L_0x00e0:
            goto L_0x00d8
        L_0x00e1:
            java.lang.String r2 = "ۗۤۖۢۥ۬ۦۤۨۡۘ۫ۥۤۗ۬۫"
            goto L_0x00d8
        L_0x00e4:
            java.lang.String r2 = "ۨ۠ۤۦۜۨۘۖۡۥۘ۟ۡۨۘۚۥۘۘۤ۬ۦۘۨۗۙۦۛۦ"
            goto L_0x00d8
        L_0x00e7:
            if (r13 == r6) goto L_0x00e4
            java.lang.String r2 = "ۥۚۨۘۜۙۡۚۨۚ۬ۖۢۢۖۧۘۤۦۜۘ۫ۧۚ"
            goto L_0x00d8
        L_0x00ec:
            r2 = -678987019(0xffffffffd7877af5, float:-2.97924332E14)
            java.lang.String r1 = "ۥۡۚۛۡۘۘۡ۟ۡۘۛ۠ۧۡ۟۠ۛ۬ۥ"
        L_0x00f1:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1535897906: goto L_0x00fa;
                case -1138804594: goto L_0x0105;
                case 727869463: goto L_0x0102;
                case 862619436: goto L_0x012f;
                default: goto L_0x00f9;
            }
        L_0x00f9:
            goto L_0x00f1
        L_0x00fa:
            if (r13 == r8) goto L_0x00ff
            java.lang.String r1 = "ۦۧۨۘ۟ۙۚۢۦۨۘۛۙۗۨۨۖۘۚۖۖ"
            goto L_0x00f1
        L_0x00ff:
            java.lang.String r1 = "۠۠ۤ۟ۢۜۘۨۢۜ۬ۢۗۘۥۘ۟ۚۢ۬ۚۥ"
            goto L_0x00f1
        L_0x0102:
            java.lang.String r1 = "ۗۖۨۘۤۧ۠۟ۤۘۘ۠ۚ۫ۜ۫ۗۗۨ"
            goto L_0x00f1
        L_0x0105:
            r4 = r5
        L_0x0106:
            r1 = 1086698923(0x40c5b5ab, float:6.1784263)
            java.lang.String r0 = "ۨۨۥۘۢۡۧۘ۬ۛۤۗ۬ۘۖ۠ۡ۟ۢۙ۠۫ۤۥۦۡ"
        L_0x010b:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1740675524: goto L_0x013e;
                case -805049923: goto L_0x0146;
                case -154356346: goto L_0x0143;
                case 2040138899: goto L_0x0114;
                default: goto L_0x0113;
            }
        L_0x0113:
            goto L_0x010b
        L_0x0114:
            r1 = 1775544510(0x69d4a8be, float:3.2136142E25)
            java.lang.String r0 = "ۤۥۧۦۚۜۘۡۧۗۥ۟ۘۘ۬ۖۥۙ۟ۢ"
        L_0x0119:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case 451498559: goto L_0x0122;
                case 949611528: goto L_0x014b;
                case 1160275925: goto L_0x0150;
                case 2038207513: goto L_0x0153;
                default: goto L_0x0121;
            }
        L_0x0121:
            goto L_0x0119
        L_0x0122:
            android.content.Context r0 = getCtx()     // Catch:{ Exception -> 0x017c }
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r0, r13)     // Catch:{ Exception -> 0x017c }
            r1 = 1
            com.obwhatsapp.yo.Conversation.a(r1, r0)     // Catch:{ Exception -> 0x017c }
        L_0x012e:
            return r0
        L_0x012f:
            r4 = r6
            r13 = r0
            goto L_0x0106
        L_0x0132:
            r4 = r7
            r13 = r1
            goto L_0x0106
        L_0x0135:
            r4 = r8
            r13 = r2
            goto L_0x0106
        L_0x0138:
            r4 = r9
            r13 = r3
            goto L_0x0106
        L_0x013b:
            java.lang.String r0 = "ۦ۟ۧۨۥۙۚۗ۠ۗ۠ۖۘۗۡۗۗۖۚ۫ۖۖ۠ۤۡۘ"
            goto L_0x010b
        L_0x013e:
            if (r13 > 0) goto L_0x013b
            java.lang.String r0 = "ۢۙۖۘۖۥ۟ۧۛۧ۬ۦۘۜۜۘ۬ۖۦۘ۠ۙۖۘ"
            goto L_0x010b
        L_0x0143:
            java.lang.String r0 = "ۙۛ۟ۧ۟ۘۘۛۖۨۘۚۨۦ۠ۢ۟ۢۖۜۘۡۗۡ"
            goto L_0x010b
        L_0x0146:
            r13 = r14
            goto L_0x0114
        L_0x0148:
            java.lang.String r0 = "ۜۙۜۘۧ۫ۨۦۥۖۨۧۦۘۨۜ۠ۛۛۛۢۚۥ"
            goto L_0x0119
        L_0x014b:
            if (r4 == r8) goto L_0x0148
            java.lang.String r0 = "ۥۡۨۘۚۤۦۤ۟ۘۘۥۛۜ۠ۜۘۘ۟ۢۜۘۦۨۧۘۗۢ۟"
            goto L_0x0119
        L_0x0150:
            java.lang.String r0 = "ۧۚۨۗۨۡ۫ۜۖۨۙۦۘۖ۫ۖۥۤ۠ۨ۫ۡۘ"
            goto L_0x0119
        L_0x0153:
            r1 = -417648105(0xffffffffe71b3217, float:-7.328908E23)
            java.lang.String r0 = "ۚۢۥۘۦۜۦۘۛ۫ۡۨۙ۫ۚۨۦۘۘۘ۠۟۟"
        L_0x0158:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1184862595: goto L_0x0122;
                case -1174534572: goto L_0x0161;
                case -705706095: goto L_0x018e;
                case 872214435: goto L_0x0189;
                default: goto L_0x0160;
            }
        L_0x0160:
            goto L_0x0158
        L_0x0161:
            r1 = 1440227658(0x55d8214a, float:2.97046859E13)
            java.lang.String r0 = "ۡۨۡۡۡۢۘ۬ۙۢ۬ۗۛۡ"
        L_0x0166:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -440229982: goto L_0x019c;
                case 173102608: goto L_0x0199;
                case 1992603080: goto L_0x016f;
                case 2040184060: goto L_0x0194;
                default: goto L_0x016e;
            }
        L_0x016e:
            goto L_0x0166
        L_0x016f:
            android.content.Context r0 = getCtx()     // Catch:{ Exception -> 0x017c }
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r0, r13)     // Catch:{ Exception -> 0x017c }
            r1 = 0
            com.obwhatsapp.yo.Conversation.a(r1, r0)     // Catch:{ Exception -> 0x017c }
            goto L_0x012e
        L_0x017c:
            r0 = move-exception
        L_0x017d:
            android.content.Context r0 = getCtx()
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r0, r14)
            goto L_0x012e
        L_0x0186:
            java.lang.String r0 = "ۙۜۡۘۘۘۘ۟۫ۤۛۚۚ۠ۢ"
            goto L_0x0158
        L_0x0189:
            if (r4 != r7) goto L_0x0186
            java.lang.String r0 = "ۚۨۖۘۥ۫ۥۘ۠ۖۡۘۜۧۚۢۡ۠ۢ۠"
            goto L_0x0158
        L_0x018e:
            java.lang.String r0 = "ۘ۬ۘۘۚۤۥۘۜۘۜۦۘۛۜۖۥۘۢۥۥۘۜ۠ۥۘۢ۬ۨ"
            goto L_0x0158
        L_0x0191:
            java.lang.String r0 = "۠ۖ۠ۨۛۙۡۢۘۨۗۢ۟ۥۗۛۦۦ"
            goto L_0x0166
        L_0x0194:
            if (r4 == r9) goto L_0x0191
            java.lang.String r0 = "ۥۙۡۘۢۙۜۘ۟ۦۖۘۛۜۨۘۧۢۚۡۛۘۘۘۤۤ۫ۛۡ"
            goto L_0x0166
        L_0x0199:
            java.lang.String r0 = "ۢۙۤۧ۟ۧۖ۫ۢۨ۬ۙۗۖۘۘ۬ۙۦۘ"
            goto L_0x0166
        L_0x019c:
            r1 = 1526294536(0x5af96808, float:3.51008264E16)
            java.lang.String r0 = "۬ۧۛ۠ۤۢ۬ۜۛۜۦۥۢ۟ۡۦۖۗ"
        L_0x01a1:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case 376752729: goto L_0x01b0;
                case 1131321545: goto L_0x017d;
                case 1342529073: goto L_0x01aa;
                case 1729099724: goto L_0x016f;
                default: goto L_0x01a9;
            }
        L_0x01a9:
            goto L_0x01a1
        L_0x01aa:
            java.lang.String r0 = "ۜ۫ۖۘۡۚۚۡۚۦۚۡۧۙۥۨۘۤۦۖۘۘۖۧۦۧ۫"
            goto L_0x01a1
        L_0x01ad:
            java.lang.String r0 = "ۧۢۗۧۤ۬ۢۡۦۘۦۜۨۘ۟ۖۘۘ"
            goto L_0x01a1
        L_0x01b0:
            if (r4 != r6) goto L_0x01ad
            java.lang.String r0 = "ۡۤۖۘۧۢ۫۟ۡۘۘۛ۬۬ۜ۫ۦۘۛ۠ۘۘۛۜۦ۟ۖۖۧۤۤ"
            goto L_0x01a1
        L_0x01b5:
            r4 = r0
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.BubbleStyle(android.content.Context, int, int):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        r0 = "ۘۡۜ۠ۧۚۜ۫ۘۘۦ۫۫ۤۢۨۜ۬ۖ۠ۜۜۘۧ۬ۜ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void ChangeSize(android.widget.TextView r12, int r13) {
        /*
            r7 = -1
            r2 = 0
            java.lang.String r0 = "ۦۙۜۘۧۗۖۘۤۦۧۘۧۗۘۙۦۦۘۙۚۦۘۛۥ۟ۧۥۘ۟۬ۥۘ"
            r1 = r2
            r3 = r2
            r5 = r2
            r6 = r2
            r4 = r2
            r8 = r2
        L_0x000a:
            int r9 = r0.hashCode()
            r10 = 800(0x320, float:1.121E-42)
            r11 = 1306155866(0x4dda5b5a, float:4.57927488E8)
            r9 = r9 ^ r10
            r9 = r9 ^ r11
            switch(r9) {
                case -2145125988: goto L_0x0040;
                case -2111613051: goto L_0x00bd;
                case -2031297503: goto L_0x001f;
                case -1957165839: goto L_0x0019;
                case -1686572933: goto L_0x00d1;
                case -1426593550: goto L_0x00dd;
                case -1016696596: goto L_0x0091;
                case -837476179: goto L_0x0129;
                case -814450435: goto L_0x0125;
                case -401926566: goto L_0x003b;
                case -373306705: goto L_0x0129;
                case -41322948: goto L_0x00b8;
                case 43658247: goto L_0x0109;
                case 162266646: goto L_0x00c2;
                case 264093124: goto L_0x001c;
                case 358738510: goto L_0x0044;
                case 389026240: goto L_0x0101;
                case 452849649: goto L_0x00c6;
                case 760713448: goto L_0x006d;
                case 840884224: goto L_0x00fc;
                case 1837675274: goto L_0x0119;
                case 1940822025: goto L_0x0060;
                case 1943908608: goto L_0x010e;
                case 1985650847: goto L_0x00cb;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x000a
        L_0x0019:
            java.lang.String r0 = "۠۬ۤۨۜ۫ۡ۠ۘۘ۟ۘۖۘۨۙ۟۟ۦۚۧۙۖۡۡ۬ۢۚۜ"
            goto L_0x000a
        L_0x001c:
            java.lang.String r0 = "۬ۤۘۥۘۘۚۥ۫ۘ۫ۤۧۤۥۡۧۚۥ۠ۘ"
            goto L_0x000a
        L_0x001f:
            r9 = 647900774(0x269e2e66, float:1.0976029E-15)
            java.lang.String r0 = "ۗ۫ۘۥۦۛۦۢۚۤ۟ۥۤ۫۠"
        L_0x0024:
            int r10 = r0.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -1689104072: goto L_0x0038;
                case -1663791631: goto L_0x0033;
                case -164857168: goto L_0x002d;
                case 1737404450: goto L_0x0115;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x0024
        L_0x002d:
            java.lang.String r0 = "۠ۘ۟۫ۢۘۡۧ۠ۦۙۨۘۗۨۢۚۛۤ"
            goto L_0x000a
        L_0x0030:
            java.lang.String r0 = "ۨۥۡۧۚ۠۠ۧۖۘ۟ۢۛۘۙۚۥۙ۟۠ۖۛۥۦۥۘۛۧۡۘ"
            goto L_0x0024
        L_0x0033:
            if (r12 != 0) goto L_0x0030
            java.lang.String r0 = "۠ۦۡۘۨ۠ۚۖۚۤۥۥۡۘۡ۟ۦۘ۟ۙ۬ۛۖۥۘ"
            goto L_0x0024
        L_0x0038:
            java.lang.String r0 = "ۖۦۨۚۗ۟ۙۦۚۨۖۨۘۢۦۢۥ۬ۦۘ"
            goto L_0x0024
        L_0x003b:
            int r8 = f130v
            java.lang.String r0 = "ۤ۠ۛۢ۠۬۫ۢۛۤۧۖ۟ۜۨۙۡۥۘۜۚ"
            goto L_0x000a
        L_0x0040:
            java.lang.String r0 = "ۙ۟ۗۛ۬ۢ۠ۛ۠۫ۤۦۘۗ۬ۤ۫۫ۥۘۥ۬۫۠ۥۥۘۨۖ۬"
            r4 = r7
            goto L_0x000a
        L_0x0044:
            r9 = -1970833238(0xffffffff8a8778aa, float:-1.3045416E-32)
            java.lang.String r0 = "ۥۧۥۦۥۗۙۚۡۘۗۦ۟ۤۥۘۡۥۡ۠۬ۖۘ"
        L_0x0049:
            int r10 = r0.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -2037352259: goto L_0x0052;
                case -1742242187: goto L_0x005d;
                case -1408635932: goto L_0x005a;
                case -283622225: goto L_0x011d;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x0049
        L_0x0052:
            if (r8 != r7) goto L_0x0057
            java.lang.String r0 = "ۤۡۡۘۧۘۡۗۚۛۨ۬ۜۘۨۡ۠۟۬ۥۥ۠ۖ"
            goto L_0x0049
        L_0x0057:
            java.lang.String r0 = "ۤ۬ۨۦۨۧۨۖۨۨۙۙۨۗۦۜ۫ۗۚۙۨ"
            goto L_0x0049
        L_0x005a:
            java.lang.String r0 = "ۧۘۙۦۜۦۘۤۧۦۘۜ۟ۡۘۚۨۥۘۨ۫ۜۘۢۨۘۨۤۨۘ"
            goto L_0x0049
        L_0x005d:
            java.lang.String r0 = "ۜۤۜۘ۬ۢۖۢۚۗۜۢ۫۬ۡۜۘ"
            goto L_0x000a
        L_0x0060:
            java.lang.String r0 = "main_text"
            r9 = 17
            int r0 = com.obwhatsapp.yo.shp.getPrefInt(r0, r9)
            f130v = r0
            java.lang.String r0 = "ۡ۟ۨۘۢۦۡۦۤۤۚۡ۟۫ۨۙۚۧۙۜ۠ۜۛۦۗ۟۬ۘۘ"
            goto L_0x000a
        L_0x006d:
            r9 = -1576525539(0xffffffffa208211d, float:-1.8448967E-18)
            java.lang.String r0 = "ۡۨۨۤۡۘۘۘۡۦۘۤۤۗ۠ۦ۬ۚۦۙ"
        L_0x0072:
            int r10 = r0.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -2071231976: goto L_0x0081;
                case -1155067931: goto L_0x008a;
                case -1145492094: goto L_0x007b;
                case 153682550: goto L_0x008d;
                default: goto L_0x007a;
            }
        L_0x007a:
            goto L_0x0072
        L_0x007b:
            java.lang.String r0 = "ۘۡۜ۠ۧۚۜ۫ۘۘۦ۫۫ۤۢۨۜ۬ۖ۠ۜۜۘۧ۬ۜ"
            goto L_0x000a
        L_0x007e:
            java.lang.String r0 = "ۖۜۛۤۜۧۘۜ۟ۛ۫ۨۧۖۙۖ۬ۤۚ"
            goto L_0x0072
        L_0x0081:
            boolean r0 = start_bl()
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = "۠۟ۜۤۖ۫ۗ۬ۢۢۥۧۜۥۤ۫ۙۖۘ"
            goto L_0x0072
        L_0x008a:
            java.lang.String r0 = "ۘۙۘۦۜۨۗۥۜۛ۫ۡ۟ۖۙ۫۫ۜ۠ۘۖۘۚۗۜۘ"
            goto L_0x0072
        L_0x008d:
            java.lang.String r0 = "۬ۛۦۘۜۤۨۨ۬ۖۘۦۘ۫ۗ۟ۜۚ۠ۜ"
            goto L_0x000a
        L_0x0091:
            r9 = -411005387(0xffffffffe7808e35, float:-1.2141723E24)
            java.lang.String r0 = "۟ۡ۟ۜۡۨۘۘ۫ۖۘۚۚۥۘۖۚۡ"
        L_0x0096:
            int r10 = r0.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -1521565400: goto L_0x007b;
                case -1306107769: goto L_0x009f;
                case -1090958282: goto L_0x00a5;
                case -774219556: goto L_0x00b4;
                default: goto L_0x009e;
            }
        L_0x009e:
            goto L_0x0096
        L_0x009f:
            java.lang.String r0 = "ۥ۠۠ۡۨۛۦۢۚۜۥ۟ۥۡۘۘ۟ۥ"
            goto L_0x0096
        L_0x00a2:
            java.lang.String r0 = "۫۟ۢۥ۟ۘۦۥۨ۟ۥ۟ۦ۟ۧ۫"
            goto L_0x0096
        L_0x00a5:
            int r0 = mainTextColor()
            java.lang.String r10 = "#303031"
            int r10 = android.graphics.Color.parseColor(r10)
            if (r0 != r10) goto L_0x00a2
            java.lang.String r0 = "ۜۤۨۥ۟ۨۘ۫ۙۗۤۙ۬۠ۘۡۤۜۦۘۜۖۡۡ۟ۜ"
            goto L_0x0096
        L_0x00b4:
            java.lang.String r0 = "ۗۙۘۘۛ۬۬ۦۥ۫ۧۚۨۢۢۨ"
            goto L_0x000a
        L_0x00b8:
            r6 = 1
            java.lang.String r0 = "ۙ۠ۦۚۖۨۦ۠۫۠ۢۧ۟ۥۘۘۗۨۧ۠ۚۘۘ۬ۢۗۚ۟ۖۘ"
            goto L_0x000a
        L_0x00bd:
            java.lang.String r0 = "ۙۢۖۘۗۨۦۚ۬ۥۘۤۨۡۧۨۗۨ۟ۜۛ۬ۖۘ"
            r5 = r6
            goto L_0x000a
        L_0x00c2:
            java.lang.String r0 = "ۚ۟ۡۘۛۥۥ۠ۗۚۤۖۦۘۖۢۜۘۙۤۗۙۢ۫۟ۦۘ"
            goto L_0x000a
        L_0x00c6:
            java.lang.String r0 = "ۗۢۢ۠ۡ۫ۗۡۦ۠۬ۨۘۥ۟ۦۘ۟ۙۜۖۛ۬ۥ۫ۡ"
            r5 = r2
            goto L_0x000a
        L_0x00cb:
            f131w = r5
            java.lang.String r0 = "ۥۥۦۛ۫ۢۨۖۧۘۥۡۥۧ۟ۗ"
            goto L_0x000a
        L_0x00d1:
            r0 = 2
            int r9 = f130v
            int r9 = r9 - r13
            float r9 = (float) r9
            r12.setTextSize(r0, r9)
            java.lang.String r0 = "ۚۨۚۜۜۦۘۚۘۢ۠۬ۜۘۘۙۗ"
            goto L_0x000a
        L_0x00dd:
            r9 = -1476759230(0xffffffffa7fa7142, float:-6.9511733E-15)
            java.lang.String r0 = "ۗۗ۟ۦ۫ۗۥ۬ۜۘۡۥۧۘۢۖۘۘ"
        L_0x00e2:
            int r10 = r0.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -1275180664: goto L_0x00eb;
                case -1142275816: goto L_0x00f9;
                case -893337187: goto L_0x00f2;
                case -746923782: goto L_0x0121;
                default: goto L_0x00ea;
            }
        L_0x00ea:
            goto L_0x00e2
        L_0x00eb:
            java.lang.String r0 = "۟ۨۘۜ۠ۖۘ۫ۘۖۘۢ۠ۢۖۙۢ۫۬ۚ"
            goto L_0x000a
        L_0x00ef:
            java.lang.String r0 = "۠ۨ۟۫ۘۗ۫ۨۗۗ۠ۨۢۛۗۙۗۘ۟ۥۥۘ۬ۥۗۤۛ۠"
            goto L_0x00e2
        L_0x00f2:
            boolean r0 = f131w
            if (r0 == 0) goto L_0x00ef
            java.lang.String r0 = "ۜۜۨۘ۟ۥۛۖۡ۬ۥۙ۫ۧۗ۠ۛ۫۟"
            goto L_0x00e2
        L_0x00f9:
            java.lang.String r0 = "ۦ۫۠ۘۙۨۘۜۛۡۘۥ۟ۙۧ۬ۜ۫ۡۥ۬ۙۥۘۖۧۜۘ۬۠۠"
            goto L_0x00e2
        L_0x00fc:
            java.lang.String r0 = "ۥۦۖۘ۠۬ۛ۬ۙۖۘۤۛۦۘۖۦۥۘ"
            r3 = r4
            goto L_0x000a
        L_0x0101:
            int r1 = mainTextColor()
            java.lang.String r0 = "ۖۗ۠ۦۨ۬۫ۛۖۚۛۖ۠ۜۦۘۚ۠ۧ۬ۧ۟ۙۖۢۢۤۙ"
            goto L_0x000a
        L_0x0109:
            java.lang.String r0 = "ۢ۬ۤۦۡۤۧۗ۠ۜۘۗۛۨ۟ۖۜۥۘۧۨۦۘۗۛۢ"
            r3 = r1
            goto L_0x000a
        L_0x010e:
            r12.setTextColor(r3)
            java.lang.String r0 = "۟ۖۘۘۡۖۙ۟۫ۗۤۜۜۘۖ۫ۨۘ"
            goto L_0x000a
        L_0x0115:
            java.lang.String r0 = "۠ۥۦۨۜۥۗۥۘ۟۫ۨ۟۠۫ۘ۬ۨۘۢ۟ۡۘ"
            goto L_0x000a
        L_0x0119:
            java.lang.String r0 = "ۗۢۢ۠ۡ۫ۗۡۦ۠۬ۨۘۥ۟ۦۘ۟ۙۜۖۛ۬ۥ۫ۡ"
            goto L_0x000a
        L_0x011d:
            java.lang.String r0 = "ۥۥۦۛ۫ۢۨۖۧۘۥۡۥۧ۟ۗ"
            goto L_0x000a
        L_0x0121:
            java.lang.String r0 = "۫ۦۖۘ۠ۗۚۛۡۙۡۡۧۘۨۢۨۘۛۖۖۥۤۡ۠۫"
            goto L_0x000a
        L_0x0125:
            java.lang.String r0 = "ۢ۬ۤۦۡۤۧۗ۠ۜۘۗۛۨ۟ۖۜۥۘۧۨۦۘۗۛۢ"
            goto L_0x000a
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.ChangeSize(android.widget.TextView, int):void");
    }

    public static void Conv_call_btn(MenuItem menuItem) {
        String str = "ۗۜۖ۬ۦۖۘۛۡۗۨۧۙ۫ۗۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 68) ^ -923058484) {
                case -1985752623:
                    str = "۠ۜۧۘۜۚۨۘۚۨۤۧۚ۫ۖۧ۠۫۫ۡۘۖ۫ۡ";
                    break;
                case 579920235:
                    String str2 = "ۖۚۥۘ۠ۗ۬ۨۛۨۢۥۧۘ۠ۨ۬ۡۤۛۧۚۗۗ۬ۜ";
                    while (true) {
                        switch (str2.hashCode() ^ 820974893) {
                            case -1707074719:
                                str2 = "ۦۗۨۘۥۡۧۢۚۙۧۦۖۧۘۘۦۜۘ";
                                break;
                            case -884124657:
                                if (!shp.getBoolean("Conv_call_btn")) {
                                    str2 = "ۗ۠۠ۡ۬ۡۘۙۚۡۘۢۛۧ۬ۧۦۘۖۨۜۘۤۧ۠ۦۥۥ۬ۥ";
                                    break;
                                } else {
                                    str2 = "ۧۘ۬ۗۡ۫ۡۜۛ۫ۘۡۘۨۤۡۘ۫ۦ۫ۘۦۦۘۘۨۧۜ۠ۨۘ";
                                    break;
                                }
                            case 446603415:
                                str = "ۥۖۥۥۢۜۘۜ۬ۚۨۙۢۘ۠۟ۜۧۤۘۘۤۧۚۚ";
                                continue;
                            case 1619037206:
                                str = "ۗۡۙۦۥۧۘۗ۫ۥۘ۫ۘۦۘۘۚۡ۠ۚۘ۟ۨۦۘۥۛۤ";
                                continue;
                        }
                    }
                    break;
                case 1425268391:
                    menuItem.setShowAsAction(0);
                    str = "ۥۖۥۥۢۜۘۜ۬ۚۨۙۢۘ۠۟ۜۧۤۘۘۤۧۚۚ";
                    break;
                case 1820898705:
                    return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int ConvoStyle() {
        /*
            java.lang.String r0 = "ۛ۠ۚۘۦۥ۫ۥۡۘ۬ۜۙۖۚ۟ۢۖۖۘۘۚۘۦۢۢ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 102(0x66, float:1.43E-43)
            r3 = -1692277765(0xffffffff9b21e3fb, float:-1.3391272E-22)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1913258698: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = com.obwhatsapp.yo.Conversation.whichEntry()
            java.lang.String r1 = "layout"
            int r0 = getID(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.ConvoStyle():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.database.sqlite.SQLiteOpenHelper GetwaSettingsDB() {
        /*
            java.lang.String r0 = "ۥۜۙ۟ۧۡۡ۬ۨۘۥۥۥۢ۫ۘ۬ۧ۬۠ۗ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 851(0x353, float:1.193E-42)
            r3 = -2067426581(0xffffffff84c592eb, float:-4.64494E-36)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 386468980: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            android.database.sqlite.SQLiteOpenHelper r0 = f127s
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.GetwaSettingsDB():android.database.sqlite.SQLiteOpenHelper");
    }

    public static void H1(ViewGroup viewGroup, Activity activity) {
        String str = "ۨۡۤۢۢۦۘۤۥۦۘۘۖۨۜۢ۬ۨ۫۟ۗۙۙ";
        while (true) {
            switch ((str.hashCode() ^ 426) ^ 1293995611) {
                case -1894543851:
                    str = "ۘۢۗ۬ۧۜۘۙۤۖۖۖۗۦۥۙۤۗۨۚۧ۫ۘۥۡ۫ۙ۬";
                    break;
                case -714961687:
                    viewGroup.postDelayed(new d(viewGroup, 4), 10);
                    str = "۬ۙۚۚۤ۫ۜ۫ۘۛۧۡۘ۬ۢۜۘ";
                    break;
                case -45576874:
                    str = "ۛۖۜۘۖۡۤۗۤۨۘۤۖۥۘۤۨۛ۬ۛۖ۬ۧۖۘۧۖۗۢۨۡ";
                    break;
                case 24678668:
                    String str2 = "ۙۤۖۘۘۡ۟۬ۧۖۜۨۚۢۜۖۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1475792467) {
                            case -1654087001:
                                str = "ۥۜۡۘۗۥۜۛۢ۬ۥۛۥۧۢۖۘۘۨۘۘۧۘ۬ۢۗۦۘ";
                                continue;
                            case -964598998:
                                str2 = "ۘۢۜ۫ۧۛۢ۠ۥۧ۟ۚۖۖۜ";
                                break;
                            case -220626563:
                                str = "ۥۨۘۘۨۚۘۖۡۤۡۙ۟ۤۙۜۘۡۖۙ۬ۢ";
                                continue;
                            case 551050955:
                                if (activity instanceof HomeActivity) {
                                    str2 = "۠ۧۚۧۢۘۧۡ۠ۖۦۘۧۘۛ۠ۡۦ۫۠ۦۘ";
                                    break;
                                } else {
                                    str2 = "ۚۡۨۛ۬ۨۤۢۢۧۛۨ۟ۡۦۢۗۖۘۛ۟";
                                    break;
                                }
                        }
                    }
                    break;
                case 170566811:
                case 442920570:
                    return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015c, code lost:
        r0 = "ۤۥ۫ۚۧۨۘۦ۬۫ۨ۬ۥۖۢۢۧۨۘۤۗ۟";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void H2() {
        /*
            r7 = 1
            r2 = 0
            java.lang.String r0 = "ۡ۠ۥۘۦۨ۬ۨۚۡۘۗۛۡۘ۟۟ۥۘۢۨۜۙۜۙ"
            r1 = r2
            r3 = r2
            r4 = r2
        L_0x0007:
            int r2 = r0.hashCode()
            r5 = 606(0x25e, float:8.49E-43)
            r6 = 1101968257(0x41aeb381, float:21.837648)
            r2 = r2 ^ r5
            r2 = r2 ^ r6
            switch(r2) {
                case -1252967962: goto L_0x00c2;
                case -718671734: goto L_0x007e;
                case -502231934: goto L_0x0034;
                case -427182257: goto L_0x00a3;
                case -422727760: goto L_0x0016;
                case -293879368: goto L_0x00c9;
                case -242545279: goto L_0x0131;
                case -182373285: goto L_0x0065;
                case -127966634: goto L_0x0076;
                case -93834271: goto L_0x0160;
                case 22593165: goto L_0x0057;
                case 49643039: goto L_0x0158;
                case 408452492: goto L_0x00e5;
                case 524856807: goto L_0x006e;
                case 1123510804: goto L_0x00dc;
                case 1381924087: goto L_0x0160;
                case 1414818625: goto L_0x00d3;
                case 1444411349: goto L_0x014e;
                case 1531716961: goto L_0x010a;
                case 2091127829: goto L_0x0110;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            r2 = 1590143858(0x5ec7ab72, float:7.1938594E18)
            java.lang.String r0 = "ۦۡۜۧۥۜۤۗۤ۠ۖۘۘۡۖۖۘ۬ۥۘ۟ۨۚۧۥۜۘ"
        L_0x001b:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -2104875105: goto L_0x002a;
                case -456846489: goto L_0x0024;
                case 217624305: goto L_0x0154;
                case 470781458: goto L_0x0031;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x001b
        L_0x0024:
            java.lang.String r0 = "ۨۧۖۘ۫ۥۜۘۧ۫ۢۢۚۖ۫ۛۥ۟ۢۡ"
            goto L_0x001b
        L_0x0027:
            java.lang.String r0 = "ۥۚۧۢۗ۠ۚۚۦۚۨۡۘۘۚۘۘۗ"
            goto L_0x001b
        L_0x002a:
            android.widget.TextView r0 = homeActionbarTitle
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = "ۤۖۤ۟ۡۚۨۨۦۘۦ۠۟ۨۦ۠"
            goto L_0x001b
        L_0x0031:
            java.lang.String r0 = "ۢۦۧۘ۠ۙۨۛۧ۬ۙۜۧۘۙۚۗۢۥۡۙۨۨۡۡۘۘۘ۟"
            goto L_0x0007
        L_0x0034:
            r2 = 1805265382(0x6b9a29e6, float:3.7274487E26)
            java.lang.String r0 = "۫ۧۚۧۨۦۘۚ۠ۛۙ۫۠ۢۗۧۥۛۘۘ"
        L_0x0039:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -545374472: goto L_0x0048;
                case -98509420: goto L_0x0042;
                case -78152339: goto L_0x0054;
                case 1057037258: goto L_0x0051;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0039
        L_0x0042:
            java.lang.String r0 = "۠ۨ۟ۘۥۦۗۦۖۘۡۦۜۨۧۖۘۡۤۜۚۥۤۦۘۛ"
            goto L_0x0007
        L_0x0045:
            java.lang.String r0 = "۬ۢۘۘۗۢۗ۬ۛۚۡۗۜۘۦۧۥۗۤۚۛۛۖۘۜۘۡۤۗۘ"
            goto L_0x0039
        L_0x0048:
            boolean r0 = disableClickToOpenHiddenChats()
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = "۬۟۟ۛۦۜۘۧ۬ۦ۟ۥۨۢۖۧۗۨۜۘ"
            goto L_0x0039
        L_0x0051:
            java.lang.String r0 = "ۥۖۦۚ۬ۨۦۛۖۘۧۦ۬ۘۗۨۘۛ۠ۖۘ"
            goto L_0x0039
        L_0x0054:
            java.lang.String r0 = "ۙۢ۬ۢ۟ۜۘۘۧۦۡۚۧۡۚۧۙۢ۫ۛۦ"
            goto L_0x0007
        L_0x0057:
            android.widget.TextView r0 = homeActionbarTitle
            com.obwhatsapp.yo.a0 r2 = new com.obwhatsapp.yo.a0
            r5 = 5
            r2.<init>(r5)
            r0.setOnClickListener(r2)
            java.lang.String r0 = "۠ۨ۟ۘۥۦۗۦۖۘۡۦۜۨۧۖۘۡۤۜۚۥۤۦۘۛ"
            goto L_0x0007
        L_0x0065:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "۟ۛ۬ۢۚۘۘ۬۟ۨۘۗۡۘ۫ۢۤۥۡۘۘ۟ۦۖۘۨۘۜۘۨ۫ۖ"
            r4 = r2
            goto L_0x0007
        L_0x006e:
            java.lang.String r0 = hideJidCode
            r4.append(r0)
            java.lang.String r0 = "ۜۦۥۘ۬ۜۘۘۥ۫ۦۘۙۡۘۧ۟۬"
            goto L_0x0007
        L_0x0076:
            java.lang.String r0 = "_notifC"
            r4.append(r0)
            java.lang.String r0 = "ۤۦۨۘۚ۟۬ۤۚۡ۫ۚۢۖۘۥۘ۟ۨۖۘۚۥۨۗۧۧۤۢ"
            goto L_0x0007
        L_0x007e:
            r2 = 66387864(0x3f4ff98, float:1.43997125E-36)
            java.lang.String r0 = "ۗۗۥ۠ۤۨۘۡۡۧۤۧۨۨ۫ۗۤۨۥۘۡۨۗ۬ۛ"
        L_0x0083:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -1775216141: goto L_0x0092;
                case -1452353890: goto L_0x008c;
                case -528887872: goto L_0x009f;
                case 2118354761: goto L_0x015c;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x0083
        L_0x008c:
            java.lang.String r0 = "ۗۛۘۘۖۧۛۥ۟۫ۜۙۦۛۥۨۘ۫ۡۦ"
            goto L_0x0083
        L_0x008f:
            java.lang.String r0 = "۠ۥۥ۠ۥۘۧۢ۬ۦۛ۠ۦۜۨۖۧۙ۟ۤۧۛۢۗ"
            goto L_0x0083
        L_0x0092:
            java.lang.String r0 = r4.toString()
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = "ۡۜۖ۟ۡۥۤۥۚۦ۟ۧ۟ۤۨ"
            goto L_0x0083
        L_0x009f:
            java.lang.String r0 = "ۜۜۡۧۚۘۜۖۜ۫۫ۛۗۥۛ"
            goto L_0x0007
        L_0x00a3:
            r2 = 1204378294(0x47c95ab6, float:103093.42)
            java.lang.String r0 = "ۡۦۖۨۙۘۖۗۢۖۘۜۘۚۢۚ"
        L_0x00a8:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -778428713: goto L_0x00be;
                case -120307929: goto L_0x015c;
                case 763063494: goto L_0x00bb;
                case 1791497471: goto L_0x00b1;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            goto L_0x00a8
        L_0x00b1:
            boolean r0 = B
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = "ۤ۫ۥۡۛ۠ۥۙۗۙ۠ۜۙۙۥۧۧۧۗۛۨۘ"
            goto L_0x00a8
        L_0x00b8:
            java.lang.String r0 = "ۛۖۘۘۡۛۧ۫ۜۘۘۢۢۗۗۖۢۗ۠ۨۢۥۤ"
            goto L_0x00a8
        L_0x00bb:
            java.lang.String r0 = "ۡ۠ۨ۠ۙ۠ۖ۟ۥۘ۠ۧۡۘۢ۠ۜۙۧۢۧۤ۬"
            goto L_0x00a8
        L_0x00be:
            java.lang.String r0 = "ۜۨۖۘۤ۬ۘۘۘۥۘۘۤۘۜۜ۬ۛۨ۟ۖ"
            goto L_0x0007
        L_0x00c2:
            l()
            java.lang.String r0 = "۠۠ۨۖ۠ۖۘۤۗ۬ۧۨۦۘۘۥۨۛۗ۠ۡ۟ۖۘۗۗۦۘۦۦۚ"
            goto L_0x0007
        L_0x00c9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "۟ۨۡۥ۬۬ۖۚ۫ۤۨۗۨۥۤۤۚۢ"
            r3 = r2
            goto L_0x0007
        L_0x00d3:
            java.lang.String r0 = hideJidCode
            r3.append(r0)
            java.lang.String r0 = "ۥۥۖۘ۟ۧ۫ۛ۫ۨۘۚۧ۠ۢ۟ۜۘ"
            goto L_0x0007
        L_0x00dc:
            java.lang.String r0 = "_animatehome"
            r3.append(r0)
            java.lang.String r0 = "ۧۜۨۥ۬ۛۥۥۛۦۨۧۘ۫ۤۙ"
            goto L_0x0007
        L_0x00e5:
            r2 = -924969789(0xffffffffc8de14c3, float:-454822.1)
            java.lang.String r0 = "۟۫ۦۘۦۡۡۥ۫ۦۖ۠ۥۨۖۘۚ۠ۜۘۗۧۖ۟ۥۚ"
        L_0x00ea:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -1590267069: goto L_0x0103;
                case -233407340: goto L_0x00f3;
                case 677964891: goto L_0x0106;
                case 1589586897: goto L_0x0158;
                default: goto L_0x00f2;
            }
        L_0x00f2:
            goto L_0x00ea
        L_0x00f3:
            java.lang.String r0 = r3.toString()
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0, r7)
            if (r0 == 0) goto L_0x0100
            java.lang.String r0 = "ۦۗۦۘۗۜۢۖۙۢۙۗۥۘۙ۟ۙۗۢۙۨۗ"
            goto L_0x00ea
        L_0x0100:
            java.lang.String r0 = "ۦۙۗۚ۬ۡۛۤۚۗۦۦۘۦۚۡۘ"
            goto L_0x00ea
        L_0x0103:
            java.lang.String r0 = "۠ۗ۬ۧۤۙۧ۠۬ۖۡۙۦۨۤۛۜۘۡۢ"
            goto L_0x00ea
        L_0x0106:
            java.lang.String r0 = "ۧۜۛ۫۬ۦۡ۠ۙۜۥۘۤۗۥ"
            goto L_0x0007
        L_0x010a:
            android.widget.TextView r1 = homeActionbarTitle
            java.lang.String r0 = "ۛۖۜۥۙۦۘۙۛۨۜۖۤۖۥ۬ۛۜۦۦۗۦۘۛۖ۬ۦۚۙ"
            goto L_0x0007
        L_0x0110:
            r2 = 965074158(0x3985dcee, float:2.5532342E-4)
            java.lang.String r0 = "ۛۚۜۨۥۥۡ۬ۙۜۖۨۘۜۚۦۖۧۙ۫ۛۜۘ"
        L_0x0115:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -200769737: goto L_0x012a;
                case 1001840375: goto L_0x0125;
                case 1046974546: goto L_0x011e;
                case 1532298538: goto L_0x012d;
                default: goto L_0x011d;
            }
        L_0x011d:
            goto L_0x0115
        L_0x011e:
            java.lang.String r0 = "ۙۚۘۘ۟ۜۥۢۜۤۖۦۘۢۗۨۚۤۥۘ۠ۖۜۨۢۚۥۡ۟"
            goto L_0x0007
        L_0x0122:
            java.lang.String r0 = "ۚۗۖۤۧۗۡۜۧۛۘ۬ۖ۠۠ۥۚۦۘۢۧۦۘۤۧ۫ۘ۬ۢ"
            goto L_0x0115
        L_0x0125:
            if (r1 != 0) goto L_0x0122
            java.lang.String r0 = "ۗۥۥۧ۫ۡۘۦۤۢۧۙ۟ۙۖۥۘۙ۬ۥ۬ۡۡۘ۬ۙۥۘۡۖۡ"
            goto L_0x0115
        L_0x012a:
            java.lang.String r0 = "ۛۧۦۡۢۤ۫ۥ۫۠ۚۥۢۗۜ"
            goto L_0x0115
        L_0x012d:
            java.lang.String r0 = "ۥۘۥۖۗ۠ۢۚۖۘ۟ۘ۬۫۬ۥۘ"
            goto L_0x0007
        L_0x0131:
            com.obwhatsapp.yo.p r0 = new com.obwhatsapp.yo.p
            android.content.Context r2 = getCtx()
            java.lang.String r5 = "yobounce"
            java.lang.String r6 = "anim"
            int r5 = getID(r5, r6)
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r2, r5)
            r5 = 2
            r0.<init>(r1, r2, r5)
            r1.post(r0)
            java.lang.String r0 = "۫ۦۥۖۘۘۘ۟ۢۥۜ۬ۥۚۨۗ"
            goto L_0x0007
        L_0x014e:
            B = r7
            java.lang.String r0 = "ۤۥ۫ۚۧۨۘۦ۬۫ۨ۬ۥۖۢۢۧۨۘۤۗ۟"
            goto L_0x0007
        L_0x0154:
            java.lang.String r0 = "۠۬ۙۜ۠ۘۡۤۨ۟ۤۢۡۡ۬ۤۧۙۗۜ۫"
            goto L_0x0007
        L_0x0158:
            java.lang.String r0 = "۫ۦۥۖۘۘۘ۟ۢۥۜ۬ۥۚۨۗ"
            goto L_0x0007
        L_0x015c:
            java.lang.String r0 = "ۤۥ۫ۚۧۨۘۦ۬۫ۨ۬ۥۖۢۢۧۨۘۤۗ۟"
            goto L_0x0007
        L_0x0160:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.H2():void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        r0 = "ۡۦۢۨ۫ۖۗۙۤۧۤۥۥ۬ۗ۟۟ۘۘۛۜۘ۠۠ۡ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean H3G(X.C15830rv r7) {
        /*
            r2 = 0
            java.lang.String r0 = "ۥ۫۟ۧۜ۠ۢۜۨۘۧ۫ۜۘ۟۠ۖۜۜۨۘۜ"
            r1 = r2
            r3 = r2
        L_0x0005:
            int r4 = r0.hashCode()
            r5 = 800(0x320, float:1.121E-42)
            r6 = -1160243970(0xffffffffbad814fe, float:-0.0016485748)
            r4 = r4 ^ r5
            r4 = r4 ^ r6
            switch(r4) {
                case -1203522591: goto L_0x0066;
                case -1042059622: goto L_0x006d;
                case -750233568: goto L_0x0063;
                case -682788994: goto L_0x0070;
                case -580820085: goto L_0x0037;
                case -202465257: goto L_0x005f;
                case -110387946: goto L_0x0017;
                case 1439148154: goto L_0x005b;
                case 1986361165: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0005
        L_0x0014:
            java.lang.String r0 = "ۥۘۚۤۗۥۡ۫۫ۤۦۨ۫ۗۧۦۚۤۦ۫ۖۚ۠ۥۘۛۤۖ"
            goto L_0x0005
        L_0x0017:
            r4 = 1078254719(0x4044dc7f, float:3.075958)
            java.lang.String r0 = "ۙۡۙۤ۠ۛ۬ۗ۫۫ۜۦۘ۟ۜ۫ۛۤۨۘۚ۠۟ۗۧۡۘ"
        L_0x001c:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1412976911: goto L_0x006a;
                case 566086577: goto L_0x002b;
                case 1644781401: goto L_0x0034;
                case 2038679878: goto L_0x0025;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x001c
        L_0x0025:
            java.lang.String r0 = "۬۠ۨۘ۬ۜۡۘۙۜۦۚ۠ۘۘ۟ۨۡۘۢۘۘۡ۠ۚۡۜۗ۠ۖۡ"
            goto L_0x001c
        L_0x0028:
            java.lang.String r0 = "۠۟ۡۘۘۙۙ۟ۥۘ۠ۚۚۗ۫ۥۥ۬ۖ"
            goto L_0x001c
        L_0x002b:
            boolean r0 = H3T((X.C15830rv) r7)
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "۠ۥۦۙ۠۠۟۫ۤۜ۠ۡۘۢۚ۬"
            goto L_0x001c
        L_0x0034:
            java.lang.String r0 = "ۡ۟ۗۘۖۦۙۚۤۧۙۖۡۥۥۘۜۧۘۛۦۦ"
            goto L_0x0005
        L_0x0037:
            r4 = 1949784230(0x743758a6, float:5.8104756E31)
            java.lang.String r0 = "ۚۛۖۜۙۥۢ۬ۙۚ۫ۘۘ۬ۖۚۖۥ۬ۛۚ"
        L_0x003c:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -363135344: goto L_0x006a;
                case 1266865311: goto L_0x004b;
                case 1606984260: goto L_0x0058;
                case 1805038689: goto L_0x0045;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x003c
        L_0x0045:
            java.lang.String r0 = "۟۫ۜۗۙۜۨۖۛۜۖ۟۠ۢۘۘ"
            goto L_0x0005
        L_0x0048:
            java.lang.String r0 = "ۗ۟ۢۗ۫۬۟ۢۨۘۛۦۧ۠ۦۛۖۙۘۤۡۧۘ۟ۛۘۘۡۘۢ"
            goto L_0x003c
        L_0x004b:
            java.lang.String r0 = com.obwhatsapp.yo.dep.getJID_t(r7)
            boolean r0 = isGroupJid(r0)
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = "ۛۦۧ۬۬ۢۡۘ۠ۢۜۜۘ۬ۢۖۘ۫ۤ۠۬ۧۧۛۗۜۘۛۘۡۘ"
            goto L_0x003c
        L_0x0058:
            java.lang.String r0 = "ۢۡ۬ۤ۫ۙۖۘ۟۫ۛۡ۟ۡۢ"
            goto L_0x003c
        L_0x005b:
            r3 = 1
            java.lang.String r0 = "۟ۘۡۤۙۤۗ۫ۥۡ۠ۘۗ۬۟۠ۚۦۘۗۢۦۘ۬ۖۖۘۙ۟۟"
            goto L_0x0005
        L_0x005f:
            java.lang.String r0 = "ۘۥۥ۫ۗۛۙۨۜۡۧۘۥۚۚ۫ۖۦۙۨۥ"
            r1 = r3
            goto L_0x0005
        L_0x0063:
            java.lang.String r0 = "ۨۢۡ۬۟ۗۙۛۘۘۙ۫ۥۘۡۚۡ۫۠۠ۗۗۦ"
            goto L_0x0005
        L_0x0066:
            java.lang.String r0 = "۟ۘ۠ۙ۬ۡ۬ۚۘۘۧۛۡ۠ۥ۬ۜۨۙۚ۬ۙۧۖۘ"
            r1 = r2
            goto L_0x0005
        L_0x006a:
            java.lang.String r0 = "ۡۦۢۨ۫ۖۗۙۤۧۤۥۥ۬ۗ۟۟ۘۘۛۜۘ۠۠ۡ"
            goto L_0x0005
        L_0x006d:
            java.lang.String r0 = "۟ۘ۠ۙ۬ۡ۬ۚۘۘۧۛۡ۠ۥ۬ۜۨۙۚ۬ۙۧۖۘ"
            goto L_0x0005
        L_0x0070:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.H3G(X.0rv):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0098, code lost:
        r0 = "ۡۖۘۘ۠ۡ۬ۦۡ۬۠ۗۖۨۥۨۘۥۢ۬";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean H3P(X.C15830rv r9) {
        /*
            r2 = 0
            java.lang.String r0 = "ۙۜۘ۟۫ۚۜۙۦۘ۠ۜۙۘ۬ۨۘۙۚۥۘ۫ۜۙ۟ۤ۬"
            r1 = r2
            r3 = r2
            r4 = r2
            r5 = r2
        L_0x0007:
            int r6 = r0.hashCode()
            r7 = 567(0x237, float:7.95E-43)
            r8 = -1883765319(0xffffffff8fb805b9, float:-1.8146005E-29)
            r6 = r6 ^ r7
            r6 = r6 ^ r8
            switch(r6) {
                case -2090711056: goto L_0x008c;
                case -1937199390: goto L_0x0016;
                case -1478713888: goto L_0x0063;
                case -1390385607: goto L_0x002b;
                case -1033625638: goto L_0x0047;
                case -599048078: goto L_0x0019;
                case 244534362: goto L_0x0095;
                case 407484998: goto L_0x0027;
                case 601536835: goto L_0x0087;
                case 1130079795: goto L_0x0020;
                case 1405837793: goto L_0x009c;
                case 1636379028: goto L_0x0097;
                case 2067532070: goto L_0x0090;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            java.lang.String r0 = "ۗۨۥۘۗۥۡۘۤۗۢ۟ۥۘۥۢۧۦۥۙ۠ۤۡۨۖۘۘۚۧۘۘ"
            goto L_0x0007
        L_0x0019:
            boolean r5 = H3T((X.C15830rv) r9)
            java.lang.String r0 = "ۧ۬ۖۖۦۘ۫ۗۦۛۤۤ۟ۥۘۡۨۜۘ"
            goto L_0x0007
        L_0x0020:
            boolean r4 = isGrpSeparateEnabled()
            java.lang.String r0 = "ۦ۬۬ۢۖۦۘ۠ۘۗۦۘۥۘ۬ۡۢۦۡۘۘۛ۫ۨ"
            goto L_0x0007
        L_0x0027:
            r3 = 1
            java.lang.String r0 = "ۧ۟ۡۚۘۙ۫۫۠ۙ۫۬ۜۧۥۖۘ۠ۖۛ۬"
            goto L_0x0007
        L_0x002b:
            r6 = 461917467(0x1b884d1b, float:2.254914E-22)
            java.lang.String r0 = "ۚۥۨۙۤۗ۬ۖۘۘۚۗۜۘۤۗۘۡۧۙۦۚۜۘۤۛ"
        L_0x0030:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -1719021028: goto L_0x0039;
                case -1254041386: goto L_0x00a0;
                case -1029632754: goto L_0x0044;
                case -113342880: goto L_0x0041;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x0030
        L_0x0039:
            if (r4 == 0) goto L_0x003e
            java.lang.String r0 = "ۛۦۤ۠ۘ۠ۘۚۥۘۤ۟۬ۛۖۧۦۢ"
            goto L_0x0030
        L_0x003e:
            java.lang.String r0 = "ۨۦۛۚۤ۫ۙۘۡۘۗ۫ۨۘۜ۟ۙۜۧۥۘۤۛ"
            goto L_0x0030
        L_0x0041:
            java.lang.String r0 = "ۨۦۛۙۨۥۧ۟ۥۜۧۖۘۙ۠ۦ۟ۨۢۢۘۦ"
            goto L_0x0030
        L_0x0044:
            java.lang.String r0 = "ۨ۬۬ۚۗۤۘۖۦۘ۠ۘۛۚۨۤ۠ۛۤ۟۫ۜۛۖۘ"
            goto L_0x0007
        L_0x0047:
            r6 = 384330764(0x16e86c0c, float:3.7549809E-25)
            java.lang.String r0 = "ۛۜۖۘۡۡۘۘۨۚۥۘۗۨۡۘۜۙۨۘ"
        L_0x004c:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -2041676047: goto L_0x0055;
                case -1770044408: goto L_0x0060;
                case 1693571493: goto L_0x0098;
                case 1870818619: goto L_0x005d;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x004c
        L_0x0055:
            if (r5 != 0) goto L_0x005a
            java.lang.String r0 = "۫ۙۦ۬۬ۧۛۤ۟ۛۛ۬۠ۜۘ"
            goto L_0x004c
        L_0x005a:
            java.lang.String r0 = "۫ۡ۫ۦۛۜۘۜۨ۟ۚۦۨۗۛۡۤۖۘۖۖۡ"
            goto L_0x004c
        L_0x005d:
            java.lang.String r0 = "ۙ۠ۜۘۢۢ۠ۨۙۦۘۤۗۖۚۘۙۢۛۥۘ"
            goto L_0x004c
        L_0x0060:
            java.lang.String r0 = "ۖۦۨۤۜۨۦۢۖۘۧۦۥۘ۬ۖ۠ۡۦۡ"
            goto L_0x0007
        L_0x0063:
            r6 = -1909701736(0xffffffff8e2c4398, float:-2.1233182E-30)
            java.lang.String r0 = "۟۫ۢۙۙۘۚ۬ۨ۬ۡۢۖۢۖ۬ۖۦۘ"
        L_0x0068:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -1572307884: goto L_0x0081;
                case -1189223915: goto L_0x0071;
                case 19997448: goto L_0x0098;
                case 278016684: goto L_0x0084;
                default: goto L_0x0070;
            }
        L_0x0070:
            goto L_0x0068
        L_0x0071:
            java.lang.String r0 = com.obwhatsapp.yo.dep.getJID_t(r9)
            boolean r0 = isGroupJid(r0)
            if (r0 != 0) goto L_0x007e
            java.lang.String r0 = "ۖۛۢۨۦۜۧۚۘۤۨ۠ۘۗۨۘ۠ۙ۫ۙۨۦۘ"
            goto L_0x0068
        L_0x007e:
            java.lang.String r0 = "ۢۛ۟۫ۛۙ۟۟ۖۨۤۥۙۘۛ۠ۖ۬"
            goto L_0x0068
        L_0x0081:
            java.lang.String r0 = "ۚ۟ۢ۫ۡۦۘۡۚۙۦۜۜۘۖۚۧۚ۬۟ۤ۬۠ۤۜۤ۬ۙۜۘ"
            goto L_0x0068
        L_0x0084:
            java.lang.String r0 = "ۛۧۥۦۘۜۦۥۤۙۖۘۜۨ۠ۦۦۚ"
            goto L_0x0007
        L_0x0087:
            java.lang.String r0 = "۬۟ۘۘۦ۫۬ۘۡ۫ۤۡۘ۬ۖۦۜۜ"
            r1 = r3
            goto L_0x0007
        L_0x008c:
            java.lang.String r0 = "ۡ۠۫۬ۥۜۤۛۧۖۡۙ۫ۡۥۡۚۛ"
            goto L_0x0007
        L_0x0090:
            java.lang.String r0 = "ۙۢۡۘۘۢ۟ۡۤۡۘۢۧۜۘۙۙۥۗۦ۬۟۬ۢۜۙۜ۟ۗۨۘ"
            r1 = r2
            goto L_0x0007
        L_0x0095:
            r1 = r5 ^ 1
        L_0x0097:
            return r1
        L_0x0098:
            java.lang.String r0 = "ۡۖۘۘ۠ۡ۬ۦۡ۬۠ۗۖۨۥۨۘۥۢ۬"
            goto L_0x0007
        L_0x009c:
            java.lang.String r0 = "ۙۢۡۘۘۢ۟ۡۤۡۘۢۧۜۘۙۙۥۗۦ۬۟۬ۢۜۙۜ۟ۗۨۘ"
            goto L_0x0007
        L_0x00a0:
            java.lang.String r0 = "ۚۡۖۢ۫ۥۘۦ۬ۜۘۘ۫۠۬ۨۥۜۚۛ"
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.H3P(X.0rv):boolean");
    }

    public static boolean H3T(C15830rv r4) {
        String str = "ۥۜۥۧۥۡۘۡۘۚۜۖۜۘۨۖۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 231) ^ 40422559) {
                case -1040945524:
                    str = "ۜۥۥۙۤۜۘۢۢۥۘ۟ۨۤۥۜۢۗۤۨۗ۠ۥۘۗ۬ۥۜۡۧ";
                    break;
                case -316204901:
                    return H3T(dep.getJID_t(r4));
            }
        }
    }

    public static boolean H3T(C15830rv r3, Context context) {
        String str = "ۘۤۦۘ۟ۡۘۚ۠۫ۥۜۡۘۤۙۗ۫ۢۖۘۘۗ۟ۘۘۛۨۛۨۘ";
        while (true) {
            try {
                switch (str.hashCode() ^ 399253278) {
                    case -1458195840:
                        if (f128t == null) {
                            str = "ۘۤۖۚ۫ۨۘ۠ۘۜۦ۫ۤۡ۬ۦۘۢۡۤۤ۠ۘۘ";
                            break;
                        } else {
                            str = "ۥۢۦۥۨۦ۠ۦۘۨۨۙ۫۫ۤۢ۟ۧ";
                            continue;
                        }
                    case -982775168:
                        str = "ۤۤۡۘۛۨۧۡۗۜۘۨۢۥۘۗ۠ۘۨۗۥۧۙۗ";
                        continue;
                    case -359813063:
                        break;
                    case 1260336482:
                        shp.init(context);
                        m();
                        break;
                    default:
                        continue;
                }
            } catch (Exception e2) {
                return false;
            }
        }
        return H3T(dep.getJID_t(r3));
    }

    public static boolean H3T(C16740tZ r4) {
        String str = "۟ۗ۟ۛۗۛ۫۟ۦۘۖۥۘۘۚۗۢ۫ۢ۠ۢۥۡۘۧ۟ۜ";
        while (true) {
            switch ((str.hashCode() ^ 959) ^ -1777400853) {
                case -1850409223:
                    return H3T(dep.getJID_t(r4.A11.A00));
                case 1007067469:
                    str = "ۡۤۜۘۨۧۡۘۨۦۧۘۨۥۜۘۙۙۢ۫ۥۘ۬۠ۘۘ";
                    break;
            }
        }
    }

    public static boolean H3T(Jid jid) {
        String str = "ۢۨ۠۟۬ۗ۫۟۠ۦۦ۬۟ۧۜۚۦۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 613) ^ -462855387) {
                case -1088557962:
                    return H3T(dep.getJID_t(jid));
                case 1253388338:
                    str = "ۦۚۦۖۛ۬۬ۜۧۘۦ۬ۡۘۨۡ۠ۥ۠ۚ۠۫";
                    break;
            }
        }
    }

    public static boolean H3T(String str) {
        String str2 = "۟ۚ۬ۜۘۢۤۜۙۖ۫ۤۦۦۘ";
        while (true) {
            switch ((str2.hashCode() ^ 245) ^ -1678779952) {
                case -1762726277:
                    return f128t.contains(str);
                case -1221549963:
                    String str3 = "۫ۢۥۥۘۧۘ۫ۚۖۥۥۢۧۢۢ";
                    while (true) {
                        switch (str3.hashCode() ^ 1278454100) {
                            case -1636632999:
                                str2 = "ۛۚۡۥۥ۬۫ۗۦۡۡۙۨۥۤ";
                                continue;
                            case 168382357:
                                str3 = "۬ۙۧۢ۬ۖۘۛۦۥۘ۠۟ۖۘۜۤۚۡۦۨۘۗ۬ۛ";
                                break;
                            case 429701360:
                                str2 = "ۥۗۨۥۙۥۘۢۘۘۥۚۛۥۗۢۨۢۖۘۤۗ۬ۧۥ۫";
                                continue;
                            case 1094070638:
                                if (str != null) {
                                    str3 = "ۜۡۜۘۛۜۧ۠ۥۥۘۨۗۘۧۨۚ";
                                    break;
                                } else {
                                    str3 = "۬ۙ۠ۛ۠۬۠ۗۦۘ۫۟ۜۗۗ۟ۥۡۧۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 269982544:
                    str2 = "۫ۛ۟ۖۚ۟ۛۛۧۛۦۘۥۧۧۘۚۨۘۧۚۖۘۢۙۡ";
                    break;
                case 1678708058:
                    return false;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<X.C15830rv> H4N() {
        /*
            java.lang.String r0 = "ۤۖۧۥ۬ۨۚۖۜۛ۫ۡۘ۠۠ۦ۠ۗۖۘۜ۠۫"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 368(0x170, float:5.16E-43)
            r3 = 1503107502(0x599799ae, float:5.3339618E15)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 756675357: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.util.ArrayList r0 = f129u
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.H4N():java.util.ArrayList");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void H5CallsN(java.util.LinkedHashMap r6) {
        /*
            r3 = 0
            java.lang.String r0 = "۬ۘۦۜۡۙۨ۠ۥۘۖۘۛۚ۠ۘۘۢۦۡۘ"
            r1 = r0
            r2 = r3
            r4 = r3
        L_0x0006:
            int r0 = r1.hashCode()
            r3 = 160(0xa0, float:2.24E-43)
            r5 = 1791411773(0x6ac6c63d, float:1.2015173E26)
            r0 = r0 ^ r3
            r0 = r0 ^ r5
            switch(r0) {
                case -1950617519: goto L_0x0019;
                case -1239611224: goto L_0x00c7;
                case -1150655355: goto L_0x00d9;
                case -551218112: goto L_0x00de;
                case -127005173: goto L_0x0036;
                case 484313873: goto L_0x0085;
                case 496202527: goto L_0x0064;
                case 950108099: goto L_0x00d4;
                case 1221726344: goto L_0x0015;
                case 1628570258: goto L_0x0057;
                case 1991226260: goto L_0x0090;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0006
        L_0x0015:
            java.lang.String r0 = "ۘۢۨۘ۟۟ۖۘ۫ۦۡۘ۫۫ۨ۠ۧۥ۫ۨۗۤۜۧۘۖ۬ۖۘۡۤۦ"
            r1 = r0
            goto L_0x0006
        L_0x0019:
            r1 = 1008516353(0x3c1cbd01, float:0.009566546)
            java.lang.String r0 = "ۖۥۧۘۚۦۗۥۙۡ۬ۘۛۙۚۡۜۚ۫"
        L_0x001e:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -462804652: goto L_0x0027;
                case -367960965: goto L_0x002d;
                case 639221704: goto L_0x00d9;
                case 1658595835: goto L_0x0032;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x001e
        L_0x0027:
            java.lang.String r0 = "۬ۗۦۤ۠ۗۜۛۜۘۚۡۥۘۖۦ۟"
            goto L_0x001e
        L_0x002a:
            java.lang.String r0 = "ۜۖۘۘۦۦۙۨۧۨۘ۬ۢۚ۠ۨۢۗۜ۫۫ۖۖ"
            goto L_0x001e
        L_0x002d:
            if (r6 == 0) goto L_0x002a
            java.lang.String r0 = "ۜۛۡۘ۬ۜۙۡ۫ۨ۟۠۠۫ۢۙۨۢ۬ۜۙۙۗۢۘ"
            goto L_0x001e
        L_0x0032:
            java.lang.String r0 = "۟۬ۚ۬ۦ۟ۚۜۥۘ۠ۢ۫ۢ۬ۗۥۥۘۘۨۛۘۘۛ۫ۖۘ"
            r1 = r0
            goto L_0x0006
        L_0x0036:
            r1 = -554681305(0xffffffffdef03c27, float:-8.655377E18)
            java.lang.String r0 = "ۚۚۨۘ۠ۖۖۦۢۘۘۘۥۧۚۡۛ"
        L_0x003b:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1315347519: goto L_0x004a;
                case -241371650: goto L_0x00cf;
                case 716814282: goto L_0x0053;
                case 1513859901: goto L_0x0044;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x003b
        L_0x0044:
            java.lang.String r0 = "ۛۥۗۦۚۘۢۡ۟ۛ۫ۖۘۥۡ۠۟۫ۜ۟ۗۘۘۗۤۙ"
            goto L_0x003b
        L_0x0047:
            java.lang.String r0 = "ۜۥۤۡ۬ۦۘ۬ۨۨ۠ۢۧۧۖۘۤۛۨ"
            goto L_0x003b
        L_0x004a:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = "۫ۛۜۘۖۜۙ۬۬۟ۙۘۛ۬ۛۡ۫ۦۛ۠ۜۘۥۥۥۘۡۤۚ"
            goto L_0x003b
        L_0x0053:
            java.lang.String r0 = "ۢۨۨۢۚ۠ۨ۫ۘۧۜۘۘ۠ۨۧۘۢۗۜ۬ۙۜۘۙۘۡۙۙۧ"
            r1 = r0
            goto L_0x0006
        L_0x0057:
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r3 = r0.iterator()
            java.lang.String r0 = "ۦۛ۠۟۟ۜۤ۠ۘۘ۬ۗۨۘۙ۫ۜ"
            r1 = r0
            r4 = r3
            goto L_0x0006
        L_0x0064:
            r1 = 841573250(0x32296382, float:9.85972E-9)
            java.lang.String r0 = "۟ۚۖۘۛۨ۠ۜ۠ۦۘۤۚۖۘۚ۫ۨۨۥۨۘۗۨۘ"
        L_0x0069:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1020242169: goto L_0x0072;
                case -773527822: goto L_0x0081;
                case 10577445: goto L_0x0078;
                case 1438144753: goto L_0x00d9;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x0069
        L_0x0072:
            java.lang.String r0 = "ۦۦۚۖۡۡ۬ۖۚۦۛۤۗۦۥۗۢۜۘۦۘ۫ۧۘۘ"
            goto L_0x0069
        L_0x0075:
            java.lang.String r0 = "۫ۚۙۥۘۨۘۖ۠ۦۘۤ۠۟ۚۚۜ۬ۗ۬ۢۗۘ۬ۛ"
            goto L_0x0069
        L_0x0078:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = "ۤۦۦۘ۠۠۠ۛ۟ۖۚۘۥۘۛ۟۠"
            goto L_0x0069
        L_0x0081:
            java.lang.String r0 = "ۦ۬ۧۘۤۜۙۦۧۘۤۜۥۖۡۘۗۧۢۤ۬ۘ۠ۡۘ"
            r1 = r0
            goto L_0x0006
        L_0x0085:
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "۠ۥۦۧۤۥۘۨ۬ۢ۫ۤۧۚۢ"
            r2 = r0
            goto L_0x0006
        L_0x0090:
            r1 = 1643462191(0x61f53e2f, float:5.6549164E20)
            java.lang.String r0 = "ۨۨۙۨ۫۠ۚ۠۠۟ۦۜۘۤۢۨ"
        L_0x0095:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1744978037: goto L_0x00bf;
                case 1034566446: goto L_0x00d4;
                case 1788995743: goto L_0x00c2;
                case 1867256574: goto L_0x009e;
                default: goto L_0x009d;
            }
        L_0x009d:
            goto L_0x0095
        L_0x009e:
            r0 = 0
            java.lang.String r3 = "t"
            int r3 = r2.lastIndexOf(r3)
            int r3 = r3 + 1
            java.lang.String r0 = r2.substring(r0, r3)
            java.lang.String r3 = "O:"
            java.lang.String r5 = ""
            java.lang.String r0 = r0.replace(r3, r5)
            boolean r0 = H3T((java.lang.String) r0)
            if (r0 == 0) goto L_0x00bc
            java.lang.String r0 = "ۧۧۚۥۛۗۢ۬ۦۘۨۦۜ۟ۚۨۘۡۢ۫"
            goto L_0x0095
        L_0x00bc:
            java.lang.String r0 = "۠ۗۧۡ۬ۖۚۢۘ۟ۤۛۙۨۘ۠ۦۜۨۜۘۤۤۤۘ۫ۘۘ"
            goto L_0x0095
        L_0x00bf:
            java.lang.String r0 = "ۤ۫ۛۜۘۘ۟ۘۙۙۢ۠ۦۗ۟ۖ۫ۦۘۖۜۥ۬ۡۦۘ"
            goto L_0x0095
        L_0x00c2:
            java.lang.String r0 = "ۙۜۥۘۘۛۖۦۦ۠ۢۨ۫ۗۘۖۘۧۧۨۘ۠ۙۡۘ۬ۚۖۘ"
            r1 = r0
            goto L_0x0006
        L_0x00c7:
            r4.remove()
            java.lang.String r0 = "ۡۥۘ۠۟ۡۘۛۧ۫ۥ۟ۚ۫۬ۡۘۢ۟ۖۤ۟ۛۤۢۦ"
            r1 = r0
            goto L_0x0006
        L_0x00cf:
            java.lang.String r0 = "ۤۛ۬۠۟ۦۘۥۥۢۖۧۜ۟ۨۛۥۧۢۛۖۡۘ"
            r1 = r0
            goto L_0x0006
        L_0x00d4:
            java.lang.String r0 = "ۦۛ۠۟۟ۜۤ۠ۘۘ۬ۗۨۘۙ۫ۜ"
            r1 = r0
            goto L_0x0006
        L_0x00d9:
            java.lang.String r0 = "ۜۧۡۛۚۘۘۧۥۘۧۡۛۖۨۛۛۘۧۚۚۡۡۡۡ"
            r1 = r0
            goto L_0x0006
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.H5CallsN(java.util.LinkedHashMap):void");
    }

    public static void HCoN(Set<C15830rv> set) {
        try {
            set.addAll(f129u);
        } catch (Exception e2) {
        }
    }

    public static boolean HNoNotif(C16010sH r4) {
        try {
            boolean H3T = H3T(dep.getJID_data(r4));
            String str = "۬ۘۦۘۚ۬ۜۘۜۥۥۜۧۥۤۖۘۛۜۦۘ";
            while (true) {
                switch (str.hashCode() ^ 51251294) {
                    case 79999996:
                        return H3T;
                    case 449238609:
                        if (!H3T) {
                            str = "ۖۤۨۘۚ۫ۦۘۢۚۨۘۦۥۨۥۘۙۥۥۦۦۦۡۡ۠ۚۜ";
                            break;
                        } else {
                            str = "ۛۨ۟ۖ۫ۙۜۛ۬ۧۘۦۘۛۢۦۘ۟ۦۗۢۘۖ۠ۤۦ";
                            break;
                        }
                    case 718876293:
                        str = "۬۫۠ۤۡۘۡۛۖۘ۟ۙۦۘ۟ۧ";
                        break;
                    case 1609679540:
                        shp.setBooleanPriv(hideJidCode + "_notifC", true);
                        l();
                        return H3T;
                }
            }
        } catch (Exception e2) {
            return false;
        }
    }

    public static String HNotifTitle(C16010sH r3, String str) {
        String str2 = "ۢۗۖۡۤۦۘ۬ۛۧۖۙ۠ۗۜۡۘ";
        while (true) {
            try {
                switch (str2.hashCode() ^ -806439753) {
                    case -995130908:
                        return pname;
                    case -617946212:
                        str2 = "ۙۙۡۙۙۡۘۚۚۚۧ۟ۖۙۜۙۢۨۘۦۜ۠ۤۤۥ";
                        break;
                    case 776614078:
                        return str;
                    case 1746510336:
                        if (!H3T(dep.getJID_data(r3))) {
                            str2 = "ۙۖ۫۠ۗۡۘۚۗ۟ۘ۟ۨۘۢۨ۬";
                            break;
                        } else {
                            str2 = "۟ۜ۟۟ۚۚ۟ۘۚۚۛۥ۫۟ۡۙۗ";
                            break;
                        }
                }
            } catch (Exception e2) {
                return str;
            }
        }
    }

    public static void HiActv(Activity activity) {
        String str = "ۨۨۤۦۤ۫ۡۖۛ۬ۤۦۘۖۗۨۤۗۡۧۘ۫ۛۜۤۚۤۙ";
        while (true) {
            switch ((str.hashCode() ^ 592) ^ -7534729) {
                case -821167006:
                    activity.setTitle(u1.k(pname));
                    str = "ۖۙۖۧۨۖۘۜۢۧ۫ۦۙۤۧۡۘۚ۟ۚ";
                    break;
                case -265523929:
                    others.MainBKC(activity.findViewById(getID("container", "id")));
                    str = "۟۟ۨۛۤۙۙۘۖۚۗۤۨ۫ۜۘۘۙۜۗۦۘ";
                    break;
                case 261653245:
                    A = activity;
                    str = "ۤۛۦۙ۬ۚۘۛۜۘۧۨۡۘۤۛۚۨۗۘۜۚۘۘ۠ۖۙۛۤۙ";
                    break;
                case 1481640671:
                    str = "ۢۗۧ۬ۛۖۘ۫۫۫ۥۖۧۘۘۨۛۨۡۜۘۡۛۨۘۦ۬ۛ۬ۙۜ";
                    break;
                case 1582812911:
                    return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        r2 = "۬ۤ۠ۦۤۨۘۨۚ۠۠ۤ۠ۥۗۧۜۤۨۨۚۘۘۨۦۡ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        r2 = "ۗۜ۟ۛ۠ۢ۠۠ۛۨۖۛۗۜۘۜۚۡۘۛۡۢۚۨۖ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void Home_onActivityResult(int r15, int r16, android.content.Intent r17) {
        /*
            r12 = 0
            r11 = 0
            r10 = 0
            r9 = 0
            r8 = 0
            r6 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            r7 = 0
            java.lang.String r1 = "ۖ۬ۥۙۜۦ۟۠ۦۙۙۥۘ۟ۗۡۘ۠۟۫ۖ۬ۨ"
            r2 = r1
        L_0x000d:
            int r1 = r2.hashCode()
            r13 = 827(0x33b, float:1.159E-42)
            r14 = -1654452977(0xffffffff9d630d0f, float:-3.004995E-21)
            r1 = r1 ^ r13
            r1 = r1 ^ r14
            switch(r1) {
                case -2136461350: goto L_0x02d1;
                case -2102587439: goto L_0x01d2;
                case -2098086223: goto L_0x02a9;
                case -2082178396: goto L_0x014a;
                case -2066159401: goto L_0x0196;
                case -1905507744: goto L_0x0068;
                case -1856492829: goto L_0x0221;
                case -1704009288: goto L_0x0297;
                case -1633207036: goto L_0x012a;
                case -1359866323: goto L_0x0047;
                case -1288660628: goto L_0x02cc;
                case -1230542204: goto L_0x009c;
                case -1168863078: goto L_0x0291;
                case -1157151508: goto L_0x00da;
                case -970152974: goto L_0x01dc;
                case -836242478: goto L_0x01f2;
                case -831139641: goto L_0x0020;
                case -802267321: goto L_0x026f;
                case -770281452: goto L_0x00bc;
                case -743714003: goto L_0x001c;
                case -688600637: goto L_0x021a;
                case -687535495: goto L_0x0164;
                case -683091478: goto L_0x02bd;
                case -466470833: goto L_0x0024;
                case -374476230: goto L_0x02c7;
                case -40663014: goto L_0x0256;
                case 141169982: goto L_0x0261;
                case 270145502: goto L_0x0028;
                case 465340030: goto L_0x028a;
                case 491803433: goto L_0x0151;
                case 768195455: goto L_0x0214;
                case 894651606: goto L_0x0077;
                case 936935826: goto L_0x01e6;
                case 1058060489: goto L_0x020d;
                case 1113689830: goto L_0x02b3;
                case 1227528833: goto L_0x022b;
                case 1418393287: goto L_0x01a4;
                case 1599610717: goto L_0x0234;
                case 1627162949: goto L_0x01c8;
                case 1751651128: goto L_0x010a;
                case 1993433902: goto L_0x02d1;
                case 2095424835: goto L_0x018b;
                case 2104929670: goto L_0x015b;
                case 2142108395: goto L_0x00e8;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x000d
        L_0x001c:
            java.lang.String r1 = "ۚ۠ۖۥ۬ۡۘۡۜ۟ۤ۟ۚ۫ۥ۠۠ۢۥۘۘۨۖۧۘۘ"
            r2 = r1
            goto L_0x000d
        L_0x0020:
            java.lang.String r1 = "ۖ۠ۗۘۜۙۙۢ۫ۙ۟ۙ۬ۛۘۘۛۧۜۤۙۘ"
            r2 = r1
            goto L_0x000d
        L_0x0024:
            java.lang.String r1 = "ۨۤۛۖ۬ۖ۟ۤۢۦۜۦۘ۠۟۟ۤۥ۟۫ۧۘۜۙۨ۬ۥ"
            r2 = r1
            goto L_0x000d
        L_0x0028:
            r2 = 1982415740(0x7629437c, float:8.582685E32)
            java.lang.String r1 = "ۙۦۢۤۥ۫ۤۥۨ۟ۛۥۘۛۖۤۨ۟۫ۧۘۛۤۨۧۘ"
        L_0x002d:
            int r13 = r1.hashCode()
            r13 = r13 ^ r2
            switch(r13) {
                case -1370317617: goto L_0x003c;
                case -342592582: goto L_0x0036;
                case 1168381672: goto L_0x0055;
                case 2026286579: goto L_0x0043;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x002d
        L_0x0036:
            java.lang.String r1 = "ۥۙۘۘ۬۟۫ۘۖ۬۫ۙ۫۠ۚۜ"
            goto L_0x002d
        L_0x0039:
            java.lang.String r1 = "۠۠۫۠ۥۨۘۦ۠ۖۘۥۜ۫۠ۚۦ"
            goto L_0x002d
        L_0x003c:
            r1 = 1283(0x503, float:1.798E-42)
            if (r15 != r1) goto L_0x0039
            java.lang.String r1 = "ۘۥۧ۠۫ۨۘ۬ۚۖۘۛۗۙۙ۬ۨۘۜۧ۫ۜ۬ۡۘۢ۟ۥۘۜۦ"
            goto L_0x002d
        L_0x0043:
            java.lang.String r1 = "ۢۡۦ۫ۚۢۗۗۨۢۨۨۘ۬ۖۤۙۥۖۘۖۢۛ"
            r2 = r1
            goto L_0x000d
        L_0x0047:
            r2 = 862550673(0x33697a91, float:5.4361013E-8)
            java.lang.String r1 = "۠ۨ۬۬ۗۧۥۙۘ۫ۧ۬ۢۘۙ۟ۗۧۧۢۡ"
        L_0x004c:
            int r13 = r1.hashCode()
            r13 = r13 ^ r2
            switch(r13) {
                case -626515668: goto L_0x0055;
                case 20417796: goto L_0x0061;
                case 1386617560: goto L_0x0064;
                case 1751829191: goto L_0x005c;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x004c
        L_0x0055:
            java.lang.String r1 = "۬ۤ۠ۦۤۨۘۨۚ۠۠ۤ۠ۥۗۧۜۤۨۨۚۘۘۨۦۡ"
            r2 = r1
            goto L_0x000d
        L_0x0059:
            java.lang.String r1 = "۠ۛۙ۫ۙۡۘۖۥۘۘۨ۟ۥ۠ۗۥۨۚ۠ۛۖۢ۟ۡۨۘ"
            goto L_0x004c
        L_0x005c:
            if (r17 == 0) goto L_0x0059
            java.lang.String r1 = "ۛۥۧۘ۬ۜۖۘۚۦۡۘۦۥۡۘۙ۠ۨۥۚۥ"
            goto L_0x004c
        L_0x0061:
            java.lang.String r1 = "ۗۘۜ۟۟ۘ۬ۤۦۘۖۦ۫ۙۥۘۦۗۡۙۢۤۚ۟ۤۗۗۥ"
            goto L_0x004c
        L_0x0064:
            java.lang.String r1 = "۟ۚۛۡۦۤ۠ۧۨۘۦ۠ۙۥ۠ۦۘۥۡۖۘ"
            r2 = r1
            goto L_0x000d
        L_0x0068:
            java.lang.String r1 = "contact"
            r0 = r17
            java.lang.String r1 = r0.getStringExtra(r1)
            com.obwhatsapp.yo.dep.h(r1)
            java.lang.String r1 = "۬ۤ۠ۦۤۨۘۨۚ۠۠ۤ۠ۥۗۧۜۤۨۨۚۘۘۨۦۡ"
            r2 = r1
            goto L_0x000d
        L_0x0077:
            r2 = -452205514(0xffffffffe50be436, float:-4.128867E22)
            java.lang.String r1 = "ۙۡۧۘ۠ۢۥۘۦۧۤ۫ۦۗۤۖ"
        L_0x007c:
            int r13 = r1.hashCode()
            r13 = r13 ^ r2
            switch(r13) {
                case -960816232: goto L_0x0097;
                case -459167567: goto L_0x0094;
                case 1342869581: goto L_0x0085;
                case 2134487375: goto L_0x008c;
                default: goto L_0x0084;
            }
        L_0x0084:
            goto L_0x007c
        L_0x0085:
            java.lang.String r1 = "ۗۜ۟ۛ۠ۢ۠۠ۛۨۖۛۗۜۘۜۚۡۘۛۡۢۚۨۖ"
            r2 = r1
            goto L_0x000d
        L_0x0089:
            java.lang.String r1 = "ۤۦۘۘۥۨۡۜۥۜۘۗۚۗ۟ۚۘۤۖۗ"
            goto L_0x007c
        L_0x008c:
            r1 = -1
            r0 = r16
            if (r0 != r1) goto L_0x0089
            java.lang.String r1 = "ۗۙۘۘۙۘۦۜۥۨۗ۟ۖۡۖۤۨۦۘۗۨۘۘۡۢۘ"
            goto L_0x007c
        L_0x0094:
            java.lang.String r1 = "ۥۡۚ۟ۨۢۢۖۢ۬ۖۗۨۖۤۡ۟ۨ"
            goto L_0x007c
        L_0x0097:
            java.lang.String r1 = "ۙۗۙۛۦۗۙۖۨۘ۬ۥۙۡ۟ۛۗۦۚ"
            r2 = r1
            goto L_0x000d
        L_0x009c:
            r2 = 1770244196(0x6983c864, float:1.991445E25)
            java.lang.String r1 = "ۚۖۘۢۛۥۘ۫ۘۨۜ۠ۖۘۡ۫۫"
        L_0x00a1:
            int r13 = r1.hashCode()
            r13 = r13 ^ r2
            switch(r13) {
                case -1149112630: goto L_0x00aa;
                case -336093928: goto L_0x00b9;
                case 40938348: goto L_0x00b2;
                case 62872097: goto L_0x0085;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            goto L_0x00a1
        L_0x00aa:
            java.lang.String r1 = "ۨۜۘ۫ۦۜۘ۫ۥۛۦۡۘۢۜۖۛۜۜۘۜۧۨۙۥۦۡۘۖ"
            r2 = r1
            goto L_0x000d
        L_0x00af:
            java.lang.String r1 = "ۗۚۖ۬ۦۨۘۥۧ۫ۡۦۡۘۖ۫ۜۘ۠ۙ۬ۤ۫ۦ"
            goto L_0x00a1
        L_0x00b2:
            r1 = 1285(0x505, float:1.8E-42)
            if (r15 != r1) goto L_0x00af
            java.lang.String r1 = "ۡۢ۫ۛۨۘۚ۠ۨۘ۫ۢۚ۬ۡۚ۟۠ۖۘ"
            goto L_0x00a1
        L_0x00b9:
            java.lang.String r1 = "ۗۧۧۖ۠۫ۥ۫ۥۘۘ۫ۨۘۛۧ۠"
            goto L_0x00a1
        L_0x00bc:
            r2 = -1709513227(0xffffffff9a1ae5f5, float:-3.203221E-23)
            java.lang.String r1 = "ۖۤۡۘۡۘۥۡۘۢۛۘۘۤ۟ۥۘ۫ۡۗ"
        L_0x00c1:
            int r13 = r1.hashCode()
            r13 = r13 ^ r2
            switch(r13) {
                case 1196460784: goto L_0x00ca;
                case 1197171842: goto L_0x00d7;
                case 1424461807: goto L_0x00d2;
                case 2026839204: goto L_0x0085;
                default: goto L_0x00c9;
            }
        L_0x00c9:
            goto L_0x00c1
        L_0x00ca:
            java.lang.String r1 = "ۡۦۨۘۧۤۦ۟۟ۖۖۤۨۧ۫۠ۖۢۥۦ۠ۦۘۢۙۘۘ"
            r2 = r1
            goto L_0x000d
        L_0x00cf:
            java.lang.String r1 = "ۦۗۘۙ۫ۘۘۗۧۖۗۗ۬ۤ۠ۥ۬ۘۧ"
            goto L_0x00c1
        L_0x00d2:
            if (r17 == 0) goto L_0x00cf
            java.lang.String r1 = "ۗۛۡ۫ۧۙۤ۟ۘۘۗۢ۟ۙ۠ۖۘۧۨ۫ۤۚ۠ۤۚۜۘۚۛۖۘ"
            goto L_0x00c1
        L_0x00d7:
            java.lang.String r1 = "ۗۤۡۖ۬ۜۘۗۤۨۚۨۦۘۦۧۥۘ۫ۧۚۨ۬ۖۘۦ۬ۥۖۥۘ"
            goto L_0x00c1
        L_0x00da:
            android.net.Uri r1 = r17.getData()
            com.obwhatsapp.HomeActivity r2 = Homeac
            n(r1, r2)
            java.lang.String r1 = "ۗۜ۟ۛ۠ۢ۠۠ۛۨۖۛۗۜۘۜۚۡۘۛۡۢۚۨۖ"
            r2 = r1
            goto L_0x000d
        L_0x00e8:
            r2 = 895331037(0x355daadd, float:8.2577554E-7)
            java.lang.String r1 = "ۗۥۡۡۙۜۘۛۦۦۘۛ۫ۗۜۡ۬ۤۖۗۘۗ۟ۨ۟ۥ"
        L_0x00ed:
            int r13 = r1.hashCode()
            r13 = r13 ^ r2
            switch(r13) {
                case 738469440: goto L_0x00f6;
                case 1397753426: goto L_0x00fc;
                case 1509982167: goto L_0x0105;
                case 1529236068: goto L_0x029f;
                default: goto L_0x00f5;
            }
        L_0x00f5:
            goto L_0x00ed
        L_0x00f6:
            java.lang.String r1 = "ۥۨۖۘۛ۠ۘۡۜۖۘۚۥ۫۟۟ۚۢۚ۫۬۬ۛۢۗ۬"
            goto L_0x00ed
        L_0x00f9:
            java.lang.String r1 = "ۨۙۜۤۡۨۘۧۢۥۘۜۤۥۚۤۖ۟ۧۨۘۗ۫ۚ"
            goto L_0x00ed
        L_0x00fc:
            r1 = -11
            r0 = r16
            if (r0 == r1) goto L_0x00f9
            java.lang.String r1 = "۬ۙۦۨۤ۫۟ۘۗۜ۟ۥۘۥۡۡۢۜ۫ۥۦۨ"
            goto L_0x00ed
        L_0x0105:
            java.lang.String r1 = "۫۬ۥۘۥ۟ۘۘۘۥۧۙۡ۫۠ۨۙ"
            r2 = r1
            goto L_0x000d
        L_0x010a:
            r2 = -1052956436(0xffffffffc13d28ec, float:-11.822491)
            java.lang.String r1 = "ۤۤۜۘ۬۬ۦۢۘۡۘۦۘۚۛۜۜۙۦۡۘ۟ۧۥۘۧۜ"
        L_0x010f:
            int r13 = r1.hashCode()
            r13 = r13 ^ r2
            switch(r13) {
                case -1738313046: goto L_0x02b8;
                case -979276545: goto L_0x0125;
                case 61101647: goto L_0x0118;
                case 349751122: goto L_0x011e;
                default: goto L_0x0117;
            }
        L_0x0117:
            goto L_0x010f
        L_0x0118:
            java.lang.String r1 = "ۧۤۘۘ۫۠۟ۛۦۜۘۢۜۚ۬ۨۛ"
            goto L_0x010f
        L_0x011b:
            java.lang.String r1 = "ۘۛۡۘۡۧ۠ۥۘۜۗ۬ۖۦۘۚۘۘۘ۠ۦۘۜۦۚ"
            goto L_0x010f
        L_0x011e:
            r1 = 1280(0x500, float:1.794E-42)
            if (r15 == r1) goto L_0x011b
            java.lang.String r1 = "ۛۙۥۘۢۛۜۘۡۥ۬۟ۜ۬ۢۗۢۨۥ۠"
            goto L_0x010f
        L_0x0125:
            java.lang.String r1 = "ۦ۟ۜۡۨۨۙ۟ۡۖۘۘۜۜۢۛۨۡۚ۟"
            r2 = r1
            goto L_0x000d
        L_0x012a:
            r2 = -739239162(0xffffffffd3f01b06, float:-2.06249106E12)
            java.lang.String r1 = "ۘۘۦۜۧۙۚۤۖۘۧۖۜۘ۟ۙۡۘۗۨۦۘۥۚۚۨۡۗۙۗۡ"
        L_0x012f:
            int r13 = r1.hashCode()
            r13 = r13 ^ r2
            switch(r13) {
                case -1472133279: goto L_0x0142;
                case -1012797743: goto L_0x0138;
                case 428489599: goto L_0x02a4;
                case 852668094: goto L_0x0145;
                default: goto L_0x0137;
            }
        L_0x0137:
            goto L_0x012f
        L_0x0138:
            r1 = 1281(0x501, float:1.795E-42)
            if (r15 == r1) goto L_0x013f
            java.lang.String r1 = "ۦ۫ۛۦۚۦۘۚۡ۬ۗۗۚۡۥ۠ۦۢۜۘ۫ۘۜۘۦۧۖۛۗۖۘ"
            goto L_0x012f
        L_0x013f:
            java.lang.String r1 = "ۤۨۤۖۥۥۘۨ۟ۘۘۗۜۘۜۡۗۨۤۜ۬ۤۨۘۚ۬ۘۘۖۜۡ"
            goto L_0x012f
        L_0x0142:
            java.lang.String r1 = "۬ۥۧۜ۟ۘ۬ۤ۬ۦۛ۫ۦۘۥۘ۫ۙۙۚۚ۟ۘۧۡۤۘۜ"
            goto L_0x012f
        L_0x0145:
            java.lang.String r1 = "ۢۨ۠ۨۜۗۚۢۥۥۚۢۤۚۧ"
            r2 = r1
            goto L_0x000d
        L_0x014a:
            java.util.LinkedHashSet r12 = G
            java.lang.String r1 = "ۨۖۛۗۡۡۚۖۦۥۢۨۢۦۧ۫۬ۥۘۗۘۨۘ"
            r2 = r1
            goto L_0x000d
        L_0x0151:
            java.util.ArrayList r1 = f129u
            r1.removeAll(r12)
            java.lang.String r1 = "ۥ۟ۨۘۛ۟ۡ۠ۙۜۘۚ۬ۧۗۤۡ۠ۡۡۘۦۤۥۘۗ۫ۧۦۨۗ"
            r2 = r1
            goto L_0x000d
        L_0x015b:
            java.util.Iterator r11 = r12.iterator()
            java.lang.String r1 = "ۛۖۥۖۙۡۘ۫ۜۗ۠ۥ۠ۖۦۖ"
            r2 = r1
            goto L_0x000d
        L_0x0164:
            r2 = 1382934487(0x526de7d7, float:2.55449219E11)
            java.lang.String r1 = "۫۟ۡۙۡ۟ۥۚۙۥ۟ۥ۬ۡۘۘ۟۠"
        L_0x0169:
            int r13 = r1.hashCode()
            r13 = r13 ^ r2
            switch(r13) {
                case -2100929871: goto L_0x0186;
                case -2074536590: goto L_0x0183;
                case -599260528: goto L_0x017a;
                case 771134209: goto L_0x0172;
                default: goto L_0x0171;
            }
        L_0x0171:
            goto L_0x0169
        L_0x0172:
            java.lang.String r1 = "ۨۡۢ۟ۨۡۘۛ۠۫ۚۖ۟ۤۗۙۨۦۘۦۜۜۥ۬"
            r2 = r1
            goto L_0x000d
        L_0x0177:
            java.lang.String r1 = "ۜۘۘ۟ۨۧۧۢۨ۫ۘۦ۫ۡۘۦۤۨ"
            goto L_0x0169
        L_0x017a:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0177
            java.lang.String r1 = "۬ۧۖۧ۬ۨۘۗۥۤۜۤ۠ۢۡۡۘۦۖۖ۬ۤۦ۫ۚۤ"
            goto L_0x0169
        L_0x0183:
            java.lang.String r1 = "ۛ۠ۦۘۗ۠ۤ۬ۢۨۘ۬۫ۦۘۛۨۡۤۖۘ۬ۛۥۘۗۨ۠ۡۗۨۘ"
            goto L_0x0169
        L_0x0186:
            java.lang.String r1 = "۟۫ۦۜۧ۫ۢۛۘۘۡۤ۠ۘۨۦۘۙۨۙۘۘ۬ۛۡۘۛۦۜۘ"
            r2 = r1
            goto L_0x000d
        L_0x018b:
            java.lang.Object r1 = r11.next()
            X.0rv r1 = (X.C15830rv) r1
            java.lang.String r2 = "ۥۨۢۥۧۨۘۤۤۜۘۗ۠ۚۤۖۖۨۛۡۦ۫ۧۛۤۨۚۗ۫"
            r10 = r1
            goto L_0x000d
        L_0x0196:
            java.util.LinkedHashSet r1 = f128t
            java.lang.String r2 = com.obwhatsapp.yo.dep.getJID_t(r10)
            r1.remove(r2)
            java.lang.String r1 = "۫ۗۤۡ۟ۥ۬ۧۨۘۦۨۢۥۨ۟ۛ۬۬"
            r2 = r1
            goto L_0x000d
        L_0x01a4:
            r2 = -179210559(0xfffffffff55176c1, float:-2.6552702E32)
            java.lang.String r1 = "ۗۧ۫۬ۦۘۢۥۦۘۖۗۛۜ۠ۙۙۢ۟"
        L_0x01a9:
            int r13 = r1.hashCode()
            r13 = r13 ^ r2
            switch(r13) {
                case -1475665527: goto L_0x02ae;
                case -164123678: goto L_0x01ba;
                case 3552241: goto L_0x01c5;
                case 1053618042: goto L_0x01b2;
                default: goto L_0x01b1;
            }
        L_0x01b1:
            goto L_0x01a9
        L_0x01b2:
            java.lang.String r1 = "ۚۥۧۚۖۡۘۥۢۨۘ۫ۢۧۖۛۜۘۚۙۖۖ۠ۗۘۦۘۙۙۦۘ"
            r2 = r1
            goto L_0x000d
        L_0x01b7:
            java.lang.String r1 = "۠ۦۤۚۜۜۘۤۥۨۘۘۧ۫ۚۤۤۙۧۧ۟ۛۛۢۖۙۧۛ"
            goto L_0x01a9
        L_0x01ba:
            java.util.LinkedHashSet r1 = f128t
            int r1 = r1.size()
            if (r1 != 0) goto L_0x01b7
            java.lang.String r1 = "ۛۡۘۛۖ۠ۖۗۛۙۖۜۘۚۧۤۦۦۧۘۡۘۡۧۤۡۨۖ۠"
            goto L_0x01a9
        L_0x01c5:
            java.lang.String r1 = "۬ۙ۠ۢۘ۫ۦۙۤۡ۠ۚۤۚۤۨۡ"
            goto L_0x01a9
        L_0x01c8:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "ۨۙۢۙۗۧۧۢۜۚۤۧۙۚ۫ۛ"
            r2 = r1
            goto L_0x000d
        L_0x01d2:
            java.lang.String r1 = hideJidCode
            r9.append(r1)
            java.lang.String r1 = "ۥۥۗۙۧۤۤۜ۬ۦۤ۠ۥ۫ۥۘ"
            r2 = r1
            goto L_0x000d
        L_0x01dc:
            java.lang.String r1 = "_lockedlist"
            r9.append(r1)
            java.lang.String r1 = "ۙۥۧۘۙۤۨ۠ۙۘۘۘۗۖۘۗۨۛۧ۬ۢۜۨ۟"
            r2 = r1
            goto L_0x000d
        L_0x01e6:
            java.lang.String r1 = r9.toString()
            com.obwhatsapp.yo.shp.removePrivKey(r1)
            java.lang.String r1 = "ۡۖۜ۫ۧۥۘۚۛ۫ۦۨۘۤۧۗ"
            r2 = r1
            goto L_0x000d
        L_0x01f2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = hideJidCode
            java.lang.String r13 = "_lockedlist"
            java.lang.String r1 = a.a.f(r1, r2, r13)
            java.util.LinkedHashSet r2 = f128t
            java.lang.String r2 = r2.toString()
            com.obwhatsapp.yo.shp.setStringPriv(r1, r2)
            java.lang.String r1 = "ۜۗۡۨ۠۫۫ۜۖۜ۠ۙ۬۬"
            r2 = r1
            goto L_0x000d
        L_0x020d:
            android.app.Activity r8 = A
            java.lang.String r1 = "ۗ۫ۖ۠ۡ۟ۢۥ۠ۙ۟ۡۦۗۖ"
            r2 = r1
            goto L_0x000d
        L_0x0214:
            java.lang.String r1 = "ۗۥ۟ۦۘۡۛۛۡۘۢۗۧۜۨۗ"
            r2 = r1
            r7 = r8
            goto L_0x000d
        L_0x021a:
            java.util.LinkedHashSet r6 = G
            java.lang.String r1 = "ۥۚۨۘۜۚ۠ۛۜ۫۠ۢ۫ۗۗۜۥۨۛۦۖۡۘۨ۬۬ۗۥۘۘ"
            r2 = r1
            goto L_0x000d
        L_0x0221:
            java.util.ArrayList r1 = f129u
            r1.addAll(r6)
            java.lang.String r1 = "ۚۨۚ۠ۚۚۛ۫۬ۗۨۦۗۡ۬"
            r2 = r1
            goto L_0x000d
        L_0x022b:
            java.util.Iterator r5 = r6.iterator()
            java.lang.String r1 = "۟۠ۛۥۥۦۤ۫ۨ۫ۧۨۘۡۤۨۘۢۖۖۘ۠ۘۗۨۚۗۛۘۜۘ"
            r2 = r1
            goto L_0x000d
        L_0x0234:
            r2 = -580774512(0xffffffffdd621590, float:-1.01819285E18)
            java.lang.String r1 = "ۧ۫ۥۘۚۖۢۖۚ۫۠ۛۢۨۤۡۘ۠۟۫ۜۦۘ"
        L_0x0239:
            int r13 = r1.hashCode()
            r13 = r13 ^ r2
            switch(r13) {
                case -1439689108: goto L_0x02c2;
                case 27562292: goto L_0x0242;
                case 64228916: goto L_0x0248;
                case 283376555: goto L_0x0251;
                default: goto L_0x0241;
            }
        L_0x0241:
            goto L_0x0239
        L_0x0242:
            java.lang.String r1 = "ۙۜۖ۠ۦ۟۬ۜ۠۬۠ۡۘ۬۟ۚۚۘۜ۠ۨۡۘۤۢ۠ۜۖ۬"
            goto L_0x0239
        L_0x0245:
            java.lang.String r1 = "ۖۘۧ۠ۧۨۘ۟۬ۛۢ۬ۘ۫ۥۘۢۚۚۖۧۡۘ۠ۤۨ"
            goto L_0x0239
        L_0x0248:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0245
            java.lang.String r1 = "ۜۡۜۘۗۜۥۘۧۢۡۡۜۚۤ۠ۚۙ۫ۥۘۖۙۘ"
            goto L_0x0239
        L_0x0251:
            java.lang.String r1 = "ۗۦۦۡۛۡۦۚۗۧۙۦۚۘۧ۫ۚۥۘۗ۫ۨۘ"
            r2 = r1
            goto L_0x000d
        L_0x0256:
            java.lang.Object r1 = r5.next()
            X.0rv r1 = (X.C15830rv) r1
            java.lang.String r2 = "ۛ۠۠۫ۨۦۘۤۚۜۘۛۨۦۘۚۧۖۘ"
            r4 = r1
            goto L_0x000d
        L_0x0261:
            java.util.LinkedHashSet r1 = f128t
            java.lang.String r2 = com.obwhatsapp.yo.dep.getJID_t(r4)
            r1.add(r2)
            java.lang.String r1 = "۟ۤۨۢۦۜۤۧۙۘۜۖۘۖ۟ۥۦۤۜۘ۟۟ۚۙۗۨۜۚۛ"
            r2 = r1
            goto L_0x000d
        L_0x026f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = hideJidCode
            java.lang.String r13 = "_lockedlist"
            java.lang.String r1 = a.a.f(r1, r2, r13)
            java.util.LinkedHashSet r2 = f128t
            java.lang.String r2 = r2.toString()
            com.obwhatsapp.yo.shp.setStringPriv(r1, r2)
            java.lang.String r1 = "ۜۥۛ۠ۜۦۤۡۥۘ۬ۥۖۦ۠ۙ"
            r2 = r1
            goto L_0x000d
        L_0x028a:
            com.obwhatsapp.HomeActivity r3 = Homeac
            java.lang.String r1 = "ۧۦۧۙۤۜۘۥۨۡۙۢۨۘۖۙۙ"
            r2 = r1
            goto L_0x000d
        L_0x0291:
            java.lang.String r1 = "۫۫ۘۢ۟ۜۘۜۦۤۗۢۖ۫۠۬ۛۦۢۖ۟ۖۘۢۚۡۘۢۡۧ"
            r2 = r1
            r7 = r3
            goto L_0x000d
        L_0x0297:
            com.obwhatsapp.yo.u1.restartAcNoTrans(r7)
            java.lang.String r1 = "ۥۗ۬۫ۢ۬۟۬ۗۘ۟ۜۖۥۡۤ۬ۗ۟ۘۙۘۥۘ"
            r2 = r1
            goto L_0x000d
        L_0x029f:
            java.lang.String r1 = "ۦۛۥۘۖ۟۟۫۬ۘۧۙۦۘۖۢۥۘ"
            r2 = r1
            goto L_0x000d
        L_0x02a4:
            java.lang.String r1 = "۬ۚۡۧۖۚ۠ۙ۬۟ۥۖۘ۟ۖۜۛ۟ۖ"
            r2 = r1
            goto L_0x000d
        L_0x02a9:
            java.lang.String r1 = "ۛۖۥۖۙۡۘ۫ۜۗ۠ۥ۠ۖۦۖ"
            r2 = r1
            goto L_0x000d
        L_0x02ae:
            java.lang.String r1 = "ۗۙۘۦۢۦۧۧۗ۫ۨۖۨۘ"
            r2 = r1
            goto L_0x000d
        L_0x02b3:
            java.lang.String r1 = "ۜۗۡۨ۠۫۫ۜۖۜ۠ۙ۬۬"
            r2 = r1
            goto L_0x000d
        L_0x02b8:
            java.lang.String r1 = "ۦۥۨۨۖۥۘ۫ۖۖۡۨۖۘۗۗۡ"
            r2 = r1
            goto L_0x000d
        L_0x02bd:
            java.lang.String r1 = "۟۠ۛۥۥۦۤ۫ۨ۫ۧۨۘۡۤۨۘۢۖۖۘ۠ۘۗۨۚۗۛۘۜۘ"
            r2 = r1
            goto L_0x000d
        L_0x02c2:
            java.lang.String r1 = "ۛ۫۠ۤ۬ۤۘۛۖۥۢ۬ۨۦۧۧۙ"
            r2 = r1
            goto L_0x000d
        L_0x02c7:
            java.lang.String r1 = "۫۫ۘۢ۟ۜۘۜۦۤۗۢۖ۫۠۬ۛۦۢۖ۟ۖۘۢۚۡۘۢۡۧ"
            r2 = r1
            goto L_0x000d
        L_0x02cc:
            java.lang.String r1 = "ۥۗ۬۫ۢ۬۟۬ۗۘ۟ۜۖۥۡۤ۬ۗ۟ۘۙۘۥۘ"
            r2 = r1
            goto L_0x000d
        L_0x02d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.Home_onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int LStatus() {
        /*
            java.lang.String r0 = "ۥ۬ۡۥۚۧۢ۟ۡۘ۫ۧۗۖۚۖ۟ۜۢ۬ۤ۫۫۠"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 152(0x98, float:2.13E-43)
            r3 = 988374291(0x3ae96513, float:0.0017806612)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1009108589: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = 250(0xfa, float:3.5E-43)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.LStatus():int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x00e4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x00fb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x009a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void MV_addSaveToMenu(android.view.Menu r10, X.C16730tY r11, com.obwhatsapp.mediaview.MediaViewFragment r12) {
        /*
            r9 = 273(0x111, float:3.83E-43)
            r1 = 1
            r2 = 0
            java.lang.String r0 = "save_to_gallery"
            java.lang.String r6 = getString((java.lang.String) r0)
            r3 = 0
            java.lang.Object r0 = r11.A0H()     // Catch:{ Exception -> 0x00db }
            com.whatsapp.MediaData r0 = (com.whatsapp.MediaData) r0     // Catch:{ Exception -> 0x00db }
            java.io.File r5 = r0.file     // Catch:{ Exception -> 0x00db }
            r4 = 985385368(0x3abbc998, float:0.0014327047)
            java.lang.String r0 = "۠ۤۚۡ۠۠ۖۙۖۘۗۜۦۧۥ۟۠ۢ"
        L_0x0018:
            int r7 = r0.hashCode()     // Catch:{ Exception -> 0x00db }
            r7 = r7 ^ r4
            switch(r7) {
                case -2128179628: goto L_0x0021;
                case -189439542: goto L_0x0038;
                case 48187338: goto L_0x003d;
                case 636725896: goto L_0x0040;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0018
        L_0x0021:
            r0 = r2
        L_0x0022:
            r4 = 2139383233(0x7f8465c1, float:NaN)
            java.lang.String r3 = "ۘۙۖۚۗۖۘۥ۠ۦۘۛۢۢۦۘۨۘ۫ۚۦۘۡ۠۫"
        L_0x0027:
            int r7 = r3.hashCode()
            r7 = r7 ^ r4
            switch(r7) {
                case -1239093600: goto L_0x0068;
                case -145789876: goto L_0x00aa;
                case 449565357: goto L_0x006b;
                case 1833740526: goto L_0x0030;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0027
        L_0x0030:
            if (r0 == 0) goto L_0x0065
            java.lang.String r3 = "ۙۛۥ۟۠ۘۘۧ۟ۛۧۙ۬ۜۢ"
            goto L_0x0027
        L_0x0035:
            java.lang.String r0 = "ۗۛۚۖۡۨۘ۠ۗۗۦ۬۫ۙۘۜۘۛ۠ۢ"
            goto L_0x0018
        L_0x0038:
            if (r5 == 0) goto L_0x0035
            java.lang.String r0 = "ۙۖۛۥۖۢۥۨۗۗۦ۫ۚۛۨۘ۫ۧۘۘۙ۬ۧۖۗ۟"
            goto L_0x0018
        L_0x003d:
            java.lang.String r0 = "ۖ۠۬ۙۚ۠۬ۢ۬ۤۜۧۘۡ۠ۨۡۛۨۘۧۚۨۗۜۙ"
            goto L_0x0018
        L_0x0040:
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x0153 }
            java.lang.String r3 = "/Private"
            boolean r3 = r0.contains(r3)     // Catch:{ Exception -> 0x0153 }
            r4 = -1292047474(0xffffffffb2fceb8e, float:-2.9443779E-8)
            java.lang.String r0 = "ۘۖۨۗۜ۬ۧۨۙۗۥۧۘۦۚ۟۠ۡۦۦۗۘۚۖۜۘۥ۠ۚ"
        L_0x004f:
            int r7 = r0.hashCode()     // Catch:{ Exception -> 0x0153 }
            r7 = r7 ^ r4
            switch(r7) {
                case -534117830: goto L_0x0058;
                case -78929907: goto L_0x0021;
                case -10745121: goto L_0x0063;
                case 1667228706: goto L_0x0060;
                default: goto L_0x0057;
            }     // Catch:{ Exception -> 0x0153 }
        L_0x0057:
            goto L_0x004f
        L_0x0058:
            if (r3 == 0) goto L_0x005d
            java.lang.String r0 = "ۥۚۙۤۧۗۧۧۜۘۖۦۖۘۨۖۘ"
            goto L_0x004f
        L_0x005d:
            java.lang.String r0 = "۟ۜۡۥۜۘ۟ۢ۠ۧۢۡۘۙۧۨۘۗۗۛۛۨۤ۟ۧۜۦۢۧ"
            goto L_0x004f
        L_0x0060:
            java.lang.String r0 = "ۨۗۡۨ۫ۘۘۧۨۡۡۖ۬ۙۦۙۧ۫ۖۜۛ"
            goto L_0x004f
        L_0x0063:
            r0 = r1
            goto L_0x0022
        L_0x0065:
            java.lang.String r3 = "ۜۡۦۘۧۖۧۥ۟ۖۘۧۘۚۤۢۗ"
            goto L_0x0027
        L_0x0068:
            java.lang.String r3 = "ۙۚۥۢۙۙ۫ۦ۠ۗ۬ۜۨۡۥۘ"
            goto L_0x0027
        L_0x006b:
            java.lang.String r3 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r4 = "Private/"
            java.lang.String r7 = "P-"
            java.lang.String r3 = r3.replace(r4, r7)     // Catch:{ Exception -> 0x0091 }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0091 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0091 }
            boolean r3 = r4.exists()     // Catch:{ Exception -> 0x0091 }
        L_0x0080:
            r7 = -604155078(0xffffffffdbfd533a, float:-1.42609355E17)
            java.lang.String r4 = "ۖۧۘ۬ۖۖۘۢ۟۟ۙۦۨۥۨۚ"
        L_0x0085:
            int r8 = r4.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -1682476189: goto L_0x008e;
                case -616586735: goto L_0x00af;
                case -511938522: goto L_0x00d5;
                case 808085335: goto L_0x00b4;
                default: goto L_0x008d;
            }
        L_0x008d:
            goto L_0x0085
        L_0x008e:
            java.lang.String r4 = "ۖ۬ۦۘۨ۫۠ۙۧۧۚۧۡ۟ۜ"
            goto L_0x0085
        L_0x0091:
            r3 = move-exception
            r3 = r5
        L_0x0093:
            r4 = r2
            r5 = r3
        L_0x0095:
            r7 = -2030561663(0xffffffff86f81681, float:-9.33203E-35)
            java.lang.String r3 = "۫ۢۦ۫ۨ۟ۧۦۜۘۢۜۡۘۤۨۘۘۗۘۘۘۖۙۡ"
        L_0x009a:
            int r8 = r3.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -1045294031: goto L_0x00e1;
                case -612642789: goto L_0x00a3;
                case 850947630: goto L_0x00fb;
                case 983331027: goto L_0x00e4;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            goto L_0x009a
        L_0x00a3:
            boolean r3 = r12.prevon
            if (r3 == 0) goto L_0x00de
            java.lang.String r3 = "ۨ۬ۨۚۗۚۧۛۥۘۥۢ۫ۘۡۡ۫ۥۤۧۡۘۢۗۨۜۢ۫"
            goto L_0x009a
        L_0x00aa:
            r3 = r2
            goto L_0x0080
        L_0x00ac:
            java.lang.String r4 = "ۢ۠ۜۘ۟ۥۖۘ۫۟ۜۘۡ۟ۤ۠ۡۡۘۤۗۡۘ۟ۖۢ۬ۨۖۥ۟ۛ"
            goto L_0x0085
        L_0x00af:
            if (r3 != 0) goto L_0x00ac
            java.lang.String r4 = "ۗۙۨۘ۟۟۟ۜ۠ۥۛۛ۠ۗۨۧۨۗ"
            goto L_0x0085
        L_0x00b4:
            r7 = 1658464391(0x62da2887, float:2.0121553E21)
            java.lang.String r4 = "ۗ۟ۥۡۦۙۜ۟ۢۢۗۘۘۨۙۘۘۛۧۡۘۙۜ۟ۦۖۜۘ۬ۧۥۘ"
        L_0x00b9:
            int r8 = r4.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -1813125818: goto L_0x00c2;
                case -1595515998: goto L_0x00cd;
                case 665710719: goto L_0x00d5;
                case 918155682: goto L_0x00c8;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            goto L_0x00b9
        L_0x00c2:
            java.lang.String r4 = "ۗۖۜۜۤۜ۫ۚۖۤۦۚ۠ۘۘ"
            goto L_0x00b9
        L_0x00c5:
            java.lang.String r4 = "ۛۨۘۘۥۛۛ۟ۚۦۤۘۧۘۧۚۖ۠ۧۥۘ۟۬ۗ"
            goto L_0x00b9
        L_0x00c8:
            if (r0 != 0) goto L_0x00c5
            java.lang.String r4 = "۠ۢۙ۬ۤۦۦۧ۬ۘۖۧۘ۬ۜۡۚۙۢۜۨ"
            goto L_0x00b9
        L_0x00cd:
            java.lang.String r4 = "save_to_gallery"
        L_0x00cf:
            java.lang.String r6 = getString((java.lang.String) r4)     // Catch:{ Exception -> 0x00d8 }
            r4 = r3
            goto L_0x0095
        L_0x00d5:
            java.lang.String r4 = "photo_saved_to_gallery"
            goto L_0x00cf
        L_0x00d8:
            r4 = move-exception
            r4 = r3
            goto L_0x0095
        L_0x00db:
            r0 = move-exception
        L_0x00dc:
            r0 = r2
            goto L_0x0093
        L_0x00de:
            java.lang.String r3 = "ۥۛۗۙ۠۬ۚ۬ۘۘۗۜ۠ۢ۠ۜۘۤۤۨۘ"
            goto L_0x009a
        L_0x00e1:
            java.lang.String r3 = "ۛۗۙۗۛ۟ۖۛۤۜۛۢۗ۠۟ۤۖۘ"
            goto L_0x009a
        L_0x00e4:
            java.lang.String r0 = "save_to_gallery"
            java.lang.String r0 = getString((java.lang.String) r0)
            android.view.MenuItem r2 = r10.add(r2, r9, r2, r0)
            com.obwhatsapp.yo.autoschedreply.n r0 = new com.obwhatsapp.yo.autoschedreply.n
            r0.<init>(r12, r1)
        L_0x00f3:
            android.view.MenuItem r0 = r2.setOnMenuItemClickListener(r0)
            r0.setEnabled(r1)
            return
        L_0x00fb:
            r7 = 427155159(0x1975ded7, float:1.2711205E-23)
            java.lang.String r3 = "ۗۗۖۘ۫ۤۥۘ۬۬ۤۧۡۛۜۢۥۘۢ۬ۘ۠ۡۖۘ۠ۧ۠"
        L_0x0100:
            int r8 = r3.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -1953563272: goto L_0x0138;
                case -373556186: goto L_0x0151;
                case 471877851: goto L_0x0133;
                case 697254172: goto L_0x0109;
                default: goto L_0x0108;
            }
        L_0x0108:
            goto L_0x0100
        L_0x0109:
            r7 = 1026548410(0x3d2fe2ba, float:0.042940833)
            java.lang.String r3 = "ۦۘۧۚۜ۟ۙۥۜۘ۠ۙۖ۟۠ۚۛۖۙ۟ۘ"
        L_0x010e:
            int r8 = r3.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -1527403717: goto L_0x0143;
                case -126860003: goto L_0x0117;
                case 737980480: goto L_0x0151;
                case 1140563313: goto L_0x013e;
                default: goto L_0x0116;
            }
        L_0x0116:
            goto L_0x010e
        L_0x0117:
            r3 = 771129407(0x2df6803f, float:2.8023915E-11)
            java.lang.String r0 = "ۜۧۥ۠ۛۛۖۚۦۥ۟۟ۖ۫ۧۚ۠"
        L_0x011c:
            int r7 = r0.hashCode()
            r7 = r7 ^ r3
            switch(r7) {
                case -2012157296: goto L_0x0149;
                case 1188164748: goto L_0x014e;
                case 1473704064: goto L_0x0151;
                case 1838313681: goto L_0x0125;
                default: goto L_0x0124;
            }
        L_0x0124:
            goto L_0x011c
        L_0x0125:
            android.view.MenuItem r2 = r10.add(r2, r9, r2, r6)
            com.obwhatsapp.yo.autoschedreply.n r0 = new com.obwhatsapp.yo.autoschedreply.n
            r3 = 2
            r0.<init>(r5, r3)
            goto L_0x00f3
        L_0x0130:
            java.lang.String r3 = "ۛۨۧۘۘ۬ۙۚۛۧ۬۫ۨۚۨۤۡۧۗۦۛۡۘ"
            goto L_0x0100
        L_0x0133:
            if (r5 == 0) goto L_0x0130
            java.lang.String r3 = "۠ۨۚۢ۬ۘۗۡۖۘۖۚۛۨۨۘۖۖۘ"
            goto L_0x0100
        L_0x0138:
            java.lang.String r3 = "ۥۚۖۘۘۛۧۗۘۡ۫ۧۦۢ"
            goto L_0x0100
        L_0x013b:
            java.lang.String r3 = "۬۟ۥۡۥۥۘۢۦۜ۠ۧ۫ۛۚۖۦۘۘۥۛ"
            goto L_0x010e
        L_0x013e:
            if (r0 == 0) goto L_0x013b
            java.lang.String r3 = "ۙۚۘۘۖ۫ۦۤۥۥۘۛۤۚۜۤۚۛۨ۟ۗ۫"
            goto L_0x010e
        L_0x0143:
            java.lang.String r3 = "ۢۗۧۜۦۥۘۢۦۜ۫ۜۨۖۘۡۘ"
            goto L_0x010e
        L_0x0146:
            java.lang.String r0 = "ۦۜۛ۫ۙۖ۫۟ۥۘۡۘۦۙ۠۫"
            goto L_0x011c
        L_0x0149:
            if (r4 != 0) goto L_0x0146
            java.lang.String r0 = "۟ۦۢۧۤ۟۟۟ۘۜۧ۠ۚۢ۟"
            goto L_0x011c
        L_0x014e:
            java.lang.String r0 = "ۘ۫ۖۢ۠ۖۘۙۗۜ۠ۗۛۜۧۦۦۢ"
            goto L_0x011c
        L_0x0151:
            r1 = r2
            goto L_0x0125
        L_0x0153:
            r0 = move-exception
            r3 = r5
            goto L_0x00dc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.MV_addSaveToMenu(android.view.Menu, X.0tY, com.obwhatsapp.mediaview.MediaViewFragment):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        r0 = "۟ۖۨۘۛۙۢۙ۬ۚۦۡۜۖۥۘۥۖ۠۬ۤ۫ۢ۟ۜ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void MyStatusesActivity_onActivityResult(int r4, int r5, android.content.Intent r6, android.app.Activity r7) {
        /*
            java.lang.String r0 = "ۖۛۦۘۡ۟ۤ۟ۚۥۥ۠ۨۤۡۡۗ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 116(0x74, float:1.63E-43)
            r3 = 1797661275(0x6b26225b, float:2.0084393E26)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1526747866: goto L_0x0081;
                case -1228035494: goto L_0x005b;
                case -1117385934: goto L_0x0077;
                case -27835841: goto L_0x0014;
                case 227357482: goto L_0x0011;
                case 953420023: goto L_0x001a;
                case 968333459: goto L_0x001d;
                case 1609529726: goto L_0x0017;
                case 1697557738: goto L_0x003a;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "ۘ۠ۧۢۖۧۘ۫۟ۖۘۗۛ۫ۢۜۧۢ۬ۖۘۙۛ۟ۢۢۡ"
            goto L_0x0002
        L_0x0014:
            java.lang.String r0 = "ۤۧۧۥ۬ۚۘۢۨۥۗۦۦ۟ۨۘۗۤۜۘۘۗۨۘ۬ۡ۬"
            goto L_0x0002
        L_0x0017:
            java.lang.String r0 = "ۛۤۤۧۘۧۘۤۛۦ۬ۜۡۘۤۤۙۧۚۥۢ۫۠ۖۚۚۧ۬ۖۘ"
            goto L_0x0002
        L_0x001a:
            java.lang.String r0 = "ۙۖۧۘۢۖۢ۟ۙۛۜۥۗۛۗۥۘ"
            goto L_0x0002
        L_0x001d:
            r1 = 619550839(0x24ed9877, float:1.0304065E-16)
            java.lang.String r0 = "ۡۤۙ۫ۧۦۡۧۨۘۢ۬ۚۘۨۜ۬ۨۦۘۜۨۡۘ۠ۢ۠ۘ۠ۦ"
        L_0x0022:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1723558977: goto L_0x002b;
                case -911072263: goto L_0x0037;
                case 1103851168: goto L_0x0031;
                case 1895508889: goto L_0x0048;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0022
        L_0x002b:
            java.lang.String r0 = "ۘ۠ۗۨۧۛۢۧۡۘۥۘۘۘۖۥۦۘ۠ۘۦۘۛۚ۠ۗۚ۫"
            goto L_0x0022
        L_0x002e:
            java.lang.String r0 = "ۤ۫ۘ۠ۜۖۘۨۖۡۦۛ۬ۚۜۖۘۤ۠ۜۘ۟ۘۥۘۢۘ۟"
            goto L_0x0022
        L_0x0031:
            r0 = -1
            if (r5 != r0) goto L_0x002e
            java.lang.String r0 = "ۦۛۥۘ۫ۢ۫ۜۘۥۜۢۦۘۚ۠ۚۨۚۙ"
            goto L_0x0022
        L_0x0037:
            java.lang.String r0 = "ۢۤۘۘۡ۟ۨۘ۠ۛۦۘۦۡۘۡۨۛۦۡۨۤۧ۬ۖۚۡۘۨۙۡ"
            goto L_0x0002
        L_0x003a:
            r1 = 339123132(0x14369bbc, float:9.219365E-27)
            java.lang.String r0 = "ۗۦۖ۠۬ۦۘۘۥۡ۫ۙ۠ۥۘۘۘۦۦۜ"
        L_0x003f:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1418494149: goto L_0x0055;
                case -487842853: goto L_0x0048;
                case 498150209: goto L_0x0058;
                case 546330842: goto L_0x004e;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x003f
        L_0x0048:
            java.lang.String r0 = "۟ۖۨۘۛۙۢۙ۬ۚۦۡۜۖۥۘۥۖ۠۬ۤ۫ۢ۟ۜ"
            goto L_0x0002
        L_0x004b:
            java.lang.String r0 = "ۦۦۘۘۡۧۚ۬ۥۘۖ۠ۥۘۗۚۜۘۜۙ۫"
            goto L_0x003f
        L_0x004e:
            r0 = 1285(0x505, float:1.8E-42)
            if (r4 != r0) goto L_0x004b
            java.lang.String r0 = "ۥۘۡۘ۬۠ۙ۟۟ۡۜۥۢۨۡۤ۟ۜۘۨۙۥۘ"
            goto L_0x003f
        L_0x0055:
            java.lang.String r0 = "ۤۚۥۘۤۡۧۙۙۦۘۢۘۦۤۙۛ۬ۨۛۥۜۘۢۡۧ"
            goto L_0x003f
        L_0x0058:
            java.lang.String r0 = "ۚۧۨ۟ۜۜ۬ۗۡۘۖۚۙۘۛۧ۟ۥۜۥۗۢۗۦۡۘ"
            goto L_0x0002
        L_0x005b:
            r1 = -775590946(0xffffffffd1c56bde, float:-1.05989784E11)
            java.lang.String r0 = "۬۫ۜۥ۟۠۟ۙۘۘۚ۫ۥ۟۠ۢ"
        L_0x0060:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -2139549169: goto L_0x0048;
                case -1020474770: goto L_0x006f;
                case -569968423: goto L_0x0069;
                case 1923857010: goto L_0x0074;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x0060
        L_0x0069:
            java.lang.String r0 = "ۡۧ۠ۛ۟ۤۡۖۥۘۦۢۛ۬۟۫ۖ۬ۜۘۛۛۥۘۢ۠ۥۘۚ۠۠"
            goto L_0x0002
        L_0x006c:
            java.lang.String r0 = "ۚ۟ۜۘ۫۬۫۠۠ۗۡۨۢۧۥ۬ۨۡۡۘ"
            goto L_0x0060
        L_0x006f:
            if (r6 == 0) goto L_0x006c
            java.lang.String r0 = "ۛۧۙ۫ۛۨۘ۫ۤۛۤۦۦۤۙۘۘۖۖۡ۟ۘۧۦۢۗۦۦۖ"
            goto L_0x0060
        L_0x0074:
            java.lang.String r0 = "ۨۖ۠ۙۖۘۦۢ۠ۙ۫ۨۧۡۦۘ"
            goto L_0x0060
        L_0x0077:
            android.net.Uri r0 = r6.getData()
            n(r0, r7)
            java.lang.String r0 = "۟ۖۨۘۛۙۢۙ۬ۚۦۡۜۖۥۘۥۖ۠۬ۤ۫ۢ۟ۜ"
            goto L_0x0002
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.MyStatusesActivity_onActivityResult(int, int, android.content.Intent, android.app.Activity):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean NameProf() {
        /*
            java.lang.String r0 = "ۚۥۤۧۤۧۤۡۧۢ۬ۖۘۨۚۖۚۛۦۘۖۡۨ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 710(0x2c6, float:9.95E-43)
            r3 = 1306860559(0x4de51c0f, float:4.80477664E8)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1780552030: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "NameProf"
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.NameProf():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean PicProf() {
        /*
            java.lang.String r0 = "ۙۥۜۘۥۙۖۤۘۧۤ۠ۙۦۖۢۥۨۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 991(0x3df, float:1.389E-42)
            r3 = -1971831777(0xffffffff8a783c1f, float:-1.1952073E-32)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 702739719: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "PicProf"
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.PicProf():boolean");
    }

    public static void Pop_Heds(Notification.Builder builder) {
        String str = "ۤۢۥ۬ۡ۫ۨ۠ۨ۟ۥ۬ۚۥۘۧ۟ۚۘۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 778) ^ -839533724) {
                case -1962981312:
                    str = "ۘ۠۫ۤۧ۬ۘۨۥۘ۟۠ۦۛ۠ۘۘ۠ۜۘۧۖۤ۠ۘۛۜۧۨ";
                    break;
                case -1787418733:
                    String str2 = "ۦۡۦۘۨۖۧۘ۬ۜۦۡۖۖ۟ۘۥ";
                    while (true) {
                        switch (str2.hashCode() ^ -2055279970) {
                            case -2108937813:
                                if (!shp.getBooleanPriv("Pop_Heds")) {
                                    str2 = "ۦۧ۫۠ۜۥۘۦ۟ۤۘ۫ۡۘۙۚۚۧۗۘ";
                                    break;
                                } else {
                                    str2 = "ۗۜۜۘۧ۠ۥۘ۟۟ۡۥۤۥۘۚۘۨ۟ۧ۫ۜۨۦۘ";
                                    break;
                                }
                            case 155659139:
                                str2 = "ۙ۫۬ۦۤۡۨ۟ۥۢۙۘۢ۠۬۫ۗ";
                                break;
                            case 829316672:
                                str = "ۜۡۤۚۛۨۚ۠ۜۘۖۘ۬ۚۥۛۚ۠ۚۚۢ۬ۘۘۙۦ۠";
                                continue;
                            case 1738996565:
                                str = "ۤۥۧۙۡۢۛۙۢ۠ۡۘ۟ۖۘۘۖۤۧۘ۬ۡۘۥۜۡۘ";
                                continue;
                        }
                    }
                    break;
                case -845577865:
                case -238428902:
                    return;
                case -76208771:
                    builder.setPriority(-1);
                    str = "ۤۥۧۙۡۢۛۙۢ۠ۡۘ۟ۖۘۘۖۤۧۘ۬ۡۘۥۜۡۘ";
                    break;
                case 2034640314:
                    String str3 = "ۨ۬ۘۢ۠ۚۧ۠۫ۥۢۥ۟ۢ۫ۙۜۢ۠ۧۙ۟ۨۦۤۨ";
                    while (true) {
                        switch (str3.hashCode() ^ -219252884) {
                            case -1464018902:
                                str = "ۖۖ۬ۦۚۖۘۘۜۥۧۡۡۘۘۙ۫ۛۦۢ";
                                continue;
                            case -1054128043:
                                str = "۟۠ۚ۫ۚۘۛۨۢۤۙۦ۟ۨۘۘۚۖۚ۬ۥۛ";
                                continue;
                            case 244156744:
                                if (getCtx() != null) {
                                    str3 = "ۥۢۘ۠ۨۚ۟ۨ۠ۡۙۥۘ۫ۚۖۘ۟ۙۜۘۛۢۡۘۥ۫ۜ";
                                    break;
                                } else {
                                    str3 = "ۜۛۚۖ۬ۗۢۚۢ۬ۢ۠ۛۤۨ";
                                    break;
                                }
                            case 1788758037:
                                str3 = "ۥۦۦۛۧ۫۬ۜۚ۟۠۬۟ۦۥ۫ۢۨۗۥۘ۫ۛۥ";
                                break;
                        }
                    }
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        r0 = "ۛۢۧۨۢۥۘۗۖۥۧۨۥۘۜۢۖۘۦۤۥ۫ۡۖ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        r0 = "۟ۘۜۡۘۗۜ۬ۙۘۜۢ۬ۘۖ۫ۚۧۛۜۢۡ۫ۘۘۡ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int Pop_Heds_O(java.lang.String r8, int r9) {
        /*
            r2 = 0
            java.lang.String r0 = "۬ۤۦۖۙ۫ۜۘۜۘۢ۠ۘۦۜۙۡۡ"
            r1 = r2
            r3 = r2
            r4 = r2
        L_0x0006:
            int r5 = r0.hashCode()
            r6 = 256(0x100, float:3.59E-43)
            r7 = 792434453(0x2f3b9715, float:1.7061226E-10)
            r5 = r5 ^ r6
            r5 = r5 ^ r7
            switch(r5) {
                case -1484814989: goto L_0x00d4;
                case -820698426: goto L_0x0037;
                case -595177545: goto L_0x001b;
                case -563324355: goto L_0x0060;
                case 359616859: goto L_0x005c;
                case 403935588: goto L_0x00b6;
                case 564928131: goto L_0x00d4;
                case 712760297: goto L_0x0091;
                case 1180827578: goto L_0x00d3;
                case 1247759736: goto L_0x00d5;
                case 1279785898: goto L_0x0018;
                case 1471323453: goto L_0x0067;
                case 1598087109: goto L_0x0087;
                case 1757269915: goto L_0x0064;
                case 1886366694: goto L_0x006b;
                case 2081946222: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0006
        L_0x0015:
            java.lang.String r0 = "ۗۘۤۡ۟ۚۢۖۧۘۜۡۦۘۧۢ۫۟۟۬ۡۤۘۧ۠ۜۧۨ۟"
            goto L_0x0006
        L_0x0018:
            java.lang.String r0 = "۠۟ۜۘ۠ۤۖۡۧۥۘۧ۟ۜۧۗۥۥۖۙۗۦۘ"
            goto L_0x0006
        L_0x001b:
            r5 = -1343666840(0xffffffffafe94568, float:-4.243177E-10)
            java.lang.String r0 = "۫ۗۡ۟ۧۥۗ۬ۖ۬ۗۜۦ۬۠ۖۧۜۘ"
        L_0x0020:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1910869970: goto L_0x0034;
                case -1344615817: goto L_0x0029;
                case 316308487: goto L_0x002f;
                case 2089747632: goto L_0x0045;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x0020
        L_0x0029:
            java.lang.String r0 = "ۥ۫ۘۘ۠۟ۛۦ۠ۗۘۘۗۗۚۘۘ"
            goto L_0x0006
        L_0x002c:
            java.lang.String r0 = "ۙۦۨ۫ۛۙۦۡۦۘۨۘۖۥۘۦۚۛۜۤ۟ۙۥۡۧۘ"
            goto L_0x0020
        L_0x002f:
            if (r8 == 0) goto L_0x002c
            java.lang.String r0 = "۬ۙۤۗۤ۬۟ۦۜۤۤۛۥۧۦۧۡۖ"
            goto L_0x0020
        L_0x0034:
            java.lang.String r0 = "ۡۥۖۘۚۛۨۙۨ۬ۗۘ۫ۖ۫ۢ"
            goto L_0x0020
        L_0x0037:
            r5 = -493407553(0xffffffffe29732bf, float:-1.3945575E21)
            java.lang.String r0 = "ۤۦ۫ۛ۫ۗۥۗۨۨۢۥ۬ۚۛۥۡۜۘۤۦۜۘۨ۬ۨۘۨۖۘ"
        L_0x003c:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -578750190: goto L_0x0056;
                case -312053538: goto L_0x0045;
                case 409878905: goto L_0x004b;
                case 1508909984: goto L_0x0059;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x003c
        L_0x0045:
            java.lang.String r0 = "ۛۢۧۨۢۥۘۗۖۥۧۨۥۘۜۢۖۘۦۤۥ۫ۡۖ"
            goto L_0x0006
        L_0x0048:
            java.lang.String r0 = "ۦ۟ۡۧ۟ۨۚۘۙۤ۟ۘۖ۫ۘۘۢ۠ۡۘۤۥۙۖۘۗۜۙۥۘ"
            goto L_0x003c
        L_0x004b:
            java.lang.String r0 = "voip_"
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = "ۡۘ۬۠ۢۘۢ۬ۡۚۨۘۘۖۖۢ۫ۙۙ"
            goto L_0x003c
        L_0x0056:
            java.lang.String r0 = "۫ۧ۟۬۟ۜۘۖۦۛ۟۬ۘۘۦۚۜۘۢ۟ۜ۠ۗۚۖۧ۫ۤۡۜ"
            goto L_0x003c
        L_0x0059:
            java.lang.String r0 = "۫ۚۡۢۢۦۙ۟ۤۙۧۘۘ۠ۥۧۘ"
            goto L_0x0006
        L_0x005c:
            r4 = 1
            java.lang.String r0 = "۬۬ۢۢۚۤۤۢ۠ۡۦۘۤۨۖۙۧۙۥۙ"
            goto L_0x0006
        L_0x0060:
            java.lang.String r0 = "ۚ۠ۢۡۜ۬ۧۚۜ۠ۗ۬ۜۥۗ"
            r3 = r4
            goto L_0x0006
        L_0x0064:
            java.lang.String r0 = "ۘۚۖۘۗۡۥۤۚۥۜۧۛۛۦۙۘۖۦۘۛۤ۟ۨ۬ۜ"
            goto L_0x0006
        L_0x0067:
            java.lang.String r0 = "ۢۘۦ۟ۖۥۘۥۖۥۘ۫ۜ۟۫ۢ۫ۨۨ۠۠۠ۡۘ"
            r3 = r2
            goto L_0x0006
        L_0x006b:
            r5 = -374584611(0xffffffffe9ac4add, float:-2.6036097E25)
            java.lang.String r0 = "۫ۡۘۘ۠ۖۙ۟ۚۘۘۖۚ۬ۦۥۥ۫ۢۖۦ۫ۨۘۛۗۡ"
        L_0x0070:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -746255766: goto L_0x007f;
                case -407067188: goto L_0x0084;
                case 603200086: goto L_0x00d9;
                case 2088445592: goto L_0x0079;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x0070
        L_0x0079:
            java.lang.String r0 = "ۢۦۛۗۖۧۘۤۛ۫۟ۥۜۘۧۘۘۘۢۢۥۥ۬ۗ۠۟ۨۚۢۗ"
            goto L_0x0070
        L_0x007c:
            java.lang.String r0 = "ۘۤۖۘۥۖۚۥۤۖۨۢۖ۫ۗۡۘۗ۬ۦ۬۬ۛۡۥۜ"
            goto L_0x0070
        L_0x007f:
            if (r3 == 0) goto L_0x007c
            java.lang.String r0 = "ۧۨۜۤۗۘۘۗۢۡۛۥۦۘۧۤۚۛۢۡۛۚۥ"
            goto L_0x0070
        L_0x0084:
            java.lang.String r0 = "۟ۡۥۦۢۖۘۤۘۦۘۤ۫۬ۡۢۚۖۗۖۨۚۦۘۚۘۖۘ۬ۡۙ"
            goto L_0x0006
        L_0x0087:
            java.lang.String r0 = "Pop_Heds"
            boolean r1 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            java.lang.String r0 = "۠ۙۦۘۡۡ۫۬ۢۦۘۙۜ۫۫ۦۘۚۚۙۡۤۛ"
            goto L_0x0006
        L_0x0091:
            r5 = 1044289900(0x3e3e996c, float:0.18613213)
            java.lang.String r0 = "ۦ۟ۗۘۙۗۨ۬ۨ۟۟ۧ۟۠ۗۥۖۥ۠ۧۖۘ"
        L_0x0096:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -485769433: goto L_0x009f;
                case -292996111: goto L_0x00af;
                case 1289055598: goto L_0x00a6;
                case 1314012504: goto L_0x00b2;
                default: goto L_0x009e;
            }
        L_0x009e:
            goto L_0x0096
        L_0x009f:
            java.lang.String r0 = "۟ۘۜۡۘۗۜ۬ۙۘۜۢ۬ۘۖ۫ۚۧۛۜۢۡ۫ۘۘۡ"
            goto L_0x0006
        L_0x00a3:
            java.lang.String r0 = "ۧۛۜۘ۠۫۠ۙۥۧۘۢۙۛۧ۫ۨۘۚۜۨۦۗۦۥ۫"
            goto L_0x0096
        L_0x00a6:
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r0 < r6) goto L_0x00a3
            java.lang.String r0 = "۟۫ۚۨۛۚۤۗ۟ۧۦۗۚۖۨۘۗ۫ۖۘۡۧۜۘۢۚۜۘ"
            goto L_0x0096
        L_0x00af:
            java.lang.String r0 = "۫ۢ۟۬۠ۖۡۖۘۖۤ۫ۥۛۜۘۥ۬ۡ"
            goto L_0x0096
        L_0x00b2:
            java.lang.String r0 = "ۢۦۥۘۦۥۛۙۙ۠ۙۦۖۘۨۥۨ۫ۥۨۧ۫ۢ"
            goto L_0x0006
        L_0x00b6:
            r5 = -1695147345(0xffffffff9af61aaf, float:-1.01786325E-22)
            java.lang.String r0 = "ۚۛۖۘۘ۟ۜۘۗۢ۟ۦ۬ۖۚۤۥۘ"
        L_0x00bb:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1716773159: goto L_0x00c4;
                case -796061004: goto L_0x009f;
                case -80718992: goto L_0x00cb;
                case 1253609856: goto L_0x00d0;
                default: goto L_0x00c3;
            }
        L_0x00c3:
            goto L_0x00bb
        L_0x00c4:
            java.lang.String r0 = "ۡ۟ۧۙۧۖۘ۠ۡ۫ۚۧۖۛۨۖ۬ۢۘ۫ۡۚۧ۠ۛ"
            goto L_0x0006
        L_0x00c8:
            java.lang.String r0 = "ۧۗۗۖۥۦۘۙۢۜۦۘۡ۟ۨۘۘ۫ۘۜۘۡ۟ۦۘۚۥۖۘۘ۬ۢ"
            goto L_0x00bb
        L_0x00cb:
            if (r1 == 0) goto L_0x00c8
            java.lang.String r0 = "۫۬ۗۥۛۖۘۖ۫ۖۘۦۨ۫ۨۢۨۗۦۧ۠ۨۧ۟ۙۦۘۙۨۛ"
            goto L_0x00bb
        L_0x00d0:
            java.lang.String r0 = "ۜۘۜۡۗۤۗۖۚۜۤۘۘۦۦ۬ۤ۟ۖۘ۟ۥۡ۟ۛۙ"
            goto L_0x00bb
        L_0x00d3:
            r9 = 3
        L_0x00d4:
            return r9
        L_0x00d5:
            java.lang.String r0 = "ۢۘۦ۟ۖۥۘۥۖۥۘ۫ۜ۟۫ۢ۫ۨۨ۠۠۠ۡۘ"
            goto L_0x0006
        L_0x00d9:
            java.lang.String r0 = "۫ۜۜۘۘۡۜۘ۬۟۟ۚۜ۬ۧۡۚ"
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.Pop_Heds_O(java.lang.String, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int SMore() {
        /*
            java.lang.String r0 = "۬ۢۡ۬ۢۥۘۡۗ۟ۗۤۛۨۛۦۗۘۧ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 282(0x11a, float:3.95E-43)
            r3 = 543150836(0x205fd2f4, float:1.8958633E-19)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1224850466: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = 100
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.SMore():int");
    }

    public static void SetDB(SQLiteOpenHelper sQLiteOpenHelper) {
        String str = "ۛ۠ۘۜۖۨۘۗۜۗۦۨۨۘۦۡۧۘ";
        while (true) {
            switch ((str.hashCode() ^ 414) ^ 1439019721) {
                case -1558014517:
                    sql = sQLiteOpenHelper;
                    str = "ۖۥ۫ۛ۬ۖۘۤ۬ۨۘۜۖۡۜۤ۠ۢۙ۫ۘۘۡۗ۬۬ۙۜ۬";
                    break;
                case -357070752:
                    return;
                case 636825508:
                    str = "ۛۤۥۚۗۜۥۤۧ۟ۖۧۧ";
                    break;
            }
        }
    }

    public static void SetMsgs(String str, GroupChatInfoActivity groupChatInfoActivity, View view) {
        String str2 = "ۖ۟ۦۘ۠۫۫ۨۙۘۘۘ۬ۡ۠ۛۦۖۚۡۘۢۘ۟";
        String str3 = null;
        String str4 = null;
        String str5 = null;
        TextView textView = null;
        while (true) {
            switch ((str2.hashCode() ^ 701) ^ 2140667162) {
                case -2105508519:
                    str2 = "ۡۧۗۜ۬ۙۡۘۘۛۨۧۗۨۛ۟ۧۢ";
                    break;
                case -1941810925:
                    return;
                case -1808947344:
                    str2 = "ۦۥۧۘ۠ۨۧ۫ۡۖۢۡۘۨ۫ۡۛ۬ۛۜ۠۫";
                    str4 = str3;
                    break;
                case -1582627905:
                    str3 = String.valueOf(groupChatInfoActivity.Counter.get(str));
                    str2 = "۠۠ۙۢۦۡۘۧۚۨۜۜۥۘۚۖۧ";
                    break;
                case -1118191795:
                    str5 = "0";
                    str2 = "ۧۡۧۗۘۖۘۙ۟ۡۢۖۧۘۦۨۛ۠ۧۗۢ۟ۙۘۦ۟ۤۥ";
                    break;
                case -650032986:
                    str2 = "ۥۡۖۗۙۖ۠ۡۨۘۧ۬ۘۘۛۧۗ";
                    textView = (TextView) view.findViewById(getID("counter", "id"));
                    break;
                case -367510665:
                    textView.setVisibility(0);
                    str2 = "ۗۡۧۨۤۘۧ۫ۜۘۚۦۥ۟۫ۗ۟ۤ۠ۧۚۡۘ";
                    break;
                case -25633933:
                    String str6 = "۠ۚۨۗۤۛ۟ۘ۟۬ۨۘۘ۬ۤۘ۫ۧ۟۠ۤ۫";
                    while (true) {
                        switch (str6.hashCode() ^ -1707396923) {
                            case -2145114393:
                                if (groupChatInfoActivity.Counter.get(str) != null) {
                                    str6 = "ۜ۟ۜۘ۬ۜ۫۬ۚۥۧۙ۠ۢۡۦۘۙۖۘ۠ۖۜۘۧۢۥۖ۬ۥۘ";
                                    break;
                                } else {
                                    str6 = "ۤ۫ۡۥۗۨۙۤۨۘۜۤۨۘۨ۬۫ۥۗ۠";
                                    break;
                                }
                            case -1855722257:
                                str2 = "ۖۖۨۤۧۙۚ۫ۖۘۢۖ۬ۡۜۜ۬۫ۘۘۧۧۡ";
                                continue;
                            case -828356762:
                                str2 = "ۜۦ۠ۢ۬ۖۘ۠ۙۥۘۗۖۘۘۛۙۧۙۢ۫ۨۜۤ";
                                continue;
                            case 1077654067:
                                str6 = "ۢۙ۟ۡ۬ۦۘۤۘۜۘۙۚۙۦ";
                                break;
                        }
                    }
                    break;
                case 54833477:
                    str2 = "ۦۥۧۘ۠ۨۧ۫ۡۖۢۡۘۨ۫ۡۛ۬ۛۜ۠۫";
                    break;
                case 267237330:
                    str2 = "ۚۤۡۘ۬ۜۗ۬ۘۖ۫ۜ۟ۨۘ۬ۗ۠ۙ";
                    break;
                case 910601786:
                    str2 = "ۡ۟۫ۦۛۗۡۨۜۥ۟ۢۜۤۛۨۦ۬ۤ۬۟ۗۙۘ";
                    str4 = str5;
                    break;
                case 960677853:
                    str2 = "ۧ۫ۜۧۤۢۦۘۥۚۨ۟ۘۙۘ۫۬ۢ";
                    break;
                case 1733996156:
                    String str7 = "ۘۡ۠۫ۜۥۘۘ۠ۙۡ۟ۜ۬ۖۜۘۨۤۗ۫ۤۥۤۘۦۘۙۜ۟";
                    while (true) {
                        switch (str7.hashCode() ^ 29537245) {
                            case -1423675275:
                                str7 = "ۧۥۨۘ۬ۜۜۘۛۙۗۤۧۜۨۙ۟ۨۧۜ۫ۤۙۘۡۜۘۙۨۥ";
                                break;
                            case -1300396153:
                                str2 = "ۢۖۧۘ۠۬ۨۘۗۨ۫ۜۦۖۘ۟۠ۚۧ۬ۛ۬ۖۖۘ۫ۖۛۛۡۘ";
                                continue;
                            case -854602084:
                                str2 = "ۥۢۦۤۡۨۘۨۦۢۛۜ۟ۦۘۡۦۜۘۦۧۘ";
                                continue;
                            case -421153078:
                                if (groupChatInfoActivity.Counter == null) {
                                    str7 = "ۚ۬ۙۘ۫ۡ۠۬ۙۥۢۖۘ۟ۢۚۦ۫ۘ";
                                    break;
                                } else {
                                    str7 = "۠ۙۖۙۧۨۘۦۡۛۖۥ۬۫ۛ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1981536372:
                    textView.setText(str4);
                    str2 = "ۥۢۦۤۡۨۘۨۦۢۛۜ۟ۦۘۡۦۜۘۦۧۘ";
                    break;
            }
        }
    }

    public static void SetwaSettingsDB(SQLiteOpenHelper sQLiteOpenHelper) {
        String str = "ۚ۠ۖۜۥ۬ۦ۫ۛۥ۬۬ۘۢ";
        while (true) {
            switch ((str.hashCode() ^ 733) ^ -577442341) {
                case -1153169366:
                    str = "ۙ۟ۜۘۡ۟۟ۥۧۥۨۥۤۖۗۖۘۦ۬ۧۤ۫ۛ۫ۗۡۘۡۨۘ";
                    break;
                case -537201101:
                    f127s = sQLiteOpenHelper;
                    str = "ۦۘۦۘۘۗۖۘۜۧۜۤۡۨۛۜۦۘۜ۠ۘۤۢ۟۠ۧۥ۟ۛۥۘ";
                    break;
                case 2140943560:
                    return;
            }
        }
    }

    public static Class a() {
        boolean z2 = false;
        String str = "۠ۧۛۦۜۗۛ۫۠ۙۨۗۗۛۙۗۢۨ۫ۡ";
        Class<HomeActivity> cls = null;
        Class<HomeActivity> cls2 = null;
        Class<HomeActivity> cls3 = null;
        Class<HomeActivity> cls4 = null;
        Class<HomeActivity> cls5 = null;
        Class<HomeActivity> cls6 = null;
        while (true) {
            switch ((str.hashCode() ^ 92) ^ 1823112957) {
                case -1995417222:
                    str = "۫ۚۥۘۥۢۙۜ۠۠ۗۦۘۘۤۨۘۧۡۘ";
                    break;
                case -1569137768:
                    str = "ۙۨۙۗۖۡ۫ۧۘۘ۟ۗۥۖۚۥۘ۟۫ۧ";
                    break;
                case -930494532:
                    str = "ۙۨۙۗۖۡ۫ۧۘۘ۟ۗۥۖۚۥۘ۟۫ۧ";
                    cls4 = cls3;
                    break;
                case -475659814:
                    return cls2;
                case 95371466:
                    cls5 = LockUtils.getAppLockType();
                    str = "ۘۗۦۨۜ۬۬ۘۘۚۡ۠ۢۡۦۙۗۜۘۢۡ";
                    break;
                case 182904874:
                    String str2 = "ۥۜۘۥۛۚۦۛۗۖۤ۬ۖۦۛۙۡۘ۟ۡۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 627565000) {
                            case -2083449730:
                                if (cls4 != null) {
                                    str2 = "۫ۡۜۘۚۚۨۘۘ۫ۜۘۛۛۚۦۥۦۘۧۘ۬";
                                    break;
                                } else {
                                    str2 = "ۗۦ۫۬ۢۡۘۙ۠ۨۘۦ۠ۦ۬ۛۛۤ۬ۨۥۙۥۥۖۥ۟ۨۖۘ";
                                    break;
                                }
                            case 985540070:
                                str2 = "ۧ۫ۥۘۛۚۜۨۡۧ۬ۚۥۘۡۡۘۙ۠ۦۘۡۙ۠ۡۤ۬";
                                break;
                            case 1009123585:
                                str = "ۛۙۨۘۥ۟ۡۘ۠۠۬ۦۡۘۘ۠ۡۨ۫ۢۤ۟ۖ۠ۜ۠۠";
                                continue;
                            case 1454098313:
                                str = "ۧ۫ۥۘۦۜۙۦۙۤۦۤ۠۟ۚۗ";
                                continue;
                        }
                    }
                    break;
                case 406628605:
                    cls6 = HomeActivity.class;
                    str = "ۗۤ۬ۛۛۛۖۡۖۖۖ۟ۙ۠ۦۘۛۢۡۘۚۨۖۘۗۦۦۘۧۘۧ";
                    break;
                case 439570240:
                    str = "۬ۤۙۡۘۡۤ۬۟ۤۛۦۗۚ۬ۦ۠ۦ۟ۖۚ۫ۧ";
                    cls2 = cls6;
                    break;
                case 744296967:
                    str = "ۛۡۡۘۨ۟۫۬ۙۥۘۖۘۖۘۨۙۦۥ۬ۖۡۢۥۜ۫ۛ";
                    cls3 = HomeActivity.class;
                    break;
                case 859255231:
                    String str3 = "ۨۖۨۘۗۚ۠ۘۥۤۛۗۘ۠ۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 1481622047) {
                            case -851269295:
                                str = "ۨۛۡۘ۟ۛۛۡۙۧ۬ۦۖۗۗ۟ۛۤۖۘۡۤۧۤۥۨ";
                                continue;
                            case -433437437:
                                if (!z2) {
                                    str3 = "ۛۤ۟ۙۧ۠ۗۢۨۥ۠ۜۘۙۡۗۗۖۘ";
                                    break;
                                } else {
                                    str3 = "ۘۧۨۘۢ۬ۚۙۗۘ۟۫ۨۘ۫ۗ۟ۙۙۥۘ۠ۡۘ";
                                    break;
                                }
                            case 1614372989:
                                str = "ۤ۬ۜۚۦۚۛۨ۠ۙۥۧۘۗۖۥ۫۟ۗ۟ۜۦۙۘۦۙۜۦۘ";
                                continue;
                            case 1912331177:
                                str3 = "ۦۤۛۖ۫ۥۧۚ۫ۨۨۘ۫ۥۨۘۜۖۤۗۜۘۘۦۦ۠";
                                break;
                        }
                    }
                    break;
                case 944046722:
                    str = "۫۠۬۫۫ۡ۟ۢۘۘۧۗۦۛۢۚۘ۬۟ۗۖۜۘ";
                    z2 = isAppLocked();
                    break;
                case 1081264660:
                    str = "۫ۚۥۘۥۢۙۜ۠۠ۗۦۘۘۤۨۘۧۡۘ";
                    cls2 = cls;
                    break;
                case 1230343134:
                    str = "ۡۘۜۡۨۥۘۘۚۢ۠ۡ۫ۢۦۧۜۦۘۤۧ۬";
                    cls = cls4;
                    break;
                case 2078929379:
                    str = "۬ۜ۠ۢ۟ۖۘۨۛۗۤۘ۫۟ۜۘ";
                    cls4 = cls5;
                    break;
            }
        }
    }

    public static Intent a2(Intent intent) {
        String str = "ۚۙۨۜۥ۬ۥۜۛ۫ۥۘۘۚۤۜۘ";
        Intent intent2 = null;
        Intent intent3 = null;
        while (true) {
            switch ((str.hashCode() ^ 800) ^ -1136000086) {
                case -2007287319:
                    String str2 = "ۤۜۦۘۢۡۡۘۖۤ۠۠ۡۨۨۛۨۗۡۨ";
                    while (true) {
                        switch (str2.hashCode() ^ -1833035246) {
                            case -1671711316:
                                if (!isAppLocked()) {
                                    str2 = "۬۟ۨۘۤۘۖۜ۟۟۬ۨۘۘ۫ۚۦۘۜۙ۫";
                                    break;
                                } else {
                                    str2 = "۫۠ۥۚۙۖۘۜۤۜۧۜۢۧۛ۫ۤۢۡ۠ۙ";
                                    break;
                                }
                            case -534562388:
                                str = "ۥۢۘۘۢۘۙۘۖۥۘ۫ۘۥۘۚۤ";
                                continue;
                            case 908271366:
                                str = "ۨۛۙ۫ۧۚ۠ۥۧۘۨۗۢۤۦۘۤ۬ۦ۟ۖۥۜۡۥۤ۬ۦ";
                                continue;
                            case 1824101565:
                                str2 = "۟ۡ۠ۗۧۘۘۧۛ۫ۛۙۢۧ۟ۦۘۜۘ۟";
                                break;
                        }
                    }
                    break;
                case -1413121749:
                    intent2 = new Intent().setClassName(getCtx().getPackageName(), a2());
                    str = "۟ۡۗۙۛۧ۟ۡۡۨۜۥۘۗۙۥۗ۫ۜۚۦ۫";
                    break;
                case -453651677:
                    str = "ۨۘ۬ۛ۫ۧۜۨ۬ۡۘۘۘ۠۟ۜۘۖۢۜۘۤۚۘ";
                    intent3 = intent;
                    break;
                case -350908818:
                    str = "ۨۛۙ۫ۧۚ۠ۥۧۘۨۗۢۤۦۘۤ۬ۦ۟ۖۥۜۡۥۤ۬ۦ";
                    intent3 = intent2;
                    break;
                case 1204531477:
                    return intent3;
                case 1346331936:
                    str = "۫۟ۢۘۥۖ۫ۨۚ۠۟ۖۘ۫ۤۡۘۤۡۗۤۢۤۨۙۙ";
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a2() {
        /*
            java.lang.String r0 = "ۛ۬ۨۘۧۨۗۥۨۤ۫ۙۨۘۘۘۗۨۜۘۚ۫ۤۨۢۡۘۨۖۜۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 772(0x304, float:1.082E-42)
            r3 = -845391660(0xffffffffcd9c58d4, float:-3.27883392E8)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -710072985: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.Class r0 = a()
            java.lang.String r0 = r0.getCanonicalName()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.a2():java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        r3 = "ۗۢۧۛۙۗۧۨۤۡۗۢۖۙۦۙۡۥۦۛۛۤ۬";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void addFMAnnHeader(android.widget.ListView r20) {
        /*
            r14 = 0
            r13 = 0
            r12 = 0
            r11 = 0
            r9 = 0
            r10 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r4 = 0
            java.lang.String r2 = "ۨۧۢۤۧۦۜ۫۬ۜ۬۫ۥ۠ۦ"
            r3 = r2
        L_0x000e:
            int r2 = r3.hashCode()
            r15 = 694(0x2b6, float:9.73E-43)
            r16 = 996110469(0x3b5f7085, float:0.0034094166)
            r2 = r2 ^ r15
            r2 = r2 ^ r16
            switch(r2) {
                case -2098228363: goto L_0x00e8;
                case -2058881539: goto L_0x01ad;
                case -1682707430: goto L_0x00ee;
                case -1596741800: goto L_0x0131;
                case -1340542223: goto L_0x010b;
                case -1296839852: goto L_0x0199;
                case -1056809105: goto L_0x017e;
                case -1050024935: goto L_0x015c;
                case -989634290: goto L_0x00e2;
                case -877711820: goto L_0x0142;
                case -262415153: goto L_0x0022;
                case -240864732: goto L_0x007d;
                case -181248315: goto L_0x0101;
                case -108981954: goto L_0x018c;
                case -89016725: goto L_0x016c;
                case 178815683: goto L_0x00dc;
                case 661428574: goto L_0x01a8;
                case 844322268: goto L_0x0151;
                case 876557822: goto L_0x001e;
                case 1609367580: goto L_0x011c;
                case 1726630436: goto L_0x0064;
                case 1890640948: goto L_0x0043;
                case 1898607544: goto L_0x0124;
                case 1965977054: goto L_0x008f;
                case 2106827830: goto L_0x00a2;
                case 2109570784: goto L_0x00d6;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x000e
        L_0x001e:
            java.lang.String r2 = "ۢۢۢۥۢۜ۠ۢۜۜ۬ۡۘۨ۠ۤ۟ۗۤۜۛ۟"
            r3 = r2
            goto L_0x000e
        L_0x0022:
            r3 = 1446110220(0x5631e40c, float:4.8898253E13)
            java.lang.String r2 = "۫۟ۚۗ۠ۧۛۘۥۘۥۜۡۜۛۗ۫ۨۦۗۦۘ"
        L_0x0027:
            int r15 = r2.hashCode()
            r15 = r15 ^ r3
            switch(r15) {
                case 162399655: goto L_0x003c;
                case 1465574234: goto L_0x0037;
                case 1907287717: goto L_0x003f;
                case 1935524125: goto L_0x0030;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0027
        L_0x0030:
            java.lang.String r2 = "ۗۢۧۛۙۗۧۨۤۡۗۢۖۙۦۙۡۥۦۛۛۤ۬"
            r3 = r2
            goto L_0x000e
        L_0x0034:
            java.lang.String r2 = "ۦ۟ۘۘ۫ۧ۬ۖۦ۬۠ۢۙۤۚۙۡۦۧ"
            goto L_0x0027
        L_0x0037:
            if (r20 == 0) goto L_0x0034
            java.lang.String r2 = "۠ۤۦۘۤۛۘ۫ۜ۫ۧۘ۟ۚ۬ۜ"
            goto L_0x0027
        L_0x003c:
            java.lang.String r2 = "ۥۖۙ۟ۡ۫ۜۥۧۙۥۖۢۡۦۚۗ۠"
            goto L_0x0027
        L_0x003f:
            java.lang.String r2 = "ۤۦۖۘۥ۟۬ۧۛ۬ۖۜۦ۫ۦۘ"
            r3 = r2
            goto L_0x000e
        L_0x0043:
            r3 = -402437489(0xffffffffe8034a8f, float:-2.4800215E24)
            java.lang.String r2 = "ۨۚۨۢۡۛ۟ۘۘۦ۟ۥۤۡۙۗۖۧۘۡ۬ۦۛۘۡۡۡۡۘ"
        L_0x0048:
            int r15 = r2.hashCode()
            r15 = r15 ^ r3
            switch(r15) {
                case -333987882: goto L_0x0058;
                case 293709984: goto L_0x0051;
                case 577830902: goto L_0x0061;
                case 825426115: goto L_0x0030;
                default: goto L_0x0050;
            }
        L_0x0050:
            goto L_0x0048
        L_0x0051:
            java.lang.String r2 = "ۨۤۧ۬۠ۚ۟ۡۦۘ۟ۢۦۘۗۘۜ"
            r3 = r2
            goto L_0x000e
        L_0x0055:
            java.lang.String r2 = "ۦۥۙۖۤۖ۟ۡۘۘۖ۫ۖۗۚۡۘۛۜۘ"
            goto L_0x0048
        L_0x0058:
            boolean r2 = o()
            if (r2 == 0) goto L_0x0055
            java.lang.String r2 = "ۚۘ۠ۧۡۖۦۙۥۜۦ۬۟ۥۡ۬ۤۨۘ"
            goto L_0x0048
        L_0x0061:
            java.lang.String r2 = "ۛۜۨۦۛۡۘ۠ۙۢۡۧۦۦۢۢۥۛ۠ۢۦۨۘۘ۬ۧۛۦۥۘ"
            goto L_0x0048
        L_0x0064:
            android.content.Context r2 = r20.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            java.lang.String r3 = "fmnews_statuses_row"
            java.lang.String r14 = "layout"
            int r3 = getID(r3, r14)
            r14 = 0
            android.view.View r14 = r2.inflate(r3, r14)
            java.lang.String r2 = "ۘۡۨۘۘۦۖۘۘ۠ۖۘۡۢ۫۟۟۬ۗۚۙۨۙۡۘۤۗۨۘ۬۟ۖ"
            r3 = r2
            goto L_0x000e
        L_0x007d:
            java.lang.String r2 = "contact_photo"
            java.lang.String r3 = "id"
            int r2 = getID(r2, r3)
            android.view.View r2 = r14.findViewById(r2)
            com.obwhatsapp.yo.StatusImageView r2 = (com.obwhatsapp.yo.StatusImageView) r2
            java.lang.String r3 = "ۗۗ۫ۛۘۗۤۤۦۘۤ۟ۥ۫۠۟ۡۙۦ"
            r13 = r2
            goto L_0x000e
        L_0x008f:
            java.lang.String r2 = "date_time"
            java.lang.String r3 = "id"
            int r2 = getID(r2, r3)
            android.view.View r2 = r14.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r3 = "ۧۚۛ۠۬ۗۖ۟۬ۚ۟۫ۗۜۘ۠ۘۨۚ۫ۙ"
            r12 = r2
            goto L_0x000e
        L_0x00a2:
            r3 = -85389158(0xfffffffffae9109a, float:-6.0507094E35)
            java.lang.String r2 = "ۛۖۖۜۨۦۢۧۧۙۨۜۦۖ۠"
        L_0x00a7:
            int r15 = r2.hashCode()
            r15 = r15 ^ r3
            switch(r15) {
                case -1912287076: goto L_0x00b0;
                case -541964230: goto L_0x00d1;
                case -334708298: goto L_0x01a3;
                case 677296758: goto L_0x00ce;
                default: goto L_0x00af;
            }
        L_0x00af:
            goto L_0x00a7
        L_0x00b0:
            r16 = -3103607061953(0xfffffd2d629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r16)
            r15 = 0
            int r2 = com.obwhatsapp.yo.shp.getIntPriv(r2, r15)
            long r16 = com.obwhatsapp.yo.z.b(r2)
            r18 = 0
            int r2 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r2 == 0) goto L_0x00cb
            java.lang.String r2 = "ۧ۫ۘۘۘۨۙ۟ۦۙۡۘۥۘۜۙۧۢۛۘ"
            goto L_0x00a7
        L_0x00cb:
            java.lang.String r2 = "ۥۖۖۘۢۖۡۧۢۥۘۢۥۨۘۢ۠ۥ"
            goto L_0x00a7
        L_0x00ce:
            java.lang.String r2 = "ۡۙۙۦۡ۠ۨ۠ۢ۟ۖۖۚۦۥ"
            goto L_0x00a7
        L_0x00d1:
            java.lang.String r2 = "ۡۘۦۦۦۦۘۚۚۘۘۡۧۜۘۧۖۖۘۘۘۤۛۛۗۧۤۗ"
            r3 = r2
            goto L_0x000e
        L_0x00d6:
            r11 = 1
            java.lang.String r2 = "ۚۨۥۘۨۡۦۘۜۛۤۤۘ۬۠ۖۖۘۘۘۧ"
            r3 = r2
            goto L_0x000e
        L_0x00dc:
            java.lang.String r2 = "۬ۚۨ۬ۛۖۡۥۘۨۢ۬ۗ۬۬ۡۡ۟۬ۙ۟ۧۗۙۢۧۜ"
            r3 = r2
            r10 = r11
            goto L_0x000e
        L_0x00e2:
            r9 = 0
            java.lang.String r2 = "۫ۦۥۘ۬ۘۡۘۨ۟ۤ۟ۖۛۙۜۧۖۗۦۘۙۛۥ۠ۡۘۘۙۖۘ"
            r3 = r2
            goto L_0x000e
        L_0x00e8:
            java.lang.String r2 = "ۦۦۜۘۚۛۛ۠۟ۘۘ۟۠۟ۘۦۘ"
            r3 = r2
            r10 = r9
            goto L_0x000e
        L_0x00ee:
            r2 = -3245340982721(0xfffffd0c629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            r3 = 0
            int r8 = com.obwhatsapp.yo.shp.getIntPriv(r2, r3)
            java.lang.String r2 = "۠۟ۡۘۧۘ۫ۥۜۧۘۢۤۦۘۤۧ۫ۖۛ۬ۥۨۘ"
            r3 = r2
            goto L_0x000e
        L_0x0101:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "ۗۦۛۗۢ۬ۙۥۥۘۦ۠۫ۨ۫ۥۧ۬۬ۚۚ"
            r3 = r2
            goto L_0x000e
        L_0x010b:
            r2 = -3292585622977(0xfffffd01629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            r7.append(r2)
            java.lang.String r2 = "ۦۘۙ۬ۦۗ۫۫ۦۧ۟ۨۘۙ۫ۦۘۗۙۡۦ۟ۥۘ"
            r3 = r2
            goto L_0x000e
        L_0x011c:
            r7.append(r8)
            java.lang.String r2 = "ۗۘۨۙۧۨۘۛ۠۟ۘۙۡۦۜۖۘۨۘۜ۫ۛۤ"
            r3 = r2
            goto L_0x000e
        L_0x0124:
            java.lang.String r2 = r7.toString()
            java.lang.StringBuilder r6 = a.a.g(r2)
            java.lang.String r2 = "ۧۧۨۘ۟ۙۢۢۖۖۘۨ۬۟ۡۨۜۘۧۧۛ"
            r3 = r2
            goto L_0x000e
        L_0x0131:
            r2 = -3314060459457(0xfffffcfc629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            r6.append(r2)
            java.lang.String r2 = "ۡۨۡۦ۬ۡۘۗۙ۠۫ۚۘۥۨ۟ۚ۠ۗۡۘ۠ۡۖ"
            r3 = r2
            goto L_0x000e
        L_0x0142:
            java.lang.String r2 = r6.toString()
            r4 = 0
            long r4 = com.obwhatsapp.yo.shp.getLongPriv(r2, r4)
            java.lang.String r2 = "ۘ۟ۜۖ۬ۧۤۗ۬ۥۤ۠۠ۜۦۜ۟۟ۥ"
            r3 = r2
            goto L_0x000e
        L_0x0151:
            r2 = r10 ^ 1
            r3 = 1
            r13.setInfo(r2, r3)
            java.lang.String r2 = "ۜۡ۠ۦۨۦۧۛۙۘۡۜۘۜۗۦۙۙ"
            r3 = r2
            goto L_0x000e
        L_0x015c:
            java.lang.CharSequence r2 = android.text.format.DateUtils.getRelativeTimeSpanString(r4)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r12.setText(r2)
            java.lang.String r2 = "ۢۛۧۜ۫ۘۜۤ۫ۤ۫ۦ۟ۨۘ"
            r3 = r2
            goto L_0x000e
        L_0x016c:
            com.obwhatsapp.yo.t1 r2 = new com.obwhatsapp.yo.t1
            r2.<init>(r4, r12)
            r16 = 60000(0xea60, double:2.9644E-319)
            r0 = r16
            r12.postDelayed(r2, r0)
            java.lang.String r2 = "ۨۚۧۗۡ۫۫ۘۜۘۢۤۖۘۧۛۛ۫ۛ۬ۤۖۖ۠ۦۘ"
            r3 = r2
            goto L_0x000e
        L_0x017e:
            e.g r2 = new e.g
            r3 = 2
            r2.<init>(r14, r3)
            r14.post(r2)
            java.lang.String r2 = "ۧۡ۠۟ۡۥ۠ۜۡۘۥۗۥ۠ۜۙۧۖۦ۬ۗۨۘ۫ۨۢ"
            r3 = r2
            goto L_0x000e
        L_0x018c:
            com.obwhatsapp.yo.o1 r2 = new com.obwhatsapp.yo.o1
            r2.<init>(r4, r13)
            r14.setOnClickListener(r2)
            java.lang.String r2 = "ۡ۬ۘۘ۟۬ۤۚۤۡۘۤۥۨۙۤۗۗۘۙۛۤۜۥ۬ۛ"
            r3 = r2
            goto L_0x000e
        L_0x0199:
            r0 = r20
            r0.addHeaderView(r14)
            java.lang.String r2 = "ۗۢۧۛۙۗۧۨۤۡۗۢۖۙۦۙۡۥۦۛۛۤ۬"
            r3 = r2
            goto L_0x000e
        L_0x01a3:
            java.lang.String r2 = "ۦۢ۬ۡۡۨ۬ۨۧۘۡ۟۫ۜ۠ۨۧۗۡۘۤ۠ۜ"
            r3 = r2
            goto L_0x000e
        L_0x01a8:
            java.lang.String r2 = "ۦۦۜۘۚۛۛ۠۟ۘۘ۟۠۟ۘۦۘ"
            r3 = r2
            goto L_0x000e
        L_0x01ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.addFMAnnHeader(android.widget.ListView):void");
    }

    public static void addHiOpt(Menu menu, ConversationsFragment conversationsFragment2) {
        String str = "ۚۛۖۘۦۦۚۨۛۦۘۘۖ۠ۙۢۗۘ۫۠ۙۧۡۗۥۚ";
        MenuItem menuItem = null;
        MenuItem menuItem2 = null;
        MenuItem menuItem3 = null;
        LockOptions lockOptions = null;
        int i2 = 0;
        while (true) {
            switch ((str.hashCode() ^ 109) ^ 488673918) {
                case -2119225327:
                    G = conversationsFragment2.A2Q;
                    str = "ۚ۫ۤۡۜۛۘ۫۠ۛۛ۟ۥۗۨۤۥ۠۟۬۟ۚۤۛ۠";
                    break;
                case -1893484211:
                    E = menuItem;
                    str = "۠ۙۥ۫ۜۗۧۦۤۚ۠۟ۦ۬ۘۡۘۘۘ";
                    break;
                case -1195113747:
                    str = "ۛ۟۟ۧۢۚۢۨ۠ۤ۬ۦۙۥۜ۠ۥۘ";
                    break;
                case -1131039902:
                    return;
                case -885012636:
                    lockOptions.setJID(hideJidCode).setPassedIntent((Intent) null).setJustCloseAfterSuccess(true).setFingerprintBlackBack(true).setChangePass(false).setDisableLock(false).setConversation(false);
                    str = "ۚ۬ۘۘۥۧ۬ۧۗۖۧۨۨۗ۬ۖۘۡ۫ۖۙۦۧۘۢۦ۠";
                    break;
                case -839964595:
                    lockOptions = new LockOptions();
                    str = "ۤۗۛۛۖۚۛ۫ۖۘۖۘۛۛۜۖۘۦۚ۬۟ۢۙۦۘۘۙۥۘ";
                    break;
                case -170182772:
                    str = "۟ۖۨۤۗۜۘۘ۠ۦۘ۬۬۟ۚۨ۟ۤ۬۬ۨۙ";
                    break;
                case 281151946:
                    String str2 = "ۖۤ۠ۖۦۜۘۢۤۤۧ۬ۥ۟ۗۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -477646002) {
                            case -1805040260:
                                str = "ۙۧ۫ۙ۬۬ۢۡۙۨۗۚۧۢۦۘۙ۫ۡۘۖۦۖۦۦۧۘ";
                                continue;
                            case 703116970:
                                if (!F) {
                                    str2 = "ۦۥۧۘۛ۠ۖۜ۠ۡۚۡۗۙ۟ۛۛۤۤۙۧۛۢ۟ۢ";
                                    break;
                                } else {
                                    str2 = "ۤ۫ۦۢۚۖۘۥ۠ۥۨۤ۫ۘۗۧۗۜ۫۟ۘۤۚۙ";
                                    break;
                                }
                            case 1355077541:
                                str = "ۛ۟ۖۘۢ۫ۙۤۚۤ۬ۤۧۡۨۜۚۛۨ۬ۙۛۧۘۡۚۙۧ";
                                continue;
                            case 1984281088:
                                str2 = "ۢۗ۫ۙ۟ۚۧۛۥۤۤ۟ۛۛۧۥۡۢ";
                                break;
                        }
                    }
                    break;
                case 529475399:
                    str = "ۙۦۦۧۛۦۦ۠۫ۢۥۚۚۛ۟";
                    menuItem2 = menuItem3;
                    break;
                case 672825439:
                    i2 = getID("div2", "id");
                    str = "ۨ۬۟۬ۜۗۤۤۖۘۥۥ۟ۜۜۧ۠ۗۙۤۥۧۘ";
                    break;
                case 819033704:
                    str = "۟ۖۨۤۗۜۘۘ۠ۦۘ۬۬۟ۚۨ۟ۤ۬۬ۨۙ";
                    menuItem2 = menuItem;
                    break;
                case 983576216:
                    str = "ۧۙۖۘۖ۠ۥۦۚۗۥۜ۫ۦۖۜۘۥۛ۟ۛۢ";
                    break;
                case 986477178:
                    others.menuItemColor(menuItem2);
                    str = "۟ۢۨۘ۠ۙۥۘ۠ۗۖۘ۬۠ۥۘۥۖۘ۬ۙۦ";
                    break;
                case 1512265095:
                    menuItem = menu.add(0, i2, 2, getString("hide_chat")).setIcon(getID("design_ic_visibility_off", "drawable")).setOnMenuItemClickListener(new n1(lockOptions, 1));
                    str = "ۖۖ۫ۗۨۡۘۘۨۢۘۚۙ۟۠۫۫ۡۤۥۧۦۘ۟ۜۧۘ";
                    break;
                case 1773860602:
                    menuItem3 = menu.add(0, i2, 2, getString("unhide_chat")).setIcon(getID("design_ic_visibility", "drawable")).setOnMenuItemClickListener(new n1(lockOptions, 0));
                    str = "۟ۜۦۜۨۛۨۡۧۘۙۛۨۘ۠ۦۘۢۗۖۘۛۡۘۘۥۥۡ";
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean always_online() {
        /*
            java.lang.String r0 = "۠ۦۡۘۨۥ۬۫ۦۘۘۥۥ۬ۧۤۥۥۢ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 54
            r3 = 1939493656(0x739a5318, float:2.4453707E31)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 285460936: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "always_online"
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.always_online():boolean");
    }

    public static String bIc() {
        int i2 = 0;
        StringBuilder sb = null;
        String str = "ۨۗۡۘۘ۫ۡۗۨۙۖۡۘ۟ۗۖۘۢۖۥۘۛۥۘۢ۟ۚۙ۬ۦ";
        while (true) {
            switch ((str.hashCode() ^ 5) ^ -497189820) {
                case -1720096958:
                    return "yousef";
                case -1655650569:
                    i2 = shp.getIntPriv("cIcon");
                    str = "ۖۚۨۖ۟ۡۘ۫۠ۜ۠ۜۥۘۘ۠ۛ";
                    break;
                case -1613937961:
                    sb.append(".");
                    str = "ۛ۟۠ۤۤۤۘۜۥۢۨۤۚۨۥۘۧۦ۬ۢۢۗۨۘۚۙۜۘ";
                    break;
                case -1598214270:
                    sb = new StringBuilder();
                    str = "ۨ۠ۗۢ۬ۢۚۖۜۘۚۜۥۘ۠ۧۛۢ۬۫ۗ۟ۦ";
                    break;
                case -1459039910:
                    sb.append(i2);
                    str = "ۢۦۗۨۘۗۖۧۧ۫۬ۙۛۚۨ";
                    break;
                case 17121632:
                    String str2 = "ۜۗۘۘۗۥۘۨ۠ۥۘۡۡۡۦۖۜۘ۫ۙۥۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1349815946) {
                            case -1414964177:
                                str = "ۚۚۥۤۤۗ۬ۖۙۦۘۦۢۦۘۢۚ۟ۜۛ۬";
                                continue;
                            case 216184159:
                                str = "۬۠۠ۡۛۘۨۥۜۘۦ۠ۚۨۨۘ";
                                continue;
                            case 632552769:
                                str2 = "ۦ۠ۥۘۨۤۥۤ۟ۚۧۧۥۘۡۢۡۘۦ۟ۜۥ۟ۦ۬ۤۜ۠ۚ۬";
                                break;
                            case 1012758398:
                                if (shp.getBooleanPriv("disable_bcounter")) {
                                    str2 = "ۘۧ۟ۨۨ۫ۢۥۙۘۘۧۘۚۡۨ";
                                    break;
                                } else {
                                    str2 = "ۗۙ۠ۛۖۦۘۘۘ۬۫ۦۢۙۤ۟ۖۥۚۙۨۨۘ۠۟ۦ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1033660242:
                    return sb.toString();
                case 1660754954:
                    sb.append(mpack);
                    str = "ۦۜۜۙۡ۟ۦۧۡۘۧۥ۬ۜۦۙۦۧۡ";
                    break;
            }
        }
    }

    public static int cen(int i2) {
        String str = "۟ۡۤۜۢۦۚۜۛۨ۟ۥۘۦۥۜۘ";
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            switch ((str.hashCode() ^ 514) ^ 1834683091) {
                case -1950426451:
                    str = "ۨۦۜۘۗۤۖۘۛ۟ۢۡۦۖۘ۫ۗۖۘ۬ۧۧ۠ۗۙۦۡۘ";
                    i6 = i5;
                    break;
                case -1747738651:
                    str = "ۘۜ۬ۙۘۤۖۛۡۘۤۤ۠ۛۧۡۘۦۢۡۖۜۨۜۦۡۘۢ۬ۦ";
                    i8 = Integer.parseInt(shp.getPrefString("convostyle", "0"));
                    break;
                case -1544902390:
                case -209576799:
                case 90898420:
                    str = "ۛۤ۫ۘۚۡۖۖۡۜۜۘۜۢ۟۟ۙۚ";
                    break;
                case -1509462399:
                    str = "ۨۦۜۘۗۤۖۘۛ۟ۢۡۦۖۘ۫ۗۖۘ۬ۧۧ۠ۗۙۦۡۘ";
                    break;
                case -1447868924:
                    String str7 = "۫ۤۗۚۘۘۘۥۜۖۜۢۢۜ۬۟۠ۛ۫ۢۧۤۥۖۘ";
                    while (true) {
                        switch (str7.hashCode() ^ 1949631403) {
                            case -1047491447:
                                if (i8 == 2) {
                                    str7 = "ۖۢۧ۟ۙۙۨۢۤۖۘ۬۠ۡۚۡۥۥۘۤۜۛ";
                                    break;
                                } else {
                                    str7 = "ۙۛۧۤۙۥ۟۠ۥۢ۟ۡ۫ۖۘۘۖۖ۟";
                                    break;
                                }
                            case -107221342:
                                str7 = "ۚ۟ۢۚ۫ۦۘۤۧۡۘۖۖ۬ۜۦۦۘۖۛۧۜۛۘۘۚۢۡۛۙۢ";
                                break;
                            case 682992789:
                                str = "ۙۧۛۛ۠ۦۧۚۨۡۖ۠ۚۡۘۥۛۤ";
                                continue;
                            case 1135404380:
                                str = "ۨۖۦۘ۫ۢۦۘ۫ۢۤ۟۠ۜۘۗۜۖ۟ۗۜۛ۫";
                                continue;
                        }
                    }
                    break;
                case -1215314988:
                    str = "ۨۤۛۡۥۤۗ۬ۡۡۡۛۨ۠ۖۖۥۡۨۥۧۘۡۚۨۘۥۢۙ";
                    i4 = i2;
                    break;
                case -1210190461:
                    str = "ۜۥ۫ۧۗۚۗۤۘۤۙ۟ۘۧۘۥ۫ۘۘۢۗۛۦۢ۠ۤۛ";
                    str3 = "yowa_style_stockcentered_conversation_actionbar";
                    break;
                case -1123959352:
                    str = "ۗۘۙۖۜ۟ۖۢۖۨ۟۟۬ۢۜۚ۬ۖۘ";
                    str5 = str6;
                    break;
                case -897901141:
                    str = "ۦۥۧۘۜ۬ۛۜۢۘۛۗۦۗ۠ۦۘۚۘۥ۫ۙۨۢۜۘ";
                    i4 = i3;
                    break;
                case -853123510:
                    str = "ۧ۠ۡۘۘۘۡ۠ۙۖۥۗۜۧۨۡۘۜ۠ۖ";
                    i5 = getID(str5, "layout");
                    break;
                case -738535517:
                    str = "ۛۤ۫ۘۚۡۖۖۡۜۜۘۜۢ۟۟ۙۚ";
                    str5 = str2;
                    break;
                case -487631818:
                    String str8 = "۟۬ۧ۟۟ۛۦۘ۫۟۬ۤ۠ۨۘ۫۟ۘ۬ۥۤ";
                    while (true) {
                        switch (str8.hashCode() ^ 1433884505) {
                            case -138949220:
                                str = "ۘۥۡۛۖۗۚۡ۫ۚۥۜۘ۠ۚۛۦ۠ۘۢۥۘۖۥ۠";
                                continue;
                            case 1751867046:
                                str = "ۙۗۦۘ۫ۛۦۘۥۤۖۘ۫ۨۘۤۜۥۘۗۤۖۘ";
                                continue;
                            case 1768410992:
                                str8 = "ۚۤۨۗۥۚۜۧۥۗۥۧۘۤۢۡۨۤۛ۠ۧۡۘۚۗۡ";
                                break;
                            case 2142385281:
                                if (i8 == 3) {
                                    str8 = "ۧ۠ۥۘ۟ۜۚۙۤۨۤۡۥۥۦۙ۟ۘۚ";
                                    break;
                                } else {
                                    str8 = "۠ۦۡۧۧۚۛۧۨۙۧۡ۬ۖۧۧۧۧۥ۬ۚۡ۠ۡۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case -324238544:
                    str = "ۦۥۧۘۜ۬ۛۜۢۘۛۗۦۗ۠ۦۘۚۘۥ۫ۙۨۢۜۘ";
                    break;
                case -282574957:
                    str = "ۦۙۥۘ۬ۗۧۜۛۦۘۧۘۛۢۦۜۘ۫ۚۖۗ۫ۨۘ";
                    i7 = i2;
                    break;
                case -209350954:
                    String str9 = "ۙۚۡۜۥۧۡۚۗۨۧۘۘۗ۬ۘ۟ۧۖ۫۟۠ۧۢ";
                    while (true) {
                        switch (str9.hashCode() ^ 650019458) {
                            case -1543695234:
                                str = "۟ۗۖۘۜۨۚۜ۟ۨۘۡۥۚۗۚ";
                                continue;
                            case -1127316833:
                                if (i8 == 1) {
                                    str9 = "ۜۙۦۥ۬ۡۘۢۙۢۖۨۚۡ۠ۨۘۡ۟ۡۘۘۙۥۘ";
                                    break;
                                } else {
                                    str9 = "ۤ۟ۘۖۖۡۤۜ۫ۚۨۚۡۤۛۘۢۚ۬ۨۖۥۤۨ";
                                    break;
                                }
                            case 99381062:
                                str9 = "ۗۢۡۘۗ۫ۖۘۡ۬ۖۙۧۗۧۧ";
                                break;
                            case 1389616212:
                                str = "ۙۗ۠۬ۖۤ۫ۛ۬ۦۦۧۘ۬ۤۢۖۦۛۙۡ۠ۗۡۡ";
                                continue;
                        }
                    }
                    break;
                case 198698257:
                    str = "ۥۡۦۘۤ۟ۡۤۧۡۦ۟ۗۢۢ۬";
                    break;
                case 312101004:
                    String str10 = "ۨۦۜۙ۟۫ۜۚ۬ۖ۬۟ۗۨۨۘۤۡۨۢۨۖۘ۟ۤ۫۫ۚۘۘ";
                    while (true) {
                        switch (str10.hashCode() ^ -54756823) {
                            case -1969547099:
                                str = "ۖۛۙ۟ۢۜۘۥۦۡۖۤۤۧۖ۟۬";
                                continue;
                            case -1884208948:
                                if (i6 > 0) {
                                    str10 = "ۢۚۡۥ۠ۜۘۤۦۘۢۡۘ۟ۘۦ";
                                    break;
                                } else {
                                    str10 = "ۡۤ۟ۘۙ۟ۛ۠ۥۘۦۤۖۤۖۗۨۘۧ۟ۧۦۘۛۛۛ";
                                    break;
                                }
                            case -255933096:
                                str10 = "ۦۢۧۨۘۛۦ۬ۦۘۧ۬ۡۘ۬ۤ";
                                break;
                            case 702004867:
                                str = "ۗۤۛۚۥۚۨۢۖۘ۠ۤۘۘۗۗ۬۟۠ۛ۠ۢۤ۫۬ۖ";
                                continue;
                        }
                    }
                    break;
                case 593045262:
                    str = "۠ۗ۬ۜ۫ۤۧۦۗۚۥۙ۫ۚ";
                    str5 = str4;
                    break;
                case 1016257484:
                    str = "ۛۘۧۘ۬ۜۧۨۘۛۨۗۡ۠ۛۧۦۗۗ۠ۖۥۗۘۧۘۡۘۖۘ";
                    str5 = str3;
                    break;
                case 1352401849:
                    str = "ۤۛۙۡۦۘۙ۠۬۠ۢۜۘۗۧۢۤ۟۫";
                    i6 = i7;
                    break;
                case 1399699685:
                    String str11 = "ۡۘۘ۠ۗۢۜۧۖۙ۫ۖۢۚۙ۬ۨۦ";
                    while (true) {
                        switch (str11.hashCode() ^ 1370525236) {
                            case -1534462058:
                                str = "۟ۢۥۘۚۚۛۦۥۡۘۨ۬ۥۘۘۡۦ";
                                continue;
                            case -1448868722:
                                str11 = "ۡۧۨۘۗۗۧۗۜۘۚۦۧۜ۫ۜ۟۠۠ۢ۬۟ۜۧۦۘۖۧۥۘ";
                                break;
                            case -619219361:
                                str = "۬ۧ۫ۤۡۗۨۚۧۨۜۚۧۢ۟ۤۖۙ۟۟ۥ";
                                continue;
                            case 147309048:
                                if (i8 == 0) {
                                    str11 = "ۨۡ۫۬ۦۜۨۖۧۚۢۘۘۜ۟ۘ۟۟ۦ";
                                    break;
                                } else {
                                    str11 = "۠ۛ۫ۨۦۥ۬ۙۡۘۥۨۖۘۙۡ۬ۙۡۦ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1431873850:
                    str = "ۖۡۧۙۛۡۘ۠ۦۘ۟ۤ۟ۢۙۨۛۤۜۜ۠ۖۜۘۡ";
                    str2 = "yowa_style_stock_conversation_actionbar";
                    break;
                case 1642939405:
                    str6 = "yowa_style_wamodcentered_conversation_actionbar";
                    str = "ۛۥۡۨۖۘۘۗ۬ۙۗ۫۫ۡ۫ۡۘ";
                    break;
                case 1853661043:
                    str = "ۛۖۨۘ۫ۧ۟ۛ۟ۜۘۡۚ۠ۗۛۡۤۘۜ";
                    i3 = i6;
                    break;
                case 1857686412:
                    return i4;
                case 2030832853:
                    str = "ۗ۫ۗۛۤ۠۟ۡۦ۟ۢۢۥۛۨۤۨۤ۟۬ۚۤۡ۬";
                    str4 = "yowa_style_wamod_conversation_actionbar";
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean chats_show_contact_online_toast_check() {
        /*
            java.lang.String r0 = "ۤ۬ۦۘ۟ۛۘۘۧۨۘۨۖۘۤۜۚ۫ۛۤۜۛۥۜۨ۫"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 834(0x342, float:1.169E-42)
            r3 = 549464146(0x20c02852, float:3.2552747E-19)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1313354884: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "chats_show_contact_online_toast_check"
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0)
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.chats_show_contact_online_toast_check():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006d, code lost:
        r2 = "ۤ۫۫ۧۛۙۡ۬ۜۘۗ۬۬ۡۡۚۗ۠ۜۘ۟ۜ۫ۛۢۜ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0077, code lost:
        switch((r2.hashCode() ^ 2003311406)) {
            case -1416835562: goto L_0x007e;
            case 190112857: goto L_0x00e2;
            case 1024845740: goto L_0x00e7;
            case 1807243641: goto L_0x007b;
            default: goto L_0x007a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007b, code lost:
        com.obwhatsapp.yo.shp.setIntPriv(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007e, code lost:
        r10.runOnUiThread(new com.obwhatsapp.yo.p1(r10, r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d0, code lost:
        r2 = "۠ۗۚۖۨۖۘۢۤۤ۟۫ۨۘۤۖۨۘۘۢۖۗ۫۬";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d7, code lost:
        if (com.obwhatsapp.youbasha.app.isInternetActive() == false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d9, code lost:
        r2 = "ۤ۫۫۬ۡۙۨ۟ۚۨۚۥۚۧۥۘۜۥۧۘ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dc, code lost:
        r2 = "ۙ۬ۦۛۤۜ۬ۨۚۨۜۘۜۗۛۥۙ۬ۖ۫ۦۘۛۖۖ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00df, code lost:
        r2 = "۫ۛۙۧۨۜۘۤۛ۬ۧۡۘ۟ۗ۟";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e2, code lost:
        if (r0 == false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e4, code lost:
        r2 = "۟ۧۢۚۥۜۘۗۡۤ۟ۥۜۘۚۧ۬ۦ۟ۢ۠ۘۡۘۘۙۗ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e7, code lost:
        r2 = "ۛۗۢ۬ۘۘۨۘۘۘۨۚۥۘۧۦۦۘۦۡۧ۠ۡۘ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005f, code lost:
        r2 = "ۘۘۜۦۨۨۨۡۥۘۢ۟ۧۜۨ۫۫ۙۘۘۨۦۖۘ۬ۘۦ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0069, code lost:
        switch((r2.hashCode() ^ 591602601)) {
            case -309318109: goto L_0x00dc;
            case -210896673: goto L_0x006d;
            case -68399940: goto L_0x0086;
            case 300003208: goto L_0x00d3;
            default: goto L_0x006c;
        };
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void checkV(android.app.Activity r10, boolean r11) {
        /*
            r1 = 1
            java.lang.String r0 = "currv"
            java.lang.String r3 = com.obwhatsapp.yo.shp.getStringPriv(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = ""
            r0.<init>(r2)
            int r2 = com.obwhatsapp.youbasha.task.utils.buildNo1
            r0.append(r2)
            java.lang.String r2 = "."
            r0.append(r2)
            int r2 = com.obwhatsapp.youbasha.task.utils.buildNo2
            r0.append(r2)
            java.lang.String r4 = r0.toString()
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r2 = 6
            int r5 = r0.get(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "last_upcheck"
            r2.<init>(r6)
            int r0 = r0.get(r1)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
            int r2 = com.obwhatsapp.yo.shp.getIntPriv(r6)
            boolean r7 = r10 instanceof com.obwhatsapp.youbasha.ui.YoSettings.Updates
            r8 = 2050108829(0x7a322d9d, float:2.312885E35)
            java.lang.String r0 = "ۨۙ۬ۘۖۜۙۘۜ۠ۛۨۨۡۚ"
        L_0x0047:
            int r9 = r0.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -2106444126: goto L_0x00a7;
                case -87781709: goto L_0x00a0;
                case 816022045: goto L_0x00aa;
                case 1462592920: goto L_0x0050;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x0047
        L_0x0050:
            r0 = 0
        L_0x0051:
            r8 = 207109711(0xc583e4f, float:1.6658785E-31)
            java.lang.String r2 = "ۘۚۨۛۜۨۘۚۚۘۦۧۘۤۦۢ۠۠ۜۘۦۖۚۖۨۤۗۢۡ"
        L_0x0056:
            int r9 = r2.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case 209149223: goto L_0x00af;
                case 339524406: goto L_0x005f;
                case 707241939: goto L_0x00b7;
                case 1611566210: goto L_0x00b4;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x0056
        L_0x005f:
            r7 = 591602601(0x234323a9, float:1.05785225E-17)
            java.lang.String r2 = "ۘۘۜۦۨۨۨۡۥۘۢ۟ۧۜۨ۫۫ۙۘۘۨۦۖۘ۬ۘۦ"
        L_0x0064:
            int r8 = r2.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -309318109: goto L_0x00dc;
                case -210896673: goto L_0x006d;
                case -68399940: goto L_0x0086;
                case 300003208: goto L_0x00d3;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x0064
        L_0x006d:
            r7 = 2003311406(0x77681b2e, float:4.7076724E33)
            java.lang.String r2 = "ۤ۫۫ۧۛۙۡ۬ۜۘۗ۬۬ۡۡۚۗ۠ۜۘ۟ۜ۫ۛۢۜ"
        L_0x0072:
            int r8 = r2.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -1416835562: goto L_0x007e;
                case 190112857: goto L_0x00e2;
                case 1024845740: goto L_0x00e7;
                case 1807243641: goto L_0x007b;
                default: goto L_0x007a;
            }
        L_0x007a:
            goto L_0x0072
        L_0x007b:
            com.obwhatsapp.yo.shp.setIntPriv(r6, r5)
        L_0x007e:
            com.obwhatsapp.yo.p1 r0 = new com.obwhatsapp.yo.p1
            r0.<init>((android.app.Activity) r10, (boolean) r11)
            r10.runOnUiThread(r0)
        L_0x0086:
            r2 = 1578685607(0x5e18d4a7, float:2.75315265E18)
            java.lang.String r0 = "ۥۘ۫ۜ۬ۗۖۧۛۛ۟ۙۢۧۜۘۧۗۢ"
        L_0x008b:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -1618597776: goto L_0x0094;
                case -290652069: goto L_0x00f0;
                case 1720982052: goto L_0x0110;
                case 1881148325: goto L_0x00ed;
                default: goto L_0x0093;
            }
        L_0x0093:
            goto L_0x008b
        L_0x0094:
            boolean r0 = r3.equals(r4)
            if (r0 != 0) goto L_0x00ea
            java.lang.String r0 = "ۖ۬ۘ۫۠ۜۚۖۘۨۖۙۤ۫ۢۢۚۡ"
            goto L_0x008b
        L_0x009d:
            java.lang.String r0 = "۫ۗۢ۬ۘۜۘۡۦۗ۬ۥۛۚۥۖۘۧۚۢۧۙۖۘۨۡۗۧ۟ۡۘ"
            goto L_0x0047
        L_0x00a0:
            int r0 = r5 - r2
            if (r0 <= 0) goto L_0x009d
            java.lang.String r0 = "ۤ۟ۖۙۤۥۛ۬ۜ۠۫ۘۘۛۤ۟"
            goto L_0x0047
        L_0x00a7:
            java.lang.String r0 = "ۘۧۛۛۘۖۧۙۨۘۖۜۨۚ۫ۘۥۙۡۘ۟۫۫"
            goto L_0x0047
        L_0x00aa:
            r0 = r1
            goto L_0x0051
        L_0x00ac:
            java.lang.String r2 = "ۤ۬ۢ۠۠ۘۘ۫ۢۗۖۗۦۜۖ"
            goto L_0x0056
        L_0x00af:
            if (r0 != 0) goto L_0x00ac
            java.lang.String r2 = "ۢۚۗۢۛۥۘ۫ۡۢ۫۬ۧ۬ۦۙۡۢ۠۫ۘۥۘۡۖۧ"
            goto L_0x0056
        L_0x00b4:
            java.lang.String r2 = "ۨۢ۠ۘۢ۬۫ۨۖۙۛۘۖۚۡ۬ۜۜۘ۫۠ۙ۠ۜۛۚۛۨۘ"
            goto L_0x0056
        L_0x00b7:
            r8 = 162484823(0x9af5257, float:4.220715E-33)
            java.lang.String r2 = "ۡ۠ۨۚ۟ۡ۠ۜۘ۬ۨۨۙۢۦۢۨۘۘ۬ۙۥۨۡ۠"
        L_0x00bc:
            int r9 = r2.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -835563121: goto L_0x00c5;
                case -308970568: goto L_0x00cb;
                case 1502618004: goto L_0x0086;
                case 1643489128: goto L_0x005f;
                default: goto L_0x00c4;
            }
        L_0x00c4:
            goto L_0x00bc
        L_0x00c5:
            java.lang.String r2 = "ۜۖۡۘۥ۟۟ۛۧۘۘ۠ۙۧۧۘۗۘۘ۫۠ۗۦۘۛ۫۫"
            goto L_0x00bc
        L_0x00c8:
            java.lang.String r2 = "ۜ۟ۡۥۙۚ۟۬۟۠ۤ۬ۦۡۦۘ۬ۘۨۘ۟ۙۤۦ"
            goto L_0x00bc
        L_0x00cb:
            if (r7 == 0) goto L_0x00c8
            java.lang.String r2 = "ۤۙۙۖ۬ۜۗ۬ۦۧۜ۟ۖۥۤۜۛۥۤۥۘۛۗۙ۟۫ۖ"
            goto L_0x00bc
        L_0x00d0:
            java.lang.String r2 = "۠ۗۚۖۨۖۘۢۤۤ۟۫ۨۘۤۖۨۘۘۢۖۗ۫۬"
            goto L_0x0064
        L_0x00d3:
            boolean r2 = com.obwhatsapp.youbasha.app.isInternetActive()
            if (r2 == 0) goto L_0x00d0
            java.lang.String r2 = "ۤ۫۫۬ۡۙۨ۟ۚۨۚۥۚۧۥۘۜۥۧۘ"
            goto L_0x0064
        L_0x00dc:
            java.lang.String r2 = "ۙ۬ۦۛۤۜ۬ۨۚۨۜۘۜۗۛۥۙ۬ۖ۫ۦۘۛۖۖ"
            goto L_0x0064
        L_0x00df:
            java.lang.String r2 = "۫ۛۙۧۨۜۘۤۛ۬ۧۡۘ۟ۗ۟"
            goto L_0x0072
        L_0x00e2:
            if (r0 == 0) goto L_0x00df
            java.lang.String r2 = "۟ۧۢۚۥۜۘۗۡۤ۟ۥۜۘۚۧ۬ۦ۟ۢ۠ۘۡۘۘۙۗ"
            goto L_0x0072
        L_0x00e7:
            java.lang.String r2 = "ۛۗۢ۬ۘۘۨۘۘۘۨۚۥۘۧۦۦۘۦۡۧ۠ۡۘ"
            goto L_0x0072
        L_0x00ea:
            java.lang.String r0 = "ۗۢ۠۟۟ۨ۟ۥ۠ۥۗۡۢۜۜۘ۫ۥۡ۠ۗۜۨ۫ۜۗۘۡ"
            goto L_0x008b
        L_0x00ed:
            java.lang.String r0 = "ۢۨۨۦۘۤۘۥۧ۬ۤۚۛۤۛۦ۟ۛۨۨۤ"
            goto L_0x008b
        L_0x00f0:
            java.lang.String r0 = "currv"
            com.obwhatsapp.yo.shp.setStringPriv(r0, r4)
            com.obwhatsapp.youbasha.task.changelog r0 = new com.obwhatsapp.youbasha.task.changelog
            r0.<init>(r10)
            android.content.SharedPreferences$Editor r0 = com.obwhatsapp.yo.shp.stockLightPrefs     // Catch:{ Exception -> 0x0184 }
            java.lang.String r2 = "client_version_upgrade_timestamp"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0184 }
            android.content.SharedPreferences$Editor r0 = r0.putLong(r2, r4)     // Catch:{ Exception -> 0x0184 }
            java.lang.String r2 = "client_version_upgraded"
            r3 = 1
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r3)     // Catch:{ Exception -> 0x0184 }
            r0.commit()     // Catch:{ Exception -> 0x0184 }
        L_0x0110:
            java.lang.String r0 = "remote_ver1"
            int r2 = com.obwhatsapp.youbasha.task.utils.buildNo1
            int r2 = com.obwhatsapp.yo.shp.getIntPriv(r0, r2)
            java.lang.String r0 = "remote_ver2"
            int r3 = com.obwhatsapp.youbasha.task.utils.buildNo2
            int r3 = com.obwhatsapp.yo.shp.getIntPriv(r0, r3)
            int r4 = com.obwhatsapp.youbasha.task.utils.buildNo1
            r5 = -2112960678(0xffffffff820ec75a, float:-1.0489723E-37)
            java.lang.String r0 = "ۗۜ۫ۜۧۘۢۦۧۗۡۥ۫۬ۦۘۘۚۡۦ۟ۖ۠ۘ۫ۦ۫ۙ"
        L_0x0127:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1702483131: goto L_0x013b;
                case -1658931477: goto L_0x0130;
                case -565827784: goto L_0x0170;
                case 987880068: goto L_0x0138;
                default: goto L_0x012f;
            }
        L_0x012f:
            goto L_0x0127
        L_0x0130:
            if (r2 > r4) goto L_0x0135
            java.lang.String r0 = "ۛۜۧۡ۫ۤۛۖۖ۫۬ۗۙۤۦۘ۠ۡۘۘۨۗۚ"
            goto L_0x0127
        L_0x0135:
            java.lang.String r0 = "ۨۡۛۤۛۙ۬ۢۜ۟ۖۘۙ۫ۖۨۙۜ"
            goto L_0x0127
        L_0x0138:
            java.lang.String r0 = "ۦۤۚۜۦۖۘۦۨۛۧۨۢۧۥ۟ۢۗۙۡۖۡۘ"
            goto L_0x0127
        L_0x013b:
            r5 = 1966860564(0x753be914, float:2.382048E32)
            java.lang.String r0 = "ۧۚۙ۟ۜۢۥ۟ۦۙ۠ۘۘۦ۟ۧ"
        L_0x0140:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1328277729: goto L_0x0149;
                case -1232964313: goto L_0x0155;
                case -603500754: goto L_0x014d;
                case 1538069269: goto L_0x0152;
                default: goto L_0x0148;
            }
        L_0x0148:
            goto L_0x0140
        L_0x0149:
            return
        L_0x014a:
            java.lang.String r0 = "ۘ۠ۥۖۦۛ۫ۢۚۘۥ۬ۙ۫ۘۘۖۖۛۥۚۡۘ"
            goto L_0x0140
        L_0x014d:
            if (r2 != r4) goto L_0x014a
            java.lang.String r0 = "۫ۗ۫ۥۡۖۘ۠ۜۘۘۢۜۥۘۦۚۘۘۛۙۙ"
            goto L_0x0140
        L_0x0152:
            java.lang.String r0 = "ۨ۫ۨ۠ۗ۬ۚۖۛ۫۠ۦۡۚۨۘۜۤۘۘۧۗۖ"
            goto L_0x0140
        L_0x0155:
            r2 = -1728498055(0xffffffff98f93679, float:-6.4419995E-24)
            java.lang.String r0 = "ۗۛ۠ۚ۠ۥۘۡۗۨۘۙۗ۠ۤۢۡۤۨۨۘۦۧۙۗۚۛۨ۠ۦۘ"
        L_0x015a:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1984322613: goto L_0x016d;
                case -134779138: goto L_0x0149;
                case 340358475: goto L_0x0170;
                case 838036547: goto L_0x0163;
                default: goto L_0x0162;
            }
        L_0x0162:
            goto L_0x015a
        L_0x0163:
            int r0 = com.obwhatsapp.youbasha.task.utils.buildNo2
            if (r3 <= r0) goto L_0x016a
            java.lang.String r0 = "ۦۛۖۖۛۥۙۧۚۥ۫ۥۘ۫ۨۨ۟۫ۜۘۖۗ۠"
            goto L_0x015a
        L_0x016a:
            java.lang.String r0 = "ۗ۫۟۫ۦۤۨۧۢۧ۫۫ۖۜۗۧۖۘۨۘۜۘ۟ۤۜۘ"
            goto L_0x015a
        L_0x016d:
            java.lang.String r0 = "ۙ۫ۙۦ۬ۡۘ۠ۡۚۙۙۘۧۨۖۢۚۧۙۡ۟۫ۖۗ"
            goto L_0x015a
        L_0x0170:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = r10.getMainLooper()
            r0.<init>(r2)
            com.obwhatsapp.yo.b1 r2 = new com.obwhatsapp.yo.b1
            r2.<init>(r10, r1)
            r4 = 500(0x1f4, double:2.47E-321)
            r0.postDelayed(r2, r4)
            goto L_0x0149
        L_0x0184:
            r0 = move-exception
            goto L_0x0110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.checkV(android.app.Activity, boolean):void");
    }

    public static void check_status_viewers(Object obj) {
        String str = "ۖ۟۠ۖۗۖۘۛۜۘۗۤۤۙۜۡۚۖ";
        while (true) {
            switch (str.hashCode() ^ 209712602) {
                case -1086933612:
                    str = "ۗۡۘۢۗۖۧۡۧۘۡۢ۫ۨۚۗ۬ۥ۠ۢۡۖۤۗۤۧۗۢ";
                    break;
                case -863936528:
                    return;
                case 1115560922:
                    if (shp.getBoolean("want_status_toast", false)) {
                        str = "ۜۢۜ۫ۖۧۗۢۦۘۛ۠ۖ۬۫ۥ";
                        break;
                    } else {
                        str = "ۧۙۡۘۤۨۘۜۚۗ۠ۙۜۘ۬ۗۜ";
                        break;
                    }
                case 1960230786:
                    try {
                        String obj2 = obj.toString();
                        String str2 = "۬ۘۖۧۥۥۚۖۘۘۖ۟ۥۘۨۜۢۤۚۚۗۜۛۥۛۚ۬ۥۗ";
                        while (true) {
                            switch (str2.hashCode() ^ -379093236) {
                                case -1223631093:
                                    str2 = "۠۬ۥۘۥ۬ۨۘۙۖۖۘۡ۬۬۠ۦ۬۟۟ۚۜۜ۫ۗۗۘۘۜۧ";
                                    break;
                                case -1175594342:
                                    String str3 = "ۖ۬ۥۘۨۢۨۘۛ۬ۡۙۨۧۘۘۜۘۖۘۤۗ۠ۖۘ۬۬ۜۗۢۡ";
                                    while (true) {
                                        switch (str3.hashCode() ^ -117792113) {
                                            case -1459561206:
                                                return;
                                            case 104213983:
                                                if (!obj2.contains("=read")) {
                                                    str3 = "۫ۗۢۦۥۖۨ۟۟ۚۘۘۙۘۚ۫ۙۛ";
                                                    break;
                                                } else {
                                                    str3 = "ۦ۫۟ۖۛۨۦ۟ۘۛۜۥۘۚۧۛ";
                                                    break;
                                                }
                                            case 1012333348:
                                                String contactName = dep.getContactName(obj2.substring(obj2.lastIndexOf("participant="), obj2.lastIndexOf("@")).replace("participant=", ""));
                                                Context ctx = getCtx();
                                                Toast.makeText(ctx, contactName + " " + getString("viewed_your_status"), 0).show();
                                                return;
                                            case 1071470059:
                                                str3 = "ۛۖ۟ۧۨۦۘۦۛ۠۫ۜۦۘۙ۠ۘۜۛۦۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case -643810231:
                                    if (!obj2.contains("from=status@broadcast")) {
                                        str2 = "ۘ۠ۜۘۙۗۜۘ۬ۘ۠۠ۨۧ۟ۨۡۢۢۖۨۙۥ۟ۥ";
                                        break;
                                    } else {
                                        str2 = "ۡۘۧۢ۬ۖۘۚۡۧۖۛۗ۠ۢ۟ۛۗۤۗ۫ۥۘۚۛۨ";
                                        break;
                                    }
                                case 1918291999:
                                    return;
                            }
                        }
                    } catch (Exception e2) {
                        return;
                    }
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int circleColor() {
        /*
            java.lang.String r0 = "ۛۧۨۘۚۡۤ۟ۚۤۜ۟ۚۧۙۢ۬۠ۚۛۚۙ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 770(0x302, float:1.079E-42)
            r3 = -1797856680(0xffffffff94d6e258, float:-2.1697755E-26)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -509200369: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "ModConColor"
            int r1 = com.obwhatsapp.yo.ColorStore.getPrimaryColor()
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.circleColor():int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void clearWALogs() {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0046 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0046 }
            r2.<init>()     // Catch:{ Exception -> 0x0046 }
            java.lang.String r3 = datafolder     // Catch:{ Exception -> 0x0046 }
            r2.append(r3)     // Catch:{ Exception -> 0x0046 }
            java.lang.String r3 = "files/Logs"
            r2.append(r3)     // Catch:{ Exception -> 0x0046 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0046 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0046 }
            com.obwhatsapp.yo.r1 r2 = new com.obwhatsapp.yo.r1     // Catch:{ Exception -> 0x0046 }
            r3 = 0
            r2.<init>(r3)     // Catch:{ Exception -> 0x0046 }
            java.io.File[] r2 = r1.listFiles(r2)     // Catch:{ Exception -> 0x0046 }
            int r3 = r2.length     // Catch:{ Exception -> 0x0046 }
        L_0x0024:
            r4 = 1560402386(0x5d01d9d2, float:5.8479629E17)
            java.lang.String r1 = "۫ۛۦۙۜۘۘۡۡۚۨ۠ۢۦۗۥۥۨۨۘۨۡۧۘۡۦۜۘ"
        L_0x0029:
            int r5 = r1.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1877665727: goto L_0x003e;
                case -732395971: goto L_0x003b;
                case 600428315: goto L_0x0036;
                case 1236390152: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0029
        L_0x0032:
            return
        L_0x0033:
            java.lang.String r1 = "ۙۧۤۨ۟ۡۘۥۥ۟ۤۘ۟ۤۗۖۛۦۘۤۙ۫ۖ۫ۜۘۙۘۦ"
            goto L_0x0029
        L_0x0036:
            if (r0 >= r3) goto L_0x0033
            java.lang.String r1 = "ۡ۬ۦ۟ۤۗۚۛ۬ۥۧۨۗۢ۠۠ۘۦۚ۠۠ۜۦۨ"
            goto L_0x0029
        L_0x003b:
            java.lang.String r1 = "ۨۗ۟ۤۜ۫ۡۨ۬ۛ۫۫۟ۢۜۘۨۤ۟ۥ۠ۖۘ۬ۨۗ"
            goto L_0x0029
        L_0x003e:
            r1 = r2[r0]     // Catch:{ Exception -> 0x0046 }
            r1.delete()     // Catch:{ Exception -> 0x0046 }
            int r0 = r0 + 1
            goto L_0x0024
        L_0x0046:
            r0 = move-exception
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.clearWALogs():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d() {
        /*
            java.lang.String r0 = "۬۟۠ۥ۫ۨ۟ۨ۬۬ۗۜۘۥ۫ۛۜۘ۫"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 6
            r3 = 1270998226(0x4bc1e4d2, float:2.5414052E7)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1384115205: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0002
        L_0x0010:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.d():boolean");
    }

    public static boolean dis_audioHeds() {
        try {
            return shp.getBooleanPriv("disable_audioheads");
        } catch (Exception e2) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean disableClickToOpenHiddenChats() {
        /*
            java.lang.String r0 = "ۚۘۤۚ۠ۜۧۗۨۘ۟ۚ۫۬ۨۘ۬ۧۧۥۤۚۨۜۥۜۢۙ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 671(0x29f, float:9.4E-43)
            r3 = 766777864(0x2db41a08, float:2.0475191E-11)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -502792326: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "disable_hiddenchat_access"
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.disableClickToOpenHiddenChats():boolean");
    }

    public static boolean findMenu(Menu menu) {
        return menu.findItem(getID("menuitem_settings", "id")) != null;
    }

    public static void follow_div(Menu menu) {
        menu.add(1, R.string.str1a2c, 0, getString("AGUpdate"));
    }

    public static void follow_div_link(int i2, Context context) {
        if (i2 == R.string.str1a2c) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/whatsomar")));
        }
    }

    public static int fwd_lim(int i2) {
        String str = "۟ۡۜۘ۟ۨ۬ۨۦۘ۟ۚۦۘۙۖۢۖ۫ۖ";
        int i3 = 0;
        int i4 = 0;
        while (true) {
            switch ((str.hashCode() ^ 413) ^ 400584574) {
                case -791649799:
                    str = "ۛۡ۫ۖ۠ۗۙ۬ۗۗۦۖۘۤۤۜۥ۫۟۫ۦۜۤۛۚ۫";
                    i4 = i3;
                    break;
                case -367113411:
                    str = "ۚۢۤۤۖۤۥۤۘۘ۬ۘ۫ۙۖۧ";
                    break;
                case -43112157:
                    String str2 = "ۘۗۡۙ۟۠۠ۙۧۖۤ۠۠ۘۥۢۤۥۖۜۖ۟ۨۡۘۜۜۚ";
                    while (true) {
                        switch (str2.hashCode() ^ 647674215) {
                            case -1128536698:
                                str = "ۦۛۘۘۙۜۢۗۖۘۙ۠ۤۧۥۛۜۘۖۘ۫ۦۦ۟ۧ۫";
                                continue;
                            case 1144151221:
                                str2 = "ۡۛۦۘۚۖۖۡۜۨ۬ۗۥۘ۟ۦۥ";
                                break;
                            case 1296855956:
                                str = "ۛۡ۫ۖ۠ۗۙ۬ۗۗۦۖۘۤۤۜۥ۫۟۫ۦۜۤۛۚ۫";
                                continue;
                            case 1384593659:
                                if (shp.getBooleanPriv("fwd_lim_incr")) {
                                    str2 = "ۙۖۛۖۨۥۘۧۦۘۤۜۘۘ۫ۡۚ۟ۡۢ۠ۥۜۘ۠۠ۥۖۘۡۘ";
                                    break;
                                } else {
                                    str2 = "ۥۨۧۘۖۧۥۚۗ۫ۘ۫ۥۘۚۡۡۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1349832422:
                    i3 = 250;
                    str = "ۨ۬۫۟ۤۗ۟ۨۖۜۖۗۨۘۦۨۧ۫ۙ۬۫ۖۖۡ";
                    break;
                case 1598400860:
                    return i4;
                case 1692956963:
                    str = "ۡ۬ۢۦۨۖۜۖۜۡۤۥۙ۬ۦۘ۟ۗۚ";
                    i4 = i2;
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean getAirplaneMode() {
        /*
            java.lang.String r0 = "ۡۙۡۢۡۢۙۡ۠ۛۨۜۘۚ۠ۜۤۗۦ۬ۘۥۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 673(0x2a1, float:9.43E-43)
            r3 = -388954701(0xffffffffe8d105b3, float:-7.896638E24)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 2139689105: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "yo_airplanemode"
            r1 = 0
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.getAirplaneMode():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getBubbleTick(java.lang.String r22) {
        /*
            r9 = 0
            r7 = 0
            r17 = 0
            r15 = 0
            r14 = 0
            r13 = 0
            r16 = 0
            r12 = 0
            r11 = 0
            r10 = 0
            r18 = 0
            r6 = 0
            r8 = 0
            r5 = 0
            r4 = 0
            r2 = 0
            r3 = 0
            java.lang.String r1 = "ۧۘۥۘ۟۫ۢۛۢۨۘۙۛ۬ۖۨۙۖۧۗ۠۬ۛۥۨ۫"
        L_0x0016:
            int r19 = r1.hashCode()
            r20 = 779(0x30b, float:1.092E-42)
            r21 = -1382997933(0xffffffffad912053, float:-1.6498946E-11)
            r19 = r19 ^ r20
            r19 = r19 ^ r21
            switch(r19) {
                case -2104378368: goto L_0x01aa;
                case -2022541318: goto L_0x0168;
                case -2000016579: goto L_0x0108;
                case -1998462793: goto L_0x013f;
                case -1997180003: goto L_0x006e;
                case -1807581271: goto L_0x012d;
                case -1638823479: goto L_0x0226;
                case -1554255832: goto L_0x01ab;
                case -1547106942: goto L_0x0121;
                case -1519492521: goto L_0x004e;
                case -1434993948: goto L_0x00dd;
                case -1408702073: goto L_0x0076;
                case -1330737195: goto L_0x00a1;
                case -1161895440: goto L_0x00d7;
                case -1131001241: goto L_0x0067;
                case -1089202248: goto L_0x002f;
                case -1030322919: goto L_0x00a6;
                case -955354167: goto L_0x004e;
                case -929156821: goto L_0x0103;
                case -848300497: goto L_0x01b4;
                case -692920817: goto L_0x010e;
                case -689962373: goto L_0x0133;
                case -589029615: goto L_0x0139;
                case -464417508: goto L_0x01d9;
                case -103088948: goto L_0x003a;
                case 24849847: goto L_0x0226;
                case 349647323: goto L_0x01bb;
                case 445084143: goto L_0x0127;
                case 609186175: goto L_0x003f;
                case 650460381: goto L_0x0115;
                case 654025922: goto L_0x0201;
                case 707047405: goto L_0x0226;
                case 751758041: goto L_0x00ac;
                case 809152173: goto L_0x007b;
                case 810899856: goto L_0x01c4;
                case 823036049: goto L_0x00d2;
                case 836851281: goto L_0x011b;
                case 930824689: goto L_0x006e;
                case 946897301: goto L_0x0172;
                case 1111033508: goto L_0x0209;
                case 1201814806: goto L_0x01cd;
                case 1231289752: goto L_0x019e;
                case 1448196577: goto L_0x0027;
                case 1450470446: goto L_0x006e;
                case 1585155253: goto L_0x01de;
                case 1587359655: goto L_0x002a;
                case 1917925453: goto L_0x016d;
                case 1934100950: goto L_0x023a;
                case 2040095166: goto L_0x0071;
                case 2113459148: goto L_0x0163;
                case 2127360977: goto L_0x004e;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0016
        L_0x0027:
            java.lang.String r1 = "ۙۜۛ۬۟ۥۦۚۜۘۖ۟ۜۘۥۙۖ۬ۛ۬ۗۘ۫۟"
            goto L_0x0016
        L_0x002a:
            java.lang.String r9 = "stockorg"
            java.lang.String r1 = "۠ۛۘۗۤۗ۫ۚۥۘۡ۟ۙۜۖۜۘ۫ۛۥۘ۫ۙۚ۠ۖۛۥۧۘۘ"
            goto L_0x0016
        L_0x002f:
            java.lang.String r1 = "tick_style"
            java.lang.String r7 = "stockorg"
            java.lang.String r7 = com.obwhatsapp.yo.shp.getPrefString(r1, r7)
            java.lang.String r1 = "ۜ۬ۜۘۘ۬ۤۘۢۚۧ۬ۚۧ۬ۜۘۧۢۜۢۖ۟"
            goto L_0x0016
        L_0x003a:
            java.lang.String r1 = "ۥ۫ۖۥۧۘۘ۬ۥۦۙۗۗۥۗۜۤۙۨ"
            r18 = r22
            goto L_0x0016
        L_0x003f:
            r19 = 271558841(0x102fa8b9, float:3.4642644E-29)
            java.lang.String r1 = "ۖۙۘۘ۬ۡۡۘۙۧۘۘۜۧۜۘ۫ۖۙ۫ۛ۟ۚۛۖ"
        L_0x0044:
            int r20 = r1.hashCode()
            r20 = r20 ^ r19
            switch(r20) {
                case -1826852405: goto L_0x004e;
                case -1618274307: goto L_0x0061;
                case -188044983: goto L_0x0054;
                case 1211520593: goto L_0x0064;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x0044
        L_0x004e:
            java.lang.String r1 = "۫ۖۨۘۗۛۗ۫ۧۦۘۜۚۤۙۗۥۘۖۛۦۦۢۛ"
            goto L_0x0016
        L_0x0051:
            java.lang.String r1 = "ۦۨۘۘۗ۠۬ۖۙۥۢۗۡۘۙ۬ۦۘ"
            goto L_0x0044
        L_0x0054:
            java.lang.String r1 = "msg_"
            r0 = r22
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x0051
            java.lang.String r1 = "ۡ۫ۧۘۘۜۘ۟ۧۜ۠ۤۥۘ۬ۜۖۘۦۘۚ"
            goto L_0x0044
        L_0x0061:
            java.lang.String r1 = "ۨ۬ۧۗۛۛۖ۠ۡۘۖۧۖۘۜۤۘ"
            goto L_0x0044
        L_0x0064:
            java.lang.String r1 = "ۛۖۦۘۨ۠ۚۤۥۥۘۢ۫ۥۘۧۙۖ"
            goto L_0x0016
        L_0x0067:
            int r1 = r22.hashCode()
            switch(r1) {
                case 65122174: goto L_0x021e;
                case 548040826: goto L_0x0216;
                case 1048687510: goto L_0x020e;
                default: goto L_0x006e;
            }
        L_0x006e:
            java.lang.String r1 = "ۧۚۙ۠ۧۗۦۙۤ۬ۗۖۘۜۜۦۘ"
            goto L_0x0016
        L_0x0071:
            r17 = -1
            java.lang.String r1 = "ۡۦۥۤۧۚۙۘ۫ۛۤۦۥ۠ۨۘۜ۟ۧۛۡۘۗۛۤ"
            goto L_0x0016
        L_0x0076:
            java.lang.String r1 = "۠۬ۚ۠ۜۖ۟ۤۡ۟ۤۙۜۜۥ۟ۗۘۛ۫ۗۘۡۘۘ"
            r16 = r17
            goto L_0x0016
        L_0x007b:
            r19 = -39424422(0xfffffffffda66e5a, float:-2.7653103E37)
            java.lang.String r1 = "ۧ۠ۢۘۖ۫۠۫ۦۘۨۥۨۘۖ۫ۦۘۜۦۖ۠ۛۚۖۛ"
        L_0x0080:
            int r20 = r1.hashCode()
            r20 = r20 ^ r19
            switch(r20) {
                case -1321680702: goto L_0x008a;
                case 812350120: goto L_0x0212;
                case 1278970954: goto L_0x009d;
                case 2058000599: goto L_0x0090;
                default: goto L_0x0089;
            }
        L_0x0089:
            goto L_0x0080
        L_0x008a:
            java.lang.String r1 = "ۙۗۖۡ۟ۥۘۛۖۜۧ۠ۖۨۖۘۚۘۖۘۖۛۙۡۜۡۘۖ۟ۚ"
            goto L_0x0080
        L_0x008d:
            java.lang.String r1 = "ۙۡۜۛۘۛ۟ۛۖۨۤۢ۫۟ۜۘۤۦۚ"
            goto L_0x0080
        L_0x0090:
            java.lang.String r1 = "msg_status_server_receive"
            r0 = r22
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x008d
            java.lang.String r1 = "ۡۢۖ۟ۤ۫ۥۜۥۖۖۗۡۡۘۛ۠ۡۧۡ۠ۘۨ"
            goto L_0x0080
        L_0x009d:
            java.lang.String r1 = "ۜ۫ۥۤۖۗۨۡۖۤ۫۠ۧۡۛۚ۫ۖۘ"
            goto L_0x0016
        L_0x00a1:
            r15 = 2
            java.lang.String r1 = "ۡۡۢۥۖۙۨۘۢۚۛۚۧۧۙۤۥۘۢۛۘۦۤۗۜۘ"
            goto L_0x0016
        L_0x00a6:
            java.lang.String r1 = "ۤ۬ۡۘۘۜۖۘۤۡۖ۬ۙۜۘۥۤۨ۠۫۟ۢۧۨۘۗ۠ۛ"
            r16 = r15
            goto L_0x0016
        L_0x00ac:
            r19 = 1596703657(0x5f2bc3a9, float:1.2376922E19)
            java.lang.String r1 = "۟۫ۗۜۧۘۗۦ۟ۗۢۘۘۨۘۥۘۚۗۦۘۥۜۖۘۘ۟ۘ"
        L_0x00b1:
            int r20 = r1.hashCode()
            r20 = r20 ^ r19
            switch(r20) {
                case -1905367132: goto L_0x00c1;
                case -359410226: goto L_0x021a;
                case -22686489: goto L_0x00bb;
                case 2009259826: goto L_0x00ce;
                default: goto L_0x00ba;
            }
        L_0x00ba:
            goto L_0x00b1
        L_0x00bb:
            java.lang.String r1 = "ۚۢۥۘۦۡۦۖۛۡۘۧۨۚۨۜۘ۠ۤۘۘ"
            goto L_0x00b1
        L_0x00be:
            java.lang.String r1 = "ۛ۫ۖۢۚۙۚ۟۟ۗۛۢ۟ۢۥۘۘۖۘۗ۫ۘۘ۟ۜۧۘ"
            goto L_0x00b1
        L_0x00c1:
            java.lang.String r1 = "msg_status_client"
            r0 = r22
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00be
            java.lang.String r1 = "ۥۢۛۧۗۥۘۖۖۤۘۡ۬ۤۚۤ"
            goto L_0x00b1
        L_0x00ce:
            java.lang.String r1 = "ۘ۬ۡۘۛۛۡۘۤۧۜ۬ۘۦ۠ۜۗۦۚۨۘ۬ۙۛۨۖۥ"
            goto L_0x0016
        L_0x00d2:
            r14 = 1
            java.lang.String r1 = "ۥ۬۫ۥۖۖۘ۠۬ۗۡۜۙۚۧۦۘ۬ۖۡۘ۬ۖۛۚۗ۬"
            goto L_0x0016
        L_0x00d7:
            java.lang.String r1 = "ۤۛۚۖ۠ۖۘۜۨۚۦۥۥۘۦۧۡ"
            r16 = r14
            goto L_0x0016
        L_0x00dd:
            r19 = 520511(0x7f13f, float:7.29391E-40)
            java.lang.String r1 = "۫۬ۨۡ۬۫ۖ۟ۢۘۚۛۡ۫ۦ۫۟ۧۦۡ۠ۨۜۡۘۦۨۧ"
        L_0x00e2:
            int r20 = r1.hashCode()
            r20 = r20 ^ r19
            switch(r20) {
                case -445177094: goto L_0x00f3;
                case 44572685: goto L_0x0222;
                case 1344115293: goto L_0x0100;
                case 1507051814: goto L_0x00ec;
                default: goto L_0x00eb;
            }
        L_0x00eb:
            goto L_0x00e2
        L_0x00ec:
            java.lang.String r1 = "ۤۖۘ۫ۖۘۘۖۛۡۢۤ۫۟ۗ"
            goto L_0x0016
        L_0x00f0:
            java.lang.String r1 = "ۚۙ۠ۢۚۨ۠۠ۨ۠ۙۡۘۦۖۧ۟ۚۧۖ۠ۚ"
            goto L_0x00e2
        L_0x00f3:
            java.lang.String r1 = "msg_status_waiting"
            r0 = r22
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00f0
            java.lang.String r1 = "۫ۜ۟ۥۧۚۚۧ۟۬ۚۛۜۦۛۤۚۧۖۜۡۘ"
            goto L_0x00e2
        L_0x0100:
            java.lang.String r1 = "۫ۨۨ۫ۦۛۧ۫ۘۤۜۜۘۥۖۤۧۧۘۘۤۦۛ"
            goto L_0x00e2
        L_0x0103:
            r13 = 0
            java.lang.String r1 = "ۤۤ۬۟۬ۘۗۛۤۜۨ۬ۤۨۥۧ"
            goto L_0x0016
        L_0x0108:
            java.lang.String r1 = "ۢۢۥۦۚ۠ۛ۟ۨۘۥۢۥۧۚۨۘۜۢۘۘۚۗۥۘۚۡۤ"
            r16 = r13
            goto L_0x0016
        L_0x010e:
            switch(r16) {
                case 0: goto L_0x0232;
                case 1: goto L_0x022e;
                case 2: goto L_0x022a;
                default: goto L_0x0111;
            }
        L_0x0111:
            java.lang.String r1 = "۬۠ۤۜۜۦۛۛۥ۠ۙۘۘ۟ۨۖ"
            goto L_0x0016
        L_0x0115:
            java.lang.String r1 = "ۢۧۘۙۙۜۙۧۥۘۚۤۙۥۛ۠۫ۚ۠۬ۘۧۡ۟ۜۘ"
            r18 = r22
            goto L_0x0016
        L_0x011b:
            java.lang.String r12 = "message_got_receipt_from_server"
            java.lang.String r1 = "۟ۛۜۖۛۜۘ۟۬ۨۘۚ۠ۤۡۘۘۘۧ۬ۖ"
            goto L_0x0016
        L_0x0121:
            java.lang.String r1 = "ۤۚۘۡۖۘۘۢۡۘۨۧۦۗۛۘۘۡۨۧۡۙۙۜۥۢ"
            r18 = r12
            goto L_0x0016
        L_0x0127:
            java.lang.String r11 = "message_got_receipt_from_target"
            java.lang.String r1 = "ۢۜۡۘ۠ۙۧۥۘۥۚ۟ۜۘۦۚۛ"
            goto L_0x0016
        L_0x012d:
            java.lang.String r1 = "ۗۡۦۘۘۘۦۘۛۢۡ۟ۚۦۘۢۚ"
            r18 = r11
            goto L_0x0016
        L_0x0133:
            java.lang.String r10 = "message_unsent"
            java.lang.String r1 = "ۡ۫۫ۛۛۜۡۜۚ۫ۜۘ۟ۦۨۗۖۢۚۨۜ"
            goto L_0x0016
        L_0x0139:
            java.lang.String r1 = "۫ۖۨۘۗۛۗ۫ۧۦۘۜۚۤۙۗۥۘۖۛۦۦۢۛ"
            r18 = r10
            goto L_0x0016
        L_0x013f:
            r19 = 1831396642(0x6d28e522, float:3.2669054E27)
            java.lang.String r1 = "ۨۘۡۘ۠ۜۡ۠ۘۙۧۗۨ۟ۤ۠"
        L_0x0144:
            int r20 = r1.hashCode()
            r20 = r20 ^ r19
            switch(r20) {
                case 1337757252: goto L_0x0154;
                case 1740274839: goto L_0x0236;
                case 2058630286: goto L_0x014e;
                case 2128601132: goto L_0x015f;
                default: goto L_0x014d;
            }
        L_0x014d:
            goto L_0x0144
        L_0x014e:
            java.lang.String r1 = "ۨ۫ۨۘۛۖۘ۠۬ۜۘۛ۬ۖۘۘ۠ۖ۬ۧ۟ۗ۬ۜۤۡۥۘ۫ۡ۠"
            goto L_0x0144
        L_0x0151:
            java.lang.String r1 = "ۨۙۡۜۧۘۘۘ۫۠ۥۢۙ۟۫ۜۖۡ۬۫ۨ۬ۛ۬ۨۘ"
            goto L_0x0144
        L_0x0154:
            java.lang.String r1 = "yousef"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0151
            java.lang.String r1 = "۫ۦۚ۫ۢۥۢۛۜۙۗ۫ۗۘۦۘ"
            goto L_0x0144
        L_0x015f:
            java.lang.String r1 = "ۨ۟۫ۦ۠ۗۡۨۖۡ۠ۖۘۚۜۨۥۨۦۘ"
            goto L_0x0016
        L_0x0163:
            java.lang.String r1 = "۬ۨ۬ۧۖۢ۠۬۟ۛۗۚۧۦۥۘۚۡۤۤۘ۟"
            r8 = r9
            goto L_0x0016
        L_0x0168:
            java.lang.String r1 = "ۡ۫ۘۡۨۚۦۦۖۦۜۦۘۖۜۦۖۡۗۙۧۨ"
            r6 = r7
            goto L_0x0016
        L_0x016d:
            java.lang.String r1 = "۟ۗۦۤۢ۠ۛۛۖ۠ۚۜۘۡۙۧۜۤۗۨۜۨۘۘۡۖۘۘ۬ۨ"
            r8 = r6
            goto L_0x0016
        L_0x0172:
            r19 = -2113410003(0xffffffff8207ec2d, float:-9.986013E-38)
            java.lang.String r1 = "ۙۘۢۥۡۧۦۛۘۘۥۨۖۘ۫۟ۤۛۤۜۘۛۛۧۚۚۖ"
        L_0x0177:
            int r20 = r1.hashCode()
            r20 = r20 ^ r19
            switch(r20) {
                case -1888948736: goto L_0x0181;
                case -967956873: goto L_0x019b;
                case 1494128943: goto L_0x0188;
                case 1870651413: goto L_0x023e;
                default: goto L_0x0180;
            }
        L_0x0180:
            goto L_0x0177
        L_0x0181:
            java.lang.String r1 = "ۖ۠ۨۘۖ۫ۜۤۙۤۥۜۙ۠ۘۘ"
            goto L_0x0016
        L_0x0185:
            java.lang.String r1 = "ۘۧۦۖۡۡۘۢۧۜۖۚ۫۠ۙۡۘ۠۫ۗۜۗۜۘۢۛۛ"
            goto L_0x0177
        L_0x0188:
            java.lang.String r1 = "_message_unsent"
            java.lang.String r1 = r8.concat(r1)
            int r1 = com.obwhatsapp.yo.ids.getId(r1)
            r20 = -1
            r0 = r20
            if (r1 != r0) goto L_0x0185
            java.lang.String r1 = "ۢۚۥۢ۫ۧ۠۟ۦۘۡۨۡۘۗ۠ۨۥۙۧ۫ۦ۫ۢۧۨۡۤۨۘ"
            goto L_0x0177
        L_0x019b:
            java.lang.String r1 = "ۗ۠ۘۘۜۧۜۡۗۜۗۢ۫ۖۗۖۗۙۨ۟ۗۘ"
            goto L_0x0177
        L_0x019e:
            java.lang.String r1 = "stockorg_"
            r0 = r18
            java.lang.String r1 = r1.concat(r0)
            int r3 = com.obwhatsapp.yo.ids.getId(r1)
        L_0x01aa:
            return r3
        L_0x01ab:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "۬ۛۡۘ۬ۜۧۘۛۙۦۤ۬ۤ۫ۧ"
            goto L_0x0016
        L_0x01b4:
            r5.append(r8)
            java.lang.String r1 = "ۤ۟ۦ۟ۢۦۘۨۙۖۘۜۥۢ۟ۧۘۛۧۚۛۛۧ"
            goto L_0x0016
        L_0x01bb:
            java.lang.String r1 = "_"
            r5.append(r1)
            java.lang.String r1 = "۬ۦۧۙۚۜۘ۬ۖۚۙۖۧۘ۬ۥۦۘ۠۠ۡۛۜۤۘۜ۫۠ۘۦ"
            goto L_0x0016
        L_0x01c4:
            r0 = r18
            r5.append(r0)
            java.lang.String r1 = "۬ۜ۬ۧۘۚ۫ۨۖۜ۬ۡ۫ۚۢ"
            goto L_0x0016
        L_0x01cd:
            java.lang.String r1 = r5.toString()
            int r4 = com.obwhatsapp.yo.ids.getId(r1)
            java.lang.String r1 = "ۨۙۚۙۤۥ۬۫ۗ۟ۥۧۘۧۦۡ"
            goto L_0x0016
        L_0x01d9:
            java.lang.String r1 = "ۤۙ۟ۗۗۡۧۗۜۗۙ۬۟ۙۜ"
            r3 = r4
            goto L_0x0016
        L_0x01de:
            r19 = -1517486574(0xffffffffa58cfe12, float:-2.4458293E-16)
            java.lang.String r1 = "ۤۦۤۚۡۦۘ۟ۘۥ۬ۧۦۥۤۖۖۦۚ۠ۧۧۡۥۖ"
        L_0x01e3:
            int r20 = r1.hashCode()
            r20 = r20 ^ r19
            switch(r20) {
                case -1936402810: goto L_0x01fa;
                case -1644831891: goto L_0x01f4;
                case -1081629345: goto L_0x01fd;
                case 1793361126: goto L_0x01ed;
                default: goto L_0x01ec;
            }
        L_0x01ec:
            goto L_0x01e3
        L_0x01ed:
            java.lang.String r1 = "ۧۚۥۚۡۧۚ۠ۖۘۛۧۦۥ۫ۢۖۖۛۢ۫ۤ"
            goto L_0x0016
        L_0x01f1:
            java.lang.String r1 = "۬ۦۙۛۦۡۦۥۛۨۘۜۢ۫ۘۡۗۥۘۗ۟ۦۘ۟۠ۘۘۚۢۘۘ"
            goto L_0x01e3
        L_0x01f4:
            r1 = -1
            if (r4 != r1) goto L_0x01f1
            java.lang.String r1 = "۟ۙ۬ۦۙۜۘۜۨۨۘۜ۬ۡ۫ۛۘ"
            goto L_0x01e3
        L_0x01fa:
            java.lang.String r1 = "ۨۙۛۖ۬ۘۘۜۗۧ۠ۜ۟۬ۨۘۧ۟ۨۘ"
            goto L_0x01e3
        L_0x01fd:
            java.lang.String r1 = "ۙۨۛ۬ۤ۬ۘۤۘ۠ۡ۬۬ۢ۬ۧ۠ۢ"
            goto L_0x0016
        L_0x0201:
            int r2 = com.obwhatsapp.yo.ids.getId(r18)
            java.lang.String r1 = "ۥۤۥۜۡۥۘۥۢۗۗۗۤ۟ۦۦۜۖۦۘۚۢۖۗۖۧۘۥۦۘ"
            goto L_0x0016
        L_0x0209:
            java.lang.String r1 = "ۧۚۥۚۡۧۚ۠ۖۘۛۧۦۥ۫ۢۖۖۛۢ۫ۤ"
            r3 = r2
            goto L_0x0016
        L_0x020e:
            java.lang.String r1 = "ۘۚۛۤۛ۬۫ۜ۟ۡۖۧۜۡۖۨۘۖۢۢ"
            goto L_0x0016
        L_0x0212:
            java.lang.String r1 = "ۖۜ۟ۚۗۛۘ۬ۥۘ۟ۧۨۡۢ۠ۡ۬ۦۘۘۥ۠ۚۛۚ۫ۨۘ"
            goto L_0x0016
        L_0x0216:
            java.lang.String r1 = "ۖۨۦۘۙ۫ۘۦ۠ۨۘۦۖۘۨۢۗ"
            goto L_0x0016
        L_0x021a:
            java.lang.String r1 = "ۜۜۤۥۗ۬ۛۤۘۘۙۜ۫ۙۧۦۘ"
            goto L_0x0016
        L_0x021e:
            java.lang.String r1 = "ۘۙۡۚ۟ۜۘۨ۬ۙۦۜۨۘ۟ۨۘۨ۬۠ۚۜۘۗۢۥ۠ۘ۟"
            goto L_0x0016
        L_0x0222:
            java.lang.String r1 = "۬ۦۘۘۜ۟ۦۘ۠ۦۧۘۛۨۧۘۛۦ۫ۖ۫ۖۘ"
            goto L_0x0016
        L_0x0226:
            java.lang.String r1 = "ۢۢۥۦۚ۠ۛ۟ۨۘۥۢۥۧۚۨۘۜۢۘۘۚۗۥۘۚۡۤ"
            goto L_0x0016
        L_0x022a:
            java.lang.String r1 = "ۡۡۦۜۢۜۜۨۛۧۖ۠ۢ۠ۤ۫ۗ۬۫ۗۨۤۗ۬"
            goto L_0x0016
        L_0x022e:
            java.lang.String r1 = "ۚۡۢۗ۫ۘۗۢۤۘۘۦۢۗۖۘۛۜۖۗۚۗۛۥۖۧ۬ۦۘ"
            goto L_0x0016
        L_0x0232:
            java.lang.String r1 = "ۤۡ۫۬ۜۚۧ۫۬ۘۧۗۤۤ۟"
            goto L_0x0016
        L_0x0236:
            java.lang.String r1 = "ۜۦ۬۠ۛۜۘۛۢۨۥۧۜۘۥۚۖۘ۠ۘۗ"
            goto L_0x0016
        L_0x023a:
            java.lang.String r1 = "۟ۗۦۤۢ۠ۛۛۖ۠ۚۜۘۡۙۧۜۤۗۨۜۨۘۘۡۖۘۘ۬ۨ"
            goto L_0x0016
        L_0x023e:
            java.lang.String r1 = "ۧۡ۠ۨۤ۬ۦۥۥۘۖۙۖۛۢۦۘۗۙۢ"
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.getBubbleTick(java.lang.String):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getContactOnlineDotId() {
        /*
            java.lang.String r0 = "ۖۙ۠ۙۨۡ۫ۨ۠۠۫ۗ۬ۥ۫"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 2100073668(0x7d2c94c4, float:1.4337478E37)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 2026048436: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0002
        L_0x0010:
            java.lang.String r0 = "conversations_row_online_dot"
            java.lang.String r1 = "id"
            int r0 = getID(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.getContactOnlineDotId():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getContactStatusStr() {
        /*
            java.lang.String r0 = "ۙ۫ۤۖۨۥۜۖۙۙۜۙۤۖۨۗۖۘ۟ۨۖ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 31
            r3 = 1411550285(0x54228c4d, float:2.79255423E12)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 651878656: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "conversations_contact_status"
            java.lang.String r1 = "id"
            int r0 = getID(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.getContactStatusStr():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Context getCtx() {
        /*
            java.lang.String r0 = "ۚۤ۟ۡۦۡ۫۬۬ۖ۬۬ۢۙۚۙ۬ۨۘۘۧۛ۟ۗۧۖۙۧ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 85
            r3 = -1670994073(0xffffffff9c66a767, float:-7.631698E-22)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -861546049: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            android.content.Context r0 = f125q
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.getCtx():android.content.Context");
    }

    public static String getCurr_fJid() {
        String str = "ۖۢ۫ۖۚ۫ۚ۫ۜۚۧ۫۫۫ۖۙۤۚ";
        String str2 = null;
        String str3 = null;
        String str4 = null;
        StringBuilder sb = null;
        String str5 = null;
        while (true) {
            switch ((str.hashCode() ^ 462) ^ -66905611) {
                case -1927817733:
                    str = "ۘۦۢۚۖۦ۬ۧۜۜۡۘۢۧۨۘۛۜۗۙ۠ۨ";
                    str3 = str2;
                    break;
                case -1810526138:
                    str = "ۘۦۢۚۖۦ۬ۧۜۜۡۘۢۧۨۘۛۜۗۙ۠ۨ";
                    break;
                case -1595581878:
                    return sb.toString();
                case -1491539795:
                    str4 = "@g.us";
                    str = "ۙۨۦ۠ۗۚ۬ۗۡۖۖۘۨۥۥۨۘ۠ۛۛۦۘۗۘ۫";
                    break;
                case -1318915181:
                    sb.append(str3);
                    str = "ۦۜۙۧ۟ۜۛۙۘۨۦ۟ۛۛۦۘۢۘۡ";
                    break;
                case -356976943:
                    str = "ۘۢۗۗۦۥۘۢۥۧ۬ۡ۟۠ۜۦ۬۟۫ۧۘۦۘۡۥۢ";
                    sb = a.g(str5);
                    break;
                case 55762393:
                    str = "ۦ۠ۦ۬ۙۗ۬ۗ۬ۘۨۦۤۙۥۘ۫ۛۨ";
                    str3 = str4;
                    break;
                case 298625667:
                    String str6 = "۬ۦۥ۟۫ۦۘۨۛۛۢۚۘۘۗ۫ۘۜۘۘ";
                    while (true) {
                        switch (str6.hashCode() ^ 1802395025) {
                            case -670878498:
                                if (!isGroupJid(str5)) {
                                    str6 = "ۘۤۤۢۥۧۘۨ۟ۨۘۨۧۘۘۘ۠۫ۨۙۨۘۢۤۖۘ";
                                    break;
                                } else {
                                    str6 = "۬۠ۘۘۥۦۚۧۜۦۥۨۜۡۥ";
                                    break;
                                }
                            case -589092313:
                                str = "ۢ۠ۤۦۨ۬ۛ۟۟ۨۙۥۘۦۦۥۘۨۖۖۘ۟ۦ۟";
                                continue;
                            case -129207896:
                                str = "ۚۗۚ۟ۗۥۘۖۤۖۘۖۤۨۗۢۨۘ۫ۚۢ";
                                continue;
                            case 131288640:
                                str6 = "ۚۦۡۘۛۛۚۤۜۛۛۗۤ۫ۚۤ";
                                break;
                        }
                    }
                    break;
                case 1461480399:
                    str = "ۙۤۨۨۥۡۜۗ۬ۢۤۗۤۛۜۥۗ۬ۥۨۜۚۗۛۢۧۘۘ";
                    str5 = getCurr_sJid();
                    break;
                case 1461876001:
                    str2 = "@s.whatsapp.net";
                    str = "ۧۤ۫ۨۗۗ۬ۦۤۡۜۨۘۘۡۤ";
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getCurr_sJid() {
        /*
            java.lang.String r0 = "۠ۥۘ۬ۦۘۦۧۦۘۖ۟ۖ۠۫۬۟ۗۦۧ۠ۧۧۢۗۧۤۖ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 551(0x227, float:7.72E-43)
            r3 = 1635976646(0x618305c6, float:3.0211744E20)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -252571026: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "jid"
            java.lang.String r0 = com.obwhatsapp.yo.shp.getStringPriv(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.getCurr_sJid():java.lang.String");
    }

    public static Drawable getDrawableByName(String str) {
        String str2 = "ۧۙۘۧۨۡ۟ۘۜۗۧ۟ۤۥ";
        while (true) {
            switch ((str2.hashCode() ^ 665) ^ -1840274141) {
                case 453009213:
                    str2 = "ۡۦۧۘۗۤ۬ۚۢۛۘ۬۬ۥۜۢۜۦۜۘۚۚۜ";
                    break;
                case 1734522659:
                    return AnonymousClass00T.A04(getCtx(), getDrawableId(str));
            }
        }
    }

    public static int getDrawableId(String str) {
        String str2 = "ۚۗۡۘۢۥۧۘۤ۫ۛۘۘۥۛۡ۫ۘۧۥۘ";
        while (true) {
            switch ((str2.hashCode() ^ 329) ^ -1399724195) {
                case -1524497158:
                    str2 = "۫۠ۚۜۜۨۘۗۢۧۙۛ۫ۜۛۨۘ۠ۢۖ۟ۡۜۨ۬ۥ";
                    break;
                case 419540734:
                    return getID(str, "drawable");
            }
        }
    }

    public static long getExpDays() {
        try {
            return shp.getLongPriv("exp" + utils.buildNo1 + utils.buildNo2, (long) 170);
        } catch (Exception e2) {
            return (long) 170;
        }
    }

    public static int getFragmentTabTitle(int i2) {
        String str = "ۖ۠۫ۥۧۡۦ۫ۤۛۦۦۘۡۦۖۖ۠ۜۘۛۦۨۘۦۨۜۚۗۨۘ";
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            switch ((str.hashCode() ^ 41) ^ 745940362) {
                case -2060185905:
                    return i2;
                case -1974024225:
                    str = "۬ۥ۫ۤ۬ۢ۬ۗۦۘۤۖۡۘۤۗۗ";
                    str4 = str3;
                    break;
                case -1800113475:
                    str5 = "notification_settings_title_groups";
                    str = "ۨۦ۠ۥۖۥۘ۬ۨۢۚ۟ۨ۫ۤۚۛۘۦ";
                    break;
                case -1767681615:
                    String str7 = "۬ۜۚۜ۫ۗۜۛ۟ۜۘ۠ۙۢۦۘۤۦۥۧۦۖۨۚۦۖ۫ۧ";
                    while (true) {
                        switch (str7.hashCode() ^ -891525171) {
                            case -2003235646:
                                if (isGrpSeparateEnabled()) {
                                    str7 = "ۜۙ۫۠ۙۖۘۢۥۚۡۨ۠ۖۘۤۦۢۜۖۨۘۘۡ۬ۥۘۚ۟ۗ";
                                    break;
                                } else {
                                    str7 = "ۡۡۜۘ۟ۨۚۘۧۜۚۦۨۘۘۡۙۘۗۧ";
                                    break;
                                }
                            case -1846248863:
                                str7 = "ۙۛۜۘۘ۬ۤۛ۬۬ۤ۫ۜۘۜۨۨ";
                                break;
                            case -312540803:
                                str = "ۗۘ۟ۥۡۧۛ۟ۗۢۙۧۢۦۨ۫ۘۘۢۙ۠ۧۚۗ";
                                continue;
                            case 1411049652:
                                str = "۟ۧۗۨۧ۠ۦ۠ۦۘۢۢۖ۟ۨۜۨۘ۠";
                                continue;
                        }
                    }
                    break;
                case -1476061954:
                    str = "ۧۤۨۘ۟ۨۜ۫ۜۦۖۧۛ۟ۖۡ";
                    str4 = str6;
                    break;
                case -566211128:
                    str = "ۡۜۚۨۚۥۘۡۧ۠ۢ۠ۗ۟ۜۜ";
                    str3 = "calls";
                    break;
                case -353363856:
                    String str8 = "ۥۖۡ۫۫ۚۤۥۥۘۗۜۘۘۤ۫ۥۘۦۥۙ۠ۛۚ";
                    while (true) {
                        switch (str8.hashCode() ^ 806287964) {
                            case 404418003:
                                str = "ۗۜۧۘۚۦۨۢ۟ۡۖۛۜۙۥۘۘۡۧۘ۬۟۫";
                                continue;
                            case 428457435:
                                str = "۠۠۫ۚۙۥ۫ۦۖۘۙۡۙۥۢ";
                                continue;
                            case 1220006142:
                                if (i2 != 4) {
                                    str8 = "۠ۙۢۛۛۚۛ۟ۜ۟ۥۜۘۘۗۡۘۜۖ۠";
                                    break;
                                } else {
                                    str8 = "ۚۦۖۢۜۢۚۦۜۚۘۚۢ۬ۥۘۨ۟ۘۚۢۥۘۘۤۖۘۘۥۡ";
                                    break;
                                }
                            case 1475046285:
                                str8 = "ۛۖۛ۠ۥۧۢۥۛۥۢۥۘۖۛۧۚ۬ۦۘۤۡ۬";
                                break;
                        }
                    }
                    break;
                case -331345824:
                case 317383221:
                case 1334121068:
                    str = "۟۟۟ۛۙۦۘۡ۫ۖۘۚۧۖۤۢۖۘۤ۫ۡۘ";
                    break;
                case -108661700:
                    String str9 = "۬ۜۖۧۙۡ۠ۙۚۙۙۦۥۙۤ";
                    while (true) {
                        switch (str9.hashCode() ^ -418416242) {
                            case -1628551743:
                                str = "ۧۨۨ۠ۖۙۘۗۘۘ۟ۢۚۡۡۙ";
                                continue;
                            case -517292532:
                                if (i2 != getID("statuses", "string")) {
                                    str9 = "ۥۦۦۘۗ۫۟ۗۖۨ۫ۜۚ۟ۙۥۗ۬ۥۘ۬ۦۤ";
                                    break;
                                } else {
                                    str9 = "ۖ۠ۙۖۖ۫۠ۚۖۘۚۧۥۘۡۢۛۗۙۥۘۨۜۜۘ";
                                    break;
                                }
                            case -5892115:
                                str = "ۗۗۛۘۦۗۜۘۖۘۛۜۧۘۦۧۘ۬ۛۦۘۚ۬ۥۘۚۗۖۘ";
                                continue;
                            case 497504233:
                                str9 = "ۧۨۙ۠ۗۙۘۚۤۘ۟ۙۤ۟ۧ۫ۙ۬ۖ۟ۖ۬ۛۥۘ";
                                break;
                        }
                    }
                    break;
                case 126903119:
                    return getID(str4, "string");
                case 154503893:
                    str2 = "test";
                    str = "ۙ۬ۜۛۥۙۦۤ۫ۜۤۘۘۡۨۦۙۤۙۡۥ";
                    break;
                case 738762966:
                    str6 = "statuses";
                    str = "ۢۥ۫ۨۡ۠ۚ۟ۦۖۛۖۘۛۖۛۧۗۖۘۤ۬ۦۘ۬ۖۦۙۥۤ";
                    break;
                case 1042095848:
                    str = "۟ۜۖۗۤۚۜۙۡۘۚۘۤۦ۫ۡۤ۬۟۬ۢ۟ۥۘ";
                    str4 = str5;
                    break;
                case 1228407742:
                    String str10 = "۟ۨۖۤ۟ۖۚۙۥۘۨۥۥۗۧۖۘ۬ۗۧۘۖ۫ۤۗۘۘ";
                    while (true) {
                        switch (str10.hashCode() ^ -2062873913) {
                            case -730169677:
                                str10 = "ۡۚۖۘۘۡۙۤۘۥۘۨۥ۟۟ۢۙۦۦۧۚۢۖۘ";
                                break;
                            case -681476634:
                                str = "۠ۥۘۘۗۗۡۦۖۘۛۤۜۛۚۘۘۨ۟ۚ";
                                continue;
                            case -85208487:
                                if (i2 != getID("calls", "string")) {
                                    str10 = "ۦۦۦۘۗ۠ۥۘۙ۠ۡۖۦۛ۫ۡۘ۫ۚۨۘ";
                                    break;
                                } else {
                                    str10 = "ۢۡۛۙۦۢ۬ۧۦ۫ۢۤۙۜ۠ۘۤ۟ۧۙۗ";
                                    break;
                                }
                            case 2057421893:
                                str = "ۘ۬ۗ۫ۜۥۤۚۦۘ۠۟ۡۡۙۢ۫ۗۧۥۙۡ";
                                continue;
                        }
                    }
                    break;
                case 1252460176:
                    str = "ۛۙۜۧ۬ۢۚۖۧۦۤۤۘۙۡۘ";
                    break;
                case 1678852097:
                    str = "۟۟۟ۛۙۦۘۡ۫ۖۘۚۧۖۤۢۖۘۤ۫ۡۘ";
                    str4 = str2;
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean getGroupBoolean() {
        /*
            java.lang.String r0 = "ۚۗۛ۠ۖ۬ۗ۫۟ۨۨۙۗۗ۠ۗۙ۟"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 190(0xbe, float:2.66E-43)
            r3 = 1226107096(0x4914e8d8, float:609933.5)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -846316699: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "is_group_chat"
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.getGroupBoolean():boolean");
    }

    public static int getID(String str, String str2) {
        try {
            int id = freqids.getId(str);
            String str3 = "۫ۛ۫ۚ۠۟۠۬ۢۨ۬ۡۘۧۦۙۛۘۘۢۦ۬ۦۗۥۘ";
            while (true) {
                switch (str3.hashCode() ^ 227431541) {
                    case -804509303:
                        return id;
                    case -1626868:
                        String str4 = "۟ۚۙۤۡۗۛۗۦۘ۟ۨۦۜۢۜۘۜ۠ۙ۬ۥۗۤ۫۬ۛۘۧۘ";
                        while (true) {
                            switch (str4.hashCode() ^ -1450452128) {
                                case -760925036:
                                    String stringObfName = freqObfStringMapping.getStringObfName(str);
                                    String str5 = "ۧ۟ۥۘ۠ۢۖۡۚۖۘۘۡۢۜۗ۫ۘۦ۠";
                                    while (true) {
                                        switch (str5.hashCode() ^ -607792198) {
                                            case -1074300971:
                                                str = stringObfName;
                                                break;
                                            case -922277843:
                                                if (stringObfName != null) {
                                                    str5 = "ۙۗۙۖ۟ۜۘ۟ۙۜۘۡۗۦۘۚۖۦۘ";
                                                    break;
                                                } else {
                                                    str5 = "ۛ۫ۛۡۛۖۖۧۛۘۥۘۗۛۖ";
                                                    continue;
                                                }
                                            case 1274259126:
                                                str5 = "ۖۨۨۛۜۗۗۗۤۛ۬ۥۘۘ۬ۦۛۥۜۤۢۜۘۧ۬ۦۘۢ۟ۥ";
                                                continue;
                                            case 1557434362:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                case 189329868:
                                    str4 = "۬۟۫ۜ۠ۢۛۧۗۡۗۦۙ۬۫ۘ۬ۢۤۤۧ۠ۜۢ۫۟ۨ";
                                    continue;
                                case 430990933:
                                    if ("string".equals(str2)) {
                                        str4 = "ۤۜۨۘۦۧۨۘۧۗۜۘۛۙ۫۟ۚۤۖۛۗۙۖۖۘۛۗۘ";
                                        break;
                                    } else {
                                        str4 = "ۛ۟ۥ۠۠ۨۘ۫ۤۛۖۧۘۢ۠۫ۖۢۚۙۚ۫";
                                        continue;
                                    }
                                case 1241974899:
                                    break;
                                default:
                                    continue;
                            }
                        }
                        Pair create = Pair.create(str, str2);
                        HashMap hashMap = f134z;
                        Integer num = (Integer) hashMap.get(create);
                        String str6 = "ۖ۬ۜۛۢۦۤۤۗۤۜۘۘۢۧۖۚۨۧۙ۬۟ۖۧۙ";
                        while (true) {
                            switch (str6.hashCode() ^ -2025896780) {
                                case -1946598251:
                                    str6 = "۫ۦۤۨۜۚۖۖۖۙۢۘۗۨۘ";
                                    continue;
                                case -114629614:
                                    break;
                                case 1244986501:
                                    num = Integer.valueOf(getCtx().getResources().getIdentifier(str, str2, mpack));
                                    hashMap.put(create, num);
                                    break;
                                case 1889985742:
                                    if (num == null) {
                                        str6 = "ۨ۠ۦۘۢۨۧۘ۟۬۟ۙۘۛۖۤ۠ۚ۠ۗۖۨۨۖۡۘ";
                                        break;
                                    } else {
                                        str6 = "ۜۗۖۧۦۢۙۗۧۚ۟ۡۛۛ۟ۜ۫ۥۘ";
                                        continue;
                                    }
                            }
                        }
                        return num.intValue();
                    case 216572013:
                        if (id == -1) {
                            str3 = "ۧۡۡ۟۫ۖ۬۟۟ۚۥۢ۬ۧۙۗۙ۫";
                            break;
                        } else {
                            str3 = "۟ۢۨۛۨۨۘۦۖۙۘۡۦۡۘۡۘ";
                            break;
                        }
                    case 1826323537:
                        str3 = "ۦۗۡۧۘۡۛۛۥۘۡۖ۬ۨۤ۫ۘۗۦۘۜۗۖۘۡۤۘۘ";
                        break;
                }
            }
        } catch (Resources.NotFoundException e2) {
            return -1;
        }
    }

    public static int getMaxMCastLimit(int i2) {
        String str = "ۚۚۗۛۛۡ۫ۥۘۘۦۜۥۢۥ۟ۢۚۛ۠ۖۛ۠ۜۘۚ۬ۛ";
        int i3 = 0;
        int i4 = 0;
        while (true) {
            switch ((str.hashCode() ^ 579) ^ -1806281190) {
                case -1752680266:
                    str = "ۤۖۙۧۡۧۘۙۖ۠۬ۢۨۘۧۨۘ";
                    i4 = i3;
                    break;
                case 549634441:
                    str = "۫۫۠ۙۧۛۚۛۛ۫ۘ۬ۙ۬ۖۘۜ۫ۥۧ۟ۚ";
                    i4 = i2;
                    break;
                case 773624025:
                    return i4;
                case 1257366137:
                    str = "ۦ۬ۧ۫۫ۤۡ۠ۤ۬ۡۘۙ۠ۘۘۤ۠ۥۚۧۡ۟ۖۥۘۛۥۗ";
                    break;
                case 1832047833:
                    i3 = 250;
                    str = "ۖ۬۫ۖۗۛۧۨۘۘۜۗ۟۟ۧۜۘ۫ۡۧۘۘۢۗۗۢۘۘ";
                    break;
                case 1934208554:
                    String str2 = "ۥۚۚۚۙۤ۬ۘۦ۬۟ۦۚۗۧۖۚۢۥۤۚ۫ۜۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1248117190) {
                            case -1081046369:
                                if (!shp.getBooleanPriv("fwd_lim_incr")) {
                                    str2 = "۟ۗۨۗ۟ۦۘ۠ۦۦۘۢۗ۠ۨۚۗ۫ۧۢۘۨۧۘۘۗۦۡۜ۬";
                                    break;
                                } else {
                                    str2 = "ۛۖ۠ۙۜۧۡ۠ۢۙ۟ۜۘۨۥۘ";
                                    break;
                                }
                            case -822976689:
                                str = "ۡۧ۫۬ۨۨۘۖۙ۟ۛ۬ۡۨۘۗۨۡۘۘ۫۬ۜ";
                                continue;
                            case -202451437:
                                str = "ۤۖۙۧۡۧۘۙۖ۠۬ۢۨۘۧۨۘ";
                                continue;
                            case 99562675:
                                str2 = "۫ۘۜۘۧۧ۟۠۬ۦۘۚۢۘۨۧۖ۟۠ۥ";
                                break;
                        }
                    }
                    break;
            }
        }
    }

    public static String getMyStatus(String str) {
        String str2 = "ۘۜۖۘ۫۫ۤۡۖۦۘۗۦ۠ۗۤۥۘۡۡۖۖۚۜۘ";
        while (true) {
            switch ((str2.hashCode() ^ 439) ^ -1442821067) {
                case -779209592:
                    str2 = "ۢ۠ۗۧۦ۬ۧۡۗۥۢۡۘ۠۠ۨۤ۠ۡ۬ۤ";
                    break;
                case 1915856496:
                    return shp.stockPrefsLight.getString("my_current_status", str);
            }
        }
    }

    public static int getNIcon(int i2) {
        try {
            String stringPriv = shp.getStringPriv("yo_nicons", shp.getPrefString("yo_nicons", "0"));
            int id = getID("yo_notifybar_" + stringPriv, "drawable");
            String str = "ۢ۫ۢۨۡۖۘ۫۫ۦۛۧۖۘۥۚۜۘۘۘۢۢۜ۠۫ۡۚ";
            while (true) {
                switch (str.hashCode() ^ 919892546) {
                    case -1967903616:
                        str = "۬۠ۜۢ۠۫۠ۛۦ۬ۦ۫ۧ۬ۜۦ";
                        break;
                    case -322533448:
                        shp.setStringPriv("yo_nicons", "0");
                        return getID("yo_notifybar_0", "drawable");
                    case 601076365:
                        if (id > 0) {
                            str = "ۗۜۧۚۨۥۨۚ۠ۗۢ۠ۘۡ۬ۗۥۘ";
                            break;
                        } else {
                            str = "ۛۗ۫ۙ۠ۛۘۤۦۘۦۤۡۘۛۗۖ";
                            break;
                        }
                    case 1749358241:
                        return id;
                }
            }
        } catch (Exception e2) {
            return i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getOnlineString() {
        /*
            java.lang.String r0 = "ۢۧۤۦۤۘۘۧۡ۠۬ۘۗۖۤۘۘۧۗۡۘۨ۠ۢ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 121(0x79, float:1.7E-43)
            r3 = -1657412043(0xffffffff9d35e635, float:-2.4074165E-21)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1099138943: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "conversation_contact_online"
            java.lang.String r0 = getString((java.lang.String) r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.getOnlineString():java.lang.String");
    }

    public static int getReadTick(int i2, int i3) {
        String str = "ۗۖۡۘ۬ۦۘۘ۠ۚۖۘۧۨۨۛۚۛۛۚۧ۟ۡۘۧۦ۬ۤۢ۠";
        while (true) {
            switch ((str.hashCode() ^ 626) ^ 1050674465) {
                case -1795961133:
                    String str2 = "ۜۥۗۗۤۜۗۛۖ۫ۘۜۘ۫ۥۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -1084516033) {
                            case -1028552176:
                                str2 = "ۡ۬ۜۥۥۧ۬ۖۡۖۘۡ۠ۦۦۘ۠ۖ";
                                break;
                            case 276329273:
                                if (i2 != freqids.getId("msgStatusReadTint")) {
                                    str2 = "ۧ۟ۥۢۦۥۡ۫ۨۘۡۨۤۚۛۨۧ۟ۗۤۗ۬ۜۖۤ";
                                    break;
                                } else {
                                    str2 = "ۧۖۖۘ۫ۖۖۘ۫ۨۜۖۡ۟ۧۚۥۘ۟ۘۘ۟ۨۦۘۜۗۖۘۤۢۥۘ";
                                    break;
                                }
                            case 1393880807:
                                str = "ۚۦۥۘۡۧۜۜۘۥۚۚۙ۬ۘ۠";
                                continue;
                            case 1743651891:
                                str = "ۙۤ۠ۜۦ۬۬ۚ۠ۦۥۚۜۦۖۘ";
                                continue;
                        }
                    }
                    break;
                case -948630562:
                    return i3;
                case 359789825:
                    str = "ۗۤۡۘۘ۫ۡۘۙۤۥۚ۫۫ۥۘۦۧۢ";
                    break;
                case 995583607:
                    str = "ۦ۠ۢ۫۫ۗۗ۠ۘ۬ۛۘۘۦۧۨۙۜ۠ۜ۬ۨۘۛۖۦۘ";
                    break;
                case 1482141521:
                    return getBubbleTick("message_got_read_receipt_from_target");
            }
        }
    }

    public static int getResColor(String str) {
        String str2 = "۫ۤۧۛۜۦۘۖ۬ۥ۠ۨ۟ۡۛۦۗۨۘۥۘۜ۟ۥۥۡۧۡۘ";
        while (true) {
            switch ((str2.hashCode() ^ 236) ^ -522368153) {
                case -2060653092:
                    str2 = "ۥۡۛۚۘ۫۠۠ۜۘۙۖۡۘ۬ۦۜۘۢۧۜۘۨۜۧ۬ۖ۟";
                    break;
                case -1307427742:
                    return getCtx().getResources().getColor(getID(str, "color"));
                case -1179386041:
                    return i.a(getCtx(), getID(str, "color"));
                case 42175964:
                    String str3 = "۠۬ۚۥۥۡۢ۠ۗۗ۠ۦۘۤۗۙ۟ۤۧ";
                    while (true) {
                        switch (str3.hashCode() ^ 1283524087) {
                            case -308954870:
                                if (Build.VERSION.SDK_INT < 23) {
                                    str3 = "۟ۙۜۘ۫ۖ۬ۦۡۖۘ۠ۚۖۘۤۨۙ";
                                    break;
                                } else {
                                    str3 = "ۜۗۦۜۗۡۛ۟ۛۡ۫ۢ۠ۘۢ";
                                    break;
                                }
                            case 152076166:
                                str2 = "ۚۡ۠۠۠ۨۘۜ۠ۨ۬۟ۛۥۧ۬ۚۦ";
                                continue;
                            case 994407320:
                                str2 = "۠ۗۛۧۦۡۘۖۗۡۘۢۤۘۘ۬ۙۛۦۚ۠ۢ۟ۛۘۘ";
                                continue;
                            case 2061089305:
                                str3 = "ۜۤۦۢ۬ۦۘۗۧۜۗۜۦۘ۬ۜۦۥۢۘۘۚۨۡۘ";
                                break;
                        }
                    }
                    break;
            }
        }
    }

    public static String getString(int i2) {
        String str = "ۤۡۧۖۦ۬۬۠ۙ۟۠ۥ۫ۨۛۜ۫ۜ";
        while (true) {
            try {
                switch (str.hashCode() ^ 52090678) {
                    case -1254674607:
                        str = "ۤۖۗۦۙۧۤۡۢۖ۫ۨۦۨۘۘ";
                        break;
                    case 845543734:
                        if (!freqObfStringMapping.isFMString(i2)) {
                            str = "ۙ۫ۡ۟ۤۘۘۗۘ۟۟ۗۨۥ۠ۨ۬ۡۘۖۛۨۘۚۚۨۘ";
                            break;
                        } else {
                            str = "ۜۥۡۘۜ۠۫ۨ۠۠ۘۚۗۤ۟ۖۘۨۦۦۢۜۘ";
                            break;
                        }
                    case 957377257:
                        return getCtx().getString(i2);
                    case 1080416791:
                        return f133y.A09(i2);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return "";
            }
        }
    }

    public static String getString(String str) {
        String str2 = "ۦۘ۟ۧۙ۟ۢ۠ۥۘۧۨۥۗۦۨۘۤۨۘ";
        while (true) {
            switch ((str2.hashCode() ^ 702) ^ 1685634356) {
                case -1504143873:
                    return getString(getID(str, "string"));
                case -208360696:
                    str2 = "۫۟۟ۚ۬ۘۘۢ۬ۨۘۡۧۥۘۨ۟ۜ";
                    break;
            }
        }
    }

    public static String getString(String str, Object[] objArr) {
        try {
            return getCtx().getString(getID(str, "string"), objArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getUniversalColor() {
        /*
            java.lang.String r0 = "ۢۙ۟ۘۖۗۙ۫ۘۗۙۨۘۡۜ۠"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 805(0x325, float:1.128E-42)
            r3 = -1316594783(0xffffffffb1865ba1, float:-3.9103303E-9)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1002962886: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "ModConPickColor"
            int r1 = com.obwhatsapp.yo.ColorStore.getPrimaryColor()
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.getUniversalColor():int");
    }

    public static String getYoAndroidID(String str) {
        try {
            String stringPriv = shp.getStringPriv("android_id9");
            String str2 = "ۨۦۛۙۘۨۛۘ۬ۦۥ۫ۙ۟ۦ";
            while (true) {
                switch (str2.hashCode() ^ -1461327796) {
                    case -2040526888:
                        return stringPriv;
                    case -1257436037:
                        String hexString = Long.toHexString(new SecureRandom().nextLong());
                        shp.setStringPriv("android_id9", hexString);
                        return hexString;
                    case -506489029:
                        if (!stringPriv.equals("")) {
                            str2 = "ۢۜۨۙۥۧ۟ۘۢ۠ۥۘ۫ۥ۟ۙ۟ۘۘ";
                            break;
                        } else {
                            str2 = "۠ۨۙۗۙۥۗۙۚۘ۠ۖ۠ۢ۫ۧۢۧ";
                            break;
                        }
                    case -150385977:
                        str2 = "ۖ۫۬۟ۧۨۘ۬ۧ۫ۥۗۧۜۖۜۤۢۙۜۙۛۚۙ۬ۖۢ۟";
                        break;
                }
            }
        } catch (Exception e2) {
            return str;
        }
    }

    public static void hHideOpt(boolean z2) {
        MenuItem menuItem = null;
        String str = "۫ۧۘۨۛۖ۠ۨۡۘۛ۫ۥ۫ۛۧ۠ۙ۠ۙۨۚۥۙۦۜ۟۟";
        while (true) {
            switch ((str.hashCode() ^ 803) ^ 1811430006) {
                case -1588609204:
                    String str2 = "ۡۗۧۛۚۚ۠ۗۜۘۥۧۚۖۖۧۚۛۦۦۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -1933881262) {
                            case -1453956753:
                                if (menuItem == null) {
                                    str2 = "ۤۛۡۘۛ۟ۙۢ۫ۡۘۘۗۖۨۗۤ۟۫ۚ";
                                    break;
                                } else {
                                    str2 = "ۛۧۨۘۤ۠ۨۘۗۧ۟ۙ۠۫ۖۖۘۤۧۛ۠ۤۦ";
                                    break;
                                }
                            case -297875433:
                                str2 = "۬ۙۗ۟ۘۖ۠ۙۜۢۤۨۜ۠ۦ۫ۜۦ۠ۥ۟";
                                break;
                            case 73411683:
                                str = "۠ۙۦۘ۫ۨۗۗ۬۬۟ۧۛۨۧۜ۠ۢ۫ۦۧۘ";
                                continue;
                            case 698760603:
                                str = "ۙۦۥۘۡۘ۬ۖۡۛۡۚۘ۬ۛۤۢۡۡ";
                                continue;
                        }
                    }
                    break;
                case -445411307:
                    menuItem.setVisible(z2);
                    str = "ۙۦۥۘۡۘ۬ۖۡۛۡۚۘ۬ۛۤۢۡۡ";
                    break;
                case 292581028:
                    return;
                case 1328500072:
                    menuItem = E;
                    str = "۫ۦۥۖۨۥۘۛ۠ۡۘۨ۟ۡۜۤ۟ۘۧ۠";
                    break;
                case 2097602531:
                    str = "ۗۢۜۚۡۧ۠ۤۚۤۚۜۢۙ۟ۘۢۨۘۜ۬ۘ۬ۡۘۢ۟ۘ";
                    break;
            }
        }
    }

    public static void hideDiv(View view, Drawable drawable) {
        String str = "ۧ۫ۜۡۚۡۘۥۘۛ۟ۖۥۧۢ۟۠ۨۛۦ۟ۡۦۖ۫ۜۗ۠";
        Drawable drawable2 = null;
        while (true) {
            switch ((str.hashCode() ^ 956) ^ -1606232153) {
                case -1769645726:
                    str = "ۚۜۦۘ۟ۛۘۘۧ۟ۢ۫ۙۢۙۖۢۙۜۧۜۜۚۚۗۗ۠ۜۡ";
                    break;
                case -1111937427:
                    String str2 = "ۚۘۤ۟ۦۜ۟ۡۘۧۨ۟ۖۚۛۖۨ۠ۤۦۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 874795759) {
                            case -2004087693:
                                str = "ۚۙۨۖۡۘ۠ۛۥۘ۟ۦۘۤۨۗۢۗۡۘۥۜۗۡۛۨۘ";
                                continue;
                            case -964553774:
                                str = "ۧۜۧۧۢۛ۬۫ۛۜۙۖۘۚۥۘۗ۟۫ۤۨۨۘۚۘۗ۠ۥ۠";
                                continue;
                            case 1208468008:
                                if (!shp.getBoolean("Hide_div")) {
                                    str2 = "۫ۚۦۦۙۥ۬ۖ۫ۙۥۖۘۢ۬ۨۘ۠ۛۥۘ";
                                    break;
                                } else {
                                    str2 = "ۥۨۨۘۤۨ۫۬ۦۗۜۜۜۙۚۜۘۤۦۖ";
                                    break;
                                }
                            case 1427318027:
                                str2 = "ۘۧۙۜ۠ۙۗۨۤ۟ۙۨ۟۟ۡ۟۫۬۠ۗۙ";
                                break;
                        }
                    }
                    break;
                case -315486601:
                    str = "ۚۙۨۖۡۘ۠ۛۥۘ۟ۦۘۤۨۗۢۗۡۘۥۜۗۡۛۨۘ";
                    drawable2 = null;
                    break;
                case -271319545:
                    return;
                case -96861925:
                    str = "ۤۗۘۘۗۘۘۜۤۡۦۦۡۘۦ۟۟ۤۘ۟۟۬ۡۘ";
                    break;
                case -25298738:
                    str = "ۨۨۜ۫ۥ۬ۖۢۦۖۖۦۦۙۙۛۡۗۜۛۢ";
                    drawable2 = drawable;
                    break;
                case 50893233:
                    view.setBackground(drawable2);
                    str = "ۤ۫۬۬۠ۗۢۙۥۖۖۡۜۢۨۘۧۥۡ";
                    break;
                case 1871394926:
                    str = "ۥۛۖۖۨۨۘۙۛۘۗۚۤۙۙۙۘۨۜۨۨۗۗ";
                    break;
            }
        }
    }

    public static void hideDiv(ListView listView) {
        String str = "ۤۗۦۘ۟ۦ۟ۛ۟ۥۘۦۤۗۗۢۘ۟ۙۘۤۤۙ";
        while (true) {
            switch ((str.hashCode() ^ 858) ^ -93171286) {
                case -1996068343:
                    str = "ۢۨ۠ۥۨۧۘۗۦۗ۫ۗۘۢۘۦۘ";
                    break;
                case -485076442:
                    return;
                case 339002849:
                    listView.setDividerHeight(0);
                    str = "ۦ۠ۜۖۧۥ۟ۧۦۖۚۘۘ۠ۡ۟ۖۖۡۘۙۦۚ۟۠ۨۘۚۛۜۘ";
                    break;
                case 1646312906:
                    String str2 = "ۦۦۛۧ۫ۦۘۢۛۨۘۖۗۗۖۧۨۜ۟ۨۡۥۘ۠ۨۚۡۗۧ";
                    while (true) {
                        switch (str2.hashCode() ^ 2045726602) {
                            case -1884129627:
                                str = "ۦ۠ۜۖۧۥ۟ۧۦۖۚۘۘ۠ۡ۟ۖۖۡۘۙۦۚ۟۠ۨۘۚۛۜۘ";
                                continue;
                            case -1784480168:
                                str = "۬ۙۡۥ۬۠ۡۜۥۘۚۚ۠ۖۜۜۙۜۙ۟ۜۨۥۘ";
                                continue;
                            case 1208178470:
                                str2 = "ۨ۟ۙۘ۬ۦۘ۟ۙ۠۠۟ۜ۠ۦۦۤ۫۬ۗۙۖۘۧۤۗ";
                                break;
                            case 1555156963:
                                if (!shp.getBoolean("Hide_div")) {
                                    str2 = "۬ۡۖۘۢۦ۟۟ۨۜ۠۟۬۠ۥۘۘۤ۬۠ۙۖۡ";
                                    break;
                                } else {
                                    str2 = "ۜۦۨۧ۠ۘۡۖۡۙۜۧۘۗۨ۬ۥۨۥۘۡۘ۟ۨ۠ۜۘۗۚۙ";
                                    break;
                                }
                        }
                    }
                    break;
            }
        }
    }

    public static void homeAfter_onResume(Activity activity) {
        String str = "۠۬ۤۗۘۜۘ۠ۛۤۢۤۛۖۛۥ۫ۡۘۤۚۘۘۚ۠ۧۥۨۥ";
        while (true) {
            switch ((str.hashCode() ^ 147) ^ 426707919) {
                case -2032793933:
                    String str2 = "ۧ۠ۙۦۡ۬ۗۧۡۘۢۖۗ۫ۨۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -1699701541) {
                            case -459724953:
                                str = "۬ۧۚۤ۠ۦۥۙۡۧۨۥۘ۫ۡۖۘۡۗۥۚۚۜۥۜۘۘ";
                                continue;
                            case 462186595:
                                if (Homeac != null) {
                                    str2 = "ۚ۬۠ۜۧۗۢۛۨ۫ۖ۟ۥۘ۠ۧۘۜۖ۠ۚۧۜۨۧۢۛ";
                                    break;
                                } else {
                                    str2 = "ۢۗ۬ۛۨ۫ۚۡۘۘۦ۠ۤۧ۠۬ۚ۠۠ۙۖۧۘۖۚۢ";
                                    break;
                                }
                            case 646908310:
                                str2 = "ۛۡۗۧۛۗۢۚۘۘۤۚۢ۬ۛۘۘۘۚۘ";
                                break;
                            case 1545963550:
                                str = "ۛۘۥۘۖۛۘۘۤ۠ۚۧ۟ۜۘۚۜۖۘۘۛۡۘ";
                                continue;
                        }
                    }
                    break;
                case -1199173074:
                    app.checkInternet();
                    str = "۫ۗۙ۫ۜۡۦۚۙ۟ۖۨ۫ۛۘۛۦۖۘۚ۬ۡ۬ۛۥۘ";
                    break;
                case -411273113:
                    Homeac = (HomeActivity) activity;
                    str = "۬ۧۚۤ۠ۦۥۙۡۧۨۥۘ۫ۡۖۘۡۗۥۚۚۜۥۜۘۘ";
                    break;
                case -170736200:
                    return;
                case 624193250:
                    str = "ۘۦۧۘۚ۠ۢ۫ۢۨۢ۟ۨۘۗۜۢ۫ۥۥ";
                    break;
                case 1711025015:
                    H2();
                    str = "ۦ۠۟ۙۚۙۤۙۤۙۜۧۘۡ۫ۜۘ۬ۨۖ";
                    break;
            }
        }
    }

    public static void homeAfter_setContentView(Activity activity) {
        String str = "ۢۖ۟ۜۚۦۘ۟۟ۤۖ۠ۢۧۨۡۘۘۚۙ۟ۖۧۖۗۥۚۛۖ";
        while (true) {
            switch ((str.hashCode() ^ 525) ^ 1019254479) {
                case -2081801879:
                    HomeUI.mWall();
                    str = "ۘۘۢۥۦۖۘۦۢۦۗۤۧۗۤۦۥۤۗۖۗۨۘۡ۟۫ۡۤۘۘ";
                    break;
                case -1991858905:
                    setHOp(false);
                    str = "ۡۙۖۦۨۡۡ۠ۤۦۛۚۜ۠۟ۙۡۜ";
                    break;
                case -1957586599:
                    return;
                case -1948320192:
                    HomeUI.setupBottomBar();
                    str = "ۢۛۤۚ۬ۥ۠ۨ۠۫ۦۚۥۦۡۘۖۤۨۘ۬ۖۦۘۨۜۤۢۜۧ";
                    break;
                case -1813914733:
                    str = "۠۫ۥۡۦۦۘۜۘۖۙ۠ۨۘۘ۫ۖۘ";
                    break;
                case -1766072398:
                    others.setStatusNavBar(activity);
                    str = "۫ۙۙۤ۠۬ۥۜۙۦۤۨۥۧۦۚۙ";
                    break;
                case -1511159597:
                    HomeUI.titleToolbar();
                    str = "ۚ۟ۖۗۢۦۖۥۜۘۛۥۚۘۢۢۜ۟۟ۙۖ۟ۧ۟ۙۨۥۨۘ";
                    break;
                case -1059669077:
                    checkV(activity, false);
                    str = "ۘۙۢۙ۬ۥۘ۬ۗۚ۟۬ۗۧۤ۟۠ۦۥۜۘ";
                    break;
                case -534640247:
                    HomeUI.setToolbar();
                    str = "ۖۗۡۥ۬ۦۘۜ۟ۛۙۜۚۛۥۥ۠ۙۢۡۦ۟ۥ۠ۘ";
                    break;
                case -159059561:
                    Homeac = (HomeActivity) activity;
                    str = "ۗۗۤ۟ۨۨۘۧۨۨۖۧۨ۫ۙ۫۫۠ۨۙۖۜۛۘۛۢۨۘ";
                    break;
                case 498490516:
                    WidgetProvider.updateYoWAWidget(activity);
                    str = "ۛۚۘۚ۟۠۫ۥۛۚۖۤۘۥۜ۟ۚۡۤۙۤۛۚۡۘ";
                    break;
                case 1547353296:
                    HomeUI.oneUI();
                    str = "ۜۨۜۘۡۘۜۗۖ۠۫ۛۡۘۛ۫۬";
                    break;
                case 1765985660:
                    String str2 = "ۛ۬ۚۗۥ۟۠۠۟۠ۖ۬ۤۙ۟ۖۢۦۘۗۢ۠ۜۥۤ";
                    while (true) {
                        switch (str2.hashCode() ^ 923322728) {
                            case -1270379148:
                                str = "۫ۛۜۘۧۢۘۚ۠ۘۘۢۥۦۙۧ۬ۥ۬ۚۗۦۢ";
                                continue;
                            case -764746105:
                                if (!HomeUI.isOneUIEnabled()) {
                                    str2 = "۫ۡۖۘۢۨۘۘۥ۠۟۟ۛۨ۟ۜۖۧۗۢۤ۫";
                                    break;
                                } else {
                                    str2 = "ۨۤۦۨۗۛۙ۟ۛۜۥۖۗۨۤۤۦۘ";
                                    break;
                                }
                            case 1415721461:
                                str2 = "۠ۜۦۘ۟ۘۡۘۢۧ۠ۢ۬ۘۘ۠ۙۤۤۨۤ";
                                break;
                            case 1979881998:
                                str = "ۜۨۜۘۡۘۜۗۖ۠۫ۛۡۘۛ۫۬";
                                continue;
                        }
                    }
                    break;
                case 1785599384:
                    HomeUI.paintHomeFAB(Homeac);
                    str = "ۧۗۛ۟۬ۤۗ۬۟ۘۥ۠ۤۘ۫";
                    break;
            }
        }
    }

    public static void imgRes() {
        String str = "ۤ۠ۘۖۙ۫۫ۖۜۘۙۘۘۥۗۚۡۗۖ۠ۜۧۘۘۧ۠ۧۨۥۘ";
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            switch ((str.hashCode() ^ 527) ^ 1309317277) {
                case -2104138787:
                    shp.f876c.putInt("status_video_max_duration", 300).commit();
                    str = "۫ۤۚۡۚ۠ۨۙۤۙۘۜ۫ۤۨۨۖ۬۠ۖۖۜۡۘ۬ۗۢ";
                    break;
                case -1682589131:
                    i3 = 80;
                    str = "ۤۢۦۘۜۖۥۨ۫ۘۚۜ۬ۗۧۥۘۢۨۦۘۚ۠ۘ";
                    break;
                case -1544420005:
                    shp.f876c.remove("status_video_max_duration").apply();
                    str = "ۖۘۗۘۚ۬ۤۖۡ۬ۜ۫۠۟ۦ۬۬ۥۘ۟۟ۜۘۛۛ۬";
                    break;
                case -1104585437:
                    str = "ۗۧۨۘۗ۬ۚ۫ۙۚۤۨۘۢۦۘۘۧۢۖۘ";
                    i7 = i6;
                    break;
                case -804200431:
                    str = "ۢۗۘۘۗۨۧۡۙۚۘۛۨۘ۟ۘۡ";
                    break;
                case -662618554:
                    i2 = i7 * 1000;
                    str = "۬ۜ۬ۡۡۙۤ۠ۗۛۖۘ۟ۢۦۘۗ۫ۘۘ۟ۙۥۘ";
                    break;
                case -625523561:
                    str = "ۖۘۗۘۚ۬ۤۖۡ۬ۜ۫۠۟ۦ۬۬ۥۘ۟۟ۜۘۛۛ۬";
                    break;
                case -564723046:
                    str = "۠ۙۡۘ۟ۤۤۧۜۧۘۤۜۤۙ۟";
                    i7 = i8;
                    break;
                case -463483567:
                    i5 = 95;
                    str = "ۢۥۜۘۤۡۥۤ۠ۥ۬ۛۥۥۢۖۘۤۘ۬";
                    break;
                case -437657199:
                    str = "۫ۡۜۛۛ۬ۚ۠۫۫ۦۥۙۧۡۡۖۙۥۥ۟";
                    i4 = i5;
                    break;
                case -382878195:
                    String str2 = "ۖۚۤۖۗۨۧۥۦۘۗ۬ۤۖۛ۬";
                    while (true) {
                        switch (str2.hashCode() ^ -218468893) {
                            case -2070778580:
                                i2 = 1;
                                if (!shp.getBoolean("enable_fivminstatus", true)) {
                                    str2 = "۫۟ۤۗۡۚۢۘ۠ۖۥۧۡۗۖۘۢۘۖۘۢۗۚۧۦۦۘ";
                                    break;
                                } else {
                                    str2 = "ۗۨۧۘ۠ۗۙۙۙۜۤۤۡۥۡۥۚۗۡۘۜۢۘۘۨۚۦۤ۠ۛ";
                                    break;
                                }
                            case -1733001046:
                                str2 = "۫ۡۧۧۥۧۘ۬ۨۚۖۜۡۘۖ۟۬۬ۗۥۘۧۗۢ";
                                break;
                            case 38922107:
                                str = "۟ۧۥۘۛۦۗۢ۬۫ۨۤۡۘ۬ۙ۟ۤ۬ۨۥۘۜۘۜۛۨ";
                                continue;
                            case 563511567:
                                str = "۬ۨۡۤۦۛ۫ۛ۫ۖۛۤۥۥۚ۟ۥۖۡۜۘۜۜۘۘ";
                                continue;
                        }
                    }
                    break;
                case -288411236:
                    String str3 = "ۨۖۦۛۤ۠۫ۚۡۧۤ۠۫ۗۡۘ۟ۨۦ۬ۙ۫ۡۚ";
                    while (true) {
                        switch (str3.hashCode() ^ 1824799487) {
                            case -2065844065:
                                str = "ۢۡۜۘۤۜۥۘ۠ۜۘ۬ۡۧۘۤ۫ۡۡۡۨۧ۠";
                                continue;
                            case -277132511:
                                str = "ۦۘۖۘۦۥۡۡۧۚۜ۟ۨۤ۬";
                                continue;
                            case -175251010:
                                str3 = "ۜۜۙۜۗۥۖۖ۫ۦۨ۬ۧ۠ۖۘ۫۠";
                                break;
                            case -82972078:
                                if (i7 <= 1) {
                                    str3 = "۫ۥۘۘۡۡ۫ۨ۫ۜۘۗۢ۠ۢ۫ۨۘ";
                                    break;
                                } else {
                                    str3 = "۟۬ۡۙۖ۫ۤۗۙۧ۬ۖۚ۟۫";
                                    break;
                                }
                        }
                    }
                    break;
                case -183829451:
                    str = "ۢۗۘۘۗۨۧۡۙۚۘۛۨۘ۟ۘۡ";
                    i4 = i3;
                    break;
                case 328575625:
                    shp.setIntPriv("Img_highres_seek", 1);
                    str = "ۚ۬ۙۨۗۛۧۨۛۗۖۚ۠ۨۥ۫ۨۤۨۜۘۢۚۜ۫ۤۘ";
                    break;
                case 530459304:
                    i8 = shp.getIntPriv("Img_highres_seek");
                    str = "ۥ۠ۥۛۜۡۧ۟ۗۜۦۘۘۦۥۘۦۢۧۥۢۦۘۡۛۖ";
                    break;
                case 713145693:
                    str = "ۖ۬ۥۢۛۡۘۛۛۖۘۦ۬ۧۤۙ۟۟ۖۨۘۢۡۦۘۗۚۜۘۧۚۥ";
                    i6 = 1;
                    break;
                case 726653807:
                    String str4 = "ۤۡۛۤۙۚۧۙۖۘۘ۫ۜۤ۠ۨ";
                    while (true) {
                        switch (str4.hashCode() ^ 31102836) {
                            case -1937319221:
                                str = "ۗۧۨۘۗ۬ۚ۫ۙۚۤۨۘۢۦۘۘۧۢۖۘ";
                                continue;
                            case -685263926:
                                if (i8 != 0) {
                                    str4 = "ۨۥۧۘۙۦ۟ۡۡ۬ۧۖۛۢ۟ۜۘ۬۬ۖۘ۬ۚۛ۬ۤۥ";
                                    break;
                                } else {
                                    str4 = "۠ۜۦۡۗ۟ۢۜ۠ۙ۟ۨۘۢۛۘۘ۠ۘ۠ۧۚۥۘ۫۠ۥ";
                                    break;
                                }
                            case 1959770348:
                                str4 = "ۨۧۗۤۡۤۖۜۨ۬ۦۘۤۡۡۥۙۧۡۜۘ";
                                break;
                            case 2135963191:
                                str = "۬ۙۨۘۢ۟ۨۘۚۗۗۤ۫ۡۘ۫ۚۨۘ۠۬ۖۘ";
                                continue;
                        }
                    }
                    break;
                case 1377926181:
                    return;
                case 1753445063:
                    shp.f876c.putBoolean("status_image_compression_quality_test", false).putInt("hq_image_max_edge", i2).putInt("hq_image_quality", i4).putInt("image_max_edge", i2).putInt("image_max_kbytes", i2).putInt("image_quality", i4).putInt("status_image_quality", i4).putInt("status_image_max_edge", i2).commit();
                    str = "ۥ۟ۨۘ۫ۢۦۘۤ۟ۦۘۘۘۜۙۗۛۖۢۨۢۥۥۘۡۘۢۜۥۜۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        r0 = "ۢۡۖۘۗۙۘۘۢۢۨۘۚۡۖۨۥۗ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isAppLocked() {
        /*
            r2 = 0
            java.lang.String r0 = "ۨۜۖۘۨ۟ۜۛۜۧۘۢۜۧۘۥۙ۬ۜۖۘۡ۫ۤۢ۠ۖۘ"
            r1 = r2
            r3 = r2
        L_0x0005:
            int r4 = r0.hashCode()
            r5 = 123(0x7b, float:1.72E-43)
            r6 = -1966269231(0xffffffff8acd1cd1, float:-1.9751621E-32)
            r4 = r4 ^ r5
            r4 = r4 ^ r6
            switch(r4) {
                case -1900873982: goto L_0x0014;
                case -1713870427: goto L_0x0039;
                case -1143460407: goto L_0x006b;
                case -956521216: goto L_0x0064;
                case 812077504: goto L_0x0068;
                case 905353099: goto L_0x005d;
                case 1198735027: goto L_0x0059;
                case 2134531220: goto L_0x0061;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0005
        L_0x0014:
            r4 = -492491950(0xffffffffe2a52b52, float:-1.5234172E21)
            java.lang.String r0 = "ۡۗۥۘۗۦ۬۫ۚۜۜۡۛ۠۟ۜۖۧۜۥۛۚ"
        L_0x0019:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1345488053: goto L_0x0028;
                case 323195715: goto L_0x0036;
                case 1582107485: goto L_0x0033;
                case 2050764074: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0019
        L_0x0022:
            java.lang.String r0 = "ۢۡۖۘۗۙۘۘۢۢۨۘۚۡۖۨۥۗ"
            goto L_0x0005
        L_0x0025:
            java.lang.String r0 = "ۙ۬ۜ۠ۚۡۛ۬ۤۢۙۛ۫ۘۡۘۖۦۛ"
            goto L_0x0019
        L_0x0028:
            java.lang.String r0 = "applockV2"
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = "ۜۗۦۛۥۡۨۡۦۘۨۡ۫۫۟ۘۘ"
            goto L_0x0019
        L_0x0033:
            java.lang.String r0 = "۟۬ۦۘۦۜۖۘۙ۬۫ۜۘۡۘۢ۠ۖۗۙۚۚۙۚۢۡ۫ۡۥۚ"
            goto L_0x0019
        L_0x0036:
            java.lang.String r0 = "ۛۘۨۘۡۜۗۢ۬ۛۢۦ۫ۢۛۧ۠ۦ"
            goto L_0x0005
        L_0x0039:
            r4 = -1171725407(0xffffffffba28e3a1, float:-6.442611E-4)
            java.lang.String r0 = "ۧۡۦ۫ۛۖۙ۠ۤۙۢۜۘ۟ۥۘۗۤۡۘۡۧۧ"
        L_0x003e:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -2115279393: goto L_0x0056;
                case 726557501: goto L_0x0022;
                case 976070258: goto L_0x004d;
                case 2143284456: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x003e
        L_0x0047:
            java.lang.String r0 = "ۥۗۡۘۚ۫۫ۡ۟ۦۘۙ۠ۢۙۛۚ"
            goto L_0x003e
        L_0x004a:
            java.lang.String r0 = "ۤۘۗ۫ۛۜۘۖۡۗۖۦ۟ۚ۫ۨۘ۬۫ۧۡۜۘ۫ۡۚ"
            goto L_0x003e
        L_0x004d:
            java.lang.Class r0 = com.obwhatsapp.youbasha.ui.lockV2.LockUtils.getAppLockType()
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "ۚۤۛۘ۫۬ۤ۟ۨ۠ۙۨۘ۫ۚۘۘۢۗۡۘ"
            goto L_0x003e
        L_0x0056:
            java.lang.String r0 = "ۧۚۨۨۢۙۤۡۥۘۘۦۥۘۚۡۛ"
            goto L_0x0005
        L_0x0059:
            r3 = 1
            java.lang.String r0 = "ۘۖۨ۬۬ۦۘۘۢۖۙۜۦۘۖۢۥۘ۬۫ۤ"
            goto L_0x0005
        L_0x005d:
            java.lang.String r0 = "ۤ۠ۜۘۥۚۥۖۗۡۙۛۜۘۚۧۨۢۢ۟"
            r1 = r3
            goto L_0x0005
        L_0x0061:
            java.lang.String r0 = "ۗۘۨۘۜ۬ۡۤۥۡۘ۫۟ۥۙ۠ۗۧ۬۠۟ۤۗۛۜۙ"
            goto L_0x0005
        L_0x0064:
            java.lang.String r0 = "ۥۤۜۖۜۘۘۦۡۘۘۡۚۢۦۦۛۨۛ"
            r1 = r2
            goto L_0x0005
        L_0x0068:
            java.lang.String r0 = "ۥۤۜۖۜۘۘۦۡۘۘۡۚۢۦۦۛۨۛ"
            goto L_0x0005
        L_0x006b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.isAppLocked():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        r0 = "۫۠ۦۘ۬ۥۤۖۡۙۖۤۦۘ۬ۦۥ۠ۤۚ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
        r0 = "ۗۗۘۦۗۢۙۨۢۗۙۡۘۙۗۜۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isGroupJid(java.lang.String r7) {
        /*
            r2 = 0
            java.lang.String r0 = "ۦۨۗ۠ۦۜۘۙۛۨۘ۬ۗۦۘۖۘ۠ۥ۬ۧۘۢۡۦۨۜ"
            r1 = r2
            r3 = r2
        L_0x0005:
            int r4 = r0.hashCode()
            r5 = 206(0xce, float:2.89E-43)
            r6 = 110592267(0x697810b, float:5.69895E-35)
            r4 = r4 ^ r5
            r4 = r4 ^ r6
            switch(r4) {
                case -2024931769: goto L_0x0081;
                case -1865337017: goto L_0x005c;
                case -677808071: goto L_0x0017;
                case -367672724: goto L_0x003a;
                case 381111056: goto L_0x00d0;
                case 388669800: goto L_0x00de;
                case 962166766: goto L_0x0014;
                case 1009676573: goto L_0x00d5;
                case 1173878584: goto L_0x0085;
                case 1309699218: goto L_0x001a;
                case 1639934957: goto L_0x00a8;
                case 1650912678: goto L_0x00ad;
                case 1876315889: goto L_0x001e;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0005
        L_0x0014:
            java.lang.String r0 = "ۦۘۥۤۘۘۧۜۢۤ۟ۧ۬ۤۨۘۧۦۥۘۤۤ۬ۚۡۥ"
            goto L_0x0005
        L_0x0017:
            java.lang.String r0 = "ۥۡۘۘۘ۟ۨۘۗۚ۫۬ۖ۠ۢ۠۬۠ۡۦۖۧۡۖۦۡۘۦ۬ۜ"
            goto L_0x0005
        L_0x001a:
            java.lang.String r0 = "ۡۖۨۘۤ۠ۤۗۡۛ۬ۢۡ۠۬۫ۘ۫ۚۙۜۜ"
            r3 = r2
            goto L_0x0005
        L_0x001e:
            r4 = -987896916(0xffffffffc51de3ac, float:-2526.2295)
            java.lang.String r0 = "ۖۚ۬۫ۖ۠ۥ۠ۘۚۢۜۘۢ۠ۢ"
        L_0x0023:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1548878756: goto L_0x002c;
                case -1067689428: goto L_0x0037;
                case 1589819682: goto L_0x00da;
                case 1633223593: goto L_0x0034;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x0023
        L_0x002c:
            if (r7 == 0) goto L_0x0031
            java.lang.String r0 = "۟۠۟۟ۦۘۖۙۙ۟ۛۥۜۙۖۘ"
            goto L_0x0023
        L_0x0031:
            java.lang.String r0 = "ۥ۬ۜۦۨۥۜۛۡۖۥۜۦۦۧۘ۬۠۬"
            goto L_0x0023
        L_0x0034:
            java.lang.String r0 = "ۡۡۘۘ۫ۢۖۤۜۨ۠۬ۚۜۜۤۚۛۚۖۘۘۘۧۤۚۤۨۥۘ"
            goto L_0x0023
        L_0x0037:
            java.lang.String r0 = "۟ۢۖۘۗۢۚۜۢۦۙۘ۟۟ۦۖۘۨۘ۟ۥۦۦۗۗ"
            goto L_0x0005
        L_0x003a:
            r4 = 1446155587(0x56329543, float:4.9088536E13)
            java.lang.String r0 = "ۖ۬ۚۤۜۥۘۗۙۥۖۡۜۘۙ۟ۗۢۛۢ۬ۜۜۘۡۘۛ"
        L_0x003f:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1660604917: goto L_0x0056;
                case -1172208097: goto L_0x006a;
                case -253590561: goto L_0x0059;
                case 1250161542: goto L_0x0048;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x003f
        L_0x0048:
            java.lang.String r0 = "-"
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L_0x0053
            java.lang.String r0 = "ۘۢۡۘۙۙۖۡۜۧۛۡۥۤۡۥۧۧۨ"
            goto L_0x003f
        L_0x0053:
            java.lang.String r0 = "ۘۤ۠ۧ۠۟ۧۙۜۘۧۨۘۘ۟ۚ۬ۘۨۜۘۧۢۥۘۙۚۧ"
            goto L_0x003f
        L_0x0056:
            java.lang.String r0 = "ۢ۬ۤۗۙۨۜۙۘۘۘ۫۟ۗۚۙ۫ۙۡۜۘ"
            goto L_0x003f
        L_0x0059:
            java.lang.String r0 = "ۖۖۤۦۚۢۜۛۛۘۥۜۘۛ۬ۡۗۜۢ۬ۢۨۘۗۥ۠ۛۗۢ"
            goto L_0x0005
        L_0x005c:
            r4 = 1677575041(0x63fdc381, float:9.3622276E21)
            java.lang.String r0 = "ۛۤۡۢ۟ۗۙۛۦ۟۬ۨۛۢۡۛۜۘۢۖ۠ۘۨۘ"
        L_0x0061:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -609584887: goto L_0x006a;
                case -415170157: goto L_0x0070;
                case 655249857: goto L_0x007b;
                case 1366074793: goto L_0x007e;
                default: goto L_0x0069;
            }
        L_0x0069:
            goto L_0x0061
        L_0x006a:
            java.lang.String r0 = "۫۠ۦۘ۬ۥۤۖۡۙۖۤۦۘ۬ۦۥ۠ۤۚ"
            goto L_0x0005
        L_0x006d:
            java.lang.String r0 = "ۜ۬ۚۘۚۖۘ۫ۘۜۘۡۤۨ۫ۛۚۢۘۧۢۙۦۘۦ۫۫"
            goto L_0x0061
        L_0x0070:
            java.lang.String r0 = "@g.us"
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = "ۢۤۧۥۘۗۦۡۗۜ۠۠ۦۧ"
            goto L_0x0061
        L_0x007b:
            java.lang.String r0 = "۠ۧۜ۠ۜۦ۬ۦۨۘۧۦۛۗ۫ۘۚۗ۬"
            goto L_0x0061
        L_0x007e:
            java.lang.String r0 = "ۨۗۧۤ۠ۙۜۥۧۘۢۖۧۘ۬۠ۨۘۜ۠ۗ۫۠ۥۖۗۜۘ"
            goto L_0x0005
        L_0x0081:
            java.lang.String r0 = "ۥ۬ۜۘۡۚ۫ۥۜۦۘۜۡۦۘۚ۟ۡۘۥۜ۟"
            r3 = r2
            goto L_0x0005
        L_0x0085:
            r4 = -382422535(0xffffffffe934b1f9, float:-1.3652944E25)
            java.lang.String r0 = "۟۬ۦۘۛۦۤۦ۟ۤ۬ۘۥۘۢۨۦۘۧ۠ۙۜۚ۬ۜۥۦۘ"
        L_0x008a:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1505710090: goto L_0x00da;
                case -1165245176: goto L_0x009a;
                case -43478098: goto L_0x0093;
                case 1205016314: goto L_0x00a5;
                default: goto L_0x0092;
            }
        L_0x0092:
            goto L_0x008a
        L_0x0093:
            java.lang.String r0 = "۠ۨۜۤ۫ۛۖۖۘۦۖۢۗ۠ۤۧۦۖۘۛۡۘۘ"
            goto L_0x0005
        L_0x0097:
            java.lang.String r0 = "۫۟ۢ۠ۧۡۘۗۗۧۘۜ۫ۡۖۤۧۢۨ۫ۥ۠۫ۜۥۤۗۚ"
            goto L_0x008a
        L_0x009a:
            java.lang.String r0 = "@"
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L_0x0097
            java.lang.String r0 = "۫ۖۜ۬ۢۢ۫ۙۨۘۖۤۢ۫ۨۙۜۨۖۘۛۨ۟"
            goto L_0x008a
        L_0x00a5:
            java.lang.String r0 = "ۥۤۘۘۥۨۡۨۧۘۧۗۡۘۖۡۘ۠۬ۖۚۗۜۘ"
            goto L_0x008a
        L_0x00a8:
            java.lang.String r0 = "ۦ۟ۡۖ۫ۡۘۤۜۘۚۦ۬۟ۜۧۘۚۙ۟ۖۛ"
            r3 = r2
            goto L_0x0005
        L_0x00ad:
            r4 = 61261571(0x3a6c703, float:9.802294E-37)
            java.lang.String r0 = "ۢۡ۠ۘۖۚ۟۫۟۠ۜ۬ۧۤۡۘ"
        L_0x00b2:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -948365579: goto L_0x00cc;
                case 1250103841: goto L_0x00da;
                case 1423609615: goto L_0x00c1;
                case 2107605523: goto L_0x00bb;
                default: goto L_0x00ba;
            }
        L_0x00ba:
            goto L_0x00b2
        L_0x00bb:
            java.lang.String r0 = "ۧۢۘۢۢۜۘۖ۟ۨۜۤۖۘۚۚۛۦۤۛۢ۠۫ۖۜۗۘۜۜۘ"
            goto L_0x00b2
        L_0x00be:
            java.lang.String r0 = "ۨ۠ۢۧۦۘ۬۫۟ۧ۫ۨۘۤ۟ۢ"
            goto L_0x00b2
        L_0x00c1:
            int r0 = r7.length()
            r5 = 16
            if (r0 <= r5) goto L_0x00be
            java.lang.String r0 = "ۡۜۡۗۘۧۜ۠ۘۘۗۢۚۦۚۥۖ۠"
            goto L_0x00b2
        L_0x00cc:
            java.lang.String r0 = "۫۠ۦۘ۬ۥۤۖۡۙۖۤۦۘ۬ۦۥ۠ۤۚ"
            goto L_0x0005
        L_0x00d0:
            r1 = 1
            java.lang.String r0 = "ۥ۫ۚۨ۬۟ۨۘۘۘۙۥۤۢۗۖۦۘۖۙۜۖۢ۫"
            goto L_0x0005
        L_0x00d5:
            java.lang.String r0 = "ۗۗۘۦۗۢۙۨۢۗۙۡۘۙۗۜۘ"
            r3 = r1
            goto L_0x0005
        L_0x00da:
            java.lang.String r0 = "ۗۗۘۦۗۢۙۨۢۗۙۡۘۙۗۜۘ"
            goto L_0x0005
        L_0x00de:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.isGroupJid(java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isGrpSeparateEnabled() {
        /*
            java.lang.String r0 = "۠ۙۢۡ۫ۦۘۚۧۗۖۛۙۤۗۛۛۙۜۥۖۖۢۙۦۘۥۢۤ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 146(0x92, float:2.05E-43)
            r3 = -704647126(0xffffffffd5fff02a, float:-3.51758702E13)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1702662714: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "enable_grp_separationV2"
            r1 = 1
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.isGrpSeparateEnabled():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isNightModeActive() {
        /*
            r7 = 1
            r2 = 0
            r6 = 0
            java.lang.String r0 = "ۜۜۖۘۙۡۧۘ۫ۧۤۛۖۘۦۘۥۗۢ۬ۡ۬ۜۘۦۘ"
            r1 = r2
            r3 = r2
            r4 = r2
            r5 = r6
            r8 = r6
            r9 = r6
            r10 = r2
        L_0x000c:
            int r2 = r0.hashCode()
            r11 = 439(0x1b7, float:6.15E-43)
            r12 = 678155190(0x286bd3b6, float:1.3091028E-14)
            r2 = r2 ^ r11
            r2 = r2 ^ r12
            switch(r2) {
                case -2030849021: goto L_0x00ce;
                case -1902325168: goto L_0x004a;
                case -1898340286: goto L_0x00c9;
                case -1847449013: goto L_0x002e;
                case -1431769586: goto L_0x010e;
                case -1131223439: goto L_0x004e;
                case -1029296885: goto L_0x010a;
                case -680847970: goto L_0x00d3;
                case -605134754: goto L_0x006a;
                case -403123792: goto L_0x0099;
                case -338835524: goto L_0x008f;
                case -290918529: goto L_0x010a;
                case -126777123: goto L_0x00bc;
                case 610353695: goto L_0x008a;
                case 757079862: goto L_0x001b;
                case 964198542: goto L_0x0094;
                case 1056971041: goto L_0x0078;
                case 1086388850: goto L_0x0021;
                case 1455422510: goto L_0x00c1;
                case 1646126489: goto L_0x0024;
                case 1685381460: goto L_0x009f;
                case 1730729803: goto L_0x0106;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x000c
        L_0x001b:
            android.content.SharedPreferences r2 = com.obwhatsapp.yo.shp.stockPrefsLight
            java.lang.String r0 = "۟ۚۙۧ۟ۛ۫ۢۨۘۢۗۨ۠۬۫۫ۜۥۘۤ۫ۨۘ"
            r10 = r2
            goto L_0x000c
        L_0x0021:
            java.lang.String r0 = "ۛۙۘۚۦۨۘۢۚۜۤ۠ۘۙ۫ۚ۬ۙۧۥۛۦۜۙۥۛۤۡۘ"
            goto L_0x000c
        L_0x0024:
            java.lang.String r0 = "night_mode"
            int r2 = r10.getInt(r0, r6)
            java.lang.String r0 = "۠ۙۥۦۧۢۧۡۧۛۥۘۚ۬ۦ۠ۘ۠"
            r9 = r2
            goto L_0x000c
        L_0x002e:
            r2 = 1149265928(0x44806808, float:1027.251)
            java.lang.String r0 = "ۛۗ۠ۧۚۛۥۦۖۡۧۙۘۦۡۚۢۖۘۤۗۘۘۧۚۥ"
        L_0x0033:
            int r11 = r0.hashCode()
            r11 = r11 ^ r2
            switch(r11) {
                case -1796247668: goto L_0x0042;
                case -1753173582: goto L_0x0047;
                case -1252649166: goto L_0x003c;
                case -643369780: goto L_0x00fe;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x0033
        L_0x003c:
            java.lang.String r0 = "ۘۛۦۘۙۘۨۘۖۚۘۘۧۡ۬ۤۗ۫۬ۜۜۘ"
            goto L_0x0033
        L_0x003f:
            java.lang.String r0 = "ۚ۬۫۠ۚۢۘۦۧۗۡ۫ۘۥ"
            goto L_0x0033
        L_0x0042:
            if (r9 == 0) goto L_0x003f
            java.lang.String r0 = "۠ۢۨۦ۫ۨۢۙۤۖۗۧۨۨۡۘۦۗۜۘ"
            goto L_0x0033
        L_0x0047:
            java.lang.String r0 = "ۙۡۧۘۘ۟۟ۥ۬ۤ۬ۗۥۘۦۜۦۥۡ۬۬ۛ۬ۛۨ۟"
            goto L_0x000c
        L_0x004a:
            java.lang.String r0 = "ۡۨۤۧۤۖۜ۠ۜۙۚ۬ۖۨۜۜۘ۫ۛۗ"
            r8 = r6
            goto L_0x000c
        L_0x004e:
            r2 = 1419555052(0x549cb0ec, float:5.3838652E12)
            java.lang.String r0 = "۫ۦۖۘۚ۠ۦۦۤۡۘۢۖ۠ۥ۬ۖۘۚۖۥۘۙ۠ۚ۠۟ۡ"
        L_0x0053:
            int r11 = r0.hashCode()
            r11 = r11 ^ r2
            switch(r11) {
                case -2052619302: goto L_0x010a;
                case -1433599569: goto L_0x005c;
                case -486695337: goto L_0x0062;
                case 1568200781: goto L_0x0067;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x0053
        L_0x005c:
            java.lang.String r0 = "ۘۛۖۚ۟ۛۡۘۛ۫ۡۜۛۦۘ۫ۖۜۘۜۥۗ"
            goto L_0x000c
        L_0x005f:
            java.lang.String r0 = "ۖ۟۬ۗۢۨۥۛۚ۠ۢۨۘۢۨۙۡۤۚۨۜۙۗۨ"
            goto L_0x0053
        L_0x0062:
            if (r9 == r7) goto L_0x005f
            java.lang.String r0 = "ۗۡۢ۫ۙۚۢۥۥۡۗۚۢ۫۠"
            goto L_0x0053
        L_0x0067:
            java.lang.String r0 = "ۥۢۘۛ۠ۡۢۚۙۖۡۦۘۘ۟ۧ"
            goto L_0x0053
        L_0x006a:
            r2 = -1958629334(0xffffffff8b41b02a, float:-3.730298E-32)
            java.lang.String r0 = "ۛۚۢۚ۫ۥۘۛۛۦۘۘۡۘۘۘ"
        L_0x006f:
            int r11 = r0.hashCode()
            r11 = r11 ^ r2
            switch(r11) {
                case -2012281444: goto L_0x007e;
                case -988911009: goto L_0x0087;
                case 428436142: goto L_0x0084;
                case 1933864237: goto L_0x0078;
                default: goto L_0x0077;
            }
        L_0x0077:
            goto L_0x006f
        L_0x0078:
            java.lang.String r0 = "ۢۥۥۘ۠۟ۘۘۥ۠ۧۚۜۖۤۢۘ"
            goto L_0x000c
        L_0x007b:
            java.lang.String r0 = "ۜۦۖۘۘۚۜۘۡۧ۫ۜ۬ۡۘ۟ۖ۠"
            goto L_0x006f
        L_0x007e:
            r0 = 2
            if (r9 == r0) goto L_0x007b
            java.lang.String r0 = "ۖ۠ۥۘۢ۬ۖۖۜۖ۬ۢۗۚ۠ۨۦۧۧ"
            goto L_0x006f
        L_0x0084:
            java.lang.String r0 = "ۡۜۡۢۘۛۚۗۚۥۗۥۙۜۨۘۘۢۙ۫ۘۙۚ"
            goto L_0x006f
        L_0x0087:
            java.lang.String r0 = "ۧۛۦۘۚ۬ۥۘۤۤ۠ۖ۟ۖ۟ۦ۠۫ۧۘۘ۠ۘۗۡۚۙ"
            goto L_0x000c
        L_0x008a:
            java.lang.String r0 = "ۙۢۥۘ۠۬ۦۘۡۦۧۗ۠ۖۤۛۦ"
            r8 = r6
            goto L_0x000c
        L_0x008f:
            java.lang.String r0 = "۠ۥ۬۬ۡ۠ۥۚۡ۫ۥۡۡۦۦ۫ۘۘۘ"
            r5 = r7
            goto L_0x000c
        L_0x0094:
            java.lang.String r0 = "ۧ۟ۖۖۦۛۨۜۘۙۥ۟۠ۢۥۘۨۢۥۘ"
            r8 = r5
            goto L_0x000c
        L_0x0099:
            com.obwhatsapp.HomeActivity r4 = Homeac
            java.lang.String r0 = "ۦۥ۟ۜۘ۠ۧ۠ۗ۠۬ۡۘۡۥۘۘۘۨۧۘۧۤۨۘۙۜۧ"
            goto L_0x000c
        L_0x009f:
            r2 = -363032908(0xffffffffea5c8eb4, float:-6.6659394E25)
            java.lang.String r0 = "۫ۨۦۙۡۨۤۘۡۘ۫ۥۙۗۧۜۘۧۤۖ"
        L_0x00a4:
            int r11 = r0.hashCode()
            r11 = r11 ^ r2
            switch(r11) {
                case 20745703: goto L_0x0102;
                case 1654344510: goto L_0x00b5;
                case 1672619244: goto L_0x00b8;
                case 1715177508: goto L_0x00ad;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            goto L_0x00a4
        L_0x00ad:
            if (r4 == 0) goto L_0x00b2
            java.lang.String r0 = "ۤۦۥۚ۫۫ۖۦۜۙۥۦۢ۟۬"
            goto L_0x00a4
        L_0x00b2:
            java.lang.String r0 = "۠۬ۖ۫ۜۡۘۢۗۗۜ۬۠ۖ۟ۤ۬ۖۘ"
            goto L_0x00a4
        L_0x00b5:
            java.lang.String r0 = "۠۟ۧ۬ۤۖۘۘۡۛۢۛۡ۬ۗۢۛۛۗ"
            goto L_0x00a4
        L_0x00b8:
            java.lang.String r0 = "۬ۨۧۘ۠ۘۖۡۥۦۘ۫ۖ۫۫ۚۨۘۜۧۧۨۨ۠ۛۛۘۘ"
            goto L_0x000c
        L_0x00bc:
            java.lang.String r0 = "ۙۦ۠ۢۗۨۘ۬ۛۚۧۘ۠ۨ۠ۘۘۤۚۛۜۨۧ"
            r3 = r4
            goto L_0x000c
        L_0x00c1:
            android.content.Context r1 = getCtx()
            java.lang.String r0 = "ۢ۠ۤۤۙۤۦۜۚۨۗۜۙ۬ۨ"
            goto L_0x000c
        L_0x00c9:
            java.lang.String r0 = "۠ۤۢ۫ۨۗۨۡۘۤۨۨۘۛ۠ۢۥۙۢۙۥۜ۫ۢۖ۠ۘۥۘ"
            r3 = r1
            goto L_0x000c
        L_0x00ce:
            java.lang.String r0 = "ۨۗۦ۠ۗۦۙۢۗۖۘۖۤۤۙۧۥۘ"
            r8 = r6
            goto L_0x000c
        L_0x00d3:
            r2 = 743955075(0x2c57da83, float:3.0674636E-12)
            java.lang.String r0 = "ۨۙۧۤ۬ۙۨ۠۫ۨۡۨۘۜ۬ۘ۟ۛ۫ۤ۠ۦۘۥۧۨۖ۬ۥۘ"
        L_0x00d8:
            int r11 = r0.hashCode()
            r11 = r11 ^ r2
            switch(r11) {
                case -2041752088: goto L_0x010a;
                case -501767878: goto L_0x00e7;
                case 1031499915: goto L_0x00e1;
                case 1034821355: goto L_0x00fa;
                default: goto L_0x00e0;
            }
        L_0x00e0:
            goto L_0x00d8
        L_0x00e1:
            java.lang.String r0 = "۫ۡۧۘۦۙۖۘۚۨۥ۫ۘۨۘۛۗۗۗ۟ۧۨۡ۫ۦۘۧۛ۬ۘ"
            goto L_0x00d8
        L_0x00e4:
            java.lang.String r0 = "ۤۧۜۘۗۙۗۥۙ۠ۨۧۙ۬ۜ۟"
            goto L_0x00d8
        L_0x00e7:
            android.content.res.Resources r0 = r3.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r11 = 32
            if (r0 != r11) goto L_0x00e4
            java.lang.String r0 = "ۙۙۨۘۘۙۤۖۡۚۙۖۛ۠ۖۤۢ۟ۨۗۨۘ"
            goto L_0x00d8
        L_0x00fa:
            java.lang.String r0 = "ۖۧۖۙۦۖ۬ۧۗ۫۫ۡ۠ۗۤۨۢۖۘ"
            goto L_0x000c
        L_0x00fe:
            java.lang.String r0 = "ۗۙۨۖۜۚ۠ۛ۫۠ۢ۠ۧۜۘۘ"
            goto L_0x000c
        L_0x0102:
            java.lang.String r0 = "ۛۜۦ۬ۚۜۘۚۢۚ۠ۗۨۘۗۛۥۛۨۥۘۨۤۜۘ"
            goto L_0x000c
        L_0x0106:
            java.lang.String r0 = "۠ۤۢ۫ۨۗۨۡۘۤۨۨۘۛ۠ۢۥۙۢۙۥۜ۫ۢۖ۠ۘۥۘ"
            goto L_0x000c
        L_0x010a:
            java.lang.String r0 = "ۘ۫ۨ۠ۢۦۢۙۖ۬ۜۛ۟ۦۚۜ۟ۗۗۥۨۤۤۚۥۙ۟"
            goto L_0x000c
        L_0x010e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.isNightModeActive():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isPrivOnly() {
        /*
            java.lang.String r0 = "ۜۨۥۨۡۨۙۛ۟ۚ۟ۢۜۤۜۦۚۘۥۡۘۡ۠ۦۘۨۚۨۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 812(0x32c, float:1.138E-42)
            r3 = -89108160(0xfffffffffab05140, float:-4.577461E35)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -937860603: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "isPrivOnly"
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.isPrivOnly():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isSwipeEnabled() {
        /*
            java.lang.String r0 = "ۨۨۗۤۦۦۙۨۡۖۙۘۙ۬ۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 909(0x38d, float:1.274E-42)
            r3 = 1098593221(0x417b33c5, float:15.700139)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1771428099: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "isSwipeEnabledV2"
            r1 = 0
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.isSwipeEnabled():boolean");
    }

    public static void l() {
        boolean booleanPriv = shp.getBooleanPriv(hideJidCode + "_shownotif");
        boolean booleanPriv2 = shp.getBooleanPriv(hideJidCode + "_animatehome", true);
        boolean booleanPriv3 = shp.getBooleanPriv(hideJidCode + "_playsound");
        boolean booleanPriv4 = shp.getBooleanPriv(hideJidCode + "_vibrate");
        String str = "۠۟ۘۘۚۚۦۨۨ۟ۖۥۚ۟۠ۖۥ";
        while (true) {
            switch (str.hashCode() ^ -2051850533) {
                case -733746994:
                    YoHiddenService.A00(getCtx());
                    break;
                case 25718357:
                    str = "ۘۛ۬ۧۦۖۘۤۗۦۘۚ۬ۜۘۨۡ۫";
                    continue;
                case 1561571768:
                    if (!booleanPriv) {
                        str = "ۥۖۦۖۗۜۘۧۗۥۘ۫۠ۦ۠ۚۨۘۚۧۜۘۢۧ۫ۘۡۚ";
                        break;
                    } else {
                        str = "ۘۘۚۡۢ۬۫ۡۥۘۚۧۦۘۡ۬ۗۖۡۗۥۙۜۘۜۜۗ";
                        continue;
                    }
                case 1912963969:
                    break;
            }
        }
        String str2 = "ۥۘ۬ۡۜ۫ۢۥۡۗۛۜۘ۫ۖۦۢۜۧۘ";
        while (true) {
            switch (str2.hashCode() ^ 663924973) {
                case -1533691693:
                    B = false;
                    break;
                case -695611502:
                    if (booleanPriv2) {
                        str2 = "۫ۙۨۧۚۦ۠ۥۥۖۥۛۚ۟ۧ۬ۖۜ";
                        break;
                    } else {
                        str2 = "ۨۙۡۘۨۦ۠۫۠ۚۦ۠ۦۥۨۘ۫ۤۖۧ۫ۗۜۛۜۘ۠ۤۧ";
                        continue;
                    }
                case 2027335987:
                    break;
                case 2120243480:
                    str2 = "ۖۜۧۘۖۜ۠ۜۘۘۘۦۦۨۗۛۡۛۡۘ";
                    continue;
            }
        }
        String str3 = "ۛۗۜ۠ۤۜۘۜۤۦۡۜۧۚ۬۫ۢۜۚ";
        while (true) {
            switch (str3.hashCode() ^ -138737428) {
                case -1725659769:
                    str3 = "ۛۜۢۘۙۦۘۗۨۘۡ۟ۜۖۧۚ۬ۜۗ۟۫ۧۗ۫ۚ۟۬ۚ";
                    continue;
                case -803195051:
                    String str4 = "۫ۛۦۘۙ۠ۖۘ۬ۙ۬ۛۡۘۛۤۙ";
                    while (true) {
                        try {
                            switch (str4.hashCode() ^ 1590940908) {
                                case -680216672:
                                    D = RingtoneManager.getRingtone(getCtx(), RingtoneManager.getDefaultUri(2));
                                    break;
                                case -476113186:
                                    if (D != null) {
                                        str4 = "ۚۘۡۘۡۖۦۘۧۡۖۙۚۚ۠ۨۡۘۖۙۥۛۙۥۘۥۚۖۜۗۙ";
                                        break;
                                    } else {
                                        str4 = "ۛۙۧۛۜۢۚۗۤۦۤۖۘۛ۠ۨ";
                                        continue;
                                    }
                                case -120115020:
                                    break;
                                case 2133455960:
                                    str4 = "ۢۘۗۧ۟ۦۗۜ۫ۙۚۦۡۜۘۘۧۖۤۥۧۜ";
                                    continue;
                                default:
                                    continue;
                            }
                        } catch (Exception e2) {
                            break;
                        }
                    }
                    D.play();
                    break;
                case -792629136:
                    break;
                case 93585817:
                    if (booleanPriv3) {
                        str3 = "ۥۦۥۘۦۙۤۥۖۖۘ۬ۗۡۘۧ۠ۖ";
                        break;
                    } else {
                        str3 = "ۦۖ۫۠۠ۗ۟ۙۗ۬ۖۜۘۧۗۛ۫ۧۜۘ";
                        continue;
                    }
            }
        }
        String str5 = "۟ۡۡۧ۟ۡۘۚۗۦۘۦۥۦۢ۬ۖۧ۠ۤۗۦۗۙۛۘۘۖۙ۫";
        while (true) {
            switch (str5.hashCode() ^ -1511985750) {
                case -1117149392:
                    return;
                case 671323969:
                    String str6 = "ۢ۟ۘۘۨۨۜۘۖۖۨۘۤۘۢ۠ۧۦۘۢۛۤۧۚۥۧ۬ۗ";
                    while (true) {
                        switch (str6.hashCode() ^ -512264772) {
                            case -2102115023:
                                if (C == null) {
                                    str6 = "ۧۤۘۘۚۡ۠ۚ۫ۤۨۧۦ۬ۖۤ۟۬ۛ";
                                    break;
                                } else {
                                    str6 = "۟ۢۥۘۢۘۗۘ۟۠ۗۖۨۡۘۘۚۖۧ۫ۦۘۦۧۥ";
                                    continue;
                                }
                            case -976202440:
                                str6 = "ۦۖۡۘۥۙۛ۫ۤ۬ۢۜ۟۠ۨۘۨ۟ۗ";
                                continue;
                            case -807694882:
                                C = (Vibrator) getCtx().getSystemService("vibrator");
                                break;
                            case 893143504:
                                break;
                        }
                    }
                    String str7 = "ۜۢۗۖۚۗۡۘۡۘ۫ۖۢۖۢۨۘۡ۠";
                    while (true) {
                        switch (str7.hashCode() ^ -1418594533) {
                            case -1922007076:
                                return;
                            case -56078759:
                                if (!C.hasVibrator()) {
                                    str7 = "۬ۢۛ۫۟ۚۖۘۡۘۘۢۜۜ۫";
                                    break;
                                } else {
                                    str7 = "ۙۧۤ۬ۥۤۧۖۘ۠۠۟ۨۖۛۤۜۢۘۜۘۘۚ۫ۨ";
                                    break;
                                }
                            case 1243214477:
                                C.vibrate(new long[]{0, 250, 250, 250}, -1);
                                return;
                            case 1822043120:
                                str7 = "ۤۥۥۘۖۘ۫۟ۢ۠ۜ۫ۙۤ۟ۡۘۨۢۦۘۚۚۖ";
                                break;
                        }
                    }
                    break;
                case 1304892976:
                    str5 = "ۛۢ۟ۦۧۖۦۤۘۖۧۤۙۜۜۘۡۤۦۘۤۨۙ";
                    break;
                case 1581155629:
                    if (!booleanPriv4) {
                        str5 = "۠ۚۖۘ۬ۙۨۘۗۘۦۘ۠ۜۘۛۥۘۧۛۡ۬ۧۤ";
                        break;
                    } else {
                        str5 = "۬ۗۦۘۥۡ۟ۢۜۜۖۙۙۚۨۦۘ";
                        break;
                    }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ec, code lost:
        r1 = "۬ۖۨ۬ۨۜۘ۫ۤۗۤۚۤ۠۬ۦۡۦۦۜۧۜۘۛۖ۬";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m() {
        /*
            r3 = 0
            java.lang.String r0 = "ۗ۬ۨۘۨۥ۟۬ۖۚۛۤۢ۟ۨۜۛۤۙۤ۠ۜۘۘۥۘ"
            r1 = r0
            r2 = r3
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
        L_0x000a:
            int r0 = r1.hashCode()
            r9 = 753(0x2f1, float:1.055E-42)
            r10 = -2104795554(0xffffffff828b5e5e, float:-2.0478378E-37)
            r0 = r0 ^ r9
            r0 = r0 ^ r10
            switch(r0) {
                case -2100205799: goto L_0x006e;
                case -1896520001: goto L_0x0019;
                case -1536068209: goto L_0x0034;
                case -1151962478: goto L_0x00b1;
                case -764781848: goto L_0x008b;
                case -184595517: goto L_0x00a6;
                case -183541774: goto L_0x0093;
                case 97213439: goto L_0x0049;
                case 225898780: goto L_0x00de;
                case 303919133: goto L_0x002b;
                case 580573484: goto L_0x0022;
                case 959425032: goto L_0x00fb;
                case 970599063: goto L_0x0066;
                case 994689970: goto L_0x009a;
                case 1114202469: goto L_0x00f1;
                case 1248728604: goto L_0x00d3;
                case 1811939414: goto L_0x0040;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x000a
        L_0x0019:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "۬ۢ۟ۛۧۨۚۢۖۙۜۙۡۜ۟ۚۚ۬"
            r1 = r0
            goto L_0x000a
        L_0x0022:
            java.lang.String r0 = hideJidCode
            r8.append(r0)
            java.lang.String r0 = "۟ۜۧۥۥۥۤ۬ۜۘۢ۠ۦۚ۫ۥۘ۟ۧۤ۫۠ۦۗۧ"
            r1 = r0
            goto L_0x000a
        L_0x002b:
            java.lang.String r0 = "_lockedlist"
            r8.append(r0)
            java.lang.String r0 = "ۢ۠ۛۜۦۜ۠ۧۜۚۡۜۘۦۨ۠ۤۤۖ۠ۥ۠"
            r1 = r0
            goto L_0x000a
        L_0x0034:
            java.lang.String r0 = r8.toString()
            java.lang.String r7 = com.obwhatsapp.yo.shp.getStringPriv(r0, r3)
            java.lang.String r0 = "ۚۗۘۘۧۙۦۛۛ۠ۨۥۘ۟ۧ۬ۨۙۜ"
            r1 = r0
            goto L_0x000a
        L_0x0040:
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            java.lang.String r0 = "ۙۦۧۗۚ۠۠ۤۥۥۛ۟۫ۦۙۛۤ۬"
            r1 = r0
            goto L_0x000a
        L_0x0049:
            r1 = -1208063957(0xffffffffb7fe682b, float:-3.0327667E-5)
            java.lang.String r0 = "۠۫ۛۜۥۛۖۚۤۥۚۨۦۥۦۘۜۥۘۦ۟ۡ"
        L_0x004e:
            int r9 = r0.hashCode()
            r9 = r9 ^ r1
            switch(r9) {
                case -1674584660: goto L_0x0063;
                case -1100583117: goto L_0x00ec;
                case 6902754: goto L_0x0057;
                case 837867028: goto L_0x005e;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x004e
        L_0x0057:
            java.lang.String r0 = "ۜۡۚۧۗۥۘۛۡۦۘۧۘۜۦۘۙۛۧ"
            r1 = r0
            goto L_0x000a
        L_0x005b:
            java.lang.String r0 = "ۘۨ۠ۨ۠ۨۧۖۘۘۛۗۖۘۢۧۢ۬ۗۢ۫ۚۛ۠ۜۡۘ"
            goto L_0x004e
        L_0x005e:
            if (r7 == 0) goto L_0x005b
            java.lang.String r0 = "۠۠ۖۘۜ۫ۢۦۨۧۘۗۨۜ۫ۚۗۢ۟ۨۗ۠۬ۡۚۛۨۦ"
            goto L_0x004e
        L_0x0063:
            java.lang.String r0 = "ۘۨۜۤ۫ۚۤۨۡۗۙۜۜۚ۫"
            goto L_0x004e
        L_0x0066:
            java.util.HashSet r5 = com.obwhatsapp.youbasha.task.utils.StringToHashSet(r7)
            java.lang.String r0 = "۬ۨۜۘۜۥۘۥۡۥۦ۬ۗۜۙۦۛۛۖ۟ۤۨۘ۬۟ۖۘ"
            r1 = r0
            goto L_0x000a
        L_0x006e:
            r1 = -961636238(0xffffffffc6ae9872, float:-22348.223)
            java.lang.String r0 = "ۚ۫ۨۘۡۦۘۘۛۘۙۚۜ۠۟۠ۦۦۥۘۜۘ۬ۨۥۦ"
        L_0x0073:
            int r9 = r0.hashCode()
            r9 = r9 ^ r1
            switch(r9) {
                case -1675567570: goto L_0x007c;
                case -312644089: goto L_0x0083;
                case 217812294: goto L_0x00ec;
                case 1189593026: goto L_0x0088;
                default: goto L_0x007b;
            }
        L_0x007b:
            goto L_0x0073
        L_0x007c:
            java.lang.String r0 = "ۗۙۢۥۚۦۡۡۘۛۛۛۘ۫۬ۘۥ۟ۘ۠ۙ۫ۧۡۖۦۘ"
            r1 = r0
            goto L_0x000a
        L_0x0080:
            java.lang.String r0 = "۠ۙ۠۫۠۠ۚ۬ۡ۠ۖۘۚۚۦۘۨۗۥۦۨۦۚۥۤۖ"
            goto L_0x0073
        L_0x0083:
            if (r5 == 0) goto L_0x0080
            java.lang.String r0 = "۟ۘۖ۬ۘۢۗۗۦۘۚۙ۟ۜۥۥۛۤ۠"
            goto L_0x0073
        L_0x0088:
            java.lang.String r0 = "ۗ۬ۡۚۢ۫ۡۨۥۘۗۡۨۗ۟ۡۗۛۦۘۘۧ۫ۘۘۖۘ"
            goto L_0x0073
        L_0x008b:
            r6.addAll(r5)
            java.lang.String r0 = "۬ۖۨ۬ۨۜۘ۫ۤۗۤۚۤ۠۬ۦۡۦۦۜۧۜۘۛۖ۬"
            r1 = r0
            goto L_0x000a
        L_0x0093:
            f128t = r6
            java.lang.String r0 = "۬ۛۢۛۜ۟ۤۧۨۤۨۚۘ۫ۡۨ۠ۘۘ۟ۡۥۘۢۥ۟"
            r1 = r0
            goto L_0x000a
        L_0x009a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            f129u = r0
            java.lang.String r0 = "ۘۧۦۛۦ۠۠ۙۖۚ۟ۖۘ۬ۤۦ۟ۙۦۘۡۚۙ"
            r1 = r0
            goto L_0x000a
        L_0x00a6:
            java.util.LinkedHashSet r0 = f128t
            java.util.Iterator r4 = r0.iterator()
            java.lang.String r0 = "ۥۖ۬ۡ۬ۗ۠ۙۥۘۗ۬ۨۘۛۖۘۘ"
            r1 = r0
            goto L_0x000a
        L_0x00b1:
            r1 = -576255367(0xffffffffdda70a79, float:-1.50457075E18)
            java.lang.String r0 = "ۡ۬ۤ۠ۜۥ۫ۦۧۘۧۘۘۘۦۥۘۨۚۚۨۦۧۘۥ"
        L_0x00b6:
            int r9 = r0.hashCode()
            r9 = r9 ^ r1
            switch(r9) {
                case -1527133437: goto L_0x00bf;
                case 244399189: goto L_0x00ce;
                case 748775644: goto L_0x00f6;
                case 1018773740: goto L_0x00cb;
                default: goto L_0x00be;
            }
        L_0x00be:
            goto L_0x00b6
        L_0x00bf:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00c8
            java.lang.String r0 = "۠ۗ۠ۢۖۢۗ۬ۦ۬ۖۙۢۥۛ"
            goto L_0x00b6
        L_0x00c8:
            java.lang.String r0 = "ۧۙۛۤۗۖۧۤۥۢ۫ۜۜۘۨۘۘۢۥۖۛۘۙۧۦۖۙۥۘ"
            goto L_0x00b6
        L_0x00cb:
            java.lang.String r0 = "ۘۤۜۤۚۥۘۤ۟ۗ۫ۢۙ۫ۥۡۡ۬ۘۘۜۜۥۨۧۨۗ۠۬"
            goto L_0x00b6
        L_0x00ce:
            java.lang.String r0 = "۠ۛۛۨۤۨۡۙۦۧۗۦۤ۫ۜۚۚۘۥۛ۠"
            r1 = r0
            goto L_0x000a
        L_0x00d3:
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "ۘۤ۟ۚ۫ۖۘ۠ۡۦۘۧۙ۠۬ۨۛ۫ۜۤۨ۟ۙ۫ۘۙ"
            r2 = r0
            goto L_0x000a
        L_0x00de:
            java.util.ArrayList r0 = f129u
            X.0rv r1 = com.obwhatsapp.yo.dep.gen_b(r2)
            r0.add(r1)
            java.lang.String r0 = "ۥۢۚ۟ۚۧۡۘۦۘۙۚۜۘۚ۫ۦۗۨۛ"
            r1 = r0
            goto L_0x000a
        L_0x00ec:
            java.lang.String r0 = "۬ۖۨ۬ۨۜۘ۫ۤۗۤۚۤ۠۬ۦۡۦۦۜۧۜۘۛۖ۬"
            r1 = r0
            goto L_0x000a
        L_0x00f1:
            java.lang.String r0 = "ۥۖ۬ۡ۬ۗ۠ۙۥۘۗ۬ۨۘۛۖۘۘ"
            r1 = r0
            goto L_0x000a
        L_0x00f6:
            java.lang.String r0 = "ۖ۫۫ۦۦۧۨۗۙۘۜۚ۬ۚۧۡۨۨۘ۫ۛۙ۫ۖۡۘۚۘۧۘ"
            r1 = r0
            goto L_0x000a
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.m():void");
    }

    public static int mainTextColor() {
        String str = "ۧۖۛۜۘ۠ۗۖۘ۠ۨۥۘۘۗۡۤۢۨۘ۟ۙۡۘۚۧ";
        while (true) {
            switch ((str.hashCode() ^ 987) ^ -1818068706) {
                case -1162224824:
                    f132x = others.getColor("ModConTextColor", ColorStore.getDefaultListItemSubTitleColor());
                    str = "ۚۧۙۨۦ۫ۡۨۢ۟ۢۦۘ۫۠ۦۡۤۜۧۥۛۜۥۛۥۜ۟";
                    break;
                case 520772537:
                    return f132x;
                case 2052592119:
                    String str2 = "ۜ۫ۗۖۛۜۘ۬ۤۜۨۙۡۦۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1640570848) {
                            case -2073391497:
                                str = "ۙۛۜۘۥۘۘۜ۠ۗۚ۫۬ۨۘۘۚۛۖ۬ۜۧۧۢۜۖۥۢ";
                                continue;
                            case -1386866597:
                                str = "ۚۧۙۨۦ۫ۡۨۢ۟ۢۦۘ۫۠ۦۡۤۜۧۥۛۜۥۛۥۜ۟";
                                continue;
                            case -1120970129:
                                str2 = "ۦۢۧۙۧۧۦ۠ۨ۠ۛۛ۟ۘۚۨ۠۫۫۫ۚۙۜۢ";
                                break;
                            case 558147368:
                                if (f132x != -1) {
                                    str2 = "ۛۨۦۘ۠ۖۛۗ۟ۨۛۘۡۨۖۘۚۦۧ";
                                    break;
                                } else {
                                    str2 = "ۚۨۧ۟ۢۛۤۗۥۤۤۥۖۖ۫ۥۨ۫";
                                    break;
                                }
                        }
                    }
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int mainpagercolor() {
        /*
            java.lang.String r0 = "ۛۜۛۢ۫۫ۚۨۚۙۨۜۖ۠۬ۘۙ۫۫ۚۢۦۚۜۙۗ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 873(0x369, float:1.223E-42)
            r3 = -217827968(0xfffffffff3043580, float:-1.0474675E31)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 245432429: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            android.content.SharedPreferences r0 = com.obwhatsapp.yo.shp.prefs
            java.lang.String r1 = "HomeBarText"
            int r2 = com.obwhatsapp.yo.ColorStore.getDefaultHomeToolbarColor()
            int r0 = r0.getInt(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.mainpagercolor():int");
    }

    public static void n(Uri uri, Activity activity) {
        String str = "ۜۤ۫ۥۙۜۘ۫ۨۡۧۧۡ۬۫ۛ۫ۨۡۦۖۘ";
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z2 = false;
        while (true) {
            switch ((str.hashCode() ^ 146) ^ 1580928986) {
                case -1702481038:
                    str = "ۜۦۜۤ۫ۙۡ۬ۢ۠ۙۤۜۡۧۨۘۜۘۚ۬ۦۘۦۤۖ";
                    break;
                case -1042809532:
                    String str5 = "ۥۜ۠ۙۢۡۛۛۤ۫ۡۘۘۡۡۙۖ۟ۧ۠ۦۘ۠ۨۦۘ";
                    while (true) {
                        switch (str5.hashCode() ^ -2009292376) {
                            case -1745873984:
                                str = "ۨ۫ۜۘۤۢۘۘ۫ۡۥۘۚۢۦۛۗۖۘ۬ۡۛۖ۠ۙ";
                                continue;
                            case -1553463148:
                                if (z2) {
                                    str5 = "ۙۗۜۤۢۘۘۛۖ۟۬ۡۖۨۗۜۖۗۦۘ";
                                    break;
                                } else {
                                    str5 = "ۡۙۖ۫ۛۥۛ۠ۤۢۙۡۖۨ۫ۙۜۙۥ۬ۤ۫ۙ";
                                    break;
                                }
                            case -431972881:
                                str = "ۦۛۗۥ۟ۡۘۙۜۘۛۘۤ۬ۗ۬ۙۨۘۘ";
                                continue;
                            case 1809247140:
                                str5 = "ۤۖ۟ۥۡۥۘۧۜۜۘۨۘ۟۫ۧۦ";
                                break;
                        }
                    }
                    break;
                case -977389173:
                    str = "ۙۗۡ۬ۜ۫ۙ۬ۦۘۜۗۘ۟ۜۘ";
                    break;
                case -690310185:
                    String str6 = "ۛۘۡۡۜ۠ۥۨۙۥ۠ۛۚ۬ۦۘۦۧۧۗۙۤ۠ۡۧۘ۫ۖۥۘ";
                    while (true) {
                        switch (str6.hashCode() ^ 971875152) {
                            case -2034484501:
                                if (!z2) {
                                    str6 = "۠ۖ۟۬۟ۤۡ۫ۘۘۚۥۖ۬۟ۨۚۦۜۘۛۥۨۡۖۤ";
                                    break;
                                } else {
                                    str6 = "ۙۘۨۘۨۤۧۛۗ۠۟ۛۗۡۥۧۘۥۦۚ۟ۧۚ";
                                    break;
                                }
                            case -290701181:
                                str = "ۖۙ۟ۨ۠۫ۘ۬ۢۘ۬۬ۤۢۧۨۗۗۨ۟ۙ۫۫ۖۘۖۤۤ";
                                continue;
                            case 96319857:
                                str6 = "۟ۚۨۚۥۜۧۢۛۢۨۥۨۘۦۘ۫۬ۚۜ۬ۗ";
                                break;
                            case 1239994661:
                                str = "ۙۦۛ۠ۡۡۘۢۛ۫ۜۢۢۛۗ";
                                continue;
                        }
                    }
                    break;
                case -609502605:
                    Toast.makeText(activity, getString(str3), 0).show();
                    str = "ۜۦۜۤ۫ۙۡ۬ۢ۠ۙۤۜۡۧۨۘۜۘۚ۬ۦۘۦۤۖ";
                    break;
                case -424855101:
                    str2 = "view_contact_unsupport";
                    str = "ۙۚۥ۫ۡۢ۬ۢۥۘۚۚۢۧ۬ۜۦۖ۠ۦۦ۠۫ۧۡۘۛۚۡۘ";
                    break;
                case 477314040:
                    str = "ۘۨۙ۟ۗۥۘۜۤۛۢۖۢ۬ۘۨ";
                    break;
                case 839782098:
                    return;
                case 847349925:
                    str = "ۥۥۖۘۡۜۨۘۚ۟ۡ۟ۘۡۢۡۧۘۥۙۡۛۙ";
                    break;
                case 951349196:
                    new n0(activity).start();
                    str = "ۖۧۛۧۧۗۛۖۜۘ۬ۥۙۨۥۡۗۥ۟ۧۖۦ۫ۥۢ";
                    break;
                case 969691191:
                    str = "ۙۗۡ۬ۜ۫ۙ۬ۦۘۜۗۘ۟ۜۘ";
                    str3 = str2;
                    break;
                case 1945175447:
                    str4 = "error_load_video";
                    str = "۬ۡ۬ۥۢۜۤۡۥۘ۬ۤۖۘۤۙۜ۫۟ۗ۫ۘۜۘۢ۫ۨۘ";
                    break;
                case 2071084538:
                    k0.f792b.f793a = uri;
                    str = "ۜ۠۟۠ۙۜۘۤ۬ۡۘۛۘۢ۬۠ۛۚۙۦۘ۠۠ۦۘۧۧۘ";
                    break;
                case 2109826346:
                    str = "ۢ۫ۡۚۜۡۘۡۘۨۘ۫ۨ۟۠ۢۙ۫ۗۜۜۘ";
                    z2 = utils.isVideoFile(uri);
                    break;
                case 2123196376:
                    str = "ۜۛۤ۫ۘۖۗۙۖۘۥۢۨ۫۬ۧ";
                    str3 = str4;
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d5, code lost:
        r0 = "ۖۗ۟۫ۨۧۘۦۖۗۘۧۘۜۜ۬۬ۨۨۗۜۜۘۖۛۡۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent notifIn(android.content.Intent r10) {
        /*
            r2 = 0
            java.lang.String r0 = "ۥۚۙۗ۫۟ۗۛۨۙۢۜ۫ۤۦۦۢۘۘۤۤۥۧۜۤ"
            r1 = r2
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
        L_0x0009:
            int r2 = r0.hashCode()
            r8 = 237(0xed, float:3.32E-43)
            r9 = 1122701630(0x42eb113e, float:117.533676)
            r2 = r2 ^ r8
            r2 = r2 ^ r9
            switch(r2) {
                case -1971952553: goto L_0x00c1;
                case -1574553857: goto L_0x001f;
                case -1485483335: goto L_0x00ce;
                case -1261069131: goto L_0x0085;
                case -1164973422: goto L_0x0047;
                case -772405352: goto L_0x00d3;
                case -507385426: goto L_0x0018;
                case -310065534: goto L_0x00d4;
                case 240622296: goto L_0x00aa;
                case 886137203: goto L_0x0053;
                case 1352677017: goto L_0x001b;
                case 1439470938: goto L_0x0069;
                case 1565050081: goto L_0x003f;
                case 2089556515: goto L_0x00b4;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x0009
        L_0x0018:
            java.lang.String r0 = "ۡۗۘۦۜۦۘ۠ۙۡۘۖ۫ۤۧ۬ۛ۠ۖۧۘۧۙۨۘ"
            goto L_0x0009
        L_0x001b:
            java.lang.String r0 = "ۚۘۧۢۜ۟ۨۖۘۨۤ۠۬ۨۘۘۚۛۨۘۦۗ۠۠۬ۤ"
            r7 = r10
            goto L_0x0009
        L_0x001f:
            r2 = 2013996451(0x780b25a3, float:1.1288947E34)
            java.lang.String r0 = "ۡۥۨۧۚۨۘۗۧۜۘۥ۠۟ۖ۫ۦۜۨۖۘۚۤۥۘۘۥۜ"
        L_0x0024:
            int r8 = r0.hashCode()
            r8 = r8 ^ r2
            switch(r8) {
                case -2036688999: goto L_0x0039;
                case 122493895: goto L_0x002d;
                case 1739043959: goto L_0x003c;
                case 1797461515: goto L_0x00d9;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x0024
        L_0x002d:
            boolean r0 = isAppLocked()
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = "ۗۖۢۥۢۤ۬ۙۥۥۗۦۦۗۨ۫ۙ۟"
            goto L_0x0024
        L_0x0036:
            java.lang.String r0 = "ۚۦۢۙۦۨۧۢۖۘۗۨۗۖۧۖۘۨۜ۠۫ۡۘۦۦۤ۠ۧۦ"
            goto L_0x0024
        L_0x0039:
            java.lang.String r0 = "۬ۜۢۡۚۦۦۚۧ۟ۗۜۘۛۦۥۘۜ۬ۛ۬ۥۧۘ۟ۗ۠ۤۤۡۘ"
            goto L_0x0024
        L_0x003c:
            java.lang.String r0 = "ۨۧۧۘۚۜ۫ۖ۬ۜۛۨۘۗۥۜۘۨۖۨ"
            goto L_0x0009
        L_0x003f:
            java.lang.Class r2 = a()
            java.lang.String r0 = "ۚ۬۠ۛۢۨۖ۬ۜۖۛۨۘۖۢۨۤۛ۬"
            r6 = r2
            goto L_0x0009
        L_0x0047:
            android.content.ComponentName r0 = r10.getComponent()
            java.lang.String r2 = r0.getShortClassName()
            java.lang.String r0 = "ۥۙۘۘ۠ۤۥ۠ۤۘۘۖۜۖۘ۬ۨ۠۬ۜۛ"
            r5 = r2
            goto L_0x0009
        L_0x0053:
            java.lang.String r0 = "."
            int r0 = r5.lastIndexOf(r0)
            java.lang.String r0 = r5.substring(r0)
            java.lang.String r2 = "."
            java.lang.String r4 = ""
            java.lang.String r2 = r0.replace(r2, r4)
            java.lang.String r0 = "ۜۥ۟ۘۗ۬ۗۡ۫ۚۖۡۘۖۖۘۜۖۖ۬ۥۧ۟۟ۢ۟ۜۡۘ"
            r4 = r2
            goto L_0x0009
        L_0x0069:
            r2 = 5176618(0x4efd2a, float:7.253987E-39)
            java.lang.String r0 = "ۧۙۜۖۡۧۗۖۗۛ۟ۗۘۛۨۘۜۦ۠ۖۙۖۘ"
        L_0x006e:
            int r8 = r0.hashCode()
            r8 = r8 ^ r2
            switch(r8) {
                case -1955070482: goto L_0x0077;
                case -134382988: goto L_0x00d5;
                case 1554777207: goto L_0x0082;
                case 1964552241: goto L_0x007d;
                default: goto L_0x0076;
            }
        L_0x0076:
            goto L_0x006e
        L_0x0077:
            java.lang.String r0 = "ۙۡۡۘ۟ۢۛۛ۟ۥۙ۫ۘ۟ۖۖ۬ۖۗۙۘۥۖ۠ۖۘۧۨۤ"
            goto L_0x006e
        L_0x007a:
            java.lang.String r0 = "۫۫ۖۘۛۗۛۗۦۗۢۖۘۦۜۖۘۜۙۡ۟ۧۙ"
            goto L_0x006e
        L_0x007d:
            if (r4 == 0) goto L_0x007a
            java.lang.String r0 = "ۛۛۖۘ۟ۢۦۘۛۢۖۘۜۨۥۙۚۖۧ۟۫ۦۡۖ"
            goto L_0x006e
        L_0x0082:
            java.lang.String r0 = "ۘۨۖۨۛۖۨۡۦۘۛۥۖۚۥۙۜۘ"
            goto L_0x0009
        L_0x0085:
            r2 = 166162599(0x9e770a7, float:5.5717165E-33)
            java.lang.String r0 = "۫ۨۚۛۜۧۧۖۖۜۥۧۢۘۜۤۡۗۨ۟ۨۘ۫ۗۥ۠ۜۘۘ"
        L_0x008a:
            int r8 = r0.hashCode()
            r8 = r8 ^ r2
            switch(r8) {
                case -2052030862: goto L_0x00a3;
                case -1768905731: goto L_0x0093;
                case -773143009: goto L_0x00a6;
                case 824435042: goto L_0x00d5;
                default: goto L_0x0092;
            }
        L_0x0092:
            goto L_0x008a
        L_0x0093:
            java.lang.String r0 = r6.getSimpleName()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = "ۧۚۘۘۛۧۨۤۚۥۘ۟۬۠۠ۙۧ۫۬ۜۙۢ۬"
            goto L_0x008a
        L_0x00a0:
            java.lang.String r0 = "ۛۤۗۖۛۡۨۗ۬ۖ۟ۛۘۗۧ"
            goto L_0x008a
        L_0x00a3:
            java.lang.String r0 = "ۨۢۘۛۘۡۤۡۛۙۢ۬۬ۦۥۨۘۡۘ۫ۡۜۗ"
            goto L_0x008a
        L_0x00a6:
            java.lang.String r0 = "ۨ۬۠ۨۚۡۘۢ۟ۧۡۧۖۥۗۡۘۘ۫ۤۜۦۘۘ۟۟ۜۘۙ۠ۛ"
            goto L_0x0009
        L_0x00aa:
            com.obwhatsapp.youbasha.ui.lockV2.LockOptions r2 = new com.obwhatsapp.youbasha.ui.lockV2.LockOptions
            r2.<init>((android.content.Intent) r10)
            java.lang.String r0 = "ۨۙۘۛۤۗ۟۬ۘ۟ۧۥۘ۫ۘۨۙۨۖۙۨۦۥ۬ۗۢۜۦۘ"
            r3 = r2
            goto L_0x0009
        L_0x00b4:
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r0 = getCtx()
            r1.<init>(r0, r6)
            java.lang.String r0 = "۠۬ۥۗۘۖۘۙۢ۟ۖۦۢۜ۠۠۫ۨۡۨۥۦۘۨۘۨۘ۫۠ۨ"
            goto L_0x0009
        L_0x00c1:
            java.lang.String r0 = "lockoptions"
            android.os.Bundle r2 = r3.getBundle()
            r1.putExtra(r0, r2)
            java.lang.String r0 = "ۤۜۛ۟ۘۥۘۘ۫ۦۘۥۥۧۘ۠ۧۖۘ۬۟ۡۘ۟۠ۘۘ۟۠ۡۥۨ"
            goto L_0x0009
        L_0x00ce:
            java.lang.String r0 = "ۦۡۧۘ۟ۧۙۘۘۖۘ۠ۢۦۘۗۖۖۘۡۨۦۢ۟۬ۘۤۥۗۗۘ"
            r7 = r1
            goto L_0x0009
        L_0x00d3:
            r10 = r7
        L_0x00d4:
            return r10
        L_0x00d5:
            java.lang.String r0 = "ۖۗ۟۫ۨۧۘۦۖۗۘۧۘۜۜ۬۬ۨۨۗۜۜۘۖۛۡۘ"
            goto L_0x0009
        L_0x00d9:
            java.lang.String r0 = "ۦۡۧۘ۟ۧۙۘۘۖۘ۠ۢۦۘۗۖۖۘۡۨۦۢ۟۬ۘۤۥۗۗۘ"
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.notifIn(android.content.Intent):android.content.Intent");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e5, code lost:
        r2 = "ۗۘ۟ۥۚ۬ۢۡۤۥۜ۟۟ۛۦۖ۫ۗۖۙۨۘ۠ۚۥۦۥۥۘ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f5, code lost:
        r2 = "۬ۘۧۘۖۜۡۘۙۢۨ۬۬۬۬ۨ۟";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean o() {
        /*
            r22 = 0
            r5 = 0
            r21 = 0
            r15 = 0
            r20 = 0
            r18 = 0
            r16 = 0
            r14 = 0
            r12 = 0
            r13 = 0
            r11 = 0
            r10 = 0
            r9 = 0
            r8 = 0
            r6 = 0
            r7 = 0
            r3 = 0
            r4 = 0
            java.lang.String r2 = "ۨۛۛ۟ۙ۬ۜۚۘۘۛۜ۟ۚ۟۠"
        L_0x0019:
            int r23 = r2.hashCode()
            r24 = 926(0x39e, float:1.298E-42)
            r25 = 2079528949(0x7bf317f5, float:2.5244281E36)
            r23 = r23 ^ r24
            r23 = r23 ^ r25
            switch(r23) {
                case -2128361330: goto L_0x002a;
                case -1969663528: goto L_0x007e;
                case -1961766179: goto L_0x00f3;
                case -1961233760: goto L_0x017e;
                case -1927313402: goto L_0x0179;
                case -1853513262: goto L_0x00ee;
                case -1775789203: goto L_0x01d8;
                case -1654438459: goto L_0x00f8;
                case -1604682735: goto L_0x012f;
                case -1538486951: goto L_0x00bd;
                case -1326225748: goto L_0x01f1;
                case -1301134408: goto L_0x003b;
                case -803102695: goto L_0x01b0;
                case -685138996: goto L_0x00fd;
                case -569479513: goto L_0x01e1;
                case -438806840: goto L_0x018d;
                case -255741809: goto L_0x0079;
                case -73660914: goto L_0x003f;
                case -47070520: goto L_0x0128;
                case 218379264: goto L_0x0188;
                case 225297864: goto L_0x0192;
                case 266231834: goto L_0x0118;
                case 341113710: goto L_0x0183;
                case 514519837: goto L_0x00a4;
                case 544984928: goto L_0x01e9;
                case 704378741: goto L_0x0075;
                case 993545887: goto L_0x014b;
                case 1051225903: goto L_0x006b;
                case 1253374376: goto L_0x01d3;
                case 1359013249: goto L_0x0070;
                case 1433897175: goto L_0x01f9;
                case 1527928065: goto L_0x009c;
                case 1685561567: goto L_0x013b;
                case 1979595513: goto L_0x010f;
                case 2009510035: goto L_0x00e9;
                case 2130675283: goto L_0x01b5;
                case 2142414100: goto L_0x002f;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0019
        L_0x002a:
            int r2 = com.obwhatsapp.yo.z.f915j
            java.lang.String r2 = "ۘ۬ۘۘۛۥ۟ۡۙ۟۠۟ۘۘۧۥ۫ۥ۠ۜۚۦۘۛۦۗۦۤۖ"
            goto L_0x0019
        L_0x002f:
            r22 = -3103607061953(0xfffffd2d629a823f, double:NaN)
            java.lang.String r22 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r22)
            java.lang.String r2 = "ۚۚۥۨۦۘۦۦۛۦۘۤۜۥۥۜۘۙۥۡۘ۬ۤۚ"
            goto L_0x0019
        L_0x003b:
            r5 = 0
            java.lang.String r2 = "ۥ۠۫۟ۙۡۘ۬ۛۥۢۧۛۖۤ۬۟ۥۖۘ"
            goto L_0x0019
        L_0x003f:
            r23 = 1658103901(0x62d4a85d, float:1.9614208E21)
            java.lang.String r2 = "ۦۛۤۦۛۦۘ۫ۖۡۖۦۘۘۗۢۥۘۗۧۛۛۖۘۘ"
        L_0x0044:
            int r24 = r2.hashCode()
            r24 = r24 ^ r23
            switch(r24) {
                case -1966537699: goto L_0x01dd;
                case -1539984475: goto L_0x004e;
                case -579594871: goto L_0x0068;
                case 477490613: goto L_0x0065;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x0044
        L_0x004e:
            r2 = 0
            r0 = r22
            int r2 = com.obwhatsapp.yo.shp.getIntPriv(r0, r2)
            long r24 = com.obwhatsapp.yo.z.b(r2)
            r26 = 0
            int r2 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r2 == 0) goto L_0x0062
            java.lang.String r2 = "ۦۘۛۤۡۥ۬۫ۧۤۨۘۧ۟ۢۙۖۜۘ۟ۧ۠ۛۨ۫ۦۡۡ"
            goto L_0x0044
        L_0x0062:
            java.lang.String r2 = "ۙۚۜۚۨۧۦۛۖۘ۫۫ۢ۠ۢۧۦۛۙۜۨۛۦ۫۫ۙ۬ۖ"
            goto L_0x0044
        L_0x0065:
            java.lang.String r2 = "ۛۘۥۘ۟ۚۙۛۤۢۥۤۡۜۙ"
            goto L_0x0044
        L_0x0068:
            java.lang.String r2 = "ۥۨۨۘۙۤۤ۫ۨۨۗ۟ۧۢ۫ۛۛۦ۟ۗۘ۬ۚۦ۟"
            goto L_0x0019
        L_0x006b:
            r21 = 1
            java.lang.String r2 = "ۡۜۜۘ۟۠۬ۖۙۘۨۛۦۜۘۘ"
            goto L_0x0019
        L_0x0070:
            java.lang.String r2 = "ۚۙۢۡۜۗۢۦۖ۟۫ۨۥۖ۬ۨۛۥۤۖ"
            r20 = r21
            goto L_0x0019
        L_0x0075:
            r15 = 0
            java.lang.String r2 = "۬ۦ۟ۡۗۨۡۛۢۘ۫ۦۘۤۢۦۘ۬۬۟ۢۤۥۘ"
            goto L_0x0019
        L_0x0079:
            java.lang.String r2 = "ۙ۠ۨۘ۫ۘۖۖ۫ۨۥۨۘۘۡۤۨۧۖۘۛۦۘۘ"
            r20 = r15
            goto L_0x0019
        L_0x007e:
            r23 = -2055456987(0xffffffff857c3725, float:-1.18591115E-35)
            java.lang.String r2 = "ۚۖ۫۟ۜۤۜۜۛۙۢۤۦ۬۬۬ۦۙ۟ۜۥۖ۟۬ۙ۠ۜۘ"
        L_0x0083:
            int r24 = r2.hashCode()
            r24 = r24 ^ r23
            switch(r24) {
                case -1821408547: goto L_0x0095;
                case -138702006: goto L_0x008d;
                case 614147450: goto L_0x0098;
                case 2081702495: goto L_0x01e5;
                default: goto L_0x008c;
            }
        L_0x008c:
            goto L_0x0083
        L_0x008d:
            if (r20 == 0) goto L_0x0092
            java.lang.String r2 = "ۢۗۖۛۛۦۢۦۢ۠ۘۖۙۚۦۘ"
            goto L_0x0083
        L_0x0092:
            java.lang.String r2 = "۬ۘۦۖۛۗۥۢۥۗۥۜۦۦۜۘ"
            goto L_0x0083
        L_0x0095:
            java.lang.String r2 = "ۢۥۢۗ۟ۗ۬۫ۗۦۘۘۘۤۧۖۘ"
            goto L_0x0083
        L_0x0098:
            java.lang.String r2 = "ۥ۠ۡۘۨۘۚۛ۫ۛۦۡۢ۟ۧۥۘۨۡۖۘ"
            goto L_0x0019
        L_0x009c:
            long r18 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "ۧۗۦ۠۬ۡۧۥۘۧ۠۠ۙ۫ۘۘ۫۟ۖۖۚۙۘۘۜ۫ۥۧۘ"
            goto L_0x0019
        L_0x00a4:
            r16 = -3344125230529(0xfffffcf5629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r16)
            r16 = 0
            r0 = r16
            int r2 = com.obwhatsapp.yo.shp.getIntPriv(r2, r0)
            long r16 = com.obwhatsapp.yo.z.b(r2)
            java.lang.String r2 = "ۚۧۘۗۙۤۚۛۧۙۥۖۛۧۡۤۘ۠"
            goto L_0x0019
        L_0x00bd:
            r23 = -1578081123(0xffffffffa1f0649d, float:-1.6289665E-18)
            java.lang.String r2 = "ۢۗۚ۟۠ۜۥۢۖۘۚۡۦۖۥۡۥۙۜۘۡۘۦۘ"
        L_0x00c2:
            int r24 = r2.hashCode()
            r24 = r24 ^ r23
            switch(r24) {
                case -1729703385: goto L_0x00e2;
                case -344417562: goto L_0x00e5;
                case 144755932: goto L_0x00cc;
                case 1382991078: goto L_0x01e5;
                default: goto L_0x00cb;
            }
        L_0x00cb:
            goto L_0x00c2
        L_0x00cc:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r24 = r18 - r16
            r0 = r24
            long r24 = r2.toHours(r0)
            r26 = 23
            int r2 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r2 <= 0) goto L_0x00df
            java.lang.String r2 = "۫ۦ۫ۤۤۖۘۨۙ۬ۦۨۡۘۤۤۧۤۦۥۘ"
            goto L_0x00c2
        L_0x00df:
            java.lang.String r2 = "ۜۜۖۘۨۚۥ۟ۧۦۘۙۢۘۘۚۢۚۖۧۘۨۗۖ۫ۨ"
            goto L_0x00c2
        L_0x00e2:
            java.lang.String r2 = "ۛ۟ۦۘۚۢ۫ۡۜ۫۠ۨۙ۟۬ۤۧۚۗۙۖۙۡۛۖ"
            goto L_0x00c2
        L_0x00e5:
            java.lang.String r2 = "ۥ۠ۤۥ۫ۢۦ۫ۦۘ۟ۚۘۥۡۤۡۦۤۚۖۦۘ"
            goto L_0x0019
        L_0x00e9:
            r14 = 1
            java.lang.String r2 = "ۥ۠ۤۡ۟ۗ۠ۚۦۘ۫ۡۗۦۥۢۦۥۖ"
            goto L_0x0019
        L_0x00ee:
            java.lang.String r2 = "ۛۖۘۘۦۧۥۘ۬ۗۗ۠ۛۗۛۖۨۘۖ۠۫ۡۧۡۘۡۛۙ"
            r13 = r14
            goto L_0x0019
        L_0x00f3:
            r12 = 0
            java.lang.String r2 = "ۤ۫۬ۛۢۗۗۘۘۙۦۛۦۚۢ۬ۗۡۘ"
            goto L_0x0019
        L_0x00f8:
            java.lang.String r2 = "ۤ۬ۤۘۜۙۗۤ۟ۜۤۨۘۙۤۨۢۖۧ"
            r13 = r12
            goto L_0x0019
        L_0x00fd:
            r24 = -3198096342465(0xfffffd17629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r24)
            r11 = 0
            int r11 = com.obwhatsapp.yo.shp.getIntPriv(r2, r11)
            java.lang.String r2 = "ۚۥۙۛۡۨۧۛ۟ۘۛۧ۠ۛۜۘ۬ۨۨۖۨۨۘۢ۫ۖۢۤۗ"
            goto L_0x0019
        L_0x010f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "۬ۧۨ۠ۡۦۘۧۤۜۥۥۤۙ۟ۛۗۨۤۗۛۧۧۡ۫"
            goto L_0x0019
        L_0x0118:
            r24 = -3683427646913(0xfffffca6629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r24)
            r10.append(r2)
            java.lang.String r2 = "ۗۚۖۡۨۖۘۧ۟۠ۚۡۨ۬۠ۘۘۧۦۘۘۘۡۜۘۨۙۡ"
            goto L_0x0019
        L_0x0128:
            r10.append(r11)
            java.lang.String r2 = "ۡۙۙۖۖۥۜ۠ۜ۠ۢ۫ۘ۟ۖ"
            goto L_0x0019
        L_0x012f:
            java.lang.String r2 = r10.toString()
            java.lang.StringBuilder r9 = a.a.g(r2)
            java.lang.String r2 = "۬ۚۜۚۧۥۚۚ۬۟ۢۘۘۖۗۨۘۧ۫ۦۘۚۗ۟ۦۨۜۘ"
            goto L_0x0019
        L_0x013b:
            r24 = -3704902483393(0xfffffca1629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r24)
            r9.append(r2)
            java.lang.String r2 = "ۤۚۦۘۧۖۗۧۢۗۢۡۢۖۥ۟ۨ۫۬ۚ۫۟ۢ"
            goto L_0x0019
        L_0x014b:
            r23 = -1636350522(0xffffffff9e7745c6, float:-1.30905E-20)
            java.lang.String r2 = "۟ۜۖۘۢۢۘۘۡ۟ۘۘۧۤۗۤۢۘۘ"
        L_0x0150:
            int r24 = r2.hashCode()
            r24 = r24 ^ r23
            switch(r24) {
                case -1932204037: goto L_0x015a;
                case -1721402715: goto L_0x0176;
                case -1197929202: goto L_0x01ed;
                case -883756163: goto L_0x0161;
                default: goto L_0x0159;
            }
        L_0x0159:
            goto L_0x0150
        L_0x015a:
            java.lang.String r2 = "ۢ۠ۙ۬۫ۗۨۛۚ۫ۦۡۘ۠ۗ۠"
            goto L_0x0019
        L_0x015e:
            java.lang.String r2 = "ۥۚۤ۬ۨ۟۟ۦۗۤ۟ۥۘۗۜۡۦۗ۫"
            goto L_0x0150
        L_0x0161:
            java.lang.String r2 = r9.toString()
            r24 = 0
            r0 = r24
            long r24 = com.obwhatsapp.yo.shp.getLongPriv(r2, r0)
            r26 = 0
            int r2 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r2 == 0) goto L_0x015e
            java.lang.String r2 = "ۛۡۧۥۧۨۡ۟ۙۖۘۧۢۖ"
            goto L_0x0150
        L_0x0176:
            java.lang.String r2 = "ۖ۬ۘۗۗ۟ۙ۬ۤۜۖۙۛ۠ۦۦ۬ۧ۠۫ۦۢۗۨ۠"
            goto L_0x0150
        L_0x0179:
            r8 = 1
            java.lang.String r2 = "ۧ۬ۥۚۘۢۤۦۘۘۗۡۘۦۦ۬ۚ۟ۜۢۜۘ"
            goto L_0x0019
        L_0x017e:
            java.lang.String r2 = "ۨ۠ۖۛ۬ۡۚۛۨۨۢۥ۠ۜۗۖ۟ۥۘۘۧۧ۟۫ۨۘۥۙۘۘ"
            r7 = r8
            goto L_0x0019
        L_0x0183:
            r6 = 0
            java.lang.String r2 = "ۙ۬۠ۙۢۨۘۦ۟۟ۖۘۡۘۡ۬ۡۧۘۘۘ۫ۦۖۘ"
            goto L_0x0019
        L_0x0188:
            java.lang.String r2 = "ۤ۟ۦۜۛۚۢۤۥۙۗ۫ۧۥۥۖ۫ۦۘۢۖۡۘۖۡۘۨۢ۫"
            r7 = r6
            goto L_0x0019
        L_0x018d:
            java.lang.String r2 = "۟ۖۘۜ۫ۧ۠ۦۥۘۗۙ۟ۚۛۨۨۨ۟ۖۙ۠ۦۗۤۜۤ"
            r4 = r5
            goto L_0x0019
        L_0x0192:
            r23 = -881624911(0xffffffffcb7378b1, float:-1.5956145E7)
            java.lang.String r2 = "ۤۛۘۗۚۚۚۥۧۘۧۗۦۜۨۤۥۦۤۢۜ۠"
        L_0x0197:
            int r24 = r2.hashCode()
            r24 = r24 ^ r23
            switch(r24) {
                case -1264177581: goto L_0x01ac;
                case -1089133975: goto L_0x01f5;
                case -21934081: goto L_0x01a9;
                case 588005958: goto L_0x01a1;
                default: goto L_0x01a0;
            }
        L_0x01a0:
            goto L_0x0197
        L_0x01a1:
            if (r7 == 0) goto L_0x01a6
            java.lang.String r2 = "ۨۚۧۦۢۤۖۚۥۘۥ۠۟ۛۡۙ۟۬ۗۥ۠ۖۘ"
            goto L_0x0197
        L_0x01a6:
            java.lang.String r2 = "۬ۘۛۤۨۨۘۨ۫ۡۘۚۧۗۧۦۦۘۙۗ۬ۢۤ۬ۥۘۖۘۨۥۤ"
            goto L_0x0197
        L_0x01a9:
            java.lang.String r2 = "ۥۖۨۘۤۨۘۥۧۜۘ۫ۧۚۙۦۜ"
            goto L_0x0197
        L_0x01ac:
            java.lang.String r2 = "ۜ۠۠ۡۖۖۘۛۨ۠ۨۜۤۢۜ۟ۧۦۨۘۨۤۦۘ"
            goto L_0x0019
        L_0x01b0:
            java.lang.String r2 = "ۡۦۜۘۨۖۘۢ۟ۘۘۚ۫ۤۚۙۡۗۨۤۡۙۖۘ"
            r4 = r5
            goto L_0x0019
        L_0x01b5:
            r23 = 802271194(0x2fd1afda, float:3.8141829E-10)
            java.lang.String r2 = "ۘۖۡۧۖۘۙۦۗۛۙۥۘۜ۟۫۬ۜۘ"
        L_0x01ba:
            int r24 = r2.hashCode()
            r24 = r24 ^ r23
            switch(r24) {
                case -1320339484: goto L_0x01cf;
                case -1232693057: goto L_0x01f5;
                case 66185391: goto L_0x01c4;
                case 405666962: goto L_0x01cc;
                default: goto L_0x01c3;
            }
        L_0x01c3:
            goto L_0x01ba
        L_0x01c4:
            if (r13 != 0) goto L_0x01c9
            java.lang.String r2 = "ۦ۟۟۟ۧۙ۬ۛۜۘۨۛۡۗۦۜ۠ۦۘۛ۫ۥۘۛ۫ۘ"
            goto L_0x01ba
        L_0x01c9:
            java.lang.String r2 = "۫۬ۚ۫ۦۦۘۦۜۘۢ۫ۦۘۛۘۨۘۚ۫ۥۘۨۗۘۘۘۤ۬ۛۘ۫"
            goto L_0x01ba
        L_0x01cc:
            java.lang.String r2 = "ۘۥۜۤۛۚۢ۫ۦۘۧۚۘۤۗۖۘۤۧۢۢۧۙۙۖۛ"
            goto L_0x01ba
        L_0x01cf:
            java.lang.String r2 = "ۛۖۚۡۦۡۥۧۘۢۙۙۛ۫ۙۨ۠ۛ"
            goto L_0x0019
        L_0x01d3:
            r3 = 1
            java.lang.String r2 = "ۖۛۡۘۡۚۤ۟ۥۚۗۤۥ۫ۚۨۘۖۖۖۦۨ۬"
            goto L_0x0019
        L_0x01d8:
            java.lang.String r2 = "۬ۘۧۘۖۜۡۘۙۢۨ۬۬۬۬ۨ۟"
            r4 = r3
            goto L_0x0019
        L_0x01dd:
            java.lang.String r2 = "ۘۢۨۘۛۖۖۥۧۛۜۨۦۡ۠ۥۤۖۙۨۧۡۧۦ"
            goto L_0x0019
        L_0x01e1:
            java.lang.String r2 = "ۙ۠ۨۘ۫ۘۖۖ۫ۨۥۨۘۘۡۤۨۧۖۘۛۦۘۘ"
            goto L_0x0019
        L_0x01e5:
            java.lang.String r2 = "ۗۘ۟ۥۚ۬ۢۡۤۥۜ۟۟ۛۦۖ۫ۗۖۙۨۘ۠ۚۥۦۥۥۘ"
            goto L_0x0019
        L_0x01e9:
            java.lang.String r2 = "ۤ۬ۤۘۜۙۗۤ۟ۜۤۨۘۙۤۨۢۖۧ"
            goto L_0x0019
        L_0x01ed:
            java.lang.String r2 = "ۧۢۜۗۚ۫ۢۜۡۘ۬۬۫۠ۘۨۘۨۤۦۘ۟۬۫ۚۜۜ"
            goto L_0x0019
        L_0x01f1:
            java.lang.String r2 = "ۤ۟ۦۜۛۚۢۤۥۙۗ۫ۧۥۥۖ۫ۦۘۢۖۡۘۖۡۘۨۢ۫"
            goto L_0x0019
        L_0x01f5:
            java.lang.String r2 = "۬ۘۧۘۖۜۡۘۙۢۨ۬۬۬۬ۨ۟"
            goto L_0x0019
        L_0x01f9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.o():boolean");
    }

    public static void onOptionsItemSelected(MenuItem menuItem, Context context) {
        follow_div_link(menuItem.getItemId(), context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean onlineDotchat() {
        /*
            java.lang.String r0 = "ۙ۠ۨۤۚ۟ۤۤۗۛ۠۫ۖۛۚۖۤۡۘۛۧۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 427(0x1ab, float:5.98E-43)
            r3 = 1573293786(0x5dc68eda, float:1.78845159E18)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1565679320: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "onlineDotchat"
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0)
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.onlineDotchat():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean onlinechat() {
        /*
            java.lang.String r0 = "۫ۚۘۘۡۙۦۘ۬۫ۧ۬ۘ۬ۧ۠ۚۥۛۨۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 930(0x3a2, float:1.303E-42)
            r3 = -1836664705(0xffffffff9286b87f, float:-8.502071E-28)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1624043115: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "onlinechat"
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0)
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.onlinechat():boolean");
    }

    public static void openHiddenChats() {
        String str = "ۨۚۘۤ۬ۚۧۦۨۘۢ۬ۦۧ۬ۡۘۙ۫ۥ۬ۚ";
        LockOptions lockOptions = null;
        Intent intent = null;
        boolean z2 = false;
        boolean z3 = false;
        Class<?> cls = null;
        while (true) {
            switch ((str.hashCode() ^ 824) ^ -107204722) {
                case -1230813899:
                    Homeac.startActivity(new Intent(Homeac, cls).putExtra("lockoptions", lockOptions.getBundle()));
                    str = "ۢ۬ۜۗ۫ۖۡۗ۠ۨ۠ۡۡ۠ۜۘۚ۠ۙۗۖ۫";
                    break;
                case -1163007566:
                    str = "ۙۛۚۜۙۢۘۙۡۘۡۤۜۖۦۛ۬۬";
                    cls = LockUtils.getLockTypeByJID(hideJidCode);
                    break;
                case -745985021:
                    z3 = true;
                    str = "ۨۤۚۘۢۘۘۘۙۦ۫ۢۡۥۧ۬";
                    break;
                case -276501828:
                    showHChatsLockSetupDlg(Homeac);
                    str = "۬۠۠ۜۗۥۘۜۙ۟ۘۖ۫ۛۚۜۘۜۙۧ۠۫۫";
                    break;
                case 184458226:
                    str = "ۥۥۘۛ۟ۡۘۢ۠ۨۘ۫ۢۜ۫۫ۦۘ۠ۦۢۜۥۡۘۥۖۥۘ۠ۥۥۘ";
                    intent = new Intent(getCtx(), HiddenConversationsActivity.class);
                    break;
                case 348738890:
                    str = "ۡۡۡ۫ۧ۬ۨ۠ۨۘۧۥۤۛۘۧۚۚۡۦۙۤ";
                    break;
                case 437748240:
                    str = "ۡۖۤۢۜۥۘۥۘۤ۬۠۬ۖ۠ۦۘۧۘۘ";
                    break;
                case 672864437:
                    str = "۬۠۠ۜۗۥۘۜۙ۟ۘۖ۫ۛۚۜۘۜۙۧ۠۫۫";
                    break;
                case 880689547:
                    str = "ۗۢۦ۟ۡ۠ۛۛۘۦ۟ۦۛۚۘۦۧ۟ۢۗۖۘۛ۫ۖۧ۫ۨۘ";
                    z2 = z3;
                    break;
                case 1087531009:
                    String str2 = "ۨۦۡۤۘۘ۠ۥۢۖۛۘ۠ۢ۠";
                    while (true) {
                        switch (str2.hashCode() ^ 1180549115) {
                            case -1451856900:
                                if (cls == null) {
                                    str2 = "ۡۜ۠۟ۛۘ۟۟ۜۖۘۙۚۦۥۦ۠۫ۨۚۘۦۥۘۡۖۖ";
                                    break;
                                } else {
                                    str2 = "ۦۘۛۢۥۢۨۧۢۦۘۘۘۨ۠ۡۧ۬ۙۙۧۜ۟ۥۥۘۜۗۡۘ";
                                    break;
                                }
                            case -513107617:
                                str = "ۢۨ۟ۦۧۗ۬۟ۥۘۙۢۦۘ۬ۗۦۢ۟ۛۡۙۡ۠ۡۥ";
                                continue;
                            case -80211436:
                                str2 = "ۛ۠ۥۘۘ۠۬ۖۜۡۘۘ۬ۛۖ۟ۡۧۨۜ۬ۘۦۗۤۦۘۜۜۛ";
                                break;
                            case 1292148824:
                                str = "ۙۢۖۘۙۗۥۖۖۦۘۤ۠ۘۙۙۥ۬ۙۨۘ۬ۢ۟";
                                continue;
                        }
                    }
                    break;
                case 1342650932:
                    lockOptions = new LockOptions();
                    str = "ۚ۟ۢۖ۬ۦۘۨۤۘۘۗ۟ۚ۟ۢۘۘۘ۬۟";
                    break;
                case 1356572221:
                    str = "ۡۖۤۢۜۥۘۥۘۤ۬۠۬ۖ۠ۦۘۧۘۘ";
                    z2 = false;
                    break;
                case 1476470750:
                    String str3 = "ۖۧۤۥۤۗۡ۟۠ۥۦۡۛۢۦۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -2122087227) {
                            case -198651992:
                                str3 = "ۢۚۡۘۘۧ۫۟ۚۧۘ۠ۨۥ۫۠ۧۚۖۘ";
                                break;
                            case 51846833:
                                str = "ۙۗۤۚۛۤۢ۬۫ۥۧۡۚۚۥ";
                                continue;
                            case 647777401:
                                if (!z2) {
                                    str3 = "ۡ۠۫ۚۜۘۘۖ۬ۘۘۙۦۖۘ۬۟ۧۥۢۙۦۨۨۡۗۥۘ";
                                    break;
                                } else {
                                    str3 = "۠۬ۤۦۢۥۚۚۤۧ۟ۢۤۜۥۘۤۨ۬۫۬ۡۘ۠ۙۤ";
                                    break;
                                }
                            case 1805939627:
                                str = "۫ۡۖۘ۫ۥۗۦۤۧ۠۬ۖۘ۬ۘۢ";
                                continue;
                        }
                    }
                    break;
                case 1636677120:
                    return;
                case 1783633313:
                    lockOptions.setJustCloseAfterSuccess(false).setJID(hideJidCode).setChangePass(false).setDisableLock(false).setConversation(false).setPassedIntent(intent);
                    str = "ۘۤۜۘ۟۟ۛۜۧ۟ۢ۟ۥۗۘۖ۬ۤ۬۫ۨۖۖۗ۬ۛ";
                    break;
            }
        }
    }

    public static void processVNSound(File file) {
        String str = "۠۫ۥۘۦۜۖۘۚۜۨۘۢۢ۟ۘۦۡۛۦۡۘ";
        while (true) {
            switch (str.hashCode() ^ 1462538935) {
                case -1999002273:
                    String str2 = "۫ۨۚۜۢۜ۬ۚۦۜۤۚۛۢۚۙۧ۟ۤ۠ۜۨۡۨۡۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1831981842) {
                            case -1345069199:
                                str2 = "ۘۜۥۘۦ۠ۚ۠۬ۡ۟ۛۙ۟ۚ۟ۙۧ۟ۡۧۘۗۤۡۘ۟۟۠";
                                break;
                            case 482441223:
                                return;
                            case 953788698:
                                String str3 = "ۗۦۢۢۥۚۛۛۤۥۡۧۘۜۘۥۘۧۘۧۧۚۡ";
                                while (true) {
                                    switch (str3.hashCode() ^ -1388988433) {
                                        case -2025455390:
                                            str3 = "ۦۡۥۘۘ۠ۜۘ۬ۥۙۦۖۨۘ۟ۗۨۘۢۥۦۚۡۖۨۙۥ";
                                            break;
                                        case -1132001571:
                                            return;
                                        case 630622237:
                                            try {
                                                new w0(Conversation.f515d, file).a();
                                                return;
                                            } catch (Exception e2) {
                                                return;
                                            }
                                        case 1044242139:
                                            if (file.exists()) {
                                                str3 = "۬ۙۗۤۜۖۘ۟ۤۜ۫ۚۨۘ۠ۢۜۘ۠ۛ۬ۥۢۖۘ۠۟۫ۡۤۡ";
                                                break;
                                            } else {
                                                str3 = "۬ۜۢۖۦۗۤۙۖۘ۠ۗۜۜۤۖ۬ۖۗۡۜۖۖ۫ۥ";
                                                break;
                                            }
                                    }
                                }
                                break;
                            case 1369036298:
                                if (file == null) {
                                    str2 = "ۨ۬ۨۘۡۥۘ۟ۘۖ۟ۥۦۘۦۚۜۘۖۦۘۜ۬ۖۘ";
                                    break;
                                } else {
                                    str2 = "ۜۤۘۨۚۙۖ۬ۦ۬ۖۤ۫ۡۡۘۥۖۦۘۨۖۦۘۗۨۘۘۥ";
                                    break;
                                }
                        }
                    }
                    break;
                case -464074972:
                    return;
                case -396630868:
                    str = "ۤۗۦۦۗۘۘ۬ۛۛۗۡۘ۟۟۫۫ۦۗۦ۠ۜۢ۟";
                    break;
                case 101573225:
                    if (shp.getBooleanPriv("voicenotechanger_disabled", true)) {
                        str = "۬ۧۧ۫ۧۦۨۥۥۘۙۙۛۚ۠ۧۚۡۘۘۨ۠۟ۦۨ۠ۛۜ";
                        break;
                    } else {
                        str = "ۦۜۜۘۦۛۥۤۗۖۘۚۚۨۘۥۢۖ۠ۚ۬ۦۙۦۜۤۜۘ";
                        break;
                    }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void rebootYo() {
        /*
            r2 = 0
            java.lang.String r0 = "ۛ۟ۤۖۖۛۗۥۥۨۡۛ۬ۨۖۧۙۥۘۥۢ۠"
            r1 = r2
            r3 = r2
            r4 = r2
            r5 = r2
        L_0x0007:
            int r2 = r0.hashCode()
            r6 = 780(0x30c, float:1.093E-42)
            r7 = -1053911532(0xffffffffc12e9614, float:-10.91164)
            r2 = r2 ^ r6
            r2 = r2 ^ r7
            switch(r2) {
                case -1760199915: goto L_0x00e0;
                case -1470137906: goto L_0x00cc;
                case -1437402127: goto L_0x00dc;
                case -1406966132: goto L_0x00a2;
                case -658409276: goto L_0x0054;
                case -581722580: goto L_0x0070;
                case -164248321: goto L_0x007e;
                case -70389742: goto L_0x0016;
                case 479160385: goto L_0x0097;
                case 1374760627: goto L_0x004e;
                case 1558306077: goto L_0x00a8;
                case 1640140326: goto L_0x0076;
                case 1693753764: goto L_0x008e;
                case 2053258555: goto L_0x00c5;
                case 2092654205: goto L_0x0036;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            r2 = -327523157(0xffffffffec7a64ab, float:-1.2108274E27)
            java.lang.String r0 = "ۥۡۡۘۚۡۥ۠ۥ۟ۢۖۢ۟ۗ۠ۘۚ۠ۨۗ"
        L_0x001b:
            int r6 = r0.hashCode()
            r6 = r6 ^ r2
            switch(r6) {
                case -1081983080: goto L_0x00d8;
                case -581313009: goto L_0x002a;
                case 595642641: goto L_0x0024;
                case 1934523031: goto L_0x0033;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x001b
        L_0x0024:
            java.lang.String r0 = "ۨۢۛۘۗۦۦۢ۫ۙۗۥۘۙۦ۬ۖۛۦۘ"
            goto L_0x001b
        L_0x0027:
            java.lang.String r0 = "۠ۦۘۘۗ۠ۗۜۤۖۘ۬ۘ۫ۢۥۢ۫۠ۜ۠ۜۨۘۦۥۥۘ"
            goto L_0x001b
        L_0x002a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            if (r0 < r6) goto L_0x0027
            java.lang.String r0 = "ۜۥۜۡۛۨۧۢۥۘۛ۬ۤۛۘۛۙ۠ۛۤ۠ۡۤۤۧ۫ۛ۬"
            goto L_0x001b
        L_0x0033:
            java.lang.String r0 = "۬ۡۦۦ۫ۧ۫۟ۨۘۛۤۨۘۧۜۙ۫ۛ۫"
            goto L_0x0007
        L_0x0036:
            android.content.Context r0 = getCtx()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Context r2 = getCtx()
            java.lang.String r2 = r2.getPackageName()
            android.content.Intent r2 = r0.getLaunchIntentForPackage(r2)
            java.lang.String r0 = "۟۫ۨۘ۟ۥۚۚ۫ۜۘ۬ۙۡۘۦ۟۬ۛۦۨ۠ۜۥۙۗۡۘ"
            r5 = r2
            goto L_0x0007
        L_0x004e:
            com.obwhatsapp.HomeActivity r2 = Homeac
            java.lang.String r0 = "ۛۛ۬ۘۖۖۥۚۤۦ۟ۦۘۚۢۥۘ۬۟ۦۦۙ۬ۤۗ۠ۛۨۧۘ"
            r4 = r2
            goto L_0x0007
        L_0x0054:
            r2 = -246139472(0xfffffffff15435b0, float:-1.0508116E30)
            java.lang.String r0 = "ۜ۫ۢ۫ۦ۟ۢۙۥۘۥ۠ۤۖ۬ۡۘ"
        L_0x0059:
            int r6 = r0.hashCode()
            r6 = r6 ^ r2
            switch(r6) {
                case -1499034392: goto L_0x00dc;
                case -447319926: goto L_0x0062;
                case 1544166211: goto L_0x006d;
                case 1816675691: goto L_0x0068;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x0059
        L_0x0062:
            java.lang.String r0 = "ۚ۠ۖۘۥۦ۟۠ۘۘ۠ۛۨۦۗۖ۟۫۟ۢۚۜۢۢ"
            goto L_0x0059
        L_0x0065:
            java.lang.String r0 = "۬ۙۡۘ۠ۛ۟ۦۙۜ۟۠۠ۤ۟ۡۢۜۢ"
            goto L_0x0059
        L_0x0068:
            if (r4 == 0) goto L_0x0065
            java.lang.String r0 = "۫ۧۢ۬ۗۧۜۦ۟ۦۗۜۜۢ۠۟ۧۙۗۗۡۘ"
            goto L_0x0059
        L_0x006d:
            java.lang.String r0 = "ۢ۬۬ۡۨ۟۠ۜۙۧ۬ۤۜۘۙ۠ۖۘۘۛ۟ۘۦ۫ۖۜۘ"
            goto L_0x0007
        L_0x0070:
            r4.finishAffinity()
            java.lang.String r0 = "ۙۤ۟ۛۜۖۘ۠ۙۗۧۢۛ۟۠ۙۤ۟ۘ"
            goto L_0x0007
        L_0x0076:
            com.obwhatsapp.HomeActivity r0 = Homeac
            r0.startActivity(r5)
            java.lang.String r0 = "۟ۜۧۘۥۤۦۜۜۘۘۙۧ۠ۧ۠ۖۘۛۧۙۨ۫ۥ"
            goto L_0x0007
        L_0x007e:
            android.content.Intent r2 = new android.content.Intent
            android.content.Context r0 = getCtx()
            java.lang.Class<com.obwhatsapp.Main> r3 = com.obwhatsapp.Main.class
            r2.<init>(r0, r3)
            java.lang.String r0 = "ۙۙۨۘۨۥۖ۫ۧۘۘ۬ۢۖۥۖۗۙ۟۫ۤۙۖۗ۟۫"
            r3 = r2
            goto L_0x0007
        L_0x008e:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r0)
            java.lang.String r0 = "ۛ۫ۘ۬ۗ۟ۜۧۧۙۗۘۙۦۜۘۦ۟ۥ"
            goto L_0x0007
        L_0x0097:
            android.content.Context r0 = getCtx()
            r0.startActivity(r3)
            java.lang.String r0 = "ۤۤ۟ۦۗۧۨۦۦۤۖۜۘۛۦ۠۬ۨۚۜ"
            goto L_0x0007
        L_0x00a2:
            com.obwhatsapp.HomeActivity r1 = Homeac
            java.lang.String r0 = "ۘ۟ۦۦۤۖۘۢۥۡۙۥۥۘ۠ۤۧ"
            goto L_0x0007
        L_0x00a8:
            r2 = 710811052(0x2a5e1dac, float:1.9727855E-13)
            java.lang.String r0 = "ۜۘۘ۫۬ۚ۬ۛۜۗۛۡۗۛۦۤۛۖ"
        L_0x00ad:
            int r6 = r0.hashCode()
            r6 = r6 ^ r2
            switch(r6) {
                case 310953190: goto L_0x00bc;
                case 661346510: goto L_0x00b6;
                case 661547869: goto L_0x00c1;
                case 1860973229: goto L_0x00dc;
                default: goto L_0x00b5;
            }
        L_0x00b5:
            goto L_0x00ad
        L_0x00b6:
            java.lang.String r0 = "ۗ۟ۖۘۥۙۖۘ۬ۛۙۤۗۖۘۦۡۨۡۜۘۜۛ۟"
            goto L_0x00ad
        L_0x00b9:
            java.lang.String r0 = "ۧۘۗۙۜۘۨ۟ۜۡ۟۫ۚۙۥۘۧ۠ۖۘۙۧ۟ۧ۟ۦ"
            goto L_0x00ad
        L_0x00bc:
            if (r1 == 0) goto L_0x00b9
            java.lang.String r0 = "ۚ۟ۨۤۜۖۥۤۤۘۙۨۘ۬۬۠۠ۢۡۘ۬ۗۨۘۦۨۙۤۜۘ"
            goto L_0x00ad
        L_0x00c1:
            java.lang.String r0 = "ۘ۫ۗۦۥۦۡۜۤ۟ۗۜۥۤ۬ۜ۟ۚ۬ۜۛ"
            goto L_0x0007
        L_0x00c5:
            r1.finishAffinity()
            java.lang.String r0 = "۟ۜۦۘ۟ۢۛ۟۠ۘۘ۟۬ۗۖ۫ۖۗۜۜ"
            goto L_0x0007
        L_0x00cc:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r2 = 0
            r0.exit(r2)
            java.lang.String r0 = "ۚۡۨۡۢۥۛۘۘۖۢ۟ۛۗۚۛۧۜ"
            goto L_0x0007
        L_0x00d8:
            java.lang.String r0 = "ۖۥۡۦ۫ۘۙۗۜۨۤۛۧۗۦۤۚۨۘۥۗۗۖ۟ۛ"
            goto L_0x0007
        L_0x00dc:
            java.lang.String r0 = "۟ۜۦۘ۟ۢۛ۟۠ۘۘ۟۬ۗۖ۫ۖۗۜۜ"
            goto L_0x0007
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.rebootYo():void");
    }

    public static void serverProps() {
        boolean z2 = false;
        String str = "ۘ۠ۨۘ۬ۘۙ۟ۥۙۚۨۧۗۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 466) ^ 1668184459) {
                case -1451503755:
                    shp.f876c.putInt("gif_provider", z2 ? 1 : 0).putInt("media_limit_mb", 1024).putInt("document_limit_mb", 1024).putInt("subject_length_limit", 1024).putInt("broadcast_list_size_limit", 1024).apply();
                    str = "ۦۧۛ۬۟ۚ۫ۦۤ۬ۚۡۘۘ۠۟ۨ۫ۛ۫ۙۜۥ۬ۢ";
                    break;
                case -906670314:
                    return;
                case 537870707:
                    z2 = shp.getBooleanPriv("tenor_giphy");
                    str = "ۤ۫ۡۡۥۨۘ۠ۢۖۡۙۨۨۢۢۗۚۗۢ۟ۨۥۜۘ";
                    break;
                case 1806490774:
                    imgRes();
                    str = "ۡۛۙۘۤۘۦۧۨۘ۬ۖۨ۫ۜ۟ۧۨۖۦۥۛۖۘۥۘ";
                    break;
            }
        }
    }

    public static void setCommunityEnabled(boolean z2) {
        String str = "۫۠ۧۨۙۢۚۦ۠۫ۥ۠۫۟ۤۙۜۖۘۢ۠ۤۗ۠ۘ";
        while (true) {
            switch ((str.hashCode() ^ 377) ^ 74409898) {
                case -830899922:
                    isCommunityEnabled = z2;
                    str = "ۖۥۨۘ۬ۙۦۘۡۘۨۘۨۤۜۨۙۜ";
                    break;
                case 778188867:
                    return;
                case 1010473406:
                    str = "ۦۥۤۨۧۦۨۤۧۛۡۥۦ۠ۘ۟۬ۢۨۙۨۘۧۦ۠۠ۨۘ";
                    break;
            }
        }
    }

    public static void setConversationsFragment(ConversationsFragment conversationsFragment2) {
        String str = "ۡۛۗۦۧ۠ۘ۠ۜ۫۠۟ۥۛۡۘۧۤۡۤۢۖۖۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 600) ^ 1135030477) {
                case -359708033:
                    return;
                case -109232155:
                    str = "۬ۛۚۡ۫ۘۘۥۥ۫ۖۢۖ۠ۚۘۘۨۜۛۜۤۖۘۨۡ۠۟ۤۖۘ";
                    break;
                case -12247490:
                    conversationsFragment = conversationsFragment2;
                    str = "ۧ۫۬ۜۖۦۘۦۤ۫۫ۤ۫۠ۤۥۘۡۢۛ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setCurr_sJid(java.lang.String r4) {
        /*
            java.lang.String r0 = "ۡۤ۫ۘۢۢۢۘۚۥ۫ۖۚۦۘۘۚۗۛۧۨۙ۟ۚ۫ۜ۬۫"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 641(0x281, float:8.98E-43)
            r3 = 1886255349(0x706df8f5, float:2.9459567E29)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1982286151: goto L_0x0011;
                case -1778671894: goto L_0x0062;
                case -1477888952: goto L_0x0014;
                case -614046266: goto L_0x0050;
                case 1104903037: goto L_0x0030;
                case 1827575024: goto L_0x005f;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "۬۫ۧۖۖۜ۠ۢۦۡ۟ۧ۫ۘۜۘۨ۫ۡ"
            goto L_0x0002
        L_0x0014:
            r1 = 930264380(0x3772b53c, float:1.4466521E-5)
            java.lang.String r0 = "ۛۛۤ۬۫ۨۖۧۤۖ۫۫۟ۛۛ"
        L_0x0019:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case 832783320: goto L_0x005f;
                case 1132486507: goto L_0x0028;
                case 1221485090: goto L_0x002d;
                case 1783969050: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0019
        L_0x0022:
            java.lang.String r0 = "ۤ۠ۘ۬ۥۨۘۨ۠ۘۘۨۘۜۘۧۤ۠ۗۤۖۘ"
            goto L_0x0002
        L_0x0025:
            java.lang.String r0 = "ۙۢۜۚۜۚۙۦ۫ۨۢ۬ۤۜ۬ۘۨۗۨۨۥ۫ۖ"
            goto L_0x0019
        L_0x0028:
            if (r4 == 0) goto L_0x0025
            java.lang.String r0 = "ۨۗ۠ۙ۫ۥۘۗۤۦۡ۠ۘۤۧ۬ۤ۫ۜ۟ۛ"
            goto L_0x0019
        L_0x002d:
            java.lang.String r0 = "ۤۖۦۘۧۦۗ۟ۗۨ۫۠۟۠ۥۥۘ"
            goto L_0x0019
        L_0x0030:
            r1 = 140954316(0x866cacc, float:6.9451494E-34)
            java.lang.String r0 = "ۖۤۡۘۛ۫ۧۜۜۙۗۗۘۛۧۜۘۗ۠ۦ"
        L_0x0035:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1933476796: goto L_0x004a;
                case -1418698889: goto L_0x005c;
                case -848316228: goto L_0x004d;
                case -233833368: goto L_0x003e;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0035
        L_0x003e:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = "۠ۧۛۨۧۖ۠ۗۡۘۤ۠۫ۗۜۜۘۛۖۜ۟۫ۥۘۨۡۢ"
            goto L_0x0035
        L_0x0047:
            java.lang.String r0 = "ۧۘ۟ۚۧۖۧ۠ۥۦۥ۠۬ۙۘ"
            goto L_0x0035
        L_0x004a:
            java.lang.String r0 = "۟ۥۜۧۜۛۖۛ۬ۜۖۙۚۦۤ"
            goto L_0x0035
        L_0x004d:
            java.lang.String r0 = "ۘۘ۬ۗۛۗۢۘۛ۠ۨۡۘۖۦۡۘ"
            goto L_0x0002
        L_0x0050:
            java.lang.String r0 = "jid"
            java.lang.String r1 = stripJID(r4)
            com.obwhatsapp.yo.shp.setStringPriv(r0, r1)
            java.lang.String r0 = "۬۫ۗۛۡۛ۬ۨۨۘۡۙ۬ۨۘۖۛۗۗۤۡۛ"
            goto L_0x0002
        L_0x005c:
            java.lang.String r0 = "ۙۥۖۛۛ۠۟ۥۨۘۚ۫ۙۛۖۢۖۧۨۧۧۦۘۧۜۥ"
            goto L_0x0002
        L_0x005f:
            java.lang.String r0 = "۬۫ۗۛۡۛ۬ۨۨۘۡۙ۬ۨۘۖۛۗۗۤۡۛ"
            goto L_0x0002
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.setCurr_sJid(java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        r0 = "۠ۢۦۘۥۨۜۘۙۛۗۙ۬ۜ۟۫۠";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setDelIcon(android.widget.TextView r6, boolean r7) {
        /*
            r2 = 0
            java.lang.String r0 = "ۦۥۥۗۙۤۧۖۡۧۤۛ۬ۦۜۜۤ۫ۢۤۙۥۜۡۗۦ"
            r1 = r2
        L_0x0004:
            int r3 = r0.hashCode()
            r4 = 978(0x3d2, float:1.37E-42)
            r5 = -1493505474(0xffffffffa6faea3e, float:-1.7410726E-15)
            r3 = r3 ^ r4
            r3 = r3 ^ r5
            switch(r3) {
                case -1267542172: goto L_0x002c;
                case -1243833823: goto L_0x0019;
                case -959873342: goto L_0x008d;
                case -755684178: goto L_0x0064;
                case -600964249: goto L_0x0013;
                case 218267440: goto L_0x0083;
                case 1226056793: goto L_0x0048;
                case 1777568801: goto L_0x0098;
                case 2003731556: goto L_0x0016;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0004
        L_0x0013:
            java.lang.String r0 = "ۜۧۜۘ۫ۙۜۘۙۨۨۘۨۚ۫ۚۦۘۚ۫ۡۘۚۥۦۘ"
            goto L_0x0004
        L_0x0016:
            java.lang.String r0 = "ۖۗۜۙۦۙ۬ۦۡۜۙۦۘ۫۫۬ۗۚۘۘۜ۬ۦۘۥۢۖ"
            goto L_0x0004
        L_0x0019:
            android.content.Context r0 = getCtx()
            java.lang.String r1 = "message_got_receipt_revoked_alpha"
            java.lang.String r3 = "drawable"
            int r1 = getID(r1, r3)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00T.A04(r0, r1)
            java.lang.String r0 = "۬ۛۘۛۢۢۢ۠ۥۙۤۨۘۗۨۛۜۦۖۖۢۦ"
            goto L_0x0004
        L_0x002c:
            r3 = 161074266(0x999cc5a, float:3.702558E-33)
            java.lang.String r0 = "ۦۚۤۢۘۚۡ۠ۨۜۦۘۙۧ۬ۡۙۖۜۛۜۘۚ۠۠"
        L_0x0031:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1920294410: goto L_0x0045;
                case -1755895824: goto L_0x003a;
                case -590040260: goto L_0x0040;
                case 293696959: goto L_0x0094;
                default: goto L_0x0039;
            }
        L_0x0039:
            goto L_0x0031
        L_0x003a:
            java.lang.String r0 = "ۡ۬ۖ۠ۤۘۢۨۜ۬ۤۙۦۖ۬ۛ۠ۛۗۡۧۢۗۙ"
            goto L_0x0004
        L_0x003d:
            java.lang.String r0 = "ۙۧۦۥۙۥۘۧۨۡۖۗۜۘۘۛۦ"
            goto L_0x0031
        L_0x0040:
            if (r6 == 0) goto L_0x003d
            java.lang.String r0 = "۬۟ۖۤ۟ۘۥۗۨۡۨ۟ۤۡۥ"
            goto L_0x0031
        L_0x0045:
            java.lang.String r0 = "ۛۖۛۗۛۘۘۧۧۚۢۨ۫ۧ۫ۨۦۛ"
            goto L_0x0031
        L_0x0048:
            r3 = 726118516(0x2b47b074, float:7.094388E-13)
            java.lang.String r0 = "۟ۢۛۜۖۨۘ۠۟ۖۘۨۢۤۚۦۗۥۡۡۥۧۤۘۨۘ"
        L_0x004d:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1760341607: goto L_0x0061;
                case -1007730285: goto L_0x005c;
                case -285888605: goto L_0x0094;
                case 105015281: goto L_0x0056;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x004d
        L_0x0056:
            java.lang.String r0 = "ۦۙۡ۬۟ۛۙ۬۠۫۫ۗۨۡ۟"
            goto L_0x0004
        L_0x0059:
            java.lang.String r0 = "ۖۡۘۤۤۖۘۘ۫ۜۢۜ۠ۜۧۘۘ"
            goto L_0x004d
        L_0x005c:
            if (r1 == 0) goto L_0x0059
            java.lang.String r0 = "ۗۦۛۘۙۘۘۥ۫ۗۡۖ۬ۦۜۢۘۦۥۘۛۘۤ"
            goto L_0x004d
        L_0x0061:
            java.lang.String r0 = "ۢۢۜۘۨۛۚۜۙۡۘۚۖۚ۫ۘۦۨۘ۫۠ۤ"
            goto L_0x004d
        L_0x0064:
            r3 = 882499535(0x3499dfcf, float:2.8661313E-7)
            java.lang.String r0 = "ۙۦ۠ۛۙۜۗ۫ۡۘ۫ۥۗ۫۫"
        L_0x0069:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -780482360: goto L_0x0078;
                case 119758203: goto L_0x007d;
                case 1204546775: goto L_0x0072;
                case 1699072088: goto L_0x0080;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x0069
        L_0x0072:
            java.lang.String r0 = "ۘۖۦۘ۟ۗۥۘۖ۟۠ۢۚ۠ۖۘ"
            goto L_0x0004
        L_0x0075:
            java.lang.String r0 = "ۗۧۤۡۘۤۧ۫ۥۖ۫ۜۜۥ۫۫ۥۖۘۧۤۢۛ۬ۧۨ"
            goto L_0x0069
        L_0x0078:
            if (r7 == 0) goto L_0x0075
            java.lang.String r0 = "۟۟ۘۖۡۙۤۥۗۢ۫۫ۡ۬ۦۘۧۨۤۛۙۦۘ"
            goto L_0x0069
        L_0x007d:
            java.lang.String r0 = "ۢۦۧۜۜۙۡۤۘۘۖۘ۟ۤۡۡۘۧ۬ۨۡۡۢ"
            goto L_0x0069
        L_0x0080:
            java.lang.String r0 = "ۦۦ۠۟ۢۘۘۜۘۡۦ۠ۧۗۗۗ۫۠ۘۚۦۘۚۚۧۚۥۙ"
            goto L_0x0004
        L_0x0083:
            r0 = -1
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r1.setColorFilter(r0, r3)
            java.lang.String r0 = "ۘۖۦۘ۟ۗۥۘۖ۟۠ۢۚ۠ۖۘ"
            goto L_0x0004
        L_0x008d:
            r6.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r2, r2)
            java.lang.String r0 = "۠ۢۦۘۥۨۜۘۙۛۗۙ۬ۜ۟۫۠"
            goto L_0x0004
        L_0x0094:
            java.lang.String r0 = "۠ۢۦۘۥۨۜۘۙۛۗۙ۬ۜ۟۫۠"
            goto L_0x0004
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.setDelIcon(android.widget.TextView, boolean):void");
    }

    public static void setGID(GroupChatInfoActivity groupChatInfoActivity, C15830rv r6) {
        String str = null;
        String str2 = "ۥۛۚۘۘۛۥۜ۠ۜۧۜ۬ۜۖۦۙۜ";
        while (true) {
            switch ((str2.hashCode() ^ 774) ^ 157611343) {
                case -2097793604:
                    str2 = "ۦۛۥۢ۬ۗۧۖۖۚۜۦ۟ۨۥۘۛۡ۬";
                    break;
                case -1928018837:
                    str2 = "ۢۧۘۨ۫۟ۗۗۦۚۛۖۡۛۜۢۗۖۘۦۛۜۘۙ۬ۚ";
                    break;
                case -1344493767:
                    str = dep.getJID_t(r6);
                    str2 = "۫ۥۖۖۖۦ۠ۥۘۦۚ۠ۨ۠ۛ۬ۢۖۖ۠۟۠ۨۦۢۥ";
                    break;
                case -786437371:
                    setCurr_sJid(str);
                    str2 = "۬۬ۖۛ۬ۖۚۗۖۦۧۧۜۖ۟۫ۧ۟ۢۥ۠";
                    break;
                case 277849514:
                    groupChatInfoActivity.Counter = u1.GetGroupMsgsCount(str);
                    str2 = "۫۠ۜۘۙ۬ۡۘۜۘۥۘۨۦۡۨۖۨۘۧۢۘ";
                    break;
                case 601026991:
                    return;
            }
        }
    }

    public static void setGroupBoolean(boolean z2) {
        String str = "ۧۢ۫ۘۢۗۖۧۨ۫ۚۥۗۘۧ";
        while (true) {
            switch ((str.hashCode() ^ 786) ^ 1390454781) {
                case 393382917:
                    str = "۬۫ۧۢۖۤۤ۟ۜۤ۠۬ۜۦۙۦۨۘۥۘۢ۟ۛۜۘۧۖۘ";
                    break;
                case 1375793103:
                    shp.setBooleanPriv("is_group_chat", z2);
                    str = "ۘۘۙۚ۬ۗۛۦ۬ۧ۫۬ۗۡۡۘۚۗۙ";
                    break;
                case 1670457223:
                    return;
            }
        }
    }

    public static void setHOp(boolean z2) {
        String str = "ۧ۠ۜۘ۟ۙۥۘ۫ۜۧۜۤۜۘۦ۠ۖ";
        while (true) {
            switch ((str.hashCode() ^ 799) ^ 1736600212) {
                case -1693229452:
                    F = z2;
                    str = "ۖۡۧۘۗۤۡۘۥۚ۟ۗۢۥۥ۫ۨۤۘۧۡ۫ۡ";
                    break;
                case -1249845777:
                    str = "ۜۥۘۙ۫ۡۘۘۗۥۘۜۚۗ۬ۦ۟ۢۨ۟۬ۙۚۨۗۘ";
                    break;
                case 449490781:
                    return;
            }
        }
    }

    public static void setHideSeen(boolean z2) {
        String str = "ۖۢۜۘۤۚ۫ۙۜۜۘۚۙ۠ۥۛۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 65) ^ -1635891054) {
                case -950491564:
                    return;
                case 63194289:
                    str = "ۨۗۡۘۡۛۥۘۦۧۚۡ۟ۛۧۢۡۦۧۘ";
                    break;
                case 1861384571:
                    shp.setBooleanPriv("yoHideSeen", z2);
                    str = "۬ۙۘۥۧۡۛۛ۟ۤۧۦۨۡۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setLanguage() {
        /*
            android.content.SharedPreferences r0 = com.obwhatsapp.yo.shp.f874a     // Catch:{ Exception -> 0x0135 }
            java.lang.String r1 = "Language"
            java.lang.String r2 = "0"
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ Exception -> 0x0135 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0135 }
            switch(r0) {
                case 1: goto L_0x005b;
                case 2: goto L_0x0057;
                case 3: goto L_0x0053;
                case 4: goto L_0x004f;
                case 5: goto L_0x004b;
                case 6: goto L_0x0047;
                case 7: goto L_0x0043;
                case 8: goto L_0x0011;
                case 9: goto L_0x003f;
                case 10: goto L_0x003b;
                case 11: goto L_0x0011;
                case 12: goto L_0x0011;
                case 13: goto L_0x0037;
                case 14: goto L_0x0011;
                case 15: goto L_0x0033;
                case 16: goto L_0x0011;
                case 17: goto L_0x002f;
                case 18: goto L_0x002b;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.String r0 = "def"
            r2 = r0
        L_0x0014:
            java.lang.String r0 = "def"
            boolean r1 = r2.equals(r0)     // Catch:{ Exception -> 0x0135 }
            r3 = 1611848829(0x6012dc7d, float:4.2329883E19)
            java.lang.String r0 = "۠ۖ۫۫ۧۛ۬ۡۨۥ۬ۚۧ۫"
        L_0x001f:
            int r4 = r0.hashCode()     // Catch:{ Exception -> 0x0135 }
            r4 = r4 ^ r3
            switch(r4) {
                case -526594871: goto L_0x00fd;
                case -503396132: goto L_0x0067;
                case 542094419: goto L_0x0062;
                case 1704713132: goto L_0x0028;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x001f
        L_0x0028:
            java.lang.String r0 = "ۥۚۡ۠ۙۤۨۢۨۘۚۜۥ۠ۨۜۡ۫ۤۤۥۢ"
            goto L_0x001f
        L_0x002b:
            java.lang.String r0 = "az"
            r2 = r0
            goto L_0x0014
        L_0x002f:
            java.lang.String r0 = "ur"
            r2 = r0
            goto L_0x0014
        L_0x0033:
            java.lang.String r0 = "in"
            r2 = r0
            goto L_0x0014
        L_0x0037:
            java.lang.String r0 = "ru"
            r2 = r0
            goto L_0x0014
        L_0x003b:
            java.lang.String r0 = "tr"
            r2 = r0
            goto L_0x0014
        L_0x003f:
            java.lang.String r0 = "de"
            r2 = r0
            goto L_0x0014
        L_0x0043:
            java.lang.String r0 = "pa"
            r2 = r0
            goto L_0x0014
        L_0x0047:
            java.lang.String r0 = "hi"
            r3 = r0
            goto L_0x0014
        L_0x004b:
            java.lang.String r0 = "pt-BR"
            r2 = r0
            goto L_0x0014
        L_0x004f:
            java.lang.String r0 = "it"
            r2 = r0
            goto L_0x0014
        L_0x0053:
            java.lang.String r0 = "es"
            r2 = r0
            goto L_0x0014
        L_0x0057:
            java.lang.String r0 = "en_US"
            r2 = r0
            goto L_0x0014
        L_0x005b:
            java.lang.String r0 = "ar"
            r2 = r0
            goto L_0x0014
        L_0x005f:
            java.lang.String r0 = "ۡۙۨۤۜ۠ۨۙۧۜۦۢۚۙ۟ۚۦۦۙ۠ۧ۠ۘۘ"
            goto L_0x001f
        L_0x0062:
            if (r1 == 0) goto L_0x005f
            java.lang.String r0 = "ۧۖۙۙ۬ۦۘ۫ۡۘۤۥۜۘ۬ۡۖۘۡۘۜۘۦ۠ۥ"
            goto L_0x001f
        L_0x0067:
            r1 = 1191410554(0x47037b7a, float:33659.477)
            java.lang.String r0 = "ۤۥ۟ۦۚۢ۠ۦ۬ۧۢۗۚۧۥ"
        L_0x006c:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x0135 }
            r3 = r3 ^ r1
            switch(r3) {
                case -1081095335: goto L_0x00ef;
                case 455731265: goto L_0x00f3;
                case 1680478568: goto L_0x00e5;
                case 1840411359: goto L_0x0075;
                default: goto L_0x0074;
            }     // Catch:{ Exception -> 0x0135 }
        L_0x0074:
            goto L_0x006c
        L_0x0075:
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0135 }
        L_0x0079:
            android.content.SharedPreferences$Editor r0 = com.obwhatsapp.yo.shp.stockLightPrefs     // Catch:{ Exception -> 0x0135 }
            java.lang.String r3 = "forced_language"
            java.lang.String r4 = r1.getLanguage()     // Catch:{ Exception -> 0x0135 }
            android.content.SharedPreferences$Editor r0 = r0.putString(r3, r4)     // Catch:{ Exception -> 0x0135 }
        L_0x0085:
            r0.commit()     // Catch:{ Exception -> 0x0135 }
            java.util.Locale.setDefault(r1)     // Catch:{ Exception -> 0x0135 }
            android.content.Context r0 = getCtx()     // Catch:{ Exception -> 0x0135 }
            android.content.res.Resources r3 = r0.getResources()     // Catch:{ Exception -> 0x0135 }
            android.content.res.Configuration r4 = r3.getConfiguration()     // Catch:{ Exception -> 0x0135 }
            r5 = 1094167449(0x4137ab99, float:11.479394)
            java.lang.String r0 = "۫ۜۨۘۢۜۜۗ۫۬۠۠ۢۘ۫ۦۘۡۡۨۢۗۢ"
        L_0x009c:
            int r6 = r0.hashCode()     // Catch:{ Exception -> 0x0135 }
            r6 = r6 ^ r5
            switch(r6) {
                case -790978011: goto L_0x0147;
                case -546716985: goto L_0x00a5;
                case -143214465: goto L_0x014b;
                case 1696314476: goto L_0x013b;
                default: goto L_0x00a4;
            }     // Catch:{ Exception -> 0x0135 }
        L_0x00a4:
            goto L_0x009c
        L_0x00a5:
            r4.setLayoutDirection(r1)     // Catch:{ Exception -> 0x0135 }
        L_0x00a8:
            r4.locale = r1     // Catch:{ Exception -> 0x0135 }
            r4.setLocale(r1)     // Catch:{ Exception -> 0x0135 }
            r1 = -715030990(0xffffffffd5617e32, float:-1.54957576E13)
            java.lang.String r0 = "ۡۛۢۥۢۥۢۜۗ۬ۖ۠ۜ۬ۤ۬ۚ۫ۘۥۥ"
        L_0x00b2:
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x0135 }
            r2 = r2 ^ r1
            switch(r2) {
                case -1876176213: goto L_0x0165;
                case -1613231420: goto L_0x015b;
                case -513776548: goto L_0x0169;
                case -159592256: goto L_0x00bb;
                default: goto L_0x00ba;
            }     // Catch:{ Exception -> 0x0135 }
        L_0x00ba:
            goto L_0x00b2
        L_0x00bb:
            r0 = 32
        L_0x00bd:
            int r1 = r4.uiMode     // Catch:{ Exception -> 0x0135 }
            r1 = r1 & -49
            r0 = r0 | r1
            r4.uiMode = r0     // Catch:{ Exception -> 0x0135 }
            android.util.DisplayMetrics r0 = r3.getDisplayMetrics()     // Catch:{ Exception -> 0x0135 }
            r3.updateConfiguration(r4, r0)     // Catch:{ Exception -> 0x0135 }
            android.content.Context r0 = getCtx()     // Catch:{ Exception -> 0x0135 }
            android.content.Context r1 = r0.createConfigurationContext(r4)     // Catch:{ Exception -> 0x0135 }
            r2 = 846859807(0x327a0e1f, float:1.4555126E-8)
            java.lang.String r0 = "ۘۛۦۘۡۛۨۘۥۛۘۘۛۥۧۦۤ۟"
        L_0x00d8:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x0135 }
            r3 = r3 ^ r2
            switch(r3) {
                case -915754042: goto L_0x0171;
                case -748244663: goto L_0x00e1;
                case 712118937: goto L_0x017b;
                case 1311508875: goto L_0x0177;
                default: goto L_0x00e0;
            }     // Catch:{ Exception -> 0x0135 }
        L_0x00e0:
            goto L_0x00d8
        L_0x00e1:
            return
        L_0x00e2:
            java.lang.String r0 = "۠ۢۡۘۖ۬ۖۤۖۥۘۗۜۧۘۥ۬ۜۘۤۥ۫ۘۡۨۘۙ۠ۘۘ"
            goto L_0x006c
        L_0x00e5:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0135 }
            r3 = 24
            if (r0 < r3) goto L_0x00e2
            java.lang.String r0 = "ۨۡۜۘۥۤ۫ۜۤۢۗۢۡۖۧ۟ۢ۬ۨۜۨۘ۫ۘ۫۠ۡۙ"
            goto L_0x006c
        L_0x00ef:
            java.lang.String r0 = "ۢۧۨۘۤۚۧۡۦۘۢ۫ۡۘۙ۫ۦۘ"
            goto L_0x006c
        L_0x00f3:
            android.os.LocaleList r0 = com.obwhatsapp.yo.m1.a()     // Catch:{ Exception -> 0x0135 }
            java.util.Locale r1 = com.obwhatsapp.yo.m1.b(r0)     // Catch:{ Exception -> 0x0135 }
            goto L_0x0079
        L_0x00fd:
            r1 = 1614851641(0x6040ae39, float:5.553639E19)
            java.lang.String r0 = "ۥۧۖ۬ۤۚۧۛۜۘۢۡۡۘۦ۠ۥ۫ۖۖۘۚۨۥ"
        L_0x0102:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x0135 }
            r3 = r3 ^ r1
            switch(r3) {
                case -1272484900: goto L_0x012c;
                case -351212214: goto L_0x0121;
                case 574849047: goto L_0x012f;
                case 626194375: goto L_0x010b;
                default: goto L_0x010a;
            }     // Catch:{ Exception -> 0x0135 }
        L_0x010a:
            goto L_0x0102
        L_0x010b:
            java.util.Locale r1 = new java.util.Locale     // Catch:{ Exception -> 0x0135 }
            java.lang.String r0 = "pt"
            java.lang.String r3 = "BR"
            r1.<init>(r0, r3)     // Catch:{ Exception -> 0x0135 }
        L_0x0114:
            android.content.SharedPreferences$Editor r0 = com.obwhatsapp.yo.shp.stockLightPrefs     // Catch:{ Exception -> 0x0135 }
            java.lang.String r3 = "forced_language"
            android.content.SharedPreferences$Editor r0 = r0.putString(r3, r2)     // Catch:{ Exception -> 0x0135 }
            goto L_0x0085
        L_0x011e:
            java.lang.String r0 = "۫ۦۤ۠ۧۘۘۜۜۢۨۡۚۖۖۛۚۘۘ"
            goto L_0x0102
        L_0x0121:
            java.lang.String r0 = "pt-BR"
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x0135 }
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = "۟۬ۦۘ۫ۨۘ۟ۜۘ۠ۡۘۖۡۦۨ۬۬"
            goto L_0x0102
        L_0x012c:
            java.lang.String r0 = "ۢ۟ۖۘ۠ۙۘۘۤۢۦۘۧۗ۟۠ۙ۫ۤۧۨ۬ۥۡ۬ۤ۟ۤۖۥۘ"
            goto L_0x0102
        L_0x012f:
            java.util.Locale r1 = new java.util.Locale     // Catch:{ Exception -> 0x0135 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0135 }
            goto L_0x0114
        L_0x0135:
            r0 = move-exception
            goto L_0x00e1
        L_0x0137:
            java.lang.String r0 = "ۦۜۤۧ۬ۨۢۛۤۢۗ۫ۙۗۨۘۦۢۜۢۗ۠۟۬ۤ"
            goto L_0x009c
        L_0x013b:
            java.lang.String r0 = "pt-BR"
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x0135 }
            if (r0 == 0) goto L_0x0137
            java.lang.String r0 = "ۖۛۨۤ۬ۡۘۜۗۜۘۘۤ۫۟ۖۨۘۘۥۖۘ"
            goto L_0x009c
        L_0x0147:
            java.lang.String r0 = "ۥ۠ۜۘۖۤۤ۟ۚۚۦۧۜۨۜۡۘ"
            goto L_0x009c
        L_0x014b:
            java.util.Locale r0 = new java.util.Locale     // Catch:{ Exception -> 0x0135 }
            java.lang.String r2 = "en_US"
            r0.<init>(r2)     // Catch:{ Exception -> 0x0135 }
            r4.setLayoutDirection(r0)     // Catch:{ Exception -> 0x0135 }
            goto L_0x00a8
        L_0x0157:
            java.lang.String r0 = "ۘ۟ۦۘۨۙۘۥۡ۬ۚۥۤ۟ۦ۬"
            goto L_0x00b2
        L_0x015b:
            boolean r0 = isNightModeActive()     // Catch:{ Exception -> 0x0135 }
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = "ۤۤۛۜ۬ۜۘ۬۟ۗۤۢ۬ۤ۫ۥۘۥۖۖۛۗۥۖۚ۬"
            goto L_0x00b2
        L_0x0165:
            java.lang.String r0 = "۟ۗۨۤ۠۟ۛۧ۫ۢۢۡۛۘ"
            goto L_0x00b2
        L_0x0169:
            r0 = 16
            goto L_0x00bd
        L_0x016d:
            java.lang.String r0 = "ۧۢۤۢ۠ۜۘۙۨۦۥۨۥۡۦۢ۬۫ۜۡ۫۫ۧۡ۬ۡۜۜۘ"
            goto L_0x00d8
        L_0x0171:
            if (r1 == 0) goto L_0x016d
            java.lang.String r0 = "۠ۢۥۘۛۨۦۢۢۛۜ۟ۙۥۧۢۤۖۖ۠ۖۖۡۘ"
            goto L_0x00d8
        L_0x0177:
            java.lang.String r0 = "۟۠ۜۘ۠ۛۥۧۙ۠ۡ۬ۨۨۖۜۘۗ۬ۡ"
            goto L_0x00d8
        L_0x017b:
            f125q = r1     // Catch:{ Exception -> 0x0135 }
            goto L_0x00e1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.setLanguage():void");
    }

    public static float setSQPC(float f2) {
        int i2 = 0;
        String str = "۟ۙۥۜۖۡ۠ۡ۟ۚۚ۠ۥ۟ۙۜ۠ۜۘۨ۫ۚۖ۠ۧۥۢۜ";
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 226) ^ 1787340385) {
                case -1096391531:
                    str = "ۤۧۡۘۘۧ۫ۜۧ۟ۚ۠۟ۨۚ۟ۡۘۚۙۤ";
                    i2 = setSQPC(-1);
                    break;
                case -992140411:
                    str = "ۥۙۥۘۜۨۗ۟ۥۤۨۨۡ۫ۡۦ۠۠ۛ۟ۛۥۘۜۖۘۘۛۥۙ";
                    break;
                case -681776101:
                    str = "ۚۥۜۙۜۧۤۧۜۘۢۡۡۡ۬ۦۥ۬ۘ۟ۘۤۛ";
                    break;
                case -366391433:
                    return f4;
                case 818389177:
                    str = "ۥۙۥۘۜۨۗ۟ۥۤۨۨۡ۫ۡۦ۠۠ۛ۟ۛۥۘۜۖۘۘۛۥۙ";
                    f4 = f3;
                    break;
                case 1087994671:
                    f3 = (float) i2;
                    str = "ۘۙۖ۬ۨۢ۟ۥۡۧۛۡۘۨۦ۬ۧۧ۫ۧۧۨۨ۬";
                    break;
                case 1786840302:
                    str = "ۢۡۘۘۛۨ۟ۛۤۘۙۚۢۨۚۙۛ۟";
                    f4 = f2;
                    break;
                case 2096810187:
                    String str2 = "ۘۗۨۨۡۦۤۜۤۗۢۨۤۜ";
                    while (true) {
                        switch (str2.hashCode() ^ -1191575634) {
                            case -352967698:
                                str = "ۦۘ۫ۖ۟۟ۥۘۗۚۧۧ۫ۗۜۛۛۧ۟ۦۗۚۡۘۘ";
                                continue;
                            case 414735075:
                                if (i2 != -1) {
                                    str2 = "ۧۥۨۘۦۙۛۦۜۘۨۨۦۜۚ۠";
                                    break;
                                } else {
                                    str2 = "ۗۛۙۗۗۚۤ۟ۨۘۛۤۤۤۥۗ۟ۧۜۙۤۨۧۘ";
                                    break;
                                }
                            case 573498122:
                                str = "ۗۥۧۘۜۡۤ۠ۢۧۦۢ۫ۢۘۚۥۡۦۘۜ۬ۤ";
                                continue;
                            case 1567082603:
                                str2 = "ۤ۬ۡۘۧۖ۠ۖۖۘۘۧ۠ۜۘۚ۬ۤ۫۠";
                                break;
                        }
                    }
                    break;
            }
        }
    }

    public static float setSQPC(Context context, float f2) {
        String str = "ۤۙۨۧۥۛۦ۫ۥۘۘۦۧۘۥۢۙۜ۫ۖۢۙۘ۟ۢ";
        while (true) {
            switch ((str.hashCode() ^ 96) ^ -285366075) {
                case -1565685516:
                    str = "ۛۘ۬۟ۘۧۘۦۛۘۘۘۜۤ۟ۜۢۛۗۡۘۤۡۘۗۤۡۘ";
                    break;
                case 944320028:
                    shp.init(context);
                    str = "ۛۘۨۧۙۧۙۚۖۚۚ۟ۛۘۘ";
                    break;
                case 1618565629:
                    str = "ۘۦۡۘۘۦۥۘ۫۠ۜۘۚۦۨۗۤۡۘۛۘۙۦ۠ۜ۠ۘۘ";
                    break;
                case 1623796098:
                    return setSQPC(f2);
            }
        }
    }

    public static int setSQPC(int i2) {
        SharedPreferences sharedPreferences = shp.prefs;
        String str = "۟۟ۤۖۘۦۘۦ۟ۥۘ۬ۡۜۘۗۚۧۢۦۖ";
        while (true) {
            switch (str.hashCode() ^ 1481236573) {
                case -843105922:
                    if (sharedPreferences != null) {
                        str = "ۧۜۧۘۥۜۘۨۤۘۦۢۥۜۧۙ۬ۢۗۛۤۨ۬ۙ";
                        break;
                    } else {
                        str = "ۦۢۧ۠ۘۢۢۨۘ۠ۜۙۨۧۜۚۡۘ";
                        break;
                    }
                case -451019613:
                    str = "ۜۡۙۤ۫ۦۨۜۘۘۙۨۧۗۛۙۧۡۢۥۤۦۜۗۦۚۤ";
                    break;
                case 1235521575:
                    return i2;
                case 1841382060:
                    try {
                        int i3 = sharedPreferences.getInt("square_photo_ratio_picker", -1);
                        String str2 = "ۚ۫۠ۡ۠ۤۡۗۘۘ۠۟ۤۙ۬ۥۘۦۢۜۜۨۥۘۥۜ";
                        while (true) {
                            switch (str2.hashCode() ^ -1509062475) {
                                case -1496824026:
                                    String str3 = "ۦۨۡۥ۠ۚۡۘۛۚ۟۫ۙۡۢ۬ۧۢۨ۠ۜۢۛ";
                                    while (true) {
                                        switch (str3.hashCode() ^ 107069716) {
                                            case -319203452:
                                                return i3;
                                            case 13538547:
                                                str3 = "ۦۛۘۧ۠۬ۚۢ۬ۙۤۢۚۙۘۘ۠ۖۢ۟ۖۨۚۦ۬۟۬۬";
                                                break;
                                            case 1457115962:
                                                if (i3 != 100) {
                                                    str3 = "۬ۗۛۗ۫ۨۘۢۦۖۡۤۜۤۨ۬ۥ۠ۜۘۛۖۡۘۤۢۜۘ";
                                                    break;
                                                } else {
                                                    str3 = "۫ۜۜ۫ۢۦۡۡ۟ۧۨ۬ۨۚۘۥۤۙۧۤۜۥۖۢۖۧ";
                                                    break;
                                                }
                                            case 1709335314:
                                                return i2;
                                        }
                                    }
                                    break;
                                case -1225275532:
                                    str2 = "ۥۨۦ۬ۤۡۘۗۗ۫ۤۧۖۘۜۥۚ";
                                    break;
                                case -746180754:
                                    return i2;
                                case -232283806:
                                    if (i3 == -1) {
                                        str2 = "ۧۖۗ۬ۖۨ۬ۘ۫۫۟ۤۥۘۜۛۦۖۘۥۘۜۤ۫ۡۘۢۨۙ";
                                        break;
                                    } else {
                                        str2 = "ۧ۬ۚۨۧۦۜۦۜۚۖۗۙۘۚۗۖۘۤۖۗ۠ۗۜۘۛۦ۫";
                                        break;
                                    }
                            }
                        }
                    } catch (Exception e2) {
                        return i2;
                    }
                    break;
            }
        }
    }

    public static void setSingleton(C16150sX r4) {
        String str = "۠ۤ۬ۨۥۚۖۛ۫ۘ۟ۚۡۦ۠۠ۜۚ";
        while (true) {
            switch ((str.hashCode() ^ 733) ^ 563569491) {
                case -819301828:
                    mSingletonC = r4;
                    str = "ۘ۟ۥۨ۬۬ۡۡ۟ۘۥ۟ۨۧۥۘ";
                    break;
                case -745432405:
                    str = "ۥۨۦۘۜۦۙ۫ۨۢ۬۠ۚۥۖۘۚۜۨۘۜ۠ۨۘ";
                    break;
                case -304224639:
                    return;
            }
        }
    }

    public static void setStatusesFragment(StatusesFragment statusesFragment) {
        String str = "ۛ۬ۛۡۤۘۤۦۘۧ۬ۜ۟ۛۨۘۨۦۢۘۤ۠ۥۖۧۘ";
        while (true) {
            switch (str.hashCode() ^ 1366062243) {
                case -1446402314:
                    try {
                        mInnerStatusesFragment = statusesFragment;
                        IGStatusesView iGStatusesView = (IGStatusesView) Homeac.findViewById(getID("yo_igstories_holder", "id"));
                        mIGStatusesView = iGStatusesView;
                        iGStatusesView.setStatusesFragment();
                        return;
                    } catch (Exception e2) {
                        return;
                    }
                case -421650999:
                    if (HomeUI.IGStoriesEnabled()) {
                        str = "ۡۖ۠ۤۨۨۘ۫ۢۚ۫ۖۧۛۚۦ۫ۡۚ";
                        break;
                    } else {
                        str = "ۦۨ۟ۖۘۘۘۖۖۡۘۦۜۘۥ۬";
                        break;
                    }
                case 93339339:
                    return;
                case 2042985200:
                    str = "ۙۥۦۘ۬ۡ۬ۘۦۙۨۜۛۦۗۛۙۛ۟";
                    break;
            }
        }
    }

    public static void setWALocaleManager(AnonymousClass013 r4) {
        String str = "ۖ۫ۘۘۢ۟ۥۥۡۘۘۛۡۘۚۧۦۘۘۛ۠۟۠ۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 185) ^ -1502417912) {
                case -1683650009:
                    return;
                case -1655723739:
                    f133y = r4;
                    str = "۠ۙۘۘ۬ۖ۠ۛۨۡۘۜۢۥۜۥۙۥۘۗۤۤۘۘۦۖۗۗۗ۫";
                    break;
                case -852928887:
                    str = "ۦ۫۫ۗ۟ۗۥۙۘۤۙ۫۫۫۠۬ۨۡۘۜۘۛ۟ۜۘ";
                    break;
            }
        }
    }

    public static void showHChatsLockSetupDlg(Activity activity) {
        String str = "۫ۛۜۤۙۖۡۘۛۛ۬ۥۘۨۛۢۤۤ";
        LockOptions lockOptions = null;
        while (true) {
            switch ((str.hashCode() ^ 21) ^ -353303084) {
                case -1570557731:
                    str = "ۨۙۡۘۚۘ۫ۛۛۜۘۧ۠۠ۙۡۗ";
                    break;
                case -1208785240:
                    lockOptions = new LockOptions();
                    str = "۫۫ۧۖۧۨۘۡۘۘۘۡ۟ۢۛۛۙۨۗۥۗۚۖ۬ۖۜ";
                    break;
                case -384267881:
                    return;
                case 284974667:
                    LockUtils.showAvailableLockTypes(activity, lockOptions);
                    str = "۠ۢۦۘۦۤۙۘۖۦۤۙۨۥۦۤ۬ۡ۫ۛ۠۠";
                    break;
                case 1540413568:
                    lockOptions.setConversation(false).setChangePass(true).setJID(hideJidCode).setPassedIntent((Intent) null).setDisableLock(false).setJustCloseAfterSuccess(true);
                    str = "ۥ۫ۡۘ۟ۛۚۥ۫۬ۖۢۜ۟ۚ۟ۤۥۤ";
                    break;
            }
        }
    }

    public static void showHChatsSettings(Activity activity) {
        int i2 = 0;
        String string = getString("settings_notifications");
        String string2 = getString("hide_shakeHome");
        String string3 = getString("settings_notification_sound");
        String string4 = getString("settings_notification_vibrate");
        String string5 = getString("forward_to");
        String[] strArr = {a.f(new StringBuilder(), hideJidCode, "_shownotif"), a.f(new StringBuilder(), hideJidCode, "_animatehome"), a.f(new StringBuilder(), hideJidCode, "_playsound"), a.f(new StringBuilder(), hideJidCode, "_vibrate"), a.f(new StringBuilder(), hideJidCode, "_showinforward")};
        CharSequence[] charSequenceArr = {string, string2, string3, string4, string5};
        AlertDialog create = new CustomAlertDialogBuilder(activity).setTitle((CharSequence) getString("menuitem_settings")).setMultiChoiceItems(charSequenceArr, (boolean[]) null, (DialogInterface.OnMultiChoiceClickListener) new q1(strArr, 0)).setPositiveButton(17039370, (DialogInterface.OnClickListener) new x(10)).create();
        create.show();
        ListView listView = create.getListView();
        while (true) {
            String str = "ۧۚۡۗ۫ۛۗۖۖۘۙۘۥۘۛۙۦ۫ۙۘۤۨۦۘۤۛۦۘۛۨ۫";
            while (true) {
                switch (str.hashCode() ^ 1187175249) {
                    case -2143129040:
                        return;
                    case -1041633019:
                        str = "ۙۢۜۘۜۦۥۘۛ۠۬ۗۢۦۧۚۦۘۦۢۤ";
                        break;
                    case 1235670908:
                        try {
                            listView.setItemChecked(i2, shp.getBooleanPriv(strArr[i2]));
                            i2++;
                        } catch (Exception e2) {
                            return;
                        }
                    case 1938114176:
                        if (i2 >= 5) {
                            str = "ۖ۫ۙ۬ۥۥ۫ۡۗۡۨۡۘ۠ۜۥۘۜ۬ۢ۠ۥۨۘ";
                            break;
                        } else {
                            str = "۫ۜۜۘۨۖ۟ۙ۬ۥۢ۫۫ۤ۫ۥۢۖۧۥۧۖۘۡۧۧ";
                            break;
                        }
                }
            }
        }
    }

    public static boolean showHiddenInForward() {
        StringBuilder sb = null;
        String str = "ۙۧۡۦ۠ۜۘۗۘۖۢۗۢ۬ۘۡ۟ۗۦۘۚۚۘۖۨ";
        while (true) {
            switch ((str.hashCode() ^ 802) ^ -56873170) {
                case -1847455936:
                    sb = new StringBuilder();
                    str = "۠ۦۘۘۢۚۜۘۢۗۗۖۨۦ۫ۨۥۘۢ۠ۥۜۧۜۗ۠ۜۘۡۥۚ";
                    break;
                case -1434239225:
                    sb.append(hideJidCode);
                    str = "ۜ۟۠ۚ۟ۛۦۧۥۘۙۘۘ۬ۙۡۘ۫ۜۗۘۡۙۛۧۖۘۦۤ۠";
                    break;
                case 584211030:
                    sb.append("_showinforward");
                    str = "ۗۙۖۘۥۡۥۙ۠ۨۨ۫ۖۖۖۤۜۘۨۘۜۨۖ۫ۛ۬ۨ";
                    break;
                case 997994769:
                    return shp.getBooleanPriv(sb.toString());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean start_bl() {
        /*
            java.lang.String r0 = "ۙۦۧۘۖ۫ۡۘۛۢۘۚۜۛۦۚۖۨۨۨ۠۠ۦۧ۟ۗ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 677(0x2a5, float:9.49E-43)
            r3 = -446059759(0xffffffffe569ab11, float:-6.896669E22)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 507045125: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "start_bl"
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.start_bl():boolean");
    }

    public static void statusSplitter(Activity activity) {
        String str = "ۢۨۦۘۧۤۤۡۜۙۗۛۥۗۚۘۘۤۜۥۘۤۛۥ";
        while (true) {
            try {
                switch (str.hashCode() ^ 1682125103) {
                    case -1211977694:
                        str = "ۙ۫ۘۘۤۗۨۘ۬ۦۧۙۚۦۖۖۘۧۗ۟ۡۤۜۘ۬ۤۜۗ۟ۥ";
                        break;
                    case 115483745:
                        Toast.makeText(getCtx(), getString("permission_storage_need_access"), 0).show();
                        return;
                    case 484427297:
                        if (!utils.isStorageGranted()) {
                            str = "۠ۚ۬ۗۜۘۢۢۡۘۤۨۗ۠ۧۡ۫ۡۥۘۡۢۡۘ۬ۚ";
                            break;
                        } else {
                            str = "ۖ۫ۡۘ۬ۛۡ۫ۥۚ۬ۦ۬۬ۡ";
                            break;
                        }
                    case 1157950643:
                        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI, activity, GalleryPicker.class);
                        intent.putExtra("max_items", 1).putExtra("is_in_multi_select_mode_only", 0).putExtra("preview", false).putExtra("picker_open_time", SystemClock.elapsedRealtime()).putExtra("include_media", 4);
                        Intent intent2 = new Intent("android.intent.action.PICK");
                        intent2.addFlags(1);
                        intent2.addFlags(64);
                        intent2.setDataAndType(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, "video/*");
                        Intent createChooser = Intent.createChooser(intent2, (CharSequence) null);
                        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
                        activity.startActivityForResult(createChooser, 1285);
                        return;
                }
            } catch (Exception e2) {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean statuschat_disabled() {
        /*
            java.lang.String r0 = "ۜۚۥۘۢۧۛۖ۫ۜۘۗ۟ۦ۠ۗۙۖۡۛ۬ۨ۫۫ۘۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 542(0x21e, float:7.6E-43)
            r3 = -848009551(0xffffffffcd7466b1, float:-2.56273168E8)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -98573347: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "statuschat"
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.statuschat_disabled():boolean");
    }

    public static String stripJID(String str) {
        String str2 = "ۙۖ۬ۥۖۦۡ۠ۖۘۜۢۙۧۖۡۘۢۛ۫ۚۗۡۘ۬ۨۜ";
        while (true) {
            try {
                switch (str2.hashCode() ^ 754708246) {
                    case -1183933990:
                        if (!str.contains("@g.us")) {
                            str2 = "ۤۢۘۖۦۥۧۖۖ۫ۨۦۥۘۥ";
                            break;
                        } else {
                            str2 = "ۥۜۦۖ۬ۨۘۗۘۧۘۥۗۡۜۤۚۦۙۥۨۖۚ";
                            continue;
                        }
                    case 285137010:
                        break;
                    case 753645947:
                        String str3 = "ۚ۫ۖۥ۬ۥۥۡۙۙ۟۠ۧ۟ۚۤۦۘۜ۬ۡۙۦۧۘ۫ۨۨ";
                        while (true) {
                            switch (str3.hashCode() ^ 1784058891) {
                                case -1524681324:
                                    str3 = "ۖۤۤۖۙۛۥۛۘۘ۠ۦۦۘۢۥۡۘۘۙۦ";
                                    continue;
                                case -218778384:
                                    String str4 = "ۤ۫ۡۘۚۥۖۘۢۢ۠ۖۨۚۛۥۙۘۦۧۘۗۥۧۘ";
                                    while (true) {
                                        switch (str4.hashCode() ^ 605023298) {
                                            case -1677668241:
                                                str4 = "۬ۧۛ۬ۘۧۨ۬۠۫ۤۡۖ۟ۦۘۨۥۦۚۥۧۘۜۦۡۡۡۡ";
                                                continue;
                                            case 1126177903:
                                                break;
                                            case 1587662360:
                                                if (!str.contains("@broadcast")) {
                                                    str4 = "ۙۛۜۤۡۦۘۤۜۧۖۘۧۘ۟ۤۙۗۦ۬";
                                                    break;
                                                } else {
                                                    str4 = "ۜ۫ۡۘۜۥۢ۠ۚۘۘۗۖۗۛ۬ۘ۫ۢ۠";
                                                    continue;
                                                }
                                            case 1918895936:
                                                return str;
                                            default:
                                                continue;
                                        }
                                    }
                                case -60501811:
                                    if (!str.contains("@s.whatsapp.net")) {
                                        str3 = "۫ۡۨۘۡۚۘ۬ۢۡۘۜۘۤۚ۬ۚۘۗۜۡۡۖ";
                                        break;
                                    } else {
                                        str3 = "۠ۢۥۢۢۦۘۘۦۖۤۤۖۘ۟ۙۚۡۧۧ";
                                        continue;
                                    }
                                case 1937589789:
                                    break;
                                default:
                                    continue;
                            }
                        }
                    case 1935451427:
                        str2 = "۠۠ۛۥۜۡۢ۠ۚۖۡۘۘۚۘۥۚۡۡۘ";
                        continue;
                    default:
                        continue;
                }
            } catch (Exception e2) {
                return str;
            }
        }
        return str.substring(0, str.indexOf("@"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean wantsSpecific() {
        /*
            java.lang.String r0 = "ۖۢۨۘ۟ۖۖۙۙۤ۫ۗۡۘ۟"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 880(0x370, float:1.233E-42)
            r3 = 1049438838(0x3e8d2a76, float:0.27571458)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1037707971: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = getCurr_sJid()
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.wantsSpecific():boolean");
    }

    public static boolean wantsSpecific(String str) {
        String str2 = "۫ۦ۠ۚۚ۟ۘۦۧۧۙ۫ۡۢۚ";
        while (true) {
            switch ((str2.hashCode() ^ 716) ^ 1533705226) {
                case -1681087985:
                    return shp.getBooleanPriv(str);
                case -550783591:
                    str2 = "ۥۚۨۘ۫ۥۛۡۦۛۙۙۦۘۥۥۘۢۜ۟ۜۧۧۘۡۖۥ۫ۙ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void yo(android.content.Context r12) {
        /*
            r2 = 16
            r11 = 5
            r10 = 0
            r4 = 0
            r3 = 1
            f125q = r12
            com.obwhatsapp.youbasha.app.initApp(r12)
            com.AssemMods.accounts.Utils.initAccounts(r12)
            android.content.SharedPreferences r0 = com.obwhatsapp.yo.shp.prefs
            android.content.Context r0 = getCtx()     // Catch:{ Exception -> 0x00ab }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ Exception -> 0x00ab }
            com.obwhatsapp.yo.shp.f877d = r0     // Catch:{ Exception -> 0x00ab }
            java.lang.String r0 = com.obwhatsapp.yo.shp.getFontName()     // Catch:{ Exception -> 0x00ab }
            com.obwhatsapp.yo.shp.f878e = r0     // Catch:{ Exception -> 0x00ab }
            com.obwhatsapp.yo.l1 r0 = com.obwhatsapp.yo.l1.f800a     // Catch:{ Exception -> 0x00ab }
            com.obwhatsapp.yo.shp.a(r0)     // Catch:{ Exception -> 0x00ab }
            com.obwhatsapp.yo.l1 r0 = com.obwhatsapp.yo.l1.f801b     // Catch:{ Exception -> 0x00ab }
            com.obwhatsapp.yo.shp.a(r0)     // Catch:{ Exception -> 0x00ab }
        L_0x002a:
            com.obwhatsapp.emoji.cem.initEm()
            int r0 = com.obwhatsapp.yo.u1.returnINum(r4)
            int r5 = r0 + 2
            r0 = -16662818815425(0xfffff0d8629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            r6 = -1320301983(0xffffffffb14dca61, float:-2.9946465E-9)
            java.lang.String r0 = "ۜۢۧ۠ۖۜۧ۬۟ۜۡۥۘۧۖۨ۟ۛۜۘ۟ۗۤۖ۬ۘ"
        L_0x0041:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -1658561642: goto L_0x00b9;
                case -1644369893: goto L_0x00b4;
                case -1587639581: goto L_0x0310;
                case -24683465: goto L_0x004a;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x0041
        L_0x004a:
            r0 = -16671408750017(0xfffff0d6629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r6 = -16701473521089(0xfffff0cf629a823f, double:NaN)
            java.lang.String r6 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.obwhatsapp.yo.u1.f889l = r1
        L_0x006d:
            r6 = 53648619(0x3329ceb, float:5.248963E-37)
            java.lang.String r1 = "ۡۥۖۨۘۦ۬ۨ۬ۦۖۙۘ۫ۙۗ۬ۦۘ۠ۥۘ"
        L_0x0072:
            int r7 = r1.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -1993516888: goto L_0x00bf;
                case 273278053: goto L_0x007b;
                case 1706018089: goto L_0x009a;
                case 2117541072: goto L_0x00d1;
                default: goto L_0x007a;
            }
        L_0x007a:
            goto L_0x0072
        L_0x007b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.obwhatsapp.yo.u1.f889l
            r0.append(r1)
            r0.append(r5)
            r6 = -16989236329921(0xfffff08c629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.obwhatsapp.yo.u1.f889l = r0
        L_0x009a:
            r1 = -1697880952(0xffffffff9acc6488, float:-8.453484E-23)
            java.lang.String r0 = "ۙۚ۠ۨۧۗ۫ۘۡۦۦۚۖ۟ۚۦۡۜۦ۟ۨۛ۫ۙۛۢۥ"
        L_0x009f:
            int r5 = r0.hashCode()
            r5 = r5 ^ r1
            switch(r5) {
                case -1797227459: goto L_0x00d7;
                case -859257976: goto L_0x00a8;
                case 23135412: goto L_0x024e;
                case 1032284423: goto L_0x00e4;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            goto L_0x009f
        L_0x00a8:
            java.lang.String r0 = "ۘۚۥۙۚۖۢ۫ۥۘۤۖۗۨۛۚۚۢۤ۟ۧ۫ۙۖۘۘ۟ۚ"
            goto L_0x009f
        L_0x00ab:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x002a
        L_0x00b1:
            java.lang.String r0 = "ۜۚۦۘۡۧۘ۬ۨۥۘ۠ۙ۬۠ۙۖۡۤۨۘۢۛۥۘۖ۟ۘ۬ۦۥۘ"
            goto L_0x0041
        L_0x00b4:
            if (r5 >= r11) goto L_0x00b1
            java.lang.String r0 = "ۛۙۦۘۙۘۧۘۥۤۦۜۖۦۨۨۧۗۜۧ۠۟ۜۘۜۘ"
            goto L_0x0041
        L_0x00b9:
            java.lang.String r0 = "ۧۨۧۘۧۡۧۘۖۘۧۘۚ۫ۤ۬ۢۖۥۢۚۢۙۜ۟۟ۛ"
            goto L_0x0041
        L_0x00bc:
            java.lang.String r1 = "ۧۥۡۘ۬ۤ۬ۖ۬ۤۡۖۜۘ۫۠ۗ"
            goto L_0x0072
        L_0x00bf:
            r8 = -16980646395329(0xfffff08e629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r8)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00bc
            java.lang.String r1 = "۟ۡۦۡۢ۟۠ۢ۠ۗۚۜۘ۫۫ۖۘۚ۫ۡۘ۠۟ۨۘۛۨۦۘ"
            goto L_0x0072
        L_0x00d1:
            java.lang.String r1 = "ۛۙۛۨۘ۟ۜۜۦۨۖۘۦ۫ۡۘ۟ۛ"
            goto L_0x0072
        L_0x00d4:
            java.lang.String r0 = "ۛۙۦۗۖ۫ۖۥۗۦ۟ۜۘۚ۟ۡۨۡۘ"
            goto L_0x009f
        L_0x00d7:
            int r0 = com.obwhatsapp.youbasha.task.utils.vs()
            int r5 = com.obwhatsapp.yo.u1.returnINum(r3)
            if (r0 != r5) goto L_0x00d4
            java.lang.String r0 = "ۖۜۘۘ۫۟ۦۘۖۚۥۘۡۥۜۤۗۨ"
            goto L_0x009f
        L_0x00e4:
            setLanguage()
            com.obwhatsapp.youbasha.others.init()
            serverProps()
            com.obwhatsapp.yo.u1.setUpdateURLOLD()
            m()
            android.database.sqlite.SQLiteDatabase r0 = com.obwhatsapp.yo.a.f608a
            java.lang.Class<com.obwhatsapp.yo.a> r0 = com.obwhatsapp.yo.a.class
            monitor-enter(r0)
            r1 = -1215711913(0xffffffffb789b557, float:-1.6416116E-5)
            java.lang.String r0 = "۟۟۟۠ۙۜۘۧ۠ۨۘۘ۟ۤ۠ۦۘۜۖۨۘ"
        L_0x00fd:
            int r5 = r0.hashCode()     // Catch:{ all -> 0x02bb }
            r5 = r5 ^ r1
            switch(r5) {
                case -2005697183: goto L_0x0110;
                case -559534517: goto L_0x0106;
                case 590243275: goto L_0x0120;
                case 1431813100: goto L_0x0113;
                default: goto L_0x0105;
            }     // Catch:{ all -> 0x02bb }
        L_0x0105:
            goto L_0x00fd
        L_0x0106:
            com.obwhatsapp.yo.a r0 = com.obwhatsapp.yo.a.f609b     // Catch:{ all -> 0x02bb }
            if (r0 != 0) goto L_0x010d
            java.lang.String r0 = "ۨۙۜ۫۫ۡۤ۫ۗۧۗۘۘۨۧۛۥۘۡۛۚۤۙۦ"
            goto L_0x00fd
        L_0x010d:
            java.lang.String r0 = "ۥۧۨۘۖۨۜۘۖۙۚۢ۠ۗۡۘۙ۠ۘ۟ۧۦۢ"
            goto L_0x00fd
        L_0x0110:
            java.lang.String r0 = "ۤۘۧۘۖۗۖۘۘۖۧۘ۫ۘۢۡ۠ۥۤ۠ۘۘۜ۠۬ۘ۟ۦ"
            goto L_0x00fd
        L_0x0113:
            com.obwhatsapp.yo.a r0 = new com.obwhatsapp.yo.a     // Catch:{ all -> 0x02bb }
            r0.<init>(r12)     // Catch:{ all -> 0x02bb }
            com.obwhatsapp.yo.a.f609b = r0     // Catch:{ all -> 0x02bb }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ all -> 0x02bb }
            com.obwhatsapp.yo.a.f608a = r0     // Catch:{ all -> 0x02bb }
        L_0x0120:
            com.obwhatsapp.yo.a r0 = com.obwhatsapp.yo.a.f609b     // Catch:{ all -> 0x02bb }
            java.lang.Class<com.obwhatsapp.yo.a> r1 = com.obwhatsapp.yo.a.class
            monitor-exit(r1)     // Catch:{ all -> 0x02bb }
            f126r = r0     // Catch:{ all -> 0x02bb }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x02bb }
            r0.<init>()     // Catch:{ all -> 0x02bb }
            com.obwhatsapp.yo.p0.f842a = r0     // Catch:{ all -> 0x02bb }
            java.util.HashSet r0 = com.obwhatsapp.youbasha.ui.activity.CallsPrivacy.getActiveList()     // Catch:{ all -> 0x02bb }
            com.obwhatsapp.yo.dep.callsList = r0     // Catch:{ all -> 0x02bb }
            java.lang.String r0 = "text_size_pick"
            r1 = 16
            int r0 = com.obwhatsapp.yo.shp.getPrefInt(r0, r1)     // Catch:{ all -> 0x02bb }
            com.obwhatsapp.yo.dep.f95a = r0     // Catch:{ all -> 0x02bb }
            java.lang.String r0 = "ModChatBubbleText"
            int r1 = com.obwhatsapp.yo.ColorStore.getDefaultChatBubbleTextColor()     // Catch:{ all -> 0x02bb }
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r1)     // Catch:{ all -> 0x02bb }
            com.obwhatsapp.yo.dep.f97c = r0     // Catch:{ all -> 0x02bb }
            java.lang.String r0 = "ModChatBubbleTextLeft"
            int r1 = com.obwhatsapp.yo.ColorStore.getDefaultChatBubbleTextColor()     // Catch:{ all -> 0x02bb }
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r1)     // Catch:{ all -> 0x02bb }
            com.obwhatsapp.yo.dep.f98d = r0     // Catch:{ all -> 0x02bb }
            boolean r0 = com.obwhatsapp.youbasha.task.utils.isArabic()     // Catch:{ all -> 0x02bb }
            com.obwhatsapp.yo.dep.f99e = r0     // Catch:{ all -> 0x02bb }
            java.lang.String r0 = "myNumV2"
            r1 = 0
            java.lang.String r1 = com.obwhatsapp.yo.shp.getStringPriv(r0, r1)     // Catch:{ all -> 0x02bb }
            r5 = 483198475(0x1ccd060b, float:1.3567324E-21)
            java.lang.String r0 = "ۚۨۦۘ۠ۦۦۘۤۜۡۘۥۡۧ۫ۜۨ۟ۤۨۥ۟"
        L_0x0168:
            int r6 = r0.hashCode()     // Catch:{ all -> 0x02bb }
            r6 = r6 ^ r5
            switch(r6) {
                case -1902933439: goto L_0x0171;
                case -1821449663: goto L_0x0177;
                case -1702635040: goto L_0x019b;
                case 250926136: goto L_0x017c;
                default: goto L_0x0170;
            }
        L_0x0170:
            goto L_0x0168
        L_0x0171:
            java.lang.String r0 = "ۧۡۛۡ۬ۜۘۨ۠ۨۘۡۛ۟ۘۖۡۨۦ۟ۤۘۚ"
            goto L_0x0168
        L_0x0174:
            java.lang.String r0 = "۟ۜۜۘۜ۟ۖۜ۠۟ۧۢۥ۫ۙۤۧۛ۬"
            goto L_0x0168
        L_0x0177:
            if (r1 == 0) goto L_0x0174
            java.lang.String r0 = "ۜۘ۠ۧۨۘۜ۠ۥۦۜۢۤۜ۠ۖۦۧۨۥۜ۬ۗۧ"
            goto L_0x0168
        L_0x017c:
            r5 = 1426957406(0x550da45e, float:9.7335682E12)
            java.lang.String r0 = "ۥۢۡۖۡۦۤۢۜۘ۠ۦۜۘ۟۟ۡۥۖۘۘۤۜۡۘۥ۠ۥۘ"
        L_0x0181:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -722547255: goto L_0x030d;
                case -499738513: goto L_0x018a;
                case 1130266636: goto L_0x019b;
                case 1534511362: goto L_0x0190;
                default: goto L_0x0189;
            }
        L_0x0189:
            goto L_0x0181
        L_0x018a:
            java.lang.String r0 = "ۚۤۛۗۜۡۖۘۧۘۚۧۖ۫ۤۤۚۗۨۘۜۥۨ"
            goto L_0x0181
        L_0x018d:
            java.lang.String r0 = "ۦۦۘۘۙۖۗۡۥۘۖۦۛ۫ۧۥۙۦۦۘ"
            goto L_0x0181
        L_0x0190:
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x018d
            java.lang.String r0 = "۠۬ۤ۫ۧۘۘۤ۠ۡۜۚۥۘ۬ۚۡ"
            goto L_0x0181
        L_0x019b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.SharedPreferences r1 = com.obwhatsapp.yo.shp.stockPrefsLight
            java.lang.String r5 = "registration_jid"
            java.lang.String r1 = r1.getString(r5, r10)
            r0.append(r1)
            java.lang.String r1 = "@s.whatsapp.net"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x01b4:
            com.obwhatsapp.yo.dep.myNum = r0
            r1 = -1056854873(0xffffffffc101aca7, float:-8.104651)
            java.lang.String r0 = "ۚ۬ۛ۫ۨۜۜۚۛ۠۟ۘۚۨۘۘ۬ۛۧۗ۟ۚۡ۠ۜۘۜۥ"
        L_0x01bb:
            int r5 = r0.hashCode()
            r5 = r5 ^ r1
            switch(r5) {
                case -1901552872: goto L_0x030a;
                case -862424906: goto L_0x01f9;
                case 188791790: goto L_0x01c4;
                case 1558679193: goto L_0x01f2;
                default: goto L_0x01c3;
            }
        L_0x01c3:
            goto L_0x01bb
        L_0x01c4:
            r0 = 17
        L_0x01c6:
            com.obwhatsapp.yo.dep.f96b = r0
            r1 = 1238895971(0x49d80d63, float:1769900.4)
            java.lang.String r0 = "ۨۢۜ۫ۙۦۘ۟ۙ۠۟ۙۥۘۘۘ"
        L_0x01cd:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1976974541: goto L_0x01d6;
                case 860987504: goto L_0x020a;
                case 1006785348: goto L_0x020d;
                case 1706945138: goto L_0x01ff;
                default: goto L_0x01d5;
            }
        L_0x01d5:
            goto L_0x01cd
        L_0x01d6:
            r1 = 1293702119(0x4d1c53e7, float:1.6392152E8)
            java.lang.String r0 = "۫ۗۡۘۚۙۙۨۖۡۡۦۙۖۜۥۘ۬ۙۧ"
        L_0x01db:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1732171577: goto L_0x022e;
                case -435531393: goto L_0x0226;
                case 1395015912: goto L_0x0223;
                case 1712942094: goto L_0x01e4;
                default: goto L_0x01e3;
            }
        L_0x01e3:
            goto L_0x01db
        L_0x01e4:
            java.lang.String r0 = "installation_v941"
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            if (r0 != 0) goto L_0x0220
            java.lang.String r0 = "ۦ۠ۜۘۚۖ۟ۢۡۙۤۘۤۢۨۖۘۙۛۦۘۤۚۜۥۛۦۘ"
            goto L_0x01db
        L_0x01ef:
            java.lang.String r0 = "ۤ۬ۘۨۤۡۘۙۖۦۖۖ۟ۘۥۘ۫۬ۦۘۧۡۗۢۛۘۘ۫ۧ۬"
            goto L_0x01bb
        L_0x01f2:
            boolean r0 = com.obwhatsapp.yo.dep.f99e
            if (r0 == 0) goto L_0x01ef
            java.lang.String r0 = "ۥ۬ۨۘۦۙ۬ۧ۠ۜۘۖۧۘۘ۫ۛۜ۠۫ۖۘ"
            goto L_0x01bb
        L_0x01f9:
            java.lang.String r0 = "۟ۧ۟۫ۨ۟ۜۧۛ۠ۗۙ۬۬ۨۘ۫ۧۗۗۢۚۥۧۘۛۘۡۘ"
            goto L_0x01bb
        L_0x01fc:
            java.lang.String r0 = "ۖۜۥۘۧۥۙۥۖۗ۬۬ۥۜ۫"
            goto L_0x01cd
        L_0x01ff:
            java.lang.String r0 = "installation_v930"
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            if (r0 != 0) goto L_0x01fc
            java.lang.String r0 = "ۥۖۥۘۡ۟ۜۧۚ۟ۥۦۨۚۛۥۘ۠ۧۢۙۚۘۘۗۖۘ۟ۙۥۘ"
            goto L_0x01cd
        L_0x020a:
            java.lang.String r0 = "ۗۜۚ۫۫ۙ۠۟ۨۘ۬ۥۥ۬ۥۙ"
            goto L_0x01cd
        L_0x020d:
            java.lang.Thread r0 = new java.lang.Thread
            com.obwhatsapp.yo.d0 r1 = new com.obwhatsapp.yo.d0
            r1.<init>(r11)
            r0.<init>(r1)
            r0.start()
            java.lang.String r0 = "installation_v930"
            com.obwhatsapp.yo.shp.setBooleanPriv(r0, r3)
            goto L_0x01d6
        L_0x0220:
            java.lang.String r0 = "ۦۦۥۦۘۘۚۛ۫۠ۡ۠ۨ۟ۥۘ"
            goto L_0x01db
        L_0x0223:
            java.lang.String r0 = "ۢۘۘۘۗۜۥۘۨۛۢۢۢۘۢۥۗۖۛۥۜۡۥۘۥۢۘۘ"
            goto L_0x01db
        L_0x0226:
            com.obwhatsapp.yo.z.c(r4)
            java.lang.String r0 = "installation_v941"
            com.obwhatsapp.yo.shp.setBooleanPriv(r0, r3)
        L_0x022e:
            r1 = 1653186490(0x62899fba, float:1.2693567E21)
            java.lang.String r0 = "ۘۜۡۚۗۖ۟ۚ۠ۦ۫ۨ۬ۗۗۗۘۘۘ۫ۗۡۙۦۗۗۨۥۘ"
        L_0x0233:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -30261512: goto L_0x024b;
                case 331095798: goto L_0x02ab;
                case 1981338491: goto L_0x023c;
                case 2021383650: goto L_0x02b7;
                default: goto L_0x023b;
            }
        L_0x023b:
            goto L_0x0233
        L_0x023c:
            clearWALogs()
            android.content.Context r0 = getCtx()
            com.obwhatsapp.yo.FMBackupReceiver.a(r0)
            java.lang.String r0 = "installation_v960"
            com.obwhatsapp.yo.shp.setBooleanPriv(r0, r3)
        L_0x024b:
            com.obwhatsapp.yo.u1.b(r10)
        L_0x024e:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 6
            int r1 = r0.get(r1)
            java.lang.String r2 = "lastWCheck"
            int r0 = r0.get(r3)
            java.lang.String r2 = a.a.d(r2, r0)
            r5 = -1752512007(0xffffffff978ac9f9, float:-8.969026E-25)
            java.lang.String r0 = "۫ۨۥۘ۟ۗۨۤۤۥۦۡۛ۬ۤۥۘۖۨۖۚۛۦ"
        L_0x0266:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -430635407: goto L_0x026f;
                case 1257123109: goto L_0x02d2;
                case 1455065758: goto L_0x02c3;
                case 1613355694: goto L_0x02cf;
                default: goto L_0x026e;
            }
        L_0x026e:
            goto L_0x0266
        L_0x026f:
            com.obwhatsapp.yo.shp.setIntPriv(r2, r1)
            r0 = r3
        L_0x0273:
            r2 = -859433763(0xffffffffccc614dd, float:-1.03851752E8)
            java.lang.String r1 = "ۢۛۖ۬ۥۧۘۢۧۘۘ۠ۢۡۗ۟ۖۛۛۖۗۜۖ"
        L_0x0278:
            int r5 = r1.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -1985033005: goto L_0x02dc;
                case 1171714979: goto L_0x0281;
                case 1504984470: goto L_0x0284;
                case 2051434379: goto L_0x02d7;
                default: goto L_0x0280;
            }
        L_0x0280:
            goto L_0x0278
        L_0x0281:
            clearWALogs()
        L_0x0284:
            java.io.File r1 = com.obwhatsapp.youbasha.task.utils.getShpPrivXML()
            r2 = -1303898528(0xffffffffb2481660, float:-1.164662E-8)
            java.lang.String r0 = "ۜۛۥۘۥۚۚ۠۟ۥۘ۫۟ۨۘۛۚۖۛۡۛ"
        L_0x028d:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -2089251232: goto L_0x02ee;
                case -1261703401: goto L_0x0296;
                case -484848151: goto L_0x02eb;
                case 1828720199: goto L_0x02e2;
                default: goto L_0x0295;
            }
        L_0x0295:
            goto L_0x028d
        L_0x0296:
            r1 = 2064631562(0x7b0fc70a, float:7.4653544E35)
            java.lang.String r0 = "ۗ۫ۥۘ۠ۜۨۘ۟ۢۨ۠۬ۢۥۘ۬ۚۥۧۦۘۘۢۧ۠ۢۗۜۘ"
        L_0x029b:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1567722574: goto L_0x02a4;
                case -1029727385: goto L_0x0300;
                case 157834593: goto L_0x02a7;
                case 461006284: goto L_0x0305;
                default: goto L_0x02a3;
            }
        L_0x02a3:
            goto L_0x029b
        L_0x02a4:
            rebootYo()
        L_0x02a7:
            return
        L_0x02a8:
            java.lang.String r0 = "ۖۦۜۘ۫ۜۖۗۥۤ۬ۢ۬ۧۘۦۘۙۖ۠۬ۦ۬ۜ۫ۜ"
            goto L_0x0233
        L_0x02ab:
            java.lang.String r0 = "installation_v960"
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            if (r0 != 0) goto L_0x02a8
            java.lang.String r0 = "۠۟ۥۜۙۗۨۨۜۘۙۘۥۘۛۨ۟ۤۛ۟"
            goto L_0x0233
        L_0x02b7:
            java.lang.String r0 = "ۛۜۨۚۦ۫ۥۖۥۡۖۥۘۧۦۘۤ۫ۨ۬ۗۘ"
            goto L_0x0233
        L_0x02bb:
            r0 = move-exception
            java.lang.Class<com.obwhatsapp.yo.a> r1 = com.obwhatsapp.yo.a.class
            monitor-exit(r1)
            throw r0
        L_0x02c0:
            java.lang.String r0 = "ۗۧ۠ۧۨ۬ۗۛۘۙۢۡۘۡۨۚۦۗۚۥۜۢ"
            goto L_0x0266
        L_0x02c3:
            int r0 = com.obwhatsapp.yo.shp.getIntPriv(r2)
            int r0 = r1 - r0
            r6 = 7
            if (r0 <= r6) goto L_0x02c0
            java.lang.String r0 = "ۦۙۛۡۡۖۘۧۙۧۨۚ۟ۡۚۡۤۙ۫ۢۚ۟"
            goto L_0x0266
        L_0x02cf:
            java.lang.String r0 = "ۥۗۦ۫ۢۖۘ۬ۤۖۘۡۙۧۚۨ۟ۜۧۜ"
            goto L_0x0266
        L_0x02d2:
            r0 = r4
            goto L_0x0273
        L_0x02d4:
            java.lang.String r1 = "ۢۚۜۚۙۛۡ۬۠ۦۢۥ۟ۗۢۡۙۨۤۦ۬ۘۜۧ"
            goto L_0x0278
        L_0x02d7:
            if (r0 == 0) goto L_0x02d4
            java.lang.String r1 = "ۧ۫ۥۘۦ۠ۘ۬ۛۢۜۤ۠ۗۛۢۢۜۚ"
            goto L_0x0278
        L_0x02dc:
            java.lang.String r1 = "ۜ۫ۜۖۤۜۤۥۘۘۗۚۘۘۧۨۡۘۨ۟ۘۙۨۦ۟ۢۨۢۖۤ"
            goto L_0x0278
        L_0x02df:
            java.lang.String r0 = "ۨ۠۫ۤ۬ۘۘۨۘ۠ۤۙۦۖۨۡۘ۟ۥۖۘۛۤۨۤۛ۠"
            goto L_0x028d
        L_0x02e2:
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x02df
            java.lang.String r0 = "۫ۖۥۘ۠ۤۧۧۗ۬ۧۘۖۘ۠ۙ۬"
            goto L_0x028d
        L_0x02eb:
            java.lang.String r0 = "ۖۜۧۘۖۤۧۛ۠ۗۥ۫ۘۡ۫ۖۛۡۘ۟ۦ۫۠۫ۛۘۚۖ"
            goto L_0x028d
        L_0x02ee:
            java.io.File r0 = com.obwhatsapp.youbasha.task.utils.getShpXML()
            r0.setWritable(r3)
            r0.delete()
            r1.createNewFile()     // Catch:{ IOException -> 0x0308 }
            r4 = r3
            goto L_0x0296
        L_0x02fd:
            java.lang.String r0 = "ۨۖۖۘۡۥۧۘ۬۠ۘۡۨۢۢۡۘ۬ۚۨۙۦۡۚۗ۟"
            goto L_0x029b
        L_0x0300:
            if (r4 == 0) goto L_0x02fd
            java.lang.String r0 = "ۢۤۘۘۖ۠ۡۘۛۦۥۘۡ۠ۤۙۘۤۦۤۦۘۙۢۗۡۘۚ"
            goto L_0x029b
        L_0x0305:
            java.lang.String r0 = "ۚۥۥۗۚۥۢۡۦۘۧۨۚۚۚۢۨۛۨۘۚ۟ۖۘۢۖۘ"
            goto L_0x029b
        L_0x0308:
            r0 = move-exception
            goto L_0x0296
        L_0x030a:
            r0 = r2
            goto L_0x01c6
        L_0x030d:
            r0 = r1
            goto L_0x01b4
        L_0x0310:
            r0 = r1
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.yo(android.content.Context):void");
    }

    public static boolean yoHideComposeG() {
        String str = "۟ۗۨۙۦۗۛۧۦۘۜۗۡۤۦۗ";
        String str2 = null;
        String str3 = null;
        String str4 = null;
        StringBuilder sb = null;
        while (true) {
            switch ((str.hashCode() ^ 879) ^ -242678684) {
                case -2136965491:
                    str4 = "yoHideComposeG";
                    str = "ۜۚۡ۟ۨۤ۠ۡۡۥۡۤۦۖۥۘۜۗ۟ۤۨۧۡۦۖۧ۟";
                    break;
                case -2127303977:
                    return shp.getBooleanPriv(str3);
                case -2112220500:
                    str = "ۢ۟ۖۦۥۦۘۗۥۖ۠ۥۛۛۨۨ۫۟ۥۛۢ۫ۚۧۨۘۨۢۙ";
                    str3 = str4;
                    break;
                case -1973700998:
                    sb.append(getCurr_sJid());
                    str = "ۛ۫ۚۛۚۥ۟ۡۖۡۘۡۘۖۧۛ۫ۙۦ۫ۨۥۘۚ۬ۢ";
                    break;
                case -1931752601:
                    str = "ۦ۠ۚۙۦۙۥۥۘۨۜۖۘۥۦۙۚۧۖۦۙۖۘ۟ۖۛ";
                    break;
                case 120542828:
                    String str5 = "ۛۨۤۧۤۚۚۥۨۤۧۥۘ۬ۖۨۨۢ۫ۚۢ";
                    while (true) {
                        switch (str5.hashCode() ^ 499422568) {
                            case -808400610:
                                str5 = "ۗۥۘۘۗۛۜۘ۫ۚۚۨ۠ۘۖۨۢۢۨۡۘۖۙۡۤۤ";
                                break;
                            case -484827328:
                                if (!wantsSpecific()) {
                                    str5 = "ۙ۬ۛۧ۠ۢۨۢۘ۫۠ۥۡۡۜۡۦۜۢۙۢۢۜۜۘۛۤۦ";
                                    break;
                                } else {
                                    str5 = "ۙۧۥۘۤ۫ۨۘۖۤۡۘ۟ۡۦۗ۬ۤ۟ۢۡ";
                                    break;
                                }
                            case 679036604:
                                str = "ۗۛۨۘۗۥۖۜ۠۫ۘۖۥۘۤۛۚ۬ۤۨۘ";
                                continue;
                            case 1960298402:
                                str = "ۧۧۖۢۢۢۗۙۡۘ۠ۤۜ۠ۛۛ۬ۨۗ۬ۖۡ";
                                continue;
                        }
                    }
                    break;
                case 451566348:
                    str = "ۨ۬ۚۡۥۧۘۥ۠ۢ۟ۙۘۡۖۜۘۢۜۦۘۦۧۥ۫ۗ";
                    sb = new StringBuilder("yoHideCompose_");
                    break;
                case 538009799:
                    return shp.getBooleanPriv(sb.toString());
                case 1457912002:
                    String str6 = "ۢۤۥۘۨۜۘ۬ۡۖۗۘ۬ۖۧۤۧۦ۫ۜۚ۠۬ۨۥۘۡ۫ۦ";
                    while (true) {
                        switch (str6.hashCode() ^ 837906525) {
                            case -2120294640:
                                str6 = "ۥ۬ۧۜۖۘۥ۟ۨۘۡۚۢۡۡۘۛۘۡۚۡۢۡ۫ۦ";
                                break;
                            case -871144013:
                                str = "ۘۨ۫ۦ۫ۨۘۢۜۥۢۜۘۧۚ۬۠۬ۚۧۛۛۙۨۤ";
                                continue;
                            case 1372151039:
                                str = "ۚۦۖۨۚ۠ۗۛۘۘۗ۫ۡۙۥۡۘ۬ۖۧۘ";
                                continue;
                            case 1501631392:
                                if (!getGroupBoolean()) {
                                    str6 = "ۗ۟ۙۨۘۧۘۡۘۘۘۖۡۥۢ۬ۙۜۚ۬۟۠ۘ۫۠ۖۗ۟";
                                    break;
                                } else {
                                    str6 = "ۤۡۨۘۡۥۗۚۥ۟ۙۗۘۤ۫ۘۘۧۡ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1855002152:
                    str2 = "yoHideComposeC";
                    str = "ۙۨۖۢۖۡۘ۬ۖۥۘۙۧۜۢۨۡۨۧۜۤۜۦۘ";
                    break;
                case 1969192992:
                    str = "ۦ۠ۚۙۦۙۥۥۘۨۜۖۘۥۦۙۚۧۖۦۙۖۘ۟ۖۛ";
                    str3 = str2;
                    break;
            }
        }
    }

    public static boolean yoHidePlay() {
        String str = "ۥۖۖۘۜ۠۠ۙۨۗۙۚۡۘۖۡ۟ۚۧۖۡۖۙۥۦۛ۠ۗۖ";
        String str2 = null;
        String str3 = null;
        String str4 = null;
        StringBuilder sb = null;
        while (true) {
            switch ((str.hashCode() ^ 579) ^ -431647143) {
                case -1059671159:
                    String str5 = "ۘۧ۟ۡۥۜۚۜۤ۟۟ۖۘۙۨۖۘ";
                    while (true) {
                        switch (str5.hashCode() ^ 1928699804) {
                            case -1782709531:
                                str = "ۥۦۡۘۘۦۘۖۡۨۗۡۘۤ۬ۙۢۘۧ۠ۨۜۘۡۖۨۘ";
                                continue;
                            case 170529809:
                                str = "ۖۡۡۚۙ۫ۖۖۘۘۗۘۚۧۨۨ۫ۜۖ۫ۛ۫ۤۛۢۡۨ";
                                continue;
                            case 604999385:
                                str5 = "ۦۙۨۘۘۚۚۢۧۖۘ۫ۚۛ۬ۡۗۖۙۢ";
                                break;
                            case 1696846513:
                                if (!getGroupBoolean()) {
                                    str5 = "۫۟ۦۘۨۦ۬۬ۗۡ۫ۚۜۗۚۜۦۜۥۘۖۜۚۧۗۚ";
                                    break;
                                } else {
                                    str5 = "ۛ۠۟۬ۗۖۘۛۢۥۘۦ۟ۖۘ۠۟۠";
                                    break;
                                }
                        }
                    }
                    break;
                case -548156879:
                    str = "ۛۙۖۜۜۘۘ۫ۨۨۘۛۜۡۚ۬ۙ۫ۙ۠ۡۤۚۨ۟ۛ";
                    str3 = str2;
                    break;
                case 85030421:
                    str = "۟ۦۜۧۖۧۗۚۦۛۡۚۧۥۘ";
                    sb = new StringBuilder("yoHidePlay_");
                    break;
                case 108588107:
                    str = "ۛۙۖۜۜۘۘ۫ۨۨۘۛۜۡۚ۬ۙ۫ۙ۠ۡۤۚۨ۟ۛ";
                    break;
                case 813521513:
                    return shp.getBooleanPriv(str3);
                case 844624767:
                    return shp.getBooleanPriv(sb.toString());
                case 1345960962:
                    str4 = "yoHidePlayG";
                    str = "۟ۙۛۧۢۗ۫ۢ۬ۘۤۥۨۖۨۘ۬ۥۜۘۙۚ۠";
                    break;
                case 1425731207:
                    String str6 = "۠ۥۦۜۢۖۛۜۘۚ۠ۦۗ۟ۛۢۚ۠";
                    while (true) {
                        switch (str6.hashCode() ^ 291568179) {
                            case -429863202:
                                if (!wantsSpecific()) {
                                    str6 = "ۘۖۙۜۥ۫۠۠ۧۤۖ۫ۤۜۨۗۢۤ";
                                    break;
                                } else {
                                    str6 = "ۗۨۖۘ۬ۡۙۥۗۡۨۧۚ۠ۥۧۨۨۜۘۘۜۗۦۖۚ";
                                    break;
                                }
                            case 355611933:
                                str = "ۧۗ۟ۦۨ۬ۨ۟ۦ۫۬ۗۥۧ۟ۚۖۢۢۧۜۘ۠ۨۤۤ۫ۦ";
                                continue;
                            case 1040418027:
                                str6 = "ۜۧۛ۬ۙۤۜ۬ۥۘۜۘۦۘۛۨۤۘۘۚۙۘۨ";
                                break;
                            case 1850760017:
                                str = "۬ۜۗ۫۠ۥۘۚ۟ۜۤ۠ۢ۬۬ۦ۠ۦۜۖ۟۬۠ۜۘۥۥۚ";
                                continue;
                        }
                    }
                    break;
                case 1725054871:
                    str = "ۘۡۧۘۙۤ۠ۘۛۗۥ۠۠ۨ۬ۤۤۤۦۥۧۥ";
                    str3 = str4;
                    break;
                case 1822724764:
                    sb.append(getCurr_sJid());
                    str = "ۡ۬ۥۡۦۢۤ۠ۘۤۘۘۤۡۘۨۗۦۘۡۘۙ۬۬ۖ";
                    break;
                case 2110686646:
                    str2 = "yoHidePlayC";
                    str = "ۨ۬ۖۘۥۢۡۡۨۢ۬۬ۖۧۙۢۢۨۜۚۚ۬ۨۢ۫ۛۢ";
                    break;
            }
        }
    }

    public static boolean yoHideReceipt(Object obj) {
        String str = "ۨۘۙ۟۠ۘۘ۫ۥۤۗۗۦ۫۟۬۬ۛۜۘ";
        String str2 = null;
        StringBuilder sb = null;
        String str3 = null;
        String str4 = null;
        StringBuilder sb2 = null;
        String str5 = null;
        while (true) {
            switch ((str.hashCode() ^ 229) ^ -945785537) {
                case -1976701464:
                    str = "ۥ۠ۙۜۢۨۛۛۤ۟ۦۘۢۥ۫";
                    str5 = stripJID(dep.getJID_t(((C16740tZ) obj).A11.A00));
                    break;
                case -1974658082:
                    sb2.append(str5);
                    str = "ۧۙۦۘۚۨۖۘۜ۬ۦ۬ۤ۟ۥۤۦ۠";
                    break;
                case -1707326974:
                    return shp.getBooleanPriv(str3);
                case -1559463644:
                    str4 = sb2.toString();
                    str = "ۤۛۡۘۖۚۦۤۜۥۦۘۤۘۥۘۖۙ۟";
                    break;
                case -1364373072:
                    str = "۟ۤۧ۟ۗۧۥۥۥۘ۬ۚ۫ۧۘۘۡۡۧ۠۫ۨۘ";
                    str3 = str4;
                    break;
                case -1349076001:
                    str2 = sb.toString();
                    str = "ۗۥۙۜۗۙۗۚۚۤ۠ۥۛۨۙۛ۠ۜۧۡ۬";
                    break;
                case -1203189491:
                    String str6 = "۠ۚۚۢۤۖۘۧۚ۫۠ۚ۟ۘۨۧۘۢۗۨۘ۟ۚۘۘ";
                    while (true) {
                        switch (str6.hashCode() ^ -409884511) {
                            case -1411540077:
                                if (!wantsSpecific(str5)) {
                                    str6 = "ۜ۫ۘۢۛۨۘ۟ۨۖۘۨۤۖۛ۫ۨ۫ۦۖۚۜ";
                                    break;
                                } else {
                                    str6 = "ۚۜۨۖ۫۠ۤۨ۟ۘۦۘ۟ۤ۬ۜ۟ۗۗۖۨۘ";
                                    break;
                                }
                            case -1284172614:
                                str = "ۦۙ۫ۚۚۡۘۨۘۖ۟۫ۜ۠۟ۘ";
                                continue;
                            case 15439747:
                                str = "ۤۛۡۘ۫۠ۥۨۡۘ۠۬۠ۙۤۨۚۥۧۖۨۘ";
                                continue;
                            case 1769330161:
                                str6 = "ۥۢۛ۫ۨ۫ۧۥۖۘۤۨۨۘۧۥ۠۫ۘۨۘ";
                                break;
                        }
                    }
                    break;
                case -722908692:
                    u1.autoReplyHandler(obj);
                    str = "ۡۘۥۙۢۥۚۛۜۘۡۨۗۜۚ۬ۤۘۜۡۨۘ";
                    break;
                case 42814759:
                    str = "ۜۚۘۘ۠ۛ۫ۘ۬ۥ۟ۗۡۘۗۡۚۛۧۤ";
                    break;
                case 220345105:
                    sb.append(u1.GetType(obj));
                    str = "Oۘۙۖۘۦۗۥ۠ۙۜۧ۟ۛۚ۫ۜۡۘۥ";
                    break;
                case 540989762:
                    str = "ۘۖۜۚۥۥۤ۬ۜۡۗۡۨۘۡۘۡۦۚۨۗۜۘۗۧۘۘۡۚۧ";
                    break;
                case 745329962:
                    str = "ۧۤ۫ۦ۬ۘۘۖۨۦۨۧۢ۟ۢۧۛۥ";
                    sb = new StringBuilder("yoHideReceipt");
                    break;
                case 1144219002:
                    str = "ۥۨۘۧۨۨ۫۬ۡۦۡۡۢ۟ۘۜ۟ۛۘۗۡۙۘۛ۠ۙۜۘ";
                    sb2 = new StringBuilder("yoHideReceipt_");
                    break;
                case 1598011320:
                    str = "ۘۖۜۚۥۥۤ۬ۜۡۗۡۨۘۡۘۡۦۚۨۗۜۘۗۧۘۘۡۚۧ";
                    str3 = str2;
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean yoHideSeen() {
        /*
            java.lang.String r0 = "ۧۧۛۡۦۡۘۛۦۛۦۜ۬ۢۤۚ۠ۚۜ۟ۡۖۖۡۥ۫۫ۨ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 373(0x175, float:5.23E-43)
            r3 = 674278345(0x2830abc9, float:9.807213E-15)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -138818489: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "yoHideSeen"
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.yoHideSeen():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        r0 = "۟ۖۚۧۤۦۢۘۨۘۜۨۡۘ۫۬ۚ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean yoHideStatusView(X.C16740tZ r6) {
        /*
            r2 = 0
            java.lang.String r0 = "ۧ۠ۘۘۦۗۜۜۧۥ۬ۜۡۥۡۘۘ۬ۢۨۘ۟"
            r1 = r2
            r3 = r2
        L_0x0005:
            int r2 = r0.hashCode()
            r4 = 20
            r5 = -123827940(0xfffffffff89e891c, float:-2.572387E34)
            r2 = r2 ^ r4
            r2 = r2 ^ r5
            switch(r2) {
                case -1172839946: goto L_0x0076;
                case -1073942487: goto L_0x006c;
                case -320051764: goto L_0x004c;
                case -233731582: goto L_0x0087;
                case 226228289: goto L_0x0017;
                case 971706677: goto L_0x003c;
                case 1293535673: goto L_0x0036;
                case 1679919036: goto L_0x0014;
                case 1928775138: goto L_0x007c;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0005
        L_0x0014:
            java.lang.String r0 = "ۥۤ۠ۛۜۦۘ۟ۡۨۘۘۖۜۘ۫ۜۙ۟۬۟ۗۡۢۧۦۥۦۦۡ"
            goto L_0x0005
        L_0x0017:
            r2 = -1311328730(0xffffffffb1d6b626, float:-6.2489276E-9)
            java.lang.String r0 = "ۨۢ۫ۗۥۖ۟ۘۗ۠ۡۖۘۢۤۢۙۨۥۘۡ۠ۤ۠۬ۙۛۨ۬"
        L_0x001c:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -945872647: goto L_0x002b;
                case -272908193: goto L_0x0033;
                case 186370692: goto L_0x0030;
                case 388121885: goto L_0x0025;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x001c
        L_0x0025:
            java.lang.String r0 = "۟ۖۚۧۤۦۢۘۨۘۜۨۡۘ۫۬ۚ"
            goto L_0x0005
        L_0x0028:
            java.lang.String r0 = "ۧۤۧ۫۫ۨۘۚۖۘۡ۠ۙۜ۟ۖ"
            goto L_0x001c
        L_0x002b:
            if (r6 == 0) goto L_0x0028
            java.lang.String r0 = "ۦۖ۠۟ۡۨۤۙۗۘ۬ۘۘۘۚ۫۠ۚۥ"
            goto L_0x001c
        L_0x0030:
            java.lang.String r0 = "ۛۤۦۘۥۗۘۙ۠ۚۗۜ۫ۤ۫ۡۘ۬۫ۛۚۗۤۢۖۘ۫۠۫"
            goto L_0x001c
        L_0x0033:
            java.lang.String r0 = "ۚۦ۠ۡۦۥۘ۠ۜۗۖۖۨۘۚۜۨۘ"
            goto L_0x0005
        L_0x0036:
            com.obwhatsapp.yo.SS.f(r6)
            java.lang.String r0 = "ۡۦ۫۠ۡۥۘۤ۬ۡۘۥۥۜۘۛۗۛۡ۫ۦۦۖ۬ۜۚ۫ۘۖۜۘ"
            goto L_0x0005
        L_0x003c:
            X.0rv r0 = r6.A0B()
            java.lang.String r0 = com.obwhatsapp.yo.dep.getJID_t(r0)
            java.lang.String r2 = stripJID(r0)
            java.lang.String r0 = "۠ۖۦۘۜۛۖۘۚ۫ۦۢۗۚۜ۟ۡۘۤ۠ۨۗۜۦ۫ۚۛ"
            r3 = r2
            goto L_0x0005
        L_0x004c:
            r2 = -1311629716(0xffffffffb1d21e6c, float:-6.115263E-9)
            java.lang.String r0 = "۟۠ۜ۬ۙ۬۬ۘۡۙۢ۠ۥۢۜۛۜۦۦ۫"
        L_0x0051:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1794466503: goto L_0x005a;
                case -1759760899: goto L_0x0060;
                case 874872292: goto L_0x0025;
                case 1653997898: goto L_0x0069;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0051
        L_0x005a:
            java.lang.String r0 = "ۢۘۨ۠۠ۡۘۙۚۚۚۨۛۖۙ۟ۙۙۖۘ"
            goto L_0x0005
        L_0x005d:
            java.lang.String r0 = "ۘۖۧۘۖۡۧۤۚۖۚۚۘۘۛ۬ۜۘۥۛۗ۟ۦ"
            goto L_0x0051
        L_0x0060:
            boolean r0 = wantsSpecific(r3)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "ۗۦ۫ۤۘۦ۠۟ۖۘۥ۠۬۬ۦۘۖ۫ۥۘۘ۬۬ۧۘۨۦ۫ۖ"
            goto L_0x0051
        L_0x0069:
            java.lang.String r0 = "۫۠ۥۘ۬ۙ۬ۖۙۨۘۖۧۥۘۚۥۘۘۢۡۥۗ۫۫ۖۡ"
            goto L_0x0051
        L_0x006c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "yoHideViewStatus_"
            r1.<init>(r0)
            java.lang.String r0 = "ۘ۟ۨۘۤۥۘۘۖۙۙۜۖۜۘ۟۬ۥۘۧۤۥۘۙۚۜۖۗۙۚۡۦ"
            goto L_0x0005
        L_0x0076:
            r1.append(r3)
            java.lang.String r0 = "ۗۙ۬ۡۙۥۘۦ۬۟ۗۧۙۜۡ"
            goto L_0x0005
        L_0x007c:
            java.lang.String r0 = r1.toString()
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)
            r0 = r0 ^ 1
        L_0x0086:
            return r0
        L_0x0087:
            java.lang.String r0 = "yoHideStatViewV2"
            r1 = 1
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0, r1)
            r0 = r0 ^ 1
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.yoHideStatusView(X.0tZ):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean yo_hideinfo() {
        /*
            java.lang.String r0 = "ۡ۠ۚۛۚۗۤ۠ۨۘۨ۟ۛ۫ۜۖ۠۠ۦۘ۠ۙ۬"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 646(0x286, float:9.05E-43)
            r3 = -317741768(0xffffffffed0fa538, float:-2.7785059E27)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 595063753: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "yo_hideinfo"
            r1 = 1
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.yo.yo_hideinfo():boolean");
    }
}
