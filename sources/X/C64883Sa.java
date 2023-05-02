package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickCListenerShape6S0200000_I1_1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.wds.components.button.WDSButton;

/* renamed from: X.3Sa  reason: invalid class name and case insensitive filesystem */
public final class C64883Sa extends C005602k {
    public final View A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;
    public final WaTextView A04;
    public final WDSButton A05;
    public final WDSButton A06;
    public final /* synthetic */ AnonymousClass2X7 A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64883Sa(View view, C19980zJ r6, AnonymousClass2X7 r7) {
        super(view);
        this.A07 = r7;
        this.A00 = view;
        this.A03 = (TextEmojiLabel) AnonymousClass3K4.A0L(view, R.id.title);
        this.A02 = (TextEmojiLabel) AnonymousClass3K4.A0L(view, R.id.subtitle);
        this.A01 = (ImageView) AnonymousClass3K4.A0L(view, R.id.avatar);
        WDSButton wDSButton = (WDSButton) AnonymousClass3K4.A0L(view, R.id.accept_button);
        this.A05 = wDSButton;
        WDSButton wDSButton2 = (WDSButton) AnonymousClass3K4.A0L(view, R.id.reject_button);
        this.A06 = wDSButton2;
        this.A04 = (WaTextView) AnonymousClass3K4.A0L(view, R.id.request_status);
        view.setOnClickListener(new ViewOnClickCListenerShape6S0200000_I1_1(r6, 28, view));
        C13680ns.A1C(wDSButton, r7, this, 29);
        C13680ns.A1C(wDSButton2, r7, this, 30);
    }
}
