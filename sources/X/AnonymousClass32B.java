package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.obwhatsapp.R;
import java.io.File;

/* renamed from: X.32B  reason: invalid class name */
public class AnonymousClass32B extends C76043tB {
    public int A00 = 1;
    public Drawable A01;
    public Drawable A02;
    public Drawable A03;
    public Drawable A04;
    public Drawable A05;
    public Drawable A06;
    public TextPaint A07;
    public AnonymousClass10B A08;
    public boolean A09;

    public AnonymousClass32B(Context context) {
        super(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r1 == 3) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r4 == false) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r3 != false) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r4 != false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r5 == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r1 == 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r12.A07 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r12.A07 = A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r13.drawText(X.C28961Zl.A04(r12.A04, r1), ((float) r0) + (r12.A07.getTextSize() / 3.0f), ((float) getHeight()) - (r12.A07.getTextSize() / 3.0f), r12.A07);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c9, code lost:
        r6 = r12.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01cb, code lost:
        if (r6 != null) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01cd, code lost:
        r6 = X.AnonymousClass00T.A04(getContext(), com.obwhatsapp.R.drawable.mark_gif);
        r12.A01 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01db, code lost:
        r6 = r12.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01dd, code lost:
        if (r6 != null) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01df, code lost:
        r6 = X.AnonymousClass00T.A04(getContext(), com.obwhatsapp.R.drawable.mark_video);
        r12.A06 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ec, code lost:
        if (r6 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ee, code lost:
        r9 = r12.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f0, code lost:
        if (r9 != null) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f2, code lost:
        r9 = X.AnonymousClass00T.A04(getContext(), com.obwhatsapp.R.drawable.gallery_album_overlay);
        r12.A05 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ff, code lost:
        r9.setBounds(0, getHeight() - (r6.getIntrinsicHeight() << 1), getWidth(), getHeight());
        r12.A05.draw(r13);
        r5 = r6.getIntrinsicHeight() >> 2;
        r6.setBounds(r5, (getHeight() - r6.getIntrinsicHeight()) - r5, r6.getIntrinsicWidth() + r5, getHeight() - r5);
        r6.draw(r13);
        r0 = r6.getIntrinsicWidth() + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0241, code lost:
        r1 = r2.ABq();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0247, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r1 != 1) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.graphics.Canvas r13) {
        /*
            r12 = this;
            X.2BF r0 = r12.A05
            if (r0 == 0) goto L_0x01bb
            android.graphics.drawable.Drawable r0 = r12.getDrawable()
            if (r0 == 0) goto L_0x01bb
            int r0 = r12.A00
            r8 = 2
            r7 = 3
            if (r0 == r7) goto L_0x005f
            X.2BF r2 = r12.A05
            int r1 = r2.getType()
            r5 = 1
            r0 = 0
            r4 = 1
            if (r1 == r8) goto L_0x001f
            r4 = 0
            r3 = 1
            if (r1 == r5) goto L_0x0247
        L_0x001f:
            r3 = 0
            if (r1 != r7) goto L_0x0247
        L_0x0022:
            r10 = 0
            if (r4 == 0) goto L_0x0241
            r1 = 0
        L_0x0028:
            if (r3 != 0) goto L_0x01db
            if (r4 != 0) goto L_0x01c9
            if (r5 == 0) goto L_0x005f
        L_0x002e:
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x005f
            android.text.TextPaint r3 = r12.A07
            if (r3 != 0) goto L_0x003c
            android.text.TextPaint r3 = r12.A02()
            r12.A07 = r3
        L_0x003c:
            X.013 r3 = r12.A04
            java.lang.String r4 = X.C28961Zl.A04(r3, r1)
            float r3 = (float) r0
            android.text.TextPaint r0 = r12.A07
            float r0 = r0.getTextSize()
            r2 = 1077936128(0x40400000, float:3.0)
            float r0 = r0 / r2
            float r3 = r3 + r0
            int r0 = r12.getHeight()
            float r1 = (float) r0
            android.text.TextPaint r0 = r12.A07
            float r0 = r0.getTextSize()
            float r0 = r0 / r2
            float r1 = r1 - r0
            android.text.TextPaint r0 = r12.A07
            r13.drawText(r4, r3, r1, r0)
        L_0x005f:
            X.2BF r4 = r12.A05
            boolean r0 = r4 instanceof X.AnonymousClass2BE
            if (r0 == 0) goto L_0x01bb
            X.2BE r4 = (X.AnonymousClass2BE) r4
            int r0 = r12.A00
            if (r0 == r8) goto L_0x00f5
            X.0tY r0 = r4.A03
            if (r0 == 0) goto L_0x00f5
            X.013 r0 = r12.A04
            if (r0 == 0) goto L_0x00f5
            android.text.TextPaint r0 = r12.A07
            if (r0 != 0) goto L_0x007d
            android.text.TextPaint r0 = r12.A02()
            r12.A07 = r0
        L_0x007d:
            int r0 = r4.getType()
            r9 = 1073741824(0x40000000, float:2.0)
            if (r0 == r7) goto L_0x00ab
            android.graphics.drawable.Drawable r3 = r12.A04
            if (r3 != 0) goto L_0x0096
            android.content.Context r1 = r12.getContext()
            r0 = 2131231345(0x7f080271, float:1.8078768E38)
            android.graphics.drawable.Drawable r3 = X.AnonymousClass00T.A04(r1, r0)
            r12.A04 = r3
        L_0x0096:
            int r2 = r12.getWidth()
            android.text.TextPaint r0 = r12.A07
            float r0 = r0.getTextSize()
            float r0 = r0 * r9
            int r1 = (int) r0
            r0 = 0
            r3.setBounds(r0, r0, r2, r1)
            android.graphics.drawable.Drawable r0 = r12.A04
            r0.draw(r13)
        L_0x00ab:
            X.013 r3 = r12.A04
            X.0tY r2 = r4.A03
            long r0 = r2.A01
            java.lang.String r8 = X.AnonymousClass2GQ.A03(r3, r0)
            android.text.TextPaint r0 = r12.A07
            float r3 = r0.getTextSize()
            r6 = 1077936128(0x40400000, float:3.0)
            float r3 = r3 / r6
            android.text.TextPaint r0 = r12.A07
            float r0 = r0.getTextSize()
            r5 = 1068149419(0x3faaaaab, float:1.3333334)
            float r0 = r0 * r5
            int r0 = (int) r0
            float r1 = (float) r0
            android.text.TextPaint r0 = r12.A07
            r13.drawText(r8, r3, r1, r0)
            boolean r0 = r12.A09
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "fw score: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            int r0 = r2.A05
            java.lang.String r3 = X.AnonymousClass000.A0l(r1, r0)
            android.text.TextPaint r0 = r12.A07
            float r2 = r0.getTextSize()
            float r2 = r2 / r6
            android.text.TextPaint r0 = r12.A07
            float r0 = r0.getTextSize()
            float r0 = r0 * r5
            float r0 = r0 * r9
            int r0 = (int) r0
            float r1 = (float) r0
            android.text.TextPaint r0 = r12.A07
            r13.drawText(r3, r2, r1, r0)
        L_0x00f5:
            int r0 = r12.A00
            if (r0 == r7) goto L_0x01bb
            X.0tY r5 = r4.A03
            if (r5 == 0) goto L_0x01c0
            X.10B r0 = r12.A08
            X.0pd r0 = r0.A09
            boolean r0 = X.C34321k4.A05(r0, r5)
            if (r0 == 0) goto L_0x01bc
            int r1 = r5.A06()
            r0 = 1
            if (r0 != r1) goto L_0x01bc
            android.graphics.drawable.Drawable r0 = r12.A02
            if (r0 != 0) goto L_0x011f
            android.content.Context r1 = r12.getContext()
            r0 = 2131232155(0x7f08059b, float:1.8080411E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r1, r0)
            r12.A02 = r0
        L_0x011f:
            int r6 = r12.getWidth()
            android.graphics.drawable.Drawable r0 = r12.A02
            int r0 = r0.getIntrinsicWidth()
            int r6 = r6 - r0
            int r3 = r12.getHeight()
            android.graphics.drawable.Drawable r0 = r12.A02
            int r0 = r0.getIntrinsicHeight()
            int r3 = r3 - r0
            int r1 = r12.getWidth()
            int r0 = r12.getHeight()
            android.graphics.drawable.Drawable r2 = r12.A02
            r2.setBounds(r6, r3, r1, r0)
            int r1 = r12.getWidth()
            int r0 = r2.getIntrinsicWidth()
            int r1 = r1 - r0
            float r0 = (float) r1
            r12.A03(r13, r4, r0)
            r2.draw(r13)
            r2 = 1
        L_0x0153:
            boolean r0 = r5.A0x
            if (r0 == 0) goto L_0x01be
            android.graphics.drawable.Drawable r0 = r12.A03
            if (r0 != 0) goto L_0x0168
            android.content.Context r1 = r12.getContext()
            r0 = 2131232161(0x7f0805a1, float:1.8080423E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r1, r0)
            r12.A03 = r0
        L_0x0168:
            int r6 = r12.getWidth()
            android.graphics.drawable.Drawable r0 = r12.A03
            int r0 = r0.getIntrinsicWidth()
            int r6 = r6 - r0
            int r5 = r12.getHeight()
            android.graphics.drawable.Drawable r0 = r12.A03
            int r0 = r0.getIntrinsicHeight()
            int r5 = r5 - r0
            int r3 = r12.getWidth()
            int r1 = r12.getHeight()
            if (r2 == 0) goto L_0x01a6
            android.graphics.drawable.Drawable r0 = r12.A02
            if (r0 == 0) goto L_0x01a6
            android.graphics.Rect r1 = r0.getBounds()
            int r6 = r1.left
            android.graphics.drawable.Drawable r0 = r12.A03
            int r0 = r0.getIntrinsicWidth()
            int r6 = r6 - r0
            int r5 = r1.bottom
            android.graphics.drawable.Drawable r0 = r12.A03
            int r0 = r0.getIntrinsicHeight()
            int r5 = r5 - r0
            int r3 = r1.left
            int r1 = r1.bottom
        L_0x01a6:
            android.graphics.drawable.Drawable r2 = r12.A03
            r2.setBounds(r6, r5, r3, r1)
            int r1 = r12.getWidth()
            int r0 = r2.getIntrinsicWidth()
            int r1 = r1 - r0
            float r0 = (float) r1
            r12.A03(r13, r4, r0)
            r2.draw(r13)
        L_0x01bb:
            return
        L_0x01bc:
            r2 = 0
            goto L_0x0153
        L_0x01be:
            if (r2 != 0) goto L_0x01bb
        L_0x01c0:
            int r0 = r12.getWidth()
            float r0 = (float) r0
            r12.A03(r13, r4, r0)
            return
        L_0x01c9:
            android.graphics.drawable.Drawable r6 = r12.A01
            if (r6 != 0) goto L_0x01ee
            android.content.Context r4 = r12.getContext()
            r3 = 2131232132(0x7f080584, float:1.8080365E38)
            android.graphics.drawable.Drawable r6 = X.AnonymousClass00T.A04(r4, r3)
            r12.A01 = r6
            goto L_0x01ec
        L_0x01db:
            android.graphics.drawable.Drawable r6 = r12.A06
            if (r6 != 0) goto L_0x01ee
            android.content.Context r4 = r12.getContext()
            r3 = 2131232133(0x7f080585, float:1.8080367E38)
            android.graphics.drawable.Drawable r6 = X.AnonymousClass00T.A04(r4, r3)
            r12.A06 = r6
        L_0x01ec:
            if (r6 == 0) goto L_0x002e
        L_0x01ee:
            android.graphics.drawable.Drawable r9 = r12.A05
            if (r9 != 0) goto L_0x01ff
            android.content.Context r4 = r12.getContext()
            r3 = 2131231344(0x7f080270, float:1.8078766E38)
            android.graphics.drawable.Drawable r9 = X.AnonymousClass00T.A04(r4, r3)
            r12.A05 = r9
        L_0x01ff:
            int r5 = r12.getHeight()
            int r3 = r6.getIntrinsicHeight()
            int r3 = r3 << 1
            int r5 = r5 - r3
            int r4 = r12.getWidth()
            int r3 = r12.getHeight()
            r9.setBounds(r0, r5, r4, r3)
            android.graphics.drawable.Drawable r0 = r12.A05
            r0.draw(r13)
            int r0 = r6.getIntrinsicHeight()
            int r5 = r0 >> 2
            int r4 = r12.getHeight()
            int r0 = r6.getIntrinsicHeight()
            int r4 = r4 - r0
            int r4 = r4 - r5
            int r3 = r6.getIntrinsicWidth()
            int r3 = r3 + r5
            int r0 = r12.getHeight()
            int r0 = r0 - r5
            r6.setBounds(r5, r4, r3, r0)
            r6.draw(r13)
            int r0 = r6.getIntrinsicWidth()
            int r0 = r0 + r5
            goto L_0x002e
        L_0x0241:
            long r1 = r2.ABq()
            goto L_0x0028
        L_0x0247:
            r5 = 0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass32B.A01(android.graphics.Canvas):void");
    }

    public final TextPaint A02() {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(-1);
        textPaint.setTextSize((float) C13680ns.A0D(this).getDimensionPixelSize(R.dimen.dimen0518));
        return textPaint;
    }

    public final void A03(Canvas canvas, AnonymousClass2BE r9, float f2) {
        File file = r9.A04;
        String name = file != null ? file.getName() : null;
        if (r9.getType() == 4 && !TextUtils.isEmpty(name)) {
            if (this.A07 == null) {
                this.A07 = A02();
            }
            Drawable drawable = this.A05;
            if (drawable == null) {
                drawable = C13690nt.A0C(getContext(), R.drawable.gallery_album_overlay);
                this.A05 = drawable;
            }
            drawable.setBounds(0, getHeight() - ((int) (this.A07.getTextSize() * 2.0f)), getWidth(), getHeight());
            this.A05.draw(canvas);
            TextPaint textPaint = this.A07;
            canvas.drawText(TextUtils.ellipsize(name, textPaint, f2 - ((textPaint.getTextSize() / 3.0f) * 2.0f), TextUtils.TruncateAt.END).toString(), this.A07.getTextSize() / 3.0f, ((float) getHeight()) - (this.A07.getTextSize() / 3.0f), this.A07);
        }
    }

    public void setDetailsLevel(int i2) {
        this.A00 = i2;
    }

    public void setMediaItem(AnonymousClass2BF r3) {
        super.setMediaItem(r3);
        AnonymousClass2BF r1 = this.A05;
        if (r1 instanceof AnonymousClass2BE) {
            C004601z.A0n(this, C47612Jr.A04(((AnonymousClass2BE) r1).A03.A11.toString()));
        }
    }

    public void setShowForwardScore(boolean z2) {
        this.A09 = z2;
    }
}
