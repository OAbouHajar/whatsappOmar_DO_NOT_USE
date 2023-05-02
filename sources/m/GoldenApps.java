package m;

import android.view.View;
import com.obwhatsapp.youbasha.ui.YoSettings.AllSettings;
import com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity;
import java.util.Objects;

public final /* synthetic */ class GoldenApps implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1795a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AllSettings f1796b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1797c;

    public /* synthetic */ GoldenApps(AllSettings allSettings, View view, int i2) {
        this.f1795a = i2;
        this.f1796b = allSettings;
        this.f1797c = view;
    }

    public final void onClick(View view) {
        int i2 = this.f1795a;
        AllSettings allSettings = this.f1796b;
        View view2 = this.f1797c;
        int i3 = AllSettings.f1138c;
        Objects.requireNonNull(allSettings);
        allSettings.startActivity(BaseSettingsActivity.a(view2, allSettings, com.obwhatsapp.youbasha.ui.YoSettings.GoldenApps.class));
    }
}
