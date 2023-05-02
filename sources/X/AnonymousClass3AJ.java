package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.facebook.redex.IDxCListenerShape244S0100000_2_I1;
import com.obwhatsapp.R;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3AJ  reason: invalid class name */
public class AnonymousClass3AJ {
    public static final long A06 = TimeUnit.DAYS.toMillis(1);
    public static final long A07 = TimeUnit.SECONDS.toMillis(2);
    public final AnimatorSet A00;
    public final Paint A01 = C13700nu.A06(1);
    public final BitmapDrawable A02;
    public final ImageView A03;
    public final C17010u2 A04;
    public final C15860rz A05;

    public AnonymousClass3AJ(ImageView imageView, C17010u2 r15, C15860rz r16) {
        this.A03 = imageView;
        this.A04 = r15;
        this.A05 = r16;
        Context context = imageView.getContext();
        BitmapDrawable bitmapDrawable = (BitmapDrawable) C13690nt.A0C(context, R.drawable.ic_text_status_compose);
        this.A02 = bitmapDrawable;
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) C13690nt.A0C(context, R.drawable.input_mic_white);
        Interpolator A002 = C04240Lt.A00(0.3f, 0.0f, 0.25f, 2.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat.setStartDelay(800);
        ofFloat.setDuration(500);
        ofFloat.setInterpolator(A002);
        ofFloat.addUpdateListener(new AnonymousClass3C3(bitmapDrawable, bitmapDrawable2, this));
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        long j2 = A07;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        if (j2 > 0) {
            ofFloat2.setStartDelay(j2);
        }
        ofFloat2.setDuration(350);
        ofFloat2.setInterpolator(accelerateDecelerateInterpolator);
        ofFloat2.addUpdateListener(new AnonymousClass3C3(bitmapDrawable2, bitmapDrawable, this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.A00 = animatorSet;
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
    }

    public void A00() {
        this.A00.cancel();
        ImageView imageView = this.A03;
        imageView.setImageDrawable(this.A02);
        long currentTimeMillis = System.currentTimeMillis();
        C15860rz r4 = this.A05;
        AnonymousClass01D r6 = r4.A01;
        if (currentTimeMillis - C13680ns.A08(C13680ns.A0C(r6), "text_to_voice_animation_timestamp") >= A06 && C13690nt.A01(C13680ns.A0C(r6), "text_to_voice_animation_play_times_key") < 10) {
            r4.A14("text_to_voice_animation_timestamp", System.currentTimeMillis());
            r4.A0K().putInt("text_to_voice_animation_play_times_key", C13690nt.A01(C13680ns.A0C(r6), "text_to_voice_animation_play_times_key") + 1);
            imageView.addOnLayoutChangeListener(new IDxCListenerShape244S0100000_2_I1(this, 2));
        }
    }
}
