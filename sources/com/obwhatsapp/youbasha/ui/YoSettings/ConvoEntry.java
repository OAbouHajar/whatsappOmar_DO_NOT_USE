package com.obwhatsapp.youbasha.ui.YoSettings;

import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.obwhatsapp.mentions.MentionableEntry;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.Conversation;
import com.obwhatsapp.yo.d;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;

public class ConvoEntry extends BasePreferenceActivity implements IPreviewScreen {

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f1161e;

    public final void c() {
        String str = "ۢۖۦۘۥۨۤ۫ۥۦۘ۠ۚۚۡۦۘۥۚۖۘۦۥۗۗۜۧۘۤۜ";
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            switch ((str.hashCode() ^ 36) ^ -1610507332) {
                case -1946408280:
                    Conversation.BGClip((FrameLayout) this.f1161e.findViewById(yo.getID("footer", "id")));
                    str = "ۘۘۦۢۜۧ۬۫ۦۘ۫ۜۦ۟ۧۚ";
                    break;
                case -1737269216:
                    d("yowa_hangouts_conversation_gallery", "ModChatBtnColor");
                    str = "ۢۨۦۘۛۥ۠ۦ۫ۜۤۙ۬ۙۥۧۘۜۚۜ۟ۡ۟";
                    break;
                case -1706402521:
                    d("emoji_picker_btn", "ModChatBtnColor");
                    str = "۟ۡۖۜۜۤۨۥۘۚ۠ۧۦ۟ۦۛۘۧۘۛۛۥۘۜۥۦۧۡۨۘ";
                    break;
                case -1672935550:
                    str = "ۡۤۤ۠ۜۨۖۙۖۘۚ۠ۡۘۡۢ۫ۜۖۛۡۗۛۜۡ۬";
                    str3 = str2;
                    break;
                case -1372069907:
                    str = "ۥۨۨ۠۬ۡۤۜۘۘۛ۟ۗۥۙۦۘۢۗۦۘ۬ۢ۫ۥۜۜۘ";
                    break;
                case -1201993168:
                    d("attach_rc", "ModChatBtnColor");
                    str = "۬ۤۨۤۥۦۨۖۢ۠ۗۥۘۗۦۗۗ۬ۨۤۖۛۗۨۗۛۥۥۘ";
                    break;
                case -1194093971:
                    d("yowa_hangouts_conversation_location", "ModChatBtnColor");
                    str = "ۙۥۥۘۚۥۖۘۖۦ۠ۢۨۛۧۜ۬ۗ۠ۚۡ۟";
                    break;
                case -1136823311:
                    d("yowa_hangouts_conversation_audio", "ModChatBtnColor");
                    str = "ۘۦۥۛۘۡۗ۠ۗۤۗۚۨ۠۫ۨۧۘۦۧۤ";
                    break;
                case -997471688:
                    String str5 = "ۚۢۜ۬ۡۤۚ۬ۥۗۥۡۘ۟ۘۧۧۨ۬ۘۧۗۡۛۡۘ";
                    while (true) {
                        switch (str5.hashCode() ^ 1569181111) {
                            case -1032444526:
                                str = "ۡۚۘۘۚۡۘۘ۠ۜۘۘ۫ۛ۟ۦۧۧۢۙۚۙۖۦۦۙ";
                                continue;
                            case -988491704:
                                str5 = "۫۬ۦۘۤ۠ۘۘ۬۫ۥۘۘۜۘۦۢۗۧۢ۬ۢۙۘۘۡۨۥۦ۫ۨ";
                                break;
                            case 558590020:
                                str = "ۡۤۤ۠ۜۨۖۙۖۘۚ۠ۡۘۡۢ۫ۜۖۛۡۗۛۜۡ۬";
                                continue;
                            case 1189167016:
                                if (Integer.parseInt(shp.getPrefString("ConvoEntry", "7")) != 9) {
                                    str5 = "ۡۜۚۨ۠ۘۘۨۢۜۘ۫ۦۥۤ۟۫";
                                    break;
                                } else {
                                    str5 = "ۤ۫۠ۢ۬ۘۘ۠ۚۡۢ۬ۡۧۚۥ";
                                    break;
                                }
                        }
                    }
                    break;
                case -913098035:
                    str4 = "ModChaSendColor";
                    str = "ۜۜۗۚۗۡۛ۠ۡۘ۠۠ۖۗۧۡۢۦۖۛۢۧ";
                    break;
                case -691570410:
                    str = "ۛ۬ۨۢۘۤ۬ۜۜۖۖۜۤۙۧۛۦۖ";
                    str3 = str4;
                    break;
                case -200038274:
                    d("voice_note_btn", str3);
                    str = "ۨ۫ۙۤۙۜۘۚۖۛۗ۫ۡ۬ۡ";
                    break;
                case -69993193:
                    d("emoji_picker_btn", "ModChatEmojiColor");
                    str = "ۡۛۨۤۙۖۘۛۜۛ۟ۢۦۘۖۨۜۘ";
                    break;
                case 86269551:
                    d("yowa_hangouts_conversation_contact", "ModChatBtnColor");
                    str = "ۚ۠۫ۨۛۘۘۖۙۦ۠ۘۙۗۨ۬ۦۜۢۘۡۘ۬ۙ۬۠۫ۜۘ";
                    break;
                case 88226374:
                    d("input_attach_button", "ModChatBtnColor");
                    str = "ۤۡۜ۠۫ۢۤۦۖۘۧۛۘۘۙ۟ۗ۫ۜۨۚۡۥ";
                    break;
                case 523355218:
                    return;
                case 839872578:
                    d("yowa_hangouts_conversation_camera", "ModChatBtnColor");
                    str = "۠ۧۛۦۚۘۧۙۚۛۤۨۥ۬ۧۦۧۘۨۦۛۛ۠ۚۧۨ۬";
                    break;
                case 1152039516:
                    d("camera_btn", "ModChatBtnColor");
                    str = "ۤۘۨۘۛ۟ۧۚۧۤۨۦۤۘۡۥۘۤۗ۫ۢۖۥۘۛ۟ۗ۫۠۫";
                    break;
                case 1833774336:
                    d("div2", "ModChatBtnColor");
                    str = "ۘۜۨ۫ۘۡۘ۠ۙۦۘۙۢۥۘۙۢ۫۬ۗۜۨ۠ۚ";
                    break;
                case 1859409514:
                    d("send", "ModChaSendColor");
                    str = "۟ۦ۠ۢ۫۬ۢۙۦۥ۟ۦۢۛ۫ۛۚۜ۟ۚ۬";
                    break;
                case 2086720756:
                    str2 = "ModChatBtnColor";
                    str = "ۙۢۡۘۦۡۘۜۨۘۢۤۥۨۧۘۘ۫۬ۤۗۡ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            android.widget.FrameLayout r0 = r4.f1161e     // Catch:{ Exception -> 0x008a }
            java.lang.String r1 = "id"
            int r1 = com.obwhatsapp.yo.yo.getID(r5, r1)     // Catch:{ Exception -> 0x008a }
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x008a }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x008a }
            r2 = 443302959(0x1a6c442f, float:4.8858734E-23)
            java.lang.String r1 = "ۢۨۘ۠ۘۥ۠ۜ۠ۖۦۘۘ۬ۚ۠ۜۗ۬"
        L_0x0013:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x008a }
            r3 = r3 ^ r2
            switch(r3) {
                case -20218507: goto L_0x001c;
                case 657880119: goto L_0x0022;
                case 1645896573: goto L_0x0027;
                case 1964158292: goto L_0x008b;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x0013
        L_0x001c:
            java.lang.String r1 = "ۚۗۜۗۗۨۗۥۙۧۦۦۘ۬ۨۘۗۤۛۥ۠۠ۥۤۜۘ"
            goto L_0x0013
        L_0x001f:
            java.lang.String r1 = "ۗۚۢ۠ۜۖۜۦۖۘۦۢۘۘۙۤۖۨۤۖ"
            goto L_0x0013
        L_0x0022:
            if (r0 != 0) goto L_0x001f
            java.lang.String r1 = "ۦۛ۟ۚۡۚۤۘۜ۠ۡۨ۫ۧۗ۬۠ۖۘۧۥۥۘ"
            goto L_0x0013
        L_0x0027:
            r2 = 590037492(0x232b41f4, float:9.283895E-18)
            java.lang.String r1 = "ۙۚ۫ۗۖۘۥ۫۫ۡۧۗۜۨ۠ۤۧ۠"
        L_0x002c:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x008a }
            r3 = r3 ^ r2
            switch(r3) {
                case -2027685144: goto L_0x0046;
                case 152341496: goto L_0x0066;
                case 711954960: goto L_0x003b;
                case 723072455: goto L_0x0035;
                default: goto L_0x0034;
            }     // Catch:{ Exception -> 0x008a }
        L_0x0034:
            goto L_0x002c
        L_0x0035:
            java.lang.String r1 = "ۛۦ۟۟۠ۥۛ۬ۡۘۥۖۚۙۡۘۡۜۘۡۗ۫ۧۙۥ"
            goto L_0x002c
        L_0x0038:
            java.lang.String r1 = "۬۬ۜۘۦۤۤۛۜۥۦۚۛۚۚۙ"
            goto L_0x002c
        L_0x003b:
            java.lang.String r1 = "emoji_picker_btn"
            boolean r1 = r5.contains(r1)     // Catch:{ Exception -> 0x008a }
            if (r1 == 0) goto L_0x0038
            java.lang.String r1 = "ۜۗۘۢۙۗۥۨۙۦۤ۠ۥ۟ۜ"
            goto L_0x002c
        L_0x0046:
            int r1 = com.obwhatsapp.yo.Conversation.eswitch()     // Catch:{ Exception -> 0x008a }
            r0.setImageResource(r1)     // Catch:{ Exception -> 0x008a }
        L_0x004d:
            r2 = -598854645(0xffffffffdc4e340b, float:-2.32164268E17)
            java.lang.String r1 = "ۙۢۦۘۗۤۡۘ۫ۥۚۧۥۥۢۗۡۚۨۘۘ۠۟ۧ"
        L_0x0052:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x008a }
            r3 = r3 ^ r2
            switch(r3) {
                case -2094398305: goto L_0x005b;
                case -2048760963: goto L_0x008f;
                case 192535011: goto L_0x00b1;
                case 459375137: goto L_0x0092;
                default: goto L_0x005a;
            }     // Catch:{ Exception -> 0x008a }
        L_0x005a:
            goto L_0x0052
        L_0x005b:
            java.lang.String r1 = "send"
            boolean r1 = r5.equals(r1)     // Catch:{ Exception -> 0x008a }
            if (r1 != 0) goto L_0x008c
            java.lang.String r1 = "ۖ۟ۥۙ۬۟ۙۚۙۢۗۢۡ۬ۖۜ"
            goto L_0x0052
        L_0x0066:
            r2 = -1376147862(0xffffffffadf9a66a, float:-2.8381925E-11)
            java.lang.String r1 = "۟۟ۖۥۘۛۜۜۘۛۜۘۥ۫ۗۖۛۖۘۜ۠ۥۛۚۜۘۦۦۘ"
        L_0x006b:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x008a }
            r3 = r3 ^ r2
            switch(r3) {
                case -1219460994: goto L_0x004d;
                case -1087011031: goto L_0x0074;
                case -576188214: goto L_0x0082;
                case 1547203017: goto L_0x0085;
                default: goto L_0x0073;
            }     // Catch:{ Exception -> 0x008a }
        L_0x0073:
            goto L_0x006b
        L_0x0074:
            java.lang.String r1 = "input_attach_button"
            boolean r1 = r5.equals(r1)     // Catch:{ Exception -> 0x008a }
            if (r1 == 0) goto L_0x007f
            java.lang.String r1 = "ۢۗۤۗۨۦۗۤۧۨ۟ۦۜ۠ۤۘ۫ۤۢۡۢۗۘۘ"
            goto L_0x006b
        L_0x007f:
            java.lang.String r1 = "ۧۤۙۡۡۘۘۧۖۘۙ۬ۘۘۖ۟ۖۘۚۜۡ"
            goto L_0x006b
        L_0x0082:
            java.lang.String r1 = "ۖۚۗۤۗ۬ۦ۠ۗۦ۬ۗۨ۠ۚۗۛۜۦ۫ۦۘۚ۫ۡ۫ۡۢ"
            goto L_0x006b
        L_0x0085:
            r1 = 0
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x008a }
            goto L_0x004d
        L_0x008a:
            r0 = move-exception
        L_0x008b:
            return
        L_0x008c:
            java.lang.String r1 = "ۗۖۖۘۧۤۤۘۛۜۘۤۜۥۘۢۥ۠ۢۥ۟ۡۨۦۘ"
            goto L_0x0052
        L_0x008f:
            java.lang.String r1 = "ۢۦۥۦ۫۠۠ۧۗۧۤۡۘۤۧۡۦۗۜ۬ۚۨۘۨۚۥۘ۫۟ۜۘ"
            goto L_0x0052
        L_0x0092:
            r2 = 1139130144(0x43e5bf20, float:459.49316)
            java.lang.String r1 = "۠ۚ۟ۨۢۚۥۥۡۘۙۥۘۤۦۖۢۛۥ"
        L_0x0097:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x008a }
            r3 = r3 ^ r2
            switch(r3) {
                case -2099387505: goto L_0x00ae;
                case -164199138: goto L_0x00b1;
                case 596448435: goto L_0x00c4;
                case 1298606130: goto L_0x00a0;
                default: goto L_0x009f;
            }     // Catch:{ Exception -> 0x008a }
        L_0x009f:
            goto L_0x0097
        L_0x00a0:
            java.lang.String r1 = "voice_note_btn"
            boolean r1 = r5.equals(r1)     // Catch:{ Exception -> 0x008a }
            if (r1 == 0) goto L_0x00ab
            java.lang.String r1 = "ۥ۟ۡۛۡۨ۟ۦۥۗۧۘۘۧۦۙۖۥۥ"
            goto L_0x0097
        L_0x00ab:
            java.lang.String r1 = "ۤۧۦۘۚۦۜۘۢۨۢ۫ۘ۠ۖۘۨۘۦۢۙۘ۠۟ۥۨۤۤۖۦ"
            goto L_0x0097
        L_0x00ae:
            java.lang.String r1 = "ۙۡ۬۬ۜۨۘۖۥۛۢۥۖۘۚۙۦۘ"
            goto L_0x0097
        L_0x00b1:
            android.graphics.drawable.Drawable r1 = r0.getBackground()     // Catch:{ Exception -> 0x008a }
            java.lang.String r2 = "ModChaSendBKColor"
            r3 = 0
            int r2 = com.obwhatsapp.youbasha.others.getColor(r2, r3)     // Catch:{ Exception -> 0x008a }
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_ATOP     // Catch:{ Exception -> 0x008a }
            r1.setColorFilter(r2, r3)     // Catch:{ Exception -> 0x008a }
            r0.setBackground(r1)     // Catch:{ Exception -> 0x008a }
        L_0x00c4:
            int r1 = com.obwhatsapp.yo.ColorStore.getDefaultConversationEntryIconsColor()     // Catch:{ Exception -> 0x008a }
            int r1 = com.obwhatsapp.youbasha.others.getColor(r6, r1)     // Catch:{ Exception -> 0x008a }
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_ATOP     // Catch:{ Exception -> 0x008a }
            r0.setColorFilter(r1, r2)     // Catch:{ Exception -> 0x008a }
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.YoSettings.ConvoEntry.d(java.lang.String, java.lang.String):void");
    }

    public void disloc(View view) {
        String str = "ۘ۟۠ۛ۟ۛۦۙۜۥۜۜۧۤۡۘۙۙ";
        while (true) {
            switch ((str.hashCode() ^ 824) ^ -1084145221) {
                case -1071484691:
                    str = "ۘۜ۬ۚۡۜۙ۠ۖۘۤۖ۟ۗۧ۟ۖۗ";
                    break;
                case -587540460:
                    return;
                case 1739587994:
                    str = "ۤۜۧۗۤۦۤۚۦۦۜۗ۬ۚۨۛۤۥۨۖۜۘۘۨ";
                    break;
            }
        }
    }

    public final void e() {
        try {
            int color = others.getColor("ModChatEntry", ColorStore.getDefaultConversationEntryBackground());
            Drawable background = this.f1161e.findViewById(yo.getID("input_layout", "id")).getBackground();
            String str = "۟ۢ۠ۛۤۚۗۘۧۘ۠ۛۢۢۥۘ";
            while (true) {
                switch (str.hashCode() ^ 191213668) {
                    case -1427519538:
                        str = "ۤ۬۫ۘۚۨۦۘۨ۫ۦۗۨ۠ۥۚۢ۠ۙۛۧۢۦۨ۫ۨۘ";
                        continue;
                    case 895366192:
                        if (background == null) {
                            str = "ۚۥۘ۫ۤۜۘۡۙۥۖۘۡۘۛۥۧۦۙۛۙۤ۟";
                            break;
                        } else {
                            str = "ۡۨۨۙۖۘۘۧۧ۬۬ۡۦۙۙۛۡۥۦ۫ۨۨۘۛۨ۠ۚۘۤ";
                            continue;
                        }
                    case 1604677825:
                        break;
                    case 1994538060:
                        background.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
                        break;
                    default:
                        continue;
                }
            }
            Drawable drawable = ((ImageView) this.f1161e.findViewById(yo.getID("input_layout_background", "id"))).getDrawable();
            String str2 = "ۚۤۙ۠ۘۘۚۜۢۚ۫۠ۦۚ۟ۨۚۜۥۡۖۚۗۜۘ";
            while (true) {
                switch (str2.hashCode() ^ 395186259) {
                    case -1310002265:
                        if (drawable == null) {
                            str2 = "ۨۡۦۧ۟۫ۚۙۧۢۘۜۘ۠ۖۘۘ";
                            break;
                        } else {
                            str2 = "ۖۜۜۘۗۛ۟۠ۥۡۡۙۢۖ۟ۥۘۧۙۜۧ۠ۨ۠ۦ۟ۡ۠ۢ";
                            break;
                        }
                    case -1104010295:
                        drawable.setColorFilter(color, PorterDuff.Mode.MULTIPLY);
                        return;
                    case 399639713:
                        str2 = "۬ۛۘۘۙۖۘۥۚۙ۠ۜۧۘۘۨۧۚۢ";
                        break;
                    case 848631257:
                        return;
                }
            }
        } catch (Exception e2) {
        }
    }

    public void initPreview() {
        String str = "۟ۘۘۘۜ۬ۦۡۚۦ۫ۗۡۚۦۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 628) ^ -1611124686) {
                case -1900223307:
                    str = "ۦۦۙۘۜ۟ۚۖ۠ۡۦۨۘۡ۫ۢۨۘۜ";
                    break;
                case -290981747:
                    this.f1161e.removeAllViews();
                    str = "ۘ۠ۗۥۜ۬۫ۢۥۘۢۜۡۖۘۢۗۨۘۡۧۦۥۦۤ۬ۤۘۘ";
                    break;
                case 134676799:
                    return;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str = "ۧۢۨۘۚ۫۟ۙۖۤۖۥۡۘۥۨۨۢۡۖ۠ۢۨۘۡۛۦ";
        while (true) {
            switch ((str.hashCode() ^ 179) ^ 2106828981) {
                case -1782470521:
                    str = "ۜۥ۟ۨ۬ۜۘۗۚۖۘۗۢ۬ۗۚۦۚۘۤۡۜۘ";
                    break;
                case -1505553439:
                    setContentView(yo.getID("yo_settings_convoentry", "layout"));
                    str = "۬۠ۜۘۛۨۖۘ۟ۦۦۙ۠ۤ۫ۖۦ۠۟ۡۘ";
                    break;
                case -920351438:
                    super.onCreate(bundle);
                    str = "ۦۡۗۧ۬۫۬۠ۜۛۖۘۖۖۧۢۡ";
                    break;
                case -461367368:
                    str = "ۧۗۙۚۧ۫ۚۘۗۗ۫ۜۘۗ۬۬ۤۤ۫ۙۗۡۡۖۙۢۚۢ";
                    break;
                case -74421454:
                    addPreferencesFromResource(yo.getID("yo_convo_entry", "xml"));
                    str = "ۤ۠ۛۚۗۖۙ۫ۘۥۢۘۛۡۨۤ۬ۡۘۙۘۘ۬ۧ";
                    break;
                case 554024433:
                    return;
                case 847657668:
                    this.f1161e = (FrameLayout) findViewById(yo.getID("layout_frame", "id"));
                    str = "۫ۡۘۘۖۡۡۘۜۤۥ۠۫ۖۘۖ۟ۘ۠۬ۘ";
                    break;
                case 876961321:
                    initPreview();
                    str = "۫ۗۥۘ۬ۦۧۘ۠ۤۨۡۥۢۨۥۘ";
                    break;
            }
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String str2 = "ۛۘۖ۬ۚ۬ۢۥۤۢۛۢ۬ۖۛۖۡۦ۫ۤۥ";
        while (true) {
            switch ((str2.hashCode() ^ 598) ^ -321488863) {
                case -1581999699:
                    super.onSharedPreferenceChanged(sharedPreferences, str);
                    str2 = "ۜۥۙۚ۫ۙ۟ۢۜۦۥۡ۠ۥۗۜۢ۠ۤۧۛ";
                    break;
                case -532522666:
                    str2 = "ۖۤۥ۠۬ۛۗۙۥۘۘ۠ۡ۫ۡۘۜۜ۟ۦۦۚ";
                    break;
                case 419196641:
                    return;
                case 640104796:
                    updatePreview();
                    str2 = "ۧۨۨۘۦۖۜۚۛ۠۬ۧۜۦۨۨۘۢۥۨ";
                    break;
                case 774747224:
                    initPreview();
                    str2 = "ۨۧۦۦۖ۟ۨۜ۬ۛۢۘۘۥ۬ۘۡۡۡۘۗۜۡ";
                    break;
                case 1050394758:
                    str2 = "ۜۛۤۧۘۡۤ۫ۜۘۖۢۘۜ۟ۡۡۨۡ";
                    break;
                case 2113090178:
                    str2 = "ۨ۬ۜۛۙۤۙۡۘۘۨۦ۬۫۫ۢۗۦۘۛۦۡۘ";
                    break;
            }
        }
    }

    public void onStart() {
        String str = "۟ۢۨۘۡۚۡۡۙۥۘۘۨۤ۟ۥ۟ۚ۫۬";
        while (true) {
            switch ((str.hashCode() ^ 367) ^ 1747088877) {
                case -367431711:
                    return;
                case 408308174:
                    IPreviewScreen.mHandler.postDelayed(new d(this, 7), 300);
                    str = "ۡ۬ۡۜۚۡۘۙۧ۬ۛۚۘۘۛۥۜۘ۠ۤ۟";
                    break;
                case 604848532:
                    str = "ۜۙۧ۬ۤۗۘۙۚۧۢۧ۫۫۠ۨۢۥۦۜۧۘۦ";
                    break;
                case 1227918670:
                    super.onStart();
                    str = "ۙۜۤۡ۟ۢۨۘۛۧ۬ۜۘ۬ۢۗۖۚۡۘۚۜۡۘ";
                    break;
            }
        }
    }

    public void updatePreview() {
        try {
            ((ImageView) this.f1161e.findViewById(yo.getID("send", "id"))).setVisibility(8);
            c();
            e();
            others.rEntryText((MentionableEntry) this.f1161e.findViewById(yo.getID("entry", "id")));
            this.f1161e.invalidate();
        } catch (Exception e2) {
        }
    }
}
