package X;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4b4  reason: invalid class name and case insensitive filesystem */
public final class C88774b4 {
    public static final ConcurrentHashMap A07 = new ConcurrentHashMap();
    public static final String[] A08 = {"key", "value"};
    public final ContentResolver A00;
    public final ContentObserver A01;
    public final Uri A02;
    public final Object A03 = C13690nt.A0Y();
    public final Object A04 = C13690nt.A0Y();
    public final List A05 = AnonymousClass000.A0u();
    public volatile Map A06;

    public C88774b4(ContentResolver contentResolver, Uri uri) {
        this.A00 = contentResolver;
        this.A02 = uri;
        this.A01 = new C63613Kq(this);
    }

    public final Map A00() {
        Cursor query;
        try {
            HashMap A0x = AnonymousClass000.A0x();
            query = this.A00.query(this.A02, A08, (String) null, (String[]) null, (String) null);
            if (query == null) {
                return A0x;
            }
            while (query.moveToNext()) {
                A0x.put(query.getString(0), query.getString(1));
            }
            query.close();
            return A0x;
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}
