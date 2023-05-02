package androidx.fragment.app;

import X.AnonymousClass01A;
import X.AnonymousClass02C;
import X.AnonymousClass030;
import X.AnonymousClass050;
import X.AnonymousClass06B;
import X.AnonymousClass0NC;
import X.AnonymousClass0WQ;
import X.C004601z;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.obwhatsapp.R;
import java.util.ArrayList;

public final class FragmentContainerView extends FrameLayout {
    public View.OnApplyWindowInsetsListener A00;
    public ArrayList A01;
    public ArrayList A02;
    public boolean A03;

    public FragmentContainerView(Context context) {
        super(context);
        this.A03 = true;
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        String str;
        this.A03 = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0NC.A01);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                StringBuilder sb = new StringBuilder("FragmentContainerView must be within a FragmentActivity to use ");
                sb.append(str);
                sb.append("=\"");
                sb.append(classAttribute);
                sb.append("\"");
                throw new UnsupportedOperationException(sb.toString());
            }
        }
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, AnonymousClass02C r9) {
        super(context, attributeSet);
        View view;
        String str;
        this.A03 = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0NC.A01);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AnonymousClass01A A08 = r9.A08(id);
        if (classAttribute != null && A08 == null) {
            if (id <= 0) {
                if (string != null) {
                    StringBuilder sb = new StringBuilder(" with tag ");
                    sb.append(string);
                    str = sb.toString();
                } else {
                    str = "";
                }
                StringBuilder sb2 = new StringBuilder("FragmentContainerView must have an android:id to add Fragment ");
                sb2.append(classAttribute);
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
            AnonymousClass06B A0C = r9.A0C();
            context.getClassLoader();
            AnonymousClass01A A002 = A0C.A00(classAttribute);
            A002.A0V = true;
            if (A002.A0F != null) {
                A002.A0V = false;
                A002.A0V = true;
            }
            AnonymousClass050 r1 = new AnonymousClass050(r9);
            r1.A0H = true;
            A002.A0B = this;
            r1.A0D(A002, string, getId());
            r1.A04();
        }
        for (AnonymousClass0WQ r3 : r9.A0U.A01()) {
            AnonymousClass01A r2 = r3.A02;
            if (r2.A01 == getId() && (view = r2.A0A) != null && view.getParent() == null) {
                r2.A0B = this;
                r3.A02();
            }
        }
    }

    public final void A00(View view) {
        ArrayList arrayList = this.A02;
        if (arrayList != null && arrayList.contains(view)) {
            ArrayList arrayList2 = this.A01;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.A01 = arrayList2;
            }
            arrayList2.add(view);
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (!(tag instanceof AnonymousClass01A) || tag == null) {
            StringBuilder sb = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
            sb.append(view);
            sb.append(" is not associated with a Fragment.");
            throw new IllegalStateException(sb.toString());
        }
        super.addView(view, i2, layoutParams);
    }

    public boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AnonymousClass01A) && tag != null) {
            return super.addViewInLayout(view, i2, layoutParams, z2);
        }
        StringBuilder sb = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        AnonymousClass030 A022 = AnonymousClass030.A02(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.A00;
        AnonymousClass030 A023 = onApplyWindowInsetsListener != null ? AnonymousClass030.A02(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : C004601z.A0K(this, A022);
        if (!A023.A00.A09()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                C004601z.A0J(getChildAt(i2), A023);
            }
        }
        return windowInsets;
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.A03 && this.A01 != null) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.A01;
                if (i2 >= arrayList.size()) {
                    break;
                }
                super.drawChild(canvas, (View) arrayList.get(i2), getDrawingTime());
                i2++;
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        ArrayList arrayList;
        if (!this.A03 || (arrayList = this.A01) == null || arrayList.size() <= 0 || !arrayList.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList arrayList = this.A02;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.A01;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.A03 = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                A00(getChildAt(childCount));
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public void removeDetachedView(View view, boolean z2) {
        if (z2) {
            A00(view);
        }
        super.removeDetachedView(view, z2);
    }

    public void removeView(View view) {
        A00(view);
        super.removeView(view);
    }

    public void removeViewAt(int i2) {
        A00(getChildAt(i2));
        super.removeViewAt(i2);
    }

    public void removeViewInLayout(View view) {
        A00(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            A00(getChildAt(i4));
        }
        super.removeViews(i2, i3);
    }

    public void removeViewsInLayout(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            A00(getChildAt(i4));
        }
        super.removeViewsInLayout(i2, i3);
    }

    public void setDrawDisappearingViewsLast(boolean z2) {
        this.A03 = z2;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.A00 = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            ArrayList arrayList = this.A02;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.A02 = arrayList;
            }
            arrayList.add(view);
        }
        super.startViewTransition(view);
    }
}
