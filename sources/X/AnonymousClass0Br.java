package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;

/* renamed from: X.0Br  reason: invalid class name */
public class AnonymousClass0Br extends ViewGroup {
    public static Method A04;
    public View A00;
    public ViewGroup A01;
    public C07840cY A02;
    public boolean A03;

    static {
        Class<ViewGroup> cls = ViewGroup.class;
        try {
            Class[] clsArr = new Class[3];
            Class cls2 = Integer.TYPE;
            clsArr[0] = cls2;
            clsArr[1] = cls2;
            A04 = AnonymousClass000.A0t(cls, Rect.class, "invalidateChildInParentFast", clsArr, 2);
        } catch (NoSuchMethodException unused) {
        }
    }

    public AnonymousClass0Br(Context context, View view, ViewGroup viewGroup, C07840cY r5) {
        super(context);
        this.A01 = viewGroup;
        this.A00 = view;
        setRight(viewGroup.getWidth());
        setBottom(viewGroup.getHeight());
        viewGroup.addView(this);
        this.A02 = r5;
    }

    public void A00(View view) {
        if (!this.A03) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                ViewGroup viewGroup2 = this.A01;
                if (!(viewGroup == viewGroup2 || viewGroup.getParent() == null || !C004601z.A0t(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    viewGroup2.getLocationOnScreen(iArr2);
                    C004601z.A0a(view, iArr[0] - iArr2[0]);
                    C004601z.A0b(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
            return;
        }
        throw AnonymousClass000.A0V("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
    }

    public void A01(View view) {
        super.removeView(view);
        if (getChildCount() == 0) {
            this.A03 = true;
            this.A01.removeView(this);
        }
    }

    public void dispatchDraw(Canvas canvas) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        this.A01.getLocationOnScreen(iArr);
        View view = this.A00;
        view.getLocationOnScreen(iArr2);
        canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
        canvas.clipRect(new Rect(0, 0, view.getWidth(), view.getHeight()));
        super.dispatchDraw(canvas);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        ViewGroup viewGroup = this.A01;
        if (viewGroup == null) {
            return null;
        }
        rect.offset(iArr[0], iArr[1]);
        iArr[0] = 0;
        iArr[1] = 0;
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[2];
        viewGroup.getLocationOnScreen(iArr2);
        this.A00.getLocationOnScreen(iArr3);
        int i2 = iArr3[1] - iArr2[1];
        rect.offset(new int[]{iArr3[0] - iArr2[0], i2}[0], i2);
        return super.invalidateChildInParent(iArr, rect);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidate(drawable.getBounds());
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable);
    }
}
