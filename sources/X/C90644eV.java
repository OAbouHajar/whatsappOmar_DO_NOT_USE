package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4eV  reason: invalid class name and case insensitive filesystem */
public abstract class C90644eV {
    public static Context A06;
    public static final Object A07 = C13690nt.A0Y();
    public static volatile Boolean A08;
    public final C84174Jn A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public volatile SharedPreferences A04;
    public volatile C88774b4 A05 = null;

    public C90644eV(C84174Jn r3, Object obj, String str) {
        if (r3.A00 != null) {
            this.A00 = r3;
            this.A03 = C13680ns.A0g(String.valueOf(str), String.valueOf(r3.A01));
            this.A02 = C13680ns.A0g(String.valueOf(str), String.valueOf(r3.A02));
            this.A01 = obj;
            return;
        }
        throw AnonymousClass000.A0T("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static Object A00(C108435Nz r3) {
        long clearCallingIdentity;
        try {
            return r3.AjQ();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object AjQ = r3.AjQ();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return AjQ;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public static void A01(Context context) {
        Context applicationContext;
        if (A06 == null) {
            synchronized (A07) {
                if ((Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) && (applicationContext = context.getApplicationContext()) != null) {
                    context = applicationContext;
                }
                if (A06 != context) {
                    A08 = null;
                }
                A06 = context;
            }
        }
    }

    public static boolean A02() {
        if (A08 == null) {
            Context context = A06;
            boolean z2 = false;
            if (context == null) {
                return false;
            }
            if (AnonymousClass0LQ.A00(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null, Binder.getCallingPid(), Binder.getCallingUid()) == 0) {
                z2 = true;
            }
            A08 = Boolean.valueOf(z2);
        }
        return A08.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r0 = A05((r0 = (java.lang.String) A00(new X.C98154rB(r1))));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03() {
        /*
            r1 = this;
            android.content.Context r0 = A06
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r1.A04()
            if (r0 != 0) goto L_0x0023
            boolean r0 = A02()
            if (r0 == 0) goto L_0x0024
            X.4rB r0 = new X.4rB
            r0.<init>(r1)
            java.lang.Object r0 = A00(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0024
        L_0x0023:
            return r0
        L_0x0024:
            java.lang.Object r0 = r1.A01
            return r0
        L_0x0027:
            java.lang.String r0 = "Must call PhenotypeFlag.init() first"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90644eV.A03():java.lang.Object");
    }

    public final Object A04() {
        if (!(A02() ? AnonymousClass000.A1X(A00(new C98164rC("gms:phenotype:phenotype_flag:debug_bypass_phenotype"))) : false)) {
            Uri uri = this.A00.A00;
            if (uri != null) {
                if (this.A05 == null) {
                    ContentResolver contentResolver = A06.getContentResolver();
                    ConcurrentHashMap concurrentHashMap = C88774b4.A07;
                    C88774b4 r3 = (C88774b4) concurrentHashMap.get(uri);
                    if (r3 == null) {
                        r3 = new C88774b4(contentResolver, uri);
                        C88774b4 r0 = (C88774b4) concurrentHashMap.putIfAbsent(uri, r3);
                        if (r0 == null) {
                            r3.A00.registerContentObserver(r3.A02, false, r3.A01);
                        } else {
                            r3 = r0;
                        }
                    }
                    this.A05 = r3;
                }
                String str = (String) A00(new C98174rD(this.A05, this));
                if (str != null) {
                    return A05(str);
                }
            }
        } else {
            Log.w("PhenotypeFlag", C13680ns.A0g(String.valueOf(this.A02), "Bypass reading Phenotype values for flag: "));
        }
        return null;
    }

    public Object A05(String str) {
        Object obj;
        AnonymousClass40G r1;
        AnonymousClass40G r12;
        if (this instanceof AnonymousClass3Z0) {
            AnonymousClass3Z0 r2 = (AnonymousClass3Z0) this;
            try {
                synchronized (r2.A02) {
                    if (!str.equals(r2.A01)) {
                        byte[] decode = Base64.decode(str, 3);
                        AnonymousClass3Z1 r9 = (AnonymousClass3Z1) AnonymousClass3ZN.zzbir.A07(4);
                        try {
                            C32581gc r6 = C32581gc.A02;
                            Class<?> cls = r9.getClass();
                            r6.A00(cls).Aiw(new C84184Jo(), r9, decode, 0, decode.length);
                            r6.A00(cls).AjE(r9);
                            if (r9.zzex == 0) {
                                byte byteValue = ((Byte) r9.A07(1)).byteValue();
                                if (byteValue != 1) {
                                    if (byteValue != 0) {
                                        boolean AjP = r6.A00(cls).AjP(r9);
                                        r9.A07(2);
                                        if (AjP) {
                                        }
                                    }
                                    r12 = new AnonymousClass40G(new C105605Ag().getMessage());
                                    r12.zzkw = r9;
                                    r1 = r12;
                                    throw r1;
                                }
                                r2.A01 = str;
                                r2.A00 = (AnonymousClass3ZN) r9;
                            } else {
                                throw new RuntimeException();
                            }
                        } catch (IOException e2) {
                            if (e2.getCause() instanceof AnonymousClass40G) {
                                r1 = e2.getCause();
                            } else {
                                r12 = new AnonymousClass40G(e2.getMessage());
                            }
                        } catch (IndexOutOfBoundsException unused) {
                            r12 = new AnonymousClass40G("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                    }
                    obj = r2.A00;
                }
                return obj;
            } catch (IOException | IllegalArgumentException unused2) {
                String str2 = r2.A02;
                StringBuilder A0g = C13690nt.A0g(C13680ns.A06(str2) + 27 + C13680ns.A06(str));
                A0g.append("Invalid byte[] value for ");
                AnonymousClass3K4.A13(A0g, str2);
                Log.e("PhenotypeFlag", AnonymousClass000.A0h(str, A0g));
                return null;
            }
        } else if (this instanceof C66343Yz) {
            return str;
        } else {
            if (C90434e8.A0B.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (C90434e8.A0C.matcher(str).matches()) {
                return Boolean.FALSE;
            }
            String str3 = this.A02;
            StringBuilder A0g2 = C13690nt.A0g(C13680ns.A06(str3) + 28 + C13680ns.A06(str));
            A0g2.append("Invalid boolean value for ");
            AnonymousClass3K4.A13(A0g2, str3);
            Log.e("PhenotypeFlag", AnonymousClass000.A0h(str, A0g2));
            return null;
        }
    }
}
