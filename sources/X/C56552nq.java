package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.2nq  reason: invalid class name and case insensitive filesystem */
public class C56552nq extends View {
    public final Rect A00 = AnonymousClass000.A0J();
    public final /* synthetic */ AnonymousClass39Z A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56552nq(Context context, AnonymousClass39Z r3) {
        super(context);
        this.A01 = r3;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            AnonymousClass39Z r2 = this.A01;
            StickerView stickerView = r2.A0B;
            Rect rect = this.A00;
            stickerView.getDrawingRect(rect);
            C616339r r0 = r2.A0C.A0c;
            if (r0 != null) {
                canvas.drawRect(rect, r0.A00);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        StickerView stickerView = this.A01.A0B;
        int measuredHeight = stickerView.getMeasuredHeight();
        int measuredWidth = stickerView.getMeasuredWidth();
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(measuredWidth, size) : measuredWidth;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(size2, measuredHeight) : measuredHeight;
        }
        setMeasuredDimension(size, size2);
    }
}
