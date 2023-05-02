package X;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.1Fc  reason: invalid class name and case insensitive filesystem */
public class C24241Fc {
    public final Application A00;
    public final C16300so A01;

    public C24241Fc(Application application, C16300so r2) {
        this.A01 = r2;
        this.A00 = application;
    }

    public void A00() {
        if (Build.VERSION.SDK_INT == 21) {
            try {
                Class.forName("android.media.session.MediaSessionLegacyHelper").getDeclaredMethod("getHelper", new Class[]{Context.class}).invoke((Object) null, new Object[]{this.A00});
            } catch (InvocationTargetException e2) {
                e = e2.getTargetException();
                Log.e("MediaSessionLegacyHelperLeakFix/applyFix", e);
                this.A01.A03("MediaSessionLegacyHelperLeakFix", e.getMessage(), e);
            } catch (Exception e3) {
                e = e3;
                Log.e("MediaSessionLegacyHelperLeakFix/applyFix", e);
                this.A01.A03("MediaSessionLegacyHelperLeakFix", e.getMessage(), e);
            }
        }
    }
}
