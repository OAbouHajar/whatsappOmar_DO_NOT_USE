package com.obwhatsapp.yo;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarPreference extends Preference implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public int f563a;

    /* renamed from: b  reason: collision with root package name */
    public int f564b;

    /* renamed from: c  reason: collision with root package name */
    public int f565c;

    /* renamed from: d  reason: collision with root package name */
    public int f566d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f567e;

    /* renamed from: f  reason: collision with root package name */
    public String f568f;

    /* renamed from: g  reason: collision with root package name */
    public String f569g;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    @TargetApi(21)
    public SeekBarPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2, i2);
        a(attributeSet);
    }

    @TargetApi(21)
    public SeekBarPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        a(attributeSet);
    }

    public final void a(AttributeSet attributeSet) {
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = "ۖۙۜۘ۬ۧۡ۟ۥ۬ۘۤ۟ۙۙۨۘۙۢ۫";
        while (true) {
            switch ((str11.hashCode() ^ 944) ^ -892701157) {
                case -2065949852:
                    String str12 = "۟۠۠ۦۡۨۗۛۨۘۗۦۤ۫ۡۙ۫۬ۙۦۤۛ";
                    while (true) {
                        switch (str12.hashCode() ^ -1126197537) {
                            case -243672578:
                                str12 = "ۤۤۨۘۡۙ۠ۦۢۦۜۖۙۛ۠ۤۛۛ۫ۤۗۘۙۤ";
                                break;
                            case -186826454:
                                if (str5 != null) {
                                    str12 = "ۨۗۜۨۦۦۨ۬ۜۘۜۚۨۘۥ۬ۜۗۦۖ";
                                    break;
                                } else {
                                    str12 = "ۧۚۢۥۡۡۘۨ۫ۥۤۗۦ۟ۢ۬ۖ۫ۙۛۚۖۘۢۚۨ";
                                    break;
                                }
                            case -105449176:
                                str11 = "ۖۦۥ۟ۜۡۜۙۖۘۡۥۘۖۗۘۘۢۙۘ";
                                continue;
                            case 922576164:
                                str11 = "ۤۥۨۦ۠ۚۤۦۢ۬ۦ۟ۦۡۖۥۖۘۘۡ۟۫ۘۚۖۘ";
                                continue;
                        }
                    }
                    break;
                case -2033720495:
                    str11 = "ۖ۟ۙۡۡۧۘۘۦۡۘۖۡۢۦۦۢۥ۠ۘۙ۫ۖۘۤۥۖۘ";
                    str4 = str3;
                    break;
                case -1956681746:
                    return;
                case -1882614298:
                    str = attributeSet.getAttributeValue("http://robobunny.com", "unitsLeft");
                    str11 = "۠ۛۙ۠ۖۖۙۡ۟۟ۘۘۘۘۛ۠۬ۥ۬۟ۖۦ۬ۚۘۚ۟ۗ";
                    break;
                case -1874224136:
                    str2 = "";
                    str11 = "ۙۡۚۖۥۘۘ۫ۥۗۦۦۨۡ۠ۦۢۙۜۤۘۖۘۖۢ۫";
                    break;
                case -1310137167:
                    str11 = "ۨۖۧۘۗۧۗ۠ۚۨۘۚۙۧۥۘۨ";
                    str7 = str2;
                    break;
                case -1244647700:
                    str11 = "ۛۙۙۡۢ۠ۡۢۚ۫۠ۜۘۢۢۤ۠ۘۡۘ۫ۧۚ";
                    str9 = str8;
                    break;
                case -1208618552:
                    this.f568f = str4;
                    str11 = "۫۟ۚۖۜ۫ۢۛۛۖۦ۫ۦۘ۟";
                    break;
                case -1187782659:
                    str11 = "ۖۗۡۛۦۛۨۚۜۘۥۗۥۘۢ۬ۙ";
                    break;
                case -392909071:
                    String str13 = "ۧۢۚۦ۬ۥۜ۬ۧۙۦۗۗ۫ۤۦ۟ۧۖۤ۬ۢۢ";
                    while (true) {
                        switch (str13.hashCode() ^ 1777254903) {
                            case -1987180262:
                                if (str != null) {
                                    str13 = "ۨۧۧۖۙۜۥۙۘۘۜ۠ۡۖۛۜۘۧۛۗ";
                                    break;
                                } else {
                                    str13 = "۠ۦۜ۟ۘۥۘۢۤۙۗۨ۠۬ۙۛ۠۟ۡۘ۫ۦۡۘ";
                                    break;
                                }
                            case -1957398755:
                                str11 = "ۖ۟ۙۡۡۧۘۘۦۡۘۖۡۢۦۦۢۥ۠ۘۙ۫ۖۘۤۥۖۘ";
                                continue;
                            case -243766709:
                                str13 = "ۙۧۖۘۖ۟ۗۨۜۘۖ۟ۢۤۖ۠ۙۢۡۖ۫";
                                break;
                            case 1332039333:
                                str11 = "ۧ۬ۘۙۗۘۧۡۘ۬۠ۦۘۗۖۖۘۛۨ۠ۖۨۗۛۦۨۥۗۨۘ";
                                continue;
                        }
                    }
                    break;
                case -166207791:
                    setMin(this.f565c);
                    str11 = "ۥۧۜۘۘۢۧۜ۫ۚۘۤ۠ۜۢۥۘۥۥۦ";
                    break;
                case 52378778:
                    String str14 = "ۛۛۧ۟ۡۖۘ۠ۛۥۘۙۙۧۘۤۤۘۛۤۤۘۙۧۤ";
                    while (true) {
                        switch (str14.hashCode() ^ -1069765309) {
                            case -668080248:
                                if (str8 != null) {
                                    str14 = "ۜ۫ۜۢۧۨۘۡۦۧۘۚۡۘۡۗۡ۬ۡۜۘۦۜۗ۠۠";
                                    break;
                                } else {
                                    str14 = "۠ۚۚۖۤۘۘ۠۠ۖۘۨۛۡۢۚۖۘۡۗ۟۬ۥۨۡ۟ۧۧۤ";
                                    break;
                                }
                            case -377706965:
                                str14 = "ۜ۠ۦۘۜۖۘۚۙۛۜۖۧۘۧۛ";
                                break;
                            case 441005808:
                                str11 = "ۥۜ۫ۦ۬ۧۥۙ۟ۧۛۜۘۡ۠ۦۘۨ۠ۨۘۤۥۦ۬ۡ۠ۥۡ";
                                continue;
                            case 1979749821:
                                str11 = "ۢ۫ۙ۫ۥۡۜۨۨۘۖۨۚۡۘۡۘۥ۠ۛۘۚۖۘۦۨ۫ۡۙۧ";
                                continue;
                        }
                    }
                    break;
                case 75319302:
                    setMax(this.f564b);
                    str11 = "ۖۜۖۨۖۧۨ۟ۚۗۨ۟۟ۥ";
                    break;
                case 102036149:
                    str8 = attributeSet.getAttributeValue("http://robobunny.com", "unitsRight");
                    str11 = "۬ۧۖۛۦۦۤۢۗۧۗۙ۫۬ۥۘۙۗۛ۟۫ۨۖۢۖۘ";
                    break;
                case 156710071:
                    this.f569g = str10;
                    str11 = "ۗۤۦۘۚۨۧ۠ۜۙۗۛ۫ۧۧۤۖۚ۬۟ۖ۬";
                    break;
                case 356559726:
                    str11 = "ۨۥۧۘۥۜ۟۠ۨۦۘۛۤۤ۠ۘۘۡۘ۬";
                    break;
                case 408416756:
                    str11 = "ۧۦۦۘۡۤۗ۟ۖۨۛ۬ۗۤۚۖۨۦۤۧۥۚ";
                    break;
                case 501200692:
                    str11 = "ۧۨ۫ۧۘۧۨۙ۟ۛۖۛۖۜۦۢۜۖ";
                    str4 = str;
                    break;
                case 747600738:
                    str11 = "ۛۗۜ۟ۧ۬ۡۨۦۨ۟ۗ";
                    str10 = str7;
                    break;
                case 834057694:
                    str5 = attributeSet.getAttributeValue("http://robobunny.com", "units");
                    str11 = "۟ۡۜۘۥ۠ۧۚۢۗۤۨۗۖۧۡۘۢۛۢۛۢۦۗۚۢ";
                    break;
                case 901558330:
                    str11 = "ۨۥۧۘۥۜ۟۠ۨۦۘۛۤۤ۠ۘۘۡۘ۬";
                    str10 = str9;
                    break;
                case 955727861:
                    str11 = "ۧۦۦۘۡۤۗ۟ۖۨۛ۬ۗۤۚۖۨۦۤۧۥۚ";
                    str7 = str6;
                    break;
                case 1312313205:
                    str11 = "ۚ۟ۧۜۦۗۦۜۘۤۥۤۡۡۡۡۨۧۚۥۗۙۥۥۘۤۚ";
                    break;
                case 1317824260:
                    str3 = "";
                    str11 = "ۧۜۧۘۚۙۛۜۖۡۦۜۡۘ۫ۥۖۘ";
                    break;
                case 1562862405:
                    this.f566d = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "defaultValue", 0);
                    str11 = "ۧۖۘۘ۠ۛۛۧۤۙۛۡۥۘۤ۟ۥۘۛۗۛ";
                    break;
                case 1709454183:
                    this.f564b = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "max", 100);
                    str11 = "ۜۨۥۘ۬۬ۛ۬۠ۙۤۦۘۚ۠ۥۘ";
                    break;
                case 1858987757:
                    this.f565c = attributeSet.getAttributeIntValue("http://robobunny.com", "min", 0);
                    str11 = "۠ۢۗۘۢ۬ۡۛۛ۫ۧۡۢۛۖۜۦۖۧۘ۠ۧۛۤۤۙۤ";
                    break;
                case 2126544232:
                    str11 = "۬۠۬ۙۚۚۛۦۖۡۜۚۛ۬ۘۘۗۙ۠ۖۜۢۡۗۘ";
                    str6 = str5;
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.widget.SeekBar r12) {
        /*
            r11 = this;
            r2 = 0
            java.lang.String r0 = "۬ۜۖ۬ۥۗۙۦۖ۫ۙۨۖۜۧۘۢۦۤۚ۠"
            r1 = r2
            r4 = r2
            r3 = r2
            r6 = r2
            r5 = r2
            r7 = r2
            r8 = r2
        L_0x000a:
            int r2 = r0.hashCode()
            r9 = 519(0x207, float:7.27E-43)
            r10 = -1255599026(0xffffffffb529144e, float:-6.2986953E-7)
            r2 = r2 ^ r9
            r2 = r2 ^ r10
            switch(r2) {
                case -1725973906: goto L_0x0095;
                case -1578030304: goto L_0x00a5;
                case -1558573480: goto L_0x00ef;
                case -1462305622: goto L_0x0074;
                case -1378248030: goto L_0x010d;
                case -1351672214: goto L_0x0070;
                case -1052505989: goto L_0x001f;
                case -736712237: goto L_0x00f5;
                case -664101528: goto L_0x001c;
                case -523998049: goto L_0x0047;
                case -474333073: goto L_0x0090;
                case 240298734: goto L_0x009a;
                case 277417785: goto L_0x00a0;
                case 329559642: goto L_0x00c6;
                case 395531351: goto L_0x00fc;
                case 466883663: goto L_0x0019;
                case 523761990: goto L_0x00d0;
                case 779647912: goto L_0x00cb;
                case 1545587745: goto L_0x0026;
                case 1772534577: goto L_0x0034;
                case 2064784071: goto L_0x006b;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x000a
        L_0x0019:
            java.lang.String r0 = "ۨ۠ۘۡۦۘۘۚۚۜۘۦ۠ۜۘۚۛۗ۠ۢۘۘ"
            goto L_0x000a
        L_0x001c:
            java.lang.String r0 = "۟ۙۘۙۙۗۥۤۘۘ۫ۥۢ۠ۛ۟ۧۡ۠"
            goto L_0x000a
        L_0x001f:
            int r8 = r12.getProgress()
            java.lang.String r0 = "ۦۥۧۦۥۡۗۘۘۢۘۘۘۗۙۤۧ۠"
            goto L_0x000a
        L_0x0026:
            r2 = 707523207(0x2a2bf287, float:1.5271995E-13)
            java.lang.String r0 = "ۢۧۙۡ۠۠ۙ۠ۨۘۖۦۨ۬ۡۜۘ"
        L_0x002b:
            int r9 = r0.hashCode()
            r9 = r9 ^ r2
            switch(r9) {
                case -1916182964: goto L_0x0044;
                case -1726794456: goto L_0x0041;
                case -1510078462: goto L_0x003a;
                case 696082454: goto L_0x0034;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x002b
        L_0x0034:
            java.lang.String r0 = "۬ۤۜۘۗۥۢۡۨۢۜۦۘۜۤۗۥۨۙ۠ۦ۟ۖۜۘۤۥۡۘ"
            goto L_0x000a
        L_0x0037:
            java.lang.String r0 = "ۧۢۦۘۢۧۘۥۨۜۡۖۜۘۙۦ"
            goto L_0x002b
        L_0x003a:
            int r0 = r11.f563a
            if (r8 == r0) goto L_0x0037
            java.lang.String r0 = "۫ۜۥۧۤۖۘۧۨ۟ۢۤۥ۫ۦۥۘۚ۟ۙۗ۫ۙ۠ۨۨۘ"
            goto L_0x002b
        L_0x0041:
            java.lang.String r0 = "ۙۤۖۤۙۙۗۘۥ۬ۤۙۡ۟ۡۘ"
            goto L_0x002b
        L_0x0044:
            java.lang.String r0 = "۬ۙ۫ۥۙۥۘۥ۬ۥۘ۟ۙ۠ۥۗ۬ۧۡۡۗۨۧۡۥۨۘ"
            goto L_0x000a
        L_0x0047:
            r2 = 34871977(0x2141aa9, float:1.0880974E-37)
            java.lang.String r0 = "ۦۛ۫ۛۥۥۘۜۚۤ۟ۛۥۘ۟ۡۢۢ۠ۡۜۡ۟ۘ۬"
        L_0x004c:
            int r9 = r0.hashCode()
            r9 = r9 ^ r2
            switch(r9) {
                case -1679030531: goto L_0x0055;
                case 1610562430: goto L_0x0109;
                case 1700189568: goto L_0x005b;
                case 1838802479: goto L_0x0068;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x004c
        L_0x0055:
            java.lang.String r0 = "ۛ۬ۥۡۛ۫۠ۗۦۜۨۛۧۥ۫ۚ۠ۜ"
            goto L_0x004c
        L_0x0058:
            java.lang.String r0 = "۠۠۠ۛۦۖۤ۫ۥۖۤۚ۟ۡۜۘ"
            goto L_0x004c
        L_0x005b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            boolean r0 = r11.callChangeListener(r0)
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = "۠ۜۜۘۡۨۡۦۛۥۙۙۛۜۚۥ۬ۗ۟ۦ۠ۘۘ"
            goto L_0x004c
        L_0x0068:
            java.lang.String r0 = "ۡۡ۫۟۫ۡۘۢۖۚۜۨۢ۬۬ۥۖۜۛ"
            goto L_0x000a
        L_0x006b:
            int r7 = r11.f564b
            java.lang.String r0 = "ۡۡ۬ۚۦ۬۬ۢۧ۫ۧۡ۟ۘۙۙۥۧ"
            goto L_0x000a
        L_0x0070:
            java.lang.String r0 = "ۨۤۜۨۢ۠ۦۙOۤۖۚ۫ۧۤ۫ۜ۟ۨۙۨ۟ۥۨ"
            r5 = r8
            goto L_0x000a
        L_0x0074:
            r2 = -1840593831(0xffffffff924ac459, float:-6.398198E-28)
            java.lang.String r0 = "ۗۗ۫ۤۙۖ۠ۚۢ۠۬۬ۙۜۖ۟ۙۡۨۜۗۤۨۗ"
        L_0x0079:
            int r9 = r0.hashCode()
            r9 = r9 ^ r2
            switch(r9) {
                case -1481992512: goto L_0x008d;
                case -1176532439: goto L_0x0105;
                case 302864107: goto L_0x0088;
                case 625265155: goto L_0x0082;
                default: goto L_0x0081;
            }
        L_0x0081:
            goto L_0x0079
        L_0x0082:
            java.lang.String r0 = "۬ۢۥۘۤۘۖۘۗ۫ۜۘۢۥۥۙۧۡ۬ۚۚۛۥۜ"
            goto L_0x000a
        L_0x0085:
            java.lang.String r0 = "ۡ۠ۡۤۥۘۘۘۢۨۘۤۛۧۤۨۜ۟ۘۦۘ"
            goto L_0x0079
        L_0x0088:
            if (r8 <= r7) goto L_0x0085
            java.lang.String r0 = "ۘۜۡۘۥ۫۫ۨ۫۬ۙۥۡۧۦۘۧۥۚ"
            goto L_0x0079
        L_0x008d:
            java.lang.String r0 = "۟ۡۗۥۙۨOۢۜۧۘۧۜ۟ۖۨۛ"
            goto L_0x0079
        L_0x0090:
            java.lang.String r0 = "۟ۗۚۦۖۤۜۨ۫ۡۡۘۗۛۨۜۛۖۖۡۦۥۘۚۨۥ"
            r6 = r7
            goto L_0x000a
        L_0x0095:
            java.lang.String r0 = "ۖۢ۟ۦۚۚ۬۫ۛۙۜۚۛۢۦۘ"
            r5 = r6
            goto L_0x000a
        L_0x009a:
            int r3 = r11.f565c
            java.lang.String r0 = "ۙۤ۠۠ۨۙۨۨۘ۠ۡۥۘۖ۟ۛۛۧۘۘ۫ۨ۬ۗۧۡ"
            goto L_0x000a
        L_0x00a0:
            java.lang.String r0 = "ۢ۟ۦۘ۬ۨ۟ۨۖۙ۫ۙ۫۫ۖۘۧۦۦ۟ۦۖۘ۠ۛۛۦۨۨۘ"
            r4 = r5
            goto L_0x000a
        L_0x00a5:
            r2 = -123790491(0xfffffffff89f1b65, float:-2.5816588E34)
            java.lang.String r0 = "۟ۘۖۘۨۖۜۘۚۘۖۡۥ۫ۜۦۖ۫ۖۚ"
        L_0x00aa:
            int r9 = r0.hashCode()
            r9 = r9 ^ r2
            switch(r9) {
                case -1661139022: goto L_0x00ba;
                case -1401406638: goto L_0x00b3;
                case -301867046: goto L_0x00c2;
                case 979721423: goto L_0x00bf;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            goto L_0x00aa
        L_0x00b3:
            java.lang.String r0 = "ۦۘۖۘۘۦۖۘۦۖ۫ۛۚ۠۫ۛۤ۟ۦ۟۫ۥۜ۬ۥۙ۠ۜۗ"
            goto L_0x000a
        L_0x00b7:
            java.lang.String r0 = "ۥ۬۬ۛ۬ۥۘۦ۬۟ۗۤۛۧ۬ۢۥ۬ۥۘۛۘۡۤۙ۠ۘۡ۠"
            goto L_0x00aa
        L_0x00ba:
            if (r5 >= r3) goto L_0x00b7
            java.lang.String r0 = "ۡۧ۠ۢۘۥۘۜۖۥۘ۫۫ۨۘۘۨ۫ۘۛۛۧۢۢ"
            goto L_0x00aa
        L_0x00bf:
            java.lang.String r0 = "۟۫۟۫ۧۜۘۖۖۜۚ۬ۨۦۨۡۗۤۚۙۙۖۘۥ۟ۨۘ"
            goto L_0x00aa
        L_0x00c2:
            java.lang.String r0 = "ۙۨۦ۫ۦۘۛۙۖ۟۬ۤۡۘۖۘۗۡۛ"
            goto L_0x000a
        L_0x00c6:
            java.lang.String r0 = "ۚۘۗۧۗۗۖ۟ۡ۠ۙ۠۠ۘۛۛۧۡۙۜۜۘۚۜۗ۠ۚۢ"
            r1 = r3
            goto L_0x000a
        L_0x00cb:
            java.lang.String r0 = "ۦۘۖۘۘۦۖۘۦۖ۫ۛۚ۠۫ۛۤ۟ۦ۟۫ۥۜ۬ۥۙ۠ۜۗ"
            r4 = r1
            goto L_0x000a
        L_0x00d0:
            r2 = -645450264(0xffffffffd98735e8, float:-4.7572991E15)
            java.lang.String r0 = "ۛۦۥۘۖۤۡۨۜۥۘ۬ۦۖۥۧۛۢۛۦۡۗ"
        L_0x00d5:
            int r9 = r0.hashCode()
            r9 = r9 ^ r2
            switch(r9) {
                case -1807994981: goto L_0x0034;
                case -336049388: goto L_0x00ec;
                case 1026514174: goto L_0x00de;
                case 1145797858: goto L_0x00e5;
                default: goto L_0x00dd;
            }
        L_0x00dd:
            goto L_0x00d5
        L_0x00de:
            java.lang.String r0 = "ۡۘۘۖۧ۠ۡۦۘۘۙۢۜ۬ۖۡۨۦۜۘ"
            goto L_0x000a
        L_0x00e2:
            java.lang.String r0 = "۫ۗۡ۠ۢۥۘۥۖۧ۫ۖۧۘ۠ۙۤۡ۬ۥۡۢ۫"
            goto L_0x00d5
        L_0x00e5:
            int r0 = r11.f563a
            if (r4 == r0) goto L_0x00e2
            java.lang.String r0 = "ۛۨۥۗ۬۬ۤۗۙۛۨۥۡۙ۠۫ۙ۠ۡۢۘۘ"
            goto L_0x00d5
        L_0x00ec:
            java.lang.String r0 = "ۜۗۜۘۢۘۨۘۥۨ۠ۥۢۖ۠۟ۡۘۙۛۧ"
            goto L_0x00d5
        L_0x00ef:
            r11.f563a = r4
            java.lang.String r0 = "۟ۦۤ۬۫ۨۜۗۖۘۤ۠ۨ۟۠ۢۚۜۤۤۧۚۤۢۖ۬ۡ"
            goto L_0x000a
        L_0x00f5:
            r11.persistInt(r4)
            java.lang.String r0 = "ۚۘ۠ۤۥۨۡۦۨۘۧ۠ۖۙۛۧۛۡ۠"
            goto L_0x000a
        L_0x00fc:
            int r0 = r11.f563a
            r12.setProgress(r0)
            java.lang.String r0 = "۬ۤۜۘۗۥۢۡۨۢۜۦۘۜۤۗۥۨۙ۠ۦ۟ۖۜۘۤۥۡۘ"
            goto L_0x000a
        L_0x0105:
            java.lang.String r0 = "ۖۢ۟ۦۚۚ۬۫ۛۙۜۚۛۢۦۘ"
            goto L_0x000a
        L_0x0109:
            java.lang.String r0 = "ۥۙۘۧ۫ۗۜۚۨۘ۬ۢۤۗ۫ۢۦۧ۟۬ۥۘ"
            goto L_0x000a
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.SeekBarPreference.b(android.widget.SeekBar):void");
    }

    public final void c(View view) {
        TextView textView = null;
        String str = "ۛۧۦۘ۟۬ۚۧۤۛۗۚۗۨۖۡۙۡۘ۬۫ۚۖۗۜ";
        while (true) {
            switch ((str.hashCode() ^ 3) ^ 1481615893) {
                case -1020647597:
                    textView.setText(String.valueOf(this.f563a));
                    str = "۬ۛ۫ۢۥۧۘۙۨ۬ۛ۠ۗ۠ۜۦ";
                    break;
                case 668793081:
                    String str2 = "ۛۤ۟ۢۤ۬ۖۢۛۜۨۢ۠ۤۚۥ۟";
                    while (true) {
                        switch (str2.hashCode() ^ 615276732) {
                            case -1743127959:
                                if (textView == null) {
                                    str2 = "ۗۙۧۜۥۦۙۘۛۡۥۚۤۗۥۥۗۙۗۡ۫";
                                    break;
                                } else {
                                    str2 = "ۖۧۨۘۥ۠ۦ۫ۧۛۚۖۤ۫ۥۦۘ";
                                    break;
                                }
                            case -1036432378:
                                str = "۬ۛ۫ۢۥۧۘۙۨ۬ۛ۠ۗ۠ۜۦ";
                                continue;
                            case 152575587:
                                str2 = "۬ۦۧۦۦۨۢۦۖۥۘۗۗۖۗۢ۬ۗۚ۬ۘ";
                                break;
                            case 204049496:
                                str = "ۙ۬ۖۨۘ۬۫ۘۗۚۥۢۘۘۤۘۜۘ۬ۙۖۘ";
                                continue;
                        }
                    }
                    break;
                case 1098644307:
                    return;
                case 1391144976:
                    str = "ۦۨۛۦ۠ۜۧۘۙۚۨۘۖ۬۫ۗۚۜ";
                    textView = (TextView) view.findViewById(yo.getID("seekBarPrefValue", "id"));
                    break;
                case 2008926061:
                    str = "ۥۘ۠ۛۦۧۘۧۤۥۘ۟ۗۦۡۘ۫ۗۢ۠ۗۘۖۘۤ۫۟۠ۢۧ";
                    break;
                case 2075994996:
                    str = "۠ۧۧ۬ۗۧۢۚۖۘ۬ۜۛۖۖۦۡ۟ۚۘۥۘۜۦۥ";
                    break;
            }
        }
    }

    public int getProgress() {
        String str = "ۥۢ۬ۤۡۡۤۤۘۨۡ۟ۜ۟ۦۙۨ";
        while (true) {
            switch ((str.hashCode() ^ 303) ^ -1019184925) {
                case -933604445:
                    str = "ۙۦۗۚ۠ۨۘ۠ۥۘۘۡۢۜۘۘ۫ۢۡۡۚۨۜۘۡۥۦۖۥۨۘ";
                    break;
                case 810816166:
                    return this.f563a;
            }
        }
    }

    public int getdef() {
        String str = "ۛۜۥ۠۫ۘۜ۠ۦۡ۬ۗۛۚۜۥۜۘۘۦۜۡۚۧۡۘۦۜ۬";
        while (true) {
            switch ((str.hashCode() ^ 725) ^ 1934141552) {
                case -1165323395:
                    return this.f566d;
                case 511365709:
                    str = "ۘ۟ۡۙ۬ۜۛۜۦۛۥۥۘ۠ۗۤۧۛۛۜۙۢ";
                    break;
            }
        }
    }

    public void onBindView(View view) {
        SeekBar seekBar = null;
        String str = "ۚۡ۠ۡۚۥۘ۫ۡۡۧ۠ۡۧۘۘۘۙۦۦۘۛۚۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 705) ^ -143636106) {
                case -2002695678:
                    return;
                case -1399738383:
                    super.onBindView(view);
                    str = "۠ۥ۬ۗۖ۬ۗۢ۟ۛۡۡۛۥۘ۟ۡۘۘۦۢۗ۫۬ۜۘۦۥۦۘ";
                    break;
                case -1335316559:
                    str = "ۛۙۨۘۨ۫ۚۤ۠ۧۤۘۥۘۖۡۥۖۤۘۘ۫ۥۧۡۤۜۘۧۨۡ";
                    seekBar = (SeekBar) view.findViewById(yo.getID("seekbar", "id"));
                    break;
                case -461353297:
                    ((TextView) view.findViewById(yo.getID("seekBarPrefUnitsRight", "id"))).setText(this.f569g);
                    str = "ۦۤۜۘ۫ۢۦۦۘۤۦۜۥۘ۠ۨۧۘۙۘ۫ۡۖۖ";
                    break;
                case -417200124:
                    seekBar.setOnSeekBarChangeListener(this);
                    str = "ۘۨۗ۟ۧۘۘۡۘۖۜۤۜۘۖۜۙ";
                    break;
                case 305960868:
                    c(view);
                    str = "۫ۢۚۙ۟ۛۡۚۡۥۥۡۚۤۖۙ";
                    break;
                case 805398851:
                    ((TextView) view.findViewById(yo.getID("seekBarPrefUnitsLeft", "id"))).setText(this.f568f);
                    str = "ۜۗ۟ۤۤۥ۬ۗۡۘۖۥ۟ۗۚۦۘ۫ۜ۠ۙۥۤۡۘۡۨ۫ۗ";
                    break;
                case 1303724991:
                    str = "۫ۗۘۛۧۘۘۛۦۗۖ۬ۘۜۜۘۗۗۨ";
                    break;
                case 1639785159:
                    seekBar.setProgress(this.f563a);
                    str = "ۡۛۧۚۢۜۨۜۥۘۙ۬ۛۛۗۖۘۜۤۜۦۦۘ۫ۛۥۘ";
                    break;
                case 1754257544:
                    seekBar.setMax(this.f564b);
                    str = "۟ۖۤۤۜۨۡۥۢۛ۬ۖۘۙ۠ۥ";
                    break;
                case 1965934505:
                    str = "۟ۜۖۜۤۤۥۤۘۢۡ۟ۘۡۜۘۦۙۨ";
                    break;
                case 2014884776:
                    seekBar.setEnabled(isEnabled());
                    str = "ۘۨۖ۬ۦ۬ۚۦۛۦۧۘ۠ۥ۬";
                    break;
            }
        }
    }

    public View onCreateView(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = null;
        String str = "ۗ۫۠۫ۦۛۨۢۖۨۚۦۘ۟ۙۗۢۡۥۘ";
        int i2 = 0;
        while (true) {
            switch ((str.hashCode() ^ 101) ^ 1822017053) {
                case -1930722232:
                    return LayoutInflater.from(getContext()).inflate(i2, viewGroup2, false);
                case -790677287:
                    str = "۬ۛۨۘۗۨۘۘۗۗۗ۫ۗۨۘ۠ۥۘ";
                    break;
                case -713732664:
                    str = "ۚۘ۫ۦ۠ۛ۫ۨ۬۬ۙۖۗۥ۠۟ۧۘۘۢۖۨۘۜۨ۟";
                    viewGroup2 = (ViewGroup) super.onCreateView(viewGroup);
                    break;
                case -193483685:
                    i2 = yo.getID("seek_bar_preference", "layout");
                    str = "ۨۤۙۦ۬ۛۦ۟ۦۚۜۢۦۥۖۜۤۨۡۛۢۚۖۘۘ";
                    break;
                case 1968186107:
                    str = "۫ۤۗۗۥۘۘ۬ۗ۫۬ۜ۬ۨۘۧ۠ۧۙ۫ۨۙۤۚۢۖۤۢ";
                    break;
            }
        }
    }

    public Object onGetDefaultValue(TypedArray typedArray, int i2) {
        String str = "ۖ۠ۜۦ۠۬ۘۛۧۡۙۙ۬ۜۢ";
        while (true) {
            switch ((str.hashCode() ^ 229) ^ -400385119) {
                case -349026824:
                    return Integer.valueOf(typedArray.getInt(i2, 0));
                case 140079921:
                    str = "۠ۤۦۘۙۥ۫ۗۖۨ۬ۖۘۖ۠ۨ۫ۚۘۘ۬۠ۡ۫ۚۨ";
                    break;
                case 605688943:
                    str = "ۢۧۦۜۦۘۙۥۛۥۨۧۡۨۨ";
                    break;
                case 934704667:
                    str = "۠۫ۜۙۜ۟۠ۨۧۘ۫۟۟ۢۘۡۘۡۦۡۘ۠۠۬";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        r0 = "۬ۥۜۧۗۧۥۢۢۤ۠ۜۛۜۤۙۛۨۘۖۛ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onProgressChanged(android.widget.SeekBar r5, int r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = "ۚۛۨۘۖۛۥۨ۟ۧۙۘۘۡۚۛ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 248(0xf8, float:3.48E-43)
            r3 = 880688490(0x347e3d6a, float:2.3677936E-7)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1784744258: goto L_0x001a;
                case -1624520741: goto L_0x0017;
                case -1253370557: goto L_0x0039;
                case -1030061402: goto L_0x0014;
                case 149793720: goto L_0x0011;
                case 955841817: goto L_0x0070;
                case 1619746040: goto L_0x001d;
                case 1738438451: goto L_0x005d;
                case 1856648815: goto L_0x0057;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "ۜۘۘۘۛۛۢ۫ۗۖۜ۠ۧۢۗۨۨۛۦ۬ۡ"
            goto L_0x0002
        L_0x0014:
            java.lang.String r0 = "۬ۧۥۘۜۥۥۘۗ۟ۗۖۜۥۤۤ۫۫ۦۙۖۘۡۤۨۗۢۚۨۘ"
            goto L_0x0002
        L_0x0017:
            java.lang.String r0 = "ۜۡۢۨۨۙۡۧۘۘۖۡۥۖ۬ۦۘ۫ۧۨۘ"
            goto L_0x0002
        L_0x001a:
            java.lang.String r0 = "۫ۨۜۘۚ۠ۜۛۤۗۙۨ۫ۤۚۗۥۡۜ"
            goto L_0x0002
        L_0x001d:
            r1 = 193445052(0xb87bcbc, float:5.2284084E-32)
            java.lang.String r0 = "ۨۢۦۘ۠ۥۘۨۖۘۚۧ۠ۗۡۢ"
        L_0x0022:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -853372777: goto L_0x0033;
                case -786692401: goto L_0x0036;
                case 933091028: goto L_0x002b;
                case 2095595280: goto L_0x006d;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0022
        L_0x002b:
            if (r7 == 0) goto L_0x0030
            java.lang.String r0 = "ۡۤۚۗۧۚۡۦۧۙۡۗۖۗۖۜ۬۬ۖۡۙۧۡ۬"
            goto L_0x0022
        L_0x0030:
            java.lang.String r0 = "ۚ۠ۗۧ۫۫ۦ۫ۡۘۦۡۨۦۦۘۡ۠۫ۘ۬ۙۡۘۥۢۖۘ"
            goto L_0x0022
        L_0x0033:
            java.lang.String r0 = "ۙ۬ۨۛ۟ۖۡۙۨۗۦۨۡۘۛۤۡۧۖۘ۬ۤۙ"
            goto L_0x0022
        L_0x0036:
            java.lang.String r0 = "ۨۤۖۘۥۗۜۛ۠ۦۘۥ۟۬ۡ۬ۡۘ"
            goto L_0x0002
        L_0x0039:
            r1 = 514742738(0x1eae59d2, float:1.8460115E-20)
            java.lang.String r0 = "ۜۚۧۧ۠ۡۦۗۤ۟ۦ۠ۜ۫ۜۘ۬۠۟ۨۜۨ۬۬ۙ"
        L_0x003e:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -278695410: goto L_0x0051;
                case 89820471: goto L_0x0054;
                case 630636882: goto L_0x0047;
                case 1751970729: goto L_0x006d;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x003e
        L_0x0047:
            boolean r0 = r4.f567e
            if (r0 != 0) goto L_0x004e
            java.lang.String r0 = "۬۠ۘۤۥۜۘۚۗۢۘۗ۠ۜۜۜۦۗ۫ۧۘۦۖ۫۫ۚۡ۟"
            goto L_0x003e
        L_0x004e:
            java.lang.String r0 = "۫ۜۗۨۙۥۧ۬۠ۚۡۡۗۦۗ"
            goto L_0x003e
        L_0x0051:
            java.lang.String r0 = "ۗۘۗۡۛۥۘۜۖۥۘۗ۫۟ۜۨ۫۠ۤۛۢۚ۟ۦ۫ۖۘۨۛۡۘ"
            goto L_0x003e
        L_0x0054:
            java.lang.String r0 = "۫ۜۧۘۗ۬۫ۜۗۜۙۢۦۚۛۤ۫ۚۘۘۗۢۨۘ"
            goto L_0x0002
        L_0x0057:
            r4.b(r5)
            java.lang.String r0 = "ۢۙۧۚۥ۬ۡۥۙۧۘۜۥۙۥۘۡۤۤۥ۟ۧۚ۠ۡۘۡۙۦۘ"
            goto L_0x0002
        L_0x005d:
            android.view.ViewParent r0 = r5.getParent()
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r4.c(r0)
            java.lang.String r0 = "۬ۥۜۧۗۧۥۢۢۤ۠ۜۛۜۤۙۛۨۘۖۛ"
            goto L_0x0002
        L_0x006d:
            java.lang.String r0 = "۬ۥۜۧۗۧۥۢۢۤ۠ۜۛۜۤۙۛۨۘۖۛ"
            goto L_0x0002
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.SeekBarPreference.onProgressChanged(android.widget.SeekBar, int, boolean):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        j0 j0Var = null;
        String str = "ۦ۟ۡۨ۠ۤ۬۬ۥۧۖۦۘۙۨۘۛۘۘۢۙ۬۬ۙۧ";
        while (true) {
            switch ((str.hashCode() ^ 282) ^ -372750506) {
                case -1856509186:
                case -901913458:
                    return;
                case -1220381081:
                    super.onRestoreInstanceState(parcelable);
                    str = "ۥ۬ۧۘۤۘۙۦ۬۫ۜۡۘۥۙ۬ۨۦۥۘۘۚۖۘۤۚۦ۠ۙۙ";
                    break;
                case -1181569511:
                    notifyChanged();
                    str = "ۦۧۨۡۖۘۜ۫۟ۗۦۤۖ۬۠ۚۨۘۛۚۦۘ";
                    break;
                case -237433347:
                    str = "ۙۙۥۘ۬ۘ۫۠ۡۚ۟ۚ۟ۢۤۖۘ";
                    j0Var = (j0) parcelable;
                    break;
                case 103824661:
                    str = "ۘۡۤ۠ۜۦۘۘۦۚۘ۫ۖۥ۠ۛ۫۬ۥ";
                    break;
                case 804180424:
                    str = "۠ۦۙۗۙۛۧ۠ۡۘۜ۬ۨۗۚۚۘۙۖ";
                    break;
                case 1210952364:
                    String str2 = "ۡ۫۟ۨۢ۫۠ۨۙۦۤۛۤۛۤۧۥ";
                    while (true) {
                        switch (str2.hashCode() ^ -2002812915) {
                            case -2120865774:
                                str = "۟ۘۧ۟ۚۚۡۢۢۡۘۡۘ۬ۙ";
                                continue;
                            case -1304910025:
                                str2 = "ۖۚۗۘۘ۟ۤ۬ۘۘۢۧۗ۬ۜۡۗۨۧۘۘۗۥۘۜۘۜۦۚۦۘ";
                                break;
                            case 745036018:
                                str = "ۤۚۥۚۗۚۗۛ۬ۘ۫۟ۤ۠ۖۘ۠ۤۗۥۦۜۘۖ۫ۜۘ";
                                continue;
                            case 1260617582:
                                if (parcelable.getClass().equals(j0.class)) {
                                    str2 = "ۡۡۢ۫ۥۘ۠ۛۗۡۘۨۤۚۧۙۢۨ";
                                    break;
                                } else {
                                    str2 = "ۥ۟ۥۛ۬ۡۨۗۥۘۤ۟ۖۘ۫ۨ۟۠ۖۜۘۙۜۧۤۨۦ۫ۗ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1378019678:
                    this.f563a = j0Var.f787a;
                    str = "ۧ۠ۙۙ۫ۥ۫ۜ۬۠ۦ۫ۙۖۨۗ۠ۗ";
                    break;
                case 1486609132:
                    this.f564b = j0Var.f788b;
                    str = "ۡۧۢۜۛۗۤۡۘۘۘۢۛۘۖۧۘۡ۟ۙۙۗۚۢۘۙۧ۟ۖۘ";
                    break;
                case 1925303159:
                    super.onRestoreInstanceState(j0Var.getSuperState());
                    str = "۠ۙ۬ۦۧۜ۟۫۠ۚۘ۟ۗۡۦۛۛ۫ۜۘۙۗۗۡۘۥۗۨۘ";
                    break;
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        String str = "ۚۡۨۗۚ۫ۘۜۘۜۙۡۖۛ۠ۜ۫ۥۘۦۙۦ";
        j0 j0Var = null;
        Parcelable parcelable = null;
        while (true) {
            switch ((str.hashCode() ^ 412) ^ 1840405270) {
                case -1720528388:
                    str = "ۚۤۖۨۦۚۨۨۦۤ۟ۗۙۚ۬ۡ";
                    parcelable = super.onSaveInstanceState();
                    break;
                case -1669671001:
                    j0Var.f788b = this.f564b;
                    str = "ۖ۬ۘۘۡۜۤۤۦۗۡ۟ۜ۫ۤ۬ۙۧۨۘۛ۬ۗۜۚۙ";
                    break;
                case -205646272:
                    return j0Var;
                case -107617789:
                    j0Var.f787a = this.f563a;
                    str = "۫ۧ۬ۜۖۘ۫ۗۗ۟ۥۤۦۦۥ۫ۘۧۦۖۜۘۡۚۡۛۢۚ";
                    break;
                case 165202693:
                    return parcelable;
                case 472596022:
                    String str2 = "ۜ۠ۖۘۚۚۨۗ۬ۨۘ۬ۨ۠ۜ۠ۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 2135268369) {
                            case -1766501302:
                                str = "ۧۧۘۘۙۜ۠۟ۚۥۖۡۛۢۙۡۘۢۦۤۜ۫";
                                continue;
                            case -600871651:
                                str = "ۨۜۦۘۛۛ۬ۘۗۨۢۨۨۘۧۡۘۖۗ۫۟ۨۥۛۤ۠ۨۛۜۘ";
                                continue;
                            case -305969092:
                                str2 = "۫۠۟ۘۥۦۘۛۗۖۘ۠ۙ۠ۖ۬ۡۛ۫ۙ۫ۨۧۘ";
                                break;
                            case 992660809:
                                if (!isPersistent()) {
                                    str2 = "ۚ۬ۥۗ۫ۖۜۡۚۜۚ۟ۧۙ۫۬ۗۘۘۥۨۧ";
                                    break;
                                } else {
                                    str2 = "ۚۨۨۡۖۚۡۤۡۤۧ۟ۘۚۦۨۢۢ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1613736052:
                    j0Var = new j0(parcelable);
                    str = "ۡۚۡۜۥ۟ۡۧۦۘۜۧۡ۬ۦۥۘۢۧۗ۠ۚ۫ۙ۬ۜ۟ۛ";
                    break;
                case 1728853703:
                    str = "ۢ۬ۖۘ۫۬ۛۚۛ۫ۢۤۛۧۗ۬ۤۜۥۦۥۘ۬ۗۘۘ";
                    break;
            }
        }
    }

    public void onSetInitialValue(boolean z2, Object obj) {
        String str = "ۖۘۦۗۨ۬ۚۨۡ۠ۨۘۚۜۥۘۗۦ۫ۧۘۧۘ";
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            switch ((str.hashCode() ^ 506) ^ 87182935) {
                case -1505197343:
                    return;
                case 7987921:
                    setProgress(i3);
                    str = "ۜۤۜ۫ۥۨ۠ۧۦۗۤۡۘۗۘ۫ۨۦ۫";
                    break;
                case 324291946:
                    String str2 = "۟ۙۨۦۥۤۡ۬ۤ۟۠ۤۗۥۜۘۜۡۦۘۗ۬ۙۖۘۨۘۘ۫ۜ";
                    while (true) {
                        switch (str2.hashCode() ^ -1852733720) {
                            case -1952596681:
                                str2 = "ۨ۠ۡۜ۬ۛۡۦ۬ۘۡۢۖۦۥ۠ۜۖۡۖۘۧۛۨۘ";
                                break;
                            case -1752443171:
                                if (!z2) {
                                    str2 = "۬ۦۥۚۙۘۗۙۜۥۥ۬ۖۖۤۗۡۚ";
                                    break;
                                } else {
                                    str2 = "ۗ۠ۙۧۚۡ۟۫ۥۘۡۢۜۧ۫ۡ";
                                    break;
                                }
                            case -79768540:
                                str = "ۦۗۡۘۚ۬ۚ۠۬ۦۧۖۦۘۖ۠۫ۡۧۘ۟ۨۢۧۥ۠";
                                continue;
                            case 2115931142:
                                str = "ۗۙۦۘۢۡۚۡۚۧۧۚۧۢۜۨۘۙۤۛ";
                                continue;
                        }
                    }
                    break;
                case 481684152:
                    i2 = ((Integer) obj).intValue();
                    str = "ۗ۫۠۬۠ۨۘ۠ۗۦۖۡۘۜۥۜۘۡۧۡۘ";
                    break;
                case 554536381:
                    str = "۟ۙۚۦۗۥ۟ۖۡۖۨۘ۬۬ۧۧ۟۫";
                    i3 = i2;
                    break;
                case 1252868838:
                    str = "۟ۛۨۥۡۗۨۗۢۧۙۛۡۡۛۗۧۦۘۖۧۜۘۛۗۡ";
                    break;
                case 1293897652:
                    i4 = getPersistedInt(this.f563a);
                    str = "۟ۜۖۘ۬۟ۘۖۜ۟۬ۦۢۥۡۨۘۖۜۨۘۡۤۖ";
                    break;
                case 1582137240:
                    str = "ۤ۫ۗۛۤۨۨ۠ۨۘۦۛۘۨ۬ۛ";
                    break;
                case 1761079906:
                    str = "۟ۙۚۦۗۥ۟ۖۡۖۨۘ۬۬ۧۧ۟۫";
                    break;
                case 1798747661:
                    str = "ۢۨۢۗۢۦۚۦ۬ۨۡۖ۫۠ۘۚۜۥۤۡۘ۟ۢۘ۠ۙۖ";
                    break;
                case 2011795089:
                    str = "ۤۦۥۤ۫ۚ۬ۜۧۘۢۚ۫ۗۡۛ";
                    i3 = i4;
                    break;
            }
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        String str = "ۘۜۧۙ۠۟ۥۧۗۘۥۥۘ۬ۦ۠ۖۥ۟ۨۗۘۘۗۛۘۙۚ۬";
        while (true) {
            switch ((str.hashCode() ^ 794) ^ -424398226) {
                case -561276323:
                    str = "ۢۤ۠۬۟ۥۘۢ۬ۥۤۤۥۦۨۦۘ";
                    break;
                case -25611850:
                    this.f567e = true;
                    str = "ۜۚ۫ۨۥ۫ۤۗۘۘۥۛۖۘۧ۬ۨۘۢۧ۟ۛۨ۟ۘۤۦۘ";
                    break;
                case 673280292:
                    str = "ۜۛۦۘۤۥ۫ۖۖۥۤ۟ۦ۬ۚۜۘ";
                    break;
                case 1728882563:
                    return;
            }
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        String str = "ۖ۬ۨۘۡۧۗۙۤۘۘ۬۬ۤ۠ۗ";
        while (true) {
            switch ((str.hashCode() ^ 903) ^ 1522759595) {
                case -2075396887:
                    str = "۬ۛۗۜۡۥ۟۫ۖۜۨۙۧۤ۟ۗۢ";
                    break;
                case -1689957967:
                    String str2 = "ۖۢۛۖۧۛۨۨۧۘۜۗۨۗ۫ۨۘ۠ۛۦۥۛ۬ۗۘۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 692171000) {
                            case -559525707:
                                str2 = "ۜۢۥۧۙۦۥۗۡۘۦۨۘۦۤۡۘۧۤۨۘ";
                                break;
                            case -89315056:
                                str = "۠۬۬ۡۧۥۗۨۦۘۘ۬ۚۘۧۨۤۢۤۥۤۘۗۙۢ۟ۦۥ";
                                continue;
                            case -17080958:
                                str = "ۨۙ۠ۙۖۧۘۖۚۨ۫ۡۚۧۤۥ۠ۛ۫ۦۦۡۤۗۘۥۘ";
                                continue;
                            case 1494213104:
                                if (seekBar.getProgress() == this.f563a) {
                                    str2 = "ۗۤ۬ۥ۟۫ۨۜۨۘۗ۠ۨ۫ۛۡۗۗ";
                                    break;
                                } else {
                                    str2 = "ۥ۫ۖۘۛ۫ۦۘۧۜۨۘۚۜ۠ۢ۫ۚۛۦ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1233558722:
                    str = "ۧۢۥۗۥۤۘۗۚ۬ۙۘۘۙۜۘ۬ۧۨۘۘۥۚ۠ۚۢ";
                    break;
                case -1046600656:
                    b(seekBar);
                    str = "ۡۢۘۚۘۖۘۨۙ۟ۖۙۥۘ۫ۜۖۘۥۥ۫ۥۢۧ۫ۙۡۘ";
                    break;
                case -890686136:
                    c((View) seekBar.getParent().getParent());
                    str = "۠۬۬ۡۧۥۗۨۦۘۘ۬ۚۘۧۨۤۢۤۥۤۘۗۙۢ۟ۦۥ";
                    break;
                case -617178262:
                    return;
                case 1178845779:
                    this.f567e = false;
                    str = "ۥۦۘۘۜۢۖۘ۫ۧۥۘ۟ۚ۫ۘۡۜۘ";
                    break;
            }
        }
    }

    public void setMax(int i2) {
        String str = "ۙۚۨۙ۠ۧۚۜۜۘۦۢۡۘ۠۠ۜۘۨۨۨۘ۟ۦۗ";
        while (true) {
            switch ((str.hashCode() ^ 13) ^ 1787446349) {
                case -1646697387:
                    notifyChanged();
                    str = "۟۟ۘۘ۠ۢۜ۬ۘۗۨ۟ۚ۟۬ۜۘ";
                    break;
                case -704692370:
                    str = "ۗۘۗۘۦۘۜۡۚۘۘۢۢۢۜ۫۫";
                    break;
                case -574466182:
                    str = "۟ۧۧۥۨۥۘ۫ۧۡۘۧۢۜ۠ۡۘۜۨۘ";
                    break;
                case -447568037:
                    String str2 = "ۙۖۚۜ۟ۚۥۘ۫ۤۙۘۜ۫ۘۚۦۧۤۖ۬";
                    while (true) {
                        switch (str2.hashCode() ^ 872563031) {
                            case -811591183:
                                str2 = "ۦۘۨۤۘۧۘۨۚۦۜ۟ۜۤۛ۠ۖۖۨۘۗۤۙ";
                                break;
                            case 1324130997:
                                str = "۟۟ۘۘ۠ۢۜ۬ۘۗۨ۟ۚ۟۬ۜۘ";
                                continue;
                            case 1484913044:
                                if (i2 == this.f564b) {
                                    str2 = "۠ۖۡۤۜۘ۬ۚۥۖۘۙ۬۟ۥۘ۠ۜۙ";
                                    break;
                                } else {
                                    str2 = "۟ۥۚۙ۟ۨۛ۠ۦۨۛۦۙۙ۟ۘ۟";
                                    break;
                                }
                            case 1646540708:
                                str = "ۚۦۘۘۘۛ۬ۚ۠ۙۚۢۜۛۘ۬ۙۘ۠";
                                continue;
                        }
                    }
                    break;
                case -303694437:
                    return;
                case 1607758576:
                    this.f564b = i2;
                    str = "ۤ۟ۙۗۢۚۡۢۛۦۦ۠۟ۚ۬ۘۧۛ۟۟ۗ۟۫ۦ";
                    break;
            }
        }
    }

    public void setMin(int i2) {
        String str = "ۗۡۘۢۙۜۘۘۘ۬۠ۤۜۘۛۘ۬۟ۜۘۙۡۘۚۛۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 364) ^ -1565556987) {
                case -108204749:
                    this.f565c = i2;
                    str = "ۢۢ۟ۜ۬ۨۘۨ۟۬۫ۖ۫ۧۢۙۘ۟۟ۘۘۢۘ۬ۢ۫ۛ";
                    break;
                case 504261993:
                    notifyChanged();
                    str = "ۙ۟ۨۘ۫ۚ۫۟ۧۡ۠ۡۗۛ۠ۚۙۘۘ";
                    break;
                case 755234814:
                    str = "ۦۙ۠۠۟ۚۨۢۙۢۚۧۨۘۦۤ۟";
                    break;
                case 767553269:
                    str = "۟ۙۜۘۨۦۦۛۗ۬ۛۚۘۘ۟ۧۦ۠ۥۧۘ";
                    break;
                case 1783667354:
                    String str2 = "ۥۙۜۘۧۡۨۘۗۖۧۘۛۗ۫ۧۘۖۘۜ۠ۙۨۛۖۘ۫۫ۨۘۙۥۨ";
                    while (true) {
                        switch (str2.hashCode() ^ 55267769) {
                            case -1629328037:
                                str = "ۜۡۙۨۙۛۘۦۤۢۡۥۘ۬۠۠";
                                continue;
                            case -1446331389:
                                if (i2 == this.f565c) {
                                    str2 = "ۡۡ۫ۖۜۡۘ۬۠ۘۙۡ۫ۜۡۨۘ۠ۨۢۦۨۨۥ۬ۘۖۜۦۘ";
                                    break;
                                } else {
                                    str2 = "ۚۦۧۘۗۙ۫ۗۛۨۘۨ۬ۢۙۥۤۨۤۥ";
                                    break;
                                }
                            case -826639466:
                                str2 = "ۢ۫ۖۘ۠ۥۨۘ۠۫ۦۘۢۨۛۡ۬۟۠ۦ";
                                break;
                            case 697675832:
                                str = "ۙ۟ۨۘ۫ۚ۫۟ۧۡ۠ۡۗۛ۠ۚۙۘۘ";
                                continue;
                        }
                    }
                    break;
                case 1934322766:
                    return;
            }
        }
    }

    public void setProgress(int i2) {
        String str = "ۢۢ۟ۢۜۧۡۚۚۧ۠ۥۛۜۜۘۡۥ۬";
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            switch ((str.hashCode() ^ 218) ^ 896962045) {
                case -2068246563:
                    String str2 = "ۢ۟ۘۧۦۤۚۦ۫ۜۡۥۘۤۖۤ";
                    while (true) {
                        switch (str2.hashCode() ^ 1543836613) {
                            case -1982855080:
                                str = "۫ۨۧۘۤۚۛۧ۟ۙۘ۫۠۟ۡۢۢۢ۠ۥ۠ۨۚۥۦ";
                                continue;
                            case -1485710249:
                                str2 = "ۛۡۨۘ۫ۦۖۗۛۢۙۨ۟ۚ۟ۡۘ۠ۡۜۘ۬ۧۨ";
                                break;
                            case -1250753772:
                                str = "۬ۜۖۖۦۙۤۗۥۘۨۘ۫ۢ۠۫ۤۤۤ۫ۜ۟ۨۘۤ";
                                continue;
                            case 517568992:
                                if (i7 >= i5) {
                                    str2 = "ۥۧۢۥۤۨۘۗۚ۠ۚۤۤۜۨۚۥۥۙۨ۫۫";
                                    break;
                                } else {
                                    str2 = "ۧۢۥۘۚۘۗۙۦۨۘۘۢۘۖۖۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case -2023094839:
                    str = "ۘۛۘۜ۫ۜۡۥۜ۬ۡ۫ۧۥۢ";
                    i6 = i8;
                    break;
                case -1887846604:
                    str = "۬ۜۖۖۦۙۤۗۥۘۨۘ۫ۢ۠۫ۤۤۤ۫ۜ۟ۨۘۤ";
                    i4 = i3;
                    break;
                case -1700660107:
                    str = "ۨۛۖۘۗۡۦۙ۠ۙۡۖ۠ۙۤۤ۫ۘۡۘ";
                    break;
                case -214528230:
                    str = "ۚ۟ۜۘ۟۫ۙ۟ۦۗۧ۫ۥۘۢۙۘۘۛ۬ۦۘۘۚۙ";
                    break;
                case 378129398:
                    str = "ۢ۬ۨۛۙۙ۟ۘۘۘۥ۫۫ۦ۠ۙۦ۟ۢ۬ۦ";
                    i3 = i5;
                    break;
                case 505769205:
                    this.f563a = i4;
                    str = "ۚۧۜۘ۬ۢۦۘۦۘۙۥ۟ۥۙۗۙ۠ۜۜۘ۠ۖۦۘۗۘۢۖ۫۬";
                    break;
                case 537754047:
                    return;
                case 555506864:
                    String str3 = "ۙۖۛۤ۫ۘۡۡۢۖۧۦۘ۫ۛ۬ۦۙۖ۬ۦۨ";
                    while (true) {
                        switch (str3.hashCode() ^ 57375814) {
                            case -2143863617:
                                str = "ۥۙۡۦۜۡۘۙۗ۟ۧۢۜۘۗۡۖۘۛۛۦۘۢۡۖۘ";
                                continue;
                            case -1736274200:
                                str3 = "ۧۚۡۙۦۦ۠ۧ۟۟ۖۢۥ۫ۨ";
                                break;
                            case 1637095891:
                                if (i2 <= i8) {
                                    str3 = "۫ۖۜۘۢۤۗۧۨۨۜۗۤۧۢۚۧ۫۬";
                                    break;
                                } else {
                                    str3 = "ۤۥۤۘۨۘۜۙۖۘۧۖۦۡۤۢۚ";
                                    break;
                                }
                            case 1771257186:
                                str = "ۦۦۚۗۖۥۘۙۦۗۦ۠ۙ۠ۢۨۘۛ۫ۖۡ۫ۥۨۙۧ";
                                continue;
                        }
                    }
                    break;
                case 827749509:
                    i8 = this.f564b;
                    str = "ۜۙ۟ۧۛۥۙۢۦ۫ۤۢۛ۬۠";
                    break;
                case 962434280:
                    String str4 = "۠ۛۙ۟۟ۡۘۙ۠ۜ۠ۗ۬ۥۚ۟";
                    while (true) {
                        switch (str4.hashCode() ^ -1139676573) {
                            case -1181151922:
                                str = "ۤ۟ۘۥۧۡۨ۟ۢ۫ۖۧۘ۬ۡۛۗ۬ۦ۟ۗۨۘ";
                                continue;
                            case -595007171:
                                str = "۟ۘۤ۫ۛۖ۟۠۠ۥۙۗۦۙۘۧ۠ۥۘ";
                                continue;
                            case 340618838:
                                if (i4 == this.f563a) {
                                    str4 = "۠ۡۥۘۜۖۧۜۘۨۘۖۘۚۢۙۨۘۦ۫۬";
                                    break;
                                } else {
                                    str4 = "ۖۧۖۘ۠ۚۛۦۚۥۘۖۥۖۘ۬ۥ۫ۘۗۨۘۧۜۧۘۥ۬ۗ";
                                    break;
                                }
                            case 1701158508:
                                str4 = "ۛۡۜۘۖ۬ۘ۫ۢۡۤۢۖۖ۠ۥ۫ۜۘ۫ۗۤ";
                                break;
                        }
                    }
                    break;
                case 977240138:
                    str = "ۖۖ۟ۘ۬ۦ۫ۦۥۘۢۚۢۗۗۜۘۢ۫ۛ۫ۦۘ۟ۤۗۚۗۙ";
                    i4 = i7;
                    break;
                case 1304951578:
                    i5 = this.f565c;
                    str = "ۥۤۨ۟۠ۡۘ۫۟۟ۡ۬ۤۚۤۤۨ۫ۦۘ۫ۤۗ۫۬۬";
                    break;
                case 1548915099:
                    persistInt(i4);
                    str = "ۥۨۨۘ۫۟ۛۖ۬۠ۗۜۤۧۖۦۘ";
                    break;
                case 1658687593:
                    str = "ۥۙۡۦۜۡۘۙۗ۟ۧۢۜۘۗۡۖۘۛۛۦۘۢۡۖۘ";
                    i7 = i6;
                    break;
                case 1727023315:
                    str = "ۦۖۤۢ۠ۖۘۘ۠ۥۘۡۧۤۡ۫۫ۨ۠ۨۘۛۤۚ";
                    i7 = i2;
                    break;
                case 1953743629:
                    notifyChanged();
                    str = "ۤ۟ۘۥۧۡۨ۟ۢ۫ۖۧۘ۬ۡۛۗ۬ۦ۟ۗۨۘ";
                    break;
            }
        }
    }
}
