package com.facebook.msys.mci;

import java.util.UUID;

public class DefaultUUID implements UUID {
    public static final UUID mUUID = new DefaultUUID();

    public static UUID get() {
        return mUUID;
    }

    public String createString() {
        return UUID.randomUUID().toString();
    }
}
