package c;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;
import com.cat.ereza.customactivityoncrash.CustomActivityOnCrash;
import com.cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.yo.ChatGenSingle;
import com.obwhatsapp.yo.ColorPref;
import com.obwhatsapp.yo.CustomAlertDialogBuilder;
import com.obwhatsapp.yo.SS;
import com.obwhatsapp.yo.e;
import com.obwhatsapp.yo.p0;
import com.obwhatsapp.yo.tf;
import com.obwhatsapp.yo.x;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.colorPicker.HexSelectorView;
import com.obwhatsapp.youbasha.task.utils;
import com.obwhatsapp.youbasha.ui.YoSettings.About;
import com.obwhatsapp.youbasha.ui.YoSettings.BasePreferenceActivity;
import com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity;
import com.obwhatsapp.youbasha.ui.YoSettings.Support;
import com.obwhatsapp.youbasha.ui.YoSettings.UniversalColors;
import com.obwhatsapp.youbasha.ui.activity.FMNewsActivity;
import com.obwhatsapp.youbasha.ui.lockV2.LockBaseActivity;
import com.obwhatsapp.youbasha.ui.lockV2.locktypes.Pattern;
import com.obwhatsapp.youbasha.ui.lockV2.locktypes.Pin;
import com.obwhatsapp.youbasha.ui.themeserver.OnThemesActivity;
import java.util.ArrayList;
import rc.whatsapp.conversation.translateImageButton;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f186a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f187b;

    public /* synthetic */ c(Object obj, int i2) {
        this.f186a = i2;
        this.f187b = obj;
    }

    public final void onClick(View view) {
        String str;
        int i2 = this.f186a;
        Object obj = this.f187b;
        switch (i2) {
            case 0:
                DefaultErrorActivity defaultErrorActivity = (DefaultErrorActivity) obj;
                int i3 = DefaultErrorActivity.f219a;
                defaultErrorActivity.getClass();
                ((TextView) new CustomAlertDialogBuilder(defaultErrorActivity).setTitle((CharSequence) "Error Details").setMessage((CharSequence) CustomActivityOnCrash.getAllErrorDetailsFromIntent(defaultErrorActivity, defaultErrorActivity.getIntent())).setPositiveButton((CharSequence) "Close", (DialogInterface.OnClickListener) null).setNeutralButton((CharSequence) "Copy", (DialogInterface.OnClickListener) new d(defaultErrorActivity, 0)).show().findViewById(yo.getID("message", "id"))).setTextSize(0, defaultErrorActivity.getResources().getDimension(yo.getID("customactivityoncrash_error_activity_error_details_text_size", "dimen")));
                return;
            case 1:
                ChatGenSingle chatGenSingle = ((e) obj).f754b;
                chatGenSingle.f477b.A0Z(chatGenSingle.f476a.size() - 1);
                return;
            case 2:
                int i4 = ColorPref.RESETBTN_COLOR_CODE;
                ((ColorPref) obj).onClick();
                return;
            case 3:
                ArrayList arrayList = SS.f556c;
                p0.saveOptions((View) obj);
                return;
            case 4:
                int i5 = tf.f107a;
                tf.b(((TextView) obj).getText().toString());
                return;
            case 5:
                HexSelectorView hexSelectorView = (HexSelectorView) obj;
                int i6 = HexSelectorView.f983e;
                hexSelectorView.getClass();
                try {
                    String obj2 = hexSelectorView.f984a.getText().toString();
                    String str2 = "ۛ۫ۦۘ۠۬ۚۙ۟ۜ۫ۖۙۡۖۥۘۙۙۥ";
                    while (true) {
                        switch (str2.hashCode() ^ 1643519640) {
                            case 493463780:
                                break;
                            case 696445798:
                                obj2 = obj2.substring(2);
                                break;
                            case 764020744:
                                str2 = "ۖۙۖۘۢۜۤۡۨۡۘۗۨۗ۟ۛۥۦۜۘۥ۬ۡ";
                                continue;
                            case 890075809:
                                if (!obj2.startsWith("0x")) {
                                    str2 = "ۤۚۡۡ۫ۛ۬ۛۡۘۦۚۖ۠ۖۨ";
                                    break;
                                } else {
                                    str2 = "ۘۘۛۧۤۦ۠ۗ۫۫۠ۘۘ۠ۡۥۘۡ۟ۦۘۙۨۖۘ";
                                    continue;
                                }
                            default:
                                continue;
                        }
                    }
                    String str3 = "ۗۦۘۘۢ۟۠ۦ۬ۘۘۨ۠ۜۚۛۤۚۦۘۖ۬ۖۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -1185826079) {
                            case -1409464577:
                                break;
                            case 276604025:
                                obj2 = obj2.substring(1);
                                break;
                            case 1229310692:
                                str3 = "ۗۤۦۘۨۘ۫۠ۚۢۧۢۗ۫ۚۘۗۤۜۘۘۘ۫ۖۜۨۚۡۘ";
                                continue;
                            case 2091924682:
                                if (!obj2.startsWith("#")) {
                                    str3 = "ۘۗۜۘۡۘ۬ۥ۫ۘۘۤۛ۟ۧۘۗ";
                                    break;
                                } else {
                                    str3 = "ۥ۬ۤۤ۫ۜۘۗۥۘۘۧۡۘ۠۟ۨۡۨۘۚۦۦۤۦۚۢ۠ۙ";
                                    continue;
                                }
                            default:
                                continue;
                        }
                    }
                    String str4 = "ۘۦۥۘۘۚۘۘۛۘۖۘ۬ۖ۬ۙۡۦۙ۫۟ۥۘۡۧ۫ۥۘۢۚ۟";
                    while (true) {
                        switch (str4.hashCode() ^ -1565519747) {
                            case -607632276:
                                if (obj2.length() == 6) {
                                    str4 = "ۜۘۧۦۨۘۗۥۥۘۢۢۗۖۥۦۘ";
                                    break;
                                } else {
                                    str4 = "ۘۘۤۜۛۢۨۥۧۘۗۦۦۛۚۥۘۙۤۘۥۡۦ";
                                    continue;
                                }
                            case -360518517:
                                str = "FF".concat(obj2);
                                break;
                            case -223025359:
                                str4 = "ۦۘۜ۟ۨۘ۫۫۫ۦۥ۠ۦۚ۟ۡۗۖۙۜۦۘۥ۬ۢ";
                                continue;
                            case 221874916:
                                str = obj2;
                                break;
                            default:
                                continue;
                        }
                    }
                    String str5 = "۠ۖۧۘۗۧۛۛۨ۬ۤۖۘۥۚۘۘۡۦۥۜ۠ۢۜ۠ۡ";
                    while (true) {
                        switch (str5.hashCode() ^ 1444950048) {
                            case -989605028:
                                str5 = "ۚۗۡۦۖۘۛۦۘۜۙۗۘ۬ۡۘۚۙ۫۠ۡۘۗۙ۬";
                                break;
                            case 784302019:
                                hexSelectorView.f985b = (int) Long.parseLong(str, 16);
                                hexSelectorView.f986c.setVisibility(8);
                                HexSelectorView.OnColorChangedListener onColorChangedListener = hexSelectorView.f987d;
                                String str6 = "ۚۢۧ۫ۖۡۘۚۨۗۦ۟ۦۘۧۨۨۗۦۥۤۡۘۛ۟";
                                while (true) {
                                    switch (str6.hashCode() ^ 1276378544) {
                                        case -1131713779:
                                            if (onColorChangedListener == null) {
                                                str6 = "ۧ۬ۚۨ۬ۧ۬ۧۢۘ۬ۖۖ۠ۥۘ";
                                                break;
                                            } else {
                                                str6 = "ۤۡۥۘۖۖۖۖۜ۟ۡۗۡۘ۫ۖۦۛۨۡۙ۠";
                                                break;
                                            }
                                        case -899428208:
                                            str6 = "ۤ۟ۖۗۗۥۜۘۘۥۧۜۢۘۖۛۜۘۢۚۨۘ";
                                            break;
                                        case 1495075671:
                                            onColorChangedListener.colorChanged(hexSelectorView.getColor());
                                            return;
                                        case 2128571414:
                                            return;
                                    }
                                }
                                break;
                            case 1557864575:
                                if (str.length() != 8) {
                                    str5 = "ۧۦۨۦۨۧۘۤۤ۟۠ۨۘۜۘۡۘۚۨۖۘ";
                                    break;
                                } else {
                                    str5 = "۬ۨ۬ۗ۟ۙ۠ۚۧۤۦ۟ۦۥۧۘۜۙۚ";
                                    break;
                                }
                            case 1970463504:
                                throw new Exception();
                        }
                    }
                } catch (Exception e2) {
                    hexSelectorView.f986c.setVisibility(0);
                    return;
                }
                break;
            case 6:
                About about = (About) obj;
                int i7 = About.f1137b;
                about.getClass();
                try {
                    CustomAlertDialogBuilder customAlertDialogBuilder = new CustomAlertDialogBuilder(about);
                    customAlertDialogBuilder.setTitle((CharSequence) "Credits");
                    WebView webView = new WebView(about);
                    webView.loadUrl("file:///android_asset/credits.html");
                    customAlertDialogBuilder.setView((View) webView);
                    customAlertDialogBuilder.setNegativeButton(17039370, (DialogInterface.OnClickListener) new x(15));
                    customAlertDialogBuilder.show();
                    return;
                } catch (Exception e3) {
                    Toast.makeText(about, "WebView component not available", 1).show();
                    return;
                }
            case 7:
                int i8 = BasePreferenceActivity.f1143d;
                ((BasePreferenceActivity) obj).onBackPressed();
                return;
            case 8:
                boolean z2 = BaseSettingsActivity.mustRestart;
                ((BaseSettingsActivity) obj).onBackPressed();
                return;
            case 9:
                Support support = (Support) obj;
                int i9 = Support.f1216b;
                support.getClass();
                try {
                    utils.openLink(support, Deobfuscator$app$Custom.getString(-31312952262081L));
                    return;
                } catch (ActivityNotFoundException e4) {
                    utils.openLink(support, Deobfuscator$app$Custom.getString(-31480455986625L));
                    return;
                }
            case 10:
                UniversalColors universalColors = (UniversalColors) obj;
                int i10 = UniversalColors.f1219f;
                universalColors.getClass();
                String string = yo.getString("solid_color_wallpaper");
                String string2 = yo.getString("yoGradientTitle");
                String string3 = yo.getString("conversations_most_recent_image");
                CustomAlertDialogBuilder customAlertDialogBuilder2 = new CustomAlertDialogBuilder(universalColors);
                AlertDialog.Builder title = customAlertDialogBuilder2.setTitle((CharSequence) yo.getString("abc_action_menu_overflow_description"));
                d dVar = new d(universalColors, 15);
                title.setItems(new CharSequence[]{string, string2, string3}, dVar);
                customAlertDialogBuilder2.create().show();
                return;
            case 11:
                int i11 = FMNewsActivity.f1243h;
                ((FMNewsActivity) obj).onBackPressed();
                return;
            case 12:
                String str7 = LockBaseActivity.lockWallPath;
                ((LockBaseActivity) obj).onBackPressed();
                return;
            case 13:
                int i12 = Pattern.f1286c;
                ((Pattern) obj).reset_lock();
                return;
            case 14:
                int i13 = Pin.f1289i;
                ((Pin) obj).reset_lock();
                return;
            case 15:
                String str8 = OnThemesActivity.f1334d;
                ((OnThemesActivity) obj).onBackPressed();
                return;
            default:
                int i14 = translateImageButton.f2478c;
                ((translateImageButton) obj).b(view);
                return;
        }
    }
}
