package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callhistory.CallLogActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.35p  reason: invalid class name and case insensitive filesystem */
public class C607335p extends C16690tT {
    public final WeakReference A00;
    public final /* synthetic */ CallLogActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C607335p(CallLogActivity callLogActivity, CallLogActivity callLogActivity2) {
        super(callLogActivity2, true);
        this.A01 = callLogActivity;
        this.A00 = C13690nt.A0h(callLogActivity2);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        CallLogActivity callLogActivity = this.A01;
        int dimensionPixelSize = callLogActivity.getResources().getDimensionPixelSize(R.dimen.dimen052e);
        float dimension = callLogActivity.getResources().getDimension(R.dimen.dimen052d);
        Context context = (Context) this.A00.get();
        Bitmap A002 = context != null ? callLogActivity.A0F.A00(context, callLogActivity.A0L, dimension, dimensionPixelSize) : null;
        if (!C16690tT.A02(this)) {
            C14870pt.A02(callLogActivity.A05, this, A002, 10);
        }
        return null;
    }
}
