package X;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.0F7  reason: invalid class name */
public class AnonymousClass0F7 extends C014206u {
    public static AnonymousClass0F7 A01;
    public static final C014406w A02 = new C07500bw();
    public final Application A00;

    public AnonymousClass0F7() {
        this.A00 = null;
    }

    public AnonymousClass0F7(Application application) {
        this.A00 = application;
    }

    public final C003401n A00(Application application, Class cls) {
        if (!AnonymousClass02H.class.isAssignableFrom(cls)) {
            return super.A6s(cls);
        }
        try {
            C003401n r0 = (C003401n) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
            C18450wi.A09(r0);
            return r0;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(AnonymousClass000.A0f(cls, AnonymousClass000.A0q("Cannot create an instance of ")), e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(AnonymousClass000.A0f(cls, AnonymousClass000.A0q("Cannot create an instance of ")), e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException(AnonymousClass000.A0f(cls, AnonymousClass000.A0q("Cannot create an instance of ")), e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(AnonymousClass000.A0f(cls, AnonymousClass000.A0q("Cannot create an instance of ")), e5);
        }
    }

    public C003401n A6s(Class cls) {
        C18450wi.A0H(cls, 0);
        Application application = this.A00;
        if (application != null) {
            return A00(application, cls);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public C003401n A73(C013806q r2, Class cls) {
        C18450wi.A0H(cls, 0);
        C18450wi.A0H(r2, 1);
        if (this.A00 != null) {
            return A6s(cls);
        }
        Application application = (Application) r2.A00(A02);
        if (application != null) {
            return A00(application, cls);
        }
        if (!AnonymousClass02H.class.isAssignableFrom(cls)) {
            return super.A6s(cls);
        }
        throw AnonymousClass000.A0T("CreationExtras must have an application by `APPLICATION_KEY`");
    }
}
