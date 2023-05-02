package m;

import android.view.View;
import com.obwhatsapp.youbasha.ui.YoSettings.AllSettings;
import com.obwhatsapp.youbasha.ui.YoSettings.BackupRestore;
import com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity;
import java.util.Objects;

public final /* synthetic */ class AG_Backup implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1775a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AllSettings f1776b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1777c;

    public /* synthetic */ AG_Backup(AllSettings allSettings, View view, int i2) {
        this.f1775a = i2;
        this.f1776b = allSettings;
        this.f1777c = view;
    }

    public final void onClick(View view) {
        int i2 = this.f1775a;
        AllSettings allSettings = this.f1776b;
        View view2 = this.f1777c;
        int i3 = AllSettings.f1138c;
        Objects.requireNonNull(allSettings);
        allSettings.startActivity(BaseSettingsActivity.a(view2, allSettings, BackupRestore.class));
    }
}
