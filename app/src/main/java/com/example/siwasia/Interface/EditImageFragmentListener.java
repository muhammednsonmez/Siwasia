package com.example.siwasia.Interface;

public interface EditImageFragmentListener {
    void onBrightnessChanged (int brightness);
    void onSaturationChanged (float saturation);
    void onConstrantChanged (int constraint);
    void onEditStarted();
    void onEditCompleted();

}
