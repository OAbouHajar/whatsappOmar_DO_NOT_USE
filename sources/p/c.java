package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.obwhatsapp.yo.i0;

public final class c extends View.BaseSavedState {
    public static final Parcelable.Creator<c> CREATOR = new i0(2);

    /* renamed from: a  reason: collision with root package name */
    public final String f2374a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2375b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2376c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2377d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2378e;

    static {
        String str = "ۨ۟ۧۖۧ۟ۨۘۤۛۙۦۘۨۚ۬۬ۙۖۘۦۦۜۘۖۜۘ۫ۢۨ";
        while (true) {
            switch ((str.hashCode() ^ 517) ^ 603366166) {
                case -1877819187:
                    str = "ۤ۠ۢۖۥۡۘ۟ۧۛۙۨ۟۫ۗۡۘۧ۬ۨ";
                    break;
                case -1687712156:
                    return;
            }
        }
    }

    public c(Parcel parcel) {
        super(parcel);
        this.f2374a = parcel.readString();
        this.f2375b = parcel.readInt();
        this.f2376c = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        this.f2377d = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        this.f2378e = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
    }

    public c(Parcelable parcelable, String str, int i2, boolean z2, boolean z3, boolean z4) {
        super(parcelable);
        this.f2374a = str;
        this.f2375b = i2;
        this.f2376c = z2;
        this.f2377d = z3;
        this.f2378e = z4;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        String str = "ۘۤۗ۬۫ۢۖۨۛۜۖۡۢۦۧۘۡۦۘۘۢۥۖ";
        while (true) {
            switch ((str.hashCode() ^ 595) ^ -2017456979) {
                case -1968978232:
                    super.writeToParcel(parcel, i2);
                    str = "ۙ۠ۜۘۚۨ۬ۡ۠۠ۘۙ۠ۖۢۛۧ۬ۙۧ۬ۜۦۘ";
                    break;
                case -1732071991:
                    str = "ۖۤۘۘۢۚۨۘۖۤۨۘۤۖۙۖۨۧۨۖ۬ۤۢۖۘۖ۟";
                    break;
                case -1556062999:
                    parcel.writeValue(Boolean.valueOf(this.f2378e));
                    str = "۬ۧۜۜۛۘۙ۬ۦۚ۫ۖۘۨ۠ۡۘ";
                    break;
                case -977164451:
                    str = "ۜۥۨۘۡۙۨۘۘۤۖۘۧ۬ۢۖۢۖۘۡۡ۫ۧۨۧ";
                    break;
                case -602495414:
                    parcel.writeValue(Boolean.valueOf(this.f2376c));
                    str = "ۥۛۗۧۥ۫ۜ۫ۖۘ۠ۧ۟۠ۥۘۡۙۜۘۘۨۘۘۖۙۖۘ";
                    break;
                case -71281697:
                    parcel.writeValue(Boolean.valueOf(this.f2377d));
                    str = "ۚۧۖۘ۟ۜۧۘ۟ۨۦ۬ۜۜ۫ۨۧۖ۟ۤ۫ۥ";
                    break;
                case 376755195:
                    str = "۠ۡۡۜۤۨۘۢۘۖۘۜۙۘۘۚۧۖۘۧۛۜ۫ۡۘ";
                    break;
                case 1312192099:
                    return;
                case 2043592629:
                    parcel.writeString(this.f2374a);
                    str = "ۗۥۨ۠ۤۘۙۧۗۜۚۖۡۨۧ";
                    break;
                case 2058345705:
                    parcel.writeInt(this.f2375b);
                    str = "ۗۜۘۖۥۛۨۢۥۚۚۢۙۦۧۡ۫";
                    break;
            }
        }
    }
}
