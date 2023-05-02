package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.io.File;

/* renamed from: X.1lk  reason: invalid class name and case insensitive filesystem */
public class C35331lk implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(48);
    public final AnonymousClass20I A00;

    public C35331lk(AnonymousClass20I r1) {
        this.A00 = r1;
    }

    public C35331lk(Parcel parcel) {
        Parcelable readParcelable = parcel.readParcelable(Uri.class.getClassLoader());
        AnonymousClass00B.A06(readParcelable);
        AnonymousClass20I r2 = new AnonymousClass20I((Uri) readParcelable);
        this.A00 = r2;
        r2.A0C(parcel.readByte() == 1 ? Byte.valueOf(parcel.readByte()) : null);
        String readString = parcel.readString();
        File file = null;
        r2.A0B(readString == null ? null : new File(readString));
        r2.A0D(parcel.readString());
        r2.A0E(parcel.readString());
        String readString2 = parcel.readString();
        synchronized (r2) {
            r2.A0A = readString2;
        }
        String readString3 = parcel.readString();
        synchronized (r2) {
            r2.A0B = readString3;
        }
        int readInt = parcel.readInt();
        synchronized (r2) {
            r2.A01 = readInt;
        }
        String readString4 = parcel.readString();
        file = readString4 != null ? new File(readString4) : file;
        synchronized (r2) {
            r2.A06 = file;
        }
        Rect rect = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        synchronized (r2) {
            r2.A04 = rect;
        }
        boolean z2 = parcel.readByte() != 1 ? false : true;
        synchronized (r2) {
            r2.A0F = z2;
        }
        Point point = (Point) parcel.readParcelable(Point.class.getClassLoader());
        synchronized (r2) {
            r2.A03 = point;
        }
        r2.A0A(parcel.readInt());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        String str;
        Rect rect;
        AnonymousClass20I r1 = this.A00;
        parcel.writeParcelable(r1.A0G, i2);
        Byte A06 = r1.A06();
        byte b2 = 0;
        if (A06 != null) {
            parcel.writeByte((byte) 1);
            b2 = A06.byteValue();
        }
        parcel.writeByte(b2);
        String str2 = null;
        parcel.writeString(r1.A05() == null ? null : r1.A05().getAbsolutePath());
        parcel.writeString(r1.A07());
        parcel.writeString(r1.A09());
        parcel.writeString(r1.A08());
        synchronized (r1) {
            str = r1.A0B;
        }
        parcel.writeString(str);
        parcel.writeInt(r1.A01());
        if (r1.A03() != null) {
            str2 = r1.A03().getAbsolutePath();
        }
        parcel.writeString(str2);
        synchronized (r1) {
            rect = r1.A04;
        }
        parcel.writeParcelable(rect, i2);
        parcel.writeByte(r1.A0F() ? (byte) 1 : 0);
        parcel.writeParcelable(r1.A02(), i2);
        parcel.writeInt(r1.A00());
    }
}
