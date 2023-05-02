package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: X.1UP  reason: invalid class name */
public class AnonymousClass1UP {
    public static Typeface A00;
    public static Typeface A01;
    public static Boolean A02;

    public static int A00(Context context) {
        float f2 = context.getResources().getDisplayMetrics().density;
        float f3 = 2.0f;
        if (((float) context.getResources().getDisplayMetrics().widthPixels) / f2 >= 360.0f) {
            f3 = 7.0f;
        }
        return Math.round(f3 * f2);
    }

    public static int A01(Context context) {
        return (int) (context.getResources().getDisplayMetrics().density * 83.333336f);
    }

    public static int A02(Context context, WindowManager windowManager) {
        int i2;
        DisplayMetrics displayMetrics;
        if (Build.VERSION.SDK_INT < 30) {
            displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            i2 = displayMetrics.densityDpi;
        } else {
            i2 = context.getResources().getConfiguration().densityDpi;
            displayMetrics = context.getResources().getDisplayMetrics();
        }
        float f2 = displayMetrics.density;
        if (i2 >= 320) {
            return (int) (f2 * 25.0f);
        }
        if (i2 < 240) {
            return i2 >= 160 ? 25 : 19;
        }
        return 38;
    }

    public static Typeface A03(Context context) {
        Typeface typeface = A01;
        if (typeface == null) {
            typeface = Build.VERSION.SDK_INT >= 21 ? Typeface.create("sans-serif-medium", 0) : Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Medium.ttf");
            A01 = typeface;
        }
        return typeface;
    }

    public static void A04() {
        boolean z2 = true;
        if (Build.VERSION.SDK_INT < 21) {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(20.0f);
            Typeface typeface = Typeface.DEFAULT;
            if (textPaint.measureText("ABCabc123") != 105.0f) {
                z2 = false;
            }
        }
        A02 = Boolean.valueOf(z2);
    }

    public static void A05(EditText editText) {
        float f2 = editText.getContext().getResources().getDisplayMetrics().density;
        int i2 = 6;
        if (f2 < 1.5f) {
            i2 = 4;
            if (f2 >= 1.0f) {
                i2 = 5;
            }
        }
        editText.setMaxLines(i2);
    }

    public static void A06(TextView textView) {
        if (A02 == null) {
            A04();
        }
        if (A02.booleanValue()) {
            Typeface A03 = A03(textView.getContext());
            return;
        }
        boolean z2 = true;
        if (A00 == null) {
            A00 = Typeface.create(Typeface.DEFAULT, 1);
        }
        TextPaint paint = textView.getPaint();
        if ((A00.getStyle() & 1) != 0) {
            z2 = false;
        }
        paint.setFakeBoldText(z2);
    }
}
