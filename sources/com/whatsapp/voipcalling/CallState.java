package com.whatsapp.voipcalling;

public enum CallState {
    NONE,
    CALLING,
    PRE_ACCEPT_RECEIVED,
    RECEIVED_CALL,
    ACCEPT_SENT,
    ACCEPT_RECEIVED,
    ACTIVE,
    ACTIVE_ELSEWHERE,
    RECEIVED_CALL_WITHOUT_OFFER,
    REJOINING,
    LINK,
    CONNECTED_LONELY
}
