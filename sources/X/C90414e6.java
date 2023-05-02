package X;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.4e6  reason: invalid class name and case insensitive filesystem */
public class C90414e6 {
    public static String A00 = "0";
    public static C90844ev A01;
    public static final AnonymousClass3AP A02 = AnonymousClass3AP.A00;
    public static final Object A03 = C13690nt.A0Y();

    @Deprecated
    public static void A00(Context context) {
        Class<C90414e6> cls = C90414e6.class;
        synchronized (A03) {
            if (!A01()) {
                C13710nw.A02(context, "Context must not be null");
                ClassLoader classLoader = cls.getClassLoader();
                C13710nw.A01(classLoader);
                try {
                    classLoader.loadClass("org.chromium.net.CronetEngine");
                    AnonymousClass3AP r7 = A02;
                    C15040qE.A01(context, 11925000);
                    C90844ev A06 = C90844ev.A06(context, C90844ev.A09, "com.google.android.gms.cronet_dynamite");
                    Class<?> loadClass = A06.A00.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                    if (loadClass.getClassLoader() != cls.getClassLoader()) {
                        Method method = loadClass.getMethod("getApiLevel", new Class[0]);
                        Method method2 = loadClass.getMethod("getCronetVersion", new Class[0]);
                        Integer num = (Integer) method.invoke((Object) null, new Object[0]);
                        C13710nw.A01(num);
                        int intValue = num.intValue();
                        String str = (String) method2.invoke((Object) null, new Object[0]);
                        C13710nw.A01(str);
                        A00 = str;
                        if (3 > intValue) {
                            Intent A012 = r7.A01(context, "cr", 2);
                            if (A012 == null) {
                                Log.e("CronetProviderInstaller", "Unable to fetch error resolution intent");
                                throw new C47092Hl(2);
                            }
                            String str2 = A00;
                            StringBuilder A0g = C13690nt.A0g(C13680ns.A06(str2) + 174);
                            A0g.append("Google Play Services update is required. The API Level of the client is ");
                            A0g.append(3);
                            A0g.append(". The API Level of the implementation is ");
                            A0g.append(intValue);
                            A0g.append(". The Cronet implementation version is ");
                            throw new AnonymousClass2Hm(A012, AnonymousClass000.A0h(str2, A0g), 2);
                        }
                        A01 = A06;
                    } else {
                        Log.e("CronetProviderInstaller", "ImplVersion class is missing from Cronet module.");
                        throw new C47092Hl(8);
                    }
                } catch (ClassNotFoundException e2) {
                    Log.e("CronetProviderInstaller", "Cronet API is not available. Have you included all required dependencies?");
                    throw ((C47092Hl) new C47092Hl(10).initCause(e2));
                } catch (C803743p e3) {
                    Log.e("CronetProviderInstaller", "Unable to load Cronet module", e3);
                    throw ((C47092Hl) new C47092Hl(8).initCause(e3));
                } catch (Exception e4) {
                    Log.e("CronetProviderInstaller", "Unable to read Cronet version from the Cronet module ", e4);
                    throw ((C47092Hl) new C47092Hl(8).initCause(e4));
                }
            }
        }
    }

    public static boolean A01() {
        C90844ev r0;
        synchronized (A03) {
            r0 = A01;
        }
        return AnonymousClass000.A1V(r0);
    }
}
