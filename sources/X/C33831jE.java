package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.1jE  reason: invalid class name and case insensitive filesystem */
public class C33831jE implements AnonymousClass01J {
    public final /* synthetic */ C16510tB A00;

    public C33831jE(C16510tB r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object get() {
        Log.i("externalfilevalidator/initializing whitelist lazily");
        C16180sb r5 = this.A00.A02;
        AnonymousClass00B.A06(r5);
        HashSet hashSet = new HashSet();
        hashSet.add(r5.A0B());
        hashSet.add(r5.A07());
        hashSet.add(r5.A09());
        hashSet.add(r5.A0K("personal"));
        hashSet.add(r5.A0K("business"));
        hashSet.add(r5.A08());
        File file = r5.A05().A09;
        C16180sb.A04(file, false);
        hashSet.add(file);
        Context context = r5.A03.A00;
        File file2 = new File(context.getFilesDir(), "Gifs");
        C16180sb.A04(file2, false);
        hashSet.add(file2);
        File file3 = new File(context.getCacheDir(), "stickers_cache");
        C16180sb.A04(file3, false);
        hashSet.add(file3);
        hashSet.add(r5.A05().A08);
        hashSet.add(r5.A05().A06);
        hashSet.add(r5.A05().A07);
        return Collections.unmodifiableSet(hashSet);
    }
}
