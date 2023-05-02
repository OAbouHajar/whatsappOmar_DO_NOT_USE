package com.obwhatsapp.youbasha.ui.lockV2.locktypes;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import c.c;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.ui.lockV2.LockBaseActivity;
import com.obwhatsapp.youbasha.ui.lockV2.LockOptions;
import com.obwhatsapp.youbasha.ui.lockV2.LockUtils;
import com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView;
import o.a;

public class Pattern extends LockBaseActivity {

    /* renamed from: c  reason: collision with root package name */
    public static final int f1286c = 0;

    /* renamed from: a  reason: collision with root package name */
    public String f1287a;

    /* renamed from: b  reason: collision with root package name */
    public PatternLockView f1288b;

    public static /* synthetic */ LockOptions b(Pattern pattern) {
        String str = "۬ۙۦ۫ۚۦۤۢۖۘۙ۬ۥۚۜۦۤۙۤۤ۟ۖ";
        while (true) {
            switch ((str.hashCode() ^ 406) ^ -1393362229) {
                case -967718574:
                    return pattern.mLockOptions;
                case 771645825:
                    str = "۟۠ۨ۫ۘ۠ۧۥۥۢۨۧۘ۟ۢ۫ۤ۫ۛ۠ۛۜۘ۬ۖۨۘ";
                    break;
            }
        }
    }

    public void auth_failed() {
        String str = "ۢۘۘۘ۬۠ۖۚۚ۟ۙۨۘۜۦۘۛۤۛۖۖۘۘۛۙۛ";
        while (true) {
            switch ((str.hashCode() ^ 496) ^ -99749603) {
                case -1978837906:
                    str = "ۡۥۥۘۛ۟ۖۘۢ۟ۡۘۨۖۜۗۖۥ۟ۥۨۘ۟ۥۗۛۦۦۘ";
                    break;
                case 668182722:
                    return;
            }
        }
    }

    public void auth_success() {
        String str = "ۜ۫ۦۘ۟ۢۡۥۤ۟۬ۡۚ۬ۜۘۘۨۨۘۛۡۚ";
        while (true) {
            switch ((str.hashCode() ^ 936) ^ 190000933) {
                case -730828145:
                    return;
                case 530004003:
                    str = "۠۫۟ۖۘ۫ۙ۟ۦۘ۟۬ۖۧۢۖ۠ۧۧ۠۬ۧۙۦۘ۫ۢۙ";
                    break;
                case 796282780:
                    super.auth_success();
                    str = "ۥۡۧۘ۠ۘۧۘۡ۫ۨۥۙۘۘۚۖۘۘۛۙۨۘۦۤۛۤ۬ۡ";
                    break;
            }
        }
    }

    public void authenticate() {
        String str = "ۧۛۦۗۙ۠ۚۡۗ۠ۗۖۧۥۨۘ";
        a aVar = null;
        PatternLockView patternLockView = null;
        while (true) {
            switch ((str.hashCode() ^ 539) ^ 1158341155) {
                case -2045637567:
                    patternLockView.setTactileFeedbackEnabled(!shp.getBooleanPriv("pattern_novibration"));
                    str = "ۢۚۨۘۘۙۨۘۗۨۥ۫ۖۘۜۘۨۘۚۡۧۘ۟ۧ۟";
                    break;
                case -1733041095:
                    this.f1288b.setInStealthMode(shp.getBooleanPriv("pattern_invisible"));
                    str = "ۧۥۡۧۧ۬۠۫ۜۜۧۚۧۧۖۛۛ۫ۡۦۨۘۚۘۜۜۢۙ";
                    break;
                case -1058272356:
                    this.f1288b = patternLockView;
                    str = "ۥۦۤ۠ۛۧ۠ۗ۟۠ۜۦۨۗ۫ۡۚۤۨ۠۫";
                    break;
                case -110877263:
                    str = "ۜۜۜۘۦۘۦۢ۟۟ۘۚۥۨ۫ۗۧۦۘ";
                    break;
                case 339769702:
                    this.f1288b.addPatternLockListener(aVar);
                    str = "ۖۛۢۦۙۜۘۦۚۚ۟ۜۢۦۙۜ۫ۘۘۥۜۚۗۤۢ";
                    break;
                case 566161182:
                    aVar = new a(this);
                    str = "ۘ۠ۜۜۨۙۙ۫ۥۨۘۖۘۗۚ۠ۢۧۜۘۨۜۢۤۦۜ۠۬ۨ";
                    break;
                case 1142857926:
                    str = "۟ۜۧۖ۬ۘۘۦۤۙۦۥۦۘۧ۬ۦ۬ۨۥۘ";
                    patternLockView = (PatternLockView) findViewById(yo.getID("pattern_lock_view", "id"));
                    break;
                case 2111282759:
                    return;
            }
        }
    }

