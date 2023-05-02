package com.obwhatsapp.yo;

import X.AnonymousClass1XI;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.view.MenuItem;
import android.widget.EditText;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.profile.WebImagePicker;
import com.obwhatsapp.yo.autoschedreply.Auto_message;
import com.obwhatsapp.yo.autoschedreply.ListMessages;
import com.obwhatsapp.yo.massmsger.SavedCollections;
import com.obwhatsapp.youbasha.ui.YoSettings.AllSettings;
import com.obwhatsapp.youbasha.ui.activity.CallsPrivacy;
import com.obwhatsapp.youbasha.ui.activity.VoiceNoteSounds;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final /* synthetic */ class w implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f897a;

    public /* synthetic */ w(int i2) {
        this.f897a = i2;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f897a) {
            case 0:
                int i2 = Conversation.f512a;
                String str = "https://api.whatsapp.com/send?phone=+" + yo.stripJID(Conversation.f514c);
                new CustomAlertDialogBuilder(Conversation.f515d).setTitle((CharSequence) yo.getString("link_taking_to", new String[]{Conversation.f513b})).setMessage(str).setPositiveButton(17039361, new o(0, str)).setNegativeButton(17039360, new x(1)).create().show();
                break;
            case 1:
                Conversation.f515d.showEmojiInput();
                break;
            case 2:
                Conversation.f515d.startActivity(new Intent(Conversation.f515d, VoiceNoteSounds.class));
                break;
            case 3:
                int i3 = Conversation.f512a;
                new h1(Conversation.f515d, yo.getCurr_sJid()).execute(new String[0]);
                break;
            case 4:
                Conversation conversation = Conversation.f515d;
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), Deobfuscator$app$Custom.getString(-13364283932097L));
                String str2 = "۟۠ۥۘۚۥ۫ۨۙۨۘۥ۬ۤ۟ۗۥ";
                while (true) {
                    switch (str2.hashCode() ^ -1109840728) {
                        case -893504731:
                            break;
                        case 631493461:
                            if (file.exists()) {
                                str2 = "ۦۖۧ۠۬ۡۗۗۧۢۤۖۛۨۘۧ۟ۥ";
                                break;
                            } else {
                                str2 = "ۨ۠۠۫ۗ۟۬ۗۥۘۡ۠ۡۛۤۦ";
                                continue;
                            }
                        case 803988630:
                            try {
                                file.mkdirs();
                                break;
                            } catch (Exception e2) {
                                break;
                            }
                        case 815470156:
                            str2 = "ۡ۟ۜۘۢ۫ۤۖۥۛۢۧۙۖۦۦۘۙۨۘ";
                            continue;
                    }
                }
                Uri A01 = AnonymousClass1XI.A01(yo.getCtx(), new File(file, Deobfuscator$app$Custom.getString(-13415823539649L) + new SimpleDateFormat(Deobfuscator$app$Custom.getString(-13445888310721L), Locale.ENGLISH).format(new Date()) + Deobfuscator$app$Custom.getString(-13510312820161L)));
                Intent intent = new Intent(conversation, WebImagePicker.class);
                intent.putExtra(Deobfuscator$app$Custom.getString(-13531787656641L), A01);
                EditText editText = (EditText) conversation.findViewById(yo.getID(Deobfuscator$app$Custom.getString(-13561852427713L), Deobfuscator$app$Custom.getString(-13587622231489L)));
                String str3 = "ۖۛۡۗۘ۠ۜۦۡۘ۟ۘ۟ۧۜۤۚۗ";
                while (true) {
                    switch (str3.hashCode() ^ -689193680) {
                        case -974778587:
                            intent.putExtra(Deobfuscator$app$Custom.getString(-13600507133377L), editText.getText().toString());
                            break;
                        case 841539935:
                            str3 = "ۗ۟ۛۘۢۢ۬ۤۥۘۡۘ۟ۡۘۜۘۜ۫ۛۨ۬ۚ";
                            continue;
                        case 1132273568:
                            break;
                        case 1453540986:
                            if (editText != null) {
                                str3 = "۫۟ۘ۠۫ۧۘۨ۟ۗۘ۠۟ۛ۟ۜۨۜۨۦۢ";
                                break;
                            } else {
                                str3 = "ۛۜۢ۬ۥۙۜ۠۬ۖۢۖۘ۫ۦۜۚۜۘ۫ۘۡۘ";
                                continue;
                            }
                    }
                }
                try {
                    conversation.startActivityForResult(intent, 21);
                    break;
                } catch (Exception e3) {
                    conversation.startActivityForResult(Intent.createChooser(intent, Deobfuscator$app$Custom.getString(-13626276937153L)), 21);
                    break;
                }
            case 5:
                try {
                    new CustomAlertDialogBuilder(Conversation.f515d).setTitle((CharSequence) yo.getString("msg_store_confirm")).setMessage((CharSequence) yo.getString("clearemoji") + "?").setPositiveButton(17039370, (DialogInterface.OnClickListener) new x(2)).setNegativeButton(17039360, (DialogInterface.OnClickListener) new x(3)).create().show();
                    break;
                } catch (Exception e4) {
                    break;
                }
            case 6:
                Conversation.c(Conversation.f515d, yo.getCurr_sJid());
                break;
            case 7:
                yo.Homeac.startActivity(new Intent(yo.Homeac, AllSettings.class));
                break;
            case 8:
                yo.Homeac.startActivity(new Intent(yo.Homeac, ListMessages.class));
                break;
            case 9:
                yo.Homeac.startActivity(new Intent(yo.Homeac, Auto_message.class));
                break;
            case 10:
                yo.rebootYo();
                break;
            case 11:
                HomeUI.anyNum();
                break;
            case 12:
                yo.Homeac.startActivity(new Intent(yo.Homeac, SavedCollections.class));
                break;
            case 13:
                yo.Homeac.startActivity(new Intent(yo.Homeac, CallsPrivacy.class));
                break;
            case 14:
                u1.markVO_asOpened();
                break;
            default:
                u1.saveVOFile();
                break;
        }
        return true;
    }
}
