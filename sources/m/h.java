package m;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import c.d;
import com.obwhatsapp.yo.CustomAlertDialogBuilder;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.ui.YoSettings.SecPrivacy;
import com.obwhatsapp.youbasha.ui.lockV2.RecoveryQuestion;
import com.obwhatsapp.youbasha.ui.lockV2.locktypes.Pattern;
import com.obwhatsapp.youbasha.ui.lockV2.locktypes.Pin;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f1815a;

    /* renamed from: b  reason: collision with root package name */
    public final SecPrivacy f1816b;

    public /* synthetic */ h(SecPrivacy secPrivacy, int i2) {
        this.f1815a = i2;
        this.f1816b = secPrivacy;
    }

    public final void onClick(View view) {
        int i2 = 0;
        SecPrivacy secPrivacy = null;
        String str = null;
        String str2 = null;
        CustomAlertDialogBuilder customAlertDialogBuilder = null;
        d dVar = null;
        AlertDialog.Builder builder = null;
        Intent intent = null;
        Intent intent2 = null;
        String str3 = "ۧ۟ۚۨۘۦۦ۟ۡۘۤۥ۫ۦۤۡۘۦۤۥۘ۠ۜۚۙۚۨۥۤۦۘ";
        while (true) {
            switch ((str3.hashCode() ^ 321) ^ -378316338) {
                case -2137065662:
                    CharSequence[] charSequenceArr = SecPrivacy.f1199u;
                    str3 = "ۘۘ۫ۖۘۨۘۛۨۥۘ۠ۦۦۘۙۜ۟ۘۤۡۘۧۦۗ۫ۚۜۘۘۚ";
                    break;
                case -1945332369:
                    intent2.putExtra("lockoptions", secPrivacy.f1200e);
                    str3 = "ۛ۟ۜۥۖ۫ۜ۟ۤۥ۟ۗۗۡۗۢ۟ۖۘ";
                    break;
                case -1934387355:
                    intent = new Intent(secPrivacy, Pattern.class);
                    str3 = "ۡۗۡۜ۬ۚ۠ۚۥۘۨۧ۬۟ۙۨۘ";
                    break;
                case -1905285445:
                    secPrivacy.startActivity(intent);
                    str3 = "ۨۢۛۧۡۨۖۛ۟ۛۜۚۧۚ۫۟ۖۧۘ";
                    break;
                case -1813784720:
                    secPrivacy.f1202g.setChecked(false);
                    str3 = "ۘۧۦۢۡۘۢۦۤۦۢۘ۠ۘۤۛۜۚ";
                    break;
                case -1642107574:
                    CharSequence[] charSequenceArr2 = SecPrivacy.f1199u;
                    str3 = "ۚ۫ۧۤۧۜ۟۟ۗۡۢۖۘۨۖۜۘۗۛۢ";
                    break;
                case -1292313343:
                case -556888325:
                case 416935556:
                case 504934917:
                case 1509143917:
                    return;
                case -1177092024:
                    str = yo.getString("vibrate_length_default");
                    str3 = "ۖۛۤۖۤۚۗ۟۠ۙ۟ۦۘۨۥۖۘ۟۟ۤ";
                    break;
                case -1108803394:
                    switch (i2) {
                        case 0:
                            str3 = "ۛۛۗۢ۫ۗۙۛۡۚ۠۟ۤۙۢۡ۠ۗۥ۬۠۫۬ۢۥۡ۠";
                            break;
                        case 1:
                            str3 = "ۦۗۜۧۤۖۘ۬ۙۦۘۜ۠ۙۥۡۛ۫ۢ۠۟ۤۦۘ";
                            break;
                        case 2:
                            str3 = "ۙۢۥۦ۟ۚۢۥۘۗ۬ۜۘ۟ۨۛۢ";
                            break;
                        case 3:
                            str3 = "۟ۗۛۜۨۖۤۗۡۛۛۥۥۛۘ۟ۖۘۥۘۛۥۢۖۘ";
                            break;
                        default:
                            str3 = "ۦۨۨ۬ۥ۠ۦۨۧۤۚۙۘ۫۫ۥ۫ۘۘ۫ۛۥ";
                            break;
                    }
                case -1000132019:
                    str2 = yo.getString("pick_photos_gallery_title");
                    str3 = "ۖۡۥۘ۫ۦۧ۬ۜۧۧۗۥۚۙۚۜۘۦۦۜۘۨۧ۠ۚۥۡۘ";
                    break;
                case -795727359:
                    secPrivacy.startActivity(intent2);
                    str3 = "ۙۧۨۘۙۧۖۘ۬ۧۘ۬ۘۨۗۡۚۚ۬ۥۘۚۜ";
                    break;
                case -706583725:
                    customAlertDialogBuilder = new CustomAlertDialogBuilder(secPrivacy);
                    str3 = "ۛۥۢۜۧۤۖ۟ۜۢۡ۫ۖ۫ۘۘ۟ۜۥۘۗۛۡۘ";
                    break;
                case -584385678:
                    customAlertDialogBuilder.setItems(new CharSequence[]{str, str2}, (DialogInterface.OnClickListener) dVar).create().show();
                    str3 = "ۗۙۙ۬ۚۢۜ۠ۦۘۗۨۢۘۗ۫ۡ۟ۚ";
                    break;
                case -566791275:
                    builder.show();
                    str3 = "۫۠ۦۘۜۦۦۘۚۚۤۥۢۙۖۡۢۥۧ۠";
                    break;
                case -476450265:
                    secPrivacy.getClass();
                    str3 = "ۘۡۘۖۘۘۨ۫ۢ۬۠ۦۢۚۤۨۛ۬";
                    break;
                case -457583640:
                    intent2 = new Intent(secPrivacy, Pin.class);
                    str3 = "ۙۡۗۙۘۘۦۢۨۘۜۦۨۘۥ۫ۦۛۜۜۤۗ۫۠ۖ۫ۥۥۨ";
                    break;
                case 135397668:
                    intent.putExtra("lockoptions", secPrivacy.f1200e);
                    str3 = "۠۠ۜۥۧۨۥۖۙۤۜۥۘۛۤۜۘۢۦۦ";
                    break;
                case 173262500:
                    builder = RecoveryQuestion.setRecoveryQuestionDialog(secPrivacy);
                    str3 = "ۙ۟۫ۘۡۘۗۧۡۡۨۦۘۜ۠ۗۧ۫ۤۚۙ۫";
                    break;
                case 194135269:
                    CharSequence[] charSequenceArr3 = SecPrivacy.f1199u;
                    str3 = "ۙۡ۫ۖۤۤ۬۟ۦۘۘۜۜۜۚۙۘۜۧ";
                    break;
                case 261358025:
                    str3 = "ۤۖۘۧۜۨۡۗۙ۫ۚۙۥۗۖۘ";
                    break;
                case 507312047:
                    CharSequence[] charSequenceArr4 = SecPrivacy.f1199u;
                    str3 = "ۨۘۜۘۥۨ۟ۢۢۢۜ۟ۛۙۧۘۧۡۢ";
                    break;
                case 740616404:
                    secPrivacy.getClass();
                    str3 = "۬ۛ۟ۦ۠ۚۤۘۦۘۗۜۢۚ۫ۨۘۦۗۨۘۗۖۖۘ";
                    break;
                case 1014689013:
                    dVar = new d(secPrivacy, 13);
                    str3 = "ۧۦ۟ۘۡۘۙۡۚۧۤۨۘۖۡۜۨ۬ۦۜۜۚۖ۫۫";
                    break;
                case 1169725754:
                    secPrivacy = this.f1816b;
                    str3 = "۠ۨۖ۬ۥۦۛۘۥۘ۠ۨۥۘۦۨۥۘ۫ۡۘۘۘۙ۟۬ۢۢۘۛۗ";
                    break;
                case 1189173987:
                    str3 = "۫۠ۦۘۜۦۦۘۚۚۤۥۢۙۖۡۢۥۧ۠";
                    break;
                case 1233977575:
                    str3 = "ۥۜۦۘۦۙۙۧ۠ۤۘۤۡۘۥ۠ۖۘۙ۬ۤ۬ۛۥ";
                    break;
                case 1285755762:
                    secPrivacy.getClass();
                    str3 = "ۚۚۦۘ۟ۜۦۘ۬ۘۚ۠ۙۙۢۘۖ۫ۖۘ۫ۨۨۘ";
                    break;
                case 1298452286:
                    CharSequence[] charSequenceArr5 = SecPrivacy.f1199u;
                    str3 = "ۤۙ۫ۜۙۖۘۜۡۧۘۥۜۢۗ۬ۧۥۦۢ";
                    break;
                case 1310621346:
                    Toast.makeText(secPrivacy, yo.getString("fingerprint_setup_dialog_message"), 1).show();
                    str3 = "ۜ۫ۡۗ۠ۦۘ۠۠۠ۙۘۘۘ۬ۚۨۘۜۘ۫";
                    break;
                case 1333961593:
                    str3 = "ۖۢ۬ۖۥۜۘۧۡ۫ۙۖۨۜۙۘۖۥ";
                    break;
                case 1503480592:
                    String str4 = "۫ۢۡۘۧۨۦۦۗۥۡۜۨۘۨۨۙ";
                    while (true) {
                        switch (str4.hashCode() ^ 1794175355) {
                            case -505728342:
                                if (builder != null) {
                                    str4 = "ۨۚۙۤۜ۬ۢۥۧۘۡۘۗۢۜۦ۠ۤۛ۠ۙۥۙۚۥ";
                                    break;
                                } else {
                                    str4 = "۬ۗۜۘ۟ۚ۠ۨ۟ۛۙۚۥۘۖۧۨ۠۠ۘ";
                                    break;
                                }
                            case -238721504:
                                str4 = "۬ۙۗۨۙۜۘ۟ۤۨۗۨۘۙۛۚۛۗۨۘۖۜ۬ۡۢ۟";
                                break;
                            case 751177882:
                                str3 = "ۨۛۘۦ۬ۢۡۦ۠ۛۤ۬ۧۢۦ";
                                continue;
                            case 789172409:
                                str3 = "ۛۦۡۘ۬ۢۘۘۢ۫ۖۡۜۧۘ۠ۗۘۘۖۘ";
                                continue;
                        }
                    }
                    break;
                case 1525074592:
                    secPrivacy.getClass();
                    str3 = "۠ۦۙۛۛۨۘۘۦ۫ۗۧۥۘ۠ۚۢ";
                    break;
                case 1931162411:
                    secPrivacy.getClass();
                    str3 = "ۡۢۙۜۡۦۨ۟ۦۘۦۦۥ۬ۖۥۘۡۛۘ۟ۖۛۨۧۦۘ";
                    break;
                case 2081925788:
                    i2 = this.f1815a;
                    str3 = "ۢۢ۫۟ۜۡۖۖ۬ۦۛۘۘ۫ۘ";
                    break;
            }
        }
    }
}
