package X;

import android.content.Context;
import android.graphics.Typeface;

/* renamed from: X.1MO  reason: invalid class name */
public abstract class AnonymousClass1MO {
    public Typeface A00(C14990q7 r4, String str, int i2) {
        String str2;
        C18450wi.A0H(r4, 0);
        C18450wi.A0H(str, 1);
        Context context = r4.A00;
        C18450wi.A0B(context);
        if (str.equals("Optimistic Display App")) {
            str2 = "fonts/Optimistic_Text_A_Bd.ttf";
        } else {
            if (str.equals("Optimistic Display App Medium")) {
                str2 = "fonts/Optimistic_Text_A_Md.ttf";
            }
            Typeface create = Typeface.create(str, i2);
            C18450wi.A0B(create);
            return create;
        }
        Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), str2);
        if (createFromAsset != null) {
            return createFromAsset;
        }
        Typeface create2 = Typeface.create(str, i2);
        C18450wi.A0B(create2);
        return create2;
    }
}
