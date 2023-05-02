package X;

import android.content.Context;
import android.net.Uri;
import java.util.EnumSet;

/* renamed from: X.0Ub  reason: invalid class name and case insensitive filesystem */
public abstract class C06060Ub {
    public static final Uri A05 = Uri.parse("https://www.facebook.com/maps/report/?");
    public final Context A00;
    public final C04640Ni A01;
    public final C04650Nj A02;
    public final CharSequence A03 = "";
    public final CharSequence A04 = "";

    public C06060Ub(Context context) {
        this.A00 = context;
        this.A01 = new C04640Ni(context);
        this.A02 = new C04650Nj(this);
    }

    public abstract void A00(Context context, Uri uri, EnumSet enumSet);
}
