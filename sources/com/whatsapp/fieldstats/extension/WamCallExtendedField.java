package com.whatsapp.fieldstats.extension;

import X.AnonymousClass00B;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

public class WamCallExtendedField implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(45);
    public final int fieldId;
    public final String fieldType;
    public final Object fieldValue;

    public WamCallExtendedField(int i2, String str, Object obj) {
        this.fieldId = i2;
        this.fieldType = str;
        this.fieldValue = obj;
    }

    public WamCallExtendedField(Parcel parcel) {
        this.fieldId = parcel.readInt();
        String readString = parcel.readString();
        AnonymousClass00B.A06(readString);
        this.fieldType = readString;
        this.fieldValue = parcel.readValue((ClassLoader) null);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.fieldId);
        parcel.writeString(this.fieldType);
        parcel.writeValue(this.fieldValue);
    }
}
