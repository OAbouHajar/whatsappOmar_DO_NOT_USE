package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4jN  reason: invalid class name and case insensitive filesystem */
public final class C93544jN implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(52);
    public final int A00;
    public final C93534jM A01;
    public final C93534jM A02;
    public final C93534jM A03;
    public final String A04;

    public C93544jN(C93534jM r1, C93534jM r2, C93534jM r3, String str, int i2) {
        this.A04 = str;
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = r3;
        this.A00 = i2;
    }

    public C93544jN(Parcel parcel) {
        this.A04 = parcel.readString();
        Class<C93534jM> cls = C93534jM.class;
        this.A02 = (C93534jM) AnonymousClass3K3.A0U(parcel, cls);
        this.A03 = (C93534jM) AnonymousClass3K3.A0U(parcel, cls);
        this.A01 = (C93534jM) AnonymousClass3K3.A0U(parcel, cls);
        this.A00 = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass3K4.A0v(C93544jN.class, A0o);
        A0o.append("{id='");
        char A002 = AnonymousClass3K3.A00(this.A04, A0o);
        A0o.append(", preview='");
        A0o.append(this.A02);
        A0o.append(A002);
        A0o.append(", staticPreview='");
        A0o.append(this.A03);
        A0o.append(A002);
        A0o.append(", content='");
        A0o.append(this.A01);
        A0o.append(A002);
        return AnonymousClass000.A0k(A0o);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A02, i2);
        parcel.writeParcelable(this.A03, i2);
        parcel.writeParcelable(this.A01, i2);
        parcel.writeInt(this.A00);
    }
}
