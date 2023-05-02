package X;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0Wg  reason: invalid class name */
public final class AnonymousClass0Wg {
    public static final File A00(Context context) {
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        C18450wi.A0B(databasePath);
        return databasePath;
    }

    public static final File A01(Context context) {
        return new File(AnonymousClass0MI.A00(context), "androidx.work.workdb");
    }

    public static final void A02(Context context) {
        StringBuilder A0r;
        C18450wi.A0H(context, 0);
        AnonymousClass0Wg r4 = new AnonymousClass0Wg();
        File A00 = A00(context);
        if (Build.VERSION.SDK_INT >= 23 && A00.exists()) {
            C06530Wm A002 = C06530Wm.A00();
            String str = AnonymousClass0NE.A00;
            A002.A02(str, "Migrating WorkDatabase to the no-backup directory");
            Iterator A0y = AnonymousClass000.A0y(r4.A03(context));
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                File file = (File) A0z.getKey();
                File file2 = (File) A0z.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        C06530Wm.A00();
                        Log.w(str, AnonymousClass000.A0g("Over-writing contents of ", file2));
                    }
                    if (file.renameTo(file2)) {
                        A0r = AnonymousClass000.A0r("Migrated ");
                        A0r.append(file);
                        A0r.append("to ");
                        A0r.append(file2);
                    } else {
                        A0r = AnonymousClass000.A0r("Renaming ");
                        A0r.append(file);
                        A0r.append(" to ");
                        A0r.append(file2);
                        A0r.append(" failed");
                    }
                    C06530Wm.A00().A02(str, A0r.toString());
                }
            }
        }
    }

    public final Map A03(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return C25411Jr.A01();
        }
        File A00 = A00(context);
        File A01 = A01(context);
        int A07 = C25421Js.A07(r5);
        if (A07 < 16) {
            A07 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A07);
        for (String str : AnonymousClass0NE.A01) {
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(A00.getPath());
            File file = new File(AnonymousClass000.A0h(str, A0o));
            StringBuilder A0o2 = AnonymousClass000.A0o();
            A0o2.append(A01.getPath());
            C25401Jq A002 = C55932kg.A00(file, new File(AnonymousClass000.A0h(str, A0o2)));
            linkedHashMap.put(A002.A03(), A002.A04());
        }
        return C25411Jr.A04(linkedHashMap, C55932kg.A00(A00, A01));
    }
}
