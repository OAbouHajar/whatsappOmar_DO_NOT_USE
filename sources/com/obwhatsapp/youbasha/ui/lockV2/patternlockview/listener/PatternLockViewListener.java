package com.obwhatsapp.youbasha.ui.lockV2.patternlockview.listener;

import com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView;
import java.util.List;

public interface PatternLockViewListener {
    void onCleared();

    void onComplete(List<PatternLockView.Dot> list);

    void onProgress(List<PatternLockView.Dot> list);

    void onStarted();
}
