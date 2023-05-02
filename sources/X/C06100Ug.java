package X;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0Ug  reason: invalid class name and case insensitive filesystem */
public class C06100Ug {
    public static final String[] A0E = {"UPDATE", "DELETE", "INSERT"};
    public final AnonymousClass03P A00;
    public final AnonymousClass0O1 A01;
    public final AnonymousClass0PI A02;
    public final AnonymousClass0SM A03;
    public final Object A04;
    public final Object A05;
    public final Runnable A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;
    public final AtomicBoolean A0A = new AtomicBoolean(false);
    public final String[] A0B;
    public volatile C13500mT A0C;
    public volatile boolean A0D;

    public C06100Ug(AnonymousClass0SM r8, Map map, Map map2, String... strArr) {
        C18450wi.A0H(r8, 1);
        this.A03 = r8;
        this.A07 = map;
        this.A09 = map2;
        int length = strArr.length;
        this.A02 = new AnonymousClass0PI();
        this.A01 = new AnonymousClass0O1(r8);
        this.A00 = new AnonymousClass03P();
        this.A04 = new Object();
        this.A05 = new Object();
        this.A08 = new LinkedHashMap();
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr[i2];
            Locale locale = Locale.US;
            C18450wi.A0D(locale);
            String lowerCase = str.toLowerCase(locale);
            C18450wi.A0B(lowerCase);
            this.A08.put(lowerCase, Integer.valueOf(i2));
            String str2 = (String) this.A07.get(strArr[i2]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                C18450wi.A0B(lowerCase);
            }
            strArr2[i2] = lowerCase;
        }
        this.A0B = strArr2;
        Iterator A0y = AnonymousClass000.A0y(this.A07);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            Locale locale2 = Locale.US;
            C18450wi.A0D(locale2);
            String lowerCase2 = ((String) A0z.getValue()).toLowerCase(locale2);
            C18450wi.A0B(lowerCase2);
            if (this.A08.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) A0z.getKey()).toLowerCase(locale2);
                C18450wi.A0B(lowerCase3);
                Map map3 = this.A08;
                map3.put(lowerCase3, C25411Jr.A00(map3, lowerCase2));
            }
        }
        this.A06 = new C10510hF(this);
    }

    public final void A00(C13620mg r4) {
        C18450wi.A0H(r4, 0);
        if (!((C07700cK) r4).A00.inTransaction()) {
            try {
                Lock A072 = this.A03.A07();
                A072.lock();
                try {
                    synchronized (this.A04) {
                        synchronized (this.A02) {
                        }
                    }
                    A072.unlock();
                } catch (Throwable th) {
                    A072.unlock();
                    throw th;
                }
            } catch (SQLiteException | IllegalStateException e2) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
            }
        }
    }
}
