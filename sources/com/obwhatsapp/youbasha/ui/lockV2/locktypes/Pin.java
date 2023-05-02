package com.obwhatsapp.youbasha.ui.lockV2.locktypes;

import X.AnonymousClass00T;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.util.Base64;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import c.c;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.ui.lockV2.LockBaseActivity;
import com.obwhatsapp.youbasha.ui.lockV2.LockOptions;
import com.obwhatsapp.youbasha.ui.lockV2.LockUtils;
import o.b;

public class Pin extends LockBaseActivity {

    /* renamed from: i  reason: collision with root package name */
    public static final int f1289i = 0;

    /* renamed from: a  reason: collision with root package name */
    public String f1290a;

    /* renamed from: b  reason: collision with root package name */
    public EditText f1291b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f1292c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f1293d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f1294e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f1295f;

    /* renamed from: g  reason: collision with root package name */
    public final Drawable f1296g = AnonymousClass00T.A04(yo.getCtx(), others.getID("pin1", "drawable"));

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f1297h = AnonymousClass00T.A04(yo.getCtx(), others.getID("pinz", "drawable"));

    public static /* synthetic */ LockOptions b(Pin pin) {
        String str = "ۘ۫ۘۖۨۥۙۙۥۘۨ۟ۜ۟ۥۖۘۦۗ۫ۡ۠ۖ";
        while (true) {
            switch ((str.hashCode() ^ 224) ^ 1859972578) {
                case 175466891:
                    str = "ۗۧۥۚۨۧۗۤۦۚۚ۬۫ۖ۬";
                    break;
                case 1335267048:
                    return pin.mLockOptions;
            }
        }
    }

    public void auth_failed() {
        String str = "ۢۗۡۘۢ۫۟ۗۚۨۥۧۤۛۙۚۜۡۡۘۨۘۥۙۖ";
        while (true) {
            switch ((str.hashCode() ^ 695) ^ -597961323) {
                case -1411824829:
                    str = "ۖۘ۬ۨ۬ۖۜۙۥۤۖۤۡۖۜ";
                    break;
                case 1046359287:
                    return;
            }
        }
    }

    public void auth_success() {
        String str = "ۧۡۡۦۛۥۦ۟ۡۘۨ۬ۥۘۛۘ۫";
        while (true) {
            switch ((str.hashCode() ^ 741) ^ 687363248) {
                case -1958896316:
                    super.auth_success();
                    str = "ۥ۫ۙۧۚ۟ۤۧۡۙۡۨ۟۟ۘۖۤۖۘ";
                    break;
                case -142898549:
                    str = "ۘ۠۬ۙۙۤۚۤۡۨۧۘۘۦۤۥۘۗۢۥۖۨۦۚ۟ۗ";
                    break;
                case 1704571864:
                    return;
            }
        }
    }

    public void authenticate() {
        EditText editText = null;
        String str = "ۗۡۤۘۗۦۢۙۨۗۧ۟ۛ۬ۦ۬ۤۙۖۙۥ۫ۖۡ";
        while (true) {
            switch ((str.hashCode() ^ 851) ^ -1093932745) {
                case -1997787010:
                    return;
                case -1931551332:
                    str = "ۡ۠ۛۡۖۥ۫۬ۦۘۤۥۖۘۧۧ۟۠۟ۦۘ";
                    editText = (EditText) findViewById(others.getID("passTe", "id"));
                    break;
                case -286165440:
                    editText.addTextChangedListener(new b(this, 0));
                    str = "ۗۨۢۘۛ۫ۢ۠۬ۨۙۢۦۖۘۚ۬ۨۦۘ";
                    break;
                case 1481462242:
                    this.f1291b = editText;
                    str = "ۦۨۨۘۨ۬ۙۧ۠۠ۗۛۘۘۗۖۜۜۘۥۘ";
                    break;
                case 1687963599:
                    str = "ۡۥۨ۟ۚۘۘۧۧۜۘۖۨۧۘۖۡۘۘۨۤۙۦۗۡۘۨ۟۫";
                    break;
            }
        }
    }

