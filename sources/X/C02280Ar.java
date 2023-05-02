package X;

import android.os.AsyncTask;
import android.util.Log;
import com.caverock.androidsvg.SVGImageView;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0Ar  reason: invalid class name and case insensitive filesystem */
public class C02280Ar extends AsyncTask {
    public final /* synthetic */ SVGImageView A00;

    public C02280Ar(SVGImageView sVGImageView) {
        this.A00 = sVGImageView;
    }

    public static void A00(SVGImageView sVGImageView, Object obj) {
        new C02280Ar(sVGImageView).execute(new InputStream[]{obj});
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        InputStream[] inputStreamArr = (InputStream[]) objArr;
        try {
            AnonymousClass0Rz A0S = new AnonymousClass0XP().A0S(inputStreamArr[0]);
            try {
                inputStreamArr[0].close();
                return A0S;
            } catch (IOException unused) {
                return A0S;
            }
        } catch (C11550ix e2) {
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append("Parse error loading URI: ");
            Log.e("SVGImageView", AnonymousClass000.A0h(e2.getMessage(), A0o));
            try {
                inputStreamArr[0].close();
            } catch (IOException unused2) {
            }
            return null;
        } catch (Throwable th) {
            try {
                inputStreamArr[0].close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        SVGImageView sVGImageView = this.A00;
        sVGImageView.A01 = (AnonymousClass0Rz) obj;
        sVGImageView.A00();
    }
}
