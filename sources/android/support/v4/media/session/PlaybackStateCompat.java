package android.support.v4.media.session;

import X.AnonymousClass000;
import X.C03940Km;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(7);
    public List A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final Bundle A09;
    public final CharSequence A0A;

    public final class CustomAction implements Parcelable {
        public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(8);
        public final int A00;
        public final Bundle A01;
        public final CharSequence A02;
        public final String A03;

        public CustomAction(Parcel parcel) {
            this.A03 = parcel.readString();
            this.A02 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.A00 = parcel.readInt();
            this.A01 = parcel.readBundle(C03940Km.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder A0r = AnonymousClass000.A0r("Action:mName='");
            A0r.append(this.A02);
            A0r.append(", mIcon=");
            A0r.append(this.A00);
            A0r.append(", mExtras=");
            return AnonymousClass000.A0f(this.A01, A0r);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.A03);
            TextUtils.writeToParcel(this.A02, parcel, i2);
            parcel.writeInt(this.A00);
            parcel.writeBundle(this.A01);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A07 = parcel.readLong();
        this.A01 = parcel.readFloat();
        this.A08 = parcel.readLong();
        this.A06 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A0A = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A00 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.A05 = parcel.readLong();
        this.A09 = parcel.readBundle(C03940Km.class.getClassLoader());
        this.A02 = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("PlaybackState {");
        A0r.append("state=");
        A0r.append(this.A03);
        A0r.append(", position=");
        A0r.append(this.A07);
        A0r.append(", buffered position=");
        A0r.append(this.A06);
        A0r.append(", speed=");
        A0r.append(this.A01);
        A0r.append(", updated=");
        A0r.append(this.A08);
        A0r.append(", actions=");
        A0r.append(this.A04);
        A0r.append(", error code=");
        A0r.append(this.A02);
        A0r.append(", error message=");
        A0r.append(this.A0A);
        A0r.append(", custom actions=");
        A0r.append(this.A00);
        A0r.append(", active item id=");
        A0r.append(this.A05);
        return AnonymousClass000.A0h("}", A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A03);
        parcel.writeLong(this.A07);
        parcel.writeFloat(this.A01);
        parcel.writeLong(this.A08);
        parcel.writeLong(this.A06);
        parcel.writeLong(this.A04);
        TextUtils.writeToParcel(this.A0A, parcel, i2);
        parcel.writeTypedList(this.A00);
        parcel.writeLong(this.A05);
        parcel.writeBundle(this.A09);
        parcel.writeInt(this.A02);
    }
}
