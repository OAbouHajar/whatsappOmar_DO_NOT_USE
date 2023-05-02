package com.mod.ColorTools;

import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.C14550pN;
import android.app.Activity;
import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;

public class Tools {
    private static Context mContext;
    private static DisplayMetrics mDisplayMetrics = null;

    static class CurrentApplicationHolder {
        static final Application INSTANCE;

        static {
            try {
                INSTANCE = (Application) Tools.cast(Tools.invokeStaticMethod(Tools.getMethod(Class.forName("android.app.ActivityThread"), "currentApplication", new Class[0]), new Object[0]));
            } catch (Throwable th) {
                throw new AssertionError(th);
            }
        }

        CurrentApplicationHolder() {
        }
    }

    private Tools() {
    }

    public static String CHECK(String str) {
        return str + "_check";
    }

    public static String ENDCOLOR(String str) {
        if (!Prefs.getBoolean(ISGRADIENT(str))) {
            return str;
        }
        return str + "_GC";
    }

    public static boolean ISDEBUG() {
        return true;
    }

    public static String ISGRADIENT(String str) {
        return str + "_Gactive";
    }

    public static boolean ISTESTMODE() {
        return getContext().getPackageName().equals("id.nusantara");
    }

    public static String ORIENTATION(String str) {
        return str + "_GOrient";
    }

    public static void addFragment(C14550pN r4, Fragment fragment, int i2) {
        AnonymousClass02C AGM = r4.AGM();
        if (AGM != null) {
            AnonymousClass050 r2 = new AnonymousClass050(AGM);
            r2.A0E(fragment, (String) null, i2);
            r2.A02();
            return;
        }
        throw null;
    }

