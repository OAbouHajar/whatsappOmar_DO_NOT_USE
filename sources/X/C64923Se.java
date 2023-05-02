package X;

import android.view.View;
import com.facebook.redex.IDxDCompatShape4S0200000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Se  reason: invalid class name and case insensitive filesystem */
public class C64923Se extends C005602k {
    public UserJid A00;
    public final C30521cU A01;
    public final WaImageView A02;
    public final WaImageView A03;
    public final AnonymousClass4DZ A04;
    public final C204310c A05;
    public final ThumbnailButton A06;
    public final C16000sG A07;
    public final AnonymousClass2Ao A08;

    public C64923Se(View view, AnonymousClass4DZ r12, C204310c r13, C16000sG r14, C16080sP r15, AnonymousClass2Ao r16, AnonymousClass013 r17, C25781Lc r18) {
        super(view);
        ThumbnailButton thumbnailButton = (ThumbnailButton) C004601z.A0E(view, R.id.contact_photo);
        this.A06 = thumbnailButton;
        this.A03 = C13690nt.A0R(view, R.id.voice_call);
        this.A02 = C13690nt.A0R(view, R.id.video_call);
        this.A05 = r13;
        this.A08 = r16;
        this.A07 = r14;
        this.A04 = r12;
        this.A01 = new C30521cU(view, r15, r17, r18, (int) R.id.contact_name);
        View A0E = C004601z.A0E(view, R.id.multi_contact_photo);
        A0E.setVisibility(8);
        thumbnailButton.setVisibility(0);
        C004601z.A0E(view, R.id.date_time).setVisibility(8);
        C004601z.A0E(view, R.id.count).setVisibility(8);
        C004601z.A0E(view, R.id.call_type_icon).setVisibility(8);
        C004601z.A0E(view, R.id.selection_check).setVisibility(8);
        C004601z.A0d(A0E, 2);
        C004601z.A0j(view, new IDxDCompatShape4S0200000_2_I1(view, 0, this));
        C55352jN.A00(view);
    }
}
