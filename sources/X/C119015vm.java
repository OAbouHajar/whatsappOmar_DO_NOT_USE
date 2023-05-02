package X;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.5vm  reason: invalid class name and case insensitive filesystem */
public class C119015vm {
    public static boolean A00() {
        try {
            Boolean bool = (Boolean) Class.forName("com.facebook.endtoend.EndToEnd").getMethod("isRunningEndToEndTest", new Class[0]).invoke((Object) null, new Object[0]);
            boolean exists = new File("/sdcard/e2e/media/fineYoungGentleman.jpg").exists();
            C06410Vr.A00(bool, "is e2e test: %s");
            C06410Vr.A00(Boolean.valueOf(exists), "static frame file exists: %s");
            return bool != null && bool.booleanValue() && exists;
        } catch (ClassNotFoundException | IllegalAccessException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException | InvocationTargetException e2) {
            Log.i("OpticE2EConfig", "Failed to access test", e2);
            return false;
        }
    }

    public static byte[] A01() {
        try {
            File file = new File("/sdcard/e2e/media/fineYoungGentleman.jpg");
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[((int) file.length())];
            fileInputStream.read(bArr);
            return bArr;
        } catch (IOException e2) {
            throw C110115dX.A0Z(e2);
        }
    }
}
