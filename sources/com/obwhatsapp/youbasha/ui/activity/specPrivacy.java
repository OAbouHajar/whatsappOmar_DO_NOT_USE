package com.obwhatsapp.youbasha.ui.activity;

import android.app.Activity;
import android.view.View;
import android.widget.CompoundButton;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;

public class specPrivacy implements View.OnClickListener {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f1276g = {"yoHideRead_", "yoHideReceipt_", "yoHidePlay_", "yoHideCompose_", "yoHideViewStatus_", "yoAntiRevoke_"};

    /* renamed from: h  reason: collision with root package name */
    public static final CharSequence[] f1277h = {yo.getString("yoHideRead"), yo.getString("yoHideReceipt"), yo.getString("yoHidePlay"), yo.getString("yoHideCompose"), yo.getString("yoHideStatusView"), yo.getString("yoAntiRevoke")};

    /* renamed from: i  reason: collision with root package name */
    public static String f1278i = yo.getString("specificPrivacy");

    /* renamed from: a  reason: collision with root package name */
    public final Activity f1279a;

    /* renamed from: b  reason: collision with root package name */
    public int f1280b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final String f1281c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1282d = null;

    /* renamed from: e  reason: collision with root package name */
    public CompoundButton f1283e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1284f;

    static {
        String str = "ۗۧۙۛۨۙۤۚۥۢۧۡۘۡۨۧۘ";
        while (true) {
            switch ((str.hashCode() ^ 473) ^ -651572668) {
                case -1485632378:
                    return;
                case -1136845254:
                    str = "ۨ۟ۡۦۦۦۘۖۨۦ۟ۛ۬ۘۦۥۘۛۦۜۘ";
                    break;
                case -343992227:
                    str = "۟ۚۘۘۦۜۘۘۨۚۥۘۥ۠ۨۘۡۤۤۗۚۖۡۚۧ";
                    break;
                case 1520563133:
                    str = "ۗ۟ۡۘۥۦۘۙ۠ۗۨ۫ۨۘۗ۠ۢۜۡۡۢۤۖۧۨ";
                    break;
            }
        }
    }

    public specPrivacy(Activity activity, String str) {
        this.f1279a = activity;
        this.f1281c = str;
        f1278i = yo.getString("privacy_settings");
        this.f1284f = false;
    }

