package X;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.0CG  reason: invalid class name */
public class AnonymousClass0CG extends FrameLayout implements AnonymousClass047 {
    public final CollapsibleActionView A00;

    public AnonymousClass0CG(View view) {
        super(view.getContext());
        this.A00 = (CollapsibleActionView) view;
        addView(view);
    }

    public View getWrappedView() {
        return (View) this.A00;
    }

    public void onActionViewCollapsed() {
        this.A00.onActionViewCollapsed();
    }

    public void onActionViewExpanded() {
        this.A00.onActionViewExpanded();
    }
}
