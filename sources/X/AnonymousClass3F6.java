package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.yo.yo;

/* renamed from: X.3F6  reason: invalid class name */
public final class AnonymousClass3F6 implements C108595Op {
    public final Context A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final C30521cU A03;
    public final AnonymousClass2Ao A04;
    public final AnonymousClass013 A05;
    public final C20260zl A06;

    public AnonymousClass3F6(Context context, View view, C16080sP r9, AnonymousClass2Ao r10, AnonymousClass013 r11, C20260zl r12, C25781Lc r13) {
        this.A00 = context;
        this.A06 = r12;
        this.A05 = r11;
        this.A04 = r10;
        this.A01 = C13680ns.A0K(view, R.id.contactpicker_row_photo);
        C30521cU r0 = new C30521cU(view, r9, r11, r13, (int) R.id.contactpicker_row_name);
        this.A03 = r0;
        r0.A05();
        TextEmojiLabel A0R = C13680ns.A0R(view, R.id.contactpicker_row_status);
        this.A02 = A0R;
        yo.ChangeSize(A0R, 2);
    }

    public void ANe(C450226r r6) {
        C16010sH r4 = ((C450126q) r6).A00;
        ImageView imageView = this.A01;
        C004601z.A0n(imageView, C16030sJ.A03(r4.A0E));
        C34331k5.A04(imageView, this, r4, 16);
        this.A04.A06(imageView, r4);
        C30521cU r3 = this.A03;
        r3.A0A(r4);
        String A0H = this.A05.A0H(C24561Gk.A01(r4));
        if (C13690nt.A0b(r3.A02).equals(A0H) || C40561uK.A01(this.A06, r4.A0E)) {
            TextEmojiLabel textEmojiLabel = this.A02;
            textEmojiLabel.setVisibility(8);
            C13700nu.A0T(textEmojiLabel);
            return;
        }
        TextEmojiLabel textEmojiLabel2 = this.A02;
        textEmojiLabel2.setVisibility(0);
        textEmojiLabel2.setText(A0H);
    }
}
