package m;

import a.a;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.youbasha.task.ZipManager;
import com.obwhatsapp.youbasha.task.utils;
import com.obwhatsapp.youbasha.ui.YoSettings.Themes;
import java.io.File;

public final /* synthetic */ class l implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final Themes f1823a;

    /* renamed from: b  reason: collision with root package name */
    public final EditText f1824b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1825c;

    public /* synthetic */ l(Themes themes, EditText editText, boolean z2) {
        this.f1823a = themes;
        this.f1824b = editText;
        this.f1825c = z2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        String sb;
        boolean z2;
        long j2;
        String str = Themes.newFMThemes_folder;
        Themes themes = this.f1823a;
        themes.getClass();
        String obj = this.f1824b.getText().toString();
        String f2 = a.f(new StringBuilder(), Themes.newFMThemes_folder, obj);
        StringBuilder g2 = a.g(f2);
        g2.append(Deobfuscator$app$Custom.getString(-33705249045953L));
        String sb2 = g2.toString();
        StringBuilder g3 = a.g(f2);
        g3.append(Deobfuscator$app$Custom.getString(-33726723882433L));
        String sb3 = g3.toString();
        String str2 = "ۗۢۤۤۦۤ۟ۨۚۙۗۢ۟۟";
        while (true) {
            switch (str2.hashCode() ^ -1711353861) {
                case 18146087:
                    sb = null;
                    break;
                case 318991719:
                    if (this.f1825c) {
                        str2 = "ۥۥۡۧ۠ۥۘۘ۠ۜۘۦۘۢۗۦۘۧۛۥۘۘۙۧ";
                        break;
                    } else {
                        str2 = "ۚۧۥۥۘۜۘۛۚۥۦ۠ۜ۫ۛۖۦۥۘۘۨۦۧۘۚۡۧۥۜۢ";
                        continue;
                    }
                case 824566414:
                    str2 = "ۙۖۦۘۗۡۧۚۢۦۥۢۘۘۙۚۙۤۡۧۘۢۚ۟ۘۦۡۘ۠۬۫";
                    continue;
                case 1404860119:
                    StringBuilder g4 = a.g(f2);
                    g4.append(Deobfuscator$app$Custom.getString(-33756788653505L));
                    sb = g4.toString();
                    break;
            }
        }
        utils.saveTheme(f2);
        try {
            String str3 = Themes.newFMThemes_folder + Deobfuscator$app$Custom.getString(-33245687545281L);
            File file = new File(str3);
            String str4 = "ۢۡ۟ۢۤۘۘۧۥۜۘۙۖۜۘ۫ۧۗۙ۫ۜ";
            while (true) {
                switch (str4.hashCode() ^ -425976985) {
                    case -1221730780:
                        str4 = "۫ۜ۠ۤ۠ۖۤۨۡۘ۫ۥۨۘۧ۠ۨۘۦۚۢۦۡۤ۠۠ۥۘۛ۫";
                        continue;
                    case -482471261:
                        if (!file.isDirectory()) {
                            str4 = "ۛۦۖۘۗۡۙۘۚۢۨۜۨۘۖۡۘۘۛۨۨۦ۫ۨۘ";
                            break;
                        } else {
                            str4 = "۠ۜ۫ۜۦۜۚۗۡۘ۠ۦۥۖۖ۠";
                            continue;
                        }
                    case 297977520:
                        file.mkdir();
                        break;
                    case 1548834399:
                        break;
                    default:
                        continue;
                }
            }
            z2 = ZipManager.zip(new String[]{sb2, sb3, sb}, str3 + obj + Deobfuscator$app$Custom.getString(-33292932185537L));
        } catch (Exception e2) {
            z2 = false;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(Deobfuscator$app$Custom.getString(-33804033293761L));
        String str5 = "ۜ۫ۚۚ۠ۡۘ۫ۢۡۤۨۚ۠ۢۨ۟ۗۜۘۦۖۘۨۙۥۘۢ۟۟";
        while (true) {
            switch (str5.hashCode() ^ 809682351) {
                case -1850627736:
                    j2 = -34237824990657L;
                    break;
                case -212389197:
                    if (z2) {
                        str5 = "ۨۙۦۢۤۗۨۛۗۤۢۤۢۗ۟ۗۖۡۘۦۡۛ";
                        break;
                    } else {
                        str5 = "ۘۛۦۘۥۧۜۘۨۙۘۘۨۖۖۘۤ۟ۖ";
                        continue;
                    }
                case 1114804077:
                    j2 = -34066026298817L;
                    break;
                case 2086607917:
                    str5 = "ۘۤ۠ۙۗۨۘۥۜۖۖۘۜۥ۫ۦۘۛۦ۫۬ۧۨ";
                    continue;
            }
        }
        sb4.append(Deobfuscator$app$Custom.getString(j2));
        Toast.makeText(themes, sb4.toString(), 1).show();
    }
}
