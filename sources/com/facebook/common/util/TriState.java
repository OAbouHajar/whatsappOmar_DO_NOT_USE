package com.facebook.common.util;

import X.AnonymousClass000;

public enum TriState {
    YES,
    NO,
    UNSET;

    public static TriState fromDbValue(int i2) {
        return i2 != 1 ? i2 != 2 ? UNSET : NO : YES;
    }

    public static TriState valueOf(Boolean bool) {
        return bool != null ? valueOf(bool.booleanValue()) : UNSET;
    }

    public static TriState valueOf(boolean z2) {
        return z2 ? YES : NO;
    }

    public boolean asBoolean() {
        String str;
        switch (ordinal()) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                str = "No boolean equivalent for UNSET";
                break;
            default:
                str = AnonymousClass000.A0g("Unrecognized TriState value: ", this);
                break;
        }
        throw AnonymousClass000.A0V(str);
    }

    public boolean asBoolean(boolean z2) {
        switch (ordinal()) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                return z2;
            default:
                throw AnonymousClass000.A0V(AnonymousClass000.A0g("Unrecognized TriState value: ", this));
        }
    }

    public Boolean asBooleanObject() {
        switch (ordinal()) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return Boolean.FALSE;
            case 2:
                return null;
            default:
                throw AnonymousClass000.A0V(AnonymousClass000.A0g("Unrecognized TriState value: ", this));
        }
    }

    public int getDbValue() {
        switch (ordinal()) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 3;
        }
    }

    public boolean isSet() {
        return this != UNSET;
    }
}
