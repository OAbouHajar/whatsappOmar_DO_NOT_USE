package android.support.v4.view;

import android.os.Build;
import android.view.MenuItem;

public class MenuCompat {
    static final MenuVersionImpl IMPL;

    static class BaseMenuVersionImpl implements MenuVersionImpl {
        BaseMenuVersionImpl() {
        }

        public boolean setShowAsAction(MenuItem menuItem, int i2) {
            return false;
        }
    }

    static class HoneycombMenuVersionImpl implements MenuVersionImpl {
        HoneycombMenuVersionImpl() {
        }

        public boolean setShowAsAction(MenuItem menuItem, int i2) {
            MenuItemCompatHoneycomb.setShowAsAction(menuItem, i2);
            return true;
        }
    }

    interface MenuVersionImpl {
        boolean setShowAsAction(MenuItem menuItem, int i2);
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            IMPL = new HoneycombMenuVersionImpl();
        } else {
            IMPL = new BaseMenuVersionImpl();
        }
    }

    public static boolean setShowAsAction(MenuItem menuItem, int i2) {
        return IMPL.setShowAsAction(menuItem, i2);
    }
}
