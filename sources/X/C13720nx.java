package X;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.redex.IDxProviderShape98S0200000_2_I0;
import com.google.firebase.iid.Registrar;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0nx  reason: invalid class name and case insensitive filesystem */
public class C13720nx {
    public static final Object A09 = new Object();
    public static final Map A0A = new AnonymousClass00N();
    public static final Executor A0B = new C13730ny();
    public final Context A00;
    public final C13740nz A01;
    public final C13820o8 A02;
    public final C13850oB A03;
    public final String A04;
    public final List A05 = new CopyOnWriteArrayList();
    public final List A06 = new CopyOnWriteArrayList();
    public final AtomicBoolean A07 = new AtomicBoolean(false);
    public final AtomicBoolean A08 = new AtomicBoolean();

    public C13720nx(Context context, C13740nz r15, String str) {
        String str2;
        C13710nw.A01(context);
        this.A00 = context;
        String str3 = str;
        C13710nw.A05(str3);
        this.A04 = str3;
        this.A01 = r15;
        List<String> A002 = new C13750o0().A00(context);
        ArrayList arrayList = new ArrayList();
        for (String str4 : A002) {
            try {
                Class<?> cls = Class.forName(str4);
                if (!Registrar.class.isAssignableFrom(cls)) {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an instance of %s", new Object[]{str4, "com.google.firebase.components.ComponentRegistrar"}));
                } else {
                    arrayList.add(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException e2) {
                Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str4}), e2);
            } catch (IllegalAccessException | InstantiationException e3) {
                e = e3;
                str2 = String.format("Could not instantiate %s.", new Object[]{str4});
                Log.w("ComponentDiscovery", str2, e);
            } catch (NoSuchMethodException | InvocationTargetException e4) {
                e = e4;
                str2 = String.format("Could not instantiate %s", new Object[]{str4});
                Log.w("ComponentDiscovery", str2, e);
            }
        }
        Executor executor = A0B;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C13780o4.class);
        Collections.addAll(hashSet, new Class[0]);
        C13790o5 r7 = new C13790o5(AnonymousClass00P.class, 2);
        C13710nw.A03("Components are not allowed to depend on interfaces they themselves provide.", !hashSet.contains(r7.A01));
        hashSet2.add(r7);
        C13800o6 r72 = C13800o6.A00;
        C13710nw.A02(r72, "Null factory");
        C13710nw.A04("Missing required property: factory.", true);
        this.A02 = new C13820o8(arrayList, executor, C13760o2.A00(Context.class, context, new Class[0]), C13760o2.A00(C13720nx.class, this, new Class[0]), C13760o2.A00(C13740nz.class, r15, new Class[0]), C13770o3.A00("fire-android", ""), C13770o3.A00("fire-core", "19.0.0"), new C13760o2(r72, new HashSet(hashSet), new HashSet(hashSet2), hashSet3, 0, 0));
        this.A03 = new C13850oB(new IDxProviderShape98S0200000_2_I0(context, 0, this));
    }

    public static C13720nx A00() {
        C13720nx r0;
        synchronized (A09) {
            r0 = (C13720nx) A0A.get("[DEFAULT]");
            if (r0 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Default FirebaseApp is not initialized in this process ");
                sb.append(C13860oC.A00());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return r0;
    }

    public static C13720nx A01(Context context) {
        C13720nx r0;
        synchronized (A09) {
            Map map = A0A;
            if (map.containsKey("[DEFAULT]")) {
                r0 = A00();
            } else {
                C13710nw.A01(context);
                Resources resources = context.getResources();
                String resourcePackageName = resources.getResourcePackageName(R.string.str1c2d);
                int identifier = resources.getIdentifier("google_app_id", "string", resourcePackageName);
                String string = identifier == 0 ? null : resources.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    r0 = null;
                } else {
                    int identifier2 = resources.getIdentifier("google_api_key", "string", resourcePackageName);
                    String string2 = identifier2 == 0 ? null : resources.getString(identifier2);
                    int identifier3 = resources.getIdentifier("firebase_database_url", "string", resourcePackageName);
                    String string3 = identifier3 == 0 ? null : resources.getString(identifier3);
                    int identifier4 = resources.getIdentifier("ga_trackingId", "string", resourcePackageName);
                    String string4 = identifier4 == 0 ? null : resources.getString(identifier4);
                    int identifier5 = resources.getIdentifier("gcm_defaultSenderId", "string", resourcePackageName);
                    String string5 = identifier5 == 0 ? null : resources.getString(identifier5);
                    int identifier6 = resources.getIdentifier("google_storage_bucket", "string", resourcePackageName);
                    String string6 = identifier6 == 0 ? null : resources.getString(identifier6);
                    int identifier7 = resources.getIdentifier("project_id", "string", resourcePackageName);
                    C13740nz r7 = new C13740nz(string, string2, string3, string4, string5, string6, identifier7 == 0 ? null : resources.getString(identifier7));
                    if (context.getApplicationContext() instanceof Application) {
                        Application application = (Application) context.getApplicationContext();
                        AtomicReference atomicReference = C13870oD.A00;
                        if (atomicReference.get() == null) {
                            C13870oD r2 = new C13870oD();
                            if (atomicReference.compareAndSet((Object) null, r2)) {
                                C13890oF.A00(application);
                                C13890oF r1 = C13890oF.A04;
                                synchronized (r1) {
                                    try {
                                        r1.A01.add(r2);
                                    } catch (Throwable th) {
                                        while (true) {
                                            th = th;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    String trim = "[DEFAULT]".trim();
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    try {
                        boolean z2 = false;
                        if (!map.containsKey(trim)) {
                            z2 = true;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("FirebaseApp name ");
                        sb.append(trim);
                        sb.append(" already exists!");
                        C13710nw.A04(sb.toString(), z2);
                        C13710nw.A02(context, "Application context cannot be null.");
                        r0 = new C13720nx(context, r7, trim);
                        map.put(trim, r0);
                        r0.A03();
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        }
        return r0;
    }

    public final void A02() {
        C13710nw.A04("FirebaseApp was deleted", !this.A08.get());
    }

    public final void A03() {
        Queue queue;
        Context context = this.A00;
        if (Build.VERSION.SDK_INT < 24 || !(!AnonymousClass00Q.A00(context))) {
            C13820o8 r4 = this.A02;
            A02();
            for (Map.Entry entry : r4.A01.entrySet()) {
                C13850oB r2 = (C13850oB) entry.getValue();
                if (((C13760o2) entry.getKey()).A00 == 1) {
                    r2.get();
                }
            }
            C13910oH r3 = r4.A00;
            synchronized (r3) {
                queue = r3.A00;
                if (queue != null) {
                    r3.A00 = null;
                } else {
                    queue = null;
                }
            }
            if (queue != null) {
                Iterator it = queue.iterator();
                while (it.hasNext()) {
                    it.next();
                    C13710nw.A01((Object) null);
                    synchronized (r3) {
                        Queue queue2 = r3.A00;
                        if (queue2 != null) {
                            queue2.add((Object) null);
                        } else {
                            synchronized (r3) {
                                throw new NullPointerException("getType");
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        C13900oG.A00(context);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13720nx)) {
            return false;
        }
        String str = this.A04;
        C13720nx r3 = (C13720nx) obj;
        r3.A02();
        return str.equals(r3.A04);
    }

    public int hashCode() {
        return this.A04.hashCode();
    }

    public String toString() {
        C13930oJ r2 = new C13930oJ(this);
        r2.A00(this.A04, FacebookFacade.RequestParameter.NAME);
        r2.A00(this.A01, "options");
        return r2.toString();
    }
}
