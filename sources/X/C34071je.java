package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1je  reason: invalid class name and case insensitive filesystem */
public class C34071je {
    public static final Map A00;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("jid_ready", 1);
        hashMap.put("chat_ready", 2);
        hashMap.put("labeled_jids_ready", 1);
        hashMap.put("links_ready", 2);
        hashMap.put("text_ready", 1);
        hashMap.put("new_vcards_ready", 1);
        hashMap.put("future_ready", 1);
        hashMap.put("call_log_ready", 1);
        hashMap.put("missed_calls_ready", 1);
        hashMap.put("quoted_message_ready", 2);
        hashMap.put("system_message_ready", 2);
        hashMap.put("mention_message_ready", 1);
        hashMap.put("revoked_ready", 1);
        hashMap.put("frequent_ready", 1);
        hashMap.put("location_ready", 2);
        hashMap.put("media_message_ready", 2);
        hashMap.put("media_message_fixer_ready", 3);
        hashMap.put("send_count_ready", 1);
        hashMap.put("thumbnail_ready", 2);
        hashMap.put("new_pay_transaction_ready", 1);
        hashMap.put("main_message_ready", 1);
        A00 = Collections.unmodifiableMap(hashMap);
    }
}
