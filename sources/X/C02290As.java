package X;

import android.os.AsyncTask;
import android.util.Log;

/* renamed from: X.0As  reason: invalid class name and case insensitive filesystem */
public class C02290As extends AsyncTask {
    public final /* synthetic */ AnonymousClass0QR A00;
    public final /* synthetic */ C12430kO A01;

    public C02290As(AnonymousClass0QR r1, C12430kO r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            return this.A00.A00();
        } catch (Exception e2) {
            Log.e("Palette", "Exception thrown during async generate", e2);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.A01.ARh((AnonymousClass0UB) obj);
    }
}
