package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.08O  reason: invalid class name */
public class AnonymousClass08O extends ContextWrapper {
    public static ArrayList A01;
    public static final Object A02 = new Object();
    public final Resources A00;

    public AnonymousClass08O(Context context) {
        super(context);
        this.A00 = new C017208c(this, context.getResources());
    }

    public static Context A00(Context context) {
        AnonymousClass08O r1;
        if (!(context instanceof AnonymousClass08O) && !(context.getResources() instanceof C017208c)) {
            context.getResources();
            if (Build.VERSION.SDK_INT < 21) {
                synchronized (A02) {
                    ArrayList arrayList = A01;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            WeakReference weakReference = (WeakReference) arrayList.get(size);
                            if (weakReference == null || weakReference.get() == null) {
                                arrayList.remove(size);
                            }
                        }
                        int size2 = arrayList.size();
                        while (true) {
                            size2--;
                            if (size2 < 0) {
                                break;
                            }
                            WeakReference weakReference2 = (WeakReference) A01.get(size2);
                            if (weakReference2 != null && (r1 = (AnonymousClass08O) weakReference2.get()) != null && r1.getBaseContext() == context) {
                                return r1;
                            }
                        }
                    } else {
                        A01 = new ArrayList();
                    }
                    AnonymousClass08O r2 = new AnonymousClass08O(context);
                    A01.add(new WeakReference(r2));
                    return r2;
                }
            }
        }
        return context;
    }

    public AssetManager getAssets() {
        return this.A00.getAssets();
    }

    public Resources getResources() {
        return this.A00;
    }

    public Resources.Theme getTheme() {
        return super.getTheme();
    }

    public void setTheme(int i2) {
        super.setTheme(i2);
    }
}
