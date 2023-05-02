package X;

import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity;

/* renamed from: X.4lG  reason: invalid class name and case insensitive filesystem */
public class C94654lG implements AbsListView.OnScrollListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Drawable A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ MessageDetailsActivity A03;
    public final /* synthetic */ boolean A04;

    public C94654lG(Drawable drawable, ViewGroup viewGroup, MessageDetailsActivity messageDetailsActivity, int i2, boolean z2) {
        this.A03 = messageDetailsActivity;
        this.A01 = drawable;
        this.A04 = z2;
        this.A02 = viewGroup;
        this.A00 = i2;
    }

    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        ViewGroup viewGroup;
        MessageDetailsActivity messageDetailsActivity = this.A03;
        float f2 = 0.0f;
        if (messageDetailsActivity.A02.getFirstVisiblePosition() > 0) {
            this.A01.setAlpha(MotionEventCompat.ACTION_MASK);
        } else {
            View childAt = messageDetailsActivity.A02.getChildAt(0);
            if (childAt == null) {
                this.A01.setAlpha(0);
            } else {
                int i5 = -childAt.getTop();
                this.A01.setAlpha(Math.min(MotionEventCompat.ACTION_MASK, (i5 * MotionEventCompat.ACTION_MASK) / Math.min(this.A00, childAt.getHeight())));
                if (!this.A04) {
                    viewGroup = this.A02;
                    f2 = (float) (i5 >> 1);
                    viewGroup.setTranslationY(f2);
                }
                return;
            }
        }
        if (!this.A04) {
            viewGroup = this.A02;
            viewGroup.setTranslationY(f2);
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i2) {
    }
}