    public static String capitizeString(String str) {
        if (str.trim().equals("")) {
            return "";
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static <T> T cast(Object obj) {
        return obj;
    }

    public static Drawable colorDrawable(int i2, int i3, PorterDuff.Mode mode) {
        Drawable drawable = getContext().getResources().getDrawable(i2);
        drawable.setColorFilter(i3, mode);
        return drawable;
    }

    public static Drawable colorDrawable(String str, int i2, PorterDuff.Mode mode) {
        Drawable drawable = getDrawable(str);
        drawable.setColorFilter(i2, mode);
        return drawable;
    }

    public static void copyLog(String str) {
        if (ISDEBUG()) {
            copyText(str);
        }
    }

    public static void copyText(String str) {
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Text", str));
            showToast("Copied to clipboard");
        }
    }

    public static int dpToPx(float f2) {
        return Math.round(f2 * getContext().getResources().getDisplayMetrics().density);
    }

    public static int dpToPx(Context context, float f2) {
        return Math.round(f2 * context.getResources().getDisplayMetrics().density);
    }

    public static <V extends View> Collection<V> findChildrenByClass(ViewGroup viewGroup, Class<V> cls) {
        return gatherChildrenByClass(viewGroup, cls, new ArrayList());
    }

    private static <V extends View> Collection<V> gatherChildrenByClass(ViewGroup viewGroup, Class<V> cls, Collection<V> collection) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (cls.isAssignableFrom(childAt.getClass())) {
                collection.add(childAt);
            }
            if (childAt instanceof ViewGroup) {
                gatherChildrenByClass((ViewGroup) childAt, cls, collection);
            }
        }
        return collection;
    }

    public static Activity getActivity(Fragment fragment) {
        return fragment.A0C();
    }

    public static int getColor(String str) {
        return getContext().getResources().getColor(intColor(str));
    }

    public static Context getContext() {
        if (mContext == null) {
            mContext = CurrentApplicationHolder.INSTANCE;
        }
        return (Context) notNull(mContext);
    }

    public static String getDefaultPrefName(boolean z2) {
        if (!z2) {
            return "com.obwhatsapp_preferences";
        }
        return "com.obwhatsapp_preferences" + "_light";
    }

    private static DisplayMetrics getDisplayMetrics(Context context) {
        if (mDisplayMetrics == null) {
            mDisplayMetrics = context.getResources().getDisplayMetrics();
        }
        return mDisplayMetrics;
    }

    public static Drawable getDrawable(String str) {
        return getContext().getResources().getDrawable(intDrawable(str));
    }

    public static float getFloat(float f2, float f3, float f4) {
        return Math.min(f4, Math.max(f3, f2));
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Class<?> cls2 = cls;
        while (cls2 != null) {
            try {
                return cls2.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException e2) {
                cls2 = cls2.getSuperclass();
            }
        }
        return null;
    }

    public static String getPrefName(boolean z2) {
        return z2 ? "WhatsAppriv" : "OBWhatsApp";
    }

    public static int getResource(String str, String str2) {
        return getContext().getResources().getIdentifier(str, str2, getContext().getPackageName());
    }

    public static Point getScreenSize(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return point;
    }

    public static String getString(String str) {
        return getContext().getString(intString(str));
    }

    public static int getViewHeight(View view) {
        int i2;
        Display defaultDisplay = ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 13) {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i2 = point.x;
        } else {
            i2 = defaultDisplay.getWidth();
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public static int intAnim(String str) {
        return getResource(str, "anim");
    }

    public static int intAttr(String str) {
        return getResource(str, "attr");
    }

    public static int intColor(String str) {
        return getResource(str, "color");
    }

    public static int intDimen(String str) {
        return getResource(str, "dimen");
    }

    public static int intDrawable(String str) {
        return getResource(str, "drawable");
    }

    public static int intId(String str) {
        return getResource(str, "id");
    }

    public static int intLayout(String str) {
        return getResource(str, "layout");
    }

    public static int intString(String str) {
        return getResource(str, "string");
    }

    public static int intStyle(String str) {
        return getResource(str, "style");
    }

    public static int intStyleable(String str) {
        return getResource(str, "styleable");
    }

    public static int intXml(String str) {
        return getResource(str, "xml");
    }

    public static Object invokeMethod(Method method, Object obj, Object... objArr) {
        try {
            method.setAccessible(true);
            return method.invoke(obj, objArr);
        } catch (Throwable th) {
            return null;
        }
    }

    public static Object invokeStaticMethod(Method method, Object... objArr) {
        return invokeMethod(method, (Object) null, objArr);
    }

    public static boolean isRtl(Resources resources) {
        return resources.getConfiguration().getLayoutDirection() == 1;
    }

    public static <T> T notNull(T t2) {
        if (t2 != null) {
            return t2;
        }
        throw null;
    }

    public static int px2dp(Context context, float f2) {
        return (int) ((f2 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void setContext(Context context) {
        mContext = context;
    }

    public static Bitmap setGradientBackground(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (float) height, -994734, -1019131, Shader.TileMode.CLAMP));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawRect(0.0f, 0.0f, (float) width, (float) height, paint);
        return createBitmap;
    }

    public static void setImageView(ImageView imageView, int i2) {
        Picasso.get().load(i2).into(imageView);
    }

    public static void setImageView(ImageView imageView, File file) {
        Picasso.get().load(file).into(imageView);
    }

    public static void setupGridView(Context context, RecyclerView recyclerView, int i2) {
        recyclerView.setLayoutManager(new GridLayoutManager(i2));
    }

    public static void setupRecyclerView(Context context, RecyclerView recyclerView, int i2) {
        recyclerView.setLayoutManager(new LinearLayoutManager(i2));
    }

    public static void showToast(int i2) {
        Toast.makeText(getContext(), String.valueOf(i2), 0).show();
    }

    public static void showToast(String str) {
        Toast.makeText(getContext(), str, 0).show();
    }

    public static int spToPx(Context context, float f2) {
        return (int) TypedValue.applyDimension(2, f2, getDisplayMetrics(context));
    }

    public static int toScreenPixels(Resources resources, float f2) {
        return (int) TypedValue.applyDimension(2, f2, resources.getDisplayMetrics());
    }

    public static String trimFront(String str) {
        if (str == null) {
            return str;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (!Character.isWhitespace(str.charAt(i2))) {
                return str.substring(i2);
            }
        }
        return "";
    }
}
