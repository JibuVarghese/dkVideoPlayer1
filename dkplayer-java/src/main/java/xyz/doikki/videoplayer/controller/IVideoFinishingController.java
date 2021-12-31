package xyz.doikki.videoplayer.controller;

public interface IVideoFinishingController {

    void videoAboutToFinish(boolean currentVideoIsFinishing);
    void videoProgress(int playedPercentage);
}
