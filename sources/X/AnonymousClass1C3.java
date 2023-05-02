package X;

import android.os.Build;
import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.1C3  reason: invalid class name */
public class AnonymousClass1C3 implements AnonymousClass1C4 {
    public static volatile AnonymousClass1C3 A02;
    public String A00 = null;
    public Method A01 = null;

    public static AnonymousClass1C3 A00() {
        if (A02 == null) {
            synchronized (AnonymousClass1C4.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass1C3();
                }
            }
        }
        return A02;
    }

    public synchronized void A01(String str, boolean z2) {
        Class<String> cls = String.class;
        Method method = null;
        if (Build.VERSION.SDK_INT < 23 && z2) {
            try {
                Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", new Class[]{cls, ClassLoader.class, cls});
                declaredMethod.setAccessible(true);
                method = declaredMethod;
            } catch (NoSuchMethodException | SecurityException e2) {
                Log.w("robustsofileloader/get-native-load-runtime-method: Could not get nativeLoad method", e2);
            }
        }
        this.A01 = method;
        this.A00 = str;
    }

    public synchronized void AKC(String str, int i2) {
        Method method = this.A01;
        if (method == null) {
            System.load(str);
        } else {
            try {
                boolean z2 = false;
                if (this.A00 != null) {
                    z2 = true;
                }
                AnonymousClass00B.A0G(z2);
                String str2 = (String) method.invoke(Runtime.getRuntime(), new Object[]{str, AnonymousClass1C3.class.getClassLoader(), this.A00});
                if (str2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("robustsofileloader/load: nativeLoad returned error ");
                    sb.append(str2);
                    throw new UnsatisfiedLinkError(sb.toString());
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("robustsofileloader/load: Cannot load ");
                sb2.append(str);
                String obj = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("robustsofileloader/load: Error when loading lib: ");
                sb3.append(obj);
                Log.e(sb3.toString(), e2);
                throw new UnsatisfiedLinkError(obj);
            }
        }
    }

    public void AKE(C31121dV r1, String str, int i2) {
    }
}
