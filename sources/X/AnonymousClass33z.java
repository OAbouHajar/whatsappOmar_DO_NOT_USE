package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.33z  reason: invalid class name */
public class AnonymousClass33z extends AnonymousClass3O3 {
    public C25831Lh A00;
    public AnonymousClass013 A01;
    public final Runnable A02;

    public AnonymousClass33z(Context context, Runnable runnable) {
        super(context);
        this.A02 = runnable;
        FrameLayout.inflate(context, R.layout.layout04e5, this);
        C13700nu.A08(this, R.id.quoted_message_frame).setForeground(AnonymousClass2SR.A04(context, C13690nt.A0C(context, R.drawable.balloon_incoming_frame), R.color.color0183));
        C45902Bo.A08(C004601z.A0E(this, R.id.quoted_title_frame), this.A01, 0, context.getResources().getDimensionPixelSize(R.dimen.dimen029c));
        C004601z.A0E(this, R.id.cancel).setVisibility(0);
        C13680ns.A15(C004601z.A0E(this, R.id.cancel), this, 16);
        TextView A0L = C13680ns.A0L(this, R.id.quoted_title);
        A0L.setTextSize(this.A00.A01(context.getResources()));
        AnonymousClass1UP.A06(A0L);
    }
}
