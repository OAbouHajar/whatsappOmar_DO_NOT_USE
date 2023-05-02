package X;

import android.os.AsyncTask;

/* renamed from: X.0Au  reason: invalid class name and case insensitive filesystem */
public final class C02310Au extends AsyncTask {
    public final /* synthetic */ AnonymousClass03J A00;

    public C02310Au(AnonymousClass03J r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        while (true) {
            AnonymousClass03J r2 = this.A00;
            C12990lI A01 = r2.A01();
            if (A01 == null) {
                return null;
            }
            r2.A05(A01.getIntent());
            A01.A6U();
        }
    }

    public /* bridge */ /* synthetic */ void onCancelled(Object obj) {
        this.A00.A02();
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.A00.A02();
    }
}
