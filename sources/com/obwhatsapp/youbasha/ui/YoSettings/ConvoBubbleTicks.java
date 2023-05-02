package com.obwhatsapp.youbasha.ui.YoSettings;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.yo.d;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.ui.TextBubbleLeft;
import com.obwhatsapp.youbasha.ui.TextBubbleRight;

public class ConvoBubbleTicks extends BasePreferenceActivity implements IPreviewScreen {

    /* renamed from: e  reason: collision with root package name */
    public View f1157e;

    /* renamed from: f  reason: collision with root package name */
    public TextBubbleLeft f1158f;

    /* renamed from: g  reason: collision with root package name */
    public TextBubbleRight f1159g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f1160h;

    public void initPreview() {
        String str = "ۖۤۡۘ۫۫ۡ۬ۥۤۚ۟۫ۚۨۖۘ۬ۨۧۦۤۡۘ۬ۡۦ";
        TextBubbleLeft textBubbleLeft = null;
        View view = null;
        while (true) {
            switch ((str.hashCode() ^ 566) ^ 628346408) {
                case -2057979549:
                    updatePreview();
                    str = "ۥ۟ۖۥۥۧۚۚۘۘۤۗۜۘۤۨۜۘ";
                    break;
                case -1937578076:
                    return;
                case -1878260614:
                    this.f1160h = (ImageView) this.f1157e.findViewById(yo.getID("forward", "id"));
                    str = "ۡۛۚ۬۬ۡ۫ۘۡۗۤ۬۠ۧۨۧۡ۬";
                    break;
                case -1749006497:
                    this.f1159g = (TextBubbleRight) this.f1157e.findViewById(yo.getID("right", "id"));
                    str = "ۥ۟ۗۡۤۧ۬۠۠ۤۡ۫ۦۛ۫ۧۢۘۤۘ";
                    break;
                case -681357288:
                    str = "ۘۗۨۘۦۘ۬ۦۗۛۢۢۦۦۤۦۘۡۖۘ";
                    view = findViewById(yo.getID("preview", "id"));
                    break;
                case 132544537:
                    str = "ۦۡۖۢۜۙۛۜۗۛ۟ۡۙۜۧۘۚۜۡۡ۫ۦ";
                    textBubbleLeft = (TextBubbleLeft) view.findViewById(yo.getID("left", "id"));
                    break;
                case 967062082:
                    this.f1158f = textBubbleLeft;
                    str = "ۤ۬ۜۥۢ۠۟ۡۥۘۗۨۧۜۤۚۘۗ۟۠ۖۚ۬ۙۚ";
                    break;
                case 1019474103:
                    textBubbleLeft.showDelIcon();
                    str = "ۘۙۤۨۥۗۛۜۘۨ۬ۘۘۨۤۘۙۦۡۛ۠ۘۘ";
                    break;
                case 1132852326:
                    str = "ۚ۠ۨۘۤۡۤ۬ۜۘۛۥۖۢۜ۟ۡۥۜۘ۠ۢۙۨ۫ۜۘ";
                    break;
                case 1812762578:
                    this.f1157e = view;
                    str = "ۗۖۦۘۚۚ۠ۚۗۧۘۗ۬۠ۥۘۤۡۗۨۡۡۥۦۡۘ";
                    break;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str = "۟ۥۚ۫ۧۢۖۚ۟ۤۡ۟ۧۨۧۛ۠ۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 382) ^ -1476014028) {
                case -1379181974:
                    setContentView(yo.getID("yo_settings_convobubbleticks", "layout"));
                    str = "ۨۚۜۡۛۥۘۢۜۘۘۙۤ۬ۜۚۡۘ۠ۨۘ";
                    break;
                case -1359618827:
                    initPreview();
                    str = "۠ۜۗۦۜ۬ۤۙۡ۬ۥۖۘۜۤ۬ۜۧۚۘ۫ۙۛۧۘۘۚۧ";
                    break;
                case 91330977:
                    str = "ۛ۬ۡۚۙۥۘۨۨۦۘۢ۠ۨۚۤۗۨ۟";
                    break;
                case 184691650:
                    return;
                case 1263224414:
                    str = "۫۫۫۫۬ۨۘۥ۫ۡۜۡۘۨۤۙۛۦۡۘ";
                    break;
                case 1439563236:
                    super.onCreate(bundle);
                    str = "ۤۢۧۤۛۨۘۘ۟ۦۢۚۢۤۛۦ۫ۥۡۦۚ۫ۥۘ۬ۚۥ";
                    break;
                case 2047072737:
                    addPreferencesFromResource(yo.getID("yo_convo_bubbleticks", "xml"));
                    str = "ۘۨۗ۟ۚۡۘۡۢ۠ۜۘۜۘ۠ۧۗۡۨ۠ۛۡ۬";
                    break;
            }
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String str2 = "ۤۜ۟ۤۦۙۨۚۥۥ۬ۢ۠ۘ۫";
        while (true) {
            switch ((str2.hashCode() ^ 776) ^ 1351326723) {
                case -2063277552:
                    str2 = "ۥۨ۫ۧۢ۟ۗ۫ۦۘۧ۬ۢۧۡ۫ۥ۬ۥۘۛۜ۠ۦ۟۬";
                    break;
                case -1515781549:
                    super.onSharedPreferenceChanged(sharedPreferences, str);
                    str2 = "ۛۧ۫ۗۨۚۧ۠ۦ۬ۗۚ۫۠ۦۧ۫ۨۘ۫ۙۚۗۘۘۨۤ";
                    break;
                case -366238997:
                    updatePreview();
                    str2 = "ۢ۠ۨۛۜ۟ۚۤۗۤۚۚۚۘ۟ۜۨۧۚۛۤۢۙ۠";
                    break;
                case 96555721:
                    str2 = "۫ۜۨۘۧ۫ۘۘۛۨۙۙ۠ۡۘۧۘۖۘ";
                    break;
                case 295701728:
                    return;
                case 1055949647:
                    str2 = "ۛ۟ۖ۠ۥۥۘۨۦۘۛۥۡۛۜۥۛۛۨۘۦ۟ۨ";
                    break;
            }
        }
    }

    public void onStart() {
        String str = "ۨۢۤ۟ۤۡۘۛۦ۫ۗۙۖۗ۟ۦ";
        while (true) {
            switch ((str.hashCode() ^ 759) ^ -317284035) {
                case -1287278255:
                    super.onStart();
                    str = "۬ۥۖۘ۠۫ۦ۫ۛۥۘ۠ۧۘۘۢۙۥۘ";
                    break;
                case 356183814:
                    return;
                case 474213342:
                    IPreviewScreen.mHandler.postDelayed(new d(this, 6), 300);
                    str = "ۦۖۡ۟ۡۘۧۧۦۦۜۖۘۛۚۤ";
                    break;
                case 1274651342:
                    str = "ۢۧۡۘ۬ۦ۬۠ۦۨۡۛۛۜۚۜۧۢ۟۠ۜۥۡۖۗ۠ۖۥ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updatePreview() {
        /*
            r5 = this;
            r4 = -11
            com.obwhatsapp.youbasha.ui.TextBubbleLeft r0 = r5.f1158f
            r0.updateBubbleStyle()
            com.obwhatsapp.youbasha.ui.TextBubbleRight r0 = r5.f1159g
            r0.updateBubbleStyle()
            r1 = -760326987(0xffffffffd2ae54b5, float:-3.74372729E11)
            java.lang.String r0 = "ۢ۬ۜۛۖۜۛ۠ۢۚۨۡۘ۠ۘۨۘ۠۠ۘۘۜۖۡۘۘۜۘ"
        L_0x0011:
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x00a6 }
            r2 = r2 ^ r1
            switch(r2) {
                case -1151254922: goto L_0x001a;
                case -779142275: goto L_0x0051;
                case -410560644: goto L_0x0027;
                case -283446979: goto L_0x0020;
                default: goto L_0x0019;
            }     // Catch:{ Exception -> 0x00a6 }
        L_0x0019:
            goto L_0x0011
        L_0x001a:
            java.lang.String r0 = "ۧۗۘۘۥۗۛۧۚۢۥۜۘۤۜۜۘۗ۠ۥۦ۠ۥۡۜۘ۬ۚۥ"
            goto L_0x0011
        L_0x001d:
            java.lang.String r0 = "ۦۧۡۘۚۚۚ۬۟ۤۛۚۥۘۛۘۦۘۛۚۘ"
            goto L_0x0011
        L_0x0020:
            android.view.View r0 = r5.f1157e     // Catch:{ Exception -> 0x00a6 }
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "ۥۤۚۜۜ۟ۤۘ۠ۖۦۚۖۥۥۡ۠۫ۡۥ۟"
            goto L_0x0011
        L_0x0027:
            r1 = -2103197206(0xffffffff82a3c1ea, float:-2.4061999E-37)
            java.lang.String r0 = "ۤۛ۟ۘۨۦۛ۠ۢۤ۫ۡۘۧۥۜۥۙۛۤۢۥۗۢ"
        L_0x002c:
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x00a6 }
            r2 = r2 ^ r1
            switch(r2) {
                case -1707100278: goto L_0x0046;
                case -1616341467: goto L_0x0043;
                case -511009098: goto L_0x0035;
                case 1325989324: goto L_0x0097;
                default: goto L_0x0034;
            }     // Catch:{ Exception -> 0x00a6 }
        L_0x0034:
            goto L_0x002c
        L_0x0035:
            java.lang.String r0 = "ConvoBack"
            boolean r0 = com.obwhatsapp.yo.shp.getIsGradiet(r0)     // Catch:{ Exception -> 0x00a6 }
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "ۨۖۡۘۖۥۙۘۗۜۘۡۢۢ۠ۜۧۘۗۥ۟ۦۘۤۚۚ"
            goto L_0x002c
        L_0x0040:
            java.lang.String r0 = "ۢ۠ۥۧ۟ۦۗۙ۟۫ۚ۫ۤۚۡۘۛۙۗ"
            goto L_0x002c
        L_0x0043:
            java.lang.String r0 = "۠۫ۦۗۦۤۘۛۛ۬ۚۜ۟۬ۦۘۙۡۡۗۛۦۘ"
            goto L_0x002c
        L_0x0046:
            android.view.View r0 = r5.f1157e     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r1 = "ConvoBack"
            android.graphics.drawable.GradientDrawable r1 = com.obwhatsapp.yo.shp.getGradientDrawable(r1)     // Catch:{ Exception -> 0x00a6 }
            r0.setBackground(r1)     // Catch:{ Exception -> 0x00a6 }
        L_0x0051:
            r1 = 1693629705(0x64f2bd09, float:3.5821868E22)
            java.lang.String r0 = "ۚۨۦۘۖۤ۬ۛۤۨۘ۬ۖۧۘ۟ۤۗ"
        L_0x0056:
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x00a6 }
            r2 = r2 ^ r1
            switch(r2) {
                case -1987850502: goto L_0x0096;
                case -1310434135: goto L_0x00ab;
                case -33072823: goto L_0x005f;
                case 1834816275: goto L_0x00b2;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x0056
        L_0x005f:
            java.lang.String r0 = "chat_icon_bg_forward_picker"
            r1 = -11
            int r1 = com.obwhatsapp.youbasha.others.getColor(r0, r1)     // Catch:{ Exception -> 0x00d1 }
            r2 = 140823192(0x864ca98, float:6.88494E-34)
            java.lang.String r0 = "ۙۢۘۘۨۖ۬ۦۛۛۦۛۜۢۜ۟ۙ۫ۖۘۘ۫ۜۘ"
        L_0x006c:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x00d1 }
            r3 = r3 ^ r2
            switch(r3) {
                case -1569266074: goto L_0x0080;
                case -791810006: goto L_0x00b8;
                case 589991624: goto L_0x0075;
                case 1267258454: goto L_0x00bd;
                default: goto L_0x0074;
            }     // Catch:{ Exception -> 0x00d1 }
        L_0x0074:
            goto L_0x006c
        L_0x0075:
            android.widget.ImageView r0 = r5.f1160h     // Catch:{ Exception -> 0x00d1 }
            android.graphics.drawable.Drawable r0 = r0.getBackground()     // Catch:{ Exception -> 0x00d1 }
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC     // Catch:{ Exception -> 0x00d1 }
            r0.setColorFilter(r1, r2)     // Catch:{ Exception -> 0x00d1 }
        L_0x0080:
            java.lang.String r0 = "chat_icon_forward_picker"
            r1 = -11
            int r1 = com.obwhatsapp.youbasha.others.getColor(r0, r1)     // Catch:{ Exception -> 0x00d1 }
            r2 = 792223694(0x2f385fce, float:1.6768739E-10)
            java.lang.String r0 = "ۦ۟۠ۢۙ۠ۚۚۖ۟ۨۘۨۦۛ"
        L_0x008d:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x00d1 }
            r3 = r3 ^ r2
            switch(r3) {
                case -1013491092: goto L_0x00c3;
                case -813879939: goto L_0x00c8;
                case 1509503763: goto L_0x00cb;
                case 1734668736: goto L_0x0096;
                default: goto L_0x0095;
            }
        L_0x0095:
            goto L_0x008d
        L_0x0096:
            return
        L_0x0097:
            java.lang.String r0 = "ConvoBack"
            r1 = -3355444(0xffffffffffcccccc, float:NaN)
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r1)     // Catch:{ Exception -> 0x00a6 }
            android.view.View r1 = r5.f1157e     // Catch:{ Exception -> 0x00a6 }
            r1.setBackgroundColor(r0)     // Catch:{ Exception -> 0x00a6 }
            goto L_0x0051
        L_0x00a6:
            r0 = move-exception
            goto L_0x0051
        L_0x00a8:
            java.lang.String r0 = "ۛۡ۠۠ۜۚۧۚۛ۠ۧۨۘۨ۫ۡۘۛۦ"
            goto L_0x0056
        L_0x00ab:
            android.widget.ImageView r0 = r5.f1160h     // Catch:{ Exception -> 0x00a6 }
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "ۜ۬ۜۧ۟ۢ۠ۘۖۙۚۙ۬ۡۤۡۨۘ"
            goto L_0x0056
        L_0x00b2:
            java.lang.String r0 = "ۦۛۘۚۦۧۧۜۜۗۘۨۜۥۖ۬۟۠ۖ۬ۡ"
            goto L_0x0056
        L_0x00b5:
            java.lang.String r0 = "ۦ۫ۗ۬ۜۗ۟ۧۚۧۡۥۘۢ۟ۜۘۥۗۥۦۘ۠"
            goto L_0x006c
        L_0x00b8:
            if (r1 == r4) goto L_0x00b5
            java.lang.String r0 = "ۢۤۦۥۤۜ۬ۤۙۗ۫ۘۙۛ۠ۜۧۘۙۤۧۚۗۧۘۖۡۘ"
            goto L_0x006c
        L_0x00bd:
            java.lang.String r0 = "ۥۙۥۘۜۦۧ۬ۧۘۘۥۤۙ۠ۗۥ۫۟۠ۗ"
            goto L_0x006c
        L_0x00c0:
            java.lang.String r0 = "ۡۡۡۘۧۜۜ۠ۙۨۘۖۘۘۘۦ۟ۥۤۦ۟ۘۖۘ"
            goto L_0x008d
        L_0x00c3:
            if (r1 == r4) goto L_0x00c0
            java.lang.String r0 = "ۦۙۡۙ۬ۚ۫ۚۤۘۥۨۘۢ۠ۡۘۥۨۤ"
            goto L_0x008d
        L_0x00c8:
            java.lang.String r0 = "۟ۦۜۧۡۖۘۥۧ۟ۧۗۨۜۘ۬۟۬ۚۧۢۡ۬ۢ۬ۤۦۘ"
            goto L_0x008d
        L_0x00cb:
            android.widget.ImageView r0 = r5.f1160h     // Catch:{ Exception -> 0x00d1 }
            r0.setColorFilter(r1)     // Catch:{ Exception -> 0x00d1 }
            goto L_0x0096
        L_0x00d1:
            r0 = move-exception
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.YoSettings.ConvoBubbleTicks.updatePreview():void");
    }
}
