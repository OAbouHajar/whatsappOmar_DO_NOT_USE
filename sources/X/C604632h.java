package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.32h  reason: invalid class name and case insensitive filesystem */
public class C604632h extends C65093Sv {
    public C16010sH A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextEmojiLabel A04;
    public final TextEmojiLabel A05;
    public final /* synthetic */ AnonymousClass291 A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C604632h(View view, AnonymousClass291 r4) {
        super(view, r4);
        this.A06 = r4;
        this.A04 = C13680ns.A0R(view, R.id.name);
        this.A02 = C13680ns.A0M(view, R.id.status);
        this.A03 = C13680ns.A0M(view, R.id.time_left);
        ImageView A0K = C13680ns.A0K(view, R.id.avatar);
        this.A01 = A0K;
        this.A05 = C13680ns.A0R(view, R.id.push_name);
        C004601z.A0d(A0K, 2);
    }

    public void A07(C16010sH r14, C39721sx r15) {
        String A0d;
        this.A00 = r14;
        C13680ns.A1C(this.A0H, this, r15, 35);
        AnonymousClass291 r7 = this.A06;
        C16440t3 r10 = r7.A1B;
        long A002 = r10.A00();
        C16010sH r1 = this.A00;
        C16040sK r0 = r7.A0z;
        r0.A0B();
        boolean equals = r1.equals(r0.A01);
        TextEmojiLabel textEmojiLabel = this.A04;
        if (equals) {
            textEmojiLabel.setText(R.string.str1ba8);
            C34331k5.A03(this.A02, this, 33);
            long A032 = r7.A1K.A03(r7.A0c) - A002;
            if (A032 >= 0) {
                String A07 = C28961Zl.A07(r7.A1D, A032);
                TextView textView = this.A03;
                textView.setText(A07);
                textView.setVisibility(0);
            } else {
                this.A03.setVisibility(8);
            }
        } else {
            C16080sP r8 = r7.A18;
            textEmojiLabel.setText(r8.A08(this.A00));
            long j2 = r15.A05;
            if (A002 - j2 < 60000) {
                A0d = r7.A0E.getString(R.string.str0c94);
            } else {
                A0d = C13680ns.A0d(r7.A0E, C47672Jx.A00(r7.A1D, r10.A02(j2)), C13680ns.A1b(), 0, R.string.str0c75);
            }
            this.A02.setText(A0d);
            boolean A0S = r8.A0S(this.A00, -1);
            TextEmojiLabel textEmojiLabel2 = this.A05;
            if (A0S) {
                textEmojiLabel2.setVisibility(0);
                textEmojiLabel2.A0I((List) null, r8.A0F(this.A00));
            } else {
                textEmojiLabel2.setVisibility(8);
            }
        }
        r7.A0b.A08(this.A01, this.A00, false);
    }
}
