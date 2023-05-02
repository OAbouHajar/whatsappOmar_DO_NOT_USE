package X;

import android.os.Bundle;
import com.obwhatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet;
import com.whatsapp.jid.Jid;

/* renamed from: X.46L  reason: invalid class name */
public final class AnonymousClass46L {
    public static final SharePhoneNumberBottomSheet A00(Jid jid, int i2) {
        SharePhoneNumberBottomSheet sharePhoneNumberBottomSheet = new SharePhoneNumberBottomSheet();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("arg_jid", jid.getRawString());
        A0D.putInt("arg_entry_point", i2);
        sharePhoneNumberBottomSheet.A0T(A0D);
        return sharePhoneNumberBottomSheet;
    }
}
