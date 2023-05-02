package X;

import android.content.SharedPreferences;

/* renamed from: X.1BK  reason: invalid class name */
public class AnonymousClass1BK {
    public SharedPreferences A00;
    public final C17020u3 A01;

    public AnonymousClass1BK(C17020u3 r1) {
        this.A01 = r1;
    }

    public static final String A00(int i2) {
        if (i2 == 0) {
            return "golden_box_contact";
        }
        switch (i2) {
            case 2:
                return "golden_box_broadcast";
            case 3:
                return "info_screen_contact";
            case 4:
                return "info_screen_group";
            case 5:
                return "info_screen_broadcast";
            case 6:
                return "calls_list";
            case 7:
                return "chats_list";
            case 8:
                return "status_list";
            case 9:
                return "linked_devices";
            case 10:
                return "calling_screen_audio";
            case 11:
                return "calling_screen_video";
            default:
                return "golden_box_group";
        }
    }
}
