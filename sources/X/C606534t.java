package X;

import android.widget.FrameLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.34t  reason: invalid class name and case insensitive filesystem */
public class C606534t extends C41841wk {
    public final FrameLayout A00;
    public final TextEmojiLabel A01;
    public final C18890xQ A02;
    public final C25831Lh A03;
    public final C14710pd A04;
    public final C16740tZ A05;
    public final AnonymousClass4WP A06 = new AnonymousClass4WP(4500);

    public C606534t(C14870pt r13, C17090uW r14, C18890xQ r15, C25831Lh r16, AnonymousClass01V r17, AnonymousClass013 r18, C14710pd r19, AnonymousClass1P8 r20, C16740tZ r21, AnonymousClass4Ta r22) {
        super(r14, r13, r17, r18, r20, r22);
        this.A04 = r19;
        this.A02 = r15;
        C25831Lh r2 = r16;
        this.A03 = r2;
        C16740tZ r0 = r21;
        AnonymousClass00B.A06(r0);
        this.A05 = r0;
        TextEmojiLabel textEmojiLabel = new TextEmojiLabel(A01());
        this.A01 = textEmojiLabel;
        C13680ns.A0v(A01(), textEmojiLabel, R.color.color090b);
        textEmojiLabel.setGravity(17);
        textEmojiLabel.setTextSize(r2.A02(A01().getResources(), r2.A02));
        int A022 = (int) r2.A02(A01().getResources(), r2.A02);
        textEmojiLabel.setPadding(A022, A022, A022, A022);
        FrameLayout frameLayout = new FrameLayout(A01());
        this.A00 = frameLayout;
        frameLayout.addView(textEmojiLabel, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    public long A08() {
        return this.A06.A00;
    }

    public void A09() {
        C41841wk.A00(this.A06, this);
    }

    public void A0A() {
        this.A06.A02();
    }
}
