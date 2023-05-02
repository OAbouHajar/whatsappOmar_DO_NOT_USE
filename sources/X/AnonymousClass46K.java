package X;

import android.os.Bundle;
import com.obwhatsapp.chatinfo.view.custom.PhoneNumberSharedBottomSheet;

/* renamed from: X.46K  reason: invalid class name */
public final class AnonymousClass46K {
    public static final PhoneNumberSharedBottomSheet A00(String str, boolean z2) {
        PhoneNumberSharedBottomSheet phoneNumberSharedBottomSheet = new PhoneNumberSharedBottomSheet();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("arg_my_phone_number", str);
        A0D.putBoolean("arg_is_business", z2);
        phoneNumberSharedBottomSheet.A0T(A0D);
        return phoneNumberSharedBottomSheet;
    }
}
