package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1ZX  reason: invalid class name */
public class AnonymousClass1ZX extends UserJid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(57);

    public AnonymousClass1ZX(Parcel parcel) {
        super(parcel);
    }

    public AnonymousClass1ZX(String str) {
        super(str);
        int length = str.length();
        if (length < 1 || length > 15) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid LID: ");
            sb.append(str);
            sb.append(" - length must be between 1 and 15");
            throw new AnonymousClass1W4(sb.toString());
        } else if (!str.startsWith("0")) {
            for (char c2 : str.toCharArray()) {
                if (c2 < '0' || c2 > '9') {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid LID: ");
                    sb2.append(str);
                    sb2.append(" - must be numeric only");
                    throw new AnonymousClass1W4(sb2.toString());
                }
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Invalid LID: ");
            sb3.append(str);
            sb3.append(" - cannot start with 0");
            throw new AnonymousClass1W4(sb3.toString());
        }
    }

    public String getServer() {
        return "lid";
    }

    public int getType() {
        return 18;
    }
}
