package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.3SZ  reason: invalid class name */
public class AnonymousClass3SZ extends C005602k {
    public final ImageView A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final AnonymousClass38Y A05;
    public final C16440t3 A06;
    public final AnonymousClass013 A07;

    public AnonymousClass3SZ(View view, AnonymousClass38Y r3, C16440t3 r4, AnonymousClass013 r5) {
        super(view);
        this.A06 = r4;
        this.A07 = r5;
        this.A05 = r3;
        this.A01 = C13680ns.A0J(view, R.id.device_icon);
        this.A03 = C13680ns.A0L(view, R.id.name);
        this.A04 = C13680ns.A0L(view, R.id.status);
        this.A02 = C13680ns.A0J(view, R.id.sync_badge);
        this.A00 = C13680ns.A0J(view, R.id.error_badge);
    }
}
