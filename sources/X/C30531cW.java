package X;

import android.content.Context;
import android.util.AttributeSet;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;

/* renamed from: X.1cW  reason: invalid class name and case insensitive filesystem */
public abstract class C30531cW extends WaTextView {
    public boolean A00;

    public C30531cW(Context context) {
        super(context);
        A00();
    }

    public C30531cW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public C30531cW(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public static void A02(TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.A07 = new AnonymousClass3MF();
    }

    public static void A03(TextEmojiLabel textEmojiLabel, AnonymousClass01V r2) {
        textEmojiLabel.setAccessibilityHelper(new C57102q8(textEmojiLabel, r2));
    }

    public static void A04(TextEmojiLabel textEmojiLabel, AnonymousClass01V r2, CharSequence charSequence) {
        textEmojiLabel.setAccessibilityHelper(new C57102q8(textEmojiLabel, r2));
        textEmojiLabel.A07 = new AnonymousClass3MF();
        textEmojiLabel.setText(charSequence);
    }

    public static boolean A05(TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.A07 = new AnonymousClass3MF();
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setFocusable(false);
        textEmojiLabel.setClickable(false);
        return false;
    }
}
