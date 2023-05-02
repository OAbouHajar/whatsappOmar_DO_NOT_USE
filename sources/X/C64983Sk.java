package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;

/* renamed from: X.3Sk  reason: invalid class name and case insensitive filesystem */
public class C64983Sk extends C005602k {
    public final ViewGroup A00;
    public final ImageView A01;
    public final ImageView A02;
    public final C16040sK A03;
    public final C211212w A04;
    public final TextEmojiLabel A05;
    public final C30521cU A06;
    public final WaTextView A07;
    public final C17160ud A08;
    public final AnonymousClass2Ao A09;
    public final C16050sL A0A;

    public C64983Sk(View view, C16040sK r8, C211212w r9, C17160ud r10, C16080sP r11, AnonymousClass2Ao r12, AnonymousClass013 r13, C16050sL r14, C25781Lc r15) {
        super(view);
        this.A04 = r9;
        this.A03 = r8;
        this.A08 = r10;
        this.A09 = r12;
        this.A0A = r14;
        this.A00 = (ViewGroup) C004601z.A0E(view, R.id.group_chat_info_row_container);
        C004601z.A0E(view, R.id.group_chat_info_layout).setBackground((Drawable) null);
        this.A01 = C13680ns.A0J(view, R.id.avatar);
        this.A02 = C13680ns.A0J(view, R.id.community_member_error_icon);
        TextEmojiLabel A0Q = C13680ns.A0Q(view, R.id.name);
        this.A07 = C13680ns.A0S(view, R.id.owner);
        this.A05 = C13680ns.A0Q(view, R.id.status);
        this.A06 = new C30521cU(view.getContext(), A0Q, r11, r13, r15);
    }
}
