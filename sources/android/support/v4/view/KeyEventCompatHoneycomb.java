package android.support.v4.view;

import android.view.KeyEvent;

class KeyEventCompatHoneycomb {
    KeyEventCompatHoneycomb() {
    }

    public static boolean metaStateHasModifiers(int i2, int i3) {
        return KeyEvent.metaStateHasModifiers(i2, i3);
    }

    public static boolean metaStateHasNoModifiers(int i2) {
        return KeyEvent.metaStateHasNoModifiers(i2);
    }

    public static int normalizeMetaState(int i2) {
        return KeyEvent.normalizeMetaState(i2);
    }
}
