package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: X.0D8  reason: invalid class name */
public class AnonymousClass0D8 extends AnonymousClass0CV {
    public MenuItem A00;
    public C12970lG A01;
    public final int A02;
    public final int A03;

    public AnonymousClass0D8(Context context, boolean z2) {
        super(context, z2);
        Configuration configuration = context.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
            this.A02 = 22;
            this.A03 = 21;
            return;
        }
        this.A02 = 21;
        this.A03 = 22;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i2;
        int pointToPosition;
        int i3;
        if (this.A01 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i2 = headerViewListAdapter.getHeadersCount();
                adapter = headerViewListAdapter.getWrappedAdapter();
            } else {
                i2 = 0;
            }
            AnonymousClass0C5 r4 = (AnonymousClass0C5) adapter;
            C07290av r3 = null;
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i3 = pointToPosition - i2) >= 0 && i3 < r4.getCount()) {
                r3 = r4.getItem(i3);
            }
            MenuItem menuItem = this.A00;
            if (menuItem != r3) {
                C016607w r1 = r4.A01;
                if (menuItem != null) {
                    this.A01.AST(menuItem, r1);
                }
                this.A00 = r3;
                if (r3 != null) {
                    this.A01.ASS(r3, r1);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null) {
            if (i2 == this.A02) {
                if (listMenuItemView.isEnabled() && listMenuItemView.A0D.hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (i2 == this.A03) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((AnonymousClass0C5) adapter).A01.A0G(false);
                return true;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public void setHoverListener(C12970lG r1) {
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
