package X;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* renamed from: X.4hI  reason: invalid class name and case insensitive filesystem */
public final class C92274hI implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A00 = C32281fy.A00(parcel2);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel2.dataPosition() < A00) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = C32281fy.A01(parcel2, readInt);
                    break;
                case 2:
                    str = C32281fy.A08(parcel2, readInt);
                    break;
                case 3:
                    str2 = C32281fy.A08(parcel2, readInt);
                    break;
                case 4:
                    str3 = C32281fy.A08(parcel2, readInt);
                    break;
                case 5:
                    str4 = C32281fy.A08(parcel2, readInt);
                    break;
                case 6:
                    uri = (Uri) C32281fy.A06(parcel2, Uri.CREATOR, readInt);
                    break;
                case 7:
                    str5 = C32281fy.A08(parcel2, readInt);
                    break;
                case 8:
                    j2 = C32281fy.A03(parcel2, readInt);
                    break;
                case 9:
                    str6 = C32281fy.A08(parcel2, readInt);
                    break;
                case 10:
                    arrayList = C32281fy.A0A(parcel2, Scope.CREATOR, readInt);
                    break;
                case 11:
                    str7 = C32281fy.A08(parcel2, readInt);
                    break;
                case 12:
                    str8 = C32281fy.A08(parcel2, readInt);
                    break;
                default:
                    C32281fy.A0C(parcel2, readInt);
                    break;
            }
        }
        C32281fy.A0B(parcel2, A00);
        return new GoogleSignInAccount(uri, str, str2, str3, str4, str5, str6, str7, str8, arrayList, i2, j2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new GoogleSignInAccount[i2];
    }
}
