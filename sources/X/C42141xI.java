package X;

import com.obwhatsapp.calling.crypto.DefaultCryptoCallback;

/* renamed from: X.1xI  reason: invalid class name and case insensitive filesystem */
public class C42141xI {
    public static int A00(byte b2, int i2, boolean z2) {
        if (b2 != 1) {
            int i3 = 5;
            if (b2 != 2) {
                if (b2 != 3) {
                    if (b2 == 4) {
                        return 7;
                    }
                    if (b2 == 5) {
                        return 6;
                    }
                    if (b2 == 9) {
                        return 8;
                    }
                    if (b2 == 16) {
                        return 14;
                    }
                    i3 = 20;
                    if (b2 == 20) {
                        return 16;
                    }
                    if (b2 == 23) {
                        return 18;
                    }
                    if (b2 == 35) {
                        return 21;
                    }
                    if (b2 == 49) {
                        return 28;
                    }
                    if (b2 == 52) {
                        return 29;
                    }
                    if (b2 == 69) {
                        return 43;
                    }
                    if (b2 != 80) {
                        if (b2 != 57) {
                            if (b2 == 58) {
                                return 42;
                            }
                            if (b2 != 62) {
                                if (b2 == 63) {
                                    return 8;
                                }
                                switch (b2) {
                                    case 12:
                                        return 12;
                                    case 13:
                                        return 11;
                                    case 14:
                                        return 13;
                                    default:
                                        switch (b2) {
                                            case 42:
                                                break;
                                            case 43:
                                                break;
                                            case 44:
                                                return 24;
                                            case 45:
                                                return 25;
                                            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*46*/:
                                                return 26;
                                            default:
                                                return z2 ? 9 : 1;
                                        }
                                }
                            }
                        }
                    }
                }
                return 3;
            } else if (i2 == 1) {
                return i3;
            } else {
                return 4;
            }
            return i3;
        }
        return 2;
    }

    public static int A01(int i2) {
        switch (i2) {
            case -1:
                return 27;
            case 0:
            case 14:
                return 1;
            case 1:
                return 29;
            case 2:
                return 4;
            case 3:
                return 3;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 11:
                return 17;
            case 12:
                return 18;
            case 13:
                return 11;
            case 15:
                return 26;
            case 16:
                return 25;
            case 17:
                return 28;
            case 18:
                return 20;
            case 19:
                return 21;
            default:
                return 2;
        }
    }

    public static Long A02(Long l2, boolean z2) {
        long j2;
        double d2;
        double d3;
        if (l2 == null) {
            return null;
        }
        if (!z2) {
            return l2;
        }
        long longValue = l2.longValue();
        if (longValue < 100) {
            d2 = (double) longValue;
            d3 = 50.0d;
        } else if (longValue < 1000) {
            d2 = (double) longValue;
            d3 = 100.0d;
        } else if (longValue < 10000) {
            d2 = (double) longValue;
            d3 = 1000.0d;
        } else if (longValue <= 20000) {
            d2 = (double) longValue;
            d3 = 5000.0d;
        } else {
            j2 = AnonymousClass1NO.A0L;
            return Long.valueOf(j2);
        }
        j2 = (long) (Math.ceil(d2 / d3) * d3);
        return Long.valueOf(j2);
    }
}
