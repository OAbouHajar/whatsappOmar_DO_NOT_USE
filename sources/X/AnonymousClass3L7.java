package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity;

/* renamed from: X.3L7  reason: invalid class name */
public class AnonymousClass3L7 extends Drawable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ MessageDetailsActivity A02;

    public AnonymousClass3L7(Drawable drawable, ViewGroup viewGroup, MessageDetailsActivity messageDetailsActivity) {
        this.A02 = messageDetailsActivity;
        this.A00 = drawable;
        this.A01 = viewGroup;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.A00;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        ViewGroup viewGroup = this.A01;
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        int i2 = width * intrinsicHeight;
        int i3 = height * intrinsicWidth;
        if (i2 > i3) {
            height = i2 / intrinsicWidth;
        } else {
            width = i3 / intrinsicHeight;
        }
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
    }

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
