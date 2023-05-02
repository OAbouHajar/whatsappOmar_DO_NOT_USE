package X;

import android.view.View;
import android.widget.AdapterView;
import com.obwhatsapp.BottomSheetListView;
import com.obwhatsapp.registration.EULA;

/* renamed from: X.3DF  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DF implements AdapterView.OnItemClickListener {
    public final /* synthetic */ BottomSheetListView A00;
    public final /* synthetic */ EULA A01;

    public /* synthetic */ AnonymousClass3DF(BottomSheetListView bottomSheetListView, EULA eula) {
        this.A01 = eula;
        this.A00 = bottomSheetListView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        EULA eula = this.A01;
        eula.A09.A0S(((AnonymousClass4I4) this.A00.getAdapter().getItem(i2)).A01);
        eula.A09.A0K().putBoolean("is_ls_shown_during_reg", true).commit();
        eula.A0F.A00();
        eula.A0F.A01();
        if (C15450qv.A0A()) {
            eula.recreate();
            return;
        }
        eula.finish();
        eula.startActivity(eula.getIntent());
        eula.overridePendingTransition(0, 0);
    }
}
