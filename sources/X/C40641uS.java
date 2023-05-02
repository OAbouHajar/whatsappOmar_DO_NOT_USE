package X;

import android.content.Context;
import com.obwhatsapp.R;

/* renamed from: X.1uS  reason: invalid class name and case insensitive filesystem */
public final class C40641uS {
    public static String A00(Context context, C16080sP r7, AnonymousClass013 r8, C16010sH r9) {
        String A0A = r7.A0A(r9);
        if (A0A == null) {
            A0A = "";
        }
        String A0G = r8.A0G(context.getString(R.string.str0d5e));
        String A0G2 = r8.A0G(A0A);
        String string = context.getString(R.string.str1d07);
        return String.format(AnonymousClass013.A00(r8.A00), string, new Object[]{A0G2, A0G});
    }
}
