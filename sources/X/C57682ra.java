package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.components.button.ThumbnailButton;

/* renamed from: X.2ra  reason: invalid class name and case insensitive filesystem */
public class C57682ra extends C005602k {
    public final C16040sK A00;
    public final TextEmojiLabel A01;
    public final C30521cU A02;
    public final WaImageButton A03;
    public final ThumbnailButton A04;
    public final C16000sG A05;
    public final C16080sP A06;
    public final C15810rt A07;
    public final C16070sO A08;

    public C57682ra(View view, C16040sK r10, C16000sG r11, C16080sP r12, AnonymousClass013 r13, C15810rt r14, C16070sO r15, C25781Lc r16) {
        super(view);
        this.A00 = r10;
        this.A07 = r14;
        this.A04 = (ThumbnailButton) C004601z.A0E(view, R.id.group_icon);
        this.A06 = r12;
        C30521cU r2 = new C30521cU(view, r12, r13, r16, (int) R.id.group_name);
        this.A02 = r2;
        this.A05 = r11;
        this.A08 = r15;
        C004601z.A0d(r2.A02, 2);
        r2.A05();
        this.A01 = C13680ns.A0Q(view, R.id.group_status);
        this.A03 = (WaImageButton) C004601z.A0E(view, R.id.remove_button);
    }
}
