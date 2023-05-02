package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.mod.bomfab.R$styleable;
import java.util.Arrays;

/* renamed from: X.0rh  reason: invalid class name and case insensitive filesystem */
public final class C15700rh extends C15710ri {
    public static final C15700rh A04 = new C15700rh(0);
    public static final Parcelable.Creator CREATOR = new C92534hi();
    public final int A00;
    public final int A01;
    public final PendingIntent A02;
    public final String A03;

    public C15700rh(int i2) {
        this((PendingIntent) null, (String) null, 1, i2);
    }

    public C15700rh(int i2, PendingIntent pendingIntent) {
        this(pendingIntent, (String) null, 1, i2);
    }

    public C15700rh(PendingIntent pendingIntent, String str, int i2, int i3) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = pendingIntent;
        this.A03 = str;
    }

    public boolean A00() {
        return (this.A01 == 0 || this.A02 == null) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C15700rh) {
                C15700rh r5 = (C15700rh) obj;
                if (this.A01 != r5.A01 || !AnonymousClass45A.A00(this.A02, r5.A02) || !AnonymousClass45A.A00(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), this.A02, this.A03});
    }

    public String toString() {
        String str;
        C13930oJ r3 = new C13930oJ(this);
        int i2 = this.A01;
        if (i2 == 99) {
            str = "UNFINISHED";
        } else if (i2 != 1500) {
            switch (i2) {
                case -1:
                    str = "UNKNOWN";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                    str = "SERVICE_MISSING";
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 9:
                    str = "SERVICE_INVALID";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 11:
                    str = "LICENSE_CHECK_FAILED";
                    break;
                default:
                    switch (i2) {
                        case 13:
                            str = "CANCELED";
                            break;
                        case 14:
                            str = "TIMEOUT";
                            break;
                        case 15:
                            str = "INTERRUPTED";
                            break;
                        case 16:
                            str = "API_UNAVAILABLE";
                            break;
                        case 17:
                            str = "SIGN_IN_FAILED";
                            break;
                        case 18:
                            str = "SERVICE_UPDATING";
                            break;
                        case 19:
                            str = "SERVICE_MISSING_PERMISSION";
                            break;
                        case 20:
                            str = "RESTRICTED_PROFILE";
                            break;
                        case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                            str = "API_VERSION_UPDATE_REQUIRED";
                            break;
                        case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                            str = "RESOLUTION_ACTIVITY_NOT_FOUND";
                            break;
                        case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                            str = "API_DISABLED";
                            break;
                        case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                            str = "API_DISABLED_FOR_CONNECTION";
                            break;
                        default:
                            StringBuilder sb = new StringBuilder(31);
                            sb.append("UNKNOWN_ERROR_CODE(");
                            sb.append(i2);
                            sb.append(")");
                            str = sb.toString();
                            break;
                    }
            }
        } else {
            str = "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        r3.A00(str, "statusCode");
        r3.A00(this.A02, "resolution");
        r3.A00(this.A03, "message");
        return r3.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A012 = C32251fv.A01(parcel, 20293);
        C32251fv.A06(parcel, 1, this.A00);
        C32251fv.A06(parcel, 2, this.A01);
        C32251fv.A09(parcel, this.A02, 3, i2, false);
        C32251fv.A0A(parcel, this.A03, 4, false);
        C32251fv.A05(parcel, A012);
    }
}
