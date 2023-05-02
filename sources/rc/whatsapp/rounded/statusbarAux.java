package rc.whatsapp.rounded;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.youbasha.others;

public class statusbarAux extends View {
    public statusbarAux(Context context) {
        super(context);
        setBackgroundColor(others.getColor("ModDarkConPickColor", ColorStore.getPrimaryColorStatusBar()));
    }

    public statusbarAux(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundColor(others.getColor("ModDarkConPickColor", ColorStore.getPrimaryColorStatusBar()));
    }

    public statusbarAux(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setBackgroundColor(others.getColor("ModDarkConPickColor", ColorStore.getPrimaryColorStatusBar()));
    }
}
