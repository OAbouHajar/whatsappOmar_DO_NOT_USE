package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import com.obwhatsapp.crop.CropImage;

/* renamed from: X.3Mj  reason: invalid class name and case insensitive filesystem */
public class C64003Mj extends TouchDelegate {
    public final /* synthetic */ CropImage A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64003Mj(Rect rect, View view, CropImage cropImage) {
        super(rect, view);
        this.A00 = cropImage;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        CropImage cropImage = this.A00;
        float f2 = 0.0f;
        if (x2 < ((float) cropImage.A0L.getLeft())) {
            x2 = 0.0f;
        } else if (x2 > ((float) cropImage.A0L.getRight())) {
            x2 = (float) cropImage.A0L.getWidth();
        }
        float y2 = motionEvent.getY();
        if (y2 >= ((float) cropImage.A0L.getTop())) {
            f2 = y2 > ((float) cropImage.A0L.getBottom()) ? (float) cropImage.A0L.getHeight() : y2;
        }
        motionEvent.setLocation(x2, f2);
        cropImage.A0L.dispatchTouchEvent(motionEvent);
        return true;
    }
}
