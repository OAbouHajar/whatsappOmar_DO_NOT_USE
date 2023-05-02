package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.search.views.MessageThumbView;
import com.obwhatsapp.search.views.itemviews.MessageGifVideoPlayer;

/* renamed from: X.34X  reason: invalid class name */
public class AnonymousClass34X extends AnonymousClass34I {
    public AnimatorSet A00;
    public AnonymousClass013 A01;
    public C108145Mv A02 = new C1034651m(this);
    public boolean A03;
    public final WaTextView A04;
    public final MessageThumbView A05;
    public final MessageGifVideoPlayer A06;

    public AnonymousClass34X(Context context) {
        super(context);
        A01();
        MessageThumbView messageThumbView = (MessageThumbView) C004601z.A0E(this, R.id.thumb_view);
        this.A05 = messageThumbView;
        MessageGifVideoPlayer messageGifVideoPlayer = (MessageGifVideoPlayer) C004601z.A0E(this, R.id.video_player);
        this.A06 = messageGifVideoPlayer;
        this.A04 = C13680ns.A0S(this, R.id.media_time);
        C13680ns.A0t(context, messageThumbView, R.string.str09b8);
        messageGifVideoPlayer.A06 = this.A02;
    }

    public static /* synthetic */ void A00(AnonymousClass34X r10, boolean z2) {
        AnimatorSet animatorSet = r10.A00;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        float f2 = 0.0f;
        if (z2) {
            f2 = 1.0f;
        }
        r10.A00 = new AnimatorSet();
        FrameLayout frameLayout = r10.A00;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, "alpha", new float[]{frameLayout.getAlpha(), f2});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r10.A01, "alpha", new float[]{frameLayout.getAlpha(), f2});
        r10.A00.playTogether(new Animator[]{ofFloat, ofFloat2});
        r10.A00.setInterpolator(new DecelerateInterpolator());
        r10.A00.setDuration(100);
        r10.A00.start();
    }

    public void A01() {
        if (!this.A03) {
            this.A03 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A01 = C16150sX.A0k(A002);
            this.A01 = C16150sX.A0Z(A002);
        }
    }

    public void A03() {
        MessageGifVideoPlayer messageGifVideoPlayer = this.A06;
        messageGifVideoPlayer.setVisibility(8);
        MediaPlayer mediaPlayer = messageGifVideoPlayer.A02;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            messageGifVideoPlayer.A02 = null;
            messageGifVideoPlayer.A0C = false;
            messageGifVideoPlayer.A0D = false;
            messageGifVideoPlayer.A0F = false;
        }
    }

    public boolean A05() {
        return true;
    }

    public int getMark() {
        return R.drawable.msg_status_gif;
    }

    public int getMarkTintColor() {
        return R.color.color090b;
    }

    public float getRatio() {
        return 1.5f;
    }

    public void setMessage(C38801rR r4) {
        super.setMessage(r4);
        this.A00 = 0;
        setId(R.id.search_message_gif_playeble_thumb_view);
        MessageThumbView messageThumbView = this.A05;
        messageThumbView.setMessage(r4);
        this.A06.setMessage(r4);
        messageThumbView.setVisibility(0);
        WaTextView waTextView = this.A04;
        C13700nu.A0T(waTextView);
        waTextView.setVisibility(8);
    }

    public void setScrolling(boolean z2) {
        this.A06.setScrolling(z2);
    }

    public void setShouldPlay(boolean z2) {
        this.A06.setShouldPlay(z2);
    }
}
