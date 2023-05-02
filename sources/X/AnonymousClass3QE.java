package X;

import android.content.Context;
import android.database.Cursor;

/* renamed from: X.3QE  reason: invalid class name */
public class AnonymousClass3QE extends AnonymousClass0F8 {
    public Cursor A00;
    public AnonymousClass024 A01;
    public final AnonymousClass10H A02;
    public final C15830rv A03;
    public final String A04;

    public AnonymousClass3QE(Context context, AnonymousClass10H r2, C15830rv r3, String str) {
        super(context);
        this.A04 = str;
        this.A02 = r2;
        this.A03 = r3;
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
        AnonymousClass024 r4;
        Cursor ADd;
        synchronized (this) {
            if (!AnonymousClass000.A1V(this.A01)) {
                r4 = new AnonymousClass024();
                this.A01 = r4;
            } else {
                throw new AnonymousClass057();
            }
        }
        try {
            C15830rv r2 = this.A03;
            ADd = r2 != null ? this.A02.ADd(r4, r2, this.A04) : this.A02.ADc(r4, this.A04);
            if (ADd != null) {
                ADd.getCount();
            }
            synchronized (this) {
                this.A01 = null;
            }
            return ADd;
        } catch (RuntimeException e2) {
            ADd.close();
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
            AnonymousClass024 r0 = this.A01;
            if (r0 != null) {
                r0.A01();
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
