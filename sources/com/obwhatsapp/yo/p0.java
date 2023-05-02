package com.obwhatsapp.yo;

import X.C16730tY;
import X.C16740tZ;
import X.C57012pj;
import a.a;
import android.content.Context;
import android.widget.TextView;
import com.OM7753.GOLD;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.obwhatsapp.youbasha.task.utils;
import com.whatsapp.MediaData;
import java.io.File;
import java.util.HashMap;
import java.util.List;

public abstract class p0 {

    /* renamed from: a  reason: collision with root package name */
    public static HashMap f842a;

    /* renamed from: b  reason: collision with root package name */
    public static File f843b;
    protected static String currJID;
    protected static int currPlaying;
    protected static StatusPlaybackContactFragment mStatusPlaybackContactFragment;
    protected static String textStatus;

    public static /* synthetic */ void a(TextView textView, C57012pj r5, Context context) {
        String str = "ۢۜۥۘۘۡ۫۟ۥۘۘۡۡۘۗۨۧۘۖ۟۬ۛۗۤۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 227) ^ -885029780) {
                case -2049591751:
                    str = "۠ۛۗۥۙۜۡۧۡۢ۬۫ۘۜۘۥۘۘ";
                    break;
                case -1873372222:
                    str = "ۜ۟ۢۗۡۡۘۤۗۧۦۥۘ۟ۡۢۗۡۗ۠ۖۢۙ۠";
                    break;
                case -1559307224:
                    String str2 = "۠۬۟۫ۘۛ۫ۙۦۘۜۨۦۘۡۙۡ۟ۜۦۘ۬۫ۥۢۖۦ";
                    while (true) {
                        switch (str2.hashCode() ^ -490359372) {
                            case -2056702363:
                                str2 = "ۧۥۤۡۖۥۘ۠ۜۡۙ۠ۨۘۗۦۘۘۚۤۚ۬ۗۚ۠ۨۜۤۡ";
                                break;
                            case -991502687:
                                str = "ۤ۠ۤ۟ۛۜۘۛۢۡۖۜۘۘۜ۫۟ۘۥۗۙۥۘۘۙۨۘۘ۫ۥۘ";
                                continue;
                            case -48633294:
                                str = "۬ۗۜۦ۠ۨۖۧ۟۫ۢۘۘ۟۠ۚۦۧۜۘ۬۟۠ۙۤۖ";
                                continue;
                            case 1979079967:
                                if (textView == null) {
                                    str2 = "ۥۡۜۘۨۜ۠ۙۤۧۖ۫ۛ۫۬ۥ";
                                    break;
                                } else {
                                    str2 = "ۙۗۘۙ۟۟۬ۢ۠ۛۛۜۗۛ۬۫ۡ۬ۘۥۘۘۡۡۧۘۢۖ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1542073469:
                    a.i("not_found", context, 0);
                    str = "ۜ۟ۢۗۡۡۘۤۗۧۦۥۘ۟ۡۢۗۡۗ۠ۖۢۙ۠";
                    break;
                case -1525719794:
                    return;
                case -702194580:
                    str = "ۗۡۡ۠ۚۘۘۨۥۦۥۦۥۘۨ۫ۜۙۛۦۘۛۙ۬ۢۢ۟";
                    break;
                case -646607503:
                    mStatusPlaybackContactFragment.A14();
                    str = "ۘۘۧ۬ۛۛۚۗۥۦۦۧۘۡۛۤ۬۟ۚۡۗۥ۫۟۬۟";
                    break;
                case -226703990:
                    r5.dismiss();
                    str = "ۤۜۙۨۘۖۜۧۥۘۛۨ۬۠ۛۨۧۡۘ";
                    break;
                case 1762845670:
                    tf.b(textView.getText().toString());
                    str = "۬ۦۦ۠ۖۜ۫ۡۨۘۢۢۖۙ۫ۘۘۙ۬ۗۘۛۜۘۙ۠۠";
                    break;
                case 1963855933:
                    str = "ۙۖۗۨۡۥۘ۫ۢۘۘ۫ۙ۠ۧۢۗ۬ۤۨۚۖۤۖۗۡۦ۬";
                    break;
            }
        }
    }

    public static C16740tZ b() {
        C16740tZ r0;
        synchronized (p0.class) {
            try {
                r0 = (C16740tZ) ((List) f842a.get(currJID)).get(currPlaying);
            } catch (Exception e2) {
                e2.printStackTrace();
                Class<p0> cls = p0.class;
                return null;
            } catch (Throwable th) {
                Class<p0> cls2 = p0.class;
                throw th;
            }
        }
        return r0;
    }

    public static String c() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(utils.getWAFolderPath());
            sb.append("Media");
            String str = File.separator;
            sb.append(str);
            sb.append("OBWhatsApp_Statuses");
            File file = new File(sb.toString());
            String str2 = "ۦۙۨۘۧۥۦۘۗۦۤۦۥۘۧۡ۟ۦۦۛ۟ۗۛۛۛۥۘ";
            while (true) {
                switch (str2.hashCode() ^ -817301709) {
                    case -1987149798:
                        if (!file.exists()) {
                            str2 = "ۜ۠ۜۘۜۧ۫ۨۜۘۚ۟ۜ۠۠۠";
                            break;
                        } else {
                            str2 = "ۙۜ۬۬ۛۘۘۦۚۘۘۖ۫ۥۘ۠ۡ۫۟ۚۧۨۙۘۘۙۘ۬ۡ۠ۛ";
                            continue;
                        }
                    case -55700059:
                        break;
                    case 168701728:
                        String str3 = "ۧۛۨۨۘۜۗۧۗ۫ۗۜۘۥ۫ۖۘۗۙۙۖۤۨ";
                        while (true) {
                            switch (str3.hashCode() ^ 285387568) {
                                case -1133204632:
                                    return null;
                                case -267908271:
                                    str3 = "ۛۛۡۘۢۘۥۢۢ۟ۢۨۚۛۥۗۘۡۧۘۛۗۖۘ";
                                    continue;
                                case 468472050:
                                    if (file.mkdirs()) {
                                        str3 = "ۥۤ۬ۙۛۥۘ۬ۢۨۧۡ۠ۖۗ۟ۖۧۦۘۜۘۜۘۘۤۜۨ۬ۜۘ";
                                        break;
                                    } else {
                                        str3 = "ۙۥۛ۟۠ۥۘۥۘۙ۟ۤۚ۬ۚۖۖۨۖۛ۠۫ۧۙۡۘ";
                                        continue;
                                    }
                                case 2066475357:
                                    break;
                                default:
                                    continue;
                            }
                        }
                    case 1902564062:
                        str2 = "ۡۦۖۡۦۙۘۨۖ۠ۘۚۘۥۦۗۙۡۘ";
                        continue;
                    default:
                        continue;
                }
            }
            return file.getPath() + str + (yo.stripJID(currJID) + "_status_" + f843b.getName());
        } catch (Exception e2) {
            return null;
        }
    }

    public static int d() {
        int i2;
        synchronized (p0.class) {
            try {
                C16740tZ b2 = b();
                String str = "۟ۖۥۙ۠ۘۘ۫ۢ۟۠۫ۘۘۛۛۡۨۨۜ";
                while (true) {
                    switch (str.hashCode() ^ -498112416) {
                        case -1820253079:
                            textStatus = b2.A0I();
                            i2 = 1;
                            break;
                        case -1625789011:
                            str = "ۜۜۗۨۙۡۢۜۘۘۛۘۘۛۜۦۘ";
                            continue;
                        case -300717029:
                            MediaData mediaData = (MediaData) ((C16730tY) b2).A0H();
                            String str2 = "ۙ۫۟۫ۤۜۘ۬ۜۜ۟ۨۡۨۜۢۧۧۡ";
                            while (true) {
                                switch (str2.hashCode() ^ 93393381) {
                                    case -1164664731:
                                        str2 = "ۨۚۜۦۛۘۘۤۜۙۜ۠ۥۘۧۤۛ";
                                        continue;
                                    case 732401636:
                                        if (mediaData != null) {
                                            str2 = "ۘ۬ۥۤۦۗۢۧ۫ۙۙ۟ۧۗۧ۟ۜۨۘۦۧۦ۫ۖۨۘۗۚۜ";
                                            break;
                                        } else {
                                            str2 = "ۚۡ۫ۛ۫۬ۜ۠۟ۘ۫۠ۚۤۦۘ۟۠ۥ۬ۗۖۘ۫ۘۖۜۤ";
                                            continue;
                                        }
                                    case 1833081091:
                                        i2 = -1;
                                        break;
                                    case 1904537696:
                                        f843b = mediaData.file;
                                        i2 = 0;
                                        break;
                                    default:
                                        continue;
                                }
                            }
                        case 58361753:
                            if (b2 instanceof C16730tY) {
                                str = "ۤۡۨۤۗۘۘۗۜۙۘۦۖۘۧۗۡۘ";
                                break;
                            } else {
                                str = "ۨۤۥۡ۫۫ۧ۫ۤۦۨۘۗ۫۬ۘ۠ۡۘ";
                                continue;
                            }
                        default:
                            continue;
                    }
                }
            } catch (Exception e2) {
                i2 = -1;
            } catch (Throwable th) {
                Class<p0> cls = p0.class;
                throw th;
            }
        }
        return i2;
    }

    public static void pause() {
        mStatusPlaybackContactFragment.A0w();
    }

    public static void resume() {
        if (GOLD.f208h) {
            mStatusPlaybackContactFragment.A0w();
            GOLD.f208h = false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void saveOptions(android.view.View r12) {
        /*
            r11 = 0
            r3 = 0
            java.lang.String r0 = "ۛۦۚ۫ۦۜ۟۟۬ۚۡۛۜۨۨۛۖۜ۫ۧۖۘ"
            r1 = r0
            r2 = r3
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
        L_0x000b:
            int r0 = r1.hashCode()
            r9 = 663(0x297, float:9.29E-43)
            r10 = 1271750371(0x4bcd5ee3, float:2.6918342E7)
            r0 = r0 ^ r9
            r0 = r0 ^ r10
            switch(r0) {
                case -2090070149: goto L_0x0057;
                case -1552882500: goto L_0x0181;
                case -1530270233: goto L_0x0122;
                case -1512544262: goto L_0x0164;
                case -1465422328: goto L_0x0101;
                case -1442213138: goto L_0x015c;
                case -914926933: goto L_0x0177;
                case -841497819: goto L_0x004d;
                case -797071159: goto L_0x001a;
                case -732767705: goto L_0x0115;
                case -712340017: goto L_0x00b9;
                case -621589299: goto L_0x0069;
                case -524889137: goto L_0x0026;
                case -392567342: goto L_0x017c;
                case -57952963: goto L_0x00cb;
                case 133258713: goto L_0x0037;
                case 201475852: goto L_0x00b0;
                case 342366238: goto L_0x008a;
                case 1072308855: goto L_0x00c1;
                case 1110931866: goto L_0x0129;
                case 1196529313: goto L_0x014c;
                case 1216147715: goto L_0x0077;
                case 1343394137: goto L_0x001e;
                case 1434374762: goto L_0x00d9;
                case 1742267324: goto L_0x00ed;
                case 1790537848: goto L_0x0154;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x000b
        L_0x001a:
            java.lang.String r0 = "ۢۙۖۦۤ۟ۗۚ۫ۤۨۚۡۤ۠"
            r1 = r0
            goto L_0x000b
        L_0x001e:
            android.content.Context r8 = r12.getContext()
            java.lang.String r0 = "ۦۦۜۘۗۨۖۘ۬ۨۘ۟ۖۧۘۚۧۛۘۤ۫۬ۡ۬ۤۥۨۙ۫ۥۘ"
            r1 = r0
            goto L_0x000b
        L_0x0026:
            X.2pj r7 = new X.2pj
            java.lang.String r0 = "BottomDialog"
            java.lang.String r1 = "style"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            r7.<init>(r8, r0)
            java.lang.String r0 = "۫ۘۧۢۗۖۜۗ۟۬ۢۤ۟۟ۤۜۡۘۤ۫ۦۛۗۦۘ"
            r1 = r0
            goto L_0x000b
        L_0x0037:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r8)
            java.lang.String r1 = "rc_statusoptions_dialog"
            java.lang.String r6 = "layout"
            int r1 = com.obwhatsapp.yo.yo.getID(r1, r6)
            android.view.View r0 = r0.inflate(r1, r3)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            java.lang.String r1 = "ۡۖۡۚۖۜۜۦۗۗۚ۬ۖ۠ۖۘۚۙۛۛۚۦۘ"
            r6 = r0
            goto L_0x000b
        L_0x004d:
            java.lang.String r0 = "status_copyLL"
            android.view.View r5 = r6.findViewWithTag(r0)
            java.lang.String r0 = "ۦ۬ۨۤۜۘۘۥ۬۬ۙ۬ۦۘۖۖۗۦ۬ۨۘ۬۟۟"
            r1 = r0
            goto L_0x000b
        L_0x0057:
            java.lang.String r0 = "caption"
            java.lang.String r1 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "ۜۦ۬ۨۙۛۡ۟ۙۡۙۖۘۤۚۜۘۛ۬ۜۘۙۘۦ۬ۘ۠"
            r4 = r0
            goto L_0x000b
        L_0x0069:
            r1 = -621264167(0xffffffffdaf842d9, float:-3.4939647E16)
            java.lang.String r0 = "ۨ۬ۚ۠ۧۥۢۡ۟ۚۥۘۜۙۘۘ"
        L_0x006e:
            int r9 = r0.hashCode()
            r9 = r9 ^ r1
            switch(r9) {
                case -1424415733: goto L_0x007e;
                case -327756315: goto L_0x0086;
                case 793512079: goto L_0x0077;
                case 1510401503: goto L_0x0083;
                default: goto L_0x0076;
            }
        L_0x0076:
            goto L_0x006e
        L_0x0077:
            java.lang.String r0 = "ۗۗ۬ۤ۟ۘۘۖۖۧۘۘۗۨۘۡۛۧۥۜۘ"
            r1 = r0
            goto L_0x000b
        L_0x007b:
            java.lang.String r0 = "۬ۢ۟ۤۗۖۘ۟ۢۘۘ۫ۤۤۙۛۥۨ۠ۧ"
            goto L_0x006e
        L_0x007e:
            if (r4 == 0) goto L_0x007b
            java.lang.String r0 = "ۛۢ۫ۧۖۥۘۧۜۡ۠ۢۢۘۤ"
            goto L_0x006e
        L_0x0083:
            java.lang.String r0 = "۬ۜۘۘۛۧۖۖۗۗ۟ۧۡ۟ۢۜ"
            goto L_0x006e
        L_0x0086:
            java.lang.String r0 = "ۥۖ۟ۥۛۙۘۡۘ۠ۘۤ۠ۜۘ"
            r1 = r0
            goto L_0x000b
        L_0x008a:
            r1 = 283425801(0x10e4bc09, float:9.021986E-29)
            java.lang.String r0 = "ۡۖۜۘۖۙۧۙۤۡۦۤۨۘ۠۟ۚۙۗۗۜ۠ۦۙۗۥ"
        L_0x008f:
            int r9 = r0.hashCode()
            r9 = r9 ^ r1
            switch(r9) {
                case -1588637148: goto L_0x00ad;
                case -824996876: goto L_0x0172;
                case -598723287: goto L_0x0098;
                case -501379171: goto L_0x00a0;
                default: goto L_0x0097;
            }
        L_0x0097:
            goto L_0x008f
        L_0x0098:
            java.lang.String r0 = "۠ۚۜۘۥۤۖۘ۬ۥۡۘۗۤۦۢۥۧۜۤۘۘۗۥۦۧۘۢ۬ۧۥ"
            r1 = r0
            goto L_0x000b
        L_0x009d:
            java.lang.String r0 = "ۦ۟ۥۘۤۚۜۘۚۢۧۥۧۘۘۗۡۡۛۥۖۦۛۡۨۘۚۘ۟"
            goto L_0x008f
        L_0x00a0:
            java.lang.CharSequence r0 = r4.getText()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x009d
            java.lang.String r0 = "۫ۦۧۘۖ۬۠ۦ۟ۜۖۧۗۤۥۜ۫ۦۦ۠ۡ۟"
            goto L_0x008f
        L_0x00ad:
            java.lang.String r0 = "ۨ۫ۛۘ۟ۨۛۘۧۘۦۧۜۧۜۦۘۡۜۦ"
            goto L_0x008f
        L_0x00b0:
            r0 = 1
            r5.setEnabled(r0)
            java.lang.String r0 = "ۤ۟ۨۘۨۙ۠ۥۧۨۖۛۘۘ۠ۗ۟ۤۥۢۦ۬ۙۘۦۘۥۗۨ"
            r1 = r0
            goto L_0x000b
        L_0x00b9:
            r5.setEnabled(r11)
            java.lang.String r0 = "ۗۡۡۘ۫ۜۖۛۡۘۚۘ۠ۥۗۨ۟ۦۘۘ۬ۤۤ"
            r1 = r0
            goto L_0x000b
        L_0x00c1:
            r0 = 1048576000(0x3e800000, float:0.25)
            r5.setAlpha(r0)
            java.lang.String r0 = "ۧۜۧۗۘۖۜ۫ۢۢۤۚۚۖۘۙ۟ۜۚۡ"
            r1 = r0
            goto L_0x000b
        L_0x00cb:
            c.a r0 = new c.a
            r1 = 2
            r0.<init>(r4, r7, r8, r1)
            r5.setOnClickListener(r0)
            java.lang.String r0 = "ۜۚۙۜۖۜۘۖۛۦۙ۠ۖۘ۬۟ۦۘ"
            r1 = r0
            goto L_0x000b
        L_0x00d9:
            java.lang.String r0 = "status_saveLL"
            android.view.View r0 = r6.findViewWithTag(r0)
            com.obwhatsapp.yo.t r1 = new com.obwhatsapp.yo.t
            r9 = 5
            r1.<init>(r7, r9)
            r0.setOnClickListener(r1)
            java.lang.String r0 = "ۜۢۖ۠ۨ۟ۧۙۦۘ۟ۡۦۨۜۘۙۡۘ۠۬ۦ۠ۙۗ۬ۚ۟"
            r1 = r0
            goto L_0x000b
        L_0x00ed:
            java.lang.String r0 = "status_shareLL"
            android.view.View r0 = r6.findViewWithTag(r0)
            com.obwhatsapp.yo.t r1 = new com.obwhatsapp.yo.t
            r9 = 6
            r1.<init>(r7, r9)
            r0.setOnClickListener(r1)
            java.lang.String r0 = "ۢۗ۟ۤۗۘۘۚ۠ۘ۠۠ۜۛ۫ۖۥۜۡۡ۠۬ۥۙ۬ۘۧۡۘ"
            r1 = r0
            goto L_0x000b
        L_0x0101:
            java.lang.String r0 = "status_repostLL"
            android.view.View r0 = r6.findViewWithTag(r0)
            com.obwhatsapp.yo.t r1 = new com.obwhatsapp.yo.t
            r9 = 7
            r1.<init>(r7, r9)
            r0.setOnClickListener(r1)
            java.lang.String r0 = "۫ۦۙۧۘ۟ۘۚ۠۬ۨۦۘۛۖ۫ۧۖۗ۫ۥۘۘۢۧ"
            r1 = r0
            goto L_0x000b
        L_0x0115:
            com.obwhatsapp.yo.o0 r0 = new com.obwhatsapp.yo.o0
            r0.<init>(r7)
            r7.setOnDismissListener(r0)
            java.lang.String r0 = "ۖۢۧۡۦۛۥۧۘۘۘۖۢ۟ۖۜۘۘ۟ۤۡۜۘۘۖۢۘ۬ۚۡۘ"
            r1 = r0
            goto L_0x000b
        L_0x0122:
            com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment r2 = mStatusPlaybackContactFragment
            java.lang.String r0 = "ۢۤ۬ۘۨۘۦۢۤۘۙۡۡۗۖۘۤۢۥۖۘۥۘ"
            r1 = r0
            goto L_0x000b
        L_0x0129:
            r1 = 122739281(0x750da51, float:1.5712338E-34)
            java.lang.String r0 = "ۖۡۤۡ۫ۤ۫۟ۥ۫ۜۘۘۨ۫۬ۥۥۗ"
        L_0x012e:
            int r9 = r0.hashCode()
            r9 = r9 ^ r1
            switch(r9) {
                case -193928462: goto L_0x0147;
                case 598601086: goto L_0x013f;
                case 1460868228: goto L_0x0144;
                case 2079566965: goto L_0x0137;
                default: goto L_0x0136;
            }
        L_0x0136:
            goto L_0x012e
        L_0x0137:
            java.lang.String r0 = "ۜۖۧۘۙۦۚ۬ۖۘۧ۫ۦۧۙۦۘ۠ۨۨۘۘۗۥۗۚۡۘ"
            r1 = r0
            goto L_0x000b
        L_0x013c:
            java.lang.String r0 = "۬۫۠ۜۥۧۨۙۡۘ۟۠ۛۜ۠ۡ۟ۛۜ۟ۙۡ۟۠ۙۙۤۘ"
            goto L_0x012e
        L_0x013f:
            if (r2 == 0) goto L_0x013c
            java.lang.String r0 = "ۘ۠ۖۘۜۦۙ۟ۛ۬۠ۘۢۤۚ"
            goto L_0x012e
        L_0x0144:
            java.lang.String r0 = "ۧۧۡۦۥۦۜ۫ۨ۬ۗۙۤۜۖ"
            goto L_0x012e
        L_0x0147:
            java.lang.String r0 = "۬ۦۘ۠ۤۡۖۗۥ۟ۨۘ۠۬ۚۢۧۘۘۜۜۧۖۨۥ"
            r1 = r0
            goto L_0x000b
        L_0x014c:
            r2.A0w()
            java.lang.String r0 = "ۛۢۙۙۦۘۘۥۦ۟ۛۤۛۧۤۜۘ"
            r1 = r0
            goto L_0x000b
        L_0x0154:
            r7.setContentView((android.view.View) r6)
            java.lang.String r0 = "ۥۛۨۘۜۢۢ۠ۚۨۜۖۖۛۤۧ"
            r1 = r0
            goto L_0x000b
        L_0x015c:
            r7.show()
            java.lang.String r0 = "۟۠ۜۘۨ۠ۤۧۜ۟۟ۗۘۢۧ۫ۡۢۖۘۘۨۘۥۖۧۘ"
            r1 = r0
            goto L_0x000b
        L_0x0164:
            java.lang.String r0 = "loading_spinner"
            android.content.Context r1 = com.obwhatsapp.yo.yo.getCtx()
            a.a.i(r0, r1, r11)
            java.lang.String r0 = "ۖ۠ۜۘۛ۫۠ۦ۬۠ۡۢۥۗۦۡۚۚۦۗ۫ۧ۬ۛۗۥ"
            r1 = r0
            goto L_0x000b
        L_0x0172:
            java.lang.String r0 = "ۨۖۡۧۨۘ۫۬ۢۖۡۘۘۜۢۚۘۘۤ"
            r1 = r0
            goto L_0x000b
        L_0x0177:
            java.lang.String r0 = "ۧۜۧۗۘۖۜ۫ۢۢۤۚۚۖۘۙ۟ۜۚۡ"
            r1 = r0
            goto L_0x000b
        L_0x017c:
            java.lang.String r0 = "ۖ۠ۜۘۛ۫۠ۦ۬۠ۡۢۥۗۦۡۚۚۦۗ۫ۧ۬ۛۗۥ"
            r1 = r0
            goto L_0x000b
        L_0x0181:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.p0.saveOptions(android.view.View):void");
    }
}
