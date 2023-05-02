package com.obwhatsapp.youbasha.colorPicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import j.e;
import j.f;
import j.g;

public class GradientColorsDialog extends Dialog {

    /* renamed from: j  reason: collision with root package name */
    public static final int f973j = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f974a;

    /* renamed from: b  reason: collision with root package name */
    public int f975b;

    /* renamed from: c  reason: collision with root package name */
    public int f976c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f977d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f978e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f979f;

    /* renamed from: g  reason: collision with root package name */
    public RadioGroup f980g;

    /* renamed from: h  reason: collision with root package name */
    public int f981h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f982i = false;

    public GradientColorsDialog(@NonNull Context context, int i2) {
        super(context, i2);
    }

    public GradientColorsDialog(@NonNull Context context, String str) {
        super(context);
        this.f974a = str;
        this.f981h = shp.prefs.getInt(str + "_GCDir", 0);
        this.f975b = shp.prefs.getInt(str, -16777216);
        this.f976c = shp.prefs.getInt(str + "_GC", -16777216);
    }

    public GradientColorsDialog(@NonNull Context context, boolean z2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        super(context, z2, onCancelListener);
    }

    public final void a(boolean z2) {
        String str = "ۥ۟ۢۙۙ۬ۥۧۙۘ۬ۜۘۜۗۦۙۚۘۘۜۙۛ";
        ColorSelectorDialog colorSelectorDialog = null;
        ColorSelectorDialog colorSelectorDialog2 = null;
        ColorSelectorDialog colorSelectorDialog3 = null;
        while (true) {
            switch ((str.hashCode() ^ 381) ^ -744186363) {
                case -2055740797:
                    return;
                case -1763585386:
                    colorSelectorDialog2.show();
                    str = "ۦۤ۠ۗۖۥۥۦۖۘۡۧۛ۟ۗ۟ۥۤۥۖۤ";
                    break;
                case -942724592:
                    str = "ۗۥۖۘۧۦۘ۫۫ۨۘۤ۠ۘۙ۬ۛ";
                    colorSelectorDialog2 = colorSelectorDialog3;
                    break;
                case -667520911:
                    colorSelectorDialog3 = new ColorSelectorDialog(getContext(), new g(this, 0), this.f975b);
                    str = "ۛ۠ۤۙۨۚ۟۟ۦۘ۟ۢۡۧۚۛ";
                    break;
                case -620303703:
                    colorSelectorDialog = new ColorSelectorDialog(getContext(), new g(this, 1), this.f976c);
                    str = "۬ۖۛۚۤۢۚۖۥۘۗۛۛۗ۠ۜ۬ۖ۬ۦۚۚ";
                    break;
                case -333744083:
                    str = "ۡۖۦۛۦۖۨۗۢۢ۫ۢۖۖۦۗۘۖۡۛۚ۟۫ۧ";
                    break;
                case -262943761:
                    String str2 = "ۦ۠ۛ۬ۧۛۧ۠ۖۘۤ۬۟ۡ۫۫";
                    while (true) {
                        switch (str2.hashCode() ^ -1755431488) {
                            case -1807713927:
                                str2 = "ۨۢ۫ۥۗ۬ۗۦۧۘۨۧۗۙۛۘۘ";
                                break;
                            case -1224238109:
                                str = "۟۟ۜۘۜۛۤۡۖۦۚۢۦ۫ۘۦۥ۫ۚ";
                                continue;
                            case 74626097:
                                str = "ۦۨۢۧ۬ۥۘ۠ۖۦۙۦ۫۠۟ۜۥۤۗۚۢ";
                                continue;
                            case 1077690020:
                                if (!z2) {
                                    str2 = "ۜ۠ۡ۫۠ۖۘ۟ۦۖۘۧۖۘۨۗ۟۬۫ۦ";
                                    break;
                                } else {
                                    str2 = "۬۬ۖۙۘۥۘۥۜۛۨۗۛۘ۠ۧۦۗۛۘۥۜۘۗۛۡ";
                                    break;
                                }
                        }
                    }
                    break;
                case 309831886:
                    str = "ۦۚۘۘ۬۟ۦۘ۬۟ۙۜۗۜۖۚۙ۟ۗۨۘۜۤ۟";
                    colorSelectorDialog2 = colorSelectorDialog;
                    break;
                case 357494226:
                    str = "ۥۨۦۘۢۛ۟ۧ۫ۨۘۛ۟۬ۦۨۤۗۗۖ";
                    break;
                case 1182144541:
                    str = "ۦۚۘۘ۬۟ۦۘ۬۟ۙۜۗۜۖۚۙ۟ۗۨۘۜۤ۟";
                    break;
            }
        }
    }

