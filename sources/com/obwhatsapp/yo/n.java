package com.obwhatsapp.yo;

import android.graphics.PorterDuff;
import androidx.appcompat.view.menu.ActionMenuItemView;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final int f823a;

    /* renamed from: b  reason: collision with root package name */
    public final ActionMenuItemView f824b;

    /* renamed from: c  reason: collision with root package name */
    public final int f825c;

    public /* synthetic */ n(ActionMenuItemView actionMenuItemView, int i2, int i3) {
        this.f823a = i3;
        this.f824b = actionMenuItemView;
        this.f825c = i2;
    }

    public final void run() {
        ActionMenuItemView actionMenuItemView = null;
        String str = "ۤۛۧۖ۟ۘۛۘۗۢۡۜۚۗۘۘ۫ۢ۠ۜۘۨۘۨۡۘ";
        int i2 = 0;
        int i3 = 0;
        while (true) {
            switch ((str.hashCode() ^ 93) ^ 1987286410) {
                case -1864515595:
                    actionMenuItemView.getCompoundDrawables()[0].setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
                    str = "ۡۢۛۧۤۗ۬۫ۖۘۨۙۢۘۙۢۚۦۡۦۨۘ۠ۥۘۛۧۨۘ";
                    break;
                case -1486482015:
                    i3 = this.f823a;
                    str = "ۙۧۡۘۡۨۦۘۥۘ۟ۘۦۛۡۨۨۘۤۢ۟۬۬ۖ";
                    break;
                case -924807417:
                    actionMenuItemView.getCompoundDrawables()[0].mutate().setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
                    str = "ۜ۠ۜۥۖۖۘۢ۠ۨۨۥۢ۟ۗۗۡۙۦۢۧۙۨۡ۠";
                    break;
                case -214628494:
                    actionMenuItemView = this.f824b;
                    str = "ۥۥۗۖۡۜۘۢۧۖۧۙۨۙۜۘ";
                    break;
                case 101798750:
                    str = "ۦ۫ۢ۟ۗۥۡۧۖۘ۟ۢۖۛ۫ۘۘ۬ۢۥۘۡ۬ۢۧۗۧۚۗۧ";
                    break;
                case 364480508:
                    i2 = this.f825c;
                    str = "ۛۚۥۘ۬۟ۛۧۖۧۘۖۨ۫ۖۡۨۘ۠۫ۡۘۖۘۡ۟۟ۢ۟۟ۨ";
                    break;
                case 434129957:
                    switch (i3) {
                        case 0:
                            str = "ۚۖۘۘۗۥ۫ۢ۠ۨۘ۠ۧ۫۠ۨۙۗۤ۠";
                            break;
                        default:
                            str = "ۢۤۗۥۤۦۘ۫۬ۜۘۚۘۖۘۡۨۧۘۦ۠ۙۖ۠ۤ۫ۤۥ";
                            break;
                    }
                case 1068854848:
                    int i4 = Conversation.f512a;
                    str = "ۛۧۖۜ۫ۡۧۦۚۚۥۜ۟ۥ۬ۘۧۘ۟ۘۖۘۜۤۦ";
                    break;
                case 1377722875:
                    String str2 = "ۡۡۨۤۙۨۘ۟ۗۚۖۘ۬۬۫۟ۨ۠ۘۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1272708695) {
                            case -459147550:
                                str2 = "ۥۧۦۘۤۖۥۘ۬ۖۦۘ۠ۜ۫ۦۨۨۗۤۜۛۙۘۗۧۥ";
                                break;
                            case 381165993:
                                str = "ۖۡۡۘ۫ۢۙۦۘۥۘۗۨۧۥۡۢۛۚۗۧۗۧۨۥۛۢۨ";
                                continue;
                            case 1244138032:
                                str = "ۜ۠ۜۥۖۖۘۢ۠ۨۨۥۢ۟ۗۗۡۙۦۢۧۙۨۡ۠";
                                continue;
                            case 1773134612:
                                if (actionMenuItemView.getCompoundDrawables()[0] == null) {
                                    str2 = "۟ۜۜ۠ۦۧۜۥۘۙۜۗ";
                                    break;
                                } else {
                                    str2 = "ۦۘۗۚۚۤۜۦ۠ۢۜۡۡۚۖۗ۬ۨۗۤۦۘۦۗۖۗ۬";
                                    break;
                                }
                        }
                    }
                    break;
                case 1747212746:
                case 1985291231:
                    return;
                case 2009331329:
                    str = "ۘۜۥۦ۟ۖۦۙۜۘ۠۫ۖۘۗۧۦۥۖۨۘ۬ۥۤ";
                    break;
            }
        }
    }
}
