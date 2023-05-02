package X;

import com.obwhatsapp.status.playback.MyStatusesActivity;
import java.util.HashMap;

/* renamed from: X.3ye  reason: invalid class name and case insensitive filesystem */
public class C78763ye extends C16690tT {
    public final C16740tZ A00;
    public final /* synthetic */ MyStatusesActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78763ye(C16740tZ r2, MyStatusesActivity myStatusesActivity) {
        super(myStatusesActivity, true);
        this.A01 = myStatusesActivity;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i2 = 0;
        for (AnonymousClass21N A012 : this.A01.A0L.A00(this.A00).A00.values()) {
            if (A012.A01(13) > 0) {
                i2++;
            }
        }
        return Integer.valueOf(i2);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        MyStatusesActivity myStatusesActivity = this.A01;
        HashMap hashMap = myStatusesActivity.A14;
        C28381Vw r1 = this.A00.A11;
        hashMap.put(r1, obj);
        myStatusesActivity.A15.remove(r1);
        myStatusesActivity.A0k.notifyDataSetChanged();
    }
}
