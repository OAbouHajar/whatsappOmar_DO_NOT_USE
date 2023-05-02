package android.support.v4.view;

import android.view.View;

class ViewCompatGingerbread {
    ViewCompatGingerbread() {
    }

    public static int getOverScrollMode(View view) {
        return view.getOverScrollMode();
    }

    public static void setOverScrollMode(View view, int i2) {
        view.setOverScrollMode(i2);
    }
}
