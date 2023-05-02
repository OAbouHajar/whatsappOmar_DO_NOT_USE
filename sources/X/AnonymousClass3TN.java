package X;

import android.content.Context;
import android.net.Uri;
import java.util.EnumSet;

/* renamed from: X.3TN  reason: invalid class name */
public class AnonymousClass3TN extends C06060Ub {
    public final /* synthetic */ C55562jx A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3TN(Context context, C55562jx r2) {
        super(context);
        this.A00 = r2;
    }

    public void A00(Context context, Uri uri, EnumSet enumSet) {
        this.A00.A0A.Act(context, Uri.parse("https://mbasic.facebook.com/maps/information/?").buildUpon().appendQueryParameter("static_map_url", uri.toString()).build());
    }
}
