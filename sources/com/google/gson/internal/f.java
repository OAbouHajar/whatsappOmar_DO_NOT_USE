package com.google.gson.internal;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.youbasha.ui.YoSettings.Themes;
import com.obwhatsapp.youbasha.ui.themeserver.SingleItemView;
import com.squareup.picasso.Callback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import q.d;

/* compiled from: XFMFile */
public final class f implements ObjectConstructor, Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f398a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f399b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f400c;

    /* renamed from: d  reason: collision with root package name */
    public Object f401d;

    public f(Context context) {
        this.f398a = 2;
        this.f399b = Themes.newFMThemes_folder;
        this.f400c = context;
    }

    public f(ConstructorConstructor constructorConstructor, Class cls) {
        this.f398a = 0;
        this.f401d = constructorConstructor;
        this.f400c = cls;
        this.f399b = UnsafeAllocator.create();
    }

    public f(Class cls, String str, Class[] clsArr) {
        this.f398a = 5;
        this.f400c = cls;
        this.f399b = str;
        this.f401d = clsArr;
    }

    public /* synthetic */ f(Object obj, ImageView imageView, String str, int i2) {
        this.f398a = i2;
        this.f401d = obj;
        this.f399b = imageView;
        this.f400c = str;
    }

    public f(Method method, Method method2, Method method3) {
        this.f398a = 4;
        this.f399b = method;
        this.f400c = method2;
        this.f401d = method3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if ((r4.getModifiers() & 1) == 0) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method a(java.lang.Class r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f399b
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            if (r0 == 0) goto L_0x0030
            java.lang.Object r2 = r3.f401d
            java.lang.Class[] r2 = (java.lang.Class[]) r2
            java.lang.reflect.Method r4 = r4.getMethod(r0, r2)     // Catch:{ NoSuchMethodException -> 0x001a }
            int r0 = r4.getModifiers()     // Catch:{ NoSuchMethodException -> 0x0018 }
            r0 = r0 & 1
            if (r0 != 0) goto L_0x001c
            goto L_0x001b
        L_0x0018:
            goto L_0x001c
        L_0x001a:
        L_0x001b:
            r4 = r1
        L_0x001c:
            if (r4 == 0) goto L_0x002f
            java.lang.Object r0 = r3.f400c
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L_0x002f
            java.lang.Class r2 = r4.getReturnType()
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r1 = r4
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.f.a(java.lang.Class):java.lang.reflect.Method");
    }

    public final Object b(Object obj, Object... objArr) {
        Method a2 = a(obj.getClass());
        if (a2 != null) {
            try {
                return a2.invoke(obj, objArr);
            } catch (IllegalAccessException e2) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a2);
                assertionError.initCause(e2);
                throw assertionError;
            }
        } else {
            throw new AssertionError("Method " + ((String) this.f399b) + " not supported for object " + obj);
        }
    }

    public final void c(Object obj, Object... objArr) {
        try {
            Method a2 = a(obj.getClass());
            if (a2 != null) {
                try {
                    a2.invoke(obj, objArr);
                } catch (IllegalAccessException unused) {
                }
            }
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final Object construct() {
        Object obj = this.f400c;
        try {
            return ((UnsafeAllocator) this.f399b).newInstance((Class) obj);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to create instance of " + ((Class) obj) + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e2);
        }
    }

    public final void onError(Exception exc) {
        switch (this.f398a) {
            case 1:
                return;
            default:
                if (exc.getMessage().equals("HTTP 404")) {
                    ((ImageView) this.f399b).setOnClickListener((View.OnClickListener) null);
                    return;
                }
                return;
        }
    }

    public final void onSuccess() {
        int i2 = this.f398a;
        Object obj = this.f400c;
        Object obj2 = this.f399b;
        switch (i2) {
            case 1:
                ((SingleItemView) this.f401d).f1342a.b((String) obj, ((BitmapDrawable) ((ImageView) obj2).getDrawable()).getBitmap());
                return;
            default:
                ((d) this.f401d).f2398d.b((String) obj, ((BitmapDrawable) ((ImageView) obj2).getDrawable()).getBitmap());
                return;
        }
    }
}
