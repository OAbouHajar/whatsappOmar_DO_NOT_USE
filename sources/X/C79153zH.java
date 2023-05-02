package X;

import android.content.Context;

/* renamed from: X.3zH  reason: invalid class name and case insensitive filesystem */
public class C79153zH extends AnonymousClass3O5 {
    public final AnonymousClass3NF A00;

    public C79153zH(Context context, int i2) {
        super(context);
        setClipToOutline(true);
        AnonymousClass3NF r0 = new AnonymousClass3NF();
        this.A00 = r0;
        r0.A00(i2);
        setOutlineProvider(r0);
    }

    public void setIsFullscreen(boolean z2) {
        this.A00.A01(!z2);
    }
}
