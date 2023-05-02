package X;

import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.registration.RegisterPhone;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.2zp  reason: invalid class name and case insensitive filesystem */
public class C60022zp extends AnonymousClass4SS {
    public final /* synthetic */ RegisterPhone A00;

    public C60022zp(RegisterPhone registerPhone) {
        this.A00 = registerPhone;
    }

    public void A00() {
        this.A00.A38();
    }

    public void A01(String str, String str2) {
        RegisterPhone registerPhone = this.A00;
        registerPhone.A0E.A04.setContentDescription((CharSequence) null);
        int i2 = 0;
        if ("".equals(str)) {
            registerPhone.A0E.A04.setText(R.string.str1374);
        } else if (str2 == null) {
            registerPhone.A0E.A04.setText(R.string.str137e);
            registerPhone.A37();
        } else {
            String A02 = registerPhone.A0M.A02(registerPhone.A01, str2);
            registerPhone.A0E.A04.setText(A02);
            registerPhone.A0E.A04.setContentDescription(C13680ns.A0d(registerPhone, A02, C13680ns.A1b(), 0, R.string.str1394));
            registerPhone.A38();
        }
        try {
            TextEmojiLabel textEmojiLabel = registerPhone.A09;
            if (!"eu".equals(registerPhone.A03.A03(str))) {
                i2 = 8;
            }
            textEmojiLabel.setVisibility(i2);
        } catch (IOException e2) {
            Log.e("register/phone/countrywatcher/aftertextchanged getTosRegion failed", e2);
            registerPhone.A09.setVisibility(8);
        }
    }
}
