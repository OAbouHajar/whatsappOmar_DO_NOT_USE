package m;

import android.view.View;
import com.obwhatsapp.youbasha.ui.YoSettings.AllSettings;
import com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity;
import java.util.Objects;

public final /* synthetic */ class AG_Not implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1781a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AllSettings f1782b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1783c;

    public /* synthetic */ AG_Not(AllSettings allSettings, View view, int i2) {
        this.f1781a = i2;
        this.f1782b = allSettings;
        this.f1783c = view;
    }

    public final void onClick(View view) {
        int i2 = this.f1781a;
        AllSettings allSettings = this.f1782b;
        View view2 = this.f1783c;
        int i3 = AllSettings.f1138c;
        Objects.requireNonNull(allSettings);
        allSettings.startActivity(BaseSettingsActivity.a(view2, allSettings, com.obwhatsapp.youbasha.ui.YoSettings.AG_Not.class));
    }
}
