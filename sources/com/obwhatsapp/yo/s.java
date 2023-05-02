package com.obwhatsapp.yo;

import android.content.Intent;
import android.view.View;
import com.obwhatsapp.profile.ViewProfilePhoto;

public final /* synthetic */ class s implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f867a;

    /* renamed from: b  reason: collision with root package name */
    public final String f868b;

    public /* synthetic */ s(int i2, String str) {
        this.f867a = i2;
        this.f868b = str;
    }

    public final void onClick(View view) {
        int i2 = 0;
        String str = null;
        String str2 = "۠ۙ۫ۚۦۖۘ۬۬ۨۘۦ۠ۚۖ۠۠ۖۥۘۘۡۥۧۢۥۛ";
        while (true) {
            switch ((str2.hashCode() ^ 558) ^ 1731706071) {
                case -1856866874:
                    switch (i2) {
                        case 0:
                            str2 = "۬ۡۨ۟ۦۙۦۧ۬ۛۘ۟ۧۡ۬";
                            break;
                        case 1:
                            str2 = "ۢۚۛۢۖۥۦ۟۠ۤۨ۟ۥۚۚ۬ۚۥ";
                            break;
                        default:
                            str2 = "ۤۗۜ۬ۧۦۛۧ۫ۚۖۥۡۚۖ۟ۡ۬";
                            break;
                    }
                case -1617106168:
                case -990589398:
                case 1748965831:
                    return;
                case -1596029435:
                    Conversation.f515d.startActivity(new Intent(Conversation.f515d, ViewProfilePhoto.class).putExtra("jid", str));
                    str2 = "ۘۤۤ۟ۥۘۢۥ۠ۧۥۖۗ۬ۘۘ۟۟ۖۧۢۡۘ";
                    break;
                case -812331162:
                    str2 = "ۛ۬ۘۘۥ۫ۥۘۢۢۙ۬ۨۜۤۖ۟ۦۛۗۜۥۘۘۖۗۨ۫ۖۗ";
                    break;
                case -428257299:
                    i2 = this.f867a;
                    str2 = "ۡۚۚ۫ۘۘۘۨۢۖۢ۬ۨۙۦۧۜۦ۫ۗۘ۟۫ۘۢ";
                    break;
                case -258861997:
                    str2 = "ۗۨۦۘ۟ۗۙ۬ۗۗۡ۠۠ۘۥ۫۫۟";
                    break;
                case 815988151:
                    str = this.f868b;
                    str2 = "ۥۖ۟ۧۖۛۖۢۜۢۖۛۢۗۡۤ۬ۨۘ۬ۘۚ";
                    break;
                case 1570111469:
                    Conversation.f515d.startActivity(new Intent(Conversation.f515d, ViewProfilePhoto.class).putExtra("jid", str));
                    str2 = "۬ۜۘ۬ۜۘ۠ۢۚۨۘۤۜۤۨ۠ۛۦۘ";
                    break;
                case 1678539225:
                    tf.b(str);
                    str2 = "۫ۤ۠ۖۘۚۢۡ۬ۥۦۘۢۗ۫ۥۡۜۘ";
                    break;
                case 1960053760:
                    str2 = "ۢۤۗۖۧ۠ۦۜۛۙۗۘۧۙۘۘۢۧۜۘۗۚۥ";
                    break;
            }
        }
    }
}
