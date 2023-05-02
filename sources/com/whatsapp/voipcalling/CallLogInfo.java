package com.whatsapp.voipcalling;

import com.whatsapp.jid.UserJid;
import java.util.LinkedHashMap;
import java.util.Map;

public class CallLogInfo {
    public final int callLogResultType;
    public Map groupCallLogs;
    public final UserJid initialPeerJid;
    public final long rxTotalBytes;
    public final long txTotalBytes;

    public CallLogInfo(UserJid userJid, int i2, long j2, long j3) {
        this.callLogResultType = i2;
        this.txTotalBytes = j2;
        this.rxTotalBytes = j3;
        this.initialPeerJid = userJid;
    }

    public void addGroupCallLog(String str, int i2) {
        Map map = this.groupCallLogs;
        if (map == null) {
            map = new LinkedHashMap();
            this.groupCallLogs = map;
        }
        map.put(str, Integer.valueOf(i2));
    }

    public Map getGroupCallLogs() {
        return this.groupCallLogs;
    }
}
