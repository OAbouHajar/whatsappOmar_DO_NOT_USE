package X;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.4Xn  reason: invalid class name and case insensitive filesystem */
public final class C87584Xn {
    public static final Bundle A00(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        Bundle A0D = C13690nt.A0D();
        if (i2 != -1) {
            A0D.putInt("id", i2);
        }
        if (i3 != 0) {
            A0D.putInt("title_res", i3);
        }
        if (i4 != 0) {
            A0D.putInt("message_res", i4);
            A01(A0D, "message_params_values", "message_params_types", objArr);
        }
        if (i5 != 0) {
            A0D.putInt("primary_action_text_id_res", i5);
        }
        if (i6 != 0) {
            A0D.putInt("secondary_action_text_res", i6);
        }
        if (i7 != -1) {
            A0D.putInt("secondary_action_color_res", i7);
        }
        return A0D;
    }

    public static final void A01(Bundle bundle, String str, String str2, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i2 = 0;
            if (length != 0) {
                ArrayList A0i = C13690nt.A0i(length);
                ArrayList A0i2 = C13690nt.A0i(length);
                do {
                    Object obj = objArr[i2];
                    i2++;
                    C18450wi.A0H(obj, 0);
                    A0i2.add(((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short)) ? 1 : 2);
                    A0i.add(obj.toString());
                } while (i2 < length);
                bundle.putStringArrayList(str, A0i);
                bundle.putIntegerArrayList(str2, A0i2);
            }
        }
    }
}
