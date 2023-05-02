package X;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import org.apache.commons.io.FilenameUtils;

/* renamed from: X.0Su  reason: invalid class name and case insensitive filesystem */
public final class C05740Su {
    public static final AnonymousClass0Qe A00(Context context) {
        if (!C008703y.A0L("androidx.work.workdb")) {
            return new AnonymousClass0Qe(context, "androidx.work.workdb");
        }
        throw AnonymousClass000.A0T("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    public static final Object A01() {
        String str;
        String str2;
        Class<WorkDatabase> cls = WorkDatabase.class;
        Package packageR = cls.getPackage();
        C18450wi.A0F(packageR);
        String name = packageR.getName();
        String canonicalName = cls.getCanonicalName();
        C18450wi.A0F(canonicalName);
        C18450wi.A0B(name);
        int length = name.length();
        boolean z2 = false;
        if (!AnonymousClass000.A1P(length)) {
            canonicalName = canonicalName.substring(length + 1);
            C18450wi.A0B(canonicalName);
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(C008703y.A0I(canonicalName));
        String A0h = AnonymousClass000.A0h("_Impl", A0o);
        if (length == 0) {
            z2 = true;
        }
        if (z2) {
            str = A0h;
        } else {
            try {
                StringBuilder A0q = AnonymousClass000.A0q(name);
                A0q.append(FilenameUtils.EXTENSION_SEPARATOR);
                str = AnonymousClass000.A0h(A0h, A0q);
            } catch (ClassNotFoundException unused) {
                StringBuilder A0r = AnonymousClass000.A0r("Cannot find implementation for ");
                A0r.append(cls.getCanonicalName());
                A0r.append(". ");
                A0r.append(A0h);
                throw AnonymousClass000.A0a(AnonymousClass000.A0h(" does not exist", A0r));
            } catch (IllegalAccessException unused2) {
                str2 = "Cannot access the constructor ";
                StringBuilder A0r2 = AnonymousClass000.A0r(str2);
                A0r2.append(cls);
                throw AnonymousClass000.A0a(AnonymousClass000.A0h(".canonicalName", A0r2));
            } catch (InstantiationException unused3) {
                str2 = "Failed to create an instance of ";
                StringBuilder A0r22 = AnonymousClass000.A0r(str2);
                A0r22.append(cls);
                throw AnonymousClass000.A0a(AnonymousClass000.A0h(".canonicalName", A0r22));
            }
        }
        Class<?> cls2 = Class.forName(str, true, cls.getClassLoader());
        C18450wi.A0M(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
        return cls2.newInstance();
    }
}
