package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.obwhatsapp.R;
import java.util.HashSet;

/* renamed from: X.329  reason: invalid class name */
public class AnonymousClass329 extends AnonymousClass32B {
    public int A00;
    public int A01;
    public ValueAnimator A02;
    public Drawable A03;
    public Drawable A04;
    public AnonymousClass20I A05;
    public AnonymousClass2S8 A06;
    public C64623Ra A07;
    public HashSet A08;
    public boolean A09;
    public final Matrix A0A = AnonymousClass000.A0H();
    public final Paint A0B;

    public AnonymousClass329(Context context, AnonymousClass2S8 r5, HashSet hashSet, int i2, boolean z2) {
        super(context);
        A00();
        Paint A052 = C13700nu.A05();
        this.A0B = A052;
        this.A06 = r5;
        this.A08 = hashSet;
        this.A01 = i2;
        C13690nt.A0r(context, A052, z2 ? R.color.color08a4 : R.color.color077f);
        A052.setStrokeWidth((float) context.getResources().getDimensionPixelSize(R.dimen.dimen03fa));
        C13690nt.A0y(A052);
        A052.setAntiAlias(true);
        setId(R.id.thumb);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.A00 = getResources().getColor(R.color.color04d0);
    }

    public void A00() {
        if (!this.A09) {
            this.A09 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A04 = C16150sX.A0Z(A002);
            this.A08 = (AnonymousClass10B) A002.AD5.get();
        }
    }

    public Uri getUri() {
        return this.A05.A0G;
    }

    public C64623Ra getViewHolder() {
        return this.A07;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r12) {
        /*
            r11 = this;
            X.2S8 r0 = r11.A06
            android.view.View r0 = r0.A06
            if (r0 == r11) goto L_0x00b9
            java.util.HashSet r1 = r11.A08
            X.20I r0 = r11.A05
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x00b9
            r5 = r12
            r12.save()
            X.20I r0 = r11.A05
            int r0 = r0.A01()
            if (r0 == 0) goto L_0x0039
            X.20I r0 = r11.A05
            int r0 = r0.A01()
            android.graphics.Matrix r3 = r11.A0A
            float r2 = (float) r0
            int r0 = r11.getWidth()
            int r0 = r0 >> 1
            float r1 = (float) r0
            int r0 = r11.getHeight()
            int r0 = r0 >> 1
            float r0 = (float) r0
            r3.setRotate(r2, r1, r0)
            r12.concat(r3)
        L_0x0039:
            super.onDraw(r12)
            r12.restore()
            android.graphics.drawable.Drawable r0 = r11.A04
            if (r0 == 0) goto L_0x00ba
            android.animation.ValueAnimator r0 = r11.A02
            if (r0 != 0) goto L_0x0063
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {0, 255} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r0)
            r11.A02 = r2
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            android.animation.ValueAnimator r1 = r11.A02
            r0 = 6
            X.C13690nt.A0p(r1, r11, r0)
            android.animation.ValueAnimator r0 = r11.A02
            r0.start()
        L_0x0063:
            android.graphics.drawable.Drawable r0 = r11.A04
            if (r0 == 0) goto L_0x009c
            int r1 = r11.getHeight()
            android.graphics.drawable.Drawable r0 = r11.A04
            int r0 = r0.getIntrinsicHeight()
            int r1 = r1 - r0
            int r4 = r1 >> 1
            int r1 = r11.getWidth()
            android.graphics.drawable.Drawable r0 = r11.A04
            int r0 = r0.getIntrinsicWidth()
            int r1 = r1 - r0
            int r3 = r1 >> 1
            int r0 = r11.A00
            r12.drawColor(r0)
            android.graphics.drawable.Drawable r2 = r11.A04
            int r1 = r2.getIntrinsicWidth()
            int r1 = r1 + r3
            android.graphics.drawable.Drawable r0 = r11.A04
            int r0 = r0.getIntrinsicHeight()
            int r0 = r0 + r4
            r2.setBounds(r3, r4, r1, r0)
            android.graphics.drawable.Drawable r0 = r11.A04
        L_0x0099:
            r0.draw(r12)
        L_0x009c:
            boolean r0 = r11.isPressed()
            if (r0 != 0) goto L_0x00a8
            boolean r0 = r11.isSelected()
            if (r0 == 0) goto L_0x00b9
        L_0x00a8:
            r6 = 0
            int r0 = r11.getWidth()
            float r8 = (float) r0
            int r0 = r11.getHeight()
            float r9 = (float) r0
            android.graphics.Paint r10 = r11.A0B
            r7 = 0
            r5.drawRect(r6, r7, r8, r9, r10)
        L_0x00b9:
            return
        L_0x00ba:
            android.graphics.drawable.Drawable r0 = r11.A03
            if (r0 == 0) goto L_0x009c
            int r0 = r0.getIntrinsicHeight()
            int r4 = r0 >> 2
            android.graphics.drawable.Drawable r3 = r11.A03
            int r2 = r11.getHeight()
            android.graphics.drawable.Drawable r0 = r11.A03
            int r0 = r0.getIntrinsicHeight()
            int r2 = r2 - r0
            int r2 = r2 - r4
            android.graphics.drawable.Drawable r0 = r11.A03
            int r1 = r0.getIntrinsicWidth()
            int r1 = r1 + r4
            int r0 = r11.getHeight()
            int r0 = r0 - r4
            r3.setBounds(r4, r2, r1, r0)
            int r0 = r11.A00
            r12.drawColor(r0)
            android.graphics.drawable.Drawable r0 = r11.A03
            goto L_0x0099
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass329.onDraw(android.graphics.Canvas):void");
    }

    public void onMeasure(int i2, int i3) {
        int i4 = this.A01;
        setMeasuredDimension(i4, i4);
    }

    public void setCustomId(Integer num) {
        setId(num != null ? num.intValue() : R.id.thumb);
    }

    public void setIcon(Drawable drawable) {
        this.A03 = drawable;
    }

    public void setItem(AnonymousClass20I r1) {
        this.A05 = r1;
    }

    public void setOverlayIcon(Drawable drawable) {
        ValueAnimator valueAnimator = this.A02;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.A02 = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        this.A04 = drawable;
    }

    public void setViewHolder(C64623Ra r1) {
        this.A07 = r1;
    }
}
