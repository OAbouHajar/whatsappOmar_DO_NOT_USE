package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1ZT  reason: invalid class name */
public class AnonymousClass1ZT extends UserJid implements Parcelable {
    public static final UserJid A00;
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(63);

    static {
        try {
            A00 = A03("16505361212");
        } catch (AnonymousClass1W4 e2) {
            throw new IllegalStateException(e2);
        }
    }

    public AnonymousClass1ZT(Parcel parcel) {
        super(parcel);
    }

    public AnonymousClass1ZT(String str) {
        super(str);
        if (!A04(str)) {
            StringBuilder sb = new StringBuilder("Invalid user: ");
            sb.append(str);
            throw new AnonymousClass1W4(sb.toString());
        }
    }

    public static AnonymousClass1ZT A03(String str) {
        UserJid A02 = UserJid.JID_FACTORY.A02(str, "s.whatsapp.net");
        if (A02 instanceof AnonymousClass1ZT) {
            return (AnonymousClass1ZT) A02;
        }
        StringBuilder sb = new StringBuilder("invalid phone number: ");
        sb.append(str);
        throw new AnonymousClass1W4(sb.toString());
    }

    public static boolean A04(String str) {
        int length = str.length();
        if (length >= 5 && length <= 20 && !str.startsWith("10") && !str.startsWith("0")) {
            char[] charArray = str.toCharArray();
            int length2 = charArray.length;
            int i2 = 0;
            while (i2 < length2) {
                char c2 = charArray[i2];
                if (c2 >= '0' && c2 <= '9') {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    public String getServer() {
        return "s.whatsapp.net";
    }

    public int getType() {
        return 0;
    }
}
