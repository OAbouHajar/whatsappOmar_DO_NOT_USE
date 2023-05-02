package m;

import android.content.Intent;
import android.os.Environment;
import android.preference.Preference;
import com.obwhatsapp.yo.g;
import com.obwhatsapp.youbasha.filechooser.ChooserDialog;
import com.obwhatsapp.youbasha.ui.YoSettings.IconChoose;
import com.obwhatsapp.youbasha.ui.YoSettings.UniversalStyle;

public final /* synthetic */ class o implements Preference.OnPreferenceClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f1833a;

    /* renamed from: b  reason: collision with root package name */
    public final UniversalStyle f1834b;

    public /* synthetic */ o(UniversalStyle universalStyle, int i2) {
        this.f1833a = i2;
        this.f1834b = universalStyle;
    }

    public final boolean onPreferenceClick(Preference preference) {
        UniversalStyle universalStyle = null;
        String str = "ۘ۬ۚۢۤ۫ۗۤ۫ۗ۟ۘۘۢ۬ۢ۟۫ۡۗۢۦ";
        int i2 = 0;
        while (true) {
            switch ((str.hashCode() ^ 139) ^ 2098903429) {
                case -2017680657:
                    universalStyle.getClass();
                    str = "۬ۤۛ۫ۤۢۢ۫ۨۙ۬۬ۚۗۡۧۜۡۘۦۤۛ";
                    break;
                case -923900319:
                    String str2 = UniversalStyle.f1224h;
                    str = "۬ۤۗ۠ۤ۬ۧۧۨۦۛۖۛۘۘۙۡۢ";
                    break;
                case -642740573:
                    universalStyle.getClass();
                    str = "۬ۗۗۨۜۚۢۡۧۘ۬۠ۦۘۤۦۦۘۤ۬ۚۜۨ";
                    break;
                case -555734805:
                    str = "۬ۦۦ۟ۤ۫ۚ۫ۡ۫۫ۡۖۡۥۡ۫ۨۘۥۡۜۡ۠ۧ";
                    break;
                case -58160930:
                    str = "ۨ۠ۜۘۗۛۜۘۛۨۘۛۜ۬ۢ۬ۨۨۥۖ";
                    break;
                case 248125013:
                    universalStyle = this.f1834b;
                    str = "ۨۦۡۖ۬ۖۙۤۙ۬ۧۗۚۥۘۥۗ";
                    break;
                case 283156738:
                    String str3 = UniversalStyle.f1224h;
                    str = "ۧۦۛۧۦ۬ۥۚۥۘۗۨ۬ۦۘۡ";
                    break;
                case 289577108:
                case 1720852992:
                    return true;
                case 656333493:
                    str = "ۚۚۖۜۨۘ۬ۗۖ۬ۡۜۘۜۜ۫۬ۧۘۘۙۛۧ";
                    break;
                case 1085668547:
                    universalStyle.startActivity(new Intent(universalStyle, IconChoose.class));
                    str = "ۡۥۤۖۜ۬۟ۢۦۘۡۡۦۘۙۘۜۦ۠ۨۘۧۤۖۚۥۘ";
                    break;
                case 1215333050:
                    switch (i2) {
                        case 0:
                            str = "ۢ۫ۘۘۗۨۜۛۥۚۚۘۢۧۢ۫ۦ";
                            break;
                        default:
                            str = "۟۠۬ۢۜۜۖۥ۫ۚ۬ۡۘۛ۫ۧۗۥۢۗ۬۠ۢۖۧۘۗۢ";
                            break;
                    }
                case 1365070879:
                    i2 = this.f1833a;
                    str = "۫ۤۖ۬ۡۗۤۨۙۗۛۤۢۖۡۘ";
                    break;
                case 2077918356:
                    new ChooserDialog().with(universalStyle).withFilterRegex(false, false, ".*\\.(ttf|otf)").withStartFile(Environment.getExternalStorageDirectory().getPath()).withChosenListener(new g(universalStyle, 3)).build().show();
                    str = "ۖۢۜۘۜۧۜۘۡۜ۫ۛۨۘۢ۠ۦۘ";
                    break;
            }
        }
    }
}
