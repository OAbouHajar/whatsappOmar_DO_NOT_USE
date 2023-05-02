package m;

import android.view.View;
import com.obwhatsapp.youbasha.ui.YoSettings.AllSettings;
import com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity;
import java.util.Objects;

public final /* synthetic */ class Assem_Clear implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1792a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AllSettings f1793b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1794c;

    public /* synthetic */ Assem_Clear(AllSettings allSettings, View view, int i2) {
        this.f1792a = i2;
        this.f1793b = allSettings;
        this.f1794c = view;
    }

    public final void onClick(View view) {
        int i2 = this.f1792a;
        AllSettings allSettings = this.f1793b;
        View view2 = this.f1794c;
        int i3 = AllSettings.f1138c;
        Objects.requireNonNull(allSettings);
        allSettings.startActivity(BaseSettingsActivity.a(view2, allSettings, com.obwhatsapp.youbasha.ui.YoSettings.Assem_Clear.class));
    }
}
