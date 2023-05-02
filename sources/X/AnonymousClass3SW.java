package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.components.button.ThumbnailButton;

/* renamed from: X.3SW  reason: invalid class name */
public class AnonymousClass3SW extends C005602k {
    public final TextEmojiLabel A00;
    public final C30521cU A01;
    public final WaImageButton A02;
    public final ThumbnailButton A03;
    public final C16070sO A04;
    public final C218115n A05;

    public AnonymousClass3SW(View view, C16080sP r10, AnonymousClass013 r11, C16070sO r12, C218115n r13, C25781Lc r14) {
        super(view);
        this.A05 = r13;
        this.A03 = (ThumbnailButton) C004601z.A0E(view, R.id.group_icon);
        C30521cU r2 = new C30521cU(view, r10, r11, r14, (int) R.id.group_name);
        this.A01 = r2;
        this.A04 = r12;
        C004601z.A0d(r2.A02, 2);
        r2.A05();
        this.A00 = C13680ns.A0Q(view, R.id.group_status);
        this.A02 = (WaImageButton) C004601z.A0E(view, R.id.remove_button);
    }
}
