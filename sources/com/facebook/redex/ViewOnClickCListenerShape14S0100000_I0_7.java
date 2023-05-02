package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass1ZK;
import X.AnonymousClass1ZP;
import X.AnonymousClass26Z;
import X.C14750ph;
import X.C14870pt;
import X.C15830rv;
import X.C15860rz;
import X.C16030sJ;
import X.C16620tM;
import X.C30341cC;
import X.C32001fU;
import X.C32601gl;
import X.C447225g;
import X.C46202Cw;
import X.C54242h4;
import X.C54252h5;
import X.C54262h6;
import X.C54272h7;
import X.C54282h8;
import X.C54292hA;
import X.C616839w;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Build;
import android.view.View;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView;
import com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallLinkInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class ViewOnClickCListenerShape14S0100000_I0_7 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape14S0100000_I0_7(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onClick(View view) {
        VoipActivityV2 voipActivityV2;
        SharedPreferences.Editor A0K;
        SharedPreferences sharedPreferences;
        String str;
        C616839w r4;
        switch (this.A01) {
            case 0:
                ((C54292hA) this.A00).AOW();
                return;
            case 1:
                ((C54292hA) this.A00).AOW();
                return;
            case 2:
                ((C54292hA) this.A00).AOW();
                return;
            case 3:
                C46202Cw.A02((C46202Cw) this.A00);
                return;
            case 4:
                C46202Cw.A03((C46202Cw) this.A00);
                return;
            case 5:
                C46202Cw.A04((C46202Cw) this.A00);
                return;
            case 6:
                C46202Cw.A05((C46202Cw) this.A00);
                return;
            case 7:
                C46202Cw.A06((C46202Cw) this.A00);
                return;
            case 8:
                C46202Cw.A07((C46202Cw) this.A00);
                return;
            case 9:
                C46202Cw.A08((C46202Cw) this.A00);
                return;
            case 10:
                C46202Cw.A09((C46202Cw) this.A00);
                return;
            case 11:
                C46202Cw.A0A((C46202Cw) this.A00);
                return;
            case 12:
                AnonymousClass1ZP.A04((AnonymousClass1ZP) this.A00);
                return;
            case 13:
                ((ViewSharedContactArrayActivity) this.A00).toggleCheckBox(view);
                return;
            case 14:
                ((C54282h8) this.A00).APp();
                return;
            case 15:
                AnonymousClass1ZK r2 = ((C54252h5) this.A00).A00;
                if (r2.A0N.A0D()) {
                    r2.A04();
                } else {
                    C54262h6 r3 = r2.A1K;
                    r3.A01++;
                    C15830rv r1 = r3.A06.A00.A0J;
                    if (r1 != null) {
                        if (C16030sJ.A0G(r1)) {
                            C15860rz r0 = r3.A04;
                            A0K = r0.A0K();
                            sharedPreferences = (SharedPreferences) r0.A01.get();
                            str = "ptt_playback_broadcast";
                        } else {
                            boolean A0L = C16030sJ.A0L(r1);
                            C15860rz r02 = r3.A04;
                            A0K = r02.A0K();
                            sharedPreferences = (SharedPreferences) r02.A01.get();
                            str = A0L ? "ptt_playback_group" : "ptt_playback_individual";
                        }
                        A0K.putLong(str, sharedPreferences.getLong(str, 0) + 1).apply();
                    }
                    try {
                        r2.A19.A02(R.string.str12ac);
                        if (r2.A0N.A02() == r2.A0N.A03()) {
                            r2.A0N.A0A(0);
                        }
                        if (r2.A0N.A02() == 0) {
                            r2.A0N.A08();
                        } else {
                            r2.A0N.A07();
                        }
                        r2.A0a.post(r2.A1S);
                        for (C54272h7 A03 : r2.A1I.A01()) {
                            A03.A03();
                        }
                    } catch (IOException e2) {
                        Log.e("voicenoterecordingui/showvoicenotepreview/ error playing voice note preview ", e2);
                    }
                }
                r2.A0B();
                return;
            case 16:
                ((C54242h4) this.A00).AZl();
                return;
            case 17:
                ((VoipActivityV2) this.A00).A3w(true);
                return;
            case 18:
                voipActivityV2 = (VoipActivityV2) this.A00;
                C447225g r03 = voipActivityV2.A12;
                if (r03 != null) {
                    AnonymousClass26Z r42 = r03.A1k;
                    boolean z2 = false;
                    if (r42.A00 == 3) {
                        z2 = true;
                    }
                    r42.A08(Voip.getCallInfo(), !z2);
                    break;
                }
                break;
            case 19:
                VoipActivityV2 voipActivityV22 = (VoipActivityV2) this.A00;
                Log.i("voip/VoipActivityV2/VideoCallParticipantView/cancelButton/onClick");
                if (view.getTag() != null) {
                    Object tag = view.getTag();
                    C447225g r04 = voipActivityV22.A12;
                    if (r04 != null) {
                        r04.A14.execute(new RunnableRunnableShape5S0100000_I0_4(tag, 7));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                VoipActivityV2 voipActivityV23 = (VoipActivityV2) this.A00;
                C447225g r43 = voipActivityV23.A12;
                if (r43 != null) {
                    RunnableRunnableShape5S0100000_I0_4 runnableRunnableShape5S0100000_I0_4 = new RunnableRunnableShape5S0100000_I0_4((Object) r43, 6);
                    if (r43.A2O.A0E(C16620tM.A02, 2903)) {
                        r43.A14.execute(runnableRunnableShape5S0100000_I0_4);
                    } else {
                        runnableRunnableShape5S0100000_I0_4.run();
                    }
                }
                voipActivityV23.A3S();
                return;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                VoipActivityV2 voipActivityV24 = (VoipActivityV2) this.A00;
                Log.i("voip/VoipActivityV2/videoPipParticipantView/onClick");
                if (!Build.DEVICE.equalsIgnoreCase("j7elte")) {
                    CallInfo A3B = voipActivityV24.A3B();
                    if (!VoipActivityV2.A0u(A3B)) {
                        Log.i("voip/VoipActivityV2/switchVideoSurface. ignore switch when it's not a video call");
                        return;
                    }
                    if (voipActivityV24.A1h.size() == 2) {
                        boolean z3 = true;
                        if (voipActivityV24.A16.A03 == 1) {
                            boolean z4 = false;
                            if (voipActivityV24.A1h.size() == 2) {
                                z4 = true;
                            }
                            AnonymousClass00B.A0B("This function can only be called when there are exactly two participants", z4);
                            Iterator it = voipActivityV24.A1h.entrySet().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    if (entry.getValue() != voipActivityV24.A18) {
                                        r4 = (C616839w) entry.getValue();
                                    }
                                } else {
                                    AnonymousClass00B.A0B("Can not be here", false);
                                    r4 = null;
                                }
                            }
                            AnonymousClass00B.A06(r4);
                            VideoCallParticipantView videoCallParticipantView = voipActivityV24.A18.A00;
                            AnonymousClass00B.A04(videoCallParticipantView);
                            VideoCallParticipantView videoCallParticipantView2 = r4.A00;
                            AnonymousClass00B.A04(videoCallParticipantView2);
                            StringBuilder sb = new StringBuilder("voip/VoipActivityV2/switchVideoSurface. show preview on full screen = ");
                            if (videoCallParticipantView2.A03 != 0) {
                                z3 = false;
                            }
                            sb.append(z3);
                            Log.i(sb.toString());
                            r4.A05();
                            voipActivityV24.A18.A05();
                            voipActivityV24.A18.A0A(videoCallParticipantView2);
                            r4.A0A(videoCallParticipantView);
                            voipActivityV24.A3n(A3B);
                            return;
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("voip/VoipActivityV2/switchVideoSurface. switch is allowed only for two participants, # of participants = ");
                    sb2.append(voipActivityV24.A1h.size());
                    Log.w(sb2.toString());
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                voipActivityV2 = (VoipActivityV2) this.A00;
                voipActivityV2.A25 = false;
                CallInfo A3B2 = voipActivityV2.A3B();
                if (A3B2 != null) {
                    CallState callState = A3B2.callState;
                    if ((callState == CallState.ACTIVE || callState == CallState.CONNECTED_LONELY) && !A3B2.callEnding && voipActivityV2.A12 != null) {
                        Log.i("voip/VoipActivityV2/toggleVideoBtn/clicked");
                        C32001fU r6 = A3B2.self;
                        C32001fU defaultPeerInfo = A3B2.getDefaultPeerInfo();
                        if (defaultPeerInfo != null && !defaultPeerInfo.A08) {
                            String A0C = voipActivityV2.A1H.A0C(voipActivityV2.A1E.A0A(defaultPeerInfo.A07));
                            boolean z5 = defaultPeerInfo.A09;
                            C14870pt r22 = voipActivityV2.A05;
                            int i2 = R.string.str1af9;
                            if (z5) {
                                i2 = R.string.str1af8;
                            }
                            r22.A0H(voipActivityV2.getString(i2, new Object[]{A0C}), 0);
                            break;
                        } else {
                            int i3 = r6.A05;
                            if (i3 != 6) {
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        if (i3 == 3) {
                                            voipActivityV2.A12.A14.execute(new RunnableRunnableShape0S0001000_I0(0, 2));
                                            break;
                                        }
                                    } else {
                                        if (voipActivityV2.A20 && voipActivityV2.A0C.A0E(C16620tM.A02, 2222)) {
                                            voipActivityV2.A1A.A02(r6.A07);
                                        }
                                        voipActivityV2.A12.A0L();
                                        view.setSelected(true);
                                        break;
                                    }
                                } else if (!A3B2.isGroupCall) {
                                    UserJid peerJid = A3B2.getPeerJid();
                                    AnonymousClass00B.A06(peerJid);
                                    if (((SharedPreferences) voipActivityV2.A09.A01.get()).getInt("switch_to_video_call_confirmation_dialog_count", 0) >= 5) {
                                        if (voipActivityV2.A42(peerJid, 1, true)) {
                                            C447225g r05 = voipActivityV2.A12;
                                            AnonymousClass00B.A06(r05);
                                            r05.A0J();
                                            break;
                                        }
                                    } else {
                                        voipActivityV2.Afc(new VoipActivityV2.SwitchConfirmationFragment());
                                        break;
                                    }
                                } else {
                                    voipActivityV2.A05.A0H(voipActivityV2.getString(R.string.str1afa), 0);
                                    break;
                                }
                            } else {
                                view.setSelected(false);
                                voipActivityV2.A3k(r6, voipActivityV2.A18);
                                voipActivityV2.A12.A14.execute(new RunnableRunnableShape0S0000000_I0(7));
                                break;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                VoipActivityV2 voipActivityV25 = (VoipActivityV2) this.A00;
                Log.i("voip end call button pressed");
                CallState currentCallState = Voip.getCurrentCallState();
                if (currentCallState == CallState.NONE) {
                    Log.e("voip end call button pressed in NONE state");
                } else if (Voip.A09(currentCallState)) {
                    voipActivityV25.A3f(2);
                    return;
                } else {
                    if (!C32601gl.A04(voipActivityV25.A01, voipActivityV25.A0C) || currentCallState != CallState.LINK) {
                        voipActivityV25.A3L();
                        return;
                    }
                    CallInfo A06 = C30341cC.A06();
                    AnonymousClass00B.A06(A06);
                    int i4 = A06.callLinkState;
                    if (i4 == 1 || i4 == 2) {
                        C447225g r12 = voipActivityV25.A12;
                        if (r12 != null) {
                            r12.A0t(CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID);
                        }
                    } else {
                        voipActivityV25.A3L();
                    }
                }
                voipActivityV25.finish();
                return;
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                VoipActivityV2 voipActivityV26 = (VoipActivityV2) this.A00;
                voipActivityV26.A1w = true;
                if (!voipActivityV26.A3z() || !voipActivityV26.A43(voipActivityV26.A3B())) {
                    voipActivityV26.finish();
                    if (voipActivityV26.getIntent().getBooleanExtra("isTaskRoot", true)) {
                        voipActivityV26.startActivity(C14750ph.A02(voipActivityV26));
                        return;
                    }
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                VoipActivityV2 voipActivityV27 = (VoipActivityV2) this.A00;
                if (voipActivityV27.A12 != null) {
                    Log.i("voip/VoipActivityV2/centerScreenCallStatusButton/resumeWhatsAppCallListener");
                    voipActivityV27.A12.A0u(Voip.getCurrentCallId());
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                VoipActivityV2 voipActivityV28 = (VoipActivityV2) this.A00;
                CallInfo A3B3 = voipActivityV28.A3B();
                if (A3B3 != null && A3B3.self.A05 == 3 && voipActivityV28.A12 != null) {
                    Log.i("voip/VoipActivityV2/centerScreenCallStatusButton/cancelSwitchToVideoCallListener");
                    voipActivityV28.A12.A14.execute(new RunnableRunnableShape0S0001000_I0(0, 2));
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                VoipActivityV2 voipActivityV29 = (VoipActivityV2) this.A00;
                CallInfo A3B4 = voipActivityV29.A3B();
                if (A3B4 != null && A3B4.callState != CallState.NONE) {
                    if (A3B4.videoEnabled) {
                        C32001fU r23 = A3B4.self;
                        if (r23.A05 != 6) {
                            voipActivityV29.A05 = 0;
                            voipActivityV29.A0F.removeMessages(3);
                            Voip.switchCamera();
                            voipActivityV29.A3k(r23, voipActivityV29.A18);
                        }
                    } else {
                        C447225g r06 = voipActivityV29.A12;
                        if (r06 != null) {
                            AnonymousClass26Z r5 = r06.A1k;
                            boolean z6 = true;
                            if (r5.A00 == 1) {
                                z6 = false;
                            }
                            CallInfo callInfo = Voip.getCallInfo();
                            if (z6 && r5.A00 == 3 && !r5.A05) {
                                r5.A08(callInfo, false);
                            }
                            r5.A09(callInfo, z6);
                        }
                    }
                    voipActivityV29.A3S();
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                Log.i("VoipActivityV2 vm cancel onClick");
                ((Activity) this.A00).finish();
                return;
            default:
                ((VoipCallControlBottomSheetV2) this.A00).A1Q(1);
                return;
        }
        voipActivityV2.A3S();
    }
}
