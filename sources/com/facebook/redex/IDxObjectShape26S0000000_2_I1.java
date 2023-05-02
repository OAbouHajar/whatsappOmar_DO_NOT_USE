package com.facebook.redex;

import X.AnonymousClass3PC;
import X.AnonymousClass3PD;
import X.AnonymousClass3PE;
import android.os.Parcel;
import android.os.Parcelable;

public class IDxObjectShape26S0000000_2_I1 implements Parcelable.ClassLoaderCreator, Parcelable.Creator {
    public final int A00;

    public IDxObjectShape26S0000000_2_I1(int i2) {
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                return new AnonymousClass3PD(parcel, (ClassLoader) null);
            case 1:
                return new AnonymousClass3PC(parcel, (ClassLoader) null);
            default:
                return new AnonymousClass3PE(parcel, (ClassLoader) null);
        }
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.A00) {
            case 0:
                return new AnonymousClass3PD(parcel, classLoader);
            case 1:
                return new AnonymousClass3PC(parcel, classLoader);
            default:
                return new AnonymousClass3PE(parcel, classLoader);
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        switch (this.A00) {
            case 0:
                return new AnonymousClass3PD[i2];
            case 1:
                return new AnonymousClass3PC[i2];
            default:
                return new AnonymousClass3PE[i2];
        }
    }
}
