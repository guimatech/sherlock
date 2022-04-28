package io.github.guimatech.sherlock.shared.model;

import lombok.Data;

import java.io.FileInputStream;
import java.time.Duration;

@Data
public abstract class MediaFile {

    private String name;
    private Duration duration;
    private String transcription;
    private FileInputStream fileInputStream;
}
