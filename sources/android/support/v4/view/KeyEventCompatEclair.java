package android.support.v4.view;

import android.view.KeyEvent;

class KeyEventCompatEclair {
    KeyEventCompatEclair() {
    }

    public static boolean isTracking(KeyEvent keyEvent) {
        return keyEvent.isTracking();
    }

    public static void startTracking(KeyEvent keyEvent) {
        keyEvent.startTracking();
    }
}
