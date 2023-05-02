package com.obwhatsapp.yo;

import android.os.Parcel;
import android.os.Parcelable;
import android.preference.Preference;

public final class j0 extends Preference.BaseSavedState {
    public static final Parcelable.Creator<j0> CREATOR = new i0(0);

    /* renamed from: a  reason: collision with root package name */
    public int f787a;

    /* renamed from: b  reason: collision with root package name */
    public int f788b;

    static {
        String str = "ۧ۫ۡۘۥۘۗۤۜ۠ۤ۫ۖۜۖۡۜۖۜۛۦۙ";
        while (true) {
            switch ((str.hashCode() ^ 106) ^ -1835541958) {
                case -2117884973:
                    str = "ۡۧۘۘۡۡۛ۫ۧ۬ۢ۬ۘۘ۫۫ۜۘۨۤۨۘۧۛ";
                    break;
                case 1527584017:
                    return;
            }
        }
    }

    public j0(Parcel parcel) {
        super(parcel);
        this.f787a = parcel.readInt();
        this.f788b = parcel.readInt();
    }

    public j0(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        String str = "۬۟ۤۡ۟ۨۢۧ۠ۘۢۥۘۤ۟ۥ";
        while (true) {
            switch ((str.hashCode() ^ 721) ^ -204901726) {
                case -1132164876:
                    parcel.writeInt(this.f787a);
                    str = "ۚ۟ۜۜۖۘۘۜ۟۫۬ۥۖۘۥۦۘۦۖۚ";
                    break;
                case -1063611168:
                    str = "۫ۗۜۡۧۜ۬۬ۡۘ۠ۗۘۜۨۘ۟ۘۘ۫۫ۡۘ۬۟ۨۧۘ";
                    break;
                case -296620616:
                    str = "۬۫ۦۥۘۗ۫ۙۦۤۘۤۚۙ";
                    break;
                case -59529049:
                    str = "ۜۛۖۡۗۨۧۖ۬ۡۙۧۢۛ۫۫۠ۥۘ۟ۢۦۘۜۧۘۡۖۥۘ";
                    break;
                case -11904053:
                    super.writeToParcel(parcel, i2);
                    str = "ۙۧۤۢۥۙ۠ۗۨۘ۠ۜۢ۠۬ۛۥۦۘ";
                    break;
                case 120364182:
                    parcel.writeInt(this.f788b);
                    str = "۟۫ۢۙۘۦۘ۟ۧۛۗۥۦۘۙ۫ۡ۫ۨۤ۫۠";
                    break;
                case 1624792874:
                    return;
            }
        }
    }
}
