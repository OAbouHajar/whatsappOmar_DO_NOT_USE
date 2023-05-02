package X;

import android.view.View;
import com.obwhatsapp.calling.callhistory.group.GroupCallLogActivity;

/* renamed from: X.4kX  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94204kX implements View.OnLongClickListener {
    public final /* synthetic */ GroupCallLogActivity A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C94204kX(GroupCallLogActivity groupCallLogActivity, String str, boolean z2) {
        this.A00 = groupCallLogActivity;
        this.A02 = z2;
        this.A01 = str;
    }

    public final boolean onLongClick(View view) {
        GroupCallLogActivity.A02(this.A00, this.A01, this.A02);
        return true;
    }
}
