package android.support.v4.view;

import android.os.Build;
import android.view.KeyEvent;

public class KeyEventCompat {
    static final KeyEventVersionImpl IMPL;

    static class BaseKeyEventVersionImpl implements KeyEventVersionImpl {
        private static final int META_ALL_MASK = 247;
        private static final int META_MODIFIER_MASK = 247;

        BaseKeyEventVersionImpl() {
        }

        private static int metaStateFilterDirectionalModifiers(int i2, int i3, int i4, int i5, int i6) {
            boolean z2 = true;
            boolean z3 = (i3 & i4) != 0;
            int i7 = i5 | i6;
            if ((i3 & i7) == 0) {
                z2 = false;
            }
            if (!z3) {
                return z2 ? i2 & (i4 ^ -1) : i2;
            }
            if (!z2) {
                return i2 & (i7 ^ -1);
            }
            throw new IllegalArgumentException("bad arguments");
        }

        public boolean isTracking(KeyEvent keyEvent) {
            return false;
        }

        public boolean metaStateHasModifiers(int i2, int i3) {
            return metaStateFilterDirectionalModifiers(metaStateFilterDirectionalModifiers(normalizeMetaState(i2) & 247, i3, 1, 64, 128), i3, 2, 16, 32) == i3;
        }

        public boolean metaStateHasNoModifiers(int i2) {
            return (normalizeMetaState(i2) & 247) == 0;
        }

        public int normalizeMetaState(int i2) {
            if ((i2 & 192) != 0) {
                i2 |= 1;
            }
            if ((i2 & 48) != 0) {
                i2 |= 2;
            }
            return i2 & 247;
        }

        public void startTracking(KeyEvent keyEvent) {
        }
    }

    static class EclairKeyEventVersionImpl extends BaseKeyEventVersionImpl {
        EclairKeyEventVersionImpl() {
        }

        public boolean isTracking(KeyEvent keyEvent) {
            return KeyEventCompatEclair.isTracking(keyEvent);
        }

        public void startTracking(KeyEvent keyEvent) {
            KeyEventCompatEclair.startTracking(keyEvent);
        }
    }

    static class HoneycombKeyEventVersionImpl extends EclairKeyEventVersionImpl {
        HoneycombKeyEventVersionImpl() {
        }

        public boolean metaStateHasModifiers(int i2, int i3) {
            return KeyEventCompatHoneycomb.metaStateHasModifiers(i2, i3);
        }

        public boolean metaStateHasNoModifiers(int i2) {
            return KeyEventCompatHoneycomb.metaStateHasNoModifiers(i2);
        }

        public int normalizeMetaState(int i2) {
            return KeyEventCompatHoneycomb.normalizeMetaState(i2);
        }
    }

    interface KeyEventVersionImpl {
        boolean isTracking(KeyEvent keyEvent);

        boolean metaStateHasModifiers(int i2, int i3);

        boolean metaStateHasNoModifiers(int i2);

        int normalizeMetaState(int i2);

        void startTracking(KeyEvent keyEvent);
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            IMPL = new HoneycombKeyEventVersionImpl();
        } else {
            IMPL = new BaseKeyEventVersionImpl();
        }
    }

    public static boolean hasModifiers(KeyEvent keyEvent, int i2) {
        return IMPL.metaStateHasModifiers(keyEvent.getMetaState(), i2);
    }

    public static boolean hasNoModifiers(KeyEvent keyEvent) {
        return IMPL.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public static boolean isTracking(KeyEvent keyEvent) {
        return IMPL.isTracking(keyEvent);
    }

    public static boolean metaStateHasModifiers(int i2, int i3) {
        return IMPL.metaStateHasModifiers(i2, i3);
    }

    public static boolean metaStateHasNoModifiers(int i2) {
        return IMPL.metaStateHasNoModifiers(i2);
    }

    public static int normalizeMetaState(int i2) {
        return IMPL.normalizeMetaState(i2);
    }

    public static void startTracking(KeyEvent keyEvent) {
        IMPL.startTracking(keyEvent);
    }
}