    public specPrivacy(Activity activity, String str, String str2) {
        this.f1279a = activity;
        this.f1281c = str;
        f1278i = yo.getString("privacy_settings");
        this.f1284f = false;
        this.f1282d = str2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void action() {
        /*
            r7 = this;
            r6 = 1
            r2 = 0
            java.lang.String r1 = f1278i
            java.lang.String r3 = r7.f1282d
            r4 = -154018696(0xfffffffff6d1dc78, float:-2.1282455E33)
            java.lang.String r0 = "ۛۨۥۘۡۗ۫۟۠۬ۨۤۖۧۨ۫"
        L_0x000b:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1968715943: goto L_0x0014;
                case -1699116464: goto L_0x0033;
                case -513802178: goto L_0x002e;
                case 1908785351: goto L_0x00c9;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x000b
        L_0x0014:
            r4 = -421827274(0xffffffffe6db6d36, float:-5.1810642E23)
            java.lang.String r0 = "ۘۢۨ۟ۛۗۦۜۙۗۜۦ۫ۙۗ"
        L_0x0019:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -793949286: goto L_0x003c;
                case -153815019: goto L_0x00c9;
                case 221930648: goto L_0x0022;
                case 1701601700: goto L_0x0039;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0019
        L_0x0022:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "ۚۜ۠ۨۖۢ۠۠۠ۖۚۘۘۦۜۗۘۗ"
            goto L_0x0019
        L_0x002b:
            java.lang.String r0 = "ۤۖ۫ۥۘۤۤ۬ۗۥۧۡۘۖۤۦۧ۫ۗ۟ۨ۠ۛۜۦۘ"
            goto L_0x000b
        L_0x002e:
            if (r3 == 0) goto L_0x002b
            java.lang.String r0 = "۠ۙۖۧۧ۟ۖۧۗۨ۟ۚۗ۟ۧۛ۠ۥۘۜ۬ۛۛۨۢ۟۫ۖ"
            goto L_0x000b
        L_0x0033:
            java.lang.String r0 = "ۨۤ۟۬ۥۢۖۜۜۘ۫ۘۡ۬ۗۘ"
            goto L_0x000b
        L_0x0036:
            java.lang.String r0 = "ۖۢۧۜۤۥۘ۫۬ۦۧ۠۠ۢۜۘ۟ۜۦ"
            goto L_0x0019
        L_0x0039:
            java.lang.String r0 = "ۤۘۧۘۡۖۦۘۙۖۗ۬ۥۙۛۨۙۗۜۗ۠ۤۨ"
            goto L_0x0019
        L_0x003c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = f1278i
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
        L_0x0052:
            com.obwhatsapp.yo.CustomAlertDialogBuilder r1 = new com.obwhatsapp.yo.CustomAlertDialogBuilder
            android.app.Activity r3 = r7.f1279a
            r1.<init>(r3)
            com.obwhatsapp.yo.CustomAlertDialogBuilder r0 = r1.setTitle((java.lang.CharSequence) r0)
            com.obwhatsapp.yo.q1 r1 = new com.obwhatsapp.yo.q1
            r1.<init>(r7, r6)
            java.lang.CharSequence[] r3 = f1277h
            r4 = 0
            com.obwhatsapp.yo.CustomAlertDialogBuilder r0 = r0.setMultiChoiceItems((java.lang.CharSequence[]) r3, (boolean[]) r4, (android.content.DialogInterface.OnMultiChoiceClickListener) r1)
            r1 = 17039370(0x104000a, float:2.42446E-38)
            n.f r3 = new n.f
            r3.<init>(r7, r2)
            com.obwhatsapp.yo.CustomAlertDialogBuilder r0 = r0.setPositiveButton((int) r1, (android.content.DialogInterface.OnClickListener) r3)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            n.f r3 = new n.f
            r3.<init>(r7, r6)
            com.obwhatsapp.yo.CustomAlertDialogBuilder r0 = r0.setNegativeButton((int) r1, (android.content.DialogInterface.OnClickListener) r3)
            android.app.AlertDialog r0 = r0.create()
            r0.show()
            android.widget.ListView r3 = r0.getListView()
            r1 = r2
        L_0x008c:
            java.lang.String[] r2 = f1276g     // Catch:{ Exception -> 0x00c7 }
            r4 = 1903373453(0x71732c8d, float:1.20413946E30)
            java.lang.String r0 = "ۚۛۘ۬ۗۚۦۦۥۘۜۛۨۘۜۖۧۘ"
        L_0x0093:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x00c7 }
            r5 = r5 ^ r4
            switch(r5) {
                case -108176408: goto L_0x00a9;
                case 1492910647: goto L_0x009c;
                case 1868546440: goto L_0x00a0;
                case 2103755956: goto L_0x00a6;
                default: goto L_0x009b;
            }     // Catch:{ Exception -> 0x00c7 }
        L_0x009b:
            goto L_0x0093
        L_0x009c:
            return
        L_0x009d:
            java.lang.String r0 = "ۢۘۡۜۡۥۘۘ۫۬ۙ۟ۡۛۧ۫"
            goto L_0x0093
        L_0x00a0:
            r0 = 6
            if (r1 >= r0) goto L_0x009d
            java.lang.String r0 = "ۖۗ۠ۨۖ۟۫ۨۤۛۨۘۘ۟ۤۥۘ۠ۢۘۙۤۦۘ"
            goto L_0x0093
        L_0x00a6:
            java.lang.String r0 = "ۢۛۨ۬۟ۜۦۜۘ۟ۖۚۢ۬"
            goto L_0x0093
        L_0x00a9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c7 }
            r0.<init>()     // Catch:{ Exception -> 0x00c7 }
            r2 = r2[r1]     // Catch:{ Exception -> 0x00c7 }
            r0.append(r2)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r2 = r7.f1281c     // Catch:{ Exception -> 0x00c7 }
            r0.append(r2)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00c7 }
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)     // Catch:{ Exception -> 0x00c7 }
            r3.setItemChecked(r1, r0)     // Catch:{ Exception -> 0x00c7 }
            int r0 = r1 + 1
            r1 = r0
            goto L_0x008c
        L_0x00c7:
            r0 = move-exception
            goto L_0x009c
        L_0x00c9:
            r0 = r1
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.activity.specPrivacy.action():void");
    }

    public void clear() {
        String str = "ۥۚۥۧۡ۟۟ۨۚ۬ۙۢۚۡۨۦۛۦۘ۫ۡ۬ۤ۟ۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 390) ^ 1068117263) {
                case 339864124:
                    str = "ۖۜۖۘ۬۬ۖۛۚۡۘۙۨۛۢۧۖۘۘۜۖۘۡ۫ۦۘۡۧۡ۟ۢۘۘ";
                    break;
                case 1427876814:
                    return;
                case 2013121156:
                    shp.setBooleanPriv(this.f1281c, false);
                    str = "ۜۙۙۦ۫ۦۘۚۛ۬ۥۘۗۜ۟ۘۧۖۙۥۚۡۛ۫ۢ";
                    break;
            }
        }
    }

    public void onClick(View view) {
        String str = "۠ۜۡۧ۠۫ۙۖ۟ۡۦۧۘ۠۠ۜ۟ۖۥۛۦۜ";
        while (true) {
            switch ((str.hashCode() ^ 922) ^ 622329406) {
                case -1753215881:
                    return;
                case -565998988:
                    str = "ۗ۬۠ۛۗۡۗۖۘۡ۫ۙۛۡۨۘ";
                    break;
                case 929710274:
                    action();
                    str = "۫ۖۧۘۜۡۥۘۦ۬ۜۨۜۙ۫ۛۘۘ";
                    break;
                case 1821347888:
                    str = "ۧۤۨۙۜۦۘۢۧۘۨۘۜۛۖۡۢۢۛۖ۬ۘ۟ۡۢۜۤۤ";
                    break;
            }
        }
    }

    public void setSW(CompoundButton compoundButton) {
        String str = "ۨۨۖ۟ۢ۫ۧۡۘۘ۫ۖۨۤ۠ۖۨۥۛۡ۬ۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 838) ^ -130933966) {
                case -1739549855:
                    this.f1284f = true;
                    str = "۟۠ۡۗ۟ۡۘۨ۬۟۠ۘۨۛۜۖۡۜۥۘۜۗۨ";
                    break;
                case -1245515254:
                    return;
                case -850380641:
                    this.f1283e = compoundButton;
                    str = "ۗۨۛ۫ۚۘ۫ۡۨۘۗ۠ۥۤۙۙۢۚۛ۠۬ۗ";
                    break;
                case -256523236:
                    str = "ۘۚۖۘ۫ۡۧ۬ۖۥۨۡۦۘۥۛۗۙۚ۟۟ۤۧ۟۫۫";
                    break;
                case -216445593:
                    String str2 = "ۖۤۘۥۦۧ۫۫ۜۘۧۙۚ۬ۚۖۘ۠۟ۤ۟ۜۤۛۜۖۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 2008720052) {
                            case -2037984777:
                                str2 = "ۛۡۥۜۢ۫ۙۙۜۡ۠۠ۖۤۥۦۛۤ۠ۨۘ";
                                break;
                            case -1989240935:
                                str = "ۨ۬ۚۥۨۘۢۙ۟۫۠ۘۘ۬ۥۥۘۛۡۦۘۨۧ۬";
                                continue;
                            case -120574129:
                                str = "۟۠ۡۗ۟ۡۘۨ۬۟۠ۘۨۛۜۖۡۜۥۘۜۗۨ";
                                continue;
                            case 102962129:
                                if (compoundButton == null) {
                                    str2 = "ۤ۫ۖ۟ۛۜ۟ۜۛ۬ۨۖۖ۠ۙ۟ۘۤۜ۫۫ۘۢۘ";
                                    break;
                                } else {
                                    str2 = "ۢۖۧۧ۟۠۠ۖۥۢۗۖۘۖۗ۫ۥۨۢ۫۟ۜۘۖۙۜ";
                                    break;
                                }
                        }
                    }
                    break;
                case 618832854:
                    str = "ۧۨ۠ۙۜۤۚۡۖ۬ۛۡۘۙۜۦۘ";
                    break;
            }
        }
    }
}
