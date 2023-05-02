package m;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.ui.YoSettings.IconChoose;

public final /* synthetic */ class g implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final IconChoose f1813a;

    /* renamed from: b  reason: collision with root package name */
    public final RadioGroup f1814b;

    public /* synthetic */ g(IconChoose iconChoose, RadioGroup radioGroup) {
        this.f1813a = iconChoose;
        this.f1814b = radioGroup;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
        IconChoose iconChoose = null;
        View view = null;
        int i3 = 0;
        PackageManager packageManager = null;
        PackageManager packageManager2 = null;
        int i4 = 0;
        String str = null;
        StringBuilder sb = null;
        int i5 = 0;
        int i6 = 0;
        String str2 = null;
        StringBuilder sb2 = null;
        String str3 = "ۖۜۚۦۤۖۘ۟ۖۚۡ۟ۧۦۢ۬۬ۖ۫ۙۚۚ";
        while (true) {
            switch ((str3.hashCode() ^ 456) ^ -1809244553) {
                case -2010690669:
                    sb2.append(yo.mpack);
                    str3 = "ۙۦ۠ۘۙۚۘۧ۬ۧۦۦۘۙۡ۫ۗۖۥ";
                    break;
                case -1985705508:
                    str3 = "ۢۦۧۘۦۙ۠ۥۘۖۧۖۡۘۚ۟۠ۘۖۨۘۚۡ۟";
                    i6 = i4;
                    break;
                case -1955510442:
                    packageManager2 = yo.getCtx().getPackageManager();
                    str3 = "ۧۛ۫ۗۦۙۖۚۨۘۛۙۜۙۛۥۘۡ۬۫ۘۧۗۧ۟ۨ";
                    break;
                case -1948907709:
                    sb.append(i6);
                    str3 = "ۛۘۛۥۙۤ۫ۥۘۜۨۘۗۧۦۘۗۜۖۘۥ۫ۨۘ۟ۖۘۘ";
                    break;
                case -1851179546:
                    packageManager.setComponentEnabledSetting(new ComponentName(str2, sb2.toString()), 1, 1);
                    str3 = "ۨۥۦۗۗۘۖۧۜۘۤ۠۫۟ۜۤۤ۫ۘۘۛۗۙۚۖۦ";
                    break;
                case -1841887241:
                    shp.setIntPriv("cIcon", i3);
                    str3 = "ۥ۫ۨۡ۬ۦۘ۫ۚ۫ۜۦۧ۟ۛ۬";
                    break;
                case -1719598239:
                    str2 = yo.mpack;
                    str3 = "ۜۦۚۥ۫ۘ۫۫ۖۘۛۦ۟ۙۢۖۙۧۦۘۚۚۖۘ";
                    break;
                case -1641845881:
                    str3 = "ۚۜۘۤ۬ۖ۬ۨ۫۟ۥۡۘۥۜۖۘۤۚۡ";
                    break;
                case -1443636104:
                    str3 = "ۢۦۧۘۦۙ۠ۥۘۖۧۖۡۘۚ۟۠ۘۖۨۘۚۡ۟";
                    break;
                case -1382914700:
                    sb2.append(".");
                    str3 = "ۢ۫ۘۘ۫۠ۨۘۡۡۗ۟ۧۨۨۥۤۡۛۤ۟ۘۚ۫ۖۧۥۘ";
                    break;
                case -1336212049:
                    Toast.makeText(iconChoose, "New Icon applied", 0).show();
                    str3 = "ۦۜ۫ۨۦۦۧۙۧۛۘۡۘۛۚۦۘ۠ۛ۬۠ۖۙ";
                    break;
                case -1334294292:
                    str = yo.mpack;
                    str3 = "ۙۢۧۢۚۧۦ۟ۖۘۖۙۥۗۗۥ";
                    break;
                case -1305824169:
                    i3 = this.f1814b.indexOfChild(view);
                    str3 = "۬۟۬ۘ۫ۢۚ۟ۢۥۡۦۥ۬ۗۡۢۙۗۗۙ";
                    break;
                case -1293337775:
                    packageManager = yo.getCtx().getPackageManager();
                    str3 = "ۙۜۘۘۘ۬۠ۗۘۥۥۧۦۡۡۜۖ۠ۡۘۖۧ۠ۚۦۛ۫ۥۗ";
                    break;
                case -989412432:
                    sb = new StringBuilder();
                    str3 = "ۗۘۡۘ۫۟۫۫۫ۡۘ۬ۗۗ۬ۖۛ";
                    break;
                case -958440831:
                    int i7 = IconChoose.f1197c;
                    str3 = "ۜۧۡۘۘۙ۫ۚۢ۬ۤۛۥۘۘ۠ۥۘۤۤۦۦۢ۠ۢۛۚۙۜ۫";
                    break;
                case -819141263:
                    str3 = "ۛۧۖۨۗ۫ۤۤۗۧ۟ۖۘۥ۫ۦۡ۟۫ۧۨ";
                    break;
                case -810633417:
                    return;
                case -718567337:
                    sb2.append(i3);
                    str3 = "ۡۢۡ۟ۤۘۘۧۛۤۦ۠ۧۨ۫ۜۘۜۙۜ۠ۦۘۦۚۡ";
                    break;
                case -12140455:
                    iconChoose = this.f1813a;
                    str3 = "ۜۛ۟ۧۧ۫ۧۥۖۙ۠ۜ۟ۨۘ۫۬۟ۚ۟۫";
                    break;
                case 220229961:
                    packageManager2.setComponentEnabledSetting(new ComponentName(str, sb.toString()), 2, 1);
                    str3 = "ۙۦۛ۟ۨۖۘۥۥۛ۬۠ۦۘۘۖۧۙۜۡۡۗۤۥۢ";
                    break;
                case 225636035:
                    i4 = 0;
                    str3 = "ۜ۠ۥۘۖۛۛۧ۟ۢۡ۬ۛۢۤ۠۟ۧۤ";
                    break;
                case 383104736:
                    sb2 = new StringBuilder();
                    str3 = "ۖۦۡۘۤۡ۬ۖۨۡۦۚ۟ۡۡۡۘۘۛ۬ۥۡ۬ۙۥۨۚ۬ۘۘ";
                    break;
                case 525346312:
                    sb.append(".");
                    str3 = "ۗۨۧۥۨۖۥۦۘۘ۬ۖۖۢۛۥۘۧ۟۫ۧ۬ۚ";
                    break;
                case 1336018672:
                    view = iconChoose.findViewById(i2);
                    str3 = "ۚۤۧۥ۟ۛۛۥۥۡۢ۫ۘۘۢۥ۟ۤۧۨۚۧۨۘۡ";
                    break;
                case 1361587076:
                    sb.append(yo.mpack);
                    str3 = "ۢ۠ۚۥ۟ۦۘۜ۫ۗۡۥۤۚ۬ۖۧۘۦۘۛۘۥۘۖۙۥۘۜ۠ۨ";
                    break;
                case 1460189777:
                    i5 = i6 + 1;
                    str3 = "ۚۘۦۘۙۨۢۚۡ۫ۥۛۛ۟ۚ۠۫ۚۨۘ";
                    break;
                case 1503515750:
                    iconChoose.finish();
                    str3 = "ۢۨۘۘۚ۬ۜۘ۫ۜۥ۬ۢۦۤ۬۫۠ۛ۟ۤۢۘۡۨۘ";
                    break;
                case 1636087999:
                    str3 = "ۨۤۥۘۛۥۨۘۛ۟ۢ۠۬ۘۗۖۨۖۖۘۡۦۜ۟۟ۧ۫ۥۡۘ";
                    i6 = i5;
                    break;
                case 1760486367:
                    String str4 = "۬ۛۦۘۗۤۘۘ۬۫ۗۙۡۚۨۨۢۛۧۖۥۡ";
                    while (true) {
                        switch (str4.hashCode() ^ -1727545002) {
                            case -223271146:
                                str3 = "۠۠ۨۘۖۛ۬۬ۖ۠ۨۡۦۘۙ۠ۤ۟۠ۚۚۧۘۘ";
                                continue;
                            case 1010782064:
                                str3 = "۬ۗۥ۬ۙۘۘۖۙ۟ۛ۟ۛۢۤۦۘ۠ۨۜ";
                                continue;
                            case 1469796771:
                                str4 = "ۦۧۦۛۨۚۜۙۦ۟۫ۗۢۜۤ";
                                break;
                            case 1601948090:
                                if (i6 > iconChoose.f1198b) {
                                    str4 = "ۜۘۗۚۤۡۨ۫ۥۘۗۤۜ۫ۤۜ";
                                    break;
                                } else {
                                    str4 = "۟ۜۘۨ۟ۘۜۨۧۘۡۘۙۧۗۥۘۦۧۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1882543122:
                    str3 = "۫ۨۜۙۗۨۘ۠ۡۧ۫ۨۜۘۨۦۜ۫ۖۙۨۤۖ";
                    break;
            }
        }
    }
}
