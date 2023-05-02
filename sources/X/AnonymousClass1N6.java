package X;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.util.Linkify;
import com.facebook.redex.IDxCListenerShape21S0300000_2_I0;
import com.obwhatsapp.R;

/* renamed from: X.1N6  reason: invalid class name */
public class AnonymousClass1N6 {
    public final C19980zJ A00;
    public final C16980tz A01;

    public AnonymousClass1N6(C19980zJ r1, C16980tz r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static String A00(String str) {
        int length = str.length();
        if (length <= 96) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, 64));
        sb.append("…");
        sb.append(str.substring(length - 32));
        return sb.toString();
    }

    public void A01(Context context, Uri uri) {
        SpannableString spannableString = new SpannableString(this.A01.A00.getString(R.string.str0c24, new Object[]{A00(uri.toString())}));
        Linkify.addLinks(spannableString, 1);
        C32241fu r3 = new C32241fu(context, R.style.style0009);
        r3.A06(spannableString);
        r3.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
        r3.setPositiveButton(R.string.str02ac, new IDxCListenerShape21S0300000_2_I0(uri, context, this, 4));
        r3.A00();
    }
}
