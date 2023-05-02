package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.obwhatsapp.ui.voip.MultiContactThumbnail;

/* renamed from: X.3Sh  reason: invalid class name and case insensitive filesystem */
public class C64953Sh extends C005602k {
    public C101134wl A00 = null;
    public final TextEmojiLabel A01;
    public final C30521cU A02;
    public final WaImageView A03;
    public final WaTextView A04;
    public final C82494Da A05;
    public final ThumbnailButton A06;
    public final AnonymousClass2Ao A07;
    public final AnonymousClass2Ao A08;
    public final MultiContactThumbnail A09;

    public C64953Sh(View view, C82494Da r8, C16080sP r9, AnonymousClass2Ao r10, AnonymousClass2Ao r11, AnonymousClass013 r12, C25781Lc r13) {
        super(view);
        this.A07 = r11;
        this.A08 = r10;
        this.A05 = r8;
        this.A06 = (ThumbnailButton) C004601z.A0E(view, R.id.contact_photo);
        this.A09 = (MultiContactThumbnail) C004601z.A0E(view, R.id.multi_contact_photo);
        this.A01 = C13680ns.A0Q(view, R.id.participant_names);
        this.A04 = C13680ns.A0S(view, R.id.ongoing_label);
        this.A03 = C13690nt.A0R(view, R.id.call_type_icon);
        C30521cU r0 = new C30521cU(view, r9, r12, r13, (int) R.id.participant_names);
        this.A02 = r0;
        r0.A05();
    }
}
