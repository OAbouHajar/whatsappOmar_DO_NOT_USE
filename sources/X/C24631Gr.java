package X;

import android.app.Application;
import android.os.Build;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;

/* renamed from: X.1Gr  reason: invalid class name and case insensitive filesystem */
public class C24631Gr {
    public boolean A00 = false;
    public final Application A01;
    public final C16300so A02;

    public C24631Gr(Application application, C16300so r3) {
        this.A02 = r3;
        this.A01 = application;
    }

    public void A00() {
        if (!this.A00 && "samsung".equalsIgnoreCase(Build.MANUFACTURER) && Build.VERSION.SDK_INT == 24) {
            try {
                Class<?> cls = Class.forName("com.samsung.android.emergencymode.SemEmergencyManager");
                Field declaredField = cls.getDeclaredField("sInstance");
                declaredField.setAccessible(true);
                Object obj = declaredField.get((Object) null);
                Field declaredField2 = cls.getDeclaredField("mContext");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, this.A01);
            } catch (Exception e2) {
                this.A00 = true;
                Log.e("SemEmergencyManagerLeakFix/apply", e2);
                this.A02.A03("leak-fix-v2", "SemEmergencyManagerLeakFix", e2);
            }
        }
    }
}
