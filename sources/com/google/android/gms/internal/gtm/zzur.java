package com.google.android.gms.internal.gtm;

import X.AnonymousClass000;
import X.C13680ns;
import X.C13690nt;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzur {
    public static final Logger zza = Logger.getLogger(zzto.class.getName());
    public static final String zzb = "com.google.android.gms.internal.gtm.zzsq";

    public static zzuj zzb(Class cls) {
        String str;
        IllegalStateException illegalStateException;
        Class<zzur> cls2 = zzur.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(zzuj.class)) {
            str = zzb;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            Object[] A1Z = C13690nt.A1Z();
            A1Z[0] = cls.getPackage().getName();
            A1Z[1] = cls.getSimpleName();
            str = String.format("%s.BlazeGenerated%sLoader", A1Z);
        } else {
            throw AnonymousClass000.A0T(cls.getName());
        }
        try {
            try {
                Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0]);
                return (zzuj) cls.cast(new zzyi((zzyg) null));
            } catch (NoSuchMethodException e2) {
                illegalStateException = new IllegalStateException(e2);
                throw illegalStateException;
            } catch (InstantiationException e3) {
                illegalStateException = new IllegalStateException(e3);
                throw illegalStateException;
            } catch (IllegalAccessException e4) {
                illegalStateException = new IllegalStateException(e4);
                throw illegalStateException;
            } catch (InvocationTargetException e5) {
                illegalStateException = new IllegalStateException(e5);
                throw illegalStateException;
            }
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList A0u = AnonymousClass000.A0u();
            while (it.hasNext()) {
                try {
                    it.next();
                    A0u.add(cls.cast(new zzyi((zzyg) null)));
                } catch (ServiceConfigurationError e6) {
                    zza.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", C13680ns.A0g(cls.getSimpleName(), "Unable to load "), e6);
                }
            }
            if (A0u.size() == 1) {
                return (zzuj) A0u.get(0);
            }
            if (A0u.size() == 0) {
                return null;
            }
            try {
                return (zzuj) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{A0u});
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException(e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException(e9);
            }
        }
    }

    public abstract zzuj zza();
}
