package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.obwhatsapp.mediacomposer.ImageComposerFragment;
import com.obwhatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.filter.FilterUtils;
import org.json.JSONObject;

/* renamed from: X.333  reason: invalid class name */
public class AnonymousClass333 extends C61773Ag {
    public C88254aC A00;
    public final float A01;
    public final Rect A02 = AnonymousClass000.A0J();
    public final RectF A03 = AnonymousClass000.A0K();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass333(android.graphics.Bitmap r14, android.graphics.Paint r15, android.graphics.PointF r16, android.graphics.PointF r17, X.C88254aC r18, float r19, int r20) {
        /*
            r13 = this;
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r17
            r6 = r19
            r7 = r20
            r2.<init>(r3, r4, r5, r6, r7)
            android.graphics.Rect r0 = X.AnonymousClass000.A0J()
            r13.A02 = r0
            android.graphics.RectF r0 = X.AnonymousClass000.A0K()
            r13.A03 = r0
            r0 = r18
            r13.A00 = r0
            java.util.List r0 = r13.A03
            r1 = r16
            r0.add(r1)
            android.graphics.Canvas r8 = r13.A00
            if (r8 == 0) goto L_0x0034
            float r10 = r1.x
            float r11 = r1.y
            android.graphics.Paint r9 = r13.A02
            float r0 = r13.A01
            int r12 = (int) r0
            r7 = r13
            r7.A06(r8, r9, r10, r11, r12)
        L_0x0034:
            r13.A01 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass333.<init>(android.graphics.Bitmap, android.graphics.Paint, android.graphics.PointF, android.graphics.PointF, X.4aC, float, int):void");
    }

    public void A05(JSONObject jSONObject) {
        super.A05(jSONObject);
        jSONObject.put("brush_blur", true);
    }

    public void A06(Canvas canvas, Paint paint, float f2, float f3, int i2) {
        Bitmap bitmap;
        C88254aC r5 = this.A00;
        Bitmap bitmap2 = r5.A02;
        if (bitmap2 == null) {
            Bitmap bitmap3 = r5.A03;
            if (bitmap3 == null) {
                AnonymousClass4EV r0 = r5.A04;
                if (r0 != null) {
                    MediaComposerFragment mediaComposerFragment = r0.A00.A0D;
                    if (mediaComposerFragment instanceof ImageComposerFragment) {
                        ImageComposerFragment imageComposerFragment = (ImageComposerFragment) mediaComposerFragment;
                        int i3 = imageComposerFragment.A07.A01;
                        bitmap = i3 != 0 ? FilterUtils.A00(imageComposerFragment.A00, imageComposerFragment.A03, i3, true) : imageComposerFragment.A00;
                    } else {
                        bitmap = null;
                    }
                    r5.A01 = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    r5.A00 = height;
                    bitmap3 = Bitmap.createScaledBitmap(bitmap, (int) (((float) r5.A01) * 0.05f), (int) (((float) height) * 0.05f), false);
                    r5.A03 = bitmap3;
                } else {
                    throw AnonymousClass000.A0V("Origin bitmap loader is required to get origin bitmap");
                }
            }
            bitmap2 = Bitmap.createScaledBitmap(bitmap3, Math.round(((float) r5.A01) / 3.0f), Math.round(((float) r5.A00) / 3.0f), false);
            r5.A02 = bitmap2;
        }
        float f4 = (float) (i2 >> 1);
        int i4 = (int) (f2 - f4);
        int i5 = (int) (f3 - f4);
        int i6 = i4 + i2;
        int i7 = i2 + i5;
        Rect rect = this.A02;
        float f5 = (float) i4;
        rect.left = Math.round(f5 / 3.0f);
        float f6 = (float) i5;
        rect.top = Math.round(f6 / 3.0f);
        float f7 = (float) i6;
        rect.right = Math.round(f7 / 3.0f);
        float f8 = (float) i7;
        rect.bottom = Math.round(f8 / 3.0f);
        RectF rectF = this.A03;
        rectF.left = f5;
        rectF.top = f6;
        rectF.right = f7;
        rectF.bottom = f8;
        canvas.drawBitmap(bitmap2, rect, rectF, paint);
    }
}
