package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.2iD  reason: invalid class name and case insensitive filesystem */
public class C54772iD {
    public static AnonymousClass2Qt A00(Context context, int i2) {
        Class<?> loadClass;
        try {
            ClassLoader classLoader = C54772iD.class.getClassLoader();
            if (classLoader == null || (loadClass = classLoader.loadClass("com.obwhatsapp.camera.litecamera.LiteCameraView")) == null) {
                return null;
            }
            return (AnonymousClass2Qt) loadClass.getConstructor(new Class[]{Context.class, Integer.TYPE}).newInstance(new Object[]{context, Integer.valueOf(i2)});
        } catch (Exception e2) {
            Log.e("LiteCamera is not available", e2);
            return null;
        }
    }
}
