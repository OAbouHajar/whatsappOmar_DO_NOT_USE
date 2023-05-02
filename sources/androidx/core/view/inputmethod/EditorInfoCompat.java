package androidx.core.view.inputmethod;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

public final class EditorInfoCompat {
    public static final String CONTENT_MIME_TYPES_INTEROP_KEY = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    public static final String CONTENT_MIME_TYPES_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    public static final String CONTENT_SELECTION_END_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";
    public static final String CONTENT_SELECTION_HEAD_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";
    public static final String CONTENT_SURROUNDING_TEXT_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final int IME_FLAG_FORCE_ASCII = Integer.MIN_VALUE;
    public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 16777216;
    public static final int MAX_INITIAL_SELECTION_LENGTH = 1024;
    public static final int MEMORY_EFFICIENT_TEXT_LENGTH = 2048;

    public class Api30Impl {
        public static CharSequence getInitialSelectedText(EditorInfo editorInfo, int i2) {
            return editorInfo.getInitialSelectedText(i2);
        }

        public static CharSequence getInitialTextAfterCursor(EditorInfo editorInfo, int i2, int i3) {
            return editorInfo.getInitialTextAfterCursor(i2, i3);
        }

        public static CharSequence getInitialTextBeforeCursor(EditorInfo editorInfo, int i2, int i3) {
            return editorInfo.getInitialTextBeforeCursor(i2, i3);
        }

        public static void setInitialSurroundingSubText(EditorInfo editorInfo, CharSequence charSequence, int i2) {
            editorInfo.setInitialSurroundingSubText(charSequence, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r0 != null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] getContentMimeTypes(android.view.inputmethod.EditorInfo r2) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 25
            if (r1 < r0) goto L_0x000b
            java.lang.String[] r0 = r2.contentMimeTypes
        L_0x0008:
            if (r0 == 0) goto L_0x0020
        L_0x000a:
            return r0
        L_0x000b:
            android.os.Bundle r1 = r2.extras
            if (r1 == 0) goto L_0x0020
            java.lang.String r0 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String[] r0 = r1.getStringArray(r0)
            if (r0 != 0) goto L_0x000a
            android.os.Bundle r1 = r2.extras
            java.lang.String r0 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String[] r0 = r1.getStringArray(r0)
            goto L_0x0008
        L_0x0020:
            java.lang.String[] r0 = EMPTY_STRING_ARRAY
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.inputmethod.EditorInfoCompat.getContentMimeTypes(android.view.inputmethod.EditorInfo):java.lang.String[]");
    }

