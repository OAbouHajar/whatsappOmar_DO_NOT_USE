package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4pX  reason: invalid class name and case insensitive filesystem */
public final class C97184pX implements C35731mP {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(21);
    public final float A00;
    public final int A01;

    public C97184pX(float f2, int i2) {
        this.A00 = f2;
        this.A01 = i2;
    }

    public C97184pX(Parcel parcel) {
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readInt();
    }

    public /* synthetic */ byte[] AHA() {
        return null;
    }

    public /* synthetic */ C32491gT AHB() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C97184pX.class != obj.getClass()) {
                return false;
            }
            C97184pX r5 = (C97184pX) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K3.A07(Float.valueOf(this.A00).hashCode()) + this.A01;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("smta: captureFrameRate=");
        A0r.append(this.A00);
        A0r.append(", svcTemporalLayerCount=");
        return AnonymousClass000.A0l(A0r, this.A01);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A01);
    }
}