    public void change_pass(String str) {
        String str2 = "ۛۚۨۘۨۦ۬۠ۨۢۤۦۦۘۤ۬ۛۥۚۥۘۧۡ۠۬ۧۨۗۜۨۘ";
        StringBuilder sb = null;
        String str3 = null;
        while (true) {
            switch ((str2.hashCode() ^ 30) ^ 374733911) {
                case -2129664423:
                    sb.append("_patv2");
                    str2 = "ۨ۠ۡۘ۫ۚۥۛ۫ۤۘۥۖۘۙۢ۠۫۠ۛۦ۟ۚ";
                    break;
                case -1797477178:
                    sb.append(str3);
                    str2 = "ۥۥۨۖۖۖ۠۠ۡۤۡۗ۬ۙۜۘۨۖۦۘ";
                    break;
                case -1502813500:
                    str2 = "ۥۛۧۛ۫ۨۘ۟ۙ۠ۦۛۜۘۤۛۤۖۙۜۘ";
                    break;
                case -1116152972:
                    return;
                case -1013435717:
                    shp.setStringPriv("patv2", str);
                    str2 = "ۜ۠ۖۘ۟۬ۛۤۖۘۘۦ۟ۤ۟ۡۨۘۙ۟۬ۗۘۥۘ";
                    break;
                case -888697472:
                    String str4 = "ۧ۬ۤۨ۟ۖۘ۟۫ۥۘۙۥۛۜۖۜۘۥۖۢۦ۬ۦ۫۠ۗ";
                    while (true) {
                        switch (str4.hashCode() ^ 1134829370) {
                            case -1418602945:
                                if (!this.mLockOptions.isJIDset()) {
                                    str4 = "ۗۜۙۛۖ۫ۢۦۗ۠ۛۧۘ۠ۦ۫ۤۗ۟۫ۖۘۢۦۦۘ";
                                    break;
                                } else {
                                    str4 = "ۦۡۗۜۖۨ۫ۦۜ۫ۚۧۖ۟ۥۘۦۧۜۘۢۥ۠ۙۛۧ";
                                    break;
                                }
                            case -1177135837:
                                str2 = "۬ۖۧۨ۟ۘۘۨۖ۟ۨۦۘۘۚۙ۬";
                                continue;
                            case -58025328:
                                str4 = "۟۟ۤۜ۠ۛۥۡۥ۫ۨۥۚۧۨۦ۬ۘۘۖ۫۠۬ۗۘۚۗۘۘ";
                                break;
                            case 450284884:
                                str2 = "ۡۢۧۦۢۜۖۦ۟ۦ۫ۖۜۤۖۘ";
                                continue;
                        }
                    }
                    break;
                case -745018239:
                    str2 = "۬ۛۗۛ۫ۧۡ۟ۛۜۘۧۡۚ۠ۖۖۨۘ۫ۜۥۡۚ";
                    break;
                case -222599557:
                    LockUtils.changeLockForJID(str3, LockUtils.PATTERN_LOCK);
                    str2 = "ۚ۫۠۟ۡۘ۠ۡ۬ۚۜۦۘ۫۫ۥ";
                    break;
                case 708443326:
                    LockUtils.changeAppLock(LockUtils.PATTERN_LOCK);
                    str2 = "ۥۛۧۛ۫ۨۘ۟ۙ۠ۦۛۜۘۤۛۤۖۙۜۘ";
                    break;
                case 1163449498:
                    str2 = "۫ۢۡ۠۬ۜۘۨۦۛۦۖۢۥۢۛۛۙۖۧۢ۟۠ۦ";
                    break;
                case 1455309103:
                    finish();
                    str2 = "ۛۢۛۘۜ۫ۨۚۖۘۚ۟ۥ۟ۡۖۘ";
                    break;
                case 1906327119:
                    str2 = "۠۠ۚۛۚ۠ۧ۟ۜۘ۠ۥۥۘۜ۟ۙ۠ۖۗۚۜۥۘ۠ۨ۬ۨۛۘۘ";
                    str3 = this.mLockOptions.getJID();
                    break;
                case 2088324127:
                    shp.setStringPriv(sb.toString(), str);
                    str2 = "ۛۖۥۧ۫ۜۘۦۛۘۘۖۨۥۘۗۗۡۤۥۥۧۤۖ";
                    break;
                case 2119432909:
                    sb = new StringBuilder();
                    str2 = "ۜۙۛۦۜۘ۫ۗۛۢۗۛۙۘۖ۬ۚۚۢۥ۟ۤۧ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0097, code lost:
        r0 = "ۧۜۡ۟۠ۧۖۦۨۘۗ۠ۦۘۚ۬ۡۥۚۥۘۥۖۨۘۥۦ۫ۜۥۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean check_lock_is_set() {
        /*
            r10 = this;
            r5 = 1
            r2 = 0
            r4 = 0
            java.lang.String r0 = "۟۬ۧ۬ۘۗۡۙۥۙۥۤۡۛۘۘۧۖۨ۬ۜۨ"
            r1 = r2
            r3 = r2
            r6 = r2
        L_0x0008:
            int r7 = r0.hashCode()
            r8 = 348(0x15c, float:4.88E-43)
            r9 = 2041181048(0x79a9f378, float:1.1030454E35)
            r7 = r7 ^ r8
            r7 = r7 ^ r9
            switch(r7) {
                case -1819338382: goto L_0x0092;
                case -1601862131: goto L_0x001a;
                case -1138500467: goto L_0x0084;
                case -731097909: goto L_0x0043;
                case -570388232: goto L_0x0048;
                case -352747319: goto L_0x0091;
                case -279317491: goto L_0x008c;
                case 36263385: goto L_0x009b;
                case 338449516: goto L_0x0088;
                case 497324209: goto L_0x0017;
                case 1166012086: goto L_0x0027;
                case 1545605728: goto L_0x0064;
                case 1929638773: goto L_0x0023;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x0008
        L_0x0017:
            java.lang.String r0 = "ۨۛۡ۠ۜ۫ۤۡۨ۫۟ۥ۬ۢۜۨۡۚۤۡۨ"
            goto L_0x0008
        L_0x001a:
            com.obwhatsapp.youbasha.ui.lockV2.LockOptions r0 = r10.mLockOptions
            boolean r6 = r0.getIsChangePass()
            java.lang.String r0 = "ۖ۟ۦۜۦۢ۫ۨۘۖۚ۫ۦۘ۬ۜۦۛۧۤ۬ۧۧ"
            goto L_0x0008
        L_0x0023:
            java.lang.String r0 = "۟ۨۤۧۙۤ۬ۛۘۘۤۙۧۜۡۨۜۥۘ۠ۢۥۘ۟ۡۡۘۜ۟ۛ"
            r3 = r5
            goto L_0x0008
        L_0x0027:
            r7 = 1567075568(0x5d67acf0, float:1.04337386E18)
            java.lang.String r0 = "ۧۛۖۘۖۦۡۛۤۧۤۦۖۨۥۤۙۙۙۚۢۡۘۨۚۤۨۘ"
        L_0x002c:
            int r8 = r0.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case 601386565: goto L_0x0093;
                case 765510064: goto L_0x003b;
                case 1485535993: goto L_0x0040;
                case 1798986593: goto L_0x0035;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x002c
        L_0x0035:
            java.lang.String r0 = "ۜۦۢۖۛۧۤۜۥۘۘۥۥۖۗ۟ۧۡۘۢۡۜۜۗ۠ۦۚۡۘ"
            goto L_0x0008
        L_0x0038:
            java.lang.String r0 = "ۖۧۘۖ۫ۥۘۢۢۛۡ۫ۙۨۜۤۜ۬ۚۦ۠۬"
            goto L_0x002c
        L_0x003b:
            if (r6 == 0) goto L_0x0038
            java.lang.String r0 = "۬ۘۡۙۨۜۘۖۨۥۡۜۘۖۗ۬۟ۥۜۘۧۧۘۘۖۘۘۜۘۘ"
            goto L_0x002c
        L_0x0040:
            java.lang.String r0 = "ۜ۬ۧ۠ۛۜۘ۟ۘۥۘۦۘۛۦۨۢ"
            goto L_0x002c
        L_0x0043:
            java.lang.String r4 = r10.f1287a
            java.lang.String r0 = "ۡۡۖۢۤۛ۟ۤۢۛۥۨۘۤ۬ۨۨۛۚۗۖۖ"
            goto L_0x0008
        L_0x0048:
            r7 = 2019000894(0x7857823e, float:1.7484148E34)
            java.lang.String r0 = "ۖ۫ۢۙۧۤ۠ۥۚۘۜۘۤۡۥ۠ۚۜۘۥۚۥۙۙۡۘۙ۟ۘ"
        L_0x004d:
            int r8 = r0.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -2091631381: goto L_0x0056;
                case -2003497473: goto L_0x005c;
                case -230830428: goto L_0x0061;
                case 1220066955: goto L_0x0097;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x004d
        L_0x0056:
            java.lang.String r0 = "ۛۨ۟۠ۨۛۘ۬ۘۢۗۡۧ۫ۧ"
            goto L_0x004d
        L_0x0059:
            java.lang.String r0 = "ۡ۟ۨۘۙۖۖۖۥ۫۟ۦۡۗ۬ۡۘ۬ۗۥۘۡۙۘ۠ۥۧ"
            goto L_0x004d
        L_0x005c:
            if (r4 == 0) goto L_0x0059
            java.lang.String r0 = "ۘۛۢۨۨۛۗۦۘۘۥۘۚۢ۬ۤۦۛۦۘۘ۠ۥۢۖۡۥۧ۬"
            goto L_0x004d
        L_0x0061:
            java.lang.String r0 = "ۖۜۤۤۛۙ۟۫ۡۢۘۧۘۗۘۧ۠ۖ"
            goto L_0x0008
        L_0x0064:
            r7 = -1273912873(0xffffffffb411a1d7, float:-1.3563054E-7)
            java.lang.String r0 = "۫ۙۥۙۤۛۛۗۥۧۡۧۥۢۚۦۥۛ"
        L_0x0069:
            int r8 = r0.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -1478551077: goto L_0x0097;
                case 11842579: goto L_0x0072;
                case 652604492: goto L_0x0081;
                case 1846969259: goto L_0x0078;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x0069
        L_0x0072:
            java.lang.String r0 = "ۗ۠ۖۘۨ۫ۘۘ۫ۖۨۧۖۧۘۥۘ۬ۤۧۧۜ۫"
            goto L_0x0008
        L_0x0075:
            java.lang.String r0 = "ۚۨۦۘۡۛ۟ۜۘۘۛۛۖۚ۫۟۟ۘۘۘۤۜ۠۬"
            goto L_0x0069
        L_0x0078:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "ۦ۟ۗ۟ۨۛۦۖۥۚۧ۫ۧۥ"
            goto L_0x0069
        L_0x0081:
            java.lang.String r0 = "ۦ۠ۨۧۚۚ۟ۦۨۜۛۨۗۜۗۖۧۡۗ۬۫ۧۙۚۤۗۘۘ"
            goto L_0x0069
        L_0x0084:
            java.lang.String r0 = "ۦۘۖۧۨ۫ۢ۠۠ۦۡۘۢۢۨۘۦۧۗۥۗ۫۟ۨ۬۫ۙ"
            r1 = r3
            goto L_0x0008
        L_0x0088:
            java.lang.String r0 = "ۛۦۦۘۢۘۥۘ۟ۛۘۘۥۥۧۙۥۛۡۖۨ"
            goto L_0x0008
        L_0x008c:
            java.lang.String r0 = "ۖۗۛۧۤۚ۠ۚ۠۠ۦۥۨۤ۬ۘۖ۫۫۟"
            r1 = r2
            goto L_0x0008
        L_0x0091:
            r5 = r1
        L_0x0092:
            return r5
        L_0x0093:
            java.lang.String r0 = "۟ۗۛۦ۬ۖۘۨۥۙۥۡۨ۟ۘۧۚۦۨۘ"
            goto L_0x0008
        L_0x0097:
            java.lang.String r0 = "ۧۜۡ۟۠ۧۖۦۨۘۗ۠ۦۘۚ۬ۡۥۚۥۘۥۖۨۘۥۦ۫ۜۥۘ"
            goto L_0x0008
        L_0x009b:
            java.lang.String r0 = "ۖۗۛۧۤۚ۠ۚ۠۠ۦۥۨۤ۬ۘۖ۫۫۟"
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.lockV2.locktypes.Pattern.check_lock_is_set():boolean");
    }

    public void load_lock_values() {
        String str = "ۢۙۙ۫ۦۘۘۚۙۦۦۚۥۘۜۖۥۘۨۛۡۘۘۜۜۛۢۥۘ";
        String str2 = null;
        String str3 = null;
        String str4 = null;
        StringBuilder sb = null;
        String str5 = null;
        while (true) {
            switch ((str.hashCode() ^ 577) ^ -1475973097) {
                case -2141215576:
                    str = "ۙۘۡۗ۟ۥۧۢۛۛۤۡۘۘۥۚۢۛ۠ۚ۬ۛ";
                    str3 = str2;
                    break;
                case -1951220262:
                    sb.append("_patv2");
                    str = "ۢۚ۠ۙۦ۫ۥۘۘۥۙۖۘۢۛۧۖۨ۬۟ۡۜۘ۟ۧۨۥۡۘۘ";
                    break;
                case -806158184:
                    str = "ۚۨۨ۫ۤۦۘۡۥۡۘ۫ۥۘۚۚۛ۟ۚۜۘ";
                    sb = new StringBuilder();
                    break;
                case -784752163:
                    String str6 = "ۤۤۜۘۨۖۘۘ۫ۗۘۛۦۢ۫ۢ۠ۧۜ۬ۜۘۢۧ۬ۦۥۘ";
                    while (true) {
                        switch (str6.hashCode() ^ 1194080775) {
                            case -1016837130:
                                if (!this.mLockOptions.isJIDset()) {
                                    str6 = "ۦ۠ۖۘۡۨۡۘ۬۠ۗۨۗۘۘ۠ۨ۬ۙۦۛۡ۠ۗ";
                                    break;
                                } else {
                                    str6 = "ۥ۫ۘۖۚۥۦۙۛۘۙۘۤۛۥۡۙۡۘ۟ۢۦۘ۫ۥ۬";
                                    break;
                                }
                            case -880879032:
                                str = "ۛۦۗۡۗۜۤۖۛ۬ۧۛۛ۟ۙۧۥۡۨ۟ۨۦۖۚ۬ۥ";
                                continue;
                            case 1183813777:
                                str = "ۜ۬ۢۥۛ۫ۛۘۜۗۥ۟ۢۙ۫ۜ۫";
                                continue;
                            case 1319184089:
                                str6 = "۫ۦ۫ۧۤۜۛۨ۠ۛۛۜۢۧۥۡۖۢۜۡۚۗ۬ۥۘۥ۠ۜۘ";
                                break;
                        }
                    }
                    break;
                case -641668581:
                    str4 = sb.toString();
                    str = "۬ۥ۫ۙۥ۬۫۟۠ۡۢ۟ۘۘۘۨۢۦۘۤۧۙ";
                    break;
                case -453600735:
                    str = "ۙۘۡۗ۟ۥۧۢۛۛۤۡۘۘۥۚۢۛ۠ۚ۬ۛ";
                    break;
                case 25986200:
                    str2 = "patv2";
                    str = "ۖۜۜۚۙۡ۫ۡۨۘۛ۠ۗۙۜۡ";
                    break;
                case 373442340:
                    str = "ۤۦۖۘۛۛۤۗۙ۬ۢۥۚۧۚۜۨۙۥۖۡۚ";
                    str3 = str4;
                    break;
                case 478936572:
                    str = "ۨۧ۬ۢ۫ۙۜۜ۫۫ۥ۠ۚۡ۫ۚ۟";
                    break;
                case 1206224455:
                    str = "ۘ۫ۥۘۢۤۧ۫۠ۖۘۤۦۗۥ۠ۢۘ۠ۨۘۥۙۢ";
                    str5 = this.mLockOptions.getJID();
                    break;
                case 1613378972:
                    this.f1287a = shp.getStringPriv(str3);
                    str = "ۚۨۦۘ۫۠ۥ۫ۖۖۘۛ۟ۖۘۡۨۛۙۨۚۡۗۜۘۢۖ۠";
                    break;
                case 1989833622:
                    return;
                case 2105004866:
                    sb.append(str5);
                    str = "ۢۚ۬۟ۘۢ۬۟ۡۘۘ۬ۖۘ۫۟ۖ۟۟ۙ";
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        View view = null;
        String str = "ۛ۠ۦۘۗۙ۫ۘۙۤۛۛۢ۬۫ۨۘۤۘۖۘۦۙۛۜۚ۫ۛۦۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 424) ^ 499512963) {
                case -1251895312:
                case 929237382:
                    str = "ۗۖۖۘۥۡ۟ۤۢۢ۫ۙۘۘۘۛۙ۟ۗ۠";
                    break;
                case -819614807:
                    return;
                case -757166963:
                    String str2 = "۠ۖۡۘۙۘۘۤۥۛۛۢۙ۟ۡۛۜۛۘۤ۟ۛ۫۟";
                    while (true) {
                        switch (str2.hashCode() ^ -1215248655) {
                            case -2106309567:
                                if (!this.mLockOptions.getIsChangePass()) {
                                    str2 = "ۦۙۦۘۨۢۙۡ۟۠ۘۚۖ۟ۢۥۘ۠ۦۚۚۗ۫";
                                    break;
                                } else {
                                    str2 = "۫ۚ۫ۥۡ۬ۢۗ۟ۨۥۜۘۖۨۦۦۥۥۦۨۦۤ۫ۗ";
                                    break;
                                }
                            case -1650152929:
                                str = "ۛ۫۟ۥۨۙۚۨۦۨۦۦۘۚۦۨۡۜۜۥ۟ۥۘۗۙۢۡ۟ۖۘ";
                                continue;
                            case -1423621796:
                                str2 = "ۦۡۥۚ۟ۨۘ۠ۢۡۘ۫ۢۜۖۦ۟ۨ۬ۡۘۢ۟ۨ";
                                break;
                            case 1136277101:
                                str = "ۙۗۚ۬ۤ۬ۧ۟۠ۚ۬ۦۘۦۢۡۘۤۛۘۦۘ";
                                continue;
                        }
                    }
                    break;
                case -176551061:
                    authenticate();
                    str = "ۘۗۥ۠ۗۘۘ۟ۧۦ۫ۘۗۙۧۙۦ۫ۤۗۤۥۘ۫ۗۚ";
                    break;
                case 294877522:
                    str = "ۚ۠۟ۘ۠ۛۙۜۢۙۜۙۖۦۦۘ";
                    break;
                case 351948650:
                    auth_success();
                    str = "ۗۖۖۘۥۡ۟ۤۢۢ۫ۙۘۘۘۛۙ۟ۗ۠";
                    break;
                case 566444538:
                    view = findViewById(others.getID("div2", "id"));
                    str = "ۨۘۦ۫ۗۦۘ۬ۦۡۦۢۢۗۜۨۚۛۛ۠ۜ۬";
                    break;
                case 809520582:
                    view.setVisibility(4);
                    str = "ۡۦۦۘ۟ۢۦۘۧۡۙۢۧۦۘۨۘۗۤۢ";
                    break;
                case 879784711:
                    view.setOnClickListener(new c(this, 13));
                    str = "۠ۙۜۘۛۗ۬ۖۨۡۧ۠ۡۘۤۜ۬ۨۜۢۖۖۙۘۘۦۘ";
                    break;
                case 982961039:
                    super.onCreate(bundle);
                    str = "ۚۦ۟۬ۜۡۧۖۢۜۧۦۘۦۡۦ۠۠ۧ";
                    break;
                case 1075306990:
                    Toast.makeText(this, "Set a pattern first!", 0).show();
                    str = "ۡۚۖۘۖۗۨۡۛۜ۬۠ۘۢۥۛۜ۠ۦۘۥۥ۬ۘ۟۠ۘۤۚ";
                    break;
                case 1448569816:
                    str = "ۨۤۤۢۛۗۡۗۘۦ۟ۧۚۦۦۛۤۧۥ۟ۤ";
                    break;
                case 1572456463:
                    String str3 = "۠ۗۨۘۥۦ۠ۜ۬ۢۘۖۘۙ۫ۗۥۧۢۙۦۡ۬ۗۖۘۜ۬ۨۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -771796908) {
                            case -2079619877:
                                str = "ۤۛۡۘۙۥۡۘۡۙۜۡۡۘۥۥۛۖ۬ۢۜۘۥۘ";
                                continue;
                            case -1515395274:
                                str3 = "ۥۥۜۘۚ۟۬ۥۤۤۡۢۤۖ۟ۜ";
                                break;
                            case 1500537554:
                                if (!check_lock_is_set()) {
                                    str3 = "ۚ۟ۥۘ۬۟ۨۘۢۦۨۘۧۨ۟ۜۜ";
                                    break;
                                } else {
                                    str3 = "ۗۥۥۦۖۥۘۘۙۤۘۥۘۘۨۦۖۥۨ۠۫۠ۗ۬ۨۥ";
                                    break;
                                }
                            case 1702918110:
                                str = "ۡۢۨ۟ۙۨۙۗۡۘ۬ۚۘ۬ۙۥۨۖۥۘۚۘۨۘۦۧ۟ۦۜۛ";
                                continue;
                        }
                    }
                    break;
                case 2084177797:
                    super.init("activity_pattern");
                    str = "ۧۖۨۛ۟ۜۧۥۘۖۢۡۘ۠ۘۢۗۥۦۧۧۡ";
                    break;
                case 2094716990:
                    load_lock_values();
                    str = "۫ۢۤ۫ۛ۟ۡۜۥۖۜۖۘ۠ۘ۠ۚۖۘ";
                    break;
            }
        }
    }

    public void reset_lock() {
        String str = "ۚ۟ۨ۫۠ۖۘۦۛ۟ۖۤۡۘۡ۬ۙۦ۬ۨ۫ۥۘۘۦۤ۫ۦۨۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 697) ^ 1582863584) {
                case -1229624475:
                    str = "ۙۤ۠ۗۚۜۖۥۜۘۖۧۦۘ۬ۖۨۘۛۦۘۖۛۧ";
                    break;
                case 1925204295:
                    return;
                case 2032823416:
                    super.reset_lock();
                    str = "۫۟ۡۘ۠ۖ۬ۘۖ۠ۜۧ۫ۜۗۢ";
                    break;
            }
        }
    }
}
