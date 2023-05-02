package com.google.android.gms.net;

import X.AnonymousClass2Hm;
import X.AnonymousClass3K2;
import X.AnonymousClass3K4;
import X.C13690nt;
import X.C13710nw;
import X.C47092Hl;
import X.C90414e6;
import X.C90844ev;
import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

public class PlayServicesCronetProvider extends CronetProvider {
    public static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    public static final String TAG = "PlayServicesCronet";

    public PlayServicesCronetProvider(Context context) {
        super(context);
    }

    private void tryToInstallCronetProvider() {
        String str;
        try {
            C90414e6.A00(this.mContext);
        } catch (AnonymousClass2Hm unused) {
            if (Log.isLoggable(TAG, 4)) {
                str = "Google-Play-Services-Cronet-Provider is not installed yet.";
                Log.i(TAG, str);
            }
        } catch (C47092Hl unused2) {
            if (Log.isLoggable(TAG, 4)) {
                str = "Google-Play-Services-Cronet-Provider is unavailable.";
                Log.i(TAG, str);
            }
        }
    }

    public CronetEngine.Builder createBuilder() {
        C90844ev r0;
        try {
            C90414e6.A00(this.mContext);
            try {
                synchronized (C90414e6.A03) {
                    r0 = C90414e6.A01;
                }
                C13710nw.A01(r0);
                ClassLoader classLoader = r0.A00.getClassLoader();
                C13710nw.A01(classLoader);
                Class<Context> cls = Context.class;
                return new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) AnonymousClass3K4.A0W(this.mContext, AnonymousClass3K4.A0c(classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class), cls, new Class[1], 0), new Object[1], 0));
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
                throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", e2);
            }
        } catch (AnonymousClass2Hm e3) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e3);
        } catch (C47092Hl e4) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e4);
        }
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((CronetProvider) obj).mContext));
    }

    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    public String getVersion() {
        String str;
        tryToInstallCronetProvider();
        synchronized (C90414e6.A03) {
            str = C90414e6.A00;
        }
        return str;
    }

    public int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = PlayServicesCronetProvider.class;
        return AnonymousClass3K2.A08(this.mContext, A1Z);
    }

    public boolean isEnabled() {
        tryToInstallCronetProvider();
        return C90414e6.A01();
    }
}
