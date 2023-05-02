package com.mod.tools.control;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;

public final class Global {
    private static Context sContext;

    static class BackgroundHandlerHolder {
        static final Handler INSTANCE = ThreadUtils.newThread(Class.forName("com.hazarobwhatsapp.obwhatsappsekmeler.hazar.tools.control.Global").getSimpleName(), (Handler.Callback) null);

        static {
            try {
            } catch (ClassNotFoundException e2) {
                throw new NoClassDefFoundError(e2.getMessage());
            }
        }
    }

    static class CurrentApplicationHolder {
        static final Application INSTANCE;

        static {
            try {
                INSTANCE = (Application) ObjectUtils.cast(ReflectUtils.invokeStaticMethod(ReflectUtils.getMethod(Class.forName("android.app.ActivityThread"), "currentApplication", new Class[0]), new Object[0]));
            } catch (Throwable th) {
                throw new AssertionError(th);
            }
        }
    }

    static class UiHandlerHolder {
        static final Handler INSTANCE = new Handler(Looper.getMainLooper());
    }

    Global() {
    }

    public static Handler getBackgroundHandler() {
        return BackgroundHandlerHolder.INSTANCE;
    }

    public static Context getContext() {
        if (sContext == null) {
            sContext = CurrentApplicationHolder.INSTANCE;
        }
        return (Context) ObjectUtils.notNull(sContext);
    }

    public static Resources getResources() {
        return (Resources) ObjectUtils.notNull(getContext().getResources());
    }

    public static Handler getUiHandler() {
        return UiHandlerHolder.INSTANCE;
    }

    public static void setContext(Context context) {
        sContext = context;
    }
}
