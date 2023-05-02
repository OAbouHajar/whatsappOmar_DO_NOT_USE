package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.obwhatsapp.R;

/* renamed from: X.2nu  reason: invalid class name and case insensitive filesystem */
public class C56562nu extends View implements AnonymousClass006 {
    public int A00;
    public long A01;
    public Path A02;
    public Drawable A03;
    public C52662eE A04;
    public boolean A05;
    public boolean A06;
    public int[] A07;
    public final /* synthetic */ AnonymousClass3BH A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56562nu(Context context, AnonymousClass3BH r4) {
        super(context);
        this.A08 = r4;
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A01 = -1;
        this.A00 = AnonymousClass00T.A00(context, R.color.color01f3);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A04;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A06) {
            if (this.A02 == null) {
                this.A02 = AnonymousClass000.A0I();
            }
            Paint paint = this.A08.A0A;
            paint.setColor(this.A00);
            this.A02.reset();
            this.A02.moveTo((float) ((getWidth() * 9) / 10), (float) ((getHeight() * 9) / 10));
            this.A02.lineTo((float) ((getWidth() * 9) / 10), (float) ((getHeight() * 3) >> 2));
            C13690nt.A0z(this.A02, this, (getWidth() * 3) >> 2);
            C13690nt.A0z(this.A02, this, (getWidth() * 9) / 10);
            this.A02.setFillType(Path.FillType.WINDING);
            canvas.drawPath(this.A02, paint);
        }
        if (this.A03 != null) {
            int i2 = this.A08.A07;
            int width = (getWidth() - i2) >> 1;
            int height = (getHeight() - i2) >> 1;
            Drawable drawable = this.A03;
            if (drawable instanceof C435420l) {
                drawable.setBounds(0, 0, getWidth(), getHeight());
            } else {
                drawable.setBounds(width, height, i2 + width, i2 + height);
            }
            this.A03.draw(canvas);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (X.C62153Bw.A02(r11) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setEmoji(int[] r11) {
        /*
            r10 = this;
            r4 = 0
            r3 = 0
            r5 = r10
            if (r11 != 0) goto L_0x0013
            r10.A07 = r4
            r0 = -1
            r10.A01 = r0
            r10.A03 = r4
            r10.A06 = r3
            r10.setContentDescription(r4)
        L_0x0012:
            return
        L_0x0013:
            X.20a r0 = new X.20a
            r0.<init>(r11)
            long r8 = com.obwhatsapp.emoji.EmojiDescriptor.A00(r0, r3)
            long r1 = r10.A01
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0012
            r10.A07 = r11
            r10.A01 = r8
            boolean r0 = X.C62153Bw.A03(r11)
            if (r0 != 0) goto L_0x0033
            boolean r1 = X.C62153Bw.A02(r11)
            r0 = 0
            if (r1 == 0) goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            r10.A06 = r0
            r10.A03 = r4
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0066
            java.util.HashMap r1 = X.AnonymousClass3BH.A0Y
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            java.lang.Object r0 = r1.get(r0)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 != 0) goto L_0x0072
            r0 = 0
        L_0x004d:
            r10.A03 = r0
            if (r0 != 0) goto L_0x006e
            X.3BH r6 = r10.A08
            X.20a r7 = new X.20a
            r7.<init>(r11)
            X.4Lk r4 = new X.4Lk
            r4.<init>(r5, r6, r7, r8)
            X.2nf r0 = X.AnonymousClass3BH.A0V
            android.os.Message r0 = android.os.Message.obtain(r0, r3, r3, r3, r4)
            r0.sendToTarget()
        L_0x0066:
            java.lang.String r0 = X.C37781pj.A00(r11)
            r10.setContentDescription(r0)
            return
        L_0x006e:
            r10.invalidate()
            goto L_0x0066
        L_0x0072:
            java.lang.Object r0 = r0.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56562nu.setEmoji(int[]):void");
    }
}
