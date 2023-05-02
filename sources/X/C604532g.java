package X;

import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.32g  reason: invalid class name and case insensitive filesystem */
public class C604532g extends C65093Sv {
    public C16010sH A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;
    public final /* synthetic */ AnonymousClass291 A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C604532g(View view, AnonymousClass291 r4) {
        super(view, r4);
        this.A04 = r4;
        this.A02 = C13680ns.A0R(view, R.id.name);
        ImageView A0K = C13680ns.A0K(view, R.id.avatar);
        this.A01 = A0K;
        this.A03 = C13680ns.A0R(view, R.id.push_name);
        C004601z.A0d(A0K, 2);
    }

    public void A07(C16010sH r9, C39721sx r10) {
        this.A00 = r9;
        C13680ns.A1C(this.A0H, this, r10, 36);
        C16010sH r1 = this.A00;
        AnonymousClass291 r5 = this.A04;
        C16040sK r0 = r5.A0z;
        r0.A0B();
        boolean equals = r1.equals(r0.A01);
        TextEmojiLabel textEmojiLabel = this.A02;
        if (equals) {
            textEmojiLabel.setText(R.string.str1ba8);
            String A07 = C28961Zl.A07(r5.A1D, r5.A1K.A03(r5.A0c) - r5.A1B.A00());
            TextEmojiLabel textEmojiLabel2 = this.A03;
            textEmojiLabel2.setText(A07);
            textEmojiLabel2.setVisibility(0);
        } else {
            C16080sP r3 = r5.A18;
            textEmojiLabel.setText(r3.A08(this.A00));
            boolean A0S = r3.A0S(this.A00, -1);
            TextEmojiLabel textEmojiLabel3 = this.A03;
            if (A0S) {
                textEmojiLabel3.setVisibility(0);
                textEmojiLabel3.A0I((List) null, r3.A0F(this.A00));
            } else {
                textEmojiLabel3.setVisibility(8);
            }
        }
        r5.A0b.A08(this.A01, this.A00, false);
    }
}
