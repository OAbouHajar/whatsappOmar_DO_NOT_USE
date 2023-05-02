package X;

import com.mod.bomfab.R$styleable;

/* renamed from: X.1SU  reason: invalid class name */
public class AnonymousClass1SU {
    public static final AnonymousClass427 A00(int i2, int i3) {
        if (i2 == 1) {
            return AnonymousClass427.OK;
        }
        if (i2 == 2) {
            return AnonymousClass427.YES;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return AnonymousClass427.YES_WITH_CODE;
            }
        } else if (i3 == 2) {
            return AnonymousClass427.ERROR_BLOCKED;
        } else {
            if (i3 == 26) {
                return AnonymousClass427.ERROR_LIMITED_RELEASE;
            }
            if (i3 == 23) {
                return AnonymousClass427.SECURITY_CODE;
            }
            if (i3 == 24) {
                return AnonymousClass427.ERROR_INVALID_SKEY_SIGNATURE;
            }
            switch (i3) {
                case 6:
                    return AnonymousClass427.ERROR_TEMPORARILY_UNAVAILABLE;
                case 7:
                    return AnonymousClass427.ERROR_OLD_VERSION;
                case 8:
                    return AnonymousClass427.ERROR_TOO_RECENT;
                case 9:
                    return AnonymousClass427.ERROR_TOO_MANY;
                case 10:
                    return AnonymousClass427.ERROR_NEXT_METHOD;
                case 11:
                    return AnonymousClass427.ERROR_TOO_MANY_GUESSES;
                case 12:
                    return AnonymousClass427.ERROR_BAD_PARAMETER;
                case 13:
                    return AnonymousClass427.ERROR_MISSING_PARAMETER;
                case 14:
                    return AnonymousClass427.ERROR_PROVIDER_TIMEOUT;
                case 15:
                    return AnonymousClass427.ERROR_PROVIDER_UNROUTABLE;
                case 16:
                    return AnonymousClass427.ERROR_BAD_TOKEN;
                case 17:
                    return AnonymousClass427.ERROR_TOO_MANY_ALL_METHODS;
                case 18:
                    return AnonymousClass427.ERROR_NO_ROUTES;
                default:
                    switch (i3) {
                        case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                            return AnonymousClass427.ERROR_FLASH_CALL_DISABLED;
                        case 30:
                            return AnonymousClass427.ERROR_DEVICE_CONFIRM_OR_SECOND_OTP;
                        case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                            return AnonymousClass427.ERROR_SECOND_OTP;
                        case 32:
                            return AnonymousClass427.ERROR_NOT_ALLOWED;
                    }
            }
        }
        return AnonymousClass427.ERROR_UNSPECIFIED;
    }

    public static final C31631em A01(int i2, int i3) {
        if (i2 == 1) {
            return C31631em.YES;
        }
        if (i2 != 3) {
            if (i2 == 5) {
                return C31631em.VERIFIED_STANDALONE;
            }
        } else if (i3 == 2) {
            return C31631em.FAIL_BLOCKED;
        } else {
            if (i3 == 6) {
                return C31631em.FAIL_TEMPORARILY_UNAVAILABLE;
            }
            if (i3 == 11) {
                return C31631em.FAIL_TOO_MANY_GUESSES;
            }
            if (i3 == 26) {
                return C31631em.ERROR_LIMITED_RELEASE;
            }
            switch (i3) {
                case 19:
                    return C31631em.FAIL_MISMATCH;
                case 20:
                    return C31631em.FAIL_GUESSED_TOO_FAST;
                case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                    return C31631em.FAIL_MISSING;
                case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                    return C31631em.FAIL_STALE;
                case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                    return C31631em.SECURITY_CODE;
                default:
                    switch (i3) {
                        case 30:
                            return C31631em.DEVICE_CONFIRM_OR_SECOND_OTP;
                        case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                            return C31631em.SECOND_OTP;
                        case 32:
                            return C31631em.FAIL_NOT_ALLOWED;
                    }
            }
        }
        return C31631em.ERROR_UNSPECIFIED;
    }
}
