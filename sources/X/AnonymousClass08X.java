package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.08X  reason: invalid class name */
public class AnonymousClass08X {
    public static ConcurrentHashMap A0B = new ConcurrentHashMap();
    public static ConcurrentHashMap A0C = new ConcurrentHashMap();
    public static final RectF A0D = new RectF();
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = -1.0f;
    public int A03 = 0;
    public TextPaint A04;
    public boolean A05 = false;
    public boolean A06 = false;
    public int[] A07 = new int[0];
    public final Context A08;
    public final TextView A09;
    public final C017808j A0A;

    public AnonymousClass08X(TextView textView) {
        this.A09 = textView;
        this.A08 = textView.getContext();
        int i2 = Build.VERSION.SDK_INT;
        this.A0A = i2 >= 29 ? new C017608h() : i2 >= 23 ? new C017708i() : new C017808j();
    }

    public static Object A00(Object obj, Object obj2, String str) {
        try {
            return A01(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to invoke TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e2);
            return obj2;
        }
    }

    public static Method A01(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = A0C;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e2);
            return null;
        }
    }

    public static final int[] A02(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            do {
                int i3 = iArr[i2];
                if (i3 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i3)) < 0) {
                    arrayList.add(Integer.valueOf(i3));
                }
                i2++;
            } while (i2 < length);
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i4 = 0; i4 < size; i4++) {
                    iArr2[i4] = ((Number) arrayList.get(i4)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final StaticLayout A03(Layout.Alignment alignment, CharSequence charSequence, int i2, int i3) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.A04, i2);
        StaticLayout.Builder alignment2 = obtain.setAlignment(alignment);
        TextView textView = this.A09;
        StaticLayout.Builder hyphenationFrequency = alignment2.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i3);
        try {
            this.A0A.A00(obtain, textView);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    public void A04() {
        CharSequence transformation;
        TextView textView = this.A09;
        if ((!(textView instanceof AnonymousClass014)) && this.A03 != 0) {
            if (this.A06) {
                if (textView.getMeasuredHeight() > 0 && textView.getMeasuredWidth() > 0) {
                    int measuredWidth = this.A0A.A01(textView) ? AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START : (textView.getMeasuredWidth() - textView.getTotalPaddingLeft()) - textView.getTotalPaddingRight();
                    int height = (textView.getHeight() - textView.getCompoundPaddingBottom()) - textView.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = A0D;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            int length = this.A07.length;
                            if (length != 0) {
                                int i2 = length - 1;
                                int i3 = 1;
                                int i4 = 0;
                                while (i3 <= i2) {
                                    int i5 = (i3 + i2) >> 1;
                                    int i6 = this.A07[i5];
                                    CharSequence text = textView.getText();
                                    TransformationMethod transformationMethod = textView.getTransformationMethod();
                                    if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null)) {
                                        text = transformation;
                                    }
                                    int maxLines = textView.getMaxLines();
                                    TextPaint textPaint = this.A04;
                                    if (textPaint == null) {
                                        this.A04 = new TextPaint();
                                    } else {
                                        textPaint.reset();
                                    }
                                    this.A04.set(textView.getPaint());
                                    this.A04.setTextSize((float) i6);
                                    Layout.Alignment alignment = (Layout.Alignment) A00(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment");
                                    int round = Math.round(rectF.right);
                                    StaticLayout A032 = Build.VERSION.SDK_INT >= 23 ? A03(alignment, text, round, maxLines) : new StaticLayout(text, this.A04, round, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
                                    if (maxLines != -1) {
                                        if (A032.getLineCount() <= maxLines) {
                                            if (A032.getLineEnd(A032.getLineCount() - 1) != text.length()) {
                                            }
                                        }
                                        i4 = i5 - 1;
                                        i2 = i4;
                                    }
                                    if (((float) A032.getHeight()) <= rectF.bottom) {
                                        i4 = i3;
                                        i3 = i5 + 1;
                                    }
                                    i4 = i5 - 1;
                                    i2 = i4;
                                }
                                float f2 = (float) this.A07[i4];
                                if (f2 != textView.getTextSize()) {
                                    A06(0, f2);
                                }
                            } else {
                                throw new IllegalStateException("No available text sizes to choose from.");
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.A06 = true;
        }
    }

    public final void A05(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            StringBuilder sb = new StringBuilder("Minimum auto-size text size (");
            sb.append(f2);
            sb.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb.toString());
        } else if (f3 <= f2) {
            StringBuilder sb2 = new StringBuilder("Maximum auto-size text size (");
            sb2.append(f3);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(f2);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f4 > 0.0f) {
            this.A03 = 1;
            this.A01 = f2;
            this.A00 = f3;
            this.A02 = f4;
            this.A05 = false;
        } else {
            StringBuilder sb3 = new StringBuilder("The auto-size step granularity (");
            sb3.append(f4);
            sb3.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public void A06(int i2, float f2) {
        Context context = this.A08;
        float applyDimension = TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.A09;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? textView.isInLayout() : false;
            if (textView.getLayout() != null) {
                this.A06 = false;
                try {
                    Method A012 = A01("nullLayouts");
                    if (A012 != null) {
                        A012.invoke(textView, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!isInLayout) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean A07() {
        if (!(!(this.A09 instanceof AnonymousClass014)) || this.A03 != 1) {
            this.A06 = false;
            return false;
        }
        if (!this.A05 || this.A07.length == 0) {
            float f2 = this.A00;
            float f3 = this.A01;
            float f4 = this.A02;
            int floor = ((int) Math.floor((double) ((f2 - f3) / f4))) + 1;
            int[] iArr = new int[floor];
            for (int i2 = 0; i2 < floor; i2++) {
                iArr[i2] = Math.round((((float) i2) * f4) + f3);
            }
            this.A07 = A02(iArr);
        }
        this.A06 = true;
        return true;
    }

    public final boolean A08() {
        int[] iArr = this.A07;
        int length = iArr.length;
        boolean z2 = false;
        if (length > 0) {
            z2 = true;
        }
        this.A05 = z2;
        if (z2) {
            this.A03 = 1;
            this.A01 = (float) iArr[0];
            this.A00 = (float) iArr[length - 1];
            this.A02 = -1.0f;
        }
        return z2;
    }
}
