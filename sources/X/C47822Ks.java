package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar$Tab;
import com.google.android.material.tabs.TabLayout;
import com.obwhatsapp.R;

/* renamed from: X.2Ks  reason: invalid class name and case insensitive filesystem */
public class C47822Ks extends LinearLayout {
    public int A00 = 2;
    public Drawable A01;
    public View A02;
    public ImageView A03;
    public ImageView A04;
    public TextView A05;
    public TextView A06;
    public C47812Kr A07;
    public final /* synthetic */ TabLayout A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47822Ks(Context context, TabLayout tabLayout) {
        super(context);
        this.A08 = tabLayout;
        A01(context);
        C004601z.A0h(this, tabLayout.A0A, tabLayout.A0B, tabLayout.A09, tabLayout.A08);
        setGravity(17);
        setOrientation(tabLayout.A0Q ^ true ? 1 : 0);
        setClickable(true);
        C004601z.A0l(this, AnonymousClass0UM.A00(getContext()));
    }

    public final void A00() {
        View view;
        C47812Kr r3 = this.A07;
        ImageView imageView = null;
        if (r3 == null || (view = r3.A01) == null) {
            View view2 = this.A02;
            if (view2 != null) {
                removeView(view2);
                this.A02 = null;
            }
            this.A05 = null;
        } else {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view);
                }
                addView(view);
            }
            this.A02 = view;
            TextView textView = this.A06;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView2 = this.A04;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                this.A04.setImageDrawable((Drawable) null);
            }
            TextView textView2 = (TextView) view.findViewById(16908308);
            this.A05 = textView2;
            if (textView2 != null) {
                this.A00 = textView2.getMaxLines();
            }
            imageView = (ImageView) view.findViewById(16908294);
        }
        this.A03 = imageView;
        boolean z2 = false;
        if (this.A02 == null) {
            if (this.A04 == null) {
                ImageView imageView3 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.layout021b, this, false);
                addView(imageView3, 0);
                this.A04 = imageView3;
            }
            if (this.A06 == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.layout021c, this, false);
                addView(textView3);
                this.A06 = textView3;
                this.A00 = textView3.getMaxLines();
            }
            TextView textView4 = this.A06;
            TabLayout tabLayout = this.A08;
            AnonymousClass04h.A08(textView4, tabLayout.A0C);
            ColorStateList colorStateList = tabLayout.A0G;
            if (colorStateList != null) {
                this.A06.setTextColor(colorStateList);
            }
            A02(this.A04, this.A06);
        } else {
            TextView textView5 = this.A05;
            if (!(textView5 == null && imageView == null)) {
                A02(imageView, textView5);
            }
        }
        if (r3 != null) {
            if (!TextUtils.isEmpty(r3.A04)) {
                setContentDescription(r3.A04);
            }
            TabLayout tabLayout2 = r3.A03;
            if (tabLayout2 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (tabLayout2.getSelectedTabPosition() == r3.A00) {
                z2 = true;
            }
        }
        setSelected(z2);
    }

    public final void A01(Context context) {
        GradientDrawable gradientDrawable;
        TabLayout tabLayout = this.A08;
        int i2 = tabLayout.A0X;
        GradientDrawable gradientDrawable2 = null;
        if (i2 != 0) {
            Drawable A012 = AnonymousClass08E.A01(context, i2);
            this.A01 = A012;
            if (A012 != null && A012.isStateful()) {
                this.A01.setState(getDrawableState());
            }
        } else {
            this.A01 = null;
        }
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(0);
        Drawable drawable = gradientDrawable3;
        if (tabLayout.A0F != null) {
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            gradientDrawable4.setCornerRadius(1.0E-5f);
            gradientDrawable4.setColor(-1);
            ColorStateList A022 = C53732gB.A02(tabLayout.A0F);
            if (Build.VERSION.SDK_INT >= 21) {
                if (tabLayout.A0T) {
                    gradientDrawable = null;
                } else {
                    gradientDrawable2 = gradientDrawable4;
                    gradientDrawable = gradientDrawable3;
                }
                drawable = new RippleDrawable(A022, gradientDrawable, gradientDrawable2);
            } else {
                Drawable A032 = C018208n.A03(gradientDrawable4);
                C018208n.A04(A022, A032);
                drawable = new LayerDrawable(new Drawable[]{gradientDrawable3, A032});
            }
        }
        setBackground(drawable);
        tabLayout.invalidate();
    }

    public final void A02(ImageView imageView, TextView textView) {
        CharSequence charSequence = null;
        C47812Kr r0 = this.A07;
        CharSequence charSequence2 = r0 != null ? r0.A05 : null;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable((Drawable) null);
        }
        boolean z2 = !TextUtils.isEmpty(charSequence2);
        if (textView != null) {
            if (z2) {
                textView.setText(charSequence2);
                textView.setVisibility(0);
                setVisibility(0);
            } else {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            }
        }
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int A012 = (!z2 || imageView.getVisibility() != 0) ? 0 : this.A08.A01(8);
            if (this.A08.A0Q) {
                if (A012 != C05580Sd.A00(marginLayoutParams)) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        AnonymousClass0VQ.A02(marginLayoutParams, A012);
                    } else {
                        marginLayoutParams.rightMargin = A012;
                    }
                    marginLayoutParams.bottomMargin = 0;
                }
            } else if (A012 != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = A012;
                if (Build.VERSION.SDK_INT >= 17) {
                    AnonymousClass0VQ.A02(marginLayoutParams, 0);
                } else {
                    marginLayoutParams.rightMargin = 0;
                }
            }
            imageView.setLayoutParams(marginLayoutParams);
            imageView.requestLayout();
        }
        C47812Kr r02 = this.A07;
        CharSequence charSequence3 = r02 != null ? r02.A04 : null;
        if (!z2) {
            charSequence = charSequence3;
        }
        AnonymousClass0L5.A00(this, charSequence);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A01;
        if (drawable != null && drawable.isStateful() && (false || this.A01.setState(drawableState))) {
            invalidate();
            this.A08.invalidate();
        }
    }

    public final int getContentWidth() {
        int i2 = 0;
        View[] viewArr = {this.A06, this.A04, this.A02};
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        do {
            View view = viewArr[i2];
            if (view != null && view.getVisibility() == 0) {
                if (z2) {
                    i4 = Math.min(i4, view.getLeft());
                    i3 = Math.max(i3, view.getRight());
                } else {
                    i4 = view.getLeft();
                    i3 = view.getRight();
                }
                z2 = true;
            }
            i2++;
        } while (i2 < 3);
        return i3 - i4;
    }

    public C47812Kr getTab() {
        return this.A07;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ActionBar$Tab.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ActionBar$Tab.class.getName());
    }

    public void onMeasure(int i2, int i3) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        TabLayout tabLayout = this.A08;
        int i4 = tabLayout.A07;
        if (i4 > 0 && (mode == 0 || size > i4)) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.A06 != null) {
            float f2 = tabLayout.A01;
            int i5 = this.A00;
            ImageView imageView = this.A04;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.A06;
                if (textView != null && textView.getLineCount() > 1) {
                    f2 = tabLayout.A00;
                }
            } else {
                i5 = 1;
            }
            float textSize = this.A06.getTextSize();
            int lineCount = this.A06.getLineCount();
            int maxLines = this.A06.getMaxLines();
            if (f2 == textSize && (maxLines < 0 || i5 == maxLines)) {
                return;
            }
            if (tabLayout.A03 != 1 || f2 <= textSize || lineCount != 1 || ((layout = this.A06.getLayout()) != null && layout.getLineWidth(0) * (f2 / layout.getPaint().getTextSize()) <= ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                this.A06.setTextSize(0, f2);
                this.A06.setMaxLines(i5);
                super.onMeasure(i2, i3);
            }
        }
    }

    public boolean performClick() {
        boolean performClick = super.performClick();
        if (this.A07 == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.A07.A01();
        return true;
    }

    public void setSelected(boolean z2) {
        isSelected();
        super.setSelected(z2);
        TextView textView = this.A06;
        if (textView != null) {
            textView.setSelected(z2);
        }
        ImageView imageView = this.A04;
        if (imageView != null) {
            imageView.setSelected(z2);
        }
        View view = this.A02;
        if (view != null) {
            view.setSelected(z2);
        }
    }

    public void setTab(C47812Kr r2) {
        if (r2 != this.A07) {
            this.A07 = r2;
            A00();
        }
    }
}
