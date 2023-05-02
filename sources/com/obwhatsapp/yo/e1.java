package com.obwhatsapp.yo;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.obwhatsapp.Conversation;

public final /* synthetic */ class e1 implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f756a;

    /* renamed from: b  reason: collision with root package name */
    public final Conversation f757b;

    public /* synthetic */ e1(Conversation conversation, int i2) {
        this.f756a = i2;
        this.f757b = conversation;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        int i3 = this.f756a;
        Conversation conversation = this.f757b;
        switch (i3) {
            case 0:
                conversation.makeCall(true);
                return;
            default:
                String str = "ۦۘۘۤۧ۬ۖ۬ۚ۫ۛۜۘۛۦۘۛ۬ۦۜ۟ۜ";
                while (true) {
                    switch (str.hashCode() ^ -1339600618) {
                        case -1799146142:
                            str = "ۛۥۧۘۥ۫ۨۘۢۤۚۛ۫ۢۨۤۤ۠ۙۡۡۧۦۘۥ۟ۦۘ";
                            break;
                        case -753939222:
                            conversation.makeCall(false);
                            return;
                        case -505473863:
                            String str2 = "ۢۙۡۘۚۧۛۥۙۦۨ۫ۜۖۥۛ۠ۦۢۗۜۙۚۚۢ";
                            while (true) {
                                switch (str2.hashCode() ^ 1752543426) {
                                    case 899163646:
                                        return;
                                    case 1044468359:
                                        if (i2 == 1) {
                                            str2 = "ۖۖۘۦ۫ۨۘۙ۬ۨۜ۠ۚ۠ۗۛۧۢۤ۫ۗۤۖۧ۫۟ۜۘ";
                                            break;
                                        } else {
                                            str2 = "ۗۙۥۘۦۜۜۡۘۦۢۦۛۨۨۜۘۘۧۡ";
                                            break;
                                        }
                                    case 1213955396:
                                        String stripJID = yo.stripJID(Conversation.f514c);
                                        try {
                                            conversation.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + stripJID)));
                                            return;
                                        } catch (ActivityNotFoundException e2) {
                                            return;
                                        }
                                    case 1611585983:
                                        str2 = "۫ۚۢ۬۠ۜۘۚ۫۬ۖۨۥۘۖ۟ۥۘۛۤۜۥۙۙۗۘۨ";
                                        break;
                                }
                            }
                            break;
                        case -475716302:
                            if (i2 == 0) {
                                str = "ۧۖۜۘۢۨۤۧۚۜ۬ۖۖ۬۬ۜۡۜۘۙ۫ۡۛۚ۬ۤۙۦ";
                                break;
                            } else {
                                str = "ۡۖۘۘ۬ۙۖۘۦۢۘۘ۫ۖۥۘۜۨۨ۟ۙ۬ۘۛۙۧۙ";
                                break;
                            }
                    }
                }
                break;
        }
    }
}
