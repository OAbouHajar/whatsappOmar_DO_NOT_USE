package com.obwhatsapp.yo;

import a.a;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

@SuppressLint({"AppCompatCustomView"})
public class tf extends TextView {

    /* renamed from: a  reason: collision with root package name */
    public static final int f107a = yo.getID("status", "id");

    static {
        String str = "ۥۥۢۤ۟ۚۜۡۥۘۥۗ۟ۡۧۥ";
        while (true) {
            switch ((str.hashCode() ^ 392) ^ 1314568018) {
                case -2027913603:
                    str = "ۘۤ۬۫ۦۚۡ۫۬ۦ۫ۘۛۙۖۖ۠ۤۗۖۗۢۦۘۛۗ۫";
                    break;
                case 2114892827:
                    return;
            }
        }
    }

    public tf(Context context) {
        super(context);
        myFace(this);
    }

    public tf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843087, 16843088, 16843379}, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        String str = "ۘ۬ۙۢۛۢۚۖۛ۟ۢ۟ۡۨۘۨ۫ۤ";
        while (true) {
            switch (str.hashCode() ^ -1516716552) {
                case -686707462:
                    String str2 = "۬ۢۗۜ۠ۙۖۧۥۘۨ۬ۥ۟ۘۧۘۙ۬ۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -396086831) {
                            case -1549593125:
                                str2 = "ۧۜۘۘ۟ۢۚۗۨۥۘ۬ۤۧ۬ۥۧۘۥۜ۫ۖ۠ۡۥۜ۠";
                                continue;
                            case -1371358013:
                                if (!freqObfStringMapping.isFMString(resourceId)) {
                                    str2 = "ۛۗۜ۫ۙۨۘۘۖ۟ۖ۫ۤۨۧۥۘۖۡۤ۟ۧۦۥ۠ۥۗۚ";
                                    break;
                                } else {
                                    str2 = "ۗۨۜۘۢۗۨۘۤۗۖۘۧۦ۟ۛۖ۬ۧۗۢۚۧ۫";
                                    continue;
                                }
                            case 1830386018:
                                setText(yo.getString(resourceId));
                                break;
                            case 1876475669:
                                break;
                        }
                    }
                    break;
                case -161827274:
                    break;
                case -23650455:
                    if (resourceId != 0) {
                        str = "ۨۢ۫ۡۜۧۢۜۖۘۨۛۤۗۥ۟۟ۖۢۘۗۡۘۨ۠ۗۧۡ";
                        break;
                    } else {
                        str = "ۙ۬ۥۨ۫ۗۖ۠۟ۤۥۘۘۚ۟ۨۙۖۡۤۦۡۘ";
                        continue;
                    }
                case 555003095:
                    str = "۫ۨۚۤۥ۫۬ۖۖ۫ۤۧۚۡۘ";
                    continue;
            }
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        String str3 = "ۢۦۧ۬ۧۗۗۨۜۥۧۦ۠۠ۡۘ۠ۧۚ۟ۜۛۘۦۖۘ";
        while (true) {
            switch (str3.hashCode() ^ -173716074) {
                case -1618995828:
                    String str4 = "ۖ۟ۘۘۛۙ۠ۤ۠ۨۘۘۢۤ۫ۤۥ";
                    while (true) {
                        switch (str4.hashCode() ^ 747112564) {
                            case -1884485917:
                                if (!freqObfStringMapping.isFMString(resourceId2)) {
                                    str4 = "ۢۛۡۛۖۖۙۜ۟ۛ۠ۦۘۥۡۘۢۖۨۛۘ";
                                    break;
                                } else {
                                    str4 = "۬ۚۧۨۡۡۘۤۖۘۘ۫۬ۥۘۜۨۘۘ۬ۙۤ";
                                    continue;
                                }
                            case -320473976:
                                break;
                            case 922692940:
                                setHint(yo.getString(resourceId2));
                                break;
                            case 1803667617:
                                str4 = "ۜۚۗۡ۫ۦۘۗ۟ۖۘۡ۬ۦۘۧۤ۬ۛۡۜۘۢۧۖۘۤۛ۫";
                                continue;
                        }
                    }
                    break;
                case -1481456942:
                    str3 = "ۨۥۖۥۧۨۘۛۥۖ۟ۡ۫۠ۙۛ";
                    continue;
                case -134990126:
                    if (resourceId2 != 0) {
                        str3 = "ۛ۬۟ۨۜۘ۠ۤۥۨۧۜۘۤ۠ۚۛ۠ۜۢۗۙۥۧ۫";
                        break;
                    } else {
                        str3 = "ۢ۬۟۟۬ۘ۬۟ۚۛۦ۠ۡ۠ۥۡۘ";
                        continue;
                    }
                case 1302754927:
                    break;
            }
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
        String str5 = "ۡۘۖۘ۫ۨۛۦۢ۬ۧ۬۟ۚۨۜۥۘۡۗۖۘ";
        while (true) {
            switch (str5.hashCode() ^ 1305580968) {
                case -1664713182:
                    if (resourceId3 == 0) {
                        str5 = "ۡۛۘۚۖۧۢ۬۟ۗۚۖۘۡۤۡۦۧ۠۟ۥۜۘۜۛ۠";
                        break;
                    } else {
                        str5 = "ۜۨۧۘۢ۬ۚۢۤۥۜ۠ۨۧۡ۟";
                        continue;
                    }
                case -1047222998:
                    String str6 = "۟ۤۦۘۡ۠ۖۢۙۜ۬۠ۖۧۦۧۡۗۚۥۧۡۧۗۙۢۙ";
                    while (true) {
                        switch (str6.hashCode() ^ 1092510255) {
                            case -1835755041:
                                break;
                            case -681775952:
                                setContentDescription(yo.getString(resourceId3));
                                break;
                            case -187457291:
                                if (!freqObfStringMapping.isFMString(resourceId3)) {
                                    str6 = "ۥۨ۬۫۟ۜۘۘ۠ۨۙۛ۬۫۫۟ۘۜۘۜ۟۠ۗۥۚ۠ۥۢ";
                                    break;
                                } else {
                                    str6 = "ۨۜۦۚۥۧۤۦۘ۠ۛۨۘۜ۬ۤ۫ۖۘۙۖۦۘۤۚۘۛ۟ۗ";
                                    continue;
                                }
                            case 441921177:
                                str6 = "ۖۢۖ۟۠۫ۥ۫ۜۙۦۛۡۛ۬ۘۙۚ";
                                continue;
                        }
                    }
                    break;
                case -732454599:
                    break;
                case -633424327:
                    str5 = "۫ۙۘ۠ۜۖ۟۫ۜۦۚۜۛ۟ۥۥ۫ۢۢۚۗۙ۟";
                    continue;
            }
        }
        obtainStyledAttributes.recycle();
        myFace(this);
    }

    public tf(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843087, 16843088, 16843379}, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        String str = "ۤ۠۠ۘۛۧۡۥۤۗۥ۫ۢۚۖۘۢۢۖۖۡۘۘۙۤۖ۠ۘۘ";
        while (true) {
            switch (str.hashCode() ^ 68559343) {
                case -1680283630:
                    str = "ۧۛۦۛۖۥۘۖۨۡ۠ۡۦۘۥۜۦۘۤۜ۫ۦۨۚ";
                    continue;
                case 517942591:
                    String str2 = "ۨ۫۬ۚ۬ۧۨۦۗۧۦۦۛۛۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1179452938) {
                            case -2102345701:
                                if (!freqObfStringMapping.isFMString(resourceId)) {
                                    str2 = "۠۫ۜ۠ۜ۠ۖۚۜۡۘۨۛۜۦۗۢۡۘ۬ۗۦۘۧۖۦ";
                                    break;
                                } else {
                                    str2 = "ۙۧۖۘۥۚۨۘۚۚۡ۬ۚۦۘ۠ۚۖۘۗۜۚ";
                                    continue;
                                }
                            case -1920607403:
                                setText(yo.getString(resourceId));
                                break;
                            case -255393387:
                                str2 = "ۦۙۡۘ۟ۦۡۦۗۥۘ۫ۜۧۤ۠ۚۤ۬ۖۘ۠ۜۡ";
                                continue;
                            case 199648743:
                                break;
                        }
                    }
                    break;
                case 1340470138:
                    break;
                case 1906279088:
                    if (resourceId != 0) {
                        str = "۟ۡۡۘۨ۠۫ۘۙۜۘۤۢۖۘۢۛ۠ۤ۟ۨۥ۫ۥۘۖۛۘ";
                        break;
                    } else {
                        str = "ۖۙۥۘۥۦۜ۫ۚۗۚۜۦۘۤ۫ۡۘ";
                        continue;
                    }
            }
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        String str3 = "۠۫ۨۖ۠ۢ۟۟ۚ۬ۧۧۗۘۤ۟ۛۙۧۗۘۥۥۨۜۡۦۘ";
        while (true) {
            switch (str3.hashCode() ^ 785040703) {
                case 24201228:
                    String str4 = "۬ۖۢۢۡ۠ۡۥۙۨۨۥۧ۟ۢ";
                    while (true) {
                        switch (str4.hashCode() ^ 742604656) {
                            case -510654815:
                                if (!freqObfStringMapping.isFMString(resourceId2)) {
                                    str4 = "ۥۛۖۘۤۛ۟ۙ۬ۘۛ۬ۡۨۖۧ۫ۡۛ";
                                    break;
                                } else {
                                    str4 = "ۚۗۨ۟ۛۖۘۥۚۡۘۛۧۨۘۛ۠۟۟ۛۦۘۗۗۘۜۤۤۚۥۗ";
                                    continue;
                                }
                            case -28036873:
                                str4 = "ۜۗۥۘ۟ۨۚۥۛۡۘۙۛۨۘۜۨۡۖۙۗ۫ۡ۟";
                                continue;
                            case 629059041:
                                break;
                            case 1558710808:
                                setHint(yo.getString(resourceId2));
                                break;
                        }
                    }
                    break;
                case 433745217:
                    if (resourceId2 != 0) {
                        str3 = "ۢۚۙ۠ۢۥۡۧۗۙ۠ۘ۬ۥ۫";
                        break;
                    } else {
                        str3 = "ۜ۠ۛ۟۫ۛۨۧۦۨۨۡۘۘۜۢ۬ۧ۟ۡۤ";
                        continue;
                    }
                case 675215439:
                    str3 = "ۡۚۧۖ۟۫ۤۙ۠۬۠۟ۤۥۘۖۡۡ";
                    continue;
                case 1624481360:
                    break;
            }
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
        String str5 = "ۜۗۥۘۗۜۚ۫ۘۖۖۖ۫ۡۜۙ۟ۗۦۧ۬ۥ۟ۢۙ۫۠";
        while (true) {
            switch (str5.hashCode() ^ -1109685755) {
                case 562181537:
                    if (resourceId3 == 0) {
                        str5 = "ۢ۬ۧ۟ۡۗۜ۫ۚۦۚۛۛۥۖۥۡۘ";
                        break;
                    } else {
                        str5 = "ۘۜۗۛ۫ۤ۫ۥۤۤۡۥۘۧ۫ۖۧ۬۟ۛۦۜ";
                        continue;
                    }
                case 582433889:
                    break;
                case 1085188309:
                    str5 = "ۢۖۤۚۙۘۘۚۛۜۖۦ۬۬ۙۘۘۢۦۤ";
                    continue;
                case 1142636006:
                    String str6 = "ۡۛۥۚۚۙۚۤۗۛۢۙۜۗۖۘۘۚ۫";
                    while (true) {
                        switch (str6.hashCode() ^ 1196197621) {
                            case -873112537:
                                str6 = "ۢۚۙۖۘۥۘ۫ۢۦۘۥۖۢۤۢ۫ۥۖۡ";
                                continue;
                            case -474267146:
                                break;
                            case 273204844:
                                if (freqObfStringMapping.isFMString(resourceId3)) {
                                    str6 = "ۡۖۦۡۗ۫ۦ۬ۨۘۛۥ۠ۢۚۦۥۘۨ۬ۙۜۘۦ۠ۦ۬۟ۖ";
                                    break;
                                } else {
                                    str6 = "ۚۘۛۗۧۢۧۚۥۜۤۜۥۢۜۘۦۘۨۘ";
                                    continue;
                                }
                            case 932393600:
                                setContentDescription(yo.getString(resourceId3));
                                break;
                        }
                    }
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        myFace(this);
    }

    public static void b(String str) {
        String str2 = "ۥۡۧۙۘۦۘۥۛۡۘۖۗ۟ۢ۬ۘ۬ۢۚۨ۠۠ۜ۬ۨۘ";
        while (true) {
            switch ((str2.hashCode() ^ 631) ^ 189828215) {
                case -568637318:
                    return;
                case 402144541:
                    str2 = "ۚ۫ۢۘۤ۠ۚۦۥ۟ۙۦۘۥۨۜ۟ۦۢۖۥۦۥۗۥۘۧۗۜ";
                    break;
                case 464628948:
                    ((ClipboardManager) yo.getCtx().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", str));
                    str2 = "ۛ۫ۙۛ۠۠ۚۥ۫ۦۛۥ۠ۗۗ۠۫ۦۢ۫۫ۙۖۙ";
                    break;
                case 1030198775:
                    a.i("yoCopy", yo.getCtx(), 0);
                    str2 = "ۘۗۡۘۜ۟ۛ۠ۜ۬ۗ۬ۦۖۚۙۧۛۤۦۦۘ";
                    break;
            }
        }
    }

    public static void clickcopytext(TextView textView) {
        String str = "ۧ۬ۘۚۖۥۨۡۜۦ۬ۜۡۦۡۘۦۨۘۘ";
        while (true) {
            switch ((str.hashCode() ^ 647) ^ 1527626304) {
                case -1317369440:
                    str = "ۘۥۡۢۢ۬ۧۖۘۘ۠ۛۨۥۖۘۦۨۡ۠ۘۨۨۢ۫۬۫ۘ";
                    break;
                case -1265989347:
                    textView.setOnClickListener(new s(2, textView.getText().toString()));
                    str = "ۢۘۜ۬ۥۜۘۧۥۥۘۧۢۘۢۨۗۚۜ۟ۙ۬۫";
                    break;
                case 1510355644:
                    return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        r0 = "ۜ۬ۚ۟۫۬ۥۢۡۘ۟ۗ۬ۤۨ۠";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void initTE(android.widget.TextView r4) {
        /*
            java.lang.String r0 = "ۙۚۦۜ۫ۛۧۚۘۘۛۘۡۘ۫ۨۜۡۧۨۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 182(0xb6, float:2.55E-43)
            r3 = 85167267(0x5138ca3, float:6.937738E-36)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1721431346: goto L_0x005b;
                case -344862169: goto L_0x0067;
                case 417036178: goto L_0x0011;
                case 667353507: goto L_0x0036;
                case 1945756515: goto L_0x0014;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "ۤۘۖۘۜۜ۟ۗۢۡۖ۬ۧۨۜۖۘۡۤۜۘۜۘۨۨۦۧ"
            goto L_0x0002
        L_0x0014:
            r1 = -1142840372(0xffffffffbbe1a3cc, float:-0.006885981)
            java.lang.String r0 = "ۨ۬ۥۘۥۛۜۘ۬ۨۡۘۡۦۖۘۛۦ۫"
        L_0x0019:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1967514661: goto L_0x0033;
                case -1783775749: goto L_0x0044;
                case -1654260911: goto L_0x0028;
                case -1355062602: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0019
        L_0x0022:
            java.lang.String r0 = "ۘۚۨۘ۠ۗۚۛۙ۬ۢۢۖۘۚۚۧۗۧۖۧ۠"
            goto L_0x0019
        L_0x0025:
            java.lang.String r0 = "۬ۦۦ۬ۚۤۘ۫ۙ۬ۙۦۘۨۘ۫۬ۦۜۘۙۤۦ۫ۦۗ"
            goto L_0x0019
        L_0x0028:
            int r0 = r4.getPaddingRight()
            r2 = 8
            if (r0 <= r2) goto L_0x0025
            java.lang.String r0 = "ۡۛۘۘۖۚۤ۬ۖ۫ۦۤۘۘۗۗۢۨۥ۠"
            goto L_0x0019
        L_0x0033:
            java.lang.String r0 = "ۙۥۙ۫ۛۘۘۢ۬ۙۚۦۜۨۗۥۘۘۛۥۘ"
            goto L_0x0002
        L_0x0036:
            r1 = -1870604728(0xffffffff9080d648, float:-5.081725E-29)
            java.lang.String r0 = "۟ۗ۬۬ۙ۟ۛ۫ۚۡۥۖۧ۠ۗۛۖۦۘ"
        L_0x003b:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1720706901: goto L_0x0055;
                case -1305385728: goto L_0x0044;
                case -1302048915: goto L_0x004a;
                case -1254176498: goto L_0x0058;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x003b
        L_0x0044:
            java.lang.String r0 = "ۜ۬ۚ۟۫۬ۥۢۡۘ۟ۗ۬ۤۨ۠"
            goto L_0x0002
        L_0x0047:
            java.lang.String r0 = "ۚۨ۟ۤ۫۟ۗۘ۠ۚ۬ۨۘۜۙۡۘۚ۠ۘۨ۫۫۠ۨۜۘ"
            goto L_0x003b
        L_0x004a:
            int r0 = r4.getId()
            int r2 = f107a
            if (r0 != r2) goto L_0x0047
            java.lang.String r0 = "ۗ۫ۤۘۖۤ۟ۘ۠ۗۛۨۘۡ۟ۦ"
            goto L_0x003b
        L_0x0055:
            java.lang.String r0 = "ۗۙۢ۬ۜ۬ۦۡ۬۬ۢۦۛۢۨ"
            goto L_0x003b
        L_0x0058:
            java.lang.String r0 = "ۚۤ۬۬ۥۖۘۖ۫ۘ۫۬ۢۙۖۥۘۨۨۦ"
            goto L_0x0002
        L_0x005b:
            c.c r0 = new c.c
            r1 = 4
            r0.<init>(r4, r1)
            r4.setOnClickListener(r0)
            java.lang.String r0 = "ۜ۬ۚ۟۫۬ۥۢۡۘ۟ۗ۬ۤۨ۠"
            goto L_0x0002
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.tf.initTE(android.widget.TextView):void");
    }

    public static void myFace(TextView textView) {
        String str = "ۨۙۗۜۜۡۘۜۦۖۤۗ۬ۤ۟ۙۜۥۡ۫ۤۜۘۖۡۦۘ";
        while (true) {
            try {
                switch (str.hashCode() ^ 280518136) {
                    case -1825066319:
                        return;
                    case -1517030261:
                        String str2 = "ۜۧۖ۬ۘۛۨۙۢ۟۟ۙۥۘۚۧۜ۟ۤ۟۠ۧۥۚ";
                        while (true) {
                            switch (str2.hashCode() ^ -1245879155) {
                                case -1955904908:
                                    str2 = "۫ۡ۫ۡۢۥۦۖۛۛۙۘ۠۫ۤۛۚۛۛ";
                                    break;
                                case -1530865207:
                                    textView.setTypeface(shp.a(l1.f800a));
                                    return;
                                case -1399923605:
                                    if (!shp.f878e.equals("0")) {
                                        str2 = "ۗۧۚ۟ۖۙۥۜ۫ۡ۬ۖۘۥۧۦ۫ۢۥۢۨۧۘ۫ۡۜۘۙ۟ۦ";
                                        break;
                                    } else {
                                        str2 = "۟ۨۨۘۦۦۥۘۡۖ۫ۖۜۢۧۤۗۚۛۛۡ۟۫ۡۘ۫";
                                        break;
                                    }
                                case 1748667927:
                                    return;
                            }
                        }
                        break;
                    case 1521395571:
                        str = "۫ۘۧۤ۟ۥۥۘۜۘۛۡۙۦ۬ۛۙۜۛ۠ۢ۬";
                        break;
                    case 1919214350:
                        if (shp.f878e.equals("Default")) {
                            str = "۬ۥ۟ۛ۫ۡ۬۠ۧ۠ۤۡۘۖۨۨۘ۠ۨۦۘ۫ۤۚ۬ۛۤۖۥ۫";
                            break;
                        } else {
                            str = "ۙۨۘۤۢۚۧۦۘۨۧۜۨ۠ۚ";
                            break;
                        }
                }
            } catch (Exception e2) {
                return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0095 A[SYNTHETIC, Splitter:B:40:0x0095] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x007c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0035 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void names(android.widget.TextView r5, android.graphics.Typeface r6) {
        /*
            r4 = 1
            r1 = -543610936(0xffffffffdf9927c8, float:-2.2072019E19)
            java.lang.String r0 = "۟ۖ۬۟۟ۦۛۨ۟ۧۙۘۢۧۖۘۘ۬ۗ"
        L_0x0006:
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x0086 }
            r2 = r2 ^ r1
            switch(r2) {
                case -1945237316: goto L_0x0022;
                case -1684651156: goto L_0x0030;
                case 624441224: goto L_0x001f;
                case 1118962335: goto L_0x000f;
                default: goto L_0x000e;
            }     // Catch:{ Exception -> 0x0086 }
        L_0x000e:
            goto L_0x0006
        L_0x000f:
            java.lang.String r0 = com.obwhatsapp.yo.shp.f878e     // Catch:{ Exception -> 0x0086 }
            java.lang.String r2 = "Default"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0086 }
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "۫ۘۨۘ۟۟ۖۘۢۜ۟ۜ۟ۧۘ۬۟ۙۦۚ"
            goto L_0x0006
        L_0x001c:
            java.lang.String r0 = "ۚۢۧۢۙۙۧۛۦۘۢۖ۠ۚ۬ۨۘۖۧۧ۠ۨۨ۬ۥۜۘ"
            goto L_0x0006
        L_0x001f:
            java.lang.String r0 = "ۗۙۢۧۙۦۗۖۢۖۘۚۚۥۙۖ۬ۜۘۡۗۧۥۡۨۘۚۥۥ"
            goto L_0x0006
        L_0x0022:
            r1 = 1922263232(0x729368c0, float:5.839479E30)
            java.lang.String r0 = "ۚۛ۠ۦۜۗۤۘۨۘۘۧ۟۫ۥۘۙۙۖۚۡ۫ۢ۬ۛ"
        L_0x0027:
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x0086 }
            r2 = r2 ^ r1
            switch(r2) {
                case -1532521364: goto L_0x0053;
                case -1168079966: goto L_0x0030;
                case 1200590683: goto L_0x0056;
                case 1397629199: goto L_0x0046;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0027
        L_0x0030:
            r1 = 964642203(0x397f459b, float:2.4344625E-4)
            java.lang.String r0 = "ۦۚۦ۠ۙۢۥۤۡۘۗۦ۬ۧۚۨۧۘ"
        L_0x0035:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1775564026: goto L_0x0095;
                case -1507994291: goto L_0x003e;
                case 1345230558: goto L_0x0092;
                case 1404021316: goto L_0x007c;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0035
        L_0x003e:
            if (r6 == 0) goto L_0x008f
            java.lang.String r0 = "۬ۙۡۘۘ۫ۡۢ۟ۜۘۛۥۘۘۗۥ۠"
            goto L_0x0035
        L_0x0043:
            java.lang.String r0 = "ۚۤۡۘۘۘۘۙۛۨۦ۬ۤۜ۠ۙ۠ۙۖۘۛۗۘ"
            goto L_0x0027
        L_0x0046:
            java.lang.String r0 = com.obwhatsapp.yo.shp.f878e     // Catch:{ Exception -> 0x0086 }
            java.lang.String r2 = "0"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0086 }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "ۢۛۥۘۘ۠ۘۘ۠۬ۦۨ۫ۘۘ۬ۚۦۥۤۙۜۙۘۘۘۦ۟۬ۜۥ"
            goto L_0x0027
        L_0x0053:
            java.lang.String r0 = "ۧۥۗ۬ۤۛ۟ۦۘۥۥۨۘۦ۫ۨۘۚۡۥ۬ۜ"
            goto L_0x0027
        L_0x0056:
            com.obwhatsapp.yo.l1 r1 = com.obwhatsapp.yo.l1.f801b     // Catch:{ Exception -> 0x0086 }
            r2 = -236886548(0xfffffffff1e165ec, float:-2.232235E30)
            java.lang.String r0 = "ۘۙۥۘ۫۬ۙۤ۬۠ۥ۬۬ۦۤۤۖۚۥ۬ۢ۟ۚۙ۟ۖۚ"
        L_0x005d:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x0086 }
            r3 = r3 ^ r2
            switch(r3) {
                case -1958460356: goto L_0x0072;
                case -384007480: goto L_0x0075;
                case 489988715: goto L_0x0066;
                case 912591513: goto L_0x007d;
                default: goto L_0x0065;
            }     // Catch:{ Exception -> 0x0086 }
        L_0x0065:
            goto L_0x005d
        L_0x0066:
            android.graphics.Typeface r0 = com.obwhatsapp.yo.shp.a(r1)     // Catch:{ Exception -> 0x0086 }
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = "۫ۜۖۧۜۦۨۖۛ۟ۘ۫ۦۥ"
            goto L_0x005d
        L_0x006f:
            java.lang.String r0 = "ۗۗۖ۬ۤۦۨۚۗۖۥۥۧۖۛۨۗۛۦ۬ۢۗۥۖۘۚۧۥ"
            goto L_0x005d
        L_0x0072:
            java.lang.String r0 = "ۢۦۧۘۚۖۖۘ۠۬ۦۧۙۥۢۘۡۨۜۧۘ"
            goto L_0x005d
        L_0x0075:
            android.graphics.Typeface r0 = com.obwhatsapp.yo.shp.a(r1)     // Catch:{ Exception -> 0x0086 }
            r5.setTypeface(r0)     // Catch:{ Exception -> 0x0086 }
        L_0x007c:
            return
        L_0x007d:
            android.graphics.Typeface r0 = r5.getTypeface()     // Catch:{ Exception -> 0x0086 }
            r1 = 1
            r5.setTypeface(r0, r1)     // Catch:{ Exception -> 0x0086 }
            goto L_0x007c
        L_0x0086:
            r0 = move-exception
            android.graphics.Typeface r0 = r5.getTypeface()
            r5.setTypeface(r0, r4)
            goto L_0x007c
        L_0x008f:
            java.lang.String r0 = "ۥۚۧۛۡۗ۫ۖۨۢۙۦۘۦۥۥ"
            goto L_0x0035
        L_0x0092:
            java.lang.String r0 = "ۧۖۧ۟ۥ۠۠ۨۤۧۧۡۘۙۨۖۘۦۢۚۚۙۖۘۛۦۥ"
            goto L_0x0035
        L_0x0095:
            r5.setTypeface(r6)     // Catch:{ Exception -> 0x0086 }
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.tf.names(android.widget.TextView, android.graphics.Typeface):void");
    }

    public static void setTextIsSelectable(TextView textView, boolean z2) {
        String str = "ۚ۠ۥۘ۟ۤۦۚۦۡۘۢۥۡۘۦۢۘۘۜۗۢۨ۬ۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 714) ^ 197787152) {
                case -1784321696:
                    str = "ۘۚۜ۟۬ۡۗۘۧۙ۫ۧۘۨ۟ۛۢ";
                    break;
                case -663084905:
                    str = "ۖۙۜۤۤۦۘۜۙۧۚۚۙ۠۫ۥۘۜۡۥۗ۬۫ۜۥ۠";
                    break;
                case -359870509:
                    textView.setTextIsSelectable(z2);
                    str = "ۘۗۢۥۢۘۦۨۙ۟ۢۨ۠ۦ۬ۤۧۦۘۤ۠ۧ";
                    break;
                case 2028942988:
                    return;
            }
        }
    }

    public String a() {
        String str = "۠ۚ۬ۢۘۗ۟۟ۘۘۢ۬ۦۘۧۘۨ۬۠۫";
        while (true) {
            switch ((str.hashCode() ^ 53) ^ 1917006494) {
                case -1524685073:
                    return getText().toString();
                case -603880768:
                    str = "ۦۨۗۤۤۛۡۛۨ۟ۖۤۧۥۤۛۘۨۘۖ۫ۧ";
                    break;
            }
        }
    }
}
