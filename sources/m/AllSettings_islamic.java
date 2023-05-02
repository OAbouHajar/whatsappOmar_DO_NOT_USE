package m;

import android.view.View;
import com.obwhatsapp.youbasha.ui.YoSettings.AllSettings;
import com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity;
import java.util.Objects;

public final /* synthetic */ class AllSettings_islamic implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1789a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AllSettings f1790b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1791c;

    public /* synthetic */ AllSettings_islamic(AllSettings allSettings, View view, int i2) {
        this.f1789a = i2;
        this.f1790b = allSettings;
        this.f1791c = view;
    }

    public final void onClick(View view) {
        int i2 = this.f1789a;
        AllSettings allSettings = this.f1790b;
        View view2 = this.f1791c;
        int i3 = AllSettings.f1138c;
        Objects.requireNonNull(allSettings);
        allSettings.startActivity(BaseSettingsActivity.a(view2, allSettings, com.obwhatsapp.youbasha.ui.YoSettings.AllSettings_islamic.class));
    }
}
