package X;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: X.2Bo  reason: invalid class name and case insensitive filesystem */
public class C45902Bo {
    public static final Object A00 = new Object();
    public static final boolean A01;

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 17) {
            z2 = true;
        }
        A01 = z2;
    }

    public static int A00(int i2) {
        if (!A01 || (8388608 & i2) == 0) {
            int i3 = i2 & 7;
            if (i3 == 5) {
                return (i2 & -8) | 3;
            }
            if (i3 == 3) {
                return (i2 & -8) | 5;
            }
        }
        return i2;
    }

    public static String A01(AnonymousClass013 r1, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        boolean z2 = !r1.A0T();
        char c2 = 8207;
        if (z2) {
            c2 = 8206;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c2);
        sb.append(str);
        sb.append(c2);
        return sb.toString();
    }

    public static String A02(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char c2 = 8207;
        if (A0G(str)) {
            c2 = 8206;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c2);
        sb.append(str);
        sb.append(c2);
        return sb.toString();
    }

    public static void A03(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setTextDirection(3);
        } else {
            A05(view, 3);
        }
    }

    public static void A04(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setTextDirection(5);
        } else {
            A05(view, 5);
        }
    }

    public static void A05(View view, int i2) {
        Class<View> cls = View.class;
        try {
            Method declaredMethod = cls.getDeclaredMethod("setTextDirection", new Class[]{Integer.TYPE});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(view, new Object[]{Integer.valueOf(i2)});
        } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException e2) {
            Log.e(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        r1 = (android.widget.RelativeLayout) r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ac, code lost:
        r4 = (android.widget.ListView) r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00dc, code lost:
        r10 = (android.view.ViewGroup.MarginLayoutParams) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(android.view.View r14, X.AnonymousClass013 r15) {
        /*
            boolean r0 = r15.A0T()
            r0 = r0 ^ 1
            r3 = 0
            if (r0 == 0) goto L_0x002b
            boolean r0 = r14 instanceof android.widget.TimePicker
            if (r0 == 0) goto L_0x01c0
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = "accent"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x01c0
        L_0x0020:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r1 == r0) goto L_0x002a
            r0 = 23
            if (r1 != r0) goto L_0x01c0
        L_0x002a:
            return
        L_0x002b:
            boolean r0 = r14 instanceof X.AnonymousClass2TY
            if (r0 != 0) goto L_0x002a
            r0 = 2131362192(0x7f0a0190, float:1.8344158E38)
            java.lang.Object r0 = r14.getTag(r0)
            if (r0 != 0) goto L_0x002a
            boolean r0 = r14 instanceof android.widget.TimePicker
            if (r0 != 0) goto L_0x002a
            int r4 = r14.getPaddingRight()
            int r2 = r14.getPaddingTop()
            int r1 = r14.getPaddingLeft()
            int r0 = r14.getPaddingBottom()
            r14.setPadding(r4, r2, r1, r0)
            boolean r0 = r14 instanceof android.widget.TextView
            r2 = 1
            if (r0 == 0) goto L_0x0077
            boolean r0 = r14 instanceof android.widget.EditText
            if (r0 != 0) goto L_0x0077
            r7 = r14
            android.widget.TextView r7 = (android.widget.TextView) r7
            int r0 = r7.getGravity()
            int r0 = A00(r0)
            r7.setGravity(r0)
            android.graphics.drawable.Drawable[] r6 = r7.getCompoundDrawables()
            r0 = 2
            r5 = r6[r0]
            r4 = r6[r2]
            r1 = r6[r3]
            r0 = 3
            r0 = r6[r0]
            r7.setCompoundDrawables(r5, r4, r1, r0)
        L_0x0077:
            boolean r0 = r14 instanceof android.widget.RelativeLayout
            if (r0 == 0) goto L_0x008b
            r1 = r14
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            int r0 = r1.getGravity()
            if (r0 == 0) goto L_0x008b
            int r0 = A00(r0)
            r1.setGravity(r0)
        L_0x008b:
            boolean r0 = r14 instanceof android.widget.LinearLayout
            if (r0 == 0) goto L_0x00a8
            r4 = r14
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0197
            int r0 = r4.getGravity()
        L_0x009c:
            if (r0 == 0) goto L_0x00a5
            int r0 = A00(r0)
            r4.setGravity(r0)
        L_0x00a5:
            A0E(r4, r15)
        L_0x00a8:
            boolean r0 = r14 instanceof android.widget.ListView
            if (r0 == 0) goto L_0x00c0
            r4 = r14
            android.widget.ListView r4 = (android.widget.ListView) r4
            android.graphics.drawable.Drawable r1 = r4.getDivider()
            if (r1 == 0) goto L_0x00c0
            X.25m r0 = new X.25m
            r0.<init>(r1, r15)
            r4.setDivider(r0)
            com.obwhatsapp.yo.yo.hideDiv(r4)
        L_0x00c0:
            boolean r0 = r14 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x01ae
            r8 = r14
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            int r7 = r8.getChildCount()
            r6 = 0
        L_0x00cc:
            if (r6 >= r7) goto L_0x01ae
            android.view.View r5 = r8.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            boolean r0 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            r9 = 17
            if (r0 == 0) goto L_0x010f
            r10 = r4
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            int r12 = r10.leftMargin
            int r11 = r10.rightMargin
            if (r12 == r11) goto L_0x010f
            int r1 = r10.topMargin
            int r0 = r10.bottomMargin
            r10.setMargins(r11, r1, r12, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r9) goto L_0x010f
            java.lang.Class<android.view.ViewGroup$MarginLayoutParams> r11 = android.view.ViewGroup.MarginLayoutParams.class
            java.lang.String r0 = "startMargin"
            java.lang.reflect.Field r1 = r11.getDeclaredField(r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x010f }
            r1.setAccessible(r2)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x010f }
            int r0 = r10.leftMargin     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x010f }
            r1.setInt(r10, r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x010f }
            java.lang.String r0 = "endMargin"
            java.lang.reflect.Field r1 = r11.getDeclaredField(r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x010f }
            r1.setAccessible(r2)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x010f }
            int r0 = r10.rightMargin     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x010f }
            r1.setInt(r10, r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x010f }
        L_0x010f:
            boolean r0 = r4 instanceof android.widget.RelativeLayout.LayoutParams
            if (r0 == 0) goto L_0x013a
            r12 = r4
            android.widget.RelativeLayout$LayoutParams r12 = (android.widget.RelativeLayout.LayoutParams) r12
            int[] r13 = r12.getRules()
            r1 = r13[r3]
            r0 = r13[r2]
            r13[r2] = r1
            r13[r3] = r0
            r11 = 5
            r10 = r13[r11]
            r1 = 7
            r0 = r13[r1]
            r12.addRule(r11, r0)
            r12.addRule(r1, r10)
            r11 = 9
            r10 = r13[r11]
            r1 = 11
            r0 = r13[r1]
            r13[r11] = r0
            r13[r1] = r10
        L_0x013a:
            boolean r0 = r4 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L_0x0149
            r1 = r4
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r1.gravity
            int r0 = A00(r0)
            r1.gravity = r0
        L_0x0149:
            boolean r0 = r4 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x0158
            r1 = r4
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r0 = r1.gravity
            int r0 = A00(r0)
            r1.gravity = r0
        L_0x0158:
            boolean r0 = r4 instanceof X.AnonymousClass06X
            if (r0 == 0) goto L_0x0190
            X.06X r4 = (X.AnonymousClass06X) r4
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r9) goto L_0x0172
            boolean r0 = r5 instanceof androidx.constraintlayout.widget.Guideline
            if (r0 == 0) goto L_0x0172
            int r0 = r4.A0b
            if (r0 != r2) goto L_0x0172
            int r1 = r4.A0Q
            int r0 = r4.A0R
            r4.A0Q = r0
            r4.A0R = r1
        L_0x0172:
            float r1 = r4.A02
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            float r0 = java.lang.Math.abs(r1)
            r4.A02 = r0
            int r1 = r4.A0T
            int r0 = r4.A0l
            r4.A0T = r0
            r4.A0l = r1
            int r1 = r4.A0U
            int r0 = r4.A0k
            r4.A0U = r0
            r4.A0k = r1
            r5.setLayoutParams(r4)
        L_0x0190:
            A06(r5, r15)
            int r6 = r6 + 1
            goto L_0x00cc
        L_0x0197:
            java.lang.Class<android.widget.LinearLayout> r1 = android.widget.LinearLayout.class
            java.lang.String r0 = "mGravity"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x00a5 }
            r0.setAccessible(r2)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x00a5 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x00a5 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x00a5 }
            int r0 = r0.intValue()     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x00a5 }
            goto L_0x009c
        L_0x01ae:
            boolean r0 = r14 instanceof androidx.constraintlayout.widget.Barrier
            if (r0 == 0) goto L_0x002a
            androidx.constraintlayout.widget.Barrier r14 = (androidx.constraintlayout.widget.Barrier) r14
            int r0 = r14.A00
            if (r0 != 0) goto L_0x01bb
            r14.A00 = r2
            return
        L_0x01bb:
            if (r0 != r2) goto L_0x002a
            r14.A00 = r3
            return
        L_0x01c0:
            X.C004601z.A0f(r14, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45902Bo.A06(android.view.View, X.013):void");
    }

    public static void A07(View view, AnonymousClass013 r9, int i2, int i3) {
        View view2 = view;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i4 = i2;
        int i5 = i3;
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(i2);
            marginLayoutParams.setMarginEnd(i3);
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        A09(view2, r9, i4, marginLayoutParams.topMargin, i5, marginLayoutParams.bottomMargin);
    }

    public static void A08(View view, AnonymousClass013 r6, int i2, int i3) {
        A0A(view, r6, i2, view.getPaddingTop(), i3, view.getPaddingBottom());
    }

    public static void A09(View view, AnonymousClass013 r5, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!r5.A0T()) {
            marginLayoutParams.setMargins(i2, i3, i4, i5);
        } else {
            marginLayoutParams.setMargins(i4, i3, i2, i5);
        }
        if (Build.VERSION.SDK_INT < 17) {
            Class<ViewGroup.MarginLayoutParams> cls = ViewGroup.MarginLayoutParams.class;
            try {
                Field declaredField = cls.getDeclaredField("startMargin");
                declaredField.setAccessible(true);
                declaredField.setInt(marginLayoutParams, i2);
                Field declaredField2 = cls.getDeclaredField("endMargin");
                declaredField2.setAccessible(true);
                declaredField2.setInt(marginLayoutParams, i4);
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused) {
            }
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public static void A0A(View view, AnonymousClass013 r3, int i2, int i3, int i4, int i5) {
        int i6 = i2;
        if (r3.A0T()) {
            i6 = i4;
        }
        if (!r3.A0T()) {
            i2 = i4;
        }
        view.setPadding(i6, i3, i2, i5);
    }

    public static void A0B(Window window, AnonymousClass013 r3) {
        if (A01) {
            View decorView = window.getDecorView();
            int i2 = 0;
            if (r3.A0T()) {
                i2 = 1;
            }
            decorView.setLayoutDirection(i2);
        }
    }

    public static void A0C(EditText editText, AnonymousClass013 r5) {
        int paddingLeft;
        int paddingTop;
        int dimensionPixelSize;
        if (r5.A0T()) {
            paddingLeft = editText.getResources().getDimensionPixelSize(R.dimen.dimen02af);
            paddingTop = editText.getPaddingTop();
            dimensionPixelSize = editText.getPaddingRight();
        } else {
            paddingLeft = editText.getPaddingLeft();
            paddingTop = editText.getPaddingTop();
            dimensionPixelSize = editText.getResources().getDimensionPixelSize(R.dimen.dimen02af);
        }
        editText.setPadding(paddingLeft, paddingTop, dimensionPixelSize, editText.getPaddingBottom());
    }

    public static void A0D(HorizontalScrollView horizontalScrollView, AnonymousClass013 r4) {
        if (r4.A0T()) {
            horizontalScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(horizontalScrollView, 0));
        }
    }

    public static void A0E(LinearLayout linearLayout, AnonymousClass013 r5) {
        if (r5.A0T() && linearLayout.getOrientation() == 0 && !A01) {
            int childCount = linearLayout.getChildCount();
            ArrayList arrayList = new ArrayList(childCount);
            for (int i2 = 0; i2 < childCount; i2++) {
                arrayList.add(linearLayout.getChildAt(i2));
            }
            linearLayout.removeAllViews();
            while (true) {
                childCount--;
                if (childCount >= 0) {
                    linearLayout.addView((View) arrayList.get(childCount));
                } else {
                    return;
                }
            }
        }
    }

    public static void A0F(TextView textView, AnonymousClass013 r3) {
        if (r3.A0T()) {
            textView.setCompoundDrawablesWithIntrinsicBounds(new C447725m(AnonymousClass00T.A04(textView.getContext(), R.drawable.chevron_right), r3), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.chevron_right, 0);
        }
    }

    public static boolean A0G(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            return !AnonymousClass02G.A01.AJb(charSequence, 0, charSequence.length());
        }
        Log.w("TextEmojiLabel/isTextLTR text is empty or null");
        return true;
    }
}
