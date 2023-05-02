package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4hO  reason: invalid class name and case insensitive filesystem */
public final class C92334hO implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A00 = C32281fy.A00(parcel);
        AnonymousClass3Y4 r3 = null;
        byte[] bArr = null;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[][] bArr2 = null;
        AnonymousClass3Y6[] r7 = null;
        boolean z2 = true;
        while (parcel.dataPosition() < A00) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    r3 = (AnonymousClass3Y4) C32281fy.A06(parcel, AnonymousClass3Y4.CREATOR, readInt);
                    break;
                case 3:
                    bArr = C32281fy.A0G(parcel, readInt);
                    break;
                case 4:
                    iArr = C32281fy.A0H(parcel, readInt);
                    break;
                case 5:
                    strArr = C32281fy.A0J(parcel, readInt);
                    break;
                case 6:
                    iArr2 = C32281fy.A0H(parcel, readInt);
                    break;
                case 7:
                    bArr2 = C32281fy.A0K(parcel, readInt);
                    break;
                case 8:
                    z2 = C32281fy.A0F(parcel, readInt);
                    break;
                case 9:
                    r7 = (AnonymousClass3Y6[]) C32281fy.A0I(parcel, AnonymousClass3Y6.CREATOR, readInt);
                    break;
                default:
                    C32281fy.A0C(parcel, readInt);
                    break;
            }
        }
        C32281fy.A0B(parcel, A00);
        return new AnonymousClass3Y3(r3, bArr, iArr, iArr2, r7, strArr, bArr2, z2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass3Y3[i2];
    }
}