    public final void b() {
        String str = "ۨۢۗ۟ۜۨۙۜ۟ۦۙۚۚۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 428) ^ -1719180986) {
                case -1896447175:
                    this.f977d.setImageDrawable(new ColorDrawable(this.f975b));
                    str = "ۥۥۢۛۥۧۧۥۚ۟ۗ۬۠۫۠ۚۛۥۨۛۨۘۤ۟ۥۘ";
                    break;
                case -940896170:
                    return;
                case -854520010:
                    c();
                    str = "ۤۦۦۘۡۜۤ۬۟ۖۘۡ۟ۘ۫۫۠۟ۥۦۗۢۗ";
                    break;
                case -696612023:
                    str = "۫ۗ۫۠ۦۙ۠۫۬ۨۚۙ۠ۤۥۘۦ۟ۨۘۖۙۘۘۢ۬ۚ";
                    break;
                case -164179431:
                    this.f978e.setImageDrawable(new ColorDrawable(this.f976c));
                    str = "ۨۧۡۘۧۦۘۜۖۡۢۙۧ۟ۢ۫";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r15 = this;
            r14 = 2
            r13 = 1
            r10 = 0
            r2 = 0
            java.lang.String r0 = "ۦۡۖۢۦۘۘۗۡۚۘ۠ۨۘ۟ۥۚ"
            r1 = r2
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r9 = r10
            r8 = r2
        L_0x000e:
            int r2 = r0.hashCode()
            r11 = 327(0x147, float:4.58E-43)
            r12 = 1719056667(0x6676b91b, float:2.9127919E23)
            r2 = r2 ^ r11
            r2 = r2 ^ r12
            switch(r2) {
                case -2130973661: goto L_0x00d0;
                case -2063949861: goto L_0x002f;
                case -1541970012: goto L_0x0020;
                case -1512010658: goto L_0x00f4;
                case -1216645364: goto L_0x00e3;
                case -1089640579: goto L_0x0083;
                case -1070817225: goto L_0x00e8;
                case -963701839: goto L_0x0128;
                case -895215785: goto L_0x001d;
                case -816049104: goto L_0x00cb;
                case -744419257: goto L_0x0128;
                case -681763947: goto L_0x012c;
                case -652312625: goto L_0x0128;
                case -639788467: goto L_0x0128;
                case -348717926: goto L_0x004b;
                case -92861733: goto L_0x0025;
                case 108991291: goto L_0x00dc;
                case 418382410: goto L_0x0067;
                case 431946210: goto L_0x00bf;
                case 787090745: goto L_0x00c4;
                case 830530544: goto L_0x00d7;
                case 1049610297: goto L_0x010f;
                case 1144235762: goto L_0x00a1;
                case 1509134062: goto L_0x0107;
                case 1678910182: goto L_0x00ef;
                case 1788616311: goto L_0x002b;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x000e
        L_0x001d:
            java.lang.String r0 = "۫ۥۥۦۚۥۘۖۦ۬ۜۚۜۗۢ۬۫۠ۚ۫۠ۨۚۙ۠ۚ۬"
            goto L_0x000e
        L_0x0020:
            android.graphics.drawable.GradientDrawable$Orientation r8 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            java.lang.String r0 = "۫ۜۛۗۙۖۘ۫ۢۗۜ۟ۧۨ۫ۚۚۗۨۢۘۘۛۦ۠ۡۘۡۘ"
            goto L_0x000e
        L_0x0025:
            int r2 = r15.f981h
            java.lang.String r0 = "ۤۗۥۘۤۖۦۘۢ۠ۧۦۡۢ۬ۦۗۦۜ"
            r9 = r2
            goto L_0x000e
        L_0x002b:
            java.lang.String r0 = "ۙۜۜۧۙ۬۫ۜۘۢۙۤ۟۟ۘۡۖۤۖۢۚ۬ۖۡ"
            r7 = r8
            goto L_0x000e
        L_0x002f:
            r2 = -476068536(0xffffffffe39fc548, float:-5.894496E21)
            java.lang.String r0 = "ۦۨۦۘۗۨۖۘۥۢۨۙۦۙۖۥۜ"
        L_0x0034:
            int r11 = r0.hashCode()
            r11 = r11 ^ r2
            switch(r11) {
                case -737582098: goto L_0x003d;
                case -221215897: goto L_0x0128;
                case 581261069: goto L_0x0043;
                case 1570899922: goto L_0x0048;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x0034
        L_0x003d:
            java.lang.String r0 = "ۨۜۧۘۚۚۦۙۨۘۘۛۛۧۡ۟ۥۘۖۤۨۘ"
            goto L_0x000e
        L_0x0040:
            java.lang.String r0 = "ۦۨۦۚ۬ۖۧۦ۟۟ۜۥۗ"
            goto L_0x0034
        L_0x0043:
            if (r9 == 0) goto L_0x0040
            java.lang.String r0 = "ۚۗۡۘ۬ۚ۫ۡۤۖۘ۬ۜۦۘ۠ۘۡ۟ۢۗ۬ۚۨۘۢۤۥۘ۠۟ۧ"
            goto L_0x0034
        L_0x0048:
            java.lang.String r0 = "ۢ۬ۧۖۡۜ۫ۘۘۥۤۦۘۦ۠۬۠ۙۨۨۙ۠ۥۥۡۘۢ۟ۤ"
            goto L_0x0034
        L_0x004b:
            r2 = -1166625454(0xffffffffba76b552, float:-9.411174E-4)
            java.lang.String r0 = "ۡۧ۬ۚۙۘ۬۟۫ۧۧ۠ۦۦۙۧ۬ۡۘۜۨۧ۟ۖۢ"
        L_0x0050:
            int r11 = r0.hashCode()
            r11 = r11 ^ r2
            switch(r11) {
                case -1198814756: goto L_0x0064;
                case 559130514: goto L_0x0124;
                case 1464105176: goto L_0x005f;
                case 2025696015: goto L_0x0059;
                default: goto L_0x0058;
            }
        L_0x0058:
            goto L_0x0050
        L_0x0059:
            java.lang.String r0 = "۟۠۟ۚۖۤۘۘۧۘۨۖۢۥۘۘۘۡ۟ۗۧۧۨۘۤۦۚۙۘۨ"
            goto L_0x0050
        L_0x005c:
            java.lang.String r0 = "ۛۛ۟ۥ۫ۥۘۚۚ۠۟ۖۢۜۙ"
            goto L_0x0050
        L_0x005f:
            if (r9 == r13) goto L_0x005c
            java.lang.String r0 = "ۡۜۨۥۗۘۗ۫۫ۜۦۥۘۖۚ۬ۦۨۧۗۗ۟ۖ۬"
            goto L_0x0050
        L_0x0064:
            java.lang.String r0 = "ۢۧ۬ۡۘۤۦۘۥۢۙۗۗۗۢۡۢۦ"
            goto L_0x000e
        L_0x0067:
            r2 = 731670701(0x2b9c68ad, float:1.111352E-12)
            java.lang.String r0 = "ۡۡۚۤۘ۬ۜ۬ۢۜۘۨۧۙ۬ۖۥۥۢۢۗ"
        L_0x006c:
            int r11 = r0.hashCode()
            r11 = r11 ^ r2
            switch(r11) {
                case 238124235: goto L_0x007d;
                case 485275643: goto L_0x0120;
                case 1460781555: goto L_0x0080;
                case 1649700430: goto L_0x0075;
                default: goto L_0x0074;
            }
        L_0x0074:
            goto L_0x006c
        L_0x0075:
            if (r9 == r14) goto L_0x007a
            java.lang.String r0 = "ۛۘۨ۠ۘ۠۬ۡۖۘۧۤۥ۟۟ۦۘ"
            goto L_0x006c
        L_0x007a:
            java.lang.String r0 = "ۚ۠ۜۧ۫ۖۧۗۘۦۙۡۗ۫"
            goto L_0x006c
        L_0x007d:
            java.lang.String r0 = "ۨۨۥۙ۟ۛۗۚ۬ۗۡۗۥۦۘۥ۠ۥ۠ۦۧۘ"
            goto L_0x006c
        L_0x0080:
            java.lang.String r0 = "ۢۡۘ۬ۥۧۥۗۤۡۡۚۘ۠ۦ"
            goto L_0x000e
        L_0x0083:
            r2 = -1220354681(0xffffffffb742dd87, float:-1.1614879E-5)
            java.lang.String r0 = "ۚ۠۬۟۬ۦۦۜۖ۬۬ۛۧ۟ۨۜۥ"
        L_0x0088:
            int r11 = r0.hashCode()
            r11 = r11 ^ r2
            switch(r11) {
                case -2013405812: goto L_0x011c;
                case -1126792916: goto L_0x0097;
                case -295790928: goto L_0x0091;
                case 881927811: goto L_0x009d;
                default: goto L_0x0090;
            }
        L_0x0090:
            goto L_0x0088
        L_0x0091:
            java.lang.String r0 = "ۡ۟۫ۥۜۤۢ۠ۘۚۙ۫ۤۧۙ"
            goto L_0x0088
        L_0x0094:
            java.lang.String r0 = "۟ۖۘۘۧۨۖۘۙۗۦۘۖ۬ۖۧۧۡ"
            goto L_0x0088
        L_0x0097:
            r0 = 3
            if (r9 == r0) goto L_0x0094
            java.lang.String r0 = "ۖۤ۟ۙۢۢۚۜۦۘۗ۟ۖۚ۬ۖ۟ۤۦۨۡۜۘ۫ۦۖ"
            goto L_0x0088
        L_0x009d:
            java.lang.String r0 = "ۙۙۡۙۢۨۤۡ۟ۤۖۤۖۨۚۥۙۘۘ"
            goto L_0x000e
        L_0x00a1:
            r2 = 2115927994(0x7e1e7fba, float:5.2670304E37)
            java.lang.String r0 = "ۥۙۦۤۘ۟ۛ۫ۥۡۡۛ۠ۨۥۤ۫۬ۦۙۨۡ۠"
        L_0x00a6:
            int r11 = r0.hashCode()
            r11 = r11 ^ r2
            switch(r11) {
                case -1919423433: goto L_0x00b5;
                case -1506777372: goto L_0x00af;
                case -995429176: goto L_0x0118;
                case -593410862: goto L_0x00bb;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            goto L_0x00a6
        L_0x00af:
            java.lang.String r0 = "ۖۦۥۘۦۖۖۙۗۧۨ۠ۡۘۦۚۗۘۘۖ"
            goto L_0x00a6
        L_0x00b2:
            java.lang.String r0 = "ۘۡ۠ۡۛۘۘ۠۟ۤۤ۠ۡۛۚۢ"
            goto L_0x00a6
        L_0x00b5:
            r0 = 4
            if (r9 == r0) goto L_0x00b2
            java.lang.String r0 = "ۖۦۗۤ۠ۥ۫ۖۥۡۦۘۘۨۥۤۖۗۨۘۘۙۙۜۙۥۥۘ"
            goto L_0x00a6
        L_0x00bb:
            java.lang.String r0 = "ۖۤۢۖۡۦۨ۬ۜۘۘ۟ۤۗۥۢۘۛ۟"
            goto L_0x000e
        L_0x00bf:
            java.lang.String r0 = "ۦ۬ۜۖۢۥۨۥ۠ۦ۟ۖۘۘۗۘ۟ۦۡ۟۠ۥۢۢۙ"
            r7 = r8
            goto L_0x000e
        L_0x00c4:
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT
            java.lang.String r0 = "ۙۗۗۢۗۦۘۦۛۢۥۜۛۚۤۤۘۨ۠ۢۚۨ۟۟۠۫ۢ۠"
            r6 = r2
            goto L_0x000e
        L_0x00cb:
            java.lang.String r0 = "ۗۗ۠ۗ۠۠ۨۚۨۗ۬ۘ۟۫ۘۦۚۦۘۡ۠ۚ"
            r7 = r6
            goto L_0x000e
        L_0x00d0:
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP
            java.lang.String r0 = "ۛ۠ۗۜۨۘ۫۫ۡۛۡۦۢۧۡ۟ۨۘ"
            r5 = r2
            goto L_0x000e
        L_0x00d7:
            java.lang.String r0 = "ۥۥۖۢۦۜۘۧۨۖۘۧۛۥۖۧۜ"
            r7 = r5
            goto L_0x000e
        L_0x00dc:
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.TR_BL
            java.lang.String r0 = "ۜۧۜۘۨ۠۬ۨۘ۫ۡۛ۟ۥ۟ۡۦۥۗ۫ۡ۬ۢۜۘ"
            r4 = r2
            goto L_0x000e
        L_0x00e3:
            java.lang.String r0 = "۟ۜۙۗۧۖۡ۫۫ۥۡۛ۫ۡۘۘۥۛ۬ۚ۟ۘ"
            r7 = r4
            goto L_0x000e
        L_0x00e8:
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            java.lang.String r0 = "ۚۤۙۡۜۜ۠ۡۘۥۘ۬۠ۨۘۡۜ۠ۡۙ۬۬ۙۜۥۛ"
            r3 = r2
            goto L_0x000e
        L_0x00ef:
            java.lang.String r0 = "۠ۗ۠ۦ۬ۦۦۡ۟ۧۗۥۗ۬ۧ۫ۡۤۜۘۦۘۙ۠ۗۥۘۧۘ"
            r7 = r3
            goto L_0x000e
        L_0x00f4:
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            int[] r0 = new int[r14]
            int r2 = r15.f975b
            r0[r10] = r2
            int r2 = r15.f976c
            r0[r13] = r2
            r1.<init>(r7, r0)
            java.lang.String r0 = "ۜۢۦۘۡۧۙۨۘۖۗ۬ۢۘۗ۬ۨۜۦۛۗۨۗۘۘ"
            goto L_0x000e
        L_0x0107:
            r0 = 0
            r1.setCornerRadius(r0)
            java.lang.String r0 = "ۗۦۜۘۙۚۦۡۥۥۘۚ۬ۦۡۜۦۘ۬ۛۦۘۜۚ۟ۙۨۦ۠۠۬"
            goto L_0x000e
        L_0x010f:
            android.widget.ImageView r0 = r15.f979f
            r0.setImageDrawable(r1)
            java.lang.String r0 = "ۖۖ۫ۤ۫ۡۘۢۙۧۧۛۘ۫ۛۥۘۡۛ۠۟۫ۛ"
            goto L_0x000e
        L_0x0118:
            java.lang.String r0 = "۫۟ۜۦۦ۬۫ۗۚۧۗۡۘۦۨۘ"
            goto L_0x000e
        L_0x011c:
            java.lang.String r0 = "ۙ۫ۖۤۚ۠ۘۧۧ۟ۚ۫ۜۛۜ"
            goto L_0x000e
        L_0x0120:
            java.lang.String r0 = "ۚۛۙۢۗۦۘۧ۫ۘۘۢ۠ۦۘۛۧۢۦۚ۠۠ۡۦۘۗ۟ۨۘ۟ۨۤ"
            goto L_0x000e
        L_0x0124:
            java.lang.String r0 = "ۜ۟۬ۛۘۘۛۚۡۘۛۜۖ۠۬ۦۘ"
            goto L_0x000e
        L_0x0128:
            java.lang.String r0 = "۠ۗ۠ۦ۬ۦۦۡ۟ۧۗۥۗ۬ۧ۫ۡۤۜۘۦۘۙ۠ۗۥۘۧۘ"
            goto L_0x000e
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.colorPicker.GradientColorsDialog.c():void");
    }

    public boolean isChanged() {
        String str = "ۘۡۗۖ۬۫ۡۘ۠ۖۜۙۨۛۡۤ۟۫ۦۤ۟";
        while (true) {
            switch ((str.hashCode() ^ 529) ^ 2054759314) {
                case -1996692448:
                    return this.f982i;
                case 513351437:
                    str = "ۜۜۡ۠ۧۨۘۦۜۢۢۢۘۤۤۧ";
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str = "ۤۙ۟۟ۡۥۘۘۡۖۢۥۡۘۛۢۥۜۧ۫۟ۡۥۘ";
        RadioGroup radioGroup = null;
        while (true) {
            switch ((str.hashCode() ^ 990) ^ -1753184861) {
                case -1911074765:
                    this.f979f = (ImageView) findViewById(yo.getID("flag3", "id"));
                    str = "ۤۨۥۘۤۦۨۘۚۘۘ۫۫ۜ۬ۘۥۡۜۨۘ";
                    break;
                case -1820997791:
                    super.onCreate(bundle);
                    str = "ۤۡۙۥۦ۫ۘ۬۬ۨۧۖۛ۟۬";
                    break;
                case -1700853794:
                    this.f978e = (ImageView) findViewById(yo.getID("flag2", "id"));
                    str = "ۗ۠ۚۦۗۜۘ۟ۘۜۘ۟ۡ۬ۛۨۚۨ۟ۛۢ۟ۡ";
                    break;
                case -1488643289:
                    findViewById(yo.getID("div2", "id")).setOnClickListener(new e(this, 1));
                    str = "۟ۜۗۦۡۖۥ۬۬ۡۧۘ۬ۤۚۡۛ۫";
                    break;
                case -988922024:
                    radioGroup.setOnCheckedChangeListener(new f(this, 0));
                    str = "ۗۘۥۨ۬ۖۘۘ۬ۨ۟ۛۘ۬۬۠ۦۚ۬ۜۦۚۤۤۘۜۗۛ";
                    break;
                case -891633050:
                    setContentView(((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(others.getID("color_gradientdialog", "layout"), (ViewGroup) null));
                    str = "۠ۗۚۘۗۧ۠ۘۦ۫ۚۜ۬ۖۧ۟ۤ۫ۘۘۖ";
                    break;
                case -886473790:
                    str = "ۙۦۛۛ۠ۥۨۦۚۡۦۧۖۢۤۚۘ۬۬ۜ۠۠ۘۘ";
                    break;
                case -577313340:
                    b();
                    str = "۟ۚۚۗۡۡۨۥ۠ۨۡۗۖ۬۫ۖۙ۫ۜۖۜۚۙۖۘ";
                    break;
                case -295444340:
                    this.f980g = radioGroup;
                    str = "۟ۚۚۥ۠ۥۘۨۦۙۗۙۡ۠۬ۡۘۢ۟۬۫ۙۘۘۙ۫۠";
                    break;
                case -163603485:
                    str = "ۤۖۜۘۖۧۨ۠ۤۖۘۛۢۦۘۥۜۥۘۧۛۨۧۚۦۛ۬ۚۧ۬ۙ";
                    break;
                case 183869995:
                    findViewById(yo.getID("div", "id")).setOnClickListener(new e(this, 0));
                    str = "ۚ۫۬ۚ۟ۗۜۤ۠۟۬ۛۘۨۜۘۛۦۘ۬ۦۙۘۗۤ";
                    break;
                case 208520116:
                    this.f977d = (ImageView) findViewById(yo.getID("flag", "id"));
                    str = "ۗۙۙ۟۠ۡۘۤ۬ۙۖۡ۟ۡۜۢۥۚۜۥۖ";
                    break;
                case 211986304:
                    ((Button) findViewById(yo.getID("ok", "id"))).setOnClickListener(new e(this, 2));
                    str = "ۜۖۥۘۡ۫ۘۧۥۚۡۗۡۧۢ۠ۘ۫ۜۧۛ۟";
                    break;
                case 837020386:
                    return;
                case 1248100074:
                    str = "ۘۛۥۜۥۙۦۨۖۨۥ۠ۡۥۖۘ۠ۘۢۛۥۡۘ۟۫ۨۘ۟ۢۘ";
                    radioGroup = (RadioGroup) findViewById(yo.getID("rGroup", "id"));
                    break;
                case 1649411776:
                    ((RadioButton) this.f980g.getChildAt(this.f981h)).setChecked(true);
                    str = "ۤ۬۠ۤۗۡۘۨۤ۟ۜۤۦ۠ۥۡ";
                    break;
            }
        }
    }
}
