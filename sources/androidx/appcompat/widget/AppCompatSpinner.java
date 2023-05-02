package androidx.appcompat.widget;

import X.AnonymousClass015;
import X.AnonymousClass06L;
import X.AnonymousClass08Q;
import X.AnonymousClass08Y;
import X.AnonymousClass0ZA;
import X.C02370Bi;
import X.C06970Yq;
import X.C13400ly;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.facebook.redex.IDxLListenerShape143S0100000_I1;
import com.obwhatsapp.R;

public class AppCompatSpinner extends Spinner implements AnonymousClass015 {
    public static final int[] A08 = {16843505};
    public int A00;
    public SpinnerAdapter A01;
    public C13400ly A02;
    public C06970Yq A03;
    public final Context A04;
    public final Rect A05;
    public final AnonymousClass08Q A06;
    public final boolean A07;

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatSpinner(Context context, int i2) {
        this(context, (AttributeSet) null, R.attr.attr04ad, i2);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr04ad);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        if (r3 != null) goto L_0x0066;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e A[SYNTHETIC, Splitter:B:10:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12, android.content.res.Resources.Theme r13) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = X.AnonymousClass000.A0J()
            r8.A05 = r0
            android.content.Context r0 = r8.getContext()
            X.AnonymousClass08P.A03(r0, r8)
            int[] r7 = X.AnonymousClass05L.A0K
            r6 = 0
            X.07T r4 = X.AnonymousClass07T.A00(r9, r10, r7, r11, r6)
            X.08Q r0 = new X.08Q
            r0.<init>(r8)
            r8.A06 = r0
            if (r13 == 0) goto L_0x002c
            X.06V r1 = new X.06V
            r1.<init>((android.content.Context) r9, (android.content.res.Resources.Theme) r13)
        L_0x0025:
            r8.A04 = r1
        L_0x0027:
            r0 = -1
            r5 = 0
            if (r12 != r0) goto L_0x0069
            goto L_0x003e
        L_0x002c:
            r1 = 4
            android.content.res.TypedArray r0 = r4.A02
            int r0 = r0.getResourceId(r1, r6)
            if (r0 == 0) goto L_0x003b
            X.06V r1 = new X.06V
            r1.<init>((android.content.Context) r9, (int) r0)
            goto L_0x0025
        L_0x003b:
            r8.A04 = r9
            goto L_0x0027
        L_0x003e:
            int[] r0 = A08     // Catch:{ Exception -> 0x0051, all -> 0x0062 }
            android.content.res.TypedArray r3 = r9.obtainStyledAttributes(r10, r0, r11, r6)     // Catch:{ Exception -> 0x0051, all -> 0x0062 }
            boolean r0 = r3.hasValue(r6)     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x0066
            int r12 = r3.getInt(r6, r6)     // Catch:{ Exception -> 0x004f }
            goto L_0x0066
        L_0x004f:
            r2 = move-exception
            goto L_0x0053
        L_0x0051:
            r2 = move-exception
            r3 = r5
        L_0x0053:
            java.lang.String r1 = "AppCompatSpinner"
            java.lang.String r0 = "Could not read android:spinnerMode"
            android.util.Log.i(r1, r0, r2)     // Catch:{ all -> 0x005b }
            goto L_0x0064
        L_0x005b:
            r0 = move-exception
            if (r3 == 0) goto L_0x0063
            r3.recycle()
            throw r0
        L_0x0062:
            r0 = move-exception
        L_0x0063:
            throw r0
        L_0x0064:
            if (r3 == 0) goto L_0x0069
        L_0x0066:
            r3.recycle()
        L_0x0069:
            r3 = 1
            if (r12 == 0) goto L_0x00cf
            if (r12 != r3) goto L_0x00a1
            android.content.Context r0 = r8.A04
            X.0DD r2 = new X.0DD
            r2.<init>(r0, r10, r8, r11)
            android.content.Context r0 = r8.A04
            X.07T r6 = X.AnonymousClass07T.A00(r0, r10, r7, r11, r6)
            r7 = 3
            r1 = -2
            android.content.res.TypedArray r0 = r6.A02
            int r0 = r0.getLayoutDimension(r7, r1)
            r8.A00 = r0
            android.graphics.drawable.Drawable r0 = r6.A02(r3)
            r2.Adb(r0)
            r1 = 2
            android.content.res.TypedArray r0 = r4.A02
            java.lang.String r0 = r0.getString(r1)
            r2.A02 = r0
            r6.A04()
            r8.A02 = r2
            com.facebook.redex.IDxFListenerShape2S0200000_I1 r0 = new com.facebook.redex.IDxFListenerShape2S0200000_I1
            r0.<init>(r8, r8, r2, r3)
            r8.A03 = r0
        L_0x00a1:
            r1 = 0
            android.content.res.TypedArray r0 = r4.A02
            java.lang.CharSequence[] r2 = r0.getTextArray(r1)
            if (r2 == 0) goto L_0x00bb
            r0 = 17367048(0x1090008, float:2.5162948E-38)
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r1.<init>(r9, r0, r2)
            r0 = 2131559842(0x7f0d05a2, float:1.874504E38)
            r1.setDropDownViewResource(r0)
            r8.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00bb:
            r4.A04()
            r8.A07 = r3
            android.widget.SpinnerAdapter r0 = r8.A01
            if (r0 == 0) goto L_0x00c9
            r8.setAdapter((android.widget.SpinnerAdapter) r0)
            r8.A01 = r5
        L_0x00c9:
            X.08Q r0 = r8.A06
            r0.A05(r10, r11)
            return
        L_0x00cf:
            X.0ZX r2 = new X.0ZX
            r2.<init>(r8)
            r8.A02 = r2
            r1 = 2
            android.content.res.TypedArray r0 = r4.A02
            java.lang.String r0 = r0.getString(r1)
            r2.A02 = r0
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    public int A00(Drawable drawable, SpinnerAdapter spinnerAdapter) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        Rect rect = this.A05;
        drawable.getPadding(rect);
        return i3 + rect.left + rect.right;
    }

    public void A01() {
        int i2 = Build.VERSION.SDK_INT;
        C13400ly r2 = this.A02;
        if (i2 >= 17) {
            r2.AfU(getTextDirection(), getTextAlignment());
        } else {
            r2.AfU(-1, -1);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass08Q r0 = this.A06;
        if (r0 != null) {
            r0.A00();
        }
    }

    public int getDropDownHorizontalOffset() {
        C13400ly r0 = this.A02;
        return r0 != null ? r0.ACe() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        C13400ly r0 = this.A02;
        return r0 != null ? r0.AGt() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.A02 != null ? this.A00 : super.getDropDownWidth();
    }

    public final C13400ly getInternalPopup() {
        return this.A02;
    }

    public Drawable getPopupBackground() {
        C13400ly r0 = this.A02;
        return r0 != null ? r0.AA0() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.A04;
    }

    public CharSequence getPrompt() {
        C13400ly r0 = this.A02;
        return r0 != null ? r0.ACd() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        AnonymousClass08Y r0;
        AnonymousClass08Q r02 = this.A06;
        if (r02 == null || (r0 = r02.A01) == null) {
            return null;
        }
        return r0.A00;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AnonymousClass08Y r0;
        AnonymousClass08Q r02 = this.A06;
        if (r02 == null || (r0 = r02.A01) == null) {
            return null;
        }
        return r0.A01;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C13400ly r1 = this.A02;
        if (r1 != null && r1.AJh()) {
            r1.dismiss();
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.A02 != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), A00(getBackground(), getAdapter())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C02370Bi r4 = (C02370Bi) parcelable;
        super.onRestoreInstanceState(r4.getSuperState());
        if (r4.A00 && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new IDxLListenerShape143S0100000_I1(this, 2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r1 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            X.0Bi r2 = new X.0Bi
            r2.<init>((android.os.Parcelable) r0)
            X.0ly r0 = r3.A02
            if (r0 == 0) goto L_0x0014
            boolean r1 = r0.AJh()
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r2.A00 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.onSaveInstanceState():android.os.Parcelable");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C06970Yq r0 = this.A03;
        if (r0 == null || !r0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C13400ly r0 = this.A02;
        if (r0 == null) {
            return super.performClick();
        }
        if (r0.AJh()) {
            return true;
        }
        A01();
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.A07) {
            this.A01 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        C13400ly r2 = this.A02;
        if (r2 != null) {
            Context context = this.A04;
            if (context == null) {
                context = getContext();
            }
            r2.AdW(new AnonymousClass0ZA(context.getTheme(), spinnerAdapter));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AnonymousClass08Q r0 = this.A06;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        AnonymousClass08Q r0 = this.A06;
        if (r0 != null) {
            r0.A02(i2);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        C13400ly r0 = this.A02;
        if (r0 != null) {
            r0.Ae2(i2);
            r0.Ae1(i2);
            return;
        }
        super.setDropDownHorizontalOffset(i2);
    }

    public void setDropDownVerticalOffset(int i2) {
        C13400ly r0 = this.A02;
        if (r0 != null) {
            r0.Aex(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public void setDropDownWidth(int i2) {
        if (this.A02 != null) {
            this.A00 = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C13400ly r0 = this.A02;
        if (r0 != null) {
            r0.Adb(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(AnonymousClass06L.A01(this.A04, i2));
    }

    public void setPrompt(CharSequence charSequence) {
        C13400ly r0 = this.A02;
        if (r0 != null) {
            r0.AeQ(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AnonymousClass08Q r0 = this.A06;
        if (r0 != null) {
            r0.A03(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AnonymousClass08Q r0 = this.A06;
        if (r0 != null) {
            r0.A04(mode);
        }
    }
}
