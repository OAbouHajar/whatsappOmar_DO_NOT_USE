package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.obwhatsapp.CircleWaImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.2yl  reason: invalid class name and case insensitive filesystem */
public class C59682yl extends C65023So {
    public final CircleWaImageView A00;
    public final TextEmojiLabel A01;
    public final AnonymousClass1PZ A02;

    public C59682yl(View view, AnonymousClass1PZ r3) {
        super(view);
        this.A02 = r3;
        this.A01 = C13680ns.A0Q(view, R.id.business_name);
        this.A00 = (CircleWaImageView) C004601z.A0E(view, R.id.business_avatar);
    }

    public /* bridge */ /* synthetic */ void A07(Object obj) {
        C71773l1 r7 = (C71773l1) obj;
        TextEmojiLabel textEmojiLabel = this.A01;
        AnonymousClass1US r2 = r7.A01;
        textEmojiLabel.setText(r2.A0E);
        if (r2.A06 == 2) {
            textEmojiLabel.A0C(R.drawable.ic_verified, R.dimen.dimen04bd);
        } else {
            textEmojiLabel.A0A();
        }
        String str = r2.A0C;
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass1PZ r22 = this.A02;
            CircleWaImageView circleWaImageView = this.A00;
            Drawable A04 = AnonymousClass00T.A04(circleWaImageView.getContext(), R.drawable.avatar_contact);
            r22.A00.A00(A04, A04, circleWaImageView, (C109485Sh) null, str);
        } else {
            this.A00.setImageResource(R.drawable.avatar_contact);
        }
        C34331k5.A04(this.A0H, this, r7, 17);
    }
}
