package X;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import com.obwhatsapp.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0SD  reason: invalid class name */
public class AnonymousClass0SD {
    public static Field A01;
    public static Method A02;
    public static boolean A03;
    public static boolean A04;
    public float[] A00;

    public float A00(View view) {
        Number number = (Number) view.getTag(R.id.save_non_transition_alpha);
        float alpha = view.getAlpha();
        return number != null ? alpha / number.floatValue() : alpha;
    }

    public void A01(Matrix matrix, View view) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX((float) (view.getWidth() / 2));
            view.setPivotY((float) (view.getHeight() / 2));
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.A00;
        if (fArr == null) {
            fArr = new float[9];
            this.A00 = fArr;
        }
        matrix.getValues(fArr);
        float f2 = fArr[3];
        float sqrt = (float) Math.sqrt((double) (1.0f - (f2 * f2)));
        float f3 = fArr[0];
        int i2 = 1;
        if (f3 < 0.0f) {
            i2 = -1;
        }
        float f4 = sqrt * ((float) i2);
        float degrees = (float) Math.toDegrees(Math.atan2((double) f2, (double) f4));
        float f5 = fArr[2];
        float f6 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        view.setRotation(degrees);
        view.setScaleX(f3 / f4);
        view.setScaleY(fArr[4] / f4);
    }

    public void A02(Matrix matrix, View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            A02(matrix, view2);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    public void A03(Matrix matrix, View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            A03(matrix, view2);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) (-view.getLeft()), (float) (-view.getTop()));
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix A0H = AnonymousClass000.A0H();
            if (matrix2.invert(A0H)) {
                matrix.postConcat(A0H);
            }
        }
    }

    public void A04(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(R.id.save_non_transition_alpha, (Object) null);
        }
    }

    public void A05(View view) {
        if (view.getTag(R.id.save_non_transition_alpha) == null) {
            view.setTag(R.id.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    public void A06(View view, float f2) {
        Number number = (Number) view.getTag(R.id.save_non_transition_alpha);
        if (number != null) {
            view.setAlpha(number.floatValue() * f2);
        } else {
            view.setAlpha(f2);
        }
    }

    public void A07(View view, int i2) {
        if (!A04) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                A01 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            A04 = true;
        }
        Field field = A01;
        if (field != null) {
            try {
                A01.setInt(view, i2 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void A08(View view, int i2, int i3, int i4, int i5) {
        if (!A03) {
            Class<View> cls = View.class;
            try {
                Class[] clsArr = new Class[4];
                Class cls2 = Integer.TYPE;
                clsArr[0] = cls2;
                clsArr[1] = cls2;
                clsArr[2] = cls2;
                Method A0t = AnonymousClass000.A0t(cls, cls2, "setFrame", clsArr, 3);
                A02 = A0t;
                A0t.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e2);
            }
            A03 = true;
        }
        Method method = A02;
        if (method != null) {
            try {
                Object[] objArr = new Object[4];
                AnonymousClass000.A1M(objArr, i2, 0);
                AnonymousClass000.A1M(objArr, i3, 1);
                AnonymousClass000.A1M(objArr, i4, 2);
                AnonymousClass000.A1M(objArr, i5, 3);
                method.invoke(view, objArr);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }
}
