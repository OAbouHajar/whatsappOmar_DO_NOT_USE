package m;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.task.utils;
import com.obwhatsapp.youbasha.ui.YoSettings.Themes;
import com.obwhatsapp.youbasha.ui.lockV2.LockOptions;
import com.obwhatsapp.youbasha.ui.lockV2.LockUtils;
import com.obwhatsapp.youbasha.ui.lockV2.locktypes.Pattern;
import com.obwhatsapp.youbasha.ui.lockV2.locktypes.Pin;
import java.io.File;
import rc.whatsapp.conversation.translateImageButton;

public final /* synthetic */ class m implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f1826a;

    /* renamed from: b  reason: collision with root package name */
    public final KeyEvent.Callback f1827b;

    /* renamed from: c  reason: collision with root package name */
    public final Cloneable f1828c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1829d;

    public /* synthetic */ m(KeyEvent.Callback callback, Cloneable cloneable, Object obj, int i2) {
        this.f1826a = i2;
        this.f1827b = callback;
        this.f1828c = cloneable;
        this.f1829d = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        Intent intent;
        int i3 = this.f1826a;
        Object obj = this.f1829d;
        Cloneable cloneable = this.f1828c;
        KeyEvent.Callback callback = this.f1827b;
        switch (i3) {
            case 0:
                Themes themes = (Themes) callback;
                String[] strArr = (String[]) cloneable;
                Spinner spinner = (Spinner) obj;
                String str = Themes.newFMThemes_folder;
                themes.getClass();
                try {
                    utils.restoreTheme(themes, themes.f1217b + File.separator + strArr[spinner.getSelectedItemPosition()]);
                    return;
                } catch (Exception e2) {
                    return;
                }
            case 1:
                Activity activity = (Activity) callback;
                Bundle bundle = (Bundle) cloneable;
                LockOptions lockOptions = (LockOptions) obj;
                String str2 = "ۛۨ۠ۛۡۡۨۡۥۖۧۢ۬ۥۛۧ";
                while (true) {
                    switch (str2.hashCode() ^ -258970985) {
                        case -1518590376:
                            str2 = "ۡۢۜۘ۟ۙۤ۫ۡۦۘۛۜۨۧۦۘ";
                            continue;
                        case -523807611:
                            if (i2 != 0) {
                                str2 = "۬ۗۧ۫ۡۘۘۡۤۜۚۦۢۘۘ";
                                break;
                            } else {
                                str2 = "ۤۥۡۚۜۙۡ۟ۦۡۛۛۨۦۘ";
                                continue;
                            }
                        case 1528022640:
                            String str3 = "۫ۘۘۘۦۙۖۜۖۘۥ۫ۡۘۖ۟ۦۢۙۘ";
                            while (true) {
                                switch (str3.hashCode() ^ 218823971) {
                                    case -362186742:
                                        if (i2 != 1) {
                                            str3 = "ۜ۬ۦۘ۟ۡۖۘۢۛۖۘۧۜۖۘ۠ۦۧۘۖ۟ۙۘ۠";
                                            break;
                                        } else {
                                            str3 = "ۨۚۨۖۛۘۜۦۖۥۘۗۜۛۨۘۜۙۘۘ";
                                            continue;
                                        }
                                    case 735286378:
                                        str3 = "ۦ۫۬۠ۥ۫ۗۢۨۚ۫ۖۧۦ۬۫۬ۧۙۦۖۘ";
                                        continue;
                                    case 1107192354:
                                        intent = new Intent(activity, Pin.class);
                                        break;
                                    case 1586316396:
                                        String str4 = "۬۟ۚ۟ۚۨۖ۟ۨۖۚۗۤۨۘۘۧۛ";
                                        while (true) {
                                            switch (str4.hashCode() ^ -1167551688) {
                                                case -2097656430:
                                                    str4 = "۫ۦۡۤۗۦۥ۟ۘۧۛۦۘۜۘ۫ۙۜۘۖۘۙ۠۠ۖۨۢۦ";
                                                    break;
                                                case 787089834:
                                                    if (i2 == 2) {
                                                        str4 = "ۨۛۦۢۦۘۜۤۜۘۜۨۦۘۛۙۘ";
                                                        break;
                                                    } else {
                                                        str4 = "۫ۤۛ۬ۘۛۖۖۗۡۧۜ۫ۗۢۢۖۨ";
                                                        break;
                                                    }
                                                case 866304015:
                                                    String str5 = "۬ۗۡۙۚۡۘۡۤۨۘ۬ۥۧۦۙۥۛۥۘ";
                                                    while (true) {
                                                        switch (str5.hashCode() ^ 575082469) {
                                                            case -1361625436:
                                                                Toast.makeText(activity, yo.getString("fingerprint_error_no_fingerprints"), 1).show();
                                                                return;
                                                            case -1078140404:
                                                                if (utils.hasFingerprintRegistered()) {
                                                                    str5 = "ۜۦۧۘۛۛۜۘۦۗۚۙ۫ۤۖۢۡۘۛۨ۠";
                                                                    break;
                                                                } else {
                                                                    str5 = "ۦۨۚۥۧۨۨۘۘ۟ۖۧۘۤۖۥۘۧۜۧۘۦۧۧۛ";
                                                                    break;
                                                                }
                                                            case -294946105:
                                                                str5 = "ۘ۠ۥۜ۫ۘۨ۬ۢۤ۠۟ۨۗۡۘۘۦۜۘ";
                                                                break;
                                                            case -122098507:
                                                                LockUtils.changeLockForJID(lockOptions.getJID(), LockUtils.FINGERPRINT_LOCK);
                                                                return;
                                                        }
                                                    }
                                                    break;
                                                case 1710594984:
                                                    return;
                                            }
                                        }
                                        break;
                                }
                            }
                            break;
                        case 1555639197:
                            intent = new Intent(activity, Pattern.class);
                            break;
                    }
                }
                activity.startActivity(intent.putExtra("lockoptions", bundle));
                return;
            default:
                translateImageButton translateimagebutton = (translateImageButton) callback;
                int i4 = translateImageButton.f2478c;
                translateimagebutton.getClass();
                translateimagebutton.f2480b = ((String[]) cloneable)[i2];
                translateimagebutton.b((View) obj);
                return;
        }
    }
}
