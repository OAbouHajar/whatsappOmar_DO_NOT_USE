package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.obwhatsapp.R;

/* renamed from: X.2hb  reason: invalid class name and case insensitive filesystem */
public class C54482hb extends C54492hc {
    public Drawable A00;

    public C54482hb(Context context) {
        super(context);
    }

    public void setMediaItem(AnonymousClass2BF r4) {
        Context context;
        int i2;
        super.setMediaItem(r4);
        if (r4 != null) {
            int type = r4.getType();
            if (type == 1) {
                context = getContext();
                i2 = R.drawable.mark_video;
            } else if (type == 2) {
                context = getContext();
                i2 = R.drawable.mark_gif;
            }
            this.A00 = AnonymousClass00T.A04(context, i2);
            return;
        }
        this.A00 = null;
    }
}
