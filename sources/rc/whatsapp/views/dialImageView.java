package rc.whatsapp.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.obwhatsapp.yo.HomeUI;

@SuppressLint({"AppCompatCustomView"})
public class dialImageView extends ImageView {
    public dialImageView(Context context) {
        super(context);
        setColorFilter(HomeUI.dialogTextColor());
    }

    public dialImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setColorFilter(HomeUI.dialogTextColor());
    }

    public dialImageView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setColorFilter(HomeUI.dialogTextColor());
    }
}
