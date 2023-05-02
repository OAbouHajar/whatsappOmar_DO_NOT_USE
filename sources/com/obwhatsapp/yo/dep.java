package com.obwhatsapp.yo;

import X.AnonymousClass01J;
import X.AnonymousClass1ZR;
import X.AnonymousClass2Ao;
import X.AnonymousClass2IF;
import X.AnonymousClass2Sy;
import X.C005402i;
import X.C15830rv;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16150sX;
import X.C16220sf;
import X.C16740tZ;
import X.C16760tb;
import X.C17200uh;
import X.C17250um;
import X.C19000xb;
import X.C204310c;
import X.C25731Kx;
import X.C30011bb;
import X.C35541m6;
import X.C38831rU;
import X.C447225g;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.calling.callhistory.CallsHistoryFragment;
import com.obwhatsapp.conversationslist.ViewHolder;
import com.obwhatsapp.yo.autoschedreply.p;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.task.utils;
import com.obwhatsapp.youbasha.ui.activity.CallsPrivacy;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.whispersystems.jobqueue.Job;

public abstract class dep {

    /* renamed from: a  reason: collision with root package name */
    public static int f95a;

    /* renamed from: b  reason: collision with root package name */
    public static int f96b;

    /* renamed from: c  reason: collision with root package name */
    public static int f97c;
    public static HashSet<String> callsList;

    /* renamed from: d  reason: collision with root package name */
    public static int f98d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f99e;

    /* renamed from: f  reason: collision with root package name */
    public static CallsHistoryFragment f100f;

    /* renamed from: g  reason: collision with root package name */
    public static C25731Kx f101g;

    /* renamed from: h  reason: collision with root package name */
    public static String f102h;

    /* renamed from: i  reason: collision with root package name */
    public static AnonymousClass2Ao f103i;

    /* renamed from: j  reason: collision with root package name */
    public static C16760tb f104j;

    /* renamed from: k  reason: collision with root package name */
    public static C19000xb f105k;
    public static C16220sf mutemngr;
    public static String myNum;

    public static Object A00(int i2) {
        AnonymousClass01J r0;
        C16150sX A00 = AnonymousClass2IF.A00(yo.getCtx());
        switch (i2) {
            case 1:
                r0 = A00.AQh;
                break;
            case 2:
                r0 = A00.ADr;
                break;
            default:
                r0 = A00.A43;
                break;
        }
        return r0.get();
    }

