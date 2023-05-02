package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.obwhatsapp.R;

/* renamed from: X.0Bw  reason: invalid class name and case insensitive filesystem */
public class C02430Bw extends ViewGroup implements C13060lP {
    public int A00;
    public Matrix A01;
    public View A02;
    public ViewGroup A03;
    public final View A04;
    public final ViewTreeObserver.OnPreDrawListener A05 = new C07020Yv(this);

    public C02430Bw(View view) {
        super(view.getContext());
        this.A04 = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, (Paint) null);
    }

    public static void A00(View view, View view2) {
        int left = view2.getLeft();
        int top2 = view2.getTop();
        int left2 = view2.getLeft() + view.getWidth();
        int top3 = view2.getTop() + view.getHeight();
        C06430Vt.A02.A08(view2, left, top2, left2, top3);
    }

    public static void setGhostView(View view, C02430Bw r2) {
        view.setTag(R.id.ghost_view, r2);
    }

    public void AcN(View view, ViewGroup viewGroup) {
        this.A03 = viewGroup;
        this.A02 = view;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this.A04;
        setGhostView(view, this);
        view.getViewTreeObserver().addOnPreDrawListener(this.A05);
        C06430Vt.A02.A07(view, 4);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
    }

    public void onDetachedFromWindow() {
        View view = this.A04;
        view.getViewTreeObserver().removeOnPreDrawListener(this.A05);
        C06430Vt.A02.A07(view, 0);
        setGhostView(view, (C02430Bw) null);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        AnonymousClass0NH.A00(canvas, true);
        canvas.setMatrix(this.A01);
        View view = this.A04;
        AnonymousClass0SD r1 = C06430Vt.A02;
        r1.A07(view, 0);
        view.invalidate();
        r1.A07(view, 4);
        drawChild(canvas, view, getDrawingTime());
        AnonymousClass0NH.A00(canvas, false);
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    public void setMatrix(Matrix matrix) {
        this.A01 = matrix;
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.A04;
        if (view.getTag(R.id.ghost_view) == this) {
            int i3 = 0;
            if (i2 == 0) {
                i3 = 4;
            }
            C06430Vt.A02.A07(view, i3);
        }
    }
}
