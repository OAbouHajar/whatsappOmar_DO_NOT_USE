package com.mod.libs;

import java.util.Observable;

public class TGlobal extends Observable {
    private static TGlobal thisPublic = new TGlobal();

    public static TGlobal GetPublic() {
        return thisPublic;
    }

    public void PostGlobalEvent(Object obj) {
        synchronized (this) {
            setChanged();
            notifyObservers(obj);
        }
    }
}
