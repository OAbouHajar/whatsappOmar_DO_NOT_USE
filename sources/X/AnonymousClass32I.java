package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;

/* renamed from: X.32I  reason: invalid class name */
public final class AnonymousClass32I extends C55982kl {
    public C93544jN A00;
    public C16690tT A01;
    public String A02;
    public final ViewGroup A03;
    public final ImageView A04;
    public final WaImageView A05;
    public final C16490t9 A06;
    public final C25841Li A07;
    public final C108745Pe A08;
    public final AnonymousClass4MI A09;

    public AnonymousClass32I(ViewGroup viewGroup, AnonymousClass01V r7, C16490t9 r8, C25841Li r9, C108745Pe r10, C17020u3 r11) {
        super(C13680ns.A0G(viewGroup).inflate(R.layout.layout02bd, viewGroup, false));
        this.A07 = r9;
        this.A06 = r8;
        this.A08 = r10;
        View view = this.A0H;
        this.A04 = C13680ns.A0K(view, R.id.thumb_view);
        ViewGroup A0K = C13690nt.A0K(view, R.id.video_preview_container);
        this.A03 = A0K;
        if (C42971z5.A01(r7, r11) >= 2012) {
            AnonymousClass4MI r0 = new AnonymousClass4MI(view.getContext());
            this.A09 = r0;
            A0K.addView(r0.A02, C13690nt.A0M());
            this.A05 = C13690nt.A0R(A0K, R.id.gif);
            A0K.setVisibility(0);
        }
    }
}
