package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.obwhatsapp.emoji.EmojiPopupFooter;

/* renamed from: X.3NN  reason: invalid class name */
public final class AnonymousClass3NN extends Animation {
    public final int A00;
    public final int A01;
    public final /* synthetic */ AnonymousClass2JH A02;

    public AnonymousClass3NN(AnonymousClass2JH r4, int i2) {
        this.A02 = r4;
        this.A00 = i2;
        EmojiPopupFooter emojiPopupFooter = r4.A08;
        int i3 = emojiPopupFooter.A00;
        this.A01 = i3;
        setDuration((long) ((AnonymousClass000.A09(i3, i2) * 300) / emojiPopupFooter.getHeight()));
    }

    public void applyTransformation(float f2, Transformation transformation) {
        EmojiPopupFooter emojiPopupFooter = this.A02.A08;
        int i2 = this.A01;
        emojiPopupFooter.setTopOffset((int) (((float) i2) + (((float) (this.A00 - i2)) * f2)));
    }
}
