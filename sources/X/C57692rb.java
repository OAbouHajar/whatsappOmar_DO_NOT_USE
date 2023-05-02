package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.2rb  reason: invalid class name and case insensitive filesystem */
public class C57692rb extends C005602k {
    public ImageView A00;
    public ImageView A01;
    public TextEmojiLabel A02;
    public TextEmojiLabel A03;
    public C30521cU A04;
    public final Context A05;
    public final C54602hp A06;
    public final C17230uk A07;
    public final C16000sG A08;
    public final AnonymousClass2Ao A09;
    public final C15810rt A0A;
    public final C16070sO A0B;
    public final C218115n A0C;
    public final C16320sq A0D;

    public C57692rb(Context context, View view, C54602hp r10, C17230uk r11, C16000sG r12, C16080sP r13, AnonymousClass2Ao r14, AnonymousClass013 r15, C15810rt r16, C16070sO r17, C218115n r18, C25781Lc r19, C16320sq r20) {
        super(view);
        this.A05 = context;
        this.A0D = r20;
        this.A0A = r16;
        this.A08 = r12;
        this.A06 = r10;
        this.A09 = r14;
        this.A0C = r18;
        this.A07 = r11;
        this.A0B = r17;
        this.A04 = new C30521cU(view, r13, r15, r19, (int) R.id.name);
        this.A03 = C13680ns.A0Q(view, R.id.status);
        this.A00 = C13680ns.A0J(view, R.id.avatar);
        this.A01 = C13680ns.A0J(view, R.id.group_chat_info_pin_indicator);
        this.A02 = C13680ns.A0Q(view, R.id.community_new);
        C004601z.A0d(this.A00, 2);
        view.setBackgroundResource(R.drawable.selector_orange_gradient);
        view.setFocusable(true);
        view.setClickable(true);
    }
}
