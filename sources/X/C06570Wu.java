package X;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: X.0Wu  reason: invalid class name and case insensitive filesystem */
public class C06570Wu {
    public static Class A00;
    public static Field A01;
    public static Field A02;
    public static Field A03;
    public static boolean A04;
    public static boolean A05;
    public static boolean A06;
    public static boolean A07;

    public static void A00(Resources resources) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return;
        }
        if (i2 >= 24) {
            A03(resources);
        } else if (i2 >= 23) {
            A02(resources);
        } else if (i2 >= 21) {
            A01(resources);
        }
    }

    public static void A01(Resources resources) {
        if (!A04) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                A01 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            A04 = true;
        }
        Field field = A01;
        if (field != null) {
            try {
                Map map = (Map) field.get(resources);
                if (map != null) {
                    map.clear();
                }
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
        }
    }

    public static void A02(Resources resources) {
        if (!A04) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                A01 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            A04 = true;
        }
        Field field = A01;
        if (field != null) {
            try {
                Object obj = field.get(resources);
                if (obj != null) {
                    A04(obj);
                }
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
        }
    }

    public static void A03(Resources resources) {
        String str;
        if (!A05) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                A02 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            A05 = true;
        }
        Field field = A02;
        if (field != null) {
            try {
                Object obj = field.get(resources);
                if (obj != null) {
                    if (!A04) {
                        try {
                            Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                            A01 = declaredField2;
                            declaredField2.setAccessible(true);
                        } catch (NoSuchFieldException e3) {
                            Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                        }
                        A04 = true;
                    }
                    Field field2 = A01;
                    if (field2 != null) {
                        try {
                            Object obj2 = field2.get(obj);
                            if (obj2 != null) {
                                A04(obj2);
                            }
                        } catch (IllegalAccessException e4) {
                            e = e4;
                            str = "Could not retrieve value from ResourcesImpl#mDrawableCache";
                            Log.e("ResourcesFlusher", str, e);
                        }
                    }
                }
            } catch (IllegalAccessException e5) {
                e = e5;
                str = "Could not retrieve value from Resources#mResourcesImpl";
                Log.e("ResourcesFlusher", str, e);
            }
        }
    }

    public static void A04(Object obj) {
        if (!A06) {
            try {
                A00 = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            A06 = true;
        }
        Class cls = A00;
        if (cls != null) {
            if (!A07) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    A03 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
                }
                A07 = true;
            }
            Field field = A03;
            if (field != null) {
                try {
                    LongSparseArray longSparseArray = (LongSparseArray) field.get(obj);
                    if (longSparseArray != null) {
                        longSparseArray.clear();
                    }
                } catch (IllegalAccessException e4) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
                }
            }
        }
    }
}
