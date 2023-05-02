package X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.4PV  reason: invalid class name */
public abstract class AnonymousClass4PV {
    public void A00(FrameLayout frameLayout, C30011bb r5, C16740tZ r6, C16880tn r7) {
        TextEmojiLabel textEmojiLabel;
        int i2;
        frameLayout.removeAllViews();
        C70573hI r1 = new C70573hI(frameLayout.getContext());
        frameLayout.addView(r1);
        C35201lX r0 = r7.A02;
        if (r0 != null) {
            String str = r0.A01;
            if (!TextUtils.isEmpty(str)) {
                AnonymousClass00B.A06(str);
                textEmojiLabel = r1.A00;
                r5.setMessageText(str, textEmojiLabel, r6);
                i2 = 0;
                textEmojiLabel.setVisibility(i2);
            }
        }
        textEmojiLabel = r1.A00;
        i2 = 8;
        textEmojiLabel.setVisibility(i2);
    }
}