    public final void c() {
        int i2 = 0;
        Drawable drawable = null;
        Drawable drawable2 = null;
        Drawable drawable3 = null;
        Drawable drawable4 = null;
        Drawable drawable5 = null;
        Drawable drawable6 = null;
        Drawable drawable7 = null;
        Drawable drawable8 = null;
        Drawable drawable9 = null;
        Drawable drawable10 = null;
        Drawable drawable11 = null;
        Drawable drawable12 = 0;
        Drawable drawable13 = null;
        String str = "ۙ۟ۜۦ۬۟ۢ۟ۡۘۡۤۜۘۜۖۡۘۘۧ۟";
        while (true) {
            switch ((str.hashCode() ^ 45) ^ 235190426) {
                case -1878676538:
                    this.f1292c.setImageDrawable(drawable5);
                    str = "۟ۦ۠ۡ۠ۛۦۨۜۘۜ۠ۜۘۥۡۗۛۜۜۘۗۨۗۤۘۘۛۤۦۘ";
                    break;
                case -1832532713:
                    str = "۠ۢۖۘۜۘ۬ۚۚۛ۬ۤۥۢۢۧۨۢۖۘ";
                    drawable9 = drawable;
                    break;
                case -1715374200:
                    str = "ۘۨۦۜۘۘۤۙ۬ۗۦۚۛ۫ۗ۠۫ۡۘۖۨۨ";
                    drawable7 = drawable2;
                    break;
                case -1184383361:
                    return;
                case -1084718412:
                    drawable = this.f1296g;
                    str = "ۦۚ۬ۛۥۛۤۢۘۚۗۤۙۚۥۘ۠۟ۘ۠ۦۘۜ۬ۨۘ۟ۜۚ";
                    break;
                case -790362861:
                    str = "ۗ۬ۜ۬ۧۥۧ۠ۦۜۦ۟ۘۦۘ";
                    drawable4 = drawable2;
                    break;
                case -788959742:
                    str = "ۨۗۦۘۖ۫۫ۢ۟۫ۦ۟۟ۨۡۛۖۨۙ۬ۡۜۘۧۜۛ";
                    drawable3 = drawable;
                    break;
                case -740538872:
                    str = "ۖۡۨۗۡ۫ۨۙۜۨ۟ۜۘۙ۟ۗۢۡۙ";
                    drawable5 = drawable4;
                    break;
                case -730550010:
                    str = "۬ۜۛۗۙ۟ۚۡ۬ۤۘۢۦۦۖ۫ۚۤ";
                    drawable8 = drawable6;
                    break;
                case -417559420:
                    str = "ۥۥ۫ۛۚۛۖۘۜۥۢ۠ۦ۬ۤ۫ۜۥۙۤ۟ۤۡۘ۟ۨ۟";
                    drawable13 = drawable;
                    break;
                case -266414050:
                    str = "۫ۛۛۚۜ۟ۤ۟۬ۙۙۖۘ۬۟ۧۧۛ۠ۡ۟ۧۨۖۥۘ۟۠ۖۘ";
                    break;
                case -211746905:
                    this.f1293d.setImageDrawable(drawable8);
                    str = "۠ۗ۟ۚۗۙۗۦۚۧۜۙ۠ۘۥۘ۟ۛۦۘۗ۫ۖۘۨۛۤۛۡ۬";
                    break;
                case 19883184:
                    str = "ۙۚۙۚۘۢۚۡۨ۟ۦۥۛ۠ۨۖۦۗ۫ۖۤۦۥۚ";
                    drawable8 = drawable7;
                    break;
                case 198946525:
                    drawable2 = this.f1297h;
                    str = "۠ۥۨۢۗۙ۟ۤۘ۫ۜۨۗۘۘۘۘۥ۫";
                    break;
                case 295818157:
                    str = "ۙۚۙۚۘۢۚۡۨ۟ۦۥۛ۠ۨۖۦۗ۫ۖۤۦۥۚ";
                    break;
                case 349208565:
                    String str2 = "ۡۗۘۤۦۘۨۤۛۦ۫ۦۘۢ۟ۚۢۨ۫ۛ۟ۛ";
                    while (true) {
                        switch (str2.hashCode() ^ 1781492504) {
                            case -1185047435:
                                if (i2 < 4) {
                                    str2 = "ۦۛۛۡۗۦۨۘۘۨۗ۫ۨۖۖۖ۠۟۬۬ۡۘۦ۬۟";
                                    break;
                                } else {
                                    str2 = "ۧۙۜۙ۬۠ۦۢۥۘ۬۟ۛۡۘۘۘ۟ۙۧۜ۫";
                                    break;
                                }
                            case -899736811:
                                str = "ۘۧۦۘۤۘۢۚۖۗۚ۫ۡۘ۬ۘ۟ۥۙۖۘ";
                                continue;
                            case 659685839:
                                str = "ۛۡ۬ۤۧ۟۫۫ۧۡۤۙۤۜۜۘۚۦۗۚ۬ۘۘ۬ۤ";
                                continue;
                            case 1391931191:
                                str2 = "ۢ۠ۧۡ۬ۘۘۢ۬۫ۘۖۜۢۨۢۜ۬ۘۧۙۜ";
                                break;
                        }
                    }
                    break;
                case 376545842:
                    str = "ۛ۬۠ۥۗۥۘۚۨ۠۫ۚۜۜۗۦ۬۫۠ۗۥۘۨۦۜۘ";
                    drawable11 = drawable9;
                    break;
                case 595986248:
                    str = "ۘۛۦ۟ۨ۬ۦۢۦۧۗۧۡۗ۟ۖ۬۟۫ۢۜ۟ۦۘۘۖۨ";
                    break;
                case 838759311:
                    String str3 = "ۢۡۦۘۗ۫ۨۜۜۥۨۥۦۘۘۨۛ۬ۢۢۧۥۜ۬ۡۧ۠ۜۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 479610047) {
                            case -1165784880:
                                str = "ۥۖۤۥۚۜۚۙۥۚۖۘۤۜۗ";
                                continue;
                            case -114685751:
                                if (i2 < 1) {
                                    str3 = "ۖۘۗ۠ۖ۠ۢۢۜۘۡ۬۠ۧۖۚ";
                                    break;
                                } else {
                                    str3 = "ۨۡۜۘۡ۠ۡۗۗ۠ۨۡۨۘۧۦۨۘۛۤۤۥۜ۠ۘۜۜۘۘ۠ۜۘ";
                                    break;
                                }
                            case 1399480962:
                                str3 = "ۖۦۖ۬۬ۖۨۛۦۘۧۙۘۘۥۛ۬";
                                break;
                            case 1882051032:
                                str = "ۚۙۗۗۜۧۨۤۨۘۚ۠ۜۤۢۢ";
                                continue;
                        }
                    }
                    break;
                case 919891624:
                    str = "ۖۨۜ۬ۚۛۘ۠۬ۤ۠ۗۢۘۦۘ";
                    break;
                case 1204120931:
                    i2 = this.f1291b.getText().length();
                    str = "ۛۤۨۗۥۘۦۢۘۡۛۖۚۥ۫۟ۡۧۘ۫ۦۖ۟ۡۘ";
                    break;
                case 1304102796:
                    str = "ۤۗۗۙۢۥۘۖۥ۠ۙۜۥۘ۟۫ۖ۫ۜ۟ۡۢۧ";
                    drawable10 = drawable2;
                    break;
                case 1338387354:
                    str = "ۖۡۨۗۡ۫ۨۙۜۨ۟ۜۘۙ۟ۗۢۡۙ";
                    break;
                case 1475903122:
                    str = "ۘۛۦ۟ۨ۬ۦۢۦۧۗۧۡۗ۟ۖ۬۟۫ۢۜ۟ۦۘۘۖۨ";
                    drawable13 = drawable12;
                    break;
                case 1708165784:
                    String str4 = "ۛۙۤۢ۠ۡۥ۟ۧۨۢۗ۫ۗۨۘۜ۬ۢ";
                    while (true) {
                        switch (str4.hashCode() ^ 2088870034) {
                            case -2025817221:
                                if (i2 < 3) {
                                    str4 = "ۛۨ۬۟ۦۢۥۧۥۘۖۜۧۘۤۧۜ";
                                    break;
                                } else {
                                    str4 = "ۚۖۨۙ۫ۨۘ۠ۜۛۤۙۨۘۧۛۦ۬۬ۖۨۧۘ";
                                    break;
                                }
                            case -1930159610:
                                str = "ۖۚۡۘۚۖۥۘ۟ۖۜۡ۬ۜۘۚ۠ۗۖ۟ۡۘۖۨۡ";
                                continue;
                            case -653608061:
                                str = "۠ۢۜۘۤۤۛۤۧۢۘۧۥۘۡۨۨۘ";
                                continue;
                            case 2119441773:
                                str4 = "ۛۥۢ۫ۢۜۘۤ۟۠۬ۤۜۢۤ۠";
                                break;
                        }
                    }
                    break;
                case 1753304410:
                    this.f1295f.setImageDrawable(drawable13);
                    str = "۠۟ۜ۠۠ۛۖۥۢۙۤۡۘۨۦۥۘ";
                    break;
                case 1781220774:
                    this.f1294e.setImageDrawable(drawable11);
                    str = "ۗ۟ۜۘۜۦۜۘۖۛۦۘۧۧۖ۬ۢۦۘۛۖۗۨۖۚ";
                    break;
                case 1849414036:
                    str = "ۙ۟۠ۙۜۨۘۖۨۚۜۖ۟ۦۥۨۧۙۛۚۜۘۚۚ۠۬ۖ۫";
                    drawable5 = drawable3;
                    break;
                case 1919363947:
                    str = "ۧۤۗ۟ۥۢ۠ۙ۟۟ۗ۫ۛۥۤۖ۠ۖۘۥ۠ۥۘ";
                    drawable12 = drawable2;
                    break;
                case 2021869996:
                    str = "ۖۨۜ۬ۚۛۘ۠۬ۤ۠ۗۢۘۦۘ";
                    drawable11 = drawable10;
                    break;
                case 2074407008:
                    str = "ۜ۟ۢۧۗۖۘۘ۠ۤ۬۬ۢ۫ۥ";
                    drawable6 = drawable;
                    break;
                case 2144982964:
                    String str5 = "ۙۖۜ۟۠ۤۙۦۖۚۖۙۡۦۙ۠۫ۙ";
                    while (true) {
                        switch (str5.hashCode() ^ -2057912554) {
                            case -2127337684:
                                str = "ۡ۫۫۬ۧۘ۟ۚۧۢۛۖۡۨۨ۫";
                                continue;
                            case -1017723675:
                                str5 = "ۚۜۨۘۙۚۛ۫ۡ۬۬ۥۡۘ۬۫ۚۡۧۚۡۜ۬";
                                break;
                            case 186460388:
                                if (i2 < 2) {
                                    str5 = "۠ۦۛۦۥ۠ۢۧۜۘۥۘۘۜۦۧۦۡۨ";
                                    break;
                                } else {
                                    str5 = "۠۬ۘۚ۟۫ۜ۠۠۬ۚۨۜۖۨۥۢ";
                                    break;
                                }
                            case 394928030:
                                str = "ۜۜۘۦۗۘۘ۬ۖۧۘ۬ۛۘۘ۠ۥۘۥ۫ۨۗۧۧۗۡ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    public void change_pass(String str) {
        String str2 = "ۙۛ۠ۦۧۨۘۖۨۖۘۚۨۛ۠۟ۡۘۘۤۙۙۚۥۘۜۛۨۘ";
        StringBuilder sb = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            switch ((str2.hashCode() ^ 680) ^ 1480460834) {
                case -2133855263:
                    LockUtils.changeLockForJID(str3, LockUtils.PIN_LOCK);
                    str2 = "ۤۙۜۘۤ۠ۡۘ۬ۤۨۙۗۡۦۖ";
                    break;
                case -1985875085:
                    str2 = "ۗۤ۟ۧۛۖۘۤۧۥۘۥۥۢۢۘۥۜ۫ۨۗۢۘ";
                    str4 = new String(Base64.encode(str.getBytes(), 2));
                    break;
                case -1768734059:
                    String str5 = "ۡۧۘۘ۫ۗۡۢۜۘۖۥۚۙۖۨ۠۬ۢ۬";
                    while (true) {
                        switch (str5.hashCode() ^ 1878607270) {
                            case -977511005:
                                if (!this.mLockOptions.isJIDset()) {
                                    str5 = "ۛ۫ۡۘۡۡۨۧۤۡۘۨۦۘۧۥۤۧۖ۟ۡۜۘۡۗ۫۬ۨۢ";
                                    break;
                                } else {
                                    str5 = "ۗ۫ۡۘۢۨۜۘۡۜۥۘۦ۬ۦۖۜۜ";
                                    break;
                                }
                            case -698535699:
                                str2 = "ۚۗۛۨۦ۬ۛۨۘۗۤۘۘۚۦ۬";
                                continue;
                            case -137317801:
                                str5 = "۬ۘۨۘ۫ۙۡۨۙۡۘۘ۬۠۟۬ۥۦۦ";
                                break;
                            case 866083065:
                                str2 = "ۙۤۥۧۜۢ۠ۙۜۘۦۖۨۘۗۜ۠۫ۗۙۜۛۥۘ۟۟ۜ";
                                continue;
                        }
                    }
                    break;
                case -1703890867:
                    str2 = "ۦ۬ۙ۫ۜۤۥۗۥۛ۫ۧ۫ۖۧ۫ۤ۬";
                    break;
                case -1631183045:
                    sb.append("_codepa");
                    str2 = "ۡۙۜۘۦ۠۬ۛۖۦۘۦۥۘ۬۫ۘۘ";
                    break;
                case -1372724306:
                    str2 = "ۗۗۗ۫ۙۜۘۘۛۜ۠ۢ۟ۘۦ۠۟ۘۛۛۢۦ۠ۡۖ۟۠ۥ";
                    break;
                case -928162182:
                    shp.setStringPriv("codepa", str4);
                    str2 = "۠ۨۤ۠ۦۥۘۥۧ۠ۖۢ۟۠۠ۚ۫ۦۜ۠۫۫ۢۛۨۘ";
                    break;
                case -875183046:
                    str2 = "۫۠ۧۜۢۥۘۚۡۦۧ۟ۤۡ۫ۛۦ۟ۜ۠ۘۖۘ";
                    break;
                case -602922575:
                    finish();
                    str2 = "ۡۨۧۘۧۚۛۨۖۤۧۛۡۘۗ۬ۜۘۗۘ۫۬ۚۛۘۖ۟۫۬ۨۘ";
                    break;
                case 1027448496:
                    sb.append(str3);
                    str2 = "۠ۗ۠ۥ۟ۡ۠ۢ۬۠ۚۥۚۚۨۚۢۜ۬۠ۡ۟ۨۦۘۤۥۥۘ";
                    break;
                case 1042550439:
                    shp.setStringPriv(sb.toString(), str4);
                    str2 = "ۙۖۨۘۢۘۜۙ۫۬ۙ۬ۡ۟۠ۙ";
                    break;
                case 1203766319:
                    sb = new StringBuilder();
                    str2 = "ۦۤۢۡۡۜۘ۟ۧۧۨ۟ۤۙۢۤۥ۠ۦۘ";
                    break;
                case 1342337714:
                    LockUtils.changeAppLock(LockUtils.PIN_LOCK);
                    str2 = "ۦ۬ۙ۫ۜۤۥۗۥۛ۫ۧ۫ۖۧ۫ۤ۬";
                    break;
                case 1569071378:
                    str2 = "ۨۛ۠ۘۦۘۧۚ۟ۤۡ۫ۧۤۧۥ۟";
                    str3 = this.mLockOptions.getJID();
                    break;
                case 1592166311:
                    return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0097, code lost:
        r0 = "۠ۘۗۗۗۘۨ۫ۙ۫ۨۤۧۡۦۧۧۗ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean check_lock_is_set() {
        /*
            r10 = this;
            r5 = 1
            r2 = 0
            r4 = 0
            java.lang.String r0 = "ۗۥۜۘۧۥۢۡۥۘۛ۟ۗ۬۠ۥۛۢۛۗۥۜ"
            r1 = r2
            r3 = r2
            r6 = r2
        L_0x0008:
            int r7 = r0.hashCode()
            r8 = 847(0x34f, float:1.187E-42)
            r9 = 450991078(0x1ae193e6, float:9.329676E-23)
            r7 = r7 ^ r8
            r7 = r7 ^ r9
            switch(r7) {
                case -1823186218: goto L_0x0023;
                case -1509311099: goto L_0x0043;
                case -1314827033: goto L_0x008c;
                case -940161574: goto L_0x001a;
                case -721376540: goto L_0x0092;
                case -507655783: goto L_0x0027;
                case -233555076: goto L_0x0088;
                case -138211829: goto L_0x0084;
                case 1417139552: goto L_0x0064;
                case 1503152394: goto L_0x0048;
                case 1587791008: goto L_0x009b;
                case 1874075771: goto L_0x0017;
                case 1990674987: goto L_0x0091;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x0008
        L_0x0017:
            java.lang.String r0 = "ۙۙۘۘۛۚۧ۟ۜۘ۫ۖۦۧۡۘۢۡۥۘ۠۠۠۠ۗۢ"
            goto L_0x0008
        L_0x001a:
            com.obwhatsapp.youbasha.ui.lockV2.LockOptions r0 = r10.mLockOptions
            boolean r6 = r0.getIsChangePass()
            java.lang.String r0 = "ۡۛۦۦۚۡ۠۫ۦ۫ۦۦۘ۫ۤۜۘۘۚۡۘ۬۟ۥۛۥۨۘۢۘ۬"
            goto L_0x0008
        L_0x0023:
            java.lang.String r0 = "ۡۛۗۜ۟ۖۘ۠ۙۜۛ۫ۜۘۦۥۖۘۚۜ"
            r3 = r5
            goto L_0x0008
        L_0x0027:
            r7 = 1099393923(0x41876b83, float:16.927496)
            java.lang.String r0 = "ۢۦۛۨۗۡۛۨۢۨۖۘ۠ۘۚ"
        L_0x002c:
            int r8 = r0.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -1884469295: goto L_0x0035;
                case -1399924797: goto L_0x003d;
                case 1178294954: goto L_0x0093;
                case 1582617232: goto L_0x0040;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x002c
        L_0x0035:
            if (r6 == 0) goto L_0x003a
            java.lang.String r0 = "ۢ۠۟ۤۦۘ۟۠ۢۡ۠ۧۛ۠ۢۦۖۥ۟۬ۖۦۢۧۛۡۜ"
            goto L_0x002c
        L_0x003a:
            java.lang.String r0 = "ۘۘ۫ۦۗۛۜ۠ۨۘ۟ۤۡۘ۟ۤۢۧ۟ۜۘۘۡۧۘۡۘ۫ۡ"
            goto L_0x002c
        L_0x003d:
            java.lang.String r0 = "ۗ۠ۥۘ۬ۘۢۛۦۦۦۚۤۦۙۘۦۢۛ۫ۛۜۘۨۖۚۘۤۖ"
            goto L_0x002c
        L_0x0040:
            java.lang.String r0 = "ۥۤۡۘۤ۠ۨۘ۫ۧۨۘۛ۟ۡۘۥۛ۬"
            goto L_0x0008
        L_0x0043:
            java.lang.String r4 = r10.f1290a
            java.lang.String r0 = "ۛۛۡۘۛ۬ۧۡۥۢۥۘۗۜۨۥۘۖۚۖۢ۫ۚ"
            goto L_0x0008
        L_0x0048:
            r7 = 390935242(0x174d32ca, float:6.6303177E-25)
            java.lang.String r0 = "۟ۡۧ۫ۛۡۗۛۥۘۙۛۦۛۧۨۘۗۧۗ"
        L_0x004d:
            int r8 = r0.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -1916234810: goto L_0x0061;
                case -1678676315: goto L_0x0056;
                case -370543653: goto L_0x0097;
                case 1332402080: goto L_0x005c;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x004d
        L_0x0056:
            java.lang.String r0 = "۟ۘۤۘۥۘۜ۬ۡ۫ۢۧۢۢۦۙ۠ۗ"
            goto L_0x0008
        L_0x0059:
            java.lang.String r0 = "ۥ۠ۜۘۙ۫ۤۜ۟۟۠۬ۗۖۡۨۘۢ۬ۧ۟ۖۥۘۖۛۘ"
            goto L_0x004d
        L_0x005c:
            if (r4 == 0) goto L_0x0059
            java.lang.String r0 = "ۧۜۜۤۥۘۘۘۗۘۘۗۘۥۘۘ۬ۖۘۘۜۡۖۥۦۥ۟ۜۧۜۘ"
            goto L_0x004d
        L_0x0061:
            java.lang.String r0 = "ۘۘ۬ۢۧۥۘۚۦۗ۟ۘۨۘۧۖۦۘ۠۟ۧۚۜۜ۠۬"
            goto L_0x004d
        L_0x0064:
            r7 = 1134179149(0x439a334d, float:308.4008)
            java.lang.String r0 = "ۨۤۧ۠ۚۚ۫ۛۘۚۢۦۙۨۛۧۢ۫ۜ۬"
        L_0x0069:
            int r8 = r0.hashCode()
            r8 = r8 ^ r7
            switch(r8) {
                case -1899026862: goto L_0x0078;
                case -1658725911: goto L_0x0072;
                case -350330040: goto L_0x0097;
                case 817902512: goto L_0x0081;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x0069
        L_0x0072:
            java.lang.String r0 = "ۚۚۡۥۢ۠۠ۜۖۙۤۖۘۦۘۘۗۨۘۘۚۙۥۖۧۨ۟ۢۡۘ"
            goto L_0x0069
        L_0x0075:
            java.lang.String r0 = "ۢ۠۬ۜۨۨۢۗ۫ۘۗ۫ۚۦۨۘۗ۠ۜۜۙۙۡۛ۠ۦۨۤ"
            goto L_0x0069
        L_0x0078:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "ۧۘۢۧۗ۠ۙۙۨۙۗۥۘ۠ۙۡۘۘۚۦۘۘۢ۬۠ۙۥ۬ۖۦۘ"
            goto L_0x0069
        L_0x0081:
            java.lang.String r0 = "ۡۦۙۘۢۘۘۨۤۧۦۧۛ۟ۖۘۡ۠۬۟ۡۥۘۖ۬ۗۜ۬ۥ"
            goto L_0x0008
        L_0x0084:
            java.lang.String r0 = "۬ۙۨۘ۟ۚۖۥ۟ۦۧۧ۫ۡۦۡۘۡۨۡ۫۬۫ۡۡ"
            r1 = r3
            goto L_0x0008
        L_0x0088:
            java.lang.String r0 = "ۚ۟ۘۤۛۖۚۤۖۜۥۢۧۜۛۛۖۨۘۙۨۙ۠ۜ"
            goto L_0x0008
        L_0x008c:
            java.lang.String r0 = "ۡ۠ۜۘۧ۫ۨۘۚ۠ۜۘۡۘۧۛۜۘۘ۬ۢۥۧۥۘۜۖۚۨۜ۫"
            r1 = r2
            goto L_0x0008
        L_0x0091:
            r5 = r1
        L_0x0092:
            return r5
        L_0x0093:
            java.lang.String r0 = "۟ۖۛ۫ۛۥۘۡۦ۫۠ۛۥۘۦۛۥۚۧۜۘ"
            goto L_0x0008
        L_0x0097:
            java.lang.String r0 = "۠ۘۗۗۗۘۨ۫ۙ۫ۨۤۧۡۦۧۧۗ"
            goto L_0x0008
        L_0x009b:
            java.lang.String r0 = "ۡ۠ۜۘۧ۫ۨۘۚ۠ۜۘۡۘۧۛۜۘۘ۬ۢۥۧۥۘۜۖۚۨۜ۫"
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.lockV2.locktypes.Pin.check_lock_is_set():boolean");
    }

    @SuppressLint({"SetTextI18n"})
    public void fillPass(View view) {
        int i2 = 0;
        String str = "ۖۡۨۚۜۙۥۛۨۥۨۘۢۗۨۘ";
        StringBuilder sb = null;
        EditText editText = null;
        String str2 = null;
        Editable editable = null;
        while (true) {
            switch ((str.hashCode() ^ 197) ^ -791286752) {
                case -2103415694:
                case 1324118964:
                    return;
                case -1835572930:
                    str = "ۚ۬ۨۛۚۡۘۨۘۘۘۗۧۤۥ۫ۤۚۚ۠";
                    editable = this.f1291b.getText();
                    break;
                case -1610286728:
                    sb.append(editable.toString());
                    str = "ۙۥۨ۠ۙۛۙۖ۠ۧۚۗۖ۠ۜ";
                    break;
                case -1511240155:
                    this.f1291b.getText().delete(i2 - 1, i2);
                    str = "ۚۥۡ۟ۨۜۘۘۥۡۘ۫ۖ۬۟ۢۘ";
                    break;
                case -1393970003:
                    str2.getClass();
                    str = "ۢۙۘۘ۬ۘ۠۠ۚۘ۫ۙۛۖۨۘۘ";
                    break;
                case -1023329076:
                    str = "ۦ۟ۦۘۛۢۙۥ۬ۖۘ۬ۢۨۙ۠ۡۘۘۚۡۘۦۜ۠";
                    editText = this.f1291b;
                    break;
                case -968687297:
                    str = "۬ۦۖۨ۫۫۠ۤۚۢ۠۫ۛ۟ۗ۬۬ۨۛۧۙۦۡۘ";
                    str2 = view.getTag().toString();
                    break;
                case -963314437:
                    String str3 = "ۗۧۡۘۚۛۡۙۚۨۘۖ۠ۦۘ۟ۖۜۤۥۜۨۛۜ۬۫ۡۨ۠۠";
                    while (true) {
                        switch (str3.hashCode() ^ -341539097) {
                            case -1569058718:
                                str = "ۖۤۦۨۖۧۤۘۗۖۗۙۜۛۙۤۥۢ۟ۢ۟";
                                continue;
                            case -1356703352:
                                str3 = "ۡۥۘۡۜۨۘۡۦۨۢ۬ۦۘۖۦۗ";
                                break;
                            case -1335336396:
                                if (str2.equals("btr")) {
                                    str3 = "ۛۘۘۘۙۘۙۙۘۦۘۡ۠ۡۘۛۜۘۘ";
                                    break;
                                } else {
                                    str3 = "ۨۛۨۘۗ۠ۗ۠۬ۖۗۜ۠ۢۛۤ";
                                    break;
                                }
                            case 886809824:
                                str = "ۘۥۥۘۨۖۛۤۡ۟ۨۨۦۖ۫ۡ۬ۚۡۘ";
                                continue;
                        }
                    }
                    break;
                case -506653714:
                    sb.append(str2);
                    str = "۠۠ۖ۫ۘۙۖۚ۬ۨۙ۫۫ۧ۫ۤۢۤ۬ۥۦۦۜۥۜۘ";
                    break;
                case 308521619:
                    String str4 = "ۘۧۦۡۦۙۦۧۡۘ۫ۚۘۘ۠۫ۖۤۘۥۘ";
                    while (true) {
                        switch (str4.hashCode() ^ 97849591) {
                            case -2014423201:
                                str = "ۥۚۖۚۤۡۘۡۙۡۘۚ۫ۛ۠۫ۖۥۨۚۤۖ";
                                continue;
                            case -1862722759:
                                if (i2 <= 0) {
                                    str4 = "ۙۜ۟ۖۖۨۙۙۤۗۗۤ۫ۨ۠ۙۨۡ۟ۡۧ۠ۗۖۨۛ";
                                    break;
                                } else {
                                    str4 = "ۡۥ۠ۙۜۖۘ۟۬ۦۘۦۗ۟۫ۘۨۘۚ۟ۡۘۦۙۧ";
                                    break;
                                }
                            case 454305146:
                                str4 = "ۖۦۨۛ۟ۥۚ۫۟ۛۙۘۜۘۖ۫ۥۘ۟۠ۘۘ";
                                break;
                            case 1519323149:
                                str = "ۥۡۚۛۦ۬۠ۜۖۘۥۛۙۙۦۦ۠ۢۡۖۧۙ";
                                continue;
                        }
                    }
                    break;
                case 483218966:
                    c();
                    str = "ۥۚۖۚۤۡۘۡۙۡۘۚ۫ۛ۠۫ۖۥۨۚۤۖ";
                    break;
                case 566390222:
                    str = "۟ۛ۬ۗۚۥۘ۬ۢۥۥۙۘۙ۟ۜۘۥۤۜۥۛ۟ۜۤ۟ۘۧۘ";
                    break;
                case 775635845:
                    String str5 = "ۡۜۜۘۥۛۦۘ۫۬ۡۙۦۛۨۢۦۘ";
                    while (true) {
                        switch (str5.hashCode() ^ 1710951317) {
                            case -959391160:
                                str5 = "ۥ۬ۜۢ۫۬ۜ۫ۢ۟ۥۥۘۛۛۦۘۦۘۡ";
                                break;
                            case -928588119:
                                str = "۠ۖۖۘۛۛۥۘ۫ۡ۠ۛۡۘۚۥۚۡۖۘۘ";
                                continue;
                            case 946951596:
                                if (str2.equals("reset")) {
                                    str5 = "ۚۡ۟ۛ۫ۖۘ۟۫ۨۘۚۡۢۤۘۚ۠ۜۥ۠ۤ";
                                    break;
                                } else {
                                    str5 = "ۜۦۢۙ۬۬۟۬ۥۘۜۤۢۗۥۧۘۗۧۡۘۙۚ۠ۙۗۥۡۛۜۘ";
                                    break;
                                }
                            case 1954572650:
                                str = "ۡۚۨۘۜۤۥۘۘۨۦۥۘۖۚۘۦۘ۫ۙ۠ۘۢۤ";
                                continue;
                        }
                    }
                    break;
                case 815951000:
                    editText.setText(sb.toString());
                    str = "۠ۖۖۘۛۛۥۘ۫ۡ۠ۛۡۘۚۥۚۡۖۘۘ";
                    break;
                case 1166824442:
                    i2 = editable.length();
                    str = "ۗۗۖۘۜۖۘۗۢۧۦۛۤۢۧۗ۠ۖۜۢۖۖۘۧۤۡۖۗۢ";
                    break;
                case 1267588244:
                    sb = new StringBuilder();
                    str = "۟ۛۖۘۖۥۢۗۖۧۘۤۥۡۘۘۦۖ۬ۛۨۘۛ۬ۖۘ";
                    break;
                case 1389190023:
                    str = "ۤۙۛۤۢۖۘۚ۠ۧۨۤۘۘۤۦۚۙۡ۠ۗۚۡۜ۬ۢ";
                    break;
            }
        }
    }

    public void load_lock_values() {
        String str = "ۤۜۥ۟ۛۚۖۦۡ۠ۧ۬ۖ۫ۖۘۡۨۘۘۜۙۘ۬ۨ۬ۜ۫";
        String str2 = null;
        String str3 = null;
        String str4 = null;
        StringBuilder sb = null;
        String str5 = null;
        while (true) {
            switch ((str.hashCode() ^ 651) ^ 1320740623) {
                case -1244143936:
                    str4 = sb.toString();
                    str = "ۢ۫ۚۛ۟۫۬ۥۘۖۖۨۘۜۦۙۡۨۥۘ۫۠ۨۘ۫ۢۢ";
                    break;
                case -845596516:
                    sb.append("_codepa");
                    str = "ۘۜۨۘۖۥۨۜۖۨۜۖ۟۠ۦۖۘ";
                    break;
                case -717353198:
                    str = "ۖۜۛۤۘۤ۠ۨ۠ۛۡۤۢۥۡۘ۫ۛۡۘ";
                    str3 = str4;
                    break;
                case -403599136:
                    str = "ۜۛۡ۟ۘۡۘۨۡۢۜۗۡۘۙ۬ۢۤۜۦۘ";
                    str3 = str2;
                    break;
                case 89622103:
                    String str6 = "ۡۨۤۡۘ۬ۨ۫۫۫ۥ۫ۘ۠";
                    while (true) {
                        switch (str6.hashCode() ^ -1091578382) {
                            case 68369722:
                                str = "ۘۦۨۘۡۢۘۘ۟ۜۤۦ۫ۧۚۥۘ۠ۗۚۥ۬ۡۘۦ۬ۡۘ";
                                continue;
                            case 424691672:
                                str6 = "ۜۧۧۘۥۦۘۧ۬ۡ۬ۛۦۥۧۖۘۘۢ۬";
                                break;
                            case 1195007276:
                                str = "ۢۤۦۘ۬۟ۥۘ۬۬ۚۛ۟ۗۨ۬ۨۗۖۥۘۛ۫ۘۘ۬ۚۘ";
                                continue;
                            case 1629582011:
                                if (!this.mLockOptions.isJIDset()) {
                                    str6 = "ۦۤۚۚۦۜۥۛۖ۠ۢۚ۫۫ۦۘ";
                                    break;
                                } else {
                                    str6 = "۠ۡ۟ۢۙۚۧۢۢۧ۟ۥۦۖۗ۬ۦۖۘۦۜۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 655302895:
                    str = "۠۟۬ۛ۠ۡۜۜۚ۫۬ۖۤۥۘۢۚۖۘۢۤۖۘۨۢ۟";
                    str5 = this.mLockOptions.getJID();
                    break;
                case 947127796:
                    this.f1290a = shp.getStringPriv(str3);
                    str = "ۥۙۜ۫ۥۛۙۤۙۜۗۜۡۚۚۢ۬۬۠۫ۖ";
                    break;
                case 1225551971:
                    str = "ۦ۟۬ۧۘۥۘۘۜۥۙ۫ۧۤۜۖ";
                    break;
                case 1432148474:
                    return;
                case 1610354086:
                    str = "ۜۛۡ۟ۘۡۘۨۡۢۜۗۡۘۙ۬ۢۤۜۦۘ";
                    break;
                case 1885126835:
                    str2 = "codepa";
                    str = "ۙۨۛۤۙ۬ۢۘۜۛۗۜۦۘ۫۫ۙ۬ۘۚۧۢۙۦۘ";
                    break;
                case 1945913854:
                    str = "ۗۧۡۛ۟ۘۜۜۤۗۡۥۘۤۛۤ";
                    sb = new StringBuilder();
                    break;
                case 2122242667:
                    sb.append(str5);
                    str = "۬ۡۙۤۦۘۘۜۢۤۛۚ۫ۜۜۧۘۨۛ";
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        View view = null;
        String str = "۫ۚ۬۟ۡۦۘۦۨۦۧۤۨۘۚ۠ۡۘۤۤۚ";
        while (true) {
            switch ((str.hashCode() ^ 997) ^ -370540427) {
                case -1781520875:
                    view.setVisibility(4);
                    str = "ۚ۟ۦۘۨۦۜۜۥۘ۟ۚۤۨۥۜۘۙۚۛۜۥۛۜ۟ۗ";
                    break;
                case -1712671960:
                    super.init("activity_lock");
                    str = "ۧۛۢۡۢ۟ۙۘۙۢۡۢۛۨۥۘۚ۬ۘ۠ۨۜۘۘۜۘ۫";
                    break;
                case -1515202108:
                    Toast.makeText(this, "Set a PIN first!", 0).show();
                    str = "۬ۚۧۧ۠ۥۦۧ۫ۜۦۘ۟ۡ۟ۗۜۗ";
                    break;
                case -1366558308:
                    auth_success();
                    str = "ۨۘ۫۠ۚۖۛۢۡۘۙۦۥۜ۫۫ۧ۠ۤ";
                    break;
                case -1095709062:
                    str = "ۦۢۗۖۥۜۦ۫ۖۨۧۗ۬۬ۘۛ۫ۖۘۚۨ۠ۘۢ";
                    break;
                case -716829427:
                    str = "ۜۡۦۙۢ۠ۦۦۜۨۛۡۙۤۡۘ";
                    break;
                case -652706829:
                    load_lock_values();
                    str = "۬ۨۘۙۤۧ۟۬ۜۘۡۢۢۦۨۡۤۙۜۘ۬ۖۡۛ";
                    break;
                case -571935272:
                    this.f1292c = (ImageView) findViewById(others.getID("imageView", "id"));
                    str = "ۤۛۥۘۤۥۡۘۘۨۚۤۚۨۤۨۤ۠ۤۗ۫ۧۙ";
                    break;
                case -339583523:
                    view = findViewById(others.getID("div2", "id"));
                    str = "۬۠ۨۘ۠ۖۗۜ۟ۚۚۤۤۡۤۜۘۦ۟ۢۚۘۦۖ۬ۦۘۥۚۥۘ";
                    break;
                case -288691367:
                    this.f1294e = (ImageView) findViewById(others.getID("imageView3", "id"));
                    str = "ۡۥۘۘۢۙۨ۟ۡۖۘۛۥ۬۟ۖۘ";
                    break;
                case -160132692:
                    String str2 = "ۘۢۖ۠ۜۚۘۜۙ۫ۘۖۗۤۦۘۙۚۛۤۚۙ۫ۚۜۘۜۖۚ";
                    while (true) {
                        switch (str2.hashCode() ^ -420694724) {
                            case -1972671340:
                                str = "ۖۡۖۘۧۧۧ۟ۨ۫ۤۢۖۖۨ۟ۘ۬۫ۜۨۚ";
                                continue;
                            case -1636710423:
                                str2 = "ۧ۠۟ۚۛۡۨ۠ۡۘۢۦۖۘ۫ۨۜۘۢۚۖۘۡ۠ۜۧۜ۬";
                                break;
                            case -1626015877:
                                if (!check_lock_is_set()) {
                                    str2 = "ۖۗۦۘۧۛۥ۫۠ۥۘۙۡ۫ۘۥۨۘۛۢۦۛۨۡۘۧ۠ۗۥ۟ۗ";
                                    break;
                                } else {
                                    str2 = "۟ۖۨۘ۬ۚۜۚ۟ۤۚۤۜۘۗۥۥ۟ۗۦ";
                                    break;
                                }
                            case 1934145472:
                                str = "ۗۢ۠ۡۨۖۗۗۗ۠ۖۢۧۜۘۥ۟۫ۗۡۘ";
                                continue;
                        }
                    }
                    break;
                case -141356398:
                case 161247890:
                    str = "ۨۘ۫۠ۚۖۛۢۡۘۙۦۥۜ۫۫ۧ۠ۤ";
                    break;
                case -16128480:
                    this.f1295f = (ImageView) findViewById(others.getID("imageView4", "id"));
                    str = "ۘۢۥۘۖ۟ۛۦ۫۬۟ۦۥۘ۬۠ۨۤۗۗۗ۫ۚۛۦۘ";
                    break;
                case 244494048:
                    view.setOnClickListener(new c(this, 14));
                    str = "ۜۜ۬ۖۥۜۧۢ۠ۗ۠ۡۦۚۜۘ۟ۨۥۢۙۥ۠۟ۗ";
                    break;
                case 270871736:
                    return;
                case 671742913:
                    authenticate();
                    str = "ۘ۬ۨۘ۬ۖۦۖۦۘۘۗ۠ۥۘۤۧۛۡۡۡ";
                    break;
                case 1308877150:
                    String str3 = "ۖ۟ۨۘ۟ۚۜۢۜۨۘۨ۬ۜۘۡ۫۟ۚ۟۠۟۬";
                    while (true) {
                        switch (str3.hashCode() ^ 76474441) {
                            case -1360545088:
                                str3 = "ۗۙۖۚۗ۠ۦۗۛۗۥۨ۟ۡ۟ۛۨ";
                                break;
                            case -446799796:
                                if (!this.mLockOptions.getIsChangePass()) {
                                    str3 = "ۧۜۡۘۛۛۤۤۗۡ۠ۦۤۗ۬ۨۘۡۡۢۖۜۖ";
                                    break;
                                } else {
                                    str3 = "ۦ۫ۧۥۜ۬ۢۙۥۢۢۜۘۥۗ";
                                    break;
                                }
                            case 1111196242:
                                str = "ۥۘۗۗۗۛۧ۟ۗۤۥ۬۫ۙۢۚۜ۬۠ۙۨۡۛ۠";
                                continue;
                            case 1341063682:
                                str = "ۙۙۥۧۚۧ۬ۤۘۘۖۛۥ۟ۗۖ";
                                continue;
                        }
                    }
                    break;
                case 1704492283:
                    super.onCreate(bundle);
                    str = "۬ۦۥۘ۠ۨۜۙۘۗ۫ۥۜۘۢۙۘۘۙۤ۟ۡۢۛۛۖۗ";
                    break;
                case 2125532464:
                    this.f1293d = (ImageView) findViewById(others.getID("imageView2", "id"));
                    str = "ۦۖۢۛۙۘ۫ۚۧۤ۠ۤ۠ۤۛ۟ۛ۬۠ۘ";
                    break;
            }
        }
    }

    public void reset_lock() {
        String str = "۟ۢۢ۫ۖۜۚ۟ۢ۫۠ۜۘۥۘۜۘۥۘۡۛۚۥ";
        while (true) {
            switch ((str.hashCode() ^ 351) ^ 569126004) {
                case -1067111480:
                    str = "ۗ۠ۨۘۗۛۖۘۨۘۦۡۦۘۨۡۧۘۘ۠ۦۥۘۥ";
                    break;
                case -978161903:
                    super.reset_lock();
                    str = "ۛۡ۟ۗۙۘۘۤۖۘۚ۬۫۬ۗۘۘۖۖۙ۠ۚۤ۫ۨ۠";
                    break;
                case 636195858:
                    return;
            }
        }
    }
}
