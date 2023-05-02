package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;
import org.apache.commons.io.IOUtils;

/* renamed from: X.0U9  reason: invalid class name */
public class AnonymousClass0U9 {
    public static final Object A04 = new Object();
    public C12130jt A00;
    public final Context A01;
    public final String A02;
    public final Map A03;

    public AnonymousClass0U9(Drawable.Callback callback, String str, Map map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            StringBuilder A0q = AnonymousClass000.A0q(str);
            A0q.append(IOUtils.DIR_SEPARATOR_UNIX);
            str = A0q.toString();
        }
        this.A02 = str;
        if (!(callback instanceof View)) {
            C05770Sy.A00("LottieDrawable must be inside of a view for images to work.");
            this.A03 = AnonymousClass000.A0x();
            return;
        }
        this.A01 = ((View) callback).getContext();
        this.A03 = map;
        this.A00 = null;
    }
}
