package rc.whatsapp.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.youbasha.others;

@SuppressLint({"AppCompatCustomView"})
public class okView extends ImageView {
    public okView(Context context) {
        super(context);
        setColorFilter(others.getColor("ModChatBtnColor", ColorStore.getDefaultListItemSubTitleColor()), PorterDuff.Mode.SRC_ATOP);
    }

    public okView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setColorFilter(others.getColor("ModChatBtnColor", ColorStore.getDefaultListItemSubTitleColor()), PorterDuff.Mode.SRC_ATOP);
    }

    public okView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setColorFilter(others.getColor("ModChatBtnColor", ColorStore.getDefaultListItemSubTitleColor()), PorterDuff.Mode.SRC_ATOP);
    }
}
