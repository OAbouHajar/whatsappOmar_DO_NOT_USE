package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.3KF  reason: invalid class name */
public class AnonymousClass3KF extends AnimatorListenerAdapter {
    public final /* synthetic */ TextEmojiLabel A00;
    public final /* synthetic */ C56942pD A01;
    public final /* synthetic */ String A02;

    public AnonymousClass3KF(TextEmojiLabel textEmojiLabel, C56942pD r2, String str) {
        this.A01 = r2;
        this.A00 = textEmojiLabel;
        this.A02 = str;
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.A0D = false;
    }

    public void onAnimationStart(Animator animator) {
        TextEmojiLabel textEmojiLabel = this.A00;
        textEmojiLabel.A0G(this.A02);
        textEmojiLabel.setVisibility(0);
        textEmojiLabel.setScaleX(0.0f);
        textEmojiLabel.setScaleY(0.0f);
    }
}
