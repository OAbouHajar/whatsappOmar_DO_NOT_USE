package com.facebook.redex;

import X.AnonymousClass0Y8;
import X.C02670Ej;
import X.C02680Ek;
import X.C02690El;
import X.C02700Em;
import X.C02710En;
import android.os.Parcel;
import android.os.Parcelable;

public class IDxObjectShape25S0000000_I1 implements Parcelable.ClassLoaderCreator, Parcelable.Creator {
    public final int A00;

    public IDxObjectShape25S0000000_I1(int i2) {
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                return new C02700Em(parcel, (ClassLoader) null);
            case 1:
                return new C02690El(parcel, (ClassLoader) null);
            case 2:
                return new C02670Ej(parcel, (ClassLoader) null);
            case 3:
                return new AnonymousClass0Y8(parcel, (ClassLoader) null);
            case 4:
                return new C02680Ek(parcel, (ClassLoader) null);
            default:
                return new C02710En(parcel, (ClassLoader) null);
        }
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.A00) {
            case 0:
                return new C02700Em(parcel, classLoader);
            case 1:
                return new C02690El(parcel, classLoader);
            case 2:
                return new C02670Ej(parcel, classLoader);
            case 3:
                return new AnonymousClass0Y8(parcel, classLoader);
            case 4:
                return new C02680Ek(parcel, classLoader);
            default:
                return new C02710En(parcel, classLoader);
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        switch (this.A00) {
            case 0:
                return new C02700Em[i2];
            case 1:
                return new C02690El[i2];
            case 2:
                return new C02670Ej[i2];
            case 3:
                return new AnonymousClass0Y8[i2];
            case 4:
                return new C02680Ek[i2];
            default:
                return new C02710En[i2];
        }
    }
}
