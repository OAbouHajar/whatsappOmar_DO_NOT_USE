package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.obwhatsapp.R;

/* renamed from: X.46S  reason: invalid class name */
public class AnonymousClass46S {
    public static void A00(Activity activity, C14870pt r4, C14710pd r5, C25681Ks r6, int i2, int i3) {
        if (r5.A0C(913)) {
            Intent A09 = C13680ns.A09();
            A09.setClassName(activity.getPackageName(), "com.obwhatsapp.contact.ContactFormActivity");
            activity.startActivity(A09);
            return;
        }
        Intent A02 = C13700nu.A02("android.intent.action.INSERT");
        A02.setType("vnd.android.cursor.dir/contact");
        try {
            activity.startActivityForResult(A02, i2);
            r6.A02(true, i3);
        } catch (ActivityNotFoundException unused) {
            r4.A09(R.string.str1889, 0);
        }
    }
}
