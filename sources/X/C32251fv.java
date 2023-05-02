package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import java.util.List;

/* renamed from: X.1fv  reason: invalid class name and case insensitive filesystem */
public class C32251fv {
    public static int A00(Parcel parcel) {
        return A01(parcel, 20293);
    }

    public static int A01(Parcel parcel, int i2) {
        parcel.writeInt(i2 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void A02(Bundle bundle, Parcel parcel, int i2) {
        if (bundle != null) {
            int A01 = A01(parcel, i2);
            parcel.writeBundle(bundle);
            A05(parcel, A01);
        }
    }

    public static void A03(IBinder iBinder, Parcel parcel, int i2) {
        if (iBinder != null) {
            int A01 = A01(parcel, i2);
            parcel.writeStrongBinder(iBinder);
            A05(parcel, A01);
        }
    }

    public static void A04(Parcel parcel, float f2, int i2) {
        parcel.writeInt(i2 | AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START);
        parcel.writeFloat(f2);
    }

    public static void A05(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    public static void A06(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START);
        parcel.writeInt(i3);
    }

    public static void A07(Parcel parcel, int i2, long j2) {
        parcel.writeInt(i2 | AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
        parcel.writeLong(j2);
    }

    public static void A08(Parcel parcel, int i2, boolean z2) {
        parcel.writeInt(i2 | AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START);
        parcel.writeInt(z2 ? 1 : 0);
    }

    public static void A09(Parcel parcel, Parcelable parcelable, int i2, int i3, boolean z2) {
        if (parcelable != null) {
            int A01 = A01(parcel, i2);
            parcelable.writeToParcel(parcel, i3);
            A05(parcel, A01);
        } else if (z2) {
            parcel.writeInt(i2);
        }
    }

    public static void A0A(Parcel parcel, String str, int i2, boolean z2) {
        if (str != null) {
            int A01 = A01(parcel, i2);
            parcel.writeString(str);
            A05(parcel, A01);
        } else if (z2) {
            parcel.writeInt(i2);
        }
    }

    public static void A0B(Parcel parcel, List list, int i2) {
        if (list != null) {
            int A01 = A01(parcel, i2);
            parcel.writeStringList(list);
            A05(parcel, A01);
        }
    }

    public static void A0C(Parcel parcel, List list, int i2, boolean z2) {
        if (list != null) {
            int A01 = A01(parcel, i2);
            int size = list.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                Parcelable parcelable = (Parcelable) list.get(i3);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, 0);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            A05(parcel, A01);
        } else if (z2) {
            parcel.writeInt(i2);
        }
    }

    public static void A0D(Parcel parcel, byte[] bArr, int i2, boolean z2) {
        if (bArr != null) {
            int A01 = A01(parcel, i2);
            parcel.writeByteArray(bArr);
            A05(parcel, A01);
        } else if (z2) {
            parcel.writeInt(i2);
        }
    }

    public static void A0E(Parcel parcel, Parcelable[] parcelableArr, int i2, int i3) {
        if (parcelableArr != null) {
            int A01 = A01(parcel, i2);
            parcel.writeInt(r4);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, i3);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            A05(parcel, A01);
        }
    }

    public static void A0F(Parcel parcel, byte[][] bArr, int i2) {
        if (bArr != null) {
            int A01 = A01(parcel, i2);
            parcel.writeInt(r1);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            A05(parcel, A01);
        }
    }
}
