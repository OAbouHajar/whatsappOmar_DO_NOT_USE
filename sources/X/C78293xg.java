package X;

import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.3xg  reason: invalid class name and case insensitive filesystem */
public class C78293xg extends C64643Rc {
    public final View A00;
    public final View A01;
    public final TextView A02;

    public C78293xg(View view) {
        super(view);
        this.A00 = C004601z.A0E(view, R.id.wallpaper_header_chevron_view);
        TextView A0L = C13680ns.A0L(view, R.id.wallpaper_header_title);
        this.A02 = A0L;
        this.A01 = C004601z.A0E(view, R.id.wallpaper_header_description);
        AnonymousClass1UP.A06(A0L);
    }
}
