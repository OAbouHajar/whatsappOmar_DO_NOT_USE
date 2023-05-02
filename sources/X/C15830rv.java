package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;

/* renamed from: X.0rv  reason: invalid class name and case insensitive filesystem */
public abstract class C15830rv extends Jid implements Parcelable {
    public C15830rv(Parcel parcel) {
        super(parcel);
    }

    public C15830rv(String str) {
        super(str);
    }

    public static C15830rv A00(Jid jid) {
        if (jid instanceof C15830rv) {
            return (C15830rv) jid;
        }
        return null;
    }

    public static C15830rv A01(String str) {
        Jid jid = Jid.get(str);
        if (jid instanceof C15830rv) {
            return (C15830rv) jid;
        }
        throw new AnonymousClass1W4(str);
    }

    public static C15830rv A02(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return A01(str);
        } catch (AnonymousClass1W4 unused) {
            return null;
        }
    }
}
