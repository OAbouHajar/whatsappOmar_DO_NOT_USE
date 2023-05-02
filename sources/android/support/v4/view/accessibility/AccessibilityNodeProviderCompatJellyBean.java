package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

class AccessibilityNodeProviderCompatJellyBean {

    interface AccessibilityNodeInfoBridge {
        Object createAccessibilityNodeInfo(int i2);

        List<Object> findAccessibilityNodeInfosByText(String str, int i2);

        boolean performAction(int i2, int i3, Bundle bundle);
    }

    AccessibilityNodeProviderCompatJellyBean() {
    }

    public static Object newAccessibilityNodeProviderBridge(final AccessibilityNodeInfoBridge accessibilityNodeInfoBridge) {
        return new AccessibilityNodeProvider() {
            public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
                return (AccessibilityNodeInfo) accessibilityNodeInfoBridge.createAccessibilityNodeInfo(i2);
            }

            public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i2) {
                return accessibilityNodeInfoBridge.findAccessibilityNodeInfosByText(str, i2);
            }

            public boolean performAction(int i2, int i3, Bundle bundle) {
                return accessibilityNodeInfoBridge.performAction(i2, i3, bundle);
            }
        };
    }
}
