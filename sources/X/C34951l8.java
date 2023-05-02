package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.Jid;

/* renamed from: X.1l8  reason: invalid class name and case insensitive filesystem */
public class C34951l8 extends Jid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(53);

    public C34951l8(Parcel parcel) {
        super(parcel);
    }

    public C34951l8(String str) {
        super(str);
        int length = str.length();
        if (length >= 18 && length <= 32) {
            int i2 = 0;
            do {
                char charAt = str.charAt(i2);
                if (charAt >= '0') {
                    if (charAt > '9') {
                        char c2 = 'f';
                        if (charAt < 'a') {
                            if (charAt >= 'A') {
                                c2 = 'F';
                            }
                        }
                        if (charAt > c2) {
                        }
                    }
                    i2++;
                }
            } while (i2 < length);
            return;
        }
        throw new AnonymousClass1W4(str);
    }

    public String getServer() {
        return "call";
    }

    public int getType() {
        return 10;
    }
}
