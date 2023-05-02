package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.obwhatsapp.R;

/* renamed from: X.2pm  reason: invalid class name */
public class AnonymousClass2pm extends C006002o implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Paint A04;
    public final /* synthetic */ AnonymousClass2S8 A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2pm(Context context, AnonymousClass2S8 r6, boolean z2) {
        super(context, (AttributeSet) null);
        this.A05 = r6;
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        Paint A06 = C13700nu.A06(1);
        this.A04 = A06;
        C13690nt.A0r(context, A06, z2 ? R.color.color08a4 : R.color.color077f);
        A06.setStrokeWidth((float) context.getResources().getDimensionPixelSize(R.dimen.dimen03fa));
        C13690nt.A0y(A06);
        A06.setAntiAlias(true);
        this.A02 = AnonymousClass00T.A00(context, z2 ? R.color.color077d : R.color.color077c);
        this.A03 = AnonymousClass00T.A00(context, R.color.color077e);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(this.A02);
        canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.A04);
        if (this.A05.A0B) {
            canvas.drawColor(this.A03);
        }
    }

    public void onMeasure(int i2, int i3) {
        int defaultSize = ImageView.getDefaultSize(getSuggestedMinimumWidth(), i2);
        setMeasuredDimension(defaultSize, defaultSize);
    }
}