    public static String A0X(Jid jid) {
        return jid == null ? "" : jid.getRawString();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        r0 = "۬ۙۜۘۤ۬ۛۡۘۨۘۥۖۘۡۖۜۗۛۢ۫ۛ۫ۖۚۤ۟ۘۡۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void FetchCopCaptio(java.lang.Object r11) {
        /*
            r2 = 0
            java.lang.String r0 = "ۨ۫۟ۥۗۢۡۜ۠ۨۖۨۖۗۤۖۛ"
            r1 = r2
            r3 = r2
            r4 = r2
            r6 = r2
            r7 = r2
            r5 = r2
            r8 = r2
        L_0x000a:
            int r2 = r0.hashCode()
            r9 = 862(0x35e, float:1.208E-42)
            r10 = 852432738(0x32cf1762, float:2.4108605E-8)
            r2 = r2 ^ r9
            r2 = r2 ^ r10
            switch(r2) {
                case -1657661963: goto L_0x001c;
                case -1280805845: goto L_0x00b0;
                case -1270469573: goto L_0x00e3;
                case -822010205: goto L_0x0019;
                case -664895980: goto L_0x0089;
                case -587430146: goto L_0x00ba;
                case -566145614: goto L_0x00ce;
                case -154253208: goto L_0x00b5;
                case 58933853: goto L_0x003a;
                case 482993316: goto L_0x00c9;
                case 609333207: goto L_0x0084;
                case 828313705: goto L_0x0064;
                case 895186597: goto L_0x00db;
                case 1174904036: goto L_0x00a2;
                case 1419638796: goto L_0x0045;
                case 1503881564: goto L_0x00d3;
                case 1589939496: goto L_0x00c3;
                case 2079906874: goto L_0x00aa;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x000a
        L_0x0019:
            java.lang.String r0 = "ۜۧۚ۟ۦۨۙۛ۟ۛۦۘۡۨۗۢۗۙۗۦۘۦۚۖۘ"
            goto L_0x000a
        L_0x001c:
            r2 = 1073205607(0x3ff7d167, float:1.936078)
            java.lang.String r0 = "ۥ۫ۤۢ۟۟ۘۜۜۘۚۧۙ۬۠ۘۘ"
        L_0x0021:
            int r9 = r0.hashCode()
            r9 = r9 ^ r2
            switch(r9) {
                case 87820075: goto L_0x002a;
                case 886364312: goto L_0x0037;
                case 1956356475: goto L_0x0030;
                case 2104779430: goto L_0x00df;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0021
        L_0x002a:
            java.lang.String r0 = "ۘۗۤۛۖۤ۟ۥ۟ۧۘ۫ۘ۟ۥۘۖۜ۫ۚۛۡۘۘۢ۬ۖۜۡۘ"
            goto L_0x000a
        L_0x002d:
            java.lang.String r0 = "۫۬ۨۘۨۘۖۘ۫ۧۘۘۧۥۦۘۗ۬ۦۘۚۜ۠ۨۥۘۡ۟ۧۨ۫ۚ"
            goto L_0x0021
        L_0x0030:
            boolean r0 = r11 instanceof X.C16740tZ
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "ۛ۬ۚۛۢۡۧۨۦۘۥۗۜۘۘۥۙۘۘ۬ۜۖۘۦۛ۠"
            goto L_0x0021
        L_0x0037:
            java.lang.String r0 = "ۥۥۛۘۨۤۡۚۢۧۖۨۘ۬ۚۤۖۛۘۘ"
            goto L_0x0021
        L_0x003a:
            r0 = r11
            X.0tZ r0 = (X.C16740tZ) r0
            java.lang.String r2 = r0.A0J()
            java.lang.String r0 = "ۗۨۘۜۚۛ۫ۧۛۧۤۜۗۥۥۙ۬ۦۡۖۗ"
            r8 = r2
            goto L_0x000a
        L_0x0045:
            r2 = 1162279291(0x4546f97b, float:3183.5925)
            java.lang.String r0 = "۠۟ۨۚۜۡۧۥۥۘ۟ۢۚۢۢۨۘ۠ۤۛۛۛۜ۬ۤۘۘ۬ۨۛ"
        L_0x004a:
            int r9 = r0.hashCode()
            r9 = r9 ^ r2
            switch(r9) {
                case -1739556590: goto L_0x005e;
                case -868534727: goto L_0x0059;
                case -167390903: goto L_0x0053;
                case 1597373370: goto L_0x0061;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x004a
        L_0x0053:
            java.lang.String r0 = "۬ۙۜۘۤ۬ۛۡۘۨۘۥۖۘۡۖۜۗۛۢ۫ۛ۫ۖۚۤ۟ۘۡۘ"
            goto L_0x000a
        L_0x0056:
            java.lang.String r0 = "ۡۛۘ۬ۖۨۢۛۗ۬ۡۦۛۚ"
            goto L_0x004a
        L_0x0059:
            if (r8 == 0) goto L_0x0056
            java.lang.String r0 = "۫ۚۜ۫ۖۧۤۧ۫ۖۙ۟ۚۖ۬ۖۥۥ"
            goto L_0x004a
        L_0x005e:
            java.lang.String r0 = "ۢ۬ۚ۬ۘۘۙۛ۟ۗۦۙۦۗۨۗۢۡۘۧ۫ۙۧ۠۟"
            goto L_0x004a
        L_0x0061:
            java.lang.String r0 = "۫ۙ۠۬ۦ۠۠ۛۜۢۦۘۘۢۨ۬"
            goto L_0x000a
        L_0x0064:
            r2 = -2095742625(0xffffffff8315815f, float:-4.3935675E-37)
            java.lang.String r0 = "ۚ۫ۢۚ۟ۚۦ۟ۖۘ۫ۛۗۖۢۖۘ۬ۤۦۘ"
        L_0x0069:
            int r9 = r0.hashCode()
            r9 = r9 ^ r2
            switch(r9) {
                case -2127427864: goto L_0x0081;
                case -481433756: goto L_0x0053;
                case 793272133: goto L_0x007e;
                case 1776331679: goto L_0x0072;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x0069
        L_0x0072:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = "۟ۢ۫ۗۙۡۘۚۥ۬ۜ۠۟ۜۦۧۥۛ۠۠ۥۡۜۢۘۘ"
            goto L_0x0069
        L_0x007b:
            java.lang.String r0 = "ۚۙۥۦۛۙۗۜ۫ۦۖۧۤۡۖۘۥۙ۟ۛۨۛ۫ۗۖۘۚ۠۠"
            goto L_0x0069
        L_0x007e:
            java.lang.String r0 = "ۧۦۡۘ۬ۤۥۥ۟ۖۘۖۙۦۘۦ۟ۧۧۛ۠ۢ۠ۤۨۗۦ"
            goto L_0x0069
        L_0x0081:
            java.lang.String r0 = "۫ۙ۠۫ۖۨۘۖ۟ۙ۟ۖ۬ۛۤۨۘ"
            goto L_0x000a
        L_0x0084:
            int r0 = com.obwhatsapp.yo.tf.f107a
            java.lang.String r0 = "ۗۘۥۘۤۨۘۖ۫ۖۗۚ۫ۙۡۥۦۗۡ۬۟ۦۧۗۡۧۗۘۘ"
            goto L_0x000a
        L_0x0089:
            android.content.Context r0 = com.obwhatsapp.yo.yo.getCtx()
            java.lang.String r2 = "clipboard"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
            java.lang.String r2 = "text"
            android.content.ClipData r2 = android.content.ClipData.newPlainText(r2, r8)
            r0.setPrimaryClip(r2)
            java.lang.String r0 = "ۙۡۜۘۡۨ۫۟ۛۨۘ۬ۧۛۘۦۜۗۘۘۛۖۘۘ"
            goto L_0x000a
        L_0x00a2:
            android.content.Context r5 = com.obwhatsapp.yo.yo.getCtx()
            java.lang.String r0 = "ۛۥ۠۫۟ۡۥ۟ۥ۬ۛ۬ۚۜۘۖۜۘۥ۫ۥۘۧۜۨۘ۫ۢ۠"
            goto L_0x000a
        L_0x00aa:
            java.lang.String r7 = "message_copied"
            java.lang.String r0 = "ۦۗۘ۫ۛۦۖۢۥۤ۟ۨۘۗۦۘۧۤۜۘۘۥۦۛۗۡۡۘۧ"
            goto L_0x000a
        L_0x00b0:
            java.lang.String r0 = "۫ۖ۠ۘۗۧۤۥ۫ۥ۫ۦۘۤۘۖۤۤۧ"
            r6 = r7
            goto L_0x000a
        L_0x00b5:
            java.lang.String r0 = "ۥۦۗۘۘۨۘ۬ۨۧۡۚۡۨۤۘ"
            r4 = r5
            goto L_0x000a
        L_0x00ba:
            android.content.Context r2 = com.obwhatsapp.yo.yo.getCtx()
            java.lang.String r0 = "۟ۢۡ۬ۜۧۘۛۢ۟ۤۢۚۧۨۘ"
            r3 = r2
            goto L_0x000a
        L_0x00c3:
            java.lang.String r1 = "no_empty_message"
            java.lang.String r0 = "ۖۧۨۘۚ۬ۨۘۛ۫ۛۦۨ۬ۖۡۥ"
            goto L_0x000a
        L_0x00c9:
            java.lang.String r0 = "ۙۛۡۗ۠ۥۘۡ۠۠ۢۖۤۥۥۘ"
            r4 = r3
            goto L_0x000a
        L_0x00ce:
            java.lang.String r0 = "ۜۢۙ۟ۡۨۗ۠ۦۘۦۤۙۙۤۜۘۨۛۛۛۚۦۘۥۛۛ۬ۥۙ"
            r6 = r1
            goto L_0x000a
        L_0x00d3:
            r0 = 0
            a.a.i(r6, r4, r0)
            java.lang.String r0 = "ۨۥۚۛ۠ۛۗۙۡۘ۬۫ۖۘۧۦۥۘۨ۟۬ۤۛ"
            goto L_0x000a
        L_0x00db:
            java.lang.String r0 = "ۜۢۙ۟ۡۨۗ۠ۦۘۦۤۙۙۤۜۘۨۛۛۛۚۦۘۥۛۛ۬ۥۙ"
            goto L_0x000a
        L_0x00df:
            java.lang.String r0 = "ۨۥۚۛ۠ۛۗۙۡۘ۬۫ۖۘۧۦۥۘۨ۟۬ۤۛ"
            goto L_0x000a
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.dep.FetchCopCaptio(java.lang.Object):void");
    }

    public static void SetStatusChat(Conversation conversation, C16010sH r6) {
        try {
            r6.A0J();
            String jID_data = getJID_data(r6);
            boolean isGroupJid = yo.isGroupJid(jID_data);
            yo.setCurr_sJid(jID_data);
            yo.setGroupBoolean(isGroupJid);
            TextView textView = (TextView) conversation.findViewById(yo.getID("conversation_contact_global_status", "id"));
            String str = "ۚ۬ۗۨۖۗۚۙۖۢ۫ۙۦۨۨۥۤۛ";
            while (true) {
                switch (str.hashCode() ^ 2089589959) {
                    case -942515948:
                        if (!isGroupJid) {
                            str = "ۥۗۨ۫۫ۙ۠ۢۧۦۥ۠ۘۧۗ۫";
                            break;
                        } else {
                            str = "ۜۦۦۢۘۚ۫ۘۤۛ۠ۘۘۨۥ۠ۜۦۤۥ۫۠ۦۧۦۘ";
                            break;
                        }
                    case -681492539:
                        str = "ۗۤۖۘۥ۟ۡۘۧۡۙۦۛۗۜۥۗۛۗۜۘۖۛۤ۬ۨۜۤ۟ۤ";
                        break;
                    case -310514011:
                        String str2 = "ۤ۬ۖۗۧۢۡۖۜۘ۫۟ۥۚۗۖ";
                        while (true) {
                            switch (str2.hashCode() ^ -2055425462) {
                                case -1388616563:
                                    str2 = "ۤ۟ۜۖۗۛۨ۫ۡۘۘۤۗۢۘۨ";
                                    break;
                                case -744434960:
                                    textView.setVisibility(8);
                                    return;
                                case -575690825:
                                    if (!yo.statuschat_disabled()) {
                                        str2 = "ۜۛۦ۟ۚۚۙ۠ۙۜۙۡۘۘ۬ۡۘۨۢۥۘ۬ۡۧۙۙۢۘ۠ۥ";
                                        break;
                                    } else {
                                        str2 = "ۧۧۦۦۗ۫ۗۦۨۘۦۧۖۧۜ۠۫۟ۗۥ۠ۜ";
                                        break;
                                    }
                                case 921977869:
                                    textView.setText(AnonymousClass2Sy.A03(conversation, textView.getPaint(), C17250um.A21(), r6.A0T));
                                    textView.setTextColor(others.getColor("ModChatGStatusT", -1));
                                    textView.setSelected(true);
                                    String str3 = "ۗ۫ۗ۟۠ۢۛۗۗۡۦۘۛۛۧ";
                                    while (true) {
                                        switch (str3.hashCode() ^ 372791690) {
                                            case -1394660768:
                                                str3 = "ۢۤۥۛۡۙۙۛۥۘۨۜۡۖۥ";
                                                continue;
                                            case -1254049468:
                                                textView.setBackgroundColor(others.getColor("ModChatGStatusB", Color.parseColor("#44000000")));
                                                break;
                                            case 766459133:
                                                textView.setBackground(shp.getGradientDrawable("ModChatGStatusB"));
                                                break;
                                            case 1124668539:
                                                if (!shp.getIsGradiet("ModChatGStatusB")) {
                                                    str3 = "۬ۥۡۘۤۜۨۘۚۢۗۜ۬ۜۘۛۥۖۦ۫ۨۘۨۘ";
                                                    break;
                                                } else {
                                                    str3 = "۠ۜ۫ۧۛۖۘۥۖۨۖۨ۠ۥۖۦۘ۬ۥ۠ۛۚۢ۠ۜۛۙۧۜ";
                                                    continue;
                                                }
                                            default:
                                                continue;
                                        }
                                    }
                                    textView.setVisibility(0);
                                    tf.clickcopytext(textView);
                                    return;
                            }
                        }
                        break;
                    case 287936226:
                        textView.setVisibility(8);
                        String str4 = "ۦۤۚۛۚ۟ۧ۟ۨۘ۠ۢۦۘۜۢۨۘۧۘۥۘۤۡۖۘ";
                        while (true) {
                            switch (str4.hashCode() ^ -746803011) {
                                case -1876151292:
                                    str4 = "۬۟۬۠ۘۥۘۜۗۢۚ۟ۡۜۦۧۘ۫ۜۜۘ";
                                    break;
                                case 72219228:
                                    new Handler(Looper.getMainLooper()).postDelayed(new b1(conversation, 0), 7);
                                    return;
                                case 694714532:
                                    if (!Conversation.isGroupDescPinned()) {
                                        str4 = "۬ۗۡ۫ۨۥۥۖۥ۠۫ۡۘۡۛۘۘ۫ۡۧۥۡۘۡۥۚ";
                                        break;
                                    } else {
                                        str4 = "ۙ۟۠ۨۡۘۘۡ۠ۙۛۢۡ۬ۡۡ";
                                        break;
                                    }
                                case 1274425616:
                                    return;
                            }
                        }
                        break;
                }
            }
        } catch (Exception e2) {
        }
    }

    public static void a(Job job) {
        String str = "ۜ۠ۘۘۗۚۡ۠ۘ۟ۗۨۘۡۧ۫۫ۛۛۤۘ۟ۘۘۗۦۢۛ";
        while (true) {
            switch ((str.hashCode() ^ 917) ^ 98824052) {
                case -660416014:
                    str = "۬ۨۡۘۥۧۨۧۥۥۥۜۨۘۚۢۤ";
                    break;
                case 712008908:
                    f105k.A00(job);
                    str = "ۦۤۘۧۦۘۤ۬ۥ۬ۙۥۘۛۙۤ۟۠ۛۜۤۦ۬ۤۡۛۥۨ";
                    break;
                case 1209085888:
                    String str2 = "۬ۙۨ۫ۤۦۘ۠ۛ۬ۢ۬ۤۗ۫ۡ";
                    while (true) {
                        switch (str2.hashCode() ^ -639845269) {
                            case -2145046699:
                                if (f105k != null) {
                                    str2 = "ۗۧۥۘ۫ۢۗ۠ۨۧۦۦۜۘ۫ۦۦ";
                                    break;
                                } else {
                                    str2 = "ۤۧۜۗۖ۠ۧۤۦۤۛۧ۬ۛۘۚ۫ۛۤۛۘۨۥ";
                                    break;
                                }
                            case -1832509105:
                                str = "ۜۡۧۘۧ۠ۢۢۨۦۘۛۛۜۘ۟ۨۤۘۥ۬";
                                continue;
                            case -199140987:
                                str2 = "ۨۘ۫ۢۥۧۗۤۛۘۛ۫ۛۗۖ۟ۖۥۘۧۤۢ";
                                break;
                            case 1056469062:
                                str = "ۤ۟ۘۘۤۖۙۗۡۖۛۨۚۖۘۦۧۦۦۘ۬ۛۤ";
                                continue;
                        }
                    }
                    break;
                case 1720796938:
                    f105k = C19000xb.A21();
                    str = "ۤ۟ۘۘۤۖۙۗۡۖۛۨۚۖۘۦۧۦۦۘ۬ۛۤ";
                    break;
                case 1998860704:
                    return;
            }
        }
    }

    public static void bubbleTextOptions(C30011bb r6, TextView textView, float f2) {
        int i2;
        String str = "۫ۘۨۦۤۢۖۧۜ۫ۦۥۘۛۘۦ";
        while (true) {
            try {
                switch (str.hashCode() ^ -1512178737) {
                    case -1720599779:
                        str = "ۡۨۖۘۛۥۧۢۦ۫ۚ۫ۜۘۖۛ۠ۗۘۧۘۛۛۜۘ۫ۙۚۗۥۦۘ";
                        continue;
                    case -900347700:
                        i2 = f97c;
                        break;
                    case -226288870:
                        i2 = f98d;
                        break;
                    case 616642038:
                        if (r6.getFMessage().A11.A02) {
                            str = "ۜ۬ۘۥۤۚۨۢۦ۫۟ۥۘۜۚۖۘۛۖۥۘۛۦۜۛۖۜۚ۠ۖ";
                            break;
                        } else {
                            str = "ۘۜۧۗ۟ۘۘۗۦۖۗ۠ۜۢۖۢۥ۬ۡۘ";
                            continue;
                        }
                    default:
                        continue;
                }
            } catch (Exception e2) {
                return;
            }
        }
        textView.setTextColor(i2);
        String str2 = "۫ۗۨۘۚۥ۠ۧۚۖ۟ۡۤۘۧ۬ۜۙ";
        while (true) {
            switch (str2.hashCode() ^ 174664835) {
                case -1055727166:
                    return;
                case -829734959:
                    String str3 = "ۗۙۘۗۛۥۘۛۤ۫۫ۦۜۨ۟ۢۗۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 1384465063) {
                            case 225673612:
                                str3 = "ۢ۠ۨۘۤۙۨۦۡۘۘۗۚۘۘ۠ۡۨ";
                                break;
                            case 701223915:
                                return;
                            case 1216224039:
                                if (Math.rint((double) f2) - ((double) f96b) >= 1.0d) {
                                    str3 = "۫ۨۡۗۖۧۘۗۡۤۙۖۥۘ۠ۥۦۘ۟ۤۗۜۨۖۘ۟ۦۦ";
                                    break;
                                } else {
                                    str3 = "۫ۦۢۡۛۙۢۜۧ۟ۤۛۥۢۙۘۡۤۘۙ۬ۘۘ";
                                    break;
                                }
                            case 1971599683:
                                int i3 = f95a;
                                String str4 = "ۦۗۨۘۨۦۖۨۖۦۛۘۡۚۘۧۘۘۥۜۘ";
                                while (true) {
                                    switch (str4.hashCode() ^ 653724128) {
                                        case -43339968:
                                            str4 = "ۜۡۖۘۨۘ۟ۢۤۛۗۥۦۤۜۢ";
                                            break;
                                        case 33662203:
                                            if (i3 <= 5) {
                                                str4 = "ۙۥۘۛ۟۟ۨ۟۠ۤ۟۟۟ۜۘۨۢ۠ۥ۫";
                                                break;
                                            } else {
                                                str4 = "ۦۚۖ۬۬ۨۘۥۡۡۘ۟ۧۜۚ۫";
                                                break;
                                            }
                                        case 1737549083:
                                            return;
                                        case 2103043491:
                                            textView.setTextSize(2, (float) i3);
                                            return;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 96973569:
                    if (f95a == 16) {
                        str2 = "ۥۥ۬ۨۜۤۦۗۥۘۡۘۖۙۤۖۘۨ۟ۦۘۙۜۧۘ";
                        break;
                    } else {
                        str2 = "ۤ۫ۖۥۗۥۘ۟ۢۚۘۡۡۡۛۖۘۥۙۛ";
                        break;
                    }
                case 545416501:
                    str2 = "ۙۗۗۜۖۥۢۧۡۤۢۜ۟ۧۙ۫ۤۜۘۨ۬۟۟ۡۦۘۗۨ۠";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a1, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(java.lang.String r6) {
        /*
            r2 = 0
            r1 = 1
            int r3 = com.obwhatsapp.youbasha.ui.activity.CallsPrivacy.getCallsControlLevel()
            r4 = -816501471(0xffffffffcf552d21, float:-3.57650458E9)
            java.lang.String r0 = "ۚۘ۫ۥ۟ۖۘۘۖۨ۫ۖۨۘۥۙۗ"
        L_0x000b:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x00e5 }
            r5 = r5 ^ r4
            switch(r5) {
                case 837381803: goto L_0x008b;
                case 1230902822: goto L_0x002a;
                case 1279193211: goto L_0x0033;
                case 1982972368: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x000b
        L_0x0014:
            r4 = -1578828430(0xffffffffa1e4fd72, float:-1.5516967E-18)
            java.lang.String r0 = "ۧۧۖۘۢۤۖ۟ۦۛۜۘۡۗۗۙۗۛۨۚۦ"
        L_0x0019:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1290174411: goto L_0x0039;
                case -530897656: goto L_0x0022;
                case 1294846237: goto L_0x003c;
                case 1918749965: goto L_0x00da;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0019
        L_0x0022:
            if (r3 == r1) goto L_0x0036
            java.lang.String r0 = "۟ۗۡۘۛۘۨۘۤ۫ۜۘ۫ۢۦۦۤۖ۬ۨۦۘۜ۟۠"
            goto L_0x0019
        L_0x0027:
            java.lang.String r0 = "ۡۢۤۙۘۥۘۡۨۖۘۙ۫ۨۤۥۧ۟ۗۗ"
            goto L_0x000b
        L_0x002a:
            boolean r0 = com.obwhatsapp.youbasha.ui.activity.CallsPrivacy.isContactCustomBlocked(r6)     // Catch:{ Exception -> 0x00e5 }
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "ۛ۠ۜۤۤۙۤۧۢۛۗۙۤۦۜ"
            goto L_0x000b
        L_0x0033:
            java.lang.String r0 = "۠ۘۜۛۢۨۘۛۨۥۦ۬۫ۥ۟۬"
            goto L_0x000b
        L_0x0036:
            java.lang.String r0 = "۟ۧۦۘۨۥۗۨۦۥۢۚۛۖۧۦۘ"
            goto L_0x0019
        L_0x0039:
            java.lang.String r0 = "۬۬ۥۘۗۖۙۧۡ۬ۜۤۗۤ۬۬۬ۨ۟ۡۢۦۘۚۡۦۘۧ۫ۢ"
            goto L_0x0019
        L_0x003c:
            r4 = -707737291(0xffffffffd5d0c935, float:-2.86953245E13)
            java.lang.String r0 = "۟ۥۦۦۙۥۘۢۘۜ۬ۘۧۘۥ۬ۖۧۨۛۛ۬ۨۘۚۖۧۘ"
        L_0x0041:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -917093629: goto L_0x004a;
                case 422116493: goto L_0x0053;
                case 1149683234: goto L_0x0093;
                case 1374406044: goto L_0x0056;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x0041
        L_0x004a:
            r0 = 2
            if (r3 == r0) goto L_0x0050
            java.lang.String r0 = "ۛۚۡۘ۠ۧۨۨۢۗۘۢۘ۫۬ۡۘۗ۠ۡۘۖۦۧۘۤۧ"
            goto L_0x0041
        L_0x0050:
            java.lang.String r0 = "ۤۚۡۘۤۚ۠ۘۙۘۧۧۚۢۖۢۘۦۜۘ۬۫ۗۡۦۖۛ۟ۖۘ"
            goto L_0x0041
        L_0x0053:
            java.lang.String r0 = "ۧۤۘۘۧۢ۫۠۬ۨۘ۬۬ۦۦ۬ۦ"
            goto L_0x0041
        L_0x0056:
            r4 = 1908007474(0x71b9e232, float:1.8409018E30)
            java.lang.String r0 = "ۧۦۥۘ۠ۧۡۦۖۥ۬۟ۛۘۖ۠ۢۢۦۢۥۖۘۙ۫۟ۧۚۤ"
        L_0x005b:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1765177654: goto L_0x0064;
                case -1397568052: goto L_0x0070;
                case -1343782: goto L_0x006a;
                case 1562467812: goto L_0x008c;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x005b
        L_0x0064:
            java.lang.String r0 = "۬ۢۘۘۙۢ۫ۖ۫ۧۧ۟ۗۙۢ۠"
            goto L_0x005b
        L_0x0067:
            java.lang.String r0 = "ۢۗ۠۫ۨۡۘۛۜۧۥۜۘۘۨۜۡۥۥۥ"
            goto L_0x005b
        L_0x006a:
            r0 = 3
            if (r3 == r0) goto L_0x0067
            java.lang.String r0 = "ۙۦۦۘۛۡۗۘ۬ۘۘۧۤۦۨۥۥۘۛۘۤ۫ۤۖۗۦۘۘ"
            goto L_0x005b
        L_0x0070:
            r4 = -300748508(0xffffffffee12f124, float:-1.1369083E28)
            java.lang.String r0 = "۫۟ۚۜ۟ۖۡۦۚۧۚۨۘ۠۫ۨۘۛۤ۬ۚۜۦۛ۬"
        L_0x0075:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -943278371: goto L_0x0087;
                case 400392380: goto L_0x007e;
                case 623518504: goto L_0x008a;
                case 1351566139: goto L_0x008b;
                default: goto L_0x007d;
            }
        L_0x007d:
            goto L_0x0075
        L_0x007e:
            r0 = 4
            if (r3 == r0) goto L_0x0084
            java.lang.String r0 = "ۡۙۚۤۨ۟ۖۧ۫۬۫ۜۦۖۘ۟ۙ۟"
            goto L_0x0075
        L_0x0084:
            java.lang.String r0 = "ۢۡۘۘۖۨ۟ۦۗۖۜۤۨۜۨۥۘۘۦ۬ۗ۟ۚ۬ۖۥ"
            goto L_0x0075
        L_0x0087:
            java.lang.String r0 = "ۖۜۤۢۡۜۘ۟ۗۘۘۨۘۦۤ۬ۢۦۚۤۥۙۥۖۦۚۢۚ"
            goto L_0x0075
        L_0x008a:
            r2 = r1
        L_0x008b:
            return r2
        L_0x008c:
            java.util.HashSet<java.lang.String> r0 = callsList     // Catch:{ Exception -> 0x00e5 }
            boolean r2 = r0.contains(r6)     // Catch:{ Exception -> 0x00e5 }
            goto L_0x008b
        L_0x0093:
            r3 = -772249111(0xffffffffd1f869e9, float:-1.33366096E11)
            java.lang.String r0 = "ۚۡۧۘۢ۫ۖۘۖۡۜۘۡۢۤۛۤ۟ۘۡۤ"
        L_0x0098:
            int r4 = r0.hashCode()     // Catch:{ Exception -> 0x00e5 }
            r4 = r4 ^ r3
            switch(r4) {
                case -1759564105: goto L_0x00a7;
                case -1170387637: goto L_0x00a1;
                case 1628096392: goto L_0x00b9;
                case 1830329955: goto L_0x00b6;
                default: goto L_0x00a0;
            }     // Catch:{ Exception -> 0x00e5 }
        L_0x00a0:
            goto L_0x0098
        L_0x00a1:
            r0 = r2
        L_0x00a2:
            r2 = r0
            goto L_0x008b
        L_0x00a4:
            java.lang.String r0 = "۫ۤ۫ۦۦۗۢۗۙۘۤۘۚ۫۠"
            goto L_0x0098
        L_0x00a7:
            java.lang.String r0 = getContactName(r6)     // Catch:{ Exception -> 0x00e5 }
            boolean r0 = r0.equals(r6)     // Catch:{ Exception -> 0x00e5 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = "ۙ۬ۥۛۡۧۘۛ۫ۙۗۦۚۗۗۦۨ۟ۜ"
            goto L_0x0098
        L_0x00b6:
            java.lang.String r0 = "ۤ۫ۗ۬ۖۨۘ۬ۜۨۘ۫ۛۘۘۜۦۤۦۨۖۘۨۚۤۙۥۛ"
            goto L_0x0098
        L_0x00b9:
            r3 = -2101167052(0xffffffff82c2bc34, float:-2.8613761E-37)
            java.lang.String r0 = "ۜۤۦۘۢۖۘۛۘۜ۬ۧۡۦۥۙۢ۠ۙ"
        L_0x00be:
            int r4 = r0.hashCode()     // Catch:{ Exception -> 0x00e5 }
            r4 = r4 ^ r3
            switch(r4) {
                case -1683460532: goto L_0x00c7;
                case 1212480020: goto L_0x00a1;
                case 2007628774: goto L_0x00cd;
                case 2144109890: goto L_0x00d8;
                default: goto L_0x00c6;
            }     // Catch:{ Exception -> 0x00e5 }
        L_0x00c6:
            goto L_0x00be
        L_0x00c7:
            java.lang.String r0 = "ۤ۬۫ۗۗۧۤۡۘۘۦۥۘۘۙۙ۠ۦۦۤۦۡۘۥۧۡۤۡۙ"
            goto L_0x00be
        L_0x00ca:
            java.lang.String r0 = "۬ۗۤۜۡۦۘۖۖۡۨ۫ۤ۬ۨۨ۫ۨۧۤۡۘۧۦۢۗۧۦ"
            goto L_0x00be
        L_0x00cd:
            java.util.HashSet<java.lang.String> r0 = callsList     // Catch:{ Exception -> 0x00e5 }
            boolean r0 = r0.contains(r6)     // Catch:{ Exception -> 0x00e5 }
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = "ۘ۬ۧۗۙۘۨۛۛۦۢ۟۫۠ۡ۟ۥۤۘ۠ۘۖۚ۫ۖۗۨۘ"
            goto L_0x00be
        L_0x00d8:
            r0 = r1
            goto L_0x00a2
        L_0x00da:
            java.lang.String r0 = getContactName(r6)     // Catch:{ Exception -> 0x00e5 }
            boolean r0 = r0.equals(r6)     // Catch:{ Exception -> 0x00e5 }
            r2 = r0 ^ 1
            goto L_0x008b
        L_0x00e5:
            r0 = move-exception
            r2 = r1
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.dep.c(java.lang.String):boolean");
    }

    public static boolean callControl(Message message, C447225g r7) {
        try {
            CallInfo callInfo = (CallInfo) message.obj;
            String str = "ۙۦۜۛۥ۟ۧ۟ۘۘۡۥ۟ۛۢۜۘ۬۟ۡۨۤۥۛۢۢۜ۫۠";
            while (true) {
                switch (str.hashCode() ^ 547341591) {
                    case -542762129:
                        str = "ۖۢۖۡۧۢ۟ۡ۫۬ۘۤ۟۬ۘۥۡۘۘ۬ۘۨۘ۠۟ۙۛۙۦۘ";
                        break;
                    case -154270778:
                        if (callInfo != null) {
                            str = "ۡۥۜۧ۬ۥۘ۬۠۫ۢۨۨۥۚۘۘۢۚۦۘۖۦ۫";
                            break;
                        } else {
                            str = "ۤۛۘۛۡۘۡۨۙ۟ۗۨۘۘ۫ۜۘۚ۠ۤۛ۠ۥۘۗۨۧ";
                            break;
                        }
                    case 96492982:
                        String str2 = "ۧ۠ۘۖۥۦۘۨۦۨۤۢۖۘۛۦۧۘۗ۟ۗۖۡۡ";
                        while (true) {
                            switch (str2.hashCode() ^ -1597689941) {
                                case -1657959802:
                                    if (!callInfo.isCaller()) {
                                        str2 = "ۤۤۦۙۙۦۘ۬ۜ۠ۛۗۘۡ۟ۙۙۙ۫ۖۦۘ";
                                        break;
                                    } else {
                                        str2 = "ۘۡۨۜۡۜۘ۟ۜۖۘۘۧۜ۠ۡۖۘۧ۠ۡۘ۟ۖۖۤۚۚ";
                                        break;
                                    }
                                case -1640682195:
                                    str2 = "ۙ۬ۡۘۘۤۦ۬ۙ۬۠ۢۚۖ۟ۖ";
                                    break;
                                case -1624934913:
                                    String stripJID = yo.stripJID(getJID_t(callInfo.getPeerJid()));
                                    String str3 = "ۚۨۤۥۖۡۥۧۨۖ۫ۦۢۡۧۧۗۘۘۡۡ۠";
                                    while (true) {
                                        switch (str3.hashCode() ^ 1038076504) {
                                            case -1590911545:
                                                str3 = "ۧۢ۠ۗۡ۫ۦۧۜۖ۫ۤ۫۬ۘ۠ۧ۬۟ۧۘۘۦۦۧۙۜۡ";
                                                break;
                                            case -1198073275:
                                                return true;
                                            case -1048765643:
                                                if (!c(stripJID)) {
                                                    str3 = "ۛۦۢ۬ۛۜۘۦۚۤۛ۬ۨ۠۟ۤۜ۬ۗۤ۫ۘۘ۬ۦۨۘ";
                                                    break;
                                                } else {
                                                    str3 = "۠ۤۖۘۥۘۗۙۤ۫ۗۢۗۨۨۚۧۖ";
                                                    break;
                                                }
                                            case -130152732:
                                                r7.YoEndCall();
                                                r7.A14.execute(new d1(callInfo.getCallId(), CallsPrivacy.getCallsRejectType(), stripJID));
                                                return false;
                                        }
                                    }
                                    break;
                                case -54093361:
                                    return true;
                            }
                        }
                        break;
                    case 1696523135:
                        return true;
                }
            }
        } catch (Exception e2) {
            return true;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int callControl_blockincome(com.whatsapp.jid.UserJid r8) {
        /*
            r1 = 1
            r2 = 0
            int r3 = com.obwhatsapp.youbasha.ui.activity.CallsPrivacy.getCallsRejectType()     // Catch:{ Exception -> 0x0085 }
            r4 = -1572790746(0xffffffffa2411e26, float:-2.6172338E-18)
            java.lang.String r0 = "ۘ۫۬ۡ۟ۧۤ۬ۢۗۘۦ۟ۤۜۜۦۨ۟۬ۦ"
        L_0x000b:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x0085 }
            r5 = r5 ^ r4
            switch(r5) {
                case -2008272495: goto L_0x0044;
                case -1485176867: goto L_0x004e;
                case -1389878117: goto L_0x004b;
                case -1376343930: goto L_0x0014;
                default: goto L_0x0013;
            }     // Catch:{ Exception -> 0x0085 }
        L_0x0013:
            goto L_0x000b
        L_0x0014:
            r3 = r2
        L_0x0015:
            java.lang.String r0 = getJID_t(r8)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r4 = com.obwhatsapp.yo.yo.stripJID(r0)     // Catch:{ Exception -> 0x0085 }
            boolean r5 = c(r4)     // Catch:{ Exception -> 0x0085 }
            r6 = -490278566(0xffffffffe2c6f15a, float:-1.8349233E21)
            java.lang.String r0 = "ۧۛ۠۟ۙۖۘ۬ۘۡۘۢۧۥۘۦۧۨۘۨۚۥۘۛۡۢ"
        L_0x0026:
            int r7 = r0.hashCode()     // Catch:{ Exception -> 0x0085 }
            r7 = r7 ^ r6
            switch(r7) {
                case -1697750471: goto L_0x0053;
                case -1149662296: goto L_0x005b;
                case -839376999: goto L_0x0058;
                case 1210927748: goto L_0x002f;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x0026
        L_0x002f:
            r0 = r2
        L_0x0030:
            r3 = 908971581(0x362dce3d, float:2.5899055E-6)
            java.lang.String r1 = "ۘۗۨۘ۫ۖۦۘ۫ۚۦۖۜۘۘۘۡۡۘ"
        L_0x0035:
            int r5 = r1.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case -1217818925: goto L_0x007e;
                case -469497913: goto L_0x0081;
                case 320570636: goto L_0x0079;
                case 1167830005: goto L_0x003e;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0035
        L_0x003e:
            r2 = 99
        L_0x0040:
            return r2
        L_0x0041:
            java.lang.String r0 = "ۧۙۖۙۖۢۤۤۦۘۦۥۗۘۢ۠ۧۚۖۘۡ۟ۜۘ"
            goto L_0x000b
        L_0x0044:
            r0 = 77
            if (r3 != r0) goto L_0x0041
            java.lang.String r0 = "ۧ۟ۘۘۨۦۥۗ۫ۥۜۤۦۘۘ۟۠"
            goto L_0x000b
        L_0x004b:
            java.lang.String r0 = "۟ۚۡۘۛۗۙ۬۠ۨۘۤۤۦۘۙۖۦۘۛۜ۟ۘۡۖۤ۫ۙۢۘۦۘ"
            goto L_0x000b
        L_0x004e:
            r3 = r1
            goto L_0x0015
        L_0x0050:
            java.lang.String r0 = "ۛۖۦۘۦۦۡۘۘۦۥ۟۫ۙۜۛۘۘۢۧ"
            goto L_0x0026
        L_0x0053:
            if (r3 == 0) goto L_0x0050
            java.lang.String r0 = "ۨۚۙ۫ۨ۬ۦۧۦۚۥۡۘۘۦۨۘۜۡۡۘۙ۠ۘۥ۬ۢ"
            goto L_0x0026
        L_0x0058:
            java.lang.String r0 = "ۛۢ۬۬ۙۗۖ۠۠۬ۥۗۨۘۚۜۧۚ"
            goto L_0x0026
        L_0x005b:
            r3 = -1792110891(0xffffffff952e8ed5, float:-3.5251695E-26)
            java.lang.String r0 = "ۦۨۙۖۗۚۨۥۡ۫ۗۘۘۦۡۘ۬ۨۥ"
        L_0x0060:
            int r6 = r0.hashCode()
            r6 = r6 ^ r3
            switch(r6) {
                case -1869761859: goto L_0x002f;
                case -1646862252: goto L_0x0074;
                case -1323305983: goto L_0x0069;
                case 299364623: goto L_0x006f;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x0060
        L_0x0069:
            java.lang.String r0 = "ۙۜۨۘۗۚ۟ۨۘۘۘۥۤۨۘۗ۠ۨۘ"
            goto L_0x0060
        L_0x006c:
            java.lang.String r0 = "ۖۥۢ۬ۢۙ۫ۜۜۘ۫۫ۖۜۦۥۛۨۤۥۢ۬ۦ۠ۨۘۥۗۦۘ"
            goto L_0x0060
        L_0x006f:
            if (r5 != 0) goto L_0x006c
            java.lang.String r0 = "ۖۖۚۢۡۢ۠ۜۥۘ۟ۦۛۡۙۘۘۧ۬ۨۖۜۜۘۤۚۛ"
            goto L_0x0060
        L_0x0074:
            r0 = r1
            goto L_0x0030
        L_0x0076:
            java.lang.String r1 = "ۢ۬۫ۢۢۛۚۛۨۥ۠۟ۖۧۘۢۡۗ"
            goto L_0x0035
        L_0x0079:
            if (r0 == 0) goto L_0x0076
            java.lang.String r1 = "ۢۧۡۘۨ۠ۘ۬ۧۨ۫ۖۧۡ"
            goto L_0x0035
        L_0x007e:
            java.lang.String r1 = "ۙۛۖ۟ۙۙۛۥۛۙ۠۫ۘۜۨۘ۫ۥۦۘۚۦۤ"
            goto L_0x0035
        L_0x0081:
            j(r4)     // Catch:{ Exception -> 0x0085 }
            goto L_0x0040
        L_0x0085:
            r0 = move-exception
            r2 = 33
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.dep.callControl_blockincome(com.whatsapp.jid.UserJid):int");
    }

    public static void callDlg(C16010sH r10, Conversation conversation, boolean z2) {
        String str = "ۖۢۤۦۜۘۖۙۧۡۛۤۘۚ۠ۛ۫ۖۖۦۨۜۜ۠ۤ";
        CustomAlertDialogBuilder customAlertDialogBuilder = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        while (true) {
            switch ((str.hashCode() ^ 211) ^ -1303687222) {
                case -2102325533:
                    str = "ۜۘ۫ۤۖۨۘۦۜۘۙۜۥۘۛۙۢ۬ۦۛۖ۫ۤۡ۫ۖۘۥۤ۠";
                    break;
                case -2003376936:
                    String str2 = "ۡۙۙۨۥۤۛۤۘۘۖۙۚۢۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -1133376751) {
                            case -2119496099:
                                if (!z2) {
                                    str2 = "۠ۧۖۛ۫ۖۘ۬ۗۡۤ۠ۨۤ۟ۡۘۨۨ۟۟ۛۥۘۨۘۢۢۥۘۘ";
                                    break;
                                } else {
                                    str2 = "۟ۚ۬۫ۖۡۘ۬ۘۜۤ۬۠ۘۦ۬ۜۜۤ";
                                    break;
                                }
                            case -1399298463:
                                str = "۟ۦۨۡۗۥۘۖۢۥۗۚ۠ۗۦۗ۬ۛۖ";
                                continue;
                            case -798101872:
                                str2 = "ۚۤ۠۟۫ۘۘۚۡۤۗۘۨۗۗۜ";
                                break;
                            case -713295199:
                                str = "ۙۥۧۘۙ۬ۘۛۜۦۥۥۖ۬ۜۜ۠۫ۙۤۘۘ";
                                continue;
                        }
                    }
                    break;
                case -1934092408:
                    customAlertDialogBuilder.create().show();
                    str = "ۜۙۛۤۢۜ۟ۚۢۙۥۜۗۖۦۘ۫ۛۡۘ۫ۙۗۦۙ۫۬ۡۥۘ";
                    break;
                case -1550708772:
                    str = "۫۠ۢۦۗ۠ۦۗۜۦۥۚۗ۟ۚ۟۬۠ۨۢۢۗۦۤ۫ۖ";
                    strArr2 = strArr;
                    break;
                case -1315578445:
                    String str3 = "ۜ۫۫ۗ۠ۘۘۖۘۘۛۦۢۘۙ۟ۘۤۘۘ۟ۚۡۘۡ۫ۤۖۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 638410581) {
                            case -1603084749:
                                if (!yo.isGroupJid(getJID_data(r10))) {
                                    str3 = "ۡ۠۠ۛۧۘۘۧۦۥۘۛۙۡۘ۠ۖۖ";
                                    break;
                                } else {
                                    str3 = "ۗ۫ۘۘۤۡ۠ۖ۬ۙۧۡۖ۠ۨۛۗ۬ۦۡۖۧۘ۟۫ۖۘ";
                                    break;
                                }
                            case -127425422:
                                str = "۫ۢۖ۫ۡۗۘۗۜۘۛۘۛ۟ۨۧۜ۫۬";
                                continue;
                            case 1237377103:
                                str3 = "۫ۙۜۦۙۘ۬ۗ۬۬ۚۨۘۨۥۘۘ۫ۦۥۛۘ۫۠ۖۦ";
                                break;
                            case 1972503737:
                                str = "ۨۗۙۡ۠ۧ۬ۦ۫ۧۨۦۥۛۜۘۛۡ۬ۨۖۧ";
                                continue;
                        }
                    }
                    break;
                case -1067751183:
                    str = "۫۠ۢۦۗ۠ۦۗۜۦۥۚۗ۟ۚ۟۬۠ۨۢۢۗۦۤ۫ۖ";
                    break;
                case -809983696:
                    customAlertDialogBuilder.setMessage((CharSequence) yo.getString("video_call_confirmation_text")).setNegativeButton(17039360, (DialogInterface.OnClickListener) new x(8)).setPositiveButton((CharSequence) yo.getString("call"), (DialogInterface.OnClickListener) new e1(conversation, 0));
                    str = "ۙۜ۠ۚۡۧ۟ۚۜ۟ۥۥۘۦۦۥۘ۫ۜۜۘ";
                    break;
                case -426938382:
                    customAlertDialogBuilder = new CustomAlertDialogBuilder(conversation);
                    str = "۫ۜۢۜۜۡۘۢۙۚ۫ۚۤۘۦۜۙۖۢۚۤۜ";
                    break;
                case -345311692:
                    customAlertDialogBuilder.setItems((CharSequence[]) strArr2, (DialogInterface.OnClickListener) new e1(conversation, 1));
                    str = "ۜۢۜۘ۬۬ۦۘۘۘۗۦ۠ۨۘۜۥ۠ۨ۟۫ۖۜۤ۬ۢۛ";
                    break;
                case -49505567:
                    strArr[0] = yo.getString("audio_call");
                    str = "ۡۛ۟ۖۧ۬۠ۙۡۘۚۡۨۘۨۖۙۧۡۛۗۜۢۙۥۜۛ۫ۤ";
                    break;
                case -34371273:
                    strArr[1] = yo.getString("ncall");
                    str = "ۡۢ۠ۢۡۧ۠ۤۘۖۗۦۚۙ۟ۙۡۘ۫ۜ۠";
                    break;
                case 8443470:
                    strArr3[0] = yo.getString("audio_call");
                    str = "ۡۚۥۜۥۖ۟ۧۖۜۥ۟ۘ۬ۖۘ";
                    break;
                case 895656774:
                    str = "ۜۙۛۢ۟ۘۘۗ۟ۢۦۧۘۡۨۖۜۖۖۥ۬ۢ۫ۡۜۘ";
                    strArr2 = strArr3;
                    break;
                case 1273761582:
                    str = "ۧۙۙۙ۫ۘۘۗۗۖۘۢۤۢۦۡۘ";
                    strArr = new String[2];
                    break;
                case 1383508857:
                    strArr3 = new String[1];
                    str = "ۥۗۜۘ۬ۖۥۗۖۜۛۚۖ۟ۗۘۧۙ۠ۧۧ۠ۖ۠ۖۘ";
                    break;
                case 1502437603:
                    str = "ۖۢ۬ۡۢۚۘۜۨۙۧ۟ۖۙۦۡۘۨۧۖۡۘ";
                    break;
                case 1537973025:
                    return;
                case 1939895950:
                    str = "ۜۢۜۘ۬۬ۦۘۘۘۗۦ۠ۨۘۜۥ۠ۨ۟۫ۖۜۤ۬ۢۛ";
                    break;
                case 1947084125:
                    str = "ۧ۫ۨۜۛۨۘ۬۫ۘۚ۠۫ۚ۫ۥۖۙۢۜۤۘۘ۫۬ۖۘۢۧ";
                    break;
            }
        }
    }

    public static void callDlgVoiceVid(C16010sH r9, Activity activity) {
        String str = "ۜۗۦۘ۬۠ۗۗۨۥۚۥۙۨۡۢ۬ۡۡۘۛ۫ۦۘ";
        c1 c1Var = null;
        CustomAlertDialogBuilder customAlertDialogBuilder = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            switch ((str.hashCode() ^ 279) ^ 784534932) {
                case -1671697848:
                    return;
                case -1516206425:
                    customAlertDialogBuilder.setItems((CharSequence[]) new String[]{str3, str2}, (DialogInterface.OnClickListener) c1Var);
                    str = "ۗۦۜۘۚۖۜۘۢ۠۬ۧۗۥۡۤۙۡۨۧۘۤۘۛ";
                    break;
                case 100901853:
                    str = "ۛۛۥۦۖ۠ۗ۠ۘۙۚۦۘۦۚۙ۠۠ۥۨۘ";
                    customAlertDialogBuilder = new CustomAlertDialogBuilder(activity);
                    break;
                case 249125572:
                    c1Var = new c1(r9, activity, 0);
                    str = "ۨۦۨۘ۟ۤۨۜۘۖ۠ۗۦۡۙۦ";
                    break;
                case 440459124:
                    str = "ۦۖ۠ۤۨۜۥۥۦۙۦۦۘۥ۫۬ۦۙۦۘۘ۠ۗۙۥ۫";
                    str2 = yo.getString("video_call");
                    break;
                case 574164316:
                    str = "ۚۥۜۘۡۨۙۥۖۦۥ۠۬۟ۜۛۖۖ۬ۚۛۦۘۧۙۛۨ۫ۨۘ";
                    break;
                case 941016004:
                    str = "ۚۥۧۤۗۖۛۦ۫ۗۚۨۥۜۗ۠۬ۧ۫ۧۡۤۥ";
                    break;
                case 1375001783:
                    str = "ۧۗۗۜۗۖۗۛۥۙۧۜۘۜۖ۬ۖۢۚۗۨۛۢۢ";
                    str3 = yo.getString("audio_call");
                    break;
                case 1403325280:
                    customAlertDialogBuilder.create().show();
                    str = "ۖ۬۠ۡ۠ۢۙۦۡۘۙۗۛ۠ۖۗۜۤۨۘۤ۟۟";
                    break;
            }
        }
    }

    public static void checkContactOnline(C15830rv r5) {
        try {
            String jID_t = getJID_t(r5);
            String str = "۬ۢۗۗ۫ۗۡۜ۠ۡ۟ۗۦۛۢۘ۬ۛ۫ۧۧ";
            while (true) {
                switch (str.hashCode() ^ 2056960186) {
                    case -2019033563:
                        return;
                    case -1121639071:
                        if (jID_t.isEmpty()) {
                            str = "۟ۢۘۘۧۢۨۧۖۙۡۨۗۨ۫ۡۖ۠ۗ";
                            break;
                        } else {
                            str = "ۚۧۖ۫ۛ۠ۤ۠ۥۘۥۗۤۜۨۦۧۦۘۗ۟ۛۖۧۖ۟ۜۥ";
                            break;
                        }
                    case -208120757:
                        String str2 = "۫۟ۦۘۡ۬ۨۚ۬ۡۘۗۢۗۘۨ۫ۢۚۧۛۨۥ";
                        while (true) {
                            switch (str2.hashCode() ^ 36310793) {
                                case 962499729:
                                    if (yo.isGroupJid(jID_t)) {
                                        str2 = "ۤ۠ۙۦۘۜۘۢۦۧۘۜۦۦۗۧۨ";
                                        break;
                                    } else {
                                        str2 = "ۢۡۡۜۘۛۘ۬ۛۖۢۦۗۦۦ۠ۨۘ۠۟ۥۘۢ۫ۨۘۗۦۜ";
                                        break;
                                    }
                                case 1603743696:
                                    String str3 = "ۢۙۨۘۗ۬ۨۨ۠ۛۨۡ۠ۖۨ۟ۛ۟ۜ";
                                    while (true) {
                                        switch (str3.hashCode() ^ -856779627) {
                                            case -2139778509:
                                                String str4 = "ۧۖ۟ۚۚۛۦۙۖۘ۠ۨۘۚۦۜ۫ۜۜۘ۬ۦۖۘۥ۫ۥۘۡۖۦ";
                                                while (true) {
                                                    switch (str4.hashCode() ^ -877478324) {
                                                        case -311815214:
                                                            str4 = "ۢۚ۠ۥۗۥۧۥۧۘۡۥۨۘۢۘۨۘ۟ۢۗۛۚۨۘ";
                                                            continue;
                                                        case 600130371:
                                                            String str5 = "ۗۤۦۘۢۢۡۥۗۨۘ۠ۦۚ۟ۦۤۥۖۧۧ۬ۖۡۗۨۘ";
                                                            while (true) {
                                                                switch (str5.hashCode() ^ -1702505395) {
                                                                    case -1893383549:
                                                                        if (!shp.getBooleanPriv("chats_show_contact_online_toast_check_" + yo.stripJID(jID_t))) {
                                                                            str5 = "ۛۡ۠ۨۦۚۦ۟۟ۘۘۦۘ۠ۧۚ";
                                                                            break;
                                                                        } else {
                                                                            str5 = "ۛۦۚۡۡۛۘۨۧۘۧۥۘۘۚ۠ۡۙۙۛۜ۬۫ۗ۟ۡۦۡۧۘ";
                                                                            continue;
                                                                        }
                                                                    case -1319319233:
                                                                        return;
                                                                    case 112458512:
                                                                        str5 = "۟ۚۡۘۜ۫ۦۘ۫ۛۗۚۥۥۘۥۜۢۗۢۨۤ۟ۛۢ۟۫";
                                                                        continue;
                                                                    case 1087051800:
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                            }
                                                        case 912002086:
                                                            break;
                                                        case 2086504259:
                                                            if (yo.chats_show_contact_online_toast_check()) {
                                                                str4 = "۬ۖۦۚۘۤۘۥۧۘۖۛ۟ۗ۠۫ۜۖ";
                                                                break;
                                                            } else {
                                                                str4 = "ۨۚۘ۠ۚۢۚ۟ۦۘۖۤۚۙۖۗۦۗۖ";
                                                                continue;
                                                            }
                                                        default:
                                                            continue;
                                                    }
                                                }
                                                new fl2(yo.stripJID(jID_t)).execute(new Void[0]);
                                                return;
                                            case -1121832946:
                                                if (!jID_t.equals(myNum)) {
                                                    str3 = "ۨۥۨۘۦ۫۟ۨۦۥۜ۠ۨۘۤ۬ۢۧۢۦۦۨۜۤۚۗ";
                                                    break;
                                                } else {
                                                    str3 = "ۘ۠ۘۧ۠ۧۜۢۤ۫ۗۡۛ۟ۦۧۨ۠ۖۥۥۘ";
                                                    break;
                                                }
                                            case -933549984:
                                                return;
                                            case 1579564865:
                                                str3 = "۬ۚۤۤۗۧۤۙۗۡ۟ۥۥ۟ۥۘۡۧۨۘ۫۬ۘۘۥۢۙ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1771780240:
                                    str2 = "ۙۤ۬ۨۜ۟۟ۗۨۤۙۢ۠ۖۢ۠ۢۦۘ";
                                    break;
                                case 1958526581:
                                    return;
                            }
                        }
                        break;
                    case 1792190849:
                        str = "۠۫۠ۧۨۢۗۚ۠ۢۛ۬ۢۗۨ";
                        break;
                }
            }
        } catch (Exception e2) {
        }
    }

    public static void clearCalls() {
        String str = "ۥۖۜۘۘۘۡۘۛۡۤ۟ۤۨۘ۟ۨۘۡۘۤۖۘ۠";
        while (true) {
            switch ((str.hashCode() ^ 530) ^ -2102956725) {
                case 1205934600:
                    f100f.deleteCalls();
                    str = "ۙۥۨ۬ۗۘۘۙۜۙۥۚۦۘۦۨۘۚۥۧ۟۬ۗ";
                    break;
                case 2145665303:
                    return;
            }
        }
    }

    public static void controlReadTi(String str) {
        String str2 = "ۚ۬ۢ۫ۙۦۜۨۧۖۚۡۘ۠ۥۨ";
        while (true) {
            switch ((str2.hashCode() ^ 329) ^ 1785976090) {
                case -1943486068:
                    String str3 = "ۧۦۡۘ۟ۗۥ۟ۢۘۦۧۖۡۨۙۖۗۦۘۢۥۨۛۖۢ";
                    while (true) {
                        switch (str3.hashCode() ^ 513593585) {
                            case -1502429937:
                                str3 = "۬۠ۡۚۨۖۨۥۜۘۗۛۖۧۢۜۧ۫ۦۡۗۢ۬ۗۚ";
                                break;
                            case -845854861:
                                str2 = "۬ۛ۫ۢ۫ۡۘۥۤ۟ۤ۬ۨۘۛ۬۠ۡ۠ۗۜ۟۫";
                                continue;
                            case -807460586:
                                str2 = "۬ۖۜۘۤۡۨۙۢ۫۬ۢۘۡۥۢ۠ۤۥۘۛۢ۟";
                                continue;
                            case 40745569:
                                if (shp.getBooleanPriv("yoBlueOnReply")) {
                                    str3 = "۠ۨۧۡۦۧۤۗۙۤۚۢ۟۬ۧۧۖۧ";
                                    break;
                                } else {
                                    str3 = "ۢۡۧۘۤۢ۠۠۬ۨ۟ۢۙ۟ۜۖۘۗۨۚ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1909264789:
                    new Handler(Looper.getMainLooper()).post(new f1(0, str));
                    str2 = "ۜۢۗۡۙۘۘۗۦۖۡۘۥۘ۟ۚ۟";
                    break;
                case -1119651665:
                case -574591696:
                    return;
                case -1064603426:
                    str2 = "ۜۢۗۡۙۘۘۗۦۖۡۘۥۘ۟ۚ۟";
                    break;
                case -800969006:
                    String str4 = yo.mpack;
                    str2 = "ۡۛۧۢۥۖۘۥۛ۬۫۬۠ۧۢۥۜۙۦۦۨۛ";
                    break;
                case 713095238:
                    str2 = "ۙۦۙۤۥۡۧۧۖۘ۠ۘۘۡۗۡ";
                    break;
                case 1394639899:
                    String str5 = "۠ۧۙۥۦۡ۟ۥۧۦۘۘۡ۟ۦۘ۠۫ۨۘۧۨۧۘ۬ۜۦ";
                    while (true) {
                        switch (str5.hashCode() ^ 1926453156) {
                            case -1680238412:
                                str2 = "ۖ۠ۗۦۘۤ۬ۤۨ۠ۨۤۨۖۗ۫۫۟";
                                continue;
                            case -677351307:
                                str2 = "ۘۙۘۗۧۜۚ۟۫ۦ۟ۦۘۢۨۨۧۗ۬۫ۧۤۤۧۨۘۛۗۡۘ";
                                continue;
                            case 163333410:
                                if (!yo.isGroupJid(str)) {
                                    str5 = "ۜۤ۫۫ۤۡۜۖۖۘۘۚۢ۟ۗۨ";
                                    break;
                                } else {
                                    str5 = "ۧ۬ۧۗ۫ۖۘۥۘ۬۫ۚۙۨۦۡۖ۫ۨۥۘۖۘ۫ۗۦ";
                                    break;
                                }
                            case 329633224:
                                str5 = "ۤ۫ۨۗ۬۫۬ۤۤۧ۬ۡۢ۬۟";
                                break;
                        }
                    }
                    break;
                case 2031578740:
                    new b(str).start();
                    str2 = "۟۟ۘۘۦۤۘۘۢ۠ۗۚۥۧۘ۠ۖ";
                    break;
            }
        }
    }

    public static String d(C16740tZ r0) {
        return getJID_t(r0.A11.A00);
    }

    public static void d(C16010sH r4, Activity activity, boolean z2) {
        String str = "ۦۥۡۛ۠ۧۤ۠ۥۘ۠ۤۥ۫۫ۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 320) ^ 1472581506) {
                case -2108700493:
                    str = "۠ۜۨۧ۟ۘۡۦۧۘ۟ۢۜۘۙۦۢ";
                    break;
                case -866836450:
                    return;
                case -543415538:
                    String str2 = "ۨ۬ۦۘ۬ۨۢ۫ۜۡۘۗ۠ۦۡ۠ۘۘۙ۫۠";
                    while (true) {
                        switch (str2.hashCode() ^ -942861582) {
                            case -1833219455:
                                str2 = "ۨۧۨۘ۫ۙۤ۫۬ۘۘ۟ۢۗۦۨۧۧ۟۫ۙ";
                                break;
                            case -1692987144:
                                if (yo.isGroupJid(getJID_data(r4))) {
                                    str2 = "ۗۢۡۘۛۖۧۘۙ۫ۛۚۚۜۘۘۦۨۘ";
                                    break;
                                } else {
                                    str2 = "۬۬ۥۘۤۚۙۜۖۦۡۚۖ۬ۦۜ۬ۚۢ";
                                    break;
                                }
                            case -875164307:
                                str = "ۦۗ۬۬ۙۥۥۤۧۧ۟ۡۥۧۘۛۤ۫ۧۚۦ";
                                continue;
                            case 1133756999:
                                str = "ۦۘۜۘۛۜۜۘۤۚۢ۫ۢۡۘۛۜۘۘۦۗۥۧۙۦۚۘۥۘۤۢۛ";
                                continue;
                        }
                    }
                    break;
                case 379741326:
                    str = "۟ۙۢۜۛۛۧۡۨۘۙۘۙۨۥۙۙۧۨۘۜۚۨ۬ۡۦۘۢۛۘۘ";
                    break;
                case 680234912:
                    str = "ۜۨۙۨۦۨۘ۠۫ۡۗ۫ۤۦۢ";
                    break;
                case 1944864139:
                    C204310c.A21().A01(activity, r4, 8, z2);
                    str = "ۦۘۜۘۛۜۜۘۤۚۢ۫ۢۡۘۛۜۘۘۦۗۥۧۙۦۚۘۥۘۤۢۛ";
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean disableFwd() {
        /*
            java.lang.String r0 = "ۤۨۜۘ۫۠ۘۘۢۤۙ۫ۖۙۦۥۗ۬ۡۡۙۦۛۖۡۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 115(0x73, float:1.61E-43)
            r3 = -1053573692(0xffffffffc133bdc4, float:-11.2338295)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1731379144: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "yoDisableFwd"
            r1 = 1
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.dep.disableFwd():boolean");
    }

    public static void e(String str, HomeActivity homeActivity, boolean z2) {
        try {
            d(C16000sG.A21().A09(gen_b(str)), homeActivity, z2);
        } catch (Exception e2) {
            Toast.makeText(yo.getCtx(), yo.getString("directly_entered_number_invalid", new String[]{str.replace("@s.whatsapp.net", "")}), 0).show();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f5 A[Catch:{ Exception -> 0x0183 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f6 A[Catch:{ Exception -> 0x0183 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011e A[Catch:{ Exception -> 0x0183 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0160 A[Catch:{ Exception -> 0x0183 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0169 A[Catch:{ Exception -> 0x0183 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0111 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x011f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0133 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String elapsedTime(long r12, java.lang.String r14) {
        /*
            r1 = 2140747496(0x7f9936e8, float:NaN)
            java.lang.String r0 = "ۡۧۦۘۦۚۢۘۤۨۘۧۦۡۘۧۦۘ"
        L_0x0005:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1546569956: goto L_0x0020;
                case -946157895: goto L_0x0012;
                case -267238072: goto L_0x001d;
                case -243313273: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0005
        L_0x000e:
            return r14
        L_0x000f:
            java.lang.String r0 = "ۚۖۜۘۖۛ۠۟ۧ۬ۤۛۧۘۦ۫ۢۘۘ"
            goto L_0x0005
        L_0x0012:
            java.lang.String r0 = "elapsed_time"
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0)
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "ۦۥۤۜۙۖۘ۬۬ۥ۠۫۠ۤۖۧۘۙۥۤۚۜۘۘۤۡۥۘۨ۠۫"
            goto L_0x0005
        L_0x001d:
            java.lang.String r0 = "ۚۦۡۚ۠۟ۨ۠ۜۗ۟ۧۤۤۨۘۙۤۨ۠ۨۘۚۧۨۡۤۥۘ"
            goto L_0x0005
        L_0x0020:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0183 }
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0183 }
            java.lang.String r3 = "%%0%dd"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0183 }
            r5 = 0
            r6 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0183 }
            r4[r5] = r6     // Catch:{ Exception -> 0x0183 }
            java.lang.String r3 = java.lang.String.format(r2, r3, r4)     // Catch:{ Exception -> 0x0183 }
            long r0 = r0 - r12
            r4 = 1000(0x3e8, double:4.94E-321)
            long r4 = r0 / r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0183 }
            r0.<init>()     // Catch:{ Exception -> 0x0183 }
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0183 }
            r6 = 0
            r8 = 60
            long r8 = r4 % r8
            java.lang.Long r7 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x0183 }
            r1[r6] = r7     // Catch:{ Exception -> 0x0183 }
            java.lang.String r1 = java.lang.String.format(r2, r3, r1)     // Catch:{ Exception -> 0x0183 }
            r0.append(r1)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r1 = "s"
            r0.append(r1)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0183 }
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0183 }
            r6 = 0
            r8 = 3600(0xe10, double:1.7786E-320)
            long r8 = r4 % r8
            r10 = 60
            long r8 = r8 / r10
            java.lang.Long r7 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x0183 }
            r0[r6] = r7     // Catch:{ Exception -> 0x0183 }
            java.lang.String r6 = java.lang.String.format(r2, r3, r0)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r0 = "%%0%dd"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0183 }
            r7 = 0
            r8 = 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0183 }
            r3[r7] = r8     // Catch:{ Exception -> 0x0183 }
            java.lang.String r0 = java.lang.String.format(r2, r0, r3)     // Catch:{ Exception -> 0x0183 }
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0183 }
            r7 = 0
            r8 = 3600(0xe10, double:1.7786E-320)
            long r4 = r4 / r8
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0183 }
            r3[r7] = r4     // Catch:{ Exception -> 0x0183 }
            java.lang.String r3 = java.lang.String.format(r2, r0, r3)     // Catch:{ Exception -> 0x0183 }
            r2 = 194444595(0xb96fd33, float:5.815887E-32)
            java.lang.String r0 = "ۢۥ۠۫ۛۥۘۦۢۘۘۖۡۜۘ۬۫۟ۥۤ۠"
        L_0x009b:
            int r4 = r0.hashCode()     // Catch:{ Exception -> 0x0183 }
            r4 = r4 ^ r2
            switch(r4) {
                case -1163211145: goto L_0x00c0;
                case 284981128: goto L_0x000e;
                case 1120937015: goto L_0x00a4;
                case 1155005934: goto L_0x00cb;
                default: goto L_0x00a3;
            }     // Catch:{ Exception -> 0x0183 }
        L_0x00a3:
            goto L_0x009b
        L_0x00a4:
            int r4 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r0 = ""
            r5 = 1965685224(0x7529f9e8, float:2.1547043E32)
            java.lang.String r2 = "ۧۘۜۙۛۘۘ۟۠ۧۘۛۖۗۥ۬۠۟"
        L_0x00af:
            int r7 = r2.hashCode()     // Catch:{ Exception -> 0x0183 }
            r7 = r7 ^ r5
            switch(r7) {
                case -586434606: goto L_0x00d1;
                case 148295282: goto L_0x00d4;
                case 779404619: goto L_0x00b8;
                case 1426252261: goto L_0x00f9;
                default: goto L_0x00b7;
            }     // Catch:{ Exception -> 0x0183 }
        L_0x00b7:
            goto L_0x00af
        L_0x00b8:
            if (r4 <= 0) goto L_0x00ce
            java.lang.String r2 = "ۥۖ۟ۤۖۦۧۨۡۙۨۛۥۤۘۛۜۖۙ۫ۙۙۚ"
            goto L_0x00af
        L_0x00bd:
            java.lang.String r0 = "ۡۛ۟۬ۤۧ۫ۛۥۘۤۡ۟ۗۘ۠ۖۨۦۙ۫ۤۗ۬ۖۡۥۡ"
            goto L_0x009b
        L_0x00c0:
            int r0 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x0183 }
            r4 = 23
            if (r0 <= r4) goto L_0x00bd
            java.lang.String r0 = "ۤۡۘۘۢۦۥۡ۟ۦۢۢۦۜۗ"
            goto L_0x009b
        L_0x00cb:
            java.lang.String r0 = "ۙ۠ۦۘۦۤۥۚۢ۟ۗۗۡۗۘۦۜ۠۠ۦۚۡۙۗۗ"
            goto L_0x009b
        L_0x00ce:
            java.lang.String r2 = "۠ۛ۟۠۠ۖۘۗۤۖۥۦۥۧۙۗۙ۠ۖۘ"
            goto L_0x00af
        L_0x00d1:
            java.lang.String r2 = "ۢۤۙۧ۬ۘۘۘۧۛۢۛۧ۬ۨ"
            goto L_0x00af
        L_0x00d4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0183 }
            r1.<init>()     // Catch:{ Exception -> 0x0183 }
            r1.append(r3)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r2 = "h"
            r1.append(r2)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x0183 }
            java.lang.String r1 = ""
            r2 = r1
        L_0x00e8:
            r4 = -1118132478(0xffffffffbd5aa702, float:-0.053381927)
            java.lang.String r1 = "ۢۚ۫ۢۨ۠ۨۨۖۗۗۥ۟ۖۘۘۚۥۘۘۡۢ"
        L_0x00ed:
            int r5 = r1.hashCode()     // Catch:{ Exception -> 0x0183 }
            r5 = r5 ^ r4
            switch(r5) {
                case -872173257: goto L_0x0111;
                case -657311685: goto L_0x0100;
                case 71105213: goto L_0x010b;
                case 495711935: goto L_0x00f6;
                default: goto L_0x00f5;
            }     // Catch:{ Exception -> 0x0183 }
        L_0x00f5:
            goto L_0x00ed
        L_0x00f6:
            java.lang.String r1 = "ۦۜۘۖ۬ۦۘۨۘۥۘ۟ۛۥۦ۫ۨۨۥ۬ۢۨۥۘۚۦۢ"
            goto L_0x00ed
        L_0x00f9:
            java.lang.String r3 = ""
            r2 = r1
            goto L_0x00e8
        L_0x00fd:
            java.lang.String r1 = "ۚۦۧۘۧۜۚۧ۬ۥۘۛۖۧۖۢۗ"
            goto L_0x00ed
        L_0x0100:
            java.lang.String r1 = "00"
            boolean r1 = r6.contains(r1)     // Catch:{ Exception -> 0x0183 }
            if (r1 == 0) goto L_0x00fd
            java.lang.String r1 = "۟ۖۜۘۛۗۧۢۡۙۢۛۡۘۜۘ۫"
            goto L_0x00ed
        L_0x010b:
            java.lang.String r0 = "m"
            java.lang.String r0 = r6.concat(r0)     // Catch:{ Exception -> 0x0183 }
        L_0x0111:
            r4 = 431193303(0x19b37cd7, float:1.8558589E-23)
            java.lang.String r1 = "۫۟ۛ۠ۙۖ۬ۗۧۡۖۧۘۦ۟ۗۧۗۖۥ۬ۙۢۥۗ"
        L_0x0116:
            int r5 = r1.hashCode()     // Catch:{ Exception -> 0x0183 }
            r5 = r5 ^ r4
            switch(r5) {
                case -708411128: goto L_0x0133;
                case 469819137: goto L_0x0160;
                case 652204313: goto L_0x011f;
                case 1355088801: goto L_0x0169;
                default: goto L_0x011e;
            }     // Catch:{ Exception -> 0x0183 }
        L_0x011e:
            goto L_0x0116
        L_0x011f:
            r4 = 1561138033(0x5d0d1371, float:6.3534956E17)
            java.lang.String r1 = "ۡۖۡۦۖۖۥ۬ۜۘۢۧۖۘ۠ۢ"
        L_0x0124:
            int r5 = r1.hashCode()     // Catch:{ Exception -> 0x0183 }
            r5 = r5 ^ r4
            switch(r5) {
                case -1349719087: goto L_0x0180;
                case -251294313: goto L_0x016f;
                case -136172869: goto L_0x0133;
                case 1649839088: goto L_0x012d;
                default: goto L_0x012c;
            }     // Catch:{ Exception -> 0x0183 }
        L_0x012c:
            goto L_0x0124
        L_0x012d:
            r1 = 1
            r4 = 3
            java.lang.String r0 = r0.substring(r1, r4)     // Catch:{ Exception -> 0x0183 }
        L_0x0133:
            android.content.Context r1 = com.obwhatsapp.yo.yo.getCtx()     // Catch:{ Exception -> 0x0183 }
            java.lang.String r4 = "time_ago"
            java.lang.String r5 = "string"
            int r4 = com.obwhatsapp.yo.yo.getID(r4, r5)     // Catch:{ Exception -> 0x0183 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0183 }
            r5.<init>()     // Catch:{ Exception -> 0x0183 }
            r5.append(r3)     // Catch:{ Exception -> 0x0183 }
            r5.append(r0)     // Catch:{ Exception -> 0x0183 }
            r5.append(r2)     // Catch:{ Exception -> 0x0183 }
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0183 }
            r2 = 0
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x0183 }
            r0[r2] = r3     // Catch:{ Exception -> 0x0183 }
            java.lang.String r14 = r1.getString(r4, r0)     // Catch:{ Exception -> 0x0183 }
            goto L_0x000e
        L_0x015d:
            java.lang.String r1 = "ۜۥ۟۬ۧۧۛ۫ۡۢۙ۠ۧ۫ۨۘ۠ۜ۠ۛۨ۫ۘ۟ۜۘ"
            goto L_0x0116
        L_0x0160:
            int r1 = r0.length()     // Catch:{ Exception -> 0x0183 }
            if (r1 <= 0) goto L_0x015d
            java.lang.String r1 = "۠ۨ۠ۧۚ۬ۘۧۘۡ۟۟۟ۡۡۨۢۨۛۢۥ"
            goto L_0x0116
        L_0x0169:
            java.lang.String r1 = "ۥۤۦۘۦۡۘۘۥۦۘ۟ۙۧۡۥۤۤۦۖ۟ۗ"
            goto L_0x0116
        L_0x016c:
            java.lang.String r1 = "ۢ۬۟ۘۥۛ۬ۦۥۘ۠۟ۧۗۤۙ"
            goto L_0x0124
        L_0x016f:
            r1 = 0
            r5 = 1
            java.lang.String r1 = r0.substring(r1, r5)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r5 = "0"
            boolean r1 = r1.contains(r5)     // Catch:{ Exception -> 0x0183 }
            if (r1 == 0) goto L_0x016c
            java.lang.String r1 = "ۦۧۢۨۙۥۘۜۘۗۛ۬ۥ۬ۗۦۘۛۥۥۘۡ۬۟ۤ۬ۜۘ"
            goto L_0x0124
        L_0x0180:
            java.lang.String r1 = "ۡۧ۟ۙۦۘۘۖۙۚۖۡۖ۠۟ۨۘۤۙۗۨۘ۫ۧۦ"
            goto L_0x0124
        L_0x0183:
            r0 = move-exception
            java.lang.String r0 = "elapsed_time"
            java.lang.String r1 = "Error"
            android.util.Log.d(r0, r1)
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.dep.elapsedTime(long, java.lang.String):java.lang.String");
    }

    public static String[] f(String str) {
        String stripJID = yo.stripJID(str);
        try {
            String stringPriv = shp.getStringPriv(stripJID + "_revoked");
            String str2 = "۬۟۫ۚۨۢۤۖۧۘۜۤۖۘۦۨۥۘۥۧۙ۠ۚۖۘۛۗۚ";
            while (true) {
                switch (str2.hashCode() ^ -898870555) {
                    case -1607106716:
                        return utils.StringToStringArray(stringPriv);
                    case 51259499:
                        str2 = "ۜ۠ۢۡۙۧ۟ۗۤۦ۬ۘۘ۬ۥۨۥۦۧۗ۬ۗۨۖۘۘۘ۟۠";
                        break;
                    case 213973929:
                        return null;
                    case 570548524:
                        if (stringPriv.equals("")) {
                            str2 = "ۥۧۜۡۙۡۘۛ۬ۦ۫ۧۤۜۙۥ";
                            break;
                        } else {
                            str2 = "ۙۖۖۘ۟ۥۧ۫ۨۗۜۨۖۘ۫ۡۢ۠ۗۥۘۛۥۘ۬ۡۡ";
                            break;
                        }
                }
            }
        } catch (Exception e2) {
            return null;
        }
    }

    public static String[] g(String str) {
        String stripJID = yo.stripJID(str);
        try {
            String stringPriv = shp.getStringPriv(stripJID + "_msgs");
            String str2 = "ۚ۟۬ۗۘۘۘۜ۬۠ۤۥۧۘۤۖۤۚۢ";
            while (true) {
                switch (str2.hashCode() ^ -872917700) {
                    case -557849381:
                        str2 = "ۘۦۨۘ۠ۖۜۛۜۛۜۚۖۧۨۦۙۖۜ۠ۡۨۘ";
                        break;
                    case -110840845:
                        return null;
                    case 166317005:
                        return utils.StringToStringArray(stringPriv);
                    case 1055514108:
                        if (stringPriv.equals("")) {
                            str2 = "ۛ۠۫ۙۚۡۢۙۢۤۜۚۤۨۤ";
                            break;
                        } else {
                            str2 = "ۦۥۘۡۘۛ۟ۧۥۜۨۤ۫ۛۥۘ۠ۘۨ";
                            break;
                        }
                }
            }
        } catch (Exception e2) {
            return null;
        }
    }

    public static C15830rv gen_b(String str) {
        String str2 = "۟۟۠ۨۡۨ۟ۢۚ۟ۤۡۘۡۤۡۘ";
        while (true) {
            switch ((str2.hashCode() ^ 731) ^ 37379993) {
                case -59851919:
                    return C15830rv.A01(str);
                case 1506902620:
                    str2 = "ۥۗۗۛ۟ۥۤۙۨۘ۬ۖۜۦۙۤۛۖۦۘۦ۬";
                    break;
            }
        }
    }

    public static String getContactName(String str) {
        StringBuilder sb;
        String str2;
        String str3 = "۫ۡ۟ۨۨۧۚۚ۟ۗۛۚۥ۫";
        while (true) {
            try {
                switch (str3.hashCode() ^ 190762172) {
                    case -1321952205:
                        sb = new StringBuilder();
                        sb.append(str);
                        str2 = "@g.us";
                        break;
                    case -767292165:
                        sb = new StringBuilder();
                        sb.append(str);
                        str2 = "@s.whatsapp.net";
                        break;
                    case 939008387:
                        str3 = "ۢۦۘۢۚۤۛۢۦ۟ۨ۫۫ۜۜۘ۠ۧ";
                        continue;
                    case 1005023975:
                        if (yo.isGroupJid(str)) {
                            str3 = "۬ۖۦۘۡۚۦۙۤۥۘۢۛۖۘۦۘۘۛۢۢ";
                            break;
                        } else {
                            str3 = "۟ۜ۠۬ۖ۬۬ۥ۫ۛۢۘۙ۫ۡۘ";
                            continue;
                        }
                    default:
                        continue;
                }
            } catch (Exception e2) {
                return str;
            }
        }
        sb.append(str2);
        String str4 = C16000sG.A21().A09(gen_b(sb.toString())).A0L;
        String str5 = "ۤۜ۫ۢۢۚۨ۫ۨۘۢ۬ۥۨۡۡ";
        while (true) {
            switch (str5.hashCode() ^ -936784503) {
                case -1979485059:
                    str5 = "ۘۢۦۘۥۜۜۧۘۤۚ۠۫ۡۜۜۘۗۡۙۖۚ۠۫ۛۤ";
                    break;
                case -1812773810:
                    if (str4 == null) {
                        str5 = "ۥۘۗۡۥۘۘۗۧ۬۠ۦۘۜۘ۫ۚۢۜۘۤۧۗ";
                        break;
                    } else {
                        str5 = "۫۟ۘۤۨۦۘۜ۟ۘۦ۬ۤۗ۬۬";
                        break;
                    }
                case 802550646:
                    return str;
                case 1075341532:
                    boolean isEmpty = str4.isEmpty();
                    String str6 = "ۖۦ۫ۜ۫ۖۘۡۚۥۘۜۦۘۨۚۢۡۖۨ";
                    while (true) {
                        switch (str6.hashCode() ^ 1787290442) {
                            case -1789854715:
                                return str4;
                            case -395218957:
                                if (!isEmpty) {
                                    str6 = "ۚۡۖ۟ۖۡۖۧۘۧۥۚۘۥۛ۠ۚۢ۟ۜۖ";
                                    break;
                                } else {
                                    str6 = "ۛ۠۟ۖۦ۠۫ۚۘۘ۬ۦ۬ۗۖ۟ۦۘ۠۬ۨ";
                                    break;
                                }
                            case 481452445:
                                str6 = "ۖۨۖۘۢۛۧۡ۟ۛۙۗۘۡۘۘۛۥ۟";
                                break;
                            case 524078465:
                                return str;
                        }
                    }
                    break;
            }
        }
    }

    public static String getJID_data(C16010sH r4) {
        String str = "ۙۧۙۘۗۦۘۥۖۨۧۥۘۥۙۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 240) ^ 448922285) {
                case 969261149:
                    return getJID_t(r4.A0E);
                case 1306497719:
                    str = "ۙ۟ۖۘۤ۠ۥ۫ۙۘۥۤۜۖۜۘ۬ۧۙ";
                    break;
            }
        }
    }

    public static String getJID_t(Jid jid) {
        String str = "ۗۦۖۘۧۗۧ۬ۗۡۘ۫ۥۘ۠ۥۛۗۛۘ";
        while (true) {
            switch ((str.hashCode() ^ 258) ^ 750526246) {
                case -1759529260:
                    return "";
                case -922035913:
                    return jid.getRawString();
                case -115242769:
                    String str2 = "ۜ۟ۘۘۡ۬ۥۘۜۥۥۘۡۖۙ۟۬ۥۘۨ۠ۘۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -885181986) {
                            case -1425850250:
                                str2 = "ۙۨۢ۠۫ۘۘۘۚۡۘۖۦۘۖ۟ۧ";
                                break;
                            case -503243519:
                                if (jid != null) {
                                    str2 = "ۢۡ۬ۥۗۖۢۤۡۘ۬۠ۘۘۜۡ۟ۗ۠ۢۡۨ";
                                    break;
                                } else {
                                    str2 = "ۙۚۜ۠ۤۨ۫ۜۢۦۛۥۚۦۜ";
                                    break;
                                }
                            case 1208082484:
                                str = "۟ۨۤۛۡۜۘۡۡۘۛۘۦۘ۠ۜۥۘۜۧۖۡۚۨۚ۠ۖ";
                                continue;
                            case 1301081395:
                                str = "ۛۘۥۗۨۥۘۘۦۘۥۖۨۘۦۘۦۦۦۛۥۢۡۡۨۙۙۚۥ";
                                continue;
                        }
                    }
                    break;
                case 187429392:
                    str = "ۥۢۘۘۧۜۘۘۧ۫۬ۡ۫ۦۘۘۛ۠";
                    break;
            }
        }
    }

    public static String getMyName() {
        String str = null;
        String str2 = "ۖۜۚۜۗۨۘۗ۟۠۟ۖۥۙۨۥۘ";
        while (true) {
            switch ((str2.hashCode() ^ 383) ^ 316095879) {
                case 26646029:
                    return yo.getCtx().getSharedPreferences("startup_prefs", 0).getString("push_name", str);
                case 1828993103:
                    str = shp.stockPrefsLight.getString("push_name", "");
                    str2 = "ۨ۟ۙۤ۟ۚۤۡ۬۫ۘ۠ۘۨۘۘۦۧۘ۠ۦ۫۫ۛۜۙۘۡ";
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0003 A[LOOP_START] */
    @android.annotation.SuppressLint({"ObsoleteSdkInt"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.pm.Signature[] getYoSig() {
        /*
            r4 = 0
            java.lang.String r0 = "ۘۥۘۦۛۗ۠۫ۛۜۨۖۛۤۥۘ"
        L_0x0003:
            int r1 = r0.hashCode()
            r2 = 781(0x30d, float:1.094E-42)
            r3 = -885688337(0xffffffffcb3577ef, float:-1.1892719E7)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 747799279: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0003
        L_0x0012:
            r0 = 1
            android.content.pm.Signature[] r0 = new android.content.pm.Signature[r0]
            android.content.pm.Signature r1 = new android.content.pm.Signature
            java.lang.String r2 = "MIIDMjCCAvCgAwIBAgIETCU2pDALBgcqhkjOOAQDBQAwfDELMAkGA1UEBhMCVVMxEzARBgNVBAgTCkNhbGlmb3JuaWExFDASBgNVBAcTC1NhbnRhIENsYXJhMRYwFAYDVQQKEw1XaGF0c0FwcCBJbmMuMRQwEgYDVQQLEwtFbmdpbmVlcmluZzEUMBIGA1UEAxMLQnJpYW4gQWN0b24wHhcNMTAwNjI1MjMwNzE2WhcNNDQwMjE1MjMwNzE2WjB8MQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEUMBIGA1UEBxMLU2FudGEgQ2xhcmExFjAUBgNVBAoTDVdoYXRzQXBwIEluYy4xFDASBgNVBAsTC0VuZ2luZWVyaW5nMRQwEgYDVQQDEwtCcmlhbiBBY3RvbjCCAbgwggEsBgcqhkjOOAQBMIIBHwKBgQD9f1OBHXUSKVLfSpwu7OTn9hG3UjzvRADDHj+AtlEmaUVdQCJR+1k9jVj6v8X1ujD2y5tVbNeBO4AdNG/yZmC3a5lQpaSfn+gEexAiwk+7qdf+t8Yb+DtX58aophUPBPuD9tPFHsMCNVQTWhaRMvZ1864rYdcq7/IiAxmd0UgBxwIVAJdgUI8VIwvMspK5gqLrhAvwWBz1AoGBAPfhoIXWmz3ey7yrXDa4V7l5lK+7+jrqgvlXTAs9B4JnUVlXjrrUWU/mcQcQgYC0SRZxI+hMKBYTt88JMozIpuE8FnqLVHyNKOCjrh4rs6Z1kW6jfwv6ITVi8ftiegEkO8yk8b6oUZCJqIPf4VrlnwaSi2ZegHtVJWQBTDv+z0kqA4GFAAKBgQDRGYtLgWh7zyRtQainJfCpiaUbzjJuhMgo4fVWZIvXHaSHBU1t5w//S0lDK2hiqkj8KpMWGywVov9eZxZy37V26dEqr/c2m5qZ0E+ynSu7sqUD7kGx/zeIcGT0H+KAVgkGNQCo5Uc0koLRWYHNtYoIvt5R3X6YZylbPftF/8ayWTALBgcqhkjOOAQDBQADLwAwLAIUAKYCp0d6z4QQdyN74JDfQ2WCyi8CFDUM4CaNB+ceVXdKtOrNTQcc0e+t"
            byte[] r2 = android.util.Base64.decode(r2, r4)
            r1.<init>(r2)
            r0[r4] = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.dep.getYoSig():android.content.pm.Signature[]");
    }

    public static void h(String str) {
        String str2 = "۬ۦۧ۬ۡۛۜۧۙۘۤۛۦ۠۬ۜۗۢۙۗۥۘ";
        while (true) {
            switch (str2.hashCode() ^ -1265019205) {
                case -1924041421:
                    str2 = "ۙۜ۬۫ۥۖۘۢۢۖۘۙۛۛۨ۫ۡۘۗۤۧ";
                    break;
                case -414216677:
                    if (str == null) {
                        str2 = "ۚۛۨۧۖۖۘ۫ۤ۠ۗۗۘۥۖ۫ۢۜۨۘ۬۠ۨۘ۠۬۬ۚ۠ۥۘ";
                        break;
                    } else {
                        str2 = "۟ۜۜۗ۬۬ۦۛ۫ۚۘۘ۬۫ۢۛۜۘۘ۠ۢۖۥۢۧۧۚۡۘ";
                        break;
                    }
                case -360994987:
                    try {
                        Intent intent = new Intent();
                        intent.setClassName(yo.getCtx().getPackageName(), "com.obwhatsapp.Conversation");
                        intent.putExtra("jid", str);
                        intent.addFlags(335544320);
                        yo.getCtx().startActivity(Conversation.multiChats(intent));
                        return;
                    } catch (Exception e2) {
                        Toast.makeText(yo.getCtx(), yo.getString("directly_entered_number_invalid", new String[]{str.substring(0, str.indexOf("@"))}), 0).show();
                        return;
                    }
                case 493596993:
                    return;
            }
        }
    }

    public static void i(String str, Object[] objArr) {
        String str2 = "ۡۦۗۚۛۢ۫ۢ۠ۗۤۤۤۜۜۘۗۘۘۤۧ۠";
        StringBuilder sb = null;
        String str3 = null;
        while (true) {
            switch ((str2.hashCode() ^ 603) ^ 1460296350) {
                case -1623025038:
                    sb.append(str3);
                    str2 = "ۙۜۦۥۤۖۗۚۜۘۢۡۗۗ۫ۛۘۤ۟ۘۦۧۘۥۢۙ";
                    break;
                case -1463067351:
                    sb = new StringBuilder();
                    str2 = "۬ۡۚ۬۬۠ۖ۬ۖۘۧۛ۠ۢ۟ۨ۟۫ۙ۬ۜ۫ۘ۬ۙۜۘۘ";
                    break;
                case -851695950:
                    str2 = "ۗ۠ۜۨۨۘۥ۟۟ۨۢۚۖۥۚ";
                    break;
                case -198471799:
                    sb.append("_msgs");
                    str2 = "ۙۘۥ۟ۖۜ۫ۦۖۘۘۥۧۨۛۜۡ۫ۡۘۡۦۡ۬ۜۘۚۧۜ";
                    break;
                case 308358955:
                    str2 = "ۖ۫ۧۜ۬ۦۗ۬ۧ۟ۙۨۜۙۘۘۙ۠ۘۤ۟ۛ";
                    str3 = yo.stripJID(str);
                    break;
                case 359538022:
                    return;
                case 812311694:
                    str2 = "ۛ۫۫ۚۨۛۡۦۗۦ۠ۧۚۦۘۘۥ۬ۗۧۗۖۦۛۥۘ";
                    break;
                case 1415279282:
                    shp.setStringPriv(sb.toString(), Arrays.toString(objArr));
                    str2 = "ۘۛۘۛۥ۬ۙ۫ۜۥ۟ۨۥۤۙۖۤۨۥۚۥۘۧ۫۠";
                    break;
                case 2056692242:
                    String str4 = "ۢ۬ۛۖۙۨۘۡۚۡۘۙۧۦۧ۬ۗ۬ۙۡۘۙۦۙۙۢۡ";
                    while (true) {
                        switch (str4.hashCode() ^ 2120676227) {
                            case 76764962:
                                str2 = "ۘۛۘۛۥ۬ۙ۫ۜۥ۟ۨۥۤۙۖۤۨۥۚۥۘۧ۫۠";
                                continue;
                            case 1842680989:
                                if (objArr == null) {
                                    str4 = "ۗۚۦ۟ۜۢۨ۠ۖۨ۫۟ۚۘۘۚۛۜ";
                                    break;
                                } else {
                                    str4 = "ۧۡۜۘ۠ۗ۠ۖۡۥۚۗۘ۬ۖ۠ۘۦۚ۫ۘۧ";
                                    break;
                                }
                            case 1964257624:
                                str2 = "۟۫ۥۡۧۢۙۘۥۘۤ۟ۘۙۙۖ";
                                continue;
                            case 2122382067:
                                str4 = "ۨۜۧ۟ۨۘۥۡۖۘۦۢۙۧۙۜۘ۫ۧۨ";
                                break;
                        }
                    }
                    break;
            }
        }
    }

    public static boolean isContactMuted(UserJid userJid) {
        try {
            C16220sf r1 = mutemngr;
            if (r1 == null) {
                r1 = C16220sf.A21();
                mutemngr = r1;
            }
            return r1.A07(userJid.getRawString()).A0I;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034 A[SYNTHETIC, Splitter:B:15:0x0034] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x003d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x002b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isMRevoked(java.lang.Object r5, android.widget.TextView r6) {
        /*
            r0 = 0
            X.0tZ r5 = (X.C16740tZ) r5     // Catch:{ Exception -> 0x0049 }
            java.util.HashSet r2 = com.obwhatsapp.yo.Conversation.f516e     // Catch:{ Exception -> 0x0049 }
            r3 = 1280428367(0x4c51c94f, float:5.4994236E7)
            java.lang.String r1 = "ۘۨۛۗ۟ۦۙۦۢ۬ۢۥۢ۬ۡۛۡۘ"
        L_0x000a:
            int r4 = r1.hashCode()     // Catch:{ Exception -> 0x0049 }
            r4 = r4 ^ r3
            switch(r4) {
                case -1336107449: goto L_0x0013;
                case 225895758: goto L_0x001b;
                case 365404351: goto L_0x001e;
                case 769158092: goto L_0x0026;
                default: goto L_0x0012;
            }     // Catch:{ Exception -> 0x0049 }
        L_0x0012:
            goto L_0x000a
        L_0x0013:
            if (r2 == 0) goto L_0x0018
            java.lang.String r1 = "ۡۨۘۨۜۜۥ۠ۡۘۢۧۦ۬۠ۡۘ۫ۚ۬ۘۙ۬ۦۥۧۘ"
            goto L_0x000a
        L_0x0018:
            java.lang.String r1 = "ۘۥۥ۬۠ۗۙۛۦۘۨۗۨۘۚۦۨۤۨۚۖۦۛۚۤ۠"
            goto L_0x000a
        L_0x001b:
            java.lang.String r1 = "ۜۦۡۙۦۧۘۦ۬۠ۥ۫ۢۖ۟ۦۙۛۡۘۛ۠۠ۡۘ۬ۤۦ۫"
            goto L_0x000a
        L_0x001e:
            X.1Vw r1 = r5.A11     // Catch:{ Exception -> 0x0049 }
            java.lang.String r1 = r1.A01     // Catch:{ Exception -> 0x0049 }
            boolean r0 = r2.contains(r1)     // Catch:{ Exception -> 0x0049 }
        L_0x0026:
            r2 = -793323016(0xffffffffd0b6d9f8, float:-2.45419049E10)
            java.lang.String r1 = "ۚۡۨ۟ۘۛۡۥۥۘ۟ۢۦۘۨۧۘۚۖۥ"
        L_0x002b:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1918706715: goto L_0x0041;
                case -1569081210: goto L_0x003d;
                case -1511007469: goto L_0x0034;
                case 1340659069: goto L_0x0046;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x002b
        L_0x0034:
            com.obwhatsapp.yo.r r1 = new com.obwhatsapp.yo.r     // Catch:{ Exception -> 0x0049 }
            r2 = 1
            r1.<init>(r6, r2)     // Catch:{ Exception -> 0x0049 }
            r6.post(r1)     // Catch:{ Exception -> 0x0049 }
        L_0x003d:
            return r0
        L_0x003e:
            java.lang.String r1 = "۠ۤۚۡ۠ۛۡۡۧ۟ۦۘۢ۠ۦ۠ۙۚۡۖۗۚۚۗ"
            goto L_0x002b
        L_0x0041:
            if (r0 == 0) goto L_0x003e
            java.lang.String r1 = "ۚۨۧۧۖۖۜۧۤۗۜۘۗۧۖۘ۟۠۠"
            goto L_0x002b
        L_0x0046:
            java.lang.String r1 = "ۚۚۨۨۜۘۙۥۧۘۡۜۧۘۧۢ۫"
            goto L_0x002b
        L_0x0049:
            r1 = move-exception
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.dep.isMRevoked(java.lang.Object, android.widget.TextView):boolean");
    }

    public static void j(String str) {
        String str2 = "ۦۧۡۚۨۥۘ۬ۖۘۘۗۢۚ۬ۛ۟ۤۙۥۘۚ۬ۤ";
        int i2 = 0;
        String str3 = null;
        String str4 = null;
        Intent intent = null;
        while (true) {
            switch ((str2.hashCode() ^ 167) ^ 939829276) {
                case -1655919451:
                    str3 = yo.getString("missed_call_from", new String[]{getContactName(str)});
                    str2 = "۫۠ۘ۟ۨ۠ۛۜۥۘ۫ۢۘۘۥۙۡۘ";
                    break;
                case -1552569192:
                    intent.setClassName(yo.getCtx().getPackageName(), HomeActivity.class.getName());
                    str2 = "ۖۗ۠ۥۤ۫ۤۚۦۜۜۜۘ۟ۥ۟۬ۚۗ۫ۤۦۘۜۖۡ";
                    break;
                case -1183295315:
                    str2 = "ۨ۠ۖۘۤۙۗۚۡۡۚۥۥۤۜ۠ۙۤ۫ۦۘۤ۠ۨۘ";
                    str4 = yo.getString("voip_declined");
                    break;
                case -869228875:
                    return;
                case 466967996:
                    utils.showNotification(yo.getCtx(), str4, str3, i2, intent);
                    str2 = "ۧۧۚ۠ۤۚۙۖۦۘۨۧۥۘۢۜۨۗۚ۠ۖۧۘۢۧۡۘۥۡۡ";
                    break;
                case 738747510:
                    str2 = "۬ۚۥۗۤۨۘۥۤۡۘۤۘۙۚۢۘۘ";
                    intent = new Intent();
                    break;
                case 897418545:
                    i2 = yo.getDrawableId("notify_missed_call");
                    str2 = "ۗۥۧۧۛۚۦۥۡۦۚۦۡۨۚۖۤۤۧۛۢۛۨۖۤۢ۠";
                    break;
                case 1290451109:
                    str2 = "ۚۛۛۚۙۖۥۡۢۦۤۤۖۤۧۗۧۦ۫ۦۢ";
                    break;
                case 2064458806:
                    intent.setAction("com.obwhatsapp.intent.action.CALLS");
                    str2 = "۬ۜۖۘۨ۠ۢ۬ۗ۫ۛ۠ۦۘ۟ۤۨۘ۠ۢۢۜۖۖۧۦۥ";
                    break;
            }
        }
    }

    public static void loadCImage(String str, ImageView imageView) {
        String str2 = "۟ۡۗۜۙۤۤۙۘۘۚۢۛۦۛۥ";
        while (true) {
            try {
                switch (str2.hashCode() ^ -654131060) {
                    case -746317350:
                        f103i = C17200uh.A21().A04(yo.getCtx(), "contact-info-activity");
                        break;
                    case -481220728:
                        if (f103i == null) {
                            str2 = "ۚ۠ۧۧۛۡۛۖ۬ۜۖۧۘۡۖۙۦۤۖ۟۠ۡۘۥ۫ۡ۠۟ۥ";
                            break;
                        } else {
                            str2 = "ۥۗ۠ۨۜ۫ۦۥۦۖۛۖ۠ۖ۠";
                            continue;
                        }
                    case -289045941:
                        str2 = "۠ۡۡۘۛۦۦ۟ۛۘۜۛۘ۠۬ۢ";
                        continue;
                    case 1091953051:
                        break;
                    default:
                        continue;
                }
            } catch (Exception e2) {
                return;
            }
        }
        f103i.A06(imageView, new C16010sH(gen_b(str)));
        imageView.setClickable(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] md() {
        /*
            java.lang.String r0 = "ۚۗۚۤۧۨ۫ۛۦۘۧۥۢۖۧۚ۠ۦۖ۟ۚۚۦۘۛ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 665(0x299, float:9.32E-43)
            r3 = 150320974(0x8f5b74e, float:1.4788496E-33)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1339507044: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "t8uDqPIjZe773j6hPbXj5A=="
            r1 = 0
            byte[] r0 = android.util.Base64.decode(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.dep.md():byte[]");
    }

    public static void myname(C005402i r7) {
        String str = "ۤ۫ۙۗۖۦۘ۫ۦۜۜۘۜ۟۟ۘۥ۟ۧ۫ۚۖۥۜ۫";
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            switch ((str.hashCode() ^ 472) ^ 1398043944) {
                case -1769510269:
                    str = "ۙ۬۬۫ۡۘۘۗ۬ۜۜۜۜۘۡۨۧۘۛ۫ۜۘ۫ۥۜۘۥ۠۠";
                    str3 = str2;
                    break;
                case -1698733164:
                    str = "ۤ۟۬ۗ۟۠ۖۗ۬ۜۜۧۘۜۙ۠ۤۘۘ۠۟ۥۥۘ۬";
                    break;
                case 38155607:
                    str2 = yo.pname;
                    str = "ۗ۠ۜۧۧ۟ۖۙۘۥۤۖۘۘ۫ۧۡۜۖۖۘ";
                    break;
                case 269191467:
                    return;
                case 932998745:
                    String str5 = "ۛ۠ۧۛۡۢۢۧۚ۬ۦۦۘ۬ۚۧ";
                    while (true) {
                        switch (str5.hashCode() ^ -1086410918) {
                            case -1964799612:
                                str5 = "ۢ۟ۘۘۡۘۘۦۢۧۡۧۥۛ۠ۧۛۢۖۙ۠ۧۚۤۘۛۧ";
                                break;
                            case 1024816677:
                                str = "۫۬۫ۛۢۖۨۖۗۗ۟ۦۛۙۦۘ";
                                continue;
                            case 1775724744:
                                if (!shp.getBoolean("my_name")) {
                                    str5 = "ۧۦۗۚۙۘۘۘۨۥۘۘۡۦۘۧۘۗ";
                                    break;
                                } else {
                                    str5 = "ۚۜۨ۫ۡۜۨۡۙۢۖۘۘۚۤ";
                                    break;
                                }
                            case 1886454859:
                                str = "ۙ۠ۦۘ۬ۦۗ۠ۘۢ۟ۤۦۘۙ۫ۘۘۘ۫ۨۘۜۤۥ۠ۥۡۘ";
                                continue;
                        }
                    }
                    break;
                case 1071584834:
                    str = "ۦۨۨ۠۟ۛۤۘۥۡۜۖۙۘۚۖ۠۬۬ۡۜۜ۫۫";
                    str3 = str4;
                    break;
                case 1092492103:
                    HomeUI.b(r7, str3);
                    str = "۟۟ۧ۠۠ۙۘۦۨۥۜۛۛۜۢۙۡۘۤۨۚ۠ۙ۟";
                    break;
                case 1222245612:
                    str = "ۙ۬۬۫ۡۘۘۗ۬ۜۜۜۜۘۡۨۧۘۛ۫ۜۘ۫ۥۜۘۥ۠۠";
                    break;
                case 1378053658:
                    str4 = getMyName();
                    str = "ۦۘۧۘ۫ۙۡۘۥۢۤۗۧۧۗۛۡۘۖ۠ۙ۫ۡ";
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static javax.crypto.SecretKey sec() {
        /*
            java.lang.String r0 = "ۡۛۧ۠ۤۗۖۨۘۙۥۜۘۡۛۛۜۛۨ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 589(0x24d, float:8.25E-43)
            r3 = -1269202705(0xffffffffb45980ef, float:-2.0256606E-7)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -141570286: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            com.obwhatsapp.yo.g1 r0 = new com.obwhatsapp.yo.g1
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.dep.sec():javax.crypto.SecretKey");
    }

    public static void sendAMsg(String str, C15830rv r10, String str2) {
        String str3 = "ۖۖۦۢۘۗۢۤۜۘ۟ۘۦۧۛۖ";
        while (true) {
            try {
                switch (str3.hashCode() ^ 110386368) {
                    case -1544973029:
                        break;
                    case -805376658:
                        if (f104j == null) {
                            str3 = "ۗۜۧۘۘۜۖۘۦۡ۠ۗ۬ۘ۬ۗۘۘ";
                            break;
                        } else {
                            str3 = "ۖۜۨ۠ۡۡۘۜۚ۟ۙۢۦۘۖ۟ۖۖۘۨ";
                            continue;
                        }
                    case 1471057410:
                        f104j = C16760tb.A21();
                        break;
                    case 1994130949:
                        str3 = "ۨۧۘۡ۠۠۬ۤۧۡۛۥۘ۫ۢۨۘۗۘۤۢۤ۟ۙۢ۠";
                        continue;
                    default:
                        continue;
                }
            } catch (Exception e2) {
                return;
            }
        }
        f104j.A0A((AnonymousClass1ZR) null, (C35541m6) null, (C16740tZ) null, str2, Collections.singletonList(r10), (List) null, false, false);
    }

    public static void sendAReaction(C16740tZ r3, String str) {
        String str2 = "ۗ۠ۥۘۖۢۖۗ۫ۖ۬ۗۖۘۦ۬ۚۦۥۘۢۡۖۥۜۤ";
        while (true) {
            try {
                switch (str2.hashCode() ^ -1371146077) {
                    case -476986273:
                        if (f104j == null) {
                            str2 = "ۥۜۡۘۤۧۗۦۢۦ۫ۦۤ۟ۖۘۘۦۖۥۧۦۦ";
                            break;
                        } else {
                            str2 = "۬ۜۥۖۚۘ۟ۚۥۙۡۨۖۖۗ۫ۘۖۜ۠ۘۘ";
                            continue;
                        }
                    case -141772087:
                        f104j = C16760tb.A21();
                        break;
                    case 831466856:
                        break;
                    case 1813413389:
                        str2 = "ۢۡۨۘۙۗۨۛ۫ۘ۟ۥۨۢۦۧۘ";
                        continue;
                    default:
                        continue;
                }
            } catch (Exception e2) {
                return;
            }
        }
        f104j.A0X(r3, str, true);
    }

    public static void setCallF(CallsHistoryFragment callsHistoryFragment) {
        String str = "۫ۤ۬۫ۦۖۥۖۖۗۚۘۘۗۖۛۤۜۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 531) ^ 1399859467) {
                case -622814913:
                    str = "ۡۨۙ۠ۧۜۘۛۢۖ۟ۤۜۖۤۚ";
                    break;
                case 803345228:
                    return;
                case 1157365815:
                    f100f = callsHistoryFragment;
                    str = "ۤ۬ۡۡۛۖۘۗۚ۟ۦ۟ۙۙ۠ۦۖۗ۫۟ۗۨۙۡ";
                    break;
            }
        }
    }

    public static void setMyNum(C16040sK r5) {
        try {
            String str = r5.A00.jabber_id + "@s.whatsapp.net";
            String stringPriv = shp.getStringPriv("myNumV2", (String) null);
            myNum = stringPriv;
            String str2 = "ۥۦۢ۬ۘۡۘۤۜۦۘۜۛ۠ۛ۫ۚۗۖ۫۟ۖۥۢ۠ۧۗۨۗ";
            while (true) {
                switch (str2.hashCode() ^ 1026614871) {
                    case -473732059:
                        break;
                    case -221389719:
                        str2 = "ۡ۠ۤۥ۠ۦۧ۫ۜ۠۬ۡۘۖۨۢۚ۟ۥۘ۫ۖۘۘۨ۫۟ۜ۠ۧ";
                        continue;
                    case 542149953:
                        if (stringPriv == null) {
                            str2 = "ۦۜۥۘۙ۠ۘۘۡۘ۟۠ۗۜۘۧۤۥۚ۬ۡۘۘ۟۟";
                            break;
                        } else {
                            str2 = "۬۟ۖۙۨۤ۠ۥۧ۠ۤۛ۫ۗۤۚۨۘۘ۠۟";
                            continue;
                        }
                    case 1039049554:
                        String str3 = "ۛۧۥۘ۫ۛ۫ۢۗۢۖ۫ۨ۠ۗۜۗۢۚۡۘۡۗۡۘۗۧۙ";
                        while (true) {
                            switch (str3.hashCode() ^ 28690935) {
                                case -1555872665:
                                    break;
                                case 593289791:
                                    str3 = "ۥۘۥۘ۟ۘۧۧۚ۫ۙۜۡۘ۠ۖۘۘۗ۟ۘۘۙۢۡ";
                                    continue;
                                case 1903948750:
                                    if (stringPriv.equals(str)) {
                                        str3 = "ۥۧۥۘۚ۠ۡ۟۫ۗۖۥۜۦۥۤۚ۠ۡۖۧۘۨۨۧ";
                                        break;
                                    } else {
                                        str3 = "ۛ۬ۘۘۦ۠۟ۡۦۢۤۖۜۥۙۨ۫۟ۚۗۢۦ";
                                        continue;
                                    }
                                case 2129603401:
                                    return;
                                default:
                                    continue;
                            }
                        }
                    default:
                        continue;
                }
            }
            myNum = str;
            shp.setStringPriv("myNumV2", str);
        } catch (Exception e2) {
        }
    }

    public static void setStatusText(Object obj, ViewHolder viewHolder) {
        int i2;
        int i3 = 4;
        C16010sH r1 = (C16010sH) obj;
        boolean onlineDotchat = yo.onlineDotchat();
        boolean onlinechat = yo.onlinechat();
        TextView textView = viewHolder.cs;
        ImageView imageView = viewHolder.csdot;
        String str = "۫ۗ۬ۢۥۤۨۥ۫ۚۦۙۛۥۜۙۜۢۖۢۦۘ";
        while (true) {
            switch (str.hashCode() ^ -626391590) {
                case -1849033263:
                    if (onlinechat) {
                        str = "۫ۖۤۥۙ۟ۛۦۧۖۙۜ۠ۤ۬ۧۨۜۤۜ۠";
                        break;
                    } else {
                        str = "ۢۡۘۗۜۥۘۙۢ۠ۗۘۘۘۤۤۥ۟۫۬";
                        continue;
                    }
                case -1450092835:
                    i2 = 4;
                    break;
                case -104496712:
                    i2 = 8;
                    break;
                case 547599932:
                    str = "ۡۨۡۛۛۖۨۤۚ۠ۡۜ۫ۗ۬";
                    continue;
                default:
                    continue;
            }
        }
        textView.setVisibility(i2);
        String str2 = "ۚۚۖۘۨۤ۠ۘ۠۟۟ۚۢۤۤۖۘ۠ۥۦۘ";
        while (true) {
            switch (str2.hashCode() ^ 43432867) {
                case -1912161238:
                    str2 = "ۢۦۨۘۧ۠ۦۥۨ۫ۚ۟ۨۘۙۢۦۘۨ۟ۘۖۗۥ۠ۖ۠";
                    continue;
                case -904201432:
                    if (onlineDotchat) {
                        str2 = "ۡۦۚۙۧۘۘۥۢ۟۫ۘۘۡۚ۟ۘ۠۫";
                        break;
                    } else {
                        str2 = "ۢۦۚۛ۠ۙۖۙۗۖۜ۫ۧۢۨۘۗ۬ۡۘ";
                        continue;
                    }
                case -545861493:
                    break;
                case 1283539109:
                    i3 = 8;
                    break;
            }
        }
        try {
            imageView.setVisibility(i3);
            String str3 = "۠ۢۡۛۙۦ۫ۤ۟ۧ۟ۘۡۘۖ۠ۥۛۘۗ";
            while (true) {
                switch (str3.hashCode() ^ 1316366132) {
                    case 1581403949:
                        String str4 = "ۦۚۙۧ۠ۘۡۤ۬ۡۜۘۧ۬ۤۢ۟ۘۘۙۥۛ";
                        while (true) {
                            switch (str4.hashCode() ^ -2112476197) {
                                case -1649448038:
                                    str4 = "ۘۤۗۡۡۘۘۦۙۘۘۙۙۦ۬ۗۤۛۥۨۘۘۤۨۙۘۛۤۙۨ";
                                    break;
                                case -1159315607:
                                    return;
                                case 155528179:
                                    String str5 = "ۛ۠۠ۧ۬۟۬ۢۚ۠ۦۗ۠ۥۖۦۥۘۗۘۧۘۢۢۡۘۥۘۖۘ";
                                    while (true) {
                                        switch (str5.hashCode() ^ -45844912) {
                                            case -1229794651:
                                                break;
                                            case -189455247:
                                                str5 = "ۚ۟۟ۨ۫ۥۢۙۦۥ۬ۥۘ۠۠ۤۢۖۨۢۥۥۘ";
                                                continue;
                                            case 1488315703:
                                                String str6 = "ۨ۟ۦۦۗ۠ۧۚۨۡۖۖۦۡۜۘ";
                                                while (true) {
                                                    switch (str6.hashCode() ^ -608920549) {
                                                        case -1190367880:
                                                            if (!onlinechat) {
                                                                str6 = "ۦۡۤۦۡۡۛۡۡۛۨۖۧۡۘۘ";
                                                                break;
                                                            } else {
                                                                str6 = "ۡۤۚۙۖۘۦۗۢۤ۠ۥۦۡۚ۫ۜۥۘ۟ۘۖۘۗۛۨ۬۟ۛ";
                                                                continue;
                                                            }
                                                        case -834015106:
                                                            str6 = "ۖۢۨ۫۬ۘۘۤ۫ۚ۫ۧۜۘۢ۫ۜۘۘۙۥۘۙۚۘۘۡۥۤ";
                                                            continue;
                                                        case 622922365:
                                                            break;
                                                        case 1977081411:
                                                            return;
                                                    }
                                                }
                                                break;
                                            case 1974571842:
                                                if (!onlineDotchat) {
                                                    str5 = "۬ۗۡ۫ۦۚۖۛۥۘ۠ۨۙۥۡۖۘ۟۟ۥۘ";
                                                    break;
                                                } else {
                                                    str5 = "ۖۢ۟ۜۛۛ۫ۡۦۘۘۚ۬۠۟ۗۜۤۥۘ۠ۛۢۡۤۥ";
                                                    continue;
                                                }
                                        }
                                    }
                                    String str7 = "۬ۡۘۘۜۜۡۘۖۥۜۘ۠۟۟ۡۥۙ۫ۚۜۢۥۘۘ";
                                    while (true) {
                                        switch (str7.hashCode() ^ -652086857) {
                                            case 997099602:
                                                f102h = yo.getString("conversation_contact_online");
                                                break;
                                            case 1293895435:
                                                break;
                                            case 1295712231:
                                                str7 = "ۖۢۨۨۘۥۚۘۢۤۜۦۘۨۖۤ۫ۚۛۡۨۗ";
                                                continue;
                                            case 2006303827:
                                                if (f102h == null) {
                                                    str7 = "ۧ۫ۨۘۚۡۨۘ۫ۨ۟۠۫ۘۧۡۙۢۚۨۖۖۗ";
                                                    break;
                                                } else {
                                                    str7 = "ۛۦۡۜ۬ۘۜ۠ۧۜۨۘۤ۟ۜۘۤۛۧۢۛ۬ۤۘۥۘۜ۟ۛ";
                                                    continue;
                                                }
                                            default:
                                                continue;
                                        }
                                    }
                                    yo.Homeac.runOnUiThread(new a1(r1, onlinechat, textView, onlineDotchat, imageView));
                                    return;
                                case 617269146:
                                    if (yo.getAirplaneMode()) {
                                        str4 = "ۚۘۨۛۛۗۨۨۨۘۨۤ۟ۤۡۘۦ۟۬۫۟ۢ۬ۡۗ";
                                        break;
                                    } else {
                                        str4 = "ۛۘۡۘ۠ۘۡۨۚۙۜۤ۬ۤۜۨۜۥۡۤۤۛ";
                                        break;
                                    }
                            }
                        }
                        break;
                    case 1822031461:
                        str3 = "ۨۘۨۘۦۨۡۘۥۙۥۦۗۥۘ۫ۜۥۜۥۖۚ۫ۨۘ۠ۢ۟ۢۦۤ";
                        break;
                    case 1983150693:
                        return;
                    case 2086100077:
                        if (yo.yoHideSeen()) {
                            str3 = "ۙۢۚ۬ۚۜۨۗۛۗۥۙۙ۬ۖۚۘ۟ۨ۟";
                            break;
                        } else {
                            str3 = "ۛۚۦۘۢۖۜ۟۫ۛ۟ۦۢۖۤۥۘۜ۫ۤ";
                            break;
                        }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            Log.d("Fucked", "Error:\n" + e2.getMessage());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        r0 = "۟۟۠ۘۙۜۡۢۜ۬ۙۜۘ۟ۚۖۘۚۤ۬ۜۢ۫";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setSwipeRowData(java.lang.Object r4, android.view.View r5) {
        /*
            java.lang.String r0 = "ۥۨۧ۬ۤۥۡۡ۫ۢۦ۫ۨۗ۫۫"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 522(0x20a, float:7.31E-43)
            r3 = 1679717686(0x641e7536, float:1.1692126E22)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -811861199: goto L_0x0037;
                case -313311704: goto L_0x0011;
                case 279747509: goto L_0x0061;
                case 566580330: goto L_0x0017;
                case 1600741918: goto L_0x0055;
                case 1609547556: goto L_0x0014;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "۫ۥۡۢۖۘۢۙۦۜۧ۠۟ۤۨۘ"
            goto L_0x0002
        L_0x0014:
            java.lang.String r0 = "ۙۥۙۘ۠ۜۥۙۨۘۜۜۘۖۜۘۘۚۜ۫"
            goto L_0x0002
        L_0x0017:
            r1 = -1151056619(0xffffffffbb644515, float:-0.0034831215)
            java.lang.String r0 = "ۧۢۘۘۛۘۖۦۜۦۘۗۧ۬ۥ۬ۛ۟ۢ۟ۗۦۦۤۦۥۘ۠ۖۛ"
        L_0x001c:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -2104387411: goto L_0x0034;
                case -1923140385: goto L_0x005e;
                case -427355870: goto L_0x002b;
                case 1979098613: goto L_0x0025;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x001c
        L_0x0025:
            java.lang.String r0 = "ۧۧۦۘ۠ۢۙۙۘۜۘۚۖ۬۬ۚ۟ۗۧۛۜۧۘ۟ۖۥۘ۫۫"
            goto L_0x0002
        L_0x0028:
            java.lang.String r0 = "ۧۥۢۚ۠ۜۥۙۧ۫ۜۘۢۡۦۘۧۚ"
            goto L_0x001c
        L_0x002b:
            boolean r0 = com.obwhatsapp.yo.yo.isSwipeEnabled()
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "ۡۤۢۢ۟ۘۢۤۖۘۤۗۢۧۜ۬ۜۧۥۜ۫ۢۦۨۛ"
            goto L_0x001c
        L_0x0034:
            java.lang.String r0 = "ۖۜۨۖۚۤۖۖۡۘ۠۫ۗۧ۫ۙ۫ۚۥ۟ۙۜۚۦۖ"
            goto L_0x001c
        L_0x0037:
            r1 = 387322058(0x171610ca, float:4.8488805E-25)
            java.lang.String r0 = "۠ۦۖۘ۠۟ۡ۬ۤۙۡۗۜۘۛ۬ۘۘۙۤ۫ۜۘۨ"
        L_0x003c:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1330993539: goto L_0x0052;
                case -987693828: goto L_0x0045;
                case -199777959: goto L_0x005e;
                case -102533068: goto L_0x004f;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x003c
        L_0x0045:
            boolean r0 = r5 instanceof com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "ۧۢۘۘۨۨ۠ۙۖۨۘۗۦۖۘۡۖۜۘۚ۫ۜۚۥۥ۠ۤۡۘ"
            goto L_0x003c
        L_0x004c:
            java.lang.String r0 = "ۛۥۙۡۥۦۘۤۖۖۘۗۜ۬ۖۗۡۙ۠ۘۘۥۘۥۘۖ۠ۚۙۜۧ"
            goto L_0x003c
        L_0x004f:
            java.lang.String r0 = "ۥۗۚ۬ۙۗۦ۫ۦۙۗۨۢۖۗۦ۫ۡۘۧۚۨۘ"
            goto L_0x003c
        L_0x0052:
            java.lang.String r0 = "۟ۨۖۘۙۢۥۡۢۛۤ۫ۧۚۛۜۘۗ۠ۧ۠ۡۦۡۜۘ"
            goto L_0x0002
        L_0x0055:
            r0 = r5
            com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow r0 = (com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow) r0
            r0.setSwipeRowData(r4)
            java.lang.String r0 = "۟۟۠ۘۙۜۡۢۜ۬ۙۜۘ۟ۚۖۘۚۤ۬ۜۢ۫"
            goto L_0x0002
        L_0x005e:
            java.lang.String r0 = "۟۟۠ۘۙۜۡۢۜ۬ۙۜۘ۟ۚۖۘۚۤ۬ۜۢ۫"
            goto L_0x0002
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.dep.setSwipeRowData(java.lang.Object, android.view.View):void");
    }

    public static void showStoragePermissionRequest(Activity activity) {
        String str = "ۙۥۖۘۥۧۖۘۚۘۤۚ۠ۦ۟ۦۧۘ۫ۘ۫ۡۘۥۛۗۛ";
        while (true) {
            switch ((str.hashCode() ^ 833) ^ 385032266) {
                case -1546903108:
                    return;
                case -1417098944:
                    str = "ۙۚۗ۠ۦۡۘۙۡ۟ۧ۠ۢۘۤۨۘۜۖ۟ۦۦۧۨۜۘۜ۫۠";
                    break;
                case 683836369:
                    String str2 = "۬ۚ۬۬ۡۢ۠ۗۘۘ۠ۥ۠ۜۥۥۘ۟ۗۚ۠۬ۜۘۙ۟ۙۗۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -1892980687) {
                            case -1880090750:
                                str2 = "ۨۛۡۦ۠ۗ۬ۘۥۙۨۧۥۛ۫ۗ۬ۤۤۙۜۢ";
                                break;
                            case -93782523:
                                if (!utils.isStorageGranted()) {
                                    str2 = "ۧ۫ۘۘۡۨ۬ۜۙۡۘۚۘۦۚ۫ۦۢۧۘۘۡۦۜ۠ۡۨ";
                                    break;
                                } else {
                                    str2 = "ۥۡۛۦۡۘۢ۠ۛ۬ۘ۠ۦۖۘ";
                                    break;
                                }
                            case 818192262:
                                str = "ۜۖۚ۠ۤۘۥۘۖۗ۫ۜۙۛۛۦ۬ۘۛۘۧ";
                                continue;
                            case 987806866:
                                str = "ۧۘۜۘۙۛ۬۬۠ۤۦۤۨۘۡ۫۬ۦۦۦۖۗۘۧ";
                                continue;
                        }
                    }
                    break;
                case 1159850619:
                    String str3 = "ۙۨۜۘۚۨۡۡۜۚۗ۫ۨۡۛۤۜ۬ۨ";
                    while (true) {
                        switch (str3.hashCode() ^ 243087962) {
                            case -1205071289:
                            case 633118409:
                                str = "ۘۙۛ۫ۥۘۘۜۡۥۘۥۖۖۤۧۖ";
                                continue;
                            case 1681453243:
                                str3 = "ۡۤۢۢۜۢ۠ۥۡۘ۬ۤۦۤۧ۟";
                                break;
                            case 1808327569:
                                if (activity == null) {
                                    str3 = "۬ۡۖۘۚۢۢۤ۠ۧۡ۫ۢ۠ۛۦۘ";
                                    break;
                                } else {
                                    str3 = "ۙۖۘۘۛۥۥۘ۫۟ۨۘ۬ۗۢۨۥۗ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1036380382:
                    str = "ۢ۟ۘۘۛۙۖۚۧ۟۬ۨۚۘ۟ۙۙۖۘۢۖۛ";
                    break;
                case 1461737683:
                    RequestPermissionActivity.A0L(activity, yo.getID("permission_storage_need_write_access_on_restore_from_backup_request", "string"), yo.getID("permission_storage_need_write_access_on_restore_from_backup", "string"), 200);
                    str = "ۢ۟ۘۘۛۙۖۚۧ۟۬ۨۚۘ۟ۙۙۖۘۢۖۛ";
                    break;
            }
        }
    }

    public static boolean yoAntiRevoke(Object obj) {
        boolean booleanPriv;
        boolean z2;
        C38831rU r8 = (C38831rU) obj;
        String stripJID = yo.stripJID(getJID_t(r8.A11.A00));
        String str = "ۚۦۡۜۦۘ۠ۥ۬ۜۥۦۘ۬ۢۖ۬ۨۜ";
        while (true) {
            switch (str.hashCode() ^ -402147177) {
                case -1452854877:
                    boolean booleanPriv2 = shp.getBooleanPriv("yoAntiRevokeStatus", true);
                    String str2 = "ۡ۟۟ۗۡۧ۠ۚۘۛ۟ۢۢۜ۟ۡۢ۫ۘۙۖۘۜۥۢ";
                    while (true) {
                        switch (str2.hashCode() ^ 1136611490) {
                            case -1590815247:
                                str2 = "ۧۖۦۘۙۘ۟ۨۘۘۨۥۚۦۤۨ";
                                continue;
                            case -1225756313:
                                break;
                            case -1209024140:
                                String stripJID2 = yo.stripJID(getJID_t(r8.A0B()));
                                String str3 = r8.A01;
                                String str4 = "ۘۛ۟ۢۡۚۜۤۤ۟ۡ۟ۜۛۘۘۨۢۚۧۡۖ۠ۚۙ";
                                while (true) {
                                    try {
                                        switch (str4.hashCode() ^ 847934895) {
                                            case -1681016903:
                                                str4 = "۬ۜ۟ۤۥۛۦۦۘۤۜۗ۟۫ۢۜۧۨۘ";
                                                continue;
                                            case -743929749:
                                                if (SS.f558e == null) {
                                                    str4 = "ۤۙۘ۫ۘۚ۬ۨۥۘۧ۬ۨۘۙۥۨۘۡۜۥۘۧۡۛ۟۫۫";
                                                    break;
                                                } else {
                                                    str4 = "ۡۘۘۘۦ۫ۥۘۨ۟ۘ۫ۦۛۥۛۜۙۦۥ۠۬ۧۨۥۜۢۛ";
                                                    continue;
                                                }
                                            case 1577147410:
                                                break;
                                            case 1818653584:
                                                SS.initSS_Del();
                                                break;
                                            default:
                                                continue;
                                        }
                                    } catch (Exception e2) {
                                        break;
                                    }
                                }
                                ArrayList e3 = SS.e(stripJID2);
                                e3.add(str3);
                                SS.f558e.edit().putString(stripJID2, SS.f560g.toJson((Object) e3)).apply();
                                break;
                            case -768605321:
                                if (booleanPriv2) {
                                    str2 = "ۜ۠ۢۚۧۘۚۤۛۨۚ۟ۨۖۡۘ۬ۘۜۘ۟ۡ۟۠۬";
                                    break;
                                } else {
                                    str2 = "۫ۧ۟ۡۦۧۤ۫ۤۗ۫ۖۘۚۘۗ";
                                    continue;
                                }
                        }
                    }
                    return booleanPriv2;
                case -340751090:
                    str = "ۨ۟ۢۚۦۗ۬ۗۘ۠ۛۛۛۥۤۚ۫۬";
                    break;
                case -193058274:
                    if (!stripJID.equals("status")) {
                        str = "ۛۗۙۥۚۧۖۜۦۚۥۗ۬۟ۚۧ۟ۦ۟ۦۘۦۡۨۘۙۢۛ";
                        break;
                    } else {
                        str = "ۡۨۚۤۖۘۢ۫ۨۡ۠ۦۘۗۗۜۘ";
                        break;
                    }
                case 1100888009:
                    String str5 = "ۗۧۙۗۤۡ۟۬ۨ۫ۨۡۘۚۤۥۛۜۖۘۚۢۢ";
                    while (true) {
                        switch (str5.hashCode() ^ -1344449679) {
                            case -1954098447:
                                if (!yo.wantsSpecific(stripJID)) {
                                    str5 = "ۘۛۡۧۨۜۘۥۘۜۡۖۦۘۖۘۗۜۨ۬ۜۙۦۥ۟ۥۘۛۡۗ";
                                    break;
                                } else {
                                    str5 = "ۤ۟ۧۙۗۡۘۘۛ۫ۚۚۜۘۢۗ۟";
                                    continue;
                                }
                            case -1313567062:
                                booleanPriv = shp.getBooleanPriv("yoAntiRevoke", true);
                                break;
                            case -169438858:
                                str5 = "ۤۜۨۘۛۚۥۘۧۥۥۢ۬ۦۖۧۦۤۜۘۘۘۨۦ";
                                continue;
                            case -9287447:
                                booleanPriv = shp.getBooleanPriv("yoAntiRevoke_".concat(stripJID));
                                break;
                        }
                    }
                    String str6 = "ۢ۟ۤۙۜۚۜۡ۬ۢۜۛۤۜۘ۬ۧۤۗ۬ۜ";
                    while (true) {
                        switch (str6.hashCode() ^ 150348775) {
                            case -1418048628:
                                str6 = "ۥۡۡۘۜۤۙۥۖۙ۬ۡ۫ۡۛ۫ۘ۬ۘۨ۫ۨۘۨۚۛۙۘۖۘ";
                                break;
                            case -1355432945:
                                return booleanPriv;
                            case -1341606093:
                                if (!booleanPriv) {
                                    str6 = "ۨۛۤۤۦۥۘۢ۬ۡۘۥ۠۫ۡ۠ۘۘ";
                                    break;
                                } else {
                                    str6 = "ۚۡۜۥ۬ۗ۠ۧۚ۟ۙۤ۬ۗۨۜۖۗ۟ۘ";
                                    break;
                                }
                            case 234037183:
                                String str7 = r8.A01;
                                HashSet hashSet = Conversation.f516e;
                                String str8 = "ۛۚۥۘۛۘۥۙۨۢۤۙ۟ۧۙ۠ۨۨ";
                                while (true) {
                                    switch (str8.hashCode() ^ -378113265) {
                                        case -1603883771:
                                            str8 = "۠ۨۘۢۘۦۙ۟ۛۙۨۘۦۢ۟";
                                            continue;
                                        case 218345344:
                                            z2 = hashSet.contains(str7);
                                            break;
                                        case 1421799853:
                                            z2 = false;
                                            break;
                                        case 1807818030:
                                            if (hashSet != null) {
                                                str8 = "ۡۘۡ۟ۖۡۤ۟ۖۘۛۨۘۖۗۙ";
                                                break;
                                            } else {
                                                str8 = "ۤۤ۫ۧ۠۟ۛۧۦۥۖۖ۟۫ۨۘ";
                                                continue;
                                            }
                                    }
                                }
                                String str9 = "ۦ۫ۢ۫ۗۖۜۥۡ۬۫۠ۢۧ۫ۛۘۜۘۜ۠۫ۚۙۦۗۖۙ";
                                while (true) {
                                    switch (str9.hashCode() ^ -2023781359) {
                                        case -2005041976:
                                            try {
                                                AsyncTask.THREAD_POOL_EXECUTOR.execute(new p(stripJID, str7, yo.stripJID(stripJID), 1));
                                            } catch (Exception e4) {
                                            }
                                            try {
                                                Conversation conversation = Conversation.f515d;
                                                String str10 = "۠ۤۨۘۗۧ۫۬۫ۖۘۛ۠ۗۢۧۨ۟ۖۜۘۖۧۡۘ";
                                                while (true) {
                                                    switch (str10.hashCode() ^ -2142023502) {
                                                        case -1199914101:
                                                            String str11 = "۟ۚ۠۟ۛۧۛۛۜۗ۟ۧۖۨۥۘۛ۫ۚۢ۟ۙ";
                                                            while (true) {
                                                                switch (str11.hashCode() ^ 1029028428) {
                                                                    case -1463969089:
                                                                        str11 = "ۘۜ۫ۢۡ۟ۤ۫۫ۦ۫ۡۢۦۖۘۥۤ۫ۜۥۨۥۦۤ";
                                                                        break;
                                                                    case -1412199851:
                                                                        return booleanPriv;
                                                                    case 1201954892:
                                                                        if (yo.getCurr_sJid().equals(stripJID)) {
                                                                            str11 = "ۘۙۚۥۦۘۨ۠۟ۛ۟ۜۙۙۧ۬۬ۘۢۘۧۘۜۨۥ";
                                                                            break;
                                                                        } else {
                                                                            str11 = "ۥۗۦۘۙۦۧۤۚۡۤ۟ۖۘۢ۫ۨۘۚۡۤۜۖۛۚۘ۠";
                                                                            break;
                                                                        }
                                                                    case 1643906654:
                                                                        String str12 = "ۡ۠ۨۘۘۗ۠ۦ۟ۖۛۦۡۢۢۤۧۥۘۦۥۖ";
                                                                        while (true) {
                                                                            switch (str12.hashCode() ^ -846686860) {
                                                                                case -1758682162:
                                                                                    conversation.recreate();
                                                                                    return booleanPriv;
                                                                                case -842984774:
                                                                                    Conversation.g();
                                                                                    conversation.runOnUiThread(new d0(1));
                                                                                    conversation.startActivity(conversation.getIntent());
                                                                                    conversation.overridePendingTransition(0, 0);
                                                                                    conversation.getWindow().getDecorView().findViewById(16908290).postInvalidate();
                                                                                    return booleanPriv;
                                                                                case 1093101729:
                                                                                    str12 = "ۘۗۖۛۛۨۙۥۦۘ۟ۗۛۖۢۖۘۨ۫ۡۦ۫ۡۘۗۗۦ";
                                                                                    break;
                                                                                case 1891130754:
                                                                                    if (!conversation.hasWindowFocus()) {
                                                                                        str12 = "ۦۧۨۥۧۚۙ۬ۢۨۙۜۘۦ۠۟";
                                                                                        break;
                                                                                    } else {
                                                                                        str12 = "ۢۥۖۖ۟ۘۘ۟ۗۡۘۦۙۧ۟ۙۘ";
                                                                                        break;
                                                                                    }
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case -937499032:
                                                            str10 = "۟ۚۡۘۡۥۨۘۘۥ۟۠۠ۚۢۜۙ۬ۙۡۡۦۘۘ۟۠ۦ۫۠۫";
                                                            break;
                                                        case 518257451:
                                                            return booleanPriv;
                                                        case 1678439558:
                                                            if (conversation != null) {
                                                                str10 = "ۡۖ۟ۢۗۦۘۥۙۛۢۢۖۘۧۡ۫";
                                                                break;
                                                            } else {
                                                                str10 = "ۤۡۦۥ۟ۤۗۤ۬ۥ۟ۡۘۘۧ۟ۦ۬ۢۗۖۘۘ";
                                                                break;
                                                            }
                                                    }
                                                }
                                            } catch (Exception e5) {
                                                return booleanPriv;
                                            }
                                            break;
                                        case -1775048131:
                                            return booleanPriv;
                                        case -864570432:
                                            if (z2) {
                                                str9 = "۬۬ۛ۠۫ۥۚۗۦۘۛۛۥۘۜۦۘۙۧ۟ۤۚۦۘ";
                                                break;
                                            } else {
                                                str9 = "ۘۧ۠ۚ۫ۜۜۨۦۖۢۚۡ۟ۥۘ";
                                                break;
                                            }
                                        case 106072942:
                                            str9 = "ۘ۫ۚۛ۫ۦۦ۟ۡۜۨۡۘۨۧۜۚۚۚ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
            }
        }
    }
}
