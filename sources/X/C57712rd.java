package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.components.SelectionCheckView;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.obwhatsapp.ui.voip.MultiContactThumbnail;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;

/* renamed from: X.2rd  reason: invalid class name and case insensitive filesystem */
public class C57712rd extends C005602k {
    public C101124wk A00;
    public final View.OnTouchListener A01 = new C94254kc(0.15f, 0.15f, 0.15f, 0.15f);
    public final C30521cU A02;
    public final WaImageView A03;
    public final WaImageView A04;
    public final WaImageView A05;
    public final WaTextView A06;
    public final WaTextView A07;
    public final WaTextView A08;
    public final C82504Db A09;
    public final SelectionCheckView A0A;
    public final ThumbnailButton A0B;
    public final C16000sG A0C;
    public final C16080sP A0D;
    public final AnonymousClass2Ao A0E;
    public final AnonymousClass2Ao A0F;
    public final MultiContactThumbnail A0G;

    public C57712rd(View view, C82504Db r11, C16000sG r12, C16080sP r13, AnonymousClass2Ao r14, AnonymousClass2Ao r15, AnonymousClass013 r16, C25781Lc r17) {
        super(view);
        this.A0C = r12;
        this.A0E = r14;
        this.A0F = r15;
        this.A0D = r13;
        this.A0B = (ThumbnailButton) C004601z.A0E(view, R.id.contact_photo);
        this.A0G = (MultiContactThumbnail) C004601z.A0E(view, R.id.multi_contact_photo);
        this.A03 = C13690nt.A0R(view, R.id.call_type_icon);
        this.A06 = C13680ns.A0S(view, R.id.count);
        this.A08 = C13680ns.A0S(view, R.id.date_time);
        WaTextView waTextView = (WaTextView) view.findViewById(R.id.do_not_disturb_label);
        yo.ChangeSize(waTextView, 2);
        this.A07 = waTextView;
        this.A05 = C13690nt.A0R(view, R.id.voice_call);
        this.A04 = C13690nt.A0R(view, R.id.video_call);
        this.A0A = (SelectionCheckView) C004601z.A0E(view, R.id.selection_check);
        this.A02 = new C30521cU(view, r13, r16, r17, (int) R.id.contact_name);
        this.A09 = r11;
        WaImageView waImageView = this.A05;
        View.OnTouchListener onTouchListener = this.A01;
        waImageView.setOnTouchListener(onTouchListener);
        WaImageView waImageView2 = this.A04;
        waImageView2.setOnTouchListener(onTouchListener);
        if (this.A09 == null) {
            Log.w("CallsHistoryCallItemViewHolder/setEventListeners event listener is null");
        } else {
            ThumbnailButton thumbnailButton = this.A0B;
            C34331k5.A01(thumbnailButton, this, 34);
            C13700nu.A0S(thumbnailButton, this, 3);
            MultiContactThumbnail multiContactThumbnail = this.A0G;
            C34331k5.A01(multiContactThumbnail, this, 33);
            C13700nu.A0S(multiContactThumbnail, this, 5);
            View view2 = this.A0H;
            C34331k5.A01(view2, this, 35);
            C13700nu.A0S(view2, this, 4);
            C13680ns.A18(waImageView, this, 41);
            C13680ns.A18(waImageView2, this, 40);
        }
        C55352jN.A00(view);
    }
}
