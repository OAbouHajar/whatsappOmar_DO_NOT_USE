package X;

import android.app.Activity;
import android.app.Application;
import com.obwhatsapp.calling.di.ActivityModule;
import com.obwhatsapp.gallery.di.GalleryModule;
import com.obwhatsapp.gallery.di.GalleryPickerFragmentModule;
import com.whatsapp.stickers.di.StickersDependencyBridgeModule;

/* renamed from: X.2Re  reason: invalid class name */
public class AnonymousClass2Re implements AnonymousClass007 {
    public final Activity A00;
    public final AnonymousClass007 A01;
    public final Object A02 = new Object();
    public volatile Object A03;

    public AnonymousClass2Re(Activity activity) {
        this.A00 = activity;
        this.A01 = new AnonymousClass2YS((C001100m) activity);
    }

    public Object generatedComponent() {
        IllegalStateException illegalStateException;
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    Activity activity = this.A00;
                    if (!(activity.getApplication() instanceof AnonymousClass007)) {
                        if (Application.class.equals(activity.getApplication().getClass())) {
                            illegalStateException = new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
                        } else {
                            StringBuilder sb = new StringBuilder("Hilt Activity must be attached to an @AndroidEntryPoint Application. Found: ");
                            sb.append(activity.getApplication().getClass());
                            illegalStateException = new IllegalStateException(sb.toString());
                        }
                        throw illegalStateException;
                    }
                    AnonymousClass2YU r0 = (AnonymousClass2YU) ((AnonymousClass2YT) C004501y.A00(AnonymousClass2YT.class, this.A01));
                    AnonymousClass2YV r02 = new AnonymousClass2YV(r0.A03, r0.A04);
                    r02.A00 = activity;
                    this.A03 = new C49132Rg(activity, r02.A01, r02.A02, new ActivityModule(), new GalleryModule(), new GalleryPickerFragmentModule(), new StickersDependencyBridgeModule());
                }
            }
        }
        return this.A03;
    }
}
