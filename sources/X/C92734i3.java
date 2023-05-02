package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4i3  reason: invalid class name and case insensitive filesystem */
public final class C92734i3 implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        String str = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        int[] iArr = null;
        byte[][] bArr6 = null;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C32281fy.A08(parcel, readInt);
                    break;
                case 3:
                    bArr = C32281fy.A0G(parcel, readInt);
                    break;
                case 4:
                    bArr2 = C32281fy.A0K(parcel, readInt);
                    break;
                case 5:
                    bArr3 = C32281fy.A0K(parcel, readInt);
                    break;
                case 6:
                    bArr4 = C32281fy.A0K(parcel, readInt);
                    break;
                case 7:
                    bArr5 = C32281fy.A0K(parcel, readInt);
                    break;
                case 8:
                    iArr = C32281fy.A0H(parcel, readInt);
                    break;
                case 9:
                    bArr6 = C32281fy.A0K(parcel, readInt);
                    break;
                default:
                    C32281fy.A0C(parcel, readInt);
                    break;
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3Y6(str, bArr, iArr, bArr2, bArr3, bArr4, bArr5, bArr6);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3Y6[i2];
    }
}
