package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.provider.MediaStore;
import java.util.ArrayList;

/* renamed from: X.2qv  reason: invalid class name and case insensitive filesystem */
public class C57332qv extends AnonymousClass0F8 {
    public static final String[] A04 = {"_id", "artist", "title", "_data", "duration", "_size"};
    public Cursor A00;
    public CancellationSignal A01;
    public final ContentResolver A02;
    public final ArrayList A03;

    public C57332qv(ContentResolver contentResolver, Context context, ArrayList arrayList) {
        super(context);
        this.A02 = contentResolver;
        if (arrayList == null) {
            this.A03 = AnonymousClass000.A0u();
        } else {
            this.A03 = arrayList;
        }
    }

    public void A01() {
        A00();
        Cursor cursor = this.A00;
        if (cursor != null && !cursor.isClosed()) {
            this.A00.close();
        }
        this.A00 = null;
    }

    public void A02() {
        A00();
    }

    public void A03() {
        Cursor cursor = this.A00;
        if (cursor != null) {
            A04(cursor);
        }
        boolean z2 = this.A03;
        this.A03 = false;
        this.A04 |= z2;
        if (z2 || this.A00 == null) {
            A09();
        }
    }

    public /* bridge */ /* synthetic */ Object A06() {
        Cursor query;
        synchronized (this) {
            if (!AnonymousClass000.A1V(this.A01)) {
                this.A01 = new CancellationSignal();
            } else {
                throw new AnonymousClass057();
            }
        }
        try {
            ArrayList arrayList = this.A03;
            String[] strArr = new String[(arrayList.size() << 1)];
            StringBuilder A0o = AnonymousClass000.A0o();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                A0o.append(" AND ");
                A0o.append("(");
                A0o.append("title");
                A0o.append(" LIKE ?");
                A0o.append(" OR ");
                A0o.append("artist");
                A0o.append(" LIKE ?");
                A0o.append(")");
                int i3 = i2 << 1;
                StringBuilder A0o2 = AnonymousClass000.A0o();
                A0o2.append("%");
                A0o2.append((String) arrayList.get(i2));
                strArr[i3] = AnonymousClass000.A0h("%", A0o2);
                StringBuilder A0q = AnonymousClass000.A0q("%");
                A0q.append((String) arrayList.get(i2));
                strArr[i3 + 1] = AnonymousClass000.A0h("%", A0q);
            }
            query = this.A02.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, A04, AnonymousClass000.A0e(A0o, "(is_music!=0 OR is_podcast!=0)", AnonymousClass000.A0o()), strArr, "date_modified DESC", this.A01);
            if (query != null) {
                query.getCount();
            }
            synchronized (this) {
                this.A01 = null;
            }
            return query;
        } catch (RuntimeException e2) {
            query.close();
            throw e2;
        } catch (Throwable th) {
            th = th;
            synchronized (this) {
                try {
                    this.A01 = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                throw th;
            }
        }
    }

    public void A07() {
        synchronized (this) {
            CancellationSignal cancellationSignal = this.A01;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
        }
    }

    public /* bridge */ /* synthetic */ void A0B(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: A0C */
    public void A04(Cursor cursor) {
        if (!this.A05) {
            Cursor cursor2 = this.A00;
            this.A00 = cursor;
            if (this.A06) {
                super.A04(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }
}
