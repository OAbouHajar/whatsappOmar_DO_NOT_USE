package com.obwhatsapp.yo;

import android.os.Parcel;
import android.os.Parcelable;
import com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView;
import com.obwhatsapp.youbasha.ui.views.FloatingActionsMenu;
import p.c;

public final class i0 implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final int f782a;

    public /* synthetic */ i0(int i2) {
        this.f782a = i2;
    }

    public final Object createFromParcel(Parcel parcel) {
        String str = "ۧۡۜۘۤۨ۟ۗ۬ۡۜۦۥۜ۫ۨۘۖۜۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 184) ^ 1666549090) {
                case -1880617658:
                    return new PatternLockView.Dot(parcel);
                case -351930136:
                    return new c(parcel);
                case -162326857:
                    str = "ۨۡۛۦۨۜ۠ۦۗۢ۫ۧۛۜۥۘۜ۫ۧ";
                    break;
                case -147454369:
                    switch (this.f782a) {
                        case 0:
                            str = "۫ۘۤۛ۟ۙۡۜۡ۬ۛۙ۟ۤۗۚۨۢۙۚۨۦۘۤۤۖۘ";
                            break;
                        case 1:
                            str = "۠ۦۘۘۖۙۖۜۧۘ۟۬ۢۢۛۖۥ۫ۢ۫۬۬ۗۜۘ";
                            break;
                        case 2:
                            str = "ۙۡۦۦۗۦۖ۠۟ۛۥۤۥ۟ۦۘۘۨۛۖۥۙۢۡۘ";
                            break;
                        default:
                            str = "ۖ۠ۨۦۙۜۤۘۘۘۖۖ۠ۤ۫ۖۜ۬۫";
                            break;
                    }
                case -119540891:
                    return new FloatingActionsMenu.SavedState(parcel);
                case -389386:
                    str = "ۖ۠ۘۚ۟۟ۚۜ۟ۨۗۥۘۧ۠۠ۜۢ۬۬ۨۧۘ";
                    break;
                case 84266693:
                    str = "۟۫ۡۢ۫۟ۜۚۦۘ۠ۗۖۨۙۦۡۗ۠ۘۧ۟ۘۨۢ";
                    break;
                case 1294987533:
                    return new j0(parcel);
            }
        }
    }

    public final Object[] newArray(int i2) {
        String str = "ۢۥۖۗۤۙۨۤۙۤۖۘۡۖۥۘۤۤۘۘۦۗۜ";
        while (true) {
            switch ((str.hashCode() ^ 481) ^ 65036875) {
                case -1823636060:
                    return new j0[i2];
                case -1814806097:
                    str = "ۚ۠ۥۘۚۤۘۘ۫ۜۖۘۘۛۧ۟ۨۗ";
                    break;
                case -1409412979:
                    return new PatternLockView.Dot[i2];
                case -976942271:
                    switch (this.f782a) {
                        case 0:
                            str = "ۢۗ۫ۤ۫۬ۗۙۥۛۗۦۦۦۤۥۚۡۛ۫ۘۦ۬۠۬ۦۘ";
                            break;
                        case 1:
                            str = "۬۠ۚ۠۠ۜۧۧۜۚۛۖۘۘ۠ۛ۟ۦۘ";
                            break;
                        case 2:
                            str = "ۥۡۡ۟ۦۦۘۙۗۦۦ۬۟ۜۥۘ۫ۜۜۜۜۙ";
                            break;
                        default:
                            str = "ۨۘۡۨۧۧۢ۟ۤ۠ۡۧۘۗ۟ۦۧۧۡ";
                            break;
                    }
                case -296415829:
                    str = "۫ۘ۟ۢۤۜۨۜۥۡۜۦۘۜۖۡۖۤۨۘۢۧۜۘ۫ۨ۬۫ۚ۠";
                    break;
                case -128673448:
                    str = "ۢۥۘۘۚۙۨۘۘۛۦۢۤۥۘۙۨۙۖۖۥۨۗۛ";
                    break;
                case 343475268:
                    return new c[i2];
                case 1796467562:
                    return new FloatingActionsMenu.SavedState[i2];
            }
        }
    }
}
