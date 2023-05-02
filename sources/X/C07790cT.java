package X;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0cT  reason: invalid class name and case insensitive filesystem */
public class C07790cT implements C13060lP {
    public static Class A01;
    public static Method A02;
    public static Method A03;
    public static boolean A04;
    public static boolean A05;
    public static boolean A06;
    public final View A00;

    public C07790cT(View view) {
        this.A00 = view;
    }

    public static C13060lP A00(Matrix matrix, View view, ViewGroup viewGroup) {
        if (!A04) {
            try {
                A01();
                Class cls = A01;
                Class[] clsArr = new Class[3];
                clsArr[0] = View.class;
                clsArr[1] = ViewGroup.class;
                Method A0t = AnonymousClass000.A0t(cls, Matrix.class, "addGhost", clsArr, 2);
                A02 = A0t;
                A0t.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e2);
            }
            A04 = true;
        }
        Method method = A02;
        if (method != null) {
            try {
                Object[] objArr = new Object[3];
                AnonymousClass000.A1E(view, viewGroup, objArr);
                objArr[2] = matrix;
                return new C07790cT((View) method.invoke((Object) null, objArr));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
        return null;
    }

    public static void A01() {
        if (!A05) {
            try {
                A01 = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException e2) {
                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e2);
            }
            A05 = true;
        }
    }

    public static void A02(View view) {
        if (!A06) {
            try {
                A01();
                Method A0t = AnonymousClass000.A0t(A01, View.class, "removeGhost", new Class[1], 0);
                A03 = A0t;
                A0t.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e2);
            }
            A06 = true;
        }
        Method method = A03;
        if (method != null) {
            try {
                method.invoke((Object) null, new Object[]{view});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    public void AcN(View view, ViewGroup viewGroup) {
    }

    public void setVisibility(int i2) {
        this.A00.setVisibility(i2);
    }
}
