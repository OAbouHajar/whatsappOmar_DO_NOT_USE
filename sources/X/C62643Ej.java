package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LineBackgroundSpan;
import android.view.MotionEvent;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.ArrayList;

/* renamed from: X.3Ej  reason: invalid class name and case insensitive filesystem */
public class C62643Ej implements AnonymousClass5RO, LineBackgroundSpan {
    public final int A00;
    public final int A01;
    public final int A02;
    public final TextEmojiLabel A03;
    public final AnonymousClass5QO A04;
    public final String A05;
    public final ArrayList A06 = AnonymousClass000.A0u();
    public final boolean A07;

    public C62643Ej(TextEmojiLabel textEmojiLabel, AnonymousClass5QO r3, String str, int i2, int i3, int i4, boolean z2) {
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = textEmojiLabel;
        this.A05 = str;
        this.A07 = z2;
        this.A02 = i4;
        this.A04 = r3;
    }

    public void AOZ(MotionEvent motionEvent, View view) {
        AnonymousClass5QO r1 = this.A04;
        if (r1 != null) {
            r1.ASe(motionEvent, view, this.A05);
        }
    }

    public void ATD(MotionEvent motionEvent, View view) {
        AnonymousClass5QO r0 = this.A04;
        if (r0 != null) {
            String str = this.A05;
            C41811wh r02 = ((AnonymousClass3H3) r0).A00;
            AnonymousClass01V r1 = r02.A0E;
            AnonymousClass3B1.A00(r02.A0B, r1, str);
            C41631wI.A02(r1);
        }
    }

    public void drawBackground(Canvas canvas, Paint paint, int i2, int i3, int i4, int i5, int i6, CharSequence charSequence, int i7, int i8, int i9) {
        int i10;
        float f2;
        float f3;
        float f4;
        TextEmojiLabel textEmojiLabel = this.A03;
        Layout layout = textEmojiLabel.getLayout();
        int i11 = this.A01;
        int lineForOffset = layout.getLineForOffset(i11);
        int i12 = this.A00;
        int lineForOffset2 = layout.getLineForOffset(i12);
        int i13 = i9;
        if (lineForOffset <= i13 && i13 <= lineForOffset2) {
            CharSequence charSequence2 = charSequence;
            if (i13 == lineForOffset) {
                i10 = (int) layout.getPrimaryHorizontal(i11);
                if (i13 == lineForOffset2) {
                    f4 = layout.getPrimaryHorizontal(i12);
                }
                f2 = (float) i10;
                f3 = paint.measureText(charSequence2, i11, i8);
                f4 = f2 + f3;
            } else {
                i11 = i7;
                if (i13 <= lineForOffset || i13 >= lineForOffset2) {
                    i10 = (int) layout.getPrimaryHorizontal(i11);
                    f2 = (float) i10;
                    f3 = paint.measureText(charSequence2, i11, i12);
                    f4 = f2 + f3;
                } else {
                    i10 = (int) layout.getPrimaryHorizontal(i11);
                    f2 = (float) i10;
                    f3 = paint.measureText(charSequence2, i11, i8);
                    f4 = f2 + f3;
                }
            }
            int i14 = (int) f4;
            int dimension = ((int) textEmojiLabel.getResources().getDimension(R.dimen.dimen0795)) / 3;
            RectF rectF = new RectF((float) (i10 - dimension), (float) i4, (float) (i14 + dimension), (float) i6);
            Rect A0J = AnonymousClass000.A0J();
            textEmojiLabel.getGlobalVisibleRect(A0J);
            int i15 = A0J.left;
            int i16 = this.A02;
            int i17 = A0J.top;
            this.A06.add(new RectF((float) (((i10 + i15) - dimension) + i16), (float) (i4 + i17 + i16), (float) (i15 + i14 + dimension + i16), (float) (i17 + i6 + i16)));
            int color = paint.getColor();
            paint.setColor(C13680ns.A0D(textEmojiLabel).getColor(R.color.color0918));
            float f5 = (float) i16;
            canvas.drawRoundRect(rectF, f5, f5, paint);
            paint.setColor(color);
        }
    }
}
