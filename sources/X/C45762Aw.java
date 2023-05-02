package X;

import com.obwhatsapp.R;
import com.obwhatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2Aw  reason: invalid class name and case insensitive filesystem */
public class C45762Aw extends C16690tT {
    public final /* synthetic */ MyStatusesActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45762Aw(MyStatusesActivity myStatusesActivity) {
        super(myStatusesActivity, true);
        this.A00 = myStatusesActivity;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        MyStatusesActivity myStatusesActivity = this.A00;
        List<C16740tZ> A01 = myStatusesActivity.A0N.A01(C34091jg.A00);
        myStatusesActivity.A0r.get();
        Collections.reverse(A01);
        for (C16740tZ r1 : A01) {
            if (r1 instanceof C38701rH) {
                myStatusesActivity.A0H.A01((C38701rH) r1);
            }
        }
        return A01;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        List list = (List) obj;
        StringBuilder sb = new StringBuilder("mystatuses/loaded ");
        sb.append(list.size());
        sb.append(" messages");
        Log.i(sb.toString());
        if (list.isEmpty()) {
            this.A00.finish();
            Log.i("MyStatusesActivity/maybeRedirectToHomeActivityWithStatusView ");
            return;
        }
        MyStatusesActivity myStatusesActivity = this.A00;
        AnonymousClass2B4 r0 = myStatusesActivity.A0k;
        r0.A00 = list;
        r0.notifyDataSetChanged();
        myStatusesActivity.A37();
        myStatusesActivity.A0d.A00();
        myStatusesActivity.findViewById(R.id.progress).setVisibility(8);
    }
}
