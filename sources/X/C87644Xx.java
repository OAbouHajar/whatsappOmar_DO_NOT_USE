package X;

import com.mod.bomfab.R$styleable;

/* renamed from: X.4Xx  reason: invalid class name and case insensitive filesystem */
public final class C87644Xx {
    public static String A00(int i2) {
        switch (i2) {
            case 0:
                return "success";
            case 1:
                return "cancel";
            case 2:
                return "failed_insufficient_space";
            case 3:
                return "failed_io";
            case 4:
                return "failed_oom";
            case 5:
                return "failed_bad_media";
            case 6:
                return "failed_no_permissions";
            case 7:
                return "failed_fnf";
            case 8:
                return "failed_server";
            case 9:
                return "failed_request";
            case 10:
                return "failed_request_timeout";
            case 11:
                return "failed_not_finalized";
            case 12:
                return "failed_optimistic_hash";
            case 13:
                return "failed_media_conn";
            case 14:
                return "failed_optimistic_network_unsafe";
            case 15:
                return "failed_throttle";
            case 16:
                return "failed_no_such_algorithm";
            case 17:
                return "failed_network";
            case 18:
                return "failed_watls";
            case 19:
                return "failed_url";
            case 20:
                return "failed_transcoding_unknown";
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                return "failed_file_format_unsupported";
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                return "failed_dns_lookup";
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                return "failed_wamsys";
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                return "failed_too_large";
            default:
                return "undefined";
        }
    }

    public static boolean A01(int i2) {
        return i2 == 17 || i2 == 8 || i2 == 10 || i2 == 13 || i2 == 18 || i2 == 22;
    }
}
