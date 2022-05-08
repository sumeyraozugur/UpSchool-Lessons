# İçerik
- Android Jetpack
  - Architecture
  - Foundation
  - Behavior
  - Ui
- Navigasyon 
  - Fragment kullanımı
## MyApplication
![design1](https://user-images.githubusercontent.com/41166029/164555375-751405b0-96ac-43b5-8239-5b150fb5bb4f.gif)


## MyApplication2

![design2](https://user-images.githubusercontent.com/41166029/164555276-095ff12c-4bf2-4cbd-81aa-ece3a6153885.gif)



```xml
  <style name="ButonStyle">
        <item name="android:backgroundTint">#307EF4</item>
        <item name="android:layout_marginTop">36dp</item>
        <item name="android:textColor">#FFFFFF</item>
        <item name="android:textSize">18sp</item>
        <item name="android:background">@drawable/ic_button</item>
        <item name="android:textAllCaps">false</item>
    </style>

    <style name="MaterialButton" >
        <item name="android:backgroundTint">#307EF4</item>
        <item name="android:layout_marginTop">36dp</item>
        <item name="android:textColor">#FFFFFF</item>
        <item name="android:textSize">20sp</item>
        <item name="android:background">@drawable/ic_button</item>
        <item name="android:textAllCaps">false</item>
        <item name="android:textAlignment">center</item>
        <item name="android:paddingTop">10dp</item>


    </style>

```

You should add this to theme
```xml
 <item name="materialButtonStyle" >@style/MaterialButton</item>
```

