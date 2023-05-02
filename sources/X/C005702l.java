package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.view.MotionEventCompat;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.obwhatsapp.R;

/* renamed from: X.02l  reason: invalid class name and case insensitive filesystem */
public class C005702l extends C005802m implements DialogInterface {
    public final C06490Wi A00 = new C06490Wi(getContext(), getWindow(), this);

    public C005702l(Context context, int i2) {
        super(context, A00(context, i2));
    }

    public static int A00(Context context, int i2) {
        if (((i2 >>> 24) & MotionEventCompat.ACTION_MASK) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.attr0033, typedValue, true);
        return typedValue.resourceId;
    }

    public void A03(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C06490Wi r2 = this.A00;
        Message obtainMessage = r2.A08.obtainMessage(i2, onClickListener);
        if (i2 == -3) {
            r2.A0O = charSequence;
            r2.A0A = obtainMessage;
        } else if (i2 != -2) {
            r2.A0P = charSequence;
            r2.A0B = obtainMessage;
        } else {
            r2.A0N = charSequence;
            r2.A09 = obtainMessage;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00.A03();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A00.A0M;
        if (nestedScrollView == null || !nestedScrollView.A0B(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A00.A0M;
        if (nestedScrollView == null || !nestedScrollView.A0B(keyEvent)) {
            return super.onKeyUp(i2, keyEvent);
        }
        return true;
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C06490Wi r0 = this.A00;
        r0.A0R = charSequence;
        TextView textView = r0.A0L;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
