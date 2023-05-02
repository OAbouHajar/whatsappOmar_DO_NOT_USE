package X;

import android.content.Context;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.text.ReadMoreTextView;
import java.util.List;

/* renamed from: X.5mR  reason: invalid class name and case insensitive filesystem */
public class C113675mR extends C111045fF {
    public final C14870pt A00;
    public final C17090uW A01;
    public final C613738q A02;
    public final AnonymousClass01V A03;
    public final C19990zK A04;
    public final ReadMoreTextView A05;

    public C113675mR(View view, C14870pt r3, C17090uW r4, C613738q r5, AnonymousClass01V r6, C19990zK r7) {
        super(view);
        this.A00 = r3;
        this.A04 = r7;
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A05 = (ReadMoreTextView) C004601z.A0E(view, R.id.payment_note_text);
    }

    public final void A07(Spannable spannable, TextEmojiLabel textEmojiLabel, boolean z2) {
        Context context = textEmojiLabel.getContext();
        List<URLSpan> A052 = C45922Bq.A05(spannable);
        if (A052 != null && !A052.isEmpty()) {
            int i2 = 0;
            for (URLSpan uRLSpan : A052) {
                String url = uRLSpan.getURL();
                spannable.setSpan(new C59142uk(context, this.A01, this.A00, this.A03, url), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), spannable.getSpanFlags(uRLSpan));
                i2++;
            }
            for (Object removeSpan : A052) {
                spannable.removeSpan(removeSpan);
            }
            if (i2 > 0) {
                if (textEmojiLabel.A06 == null) {
                    C30531cW.A03(textEmojiLabel, this.A03);
                }
                textEmojiLabel.A0G(spannable);
            }
        }
        if (textEmojiLabel.A06 != null) {
            textEmojiLabel.setFocusable(false);
            C004601z.A0d(textEmojiLabel, 0);
        }
        textEmojiLabel.setAccessibilityHelper((AnonymousClass0EL) null);
        if (!z2) {
            return;
        }
        textEmojiLabel.A0G(spannable);
    }
}
