## İçerik
- Material Colors
- Dimension
- RTL Support(right-> start , left -> end)
- Android Accessibility Suite (Content Description)
- Drawables Kullanımı(shape.xml)
  - custom shape için `
                        <androidx.appcompat.widget.AppCompatButton `
                         `android:background="@drawable/line_shape"`
                          bu şekilde kullanabilirsin.
- Animations
  - Propert Animation
  - View Animation 
    -  Tween Animation
    -  Frame Animation(Animation Drawable)


## Ek Notlar
- `android:supportRtl = "true"` it comes automatically in Manifest
- [Color](https://material.io/resources/color/#!/?view.left=0&view.right=0&primary.color=9C27B0&secondary.color=8E24AA)
- [Sorurce](https://developer.android.com/guide/topics/resources/drawable-resource#Shape)
- `val frameAnim: AnimationDrawable` yerine **as** kullanarak tanımladık `val frameAmin = image.background as AnimaationDrawable`
- `android:background ="@drawable/frame_animation"`  xml de böyle yazınca
 `val frameAnim = image.background as AnimationDrawable` main activity de böyle yazılmalı

- `android:src = "@drawable/frame_animation"` eğer böyle yazarsan `val frameAnim = image.drawable as AnimationDrawable` bu şekilde yazmalısın.

