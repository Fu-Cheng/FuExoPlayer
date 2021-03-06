package com.chengfu.fuexoplayer;

public interface IVideoController {
    void setMediaPlayer(IMediaPlayer player);

    void show();

    void show(int timeout);

    void hide();

    void hideNow();

    void setEnabled(boolean enabled);

    boolean isShowing();
}
