package com.google.android.gms.wearable.internal;

import X.AnonymousClass000;
import X.AnonymousClass3K3;
import X.AnonymousClass5ME;
import X.C13710nw;
import X.C15710ri;
import X.C32251fv;
import X.C92934iN;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.ReflectedParcelable;

@KeepName
public class DataItemAssetParcelable extends C15710ri implements ReflectedParcelable, AnonymousClass5ME {
    public static final Parcelable.Creator CREATOR = new C92934iN();
    public final String A00;
    public final String A01;

    public DataItemAssetParcelable(AnonymousClass5ME r2) {
        DataItemAssetParcelable dataItemAssetParcelable = (DataItemAssetParcelable) r2;
        String str = dataItemAssetParcelable.A00;
        C13710nw.A01(str);
        this.A00 = str;
        String str2 = dataItemAssetParcelable.A01;
        C13710nw.A01(str2);
        this.A01 = str2;
    }

    public DataItemAssetParcelable(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public final String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("DataItemAssetParcelable[@");
        A0r.append(Integer.toHexString(hashCode()));
        String str = this.A00;
        if (str == null) {
            A0r.append(",noid");
        } else {
            A0r.append(",");
            A0r.append(str);
        }
        A0r.append(", key=");
        A0r.append(this.A01);
        return AnonymousClass000.A0h("]", A0r);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A0A(parcel, this.A01, 3, AnonymousClass3K3.A1R(parcel, this.A00));
        C32251fv.A05(parcel, A002);
    }
}
