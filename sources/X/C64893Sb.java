package X;

import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.components.button.ThumbnailButton;

/* renamed from: X.3Sb  reason: invalid class name and case insensitive filesystem */
public class C64893Sb extends C005602k {
    public final TextView A00;
    public final C15900s5 A01;
    public final C30521cU A02;
    public final ThumbnailButton A03;
    public final C16000sG A04;
    public final C16080sP A05;
    public final AnonymousClass013 A06;
    public final C16490t9 A07;

    public C64893Sb(View view, C15900s5 r8, C16000sG r9, C16080sP r10, AnonymousClass013 r11, C16490t9 r12, C25781Lc r13) {
        super(view);
        this.A07 = r12;
        this.A01 = r8;
        this.A04 = r9;
        this.A05 = r10;
        this.A06 = r11;
        this.A03 = (ThumbnailButton) C004601z.A0E(view, R.id.storage_usage_chat_contact_photo);
        this.A00 = C13680ns.A0L(view, R.id.storage_usage_chat_used_space);
        this.A02 = new C30521cU(view, r10, r11, r13, (int) R.id.storage_usage_chat_contact_name);
        AnonymousClass2JP.A02(view);
    }
}
