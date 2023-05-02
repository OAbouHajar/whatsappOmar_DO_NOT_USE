package com.google.android.gms.internal.gtm;

import android.os.Parcel;
import android.os.Parcelable;

public final class zzcp implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator CREATOR = new zzco();
    public String zza;
    public String zzb;
    public String zzc;

    @Deprecated
    public zzcp() {
    }

    @Deprecated
    public zzcp(Parcel parcel) {
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    @Deprecated
    public final int describeContents() {
        return 0;
    }

    @Deprecated
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
    }
}
