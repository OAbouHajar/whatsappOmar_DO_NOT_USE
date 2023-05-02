package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.obwhatsapp.R;
import java.lang.reflect.Field;

/* renamed from: X.0CV  reason: invalid class name */
public class AnonymousClass0CV extends ListView {
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public AnonymousClass0Cn A05;
    public C09260fD A06;
    public C06960Yp A07;
    public Field A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Rect A0C = AnonymousClass000.A0J();

    public AnonymousClass0CV(Context context, boolean z2) {
        super(context, (AttributeSet) null, R.attr.attr0159);
        this.A0A = z2;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.A08 = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z2) {
        AnonymousClass0Cn r0 = this.A05;
        if (r0 != null) {
            r0.A00 = z2;
        }
    }

    public int A00(int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i4 = listPaddingTop + listPaddingBottom;
        if (adapter != null) {
            if (dividerHeight <= 0 || divider == null) {
                dividerHeight = 0;
            }
            int count = adapter.getCount();
            View view = null;
            int i5 = 0;
            for (int i6 = 0; i6 < count; i6++) {
                int itemViewType = adapter.getItemViewType(i6);
                if (itemViewType != i5) {
                    view = null;
                    i5 = itemViewType;
                }
                view = adapter.getView(i6, view, this);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = generateDefaultLayoutParams();
                    view.setLayoutParams(layoutParams);
                }
                int i7 = layoutParams.height;
                view.measure(i2, i7 > 0 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
                view.forceLayout();
                if (i6 > 0) {
                    i4 += dividerHeight;
                }
                i4 += view.getMeasuredHeight();
                if (i4 >= i3) {
                    return i3;
                }
            }
        }
        return i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r13 != 3) goto L_0x0011;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(android.view.MotionEvent r19, int r20) {
        /*
            r18 = this;
            r11 = r19
            int r13 = r11.getActionMasked()
            r10 = 1
            r9 = r18
            if (r13 == r10) goto L_0x0023
            r0 = 2
            if (r13 == r0) goto L_0x0025
            r0 = 3
            if (r13 == r0) goto L_0x0136
        L_0x0011:
            r3 = 1
        L_0x0012:
            X.0Yp r0 = r9.A07
            if (r0 != 0) goto L_0x001d
            X.0Yp r0 = new X.0Yp
            r0.<init>(r9)
            r9.A07 = r0
        L_0x001d:
            r0.A04 = r10
            r0.onTouch(r9, r11)
        L_0x0022:
            return r3
        L_0x0023:
            r3 = 0
            goto L_0x0026
        L_0x0025:
            r3 = 1
        L_0x0026:
            r0 = r20
            int r1 = r11.findPointerIndex(r0)
            if (r1 < 0) goto L_0x0136
            float r0 = r11.getX(r1)
            int r2 = (int) r0
            float r0 = r11.getY(r1)
            int r1 = (int) r0
            int r8 = r9.pointToPosition(r2, r1)
            r12 = -1
            if (r8 == r12) goto L_0x0137
            int r0 = r9.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r7 = r9.getChildAt(r0)
            float r6 = (float) r2
            float r5 = (float) r1
            r17 = 1
            r9.A09 = r10
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r3 < r2) goto L_0x0058
            r9.drawableHotspotChanged(r6, r5)
        L_0x0058:
            boolean r0 = r9.isPressed()
            if (r0 != 0) goto L_0x0061
            r9.setPressed(r10)
        L_0x0061:
            r9.layoutChildren()
            int r1 = r9.A00
            r4 = 0
            if (r1 == r12) goto L_0x007f
            int r0 = r9.getFirstVisiblePosition()
            int r1 = r1 - r0
            android.view.View r1 = r9.getChildAt(r1)
            if (r1 == 0) goto L_0x007f
            if (r1 == r7) goto L_0x007f
            boolean r0 = r1.isPressed()
            if (r0 == 0) goto L_0x007f
            r1.setPressed(r4)
        L_0x007f:
            r9.A00 = r8
            int r0 = r7.getLeft()
            float r0 = (float) r0
            float r1 = r6 - r0
            int r0 = r7.getTop()
            float r0 = (float) r0
            float r0 = r5 - r0
            if (r3 < r2) goto L_0x0094
            r7.drawableHotspotChanged(r1, r0)
        L_0x0094:
            boolean r0 = r7.isPressed()
            if (r0 != 0) goto L_0x009d
            r7.setPressed(r10)
        L_0x009d:
            android.graphics.drawable.Drawable r14 = r9.getSelector()
            if (r14 == 0) goto L_0x00dc
            if (r8 == r12) goto L_0x00dc
            r16 = 1
            r14.setVisible(r4, r4)
        L_0x00aa:
            android.graphics.Rect r15 = r9.A0C
            int r3 = r7.getLeft()
            int r2 = r7.getTop()
            int r1 = r7.getRight()
            int r0 = r7.getBottom()
            r15.set(r3, r2, r1, r0)
            int r1 = r15.left
            int r0 = r9.A02
            int r1 = r1 - r0
            r15.left = r1
            int r1 = r15.top
            int r0 = r9.A04
            int r1 = r1 - r0
            r15.top = r1
            int r1 = r15.right
            int r0 = r9.A03
            int r1 = r1 + r0
            r15.right = r1
            int r1 = r15.bottom
            int r0 = r9.A01
            int r1 = r1 + r0
            r15.bottom = r1
            goto L_0x00df
        L_0x00dc:
            r16 = 0
            goto L_0x00aa
        L_0x00df:
            java.lang.reflect.Field r1 = r9.A08     // Catch:{ IllegalAccessException -> 0x00fc }
            boolean r2 = r1.getBoolean(r9)     // Catch:{ IllegalAccessException -> 0x00fc }
            boolean r0 = r7.isEnabled()     // Catch:{ IllegalAccessException -> 0x00fc }
            if (r0 == r2) goto L_0x0100
            boolean r0 = X.AnonymousClass000.A1P(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x00fc }
            r1.set(r9, r0)     // Catch:{ IllegalAccessException -> 0x00fc }
            if (r8 == r12) goto L_0x0100
            r9.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00fc }
            goto L_0x0100
        L_0x00fc:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0100:
            if (r16 == 0) goto L_0x011a
            float r2 = r15.exactCenterX()
            float r1 = r15.exactCenterY()
            int r0 = r9.getVisibility()
            if (r0 == 0) goto L_0x0112
            r17 = 0
        L_0x0112:
            r0 = r17
            r14.setVisible(r0, r4)
            X.C018208n.A09(r14, r2, r1)
        L_0x011a:
            android.graphics.drawable.Drawable r0 = r9.getSelector()
            if (r0 == 0) goto L_0x0125
            if (r8 == r12) goto L_0x0125
            X.C018208n.A09(r0, r6, r5)
        L_0x0125:
            r9.setSelectorEnabled(r4)
            r9.refreshDrawableState()
            if (r13 != r10) goto L_0x0011
            long r0 = r9.getItemIdAtPosition(r8)
            r9.performItemClick(r7, r8, r0)
            goto L_0x0011
        L_0x0136:
            r3 = 0
        L_0x0137:
            r2 = 0
            r9.A09 = r2
            r9.setPressed(r2)
            r9.drawableStateChanged()
            int r1 = r9.A00
            int r0 = r9.getFirstVisiblePosition()
            int r1 = r1 - r0
            android.view.View r0 = r9.getChildAt(r1)
            if (r0 == 0) goto L_0x0150
            r0.setPressed(r2)
        L_0x0150:
            if (r3 != 0) goto L_0x0012
            X.0Yp r2 = r9.A07
            if (r2 == 0) goto L_0x0022
            r1 = 0
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x015e
            r2.A01()
        L_0x015e:
            r2.A04 = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CV.A01(android.view.MotionEvent, int):boolean");
    }

    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.A0C;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.A06 == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            Drawable selector = getSelector();
            if (selector != null && this.A09 && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    public boolean hasFocus() {
        return this.A0A || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.A0A || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.A0A || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.A0A && this.A0B) || super.isInTouchMode();
    }

    public void onDetachedFromWindow() {
        this.A06 = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.A06 == null) {
            C09260fD r1 = new C09260fD(this);
            this.A06 = r1;
            r1.A00.post(r1);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                Drawable selector = getSelector();
                if (selector != null && this.A09 && isPressed()) {
                    selector.setState(getDrawableState());
                    return onHoverEvent;
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A00 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C09260fD r2 = this.A06;
        if (r2 != null) {
            AnonymousClass0CV r1 = r2.A00;
            r1.A06 = null;
            r1.removeCallbacks(r2);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.A0B = z2;
    }

    public void setSelector(Drawable drawable) {
        AnonymousClass0Cn r0 = drawable != null ? new AnonymousClass0Cn(drawable) : null;
        this.A05 = r0;
        super.setSelector(r0);
        Rect A0J = AnonymousClass000.A0J();
        if (drawable != null) {
            drawable.getPadding(A0J);
        }
        this.A02 = A0J.left;
        this.A04 = A0J.top;
        this.A03 = A0J.right;
        this.A01 = A0J.bottom;
    }
}