    public static CharSequence getInitialSelectedText(EditorInfo editorInfo, int i2) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getInitialSelectedText(editorInfo, i2);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle != null) {
            int i3 = editorInfo.initialSelStart;
            int i4 = editorInfo.initialSelEnd;
            int min = Math.min(i3, i4);
            int max = Math.max(i3, i4);
            int i5 = bundle.getInt(CONTENT_SELECTION_HEAD_KEY);
            int i6 = editorInfo.extras.getInt(CONTENT_SELECTION_END_KEY);
            int i7 = max - min;
            if (editorInfo.initialSelStart >= 0 && editorInfo.initialSelEnd >= 0 && i6 - i5 == i7 && (charSequence = editorInfo.extras.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY)) != null) {
                return (i2 & 1) != 0 ? charSequence.subSequence(i5, i6) : TextUtils.substring(charSequence, i5, i6);
            }
        }
        return null;
    }

    public static CharSequence getInitialTextAfterCursor(EditorInfo editorInfo, int i2, int i3) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getInitialTextAfterCursor(editorInfo, i2, i3);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY)) == null) {
            return null;
        }
        int i4 = editorInfo.extras.getInt(CONTENT_SELECTION_END_KEY);
        int min = Math.min(i2, charSequence.length() - i4) + i4;
        return (i3 & 1) != 0 ? charSequence.subSequence(i4, min) : TextUtils.substring(charSequence, i4, min);
    }

    public static CharSequence getInitialTextBeforeCursor(EditorInfo editorInfo, int i2, int i3) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getInitialTextBeforeCursor(editorInfo, i2, i3);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(CONTENT_SURROUNDING_TEXT_KEY)) == null) {
            return null;
        }
        int i4 = editorInfo.extras.getInt(CONTENT_SELECTION_HEAD_KEY);
        int i5 = i3 & 1;
        int min = i4 - Math.min(i2, i4);
        return i5 != 0 ? charSequence.subSequence(min, i4) : TextUtils.substring(charSequence, min, i4);
    }

    public static int getProtocol(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            return 1;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle != null) {
            boolean containsKey = bundle.containsKey(CONTENT_MIME_TYPES_KEY);
            boolean containsKey2 = editorInfo.extras.containsKey(CONTENT_MIME_TYPES_INTEROP_KEY);
            if (containsKey) {
                return containsKey2 ? 4 : 3;
            }
            if (containsKey2) {
                return 2;
            }
        }
        return 0;
    }

    public static boolean isCutOnSurrogate(CharSequence charSequence, int i2, int i3) {
        if (i3 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i2));
        }
        if (i3 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i2));
    }

    public static boolean isPasswordInputType(int i2) {
        int i3 = i2 & 4095;
        return i3 == 129 || i3 == 225 || i3 == 18;
    }

    public static void setContentMimeTypes(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            bundle = new Bundle();
            editorInfo.extras = bundle;
        }
        bundle.putStringArray(CONTENT_MIME_TYPES_KEY, strArr);
        editorInfo.extras.putStringArray(CONTENT_MIME_TYPES_INTEROP_KEY, strArr);
    }

    public static void setInitialSurroundingSubText(EditorInfo editorInfo, CharSequence charSequence, int i2) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setInitialSurroundingSubText(editorInfo, charSequence, i2);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 - i2;
        int i6 = i5;
        if (i3 > i4) {
            i5 = i4 - i2;
        }
        if (i3 <= i4) {
            i6 = i4 - i2;
        }
        int length = charSequence.length();
        if (i2 < 0 || i5 < 0 || i6 > length || isPasswordInputType(editorInfo.inputType)) {
            setSurroundingText(editorInfo, (CharSequence) null, 0, 0);
        } else if (length <= 2048) {
            setSurroundingText(editorInfo, charSequence, i5, i6);
        } else {
            trimLongSurroundingText(editorInfo, charSequence, i5, i6);
        }
    }

    public static void setInitialSurroundingText(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setInitialSurroundingSubText(editorInfo, charSequence, 0);
        } else {
            setInitialSurroundingSubText(editorInfo, charSequence, 0);
        }
    }

    public static void setSurroundingText(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence(CONTENT_SURROUNDING_TEXT_KEY, charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt(CONTENT_SELECTION_HEAD_KEY, i2);
        editorInfo.extras.putInt(CONTENT_SELECTION_END_KEY, i3);
    }

    public static void trimLongSurroundingText(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        CharSequence subSequence;
        int i4 = i3 - i2;
        int i5 = i4;
        if (i4 > 1024) {
            i5 = 0;
        }
        int i6 = 2048 - i5;
        int min = Math.min(charSequence.length() - i3, i6 - Math.min(i2, (int) (((double) i6) * 0.8d)));
        int min2 = Math.min(i2, i6 - min);
        int i7 = i2 - min2;
        if (Character.isLowSurrogate(charSequence.charAt(i7))) {
            i7++;
            min2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i3 + min) - 1))) {
            min--;
        }
        int i8 = min2 + i5;
        int i9 = i8 + min;
        if (i5 != i4) {
            subSequence = TextUtils.concat(new CharSequence[]{charSequence.subSequence(i7, i7 + min2), charSequence.subSequence(i3, min + i3)});
        } else {
            subSequence = charSequence.subSequence(i7, i9 + i7);
        }
        setSurroundingText(editorInfo, subSequence, min2, i8);
    }
}
