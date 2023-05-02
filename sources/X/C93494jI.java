package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.obwhatsapp.R;

/* renamed from: X.4jI  reason: invalid class name and case insensitive filesystem */
public class C93494jI implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(45);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public C93494jI(int i2, int i3, int i4) {
        this.A00 = i2;
        this.A01 = R.string.str0362;
        this.A02 = i3;
        this.A04 = R.string.str14c3;
        this.A03 = i4;
        this.A05 = R.array.notification_template_big_media_narrow;
    }

    public C93494jI(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A05 = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A05);
    }
}
