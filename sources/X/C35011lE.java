package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1lE  reason: invalid class name and case insensitive filesystem */
public class C35011lE implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(104);
    public final int A00;
    public final UserJid A01;
    public final String A02;
    public final boolean A03;

    public C35011lE(int i2, UserJid userJid, String str, boolean z2) {
        this.A01 = userJid;
        this.A03 = z2;
        this.A02 = str;
        this.A00 = i2;
    }

    public C35011lE(Parcel parcel) {
        this.A01 = (UserJid) parcel.readParcelable(UserJid.class.getClassLoader());
        this.A03 = parcel.readInt() > 0;
        String readString = parcel.readString();
        AnonymousClass00B.A06(readString);
        this.A02 = readString;
        this.A00 = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C35011lE r5 = (C35011lE) obj;
            if (!this.A01.equals(r5.A01) || this.A03 != r5.A03 || !TextUtils.equals(this.A02, r5.A02) || this.A00 != r5.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.A01.hashCode() + 31) * 31;
        int i2 = 1237;
        if (this.A03) {
            i2 = 1231;
        }
        return ((((hashCode + i2) * 31) + this.A02.hashCode()) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CallLog.Key[jid=");
        sb.append(this.A01);
        sb.append("; fromMe=");
        sb.append(this.A03);
        sb.append("; callId=");
        sb.append(this.A02);
        sb.append("; transactionId=");
        sb.append(this.A00);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.A01, i2);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }
}
