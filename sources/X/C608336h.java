package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Pair;
import com.obwhatsapp.R;
import com.obwhatsapp.contentprovider.MediaProvider;
import com.whatsapp.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.36h  reason: invalid class name and case insensitive filesystem */
public abstract class C608336h extends C16690tT {
    public final WeakReference A00;

    public C608336h(Context context) {
        this.A00 = C13690nt.A0h(context);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        File A0B = A0B();
        if (A0B == null) {
            Log.e("Failed to export messages file.");
            return C13690nt.A0I((Object) null, C13680ns.A0Y());
        }
        return C13680ns.A0F(C13700nu.A02("android.intent.action.SEND").setAction("android.intent.action.SEND").putExtra("android.intent.extra.STREAM", new Uri.Builder().scheme("content").authority(MediaProvider.A0C).appendPath("export").appendEncodedPath(A0B.getName()).build()).setType("application/zip"), 0);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null) {
            Intent intent = (Intent) pair.first;
            Context context = (Context) this.A00.get();
            if (intent != null && context != null) {
                context.startActivity(Intent.createChooser(intent, context.getString(R.string.str14ee)));
            }
        }
    }

    public abstract File A0B();
}
