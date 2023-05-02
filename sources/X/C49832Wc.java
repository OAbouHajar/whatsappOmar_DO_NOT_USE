package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.rendercore.RootHostView;
import org.apache.commons.io.IOUtils;

/* renamed from: X.2Wc  reason: invalid class name and case insensitive filesystem */
public class C49832Wc extends C49842Wd {
    public Drawable A00;
    public SparseArray A01;
    public AnonymousClass5L0 A02;
    public Object A03;
    public boolean A04;
    public boolean A05;
    public int[] A06 = new int[0];
    public AnonymousClass4LN[] A07;
    public AnonymousClass4LN[] A08;
    public final C88164a3 A09 = new C88164a3(this);

    public C49832Wc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
        this.A07 = new AnonymousClass4LN[8];
    }

    public static final String A00(AnonymousClass4LN[] r5) {
        if (r5 == null) {
            return "<null>";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < r5.length; i2++) {
            AnonymousClass4LN r1 = r5[i2];
            sb.append("Item at index: ");
            if (r1 != null) {
                sb.append(i2);
                sb.append(" Type: ");
                AnonymousClass4LN r12 = r5[i2];
                sb.append(r12.A01.A07.A04());
                sb.append(" Position in parent: ");
                sb.append(r12.A01.A03);
            } else {
                sb.append(i2);
                sb.append(" item is null");
            }
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }

    public static void A01(C49832Wc r7) {
        int childCount = r7.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = r7.getChildAt(i2);
            if (childAt.isLayoutRequested()) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(childAt.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getHeight(), 1073741824));
                childAt.layout(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            }
            if (childAt instanceof C49832Wc) {
                A01((C49832Wc) childAt);
            }
        }
    }

    private void setForegroundLollipop(Drawable drawable) {
        Drawable drawable2 = this.A00;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.A00);
            }
            this.A00 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
            }
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001d, code lost:
        if (r4 > -1) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        if (r2[r4] == null) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass4LN r6) {
        /*
            r5 = this;
            X.4LN[] r1 = r5.A07
            r4 = 0
        L_0x0003:
            int r0 = r1.length
            if (r4 >= r0) goto L_0x000d
            r0 = r1[r4]
            if (r0 == r6) goto L_0x000e
            int r4 = r4 + 1
            goto L_0x0003
        L_0x000d:
            r4 = -1
        L_0x000e:
            r2 = -1
            if (r4 > r2) goto L_0x001f
            X.4LN[] r1 = r5.A08
            if (r1 == 0) goto L_0x0066
            r4 = 0
        L_0x0016:
            int r0 = r1.length
            if (r4 >= r0) goto L_0x0066
            r0 = r1[r4]
            if (r0 != r6) goto L_0x005f
            if (r4 <= r2) goto L_0x0066
        L_0x001f:
            java.lang.Object r1 = r6.A02
            android.view.View r1 = (android.view.View) r1
            r0 = 1
            r5.A05 = r0
            boolean r0 = r1.isPressed()
            if (r0 == 0) goto L_0x0030
            r0 = 0
            r1.setPressed(r0)
        L_0x0030:
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x005b
            super.removeViewInLayout(r1)
        L_0x0037:
            r0 = 1
            r5.A05 = r0
            X.4LN[] r3 = r5.A07
            X.4LN[] r2 = r5.A08
            if (r2 == 0) goto L_0x0045
            r0 = r2[r4]
            r1 = 1
            if (r0 != 0) goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            r0 = 0
            if (r1 == 0) goto L_0x0056
            r2[r4] = r0
        L_0x004b:
            r1 = 0
        L_0x004c:
            int r0 = r2.length
            if (r1 >= r0) goto L_0x0062
            r0 = r2[r1]
            if (r0 != 0) goto L_0x0065
            int r1 = r1 + 1
            goto L_0x004c
        L_0x0056:
            r3[r4] = r0
            if (r2 == 0) goto L_0x0065
            goto L_0x004b
        L_0x005b:
            super.removeView(r1)
            goto L_0x0037
        L_0x005f:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x0062:
            r0 = 0
            r5.A08 = r0
        L_0x0065:
            return
        L_0x0066:
            java.lang.String r4 = "\nScraped items: "
            java.lang.String r3 = "\nMounted items: "
            r2 = 0
            java.lang.String r0 = "Mount item was not found in the list of mounted items.\nItem to remove: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            com.facebook.rendercore.RenderTreeNode r0 = r6.A01
            java.lang.String r0 = r0.A00(r2)
            r1.append(r0)
            r1.append(r3)
            X.4LN[] r0 = r5.A07
            java.lang.String r0 = A00(r0)
            r1.append(r0)
            r1.append(r4)
            X.4LN[] r0 = r5.A08
            java.lang.String r0 = A00(r0)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49832Wc.A02(X.4LN):void");
    }

    public void A03(AnonymousClass4LN r6, int i2) {
        View view = (View) r6.A02;
        this.A05 = true;
        if (!(view instanceof C49832Wc) || view.getParent() != this) {
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(generateDefaultLayoutParams());
            }
            boolean z2 = this.A04;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (z2) {
                super.addViewInLayout(view, -1, layoutParams, true);
            } else {
                super.addView(view, -1, layoutParams);
            }
        } else {
            C004601z.A0R(view);
            view.setVisibility(0);
        }
        AnonymousClass4LN[] r3 = this.A07;
        int length = r3.length;
        if (i2 >= length) {
            int i3 = length;
            do {
                i3 <<= 1;
            } while (i2 >= i3);
            AnonymousClass4LN[] r1 = new AnonymousClass4LN[i3];
            System.arraycopy(r3, 0, r1, 0, length);
            this.A07 = r1;
            r3 = r1;
        }
        r3[i2] = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r3[r7] == null) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass4LN r6, int r7, int r8) {
        /*
            r5 = this;
            java.lang.Object r2 = r6.A02
            r0 = 1
            r5.A05 = r0
            android.view.View r2 = (android.view.View) r2
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 19
            if (r1 < r0) goto L_0x0010
            r2.cancelPendingInputEvents()
        L_0x0010:
            X.C004601z.A0S(r2)
            X.4LN[] r4 = r5.A07
            int r3 = r4.length
            if (r8 < r3) goto L_0x0026
            r0 = r3
        L_0x0019:
            int r0 = r0 << 1
            if (r8 >= r0) goto L_0x0019
            X.4LN[] r1 = new X.AnonymousClass4LN[r0]
            r0 = 0
            java.lang.System.arraycopy(r4, r0, r1, r0, r3)
            r5.A07 = r1
            r4 = r1
        L_0x0026:
            r1 = r4[r8]
            if (r1 == 0) goto L_0x0035
            X.4LN[] r0 = r5.A08
            if (r0 != 0) goto L_0x0033
            int r0 = r4.length
            X.4LN[] r0 = new X.AnonymousClass4LN[r0]
            r5.A08 = r0
        L_0x0033:
            r0[r8] = r1
        L_0x0035:
            X.4LN[] r3 = r5.A08
            if (r3 == 0) goto L_0x003e
            r1 = r3[r7]
            r0 = 1
            if (r1 != 0) goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            r1 = 0
            if (r0 == 0) goto L_0x0055
            r0 = r3[r7]
            r3[r7] = r1
        L_0x0046:
            r4[r8] = r0
            if (r3 == 0) goto L_0x005d
            r1 = 0
        L_0x004b:
            int r0 = r3.length
            if (r1 >= r0) goto L_0x005a
            r0 = r3[r1]
            if (r0 != 0) goto L_0x005d
            int r1 = r1 + 1
            goto L_0x004b
        L_0x0055:
            r0 = r4[r7]
            r4[r7] = r1
            goto L_0x0046
        L_0x005a:
            r0 = 0
            r5.A08 = r0
        L_0x005d:
            com.facebook.rendercore.RenderTreeNode r0 = r6.A01
            X.3BJ r0 = r0.A07
            X.416 r1 = r0.A04
            X.416 r0 = X.AnonymousClass416.VIEW
            if (r1 != r0) goto L_0x006a
            X.C004601z.A0R(r2)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49832Wc.A04(X.4LN, int, int):void");
    }

    public void dispatchDraw(Canvas canvas) {
        C88164a3 r2 = this.A09;
        r2.A02 = canvas;
        int i2 = 0;
        r2.A00 = 0;
        AnonymousClass4LN[] r0 = r2.A03.A07;
        if (r0 != null) {
            i2 = r0.length;
        }
        r2.A01 = i2;
        super.dispatchDraw(canvas);
        if (r2.A02 != null && r2.A00 < r2.A01) {
            C88164a3.A00(r2);
        }
        r2.A02 = null;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass4LN[] r0 = this.A07;
        if (r0 != null) {
            for (int i2 = 0; i2 < r0.length; i2++) {
            }
        }
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setState(getDrawableState());
        }
    }

    public int getChildDrawingOrder(int i2, int i3) {
        if (this.A05) {
            int childCount = getChildCount();
            if (this.A06.length < childCount) {
                this.A06 = new int[(childCount + 5)];
            }
            AnonymousClass4LN[] r0 = this.A07;
            if (r0 != null) {
                int length = r0.length;
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    AnonymousClass4LN r2 = this.A07[i5];
                    if (r2 != null && r2.A01.A07.A04 == AnonymousClass416.VIEW) {
                        this.A06[i4] = indexOfChild((View) r2.A02);
                        i4++;
                    }
                }
            }
            this.A05 = false;
        }
        C88164a3 r22 = this.A09;
        if (r22.A02 != null && r22.A00 < r22.A01) {
            C88164a3.A00(r22);
        }
        return this.A06[i3];
    }

    public String getDescriptionOfMountedItems() {
        StringBuilder sb = new StringBuilder("\nMounted Items");
        sb.append(A00(this.A07));
        sb.append("\nScraped Items: ");
        sb.append(A00(this.A08));
        return sb.toString();
    }

    public int getMountItemCount() {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            AnonymousClass4LN[] r1 = this.A07;
            if (i2 >= r1.length) {
                return i3;
            }
            if (r1[i2] != null) {
                i3++;
            }
            i2++;
        }
    }

    public Object getTag() {
        Object obj = this.A03;
        return obj == null ? super.getTag() : obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getTag(int r2) {
        /*
            r1 = this;
            android.util.SparseArray r0 = r1.A01
            if (r0 == 0) goto L_0x000b
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            java.lang.Object r0 = super.getTag(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49832Wc.getTag(int):java.lang.Object");
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        AnonymousClass4LN[] r0 = this.A07;
        if (r0 != null) {
            for (int i2 = 0; i2 < r0.length; i2++) {
            }
        }
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        C61753Ae r6;
        this.A04 = true;
        if (this instanceof RootHostView) {
            RootHostView rootHostView = (RootHostView) this;
            C85034Mv r5 = rootHostView.A00;
            int i6 = 0;
            if (r5.A02 && (r6 = r5.A00) != null) {
                r6.A01(View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824), (int[]) null, View.MeasureSpec.makeMeasureSpec(i5 - i3, 1073741824));
                r5.A02 = false;
            }
            AnonymousClass3AI r0 = r5.A01;
            if (r0 != null) {
                C61813Al r2 = r5.A04;
                r2.A08(r0);
                while (true) {
                    AnonymousClass3AI r1 = r5.A01;
                    if (r0 == r1) {
                        break;
                    } else if (i6 > 4) {
                        C89634ca.A01("RootHostDelegate");
                        break;
                    } else {
                        r2.A08(r1);
                        i6++;
                        r0 = r1;
                    }
                }
            }
            A01(rootHostView);
        } else if (this instanceof C57842s0) {
            C57842s0 r4 = (C57842s0) this;
            AnonymousClass3AI r02 = r4.A00;
            if (r02 != null) {
                C61813Al r3 = r4.A01;
                r3.A08(r02);
                int i7 = 0;
                while (true) {
                    AnonymousClass3AI r12 = r4.A00;
                    if (r02 == r12) {
                        break;
                    } else if (i7 > 4) {
                        C89634ca.A01("RenderTreeHostView");
                        break;
                    } else {
                        r3.A08(r12);
                        i7++;
                        r02 = r12;
                    }
                }
            }
            A01(r4);
        }
        this.A04 = false;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(0, 0, getRight(), getBottom());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass4LN[] r0;
        if (isEnabled() && (r0 = this.A07) != null) {
            for (int length = r0.length - 1; length >= 0; length--) {
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void requestLayout() {
        ViewParent viewParent = this;
        while (viewParent instanceof C49832Wc) {
            if (!((C49832Wc) viewParent).A04) {
                viewParent = viewParent.getParent();
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    public void setForegroundCompat(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            AnonymousClass44r.A00(drawable, this);
        } else {
            setForegroundLollipop(drawable);
        }
    }

    public void setInterceptTouchEventHandler(AnonymousClass5L0 r1) {
        this.A02 = r1;
    }

    public void setViewTag(Object obj) {
        this.A03 = obj;
    }

    public void setViewTags(SparseArray sparseArray) {
        this.A01 = sparseArray;
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        AnonymousClass4LN[] r0 = this.A07;
        if (r0 != null) {
            int length = r0.length;
            for (int i3 = 0; i3 < length; i3++) {
            }
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return true;
    }
}
