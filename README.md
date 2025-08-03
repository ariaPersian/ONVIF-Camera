# ONVIF-Camera
An Android app for viewing ONVIF camera's. Users can take screenshot of video while they are watching and also can view the camera in background by using Picture in Picture in Android

This app was selected in Top 10 and an award of $800 was given to this application [Link to blog](https://www.onvif.org/blog/2018/07/onvif-challenge-announces-top-10/)

## Building

The project targets a very early version of the Android Gradle plugin
(`3.1.0`) and therefore requires both **Gradle 4.x** and a **JDK 8** runtime.
Attempting to open the project with a newer Gradle distribution (for example
the one bundled with recent Android Studio versions) leads to errors such as
`Could not create an instance of type com.android.build.gradle.AppExtension`.

To build from the command line use the included wrapper and ensure `JAVA_HOME`
points to a JDK 8 installation:

```bash
JAVA_HOME=/path/to/jdk8 ./gradlew assembleDebug
```

## Publishing

Legacy scripts for publishing the library to JFrog Bintray have been removed and are no longer used.
