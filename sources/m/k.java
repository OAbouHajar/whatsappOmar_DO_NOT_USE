package m;

import android.content.DialogInterface;
import com.obwhatsapp.yo.CustomAlertDialogBuilder;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.x;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.ui.YoSettings.SecPrivacy;

public final /* synthetic */ class k implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final SecPrivacy f1821a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f1822b;

    public /* synthetic */ k(SecPrivacy secPrivacy, String[] strArr) {
        this.f1821a = secPrivacy;
        this.f1822b = strArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i2, boolean z2) {
        CharSequence[] charSequenceArr = SecPrivacy.f1199u;
        SecPrivacy secPrivacy = this.f1821a;
        secPrivacy.getClass();
        String str = this.f1822b[i2];
        shp.setBooleanPriv(str, z2);
        String str2 = "۠۠ۛ۫ۙۢ۠ۧ۠ۦۤۧۨۗۜۤۤۘ۬ۥۥۜۚۨۘ۬ۜۨۘ";
        while (true) {
            switch (str2.hashCode() ^ -679364737) {
                case -1978140925:
                    String str3 = "ۘۙۖۜۙۦۘۧ۠ۗۨ۟ۜۘۥۨۘۖۘۘۜۘۜۘۚۜ";
                    while (true) {
                        switch (str3.hashCode() ^ 1718487235) {
                            case -1228191917:
                                str3 = "ۘۗۢۙۢۨۘۛ۟ۛۘۛۡۘۨ۬ۨۘۖۜۦۘ";
                                continue;
                            case -436444538:
                                return;
                            case -284705822:
                                break;
                            case 2040534091:
                                if (str.contains("yoHidePlay")) {
                                    str3 = "۠ۙ۟۬۫ۛۘۧۗۙۦۗۜۧۘۖ۬ۨۘۜۦ۠۠ۛۦ";
                                    break;
                                } else {
                                    str3 = "ۤۦۘۨۘ۠ۦ۠ۨۤۢۦ۟ۜۗۥۛۛۙۧۢۖۘۛۗۘ";
                                    continue;
                                }
                        }
                    }
                    break;
                case -845799162:
                    break;
                case -784345141:
                    str2 = "ۖۢۘۘۙ۠ۗ۫ۚ۫ۗۡۡۧ۬ۘۘۚۛۜۘۡ۠ۗۢ۫ۜ";
                    continue;
                case -467503303:
                    if (!str.contains("yoHideReceipt")) {
                        str2 = "ۘ۬ۜۙۖۙۨۘۧۙۖۥۧ۫ۖۘۙۡۦۥۢۛۧۧ۟";
                        break;
                    } else {
                        str2 = "ۡ۬ۦۘۨۖۤ۬۠ۗۡۤۜۛۢۜۘۚۡ";
                        continue;
                    }
            }
        }
        String str4 = "ۨۙۨۘ۫ۧۥۘۨۢۥۘۚۚۥ۬ۛۘۘۘ۬ۘۙ۟ۗۜ۟";
        while (true) {
            switch (str4.hashCode() ^ 918201520) {
                case -1603854129:
                    try {
                        new CustomAlertDialogBuilder(secPrivacy).setTitle(17039380).setMessage((CharSequence) yo.getString("yoHideReceiptSumG")).setPositiveButton(17039370, (DialogInterface.OnClickListener) new x(19)).create().show();
                        return;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return;
                    }
                case -1238516297:
                    if (!z2) {
                        str4 = "ۘۥۡۘۘۚۚۛۨ۠ۚۥۦۜۧۜۘۥۛۘۗۧ۫ۖۙۡۡۨ۬";
                        break;
                    } else {
                        str4 = "ۘۧۨۘۢۡۚۨۙۜۘۖۜۤۥۦۙ۫ۧۘۡۨۡۘۡۡۧۘ";
                        break;
                    }
                case -970021064:
                    str4 = "ۘۡۧۚۤۡۘۗۢ۬ۨۤ۠ۜۤۡۨۧۦۡۤۥۦۤ۫ۤ۫ۡ";
                    break;
                case 816948307:
                    return;
            }
        }
    }
}
