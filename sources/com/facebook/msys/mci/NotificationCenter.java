package com.facebook.msys.mci;

import X.AnonymousClass00B;
import X.AnonymousClass4ZV;
import X.AnonymousClass5NX;
import X.C65223To;
import X.C83254Fy;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NotificationCenter {
    public static final String TAG = "NotificationCenter";
    public final Set mMainConfig;
    public NativeHolder mNativeHolder;
    public final Map mNativeScopeToJavaScope;
    public final Map mObserverConfigs;

    public interface NotificationCallback {
        void onNewNotification(String str, AnonymousClass5NX r2, Map map);
    }

    public NotificationCenter() {
        this(false);
    }

    public NotificationCenter(boolean z2) {
        this.mNativeScopeToJavaScope = new HashMap();
        this.mObserverConfigs = new HashMap();
        this.mMainConfig = new HashSet();
        if (!z2) {
            this.mNativeHolder = initNativeHolder();
        }
    }

    private boolean addObserverConfig(NotificationCallback notificationCallback, String str, AnonymousClass5NX r5) {
        Set set;
        AnonymousClass4ZV r1 = (AnonymousClass4ZV) this.mObserverConfigs.get(notificationCallback);
        if (r1 == null) {
            r1 = new AnonymousClass4ZV();
            this.mObserverConfigs.put(notificationCallback, r1);
        }
        if (r5 == null) {
            set = r1.A01;
        } else {
            Map map = r1.A00;
            set = (Set) map.get(r5);
            if (set == null) {
                set = new HashSet();
                map.put(r5, set);
            }
        }
        return set.add(str);
    }

    private native void addObserverNative(String str);

    private void addScopeToMappingOfNativeToJava(AnonymousClass5NX r4) {
        this.mNativeScopeToJavaScope.put(Long.valueOf(r4.getNativeReference()), r4);
    }

    private void dispatchNotificationToCallbacks(String str, Long l2, Object obj) {
        String str2;
        Set set;
        Object obj2 = obj;
        if (obj == null || (obj instanceof Map)) {
            Map map = (Map) obj2;
            ArrayList arrayList = new ArrayList();
            AnonymousClass5NX r4 = null;
            synchronized (this) {
                if (l2 != null) {
                    r4 = (AnonymousClass5NX) this.mNativeScopeToJavaScope.get(l2);
                }
                Iterator it = this.mObserverConfigs.entrySet().iterator();
                while (true) {
                    str2 = str;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    AnonymousClass4ZV r1 = (AnonymousClass4ZV) entry.getValue();
                    if (r1.A01.contains(str) || ((set = (Set) r1.A00.get(r4)) != null && set.contains(str))) {
                        arrayList.add((NotificationCallback) entry.getKey());
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Execution.executePossiblySync(new C65223To(r4, this, str2, arrayList, map), 1);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Native layer of msys reported a notification whose payload could not be serialized into a Java Map. Instead, it's of type ");
        sb.append(obj.getClass().getName());
        throw new RuntimeException(sb.toString());
    }

    private native NativeHolder initNativeHolder();

    private boolean notificationNameExistsInSomeObserver(String str) {
        for (Map.Entry value : this.mObserverConfigs.entrySet()) {
            AnonymousClass4ZV r1 = (AnonymousClass4ZV) value.getValue();
            if (r1.A01.contains(str)) {
                return true;
            }
            Iterator it = new HashSet(r1.A00.entrySet()).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Set) ((Map.Entry) it.next()).getValue()).contains(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean observerHasConfig(NotificationCallback notificationCallback, String str, AnonymousClass5NX r4) {
        Set set;
        AnonymousClass4ZV r0 = (AnonymousClass4ZV) this.mObserverConfigs.get(notificationCallback);
        if (r0 == null) {
            return false;
        }
        if (r4 == null) {
            set = r0.A01;
        } else {
            set = (Set) r0.A00.get(r4);
            if (set == null) {
                return false;
            }
        }
        return set.contains(str);
    }

    private boolean removeObserverConfig(NotificationCallback notificationCallback, String str, AnonymousClass5NX r7) {
        boolean z2;
        AnonymousClass4ZV r3 = (AnonymousClass4ZV) this.mObserverConfigs.get(notificationCallback);
        if (r3 == null) {
            return false;
        }
        if (r7 == null) {
            z2 = r3.A01.remove(str);
        } else {
            Map map = r3.A00;
            Set set = (Set) map.get(r7);
            if (set != null) {
                z2 = set.remove(str);
                if (set.isEmpty()) {
                    map.remove(r7);
                }
            } else {
                z2 = false;
            }
        }
        if (r3.A01.isEmpty() && r3.A00.isEmpty()) {
            this.mObserverConfigs.remove(notificationCallback);
        }
        return z2;
    }

    private native void removeObserverNative(String str);

    private void removeScopeFromNativeToJavaMappings(AnonymousClass5NX r4) {
        this.mNativeScopeToJavaScope.remove(Long.valueOf(r4.getNativeReference()));
    }

    private boolean scopeExistInAnyConfig(AnonymousClass5NX r4) {
        if (r4 != null) {
            for (Map.Entry value : this.mObserverConfigs.entrySet()) {
                if (((AnonymousClass4ZV) value.getValue()).A00.containsKey(r4)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void setNativeHolder(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public synchronized void addObserver(NotificationCallback notificationCallback, String str, AnonymousClass5NX r4) {
        AnonymousClass00B.A06(notificationCallback);
        AnonymousClass00B.A06(str);
        if (!observerHasConfig(notificationCallback, str, r4)) {
            if (r4 != null) {
                addScopeToMappingOfNativeToJava(r4);
            }
            addObserverConfig(notificationCallback, str, r4);
            if (this.mMainConfig.add(str)) {
                addObserverNative(str);
            }
        }
    }

    public synchronized void removeEveryObserver(NotificationCallback notificationCallback) {
        AnonymousClass4ZV r5;
        AnonymousClass00B.A06(notificationCallback);
        AnonymousClass4ZV r7 = (AnonymousClass4ZV) this.mObserverConfigs.get(notificationCallback);
        if (r7 != null) {
            C83254Fy r6 = new C83254Fy(notificationCallback, this);
            synchronized (r7) {
                HashSet hashSet = new HashSet(r7.A01);
                HashMap hashMap = new HashMap();
                Iterator it = new HashSet(r7.A00.entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    hashMap.put((AnonymousClass5NX) entry.getKey(), new HashSet((Collection) entry.getValue()));
                }
                r5 = new AnonymousClass4ZV(hashMap, hashSet);
            }
            for (String removeObserver : r5.A01) {
                r6.A01.removeObserver(r6.A00, removeObserver, (AnonymousClass5NX) null);
            }
            for (Map.Entry entry2 : r5.A00.entrySet()) {
                AnonymousClass5NX r4 = (AnonymousClass5NX) entry2.getKey();
                for (String removeObserver2 : (Set) entry2.getValue()) {
                    r6.A01.removeObserver(r6.A00, removeObserver2, r4);
                }
            }
            this.mObserverConfigs.remove(notificationCallback);
        }
    }

    public synchronized void removeObserver(NotificationCallback notificationCallback, String str, AnonymousClass5NX r4) {
        AnonymousClass00B.A06(notificationCallback);
        AnonymousClass00B.A06(str);
        if (observerHasConfig(notificationCallback, str, r4)) {
            removeObserverConfig(notificationCallback, str, r4);
            if (r4 != null && !scopeExistInAnyConfig(r4)) {
                removeScopeFromNativeToJavaMappings(r4);
            }
            if (!notificationNameExistsInSomeObserver(str)) {
                this.mMainConfig.remove(str);
                removeObserverNative(str);
            }
        }
    }
}
